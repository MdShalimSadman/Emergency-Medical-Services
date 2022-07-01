import Classes.*;
public class MainActivity{
	public static void main(String[] args){
		AmbulanceProvider a1=new AmbulanceProvider("Kuwait moitri hospital ambulance service","Uttara","3344",5);
		AmbulanceProvider a2=new AmbulanceProvider("Banani clinic ambulance service","Banani","333",4);
        BloodDonor b1=new BloodDonor("Sheikh Nasif","Uttara","01711186442","O+",true);
	
		BloodDonor b2=new BloodDonor("Nabil Ahmed","Uttara","01779013962","A+",true);
		

	    BloodDonor b3=new BloodDonor("Mamun","Banani","01711186442","O+",false);
	
		BloodDonor b4=new BloodDonor("Moshiur","Banani","01779013962","O-",true);
		
		BloodDonor b5=new BloodDonor("Kowshik ","Khilkhet","01711186443","A-",true);
	
		BloodDonor b6=new BloodDonor("Hadiur ","Uttara","01779013962","AB+",true);
		

	    BloodDonor b7=new BloodDonor("Mahmudur","Banani","01711186442","AB-",true);
	
		BloodDonor b8=new BloodDonor("Ejaz","Uttara","01779013962","B+",true);
		BloodDonor b9=new BloodDonor("Tabib","Banani","01779013952","B-",true);
		
		
		
		Doctor d1=new Doctor("Dr. Ruhul","Kuwait moitri hospital","Uttara","01854288385","Cardiac specialist",2.5);
		Doctor d2= new Doctor("Dr.Amin","Cresent Hospital","Uttara","01772324323","ENT specialist",3.5);
		Doctor d3=new Doctor("Dr. korim","Sheba clinic","Khilkhet","018234567","Dentist",4.5);
		Doctor d4=new Doctor("Dr. Rahim","Banani clinic","Banani","0123546764","Orthopaedic surgeon",3.4);
		Doctor d5=new Doctor("Dr. Solim","Khilkhet hospital","Khilkhet","0123546764","Psychiatrist",3.4);
		Doctor d6=new Doctor("Dr. devi","Banani clinic","Banani","0133546764","Skin specialist",3.4);
		Doctor d7=new Doctor("Dr. sakib","Uttara adhunik hospital","Uttara","0123546764","Neurologist",3.4);
		Doctor d8=new Doctor("Dr.Tamim","Banani clinic","Banani","012123112","Child specialist",3.5);
		Doctor d9=new Doctor("Dr. Sabahat","Banani hospital","Banani","01854288385","Cardiac specialist",5.0);
		
		Account e1=new Account("MD.Shalim Sadman","222",10000);
		Account e2=new Account("Sheikh Nasif","333",190000);
		Account e3=new Account("Mamun","444",19000);
		Account e4=new Account("Ifte","555",20000);
		Account e5=new Account("Fahim","666",30000);
		
		
		User u1= new User();
		
		
		u1.addAmbulanceProviders(a1);
		u1.addAmbulanceProviders(a2);
	    u1.addBloodDonors(b1);
		u1.addBloodDonors(b2);
		u1.addBloodDonors(b3);
		u1.addBloodDonors(b4);
		u1.addBloodDonors(b5);
		u1.addBloodDonors(b6);
		u1.addBloodDonors(b7);
		u1.addBloodDonors(b8);
		u1.addBloodDonors(b9);
	
		
		u1.addDoctors(d1);
		u1.addDoctors(d2);
		u1.addDoctors(d3);
		u1.addDoctors(d4);
		u1.addDoctors(d5);
		u1.addDoctors(d6);
		u1.addDoctors(d7);
		u1.addDoctors(d8);
		u1.addDoctors(d9);
       
	   u1.addAccounts(e1);
	   u1.addAccounts(e2);
	   u1.addAccounts(e3);
	   u1.addAccounts(e4);
	   u1.addAccounts(e5);

		u1.Emergency();
		
	    
	}
}