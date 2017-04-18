package com.example.manju619.employeemvp.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.manju619.employeemvp.Model.EmployeeModel;
import com.example.manju619.employeemvp.Presenter.EmployeePresenter;
import com.example.manju619.employeemvp.R;
import com.example.manju619.employeemvp.View.EmployeeActivity;

import java.util.ArrayList;

/**
 * Created by Manju 619 on 09-04-2017.
 */

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.MyEmployeeViewHolder> {

    EmployeeModel[] emplList;
    EmployeePresenter context;

    public EmployeeAdapter(EmployeeModel[] emplList, EmployeePresenter context) {
        this.emplList = emplList;
        this.context = context;
    }

    @Override
    public EmployeeAdapter.MyEmployeeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.employee_detail_row, parent, false);

        return new MyEmployeeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(EmployeeAdapter.MyEmployeeViewHolder holder, int position) {

        holder.txtEmpId.setText(emplList[position].getEmpNo());
        holder.txtEmpFirstName.setText(emplList[position].getFirstName());
        holder.txtEmpLastName.setText(emplList[position].getLastName());
        holder.txtDateOfBirth.setText(emplList[position].getBirthDate());
        holder.txtGendor.setText(emplList[position].getGendor());
        holder.txtDateOfJoing.setText(emplList[position].getHireDate());

    }

    @Override
    public int getItemCount() {
        return emplList.length;
    }

    public class MyEmployeeViewHolder extends RecyclerView.ViewHolder {

        TextView txtEmpId;
        TextView txtEmpFirstName;
        TextView txtEmpLastName;
        TextView txtDateOfBirth;
        TextView txtGendor;
        TextView txtDateOfJoing;

        public MyEmployeeViewHolder(View itemView) {
            super(itemView);

            txtEmpId = (TextView) itemView.findViewById(R.id.empId);
            txtEmpFirstName = (TextView) itemView.findViewById(R.id.empFirstName);
            txtEmpLastName = (TextView) itemView.findViewById(R.id.empLastName);
            txtDateOfBirth = (TextView) itemView.findViewById(R.id.empBirthDate);
            txtGendor = (TextView) itemView.findViewById(R.id.empGendor);
            txtDateOfJoing = (TextView) itemView.findViewById(R.id.empHireDate);
        }
    }
}
