
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615
//----------------------------------------------------

package Gramaticas;

import java_cup.runtime.*;
import java.util.ArrayList;
import java.awt.Color;
import Objetos.*;
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
    "\003\000\002\004\004\000\002\004\004\000\002\003\017" +
    "\000\002\003\017\000\002\003\021\000\002\003\021\000" +
    "\002\003\023\000\002\005\015\000\002\005\015\000\002" +
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
    "\000\157\000\012\002\006\003\003\004\007\005\010\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\012\002\012\003\003\004\007\005" +
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



    public static ArrayList<Figura> figuras = new ArrayList<>();
    public static ArrayList<String> errores = new ArrayList<>();

    public void syntax_error(Symbol s) {
        errores.add("Error sintáctico en línea " + (s.left + 1) + ", columna " + (s.right + 1) + ": " + s.value);
    }

    public static ArrayList<String> getErrores() {
        return errores;
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintactico$actions {


    private Color getColor(String colorName) {
        switch (colorName.toLowerCase()) {
            case "azul": return Color.BLUE;
            case "rojo": return Color.RED;
            case "amarillo": return Color.YELLOW;
            case "verde": return Color.GREEN;
            case "morado": return new Color(128, 0, 128);
            case "cafe": return new Color(139, 69, 19);
            case "naranja": return Color.ORANGE;
            case "rosado": return Color.PINK;
            case "celeste": return new Color(135, 206, 235);
            default: return Color.BLACK;
        }
    }

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
		ArrayList<Figura> start_val = (ArrayList<Figura>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= statement program 
            {
              ArrayList<Figura> RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // program ::= statement 
            {
              ArrayList<Figura> RESULT =null;
		 RESULT = parser.figuras; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // statement ::= figure PUNTO_COMA 
            {
              Object RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Figura f = (Figura)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		 parser.figuras.add(f); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("statement",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // statement ::= animation PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("statement",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // figure ::= GRAFICAR CIRCULO PARENTESIS_ABIERTO IDENTIFICADOR COMA expression COMA expression COMA expression COMA COLOR PARENTESIS_CERRADO 
            {
              Figura RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-9)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-9)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-9)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)).right;
		Double x = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).right;
		Double y = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		Double r = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		 RESULT = new Circulo(id, (int)x.doubleValue(), (int)y.doubleValue(), (int)r.doubleValue(), getColor(c)); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("figure",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-12)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // figure ::= GRAFICAR CUADRADO PARENTESIS_ABIERTO IDENTIFICADOR COMA expression COMA expression COMA expression COMA COLOR PARENTESIS_CERRADO 
            {
              Figura RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-9)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-9)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-9)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)).right;
		Double x = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).right;
		Double y = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		Double l = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		 RESULT = new Cuadrado(id, (int)x.doubleValue(), (int)y.doubleValue(), (int)l.doubleValue(), getColor(c)); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("figure",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-12)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // figure ::= GRAFICAR RECTANGULO PARENTESIS_ABIERTO IDENTIFICADOR COMA expression COMA expression COMA expression COMA expression COMA COLOR PARENTESIS_CERRADO 
            {
              Figura RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-11)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-11)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-11)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-9)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-9)).right;
		Double x = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-9)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)).right;
		Double y = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)).value;
		int wleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).left;
		int wright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).right;
		Double w = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).value;
		int hleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int hright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		Double h = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		 RESULT = new Rectangulo(id, (int)x.doubleValue(), (int)y.doubleValue(), (int)w.doubleValue(), (int)h.doubleValue(), getColor(c)); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("figure",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-14)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // figure ::= GRAFICAR LINEA PARENTESIS_ABIERTO IDENTIFICADOR COMA expression COMA expression COMA expression COMA expression COMA COLOR PARENTESIS_CERRADO 
            {
              Figura RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-11)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-11)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-11)).value;
		int x1left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-9)).left;
		int x1right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-9)).right;
		Double x1 = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-9)).value;
		int y1left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)).left;
		int y1right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)).right;
		Double y1 = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)).value;
		int x2left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).left;
		int x2right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).right;
		Double x2 = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).value;
		int y2left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int y2right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		Double y2 = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		 RESULT = new Linea(id, (int)x1.doubleValue(), (int)y1.doubleValue(), (int)x2.doubleValue(), (int)y2.doubleValue(), getColor(c)); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("figure",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-14)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // figure ::= GRAFICAR POLIGONO PARENTESIS_ABIERTO IDENTIFICADOR COMA expression COMA expression COMA expression COMA expression COMA expression COMA COLOR PARENTESIS_CERRADO 
            {
              Figura RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-13)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-13)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-13)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-11)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-11)).right;
		Double x = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-11)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-9)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-9)).right;
		Double y = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-9)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)).right;
		Double s = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)).value;
		int wleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).left;
		int wright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).right;
		Double w = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)).value;
		int hleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int hright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		Double h = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		 RESULT = new Poligono(id, (int)x.doubleValue(), (int)y.doubleValue(), (int)s.doubleValue(), (int)w.doubleValue(), (int)h.doubleValue(), getColor(c)); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("figure",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-16)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
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
		int nleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = n; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expression ::= ENTEROS 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = e.doubleValue(); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expression ::= DECIMAL 
            {
              Double RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Double d = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = d; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expression ::= expression SUMA expression 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = e1 + e2; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expression ::= expression RESTA expression 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = e1 - e2; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expression ::= expression MULTIPLICACION expression 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = e1 * e2; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expression ::= expression DIVISION expression 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = e1 / e2; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expression ::= PARENTESIS_ABIERTO expression PARENTESIS_CERRADO 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		 RESULT = e; 
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
