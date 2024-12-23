package Main;

import Controller.EmployeController;
import Controller.HolidayController;
import DAO.EmployeDAOimpl;
import DAO.HolidayDAOimpl;
import model.Employemodel;
import model.HolidayModel;
import view.Employe_HolidayView;

public class Main {

    public static void main(String[] args) {
        Employe_HolidayView view = new Employe_HolidayView();
        EmployeDAOimpl dao = new EmployeDAOimpl();
        HolidayDAOimpl dao_holiday = new HolidayDAOimpl();
        Employemodel model_employe = new Employemodel(dao);
        HolidayModel model_holiday = new HolidayModel(dao_holiday);
        new EmployeController(view, model_employe);
        new HolidayController(view, model_holiday);
    }
}