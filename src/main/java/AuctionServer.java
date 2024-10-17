import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

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

    public static void main(String[] args) throws RemoteException {
        AuctionServer auction = new AuctionServer();

        Registry registry = LocateRegistry.createRegistry(1099);

        registry.rebind("Auction", auction);

        System.out.println("waiting for clients");
    }
}
