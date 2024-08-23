# Engenharia de Software I

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

## Compreensão do texto

Em projetos de engenhariade software,é necessário se importar com o tempo e saber modificá-lo caso seja a situação do projeto. Além disso, deve-se considerar a escala (dimensão) do projeto e a eficiência para a realização do mesmo.
Em situações em que não se tem precisão no tempo e no crescimento do projeto, e necessário tomar decisões de alto risco, ou seja, decisões de perda e ganho.
As tecnologias possuem vantagens e desvantagens e, cabe ao engenheiro de software saber escolher e saber bem sobre essas tecnologias. Quando se trata disso, estamos pensando sobre decisões de perca e ganho (higher-stakes).

Embora a programação faça parte do trabalho do engenheiro de software, há muitos outros aspectos do trabalho do engenheiro que precisa ser considerado como a manutenção e a modificação que devem ser dadas a um determinado projeto. Não se trata apenas de criar, mas sim de manter o seu trabalho funcionando ao longo do tempo.

## Exemplos de Trade-Off

### Windows vs Linux 
Falando um pouco mais sobre os higher-stakes e requisitos não funcionais, podemos pensar no uso de sistemas operacionais como o Windows e o Linux. Enquanto o Windows possui uma usuabilidade melhor sendo mais "amigável" ao usuário, ele não é muito seguro, pois existem muitos ataques a esse SO, o que exige do Windows constante atualizações. O linux por outro lado é melhor para segurança, customização e estabilidade. Entretanto, o Linux pode ser mais complicado para o usuário comum.

### Python vs C
Quando se esta desenvolvendo aplicativos e softwares, as linguagens de programação também possuem essa relação de ganho e perda. Enquanto Python é uma linguagem pensada em ser mais fácil, seu processamento é mais lento justamente por ser uma linguagem de alto nível. Entratetanto, o mesmo não acontece e C que é uma linguagem de baixo nível. Nessa linguagem, o processamento é mais rápido mas a implementação é mais complicada e é necessário fazer um programa diferente para cada hardware, o que acaba sendo um trabalho mais custoso.

### Carro vs Moto
É possível pensar também em exemplos mecânicos como um carro e uma moto, por exemplo. Uma moto é mais econômica em aspectos de manutenção, mais barata para se adquirir e é mais ágil, principalmente em engarrafamentos. Já um carro é mais caro para se adquirir, mais custoso para se manter e sofre mais em engarramentos. Entretanto, ele é mais confortável, é mais seguro e possui mais espaço para transporte de objetos e pessoas, vantagens essas que uma moto não possui, devido a seu tamanho.

## Sistemas Reais - Arquitetura de Funcionamento da Netflix

A arquitetura da Netflix é extremamente complexa devido a sua necessidade de escalabilidade. Entretanto, essa complexidade acaba por ser prejudicial devido ao fato de que eles precisam de muitas ferramentas que exigem profissionais altamente capacitados para fazer a manutenção de todo esse sistema. 
Além disso, caso ocorra um problema, será mais difícil de identificá-lo.

Alguns dos sistemas utilizados na arquitetura da Netflix:

## Cassandra e MySQL
Cassandra é um sistema de banco de dados, bem como o MySQL. Cassandra possui escalabilidade, o que se torna útil para a arquitetura da Netflix. Ele é tolerante a falhas e é distribuído, ou seja, não há um "ponto" principal, pois todos os pontos podem atender aos requisitos do usuário. Além disso, a replicação em vários data centers é suportada. Entretanto, Cassandra possui algumas desvantagens como o fato de ele ser otimizado para  consultas simples e não para as mais complexas que exigem junções e agregações.
Já o tão conhecido MySQL possui também algumas vantagens em seu uso, como por exemplo, a escalabilidade, open source (código aberto) e alta performance, por ser considerado um sistema muito rápido. Contudo, ele possui certas desvantagens como problemas de estabilidade e uma performance ruim quanto ele precisa trabalhar com um alto volume de dados.



# UML
<table>
  <tr>
    <td>Classe: Aluno</td>
  </tr>
  <tr>
    <td>
      - nome: String <br>
      - idade: int <br>
      - ra: int
    </td>
  </tr>
  <tr>
    <td>
      + getNome():String nome <br>
      + setNome(String n):void <br>
      + getIdade():int idade <br>
      + setIdade(int age):void <br>
      + getRA():int ra <br>
      + setRA(int ra):void <br>
      + doarLivro(int quantidade): int <br>
    </td>
  </tr>
</table>

<br>

<table>
  <tr>
    <td>Classe: Biblioteca</td>
  </tr>
  <tr>
    <td>
      - nomeLivro: String <br>
      - genero: String <br>
      - registroDoLivro: int <br>
      - quantidadeDeLivros: int <br>
      - periodoDeEmprestimo: int <br>
    </td>
  </tr>
  <tr>
    <td>
      + getNomeLivro():String nome <br>
      + setNomeLivro(String n):void <br>
      + getGenero():String genre <br>
      + setGenero(String gen):void <br>
      + getRegistro():int registro <br>
      + setGenero(int reg):void <br>
      + emprestar(Aluno aluno1, int periodo):void <br>
      + adicionarLivro(int Aluno.doarLivro()):void <br>
    </td>
  </tr>
</table>
