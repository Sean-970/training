package org.example.report;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        Report healthreport = new Health();
        Report finacereport = new Finace();
        List<Report> reports = new ArrayList<>();
        reports.add(finacereport);
        reports.add(healthreport);
        for(Report report:reports){
            report.load();
            report.print();
        }
    }
}
