import java.util.ArrayList;

public class Neuron 
{
	private ArrayList<Double> inputSignal = new ArrayList<Double>();
	private ArrayList<Double> weightingFactors= new ArrayList<Double>();
	private double outputSignal;
	
	public void SetInputSignal(double signal) 
	{
		inputSignal.add(signal);
	}
	public void SetWeightingFactors(double weight) 
	{
		weightingFactors.add(weight);
	}
	
	public double ActivationFunctionNeuron() 
	{
		for(int i = 0; i < inputSignal.size(); i++)
			outputSignal += inputSignal.get(i)*weightingFactors.get(i);

		if((double)Math.round(outputSignal*100)/100 >= 0.5)
			return outputSignal = 1;
		else
			return outputSignal = 0;
	}
}
