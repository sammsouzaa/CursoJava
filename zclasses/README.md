# O QUE É UMA CLASSE?

- De uma maneira simples, a classe serve para criarmos objetos que serão usados no nosso programa!!
- Dentro de uma classe, podemos ter varios objetos;
- Cada objeto funciona totalmente independente de quaisquer outros objetos; porém todos os objetos seguem as regras determinadas pela classe;

### Estrutura simples de uma "class":

- Primeiro declaramos o modificador de acesso;
- Indicamos que é uma class digitando "class";
- Damos um nome da class;
- IMPORTANTE: o nome da class obrigatoriamente tem que ser o mesmo nome do arquivo.java;

```
public class Jogador{

}
```
# Tipos de metodos de uma classe secundaria:

### Metodo construtor:

- Ele é executado automaticamente quando é declarado como um objeto;
- Para ser um metodo construtor, o metodo deve ter o mesmo nome da classe;
- exemplo: 
```
public class Jogadores{
    public jogadores(){
        System.out.print("hello world);
    }
}
```

### Metodo GET:

- Ele é criado dentro da classe secundaria;
- Tem como objetivo mostrar para a classe principal algum valor de uma variavel private da classe secundaria;
- exemplo: 
```
private int vidas = 3;

public int getVidas(){
        return this.vidas;
}
```

### Metodo SET:

- Ele é criado dentro da classe secundaria;
- Tem como objetivo declarar um valor a uma variavel private da classe secundaria pela a classe principal;
- exemplo: 
```
private int vidas = 0;
private void setVidas(int vidas){

    if (vidas > maxvidas){

        this.vidas = maxvidas;
    }
    else if(vidas<0){

        this.vidas = 0;
    }
    else{

        this.vidas = vidas;
    }
}
```