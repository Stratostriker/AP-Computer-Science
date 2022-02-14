import java.util.*;

public class VetsOffice {
    private static ArrayList<Pet> pets;

    public VetsOffice() {
        pets = new ArrayList<Pet>();
    }
    //adds pet to the ArrayLIst
    public void addPet(Pet p) {
        pets.add(p);
    }
    //returns index of the first pet with name
    private int findPet(String name) {
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).getName() == name) {
                return i;
            }
        }
        return -1;
    }
    //returns the first pet with name
    public Pet getPet(String name) {
        return pets.get(findPet(name));
    }
    //removes pet from the ArrayList
    public Pet removePet(String name) {
        Pet removed = getPet(name);
        pets.remove(findPet(name));
        return removed;
    }
    //prints all pets in the ArrayList
    public void listAll() {
        for(Pet pet : pets) {
            System.out.println(pet.toString());
        }
    }
    //prints all pets with the given type in the ArrayList
    public void listAll(String type) {
        for(int i = 0; i < pets.size(); i++) {
            if(pets.get(i).getType() == type) {
                System.out.println(pets.get(i).toString());
            }
        }
    }
    //prints all cats due for vaccination
    public void listCatOwnersToRemind() {
        for(int i = 0; i < pets.size(); i++) {
            if(pets.get(i) instanceof Cat) {
                if(((Cat)pets.get(i)).dueForVaccination()) {
                    System.out.println(pets.get(i).toString());
                }
            }
        }
    }
}