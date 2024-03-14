public class intLinkedList
{
    private Node first;

    public void push(int d){
        Node neu = new Node();
        neu.next = first;
        neu.data = d;
        first = neu;
    }
    public int pop(){
        int temp = -1;
        if(first != null){
            temp = first.data;
            if(first.next != null){
                first = first.next;
            }
            else{
                first = null;
            }
        }
        return(temp);
    }
    public String toString(){
        Node aktuell = first;
        String string = "";
        while(aktuell != null){
            string = string + aktuell.data + " ";
            aktuell = aktuell.next;
        }
        return(string);
    }
    public Boolean isEmpty(){
        return first == null;
    }
    public int size(){
        Node aktuell = first;
        int Length = 0;
        while(aktuell != null){
            Length++;
            aktuell = aktuell.next;
        }
        return(Length);
    }
    public boolean contains(int d){
        Node aktuell = first;
        boolean contains = false;
        int Index = 0;
        while(aktuell != null){
            if(aktuell.data == d){contains = true; continue;}
            aktuell = aktuell.next;
            Index++;
        }
        return(contains);
    }
    public int search(int d) {
        Node aktuell = first;
        int Index = 0;
        int SearchIndex = -1;
        while (aktuell != null) {
            if (aktuell.data == d) {
                SearchIndex = Index;
                continue;
            }
            aktuell = aktuell.next;
            Index++;
        }
        return (SearchIndex);
    }
    public void remove(int d){
        Node aktuell = first;
        Node zuvor = first;
        int Index = 0;
        while(aktuell != null){
            if (Index == 1 && aktuell.data == d){pop();continue;}
            if(aktuell.data == d){zuvor.next = aktuell.next; continue;}
            zuvor = aktuell;
            aktuell = aktuell.next;
            Index++;
        }
    }
}
