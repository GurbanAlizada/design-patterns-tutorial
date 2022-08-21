package iteratorPattern;

public class IteratorPatternDemo {

    public static void main(String[] args) {



        CollectionofNames cmpnyRepository = new CollectionofNames();

       /* for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }*/

        Iterator iterator = cmpnyRepository.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }

}