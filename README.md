# ClientIndovinaNumero
Questo client usa un protocollo con in comune col rispettivo ServerIndovinaNumero.
La porta su cui avviene questa comunicazione è la 2750.
Il protocollo è il seguente:
| Stringa ricevuta | Significato                                                                               | Effetto sul client                                                                                      |
|------------------|-------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------|
| "I"              | La stringa "I" indica al client che ha indovinato il numero giusto.                       | Stampa con il numero dei tentativi serviti per indovinare il numero e procede a chiudere la connessione |
| "m"              | La stringa "m" indica al client che il numero inviato è minore di quello da indovinare.   | Il client comunica che numero inviato  è minore di quello da indovinare e continua l'esecuzione.        |
| "M"              | La stringa "m" indica al client che il numero inviato è maggiore di quello da indovinare. | Il client comunica che numero inviato  è maggiore di quello da indovinare e continua l'esecuzione.      |
