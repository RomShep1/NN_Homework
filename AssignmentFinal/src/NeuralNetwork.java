public class NeuralNetwork 
{
	public static void main(String[] args) 
	{
		ExampleFinal2();
		ExampleFinal4();
	}
	
	public static void ExampleFinal2() 
	{
		Neuron neuron1 = new Neuron();
		Neuron neuron2 = new Neuron();
		Neuron neuron3 = new Neuron();
		Neuron outputNeuron = new Neuron();
		
		neuron1.SetInputSignal(1);
		neuron2.SetInputSignal(1);
		neuron3.SetInputSignal(1);
		neuron1.SetWeightingFactors(1);
		neuron2.SetWeightingFactors(1);
		neuron3.SetWeightingFactors(1);
		
		outputNeuron.SetInputSignal(neuron1.ActivationFunctionNeuron());
		outputNeuron.SetInputSignal(neuron2.ActivationFunctionNeuron());
		outputNeuron.SetInputSignal(neuron3.ActivationFunctionNeuron());
		outputNeuron.SetWeightingFactors(0.5);
		outputNeuron.SetWeightingFactors(-0.5);
		outputNeuron.SetWeightingFactors(0.5);
		
		System.out.println(outputNeuron.ActivationFunctionNeuron());
	}
	public static void ExampleFinal4() 
	{
		Layer layer1 = new Layer(3);
		Layer layer2 = new Layer(2);
		Layer layer3 = new Layer(1);
		
		double[] inputSignalsLayer1 = new double[] {1, 1, 1};
		double[][] weightFactorsLayer1 = new double[][] {{1, 0, 0},{0, 1, 0},{0, 0, 1}};
		layer1.SetInputValuesLayer(inputSignalsLayer1);
		layer1.SetWeightFactorsLayer(weightFactorsLayer1);
		
		double[] inputSignalsLayer2 = layer1.ActivationFunctionLayer();
		double[][] weightFactorsLayer2 = new double[][] {{0.25, 0.25, 0},{0.5, -0.4, 0.9}};
		layer2.SetInputValuesLayer(inputSignalsLayer2);
		layer2.SetWeightFactorsLayer(weightFactorsLayer2);
		
		double[] inputSignalsLayer3 = layer2.ActivationFunctionLayer();
		double[][] weightFactorsLayer3 = new double[][] {{-1, 1}};
		layer3.SetInputValuesLayer(inputSignalsLayer3);
		layer3.SetWeightFactorsLayer(weightFactorsLayer3);
		
		double[] finalOutputSignals = layer3.ActivationFunctionLayer();
		for(double finalOutSignal: finalOutputSignals)
			System.out.println(finalOutSignal);
	}
}
