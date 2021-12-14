class Stack {
    private int[] holder;
    private int count;
    public Stack(int size){
        holder = new int[size];
        count = 0;
    }

    public void push(int x){
        if(holder.length  > count){
            holder[count++] = x;
        }
        else {
            System.out.println("Cannot Push");
        }
    }

    public Integer pop(){
        if(count > 0){
            return holder[--count]; 
        }

        System.out.println("I emptied your stack");
        return null;
    }

    public void traversal(){
        for(int i=0; i<count; i++){
            System.out.println(holder[i]);
        }
    }

    public Integer peek(int a){
        if(a > count){
            return holder[a];
        }
        return null;
    }
    
    public static void main(String[] args) {
    Stack Sys = new Stack(5);
    for(int i=0; i<5; i++){
        Sys.push(i);
    }
    Sys.traversal();

    for(int i=0; i<5; i++){ 
        System.out.println(Sys.pop());
    }

    }
}