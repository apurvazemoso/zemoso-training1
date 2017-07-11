import java.util.Arrays;

class Vampire{


	private static int len(long number) {
		return Long.toString(Math.abs(number)).length();
	}

	private static boolean check(long fang1, long fang2, long number){
		int origLen = len(number);
        if(len(fang1) != origLen / 2 || len(fang2) != origLen / 2) return false;
		if(Long.toString(fang1).endsWith("0") && Long.toString(fang2).endsWith("0")) 
            return false;
		String s1 = Long.toString(number);
        String s2 = Long.toString(fang1) + Long.toString(fang2);
        char [] c1 = s1.toCharArray(); Arrays.sort(c1); 
        char [] c2 = s2.toCharArray(); Arrays.sort(c2); 
        return Arrays.equals(c1, c2);
    }




	public static void main(String[] args) {
		int t = 0;
		int i;
		for (i = 10; t<=100; i++){
			if(len(i)%2 != 0) i = 10*i - 1;
			else{
				int fang1, fang2;
				for(fang1 = 2; fang1 <= Math.sqrt(i)+1; fang1++){
					if(i%fang1 == 0){
						fang2 = i/fang1;
						if (check(fang1,fang2,i)) {System.out.println(t+" - "+i+" with fangs "+fang1+" and "+fang2); t++;}
					}
				}
			}
		}
	}
}