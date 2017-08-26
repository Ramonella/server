/* Generated By:JJTree&JavaCC: Do not edit this line. analizadorConstants.java */
package Analizador;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface analizadorConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int crear = 12;
  /** RegularExpression Id. */
  int base_datos = 13;
  /** RegularExpression Id. */
  int tabla = 14;
  /** RegularExpression Id. */
  int nulo = 15;
  /** RegularExpression Id. */
  int no_nulo = 16;
  /** RegularExpression Id. */
  int autoincrementable = 17;
  /** RegularExpression Id. */
  int llave_prim = 18;
  /** RegularExpression Id. */
  int llave_for = 19;
  /** RegularExpression Id. */
  int unico = 20;
  /** RegularExpression Id. */
  int objeto = 21;
  /** RegularExpression Id. */
  int procedimiento = 22;
  /** RegularExpression Id. */
  int funcion = 23;
  /** RegularExpression Id. */
  int retorno = 24;
  /** RegularExpression Id. */
  int usuario = 25;
  /** RegularExpression Id. */
  int colocar = 26;
  /** RegularExpression Id. */
  int password = 27;
  /** RegularExpression Id. */
  int usar = 28;
  /** RegularExpression Id. */
  int alterar = 29;
  /** RegularExpression Id. */
  int agregar = 30;
  /** RegularExpression Id. */
  int quitar = 31;
  /** RegularExpression Id. */
  int cambiar = 32;
  /** RegularExpression Id. */
  int eliminar = 33;
  /** RegularExpression Id. */
  int obj_usql = 34;
  /** RegularExpression Id. */
  int insertar = 35;
  /** RegularExpression Id. */
  int en = 36;
  /** RegularExpression Id. */
  int actualizar = 37;
  /** RegularExpression Id. */
  int valores = 38;
  /** RegularExpression Id. */
  int borrar = 39;
  /** RegularExpression Id. */
  int donde = 40;
  /** RegularExpression Id. */
  int seleccionar = 41;
  /** RegularExpression Id. */
  int de = 42;
  /** RegularExpression Id. */
  int ordenar = 43;
  /** RegularExpression Id. */
  int por = 44;
  /** RegularExpression Id. */
  int asc = 45;
  /** RegularExpression Id. */
  int desc = 46;
  /** RegularExpression Id. */
  int permisos = 47;
  /** RegularExpression Id. */
  int otorgar = 48;
  /** RegularExpression Id. */
  int denegar = 49;
  /** RegularExpression Id. */
  int declarar = 50;
  /** RegularExpression Id. */
  int si = 51;
  /** RegularExpression Id. */
  int sino = 52;
  /** RegularExpression Id. */
  int selecciona = 53;
  /** RegularExpression Id. */
  int caso = 54;
  /** RegularExpression Id. */
  int defecto = 55;
  /** RegularExpression Id. */
  int para = 56;
  /** RegularExpression Id. */
  int mientras = 57;
  /** RegularExpression Id. */
  int detener = 58;
  /** RegularExpression Id. */
  int imprimir = 59;
  /** RegularExpression Id. */
  int fecha = 60;
  /** RegularExpression Id. */
  int fecha_hora = 61;
  /** RegularExpression Id. */
  int contar = 62;
  /** RegularExpression Id. */
  int backup = 63;
  /** RegularExpression Id. */
  int usqldump = 64;
  /** RegularExpression Id. */
  int completo = 65;
  /** RegularExpression Id. */
  int restaurar = 66;
  /** RegularExpression Id. */
  int TEXT = 67;
  /** RegularExpression Id. */
  int INTEGER = 68;
  /** RegularExpression Id. */
  int DOUBLE = 69;
  /** RegularExpression Id. */
  int BOOL = 70;
  /** RegularExpression Id. */
  int DATE = 71;
  /** RegularExpression Id. */
  int DATETIME = 72;
  /** RegularExpression Id. */
  int OR = 73;
  /** RegularExpression Id. */
  int AND = 74;
  /** RegularExpression Id. */
  int NOT = 75;
  /** RegularExpression Id. */
  int falso = 76;
  /** RegularExpression Id. */
  int verdadero = 77;
  /** RegularExpression Id. */
  int menos_menos = 78;
  /** RegularExpression Id. */
  int mas_mas = 79;
  /** RegularExpression Id. */
  int S_MAS = 80;
  /** RegularExpression Id. */
  int S_MENOS = 81;
  /** RegularExpression Id. */
  int S_POR = 82;
  /** RegularExpression Id. */
  int S_DIV = 83;
  /** RegularExpression Id. */
  int S_POT = 84;
  /** RegularExpression Id. */
  int dos_puntos = 85;
  /** RegularExpression Id. */
  int abre_par = 86;
  /** RegularExpression Id. */
  int cierra_par = 87;
  /** RegularExpression Id. */
  int coma = 88;
  /** RegularExpression Id. */
  int punto = 89;
  /** RegularExpression Id. */
  int punto_coma = 90;
  /** RegularExpression Id. */
  int abre_llave = 91;
  /** RegularExpression Id. */
  int cierra_llave = 92;
  /** RegularExpression Id. */
  int DECIMAL = 93;
  /** RegularExpression Id. */
  int NUM = 94;
  /** RegularExpression Id. */
  int CADENA = 95;
  /** RegularExpression Id. */
  int CARACTER = 96;
  /** RegularExpression Id. */
  int id = 97;
  /** RegularExpression Id. */
  int LETRA = 98;
  /** RegularExpression Id. */
  int DIGITO = 99;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int COMMENT = 1;
  /** Lexical state. */
  int COMMENT2 = 2;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\r\\n\"",
    "\"#*\"",
    "\"\\n\"",
    "\"#\"",
    "\"*#\"",
    "<token of kind 9>",
    "\"\\n\"",
    "<token of kind 11>",
    "\"CREAR\"",
    "\"BASE_DATOS\"",
    "\"TABLA\"",
    "\"Nulo\"",
    "\"No Nulo\"",
    "\"Autoincrementable\"",
    "\"Llave_Primaria\"",
    "\"Llave_Foranea\"",
    "\"Unico\"",
    "\"OBJETO\"",
    "\"PROCEDIMIENTO\"",
    "\"FUNCION\"",
    "\"RETORNO\"",
    "\"USUARIO\"",
    "\"COLOCAR\"",
    "\"password\"",
    "\"USAR\"",
    "\"ALTERAR\"",
    "\"AGREGAR\"",
    "\"QUITAR\"",
    "\"CAMBIAR\"",
    "\"ELIMINAR\"",
    "\"Objeto-USQL\"",
    "\"INSERTAR\"",
    "\"EN\"",
    "\"ACTUALIZAR\"",
    "\"VALORES\"",
    "\"BORRAR\"",
    "\"DONDE\"",
    "\"SELECCIONAR\"",
    "\"DE\"",
    "\"ORDENAR\"",
    "\"POR\"",
    "\"ASC\"",
    "\"DESC\"",
    "\"PERMISOS\"",
    "\"OTORGAR\"",
    "\"DENEGAR\"",
    "\"DECLARAR\"",
    "\"SI\"",
    "\"SINO\"",
    "\"SELECCIONA\"",
    "\"CASO\"",
    "\"DEFECTO\"",
    "\"PARA\"",
    "\"MIENTRAS\"",
    "\"DETENER\"",
    "\"IMPRIMIR\"",
    "\"FECHA\"",
    "\"FECHA_HORA\"",
    "\"CONTAR\"",
    "\"BACKUP\"",
    "\"USQLDUMP\"",
    "\"COMPLETO\"",
    "\"RESTAURAR\"",
    "\"TEXT\"",
    "\"INTEGER\"",
    "\"DOUBLE\"",
    "\"BOOL\"",
    "\"DATE\"",
    "\"DATETIME\"",
    "\"||\"",
    "\"&&\"",
    "\"!\"",
    "\"falso\"",
    "\"verdadero\"",
    "\"--\"",
    "\"++\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"^\"",
    "\":\"",
    "\"(\"",
    "\")\"",
    "\",\"",
    "\".\"",
    "\";\"",
    "\"{\"",
    "\"}\"",
    "<DECIMAL>",
    "<NUM>",
    "<CADENA>",
    "<CARACTER>",
    "<id>",
    "<LETRA>",
    "<DIGITO>",
    "\"@\"",
    "\"=\"",
    "\"<\"",
    "\">\"",
    "\"<=\"",
    "\">=\"",
    "\"==\"",
    "\"!=\"",
  };

}