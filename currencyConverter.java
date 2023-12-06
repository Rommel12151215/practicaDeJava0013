import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CurrencyConverter extends HttpServlet {
   public void doPost(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {

       String amount = request.getParameter("amount");
       String fromCurrency = request.getParameter("fromCurrency");
       String toCurrency = request.getParameter("toCurrency");

       double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);

       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       out.println("Converted Amount: " + convertedAmount);
   }

   private double convertCurrency(String amount, String fromCurrency, String toCurrency) {
       // Aquí va la lógica para convertir la moneda
       // Esto puede implicar hacer una solicitud a una API de conversión de moneda
       // y luego devolver el monto convertido
   }
}
