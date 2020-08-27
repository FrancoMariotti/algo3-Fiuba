package modelo;

public interface Inversion {
	int recibirInversionDe(InversionistaConservador inversionista,int monto);
	int recibirInversionDe(InversionistaAgresivo inversionista,int monto);
	int recibirInversionDe(InversionistaArriesgado inversionista,int monto);
}
