/* Generated By:JJTree&JavaCC: Do not edit this line. Analizador_Procedure.java */
package XML.Procedure;
import java.io.*;

public class Analizador_Procedure/*@bgen(jjtree)*/implements Analizador_ProcedureTreeConstants, Analizador_ProcedureConstants {/*@bgen(jjtree)*/
  protected JJTAnalizador_ProcedureState jjtree = new JJTAnalizador_ProcedureState();

  final public SimpleNode Start() throws ParseException {
                    /*@bgen(jjtree) Start */
  SimpleNode jjtn000 = new SimpleNode(JJTSTART);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Inicio();
                  jjtree.closeNodeScope(jjtn000, true);
                  jjtc000 = false;
                 {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  final public void Inicio() throws ParseException {
               /*@bgen(jjtree) Inicio */
  SimpleNode jjtn000 = new SimpleNode(JJTINICIO);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      sentencias();
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void sentencias() throws ParseException {
                   /*@bgen(jjtree) sentencias */
  SimpleNode jjtn000 = new SimpleNode(JJTSENTENCIAS);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case abre_etiqueta:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        sent();
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void sent() throws ParseException {
    if (jj_2_1(2)) {
      Procedimiento();
    } else if (jj_2_2(2)) {
      funcion();
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void TIPO() throws ParseException {
                  /*@bgen(jjtree) Tipo */
                  SimpleNode jjtn000 = new SimpleNode(JJTTIPO);
                  boolean jjtc000 = true;
                  jjtree.openNodeScope(jjtn000);Token t;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case TEXT:
        t = jj_consume_token(TEXT);
               jjtree.closeNodeScope(jjtn000, true);
               jjtc000 = false;
               jjtn000.setName(t.image);
        break;
      case INTEGER:
        t = jj_consume_token(INTEGER);
                 jjtree.closeNodeScope(jjtn000, true);
                 jjtc000 = false;
                 jjtn000.setName(t.image);
        break;
      case DOUBLE:
        t = jj_consume_token(DOUBLE);
                jjtree.closeNodeScope(jjtn000, true);
                jjtc000 = false;
                 jjtn000.setName(t.image);
        break;
      case BOOL:
        t = jj_consume_token(BOOL);
              jjtree.closeNodeScope(jjtn000, true);
              jjtc000 = false;
              jjtn000.setName(t.image);
        break;
      case DATETIME:
        t = jj_consume_token(DATETIME);
                  jjtree.closeNodeScope(jjtn000, true);
                  jjtc000 = false;
                   jjtn000.setName(t.image);
        break;
      case DATE:
        t = jj_consume_token(DATE);
              jjtree.closeNodeScope(jjtn000, true);
              jjtc000 = false;
              jjtn000.setName(t.image);
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
     if (jjtc000) {
       jjtree.closeNodeScope(jjtn000, true);
     }
    }
  }

  final public void NombreV() throws ParseException {
                /*@bgen(jjtree) NombreV */
  SimpleNode jjtn000 = new SimpleNode(JJTNOMBREV);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(abre_etiqueta);
      jj_consume_token(nombre);
      jj_consume_token(cierra_etiqueta);
      term_id();
      jj_consume_token(abre_etiqueta);
      jj_consume_token(diagonal);
      jj_consume_token(nombre);
      jj_consume_token(cierra_etiqueta);
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void Atributo() throws ParseException {
                  /*@bgen(jjtree) Atributo */
  SimpleNode jjtn000 = new SimpleNode(JJTATRIBUTO);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(abre_etiqueta);
      TIPO();
      jj_consume_token(cierra_etiqueta);
      term_id();
      jj_consume_token(abre_etiqueta);
      jj_consume_token(diagonal);
      TIPO();
      jj_consume_token(cierra_etiqueta);
    } catch (Throwable jjte000) {
     if (jjtc000) {
       jjtree.clearNodeScope(jjtn000);
       jjtc000 = false;
     } else {
       jjtree.popNode();
     }
     if (jjte000 instanceof RuntimeException) {
       {if (true) throw (RuntimeException)jjte000;}
     }
     if (jjte000 instanceof ParseException) {
       {if (true) throw (ParseException)jjte000;}
     }
     {if (true) throw (Error)jjte000;}
    } finally {
     if (jjtc000) {
       jjtree.closeNodeScope(jjtn000, true);
     }
    }
  }

  final public void parametros() throws ParseException {
                   /*@bgen(jjtree) parametros */
  SimpleNode jjtn000 = new SimpleNode(JJTPARAMETROS);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(abre_etiqueta);
      jj_consume_token(params);
      jj_consume_token(cierra_etiqueta);
      label_2:
      while (true) {
        if (jj_2_3(2)) {
          ;
        } else {
          break label_2;
        }
        Atributo();
      }
      jj_consume_token(abre_etiqueta);
      jj_consume_token(diagonal);
      jj_consume_token(cierra_etiqueta);
    } catch (Throwable jjte000) {
   if (jjtc000) {
     jjtree.clearNodeScope(jjtn000);
     jjtc000 = false;
   } else {
     jjtree.popNode();
   }
   if (jjte000 instanceof RuntimeException) {
     {if (true) throw (RuntimeException)jjte000;}
   }
   if (jjte000 instanceof ParseException) {
     {if (true) throw (ParseException)jjte000;}
   }
   {if (true) throw (Error)jjte000;}
    } finally {
   if (jjtc000) {
     jjtree.closeNodeScope(jjtn000, true);
   }
    }
  }

  final public void codigo() throws ParseException {
               /*@bgen(jjtree) codigo */
  SimpleNode jjtn000 = new SimpleNode(JJTCODIGO);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(abre_etiqueta);
      jj_consume_token(src);
      jj_consume_token(cierra_etiqueta);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CADENA:
        Ter_Cadena();
        break;
      default:
        jj_la1[2] = jj_gen;
        ;
      }
      jj_consume_token(abre_etiqueta);
      jj_consume_token(diagonal);
      jj_consume_token(src);
      jj_consume_token(cierra_etiqueta);
    } catch (Throwable jjte000) {
  if (jjtc000) {
    jjtree.clearNodeScope(jjtn000);
    jjtc000 = false;
  } else {
    jjtree.popNode();
  }
  if (jjte000 instanceof RuntimeException) {
    {if (true) throw (RuntimeException)jjte000;}
  }
  if (jjte000 instanceof ParseException) {
    {if (true) throw (ParseException)jjte000;}
  }
  {if (true) throw (Error)jjte000;}
    } finally {
  if (jjtc000) {
    jjtree.closeNodeScope(jjtn000, true);
  }
    }
  }

  final public void Procedimiento() throws ParseException {
                      /*@bgen(jjtree) Procedimiento */
  SimpleNode jjtn000 = new SimpleNode(JJTPROCEDIMIENTO);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(abre_etiqueta);
      jj_consume_token(proc);
      jj_consume_token(cierra_etiqueta);
      NombreV();
      parametros();
      codigo();
      jj_consume_token(abre_etiqueta);
      jj_consume_token(diagonal);
      jj_consume_token(proc);
      jj_consume_token(cierra_etiqueta);
    } catch (Throwable jjte000) {
  if (jjtc000) {
    jjtree.clearNodeScope(jjtn000);
    jjtc000 = false;
  } else {
    jjtree.popNode();
  }
  if (jjte000 instanceof RuntimeException) {
    {if (true) throw (RuntimeException)jjte000;}
  }
  if (jjte000 instanceof ParseException) {
    {if (true) throw (ParseException)jjte000;}
  }
  {if (true) throw (Error)jjte000;}
    } finally {
  if (jjtc000) {
    jjtree.closeNodeScope(jjtn000, true);
  }
    }
  }

  final public void funcion() throws ParseException {
                /*@bgen(jjtree) funcion */
  SimpleNode jjtn000 = new SimpleNode(JJTFUNCION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(abre_etiqueta);
      jj_consume_token(func);
      jj_consume_token(cierra_etiqueta);
      NombreV();
      jj_consume_token(abre_etiqueta);
      jj_consume_token(tip);
      jj_consume_token(cierra_etiqueta);
      TIPO();
      jj_consume_token(abre_etiqueta);
      jj_consume_token(diagonal);
      jj_consume_token(tip);
      jj_consume_token(cierra_etiqueta);
      parametros();
      codigo();
      jj_consume_token(abre_etiqueta);
      jj_consume_token(diagonal);
      jj_consume_token(func);
      jj_consume_token(cierra_etiqueta);
    } catch (Throwable jjte000) {
  if (jjtc000) {
    jjtree.clearNodeScope(jjtn000);
    jjtc000 = false;
  } else {
    jjtree.popNode();
  }
  if (jjte000 instanceof RuntimeException) {
    {if (true) throw (RuntimeException)jjte000;}
  }
  if (jjte000 instanceof ParseException) {
    {if (true) throw (ParseException)jjte000;}
  }
  {if (true) throw (Error)jjte000;}
    } finally {
  if (jjtc000) {
    jjtree.closeNodeScope(jjtn000, true);
  }
    }
  }

  final public void term_id() throws ParseException {
                  /*@bgen(jjtree) term_id */
                  SimpleNode jjtn000 = new SimpleNode(JJTTERM_ID);
                  boolean jjtc000 = true;
                  jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(id);
             jjtree.closeNodeScope(jjtn000, true);
             jjtc000 = false;
             jjtn000.setName(t.image);
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void Ter_Cadena() throws ParseException {
                            /*@bgen(jjtree) Cadena */
                            SimpleNode jjtn000 = new SimpleNode(JJTCADENA);
                            boolean jjtc000 = true;
                            jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(CADENA);
                 jjtree.closeNodeScope(jjtn000, true);
                 jjtc000 = false;
                 jjtn000.setName(t.image);
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_3_1() {
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3R_3() {
    if (jj_scan_token(abre_etiqueta)) return true;
    if (jj_scan_token(proc)) return true;
    return false;
  }

  private boolean jj_3R_12() {
    if (jj_scan_token(DATE)) return true;
    return false;
  }

  private boolean jj_3R_11() {
    if (jj_scan_token(DATETIME)) return true;
    return false;
  }

  private boolean jj_3R_10() {
    if (jj_scan_token(BOOL)) return true;
    return false;
  }

  private boolean jj_3R_9() {
    if (jj_scan_token(DOUBLE)) return true;
    return false;
  }

  private boolean jj_3R_8() {
    if (jj_scan_token(INTEGER)) return true;
    return false;
  }

  private boolean jj_3R_7() {
    if (jj_scan_token(TEXT)) return true;
    return false;
  }

  private boolean jj_3R_6() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_7()) {
    jj_scanpos = xsp;
    if (jj_3R_8()) {
    jj_scanpos = xsp;
    if (jj_3R_9()) {
    jj_scanpos = xsp;
    if (jj_3R_10()) {
    jj_scanpos = xsp;
    if (jj_3R_11()) {
    jj_scanpos = xsp;
    if (jj_3R_12()) return true;
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3_2() {
    if (jj_3R_4()) return true;
    return false;
  }

  private boolean jj_3R_5() {
    if (jj_scan_token(abre_etiqueta)) return true;
    if (jj_3R_6()) return true;
    return false;
  }

  private boolean jj_3R_4() {
    if (jj_scan_token(abre_etiqueta)) return true;
    if (jj_scan_token(func)) return true;
    return false;
  }

  private boolean jj_3_3() {
    if (jj_3R_5()) return true;
    return false;
  }

  /** Generated Token Manager. */
  public Analizador_ProcedureTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[3];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x80,0x1f8000,0x800000,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[3];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public Analizador_Procedure(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Analizador_Procedure(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new Analizador_ProcedureTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public Analizador_Procedure(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new Analizador_ProcedureTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public Analizador_Procedure(Analizador_ProcedureTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(Analizador_ProcedureTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      boolean exists = false;
      for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        exists = true;
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              exists = false;
              break;
            }
          }
          if (exists) break;
        }
      }
      if (!exists) jj_expentries.add(jj_expentry);
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[28];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 3; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 28; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 3; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
