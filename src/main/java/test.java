import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.fasterxml.jackson.core.type.TypeReference;
import com.test.*;

public class test {
    private static final SimpleDateFormat dateTimeFormatterBooking = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    public static  void main(String[] args) throws ParseException
    {
        List<Employee> employeeList = new
                ArrayList<Employee>();
        Employee emp1 = new Employee
                ("Mahafuj", "24", "HTc", "75000");
        Employee emp2 = new Employee
                ("Aman", "24", "microsoft", "79000");
        Employee emp3 = new Employee
                ("Suvradip", "26", "tcs", "39000");
        Employee emp4 = new Employee
                ("Riya", "22", "NgGear", "15000");
        Employee emp5 = new Employee
                ("Prakash", "29", "Sath", "51000");
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        StringBuffer data = new StringBuffer("Product Code,Biz_Code,Channel Pol_Number,Policy Number_GC,Inception Date,Proposer Title,Proposer First Name,Proposer Middle Name,Proposer Last Name,Date of Birth,Proposer Gender,Marital Status,Unique ID,Unique ID Number,Address Line1,Address Line2,Address Line3,District,City,State,Pincode,Telephone,Mobile Number,Email ID,GSTIN Number,Adhaar Number,PAN Number,Business Type,Producer code,SIC Code/Name (Industry Type),Employee ID,RI Inward,Parent Company Name,Sharing %,Application Number,Application Date,Quotation Number,Policy Key,Partner Application Number,Partner Application Date,Proposal Date,Policy Start Date/ Inception Date,Policy Expiry Date,Service Tax Exemption Category,Remark,Plan Type,Travel Duration,Departure Date,Return Date,Conatct No,Policy Issuance Mode,Destination Country,Address,WIP Remark,Is applicant name same as insured,Applicant First Name,Applicant Middle Name,Applicant Last Name,Applicant Relationship,Risk Component Type,Sequence No,Title,Insured Person First Name,Insured Person Middle Name,Insured Person Last Name,ID Type,ID No,Date of Birth,Age,Relationship,Remarks,Nominee Name,Premium amount,Application Number/ Policy no,Business Type,Payment Received,Receipt_Number,Mode of Entry,CD A/C Number,Intermediary Code,Dealer Code,Payer type,Office Location,Customer Name/Payer Name,Instrument Rcvd Date,Receipt Mode,Cheque Number/ DD Number/Transaction ID,Bank Name,IFSC Code,Cheque Date/ DD Date/Transaction Date,Receipt Amount,Auth Code,Relationship,Customer ID/Financier ID/ Dealer ID,Transaction Type,MID,TID,House Bank A/C No,Deposit Slip No,House Bank\n");
        for(Employee emp : employeeList ){
           String res =  makeDataFromEmployee(emp);
           data.append(res + "\n");
        }

        File file = new File("/Users/shubham/productionIssues/data12.csv");
        try {
            PrintWriter out = new PrintWriter(new FileWriter(file));
            out.write(data.toString());
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static String makeDataFromEmployee(Employee emp) {
        return "1605,01,PTAR0947086,,09/09/2018,," + emp.getName() + " ,,Vijaya Ravipati,,,,,,,,,,,," + emp.getAge() + ",,,,,,,,0035286000,,,,,,,07/09/2018,,,,,07/09/2018,09/09/18,08/10/2018,,,Plan C,,,,,,,,,,,,,,,,,,,,,,,,,,,236,,,NO,,,,,,,,,,,,,,,,,,,,,,,,\n";
    }


}
