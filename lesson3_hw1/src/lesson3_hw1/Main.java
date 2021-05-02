package lesson3_hw1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//36
		Customer customer = new Customer();
		Employee employee = new Employee();
		*/
		/*
		//37
		LoanUI loanUI = new LoanUI();
		loanUI.calculateLoan(new AgriculturalLoanManager());
		loanUI.calculateLoan(new TeacherLoanManager());
		loanUI.calculateLoan(new SoldierLoanManager());
		*/
		
		//38
		//EmailLogger logger = new EmailLogger();
		//logger.log("Log Mesajý");
		
		//BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new DatabaseLogger(), new EmailLogger(), new ConsoleLogger()};
		//for (BaseLogger logger : loggers)
		//	logger.log("Log Mesajý");
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
