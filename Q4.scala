def discount(n: Int) : Double = cost(n)* 0.4f ; // discount fuction
def shipping(n:Int): Double = n<= 50 match {
  case true => n*3;
  case false => (n*3) + (n-50)* 0.75f;
} // shipping cost calculation
def cost(n: Int) : Double = n * 24.95f; // cost calculation

def charge(books: Int): Double = shipping(books) + cost(books) - discount(books); //final charge calculation

println("Total wholesale cost for 60 copies = Rs." + charge(60));
