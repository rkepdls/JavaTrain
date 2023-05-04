package T20230503;

public Point2D() {
	if (++counter==day) {
		System.out.print("당첨!!");
		System.out.printf("오늘 %d개의 좌표가 생성됐습니다.\n", counter);
	}
}
public Point2D(int x) {
	if (++counter==day) {
		System.out.print("당첨!!");
		System.out.printf("오늘 %d개의 좌표가 생성됐습니다.\n", counter);
	}
	this.x = x;
}
public Point2D(int y) {
	if (++counter==day) {
		System.out.print("당첨!!");
		System.out.printf("오늘 %d개의 좌표가 생성됐습니다.\n", counter);
	}
	this.x = x; this.y = y;
}
