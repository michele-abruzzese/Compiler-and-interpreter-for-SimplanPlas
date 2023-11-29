package ast;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ErrorListener extends BaseErrorListener {

    /** Questa classe serve semplicemente ad intercettare gli errori sintattici e rilanciarli come RuntimeException **/

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        // Gestisci l'errore di sintassi
        throw new RuntimeException(" * ERRORE linea " + line + " posizione " + charPositionInLine + ": " + msg);
    }
}
