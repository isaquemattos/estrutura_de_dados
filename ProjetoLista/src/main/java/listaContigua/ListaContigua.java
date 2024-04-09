package listaContigua;

public class ListaContigua {
    private Item[] vetorItem;
    private int quant;
    
    public ListaContigua(){
        this.vetorItem = new Item[10];
        this.quant = 0;
    }
    
    public ListaContigua(int tamanho){
        this.vetorItem = new Item[tamanho];
        this.quant = 0;
    }
    
    public int tamanhoLista(){
        return this.vetorItem.length;
    }
    
    public int quantidadeElementos(){
        return this.quant;
    }
    
    public boolean eVazio(){
        return this.quant == 0;
    }
    
    public boolean eCheio(){
        return this.quant == this.vetorItem.length;
    }
    
    public Item getItem(int pos){
        if(pos < 0 || pos > this.vetorItem.length-1) return null;
        
        return this.vetorItem[pos];
    }
    
    public void aumentaLista(){
        Item[] novoVetor = new Item[this.vetorItem.length + (this.vetorItem.length / 2)];
            
        for(int i = 0; i < this.vetorItem.length; i++) {
            novoVetor[i] = this.vetorItem[i];
        }

        this.vetorItem = novoVetor;
    }
    
    public boolean insere(int pos, Item item){
        aumentaLista();
        
        if(pos < 0 || pos > this.quant){
            return false;
        }
        
        return true;
    }
}
