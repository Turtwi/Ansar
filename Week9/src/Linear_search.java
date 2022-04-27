public class Linear_search {
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
        int i = 0;
        for(i = 0; i < list.length; i++){
            if(list[i].equals(key)){
                break;
            }
        }
        return i + 1;
    }

    public static void main(String[] args){
        String[] stringToCompare = new String[]{
                "One","Two","Three","Four","Five"
        };
        System.out.println(linearSearch(stringToCompare,"Five"));
    }
}
