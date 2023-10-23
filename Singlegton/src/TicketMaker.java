/**
 * @author: 徐杰
 * @description: 改写后的TicketMaker
 * @dateTime: 2023/10/23 9:19
 * @Return
 **/
public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private int ticket=1000;
    private TicketMaker(){
        System.out.println("生产了一个实例");
    }
    public TicketMaker getInstance(){
        return ticketMaker;
    }
    public synchronized int getNextTicketNumber(){
        return ticket++;
    }
}
