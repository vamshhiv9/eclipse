// Generated from a1.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link a1Parser}.
 */
public interface a1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link a1Parser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull a1Parser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link a1Parser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull a1Parser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link a1Parser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(@NotNull a1Parser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link a1Parser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(@NotNull a1Parser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link a1Parser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull a1Parser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link a1Parser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull a1Parser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link a1Parser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(@NotNull a1Parser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link a1Parser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(@NotNull a1Parser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link a1Parser#lpar}.
	 * @param ctx the parse tree
	 */
	void enterLpar(@NotNull a1Parser.LparContext ctx);
	/**
	 * Exit a parse tree produced by {@link a1Parser#lpar}.
	 * @param ctx the parse tree
	 */
	void exitLpar(@NotNull a1Parser.LparContext ctx);
	/**
	 * Enter a parse tree produced by {@link a1Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull a1Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link a1Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull a1Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link a1Parser#rpar}.
	 * @param ctx the parse tree
	 */
	void enterRpar(@NotNull a1Parser.RparContext ctx);
	/**
	 * Exit a parse tree produced by {@link a1Parser#rpar}.
	 * @param ctx the parse tree
	 */
	void exitRpar(@NotNull a1Parser.RparContext ctx);
	/**
	 * Enter a parse tree produced by {@link a1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull a1Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link a1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull a1Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link a1Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull a1Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link a1Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull a1Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link a1Parser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(@NotNull a1Parser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link a1Parser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(@NotNull a1Parser.PlusContext ctx);
}