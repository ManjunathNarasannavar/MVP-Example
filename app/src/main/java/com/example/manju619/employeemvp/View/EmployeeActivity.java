package com.example.manju619.employeemvp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.manju619.employeemvp.Adapter.EmployeeAdapter;
import com.example.manju619.employeemvp.Interface.IEmployeePresenter;
import com.example.manju619.employeemvp.Presenter.EmployeePresenter;
import com.example.manju619.employeemvp.R;

public class EmployeeActivity extends AppCompatActivity implements IEmployeePresenter {

    EmployeePresenter employeePresenter;
    RecyclerView recyclerView;
    TextView txtNoData;
    LinearLayout lytViewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

        initialization();

        employeePresenter.data();
    }

    public void initialization() {

        employeePresenter = new EmployeePresenter(this);
        lytViewData = (LinearLayout) findViewById(R.id.lytViewData);
        recyclerView = (RecyclerView) findViewById(R.id.recyEmployee);
        txtNoData = (TextView) findViewById(R.id.txtNodata);

    }

    @Override
    public void viewData(EmployeeAdapter adapter) {

        //set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(EmployeeActivity.this));

        // 4. set adapter
        recyclerView.setAdapter(adapter);

        // 5. set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    public void noData() {
        lytViewData.setVisibility(View.GONE);
        txtNoData.setVisibility(View.VISIBLE);
        txtNoData.setText("There Is No Employee Details..!!");
    }
}
