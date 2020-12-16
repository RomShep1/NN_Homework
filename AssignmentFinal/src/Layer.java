import java.util.ArrayList;

public class Layer 
{
	private ArrayList<Neuron> neuronLayer = new ArrayList<Neuron>();
	
	Layer(int countOfNeurons)
	{
		for(int i = 0; i < countOfNeurons; i++)
			neuronLayer.add(new Neuron());		
	}
	
	public void SetInputValuesLayer(double[] inputSignals) 
	{
		for(int i = 0; i < neuronLayer.size(); i++) 
			for(int j = 0; j < inputSignals.length; j++)
				neuronLayer.get(i).SetInputSignal(inputSignals[j]);
	}
	
	public void SetWeightFactorsLayer(double[][] weightFactors) 
	{
		for(int i = 0; i < neuronLayer.size(); i++) 
			for(int j = 0; j < weightFactors[i].length; j++)
				neuronLayer.get(i).SetWeightingFactors(weightFactors[i][j]);
	}
	
	public double[] ActivationFunctionLayer() 
	{
		double outputSignals[] = new double[neuronLayer.size()];
		for(int i = 0; i < neuronLayer.size(); i++) 
			outputSignals[i] = neuronLayer.get(i).ActivationFunctionNeuron();

		return outputSignals;
	}
}
