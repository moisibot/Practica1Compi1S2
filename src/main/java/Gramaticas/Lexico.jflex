package Gramaticas;
import java_cup.runtime.*;
import Gramaticas.sym;

%%

%{
    private Symbol symbol(int type) {
        return new Symbol(type, yyline + 1, yycolumn + 1);
    }
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline + 1, yycolumn + 1, value);
    }
    private LinkedList<String> listaErrores;
%}

%init{
    yyline = 1;
    yycolumn = 1;
    listaErrores = new LinkedList<>();
    yybegin(YYINITIAL);
%init}

%class AnalizadorLexico
%public
%unicode
%standalone
%cup
%line
%column
%ignorecase

SaltosLinea     = \r|\n|\r\n
EspaciosBlancos = {SaltosLinea} | [ \t\f]
Identificador   = [a-zA-Z][a-zA-Z0-9_]*
Enteros         = 0 | ([1-9][0-9]*)
Decimal         = {Enteros}\.[0-9]+
Comentario      = "//".*
NumeroNegativo  =-({Enteros}|{Decimal})

%%

<YYINITIAL> {
//graficos 
    "graficar"     { return symbol(sym.GRAFICAR); }
    "circulo"      { return symbol(sym.CIRCULO); }
    "cuadrado"     { return symbol(sym.CUADRADO); }
    "rectangulo"   { return symbol(sym.RECTANGULO); }
    "linea"        { return symbol(sym.LINEA); }
    "poligono"     { return symbol(sym.POLIGONO); }
    "animar"       { return symbol(sym.ANIMAR); }
    "objeto"       { return symbol(sym.OBJETO); }
    "anterior"     { return symbol(sym.ANTERIOR); }

 //colores
    "azul"         { return symbol(sym.COLOR, yytext()); }
    "rojo"         { return symbol(sym.COLOR, yytext()); }
    "amarillo"     { return symbol(sym.COLOR, yytext()); }
    "verde"        { return symbol(sym.COLOR, yytext()); }
//mis colores
    "morado"        { return symbol(sym.COLOR, yytext()); }
    "cafe"         { return symbol(sym.COLOR, yytext()); }
    "naranja"      { return symbol(sym.COLOR, yytext()); }
    "rosado"       { return symbol(sym.COLOR, yytext()); }
    "celeste"      { return symbol(sym.COLOR, yytext()); }
    
//animados
    "lineal"        { return symbol(sym.ANIM_TIPO_LINEAL, yytext()); }
    "curva"        { return symbol(sym.ANIM_TIPO_CURVA, yytext()); }
   
//OPERADORES 
    "+"            { return symbol(sym.SUMA); }
    "-"            { return symbol(sym.RESTA); }
    "*"            { return symbol(sym.MULTIPLICACION); }
    "/"            { return symbol(sym.DIVISION); }
    "("            { return symbol(sym.PARENTESIS_ABIERTO); }
    ")"            { return symbol(sym.PARENTESIS_CERRADO); }
    ","            { return symbol(sym.COMA); }
    "="            { return symbol(sym.IGUAL); }
    ";"            { return symbol(sym.PUNTO_COMA); }

    
 // Posiciones
    "posx"         { return symbol(sym.POSX); }
    "posy"         { return symbol(sym.POSY); }
    "radio"        { return symbol(sym.RADIO); }
    "ancho"        { return symbol(sym.ANCHO); }
    "alto"         { return symbol(sym.ALTO); }
    
    {Identificador} { return symbol(sym.IDENTIFICADOR, yytext()); }
    {Enteros}       { return symbol(sym.ENTEROS, Integer.parseInt(yytext())); }
    {Decimal}       { return symbol(sym.DECIMAL, Double.parseDouble(yytext())); }
    {EspaciosBlancos} { /* ignorar */ }

    {Comentario}     { /* ignore comments */ }
    {NumeroNegativo} { return symbol(sym.NUMERO, Double.parseDouble(yytext())); }   


{EspaciosBlancos} { /* ignorar */ }

<<EOF>> { return symbol(sym.EOF); }

   [^] { 
        String errorMsg = "Error léxico: Caracter inválido <" + yytext() + "> en línea " + (yyline+1) + ", columna " + (yycolumn+1);
        listaErrores.add(errorMsg);
        System.out.println(errorMsg);
    }
}