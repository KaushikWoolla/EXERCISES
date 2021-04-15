package exercise2;

class RBI{
	int interest_rate=4;
	int min_balance=100;
	
	void setBank(int interest_rate,int min_balance ) {
		if(interest_rate <4 && min_balance <100) {
			System.out.println("Follow Guidelines");
		}
		else {
			this.interest_rate=interest_rate;
			this.min_balance=min_balance;
		}
	}
	
}

class PNB extends RBI{
	
}

public class program7 {

}
