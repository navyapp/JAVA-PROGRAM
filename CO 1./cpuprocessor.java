Q5:Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer) 
and static nested class RAM (memory, manufacturer). Create an object of CPU and print 
information of Processor and RAM. 

class CPU
{
  int price=5000;
  class Processor
  {
    int cores=5;
    String manifacture="samsung";
    
  }
  protected class RAM
  {
   int memory=124;
   String manifacture="intel"; 
   
}
}
class cpuprocessor
{
 public static void main(String args[])
 {
  CPU cpu=new CPU();
  CPU.Processor processor=cpu.new Processor();
  CPU.RAM ram=cpu.new RAM();
  System.out.println("processor details:\n" + processor.cores +  processor.manifacture);
  System.out.println("RAM details:\n" + ram.memory + ram.manifacture);
  System.out.println("cpu price:"+cpu.price);
  
  }
}

OUTPUT

D:\JAVA PROGRAMS>javac cpuprocessor.java

D:\JAVA PROGRAMS>java cpuprocessor
processor details:
5 samsung
RAM details:
124 intel
cpu price: 5000
