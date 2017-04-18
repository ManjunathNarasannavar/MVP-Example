package com.example.manju619.employeemvp.Presenter;

import com.example.manju619.employeemvp.Adapter.EmployeeAdapter;
import com.example.manju619.employeemvp.Interface.IEmployeePresenter;
import com.example.manju619.employeemvp.Model.EmployeeModel;

/**
 * Created by Manju 619 on 09-04-2017.
 */

public class EmployeePresenter {
    IEmployeePresenter employeeInterfce;

    public EmployeePresenter(IEmployeePresenter mainActivity) {
        employeeInterfce = mainActivity;
    }

    EmployeeModel[] employeeModels = new EmployeeModel[]{
            new EmployeeModel("m101", "Manju", "Narasannavar", "17-05-1992", "Male", "15-10-2017"),
            new EmployeeModel("m102", "Lucky", "Nayak", "15-07-1992", "Male", "15-10-2017"),
            new EmployeeModel("m103", "Srinidhi", "M R", "17-07-1991", "Male", "15-10-2017"),
            new EmployeeModel("m104", "Vijay", "B", "15-05-1991", "Male", "15-10-2017"),
            new EmployeeModel("m105", "Mathew", "N", "07-03-1992", "Male", "15-10-2017")
    };


    public void data() {
        if (!employeeModels.equals("") && employeeModels.length != 0) {
            // create an adapter
            EmployeeAdapter adapter = new EmployeeAdapter(employeeModels, EmployeePresenter.this);

            employeeInterfce.viewData(adapter);
        } else {
            employeeInterfce.noData();

        }


    }
}
