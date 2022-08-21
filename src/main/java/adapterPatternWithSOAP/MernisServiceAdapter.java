/*
Demeli burada MernisService Adapter class-miz var
Bu class icinde MernisSOAPService-i çağırdiq
Ve bu adapter sahesinde sistemizde istifade ede bilirik

 */




//package adapterPatternWithSOAP;
//
//import com.example.mernisService.CNGKPSPublicSoap;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDate;
//
//@Service(value = "MernisServiceAdapter")
//public class MernisServiceAdapter implements CheckPerson {
//
//
//    @Override
//    public boolean checkIfRealPerson(long identityNumber ,
//                                     String name ,
//                                     String surname ,
//                                     LocalDate dateOfBirth) {
//
//        CNGKPSPublicSoap kpsPublicSoap = new CNGKPSPublicSoap();
//        try {
//            return kpsPublicSoap.TCKimlikNoDogrula(identityNumber, name, surname,dateOfBirth.getYear());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//
//
//
//}
