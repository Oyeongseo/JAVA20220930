package Ch13;


class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		 /* 배열 a와 b를 연결한 새로운 배열 리턴 */
		int tmp[]= new int[a.length +b.length];
		int i = 0;
		for(; i<a.length;i++) {
		 tmp[i] = a[i];
		}
		for(; i<a.length+b.length;i++) {
		 tmp[i] = b[i-a.length];
		}
		return tmp;
		
	            
		
	   }
	public static void print(int[] a) {
	    /* 배열 a 출력 */
		
		for (int i=0; i<a.length; i++) {
			System.out.println(" "+a[i]+" ");
		}
		
	   }
	}

	public class Prac {

	   public static void main(String[] args) {
		   
	      
	      int[] array1 = {1, 5, 7, 9};
	      int[] array2 = {3, 6, -1, 100, 77};
	      int[] array3 = ArrayUtil.concat(array1, array2);
	      ArrayUtil.print(array3);
	   }

	}