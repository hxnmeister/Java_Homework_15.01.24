public class Task1 {
    public static void main(String args[]){
        String phrase[] = {"\"Your time is limited,", "so don`t waste it", "living someone else`s life\" ", "Steve Jobs"};
        String indent = "";

        for (String s : phrase) {
            System.out.println(indent + s);
            indent = indent.concat("\t");
        }
    }
}
