// Output created by jacc on Thu Nov 03 23:08:05 CET 2011

package de.peeeq.wurstscript.parser;

        import de.peeeq.wurstscript.ast.*;
        import java.io.IOException;

class WurstParser implements WurstTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private int yyerrstatus = 3;
    private Object[] yysv;
    private Object yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yyerrstatus = 3;
        yyerrno = (-1);
        yysv = new Object[yyss];
        yytok = (get()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 378:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 379:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 756;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 380:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 381:
                    yyn = yys3();
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 382:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 383:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 384:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 385:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 386:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 387:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 388:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 389:
                    switch (yytok) {
                        case NATIVE:
                            yyn = 19;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 390:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 21;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 391:
                    switch (yytok) {
                        case NL:
                            yyn = 22;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 392:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 21;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 393:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 24;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 394:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 25;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 395:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 396:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 397:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 21;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 398:
                    switch (yytok) {
                        case NL:
                            yyn = 27;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 399:
                    switch (yytok) {
                        case TAKES:
                            yyn = 28;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 400:
                    switch (yytok) {
                        case NL:
                            yyn = 3;
                            continue;
                        case IDENTIFIER:
                        case CONSTANT:
                        case ENDGLOBALS:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 401:
                    switch (yytok) {
                        case NL:
                            yyn = 31;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 402:
                    switch (yytok) {
                        case LBRACK:
                            yyn = 32;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 403:
                    switch (yytok) {
                        case EXTENDS:
                            yyn = 33;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 404:
                    switch (yytok) {
                        case NL:
                            yyn = 34;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 405:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 406:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 40;
                            continue;
                        case NOTHING:
                            yyn = 41;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 407:
                    switch (yytok) {
                        case ENDGLOBALS:
                            yyn = 42;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 408:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 40;
                            continue;
                        case CONSTANT:
                            yyn = 45;
                            continue;
                        case ENDGLOBALS:
                            yyn = yyr134();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 409:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 410:
                    switch (yytok) {
                        case NL:
                            yyn = 46;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 411:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 40;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 412:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 413:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 414:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 415:
                    switch (yytok) {
                        case RETURNS:
                            yyn = 52;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 416:
                    switch (yytok) {
                        case COMMA:
                            yyn = 54;
                            continue;
                        case RETURNS:
                            yyn = yyr38();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 417:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 55;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 418:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 419:
                    switch (yytok) {
                        case RETURNS:
                            yyn = yyr143();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 420:
                    switch (yytok) {
                        case NL:
                            yyn = 57;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 421:
                    switch (yytok) {
                        case NL:
                            yyn = 3;
                            continue;
                        case IDENTIFIER:
                        case CONSTANT:
                        case ENDGLOBALS:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 422:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 59;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 423:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 40;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 424:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 425:
                    switch (yytok) {
                        case NL:
                            yyn = 63;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 426:
                    switch (yytok) {
                        case ENDFUNCTION:
                            yyn = 64;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 427:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 428:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 429:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 40;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 430:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 40;
                            continue;
                        case NOTHING:
                            yyn = 76;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 431:
                    switch (yytok) {
                        case RETURNS:
                            yyn = yyr144();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 432:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 40;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 433:
                    switch (yytok) {
                        case COMMA:
                        case RPAR:
                        case RETURNS:
                            yyn = yyr39();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 434:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 435:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 436:
                    switch (yytok) {
                        case ENDGLOBALS:
                            yyn = yyr133();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 437:
                    switch (yytok) {
                        case EQ:
                            yyn = 80;
                            continue;
                        case NL:
                            yyn = 81;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 438:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 82;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 439:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 440:
                    yyn = yys62();
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 441:
                    yyn = yys63();
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 442:
                    switch (yytok) {
                        case NL:
                            yyn = 87;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 443:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 444:
                    yyn = yys66();
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 445:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 446:
                    yyn = yys68();
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 447:
                    yyn = yys69();
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 448:
                    switch (yytok) {
                        case NL:
                            yyn = 116;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 449:
                    yyn = yys71();
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 450:
                    yyn = yys72();
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 451:
                    yyn = yys73();
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 452:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 125;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 453:
                    switch (yytok) {
                        case NL:
                            yyn = yyr141();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 454:
                    switch (yytok) {
                        case NL:
                            yyn = yyr142();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 455:
                    switch (yytok) {
                        case COMMA:
                            yyn = 54;
                            continue;
                        case RPAR:
                        case RETURNS:
                            yyn = yyr38();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 456:
                    yyn = yys78();
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 457:
                    yyn = yys79();
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 458:
                    yyn = yys80();
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 459:
                    switch (yytok) {
                        case IDENTIFIER:
                        case CONSTANT:
                        case NL:
                        case ENDGLOBALS:
                            yyn = yyr137();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 460:
                    switch (yytok) {
                        case EQ:
                            yyn = 129;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 461:
                    switch (yytok) {
                        case RBRACK:
                            yyn = 130;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 462:
                    yyn = yys84();
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 463:
                    yyn = yys85();
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 464:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 142;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 465:
                    yyn = yys87();
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 466:
                    switch (yytok) {
                        case ENDFUNCTION:
                        case ELSEIF:
                        case ELSE:
                        case ENDLOOP:
                        case ENDIF:
                            yyn = yyr149();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 467:
                    yyn = yys89();
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 468:
                    switch (yytok) {
                        case LPAR:
                            yyn = 143;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 469:
                    yyn = yys91();
                    continue;

                case 92:
                    yyst[yysp] = 92;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 470:
                    yyn = yys92();
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 471:
                    yyn = yys93();
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 472:
                    yyn = yys94();
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 473:
                    yyn = yys95();
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 474:
                    yyn = yys96();
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 475:
                    yyn = yys97();
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 476:
                    yyn = yys98();
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 477:
                    yyn = yys99();
                    continue;

                case 100:
                    yyst[yysp] = 100;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 478:
                    yyn = yys100();
                    continue;

                case 101:
                    yyst[yysp] = 101;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 479:
                    yyn = yys101();
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 480:
                    yyn = yys102();
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 481:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 162;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 482:
                    yyn = yys104();
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 483:
                    yyn = yys105();
                    continue;

                case 106:
                    yyst[yysp] = 106;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 484:
                    yyn = yys106();
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 485:
                    yyn = yys107();
                    continue;

                case 108:
                    yyst[yysp] = 108;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 486:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 167;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 109:
                    yyst[yysp] = 109;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 487:
                    yyn = yys109();
                    continue;

                case 110:
                    yyst[yysp] = 110;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 488:
                    yyn = yys110();
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 489:
                    yyn = yys111();
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 490:
                    yyn = yys112();
                    continue;

                case 113:
                    yyst[yysp] = 113;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 491:
                    yyn = yys113();
                    continue;

                case 114:
                    yyst[yysp] = 114;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 492:
                    yyn = yys114();
                    continue;

                case 115:
                    yyst[yysp] = 115;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 493:
                    yyn = yys115();
                    continue;

                case 116:
                    yyst[yysp] = 116;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 494:
                    yyn = yys116();
                    continue;

                case 117:
                    yyst[yysp] = 117;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 495:
                    yyn = yys117();
                    continue;

                case 118:
                    yyst[yysp] = 118;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 496:
                    yyn = yys118();
                    continue;

                case 119:
                    yyst[yysp] = 119;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 497:
                    yyn = yys119();
                    continue;

                case 120:
                    yyst[yysp] = 120;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 498:
                    switch (yytok) {
                        case EQ:
                            yyn = 173;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 121:
                    yyst[yysp] = 121;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 499:
                    switch (yytok) {
                        case EQ:
                            yyn = yyr71();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 122:
                    yyst[yysp] = 122;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 500:
                    yyn = yys122();
                    continue;

                case 123:
                    yyst[yysp] = 123;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 501:
                    yyn = yys123();
                    continue;

                case 124:
                    yyst[yysp] = 124;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 502:
                    yyn = yys124();
                    continue;

                case 125:
                    yyst[yysp] = 125;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 503:
                    switch (yytok) {
                        case EQ:
                            yyn = 174;
                            continue;
                        case NL:
                            yyn = 175;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 126:
                    yyst[yysp] = 126;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 504:
                    switch (yytok) {
                        case RPAR:
                        case RETURNS:
                            yyn = yyr37();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 127:
                    yyst[yysp] = 127;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 505:
                    yyn = yys127();
                    continue;

                case 128:
                    yyst[yysp] = 128;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 506:
                    yyn = yys128();
                    continue;

                case 129:
                    yyst[yysp] = 129;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 507:
                    yyn = yys129();
                    continue;

                case 130:
                    yyst[yysp] = 130;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 508:
                    yyn = yys130();
                    continue;

                case 131:
                    yyst[yysp] = 131;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 509:
                    yyn = yys131();
                    continue;

                case 132:
                    yyst[yysp] = 132;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 510:
                    yyn = yys132();
                    continue;

                case 133:
                    yyst[yysp] = 133;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 511:
                    yyn = yys133();
                    continue;

                case 134:
                    yyst[yysp] = 134;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 512:
                    yyn = yys134();
                    continue;

                case 135:
                    yyst[yysp] = 135;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 513:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 40;
                            continue;
                        case CLASS:
                            yyn = 181;
                            continue;
                        case FUNCTION:
                            yyn = 182;
                            continue;
                        case NATIVETYPE:
                            yyn = 183;
                            continue;
                        case VAL:
                            yyn = 184;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 136:
                    yyst[yysp] = 136;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 514:
                    switch (yytok) {
                        case LBRACK:
                            yyn = 185;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 137:
                    yyst[yysp] = 137;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 515:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 187;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 138:
                    yyst[yysp] = 138;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 516:
                    yyn = yys138();
                    continue;

                case 139:
                    yyst[yysp] = 139;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 517:
                    yyn = yys139();
                    continue;

                case 140:
                    yyst[yysp] = 140;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 518:
                    yyn = yys140();
                    continue;

                case 141:
                    yyst[yysp] = 141;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 519:
                    yyn = yys141();
                    continue;

                case 142:
                    yyst[yysp] = 142;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 520:
                    switch (yytok) {
                        case NL:
                            yyn = 188;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 143:
                    yyst[yysp] = 143;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 521:
                    yyn = yys143();
                    continue;

                case 144:
                    yyst[yysp] = 144;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 522:
                    yyn = yys144();
                    continue;

                case 145:
                    yyst[yysp] = 145;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 523:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 40;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 146:
                    yyst[yysp] = 146;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 524:
                    yyn = yys146();
                    continue;

                case 147:
                    yyst[yysp] = 147;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 525:
                    yyn = yys147();
                    continue;

                case 148:
                    yyst[yysp] = 148;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 526:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 195;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 149:
                    yyst[yysp] = 149;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 527:
                    yyn = yys149();
                    continue;

                case 150:
                    yyst[yysp] = 150;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 528:
                    yyn = yys150();
                    continue;

                case 151:
                    yyst[yysp] = 151;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 529:
                    yyn = yys151();
                    continue;

                case 152:
                    yyst[yysp] = 152;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 530:
                    yyn = yys152();
                    continue;

                case 153:
                    yyst[yysp] = 153;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 531:
                    yyn = yys153();
                    continue;

                case 154:
                    yyst[yysp] = 154;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 532:
                    yyn = yys154();
                    continue;

                case 155:
                    yyst[yysp] = 155;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 533:
                    yyn = yys155();
                    continue;

                case 156:
                    yyst[yysp] = 156;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 534:
                    yyn = yys156();
                    continue;

                case 157:
                    yyst[yysp] = 157;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 535:
                    yyn = yys157();
                    continue;

                case 158:
                    yyst[yysp] = 158;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 536:
                    yyn = yys158();
                    continue;

                case 159:
                    yyst[yysp] = 159;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 537:
                    yyn = yys159();
                    continue;

                case 160:
                    yyst[yysp] = 160;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 538:
                    yyn = yys160();
                    continue;

                case 161:
                    yyst[yysp] = 161;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 539:
                    yyn = yys161();
                    continue;

                case 162:
                    yyst[yysp] = 162;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 540:
                    yyn = yys162();
                    continue;

                case 163:
                    yyst[yysp] = 163;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 541:
                    yyn = yys163();
                    continue;

                case 164:
                    yyst[yysp] = 164;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 542:
                    yyn = yys164();
                    continue;

                case 165:
                    yyst[yysp] = 165;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 543:
                    yyn = yys165();
                    continue;

                case 166:
                    yyst[yysp] = 166;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 544:
                    yyn = yys166();
                    continue;

                case 167:
                    yyst[yysp] = 167;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 545:
                    switch (yytok) {
                        case LPAR:
                            yyn = 210;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 168:
                    yyst[yysp] = 168;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 546:
                    yyn = yys168();
                    continue;

                case 169:
                    yyst[yysp] = 169;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 547:
                    switch (yytok) {
                        case NL:
                            yyn = 211;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 170:
                    yyst[yysp] = 170;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 548:
                    switch (yytok) {
                        case ENDLOOP:
                            yyn = 212;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 171:
                    yyst[yysp] = 171;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 549:
                    yyn = yys171();
                    continue;

                case 172:
                    yyst[yysp] = 172;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 550:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 213;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 173:
                    yyst[yysp] = 173;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 551:
                    yyn = yys173();
                    continue;

                case 174:
                    yyst[yysp] = 174;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 552:
                    yyn = yys174();
                    continue;

                case 175:
                    yyst[yysp] = 175;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 553:
                    yyn = yys175();
                    continue;

                case 176:
                    yyst[yysp] = 176;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 554:
                    yyn = yys176();
                    continue;

                case 177:
                    yyst[yysp] = 177;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 555:
                    switch (yytok) {
                        case IDENTIFIER:
                        case CONSTANT:
                        case NL:
                        case ENDGLOBALS:
                            yyn = yyr136();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 178:
                    yyst[yysp] = 178;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 556:
                    yyn = yys178();
                    continue;

                case 179:
                    yyst[yysp] = 179;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 557:
                    switch (yytok) {
                        case RBRACK:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 180:
                    yyst[yysp] = 180;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 558:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 218;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 181:
                    yyst[yysp] = 181;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 559:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 219;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 182:
                    yyst[yysp] = 182;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 560:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 187;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 183:
                    yyst[yysp] = 183;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 561:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 221;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 184:
                    yyst[yysp] = 184;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 562:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 223;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 185:
                    yyst[yysp] = 185;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 563:
                    switch (yytok) {
                        case NL:
                            yyn = 224;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 186:
                    yyst[yysp] = 186;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 564:
                    switch (yytok) {
                        case NL:
                            yyn = 225;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 187:
                    yyst[yysp] = 187;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 565:
                    switch (yytok) {
                        case LPAR:
                            yyn = 226;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 188:
                    yyst[yysp] = 188;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 566:
                    yyn = yys188();
                    continue;

                case 189:
                    yyst[yysp] = 189;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 567:
                    switch (yytok) {
                        case RPAR:
                            yyn = 227;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 190:
                    yyst[yysp] = 190;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 568:
                    yyn = yys190();
                    continue;

                case 191:
                    yyst[yysp] = 191;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 569:
                    yyn = yys191();
                    continue;

                case 192:
                    yyst[yysp] = 192;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 570:
                    yyn = yys192();
                    continue;

                case 193:
                    yyst[yysp] = 193;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 571:
                    yyn = yys193();
                    continue;

                case 194:
                    yyst[yysp] = 194;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 572:
                    yyn = yys194();
                    continue;

                case 195:
                    yyst[yysp] = 195;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 573:
                    yyn = yys195();
                    continue;

                case 196:
                    yyst[yysp] = 196;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 574:
                    yyn = yys196();
                    continue;

                case 197:
                    yyst[yysp] = 197;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 575:
                    yyn = yys197();
                    continue;

                case 198:
                    yyst[yysp] = 198;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 576:
                    yyn = yys198();
                    continue;

                case 199:
                    yyst[yysp] = 199;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 577:
                    yyn = yys199();
                    continue;

                case 200:
                    yyst[yysp] = 200;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 578:
                    yyn = yys200();
                    continue;

                case 201:
                    yyst[yysp] = 201;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 579:
                    yyn = yys201();
                    continue;

                case 202:
                    yyst[yysp] = 202;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 580:
                    yyn = yys202();
                    continue;

                case 203:
                    yyst[yysp] = 203;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 581:
                    yyn = yys203();
                    continue;

                case 204:
                    yyst[yysp] = 204;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 582:
                    yyn = yys204();
                    continue;

                case 205:
                    yyst[yysp] = 205;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 583:
                    yyn = yys205();
                    continue;

                case 206:
                    yyst[yysp] = 206;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 584:
                    yyn = yys206();
                    continue;

                case 207:
                    yyst[yysp] = 207;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 585:
                    yyn = yys207();
                    continue;

                case 208:
                    yyst[yysp] = 208;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 586:
                    yyn = yys208();
                    continue;

                case 209:
                    yyst[yysp] = 209;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 587:
                    yyn = yys209();
                    continue;

                case 210:
                    yyst[yysp] = 210;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 588:
                    yyn = yys210();
                    continue;

                case 211:
                    yyst[yysp] = 211;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 589:
                    yyn = yys211();
                    continue;

                case 212:
                    yyst[yysp] = 212;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 590:
                    switch (yytok) {
                        case NL:
                            yyn = 234;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 213:
                    yyst[yysp] = 213;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 591:
                    yyn = yys213();
                    continue;

                case 214:
                    yyst[yysp] = 214;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 592:
                    yyn = yys214();
                    continue;

                case 215:
                    yyst[yysp] = 215;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 593:
                    yyn = yys215();
                    continue;

                case 216:
                    yyst[yysp] = 216;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 594:
                    yyn = yys216();
                    continue;

                case 217:
                    yyst[yysp] = 217;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 595:
                    switch (yytok) {
                        case IDENTIFIER:
                        case CONSTANT:
                        case NL:
                        case ENDGLOBALS:
                            yyn = yyr135();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 218:
                    yyst[yysp] = 218;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 596:
                    switch (yytok) {
                        case EQ:
                            yyn = 238;
                            continue;
                        case NL:
                            yyn = 239;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 219:
                    yyst[yysp] = 219;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 597:
                    switch (yytok) {
                        case LBRACK:
                            yyn = 240;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 220:
                    yyst[yysp] = 220;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 598:
                    switch (yytok) {
                        case LBRACK:
                            yyn = 241;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 221:
                    yyst[yysp] = 221;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 599:
                    switch (yytok) {
                        case EXTENDS:
                            yyn = 242;
                            continue;
                        case NL:
                            yyn = 243;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 222:
                    yyst[yysp] = 222;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 600:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 244;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 223:
                    yyst[yysp] = 223;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 601:
                    switch (yytok) {
                        case ARRAY:
                            yyn = 56;
                            continue;
                        case EQ:
                            yyn = 245;
                            continue;
                        case IDENTIFIER:
                            yyn = yyr40();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 224:
                    yyst[yysp] = 224;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 602:
                    yyn = yys224();
                    continue;

                case 225:
                    yyst[yysp] = 225;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 603:
                    yyn = yys225();
                    continue;

                case 226:
                    yyst[yysp] = 226;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 604:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 40;
                            continue;
                        case RPAR:
                            yyn = yyr36();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 227:
                    yyst[yysp] = 227;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 605:
                    yyn = yys227();
                    continue;

                case 228:
                    yyst[yysp] = 228;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 606:
                    switch (yytok) {
                        case RPAR:
                            yyn = yyr105();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 229:
                    yyst[yysp] = 229;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 607:
                    yyn = yys229();
                    continue;

                case 230:
                    yyst[yysp] = 230;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 608:
                    yyn = yys230();
                    continue;

                case 231:
                    yyst[yysp] = 231;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 609:
                    yyn = yys231();
                    continue;

                case 232:
                    yyst[yysp] = 232;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 610:
                    switch (yytok) {
                        case RPAR:
                            yyn = 253;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 233:
                    yyst[yysp] = 233;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 611:
                    switch (yytok) {
                        case ELSE:
                            yyn = 255;
                            continue;
                        case ELSEIF:
                            yyn = 256;
                            continue;
                        case ENDIF:
                            yyn = 257;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 234:
                    yyst[yysp] = 234;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 612:
                    yyn = yys234();
                    continue;

                case 235:
                    yyst[yysp] = 235;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 613:
                    switch (yytok) {
                        case EQ:
                            yyn = yyr89();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 236:
                    yyst[yysp] = 236;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 614:
                    yyn = yys236();
                    continue;

                case 237:
                    yyst[yysp] = 237;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 615:
                    yyn = yys237();
                    continue;

                case 238:
                    yyst[yysp] = 238;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 616:
                    yyn = yys238();
                    continue;

                case 239:
                    yyst[yysp] = 239;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 617:
                    yyn = yys239();
                    continue;

                case 240:
                    yyst[yysp] = 240;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 618:
                    switch (yytok) {
                        case NL:
                            yyn = 259;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 241:
                    yyst[yysp] = 241;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 619:
                    switch (yytok) {
                        case NL:
                            yyn = 260;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 242:
                    yyst[yysp] = 242;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 620:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 40;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 243:
                    yyst[yysp] = 243;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 621:
                    yyn = yys243();
                    continue;

                case 244:
                    yyst[yysp] = 244;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 622:
                    switch (yytok) {
                        case EQ:
                            yyn = 262;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 245:
                    yyst[yysp] = 245;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 623:
                    yyn = yys245();
                    continue;

                case 246:
                    yyst[yysp] = 246;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 624:
                    yyn = yys246();
                    continue;

                case 247:
                    yyst[yysp] = 247;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 625:
                    switch (yytok) {
                        case RBRACK:
                            yyn = 284;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 248:
                    yyst[yysp] = 248;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 626:
                    switch (yytok) {
                        case COMMA:
                            yyn = 54;
                            continue;
                        case RPAR:
                            yyn = yyr38();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 249:
                    yyst[yysp] = 249;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 627:
                    switch (yytok) {
                        case RPAR:
                            yyn = 286;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 250:
                    yyst[yysp] = 250;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 628:
                    yyn = yys250();
                    continue;

                case 251:
                    yyst[yysp] = 251;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 629:
                    switch (yytok) {
                        case RPAR:
                            yyn = 288;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 252:
                    yyst[yysp] = 252;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 630:
                    yyn = yys252();
                    continue;

                case 253:
                    yyst[yysp] = 253;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 631:
                    yyn = yys253();
                    continue;

                case 254:
                    yyst[yysp] = 254;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 632:
                    yyn = yys254();
                    continue;

                case 255:
                    yyst[yysp] = 255;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 633:
                    switch (yytok) {
                        case NL:
                            yyn = 289;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 256:
                    yyst[yysp] = 256;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 634:
                    yyn = yys256();
                    continue;

                case 257:
                    yyst[yysp] = 257;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 635:
                    switch (yytok) {
                        case NL:
                            yyn = 291;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 258:
                    yyst[yysp] = 258;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 636:
                    yyn = yys258();
                    continue;

                case 259:
                    yyst[yysp] = 259;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 637:
                    yyn = yys259();
                    continue;

                case 260:
                    yyst[yysp] = 260;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 638:
                    yyn = yys260();
                    continue;

                case 261:
                    yyst[yysp] = 261;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 639:
                    switch (yytok) {
                        case NL:
                            yyn = 296;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 262:
                    yyst[yysp] = 262;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 640:
                    yyn = yys262();
                    continue;

                case 263:
                    yyst[yysp] = 263;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 641:
                    yyn = yys263();
                    continue;

                case 264:
                    yyst[yysp] = 264;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 642:
                    switch (yytok) {
                        case EQ:
                            yyn = 299;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 265:
                    yyst[yysp] = 265;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 643:
                    yyn = yys265();
                    continue;

                case 266:
                    yyst[yysp] = 266;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 644:
                    yyn = yys266();
                    continue;

                case 267:
                    yyst[yysp] = 267;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 645:
                    yyn = yys267();
                    continue;

                case 268:
                    yyst[yysp] = 268;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 646:
                    yyn = yys268();
                    continue;

                case 269:
                    yyst[yysp] = 269;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 647:
                    yyn = yys269();
                    continue;

                case 270:
                    yyst[yysp] = 270;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 648:
                    yyn = yys270();
                    continue;

                case 271:
                    yyst[yysp] = 271;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 649:
                    yyn = yys271();
                    continue;

                case 272:
                    yyst[yysp] = 272;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 650:
                    yyn = yys272();
                    continue;

                case 273:
                    yyst[yysp] = 273;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 651:
                    yyn = yys273();
                    continue;

                case 274:
                    yyst[yysp] = 274;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 652:
                    yyn = yys274();
                    continue;

                case 275:
                    yyst[yysp] = 275;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 653:
                    yyn = yys275();
                    continue;

                case 276:
                    yyst[yysp] = 276;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 654:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 304;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 277:
                    yyst[yysp] = 277;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 655:
                    yyn = yys277();
                    continue;

                case 278:
                    yyst[yysp] = 278;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 656:
                    yyn = yys278();
                    continue;

                case 279:
                    yyst[yysp] = 279;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 657:
                    yyn = yys279();
                    continue;

                case 280:
                    yyst[yysp] = 280;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 658:
                    yyn = yys280();
                    continue;

                case 281:
                    yyst[yysp] = 281;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 659:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 309;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 282:
                    yyst[yysp] = 282;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 660:
                    yyn = yys282();
                    continue;

                case 283:
                    yyst[yysp] = 283;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 661:
                    switch (yytok) {
                        case NL:
                            yyn = 311;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 284:
                    yyst[yysp] = 284;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 662:
                    switch (yytok) {
                        case NL:
                            yyn = 312;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 285:
                    yyst[yysp] = 285;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 663:
                    switch (yytok) {
                        case RPAR:
                            yyn = yyr35();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 286:
                    yyst[yysp] = 286;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 664:
                    switch (yytok) {
                        case RETURNS:
                            yyn = 313;
                            continue;
                        case NL:
                        case LBRACK:
                            yyn = yyr34();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 287:
                    yyst[yysp] = 287;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 665:
                    switch (yytok) {
                        case RPAR:
                            yyn = yyr107();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 288:
                    yyst[yysp] = 288;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 666:
                    yyn = yys288();
                    continue;

                case 289:
                    yyst[yysp] = 289;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 667:
                    yyn = yys289();
                    continue;

                case 290:
                    yyst[yysp] = 290;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 668:
                    yyn = yys290();
                    continue;

                case 291:
                    yyst[yysp] = 291;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 669:
                    yyn = yys291();
                    continue;

                case 292:
                    yyst[yysp] = 292;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 670:
                    yyn = yys292();
                    continue;

                case 293:
                    yyst[yysp] = 293;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 671:
                    switch (yytok) {
                        case RBRACK:
                            yyn = 316;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 294:
                    yyst[yysp] = 294;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 672:
                    yyn = yys294();
                    continue;

                case 295:
                    yyst[yysp] = 295;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 673:
                    switch (yytok) {
                        case RBRACK:
                            yyn = 322;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 296:
                    yyst[yysp] = 296;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 674:
                    yyn = yys296();
                    continue;

                case 297:
                    yyst[yysp] = 297;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 675:
                    yyn = yys297();
                    continue;

                case 298:
                    yyst[yysp] = 298;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 676:
                    yyn = yys298();
                    continue;

                case 299:
                    yyst[yysp] = 299;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 677:
                    yyn = yys299();
                    continue;

                case 300:
                    yyst[yysp] = 300;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 678:
                    yyn = yys300();
                    continue;

                case 301:
                    yyst[yysp] = 301;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 679:
                    yyn = yys301();
                    continue;

                case 302:
                    yyst[yysp] = 302;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 680:
                    yyn = yys302();
                    continue;

                case 303:
                    yyst[yysp] = 303;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 681:
                    switch (yytok) {
                        case RBRACK:
                            yyn = yyr48();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 304:
                    yyst[yysp] = 304;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 682:
                    switch (yytok) {
                        case EQ:
                            yyn = 325;
                            continue;
                        case NL:
                            yyn = 326;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 305:
                    yyst[yysp] = 305;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 683:
                    yyn = yys305();
                    continue;

                case 306:
                    yyst[yysp] = 306;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 684:
                    yyn = yys306();
                    continue;

                case 307:
                    yyst[yysp] = 307;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 685:
                    yyn = yys307();
                    continue;

                case 308:
                    yyst[yysp] = 308;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 686:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 330;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 309:
                    yyst[yysp] = 309;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 687:
                    switch (yytok) {
                        case ARRAY:
                            yyn = 56;
                            continue;
                        case EQ:
                            yyn = 331;
                            continue;
                        case IDENTIFIER:
                            yyn = yyr40();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 310:
                    yyst[yysp] = 310;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 688:
                    yyn = yys310();
                    continue;

                case 311:
                    yyst[yysp] = 311;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 689:
                    yyn = yys311();
                    continue;

                case 312:
                    yyst[yysp] = 312;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 690:
                    yyn = yys312();
                    continue;

                case 313:
                    yyst[yysp] = 313;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 691:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 40;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 314:
                    yyst[yysp] = 314;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 692:
                    switch (yytok) {
                        case ENDIF:
                            yyn = 334;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 315:
                    yyst[yysp] = 315;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 693:
                    switch (yytok) {
                        case NL:
                            yyn = 335;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 316:
                    yyst[yysp] = 316;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 694:
                    switch (yytok) {
                        case NL:
                            yyn = 336;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 317:
                    yyst[yysp] = 317;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 695:
                    yyn = yys317();
                    continue;

                case 318:
                    yyst[yysp] = 318;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 696:
                    yyn = yys318();
                    continue;

                case 319:
                    yyst[yysp] = 319;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 697:
                    yyn = yys319();
                    continue;

                case 320:
                    yyst[yysp] = 320;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 698:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 40;
                            continue;
                        case FUNCTION:
                            yyn = 182;
                            continue;
                        case VAL:
                            yyn = 184;
                            continue;
                        case CONSTRUCT:
                            yyn = 338;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 321:
                    yyst[yysp] = 321;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 699:
                    switch (yytok) {
                        case LBRACK:
                            yyn = 339;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 322:
                    yyst[yysp] = 322;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 700:
                    yyn = yys322();
                    continue;

                case 323:
                    yyst[yysp] = 323;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 701:
                    yyn = yys323();
                    continue;

                case 324:
                    yyst[yysp] = 324;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 702:
                    yyn = yys324();
                    continue;

                case 325:
                    yyst[yysp] = 325;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 703:
                    yyn = yys325();
                    continue;

                case 326:
                    yyst[yysp] = 326;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 704:
                    yyn = yys326();
                    continue;

                case 327:
                    yyst[yysp] = 327;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 705:
                    yyn = yys327();
                    continue;

                case 328:
                    yyst[yysp] = 328;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 706:
                    switch (yytok) {
                        case NL:
                            yyn = 342;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 329:
                    yyst[yysp] = 329;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 707:
                    yyn = yys329();
                    continue;

                case 330:
                    yyst[yysp] = 330;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 708:
                    switch (yytok) {
                        case EQ:
                            yyn = 343;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 331:
                    yyst[yysp] = 331;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 709:
                    yyn = yys331();
                    continue;

                case 332:
                    yyst[yysp] = 332;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 710:
                    switch (yytok) {
                        case NL:
                            yyn = 345;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 333:
                    yyst[yysp] = 333;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 711:
                    switch (yytok) {
                        case NL:
                        case LBRACK:
                            yyn = yyr33();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 334:
                    yyst[yysp] = 334;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 712:
                    switch (yytok) {
                        case NL:
                            yyn = 346;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 335:
                    yyst[yysp] = 335;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 713:
                    yyn = yys335();
                    continue;

                case 336:
                    yyst[yysp] = 336;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 714:
                    yyn = yys336();
                    continue;

                case 337:
                    yyst[yysp] = 337;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 715:
                    switch (yytok) {
                        case RBRACK:
                            yyn = yyr26();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 338:
                    yyst[yysp] = 338;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 716:
                    switch (yytok) {
                        case LPAR:
                            yyn = 348;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 339:
                    yyst[yysp] = 339;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 717:
                    switch (yytok) {
                        case NL:
                            yyn = 349;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 340:
                    yyst[yysp] = 340;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 718:
                    yyn = yys340();
                    continue;

                case 341:
                    yyst[yysp] = 341;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 719:
                    yyn = yys341();
                    continue;

                case 342:
                    yyst[yysp] = 342;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 720:
                    yyn = yys342();
                    continue;

                case 343:
                    yyst[yysp] = 343;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 721:
                    yyn = yys343();
                    continue;

                case 344:
                    yyst[yysp] = 344;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 722:
                    yyn = yys344();
                    continue;

                case 345:
                    yyst[yysp] = 345;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 723:
                    yyn = yys345();
                    continue;

                case 346:
                    yyst[yysp] = 346;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 724:
                    yyn = yys346();
                    continue;

                case 347:
                    yyst[yysp] = 347;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 725:
                    switch (yytok) {
                        case ELSE:
                            yyn = 255;
                            continue;
                        case ELSEIF:
                            yyn = 256;
                            continue;
                        case ENDIF:
                            yyn = 257;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 348:
                    yyst[yysp] = 348;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 726:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 40;
                            continue;
                        case RPAR:
                            yyn = yyr36();
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 349:
                    yyst[yysp] = 349;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 727:
                    yyn = yys349();
                    continue;

                case 350:
                    yyst[yysp] = 350;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 728:
                    yyn = yys350();
                    continue;

                case 351:
                    yyst[yysp] = 351;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 729:
                    switch (yytok) {
                        case RBRACK:
                            yyn = 358;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 352:
                    yyst[yysp] = 352;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 730:
                    yyn = yys352();
                    continue;

                case 353:
                    yyst[yysp] = 353;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 731:
                    yyn = yys353();
                    continue;

                case 354:
                    yyst[yysp] = 354;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 732:
                    switch (yytok) {
                        case RBRACK:
                            yyn = 360;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 355:
                    yyst[yysp] = 355;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 733:
                    yyn = yys355();
                    continue;

                case 356:
                    yyst[yysp] = 356;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 734:
                    switch (yytok) {
                        case RPAR:
                            yyn = 361;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 357:
                    yyst[yysp] = 357;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 735:
                    switch (yytok) {
                        case RBRACK:
                            yyn = 362;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 358:
                    yyst[yysp] = 358;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 736:
                    switch (yytok) {
                        case ELSE:
                            yyn = 363;
                            continue;
                        case NL:
                            yyn = 364;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 359:
                    yyst[yysp] = 359;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 737:
                    yyn = yys359();
                    continue;

                case 360:
                    yyst[yysp] = 360;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 738:
                    switch (yytok) {
                        case NL:
                            yyn = 365;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 361:
                    yyst[yysp] = 361;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 739:
                    switch (yytok) {
                        case LBRACK:
                            yyn = 366;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 362:
                    yyst[yysp] = 362;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 740:
                    switch (yytok) {
                        case NL:
                            yyn = 367;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 363:
                    yyst[yysp] = 363;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 741:
                    switch (yytok) {
                        case IF:
                            yyn = 279;
                            continue;
                        case LBRACK:
                            yyn = 370;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 364:
                    yyst[yysp] = 364;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 742:
                    yyn = yys364();
                    continue;

                case 365:
                    yyst[yysp] = 365;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 743:
                    yyn = yys365();
                    continue;

                case 366:
                    yyst[yysp] = 366;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 744:
                    switch (yytok) {
                        case NL:
                            yyn = 371;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 367:
                    yyst[yysp] = 367;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 745:
                    yyn = yys367();
                    continue;

                case 368:
                    yyst[yysp] = 368;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 746:
                    yyn = yys368();
                    continue;

                case 369:
                    yyst[yysp] = 369;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 747:
                    yyn = yys369();
                    continue;

                case 370:
                    yyst[yysp] = 370;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 748:
                    yyn = yys370();
                    continue;

                case 371:
                    yyst[yysp] = 371;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 749:
                    yyn = yys371();
                    continue;

                case 372:
                    yyst[yysp] = 372;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 750:
                    switch (yytok) {
                        case RBRACK:
                            yyn = 374;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 373:
                    yyst[yysp] = 373;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 751:
                    switch (yytok) {
                        case RBRACK:
                            yyn = 375;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 374:
                    yyst[yysp] = 374;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 752:
                    switch (yytok) {
                        case NL:
                            yyn = 376;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 375:
                    yyst[yysp] = 375;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 753:
                    switch (yytok) {
                        case NL:
                            yyn = 377;
                            continue;
                    }
                    yyn = 759;
                    continue;

                case 376:
                    yyst[yysp] = 376;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 754:
                    yyn = yys376();
                    continue;

                case 377:
                    yyst[yysp] = 377;
                    yysv[yysp] = (getValue()
                                 );
                    yytok = (yylex()
                            );
                    yyerrstatus++;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 755:
                    yyn = yys377();
                    continue;

                case 756:
                    return true;
                case 757:
                    yyerror("stack overflow");
                case 758:
                    return false;
                case 759:
                    if (yyerrstatus>2) {
                        yyerror("syntax error");
                    }
                case 760 :
                    if (yyerrstatus==0) {
                        if ((get()
                             )==ENDINPUT) {
                            return false;
                        }
                        yylex()
                        ;
                        yyn = 378 + yyst[yysp-1];
                        continue;
                    } else {
                        yyerrstatus = 0;
                        while (yysp>0) {
                            switch(yyst[yysp-1]) {
                                case 246:
                                    yyn = 283;
                                    continue loop;
                            }
                            yysp--;
                        }
                        return false;
                    }
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        Object[] newyysv = new Object[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    public void yyerrok() {
        yyerrstatus = 3;
        yyerrno     = (-1);
    }

    public void yyclearin() {
        yytok = (yylex()
                );
    }

    private int yys0() {
        switch (yytok) {
            case RPAR:
                return yyerr(0, 759);
            case LPAR:
                return yyerr(1, 759);
            case NL:
                return 3;
            case PACKAGE:
            case CONSTANT:
            case GLOBALS:
            case FUNCTION:
            case NATIVE:
            case ENDINPUT:
            case TYPE:
                return yyr2();
        }
        return 759;
    }

    private int yys2() {
        switch (yytok) {
            case CONSTANT:
                return 11;
            case FUNCTION:
                return 12;
            case GLOBALS:
                return 13;
            case NATIVE:
                return 14;
            case PACKAGE:
                return 15;
            case TYPE:
                return 16;
            case ENDINPUT:
                return yyr5();
        }
        return 759;
    }

    private int yys3() {
        switch (yytok) {
            case NOTHING:
            case LBRACK:
            case CASTTO:
            case GT:
            case STATIC:
            case RSQUARE:
            case INTERFACE:
            case ARRAY:
            case PLUS:
            case OR:
            case MOD_REAL:
            case MULT:
            case LTEQ:
            case RPAR:
            case LSQUARE:
            case TAKES:
            case UMINUS:
            case RETURNS:
            case IMPLEMENTS:
            case PROTECTED:
            case DIV_REAL:
            case GTEQ:
            case NOTEQ:
            case COMMA:
            case DOT:
            case EXTENDS:
            case MOD_INT:
            case EQEQ:
            case LT:
            case DIV_INT:
            case AND:
            case EQ:
            case EOF:
            case THEN:
                return 759;
            case NL:
                return 3;
        }
        return yyr2();
    }

    private int yys4() {
        switch (yytok) {
            case PACKAGE:
            case CONSTANT:
            case GLOBALS:
            case NL:
            case FUNCTION:
            case NATIVE:
            case ENDINPUT:
            case TYPE:
                return yyr128();
        }
        return 759;
    }

    private int yys5() {
        switch (yytok) {
            case PACKAGE:
            case CONSTANT:
            case GLOBALS:
            case NL:
            case FUNCTION:
            case NATIVE:
            case ENDINPUT:
            case TYPE:
                return yyr127();
        }
        return 759;
    }

    private int yys6() {
        switch (yytok) {
            case PACKAGE:
            case CONSTANT:
            case GLOBALS:
            case NL:
            case FUNCTION:
            case NATIVE:
            case ENDINPUT:
            case TYPE:
                return yyr130();
        }
        return 759;
    }

    private int yys7() {
        switch (yytok) {
            case PACKAGE:
            case CONSTANT:
            case GLOBALS:
            case NL:
            case FUNCTION:
            case NATIVE:
            case ENDINPUT:
            case TYPE:
                return yyr7();
        }
        return 759;
    }

    private int yys8() {
        switch (yytok) {
            case PACKAGE:
            case CONSTANT:
            case GLOBALS:
            case NL:
            case FUNCTION:
            case NATIVE:
            case ENDINPUT:
            case TYPE:
                return yyr129();
        }
        return 759;
    }

    private int yys9() {
        switch (yytok) {
            case PACKAGE:
            case CONSTANT:
            case GLOBALS:
            case NL:
            case FUNCTION:
            case NATIVE:
            case ENDINPUT:
            case TYPE:
                return yyr6();
        }
        return 759;
    }

    private int yys10() {
        switch (yytok) {
            case NL:
                return 3;
            case PACKAGE:
            case CONSTANT:
            case GLOBALS:
            case FUNCTION:
            case NATIVE:
            case ENDINPUT:
            case TYPE:
                return yyr2();
        }
        return 759;
    }

    private int yys17() {
        switch (yytok) {
            case NOTHING:
            case LBRACK:
            case CASTTO:
            case GT:
            case MOD_INT:
            case STATIC:
            case INTERFACE:
            case ARRAY:
            case PLUS:
            case OR:
            case DOT:
            case MOD_REAL:
            case LT:
            case RSQUARE:
            case LSQUARE:
            case TAKES:
            case UMINUS:
            case RETURNS:
            case IMPLEMENTS:
            case PROTECTED:
            case DIV_REAL:
            case GTEQ:
            case NOTEQ:
            case COMMA:
            case EXTENDS:
            case MULT:
            case EQEQ:
            case LTEQ:
            case DIV_INT:
            case RPAR:
            case AND:
            case EQ:
            case EOF:
            case THEN:
                return 759;
        }
        return yyr1();
    }

    private int yys27() {
        switch (yytok) {
            case NL:
                return 3;
            case IF:
            case ENDFUNCTION:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case LOCAL:
            case SET:
            case RETURN:
                return yyr2();
        }
        return 759;
    }

    private int yys31() {
        switch (yytok) {
            case PACKAGE:
            case CONSTANT:
            case GLOBALS:
            case NL:
            case FUNCTION:
            case NATIVE:
            case ENDINPUT:
            case TYPE:
                return yyr138();
        }
        return 759;
    }

    private int yys34() {
        switch (yytok) {
            case PACKAGE:
            case CONSTANT:
            case GLOBALS:
            case NL:
            case FUNCTION:
            case NATIVE:
            case ENDINPUT:
            case TYPE:
                return yyr139();
        }
        return 759;
    }

    private int yys35() {
        switch (yytok) {
            case NL:
                return 3;
            case IF:
            case ENDFUNCTION:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case SET:
            case RETURN:
                return yyr2();
        }
        return 759;
    }

    private int yys36() {
        switch (yytok) {
            case LOCAL:
                return 51;
            case IF:
            case ENDFUNCTION:
            case NL:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case SET:
            case RETURN:
                return yyr146();
        }
        return 759;
    }

    private int yys40() {
        switch (yytok) {
            case ARRAY:
                return 56;
            case PLUS:
            case IDENTIFIER:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr40();
        }
        return 759;
    }

    private int yys46() {
        switch (yytok) {
            case NL:
                return 3;
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
            case IMPORT:
                return yyr2();
        }
        return 759;
    }

    private int yys49() {
        switch (yytok) {
            case CALL:
                return 67;
            case EXITWHEN:
                return 68;
            case IF:
                return 69;
            case LOOP:
                return 70;
            case RETURN:
                return 71;
            case SET:
                return 72;
            case ENDFUNCTION:
            case ELSEIF:
            case ELSE:
            case ENDLOOP:
            case ENDIF:
                return yyr150();
        }
        return 759;
    }

    private int yys50() {
        switch (yytok) {
            case NL:
                return 3;
            case IF:
            case ENDFUNCTION:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case LOCAL:
            case SET:
            case RETURN:
                return yyr2();
        }
        return 759;
    }

    private int yys56() {
        switch (yytok) {
            case LSQUARE:
                return 79;
            case PLUS:
            case IDENTIFIER:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr43();
        }
        return 759;
    }

    private int yys57() {
        switch (yytok) {
            case PACKAGE:
            case CONSTANT:
            case GLOBALS:
            case NL:
            case FUNCTION:
            case NATIVE:
            case ENDINPUT:
            case TYPE:
                return yyr132();
        }
        return 759;
    }

    private int yys61() {
        switch (yytok) {
            case NL:
                return 3;
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
                return yyr2();
        }
        return 759;
    }

    private int yys62() {
        switch (yytok) {
            case IMPORT:
                return 86;
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case NL:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
                return yyr14();
        }
        return 759;
    }

    private int yys63() {
        switch (yytok) {
            case PACKAGE:
            case CONSTANT:
            case GLOBALS:
            case NL:
            case FUNCTION:
            case NATIVE:
            case ENDINPUT:
            case TYPE:
                return yyr131();
        }
        return 759;
    }

    private int yys65() {
        switch (yytok) {
            case NL:
                return 3;
            case IF:
            case ENDFUNCTION:
            case ELSEIF:
            case ELSE:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case ENDLOOP:
            case SET:
            case ENDIF:
            case RETURN:
                return yyr2();
        }
        return 759;
    }

    private int yys66() {
        switch (yytok) {
            case IF:
            case ENDFUNCTION:
            case ELSEIF:
            case ELSE:
            case NL:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case ENDLOOP:
            case SET:
            case ENDIF:
            case RETURN:
                return yyr151();
        }
        return 759;
    }

    private int yys68() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys69() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys71() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
            case NL:
                return 118;
        }
        return 759;
    }

    private int yys72() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys73() {
        switch (yytok) {
            case IF:
            case ENDFUNCTION:
            case NL:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case SET:
            case RETURN:
                return yyr145();
        }
        return 759;
    }

    private int yys78() {
        switch (yytok) {
            case PLUS:
            case IDENTIFIER:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr41();
        }
        return 759;
    }

    private int yys79() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys80() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys84() {
        switch (yytok) {
            case INIT:
                return 136;
            case NATIVE:
                return 137;
            case PRIVATE:
                return 138;
            case PUBLIC:
                return 139;
            case PUBLICREAD:
                return 140;
            case RBRACK:
                return yyr17();
            case IDENTIFIER:
            case FUNCTION:
            case NATIVETYPE:
            case CLASS:
            case VAL:
                return yyr11();
        }
        return 759;
    }

    private int yys85() {
        switch (yytok) {
            case NL:
                return 3;
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
            case IMPORT:
                return yyr2();
        }
        return 759;
    }

    private int yys87() {
        switch (yytok) {
            case PACKAGE:
            case CONSTANT:
            case GLOBALS:
            case NL:
            case FUNCTION:
            case NATIVE:
            case ENDINPUT:
            case TYPE:
                return yyr140();
        }
        return 759;
    }

    private int yys89() {
        switch (yytok) {
            case IF:
            case ENDFUNCTION:
            case ELSEIF:
            case ELSE:
            case NL:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case ENDLOOP:
            case SET:
            case ENDIF:
            case RETURN:
                return yyr157();
        }
        return 759;
    }

    private int yys91() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NL:
                return 158;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
        }
        return 759;
    }

    private int yys92() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr85();
        }
        return 759;
    }

    private int yys93() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr79();
        }
        return 759;
    }

    private int yys94() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr86();
        }
        return 759;
    }

    private int yys95() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr83();
        }
        return 759;
    }

    private int yys96() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr82();
        }
        return 759;
    }

    private int yys97() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr81();
        }
        return 759;
    }

    private int yys98() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr84();
        }
        return 759;
    }

    private int yys99() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr80();
        }
        return 759;
    }

    private int yys100() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr100();
        }
        return 759;
    }

    private int yys101() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr101();
        }
        return 759;
    }

    private int yys102() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr96();
        }
        return 759;
    }

    private int yys104() {
        switch (yytok) {
            case LPAR:
                return 143;
            case LSQUARE:
                return 164;
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case EQ:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr74();
        }
        return 759;
    }

    private int yys105() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr91();
        }
        return 759;
    }

    private int yys106() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys107() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys109() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys110() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr92();
        }
        return 759;
    }

    private int yys111() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr99();
        }
        return 759;
    }

    private int yys112() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr93();
        }
        return 759;
    }

    private int yys113() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr97();
        }
        return 759;
    }

    private int yys114() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr95();
        }
        return 759;
    }

    private int yys115() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case THEN:
                return 169;
        }
        return 759;
    }

    private int yys116() {
        switch (yytok) {
            case NL:
                return 3;
            case IF:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case ENDLOOP:
            case SET:
            case RETURN:
                return yyr2();
        }
        return 759;
    }

    private int yys117() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case NL:
                return 171;
        }
        return 759;
    }

    private int yys118() {
        switch (yytok) {
            case IF:
            case ENDFUNCTION:
            case ELSEIF:
            case ELSE:
            case NL:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case ENDLOOP:
            case SET:
            case ENDIF:
            case RETURN:
                return yyr154();
        }
        return 759;
    }

    private int yys119() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case DOT:
                return 172;
        }
        return 759;
    }

    private int yys122() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case DOT:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case CASTTO:
            case AND:
                return yyr81();
            case EQ:
                return yyr70();
        }
        return 759;
    }

    private int yys123() {
        switch (yytok) {
            case EQ:
                return yyr72();
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case DOT:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case CASTTO:
            case AND:
                return yyr100();
        }
        return 759;
    }

    private int yys124() {
        switch (yytok) {
            case EQ:
                return yyr73();
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case DOT:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case CASTTO:
            case AND:
                return yyr101();
        }
        return 759;
    }

    private int yys127() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case RSQUARE:
                return 176;
        }
        return 759;
    }

    private int yys128() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case NL:
                return 177;
        }
        return 759;
    }

    private int yys129() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys130() {
        switch (yytok) {
            case PACKAGE:
            case CONSTANT:
            case GLOBALS:
            case NL:
            case FUNCTION:
            case NATIVE:
            case ENDINPUT:
            case TYPE:
                return yyr12();
        }
        return 759;
    }

    private int yys131() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case NL:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
                return yyr24();
        }
        return 759;
    }

    private int yys132() {
        switch (yytok) {
            case NL:
                return 3;
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
                return yyr2();
        }
        return 759;
    }

    private int yys133() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case NL:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
                return yyr20();
        }
        return 759;
    }

    private int yys134() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case NL:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
                return yyr21();
        }
        return 759;
    }

    private int yys138() {
        switch (yytok) {
            case IDENTIFIER:
            case FUNCTION:
            case NATIVETYPE:
            case CLASS:
            case VAL:
            case CONSTRUCT:
                return yyr9();
        }
        return 759;
    }

    private int yys139() {
        switch (yytok) {
            case IDENTIFIER:
            case FUNCTION:
            case NATIVETYPE:
            case CLASS:
            case VAL:
            case CONSTRUCT:
                return yyr8();
        }
        return 759;
    }

    private int yys140() {
        switch (yytok) {
            case IDENTIFIER:
            case FUNCTION:
            case NATIVETYPE:
            case CLASS:
            case VAL:
            case CONSTRUCT:
                return yyr10();
        }
        return 759;
    }

    private int yys141() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case NL:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
                return yyr13();
        }
        return 759;
    }

    private int yys143() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
            case RPAR:
                return yyr106();
        }
        return 759;
    }

    private int yys144() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys146() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys147() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys149() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys150() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys151() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys152() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys153() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys154() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys155() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys156() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys157() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys158() {
        switch (yytok) {
            case IF:
            case ENDFUNCTION:
            case ELSEIF:
            case ELSE:
            case NL:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case ENDLOOP:
            case SET:
            case ENDIF:
            case RETURN:
                return yyr153();
        }
        return 759;
    }

    private int yys159() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys160() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys161() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys162() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr98();
        }
        return 759;
    }

    private int yys163() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case EQ:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr75();
        }
        return 759;
    }

    private int yys164() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys165() {
        switch (yytok) {
            case NL:
                return yyerr(2, 759);
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case RPAR:
                return 209;
        }
        return 759;
    }

    private int yys166() {
        switch (yytok) {
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case COMMA:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case AND:
                return yyr125();
        }
        return 759;
    }

    private int yys168() {
        switch (yytok) {
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case PLUS:
                return 161;
            case OR:
            case NL:
            case COMMA:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case AND:
                return yyr124();
        }
        return 759;
    }

    private int yys171() {
        switch (yytok) {
            case IF:
            case ENDFUNCTION:
            case ELSEIF:
            case ELSE:
            case NL:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case ENDLOOP:
            case SET:
            case ENDIF:
            case RETURN:
                return yyr155();
        }
        return 759;
    }

    private int yys173() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys174() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys175() {
        switch (yytok) {
            case IF:
            case ENDFUNCTION:
            case NL:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case LOCAL:
            case SET:
            case RETURN:
                return yyr148();
        }
        return 759;
    }

    private int yys176() {
        switch (yytok) {
            case LSQUARE:
                return 79;
            case PLUS:
            case IDENTIFIER:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr43();
        }
        return 759;
    }

    private int yys178() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case NL:
                return 217;
        }
        return 759;
    }

    private int yys188() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case NL:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
            case IMPORT:
                return yyr15();
        }
        return 759;
    }

    private int yys190() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case COMMA:
                return 229;
            case RPAR:
                return yyr108();
        }
        return 759;
    }

    private int yys191() {
        switch (yytok) {
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case PLUS:
                return 161;
            case OR:
            case NL:
            case COMMA:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case AND:
                return yyr110();
        }
        return 759;
    }

    private int yys192() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr87();
        }
        return 759;
    }

    private int yys193() {
        switch (yytok) {
            case CASTTO:
                return 145;
            case DOT:
                return 148;
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case AND:
                return yyr115();
        }
        return 759;
    }

    private int yys194() {
        switch (yytok) {
            case CASTTO:
                return 145;
            case DOT:
                return 148;
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case AND:
                return yyr114();
        }
        return 759;
    }

    private int yys195() {
        switch (yytok) {
            case LPAR:
                return 230;
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr88();
        }
        return 759;
    }

    private int yys196() {
        switch (yytok) {
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case PLUS:
                return 161;
            case OR:
            case NL:
            case COMMA:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case AND:
                return yyr118();
        }
        return 759;
    }

    private int yys197() {
        switch (yytok) {
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case PLUS:
                return 161;
            case OR:
            case NL:
            case COMMA:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case AND:
                return yyr122();
        }
        return 759;
    }

    private int yys198() {
        switch (yytok) {
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case PLUS:
                return 161;
            case OR:
            case NL:
            case COMMA:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case AND:
                return yyr119();
        }
        return 759;
    }

    private int yys199() {
        switch (yytok) {
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case PLUS:
                return 161;
            case OR:
            case NL:
            case COMMA:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case AND:
                return yyr121();
        }
        return 759;
    }

    private int yys200() {
        switch (yytok) {
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case PLUS:
                return 161;
            case OR:
            case NL:
            case COMMA:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case AND:
                return yyr120();
        }
        return 759;
    }

    private int yys201() {
        switch (yytok) {
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case COMMA:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case AND:
                return yyr112();
        }
        return 759;
    }

    private int yys202() {
        switch (yytok) {
            case CASTTO:
                return 145;
            case DOT:
                return 148;
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case AND:
                return yyr117();
        }
        return 759;
    }

    private int yys203() {
        switch (yytok) {
            case CASTTO:
                return 145;
            case DOT:
                return 148;
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case AND:
                return yyr116();
        }
        return 759;
    }

    private int yys204() {
        switch (yytok) {
            case CASTTO:
                return 145;
            case DOT:
                return 148;
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case AND:
                return yyr113();
        }
        return 759;
    }

    private int yys205() {
        switch (yytok) {
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case PLUS:
                return 161;
            case OR:
            case NL:
            case COMMA:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case AND:
                return yyr123();
        }
        return 759;
    }

    private int yys206() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case PLUS:
                return 161;
            case OR:
            case NL:
            case COMMA:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
                return yyr109();
        }
        return 759;
    }

    private int yys207() {
        switch (yytok) {
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case COMMA:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case AND:
                return yyr111();
        }
        return 759;
    }

    private int yys208() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case RSQUARE:
                return 231;
        }
        return 759;
    }

    private int yys209() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr94();
        }
        return 759;
    }

    private int yys210() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
            case RPAR:
                return yyr106();
        }
        return 759;
    }

    private int yys211() {
        switch (yytok) {
            case NL:
                return 3;
            case IF:
            case ELSEIF:
            case ELSE:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case SET:
            case ENDIF:
            case RETURN:
                return yyr2();
        }
        return 759;
    }

    private int yys213() {
        switch (yytok) {
            case LSQUARE:
                return 164;
            case LPAR:
                return 230;
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case DOT:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case EQ:
            case DIV_INT:
            case CASTTO:
            case AND:
                return yyr88();
        }
        return 759;
    }

    private int yys214() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case NL:
                return 236;
        }
        return 759;
    }

    private int yys215() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case NL:
                return 237;
        }
        return 759;
    }

    private int yys216() {
        switch (yytok) {
            case PLUS:
            case IDENTIFIER:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr42();
        }
        return 759;
    }

    private int yys224() {
        switch (yytok) {
            case NL:
                return 3;
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr2();
        }
        return 759;
    }

    private int yys225() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case NL:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
                return yyr23();
        }
        return 759;
    }

    private int yys227() {
        switch (yytok) {
            case IF:
            case ENDFUNCTION:
            case PLUS:
            case OR:
            case GTEQ:
            case ELSEIF:
            case GT:
            case NOTEQ:
            case ELSE:
            case NL:
            case DOT:
            case COMMA:
            case CALL:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case EXITWHEN:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case LOOP:
            case THEN:
            case LBRACK:
            case ENDLOOP:
            case SET:
            case RSQUARE:
            case ENDIF:
            case RPAR:
            case RETURN:
            case CASTTO:
            case AND:
                return yyr126();
        }
        return 759;
    }

    private int yys229() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys230() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
            case RPAR:
                return yyr106();
        }
        return 759;
    }

    private int yys231() {
        switch (yytok) {
            case LSQUARE:
                return 164;
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case EQ:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr104();
        }
        return 759;
    }

    private int yys234() {
        switch (yytok) {
            case IF:
            case ENDFUNCTION:
            case ELSEIF:
            case ELSE:
            case NL:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case ENDLOOP:
            case SET:
            case ENDIF:
            case RETURN:
                return yyr152();
        }
        return 759;
    }

    private int yys236() {
        switch (yytok) {
            case IF:
            case ENDFUNCTION:
            case ELSEIF:
            case ELSE:
            case NL:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case ENDLOOP:
            case SET:
            case ENDIF:
            case RETURN:
                return yyr156();
        }
        return 759;
    }

    private int yys237() {
        switch (yytok) {
            case IF:
            case ENDFUNCTION:
            case NL:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case LOCAL:
            case SET:
            case RETURN:
                return yyr147();
        }
        return 759;
    }

    private int yys238() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys239() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case ONDESTROY:
            case NL:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
            case CONSTRUCT:
                return yyr47();
        }
        return 759;
    }

    private int yys243() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case NL:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
                return yyr19();
        }
        return 759;
    }

    private int yys245() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys246() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
            case DESTROY:
                return 277;
            case IDENTIFIER:
                return 278;
            case IF:
                return 279;
            case RETURN:
                return 280;
            case VAL:
                return 281;
            case WHILE:
                return 282;
            case error:
                return 283;
            case RBRACK:
                return yyr49();
        }
        return 759;
    }

    private int yys250() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case COMMA:
                return 229;
            case RPAR:
                return yyr108();
        }
        return 759;
    }

    private int yys252() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case EQ:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr103();
        }
        return 759;
    }

    private int yys253() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr102();
        }
        return 759;
    }

    private int yys254() {
        switch (yytok) {
            case IF:
            case ENDFUNCTION:
            case ELSEIF:
            case ELSE:
            case NL:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case ENDLOOP:
            case SET:
            case ENDIF:
            case RETURN:
                return yyr158();
        }
        return 759;
    }

    private int yys256() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys258() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case NL:
                return 292;
        }
        return 759;
    }

    private int yys259() {
        switch (yytok) {
            case NL:
                return 3;
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case ONDESTROY:
            case FUNCTION:
            case VAL:
            case CONSTRUCT:
                return yyr2();
        }
        return 759;
    }

    private int yys260() {
        switch (yytok) {
            case NL:
                return 3;
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr2();
        }
        return 759;
    }

    private int yys262() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys263() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case NL:
                return 298;
        }
        return 759;
    }

    private int yys265() {
        switch (yytok) {
            case NL:
                return 300;
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case DOT:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case CASTTO:
            case AND:
                return yyr83();
        }
        return 759;
    }

    private int yys266() {
        switch (yytok) {
            case NL:
                return 301;
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case DOT:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case CASTTO:
            case AND:
                return yyr82();
        }
        return 759;
    }

    private int yys267() {
        switch (yytok) {
            case NL:
                return 302;
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case DOT:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case CASTTO:
            case AND:
                return yyr84();
        }
        return 759;
    }

    private int yys268() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr52();
        }
        return 759;
    }

    private int yys269() {
        switch (yytok) {
            case NL:
                return 3;
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr2();
        }
        return 759;
    }

    private int yys270() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr54();
        }
        return 759;
    }

    private int yys271() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr56();
        }
        return 759;
    }

    private int yys272() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr50();
        }
        return 759;
    }

    private int yys273() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr55();
        }
        return 759;
    }

    private int yys274() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr53();
        }
        return 759;
    }

    private int yys275() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr51();
        }
        return 759;
    }

    private int yys277() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys278() {
        switch (yytok) {
            case ARRAY:
                return 56;
            case LPAR:
                return 143;
            case LSQUARE:
                return 164;
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case DOT:
            case AND:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case EQ:
            case DIV_INT:
            case CASTTO:
                return yyr74();
            case IDENTIFIER:
                return yyr40();
        }
        return 759;
    }

    private int yys279() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys280() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys282() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys288() {
        switch (yytok) {
            case PLUS:
            case OR:
            case GTEQ:
            case GT:
            case NOTEQ:
            case NL:
            case DOT:
            case COMMA:
            case MULT:
            case MOD_REAL:
            case MOD_INT:
            case DIV_REAL:
            case MINUS:
            case LTEQ:
            case EQEQ:
            case LT:
            case DIV_INT:
            case THEN:
            case LBRACK:
            case RSQUARE:
            case RPAR:
            case CASTTO:
            case AND:
                return yyr90();
        }
        return 759;
    }

    private int yys289() {
        switch (yytok) {
            case NL:
                return 3;
            case IF:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case SET:
            case ENDIF:
            case RETURN:
                return yyr2();
        }
        return 759;
    }

    private int yys290() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case THEN:
                return 315;
        }
        return 759;
    }

    private int yys291() {
        switch (yytok) {
            case IF:
            case ENDFUNCTION:
            case ELSEIF:
            case ELSE:
            case NL:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case ENDLOOP:
            case SET:
            case ENDIF:
            case RETURN:
                return yyr161();
        }
        return 759;
    }

    private int yys292() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case ONDESTROY:
            case NL:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
            case CONSTRUCT:
                return yyr46();
        }
        return 759;
    }

    private int yys294() {
        switch (yytok) {
            case PRIVATE:
                return 138;
            case PUBLIC:
                return 139;
            case PUBLICREAD:
                return 140;
            case ONDESTROY:
                return 321;
            case RBRACK:
                return yyr27();
            case IDENTIFIER:
            case FUNCTION:
            case VAL:
            case CONSTRUCT:
                return yyr11();
        }
        return 759;
    }

    private int yys296() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case NL:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
                return yyr18();
        }
        return 759;
    }

    private int yys297() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case NL:
                return 323;
        }
        return 759;
    }

    private int yys298() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case ONDESTROY:
            case NL:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
            case CONSTRUCT:
                return yyr44();
        }
        return 759;
    }

    private int yys299() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys300() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr77();
        }
        return 759;
    }

    private int yys301() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr76();
        }
        return 759;
    }

    private int yys302() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr78();
        }
        return 759;
    }

    private int yys305() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case NL:
                return 327;
        }
        return 759;
    }

    private int yys306() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case LBRACK:
                return 328;
        }
        return 759;
    }

    private int yys307() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case NL:
                return 329;
        }
        return 759;
    }

    private int yys310() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case LBRACK:
                return 332;
        }
        return 759;
    }

    private int yys311() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr57();
        }
        return 759;
    }

    private int yys312() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case NL:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
                return yyr22();
        }
        return 759;
    }

    private int yys317() {
        switch (yytok) {
            case NL:
                return 3;
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case ONDESTROY:
            case FUNCTION:
            case VAL:
            case CONSTRUCT:
                return yyr2();
        }
        return 759;
    }

    private int yys318() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case ONDESTROY:
            case NL:
            case FUNCTION:
            case VAL:
            case CONSTRUCT:
                return yyr31();
        }
        return 759;
    }

    private int yys319() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case ONDESTROY:
            case NL:
            case FUNCTION:
            case VAL:
            case CONSTRUCT:
                return yyr30();
        }
        return 759;
    }

    private int yys322() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case ONDESTROY:
            case NL:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
            case CONSTRUCT:
                return yyr32();
        }
        return 759;
    }

    private int yys323() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case ONDESTROY:
            case NL:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
            case CONSTRUCT:
                return yyr45();
        }
        return 759;
    }

    private int yys324() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case NL:
                return 340;
        }
        return 759;
    }

    private int yys325() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys326() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr68();
        }
        return 759;
    }

    private int yys327() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr58();
        }
        return 759;
    }

    private int yys329() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr59();
        }
        return 759;
    }

    private int yys331() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys335() {
        switch (yytok) {
            case NL:
                return 3;
            case IF:
            case ELSEIF:
            case ELSE:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case SET:
            case ENDIF:
            case RETURN:
                return yyr2();
        }
        return 759;
    }

    private int yys336() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case NL:
            case FUNCTION:
            case NATIVETYPE:
            case NATIVE:
            case CLASS:
            case VAL:
            case INIT:
                return yyr25();
        }
        return 759;
    }

    private int yys340() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr69();
        }
        return 759;
    }

    private int yys341() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case NL:
                return 350;
        }
        return 759;
    }

    private int yys342() {
        switch (yytok) {
            case NL:
                return 3;
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr2();
        }
        return 759;
    }

    private int yys343() {
        switch (yytok) {
            case FALSE:
                return 102;
            case FUNCTION:
                return 103;
            case IDENTIFIER:
                return 104;
            case INTEGER_LITERAL:
                return 105;
            case LPAR:
                return 106;
            case MINUS:
                return 107;
            case NEW:
                return 108;
            case NOT:
                return 109;
            case NULL:
                return 110;
            case REAL_LITERAL:
                return 111;
            case STRING_LITERAL:
                return 112;
            case THIS:
                return 113;
            case TRUE:
                return 114;
        }
        return 759;
    }

    private int yys344() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case NL:
                return 353;
        }
        return 759;
    }

    private int yys345() {
        switch (yytok) {
            case NL:
                return 3;
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr2();
        }
        return 759;
    }

    private int yys346() {
        switch (yytok) {
            case IF:
            case ENDFUNCTION:
            case ELSEIF:
            case ELSE:
            case NL:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case ENDLOOP:
            case SET:
            case ENDIF:
            case RETURN:
                return yyr160();
        }
        return 759;
    }

    private int yys349() {
        switch (yytok) {
            case NL:
                return 3;
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr2();
        }
        return 759;
    }

    private int yys350() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr67();
        }
        return 759;
    }

    private int yys352() {
        switch (yytok) {
            case AND:
                return 144;
            case CASTTO:
                return 145;
            case DIV_INT:
                return 146;
            case DIV_REAL:
                return 147;
            case DOT:
                return 148;
            case EQEQ:
                return 149;
            case GT:
                return 150;
            case GTEQ:
                return 151;
            case LT:
                return 152;
            case LTEQ:
                return 153;
            case MINUS:
                return 154;
            case MOD_INT:
                return 155;
            case MOD_REAL:
                return 156;
            case MULT:
                return 157;
            case NOTEQ:
                return 159;
            case OR:
                return 160;
            case PLUS:
                return 161;
            case NL:
                return 359;
        }
        return 759;
    }

    private int yys353() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr65();
        }
        return 759;
    }

    private int yys355() {
        switch (yytok) {
            case IF:
            case ENDFUNCTION:
            case ELSEIF:
            case ELSE:
            case NL:
            case CALL:
            case EXITWHEN:
            case LOOP:
            case ENDLOOP:
            case SET:
            case ENDIF:
            case RETURN:
                return yyr159();
        }
        return 759;
    }

    private int yys359() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr66();
        }
        return 759;
    }

    private int yys364() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr60();
        }
        return 759;
    }

    private int yys365() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr64();
        }
        return 759;
    }

    private int yys367() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case ONDESTROY:
            case NL:
            case FUNCTION:
            case VAL:
            case CONSTRUCT:
                return yyr29();
        }
        return 759;
    }

    private int yys368() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr61();
        }
        return 759;
    }

    private int yys369() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr62();
        }
        return 759;
    }

    private int yys370() {
        switch (yytok) {
            case NL:
                return 3;
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr2();
        }
        return 759;
    }

    private int yys371() {
        switch (yytok) {
            case NL:
                return 3;
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr2();
        }
        return 759;
    }

    private int yys376() {
        switch (yytok) {
            case RBRACK:
            case IF:
            case IDENTIFIER:
            case NULL:
            case NOT:
            case NL:
            case FUNCTION:
            case NEW:
            case FALSE:
            case MINUS:
            case error:
            case VAL:
            case LPAR:
            case TRUE:
            case THIS:
            case DESTROY:
            case STRING_LITERAL:
            case WHILE:
            case INTEGER_LITERAL:
            case RETURN:
            case REAL_LITERAL:
                return yyr63();
        }
        return 759;
    }

    private int yys377() {
        switch (yytok) {
            case RBRACK:
            case PUBLICREAD:
            case PUBLIC:
            case PRIVATE:
            case IDENTIFIER:
            case ONDESTROY:
            case NL:
            case FUNCTION:
            case VAL:
            case CONSTRUCT:
                return yyr28();
        }
        return 759;
    }

    private int yyr4() { // CompilationUnit2 : Newlines TopLevelDeclaration CompilationUnit2
        { ((CompilationUnit)yysv[yysp-1]).addFront(((TopLevelDeclaration)yysv[yysp-2]));  yyrv = ((CompilationUnit)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypCompilationUnit2();
    }

    private int yyr5() { // CompilationUnit2 : Newlines
        { yyrv = Ast.CompilationUnit(); }
        yysv[yysp-=1] = yyrv;
        return yypCompilationUnit2();
    }

    private int yypCompilationUnit2() {
        switch (yyst[yysp-1]) {
            case 0: return 1;
            default: return 18;
        }
    }

    private int yyr105() { // Arguments : Expr ArgumentRest
        { ((Arguments)yysv[yysp-1]).addFront(((Expr)yysv[yysp-2])); yyrv = ((Arguments)yysv[yysp-1]); }
        yysv[yysp-=2] = yyrv;
        return yypArguments();
    }

    private int yyr106() { // Arguments : /* empty */
        { yyrv = Ast.Arguments(); }
        yysv[yysp-=0] = yyrv;
        return yypArguments();
    }

    private int yypArguments() {
        switch (yyst[yysp-1]) {
            case 210: return 232;
            case 143: return 189;
            default: return 251;
        }
    }

    private int yyr42() { // ArraySizes : LSQUARE Expr RSQUARE ArraySizes
        { ((ArraySizes)yysv[yysp-1]).addFront(((Expr)yysv[yysp-3])); yyrv = ((ArraySizes)yysv[yysp-1]); }
        yysv[yysp-=4] = yyrv;
        return yypArraySizes();
    }

    private int yyr43() { // ArraySizes : /* empty */
        { yyrv = Ast.ArraySizes(); }
        yysv[yysp-=0] = yyrv;
        return yypArraySizes();
    }

    private int yypArraySizes() {
        switch (yyst[yysp-1]) {
            case 56: return 78;
            default: return 216;
        }
    }

    private int yyr25() { // ClassDef : VisibilityModifier CLASS IDENTIFIER LBRACK NL ClassSlots RBRACK NL
        { yyrv = Ast.ClassDef(getPos(yysv[yysp-7]), ((VisibilityModifier)yysv[yysp-8]), getString(yysv[yysp-6]), false, ((ClassSlots)yysv[yysp-3])); }
        yysv[yysp-=8] = yyrv;
        return 131;
    }

    private int yyr28() { // ClassSlot : VisibilityModifier CONSTRUCT LPAR Parameters RPAR LBRACK NL Statements RBRACK NL
        { yyrv = Ast.ConstructorDef(getPos(yysv[yysp-9]), ((VisibilityModifier)yysv[yysp-10]), ((WParameters)yysv[yysp-7]), ((WStatements)yysv[yysp-3])); }
        yysv[yysp-=10] = yyrv;
        return 317;
    }

    private int yyr29() { // ClassSlot : ONDESTROY LBRACK NL Statements RBRACK NL
        { yyrv = Ast.OnDestroyDef(getPos(yysv[yysp-6]), ((WStatements)yysv[yysp-3])); }
        yysv[yysp-=6] = yyrv;
        return 317;
    }

    private int yyr30() { // ClassSlot : VarDef
        { yyrv = ((GlobalVarDef)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 317;
    }

    private int yyr31() { // ClassSlot : FuncDef
        { yyrv = ((FuncDef)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 317;
    }

    private int yyr26() { // ClassSlots : Newlines ClassSlot ClassSlots
        { ((ClassSlots)yysv[yysp-1]).addFront(((ClassSlot)yysv[yysp-2])); yyrv = ((ClassSlots)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypClassSlots();
    }

    private int yyr27() { // ClassSlots : Newlines
        { yyrv = Ast.ClassSlots(); }
        yysv[yysp-=1] = yyrv;
        return yypClassSlots();
    }

    private int yypClassSlots() {
        switch (yyst[yysp-1]) {
            case 259: return 293;
            default: return 337;
        }
    }

    private int yyr107() { // ArgumentRest : COMMA Expr ArgumentRest
        { ((Arguments)yysv[yysp-1]).addFront(((Expr)yysv[yysp-2])); yyrv = ((Arguments)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypArgumentRest();
    }

    private int yyr108() { // ArgumentRest : /* empty */
        { yyrv = Ast.Arguments(); }
        yysv[yysp-=0] = yyrv;
        return yypArgumentRest();
    }

    private int yypArgumentRest() {
        switch (yyst[yysp-1]) {
            case 190: return 228;
            default: return 287;
        }
    }

    private int yyr62() { // ElseStatements : StmtIf
        { yyrv = Ast.WStatements(((StmtIf)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 368;
    }

    private int yyr63() { // ElseStatements : LBRACK Statements RBRACK NL
        { yyrv = ((WStatements)yysv[yysp-3]); }
        yysv[yysp-=4] = yyrv;
        return 368;
    }

    private int yyr16() { // Entities : Newlines Entity Entities
        { ((WEntities)yysv[yysp-1]).addFront(((WEntity)yysv[yysp-2])); yyrv = ((WEntities)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypEntities();
    }

    private int yyr17() { // Entities : Newlines
        { yyrv = Ast.WEntities(); }
        yysv[yysp-=1] = yyrv;
        return yypEntities();
    }

    private int yypEntities() {
        switch (yyst[yysp-1]) {
            case 61: return 83;
            default: return 179;
        }
    }

    private int yyr18() { // Entity : VisibilityModifier NATIVETYPE IDENTIFIER EXTENDS TypeExpr NL
        { yyrv = Ast.NativeType(getPos(yysv[yysp-5]), ((VisibilityModifier)yysv[yysp-6]), getString(yysv[yysp-4]), ((TypeExpr)yysv[yysp-2])); }
        yysv[yysp-=6] = yyrv;
        return 132;
    }

    private int yyr19() { // Entity : VisibilityModifier NATIVETYPE IDENTIFIER NL
        { yyrv = Ast.NativeType(getPos(yysv[yysp-3]), ((VisibilityModifier)yysv[yysp-4]), getString(yysv[yysp-2]), Ast.NoTypeExpr()); }
        yysv[yysp-=4] = yyrv;
        return 132;
    }

    private int yyr20() { // Entity : FuncDef
        { yyrv = ((FuncDef)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 132;
    }

    private int yyr21() { // Entity : VarDef
        { yyrv = ((GlobalVarDef)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 132;
    }

    private int yyr22() { // Entity : INIT LBRACK NL Statements RBRACK NL
        { yyrv = Ast.InitBlock(getPos(yysv[yysp-6]), ((WStatements)yysv[yysp-3])); }
        yysv[yysp-=6] = yyrv;
        return 132;
    }

    private int yyr23() { // Entity : NATIVE FuncSignature NL
        { yyrv = Ast.NativeFunc(getPos(yysv[yysp-3]), ((FuncSignature)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return 132;
    }

    private int yyr24() { // Entity : ClassDef
        { yyrv = ((ClassDef)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 132;
    }

    private int yyr79() { // Expr : ExprBinary
        { yyrv = ((ExprBinary)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypExpr();
    }

    private int yyr80() { // Expr : ExprUnary
        { yyrv = ((ExprUnary)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypExpr();
    }

    private int yyr81() { // Expr : ExprMemberVar
        { yyrv = ((ExprMemberVar)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypExpr();
    }

    private int yyr82() { // Expr : ExprMemberMethod
        { yyrv = ((ExprMemberMethod)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypExpr();
    }

    private int yyr83() { // Expr : ExprFunctionCall
        { yyrv = ((ExprFunctionCall)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypExpr();
    }

    private int yyr84() { // Expr : ExprNewObject
        { yyrv = ((ExprNewObject)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypExpr();
    }

    private int yyr85() { // Expr : ExprAtomic
        { yyrv = ((Expr)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypExpr();
    }

    private int yyr86() { // Expr : ExprCast
        { yyrv = ((ExprCast)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypExpr();
    }

    private int yypExpr() {
        switch (yyst[yysp-1]) {
            case 343: return 352;
            case 331: return 344;
            case 325: return 341;
            case 299: return 324;
            case 282: return 310;
            case 280: return 307;
            case 279: return 306;
            case 277: return 305;
            case 262: return 297;
            case 256: return 290;
            case 246: return 119;
            case 245: return 263;
            case 238: return 258;
            case 229: return 250;
            case 174: return 215;
            case 173: return 214;
            case 164: return 208;
            case 161: return 207;
            case 160: return 206;
            case 159: return 205;
            case 157: return 204;
            case 156: return 203;
            case 155: return 202;
            case 154: return 201;
            case 153: return 200;
            case 152: return 199;
            case 151: return 198;
            case 150: return 197;
            case 149: return 196;
            case 147: return 194;
            case 146: return 193;
            case 144: return 191;
            case 129: return 178;
            case 109: return 168;
            case 107: return 166;
            case 106: return 165;
            case 80: return 128;
            case 79: return 127;
            case 72: return 119;
            case 71: return 117;
            case 69: return 115;
            case 68: return 91;
            default: return 190;
        }
    }

    private int yyr70() { // ExprAssignable : ExprMemberVar
        { yyrv = ((ExprMemberVar)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypExprAssignable();
    }

    private int yyr71() { // ExprAssignable : ExprMemberArrayVar
        { yyrv = ((ExprMemberArrayVar)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypExprAssignable();
    }

    private int yyr72() { // ExprAssignable : ExprVarAccess
        { yyrv = ((ExprVarAccess)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypExprAssignable();
    }

    private int yyr73() { // ExprAssignable : ExprVarArrayAccess
        { yyrv = ((ExprVarArrayAccess)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypExprAssignable();
    }

    private int yypExprAssignable() {
        switch (yyst[yysp-1]) {
            case 72: return 120;
            default: return 264;
        }
    }

    private int yyr91() { // ExprAtomic : INTEGER_LITERAL
        { yyrv = Ast.ExprIntVal(getPos(yysv[yysp-1]), getInt(yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 92;
    }

    private int yyr92() { // ExprAtomic : NULL
        { yyrv = Ast.ExprNull(getPos(yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 92;
    }

    private int yyr93() { // ExprAtomic : STRING_LITERAL
        { yyrv = Ast.ExprStringVal(getPos(yysv[yysp-1]), getString(yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 92;
    }

    private int yyr94() { // ExprAtomic : LPAR Expr RPAR
        { yyrv = ((Expr)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return 92;
    }

    private int yyr95() { // ExprAtomic : TRUE
        { yyrv = Ast.ExprBoolVal(getPos(yysv[yysp-1]), true); }
        yysv[yysp-=1] = yyrv;
        return 92;
    }

    private int yyr96() { // ExprAtomic : FALSE
        { yyrv = Ast.ExprBoolVal(getPos(yysv[yysp-1]), false); }
        yysv[yysp-=1] = yyrv;
        return 92;
    }

    private int yyr97() { // ExprAtomic : THIS
        { yyrv = Ast.ExprThis(getPos(yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 92;
    }

    private int yyr98() { // ExprAtomic : FUNCTION IDENTIFIER
        { yyrv = Ast.ExprFuncRef(getPos(yysv[yysp-2]), getString(yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return 92;
    }

    private int yyr99() { // ExprAtomic : REAL_LITERAL
        { yyrv = Ast.ExprRealVal(getPos(yysv[yysp-1]), getDouble(yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 92;
    }

    private int yyr100() { // ExprAtomic : ExprVarAccess
        { yyrv = ((ExprVarAccess)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 92;
    }

    private int yyr101() { // ExprAtomic : ExprVarArrayAccess
        { yyrv = ((ExprVarArrayAccess)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 92;
    }

    private int yyr109() { // ExprBinary : Expr OR Expr
        { yyrv = Ast.ExprBinary(((Expr)yysv[yysp-3]).getSource().copy(), ((Expr)yysv[yysp-3]), Ast.OpOr(), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 93;
    }

    private int yyr110() { // ExprBinary : Expr AND Expr
        { yyrv = Ast.ExprBinary(((Expr)yysv[yysp-3]).getSource().copy(), ((Expr)yysv[yysp-3]), Ast.OpAnd(), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 93;
    }

    private int yyr111() { // ExprBinary : Expr PLUS Expr
        { yyrv = Ast.ExprBinary(((Expr)yysv[yysp-3]).getSource().copy(), ((Expr)yysv[yysp-3]), Ast.OpPlus(), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 93;
    }

    private int yyr112() { // ExprBinary : Expr MINUS Expr
        { yyrv = Ast.ExprBinary(((Expr)yysv[yysp-3]).getSource().copy(), ((Expr)yysv[yysp-3]), Ast.OpMinus(), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 93;
    }

    private int yyr113() { // ExprBinary : Expr MULT Expr
        { yyrv = Ast.ExprBinary(((Expr)yysv[yysp-3]).getSource().copy(), ((Expr)yysv[yysp-3]), Ast.OpMult(), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 93;
    }

    private int yyr114() { // ExprBinary : Expr DIV_REAL Expr
        { yyrv = Ast.ExprBinary(((Expr)yysv[yysp-3]).getSource().copy(), ((Expr)yysv[yysp-3]), Ast.OpDivReal(), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 93;
    }

    private int yyr115() { // ExprBinary : Expr DIV_INT Expr
        { yyrv = Ast.ExprBinary(((Expr)yysv[yysp-3]).getSource().copy(), ((Expr)yysv[yysp-3]), Ast.OpDivInt(), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 93;
    }

    private int yyr116() { // ExprBinary : Expr MOD_REAL Expr
        { yyrv = Ast.ExprBinary(((Expr)yysv[yysp-3]).getSource().copy(), ((Expr)yysv[yysp-3]), Ast.OpModReal(), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 93;
    }

    private int yyr117() { // ExprBinary : Expr MOD_INT Expr
        { yyrv = Ast.ExprBinary(((Expr)yysv[yysp-3]).getSource().copy(), ((Expr)yysv[yysp-3]), Ast.OpModInt(), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 93;
    }

    private int yyr118() { // ExprBinary : Expr EQEQ Expr
        { yyrv = Ast.ExprBinary(((Expr)yysv[yysp-3]).getSource().copy(), ((Expr)yysv[yysp-3]), Ast.OpEquals(), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 93;
    }

    private int yyr119() { // ExprBinary : Expr GTEQ Expr
        { yyrv = Ast.ExprBinary(((Expr)yysv[yysp-3]).getSource().copy(), ((Expr)yysv[yysp-3]), Ast.OpGreaterEq(), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 93;
    }

    private int yyr120() { // ExprBinary : Expr LTEQ Expr
        { yyrv = Ast.ExprBinary(((Expr)yysv[yysp-3]).getSource().copy(), ((Expr)yysv[yysp-3]), Ast.OpLessEq(), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 93;
    }

    private int yyr121() { // ExprBinary : Expr LT Expr
        { yyrv = Ast.ExprBinary(((Expr)yysv[yysp-3]).getSource().copy(), ((Expr)yysv[yysp-3]), Ast.OpLess(), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 93;
    }

    private int yyr122() { // ExprBinary : Expr GT Expr
        { yyrv = Ast.ExprBinary(((Expr)yysv[yysp-3]).getSource().copy(), ((Expr)yysv[yysp-3]), Ast.OpGreater(), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 93;
    }

    private int yyr123() { // ExprBinary : Expr NOTEQ Expr
        { yyrv = Ast.ExprBinary(((Expr)yysv[yysp-3]).getSource().copy(), ((Expr)yysv[yysp-3]), Ast.OpUnequals(), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 93;
    }

    private int yyr87() { // ExprCast : Expr CASTTO TypeExpr
        { yyrv = Ast.ExprCast(((Expr)yysv[yysp-3]).getSource().copy(), ((TypeExpr)yysv[yysp-1]), ((Expr)yysv[yysp-3])); }
        yysv[yysp-=3] = yyrv;
        return 94;
    }

    private int yyr126() { // ExprFunctionCall : IDENTIFIER LPAR Arguments RPAR
        { yyrv = Ast.ExprFunctionCall(getPos(yysv[yysp-4]), getString(yysv[yysp-4]), ((Arguments)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        switch (yyst[yysp-1]) {
            case 246: return 265;
            case 67: return 89;
            default: return 95;
        }
    }

    private int yyr89() { // ExprMemberArrayVar : Expr DOT IDENTIFIER Indexes
        { yyrv = Ast.ExprMemberArrayVar(((Expr)yysv[yysp-4]).getSource().copy(), ((Expr)yysv[yysp-4]), getString(yysv[yysp-2]), ((Indexes)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 121;
    }

    private int yyr90() { // ExprMemberMethod : Expr DOT IDENTIFIER LPAR Arguments RPAR
        { yyrv = Ast.ExprMemberMethod(((Expr)yysv[yysp-6]).getSource().copy(), ((Expr)yysv[yysp-6]), getString(yysv[yysp-4]), ((Arguments)yysv[yysp-2])); }
        yysv[yysp-=6] = yyrv;
        switch (yyst[yysp-1]) {
            case 246: return 266;
            default: return 96;
        }
    }

    private int yyr88() { // ExprMemberVar : Expr DOT IDENTIFIER
        { yyrv = Ast.ExprMemberVar(((Expr)yysv[yysp-3]).getSource().copy(), ((Expr)yysv[yysp-3]), getString(yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        switch (yyst[yysp-1]) {
            case 246: return 122;
            case 72: return 122;
            default: return 97;
        }
    }

    private int yyr102() { // ExprNewObject : NEW IDENTIFIER LPAR Arguments RPAR
        { yyrv = Ast.ExprNewObject(getPos(yysv[yysp-5]), getString(yysv[yysp-4]), ((Arguments)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        switch (yyst[yysp-1]) {
            case 246: return 267;
            default: return 98;
        }
    }

    private int yyr124() { // ExprUnary : NOT Expr
        { yyrv = Ast.ExprUnary(getPos(yysv[yysp-2]), Ast.OpNot(), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 99;
    }

    private int yyr125() { // ExprUnary : MINUS Expr
        { yyrv = Ast.ExprUnary(getPos(yysv[yysp-2]), Ast.OpMinus(), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 99;
    }

    private int yyr74() { // ExprVarAccess : IDENTIFIER
        { yyrv = Ast.ExprVarAccess(getPos(yysv[yysp-1]), getString(yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        switch (yyst[yysp-1]) {
            case 246: return 123;
            case 72: return 123;
            default: return 100;
        }
    }

    private int yyr75() { // ExprVarArrayAccess : IDENTIFIER Indexes
        { yyrv = Ast.ExprVarArrayAccess(getPos(yysv[yysp-2]), getString(yysv[yysp-2]), ((Indexes)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        switch (yyst[yysp-1]) {
            case 246: return 124;
            case 72: return 124;
            default: return 101;
        }
    }

    private int yyr32() { // FuncDef : VisibilityModifier FUNCTION FuncSignature LBRACK NL Statements RBRACK
        { yyrv = Ast.FuncDef(getPos(yysv[yysp-6]), ((VisibilityModifier)yysv[yysp-7]), ((FuncSignature)yysv[yysp-5]), ((WStatements)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        switch (yyst[yysp-1]) {
            case 84: return 133;
            default: return 318;
        }
    }

    private int yyr33() { // FuncSignature : IDENTIFIER LPAR Parameters RPAR RETURNS TypeExpr
        { yyrv = Ast.FuncSignature(getPos(yysv[yysp-6]), getString(yysv[yysp-6]), ((WParameters)yysv[yysp-4]), ((TypeExpr)yysv[yysp-1])); }
        yysv[yysp-=6] = yyrv;
        return yypFuncSignature();
    }

    private int yyr34() { // FuncSignature : IDENTIFIER LPAR Parameters RPAR
        { yyrv = Ast.FuncSignature(getPos(yysv[yysp-4]), getString(yysv[yysp-4]), ((WParameters)yysv[yysp-2]), Ast.NoTypeExpr()); }
        yysv[yysp-=4] = yyrv;
        return yypFuncSignature();
    }

    private int yypFuncSignature() {
        switch (yyst[yysp-1]) {
            case 137: return 186;
            default: return 220;
        }
    }

    private int yyr15() { // Import : IMPORT IDENTIFIER NL
        { yyrv = Ast.WImport(getPos(yysv[yysp-3]), getString(yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return 85;
    }

    private int yyr13() { // Imports : Newlines Import Imports
        { ((WImports)yysv[yysp-1]).addFront(((WImport)yysv[yysp-2])); yyrv = ((WImports)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypImports();
    }

    private int yyr14() { // Imports : Newlines
        { yyrv = Ast.WImports(); }
        yysv[yysp-=1] = yyrv;
        return yypImports();
    }

    private int yypImports() {
        switch (yyst[yysp-1]) {
            case 46: return 61;
            default: return 141;
        }
    }

    private int yyr103() { // Indexes : LSQUARE Expr RSQUARE Indexes
        { ((Indexes)yysv[yysp-1]).addFront(((Expr)yysv[yysp-3])); yyrv = ((Indexes)yysv[yysp-1]); }
        yysv[yysp-=4] = yyrv;
        return yypIndexes();
    }

    private int yyr104() { // Indexes : LSQUARE Expr RSQUARE
        { yyrv = Ast.Indexes(((Expr)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return yypIndexes();
    }

    private int yypIndexes() {
        switch (yyst[yysp-1]) {
            case 231: return 252;
            case 213: return 235;
            default: return 163;
        }
    }

    private int yyr140() { // JassFuncDef : FUNCTION JassFuncSignature NL JassLocals JassStatements ENDFUNCTION NL
        { 
                        ((WStatements)yysv[yysp-4]).addAll(((WStatements)yysv[yysp-3]).removeAll());
                        yyrv = Ast.FuncDef(getPos(yysv[yysp-7]), Ast.VisibilityDefault(), ((FuncSignature)yysv[yysp-6]), ((WStatements)yysv[yysp-4])); 
                }
        yysv[yysp-=7] = yyrv;
        return 4;
    }

    private int yyr141() { // JassFuncSignature : IDENTIFIER TAKES JassParameters RETURNS TypeExpr
        { yyrv = Ast.FuncSignature(getPos(yysv[yysp-5]), getString(yysv[yysp-5]), ((WParameters)yysv[yysp-3]), ((TypeExpr)yysv[yysp-1])); }
        yysv[yysp-=5] = yyrv;
        return yypJassFuncSignature();
    }

    private int yyr142() { // JassFuncSignature : IDENTIFIER TAKES JassParameters RETURNS NOTHING
        { yyrv = Ast.FuncSignature(getPos(yysv[yysp-5]), getString(yysv[yysp-5]), ((WParameters)yysv[yysp-3]), Ast.NoTypeExpr()); }
        yysv[yysp-=5] = yyrv;
        return yypJassFuncSignature();
    }

    private int yypJassFuncSignature() {
        switch (yyst[yysp-1]) {
            case 14: return 23;
            case 12: return 20;
            default: return 26;
        }
    }

    private int yyr132() { // JassGlobalBlock : GLOBALS NL JassGlobalDecls ENDGLOBALS NL
        { yyrv = ((JassGlobalBlock)yysv[yysp-3]); }
        yysv[yysp-=5] = yyrv;
        return 5;
    }

    private int yyr135() { // JassGlobalDecl : CONSTANT TypeExpr IDENTIFIER EQ Expr NL
        { yyrv = Ast.GlobalVarDef(getPos(yysv[yysp-6]), Ast.VisibilityDefault(), true, ((TypeExpr)yysv[yysp-5]), getString(yysv[yysp-4]), ((Expr)yysv[yysp-2])); }
        yysv[yysp-=6] = yyrv;
        return 43;
    }

    private int yyr136() { // JassGlobalDecl : TypeExpr IDENTIFIER EQ Expr NL
        { yyrv = Ast.GlobalVarDef(((TypeExpr)yysv[yysp-5]).getSource().copy(), Ast.VisibilityDefault(), false, ((TypeExpr)yysv[yysp-5]), getString(yysv[yysp-4]), ((Expr)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 43;
    }

    private int yyr137() { // JassGlobalDecl : TypeExpr IDENTIFIER NL
        { yyrv = Ast.GlobalVarDef(((TypeExpr)yysv[yysp-3]).getSource().copy(), Ast.VisibilityDefault(), false, ((TypeExpr)yysv[yysp-3]), getString(yysv[yysp-2]), Ast.NoExpr()); }
        yysv[yysp-=3] = yyrv;
        return 43;
    }

    private int yyr133() { // JassGlobalDecls : Newlines JassGlobalDecl JassGlobalDecls
        { ((JassGlobalBlock)yysv[yysp-1]).addFront(((GlobalVarDef)yysv[yysp-2])); yyrv = ((JassGlobalBlock)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypJassGlobalDecls();
    }

    private int yyr134() { // JassGlobalDecls : Newlines
        { yyrv = Ast.JassGlobalBlock(); }
        yysv[yysp-=1] = yyrv;
        return yypJassGlobalDecls();
    }

    private int yypJassGlobalDecls() {
        switch (yyst[yysp-1]) {
            case 22: return 29;
            default: return 58;
        }
    }

    private int yyr147() { // JassLocal : LOCAL TypeExpr IDENTIFIER EQ Expr NL
        { yyrv = Ast.LocalVarDef(getPos(yysv[yysp-6]), false, ((TypeExpr)yysv[yysp-5]), getString(yysv[yysp-4]), ((Expr)yysv[yysp-2])); }
        yysv[yysp-=6] = yyrv;
        return 50;
    }

    private int yyr148() { // JassLocal : LOCAL TypeExpr IDENTIFIER NL
        { yyrv = Ast.LocalVarDef(getPos(yysv[yysp-4]), false, ((TypeExpr)yysv[yysp-3]), getString(yysv[yysp-2]), Ast.NoExpr()); }
        yysv[yysp-=4] = yyrv;
        return 50;
    }

    private int yyr145() { // JassLocals : Newlines JassLocal JassLocals
        { ((WStatements)yysv[yysp-1]).addFront(((WStatement)yysv[yysp-2])); yyrv = ((WStatements)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypJassLocals();
    }

    private int yyr146() { // JassLocals : Newlines
        { yyrv = Ast.WStatements(); }
        yysv[yysp-=1] = yyrv;
        return yypJassLocals();
    }

    private int yypJassLocals() {
        switch (yyst[yysp-1]) {
            case 27: return 35;
            default: return 73;
        }
    }

    private int yyr138() { // JassNativeDecl : NATIVE JassFuncSignature NL
        { yyrv = Ast.NativeFunc(getPos(yysv[yysp-3]), ((FuncSignature)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return 6;
    }

    private int yyr139() { // JassNativeDecl : CONSTANT NATIVE JassFuncSignature NL
        { yyrv = Ast.NativeFunc(getPos(yysv[yysp-4]), ((FuncSignature)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 6;
    }

    private int yyr143() { // JassParameters : NOTHING
        { yyrv = Ast.WParameters(); }
        yysv[yysp-=1] = yyrv;
        return 37;
    }

    private int yyr144() { // JassParameters : Parameter OtherParameters
        { ((WParameters)yysv[yysp-1]).addFront(((WParameter)yysv[yysp-2])); yyrv = ((WParameters)yysv[yysp-1]); }
        yysv[yysp-=2] = yyrv;
        return 37;
    }

    private int yyr151() { // JassStatement : JassStatementIf
        { yyrv = ((WStatement)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 65;
    }

    private int yyr152() { // JassStatement : LOOP NL JassStatements ENDLOOP NL
        { yyrv = Ast.StmtLoop(getPos(yysv[yysp-5]), ((WStatements)yysv[yysp-3])); }
        yysv[yysp-=5] = yyrv;
        return 65;
    }

    private int yyr153() { // JassStatement : EXITWHEN Expr NL
        { yyrv = Ast.StmtExitwhen(getPos(yysv[yysp-3]), ((Expr)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return 65;
    }

    private int yyr154() { // JassStatement : RETURN NL
        { yyrv = Ast.StmtReturn(getPos(yysv[yysp-2]), Ast.NoExpr()); }
        yysv[yysp-=2] = yyrv;
        return 65;
    }

    private int yyr155() { // JassStatement : RETURN Expr NL
        { yyrv = Ast.StmtReturn(getPos(yysv[yysp-3]), ((Expr)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return 65;
    }

    private int yyr156() { // JassStatement : SET ExprAssignable EQ Expr NL
        { yyrv = Ast.StmtSet(getPos(yysv[yysp-5]), ((ExprAssignable)yysv[yysp-4]), Ast.OpAssign(),  ((Expr)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 65;
    }

    private int yyr157() { // JassStatement : CALL ExprFunctionCall
        { yyrv = ((ExprFunctionCall)yysv[yysp-1]); }
        yysv[yysp-=2] = yyrv;
        return 65;
    }

    private int yyr158() { // JassStatementIf : IF Expr THEN NL JassStatements JasselseIfs
        { yyrv = Ast.StmtIf(getPos(yysv[yysp-6]), ((Expr)yysv[yysp-5]), ((WStatements)yysv[yysp-2]), ((WStatements)yysv[yysp-1])); }
        yysv[yysp-=6] = yyrv;
        return 66;
    }

    private int yyr149() { // JassStatements : Newlines JassStatement JassStatements
        { ((WStatements)yysv[yysp-1]).addFront(((WStatement)yysv[yysp-2])); yyrv = ((WStatements)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypJassStatements();
    }

    private int yyr150() { // JassStatements : Newlines
        { yyrv = Ast.WStatements(); }
        yysv[yysp-=1] = yyrv;
        return yypJassStatements();
    }

    private int yypJassStatements() {
        switch (yyst[yysp-1]) {
            case 289: return 314;
            case 211: return 233;
            case 116: return 170;
            case 65: return 88;
            case 35: return 48;
            default: return 347;
        }
    }

    private int yyr127() { // JassToplevelDeclaration : JassGlobalBlock
        { yyrv = ((JassGlobalBlock)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 7;
    }

    private int yyr128() { // JassToplevelDeclaration : JassFuncDef
        { yyrv = ((FuncDef)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 7;
    }

    private int yyr129() { // JassToplevelDeclaration : JassTypeDecl
        { yyrv = ((NativeType)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 7;
    }

    private int yyr130() { // JassToplevelDeclaration : JassNativeDecl
        { yyrv = ((NativeFunc)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 7;
    }

    private int yyr131() { // JassTypeDecl : TYPE IDENTIFIER EXTENDS TypeExpr NL
        { yyrv = Ast.NativeType(getPos(yysv[yysp-5]), Ast.VisibilityDefault(), getString(yysv[yysp-4]), ((TypeExpr)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 8;
    }

    private int yyr159() { // JasselseIfs : ELSEIF Expr THEN NL JassStatements JasselseIfs
        { yyrv = Ast.WStatements(Ast.StmtIf(getPos(yysv[yysp-6]), ((Expr)yysv[yysp-5]),  ((WStatements)yysv[yysp-2]), ((WStatements)yysv[yysp-1]))); }
        yysv[yysp-=6] = yyrv;
        return yypJasselseIfs();
    }

    private int yyr160() { // JasselseIfs : ELSE NL JassStatements ENDIF NL
        { yyrv = ((WStatements)yysv[yysp-3]); }
        yysv[yysp-=5] = yyrv;
        return yypJasselseIfs();
    }

    private int yyr161() { // JasselseIfs : ENDIF NL
        { yyrv = Ast.WStatements(); }
        yysv[yysp-=2] = yyrv;
        return yypJasselseIfs();
    }

    private int yypJasselseIfs() {
        switch (yyst[yysp-1]) {
            case 233: return 254;
            default: return 355;
        }
    }

    private int yyr65() { // LocalVarDef : VAL IDENTIFIER EQ Expr NL
        { yyrv = Ast.LocalVarDef(getPos(yysv[yysp-5]), true, Ast.NoTypeExpr(), getString(yysv[yysp-4]), ((Expr)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 268;
    }

    private int yyr66() { // LocalVarDef : VAL TypeExpr IDENTIFIER EQ Expr NL
        { yyrv = Ast.LocalVarDef(getPos(yysv[yysp-6]), true, ((TypeExpr)yysv[yysp-5]), getString(yysv[yysp-4]), ((Expr)yysv[yysp-2])); }
        yysv[yysp-=6] = yyrv;
        return 268;
    }

    private int yyr67() { // LocalVarDef : TypeExpr IDENTIFIER EQ Expr NL
        { yyrv = Ast.LocalVarDef(((TypeExpr)yysv[yysp-5]).getSource().copy(), false, ((TypeExpr)yysv[yysp-5]), getString(yysv[yysp-4]), ((Expr)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 268;
    }

    private int yyr68() { // LocalVarDef : TypeExpr IDENTIFIER NL
        { yyrv = Ast.LocalVarDef(((TypeExpr)yysv[yysp-3]).getSource().copy(), false, ((TypeExpr)yysv[yysp-3]), getString(yysv[yysp-2]), Ast.NoExpr()); }
        yysv[yysp-=3] = yyrv;
        return 268;
    }

    private int yyr1() { // Newlines : NL Newlines
        yysp -= 2;
        return yypNewlines();
    }

    private int yyr2() { // Newlines : /* empty */
        return yypNewlines();
    }

    private int yypNewlines() {
        switch (yyst[yysp-1]) {
            case 335: return 49;
            case 317: return 294;
            case 289: return 49;
            case 259: return 294;
            case 211: return 49;
            case 132: return 84;
            case 116: return 49;
            case 85: return 62;
            case 65: return 49;
            case 61: return 84;
            case 50: return 36;
            case 46: return 62;
            case 43: return 30;
            case 35: return 49;
            case 27: return 36;
            case 22: return 30;
            case 10: return 2;
            case 3: return 17;
            case 0: return 2;
            default: return 246;
        }
    }

    private int yyr37() { // OtherParameters : COMMA Parameter OtherParameters
        { ((WParameters)yysv[yysp-1]).addFront(((WParameter)yysv[yysp-2])); yyrv = ((WParameters)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypOtherParameters();
    }

    private int yyr38() { // OtherParameters : /* empty */
        { yyrv = Ast.WParameters(); }
        yysv[yysp-=0] = yyrv;
        return yypOtherParameters();
    }

    private int yypOtherParameters() {
        switch (yyst[yysp-1]) {
            case 77: return 126;
            case 38: return 53;
            default: return 285;
        }
    }

    private int yyr12() { // PackageDeclaration : PACKAGE IDENTIFIER LBRACK NL Imports Entities RBRACK
        { yyrv = Ast.WPackage(getPos(yysv[yysp-7]), getString(yysv[yysp-6]), ((WImports)yysv[yysp-3]), ((WEntities)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return 9;
    }

    private int yyr39() { // Parameter : TypeExpr IDENTIFIER
        { yyrv = Ast.WParameter(((TypeExpr)yysv[yysp-2]).getSource().copy(), ((TypeExpr)yysv[yysp-2]), getString(yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        switch (yyst[yysp-1]) {
            case 54: return 77;
            case 28: return 38;
            default: return 248;
        }
    }

    private int yyr35() { // Parameters : Parameter OtherParameters
        { ((WParameters)yysv[yysp-1]).addFront(((WParameter)yysv[yysp-2])); yyrv = ((WParameters)yysv[yysp-1]); }
        yysv[yysp-=2] = yyrv;
        return yypParameters();
    }

    private int yyr36() { // Parameters : /* empty */
        { yyrv = Ast.WParameters(); }
        yysv[yysp-=0] = yyrv;
        return yypParameters();
    }

    private int yypParameters() {
        switch (yyst[yysp-1]) {
            case 226: return 249;
            default: return 356;
        }
    }

    private int yyr50() { // Statement : StmtIf
        { yyrv = ((StmtIf)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 269;
    }

    private int yyr51() { // Statement : StmtWhile
        { yyrv = ((StmtWhile)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 269;
    }

    private int yyr52() { // Statement : LocalVarDef
        { yyrv = ((LocalVarDef)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 269;
    }

    private int yyr53() { // Statement : StmtSet
        { yyrv = ((StmtSet)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 269;
    }

    private int yyr54() { // Statement : StmtCall
        { yyrv = ((StmtCall)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 269;
    }

    private int yyr55() { // Statement : StmtReturn
        { yyrv = ((StmtReturn)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 269;
    }

    private int yyr56() { // Statement : StmtDestroy
        { yyrv = ((StmtDestroy)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 269;
    }

    private int yyr57() { // Statement : error NL
        { yyrv = Ast.StmtErr(getPos(yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return 269;
    }

    private int yyr48() { // Statements : Newlines Statement Statements
        { ((WStatements)yysv[yysp-1]).addFront(((WStatement)yysv[yysp-2])); yyrv = ((WStatements)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypStatements();
    }

    private int yyr49() { // Statements : Newlines
        { yyrv = Ast.WStatements(); }
        yysv[yysp-=1] = yyrv;
        return yypStatements();
    }

    private int yypStatements() {
        switch (yyst[yysp-1]) {
            case 370: return 372;
            case 349: return 357;
            case 345: return 354;
            case 342: return 351;
            case 269: return 303;
            case 260: return 295;
            case 224: return 247;
            default: return 373;
        }
    }

    private int yyr76() { // StmtCall : ExprMemberMethod NL
        { yyrv = ((ExprMemberMethod)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return 270;
    }

    private int yyr77() { // StmtCall : ExprFunctionCall NL
        { yyrv = ((ExprFunctionCall)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return 270;
    }

    private int yyr78() { // StmtCall : ExprNewObject NL
        { yyrv = ((ExprNewObject)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return 270;
    }

    private int yyr58() { // StmtDestroy : DESTROY Expr NL
        { yyrv = Ast.StmtDestroy(getPos(yysv[yysp-3]), ((Expr)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return 271;
    }

    private int yyr60() { // StmtIf : IF Expr LBRACK NL Statements RBRACK NL
        { yyrv = Ast.StmtIf(getPos(yysv[yysp-7]), ((Expr)yysv[yysp-6]), ((WStatements)yysv[yysp-3]), Ast.WStatements()); }
        yysv[yysp-=7] = yyrv;
        return yypStmtIf();
    }

    private int yyr61() { // StmtIf : IF Expr LBRACK NL Statements RBRACK ELSE ElseStatements
        { yyrv = Ast.StmtIf(getPos(yysv[yysp-8]), ((Expr)yysv[yysp-7]), ((WStatements)yysv[yysp-4]), ((WStatements)yysv[yysp-1])); }
        yysv[yysp-=8] = yyrv;
        return yypStmtIf();
    }

    private int yypStmtIf() {
        switch (yyst[yysp-1]) {
            case 246: return 272;
            default: return 369;
        }
    }

    private int yyr59() { // StmtReturn : RETURN Expr NL
        { yyrv = Ast.StmtReturn(getPos(yysv[yysp-3]), ((Expr)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return 273;
    }

    private int yyr69() { // StmtSet : ExprAssignable EQ Expr NL
        { yyrv = Ast.StmtSet(((ExprAssignable)yysv[yysp-4]).getSource().copy(), ((ExprAssignable)yysv[yysp-4]), Ast.OpAssign(),  ((Expr)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 274;
    }

    private int yyr64() { // StmtWhile : WHILE Expr LBRACK NL Statements RBRACK NL
        { yyrv = Ast.StmtWhile(getPos(yysv[yysp-7]), ((Expr)yysv[yysp-6]), ((WStatements)yysv[yysp-3])); }
        yysv[yysp-=7] = yyrv;
        return 275;
    }

    private int yyr6() { // TopLevelDeclaration : PackageDeclaration
        { yyrv = ((WPackage)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 10;
    }

    private int yyr7() { // TopLevelDeclaration : JassToplevelDeclaration
        { yyrv = ((JassToplevelDeclaration)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 10;
    }

    private int yyr40() { // TypeExpr : IDENTIFIER
        { yyrv = Ast.TypeExpr(getPos(yysv[yysp-1]), getString(yysv[yysp-1]), false, Ast.ArraySizes()); }
        yysv[yysp-=1] = yyrv;
        return yypTypeExpr();
    }

    private int yyr41() { // TypeExpr : IDENTIFIER ARRAY ArraySizes
        { yyrv = Ast.TypeExpr(getPos(yysv[yysp-3]), getString(yysv[yysp-3]), true, ((ArraySizes)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypTypeExpr();
    }

    private int yypTypeExpr() {
        switch (yyst[yysp-1]) {
            case 320: return 180;
            case 313: return 333;
            case 281: return 308;
            case 246: return 276;
            case 242: return 261;
            case 184: return 222;
            case 145: return 192;
            case 135: return 180;
            case 52: return 75;
            case 51: return 74;
            case 45: return 60;
            case 33: return 47;
            case 30: return 44;
            default: return 39;
        }
    }

    private int yyr44() { // VarDef : VisibilityModifier VAL IDENTIFIER EQ Expr NL
        { yyrv = Ast.GlobalVarDef(getPos(yysv[yysp-5]), ((VisibilityModifier)yysv[yysp-6]), true, Ast.NoTypeExpr(), getString(yysv[yysp-4]), ((Expr)yysv[yysp-2])); }
        yysv[yysp-=6] = yyrv;
        return yypVarDef();
    }

    private int yyr45() { // VarDef : VisibilityModifier VAL TypeExpr IDENTIFIER EQ Expr NL
        { yyrv = Ast.GlobalVarDef(getPos(yysv[yysp-6]), ((VisibilityModifier)yysv[yysp-7]), true, ((TypeExpr)yysv[yysp-5]), getString(yysv[yysp-4]), ((Expr)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypVarDef();
    }

    private int yyr46() { // VarDef : VisibilityModifier TypeExpr IDENTIFIER EQ Expr NL
        { yyrv = Ast.GlobalVarDef(((TypeExpr)yysv[yysp-5]).getSource().copy(), ((VisibilityModifier)yysv[yysp-6]), false, ((TypeExpr)yysv[yysp-5]), getString(yysv[yysp-4]), ((Expr)yysv[yysp-2])); }
        yysv[yysp-=6] = yyrv;
        return yypVarDef();
    }

    private int yyr47() { // VarDef : VisibilityModifier TypeExpr IDENTIFIER NL
        { yyrv = Ast.GlobalVarDef(((TypeExpr)yysv[yysp-3]).getSource().copy(), ((VisibilityModifier)yysv[yysp-4]), false, ((TypeExpr)yysv[yysp-3]), getString(yysv[yysp-2]), Ast.NoExpr()); }
        yysv[yysp-=4] = yyrv;
        return yypVarDef();
    }

    private int yypVarDef() {
        switch (yyst[yysp-1]) {
            case 84: return 134;
            default: return 319;
        }
    }

    private int yyr8() { // VisibilityModifier : PUBLIC
        { yyrv = Ast.VisibilityPublic(getPos(yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypVisibilityModifier();
    }

    private int yyr9() { // VisibilityModifier : PRIVATE
        { yyrv = Ast.VisibilityPrivate(getPos(yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypVisibilityModifier();
    }

    private int yyr10() { // VisibilityModifier : PUBLICREAD
        { yyrv = Ast.VisibilityPublicread(getPos(yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypVisibilityModifier();
    }

    private int yyr11() { // VisibilityModifier : /* empty */
        { yyrv = Ast.VisibilityDefault(); }
        yysv[yysp-=0] = yyrv;
        return yypVisibilityModifier();
    }

    private int yypVisibilityModifier() {
        switch (yyst[yysp-1]) {
            case 84: return 135;
            default: return 320;
        }
    }

    private int yyerr(int e, int n) {
        yyerrno = e;
        return n;
    }
    protected String[] yyerrmsgs = {
        "unexpected closing parenthesis",
        "unexpected opening parenthesis",
        "missing closing paranthesis"
    };


                        WurstScriptScanner lexer;

        protected String currentFile;

        public WurstParser(String currentFile, WurstScriptScanner lexer) {
                this.currentFile = currentFile;
                this.lexer = lexer;
                yylex();
        }

        protected Symbol current;

        private int get() {
                if (current == null) throw new Error("current symbol is null");
            return current.type;
    }

    private Symbol getValue() {
                if (current == null) throw new Error("current symbol is null");
            return current;
    }

        private int yylex() {
                try {
                        current = lexer.yylex();
                } catch (IOException e) {
                        throw new Error(e);
                }
                return current.type;
        }

        protected void yyerror(String msg) {
                System.out.println(msg);
        }

        private WPos getPos(Object o) {
                if (o instanceof Symbol) {
                        Symbol s = (Symbol) o;
                        return Ast.WPos(currentFile, s.line, s.column);
                }
                throw new Error();
        }

        private int getPos(SortPos p) {
                return 0; // compile error, incompatible
        }

        private String getString(Object o) {
                return (String) ((Symbol) o).value;
        }
        
        private Integer getInt(Object o) {
                return (Integer) ((Symbol) o).value;
        }
        
        private Double getDouble(Object o) {
                return (Double) ((Symbol) o).value;
        }
        
        
        protected Object getReturn() {
                return yyrv;
        }
        

}
