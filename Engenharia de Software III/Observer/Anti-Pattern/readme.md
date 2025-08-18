# Anti-Pattern do Observer

Um dos exemplos de anti-padrão do Observador é o acoplamento forte. Isso acontece quando deixamos um classe concreta dependente de uma outra classe concreta. Isso é um problema, pois se houver necessidade de mudar ou adicionar a funcionalidade do software, será necessário mexer em todo o código, o que leva a mais trabalho. Além disso, ocorre muita repetição de código também, o que não é muito eficiente.

## Exemplo

Vamos pensar em um canal no Youtube com os seus inscritos. O Youtube possui um sistema de notificação em que sempre que um canal lança um vídeo, os inscritos desse canal recebem notificações sobre o novo vídeo lançado. Aqui embaixo temos um exemplo de uma má implementação de um sistema de notificação com acoplamento forte.


```java
public class Canal{
    private String nomeCanal;
    private Usuario usuario;

    public void setUsuario(Usuario usuario){
      this.usuario = usuario;
    }
    
    public void notificar(String titulo){
      System.out.println(this.nomeCanal + " upou: " + titulo);
      usuario.notificarUsuario(titulo);
    }
}


public class Usuario{
    public void notificarUsuario(String titulo){
      System.out.println("Usuário recebeu vídeo: " + titulo);
    }

}

```
