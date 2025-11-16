package observer;

import java.util.ArrayList;
import java.util.List;

public class EventoLoja {

    private List<Observador> observadores = new ArrayList<>();

    public void inscrever(Observador o) {
        observadores.add(o);
    }

    public void desinscrever(Observador o) {
        observadores.remove(o);
    }

    public void notificar(String mensagem) {
        for (Observador o : observadores) {
            o.atualizar(mensagem);
        }
    }
}
