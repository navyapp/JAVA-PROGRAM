
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
  System.out.println("cpu price:\t"+cpu.price);
  
  }
}