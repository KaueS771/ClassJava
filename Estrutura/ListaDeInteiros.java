public class ListaDeInteiros{

    private int dados[];
    private int tamanho;

    public ListaDeInteiros(int capMax){
        dados = new int[capMax];
        // o java pré inicializa os atributos do tipo inteiro
        // com o valor 0 (zero), do tipo real com o valor 0.0()
        // valor 0.0(zero ponto zero) e  atributos com tipo
        // abstrato de dados são inicializados com null 
        //Portanto tamanho recebeu o valor 0(zero)

        if(dados.length != tamanho){
            dados[tamanho]=53;
            tamanho = tamanho +1;
        }else{
            System.out.println("Erro! Lista Cheia");
        }
    }

    public void adicionaFinal(int e)throws Exception{
        if(!cheia()){
            dados[tamanho]=e;
            tamanho = tamanho +1;
        }else{
            throw new Exception("Erro! Lista Cheia");
        }

    }
    public String toString(){
        String s = "Elemento:" ;
        for(int i = 0; i<tamanho;i++ ){
            s = s + " " + dados[i];
        }
        s = s + "\nTamanho: " + tamanho;
        return s;
    }
    public int obtemUltimo()throws Exception{
        if(vazia())
          throw new Exception("Eroo!, lista Vazia");
        else 
          return dados[tamanho-1];
    }
    public int obtemPrimeiro()throws Exception{
        if(vazia())
        throw new Exception("Eroo!, lista Vazia");
        else 
          return dados[0];

    }

    public int removeFinal () throws Exception{
        if(!vazia()){
        //não está vazia 
            tamanho = tamanho -1;
            return dados[tamanho];
        }else{
            //sim está vazia
            throw new Exception("Eroo!, lista Cheia");
        }
    }
    public boolean vazia(){
        return tamanho ==0;
    }
    public boolean cheia(){
        return tamanho == dados.length;

    }
    public int removeInicio()throws Exception{
        if(vazia())
          throw new Exception("Erroo! Lista vazia");
        else{
            int r = dados[0];
            //move um elemento á esquerda quando a lista tiver mais que um elemento
            for(int i =0;i<tamanho-1;i++){
                dados[i]=dados[i+1];
            }
            tamanho--;
             
            return r;
        }
    }
}
