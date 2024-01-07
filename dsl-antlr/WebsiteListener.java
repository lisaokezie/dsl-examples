// Generated from Website.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WebsiteParser}.
 */
public interface WebsiteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WebsiteParser#website}.
	 * @param ctx the parse tree
	 */
	void enterWebsite(WebsiteParser.WebsiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebsiteParser#website}.
	 * @param ctx the parse tree
	 */
	void exitWebsite(WebsiteParser.WebsiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebsiteParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(WebsiteParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebsiteParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(WebsiteParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebsiteParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumns(WebsiteParser.ColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebsiteParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumns(WebsiteParser.ColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebsiteParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(WebsiteParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebsiteParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(WebsiteParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebsiteParser#footer}.
	 * @param ctx the parse tree
	 */
	void enterFooter(WebsiteParser.FooterContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebsiteParser#footer}.
	 * @param ctx the parse tree
	 */
	void exitFooter(WebsiteParser.FooterContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebsiteParser#navigation}.
	 * @param ctx the parse tree
	 */
	void enterNavigation(WebsiteParser.NavigationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebsiteParser#navigation}.
	 * @param ctx the parse tree
	 */
	void exitNavigation(WebsiteParser.NavigationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebsiteParser#theme}.
	 * @param ctx the parse tree
	 */
	void enterTheme(WebsiteParser.ThemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebsiteParser#theme}.
	 * @param ctx the parse tree
	 */
	void exitTheme(WebsiteParser.ThemeContext ctx);
}