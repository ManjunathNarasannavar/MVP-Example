package com.example.manju619.employeemvp.Interface;

import com.example.manju619.employeemvp.Adapter.EmployeeAdapter;

/**
 * Created by Manju 619 on 09-04-2017.
 */

public interface IEmployeePresenter {

    void viewData(EmployeeAdapter adapter);
    void noData();
}
