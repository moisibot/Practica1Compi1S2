package Gramaticas;
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\024\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\004\000\002\003\004\000\002\004\017" +
    "\000\002\004\017\000\002\004\021\000\002\004\021\000" +
    "\002\004\023\000\002\005\015\000\002\005\015\000\002" +
    "\006\003\000\002\006\003\000\002\006\003\000\002\006" +
    "\005\000\002\006\005\000\002\006\005\000\002\006\005" +
    "\000\002\006\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\157\000\006\004\005\012\006\001\002\000\004\031" +
    "\161\001\002\000\014\005\060\006\061\007\055\010\057" +
    "\011\056\001\002\000\004\015\015\001\002\000\004\002" +
    "\014\001\002\000\010\002\uffff\004\005\012\006\001\002" +
    "\000\004\031\012\001\002\000\010\002\ufffd\004\ufffd\012" +
    "\ufffd\001\002\000\004\002\000\001\002\000\004\002\001" +
    "\001\002\000\004\025\016\001\002\000\006\017\017\020" +
    "\020\001\002\000\004\027\046\001\002\000\004\027\021" +
    "\001\002\000\012\025\024\033\023\034\025\035\022\001" +
    "\002\000\016\021\ufff5\022\ufff5\023\ufff5\024\ufff5\026\ufff5" +
    "\027\ufff5\001\002\000\016\021\ufff4\022\ufff4\023\ufff4\024" +
    "\ufff4\026\ufff4\027\ufff4\001\002\000\012\025\024\033\023" +
    "\034\025\035\022\001\002\000\016\021\ufff3\022\ufff3\023" +
    "\ufff3\024\ufff3\026\ufff3\027\ufff3\001\002\000\014\021\032" +
    "\022\031\023\027\024\033\027\030\001\002\000\012\025" +
    "\024\033\023\034\025\035\022\001\002\000\012\025\024" +
    "\033\023\034\025\035\022\001\002\000\012\025\024\033" +
    "\023\034\025\035\022\001\002\000\012\025\024\033\023" +
    "\034\025\035\022\001\002\000\012\025\024\033\023\034" +
    "\025\035\022\001\002\000\016\021\uffef\022\uffef\023\uffef" +
    "\024\uffef\026\uffef\027\uffef\001\002\000\016\021\ufff2\022" +
    "\ufff2\023\027\024\033\026\ufff2\027\ufff2\001\002\000\016" +
    "\021\ufff1\022\ufff1\023\027\024\033\026\ufff1\027\ufff1\001" +
    "\002\000\014\021\032\022\031\023\027\024\033\027\040" +
    "\001\002\000\012\025\024\033\023\034\025\035\022\001" +
    "\002\000\014\021\032\022\031\023\027\024\033\026\042" +
    "\001\002\000\004\031\ufff6\001\002\000\016\021\ufff0\022" +
    "\ufff0\023\ufff0\024\ufff0\026\ufff0\027\ufff0\001\002\000\014" +
    "\021\032\022\031\023\027\024\033\026\045\001\002\000" +
    "\016\021\uffee\022\uffee\023\uffee\024\uffee\026\uffee\027\uffee" +
    "\001\002\000\012\025\024\033\023\034\025\035\022\001" +
    "\002\000\014\021\032\022\031\023\027\024\033\027\050" +
    "\001\002\000\012\025\024\033\023\034\025\035\022\001" +
    "\002\000\014\021\032\022\031\023\027\024\033\027\052" +
    "\001\002\000\012\025\024\033\023\034\025\035\022\001" +
    "\002\000\014\021\032\022\031\023\027\024\033\026\054" +
    "\001\002\000\004\031\ufff7\001\002\000\004\025\144\001" +
    "\002\000\004\025\125\001\002\000\004\025\110\001\002" +
    "\000\004\025\075\001\002\000\004\025\062\001\002\000" +
    "\004\032\063\001\002\000\004\027\064\001\002\000\012" +
    "\025\024\033\023\034\025\035\022\001\002\000\014\021" +
    "\032\022\031\023\027\024\033\027\066\001\002\000\012" +
    "\025\024\033\023\034\025\035\022\001\002\000\014\021" +
    "\032\022\031\023\027\024\033\027\070\001\002\000\012" +
    "\025\024\033\023\034\025\035\022\001\002\000\014\021" +
    "\032\022\031\023\027\024\033\027\072\001\002\000\004" +
    "\016\073\001\002\000\004\026\074\001\002\000\004\031" +
    "\ufffb\001\002\000\004\032\076\001\002\000\004\027\077" +
    "\001\002\000\012\025\024\033\023\034\025\035\022\001" +
    "\002\000\014\021\032\022\031\023\027\024\033\027\101" +
    "\001\002\000\012\025\024\033\023\034\025\035\022\001" +
    "\002\000\014\021\032\022\031\023\027\024\033\027\103" +
    "\001\002\000\012\025\024\033\023\034\025\035\022\001" +
    "\002\000\014\021\032\022\031\023\027\024\033\027\105" +
    "\001\002\000\004\016\106\001\002\000\004\026\107\001" +
    "\002\000\004\031\ufffc\001\002\000\004\032\111\001\002" +
    "\000\004\027\112\001\002\000\012\025\024\033\023\034" +
    "\025\035\022\001\002\000\014\021\032\022\031\023\027" +
    "\024\033\027\114\001\002\000\012\025\024\033\023\034" +
    "\025\035\022\001\002\000\014\021\032\022\031\023\027" +
    "\024\033\027\116\001\002\000\012\025\024\033\023\034" +
    "\025\035\022\001\002\000\014\021\032\022\031\023\027" +
    "\024\033\027\120\001\002\000\012\025\024\033\023\034" +
    "\025\035\022\001\002\000\014\021\032\022\031\023\027" +
    "\024\033\027\122\001\002\000\004\016\123\001\002\000" +
    "\004\026\124\001\002\000\004\031\ufff9\001\002\000\004" +
    "\032\126\001\002\000\004\027\127\001\002\000\012\025" +
    "\024\033\023\034\025\035\022\001\002\000\014\021\032" +
    "\022\031\023\027\024\033\027\131\001\002\000\012\025" +
    "\024\033\023\034\025\035\022\001\002\000\014\021\032" +
    "\022\031\023\027\024\033\027\133\001\002\000\012\025" +
    "\024\033\023\034\025\035\022\001\002\000\014\021\032" +
    "\022\031\023\027\024\033\027\135\001\002\000\012\025" +
    "\024\033\023\034\025\035\022\001\002\000\014\021\032" +
    "\022\031\023\027\024\033\027\137\001\002\000\012\025" +
    "\024\033\023\034\025\035\022\001\002\000\014\021\032" +
    "\022\031\023\027\024\033\027\141\001\002\000\004\016" +
    "\142\001\002\000\004\026\143\001\002\000\004\031\ufff8" +
    "\001\002\000\004\032\145\001\002\000\004\027\146\001" +
    "\002\000\012\025\024\033\023\034\025\035\022\001\002" +
    "\000\014\021\032\022\031\023\027\024\033\027\150\001" +
    "\002\000\012\025\024\033\023\034\025\035\022\001\002" +
    "\000\014\021\032\022\031\023\027\024\033\027\152\001" +
    "\002\000\012\025\024\033\023\034\025\035\022\001\002" +
    "\000\014\021\032\022\031\023\027\024\033\027\154\001" +
    "\002\000\012\025\024\033\023\034\025\035\022\001\002" +
    "\000\014\021\032\022\031\023\027\024\033\027\156\001" +
    "\002\000\004\016\157\001\002\000\004\026\160\001\002" +
    "\000\004\031\ufffa\001\002\000\010\002\ufffe\004\ufffe\012" +
    "\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\157\000\012\002\006\003\007\004\003\005\010\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\012\002\012\003\007\004\003\005" +
    "\010\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\006\025" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\043\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\006\042\001\001\000\004\006\036\001\001\000\004\006" +
    "\035\001\001\000\004\006\034\001\001\000\004\006\033" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\006\040\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\006\046\001\001\000\002" +
    "\001\001\000\004\006\050\001\001\000\002\001\001\000" +
    "\004\006\052\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\064\001\001\000\002\001\001\000" +
    "\004\006\066\001\001\000\002\001\001\000\004\006\070" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\006\077\001\001\000\002\001\001\000\004\006" +
    "\101\001\001\000\002\001\001\000\004\006\103\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\006\112\001\001\000\002\001\001\000\004\006\114\001" +
    "\001\000\002\001\001\000\004\006\116\001\001\000\002" +
    "\001\001\000\004\006\120\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\006\127\001\001\000" +
    "\002\001\001\000\004\006\131\001\001\000\002\001\001" +
    "\000\004\006\133\001\001\000\002\001\001\000\004\006" +
    "\135\001\001\000\002\001\001\000\004\006\137\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\006\146\001\001\000\002\001\001\000\004\006\150\001" +
    "\001\000\002\001\001\000\004\006\152\001\001\000\002" +
    "\001\001\000\004\006\154\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    // Código del parser
    public void syntax_error(Symbol s){
        System.out.println("Error de sintaxis en la línea " + (s.left) + " columna " + (s.right) + ": Token inesperado " + s.value);
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
        System.out.println("Error de sintaxis irrecuperable en la línea " + (s.left) + " columna " + (s.right) + ": Token inesperado " + s.value);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintactico$actions {
  private final Sintactico parser;

  /** Constructor */
  CUP$Sintactico$actions(Sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action_part00000000(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= statement program 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // program ::= statement 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // statement ::= figure PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // statement ::= animation PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // figure ::= GRAFICAR CIRCULO PARENTESIS_ABIERTO IDENTIFICADOR COMA expression COMA expression COMA expression COMA COLOR PARENTESIS_CERRADO 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("figure",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-12)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // figure ::= GRAFICAR CUADRADO PARENTESIS_ABIERTO IDENTIFICADOR COMA expression COMA expression COMA expression COMA COLOR PARENTESIS_CERRADO 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("figure",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-12)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // figure ::= GRAFICAR RECTANGULO PARENTESIS_ABIERTO IDENTIFICADOR COMA expression COMA expression COMA expression COMA expression COMA COLOR PARENTESIS_CERRADO 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("figure",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-14)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // figure ::= GRAFICAR LINEA PARENTESIS_ABIERTO IDENTIFICADOR COMA expression COMA expression COMA expression COMA expression COMA COLOR PARENTESIS_CERRADO 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("figure",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-14)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // figure ::= GRAFICAR POLIGONO PARENTESIS_ABIERTO IDENTIFICADOR COMA expression COMA expression COMA expression COMA expression COMA expression COMA COLOR PARENTESIS_CERRADO 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("figure",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-16)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // animation ::= ANIMAR OBJETO_ANTERIOR PARENTESIS_ABIERTO ANIM_TIPO_LINEAL COMA expression COMA expression COMA expression PARENTESIS_CERRADO 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("animation",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-10)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // animation ::= ANIMAR OBJETO_ANTERIOR PARENTESIS_ABIERTO ANIM_TIPO_CURVA COMA expression COMA expression COMA expression PARENTESIS_CERRADO 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("animation",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-10)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expression ::= NUMERO 
            {
              Double RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expression ::= ENTEROS 
            {
              Double RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expression ::= DECIMAL 
            {
              Double RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expression ::= expression SUMA expression 
            {
              Double RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expression ::= expression RESTA expression 
            {
              Double RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expression ::= expression MULTIPLICACION expression 
            {
              Double RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expression ::= expression DIVISION expression 
            {
              Double RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expression ::= PARENTESIS_ABIERTO expression PARENTESIS_CERRADO 
            {
              Double RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
              return CUP$Sintactico$do_action_part00000000(
                               CUP$Sintactico$act_num,
                               CUP$Sintactico$parser,
                               CUP$Sintactico$stack,
                               CUP$Sintactico$top);
    }
}

}
