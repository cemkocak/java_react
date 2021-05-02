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
		/*
		//38
		//EmailLogger logger = new EmailLogger();
		//logger.log("Log Mesaj�");
		
		//BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new DatabaseLogger(), new EmailLogger(), new ConsoleLogger()};
		//for (BaseLogger logger : loggers)
		//	logger.log("Log Mesaj�");
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
		*/
		
		//39
		BaseLoanManager[]  baseLoanManagers = new BaseLoanManager[] 
														{
															new TeacherLoanManager(),
															new AgriculturalLoanManager(),
															new StudentLoanManager()
														};
		
		for(BaseLoanManager baseLoanManager : baseLoanManagers)
		{
			System.out.println(baseLoanManager.calculate(1000));
		}
			
	}

}
