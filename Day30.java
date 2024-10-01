import java.math.BigDecimal;
public class Day30{
    
    public static void main(String[] args) {
        
        BigDecimal x =new BigDecimal("517817579.899371711771813572471");
        BigDecimal y =new BigDecimal("568779711.7794927189911992892");
        
     BigDecimal z = x.add(y);
     BigDecimal s = x.subtract(y);
        System.out.println("hasil penjumlahan desimal: "+ z);
        System.out.println("hasil pengurangan desimal: " +s);
     
    }
        }
