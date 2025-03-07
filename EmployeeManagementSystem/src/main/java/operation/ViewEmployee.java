package operation;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;
import java.util.List;

public class ViewEmployee {

	public void viewEmp() {

		Configuration configure = new Configuration();
		configure.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = configure.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();

//		It is use to retrive the Result from Database.

//		Criteria criteria = session.createCriteria(Book.class);
//		List<Book> lBook = criteria.list();

		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> empList = criteria.list();

		for (Employee emp : empList) {
			System.out.println(emp);
		}

//		for (int i = 1; i < empList.size(); i++) {
//			System.out.println(empList.get(i));
//		}

	}
}
