package prob5;

public class MyStack {
	private int top = -1;
	private String[] buffer;

	public MyStack(int size) {
		this.buffer = new String[size];
	}

	public void push(String data) {
		if (top == buffer.length - 1) {
			resize();
		}
		++top;
		buffer[top] = data;
	}

	public String pop() throws MyStackException{
		if (top == -1) {
			throw new MyStackException("stack is empty");
		}
		String data = buffer[top];
		top--;

		return data;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public void resize() {
		String[] buffer2 = new String[buffer.length+1];
		for (int i = 0; i < buffer.length; i++) {
			buffer2[i] = buffer[i];
		}
		this.buffer = buffer2;

	}
}