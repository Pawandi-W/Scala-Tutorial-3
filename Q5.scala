def easy(distance: Int) : Int = distance * 8; // easy phase time calculation
def tempo(distance: Int) : Int = distance * 7; // tempo phase time calculation
def time(d1: Int, d2: Int): Int = easy(d1) + tempo(d2); // total time calculation

println("Total Time = " + time(4,3) + " min");
