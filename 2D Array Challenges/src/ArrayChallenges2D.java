
public class ArrayChallenges2D
	{
		static int[][] myArray =
			{
					{ 3, 5, 9, 2, -1, 8, 13 },
					{ -2, 5, 1, 11, 8, 2, 0 },
					{ 9, 1, -3, 4, 8, 4, 8 },
					{ 6, 0, 0, -1, 4, 12, 7 },
					{ 2, 6, -1, 5, 3, 10, 1 },
					{ 2, 5, 1, 2, 9, 2, 3 },
					{ -3, 1, 1, 4, 11, 12, 4 } };

		public static void main(String[] args)
			{
				findMaximumNumber();

			}

		public static void findMaximumNumber()
			{
				int max = Integer.MIN_VALUE;

				int min = Integer.MAX_VALUE;

				double average = 0;

				int numberOfNumbers = 0;

				double sum = 0;

				for (int row = 0; row < myArray.length; row++)
					{

						for (int col = 0; col < myArray.length; col++)
							{
								if (myArray[row][col] > max)
									{
										max = myArray[row][col];
									}

								if (myArray[row][col] < min)
									{
										min = myArray[row][col];
									}

								numberOfNumbers++;

								sum += myArray[row][col];

								average = (sum / numberOfNumbers);
							}

					}

				System.out.println("The Max is " +  max);
				System.out.println("The Min is " + min);
				System.out.println("The Average is " + average);
				
			}

			{

			}

	}
