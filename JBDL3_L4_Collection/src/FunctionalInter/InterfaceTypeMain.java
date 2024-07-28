package FunctionalInter;

import java.util.function.*;

public class InterfaceTypeMain {

    public static void main(String[] args) {
        Predicate<Integer> predicate = new PredicateImpl();
        System.out.println(predicate.test(3));

        Function<Integer,Integer> function = new FunctionImpl();
        System.out.println(function.apply(2));

        Consumer<Integer> consumer = new consumerImpl();
        consumer.accept(34);

        Supplier<Integer> supplier = new SupplierImpl();
        System.out.println(supplier.get());


    }
}

class PredicateImpl implements Predicate<Integer>{

    @Override
    public boolean test(Integer integer) {
        if (integer%2==0){
            return true;
        }
        return false;
    }
}

class FunctionImpl implements Function<Integer,Integer>{

    @Override
    public Integer apply(Integer integer) {
       return integer*integer;
    }
}

class consumerImpl implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println("Data: "+integer);
    }
}
class SupplierImpl implements Supplier<Integer>{

    @Override
    public Integer get() {
        return 32;
    }
}
