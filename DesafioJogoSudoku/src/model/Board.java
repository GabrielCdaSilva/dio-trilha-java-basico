package model;
 
import java.util.Collection;
import java.util.List;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import static model.GamesStatusEnum.imcompleto;
import static model.GamesStatusEnum.completo;
import static model.GamesStatusEnum.naoIniciado;;

public class Board {
    private List<List<Space>> espacos;

    public Board(List<List<Space>> espacos) {
        this.espacos = espacos;
    }

    public List<List<Space>> getEspacos() {
        return espacos;
    }

    public GamesStatusEnum getStatus(){
        if (espacos.stream()
                .flatMap(Collection::stream)
                .noneMatch(s -> !s.isFixo() && nonNull(s.getAtual()))) {
            return naoIniciado;
        }

        return espacos.stream()
                    .flatMap(Collection::stream)
                    .anyMatch(s -> isNull(s.getAtual())) ? imcompleto : completo;
    }

    public boolean temErros(){
        if (getStatus() == naoIniciado) {
            return false;
        }

        return espacos.stream()
        .flatMap(Collection::stream)
        .anyMatch(s -> nonNull(s.getAtual()) && !s.getAtual().equals(s.getEsperado()));
    }

    public boolean mudarValor(final int col, final int lin,final int value){
        var space  = espacos.get(col).get(lin);

        if(space.isFixo()){
            return false;
        }

        space.setAtual(value);
        return true;
    }

    public boolean limparEspaco(final int col, final int lin){
        var space  = espacos.get(col).get(lin);

        if(space.isFixo()){
            return false;
        }
        space.limparEspaco();;
        return true;
    }

    public void resetar(){
        espacos.forEach(c -> c.forEach(Space::limparEspaco));
    }

    public boolean jogoAcabou(){
        return !temErros() && getStatus().equals(completo);
    }
}
