package src;

import java.util.ArrayList;
import java.util.List;

import src.models.Observador;

class Canal {
    private List<Observador> inscritos = new ArrayList<>();

    public void adicionar(Observador o) {
        inscritos.add(o);
    }

    public void remover(Observador o) {
        inscritos.remove(o);
    }

    public void publicarVideo(String titulo) {
        System.out.println("Canal publicou: " + titulo);
        notificar("Novo vídeo: " + titulo);
    }

    private void notificar(String mensagem) {
        for (Observador o : inscritos) {
            o.atualizar(mensagem);
        }
    }
}

