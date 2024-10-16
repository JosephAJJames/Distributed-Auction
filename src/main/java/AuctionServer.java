import java.rmi.RemoteException;

public class AuctionServer implements Auction {
    AuctionItem[] items = new AuctionItem[10];

    public AuctionServer() {
        for (int x = 0; x < this.items.length; x++) {
            items[x] = new AuctionItem(x, "item", "thing", 0);
        }
    }

    @Override
    public AuctionItem getSpec(int itemID) throws RemoteException {
        return null;
    }

    public static void main(String[] args) {

    }
}
