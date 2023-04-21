package Labs.Lab14;

public class C14 implements Comparable<C14>{
    private String name;

    public C14(String name) {
        this.name = name;
    }
 
    public String toString() {
       return name;
    }
 
    public int hashCode() {
       return name.hashCode();
    }
 
    public boolean equals(Object obj) {
       C14 other = (C14) obj;
       return name.equals(other.name);
    }
    public int compareTo(C14 object){
        
        return this.hashCode() - object.hashCode();
    }
    // TODO: implement the compareTo(Person) method required by the Comparable<Person> interface
}
