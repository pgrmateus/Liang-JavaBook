package ExerciciosCapitulo1;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 1;
		int i = 1;
		int numero_de_interacoes = 1000;
		for(int x=1;x<=numero_de_interacoes;x++)
		{
			i=i+2;
			if(x%2==1) 
			{
				sum=sum-(1/((double)(i)));
			}
			if(x%2==0)
			{
				sum=sum+(1/((double)(i)));
			}
			System.out.println(i+"\t\t\t"+x+"\t\t\t"+sum);
		}
		System.out.printf("%nO Número PI calculado com %d interações é: %2f",numero_de_interacoes,(sum)*4);
	}

}
