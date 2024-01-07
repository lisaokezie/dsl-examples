grammar Website;

INT : [0-9]+;
HEADER_TYPE : 'none' | 'small' | 'large';
FOOTER_OPTION : 'yes' | 'no';
NAVIGATION_TYPE : 'top' | 'side';
THEME_TYPE : 'light' | 'dark';
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

website: element*;
element : columns | header | footer | navigation | theme;
columns : 'columns' INT;
header  : 'header' HEADER_TYPE;
footer  : 'footer' FOOTER_OPTION;
navigation : 'navigation' NAVIGATION_TYPE;
theme : 'theme' THEME_TYPE;
