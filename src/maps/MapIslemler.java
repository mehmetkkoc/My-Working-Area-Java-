package maps;

import java.util.*;

public class MapIslemler {
    public static void main(String[] args) {


        Map<Integer, String> mapList = MapOlustur.myMap();
        //System.out.println(mapList);                        // {101=Ali, Can, Java, 2010, 102=Veli, Yan, C#, 2011, 103=Ali, Yan, Python, 2005, 104=Ayse, Kan, Java, 2000, 105=Fatma, Han, C#, 2002}

        Set<Integer> keySet= mapList.keySet();
        List<Integer> keySetList = new ArrayList<>();
        keySetList.addAll(keySet);

        //System.out.println(keySetList);                     // [101, 102, 103, 104, 105]

        Collection<String> valueSet=mapList.values();
        List<String> valueSetList=new ArrayList<>();

        valueSetList.addAll(valueSet);

        //System.out.println(valueSetList);                   // [Ali, Can, Java, 2010, Veli, Yan, C#, 2011, Ali, Yan, Python, 2005, Ayse, Kan, Java, 2000, Fatma, Han, C#, 2002]

        int outerArrayBoyut=keySetList.size();
        //System.out.println(outerArrayBoyut);                // 5
        String ilkValue=valueSetList.get(0);
        String ilkValueArray[]=ilkValue.split(", ");
        int innerArrayBoyut=ilkValueArray.length;

        //System.out.println(innerArrayBoyut);                // 4

        String valueMDArray[][]=new String[outerArrayBoyut][innerArrayBoyut];


        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[]=valueSetList.get(i).split(", ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
                valueMDArray[i][j]=temp[j];

            }

        }


        // keySetList
        // valueMDArray[][]

        Scanner scan = new Scanner(System.in);

        Integer degisecekNo=0;
        String guncelBilgi="";
        String yeniValue="";
        int count=0;

        while (count<1) {
            System.out.println("Bilgisini degistirmek istediginiz ogrenci no girin");
            degisecekNo = scan.nextInt();

            if (keySetList.contains(degisecekNo)) {
                for (int i = 0; i < keySetList.size(); i++) {

                    if (keySetList.get(i).equals(degisecekNo)) {
                        System.out.println("degisecek bilgiyi secin\n1 - Ad\n2 - Soyad\n3 - Branch\n4 - D.Yili");
                        int degisecekBilgi = scan.nextInt();


                        switch (degisecekBilgi) {
                            case 1:
                                System.out.println("Guncel Bilgi?");
                                guncelBilgi = scan.next();
                                valueMDArray[i][degisecekBilgi - 1] = guncelBilgi;
                                yeniValue = valueMDArray[i][0] + ", " + valueMDArray[i][1] + ", " + valueMDArray[i][2] + ", " + valueMDArray[i][3];
                                mapList.put(keySetList.get(i), yeniValue);
                                break;
                            case 2:
                                System.out.println("Guncel Bilgi?");
                                guncelBilgi = scan.next();
                                valueMDArray[i][degisecekBilgi - 1] = guncelBilgi;
                                yeniValue = valueMDArray[i][0] + ", " + valueMDArray[i][1] + ", " + valueMDArray[i][2] + ", " + valueMDArray[i][3];
                                mapList.put(keySetList.get(i), yeniValue);
                                break;
                            case 3:
                                System.out.println("Guncel Bilgi?");
                                guncelBilgi = scan.next();
                                valueMDArray[i][degisecekBilgi - 1] = guncelBilgi;
                                yeniValue = valueMDArray[i][0] + ", " + valueMDArray[i][1] + ", " + valueMDArray[i][2] + ", " + valueMDArray[i][3];
                                mapList.put(keySetList.get(i), yeniValue);
                                break;
                            case 4:
                                System.out.println("Guncel Bilgi?");
                                guncelBilgi = scan.next();
                                valueMDArray[i][degisecekBilgi - 1] = guncelBilgi;
                                yeniValue = valueMDArray[i][0] + ", " + valueMDArray[i][1] + ", " + valueMDArray[i][2] + ", " + valueMDArray[i][3];
                                mapList.put(keySetList.get(i), yeniValue);
                                break;

                            default:
                                System.out.println("hatali no");
                                break;
                        }
                    }


                }

                Set<Map.Entry<Integer,String>> sinifEntrySeti = mapList.entrySet();
                System.out.println("No  Isim  Soyisim     Brans  D.Yili");
                System.out.println("___________________________________");
                for (Map.Entry<Integer,String> each: sinifEntrySeti
                ) {
                    Integer entryKey= each.getKey();
                    String valueStr= each.getValue();
                    String valueArr[]=valueStr.split(", ");
                    System.out.printf( "%-4d %-6s %-9s %-6s %s\n" , entryKey, valueArr[0], valueArr[1]
                            , valueArr[2], valueArr[3]);
                }
                System.out.println("___________________________________");
                System.out.println(mapList);

                count++;
            } else {
                System.out.println("hatali ogrenci no");
                Set<Map.Entry<Integer,String>> sinifEntrySeti = mapList.entrySet();
                System.out.println("No  Isim  Soyisim     Brans  D.Yili");
                System.out.println("___________________________________");
                for (Map.Entry<Integer,String> each: sinifEntrySeti
                ) {
                    Integer entryKey= each.getKey();
                    String valueStr= each.getValue();
                    String valueArr[]=valueStr.split(", ");
                    System.out.printf( "%-4d %-6s %-9s %-6s %s\n" , entryKey, valueArr[0], valueArr[1]
                            , valueArr[2], valueArr[3]);
                }
                System.out.println("___________________________________");
            }

        }





    }

}
