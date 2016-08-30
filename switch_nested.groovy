class Example {
	static void main(String[] args) {
		int i = 1;
		int j = 1;

		switch(i) {
			case 0:
				switch(j) {
					case 0:
						println("i = 0 and j = 0");
						break;
					case 1:
						println("i = 0 and j = 1");
						break;
				}
			break;
			case 1:
				switch(j) {
					case 0:
						println("i = 1 and j = 0");
						break;
					case 1:
						println("i = 1 and j = 1");
						break;
				}				
			break;

			default:
			println("No match found");
		}
	}
}