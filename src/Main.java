public class Main {
    public static void main(String[] args) {
        LittleSSL mySSL = new LittleSSL();
        mySSL.addNodeToStart(23);
        mySSL.addNodeToStart(53);
        mySSL.addNodeToStart(13);
        mySSL.addNodeToStart(98);
        mySSL.addNodeToStart(48);

        mySSL.showList();
        System.out.println();

        mySSL.deleteNodeFromStart();
        mySSL.showList();
        System.out.println();


    }
}