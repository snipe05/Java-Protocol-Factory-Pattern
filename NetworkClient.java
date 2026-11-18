interface Protocol {
    void connect();
}

class TCPProtocol implements Protocol {
    public void connect() {
        System.out.println("TCP Connection established.");
    }
}

class UDPProtocol implements Protocol {
    public void connect() {
        System.out.println("UDP Connection established.");
    }
}

class ProtocolFactory {
    public static Protocol getProtocol(String type) {
        if ("TCP".equalsIgnoreCase(type)) return new TCPProtocol();
        if ("UDP".equalsIgnoreCase(type)) return new UDPProtocol();
        throw new IllegalArgumentException("Unknown protocol");
    }
}

public class NetworkClient {
    public static void main(String[] args) {
        Protocol p1 = ProtocolFactory.getProtocol("TCP");
        p1.connect();
        
        Protocol p2 = ProtocolFactory.getProtocol("UDP");
        p2.connect();
    }
}
