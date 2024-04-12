package assignment3;

class Matrix {
	private int rows;
	private int columns;
	public int[][] elements;

	public Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		elements = new int[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setElement(int i, int j, int value) {
		if (i >= 0 && i < rows && j >= 0 && j < columns) {
			elements[i][j] = value;
		} else {
			System.out.println("Invalid position");
		}
	}

	public Matrix add(Matrix other) {
		if (this.rows != other.rows || this.columns != other.columns) {
			System.out.println("Matrices cannot be added");
			return null;
		}

		Matrix result = new Matrix(rows, columns);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result.elements[i][j] = this.elements[i][j] + other.elements[i][j];
			}
		}
		return result;
	}
}
