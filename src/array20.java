/*
 * # 배열 컨트롤러[1단계] : 삭제
 */

import java.util.Scanner;

public class array20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		int count = 5;
		
		while(true)
		{
			for(int i=0;i<count;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			System.out.println("[2] 삭제");
			
			System.out.println("메뉴선택 : ");
			int select = sc.nextInt();
			
			if(select == 2)
			{
				System.out.println("삭제할 값 입력:");
				int data = sc.nextInt();
				
				int delIdx = -1;
				for(int i=0; i<count; i++)
				{
					if(arr[i] == data)
					{
						delIdx= i;
					}
				}
				
				if(delIdx == -1)
				{
					System.out.println("입력하신 값은 존재하지 않는다.");
				}
				else
				{
					for(int i=delIdx; i<count-1; i++)
					{
						arr[i] = arr[i+1];
					}
					count--;
				}
			}
		}
	}
}
