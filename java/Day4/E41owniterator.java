import java.util.*;

class Fruit {
    
    private String name;


    private String color;

    
public Fruit(String name, String color) {
    this.name = name;


    this.color = color;
}

public String getName() {

    return name;
}

public String getColor() {


    return color;
}

@Override
public String toString() {


    return name + " (" + color + ")";
}
}
class CustomFruitIterator implements Iterator<Fruit> {
    private int currentPosition;

    private final List<Fruit> fruitList;

    public CustomFruitIterator(List<Fruit> fruitList) {
        this.fruitList = fruitList;


        this.currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        while (currentPosition < fruitList.size()) {


            Fruit currentFruit = fruitList.get(currentPosition);
            if (isFruitEligible(currentFruit)) {


                return true;
            }
            currentPosition++;
        }
        return false;
    }

    @Override
    public Fruit next() {


        if (!hasNext()) {


            throw new NoSuchElementException();
        }
        return fruitList.get(currentPosition++);
    }

    private boolean isFruitEligible(Fruit fruit) {
        
        return true; 
    }
}

class E41owniterator {
    public static void main(String[] args) {

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple", "Red"));
        fruits.add(new Fruit("Banana", "Yellow"));
        fruits.add(new Fruit("Grapes", "Green"));
        fruits.add(new Fruit("Orange", "Orange"));

        CustomFruitIterator iterator = new CustomFruitIterator(fruits);

        System.out.print("Eligible fruits: ");
        while (iterator.hasNext()) {
            
            Fruit fruit = iterator.next();
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}

