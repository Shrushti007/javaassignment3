package assignment3;

public class TestMatrix {

	public static void main(String[] args) {
		Matrix matrix1 = new Matrix(2, 2);
        Matrix matrix2 = new Matrix(2, 2);

        
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(1, 0, 3);
        matrix1.setElement(1, 1, 4);

        
        matrix2.setElement(0, 0, 5);
        matrix2.setElement(0, 1, 6);
        matrix2.setElement(1, 0, 7);
        matrix2.setElement(1, 1, 8);

        
        Matrix result = matrix1.add(matrix2);
        
        if (result != null) {
            System.out.println("Result of matrix addition:");
            for (int i = 0; i < result.getRows(); i++) {
                for (int j = 0; j < result.getColumns(); j++) {
                    System.out.print(result.elements[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}



