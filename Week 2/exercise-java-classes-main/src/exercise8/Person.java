package exercise8;

public class Person {

    private String name;
    private Person mother;
    private Person father;

    public Person(String name, Person mother, Person father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    public boolean isSiblingOf(Person person) {

        if (person == null || person == this) return false;

        boolean sameFather = this.father != null && this.father.equals(person.father);
        boolean sameMother = this.mother != null && this.mother.equals(person.mother);

        // Return "true" if this object is the sibling of the person given as a parameter
        return false;
    }

    public boolean isGrandparentOf(Person person) {
        if (person == null || person == this) return false;

        if (person.father != null){
            if (person.father.father != null && person .father.father.equals(this)){
                return true;
            }
            if (person.father.mother != null && person.father.mother.equals(this)){
                return true;
        }}

        if (person.mother!=null){
            if (person.mother.father != null && person.mother.father.equals(this)) {
                return true;
            }
            if (person.mother.mother != null && person.mother.mother.equals(this)){
                return true;
            }}
        return false;
    }

    public boolean isGrandchildOf(Person person) {
        if (this == person){
            return false;
        }
        if (this.father!=null){
            if (this.father.father != null && this.father.father.equals(person)){
                return true;
            }
            if (this.father.mother != null && this.father.mother.equals(person)){
                return true;
            }
        }
        if (this.mother!=null){
            if (this.mother.father != null && this.mother.father.equals(person)){
                return true;
            }
            if (this.mother.mother != null && this.mother.mother.equals(person)){
                return true;
            }
        }
        // Return "true" if this object is the grandchild of the person given as a parameter
        return false;
    }
}
