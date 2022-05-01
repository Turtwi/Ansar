public class Ex_21_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers= new ArrayList<>();
        int scanNum = scan.nextInt();
        int streak = 1;
        int longestStreak = 1;
        String answer = "";
        while(scanNum != 0){
            numbers.add(scanNum);
            scanNum = scan.nextInt();
        }
        Collections.sort(numbers);
        for(int i = 0;i < numbers.size();i++){
            if((i + 1) == numbers.size()){
                break;
            }
            if(numbers.get(i) == numbers.get(i + 1)){
                streak++;
            }
            else{
                if(streak > longestStreak){
                    longestStreak = streak;
                    answer = String.valueOf(numbers.get(i));
                }
                streak = 1;
            }
            if(streak == longestStreak){
                answer += " " + numbers.get(i);
            }

        }
        System.out.println(numbers);
        System.out.println(answer);

    }
}
