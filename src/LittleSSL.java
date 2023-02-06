public class LittleSSL
{

    //variables
    private Node head;

    //constructor
    public LittleSSL()
    {
        head = null;
    }//LittleSSL

    //to populate list
    public void addNodeToStart(int addData)
    {
        head = new Node(addData, head);
    }//end addNodeToStart

    public void deleteNodeFromStart()
    {
        if(head != null)
        {
            head = head.getLink();
        }//end if
    }//end deleteNodeFromStart

    public void showList()
    {
        Node position = head;
        while(position != null)
        {
            System.out.println(position.getData());
            position = position.getLink();
        }//end while
    }//end showList

    public boolean hasNext()
    {
        Node position = head;
        if(position.getLink() != null)
        {
            return true;
        }//end if
        return false;
    }//end hasNext

    public int length()
    {
        int count = 0;
        Node position = head;
        while (position != null)
        {
            count++;
            position = position.getLink();
        }//end while
        return count;
    }//end length

    //output method



    private class Node
    {
        //instance variables
        private int data;
        private Node link; //instance of self-referencing class

        //Constructor
        public Node (int data, Node link)
        {
            this.data = data;
            this.link = link;
        }//end constructor

        //getters & setters
        public int getData()
        {
            return data;
        }//end getData

        public Node getLink()
        {
            return link;
        }//end getLink

        //toString

        @Override
        public String toString()
        {
            return "data: " + data + " links to " + link;
        }//end toString

    }//end private Node class
}//end class
