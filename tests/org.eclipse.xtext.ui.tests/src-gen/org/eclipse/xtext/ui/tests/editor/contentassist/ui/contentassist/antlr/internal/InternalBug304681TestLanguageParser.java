package org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug304681TestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBug304681TestLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'1'", "'2'", "'package'", "'object'", "'{'", "'}'", "'extends'", "'shortDescription'", "'longDescription'", "'serialUID'", "'before'", "'after'", "'optionalLoop'", "'mandatoryLoop'", "'Attribute'", "'Reference'", "'constraint'", "'parameters'", "'message'", "'enabled'", "'abstract'", "'cloneable'", "'*'", "'required'", "'technical'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalBug304681TestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBug304681TestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBug304681TestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBug304681TestLanguage.g"; }


     
     	private Bug304681TestLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(Bug304681TestLanguageGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // InternalBug304681TestLanguage.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalBug304681TestLanguage.g:62:1: ( ruleModel EOF )
            // InternalBug304681TestLanguage.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBug304681TestLanguage.g:70:1: ruleModel : ( ( rule__Model__Alternatives ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:74:2: ( ( ( rule__Model__Alternatives ) ) )
            // InternalBug304681TestLanguage.g:75:1: ( ( rule__Model__Alternatives ) )
            {
            // InternalBug304681TestLanguage.g:75:1: ( ( rule__Model__Alternatives ) )
            // InternalBug304681TestLanguage.g:76:1: ( rule__Model__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAlternatives()); 
            }
            // InternalBug304681TestLanguage.g:77:1: ( rule__Model__Alternatives )
            // InternalBug304681TestLanguage.g:77:2: rule__Model__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Model__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackageDefinition"
    // InternalBug304681TestLanguage.g:89:1: entryRulePackageDefinition : rulePackageDefinition EOF ;
    public final void entryRulePackageDefinition() throws RecognitionException {
        try {
            // InternalBug304681TestLanguage.g:90:1: ( rulePackageDefinition EOF )
            // InternalBug304681TestLanguage.g:91:1: rulePackageDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulePackageDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageDefinition"


    // $ANTLR start "rulePackageDefinition"
    // InternalBug304681TestLanguage.g:98:1: rulePackageDefinition : ( ( rule__PackageDefinition__Group__0 ) ) ;
    public final void rulePackageDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:102:2: ( ( ( rule__PackageDefinition__Group__0 ) ) )
            // InternalBug304681TestLanguage.g:103:1: ( ( rule__PackageDefinition__Group__0 ) )
            {
            // InternalBug304681TestLanguage.g:103:1: ( ( rule__PackageDefinition__Group__0 ) )
            // InternalBug304681TestLanguage.g:104:1: ( rule__PackageDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getGroup()); 
            }
            // InternalBug304681TestLanguage.g:105:1: ( rule__PackageDefinition__Group__0 )
            // InternalBug304681TestLanguage.g:105:2: rule__PackageDefinition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PackageDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDefinition"


    // $ANTLR start "entryRuleObject"
    // InternalBug304681TestLanguage.g:117:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalBug304681TestLanguage.g:118:1: ( ruleObject EOF )
            // InternalBug304681TestLanguage.g:119:1: ruleObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalBug304681TestLanguage.g:126:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:130:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalBug304681TestLanguage.g:131:1: ( ( rule__Object__Group__0 ) )
            {
            // InternalBug304681TestLanguage.g:131:1: ( ( rule__Object__Group__0 ) )
            // InternalBug304681TestLanguage.g:132:1: ( rule__Object__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getGroup()); 
            }
            // InternalBug304681TestLanguage.g:133:1: ( rule__Object__Group__0 )
            // InternalBug304681TestLanguage.g:133:2: rule__Object__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleFeature"
    // InternalBug304681TestLanguage.g:145:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalBug304681TestLanguage.g:146:1: ( ruleFeature EOF )
            // InternalBug304681TestLanguage.g:147:1: ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalBug304681TestLanguage.g:154:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:158:2: ( ( ( rule__Feature__Alternatives ) ) )
            // InternalBug304681TestLanguage.g:159:1: ( ( rule__Feature__Alternatives ) )
            {
            // InternalBug304681TestLanguage.g:159:1: ( ( rule__Feature__Alternatives ) )
            // InternalBug304681TestLanguage.g:160:1: ( rule__Feature__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getAlternatives()); 
            }
            // InternalBug304681TestLanguage.g:161:1: ( rule__Feature__Alternatives )
            // InternalBug304681TestLanguage.g:161:2: rule__Feature__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Feature__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleAttribute"
    // InternalBug304681TestLanguage.g:173:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalBug304681TestLanguage.g:174:1: ( ruleAttribute EOF )
            // InternalBug304681TestLanguage.g:175:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalBug304681TestLanguage.g:182:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:186:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalBug304681TestLanguage.g:187:1: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalBug304681TestLanguage.g:187:1: ( ( rule__Attribute__Group__0 ) )
            // InternalBug304681TestLanguage.g:188:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // InternalBug304681TestLanguage.g:189:1: ( rule__Attribute__Group__0 )
            // InternalBug304681TestLanguage.g:189:2: rule__Attribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleReference"
    // InternalBug304681TestLanguage.g:201:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalBug304681TestLanguage.g:202:1: ( ruleReference EOF )
            // InternalBug304681TestLanguage.g:203:1: ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalBug304681TestLanguage.g:210:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:214:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalBug304681TestLanguage.g:215:1: ( ( rule__Reference__Group__0 ) )
            {
            // InternalBug304681TestLanguage.g:215:1: ( ( rule__Reference__Group__0 ) )
            // InternalBug304681TestLanguage.g:216:1: ( rule__Reference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGroup()); 
            }
            // InternalBug304681TestLanguage.g:217:1: ( rule__Reference__Group__0 )
            // InternalBug304681TestLanguage.g:217:2: rule__Reference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRulePackageDefinition2"
    // InternalBug304681TestLanguage.g:229:1: entryRulePackageDefinition2 : rulePackageDefinition2 EOF ;
    public final void entryRulePackageDefinition2() throws RecognitionException {
        try {
            // InternalBug304681TestLanguage.g:230:1: ( rulePackageDefinition2 EOF )
            // InternalBug304681TestLanguage.g:231:1: rulePackageDefinition2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinition2Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulePackageDefinition2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinition2Rule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageDefinition2"


    // $ANTLR start "rulePackageDefinition2"
    // InternalBug304681TestLanguage.g:238:1: rulePackageDefinition2 : ( ( rule__PackageDefinition2__Group__0 ) ) ;
    public final void rulePackageDefinition2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:242:2: ( ( ( rule__PackageDefinition2__Group__0 ) ) )
            // InternalBug304681TestLanguage.g:243:1: ( ( rule__PackageDefinition2__Group__0 ) )
            {
            // InternalBug304681TestLanguage.g:243:1: ( ( rule__PackageDefinition2__Group__0 ) )
            // InternalBug304681TestLanguage.g:244:1: ( rule__PackageDefinition2__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinition2Access().getGroup()); 
            }
            // InternalBug304681TestLanguage.g:245:1: ( rule__PackageDefinition2__Group__0 )
            // InternalBug304681TestLanguage.g:245:2: rule__PackageDefinition2__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PackageDefinition2__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinition2Access().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDefinition2"


    // $ANTLR start "entryRuleObject2"
    // InternalBug304681TestLanguage.g:257:1: entryRuleObject2 : ruleObject2 EOF ;
    public final void entryRuleObject2() throws RecognitionException {
        try {
            // InternalBug304681TestLanguage.g:258:1: ( ruleObject2 EOF )
            // InternalBug304681TestLanguage.g:259:1: ruleObject2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleObject2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Rule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObject2"


    // $ANTLR start "ruleObject2"
    // InternalBug304681TestLanguage.g:266:1: ruleObject2 : ( ( rule__Object2__Group__0 ) ) ;
    public final void ruleObject2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:270:2: ( ( ( rule__Object2__Group__0 ) ) )
            // InternalBug304681TestLanguage.g:271:1: ( ( rule__Object2__Group__0 ) )
            {
            // InternalBug304681TestLanguage.g:271:1: ( ( rule__Object2__Group__0 ) )
            // InternalBug304681TestLanguage.g:272:1: ( rule__Object2__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getGroup()); 
            }
            // InternalBug304681TestLanguage.g:273:1: ( rule__Object2__Group__0 )
            // InternalBug304681TestLanguage.g:273:2: rule__Object2__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObject2"


    // $ANTLR start "entryRuleFeature2"
    // InternalBug304681TestLanguage.g:285:1: entryRuleFeature2 : ruleFeature2 EOF ;
    public final void entryRuleFeature2() throws RecognitionException {
        try {
            // InternalBug304681TestLanguage.g:286:1: ( ruleFeature2 EOF )
            // InternalBug304681TestLanguage.g:287:1: ruleFeature2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature2Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFeature2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature2Rule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature2"


    // $ANTLR start "ruleFeature2"
    // InternalBug304681TestLanguage.g:294:1: ruleFeature2 : ( ( rule__Feature2__Alternatives ) ) ;
    public final void ruleFeature2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:298:2: ( ( ( rule__Feature2__Alternatives ) ) )
            // InternalBug304681TestLanguage.g:299:1: ( ( rule__Feature2__Alternatives ) )
            {
            // InternalBug304681TestLanguage.g:299:1: ( ( rule__Feature2__Alternatives ) )
            // InternalBug304681TestLanguage.g:300:1: ( rule__Feature2__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature2Access().getAlternatives()); 
            }
            // InternalBug304681TestLanguage.g:301:1: ( rule__Feature2__Alternatives )
            // InternalBug304681TestLanguage.g:301:2: rule__Feature2__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Feature2__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature2Access().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature2"


    // $ANTLR start "entryRuleAttribute2"
    // InternalBug304681TestLanguage.g:313:1: entryRuleAttribute2 : ruleAttribute2 EOF ;
    public final void entryRuleAttribute2() throws RecognitionException {
        try {
            // InternalBug304681TestLanguage.g:314:1: ( ruleAttribute2 EOF )
            // InternalBug304681TestLanguage.g:315:1: ruleAttribute2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttribute2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Rule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute2"


    // $ANTLR start "ruleAttribute2"
    // InternalBug304681TestLanguage.g:322:1: ruleAttribute2 : ( ( rule__Attribute2__Group__0 ) ) ;
    public final void ruleAttribute2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:326:2: ( ( ( rule__Attribute2__Group__0 ) ) )
            // InternalBug304681TestLanguage.g:327:1: ( ( rule__Attribute2__Group__0 ) )
            {
            // InternalBug304681TestLanguage.g:327:1: ( ( rule__Attribute2__Group__0 ) )
            // InternalBug304681TestLanguage.g:328:1: ( rule__Attribute2__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getGroup()); 
            }
            // InternalBug304681TestLanguage.g:329:1: ( rule__Attribute2__Group__0 )
            // InternalBug304681TestLanguage.g:329:2: rule__Attribute2__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute2"


    // $ANTLR start "entryRuleReference2"
    // InternalBug304681TestLanguage.g:341:1: entryRuleReference2 : ruleReference2 EOF ;
    public final void entryRuleReference2() throws RecognitionException {
        try {
            // InternalBug304681TestLanguage.g:342:1: ( ruleReference2 EOF )
            // InternalBug304681TestLanguage.g:343:1: ruleReference2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleReference2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Rule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference2"


    // $ANTLR start "ruleReference2"
    // InternalBug304681TestLanguage.g:350:1: ruleReference2 : ( ( rule__Reference2__Group__0 ) ) ;
    public final void ruleReference2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:354:2: ( ( ( rule__Reference2__Group__0 ) ) )
            // InternalBug304681TestLanguage.g:355:1: ( ( rule__Reference2__Group__0 ) )
            {
            // InternalBug304681TestLanguage.g:355:1: ( ( rule__Reference2__Group__0 ) )
            // InternalBug304681TestLanguage.g:356:1: ( rule__Reference2__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getGroup()); 
            }
            // InternalBug304681TestLanguage.g:357:1: ( rule__Reference2__Group__0 )
            // InternalBug304681TestLanguage.g:357:2: rule__Reference2__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference2"


    // $ANTLR start "entryRuleConstraintDefinition"
    // InternalBug304681TestLanguage.g:369:1: entryRuleConstraintDefinition : ruleConstraintDefinition EOF ;
    public final void entryRuleConstraintDefinition() throws RecognitionException {
        try {
            // InternalBug304681TestLanguage.g:370:1: ( ruleConstraintDefinition EOF )
            // InternalBug304681TestLanguage.g:371:1: ruleConstraintDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConstraintDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintDefinitionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraintDefinition"


    // $ANTLR start "ruleConstraintDefinition"
    // InternalBug304681TestLanguage.g:378:1: ruleConstraintDefinition : ( ( rule__ConstraintDefinition__Group__0 ) ) ;
    public final void ruleConstraintDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:382:2: ( ( ( rule__ConstraintDefinition__Group__0 ) ) )
            // InternalBug304681TestLanguage.g:383:1: ( ( rule__ConstraintDefinition__Group__0 ) )
            {
            // InternalBug304681TestLanguage.g:383:1: ( ( rule__ConstraintDefinition__Group__0 ) )
            // InternalBug304681TestLanguage.g:384:1: ( rule__ConstraintDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintDefinitionAccess().getGroup()); 
            }
            // InternalBug304681TestLanguage.g:385:1: ( rule__ConstraintDefinition__Group__0 )
            // InternalBug304681TestLanguage.g:385:2: rule__ConstraintDefinition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintDefinition"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalBug304681TestLanguage.g:397:1: rule__Model__Alternatives : ( ( ( rule__Model__Group_0__0 ) ) | ( ( rule__Model__Group_1__0 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:401:1: ( ( ( rule__Model__Group_0__0 ) ) | ( ( rule__Model__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBug304681TestLanguage.g:402:1: ( ( rule__Model__Group_0__0 ) )
                    {
                    // InternalBug304681TestLanguage.g:402:1: ( ( rule__Model__Group_0__0 ) )
                    // InternalBug304681TestLanguage.g:403:1: ( rule__Model__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getGroup_0()); 
                    }
                    // InternalBug304681TestLanguage.g:404:1: ( rule__Model__Group_0__0 )
                    // InternalBug304681TestLanguage.g:404:2: rule__Model__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Model__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBug304681TestLanguage.g:408:6: ( ( rule__Model__Group_1__0 ) )
                    {
                    // InternalBug304681TestLanguage.g:408:6: ( ( rule__Model__Group_1__0 ) )
                    // InternalBug304681TestLanguage.g:409:1: ( rule__Model__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getGroup_1()); 
                    }
                    // InternalBug304681TestLanguage.g:410:1: ( rule__Model__Group_1__0 )
                    // InternalBug304681TestLanguage.g:410:2: rule__Model__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Model__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Object__Alternatives_0"
    // InternalBug304681TestLanguage.g:419:1: rule__Object__Alternatives_0 : ( ( ( rule__Object__EnabledAssignment_0_0 ) ) | ( ( rule__Object__AbstractAssignment_0_1 ) ) );
    public final void rule__Object__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:423:1: ( ( ( rule__Object__EnabledAssignment_0_0 ) ) | ( ( rule__Object__AbstractAssignment_0_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                alt2=1;
            }
            else if ( (LA2_0==32) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBug304681TestLanguage.g:424:1: ( ( rule__Object__EnabledAssignment_0_0 ) )
                    {
                    // InternalBug304681TestLanguage.g:424:1: ( ( rule__Object__EnabledAssignment_0_0 ) )
                    // InternalBug304681TestLanguage.g:425:1: ( rule__Object__EnabledAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjectAccess().getEnabledAssignment_0_0()); 
                    }
                    // InternalBug304681TestLanguage.g:426:1: ( rule__Object__EnabledAssignment_0_0 )
                    // InternalBug304681TestLanguage.g:426:2: rule__Object__EnabledAssignment_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__EnabledAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjectAccess().getEnabledAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBug304681TestLanguage.g:430:6: ( ( rule__Object__AbstractAssignment_0_1 ) )
                    {
                    // InternalBug304681TestLanguage.g:430:6: ( ( rule__Object__AbstractAssignment_0_1 ) )
                    // InternalBug304681TestLanguage.g:431:1: ( rule__Object__AbstractAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjectAccess().getAbstractAssignment_0_1()); 
                    }
                    // InternalBug304681TestLanguage.g:432:1: ( rule__Object__AbstractAssignment_0_1 )
                    // InternalBug304681TestLanguage.g:432:2: rule__Object__AbstractAssignment_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__AbstractAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjectAccess().getAbstractAssignment_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Alternatives_0"


    // $ANTLR start "rule__Feature__Alternatives"
    // InternalBug304681TestLanguage.g:441:1: rule__Feature__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:445:1: ( ( ruleAttribute ) | ( ruleReference ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBug304681TestLanguage.g:446:1: ( ruleAttribute )
                    {
                    // InternalBug304681TestLanguage.g:446:1: ( ruleAttribute )
                    // InternalBug304681TestLanguage.g:447:1: ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAttribute();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBug304681TestLanguage.g:452:6: ( ruleReference )
                    {
                    // InternalBug304681TestLanguage.g:452:6: ( ruleReference )
                    // InternalBug304681TestLanguage.g:453:1: ruleReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__Reference__Alternatives_4"
    // InternalBug304681TestLanguage.g:463:1: rule__Reference__Alternatives_4 : ( ( ( rule__Reference__Group_4_0__0 ) ) | ( ';' ) );
    public final void rule__Reference__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:467:1: ( ( ( rule__Reference__Group_4_0__0 ) ) | ( ';' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBug304681TestLanguage.g:468:1: ( ( rule__Reference__Group_4_0__0 ) )
                    {
                    // InternalBug304681TestLanguage.g:468:1: ( ( rule__Reference__Group_4_0__0 ) )
                    // InternalBug304681TestLanguage.g:469:1: ( rule__Reference__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReferenceAccess().getGroup_4_0()); 
                    }
                    // InternalBug304681TestLanguage.g:470:1: ( rule__Reference__Group_4_0__0 )
                    // InternalBug304681TestLanguage.g:470:2: rule__Reference__Group_4_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Reference__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReferenceAccess().getGroup_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBug304681TestLanguage.g:474:6: ( ';' )
                    {
                    // InternalBug304681TestLanguage.g:474:6: ( ';' )
                    // InternalBug304681TestLanguage.g:475:1: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReferenceAccess().getSemicolonKeyword_4_1()); 
                    }
                    match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReferenceAccess().getSemicolonKeyword_4_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Alternatives_4"


    // $ANTLR start "rule__Object2__Alternatives_0"
    // InternalBug304681TestLanguage.g:487:1: rule__Object2__Alternatives_0 : ( ( ( rule__Object2__EnabledAssignment_0_0 ) ) | ( ( rule__Object2__AbstractAssignment_0_1 ) ) );
    public final void rule__Object2__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:491:1: ( ( ( rule__Object2__EnabledAssignment_0_0 ) ) | ( ( rule__Object2__AbstractAssignment_0_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            else if ( (LA5_0==32) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBug304681TestLanguage.g:492:1: ( ( rule__Object2__EnabledAssignment_0_0 ) )
                    {
                    // InternalBug304681TestLanguage.g:492:1: ( ( rule__Object2__EnabledAssignment_0_0 ) )
                    // InternalBug304681TestLanguage.g:493:1: ( rule__Object2__EnabledAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObject2Access().getEnabledAssignment_0_0()); 
                    }
                    // InternalBug304681TestLanguage.g:494:1: ( rule__Object2__EnabledAssignment_0_0 )
                    // InternalBug304681TestLanguage.g:494:2: rule__Object2__EnabledAssignment_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object2__EnabledAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObject2Access().getEnabledAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBug304681TestLanguage.g:498:6: ( ( rule__Object2__AbstractAssignment_0_1 ) )
                    {
                    // InternalBug304681TestLanguage.g:498:6: ( ( rule__Object2__AbstractAssignment_0_1 ) )
                    // InternalBug304681TestLanguage.g:499:1: ( rule__Object2__AbstractAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObject2Access().getAbstractAssignment_0_1()); 
                    }
                    // InternalBug304681TestLanguage.g:500:1: ( rule__Object2__AbstractAssignment_0_1 )
                    // InternalBug304681TestLanguage.g:500:2: rule__Object2__AbstractAssignment_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object2__AbstractAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObject2Access().getAbstractAssignment_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Alternatives_0"


    // $ANTLR start "rule__Feature2__Alternatives"
    // InternalBug304681TestLanguage.g:509:1: rule__Feature2__Alternatives : ( ( ruleAttribute2 ) | ( ruleReference2 ) );
    public final void rule__Feature2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:513:1: ( ( ruleAttribute2 ) | ( ruleReference2 ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            else if ( (LA6_0==27) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBug304681TestLanguage.g:514:1: ( ruleAttribute2 )
                    {
                    // InternalBug304681TestLanguage.g:514:1: ( ruleAttribute2 )
                    // InternalBug304681TestLanguage.g:515:1: ruleAttribute2
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeature2Access().getAttribute2ParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAttribute2();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeature2Access().getAttribute2ParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBug304681TestLanguage.g:520:6: ( ruleReference2 )
                    {
                    // InternalBug304681TestLanguage.g:520:6: ( ruleReference2 )
                    // InternalBug304681TestLanguage.g:521:1: ruleReference2
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeature2Access().getReference2ParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleReference2();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeature2Access().getReference2ParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature2__Alternatives"


    // $ANTLR start "rule__Attribute2__Alternatives_3"
    // InternalBug304681TestLanguage.g:531:1: rule__Attribute2__Alternatives_3 : ( ( ( rule__Attribute2__Group_3_0__0 ) ) | ( ';' ) );
    public final void rule__Attribute2__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:535:1: ( ( ( rule__Attribute2__Group_3_0__0 ) ) | ( ';' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==11) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBug304681TestLanguage.g:536:1: ( ( rule__Attribute2__Group_3_0__0 ) )
                    {
                    // InternalBug304681TestLanguage.g:536:1: ( ( rule__Attribute2__Group_3_0__0 ) )
                    // InternalBug304681TestLanguage.g:537:1: ( rule__Attribute2__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttribute2Access().getGroup_3_0()); 
                    }
                    // InternalBug304681TestLanguage.g:538:1: ( rule__Attribute2__Group_3_0__0 )
                    // InternalBug304681TestLanguage.g:538:2: rule__Attribute2__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute2__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttribute2Access().getGroup_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBug304681TestLanguage.g:542:6: ( ';' )
                    {
                    // InternalBug304681TestLanguage.g:542:6: ( ';' )
                    // InternalBug304681TestLanguage.g:543:1: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttribute2Access().getSemicolonKeyword_3_1()); 
                    }
                    match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttribute2Access().getSemicolonKeyword_3_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Alternatives_3"


    // $ANTLR start "rule__Reference2__Alternatives_4"
    // InternalBug304681TestLanguage.g:555:1: rule__Reference2__Alternatives_4 : ( ( ( rule__Reference2__Group_4_0__0 ) ) | ( ';' ) );
    public final void rule__Reference2__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:559:1: ( ( ( rule__Reference2__Group_4_0__0 ) ) | ( ';' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==11) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBug304681TestLanguage.g:560:1: ( ( rule__Reference2__Group_4_0__0 ) )
                    {
                    // InternalBug304681TestLanguage.g:560:1: ( ( rule__Reference2__Group_4_0__0 ) )
                    // InternalBug304681TestLanguage.g:561:1: ( rule__Reference2__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReference2Access().getGroup_4_0()); 
                    }
                    // InternalBug304681TestLanguage.g:562:1: ( rule__Reference2__Group_4_0__0 )
                    // InternalBug304681TestLanguage.g:562:2: rule__Reference2__Group_4_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Reference2__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReference2Access().getGroup_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBug304681TestLanguage.g:566:6: ( ';' )
                    {
                    // InternalBug304681TestLanguage.g:566:6: ( ';' )
                    // InternalBug304681TestLanguage.g:567:1: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReference2Access().getSemicolonKeyword_4_1()); 
                    }
                    match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReference2Access().getSemicolonKeyword_4_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Alternatives_4"


    // $ANTLR start "rule__Model__Group_0__0"
    // InternalBug304681TestLanguage.g:581:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:585:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // InternalBug304681TestLanguage.g:586:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Model__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Model__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__0"


    // $ANTLR start "rule__Model__Group_0__0__Impl"
    // InternalBug304681TestLanguage.g:593:1: rule__Model__Group_0__0__Impl : ( '1' ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:597:1: ( ( '1' ) )
            // InternalBug304681TestLanguage.g:598:1: ( '1' )
            {
            // InternalBug304681TestLanguage.g:598:1: ( '1' )
            // InternalBug304681TestLanguage.g:599:1: '1'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDigitOneKeyword_0_0()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getDigitOneKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__0__Impl"


    // $ANTLR start "rule__Model__Group_0__1"
    // InternalBug304681TestLanguage.g:612:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:616:1: ( rule__Model__Group_0__1__Impl )
            // InternalBug304681TestLanguage.g:617:2: rule__Model__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Model__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1"


    // $ANTLR start "rule__Model__Group_0__1__Impl"
    // InternalBug304681TestLanguage.g:623:1: rule__Model__Group_0__1__Impl : ( ( rule__Model__DefinitionAssignment_0_1 ) ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:627:1: ( ( ( rule__Model__DefinitionAssignment_0_1 ) ) )
            // InternalBug304681TestLanguage.g:628:1: ( ( rule__Model__DefinitionAssignment_0_1 ) )
            {
            // InternalBug304681TestLanguage.g:628:1: ( ( rule__Model__DefinitionAssignment_0_1 ) )
            // InternalBug304681TestLanguage.g:629:1: ( rule__Model__DefinitionAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDefinitionAssignment_0_1()); 
            }
            // InternalBug304681TestLanguage.g:630:1: ( rule__Model__DefinitionAssignment_0_1 )
            // InternalBug304681TestLanguage.g:630:2: rule__Model__DefinitionAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Model__DefinitionAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getDefinitionAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1__Impl"


    // $ANTLR start "rule__Model__Group_1__0"
    // InternalBug304681TestLanguage.g:644:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:648:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // InternalBug304681TestLanguage.g:649:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Model__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Model__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__0"


    // $ANTLR start "rule__Model__Group_1__0__Impl"
    // InternalBug304681TestLanguage.g:656:1: rule__Model__Group_1__0__Impl : ( '2' ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:660:1: ( ( '2' ) )
            // InternalBug304681TestLanguage.g:661:1: ( '2' )
            {
            // InternalBug304681TestLanguage.g:661:1: ( '2' )
            // InternalBug304681TestLanguage.g:662:1: '2'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDigitTwoKeyword_1_0()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getDigitTwoKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__0__Impl"


    // $ANTLR start "rule__Model__Group_1__1"
    // InternalBug304681TestLanguage.g:675:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:679:1: ( rule__Model__Group_1__1__Impl )
            // InternalBug304681TestLanguage.g:680:2: rule__Model__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Model__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__1"


    // $ANTLR start "rule__Model__Group_1__1__Impl"
    // InternalBug304681TestLanguage.g:686:1: rule__Model__Group_1__1__Impl : ( ( rule__Model__DefinitionAssignment_1_1 ) ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:690:1: ( ( ( rule__Model__DefinitionAssignment_1_1 ) ) )
            // InternalBug304681TestLanguage.g:691:1: ( ( rule__Model__DefinitionAssignment_1_1 ) )
            {
            // InternalBug304681TestLanguage.g:691:1: ( ( rule__Model__DefinitionAssignment_1_1 ) )
            // InternalBug304681TestLanguage.g:692:1: ( rule__Model__DefinitionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDefinitionAssignment_1_1()); 
            }
            // InternalBug304681TestLanguage.g:693:1: ( rule__Model__DefinitionAssignment_1_1 )
            // InternalBug304681TestLanguage.g:693:2: rule__Model__DefinitionAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Model__DefinitionAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getDefinitionAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__1__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__0"
    // InternalBug304681TestLanguage.g:707:1: rule__PackageDefinition__Group__0 : rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 ;
    public final void rule__PackageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:711:1: ( rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 )
            // InternalBug304681TestLanguage.g:712:2: rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__PackageDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PackageDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__0"


    // $ANTLR start "rule__PackageDefinition__Group__0__Impl"
    // InternalBug304681TestLanguage.g:719:1: rule__PackageDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PackageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:723:1: ( ( () ) )
            // InternalBug304681TestLanguage.g:724:1: ( () )
            {
            // InternalBug304681TestLanguage.g:724:1: ( () )
            // InternalBug304681TestLanguage.g:725:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getPackageDefinitionAction_0()); 
            }
            // InternalBug304681TestLanguage.g:726:1: ()
            // InternalBug304681TestLanguage.g:728:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getPackageDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__0__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__1"
    // InternalBug304681TestLanguage.g:738:1: rule__PackageDefinition__Group__1 : rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 ;
    public final void rule__PackageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:742:1: ( rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 )
            // InternalBug304681TestLanguage.g:743:2: rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__PackageDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PackageDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__1"


    // $ANTLR start "rule__PackageDefinition__Group__1__Impl"
    // InternalBug304681TestLanguage.g:750:1: rule__PackageDefinition__Group__1__Impl : ( 'package' ) ;
    public final void rule__PackageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:754:1: ( ( 'package' ) )
            // InternalBug304681TestLanguage.g:755:1: ( 'package' )
            {
            // InternalBug304681TestLanguage.g:755:1: ( 'package' )
            // InternalBug304681TestLanguage.g:756:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getPackageKeyword_1()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getPackageKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__1__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__2"
    // InternalBug304681TestLanguage.g:769:1: rule__PackageDefinition__Group__2 : rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 ;
    public final void rule__PackageDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:773:1: ( rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 )
            // InternalBug304681TestLanguage.g:774:2: rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__PackageDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PackageDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__2"


    // $ANTLR start "rule__PackageDefinition__Group__2__Impl"
    // InternalBug304681TestLanguage.g:781:1: rule__PackageDefinition__Group__2__Impl : ( ( rule__PackageDefinition__NamespaceAssignment_2 ) ) ;
    public final void rule__PackageDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:785:1: ( ( ( rule__PackageDefinition__NamespaceAssignment_2 ) ) )
            // InternalBug304681TestLanguage.g:786:1: ( ( rule__PackageDefinition__NamespaceAssignment_2 ) )
            {
            // InternalBug304681TestLanguage.g:786:1: ( ( rule__PackageDefinition__NamespaceAssignment_2 ) )
            // InternalBug304681TestLanguage.g:787:1: ( rule__PackageDefinition__NamespaceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getNamespaceAssignment_2()); 
            }
            // InternalBug304681TestLanguage.g:788:1: ( rule__PackageDefinition__NamespaceAssignment_2 )
            // InternalBug304681TestLanguage.g:788:2: rule__PackageDefinition__NamespaceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PackageDefinition__NamespaceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getNamespaceAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__2__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__3"
    // InternalBug304681TestLanguage.g:798:1: rule__PackageDefinition__Group__3 : rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 ;
    public final void rule__PackageDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:802:1: ( rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 )
            // InternalBug304681TestLanguage.g:803:2: rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__PackageDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PackageDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__3"


    // $ANTLR start "rule__PackageDefinition__Group__3__Impl"
    // InternalBug304681TestLanguage.g:810:1: rule__PackageDefinition__Group__3__Impl : ( ';' ) ;
    public final void rule__PackageDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:814:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:815:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:815:1: ( ';' )
            // InternalBug304681TestLanguage.g:816:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getSemicolonKeyword_3()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__3__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__4"
    // InternalBug304681TestLanguage.g:829:1: rule__PackageDefinition__Group__4 : rule__PackageDefinition__Group__4__Impl ;
    public final void rule__PackageDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:833:1: ( rule__PackageDefinition__Group__4__Impl )
            // InternalBug304681TestLanguage.g:834:2: rule__PackageDefinition__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PackageDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__4"


    // $ANTLR start "rule__PackageDefinition__Group__4__Impl"
    // InternalBug304681TestLanguage.g:840:1: rule__PackageDefinition__Group__4__Impl : ( ( rule__PackageDefinition__ContentsAssignment_4 )* ) ;
    public final void rule__PackageDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:844:1: ( ( ( rule__PackageDefinition__ContentsAssignment_4 )* ) )
            // InternalBug304681TestLanguage.g:845:1: ( ( rule__PackageDefinition__ContentsAssignment_4 )* )
            {
            // InternalBug304681TestLanguage.g:845:1: ( ( rule__PackageDefinition__ContentsAssignment_4 )* )
            // InternalBug304681TestLanguage.g:846:1: ( rule__PackageDefinition__ContentsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getContentsAssignment_4()); 
            }
            // InternalBug304681TestLanguage.g:847:1: ( rule__PackageDefinition__ContentsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15||(LA9_0>=31 && LA9_0<=32)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBug304681TestLanguage.g:847:2: rule__PackageDefinition__ContentsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__PackageDefinition__ContentsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getContentsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__4__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // InternalBug304681TestLanguage.g:867:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:871:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalBug304681TestLanguage.g:872:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Object__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalBug304681TestLanguage.g:879:1: rule__Object__Group__0__Impl : ( ( rule__Object__Alternatives_0 )? ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:883:1: ( ( ( rule__Object__Alternatives_0 )? ) )
            // InternalBug304681TestLanguage.g:884:1: ( ( rule__Object__Alternatives_0 )? )
            {
            // InternalBug304681TestLanguage.g:884:1: ( ( rule__Object__Alternatives_0 )? )
            // InternalBug304681TestLanguage.g:885:1: ( rule__Object__Alternatives_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getAlternatives_0()); 
            }
            // InternalBug304681TestLanguage.g:886:1: ( rule__Object__Alternatives_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=31 && LA10_0<=32)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBug304681TestLanguage.g:886:2: rule__Object__Alternatives_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__Alternatives_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // InternalBug304681TestLanguage.g:896:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:900:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalBug304681TestLanguage.g:901:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Object__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalBug304681TestLanguage.g:908:1: rule__Object__Group__1__Impl : ( 'object' ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:912:1: ( ( 'object' ) )
            // InternalBug304681TestLanguage.g:913:1: ( 'object' )
            {
            // InternalBug304681TestLanguage.g:913:1: ( 'object' )
            // InternalBug304681TestLanguage.g:914:1: 'object'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getObjectKeyword_1()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getObjectKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__2"
    // InternalBug304681TestLanguage.g:927:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:931:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalBug304681TestLanguage.g:932:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Object__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2"


    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalBug304681TestLanguage.g:939:1: rule__Object__Group__2__Impl : ( ( rule__Object__NameAssignment_2 ) ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:943:1: ( ( ( rule__Object__NameAssignment_2 ) ) )
            // InternalBug304681TestLanguage.g:944:1: ( ( rule__Object__NameAssignment_2 ) )
            {
            // InternalBug304681TestLanguage.g:944:1: ( ( rule__Object__NameAssignment_2 ) )
            // InternalBug304681TestLanguage.g:945:1: ( rule__Object__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getNameAssignment_2()); 
            }
            // InternalBug304681TestLanguage.g:946:1: ( rule__Object__NameAssignment_2 )
            // InternalBug304681TestLanguage.g:946:2: rule__Object__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2__Impl"


    // $ANTLR start "rule__Object__Group__3"
    // InternalBug304681TestLanguage.g:956:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:960:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalBug304681TestLanguage.g:961:2: rule__Object__Group__3__Impl rule__Object__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Object__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3"


    // $ANTLR start "rule__Object__Group__3__Impl"
    // InternalBug304681TestLanguage.g:968:1: rule__Object__Group__3__Impl : ( ( rule__Object__Group_3__0 )? ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:972:1: ( ( ( rule__Object__Group_3__0 )? ) )
            // InternalBug304681TestLanguage.g:973:1: ( ( rule__Object__Group_3__0 )? )
            {
            // InternalBug304681TestLanguage.g:973:1: ( ( rule__Object__Group_3__0 )? )
            // InternalBug304681TestLanguage.g:974:1: ( rule__Object__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getGroup_3()); 
            }
            // InternalBug304681TestLanguage.g:975:1: ( rule__Object__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBug304681TestLanguage.g:975:2: rule__Object__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3__Impl"


    // $ANTLR start "rule__Object__Group__4"
    // InternalBug304681TestLanguage.g:985:1: rule__Object__Group__4 : rule__Object__Group__4__Impl rule__Object__Group__5 ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:989:1: ( rule__Object__Group__4__Impl rule__Object__Group__5 )
            // InternalBug304681TestLanguage.g:990:2: rule__Object__Group__4__Impl rule__Object__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Object__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4"


    // $ANTLR start "rule__Object__Group__4__Impl"
    // InternalBug304681TestLanguage.g:997:1: rule__Object__Group__4__Impl : ( '{' ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1001:1: ( ( '{' ) )
            // InternalBug304681TestLanguage.g:1002:1: ( '{' )
            {
            // InternalBug304681TestLanguage.g:1002:1: ( '{' )
            // InternalBug304681TestLanguage.g:1003:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4__Impl"


    // $ANTLR start "rule__Object__Group__5"
    // InternalBug304681TestLanguage.g:1016:1: rule__Object__Group__5 : rule__Object__Group__5__Impl rule__Object__Group__6 ;
    public final void rule__Object__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1020:1: ( rule__Object__Group__5__Impl rule__Object__Group__6 )
            // InternalBug304681TestLanguage.g:1021:2: rule__Object__Group__5__Impl rule__Object__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Object__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__5"


    // $ANTLR start "rule__Object__Group__5__Impl"
    // InternalBug304681TestLanguage.g:1028:1: rule__Object__Group__5__Impl : ( ( rule__Object__UnorderedGroup_5 ) ) ;
    public final void rule__Object__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1032:1: ( ( ( rule__Object__UnorderedGroup_5 ) ) )
            // InternalBug304681TestLanguage.g:1033:1: ( ( rule__Object__UnorderedGroup_5 ) )
            {
            // InternalBug304681TestLanguage.g:1033:1: ( ( rule__Object__UnorderedGroup_5 ) )
            // InternalBug304681TestLanguage.g:1034:1: ( rule__Object__UnorderedGroup_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getUnorderedGroup_5()); 
            }
            // InternalBug304681TestLanguage.g:1035:1: ( rule__Object__UnorderedGroup_5 )
            // InternalBug304681TestLanguage.g:1035:2: rule__Object__UnorderedGroup_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__UnorderedGroup_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getUnorderedGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__5__Impl"


    // $ANTLR start "rule__Object__Group__6"
    // InternalBug304681TestLanguage.g:1045:1: rule__Object__Group__6 : rule__Object__Group__6__Impl ;
    public final void rule__Object__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1049:1: ( rule__Object__Group__6__Impl )
            // InternalBug304681TestLanguage.g:1050:2: rule__Object__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__6"


    // $ANTLR start "rule__Object__Group__6__Impl"
    // InternalBug304681TestLanguage.g:1056:1: rule__Object__Group__6__Impl : ( '}' ) ;
    public final void rule__Object__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1060:1: ( ( '}' ) )
            // InternalBug304681TestLanguage.g:1061:1: ( '}' )
            {
            // InternalBug304681TestLanguage.g:1061:1: ( '}' )
            // InternalBug304681TestLanguage.g:1062:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__6__Impl"


    // $ANTLR start "rule__Object__Group_3__0"
    // InternalBug304681TestLanguage.g:1089:1: rule__Object__Group_3__0 : rule__Object__Group_3__0__Impl rule__Object__Group_3__1 ;
    public final void rule__Object__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1093:1: ( rule__Object__Group_3__0__Impl rule__Object__Group_3__1 )
            // InternalBug304681TestLanguage.g:1094:2: rule__Object__Group_3__0__Impl rule__Object__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Object__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_3__0"


    // $ANTLR start "rule__Object__Group_3__0__Impl"
    // InternalBug304681TestLanguage.g:1101:1: rule__Object__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Object__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1105:1: ( ( 'extends' ) )
            // InternalBug304681TestLanguage.g:1106:1: ( 'extends' )
            {
            // InternalBug304681TestLanguage.g:1106:1: ( 'extends' )
            // InternalBug304681TestLanguage.g:1107:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getExtendsKeyword_3_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getExtendsKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_3__0__Impl"


    // $ANTLR start "rule__Object__Group_3__1"
    // InternalBug304681TestLanguage.g:1120:1: rule__Object__Group_3__1 : rule__Object__Group_3__1__Impl ;
    public final void rule__Object__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1124:1: ( rule__Object__Group_3__1__Impl )
            // InternalBug304681TestLanguage.g:1125:2: rule__Object__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_3__1"


    // $ANTLR start "rule__Object__Group_3__1__Impl"
    // InternalBug304681TestLanguage.g:1131:1: rule__Object__Group_3__1__Impl : ( ( rule__Object__ParentAssignment_3_1 ) ) ;
    public final void rule__Object__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1135:1: ( ( ( rule__Object__ParentAssignment_3_1 ) ) )
            // InternalBug304681TestLanguage.g:1136:1: ( ( rule__Object__ParentAssignment_3_1 ) )
            {
            // InternalBug304681TestLanguage.g:1136:1: ( ( rule__Object__ParentAssignment_3_1 ) )
            // InternalBug304681TestLanguage.g:1137:1: ( rule__Object__ParentAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getParentAssignment_3_1()); 
            }
            // InternalBug304681TestLanguage.g:1138:1: ( rule__Object__ParentAssignment_3_1 )
            // InternalBug304681TestLanguage.g:1138:2: rule__Object__ParentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__ParentAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getParentAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_3__1__Impl"


    // $ANTLR start "rule__Object__Group_5_0__0"
    // InternalBug304681TestLanguage.g:1152:1: rule__Object__Group_5_0__0 : rule__Object__Group_5_0__0__Impl rule__Object__Group_5_0__1 ;
    public final void rule__Object__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1156:1: ( rule__Object__Group_5_0__0__Impl rule__Object__Group_5_0__1 )
            // InternalBug304681TestLanguage.g:1157:2: rule__Object__Group_5_0__0__Impl rule__Object__Group_5_0__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Object__Group_5_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_0__0"


    // $ANTLR start "rule__Object__Group_5_0__0__Impl"
    // InternalBug304681TestLanguage.g:1164:1: rule__Object__Group_5_0__0__Impl : ( 'shortDescription' ) ;
    public final void rule__Object__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1168:1: ( ( 'shortDescription' ) )
            // InternalBug304681TestLanguage.g:1169:1: ( 'shortDescription' )
            {
            // InternalBug304681TestLanguage.g:1169:1: ( 'shortDescription' )
            // InternalBug304681TestLanguage.g:1170:1: 'shortDescription'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getShortDescriptionKeyword_5_0_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getShortDescriptionKeyword_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_0__0__Impl"


    // $ANTLR start "rule__Object__Group_5_0__1"
    // InternalBug304681TestLanguage.g:1183:1: rule__Object__Group_5_0__1 : rule__Object__Group_5_0__1__Impl rule__Object__Group_5_0__2 ;
    public final void rule__Object__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1187:1: ( rule__Object__Group_5_0__1__Impl rule__Object__Group_5_0__2 )
            // InternalBug304681TestLanguage.g:1188:2: rule__Object__Group_5_0__1__Impl rule__Object__Group_5_0__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Object__Group_5_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_0__1"


    // $ANTLR start "rule__Object__Group_5_0__1__Impl"
    // InternalBug304681TestLanguage.g:1195:1: rule__Object__Group_5_0__1__Impl : ( ( rule__Object__ShortDescriptionAssignment_5_0_1 ) ) ;
    public final void rule__Object__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1199:1: ( ( ( rule__Object__ShortDescriptionAssignment_5_0_1 ) ) )
            // InternalBug304681TestLanguage.g:1200:1: ( ( rule__Object__ShortDescriptionAssignment_5_0_1 ) )
            {
            // InternalBug304681TestLanguage.g:1200:1: ( ( rule__Object__ShortDescriptionAssignment_5_0_1 ) )
            // InternalBug304681TestLanguage.g:1201:1: ( rule__Object__ShortDescriptionAssignment_5_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getShortDescriptionAssignment_5_0_1()); 
            }
            // InternalBug304681TestLanguage.g:1202:1: ( rule__Object__ShortDescriptionAssignment_5_0_1 )
            // InternalBug304681TestLanguage.g:1202:2: rule__Object__ShortDescriptionAssignment_5_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__ShortDescriptionAssignment_5_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getShortDescriptionAssignment_5_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_0__1__Impl"


    // $ANTLR start "rule__Object__Group_5_0__2"
    // InternalBug304681TestLanguage.g:1212:1: rule__Object__Group_5_0__2 : rule__Object__Group_5_0__2__Impl ;
    public final void rule__Object__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1216:1: ( rule__Object__Group_5_0__2__Impl )
            // InternalBug304681TestLanguage.g:1217:2: rule__Object__Group_5_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_0__2"


    // $ANTLR start "rule__Object__Group_5_0__2__Impl"
    // InternalBug304681TestLanguage.g:1223:1: rule__Object__Group_5_0__2__Impl : ( ';' ) ;
    public final void rule__Object__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1227:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:1228:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:1228:1: ( ';' )
            // InternalBug304681TestLanguage.g:1229:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getSemicolonKeyword_5_0_2()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getSemicolonKeyword_5_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_0__2__Impl"


    // $ANTLR start "rule__Object__Group_5_1__0"
    // InternalBug304681TestLanguage.g:1248:1: rule__Object__Group_5_1__0 : rule__Object__Group_5_1__0__Impl rule__Object__Group_5_1__1 ;
    public final void rule__Object__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1252:1: ( rule__Object__Group_5_1__0__Impl rule__Object__Group_5_1__1 )
            // InternalBug304681TestLanguage.g:1253:2: rule__Object__Group_5_1__0__Impl rule__Object__Group_5_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Object__Group_5_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_1__0"


    // $ANTLR start "rule__Object__Group_5_1__0__Impl"
    // InternalBug304681TestLanguage.g:1260:1: rule__Object__Group_5_1__0__Impl : ( 'longDescription' ) ;
    public final void rule__Object__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1264:1: ( ( 'longDescription' ) )
            // InternalBug304681TestLanguage.g:1265:1: ( 'longDescription' )
            {
            // InternalBug304681TestLanguage.g:1265:1: ( 'longDescription' )
            // InternalBug304681TestLanguage.g:1266:1: 'longDescription'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getLongDescriptionKeyword_5_1_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getLongDescriptionKeyword_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_1__0__Impl"


    // $ANTLR start "rule__Object__Group_5_1__1"
    // InternalBug304681TestLanguage.g:1279:1: rule__Object__Group_5_1__1 : rule__Object__Group_5_1__1__Impl rule__Object__Group_5_1__2 ;
    public final void rule__Object__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1283:1: ( rule__Object__Group_5_1__1__Impl rule__Object__Group_5_1__2 )
            // InternalBug304681TestLanguage.g:1284:2: rule__Object__Group_5_1__1__Impl rule__Object__Group_5_1__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Object__Group_5_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_1__1"


    // $ANTLR start "rule__Object__Group_5_1__1__Impl"
    // InternalBug304681TestLanguage.g:1291:1: rule__Object__Group_5_1__1__Impl : ( ( rule__Object__LongDescriptionAssignment_5_1_1 ) ) ;
    public final void rule__Object__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1295:1: ( ( ( rule__Object__LongDescriptionAssignment_5_1_1 ) ) )
            // InternalBug304681TestLanguage.g:1296:1: ( ( rule__Object__LongDescriptionAssignment_5_1_1 ) )
            {
            // InternalBug304681TestLanguage.g:1296:1: ( ( rule__Object__LongDescriptionAssignment_5_1_1 ) )
            // InternalBug304681TestLanguage.g:1297:1: ( rule__Object__LongDescriptionAssignment_5_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getLongDescriptionAssignment_5_1_1()); 
            }
            // InternalBug304681TestLanguage.g:1298:1: ( rule__Object__LongDescriptionAssignment_5_1_1 )
            // InternalBug304681TestLanguage.g:1298:2: rule__Object__LongDescriptionAssignment_5_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__LongDescriptionAssignment_5_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getLongDescriptionAssignment_5_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_1__1__Impl"


    // $ANTLR start "rule__Object__Group_5_1__2"
    // InternalBug304681TestLanguage.g:1308:1: rule__Object__Group_5_1__2 : rule__Object__Group_5_1__2__Impl ;
    public final void rule__Object__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1312:1: ( rule__Object__Group_5_1__2__Impl )
            // InternalBug304681TestLanguage.g:1313:2: rule__Object__Group_5_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_1__2"


    // $ANTLR start "rule__Object__Group_5_1__2__Impl"
    // InternalBug304681TestLanguage.g:1319:1: rule__Object__Group_5_1__2__Impl : ( ';' ) ;
    public final void rule__Object__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1323:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:1324:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:1324:1: ( ';' )
            // InternalBug304681TestLanguage.g:1325:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getSemicolonKeyword_5_1_2()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getSemicolonKeyword_5_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_1__2__Impl"


    // $ANTLR start "rule__Object__Group_5_2__0"
    // InternalBug304681TestLanguage.g:1344:1: rule__Object__Group_5_2__0 : rule__Object__Group_5_2__0__Impl rule__Object__Group_5_2__1 ;
    public final void rule__Object__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1348:1: ( rule__Object__Group_5_2__0__Impl rule__Object__Group_5_2__1 )
            // InternalBug304681TestLanguage.g:1349:2: rule__Object__Group_5_2__0__Impl rule__Object__Group_5_2__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Object__Group_5_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_2__0"


    // $ANTLR start "rule__Object__Group_5_2__0__Impl"
    // InternalBug304681TestLanguage.g:1356:1: rule__Object__Group_5_2__0__Impl : ( 'serialUID' ) ;
    public final void rule__Object__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1360:1: ( ( 'serialUID' ) )
            // InternalBug304681TestLanguage.g:1361:1: ( 'serialUID' )
            {
            // InternalBug304681TestLanguage.g:1361:1: ( 'serialUID' )
            // InternalBug304681TestLanguage.g:1362:1: 'serialUID'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getSerialUIDKeyword_5_2_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getSerialUIDKeyword_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_2__0__Impl"


    // $ANTLR start "rule__Object__Group_5_2__1"
    // InternalBug304681TestLanguage.g:1375:1: rule__Object__Group_5_2__1 : rule__Object__Group_5_2__1__Impl rule__Object__Group_5_2__2 ;
    public final void rule__Object__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1379:1: ( rule__Object__Group_5_2__1__Impl rule__Object__Group_5_2__2 )
            // InternalBug304681TestLanguage.g:1380:2: rule__Object__Group_5_2__1__Impl rule__Object__Group_5_2__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Object__Group_5_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_2__1"


    // $ANTLR start "rule__Object__Group_5_2__1__Impl"
    // InternalBug304681TestLanguage.g:1387:1: rule__Object__Group_5_2__1__Impl : ( ( rule__Object__SerialVersionUIDAssignment_5_2_1 ) ) ;
    public final void rule__Object__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1391:1: ( ( ( rule__Object__SerialVersionUIDAssignment_5_2_1 ) ) )
            // InternalBug304681TestLanguage.g:1392:1: ( ( rule__Object__SerialVersionUIDAssignment_5_2_1 ) )
            {
            // InternalBug304681TestLanguage.g:1392:1: ( ( rule__Object__SerialVersionUIDAssignment_5_2_1 ) )
            // InternalBug304681TestLanguage.g:1393:1: ( rule__Object__SerialVersionUIDAssignment_5_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getSerialVersionUIDAssignment_5_2_1()); 
            }
            // InternalBug304681TestLanguage.g:1394:1: ( rule__Object__SerialVersionUIDAssignment_5_2_1 )
            // InternalBug304681TestLanguage.g:1394:2: rule__Object__SerialVersionUIDAssignment_5_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__SerialVersionUIDAssignment_5_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getSerialVersionUIDAssignment_5_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_2__1__Impl"


    // $ANTLR start "rule__Object__Group_5_2__2"
    // InternalBug304681TestLanguage.g:1404:1: rule__Object__Group_5_2__2 : rule__Object__Group_5_2__2__Impl ;
    public final void rule__Object__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1408:1: ( rule__Object__Group_5_2__2__Impl )
            // InternalBug304681TestLanguage.g:1409:2: rule__Object__Group_5_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_2__2"


    // $ANTLR start "rule__Object__Group_5_2__2__Impl"
    // InternalBug304681TestLanguage.g:1415:1: rule__Object__Group_5_2__2__Impl : ( ';' ) ;
    public final void rule__Object__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1419:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:1420:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:1420:1: ( ';' )
            // InternalBug304681TestLanguage.g:1421:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getSemicolonKeyword_5_2_2()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getSemicolonKeyword_5_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_2__2__Impl"


    // $ANTLR start "rule__Object__Group_5_3__0"
    // InternalBug304681TestLanguage.g:1440:1: rule__Object__Group_5_3__0 : rule__Object__Group_5_3__0__Impl rule__Object__Group_5_3__1 ;
    public final void rule__Object__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1444:1: ( rule__Object__Group_5_3__0__Impl rule__Object__Group_5_3__1 )
            // InternalBug304681TestLanguage.g:1445:2: rule__Object__Group_5_3__0__Impl rule__Object__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Object__Group_5_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_3__0"


    // $ANTLR start "rule__Object__Group_5_3__0__Impl"
    // InternalBug304681TestLanguage.g:1452:1: rule__Object__Group_5_3__0__Impl : ( ( rule__Object__CloneableAssignment_5_3_0 ) ) ;
    public final void rule__Object__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1456:1: ( ( ( rule__Object__CloneableAssignment_5_3_0 ) ) )
            // InternalBug304681TestLanguage.g:1457:1: ( ( rule__Object__CloneableAssignment_5_3_0 ) )
            {
            // InternalBug304681TestLanguage.g:1457:1: ( ( rule__Object__CloneableAssignment_5_3_0 ) )
            // InternalBug304681TestLanguage.g:1458:1: ( rule__Object__CloneableAssignment_5_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getCloneableAssignment_5_3_0()); 
            }
            // InternalBug304681TestLanguage.g:1459:1: ( rule__Object__CloneableAssignment_5_3_0 )
            // InternalBug304681TestLanguage.g:1459:2: rule__Object__CloneableAssignment_5_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__CloneableAssignment_5_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getCloneableAssignment_5_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_3__0__Impl"


    // $ANTLR start "rule__Object__Group_5_3__1"
    // InternalBug304681TestLanguage.g:1469:1: rule__Object__Group_5_3__1 : rule__Object__Group_5_3__1__Impl ;
    public final void rule__Object__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1473:1: ( rule__Object__Group_5_3__1__Impl )
            // InternalBug304681TestLanguage.g:1474:2: rule__Object__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_3__1"


    // $ANTLR start "rule__Object__Group_5_3__1__Impl"
    // InternalBug304681TestLanguage.g:1480:1: rule__Object__Group_5_3__1__Impl : ( ';' ) ;
    public final void rule__Object__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1484:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:1485:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:1485:1: ( ';' )
            // InternalBug304681TestLanguage.g:1486:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getSemicolonKeyword_5_3_1()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getSemicolonKeyword_5_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_3__1__Impl"


    // $ANTLR start "rule__Object__Group_5_5__0"
    // InternalBug304681TestLanguage.g:1503:1: rule__Object__Group_5_5__0 : rule__Object__Group_5_5__0__Impl rule__Object__Group_5_5__1 ;
    public final void rule__Object__Group_5_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1507:1: ( rule__Object__Group_5_5__0__Impl rule__Object__Group_5_5__1 )
            // InternalBug304681TestLanguage.g:1508:2: rule__Object__Group_5_5__0__Impl rule__Object__Group_5_5__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Object__Group_5_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_5__0"


    // $ANTLR start "rule__Object__Group_5_5__0__Impl"
    // InternalBug304681TestLanguage.g:1515:1: rule__Object__Group_5_5__0__Impl : ( 'before' ) ;
    public final void rule__Object__Group_5_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1519:1: ( ( 'before' ) )
            // InternalBug304681TestLanguage.g:1520:1: ( 'before' )
            {
            // InternalBug304681TestLanguage.g:1520:1: ( 'before' )
            // InternalBug304681TestLanguage.g:1521:1: 'before'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getBeforeKeyword_5_5_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getBeforeKeyword_5_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_5__0__Impl"


    // $ANTLR start "rule__Object__Group_5_5__1"
    // InternalBug304681TestLanguage.g:1534:1: rule__Object__Group_5_5__1 : rule__Object__Group_5_5__1__Impl rule__Object__Group_5_5__2 ;
    public final void rule__Object__Group_5_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1538:1: ( rule__Object__Group_5_5__1__Impl rule__Object__Group_5_5__2 )
            // InternalBug304681TestLanguage.g:1539:2: rule__Object__Group_5_5__1__Impl rule__Object__Group_5_5__2
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Object__Group_5_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_5__1"


    // $ANTLR start "rule__Object__Group_5_5__1__Impl"
    // InternalBug304681TestLanguage.g:1546:1: rule__Object__Group_5_5__1__Impl : ( ( rule__Object__FeaturesAssignment_5_5_1 )* ) ;
    public final void rule__Object__Group_5_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1550:1: ( ( ( rule__Object__FeaturesAssignment_5_5_1 )* ) )
            // InternalBug304681TestLanguage.g:1551:1: ( ( rule__Object__FeaturesAssignment_5_5_1 )* )
            {
            // InternalBug304681TestLanguage.g:1551:1: ( ( rule__Object__FeaturesAssignment_5_5_1 )* )
            // InternalBug304681TestLanguage.g:1552:1: ( rule__Object__FeaturesAssignment_5_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getFeaturesAssignment_5_5_1()); 
            }
            // InternalBug304681TestLanguage.g:1553:1: ( rule__Object__FeaturesAssignment_5_5_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=26 && LA12_0<=27)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBug304681TestLanguage.g:1553:2: rule__Object__FeaturesAssignment_5_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    rule__Object__FeaturesAssignment_5_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getFeaturesAssignment_5_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_5__1__Impl"


    // $ANTLR start "rule__Object__Group_5_5__2"
    // InternalBug304681TestLanguage.g:1563:1: rule__Object__Group_5_5__2 : rule__Object__Group_5_5__2__Impl ;
    public final void rule__Object__Group_5_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1567:1: ( rule__Object__Group_5_5__2__Impl )
            // InternalBug304681TestLanguage.g:1568:2: rule__Object__Group_5_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_5__2"


    // $ANTLR start "rule__Object__Group_5_5__2__Impl"
    // InternalBug304681TestLanguage.g:1574:1: rule__Object__Group_5_5__2__Impl : ( 'after' ) ;
    public final void rule__Object__Group_5_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1578:1: ( ( 'after' ) )
            // InternalBug304681TestLanguage.g:1579:1: ( 'after' )
            {
            // InternalBug304681TestLanguage.g:1579:1: ( 'after' )
            // InternalBug304681TestLanguage.g:1580:1: 'after'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getAfterKeyword_5_5_2()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getAfterKeyword_5_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_5__2__Impl"


    // $ANTLR start "rule__Object__Group_5_6__0"
    // InternalBug304681TestLanguage.g:1599:1: rule__Object__Group_5_6__0 : rule__Object__Group_5_6__0__Impl rule__Object__Group_5_6__1 ;
    public final void rule__Object__Group_5_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1603:1: ( rule__Object__Group_5_6__0__Impl rule__Object__Group_5_6__1 )
            // InternalBug304681TestLanguage.g:1604:2: rule__Object__Group_5_6__0__Impl rule__Object__Group_5_6__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Object__Group_5_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_6__0"


    // $ANTLR start "rule__Object__Group_5_6__0__Impl"
    // InternalBug304681TestLanguage.g:1611:1: rule__Object__Group_5_6__0__Impl : ( 'optionalLoop' ) ;
    public final void rule__Object__Group_5_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1615:1: ( ( 'optionalLoop' ) )
            // InternalBug304681TestLanguage.g:1616:1: ( 'optionalLoop' )
            {
            // InternalBug304681TestLanguage.g:1616:1: ( 'optionalLoop' )
            // InternalBug304681TestLanguage.g:1617:1: 'optionalLoop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getOptionalLoopKeyword_5_6_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getOptionalLoopKeyword_5_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_6__0__Impl"


    // $ANTLR start "rule__Object__Group_5_6__1"
    // InternalBug304681TestLanguage.g:1630:1: rule__Object__Group_5_6__1 : rule__Object__Group_5_6__1__Impl ;
    public final void rule__Object__Group_5_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1634:1: ( rule__Object__Group_5_6__1__Impl )
            // InternalBug304681TestLanguage.g:1635:2: rule__Object__Group_5_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_6__1"


    // $ANTLR start "rule__Object__Group_5_6__1__Impl"
    // InternalBug304681TestLanguage.g:1641:1: rule__Object__Group_5_6__1__Impl : ( ( rule__Object__FeaturesAssignment_5_6_1 )* ) ;
    public final void rule__Object__Group_5_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1645:1: ( ( ( rule__Object__FeaturesAssignment_5_6_1 )* ) )
            // InternalBug304681TestLanguage.g:1646:1: ( ( rule__Object__FeaturesAssignment_5_6_1 )* )
            {
            // InternalBug304681TestLanguage.g:1646:1: ( ( rule__Object__FeaturesAssignment_5_6_1 )* )
            // InternalBug304681TestLanguage.g:1647:1: ( rule__Object__FeaturesAssignment_5_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getFeaturesAssignment_5_6_1()); 
            }
            // InternalBug304681TestLanguage.g:1648:1: ( rule__Object__FeaturesAssignment_5_6_1 )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // InternalBug304681TestLanguage.g:1648:2: rule__Object__FeaturesAssignment_5_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    rule__Object__FeaturesAssignment_5_6_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getFeaturesAssignment_5_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_6__1__Impl"


    // $ANTLR start "rule__Object__Group_5_7__0"
    // InternalBug304681TestLanguage.g:1662:1: rule__Object__Group_5_7__0 : rule__Object__Group_5_7__0__Impl rule__Object__Group_5_7__1 ;
    public final void rule__Object__Group_5_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1666:1: ( rule__Object__Group_5_7__0__Impl rule__Object__Group_5_7__1 )
            // InternalBug304681TestLanguage.g:1667:2: rule__Object__Group_5_7__0__Impl rule__Object__Group_5_7__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Object__Group_5_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_7__0"


    // $ANTLR start "rule__Object__Group_5_7__0__Impl"
    // InternalBug304681TestLanguage.g:1674:1: rule__Object__Group_5_7__0__Impl : ( 'mandatoryLoop' ) ;
    public final void rule__Object__Group_5_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1678:1: ( ( 'mandatoryLoop' ) )
            // InternalBug304681TestLanguage.g:1679:1: ( 'mandatoryLoop' )
            {
            // InternalBug304681TestLanguage.g:1679:1: ( 'mandatoryLoop' )
            // InternalBug304681TestLanguage.g:1680:1: 'mandatoryLoop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getMandatoryLoopKeyword_5_7_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getMandatoryLoopKeyword_5_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_7__0__Impl"


    // $ANTLR start "rule__Object__Group_5_7__1"
    // InternalBug304681TestLanguage.g:1693:1: rule__Object__Group_5_7__1 : rule__Object__Group_5_7__1__Impl ;
    public final void rule__Object__Group_5_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1697:1: ( rule__Object__Group_5_7__1__Impl )
            // InternalBug304681TestLanguage.g:1698:2: rule__Object__Group_5_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__Group_5_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_7__1"


    // $ANTLR start "rule__Object__Group_5_7__1__Impl"
    // InternalBug304681TestLanguage.g:1704:1: rule__Object__Group_5_7__1__Impl : ( ( ( rule__Object__FeaturesAssignment_5_7_1 ) ) ( ( rule__Object__FeaturesAssignment_5_7_1 )* ) ) ;
    public final void rule__Object__Group_5_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1708:1: ( ( ( ( rule__Object__FeaturesAssignment_5_7_1 ) ) ( ( rule__Object__FeaturesAssignment_5_7_1 )* ) ) )
            // InternalBug304681TestLanguage.g:1709:1: ( ( ( rule__Object__FeaturesAssignment_5_7_1 ) ) ( ( rule__Object__FeaturesAssignment_5_7_1 )* ) )
            {
            // InternalBug304681TestLanguage.g:1709:1: ( ( ( rule__Object__FeaturesAssignment_5_7_1 ) ) ( ( rule__Object__FeaturesAssignment_5_7_1 )* ) )
            // InternalBug304681TestLanguage.g:1710:1: ( ( rule__Object__FeaturesAssignment_5_7_1 ) ) ( ( rule__Object__FeaturesAssignment_5_7_1 )* )
            {
            // InternalBug304681TestLanguage.g:1710:1: ( ( rule__Object__FeaturesAssignment_5_7_1 ) )
            // InternalBug304681TestLanguage.g:1711:1: ( rule__Object__FeaturesAssignment_5_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getFeaturesAssignment_5_7_1()); 
            }
            // InternalBug304681TestLanguage.g:1712:1: ( rule__Object__FeaturesAssignment_5_7_1 )
            // InternalBug304681TestLanguage.g:1712:2: rule__Object__FeaturesAssignment_5_7_1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Object__FeaturesAssignment_5_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getFeaturesAssignment_5_7_1()); 
            }

            }

            // InternalBug304681TestLanguage.g:1715:1: ( ( rule__Object__FeaturesAssignment_5_7_1 )* )
            // InternalBug304681TestLanguage.g:1716:1: ( rule__Object__FeaturesAssignment_5_7_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getFeaturesAssignment_5_7_1()); 
            }
            // InternalBug304681TestLanguage.g:1717:1: ( rule__Object__FeaturesAssignment_5_7_1 )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalBug304681TestLanguage.g:1717:2: rule__Object__FeaturesAssignment_5_7_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    rule__Object__FeaturesAssignment_5_7_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getFeaturesAssignment_5_7_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5_7__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalBug304681TestLanguage.g:1732:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1736:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalBug304681TestLanguage.g:1737:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalBug304681TestLanguage.g:1744:1: rule__Attribute__Group__0__Impl : ( 'Attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1748:1: ( ( 'Attribute' ) )
            // InternalBug304681TestLanguage.g:1749:1: ( 'Attribute' )
            {
            // InternalBug304681TestLanguage.g:1749:1: ( 'Attribute' )
            // InternalBug304681TestLanguage.g:1750:1: 'Attribute'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalBug304681TestLanguage.g:1763:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1767:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalBug304681TestLanguage.g:1768:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalBug304681TestLanguage.g:1775:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__TypeAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1779:1: ( ( ( rule__Attribute__TypeAssignment_1 ) ) )
            // InternalBug304681TestLanguage.g:1780:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            {
            // InternalBug304681TestLanguage.g:1780:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            // InternalBug304681TestLanguage.g:1781:1: ( rule__Attribute__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 
            }
            // InternalBug304681TestLanguage.g:1782:1: ( rule__Attribute__TypeAssignment_1 )
            // InternalBug304681TestLanguage.g:1782:2: rule__Attribute__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalBug304681TestLanguage.g:1792:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1796:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalBug304681TestLanguage.g:1797:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalBug304681TestLanguage.g:1804:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1808:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // InternalBug304681TestLanguage.g:1809:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // InternalBug304681TestLanguage.g:1809:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // InternalBug304681TestLanguage.g:1810:1: ( rule__Attribute__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            }
            // InternalBug304681TestLanguage.g:1811:1: ( rule__Attribute__NameAssignment_2 )
            // InternalBug304681TestLanguage.g:1811:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalBug304681TestLanguage.g:1821:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1825:1: ( rule__Attribute__Group__3__Impl )
            // InternalBug304681TestLanguage.g:1826:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalBug304681TestLanguage.g:1832:1: rule__Attribute__Group__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1836:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:1837:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:1837:1: ( ';' )
            // InternalBug304681TestLanguage.g:1838:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getSemicolonKeyword_3()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalBug304681TestLanguage.g:1859:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1863:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalBug304681TestLanguage.g:1864:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Reference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalBug304681TestLanguage.g:1871:1: rule__Reference__Group__0__Impl : ( 'Reference' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1875:1: ( ( 'Reference' ) )
            // InternalBug304681TestLanguage.g:1876:1: ( 'Reference' )
            {
            // InternalBug304681TestLanguage.g:1876:1: ( 'Reference' )
            // InternalBug304681TestLanguage.g:1877:1: 'Reference'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getReferenceKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getReferenceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalBug304681TestLanguage.g:1890:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1894:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalBug304681TestLanguage.g:1895:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Reference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalBug304681TestLanguage.g:1902:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__TypeAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1906:1: ( ( ( rule__Reference__TypeAssignment_1 ) ) )
            // InternalBug304681TestLanguage.g:1907:1: ( ( rule__Reference__TypeAssignment_1 ) )
            {
            // InternalBug304681TestLanguage.g:1907:1: ( ( rule__Reference__TypeAssignment_1 ) )
            // InternalBug304681TestLanguage.g:1908:1: ( rule__Reference__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getTypeAssignment_1()); 
            }
            // InternalBug304681TestLanguage.g:1909:1: ( rule__Reference__TypeAssignment_1 )
            // InternalBug304681TestLanguage.g:1909:2: rule__Reference__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // InternalBug304681TestLanguage.g:1919:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1923:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalBug304681TestLanguage.g:1924:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Reference__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // InternalBug304681TestLanguage.g:1931:1: rule__Reference__Group__2__Impl : ( ( rule__Reference__ManyAssignment_2 )? ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1935:1: ( ( ( rule__Reference__ManyAssignment_2 )? ) )
            // InternalBug304681TestLanguage.g:1936:1: ( ( rule__Reference__ManyAssignment_2 )? )
            {
            // InternalBug304681TestLanguage.g:1936:1: ( ( rule__Reference__ManyAssignment_2 )? )
            // InternalBug304681TestLanguage.g:1937:1: ( rule__Reference__ManyAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getManyAssignment_2()); 
            }
            // InternalBug304681TestLanguage.g:1938:1: ( rule__Reference__ManyAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBug304681TestLanguage.g:1938:2: rule__Reference__ManyAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Reference__ManyAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getManyAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // InternalBug304681TestLanguage.g:1948:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1952:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // InternalBug304681TestLanguage.g:1953:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Reference__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // InternalBug304681TestLanguage.g:1960:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__NameAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1964:1: ( ( ( rule__Reference__NameAssignment_3 ) ) )
            // InternalBug304681TestLanguage.g:1965:1: ( ( rule__Reference__NameAssignment_3 ) )
            {
            // InternalBug304681TestLanguage.g:1965:1: ( ( rule__Reference__NameAssignment_3 ) )
            // InternalBug304681TestLanguage.g:1966:1: ( rule__Reference__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getNameAssignment_3()); 
            }
            // InternalBug304681TestLanguage.g:1967:1: ( rule__Reference__NameAssignment_3 )
            // InternalBug304681TestLanguage.g:1967:2: rule__Reference__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // InternalBug304681TestLanguage.g:1977:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1981:1: ( rule__Reference__Group__4__Impl )
            // InternalBug304681TestLanguage.g:1982:2: rule__Reference__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // InternalBug304681TestLanguage.g:1988:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__Alternatives_4 ) ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:1992:1: ( ( ( rule__Reference__Alternatives_4 ) ) )
            // InternalBug304681TestLanguage.g:1993:1: ( ( rule__Reference__Alternatives_4 ) )
            {
            // InternalBug304681TestLanguage.g:1993:1: ( ( rule__Reference__Alternatives_4 ) )
            // InternalBug304681TestLanguage.g:1994:1: ( rule__Reference__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAlternatives_4()); 
            }
            // InternalBug304681TestLanguage.g:1995:1: ( rule__Reference__Alternatives_4 )
            // InternalBug304681TestLanguage.g:1995:2: rule__Reference__Alternatives_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Alternatives_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getAlternatives_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group_4_0__0"
    // InternalBug304681TestLanguage.g:2015:1: rule__Reference__Group_4_0__0 : rule__Reference__Group_4_0__0__Impl rule__Reference__Group_4_0__1 ;
    public final void rule__Reference__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2019:1: ( rule__Reference__Group_4_0__0__Impl rule__Reference__Group_4_0__1 )
            // InternalBug304681TestLanguage.g:2020:2: rule__Reference__Group_4_0__0__Impl rule__Reference__Group_4_0__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__Reference__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group_4_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0__0"


    // $ANTLR start "rule__Reference__Group_4_0__0__Impl"
    // InternalBug304681TestLanguage.g:2027:1: rule__Reference__Group_4_0__0__Impl : ( '{' ) ;
    public final void rule__Reference__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2031:1: ( ( '{' ) )
            // InternalBug304681TestLanguage.g:2032:1: ( '{' )
            {
            // InternalBug304681TestLanguage.g:2032:1: ( '{' )
            // InternalBug304681TestLanguage.g:2033:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_4_0_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0__0__Impl"


    // $ANTLR start "rule__Reference__Group_4_0__1"
    // InternalBug304681TestLanguage.g:2046:1: rule__Reference__Group_4_0__1 : rule__Reference__Group_4_0__1__Impl rule__Reference__Group_4_0__2 ;
    public final void rule__Reference__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2050:1: ( rule__Reference__Group_4_0__1__Impl rule__Reference__Group_4_0__2 )
            // InternalBug304681TestLanguage.g:2051:2: rule__Reference__Group_4_0__1__Impl rule__Reference__Group_4_0__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Reference__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group_4_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0__1"


    // $ANTLR start "rule__Reference__Group_4_0__1__Impl"
    // InternalBug304681TestLanguage.g:2058:1: rule__Reference__Group_4_0__1__Impl : ( ( rule__Reference__UnorderedGroup_4_0_1 ) ) ;
    public final void rule__Reference__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2062:1: ( ( ( rule__Reference__UnorderedGroup_4_0_1 ) ) )
            // InternalBug304681TestLanguage.g:2063:1: ( ( rule__Reference__UnorderedGroup_4_0_1 ) )
            {
            // InternalBug304681TestLanguage.g:2063:1: ( ( rule__Reference__UnorderedGroup_4_0_1 ) )
            // InternalBug304681TestLanguage.g:2064:1: ( rule__Reference__UnorderedGroup_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1()); 
            }
            // InternalBug304681TestLanguage.g:2065:1: ( rule__Reference__UnorderedGroup_4_0_1 )
            // InternalBug304681TestLanguage.g:2065:2: rule__Reference__UnorderedGroup_4_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__UnorderedGroup_4_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0__1__Impl"


    // $ANTLR start "rule__Reference__Group_4_0__2"
    // InternalBug304681TestLanguage.g:2075:1: rule__Reference__Group_4_0__2 : rule__Reference__Group_4_0__2__Impl ;
    public final void rule__Reference__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2079:1: ( rule__Reference__Group_4_0__2__Impl )
            // InternalBug304681TestLanguage.g:2080:2: rule__Reference__Group_4_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group_4_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0__2"


    // $ANTLR start "rule__Reference__Group_4_0__2__Impl"
    // InternalBug304681TestLanguage.g:2086:1: rule__Reference__Group_4_0__2__Impl : ( '}' ) ;
    public final void rule__Reference__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2090:1: ( ( '}' ) )
            // InternalBug304681TestLanguage.g:2091:1: ( '}' )
            {
            // InternalBug304681TestLanguage.g:2091:1: ( '}' )
            // InternalBug304681TestLanguage.g:2092:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_4_0_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_4_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0__2__Impl"


    // $ANTLR start "rule__Reference__Group_4_0_1_0__0"
    // InternalBug304681TestLanguage.g:2111:1: rule__Reference__Group_4_0_1_0__0 : rule__Reference__Group_4_0_1_0__0__Impl rule__Reference__Group_4_0_1_0__1 ;
    public final void rule__Reference__Group_4_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2115:1: ( rule__Reference__Group_4_0_1_0__0__Impl rule__Reference__Group_4_0_1_0__1 )
            // InternalBug304681TestLanguage.g:2116:2: rule__Reference__Group_4_0_1_0__0__Impl rule__Reference__Group_4_0_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Reference__Group_4_0_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group_4_0_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0_1_0__0"


    // $ANTLR start "rule__Reference__Group_4_0_1_0__0__Impl"
    // InternalBug304681TestLanguage.g:2123:1: rule__Reference__Group_4_0_1_0__0__Impl : ( 'shortDescription' ) ;
    public final void rule__Reference__Group_4_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2127:1: ( ( 'shortDescription' ) )
            // InternalBug304681TestLanguage.g:2128:1: ( 'shortDescription' )
            {
            // InternalBug304681TestLanguage.g:2128:1: ( 'shortDescription' )
            // InternalBug304681TestLanguage.g:2129:1: 'shortDescription'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getShortDescriptionKeyword_4_0_1_0_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getShortDescriptionKeyword_4_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0_1_0__0__Impl"


    // $ANTLR start "rule__Reference__Group_4_0_1_0__1"
    // InternalBug304681TestLanguage.g:2142:1: rule__Reference__Group_4_0_1_0__1 : rule__Reference__Group_4_0_1_0__1__Impl rule__Reference__Group_4_0_1_0__2 ;
    public final void rule__Reference__Group_4_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2146:1: ( rule__Reference__Group_4_0_1_0__1__Impl rule__Reference__Group_4_0_1_0__2 )
            // InternalBug304681TestLanguage.g:2147:2: rule__Reference__Group_4_0_1_0__1__Impl rule__Reference__Group_4_0_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Reference__Group_4_0_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group_4_0_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0_1_0__1"


    // $ANTLR start "rule__Reference__Group_4_0_1_0__1__Impl"
    // InternalBug304681TestLanguage.g:2154:1: rule__Reference__Group_4_0_1_0__1__Impl : ( ( rule__Reference__ShortDescriptionAssignment_4_0_1_0_1 ) ) ;
    public final void rule__Reference__Group_4_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2158:1: ( ( ( rule__Reference__ShortDescriptionAssignment_4_0_1_0_1 ) ) )
            // InternalBug304681TestLanguage.g:2159:1: ( ( rule__Reference__ShortDescriptionAssignment_4_0_1_0_1 ) )
            {
            // InternalBug304681TestLanguage.g:2159:1: ( ( rule__Reference__ShortDescriptionAssignment_4_0_1_0_1 ) )
            // InternalBug304681TestLanguage.g:2160:1: ( rule__Reference__ShortDescriptionAssignment_4_0_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getShortDescriptionAssignment_4_0_1_0_1()); 
            }
            // InternalBug304681TestLanguage.g:2161:1: ( rule__Reference__ShortDescriptionAssignment_4_0_1_0_1 )
            // InternalBug304681TestLanguage.g:2161:2: rule__Reference__ShortDescriptionAssignment_4_0_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__ShortDescriptionAssignment_4_0_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getShortDescriptionAssignment_4_0_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0_1_0__1__Impl"


    // $ANTLR start "rule__Reference__Group_4_0_1_0__2"
    // InternalBug304681TestLanguage.g:2171:1: rule__Reference__Group_4_0_1_0__2 : rule__Reference__Group_4_0_1_0__2__Impl ;
    public final void rule__Reference__Group_4_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2175:1: ( rule__Reference__Group_4_0_1_0__2__Impl )
            // InternalBug304681TestLanguage.g:2176:2: rule__Reference__Group_4_0_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group_4_0_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0_1_0__2"


    // $ANTLR start "rule__Reference__Group_4_0_1_0__2__Impl"
    // InternalBug304681TestLanguage.g:2182:1: rule__Reference__Group_4_0_1_0__2__Impl : ( ';' ) ;
    public final void rule__Reference__Group_4_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2186:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:2187:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:2187:1: ( ';' )
            // InternalBug304681TestLanguage.g:2188:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getSemicolonKeyword_4_0_1_0_2()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getSemicolonKeyword_4_0_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0_1_0__2__Impl"


    // $ANTLR start "rule__Reference__Group_4_0_1_1__0"
    // InternalBug304681TestLanguage.g:2207:1: rule__Reference__Group_4_0_1_1__0 : rule__Reference__Group_4_0_1_1__0__Impl rule__Reference__Group_4_0_1_1__1 ;
    public final void rule__Reference__Group_4_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2211:1: ( rule__Reference__Group_4_0_1_1__0__Impl rule__Reference__Group_4_0_1_1__1 )
            // InternalBug304681TestLanguage.g:2212:2: rule__Reference__Group_4_0_1_1__0__Impl rule__Reference__Group_4_0_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Reference__Group_4_0_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group_4_0_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0_1_1__0"


    // $ANTLR start "rule__Reference__Group_4_0_1_1__0__Impl"
    // InternalBug304681TestLanguage.g:2219:1: rule__Reference__Group_4_0_1_1__0__Impl : ( 'longDescription' ) ;
    public final void rule__Reference__Group_4_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2223:1: ( ( 'longDescription' ) )
            // InternalBug304681TestLanguage.g:2224:1: ( 'longDescription' )
            {
            // InternalBug304681TestLanguage.g:2224:1: ( 'longDescription' )
            // InternalBug304681TestLanguage.g:2225:1: 'longDescription'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getLongDescriptionKeyword_4_0_1_1_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getLongDescriptionKeyword_4_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0_1_1__0__Impl"


    // $ANTLR start "rule__Reference__Group_4_0_1_1__1"
    // InternalBug304681TestLanguage.g:2238:1: rule__Reference__Group_4_0_1_1__1 : rule__Reference__Group_4_0_1_1__1__Impl rule__Reference__Group_4_0_1_1__2 ;
    public final void rule__Reference__Group_4_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2242:1: ( rule__Reference__Group_4_0_1_1__1__Impl rule__Reference__Group_4_0_1_1__2 )
            // InternalBug304681TestLanguage.g:2243:2: rule__Reference__Group_4_0_1_1__1__Impl rule__Reference__Group_4_0_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Reference__Group_4_0_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group_4_0_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0_1_1__1"


    // $ANTLR start "rule__Reference__Group_4_0_1_1__1__Impl"
    // InternalBug304681TestLanguage.g:2250:1: rule__Reference__Group_4_0_1_1__1__Impl : ( ( rule__Reference__LongDescriptionAssignment_4_0_1_1_1 ) ) ;
    public final void rule__Reference__Group_4_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2254:1: ( ( ( rule__Reference__LongDescriptionAssignment_4_0_1_1_1 ) ) )
            // InternalBug304681TestLanguage.g:2255:1: ( ( rule__Reference__LongDescriptionAssignment_4_0_1_1_1 ) )
            {
            // InternalBug304681TestLanguage.g:2255:1: ( ( rule__Reference__LongDescriptionAssignment_4_0_1_1_1 ) )
            // InternalBug304681TestLanguage.g:2256:1: ( rule__Reference__LongDescriptionAssignment_4_0_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getLongDescriptionAssignment_4_0_1_1_1()); 
            }
            // InternalBug304681TestLanguage.g:2257:1: ( rule__Reference__LongDescriptionAssignment_4_0_1_1_1 )
            // InternalBug304681TestLanguage.g:2257:2: rule__Reference__LongDescriptionAssignment_4_0_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__LongDescriptionAssignment_4_0_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getLongDescriptionAssignment_4_0_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0_1_1__1__Impl"


    // $ANTLR start "rule__Reference__Group_4_0_1_1__2"
    // InternalBug304681TestLanguage.g:2267:1: rule__Reference__Group_4_0_1_1__2 : rule__Reference__Group_4_0_1_1__2__Impl ;
    public final void rule__Reference__Group_4_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2271:1: ( rule__Reference__Group_4_0_1_1__2__Impl )
            // InternalBug304681TestLanguage.g:2272:2: rule__Reference__Group_4_0_1_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group_4_0_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0_1_1__2"


    // $ANTLR start "rule__Reference__Group_4_0_1_1__2__Impl"
    // InternalBug304681TestLanguage.g:2278:1: rule__Reference__Group_4_0_1_1__2__Impl : ( ';' ) ;
    public final void rule__Reference__Group_4_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2282:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:2283:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:2283:1: ( ';' )
            // InternalBug304681TestLanguage.g:2284:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getSemicolonKeyword_4_0_1_1_2()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getSemicolonKeyword_4_0_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4_0_1_1__2__Impl"


    // $ANTLR start "rule__PackageDefinition2__Group__0"
    // InternalBug304681TestLanguage.g:2303:1: rule__PackageDefinition2__Group__0 : rule__PackageDefinition2__Group__0__Impl rule__PackageDefinition2__Group__1 ;
    public final void rule__PackageDefinition2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2307:1: ( rule__PackageDefinition2__Group__0__Impl rule__PackageDefinition2__Group__1 )
            // InternalBug304681TestLanguage.g:2308:2: rule__PackageDefinition2__Group__0__Impl rule__PackageDefinition2__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__PackageDefinition2__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PackageDefinition2__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition2__Group__0"


    // $ANTLR start "rule__PackageDefinition2__Group__0__Impl"
    // InternalBug304681TestLanguage.g:2315:1: rule__PackageDefinition2__Group__0__Impl : ( () ) ;
    public final void rule__PackageDefinition2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2319:1: ( ( () ) )
            // InternalBug304681TestLanguage.g:2320:1: ( () )
            {
            // InternalBug304681TestLanguage.g:2320:1: ( () )
            // InternalBug304681TestLanguage.g:2321:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinition2Access().getPackageDefinitionAction_0()); 
            }
            // InternalBug304681TestLanguage.g:2322:1: ()
            // InternalBug304681TestLanguage.g:2324:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinition2Access().getPackageDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition2__Group__0__Impl"


    // $ANTLR start "rule__PackageDefinition2__Group__1"
    // InternalBug304681TestLanguage.g:2334:1: rule__PackageDefinition2__Group__1 : rule__PackageDefinition2__Group__1__Impl rule__PackageDefinition2__Group__2 ;
    public final void rule__PackageDefinition2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2338:1: ( rule__PackageDefinition2__Group__1__Impl rule__PackageDefinition2__Group__2 )
            // InternalBug304681TestLanguage.g:2339:2: rule__PackageDefinition2__Group__1__Impl rule__PackageDefinition2__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__PackageDefinition2__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PackageDefinition2__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition2__Group__1"


    // $ANTLR start "rule__PackageDefinition2__Group__1__Impl"
    // InternalBug304681TestLanguage.g:2346:1: rule__PackageDefinition2__Group__1__Impl : ( 'package' ) ;
    public final void rule__PackageDefinition2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2350:1: ( ( 'package' ) )
            // InternalBug304681TestLanguage.g:2351:1: ( 'package' )
            {
            // InternalBug304681TestLanguage.g:2351:1: ( 'package' )
            // InternalBug304681TestLanguage.g:2352:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinition2Access().getPackageKeyword_1()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinition2Access().getPackageKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition2__Group__1__Impl"


    // $ANTLR start "rule__PackageDefinition2__Group__2"
    // InternalBug304681TestLanguage.g:2365:1: rule__PackageDefinition2__Group__2 : rule__PackageDefinition2__Group__2__Impl rule__PackageDefinition2__Group__3 ;
    public final void rule__PackageDefinition2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2369:1: ( rule__PackageDefinition2__Group__2__Impl rule__PackageDefinition2__Group__3 )
            // InternalBug304681TestLanguage.g:2370:2: rule__PackageDefinition2__Group__2__Impl rule__PackageDefinition2__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__PackageDefinition2__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PackageDefinition2__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition2__Group__2"


    // $ANTLR start "rule__PackageDefinition2__Group__2__Impl"
    // InternalBug304681TestLanguage.g:2377:1: rule__PackageDefinition2__Group__2__Impl : ( ( rule__PackageDefinition2__NamespaceAssignment_2 ) ) ;
    public final void rule__PackageDefinition2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2381:1: ( ( ( rule__PackageDefinition2__NamespaceAssignment_2 ) ) )
            // InternalBug304681TestLanguage.g:2382:1: ( ( rule__PackageDefinition2__NamespaceAssignment_2 ) )
            {
            // InternalBug304681TestLanguage.g:2382:1: ( ( rule__PackageDefinition2__NamespaceAssignment_2 ) )
            // InternalBug304681TestLanguage.g:2383:1: ( rule__PackageDefinition2__NamespaceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinition2Access().getNamespaceAssignment_2()); 
            }
            // InternalBug304681TestLanguage.g:2384:1: ( rule__PackageDefinition2__NamespaceAssignment_2 )
            // InternalBug304681TestLanguage.g:2384:2: rule__PackageDefinition2__NamespaceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PackageDefinition2__NamespaceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinition2Access().getNamespaceAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition2__Group__2__Impl"


    // $ANTLR start "rule__PackageDefinition2__Group__3"
    // InternalBug304681TestLanguage.g:2394:1: rule__PackageDefinition2__Group__3 : rule__PackageDefinition2__Group__3__Impl rule__PackageDefinition2__Group__4 ;
    public final void rule__PackageDefinition2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2398:1: ( rule__PackageDefinition2__Group__3__Impl rule__PackageDefinition2__Group__4 )
            // InternalBug304681TestLanguage.g:2399:2: rule__PackageDefinition2__Group__3__Impl rule__PackageDefinition2__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__PackageDefinition2__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PackageDefinition2__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition2__Group__3"


    // $ANTLR start "rule__PackageDefinition2__Group__3__Impl"
    // InternalBug304681TestLanguage.g:2406:1: rule__PackageDefinition2__Group__3__Impl : ( ';' ) ;
    public final void rule__PackageDefinition2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2410:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:2411:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:2411:1: ( ';' )
            // InternalBug304681TestLanguage.g:2412:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinition2Access().getSemicolonKeyword_3()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinition2Access().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition2__Group__3__Impl"


    // $ANTLR start "rule__PackageDefinition2__Group__4"
    // InternalBug304681TestLanguage.g:2425:1: rule__PackageDefinition2__Group__4 : rule__PackageDefinition2__Group__4__Impl ;
    public final void rule__PackageDefinition2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2429:1: ( rule__PackageDefinition2__Group__4__Impl )
            // InternalBug304681TestLanguage.g:2430:2: rule__PackageDefinition2__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PackageDefinition2__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition2__Group__4"


    // $ANTLR start "rule__PackageDefinition2__Group__4__Impl"
    // InternalBug304681TestLanguage.g:2436:1: rule__PackageDefinition2__Group__4__Impl : ( ( rule__PackageDefinition2__ContentsAssignment_4 )* ) ;
    public final void rule__PackageDefinition2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2440:1: ( ( ( rule__PackageDefinition2__ContentsAssignment_4 )* ) )
            // InternalBug304681TestLanguage.g:2441:1: ( ( rule__PackageDefinition2__ContentsAssignment_4 )* )
            {
            // InternalBug304681TestLanguage.g:2441:1: ( ( rule__PackageDefinition2__ContentsAssignment_4 )* )
            // InternalBug304681TestLanguage.g:2442:1: ( rule__PackageDefinition2__ContentsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinition2Access().getContentsAssignment_4()); 
            }
            // InternalBug304681TestLanguage.g:2443:1: ( rule__PackageDefinition2__ContentsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15||(LA16_0>=31 && LA16_0<=32)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBug304681TestLanguage.g:2443:2: rule__PackageDefinition2__ContentsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__PackageDefinition2__ContentsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinition2Access().getContentsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition2__Group__4__Impl"


    // $ANTLR start "rule__Object2__Group__0"
    // InternalBug304681TestLanguage.g:2463:1: rule__Object2__Group__0 : rule__Object2__Group__0__Impl rule__Object2__Group__1 ;
    public final void rule__Object2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2467:1: ( rule__Object2__Group__0__Impl rule__Object2__Group__1 )
            // InternalBug304681TestLanguage.g:2468:2: rule__Object2__Group__0__Impl rule__Object2__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Object2__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group__0"


    // $ANTLR start "rule__Object2__Group__0__Impl"
    // InternalBug304681TestLanguage.g:2475:1: rule__Object2__Group__0__Impl : ( ( rule__Object2__Alternatives_0 )? ) ;
    public final void rule__Object2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2479:1: ( ( ( rule__Object2__Alternatives_0 )? ) )
            // InternalBug304681TestLanguage.g:2480:1: ( ( rule__Object2__Alternatives_0 )? )
            {
            // InternalBug304681TestLanguage.g:2480:1: ( ( rule__Object2__Alternatives_0 )? )
            // InternalBug304681TestLanguage.g:2481:1: ( rule__Object2__Alternatives_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getAlternatives_0()); 
            }
            // InternalBug304681TestLanguage.g:2482:1: ( rule__Object2__Alternatives_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=31 && LA17_0<=32)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBug304681TestLanguage.g:2482:2: rule__Object2__Alternatives_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object2__Alternatives_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group__0__Impl"


    // $ANTLR start "rule__Object2__Group__1"
    // InternalBug304681TestLanguage.g:2492:1: rule__Object2__Group__1 : rule__Object2__Group__1__Impl rule__Object2__Group__2 ;
    public final void rule__Object2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2496:1: ( rule__Object2__Group__1__Impl rule__Object2__Group__2 )
            // InternalBug304681TestLanguage.g:2497:2: rule__Object2__Group__1__Impl rule__Object2__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Object2__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group__1"


    // $ANTLR start "rule__Object2__Group__1__Impl"
    // InternalBug304681TestLanguage.g:2504:1: rule__Object2__Group__1__Impl : ( 'object' ) ;
    public final void rule__Object2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2508:1: ( ( 'object' ) )
            // InternalBug304681TestLanguage.g:2509:1: ( 'object' )
            {
            // InternalBug304681TestLanguage.g:2509:1: ( 'object' )
            // InternalBug304681TestLanguage.g:2510:1: 'object'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getObjectKeyword_1()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getObjectKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group__1__Impl"


    // $ANTLR start "rule__Object2__Group__2"
    // InternalBug304681TestLanguage.g:2523:1: rule__Object2__Group__2 : rule__Object2__Group__2__Impl rule__Object2__Group__3 ;
    public final void rule__Object2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2527:1: ( rule__Object2__Group__2__Impl rule__Object2__Group__3 )
            // InternalBug304681TestLanguage.g:2528:2: rule__Object2__Group__2__Impl rule__Object2__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Object2__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group__2"


    // $ANTLR start "rule__Object2__Group__2__Impl"
    // InternalBug304681TestLanguage.g:2535:1: rule__Object2__Group__2__Impl : ( ( rule__Object2__NameAssignment_2 ) ) ;
    public final void rule__Object2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2539:1: ( ( ( rule__Object2__NameAssignment_2 ) ) )
            // InternalBug304681TestLanguage.g:2540:1: ( ( rule__Object2__NameAssignment_2 ) )
            {
            // InternalBug304681TestLanguage.g:2540:1: ( ( rule__Object2__NameAssignment_2 ) )
            // InternalBug304681TestLanguage.g:2541:1: ( rule__Object2__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getNameAssignment_2()); 
            }
            // InternalBug304681TestLanguage.g:2542:1: ( rule__Object2__NameAssignment_2 )
            // InternalBug304681TestLanguage.g:2542:2: rule__Object2__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group__2__Impl"


    // $ANTLR start "rule__Object2__Group__3"
    // InternalBug304681TestLanguage.g:2552:1: rule__Object2__Group__3 : rule__Object2__Group__3__Impl rule__Object2__Group__4 ;
    public final void rule__Object2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2556:1: ( rule__Object2__Group__3__Impl rule__Object2__Group__4 )
            // InternalBug304681TestLanguage.g:2557:2: rule__Object2__Group__3__Impl rule__Object2__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Object2__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group__3"


    // $ANTLR start "rule__Object2__Group__3__Impl"
    // InternalBug304681TestLanguage.g:2564:1: rule__Object2__Group__3__Impl : ( ( rule__Object2__Group_3__0 )? ) ;
    public final void rule__Object2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2568:1: ( ( ( rule__Object2__Group_3__0 )? ) )
            // InternalBug304681TestLanguage.g:2569:1: ( ( rule__Object2__Group_3__0 )? )
            {
            // InternalBug304681TestLanguage.g:2569:1: ( ( rule__Object2__Group_3__0 )? )
            // InternalBug304681TestLanguage.g:2570:1: ( rule__Object2__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getGroup_3()); 
            }
            // InternalBug304681TestLanguage.g:2571:1: ( rule__Object2__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBug304681TestLanguage.g:2571:2: rule__Object2__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object2__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group__3__Impl"


    // $ANTLR start "rule__Object2__Group__4"
    // InternalBug304681TestLanguage.g:2581:1: rule__Object2__Group__4 : rule__Object2__Group__4__Impl rule__Object2__Group__5 ;
    public final void rule__Object2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2585:1: ( rule__Object2__Group__4__Impl rule__Object2__Group__5 )
            // InternalBug304681TestLanguage.g:2586:2: rule__Object2__Group__4__Impl rule__Object2__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Object2__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group__4"


    // $ANTLR start "rule__Object2__Group__4__Impl"
    // InternalBug304681TestLanguage.g:2593:1: rule__Object2__Group__4__Impl : ( '{' ) ;
    public final void rule__Object2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2597:1: ( ( '{' ) )
            // InternalBug304681TestLanguage.g:2598:1: ( '{' )
            {
            // InternalBug304681TestLanguage.g:2598:1: ( '{' )
            // InternalBug304681TestLanguage.g:2599:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group__4__Impl"


    // $ANTLR start "rule__Object2__Group__5"
    // InternalBug304681TestLanguage.g:2612:1: rule__Object2__Group__5 : rule__Object2__Group__5__Impl rule__Object2__Group__6 ;
    public final void rule__Object2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2616:1: ( rule__Object2__Group__5__Impl rule__Object2__Group__6 )
            // InternalBug304681TestLanguage.g:2617:2: rule__Object2__Group__5__Impl rule__Object2__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Object2__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group__5"


    // $ANTLR start "rule__Object2__Group__5__Impl"
    // InternalBug304681TestLanguage.g:2624:1: rule__Object2__Group__5__Impl : ( ( rule__Object2__UnorderedGroup_5 ) ) ;
    public final void rule__Object2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2628:1: ( ( ( rule__Object2__UnorderedGroup_5 ) ) )
            // InternalBug304681TestLanguage.g:2629:1: ( ( rule__Object2__UnorderedGroup_5 ) )
            {
            // InternalBug304681TestLanguage.g:2629:1: ( ( rule__Object2__UnorderedGroup_5 ) )
            // InternalBug304681TestLanguage.g:2630:1: ( rule__Object2__UnorderedGroup_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getUnorderedGroup_5()); 
            }
            // InternalBug304681TestLanguage.g:2631:1: ( rule__Object2__UnorderedGroup_5 )
            // InternalBug304681TestLanguage.g:2631:2: rule__Object2__UnorderedGroup_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__UnorderedGroup_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getUnorderedGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group__5__Impl"


    // $ANTLR start "rule__Object2__Group__6"
    // InternalBug304681TestLanguage.g:2641:1: rule__Object2__Group__6 : rule__Object2__Group__6__Impl ;
    public final void rule__Object2__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2645:1: ( rule__Object2__Group__6__Impl )
            // InternalBug304681TestLanguage.g:2646:2: rule__Object2__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group__6"


    // $ANTLR start "rule__Object2__Group__6__Impl"
    // InternalBug304681TestLanguage.g:2652:1: rule__Object2__Group__6__Impl : ( '}' ) ;
    public final void rule__Object2__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2656:1: ( ( '}' ) )
            // InternalBug304681TestLanguage.g:2657:1: ( '}' )
            {
            // InternalBug304681TestLanguage.g:2657:1: ( '}' )
            // InternalBug304681TestLanguage.g:2658:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getRightCurlyBracketKeyword_6()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group__6__Impl"


    // $ANTLR start "rule__Object2__Group_3__0"
    // InternalBug304681TestLanguage.g:2685:1: rule__Object2__Group_3__0 : rule__Object2__Group_3__0__Impl rule__Object2__Group_3__1 ;
    public final void rule__Object2__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2689:1: ( rule__Object2__Group_3__0__Impl rule__Object2__Group_3__1 )
            // InternalBug304681TestLanguage.g:2690:2: rule__Object2__Group_3__0__Impl rule__Object2__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Object2__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_3__0"


    // $ANTLR start "rule__Object2__Group_3__0__Impl"
    // InternalBug304681TestLanguage.g:2697:1: rule__Object2__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Object2__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2701:1: ( ( 'extends' ) )
            // InternalBug304681TestLanguage.g:2702:1: ( 'extends' )
            {
            // InternalBug304681TestLanguage.g:2702:1: ( 'extends' )
            // InternalBug304681TestLanguage.g:2703:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getExtendsKeyword_3_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getExtendsKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_3__0__Impl"


    // $ANTLR start "rule__Object2__Group_3__1"
    // InternalBug304681TestLanguage.g:2716:1: rule__Object2__Group_3__1 : rule__Object2__Group_3__1__Impl ;
    public final void rule__Object2__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2720:1: ( rule__Object2__Group_3__1__Impl )
            // InternalBug304681TestLanguage.g:2721:2: rule__Object2__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_3__1"


    // $ANTLR start "rule__Object2__Group_3__1__Impl"
    // InternalBug304681TestLanguage.g:2727:1: rule__Object2__Group_3__1__Impl : ( ( rule__Object2__ParentAssignment_3_1 ) ) ;
    public final void rule__Object2__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2731:1: ( ( ( rule__Object2__ParentAssignment_3_1 ) ) )
            // InternalBug304681TestLanguage.g:2732:1: ( ( rule__Object2__ParentAssignment_3_1 ) )
            {
            // InternalBug304681TestLanguage.g:2732:1: ( ( rule__Object2__ParentAssignment_3_1 ) )
            // InternalBug304681TestLanguage.g:2733:1: ( rule__Object2__ParentAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getParentAssignment_3_1()); 
            }
            // InternalBug304681TestLanguage.g:2734:1: ( rule__Object2__ParentAssignment_3_1 )
            // InternalBug304681TestLanguage.g:2734:2: rule__Object2__ParentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__ParentAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getParentAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_3__1__Impl"


    // $ANTLR start "rule__Object2__Group_5_0__0"
    // InternalBug304681TestLanguage.g:2748:1: rule__Object2__Group_5_0__0 : rule__Object2__Group_5_0__0__Impl rule__Object2__Group_5_0__1 ;
    public final void rule__Object2__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2752:1: ( rule__Object2__Group_5_0__0__Impl rule__Object2__Group_5_0__1 )
            // InternalBug304681TestLanguage.g:2753:2: rule__Object2__Group_5_0__0__Impl rule__Object2__Group_5_0__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Object2__Group_5_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group_5_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_0__0"


    // $ANTLR start "rule__Object2__Group_5_0__0__Impl"
    // InternalBug304681TestLanguage.g:2760:1: rule__Object2__Group_5_0__0__Impl : ( 'shortDescription' ) ;
    public final void rule__Object2__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2764:1: ( ( 'shortDescription' ) )
            // InternalBug304681TestLanguage.g:2765:1: ( 'shortDescription' )
            {
            // InternalBug304681TestLanguage.g:2765:1: ( 'shortDescription' )
            // InternalBug304681TestLanguage.g:2766:1: 'shortDescription'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getShortDescriptionKeyword_5_0_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getShortDescriptionKeyword_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_0__0__Impl"


    // $ANTLR start "rule__Object2__Group_5_0__1"
    // InternalBug304681TestLanguage.g:2779:1: rule__Object2__Group_5_0__1 : rule__Object2__Group_5_0__1__Impl rule__Object2__Group_5_0__2 ;
    public final void rule__Object2__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2783:1: ( rule__Object2__Group_5_0__1__Impl rule__Object2__Group_5_0__2 )
            // InternalBug304681TestLanguage.g:2784:2: rule__Object2__Group_5_0__1__Impl rule__Object2__Group_5_0__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Object2__Group_5_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group_5_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_0__1"


    // $ANTLR start "rule__Object2__Group_5_0__1__Impl"
    // InternalBug304681TestLanguage.g:2791:1: rule__Object2__Group_5_0__1__Impl : ( ( rule__Object2__ShortDescriptionAssignment_5_0_1 ) ) ;
    public final void rule__Object2__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2795:1: ( ( ( rule__Object2__ShortDescriptionAssignment_5_0_1 ) ) )
            // InternalBug304681TestLanguage.g:2796:1: ( ( rule__Object2__ShortDescriptionAssignment_5_0_1 ) )
            {
            // InternalBug304681TestLanguage.g:2796:1: ( ( rule__Object2__ShortDescriptionAssignment_5_0_1 ) )
            // InternalBug304681TestLanguage.g:2797:1: ( rule__Object2__ShortDescriptionAssignment_5_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getShortDescriptionAssignment_5_0_1()); 
            }
            // InternalBug304681TestLanguage.g:2798:1: ( rule__Object2__ShortDescriptionAssignment_5_0_1 )
            // InternalBug304681TestLanguage.g:2798:2: rule__Object2__ShortDescriptionAssignment_5_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__ShortDescriptionAssignment_5_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getShortDescriptionAssignment_5_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_0__1__Impl"


    // $ANTLR start "rule__Object2__Group_5_0__2"
    // InternalBug304681TestLanguage.g:2808:1: rule__Object2__Group_5_0__2 : rule__Object2__Group_5_0__2__Impl ;
    public final void rule__Object2__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2812:1: ( rule__Object2__Group_5_0__2__Impl )
            // InternalBug304681TestLanguage.g:2813:2: rule__Object2__Group_5_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group_5_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_0__2"


    // $ANTLR start "rule__Object2__Group_5_0__2__Impl"
    // InternalBug304681TestLanguage.g:2819:1: rule__Object2__Group_5_0__2__Impl : ( ';' ) ;
    public final void rule__Object2__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2823:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:2824:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:2824:1: ( ';' )
            // InternalBug304681TestLanguage.g:2825:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getSemicolonKeyword_5_0_2()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getSemicolonKeyword_5_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_0__2__Impl"


    // $ANTLR start "rule__Object2__Group_5_1__0"
    // InternalBug304681TestLanguage.g:2844:1: rule__Object2__Group_5_1__0 : rule__Object2__Group_5_1__0__Impl rule__Object2__Group_5_1__1 ;
    public final void rule__Object2__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2848:1: ( rule__Object2__Group_5_1__0__Impl rule__Object2__Group_5_1__1 )
            // InternalBug304681TestLanguage.g:2849:2: rule__Object2__Group_5_1__0__Impl rule__Object2__Group_5_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Object2__Group_5_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group_5_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_1__0"


    // $ANTLR start "rule__Object2__Group_5_1__0__Impl"
    // InternalBug304681TestLanguage.g:2856:1: rule__Object2__Group_5_1__0__Impl : ( 'longDescription' ) ;
    public final void rule__Object2__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2860:1: ( ( 'longDescription' ) )
            // InternalBug304681TestLanguage.g:2861:1: ( 'longDescription' )
            {
            // InternalBug304681TestLanguage.g:2861:1: ( 'longDescription' )
            // InternalBug304681TestLanguage.g:2862:1: 'longDescription'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getLongDescriptionKeyword_5_1_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getLongDescriptionKeyword_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_1__0__Impl"


    // $ANTLR start "rule__Object2__Group_5_1__1"
    // InternalBug304681TestLanguage.g:2875:1: rule__Object2__Group_5_1__1 : rule__Object2__Group_5_1__1__Impl rule__Object2__Group_5_1__2 ;
    public final void rule__Object2__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2879:1: ( rule__Object2__Group_5_1__1__Impl rule__Object2__Group_5_1__2 )
            // InternalBug304681TestLanguage.g:2880:2: rule__Object2__Group_5_1__1__Impl rule__Object2__Group_5_1__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Object2__Group_5_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group_5_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_1__1"


    // $ANTLR start "rule__Object2__Group_5_1__1__Impl"
    // InternalBug304681TestLanguage.g:2887:1: rule__Object2__Group_5_1__1__Impl : ( ( rule__Object2__LongDescriptionAssignment_5_1_1 ) ) ;
    public final void rule__Object2__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2891:1: ( ( ( rule__Object2__LongDescriptionAssignment_5_1_1 ) ) )
            // InternalBug304681TestLanguage.g:2892:1: ( ( rule__Object2__LongDescriptionAssignment_5_1_1 ) )
            {
            // InternalBug304681TestLanguage.g:2892:1: ( ( rule__Object2__LongDescriptionAssignment_5_1_1 ) )
            // InternalBug304681TestLanguage.g:2893:1: ( rule__Object2__LongDescriptionAssignment_5_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getLongDescriptionAssignment_5_1_1()); 
            }
            // InternalBug304681TestLanguage.g:2894:1: ( rule__Object2__LongDescriptionAssignment_5_1_1 )
            // InternalBug304681TestLanguage.g:2894:2: rule__Object2__LongDescriptionAssignment_5_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__LongDescriptionAssignment_5_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getLongDescriptionAssignment_5_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_1__1__Impl"


    // $ANTLR start "rule__Object2__Group_5_1__2"
    // InternalBug304681TestLanguage.g:2904:1: rule__Object2__Group_5_1__2 : rule__Object2__Group_5_1__2__Impl ;
    public final void rule__Object2__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2908:1: ( rule__Object2__Group_5_1__2__Impl )
            // InternalBug304681TestLanguage.g:2909:2: rule__Object2__Group_5_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group_5_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_1__2"


    // $ANTLR start "rule__Object2__Group_5_1__2__Impl"
    // InternalBug304681TestLanguage.g:2915:1: rule__Object2__Group_5_1__2__Impl : ( ';' ) ;
    public final void rule__Object2__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2919:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:2920:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:2920:1: ( ';' )
            // InternalBug304681TestLanguage.g:2921:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getSemicolonKeyword_5_1_2()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getSemicolonKeyword_5_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_1__2__Impl"


    // $ANTLR start "rule__Object2__Group_5_2__0"
    // InternalBug304681TestLanguage.g:2940:1: rule__Object2__Group_5_2__0 : rule__Object2__Group_5_2__0__Impl rule__Object2__Group_5_2__1 ;
    public final void rule__Object2__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2944:1: ( rule__Object2__Group_5_2__0__Impl rule__Object2__Group_5_2__1 )
            // InternalBug304681TestLanguage.g:2945:2: rule__Object2__Group_5_2__0__Impl rule__Object2__Group_5_2__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Object2__Group_5_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group_5_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_2__0"


    // $ANTLR start "rule__Object2__Group_5_2__0__Impl"
    // InternalBug304681TestLanguage.g:2952:1: rule__Object2__Group_5_2__0__Impl : ( 'serialUID' ) ;
    public final void rule__Object2__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2956:1: ( ( 'serialUID' ) )
            // InternalBug304681TestLanguage.g:2957:1: ( 'serialUID' )
            {
            // InternalBug304681TestLanguage.g:2957:1: ( 'serialUID' )
            // InternalBug304681TestLanguage.g:2958:1: 'serialUID'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getSerialUIDKeyword_5_2_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getSerialUIDKeyword_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_2__0__Impl"


    // $ANTLR start "rule__Object2__Group_5_2__1"
    // InternalBug304681TestLanguage.g:2971:1: rule__Object2__Group_5_2__1 : rule__Object2__Group_5_2__1__Impl rule__Object2__Group_5_2__2 ;
    public final void rule__Object2__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2975:1: ( rule__Object2__Group_5_2__1__Impl rule__Object2__Group_5_2__2 )
            // InternalBug304681TestLanguage.g:2976:2: rule__Object2__Group_5_2__1__Impl rule__Object2__Group_5_2__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Object2__Group_5_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group_5_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_2__1"


    // $ANTLR start "rule__Object2__Group_5_2__1__Impl"
    // InternalBug304681TestLanguage.g:2983:1: rule__Object2__Group_5_2__1__Impl : ( ( rule__Object2__SerialVersionUIDAssignment_5_2_1 ) ) ;
    public final void rule__Object2__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:2987:1: ( ( ( rule__Object2__SerialVersionUIDAssignment_5_2_1 ) ) )
            // InternalBug304681TestLanguage.g:2988:1: ( ( rule__Object2__SerialVersionUIDAssignment_5_2_1 ) )
            {
            // InternalBug304681TestLanguage.g:2988:1: ( ( rule__Object2__SerialVersionUIDAssignment_5_2_1 ) )
            // InternalBug304681TestLanguage.g:2989:1: ( rule__Object2__SerialVersionUIDAssignment_5_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getSerialVersionUIDAssignment_5_2_1()); 
            }
            // InternalBug304681TestLanguage.g:2990:1: ( rule__Object2__SerialVersionUIDAssignment_5_2_1 )
            // InternalBug304681TestLanguage.g:2990:2: rule__Object2__SerialVersionUIDAssignment_5_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__SerialVersionUIDAssignment_5_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getSerialVersionUIDAssignment_5_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_2__1__Impl"


    // $ANTLR start "rule__Object2__Group_5_2__2"
    // InternalBug304681TestLanguage.g:3000:1: rule__Object2__Group_5_2__2 : rule__Object2__Group_5_2__2__Impl ;
    public final void rule__Object2__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3004:1: ( rule__Object2__Group_5_2__2__Impl )
            // InternalBug304681TestLanguage.g:3005:2: rule__Object2__Group_5_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group_5_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_2__2"


    // $ANTLR start "rule__Object2__Group_5_2__2__Impl"
    // InternalBug304681TestLanguage.g:3011:1: rule__Object2__Group_5_2__2__Impl : ( ';' ) ;
    public final void rule__Object2__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3015:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:3016:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:3016:1: ( ';' )
            // InternalBug304681TestLanguage.g:3017:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getSemicolonKeyword_5_2_2()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getSemicolonKeyword_5_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_2__2__Impl"


    // $ANTLR start "rule__Object2__Group_5_3__0"
    // InternalBug304681TestLanguage.g:3036:1: rule__Object2__Group_5_3__0 : rule__Object2__Group_5_3__0__Impl rule__Object2__Group_5_3__1 ;
    public final void rule__Object2__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3040:1: ( rule__Object2__Group_5_3__0__Impl rule__Object2__Group_5_3__1 )
            // InternalBug304681TestLanguage.g:3041:2: rule__Object2__Group_5_3__0__Impl rule__Object2__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Object2__Group_5_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group_5_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_3__0"


    // $ANTLR start "rule__Object2__Group_5_3__0__Impl"
    // InternalBug304681TestLanguage.g:3048:1: rule__Object2__Group_5_3__0__Impl : ( ( rule__Object2__CloneableAssignment_5_3_0 ) ) ;
    public final void rule__Object2__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3052:1: ( ( ( rule__Object2__CloneableAssignment_5_3_0 ) ) )
            // InternalBug304681TestLanguage.g:3053:1: ( ( rule__Object2__CloneableAssignment_5_3_0 ) )
            {
            // InternalBug304681TestLanguage.g:3053:1: ( ( rule__Object2__CloneableAssignment_5_3_0 ) )
            // InternalBug304681TestLanguage.g:3054:1: ( rule__Object2__CloneableAssignment_5_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getCloneableAssignment_5_3_0()); 
            }
            // InternalBug304681TestLanguage.g:3055:1: ( rule__Object2__CloneableAssignment_5_3_0 )
            // InternalBug304681TestLanguage.g:3055:2: rule__Object2__CloneableAssignment_5_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__CloneableAssignment_5_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getCloneableAssignment_5_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_3__0__Impl"


    // $ANTLR start "rule__Object2__Group_5_3__1"
    // InternalBug304681TestLanguage.g:3065:1: rule__Object2__Group_5_3__1 : rule__Object2__Group_5_3__1__Impl ;
    public final void rule__Object2__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3069:1: ( rule__Object2__Group_5_3__1__Impl )
            // InternalBug304681TestLanguage.g:3070:2: rule__Object2__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__Group_5_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_3__1"


    // $ANTLR start "rule__Object2__Group_5_3__1__Impl"
    // InternalBug304681TestLanguage.g:3076:1: rule__Object2__Group_5_3__1__Impl : ( ';' ) ;
    public final void rule__Object2__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3080:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:3081:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:3081:1: ( ';' )
            // InternalBug304681TestLanguage.g:3082:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getSemicolonKeyword_5_3_1()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getSemicolonKeyword_5_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__Group_5_3__1__Impl"


    // $ANTLR start "rule__Attribute2__Group__0"
    // InternalBug304681TestLanguage.g:3099:1: rule__Attribute2__Group__0 : rule__Attribute2__Group__0__Impl rule__Attribute2__Group__1 ;
    public final void rule__Attribute2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3103:1: ( rule__Attribute2__Group__0__Impl rule__Attribute2__Group__1 )
            // InternalBug304681TestLanguage.g:3104:2: rule__Attribute2__Group__0__Impl rule__Attribute2__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Attribute2__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group__0"


    // $ANTLR start "rule__Attribute2__Group__0__Impl"
    // InternalBug304681TestLanguage.g:3111:1: rule__Attribute2__Group__0__Impl : ( 'Attribute' ) ;
    public final void rule__Attribute2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3115:1: ( ( 'Attribute' ) )
            // InternalBug304681TestLanguage.g:3116:1: ( 'Attribute' )
            {
            // InternalBug304681TestLanguage.g:3116:1: ( 'Attribute' )
            // InternalBug304681TestLanguage.g:3117:1: 'Attribute'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getAttributeKeyword_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getAttributeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group__0__Impl"


    // $ANTLR start "rule__Attribute2__Group__1"
    // InternalBug304681TestLanguage.g:3130:1: rule__Attribute2__Group__1 : rule__Attribute2__Group__1__Impl rule__Attribute2__Group__2 ;
    public final void rule__Attribute2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3134:1: ( rule__Attribute2__Group__1__Impl rule__Attribute2__Group__2 )
            // InternalBug304681TestLanguage.g:3135:2: rule__Attribute2__Group__1__Impl rule__Attribute2__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Attribute2__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group__1"


    // $ANTLR start "rule__Attribute2__Group__1__Impl"
    // InternalBug304681TestLanguage.g:3142:1: rule__Attribute2__Group__1__Impl : ( ( rule__Attribute2__TypeAssignment_1 ) ) ;
    public final void rule__Attribute2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3146:1: ( ( ( rule__Attribute2__TypeAssignment_1 ) ) )
            // InternalBug304681TestLanguage.g:3147:1: ( ( rule__Attribute2__TypeAssignment_1 ) )
            {
            // InternalBug304681TestLanguage.g:3147:1: ( ( rule__Attribute2__TypeAssignment_1 ) )
            // InternalBug304681TestLanguage.g:3148:1: ( rule__Attribute2__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getTypeAssignment_1()); 
            }
            // InternalBug304681TestLanguage.g:3149:1: ( rule__Attribute2__TypeAssignment_1 )
            // InternalBug304681TestLanguage.g:3149:2: rule__Attribute2__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group__1__Impl"


    // $ANTLR start "rule__Attribute2__Group__2"
    // InternalBug304681TestLanguage.g:3159:1: rule__Attribute2__Group__2 : rule__Attribute2__Group__2__Impl rule__Attribute2__Group__3 ;
    public final void rule__Attribute2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3163:1: ( rule__Attribute2__Group__2__Impl rule__Attribute2__Group__3 )
            // InternalBug304681TestLanguage.g:3164:2: rule__Attribute2__Group__2__Impl rule__Attribute2__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Attribute2__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group__2"


    // $ANTLR start "rule__Attribute2__Group__2__Impl"
    // InternalBug304681TestLanguage.g:3171:1: rule__Attribute2__Group__2__Impl : ( ( rule__Attribute2__NameAssignment_2 ) ) ;
    public final void rule__Attribute2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3175:1: ( ( ( rule__Attribute2__NameAssignment_2 ) ) )
            // InternalBug304681TestLanguage.g:3176:1: ( ( rule__Attribute2__NameAssignment_2 ) )
            {
            // InternalBug304681TestLanguage.g:3176:1: ( ( rule__Attribute2__NameAssignment_2 ) )
            // InternalBug304681TestLanguage.g:3177:1: ( rule__Attribute2__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getNameAssignment_2()); 
            }
            // InternalBug304681TestLanguage.g:3178:1: ( rule__Attribute2__NameAssignment_2 )
            // InternalBug304681TestLanguage.g:3178:2: rule__Attribute2__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group__2__Impl"


    // $ANTLR start "rule__Attribute2__Group__3"
    // InternalBug304681TestLanguage.g:3188:1: rule__Attribute2__Group__3 : rule__Attribute2__Group__3__Impl ;
    public final void rule__Attribute2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3192:1: ( rule__Attribute2__Group__3__Impl )
            // InternalBug304681TestLanguage.g:3193:2: rule__Attribute2__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group__3"


    // $ANTLR start "rule__Attribute2__Group__3__Impl"
    // InternalBug304681TestLanguage.g:3199:1: rule__Attribute2__Group__3__Impl : ( ( rule__Attribute2__Alternatives_3 ) ) ;
    public final void rule__Attribute2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3203:1: ( ( ( rule__Attribute2__Alternatives_3 ) ) )
            // InternalBug304681TestLanguage.g:3204:1: ( ( rule__Attribute2__Alternatives_3 ) )
            {
            // InternalBug304681TestLanguage.g:3204:1: ( ( rule__Attribute2__Alternatives_3 ) )
            // InternalBug304681TestLanguage.g:3205:1: ( rule__Attribute2__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getAlternatives_3()); 
            }
            // InternalBug304681TestLanguage.g:3206:1: ( rule__Attribute2__Alternatives_3 )
            // InternalBug304681TestLanguage.g:3206:2: rule__Attribute2__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group__3__Impl"


    // $ANTLR start "rule__Attribute2__Group_3_0__0"
    // InternalBug304681TestLanguage.g:3224:1: rule__Attribute2__Group_3_0__0 : rule__Attribute2__Group_3_0__0__Impl rule__Attribute2__Group_3_0__1 ;
    public final void rule__Attribute2__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3228:1: ( rule__Attribute2__Group_3_0__0__Impl rule__Attribute2__Group_3_0__1 )
            // InternalBug304681TestLanguage.g:3229:2: rule__Attribute2__Group_3_0__0__Impl rule__Attribute2__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__Attribute2__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0__0"


    // $ANTLR start "rule__Attribute2__Group_3_0__0__Impl"
    // InternalBug304681TestLanguage.g:3236:1: rule__Attribute2__Group_3_0__0__Impl : ( '{' ) ;
    public final void rule__Attribute2__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3240:1: ( ( '{' ) )
            // InternalBug304681TestLanguage.g:3241:1: ( '{' )
            {
            // InternalBug304681TestLanguage.g:3241:1: ( '{' )
            // InternalBug304681TestLanguage.g:3242:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getLeftCurlyBracketKeyword_3_0_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getLeftCurlyBracketKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0__0__Impl"


    // $ANTLR start "rule__Attribute2__Group_3_0__1"
    // InternalBug304681TestLanguage.g:3255:1: rule__Attribute2__Group_3_0__1 : rule__Attribute2__Group_3_0__1__Impl rule__Attribute2__Group_3_0__2 ;
    public final void rule__Attribute2__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3259:1: ( rule__Attribute2__Group_3_0__1__Impl rule__Attribute2__Group_3_0__2 )
            // InternalBug304681TestLanguage.g:3260:2: rule__Attribute2__Group_3_0__1__Impl rule__Attribute2__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Attribute2__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group_3_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0__1"


    // $ANTLR start "rule__Attribute2__Group_3_0__1__Impl"
    // InternalBug304681TestLanguage.g:3267:1: rule__Attribute2__Group_3_0__1__Impl : ( ( rule__Attribute2__UnorderedGroup_3_0_1 ) ) ;
    public final void rule__Attribute2__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3271:1: ( ( ( rule__Attribute2__UnorderedGroup_3_0_1 ) ) )
            // InternalBug304681TestLanguage.g:3272:1: ( ( rule__Attribute2__UnorderedGroup_3_0_1 ) )
            {
            // InternalBug304681TestLanguage.g:3272:1: ( ( rule__Attribute2__UnorderedGroup_3_0_1 ) )
            // InternalBug304681TestLanguage.g:3273:1: ( rule__Attribute2__UnorderedGroup_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1()); 
            }
            // InternalBug304681TestLanguage.g:3274:1: ( rule__Attribute2__UnorderedGroup_3_0_1 )
            // InternalBug304681TestLanguage.g:3274:2: rule__Attribute2__UnorderedGroup_3_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__UnorderedGroup_3_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0__1__Impl"


    // $ANTLR start "rule__Attribute2__Group_3_0__2"
    // InternalBug304681TestLanguage.g:3284:1: rule__Attribute2__Group_3_0__2 : rule__Attribute2__Group_3_0__2__Impl ;
    public final void rule__Attribute2__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3288:1: ( rule__Attribute2__Group_3_0__2__Impl )
            // InternalBug304681TestLanguage.g:3289:2: rule__Attribute2__Group_3_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0__2"


    // $ANTLR start "rule__Attribute2__Group_3_0__2__Impl"
    // InternalBug304681TestLanguage.g:3295:1: rule__Attribute2__Group_3_0__2__Impl : ( '}' ) ;
    public final void rule__Attribute2__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3299:1: ( ( '}' ) )
            // InternalBug304681TestLanguage.g:3300:1: ( '}' )
            {
            // InternalBug304681TestLanguage.g:3300:1: ( '}' )
            // InternalBug304681TestLanguage.g:3301:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getRightCurlyBracketKeyword_3_0_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getRightCurlyBracketKeyword_3_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0__2__Impl"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_0__0"
    // InternalBug304681TestLanguage.g:3320:1: rule__Attribute2__Group_3_0_1_0__0 : rule__Attribute2__Group_3_0_1_0__0__Impl rule__Attribute2__Group_3_0_1_0__1 ;
    public final void rule__Attribute2__Group_3_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3324:1: ( rule__Attribute2__Group_3_0_1_0__0__Impl rule__Attribute2__Group_3_0_1_0__1 )
            // InternalBug304681TestLanguage.g:3325:2: rule__Attribute2__Group_3_0_1_0__0__Impl rule__Attribute2__Group_3_0_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Attribute2__Group_3_0_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group_3_0_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_0__0"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_0__0__Impl"
    // InternalBug304681TestLanguage.g:3332:1: rule__Attribute2__Group_3_0_1_0__0__Impl : ( 'shortDescription' ) ;
    public final void rule__Attribute2__Group_3_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3336:1: ( ( 'shortDescription' ) )
            // InternalBug304681TestLanguage.g:3337:1: ( 'shortDescription' )
            {
            // InternalBug304681TestLanguage.g:3337:1: ( 'shortDescription' )
            // InternalBug304681TestLanguage.g:3338:1: 'shortDescription'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getShortDescriptionKeyword_3_0_1_0_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getShortDescriptionKeyword_3_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_0__0__Impl"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_0__1"
    // InternalBug304681TestLanguage.g:3351:1: rule__Attribute2__Group_3_0_1_0__1 : rule__Attribute2__Group_3_0_1_0__1__Impl rule__Attribute2__Group_3_0_1_0__2 ;
    public final void rule__Attribute2__Group_3_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3355:1: ( rule__Attribute2__Group_3_0_1_0__1__Impl rule__Attribute2__Group_3_0_1_0__2 )
            // InternalBug304681TestLanguage.g:3356:2: rule__Attribute2__Group_3_0_1_0__1__Impl rule__Attribute2__Group_3_0_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Attribute2__Group_3_0_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group_3_0_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_0__1"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_0__1__Impl"
    // InternalBug304681TestLanguage.g:3363:1: rule__Attribute2__Group_3_0_1_0__1__Impl : ( ( rule__Attribute2__ShortDescriptionAssignment_3_0_1_0_1 ) ) ;
    public final void rule__Attribute2__Group_3_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3367:1: ( ( ( rule__Attribute2__ShortDescriptionAssignment_3_0_1_0_1 ) ) )
            // InternalBug304681TestLanguage.g:3368:1: ( ( rule__Attribute2__ShortDescriptionAssignment_3_0_1_0_1 ) )
            {
            // InternalBug304681TestLanguage.g:3368:1: ( ( rule__Attribute2__ShortDescriptionAssignment_3_0_1_0_1 ) )
            // InternalBug304681TestLanguage.g:3369:1: ( rule__Attribute2__ShortDescriptionAssignment_3_0_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getShortDescriptionAssignment_3_0_1_0_1()); 
            }
            // InternalBug304681TestLanguage.g:3370:1: ( rule__Attribute2__ShortDescriptionAssignment_3_0_1_0_1 )
            // InternalBug304681TestLanguage.g:3370:2: rule__Attribute2__ShortDescriptionAssignment_3_0_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__ShortDescriptionAssignment_3_0_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getShortDescriptionAssignment_3_0_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_0__1__Impl"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_0__2"
    // InternalBug304681TestLanguage.g:3380:1: rule__Attribute2__Group_3_0_1_0__2 : rule__Attribute2__Group_3_0_1_0__2__Impl ;
    public final void rule__Attribute2__Group_3_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3384:1: ( rule__Attribute2__Group_3_0_1_0__2__Impl )
            // InternalBug304681TestLanguage.g:3385:2: rule__Attribute2__Group_3_0_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group_3_0_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_0__2"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_0__2__Impl"
    // InternalBug304681TestLanguage.g:3391:1: rule__Attribute2__Group_3_0_1_0__2__Impl : ( ';' ) ;
    public final void rule__Attribute2__Group_3_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3395:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:3396:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:3396:1: ( ';' )
            // InternalBug304681TestLanguage.g:3397:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getSemicolonKeyword_3_0_1_0_2()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getSemicolonKeyword_3_0_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_0__2__Impl"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_1__0"
    // InternalBug304681TestLanguage.g:3416:1: rule__Attribute2__Group_3_0_1_1__0 : rule__Attribute2__Group_3_0_1_1__0__Impl rule__Attribute2__Group_3_0_1_1__1 ;
    public final void rule__Attribute2__Group_3_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3420:1: ( rule__Attribute2__Group_3_0_1_1__0__Impl rule__Attribute2__Group_3_0_1_1__1 )
            // InternalBug304681TestLanguage.g:3421:2: rule__Attribute2__Group_3_0_1_1__0__Impl rule__Attribute2__Group_3_0_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Attribute2__Group_3_0_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group_3_0_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_1__0"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_1__0__Impl"
    // InternalBug304681TestLanguage.g:3428:1: rule__Attribute2__Group_3_0_1_1__0__Impl : ( 'longDescription' ) ;
    public final void rule__Attribute2__Group_3_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3432:1: ( ( 'longDescription' ) )
            // InternalBug304681TestLanguage.g:3433:1: ( 'longDescription' )
            {
            // InternalBug304681TestLanguage.g:3433:1: ( 'longDescription' )
            // InternalBug304681TestLanguage.g:3434:1: 'longDescription'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getLongDescriptionKeyword_3_0_1_1_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getLongDescriptionKeyword_3_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_1__0__Impl"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_1__1"
    // InternalBug304681TestLanguage.g:3447:1: rule__Attribute2__Group_3_0_1_1__1 : rule__Attribute2__Group_3_0_1_1__1__Impl rule__Attribute2__Group_3_0_1_1__2 ;
    public final void rule__Attribute2__Group_3_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3451:1: ( rule__Attribute2__Group_3_0_1_1__1__Impl rule__Attribute2__Group_3_0_1_1__2 )
            // InternalBug304681TestLanguage.g:3452:2: rule__Attribute2__Group_3_0_1_1__1__Impl rule__Attribute2__Group_3_0_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Attribute2__Group_3_0_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group_3_0_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_1__1"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_1__1__Impl"
    // InternalBug304681TestLanguage.g:3459:1: rule__Attribute2__Group_3_0_1_1__1__Impl : ( ( rule__Attribute2__LongDescriptionAssignment_3_0_1_1_1 ) ) ;
    public final void rule__Attribute2__Group_3_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3463:1: ( ( ( rule__Attribute2__LongDescriptionAssignment_3_0_1_1_1 ) ) )
            // InternalBug304681TestLanguage.g:3464:1: ( ( rule__Attribute2__LongDescriptionAssignment_3_0_1_1_1 ) )
            {
            // InternalBug304681TestLanguage.g:3464:1: ( ( rule__Attribute2__LongDescriptionAssignment_3_0_1_1_1 ) )
            // InternalBug304681TestLanguage.g:3465:1: ( rule__Attribute2__LongDescriptionAssignment_3_0_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getLongDescriptionAssignment_3_0_1_1_1()); 
            }
            // InternalBug304681TestLanguage.g:3466:1: ( rule__Attribute2__LongDescriptionAssignment_3_0_1_1_1 )
            // InternalBug304681TestLanguage.g:3466:2: rule__Attribute2__LongDescriptionAssignment_3_0_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__LongDescriptionAssignment_3_0_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getLongDescriptionAssignment_3_0_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_1__1__Impl"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_1__2"
    // InternalBug304681TestLanguage.g:3476:1: rule__Attribute2__Group_3_0_1_1__2 : rule__Attribute2__Group_3_0_1_1__2__Impl ;
    public final void rule__Attribute2__Group_3_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3480:1: ( rule__Attribute2__Group_3_0_1_1__2__Impl )
            // InternalBug304681TestLanguage.g:3481:2: rule__Attribute2__Group_3_0_1_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group_3_0_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_1__2"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_1__2__Impl"
    // InternalBug304681TestLanguage.g:3487:1: rule__Attribute2__Group_3_0_1_1__2__Impl : ( ';' ) ;
    public final void rule__Attribute2__Group_3_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3491:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:3492:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:3492:1: ( ';' )
            // InternalBug304681TestLanguage.g:3493:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getSemicolonKeyword_3_0_1_1_2()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getSemicolonKeyword_3_0_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_1__2__Impl"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_3__0"
    // InternalBug304681TestLanguage.g:3512:1: rule__Attribute2__Group_3_0_1_3__0 : rule__Attribute2__Group_3_0_1_3__0__Impl rule__Attribute2__Group_3_0_1_3__1 ;
    public final void rule__Attribute2__Group_3_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3516:1: ( rule__Attribute2__Group_3_0_1_3__0__Impl rule__Attribute2__Group_3_0_1_3__1 )
            // InternalBug304681TestLanguage.g:3517:2: rule__Attribute2__Group_3_0_1_3__0__Impl rule__Attribute2__Group_3_0_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Attribute2__Group_3_0_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group_3_0_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_3__0"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_3__0__Impl"
    // InternalBug304681TestLanguage.g:3524:1: rule__Attribute2__Group_3_0_1_3__0__Impl : ( ( rule__Attribute2__RequiredAssignment_3_0_1_3_0 ) ) ;
    public final void rule__Attribute2__Group_3_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3528:1: ( ( ( rule__Attribute2__RequiredAssignment_3_0_1_3_0 ) ) )
            // InternalBug304681TestLanguage.g:3529:1: ( ( rule__Attribute2__RequiredAssignment_3_0_1_3_0 ) )
            {
            // InternalBug304681TestLanguage.g:3529:1: ( ( rule__Attribute2__RequiredAssignment_3_0_1_3_0 ) )
            // InternalBug304681TestLanguage.g:3530:1: ( rule__Attribute2__RequiredAssignment_3_0_1_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getRequiredAssignment_3_0_1_3_0()); 
            }
            // InternalBug304681TestLanguage.g:3531:1: ( rule__Attribute2__RequiredAssignment_3_0_1_3_0 )
            // InternalBug304681TestLanguage.g:3531:2: rule__Attribute2__RequiredAssignment_3_0_1_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__RequiredAssignment_3_0_1_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getRequiredAssignment_3_0_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_3__0__Impl"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_3__1"
    // InternalBug304681TestLanguage.g:3541:1: rule__Attribute2__Group_3_0_1_3__1 : rule__Attribute2__Group_3_0_1_3__1__Impl ;
    public final void rule__Attribute2__Group_3_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3545:1: ( rule__Attribute2__Group_3_0_1_3__1__Impl )
            // InternalBug304681TestLanguage.g:3546:2: rule__Attribute2__Group_3_0_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group_3_0_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_3__1"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_3__1__Impl"
    // InternalBug304681TestLanguage.g:3552:1: rule__Attribute2__Group_3_0_1_3__1__Impl : ( ';' ) ;
    public final void rule__Attribute2__Group_3_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3556:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:3557:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:3557:1: ( ';' )
            // InternalBug304681TestLanguage.g:3558:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getSemicolonKeyword_3_0_1_3_1()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getSemicolonKeyword_3_0_1_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_3__1__Impl"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_4__0"
    // InternalBug304681TestLanguage.g:3575:1: rule__Attribute2__Group_3_0_1_4__0 : rule__Attribute2__Group_3_0_1_4__0__Impl rule__Attribute2__Group_3_0_1_4__1 ;
    public final void rule__Attribute2__Group_3_0_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3579:1: ( rule__Attribute2__Group_3_0_1_4__0__Impl rule__Attribute2__Group_3_0_1_4__1 )
            // InternalBug304681TestLanguage.g:3580:2: rule__Attribute2__Group_3_0_1_4__0__Impl rule__Attribute2__Group_3_0_1_4__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Attribute2__Group_3_0_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group_3_0_1_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_4__0"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_4__0__Impl"
    // InternalBug304681TestLanguage.g:3587:1: rule__Attribute2__Group_3_0_1_4__0__Impl : ( ( rule__Attribute2__TechnicalAssignment_3_0_1_4_0 ) ) ;
    public final void rule__Attribute2__Group_3_0_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3591:1: ( ( ( rule__Attribute2__TechnicalAssignment_3_0_1_4_0 ) ) )
            // InternalBug304681TestLanguage.g:3592:1: ( ( rule__Attribute2__TechnicalAssignment_3_0_1_4_0 ) )
            {
            // InternalBug304681TestLanguage.g:3592:1: ( ( rule__Attribute2__TechnicalAssignment_3_0_1_4_0 ) )
            // InternalBug304681TestLanguage.g:3593:1: ( rule__Attribute2__TechnicalAssignment_3_0_1_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getTechnicalAssignment_3_0_1_4_0()); 
            }
            // InternalBug304681TestLanguage.g:3594:1: ( rule__Attribute2__TechnicalAssignment_3_0_1_4_0 )
            // InternalBug304681TestLanguage.g:3594:2: rule__Attribute2__TechnicalAssignment_3_0_1_4_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__TechnicalAssignment_3_0_1_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getTechnicalAssignment_3_0_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_4__0__Impl"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_4__1"
    // InternalBug304681TestLanguage.g:3604:1: rule__Attribute2__Group_3_0_1_4__1 : rule__Attribute2__Group_3_0_1_4__1__Impl ;
    public final void rule__Attribute2__Group_3_0_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3608:1: ( rule__Attribute2__Group_3_0_1_4__1__Impl )
            // InternalBug304681TestLanguage.g:3609:2: rule__Attribute2__Group_3_0_1_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__Group_3_0_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_4__1"


    // $ANTLR start "rule__Attribute2__Group_3_0_1_4__1__Impl"
    // InternalBug304681TestLanguage.g:3615:1: rule__Attribute2__Group_3_0_1_4__1__Impl : ( ';' ) ;
    public final void rule__Attribute2__Group_3_0_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3619:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:3620:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:3620:1: ( ';' )
            // InternalBug304681TestLanguage.g:3621:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getSemicolonKeyword_3_0_1_4_1()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getSemicolonKeyword_3_0_1_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__Group_3_0_1_4__1__Impl"


    // $ANTLR start "rule__Reference2__Group__0"
    // InternalBug304681TestLanguage.g:3638:1: rule__Reference2__Group__0 : rule__Reference2__Group__0__Impl rule__Reference2__Group__1 ;
    public final void rule__Reference2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3642:1: ( rule__Reference2__Group__0__Impl rule__Reference2__Group__1 )
            // InternalBug304681TestLanguage.g:3643:2: rule__Reference2__Group__0__Impl rule__Reference2__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Reference2__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group__0"


    // $ANTLR start "rule__Reference2__Group__0__Impl"
    // InternalBug304681TestLanguage.g:3650:1: rule__Reference2__Group__0__Impl : ( 'Reference' ) ;
    public final void rule__Reference2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3654:1: ( ( 'Reference' ) )
            // InternalBug304681TestLanguage.g:3655:1: ( 'Reference' )
            {
            // InternalBug304681TestLanguage.g:3655:1: ( 'Reference' )
            // InternalBug304681TestLanguage.g:3656:1: 'Reference'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getReferenceKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getReferenceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group__0__Impl"


    // $ANTLR start "rule__Reference2__Group__1"
    // InternalBug304681TestLanguage.g:3669:1: rule__Reference2__Group__1 : rule__Reference2__Group__1__Impl rule__Reference2__Group__2 ;
    public final void rule__Reference2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3673:1: ( rule__Reference2__Group__1__Impl rule__Reference2__Group__2 )
            // InternalBug304681TestLanguage.g:3674:2: rule__Reference2__Group__1__Impl rule__Reference2__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Reference2__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group__1"


    // $ANTLR start "rule__Reference2__Group__1__Impl"
    // InternalBug304681TestLanguage.g:3681:1: rule__Reference2__Group__1__Impl : ( ( rule__Reference2__TypeAssignment_1 ) ) ;
    public final void rule__Reference2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3685:1: ( ( ( rule__Reference2__TypeAssignment_1 ) ) )
            // InternalBug304681TestLanguage.g:3686:1: ( ( rule__Reference2__TypeAssignment_1 ) )
            {
            // InternalBug304681TestLanguage.g:3686:1: ( ( rule__Reference2__TypeAssignment_1 ) )
            // InternalBug304681TestLanguage.g:3687:1: ( rule__Reference2__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getTypeAssignment_1()); 
            }
            // InternalBug304681TestLanguage.g:3688:1: ( rule__Reference2__TypeAssignment_1 )
            // InternalBug304681TestLanguage.g:3688:2: rule__Reference2__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group__1__Impl"


    // $ANTLR start "rule__Reference2__Group__2"
    // InternalBug304681TestLanguage.g:3698:1: rule__Reference2__Group__2 : rule__Reference2__Group__2__Impl rule__Reference2__Group__3 ;
    public final void rule__Reference2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3702:1: ( rule__Reference2__Group__2__Impl rule__Reference2__Group__3 )
            // InternalBug304681TestLanguage.g:3703:2: rule__Reference2__Group__2__Impl rule__Reference2__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Reference2__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group__2"


    // $ANTLR start "rule__Reference2__Group__2__Impl"
    // InternalBug304681TestLanguage.g:3710:1: rule__Reference2__Group__2__Impl : ( ( rule__Reference2__ManyAssignment_2 )? ) ;
    public final void rule__Reference2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3714:1: ( ( ( rule__Reference2__ManyAssignment_2 )? ) )
            // InternalBug304681TestLanguage.g:3715:1: ( ( rule__Reference2__ManyAssignment_2 )? )
            {
            // InternalBug304681TestLanguage.g:3715:1: ( ( rule__Reference2__ManyAssignment_2 )? )
            // InternalBug304681TestLanguage.g:3716:1: ( rule__Reference2__ManyAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getManyAssignment_2()); 
            }
            // InternalBug304681TestLanguage.g:3717:1: ( rule__Reference2__ManyAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBug304681TestLanguage.g:3717:2: rule__Reference2__ManyAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Reference2__ManyAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getManyAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group__2__Impl"


    // $ANTLR start "rule__Reference2__Group__3"
    // InternalBug304681TestLanguage.g:3727:1: rule__Reference2__Group__3 : rule__Reference2__Group__3__Impl rule__Reference2__Group__4 ;
    public final void rule__Reference2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3731:1: ( rule__Reference2__Group__3__Impl rule__Reference2__Group__4 )
            // InternalBug304681TestLanguage.g:3732:2: rule__Reference2__Group__3__Impl rule__Reference2__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Reference2__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group__3"


    // $ANTLR start "rule__Reference2__Group__3__Impl"
    // InternalBug304681TestLanguage.g:3739:1: rule__Reference2__Group__3__Impl : ( ( rule__Reference2__NameAssignment_3 ) ) ;
    public final void rule__Reference2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3743:1: ( ( ( rule__Reference2__NameAssignment_3 ) ) )
            // InternalBug304681TestLanguage.g:3744:1: ( ( rule__Reference2__NameAssignment_3 ) )
            {
            // InternalBug304681TestLanguage.g:3744:1: ( ( rule__Reference2__NameAssignment_3 ) )
            // InternalBug304681TestLanguage.g:3745:1: ( rule__Reference2__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getNameAssignment_3()); 
            }
            // InternalBug304681TestLanguage.g:3746:1: ( rule__Reference2__NameAssignment_3 )
            // InternalBug304681TestLanguage.g:3746:2: rule__Reference2__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group__3__Impl"


    // $ANTLR start "rule__Reference2__Group__4"
    // InternalBug304681TestLanguage.g:3756:1: rule__Reference2__Group__4 : rule__Reference2__Group__4__Impl ;
    public final void rule__Reference2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3760:1: ( rule__Reference2__Group__4__Impl )
            // InternalBug304681TestLanguage.g:3761:2: rule__Reference2__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group__4"


    // $ANTLR start "rule__Reference2__Group__4__Impl"
    // InternalBug304681TestLanguage.g:3767:1: rule__Reference2__Group__4__Impl : ( ( rule__Reference2__Alternatives_4 ) ) ;
    public final void rule__Reference2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3771:1: ( ( ( rule__Reference2__Alternatives_4 ) ) )
            // InternalBug304681TestLanguage.g:3772:1: ( ( rule__Reference2__Alternatives_4 ) )
            {
            // InternalBug304681TestLanguage.g:3772:1: ( ( rule__Reference2__Alternatives_4 ) )
            // InternalBug304681TestLanguage.g:3773:1: ( rule__Reference2__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getAlternatives_4()); 
            }
            // InternalBug304681TestLanguage.g:3774:1: ( rule__Reference2__Alternatives_4 )
            // InternalBug304681TestLanguage.g:3774:2: rule__Reference2__Alternatives_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__Alternatives_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getAlternatives_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group__4__Impl"


    // $ANTLR start "rule__Reference2__Group_4_0__0"
    // InternalBug304681TestLanguage.g:3794:1: rule__Reference2__Group_4_0__0 : rule__Reference2__Group_4_0__0__Impl rule__Reference2__Group_4_0__1 ;
    public final void rule__Reference2__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3798:1: ( rule__Reference2__Group_4_0__0__Impl rule__Reference2__Group_4_0__1 )
            // InternalBug304681TestLanguage.g:3799:2: rule__Reference2__Group_4_0__0__Impl rule__Reference2__Group_4_0__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__Reference2__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__Group_4_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0__0"


    // $ANTLR start "rule__Reference2__Group_4_0__0__Impl"
    // InternalBug304681TestLanguage.g:3806:1: rule__Reference2__Group_4_0__0__Impl : ( '{' ) ;
    public final void rule__Reference2__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3810:1: ( ( '{' ) )
            // InternalBug304681TestLanguage.g:3811:1: ( '{' )
            {
            // InternalBug304681TestLanguage.g:3811:1: ( '{' )
            // InternalBug304681TestLanguage.g:3812:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getLeftCurlyBracketKeyword_4_0_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getLeftCurlyBracketKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0__0__Impl"


    // $ANTLR start "rule__Reference2__Group_4_0__1"
    // InternalBug304681TestLanguage.g:3825:1: rule__Reference2__Group_4_0__1 : rule__Reference2__Group_4_0__1__Impl rule__Reference2__Group_4_0__2 ;
    public final void rule__Reference2__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3829:1: ( rule__Reference2__Group_4_0__1__Impl rule__Reference2__Group_4_0__2 )
            // InternalBug304681TestLanguage.g:3830:2: rule__Reference2__Group_4_0__1__Impl rule__Reference2__Group_4_0__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Reference2__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__Group_4_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0__1"


    // $ANTLR start "rule__Reference2__Group_4_0__1__Impl"
    // InternalBug304681TestLanguage.g:3837:1: rule__Reference2__Group_4_0__1__Impl : ( ( rule__Reference2__UnorderedGroup_4_0_1 ) ) ;
    public final void rule__Reference2__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3841:1: ( ( ( rule__Reference2__UnorderedGroup_4_0_1 ) ) )
            // InternalBug304681TestLanguage.g:3842:1: ( ( rule__Reference2__UnorderedGroup_4_0_1 ) )
            {
            // InternalBug304681TestLanguage.g:3842:1: ( ( rule__Reference2__UnorderedGroup_4_0_1 ) )
            // InternalBug304681TestLanguage.g:3843:1: ( rule__Reference2__UnorderedGroup_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1()); 
            }
            // InternalBug304681TestLanguage.g:3844:1: ( rule__Reference2__UnorderedGroup_4_0_1 )
            // InternalBug304681TestLanguage.g:3844:2: rule__Reference2__UnorderedGroup_4_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__UnorderedGroup_4_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0__1__Impl"


    // $ANTLR start "rule__Reference2__Group_4_0__2"
    // InternalBug304681TestLanguage.g:3854:1: rule__Reference2__Group_4_0__2 : rule__Reference2__Group_4_0__2__Impl ;
    public final void rule__Reference2__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3858:1: ( rule__Reference2__Group_4_0__2__Impl )
            // InternalBug304681TestLanguage.g:3859:2: rule__Reference2__Group_4_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__Group_4_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0__2"


    // $ANTLR start "rule__Reference2__Group_4_0__2__Impl"
    // InternalBug304681TestLanguage.g:3865:1: rule__Reference2__Group_4_0__2__Impl : ( '}' ) ;
    public final void rule__Reference2__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3869:1: ( ( '}' ) )
            // InternalBug304681TestLanguage.g:3870:1: ( '}' )
            {
            // InternalBug304681TestLanguage.g:3870:1: ( '}' )
            // InternalBug304681TestLanguage.g:3871:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getRightCurlyBracketKeyword_4_0_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getRightCurlyBracketKeyword_4_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0__2__Impl"


    // $ANTLR start "rule__Reference2__Group_4_0_1_0__0"
    // InternalBug304681TestLanguage.g:3890:1: rule__Reference2__Group_4_0_1_0__0 : rule__Reference2__Group_4_0_1_0__0__Impl rule__Reference2__Group_4_0_1_0__1 ;
    public final void rule__Reference2__Group_4_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3894:1: ( rule__Reference2__Group_4_0_1_0__0__Impl rule__Reference2__Group_4_0_1_0__1 )
            // InternalBug304681TestLanguage.g:3895:2: rule__Reference2__Group_4_0_1_0__0__Impl rule__Reference2__Group_4_0_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Reference2__Group_4_0_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__Group_4_0_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0_1_0__0"


    // $ANTLR start "rule__Reference2__Group_4_0_1_0__0__Impl"
    // InternalBug304681TestLanguage.g:3902:1: rule__Reference2__Group_4_0_1_0__0__Impl : ( 'shortDescription' ) ;
    public final void rule__Reference2__Group_4_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3906:1: ( ( 'shortDescription' ) )
            // InternalBug304681TestLanguage.g:3907:1: ( 'shortDescription' )
            {
            // InternalBug304681TestLanguage.g:3907:1: ( 'shortDescription' )
            // InternalBug304681TestLanguage.g:3908:1: 'shortDescription'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getShortDescriptionKeyword_4_0_1_0_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getShortDescriptionKeyword_4_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0_1_0__0__Impl"


    // $ANTLR start "rule__Reference2__Group_4_0_1_0__1"
    // InternalBug304681TestLanguage.g:3921:1: rule__Reference2__Group_4_0_1_0__1 : rule__Reference2__Group_4_0_1_0__1__Impl rule__Reference2__Group_4_0_1_0__2 ;
    public final void rule__Reference2__Group_4_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3925:1: ( rule__Reference2__Group_4_0_1_0__1__Impl rule__Reference2__Group_4_0_1_0__2 )
            // InternalBug304681TestLanguage.g:3926:2: rule__Reference2__Group_4_0_1_0__1__Impl rule__Reference2__Group_4_0_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Reference2__Group_4_0_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__Group_4_0_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0_1_0__1"


    // $ANTLR start "rule__Reference2__Group_4_0_1_0__1__Impl"
    // InternalBug304681TestLanguage.g:3933:1: rule__Reference2__Group_4_0_1_0__1__Impl : ( ( rule__Reference2__ShortDescriptionAssignment_4_0_1_0_1 ) ) ;
    public final void rule__Reference2__Group_4_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3937:1: ( ( ( rule__Reference2__ShortDescriptionAssignment_4_0_1_0_1 ) ) )
            // InternalBug304681TestLanguage.g:3938:1: ( ( rule__Reference2__ShortDescriptionAssignment_4_0_1_0_1 ) )
            {
            // InternalBug304681TestLanguage.g:3938:1: ( ( rule__Reference2__ShortDescriptionAssignment_4_0_1_0_1 ) )
            // InternalBug304681TestLanguage.g:3939:1: ( rule__Reference2__ShortDescriptionAssignment_4_0_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getShortDescriptionAssignment_4_0_1_0_1()); 
            }
            // InternalBug304681TestLanguage.g:3940:1: ( rule__Reference2__ShortDescriptionAssignment_4_0_1_0_1 )
            // InternalBug304681TestLanguage.g:3940:2: rule__Reference2__ShortDescriptionAssignment_4_0_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__ShortDescriptionAssignment_4_0_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getShortDescriptionAssignment_4_0_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0_1_0__1__Impl"


    // $ANTLR start "rule__Reference2__Group_4_0_1_0__2"
    // InternalBug304681TestLanguage.g:3950:1: rule__Reference2__Group_4_0_1_0__2 : rule__Reference2__Group_4_0_1_0__2__Impl ;
    public final void rule__Reference2__Group_4_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3954:1: ( rule__Reference2__Group_4_0_1_0__2__Impl )
            // InternalBug304681TestLanguage.g:3955:2: rule__Reference2__Group_4_0_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__Group_4_0_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0_1_0__2"


    // $ANTLR start "rule__Reference2__Group_4_0_1_0__2__Impl"
    // InternalBug304681TestLanguage.g:3961:1: rule__Reference2__Group_4_0_1_0__2__Impl : ( ';' ) ;
    public final void rule__Reference2__Group_4_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3965:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:3966:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:3966:1: ( ';' )
            // InternalBug304681TestLanguage.g:3967:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getSemicolonKeyword_4_0_1_0_2()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getSemicolonKeyword_4_0_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0_1_0__2__Impl"


    // $ANTLR start "rule__Reference2__Group_4_0_1_1__0"
    // InternalBug304681TestLanguage.g:3986:1: rule__Reference2__Group_4_0_1_1__0 : rule__Reference2__Group_4_0_1_1__0__Impl rule__Reference2__Group_4_0_1_1__1 ;
    public final void rule__Reference2__Group_4_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:3990:1: ( rule__Reference2__Group_4_0_1_1__0__Impl rule__Reference2__Group_4_0_1_1__1 )
            // InternalBug304681TestLanguage.g:3991:2: rule__Reference2__Group_4_0_1_1__0__Impl rule__Reference2__Group_4_0_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Reference2__Group_4_0_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__Group_4_0_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0_1_1__0"


    // $ANTLR start "rule__Reference2__Group_4_0_1_1__0__Impl"
    // InternalBug304681TestLanguage.g:3998:1: rule__Reference2__Group_4_0_1_1__0__Impl : ( 'longDescription' ) ;
    public final void rule__Reference2__Group_4_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4002:1: ( ( 'longDescription' ) )
            // InternalBug304681TestLanguage.g:4003:1: ( 'longDescription' )
            {
            // InternalBug304681TestLanguage.g:4003:1: ( 'longDescription' )
            // InternalBug304681TestLanguage.g:4004:1: 'longDescription'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getLongDescriptionKeyword_4_0_1_1_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getLongDescriptionKeyword_4_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0_1_1__0__Impl"


    // $ANTLR start "rule__Reference2__Group_4_0_1_1__1"
    // InternalBug304681TestLanguage.g:4017:1: rule__Reference2__Group_4_0_1_1__1 : rule__Reference2__Group_4_0_1_1__1__Impl rule__Reference2__Group_4_0_1_1__2 ;
    public final void rule__Reference2__Group_4_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4021:1: ( rule__Reference2__Group_4_0_1_1__1__Impl rule__Reference2__Group_4_0_1_1__2 )
            // InternalBug304681TestLanguage.g:4022:2: rule__Reference2__Group_4_0_1_1__1__Impl rule__Reference2__Group_4_0_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Reference2__Group_4_0_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__Group_4_0_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0_1_1__1"


    // $ANTLR start "rule__Reference2__Group_4_0_1_1__1__Impl"
    // InternalBug304681TestLanguage.g:4029:1: rule__Reference2__Group_4_0_1_1__1__Impl : ( ( rule__Reference2__LongDescriptionAssignment_4_0_1_1_1 ) ) ;
    public final void rule__Reference2__Group_4_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4033:1: ( ( ( rule__Reference2__LongDescriptionAssignment_4_0_1_1_1 ) ) )
            // InternalBug304681TestLanguage.g:4034:1: ( ( rule__Reference2__LongDescriptionAssignment_4_0_1_1_1 ) )
            {
            // InternalBug304681TestLanguage.g:4034:1: ( ( rule__Reference2__LongDescriptionAssignment_4_0_1_1_1 ) )
            // InternalBug304681TestLanguage.g:4035:1: ( rule__Reference2__LongDescriptionAssignment_4_0_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getLongDescriptionAssignment_4_0_1_1_1()); 
            }
            // InternalBug304681TestLanguage.g:4036:1: ( rule__Reference2__LongDescriptionAssignment_4_0_1_1_1 )
            // InternalBug304681TestLanguage.g:4036:2: rule__Reference2__LongDescriptionAssignment_4_0_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__LongDescriptionAssignment_4_0_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getLongDescriptionAssignment_4_0_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0_1_1__1__Impl"


    // $ANTLR start "rule__Reference2__Group_4_0_1_1__2"
    // InternalBug304681TestLanguage.g:4046:1: rule__Reference2__Group_4_0_1_1__2 : rule__Reference2__Group_4_0_1_1__2__Impl ;
    public final void rule__Reference2__Group_4_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4050:1: ( rule__Reference2__Group_4_0_1_1__2__Impl )
            // InternalBug304681TestLanguage.g:4051:2: rule__Reference2__Group_4_0_1_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__Group_4_0_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0_1_1__2"


    // $ANTLR start "rule__Reference2__Group_4_0_1_1__2__Impl"
    // InternalBug304681TestLanguage.g:4057:1: rule__Reference2__Group_4_0_1_1__2__Impl : ( ';' ) ;
    public final void rule__Reference2__Group_4_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4061:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:4062:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:4062:1: ( ';' )
            // InternalBug304681TestLanguage.g:4063:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getSemicolonKeyword_4_0_1_1_2()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getSemicolonKeyword_4_0_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__Group_4_0_1_1__2__Impl"


    // $ANTLR start "rule__ConstraintDefinition__Group__0"
    // InternalBug304681TestLanguage.g:4082:1: rule__ConstraintDefinition__Group__0 : rule__ConstraintDefinition__Group__0__Impl rule__ConstraintDefinition__Group__1 ;
    public final void rule__ConstraintDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4086:1: ( rule__ConstraintDefinition__Group__0__Impl rule__ConstraintDefinition__Group__1 )
            // InternalBug304681TestLanguage.g:4087:2: rule__ConstraintDefinition__Group__0__Impl rule__ConstraintDefinition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__ConstraintDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group__0"


    // $ANTLR start "rule__ConstraintDefinition__Group__0__Impl"
    // InternalBug304681TestLanguage.g:4094:1: rule__ConstraintDefinition__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__ConstraintDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4098:1: ( ( 'constraint' ) )
            // InternalBug304681TestLanguage.g:4099:1: ( 'constraint' )
            {
            // InternalBug304681TestLanguage.g:4099:1: ( 'constraint' )
            // InternalBug304681TestLanguage.g:4100:1: 'constraint'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintDefinitionAccess().getConstraintKeyword_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintDefinitionAccess().getConstraintKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group__0__Impl"


    // $ANTLR start "rule__ConstraintDefinition__Group__1"
    // InternalBug304681TestLanguage.g:4113:1: rule__ConstraintDefinition__Group__1 : rule__ConstraintDefinition__Group__1__Impl rule__ConstraintDefinition__Group__2 ;
    public final void rule__ConstraintDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4117:1: ( rule__ConstraintDefinition__Group__1__Impl rule__ConstraintDefinition__Group__2 )
            // InternalBug304681TestLanguage.g:4118:2: rule__ConstraintDefinition__Group__1__Impl rule__ConstraintDefinition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__ConstraintDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group__1"


    // $ANTLR start "rule__ConstraintDefinition__Group__1__Impl"
    // InternalBug304681TestLanguage.g:4125:1: rule__ConstraintDefinition__Group__1__Impl : ( ( rule__ConstraintDefinition__TypeAssignment_1 ) ) ;
    public final void rule__ConstraintDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4129:1: ( ( ( rule__ConstraintDefinition__TypeAssignment_1 ) ) )
            // InternalBug304681TestLanguage.g:4130:1: ( ( rule__ConstraintDefinition__TypeAssignment_1 ) )
            {
            // InternalBug304681TestLanguage.g:4130:1: ( ( rule__ConstraintDefinition__TypeAssignment_1 ) )
            // InternalBug304681TestLanguage.g:4131:1: ( rule__ConstraintDefinition__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintDefinitionAccess().getTypeAssignment_1()); 
            }
            // InternalBug304681TestLanguage.g:4132:1: ( rule__ConstraintDefinition__TypeAssignment_1 )
            // InternalBug304681TestLanguage.g:4132:2: rule__ConstraintDefinition__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintDefinition__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintDefinitionAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group__1__Impl"


    // $ANTLR start "rule__ConstraintDefinition__Group__2"
    // InternalBug304681TestLanguage.g:4142:1: rule__ConstraintDefinition__Group__2 : rule__ConstraintDefinition__Group__2__Impl rule__ConstraintDefinition__Group__3 ;
    public final void rule__ConstraintDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4146:1: ( rule__ConstraintDefinition__Group__2__Impl rule__ConstraintDefinition__Group__3 )
            // InternalBug304681TestLanguage.g:4147:2: rule__ConstraintDefinition__Group__2__Impl rule__ConstraintDefinition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__ConstraintDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group__2"


    // $ANTLR start "rule__ConstraintDefinition__Group__2__Impl"
    // InternalBug304681TestLanguage.g:4154:1: rule__ConstraintDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__ConstraintDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4158:1: ( ( '{' ) )
            // InternalBug304681TestLanguage.g:4159:1: ( '{' )
            {
            // InternalBug304681TestLanguage.g:4159:1: ( '{' )
            // InternalBug304681TestLanguage.g:4160:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group__2__Impl"


    // $ANTLR start "rule__ConstraintDefinition__Group__3"
    // InternalBug304681TestLanguage.g:4173:1: rule__ConstraintDefinition__Group__3 : rule__ConstraintDefinition__Group__3__Impl rule__ConstraintDefinition__Group__4 ;
    public final void rule__ConstraintDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4177:1: ( rule__ConstraintDefinition__Group__3__Impl rule__ConstraintDefinition__Group__4 )
            // InternalBug304681TestLanguage.g:4178:2: rule__ConstraintDefinition__Group__3__Impl rule__ConstraintDefinition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__ConstraintDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group__3"


    // $ANTLR start "rule__ConstraintDefinition__Group__3__Impl"
    // InternalBug304681TestLanguage.g:4185:1: rule__ConstraintDefinition__Group__3__Impl : ( ( rule__ConstraintDefinition__UnorderedGroup_3 ) ) ;
    public final void rule__ConstraintDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4189:1: ( ( ( rule__ConstraintDefinition__UnorderedGroup_3 ) ) )
            // InternalBug304681TestLanguage.g:4190:1: ( ( rule__ConstraintDefinition__UnorderedGroup_3 ) )
            {
            // InternalBug304681TestLanguage.g:4190:1: ( ( rule__ConstraintDefinition__UnorderedGroup_3 ) )
            // InternalBug304681TestLanguage.g:4191:1: ( rule__ConstraintDefinition__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3()); 
            }
            // InternalBug304681TestLanguage.g:4192:1: ( rule__ConstraintDefinition__UnorderedGroup_3 )
            // InternalBug304681TestLanguage.g:4192:2: rule__ConstraintDefinition__UnorderedGroup_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintDefinition__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group__3__Impl"


    // $ANTLR start "rule__ConstraintDefinition__Group__4"
    // InternalBug304681TestLanguage.g:4202:1: rule__ConstraintDefinition__Group__4 : rule__ConstraintDefinition__Group__4__Impl ;
    public final void rule__ConstraintDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4206:1: ( rule__ConstraintDefinition__Group__4__Impl )
            // InternalBug304681TestLanguage.g:4207:2: rule__ConstraintDefinition__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group__4"


    // $ANTLR start "rule__ConstraintDefinition__Group__4__Impl"
    // InternalBug304681TestLanguage.g:4213:1: rule__ConstraintDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__ConstraintDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4217:1: ( ( '}' ) )
            // InternalBug304681TestLanguage.g:4218:1: ( '}' )
            {
            // InternalBug304681TestLanguage.g:4218:1: ( '}' )
            // InternalBug304681TestLanguage.g:4219:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group__4__Impl"


    // $ANTLR start "rule__ConstraintDefinition__Group_3_0__0"
    // InternalBug304681TestLanguage.g:4242:1: rule__ConstraintDefinition__Group_3_0__0 : rule__ConstraintDefinition__Group_3_0__0__Impl rule__ConstraintDefinition__Group_3_0__1 ;
    public final void rule__ConstraintDefinition__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4246:1: ( rule__ConstraintDefinition__Group_3_0__0__Impl rule__ConstraintDefinition__Group_3_0__1 )
            // InternalBug304681TestLanguage.g:4247:2: rule__ConstraintDefinition__Group_3_0__0__Impl rule__ConstraintDefinition__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__ConstraintDefinition__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintDefinition__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group_3_0__0"


    // $ANTLR start "rule__ConstraintDefinition__Group_3_0__0__Impl"
    // InternalBug304681TestLanguage.g:4254:1: rule__ConstraintDefinition__Group_3_0__0__Impl : ( 'parameters' ) ;
    public final void rule__ConstraintDefinition__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4258:1: ( ( 'parameters' ) )
            // InternalBug304681TestLanguage.g:4259:1: ( 'parameters' )
            {
            // InternalBug304681TestLanguage.g:4259:1: ( 'parameters' )
            // InternalBug304681TestLanguage.g:4260:1: 'parameters'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintDefinitionAccess().getParametersKeyword_3_0_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintDefinitionAccess().getParametersKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group_3_0__0__Impl"


    // $ANTLR start "rule__ConstraintDefinition__Group_3_0__1"
    // InternalBug304681TestLanguage.g:4273:1: rule__ConstraintDefinition__Group_3_0__1 : rule__ConstraintDefinition__Group_3_0__1__Impl rule__ConstraintDefinition__Group_3_0__2 ;
    public final void rule__ConstraintDefinition__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4277:1: ( rule__ConstraintDefinition__Group_3_0__1__Impl rule__ConstraintDefinition__Group_3_0__2 )
            // InternalBug304681TestLanguage.g:4278:2: rule__ConstraintDefinition__Group_3_0__1__Impl rule__ConstraintDefinition__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__ConstraintDefinition__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintDefinition__Group_3_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group_3_0__1"


    // $ANTLR start "rule__ConstraintDefinition__Group_3_0__1__Impl"
    // InternalBug304681TestLanguage.g:4285:1: rule__ConstraintDefinition__Group_3_0__1__Impl : ( ( rule__ConstraintDefinition__ParametersAssignment_3_0_1 )* ) ;
    public final void rule__ConstraintDefinition__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4289:1: ( ( ( rule__ConstraintDefinition__ParametersAssignment_3_0_1 )* ) )
            // InternalBug304681TestLanguage.g:4290:1: ( ( rule__ConstraintDefinition__ParametersAssignment_3_0_1 )* )
            {
            // InternalBug304681TestLanguage.g:4290:1: ( ( rule__ConstraintDefinition__ParametersAssignment_3_0_1 )* )
            // InternalBug304681TestLanguage.g:4291:1: ( rule__ConstraintDefinition__ParametersAssignment_3_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintDefinitionAccess().getParametersAssignment_3_0_1()); 
            }
            // InternalBug304681TestLanguage.g:4292:1: ( rule__ConstraintDefinition__ParametersAssignment_3_0_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBug304681TestLanguage.g:4292:2: rule__ConstraintDefinition__ParametersAssignment_3_0_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    rule__ConstraintDefinition__ParametersAssignment_3_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintDefinitionAccess().getParametersAssignment_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group_3_0__1__Impl"


    // $ANTLR start "rule__ConstraintDefinition__Group_3_0__2"
    // InternalBug304681TestLanguage.g:4302:1: rule__ConstraintDefinition__Group_3_0__2 : rule__ConstraintDefinition__Group_3_0__2__Impl ;
    public final void rule__ConstraintDefinition__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4306:1: ( rule__ConstraintDefinition__Group_3_0__2__Impl )
            // InternalBug304681TestLanguage.g:4307:2: rule__ConstraintDefinition__Group_3_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintDefinition__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group_3_0__2"


    // $ANTLR start "rule__ConstraintDefinition__Group_3_0__2__Impl"
    // InternalBug304681TestLanguage.g:4313:1: rule__ConstraintDefinition__Group_3_0__2__Impl : ( ';' ) ;
    public final void rule__ConstraintDefinition__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4317:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:4318:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:4318:1: ( ';' )
            // InternalBug304681TestLanguage.g:4319:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintDefinitionAccess().getSemicolonKeyword_3_0_2()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintDefinitionAccess().getSemicolonKeyword_3_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group_3_0__2__Impl"


    // $ANTLR start "rule__ConstraintDefinition__Group_3_1__0"
    // InternalBug304681TestLanguage.g:4338:1: rule__ConstraintDefinition__Group_3_1__0 : rule__ConstraintDefinition__Group_3_1__0__Impl rule__ConstraintDefinition__Group_3_1__1 ;
    public final void rule__ConstraintDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4342:1: ( rule__ConstraintDefinition__Group_3_1__0__Impl rule__ConstraintDefinition__Group_3_1__1 )
            // InternalBug304681TestLanguage.g:4343:2: rule__ConstraintDefinition__Group_3_1__0__Impl rule__ConstraintDefinition__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__ConstraintDefinition__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintDefinition__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group_3_1__0"


    // $ANTLR start "rule__ConstraintDefinition__Group_3_1__0__Impl"
    // InternalBug304681TestLanguage.g:4350:1: rule__ConstraintDefinition__Group_3_1__0__Impl : ( 'message' ) ;
    public final void rule__ConstraintDefinition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4354:1: ( ( 'message' ) )
            // InternalBug304681TestLanguage.g:4355:1: ( 'message' )
            {
            // InternalBug304681TestLanguage.g:4355:1: ( 'message' )
            // InternalBug304681TestLanguage.g:4356:1: 'message'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintDefinitionAccess().getMessageKeyword_3_1_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintDefinitionAccess().getMessageKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group_3_1__0__Impl"


    // $ANTLR start "rule__ConstraintDefinition__Group_3_1__1"
    // InternalBug304681TestLanguage.g:4369:1: rule__ConstraintDefinition__Group_3_1__1 : rule__ConstraintDefinition__Group_3_1__1__Impl rule__ConstraintDefinition__Group_3_1__2 ;
    public final void rule__ConstraintDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4373:1: ( rule__ConstraintDefinition__Group_3_1__1__Impl rule__ConstraintDefinition__Group_3_1__2 )
            // InternalBug304681TestLanguage.g:4374:2: rule__ConstraintDefinition__Group_3_1__1__Impl rule__ConstraintDefinition__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ConstraintDefinition__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintDefinition__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group_3_1__1"


    // $ANTLR start "rule__ConstraintDefinition__Group_3_1__1__Impl"
    // InternalBug304681TestLanguage.g:4381:1: rule__ConstraintDefinition__Group_3_1__1__Impl : ( ( rule__ConstraintDefinition__MessageAssignment_3_1_1 ) ) ;
    public final void rule__ConstraintDefinition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4385:1: ( ( ( rule__ConstraintDefinition__MessageAssignment_3_1_1 ) ) )
            // InternalBug304681TestLanguage.g:4386:1: ( ( rule__ConstraintDefinition__MessageAssignment_3_1_1 ) )
            {
            // InternalBug304681TestLanguage.g:4386:1: ( ( rule__ConstraintDefinition__MessageAssignment_3_1_1 ) )
            // InternalBug304681TestLanguage.g:4387:1: ( rule__ConstraintDefinition__MessageAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintDefinitionAccess().getMessageAssignment_3_1_1()); 
            }
            // InternalBug304681TestLanguage.g:4388:1: ( rule__ConstraintDefinition__MessageAssignment_3_1_1 )
            // InternalBug304681TestLanguage.g:4388:2: rule__ConstraintDefinition__MessageAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintDefinition__MessageAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintDefinitionAccess().getMessageAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group_3_1__1__Impl"


    // $ANTLR start "rule__ConstraintDefinition__Group_3_1__2"
    // InternalBug304681TestLanguage.g:4398:1: rule__ConstraintDefinition__Group_3_1__2 : rule__ConstraintDefinition__Group_3_1__2__Impl ;
    public final void rule__ConstraintDefinition__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4402:1: ( rule__ConstraintDefinition__Group_3_1__2__Impl )
            // InternalBug304681TestLanguage.g:4403:2: rule__ConstraintDefinition__Group_3_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintDefinition__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group_3_1__2"


    // $ANTLR start "rule__ConstraintDefinition__Group_3_1__2__Impl"
    // InternalBug304681TestLanguage.g:4409:1: rule__ConstraintDefinition__Group_3_1__2__Impl : ( ';' ) ;
    public final void rule__ConstraintDefinition__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4413:1: ( ( ';' ) )
            // InternalBug304681TestLanguage.g:4414:1: ( ';' )
            {
            // InternalBug304681TestLanguage.g:4414:1: ( ';' )
            // InternalBug304681TestLanguage.g:4415:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintDefinitionAccess().getSemicolonKeyword_3_1_2()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintDefinitionAccess().getSemicolonKeyword_3_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__Group_3_1__2__Impl"


    // $ANTLR start "rule__Object__UnorderedGroup_5"
    // InternalBug304681TestLanguage.g:4435:1: rule__Object__UnorderedGroup_5 : ( rule__Object__UnorderedGroup_5__0 )? ;
    public final void rule__Object__UnorderedGroup_5() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getObjectAccess().getUnorderedGroup_5());
            
        try {
            // InternalBug304681TestLanguage.g:4440:1: ( ( rule__Object__UnorderedGroup_5__0 )? )
            // InternalBug304681TestLanguage.g:4441:2: ( rule__Object__UnorderedGroup_5__0 )?
            {
            // InternalBug304681TestLanguage.g:4441:2: ( rule__Object__UnorderedGroup_5__0 )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Object__UnorderedGroup_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__UnorderedGroup_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getObjectAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__UnorderedGroup_5"


    // $ANTLR start "rule__Object__UnorderedGroup_5__Impl"
    // InternalBug304681TestLanguage.g:4451:1: rule__Object__UnorderedGroup_5__Impl : ( ({...}? => ( ( ( rule__Object__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_3__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_7__0 ) ) ) ) ) ;
    public final void rule__Object__UnorderedGroup_5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // InternalBug304681TestLanguage.g:4456:1: ( ( ({...}? => ( ( ( rule__Object__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_3__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_7__0 ) ) ) ) ) )
            // InternalBug304681TestLanguage.g:4457:3: ( ({...}? => ( ( ( rule__Object__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_3__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_7__0 ) ) ) ) )
            {
            // InternalBug304681TestLanguage.g:4457:3: ( ({...}? => ( ( ( rule__Object__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_3__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_7__0 ) ) ) ) )
            int alt23=8;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalBug304681TestLanguage.g:4459:4: ({...}? => ( ( ( rule__Object__Group_5_0__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:4459:4: ({...}? => ( ( ( rule__Object__Group_5_0__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:4460:5: {...}? => ( ( ( rule__Object__Group_5_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 0)");
                    }
                    // InternalBug304681TestLanguage.g:4460:103: ( ( ( rule__Object__Group_5_0__0 ) ) )
                    // InternalBug304681TestLanguage.g:4461:6: ( ( rule__Object__Group_5_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 0);
                    selected = true;
                    // InternalBug304681TestLanguage.g:4467:6: ( ( rule__Object__Group_5_0__0 ) )
                    // InternalBug304681TestLanguage.g:4469:7: ( rule__Object__Group_5_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjectAccess().getGroup_5_0()); 
                    }
                    // InternalBug304681TestLanguage.g:4470:7: ( rule__Object__Group_5_0__0 )
                    // InternalBug304681TestLanguage.g:4470:8: rule__Object__Group_5_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__Group_5_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjectAccess().getGroup_5_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug304681TestLanguage.g:4476:4: ({...}? => ( ( ( rule__Object__Group_5_1__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:4476:4: ({...}? => ( ( ( rule__Object__Group_5_1__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:4477:5: {...}? => ( ( ( rule__Object__Group_5_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 1)");
                    }
                    // InternalBug304681TestLanguage.g:4477:103: ( ( ( rule__Object__Group_5_1__0 ) ) )
                    // InternalBug304681TestLanguage.g:4478:6: ( ( rule__Object__Group_5_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 1);
                    selected = true;
                    // InternalBug304681TestLanguage.g:4484:6: ( ( rule__Object__Group_5_1__0 ) )
                    // InternalBug304681TestLanguage.g:4486:7: ( rule__Object__Group_5_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjectAccess().getGroup_5_1()); 
                    }
                    // InternalBug304681TestLanguage.g:4487:7: ( rule__Object__Group_5_1__0 )
                    // InternalBug304681TestLanguage.g:4487:8: rule__Object__Group_5_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__Group_5_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjectAccess().getGroup_5_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug304681TestLanguage.g:4493:4: ({...}? => ( ( ( rule__Object__Group_5_2__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:4493:4: ({...}? => ( ( ( rule__Object__Group_5_2__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:4494:5: {...}? => ( ( ( rule__Object__Group_5_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 2)");
                    }
                    // InternalBug304681TestLanguage.g:4494:103: ( ( ( rule__Object__Group_5_2__0 ) ) )
                    // InternalBug304681TestLanguage.g:4495:6: ( ( rule__Object__Group_5_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 2);
                    selected = true;
                    // InternalBug304681TestLanguage.g:4501:6: ( ( rule__Object__Group_5_2__0 ) )
                    // InternalBug304681TestLanguage.g:4503:7: ( rule__Object__Group_5_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjectAccess().getGroup_5_2()); 
                    }
                    // InternalBug304681TestLanguage.g:4504:7: ( rule__Object__Group_5_2__0 )
                    // InternalBug304681TestLanguage.g:4504:8: rule__Object__Group_5_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__Group_5_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjectAccess().getGroup_5_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBug304681TestLanguage.g:4510:4: ({...}? => ( ( ( rule__Object__Group_5_3__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:4510:4: ({...}? => ( ( ( rule__Object__Group_5_3__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:4511:5: {...}? => ( ( ( rule__Object__Group_5_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 3)");
                    }
                    // InternalBug304681TestLanguage.g:4511:103: ( ( ( rule__Object__Group_5_3__0 ) ) )
                    // InternalBug304681TestLanguage.g:4512:6: ( ( rule__Object__Group_5_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 3);
                    selected = true;
                    // InternalBug304681TestLanguage.g:4518:6: ( ( rule__Object__Group_5_3__0 ) )
                    // InternalBug304681TestLanguage.g:4520:7: ( rule__Object__Group_5_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjectAccess().getGroup_5_3()); 
                    }
                    // InternalBug304681TestLanguage.g:4521:7: ( rule__Object__Group_5_3__0 )
                    // InternalBug304681TestLanguage.g:4521:8: rule__Object__Group_5_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__Group_5_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjectAccess().getGroup_5_3()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalBug304681TestLanguage.g:4527:4: ({...}? => ( ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:4527:4: ({...}? => ( ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) ) ) )
                    // InternalBug304681TestLanguage.g:4528:5: {...}? => ( ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4)");
                    }
                    // InternalBug304681TestLanguage.g:4528:103: ( ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) ) )
                    // InternalBug304681TestLanguage.g:4529:6: ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4);
                    selected = true;
                    // InternalBug304681TestLanguage.g:4535:6: ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) )
                    // InternalBug304681TestLanguage.g:4536:6: ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* )
                    {
                    // InternalBug304681TestLanguage.g:4536:6: ( ( rule__Object__FeaturesAssignment_5_4 ) )
                    // InternalBug304681TestLanguage.g:4537:7: ( rule__Object__FeaturesAssignment_5_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjectAccess().getFeaturesAssignment_5_4()); 
                    }
                    // InternalBug304681TestLanguage.g:4538:7: ( rule__Object__FeaturesAssignment_5_4 )
                    // InternalBug304681TestLanguage.g:4538:8: rule__Object__FeaturesAssignment_5_4
                    {
                    pushFollow(FollowSets000.FOLLOW_14);
                    rule__Object__FeaturesAssignment_5_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjectAccess().getFeaturesAssignment_5_4()); 
                    }

                    }

                    // InternalBug304681TestLanguage.g:4541:6: ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* )
                    // InternalBug304681TestLanguage.g:4542:7: ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjectAccess().getFeaturesAssignment_5_4()); 
                    }
                    // InternalBug304681TestLanguage.g:4543:7: ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )*
                    loop22:
                    do {
                        int alt22=2;
                        alt22 = dfa22.predict(input);
                        switch (alt22) {
                    	case 1 :
                    	    // InternalBug304681TestLanguage.g:4543:8: ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4
                    	    {
                    	    pushFollow(FollowSets000.FOLLOW_14);
                    	    rule__Object__FeaturesAssignment_5_4();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjectAccess().getFeaturesAssignment_5_4()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalBug304681TestLanguage.g:4549:4: ({...}? => ( ( ( rule__Object__Group_5_5__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:4549:4: ({...}? => ( ( ( rule__Object__Group_5_5__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:4550:5: {...}? => ( ( ( rule__Object__Group_5_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 5) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 5)");
                    }
                    // InternalBug304681TestLanguage.g:4550:103: ( ( ( rule__Object__Group_5_5__0 ) ) )
                    // InternalBug304681TestLanguage.g:4551:6: ( ( rule__Object__Group_5_5__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 5);
                    selected = true;
                    // InternalBug304681TestLanguage.g:4557:6: ( ( rule__Object__Group_5_5__0 ) )
                    // InternalBug304681TestLanguage.g:4559:7: ( rule__Object__Group_5_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjectAccess().getGroup_5_5()); 
                    }
                    // InternalBug304681TestLanguage.g:4560:7: ( rule__Object__Group_5_5__0 )
                    // InternalBug304681TestLanguage.g:4560:8: rule__Object__Group_5_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__Group_5_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjectAccess().getGroup_5_5()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalBug304681TestLanguage.g:4566:4: ({...}? => ( ( ( rule__Object__Group_5_6__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:4566:4: ({...}? => ( ( ( rule__Object__Group_5_6__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:4567:5: {...}? => ( ( ( rule__Object__Group_5_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 6) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 6)");
                    }
                    // InternalBug304681TestLanguage.g:4567:103: ( ( ( rule__Object__Group_5_6__0 ) ) )
                    // InternalBug304681TestLanguage.g:4568:6: ( ( rule__Object__Group_5_6__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 6);
                    selected = true;
                    // InternalBug304681TestLanguage.g:4574:6: ( ( rule__Object__Group_5_6__0 ) )
                    // InternalBug304681TestLanguage.g:4576:7: ( rule__Object__Group_5_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjectAccess().getGroup_5_6()); 
                    }
                    // InternalBug304681TestLanguage.g:4577:7: ( rule__Object__Group_5_6__0 )
                    // InternalBug304681TestLanguage.g:4577:8: rule__Object__Group_5_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__Group_5_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjectAccess().getGroup_5_6()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalBug304681TestLanguage.g:4583:4: ({...}? => ( ( ( rule__Object__Group_5_7__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:4583:4: ({...}? => ( ( ( rule__Object__Group_5_7__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:4584:5: {...}? => ( ( ( rule__Object__Group_5_7__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 7) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 7)");
                    }
                    // InternalBug304681TestLanguage.g:4584:103: ( ( ( rule__Object__Group_5_7__0 ) ) )
                    // InternalBug304681TestLanguage.g:4585:6: ( ( rule__Object__Group_5_7__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 7);
                    selected = true;
                    // InternalBug304681TestLanguage.g:4591:6: ( ( rule__Object__Group_5_7__0 ) )
                    // InternalBug304681TestLanguage.g:4593:7: ( rule__Object__Group_5_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjectAccess().getGroup_5_7()); 
                    }
                    // InternalBug304681TestLanguage.g:4594:7: ( rule__Object__Group_5_7__0 )
                    // InternalBug304681TestLanguage.g:4594:8: rule__Object__Group_5_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__Group_5_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjectAccess().getGroup_5_7()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObjectAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__UnorderedGroup_5__Impl"


    // $ANTLR start "rule__Object__UnorderedGroup_5__0"
    // InternalBug304681TestLanguage.g:4609:1: rule__Object__UnorderedGroup_5__0 : rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__1 )? ;
    public final void rule__Object__UnorderedGroup_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4613:1: ( rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__1 )? )
            // InternalBug304681TestLanguage.g:4614:2: rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__Object__UnorderedGroup_5__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:4615:2: ( rule__Object__UnorderedGroup_5__1 )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Object__UnorderedGroup_5__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__UnorderedGroup_5__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__UnorderedGroup_5__0"


    // $ANTLR start "rule__Object__UnorderedGroup_5__1"
    // InternalBug304681TestLanguage.g:4622:1: rule__Object__UnorderedGroup_5__1 : rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__2 )? ;
    public final void rule__Object__UnorderedGroup_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4626:1: ( rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__2 )? )
            // InternalBug304681TestLanguage.g:4627:2: rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__Object__UnorderedGroup_5__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:4628:2: ( rule__Object__UnorderedGroup_5__2 )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Object__UnorderedGroup_5__2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__UnorderedGroup_5__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__UnorderedGroup_5__1"


    // $ANTLR start "rule__Object__UnorderedGroup_5__2"
    // InternalBug304681TestLanguage.g:4635:1: rule__Object__UnorderedGroup_5__2 : rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__3 )? ;
    public final void rule__Object__UnorderedGroup_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4639:1: ( rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__3 )? )
            // InternalBug304681TestLanguage.g:4640:2: rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__3 )?
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__Object__UnorderedGroup_5__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:4641:2: ( rule__Object__UnorderedGroup_5__3 )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Object__UnorderedGroup_5__3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__UnorderedGroup_5__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__UnorderedGroup_5__2"


    // $ANTLR start "rule__Object__UnorderedGroup_5__3"
    // InternalBug304681TestLanguage.g:4648:1: rule__Object__UnorderedGroup_5__3 : rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__4 )? ;
    public final void rule__Object__UnorderedGroup_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4652:1: ( rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__4 )? )
            // InternalBug304681TestLanguage.g:4653:2: rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__4 )?
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__Object__UnorderedGroup_5__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:4654:2: ( rule__Object__UnorderedGroup_5__4 )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Object__UnorderedGroup_5__4
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__UnorderedGroup_5__4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__UnorderedGroup_5__3"


    // $ANTLR start "rule__Object__UnorderedGroup_5__4"
    // InternalBug304681TestLanguage.g:4661:1: rule__Object__UnorderedGroup_5__4 : rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__5 )? ;
    public final void rule__Object__UnorderedGroup_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4665:1: ( rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__5 )? )
            // InternalBug304681TestLanguage.g:4666:2: rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__5 )?
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__Object__UnorderedGroup_5__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:4667:2: ( rule__Object__UnorderedGroup_5__5 )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Object__UnorderedGroup_5__5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__UnorderedGroup_5__5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__UnorderedGroup_5__4"


    // $ANTLR start "rule__Object__UnorderedGroup_5__5"
    // InternalBug304681TestLanguage.g:4674:1: rule__Object__UnorderedGroup_5__5 : rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__6 )? ;
    public final void rule__Object__UnorderedGroup_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4678:1: ( rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__6 )? )
            // InternalBug304681TestLanguage.g:4679:2: rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__6 )?
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__Object__UnorderedGroup_5__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:4680:2: ( rule__Object__UnorderedGroup_5__6 )?
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Object__UnorderedGroup_5__6
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__UnorderedGroup_5__6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__UnorderedGroup_5__5"


    // $ANTLR start "rule__Object__UnorderedGroup_5__6"
    // InternalBug304681TestLanguage.g:4687:1: rule__Object__UnorderedGroup_5__6 : rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__7 )? ;
    public final void rule__Object__UnorderedGroup_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4691:1: ( rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__7 )? )
            // InternalBug304681TestLanguage.g:4692:2: rule__Object__UnorderedGroup_5__Impl ( rule__Object__UnorderedGroup_5__7 )?
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__Object__UnorderedGroup_5__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:4693:2: ( rule__Object__UnorderedGroup_5__7 )?
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Object__UnorderedGroup_5__7
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object__UnorderedGroup_5__7();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__UnorderedGroup_5__6"


    // $ANTLR start "rule__Object__UnorderedGroup_5__7"
    // InternalBug304681TestLanguage.g:4700:1: rule__Object__UnorderedGroup_5__7 : rule__Object__UnorderedGroup_5__Impl ;
    public final void rule__Object__UnorderedGroup_5__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4704:1: ( rule__Object__UnorderedGroup_5__Impl )
            // InternalBug304681TestLanguage.g:4705:2: rule__Object__UnorderedGroup_5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object__UnorderedGroup_5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__UnorderedGroup_5__7"


    // $ANTLR start "rule__Reference__UnorderedGroup_4_0_1"
    // InternalBug304681TestLanguage.g:4728:1: rule__Reference__UnorderedGroup_4_0_1 : ( rule__Reference__UnorderedGroup_4_0_1__0 )? ;
    public final void rule__Reference__UnorderedGroup_4_0_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1());
            
        try {
            // InternalBug304681TestLanguage.g:4733:1: ( ( rule__Reference__UnorderedGroup_4_0_1__0 )? )
            // InternalBug304681TestLanguage.g:4734:2: ( rule__Reference__UnorderedGroup_4_0_1__0 )?
            {
            // InternalBug304681TestLanguage.g:4734:2: ( rule__Reference__UnorderedGroup_4_0_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 1) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Reference__UnorderedGroup_4_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Reference__UnorderedGroup_4_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__UnorderedGroup_4_0_1"


    // $ANTLR start "rule__Reference__UnorderedGroup_4_0_1__Impl"
    // InternalBug304681TestLanguage.g:4744:1: rule__Reference__UnorderedGroup_4_0_1__Impl : ( ({...}? => ( ( ( rule__Reference__Group_4_0_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Reference__Group_4_0_1_1__0 ) ) ) ) ) ;
    public final void rule__Reference__UnorderedGroup_4_0_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // InternalBug304681TestLanguage.g:4749:1: ( ( ({...}? => ( ( ( rule__Reference__Group_4_0_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Reference__Group_4_0_1_1__0 ) ) ) ) ) )
            // InternalBug304681TestLanguage.g:4750:3: ( ({...}? => ( ( ( rule__Reference__Group_4_0_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Reference__Group_4_0_1_1__0 ) ) ) ) )
            {
            // InternalBug304681TestLanguage.g:4750:3: ( ({...}? => ( ( ( rule__Reference__Group_4_0_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Reference__Group_4_0_1_1__0 ) ) ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 1) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalBug304681TestLanguage.g:4752:4: ({...}? => ( ( ( rule__Reference__Group_4_0_1_0__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:4752:4: ({...}? => ( ( ( rule__Reference__Group_4_0_1_0__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:4753:5: {...}? => ( ( ( rule__Reference__Group_4_0_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Reference__UnorderedGroup_4_0_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 0)");
                    }
                    // InternalBug304681TestLanguage.g:4753:110: ( ( ( rule__Reference__Group_4_0_1_0__0 ) ) )
                    // InternalBug304681TestLanguage.g:4754:6: ( ( rule__Reference__Group_4_0_1_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 0);
                    selected = true;
                    // InternalBug304681TestLanguage.g:4760:6: ( ( rule__Reference__Group_4_0_1_0__0 ) )
                    // InternalBug304681TestLanguage.g:4762:7: ( rule__Reference__Group_4_0_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReferenceAccess().getGroup_4_0_1_0()); 
                    }
                    // InternalBug304681TestLanguage.g:4763:7: ( rule__Reference__Group_4_0_1_0__0 )
                    // InternalBug304681TestLanguage.g:4763:8: rule__Reference__Group_4_0_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Reference__Group_4_0_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReferenceAccess().getGroup_4_0_1_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug304681TestLanguage.g:4769:4: ({...}? => ( ( ( rule__Reference__Group_4_0_1_1__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:4769:4: ({...}? => ( ( ( rule__Reference__Group_4_0_1_1__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:4770:5: {...}? => ( ( ( rule__Reference__Group_4_0_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Reference__UnorderedGroup_4_0_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 1)");
                    }
                    // InternalBug304681TestLanguage.g:4770:110: ( ( ( rule__Reference__Group_4_0_1_1__0 ) ) )
                    // InternalBug304681TestLanguage.g:4771:6: ( ( rule__Reference__Group_4_0_1_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 1);
                    selected = true;
                    // InternalBug304681TestLanguage.g:4777:6: ( ( rule__Reference__Group_4_0_1_1__0 ) )
                    // InternalBug304681TestLanguage.g:4779:7: ( rule__Reference__Group_4_0_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReferenceAccess().getGroup_4_0_1_1()); 
                    }
                    // InternalBug304681TestLanguage.g:4780:7: ( rule__Reference__Group_4_0_1_1__0 )
                    // InternalBug304681TestLanguage.g:4780:8: rule__Reference__Group_4_0_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Reference__Group_4_0_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReferenceAccess().getGroup_4_0_1_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__UnorderedGroup_4_0_1__Impl"


    // $ANTLR start "rule__Reference__UnorderedGroup_4_0_1__0"
    // InternalBug304681TestLanguage.g:4795:1: rule__Reference__UnorderedGroup_4_0_1__0 : rule__Reference__UnorderedGroup_4_0_1__Impl ( rule__Reference__UnorderedGroup_4_0_1__1 )? ;
    public final void rule__Reference__UnorderedGroup_4_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4799:1: ( rule__Reference__UnorderedGroup_4_0_1__Impl ( rule__Reference__UnorderedGroup_4_0_1__1 )? )
            // InternalBug304681TestLanguage.g:4800:2: rule__Reference__UnorderedGroup_4_0_1__Impl ( rule__Reference__UnorderedGroup_4_0_1__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__Reference__UnorderedGroup_4_0_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:4801:2: ( rule__Reference__UnorderedGroup_4_0_1__1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( LA33_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 1) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Reference__UnorderedGroup_4_0_1__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Reference__UnorderedGroup_4_0_1__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__UnorderedGroup_4_0_1__0"


    // $ANTLR start "rule__Reference__UnorderedGroup_4_0_1__1"
    // InternalBug304681TestLanguage.g:4808:1: rule__Reference__UnorderedGroup_4_0_1__1 : rule__Reference__UnorderedGroup_4_0_1__Impl ;
    public final void rule__Reference__UnorderedGroup_4_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4812:1: ( rule__Reference__UnorderedGroup_4_0_1__Impl )
            // InternalBug304681TestLanguage.g:4813:2: rule__Reference__UnorderedGroup_4_0_1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__UnorderedGroup_4_0_1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__UnorderedGroup_4_0_1__1"


    // $ANTLR start "rule__Object2__UnorderedGroup_5"
    // InternalBug304681TestLanguage.g:4824:1: rule__Object2__UnorderedGroup_5 : ( rule__Object2__UnorderedGroup_5__0 )? ;
    public final void rule__Object2__UnorderedGroup_5() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getObject2Access().getUnorderedGroup_5());
            
        try {
            // InternalBug304681TestLanguage.g:4829:1: ( ( rule__Object2__UnorderedGroup_5__0 )? )
            // InternalBug304681TestLanguage.g:4830:2: ( rule__Object2__UnorderedGroup_5__0 )?
            {
            // InternalBug304681TestLanguage.g:4830:2: ( rule__Object2__UnorderedGroup_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( LA34_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 0) ) {
                alt34=1;
            }
            else if ( LA34_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 1) ) {
                alt34=1;
            }
            else if ( LA34_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 2) ) {
                alt34=1;
            }
            else if ( LA34_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 3) ) {
                alt34=1;
            }
            else if ( LA34_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 4) ) {
                alt34=1;
            }
            else if ( LA34_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 4) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Object2__UnorderedGroup_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object2__UnorderedGroup_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getObject2Access().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__UnorderedGroup_5"


    // $ANTLR start "rule__Object2__UnorderedGroup_5__Impl"
    // InternalBug304681TestLanguage.g:4840:1: rule__Object2__UnorderedGroup_5__Impl : ( ({...}? => ( ( ( rule__Object2__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object2__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Object2__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Object2__Group_5_3__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Object2__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object2__FeaturesAssignment_5_4 )=> rule__Object2__FeaturesAssignment_5_4 )* ) ) ) ) ) ;
    public final void rule__Object2__UnorderedGroup_5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // InternalBug304681TestLanguage.g:4845:1: ( ( ({...}? => ( ( ( rule__Object2__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object2__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Object2__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Object2__Group_5_3__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Object2__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object2__FeaturesAssignment_5_4 )=> rule__Object2__FeaturesAssignment_5_4 )* ) ) ) ) ) )
            // InternalBug304681TestLanguage.g:4846:3: ( ({...}? => ( ( ( rule__Object2__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object2__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Object2__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Object2__Group_5_3__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Object2__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object2__FeaturesAssignment_5_4 )=> rule__Object2__FeaturesAssignment_5_4 )* ) ) ) ) )
            {
            // InternalBug304681TestLanguage.g:4846:3: ( ({...}? => ( ( ( rule__Object2__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object2__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Object2__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Object2__Group_5_3__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Object2__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object2__FeaturesAssignment_5_4 )=> rule__Object2__FeaturesAssignment_5_4 )* ) ) ) ) )
            int alt36=5;
            int LA36_0 = input.LA(1);

            if ( LA36_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 0) ) {
                alt36=1;
            }
            else if ( LA36_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 1) ) {
                alt36=2;
            }
            else if ( LA36_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 2) ) {
                alt36=3;
            }
            else if ( LA36_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 3) ) {
                alt36=4;
            }
            else if ( LA36_0 >= 26 && LA36_0 <= 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 4) ) {
                alt36=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalBug304681TestLanguage.g:4848:4: ({...}? => ( ( ( rule__Object2__Group_5_0__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:4848:4: ({...}? => ( ( ( rule__Object2__Group_5_0__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:4849:5: {...}? => ( ( ( rule__Object2__Group_5_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Object2__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 0)");
                    }
                    // InternalBug304681TestLanguage.g:4849:104: ( ( ( rule__Object2__Group_5_0__0 ) ) )
                    // InternalBug304681TestLanguage.g:4850:6: ( ( rule__Object2__Group_5_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getObject2Access().getUnorderedGroup_5(), 0);
                    selected = true;
                    // InternalBug304681TestLanguage.g:4856:6: ( ( rule__Object2__Group_5_0__0 ) )
                    // InternalBug304681TestLanguage.g:4858:7: ( rule__Object2__Group_5_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObject2Access().getGroup_5_0()); 
                    }
                    // InternalBug304681TestLanguage.g:4859:7: ( rule__Object2__Group_5_0__0 )
                    // InternalBug304681TestLanguage.g:4859:8: rule__Object2__Group_5_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object2__Group_5_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObject2Access().getGroup_5_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug304681TestLanguage.g:4865:4: ({...}? => ( ( ( rule__Object2__Group_5_1__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:4865:4: ({...}? => ( ( ( rule__Object2__Group_5_1__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:4866:5: {...}? => ( ( ( rule__Object2__Group_5_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Object2__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 1)");
                    }
                    // InternalBug304681TestLanguage.g:4866:104: ( ( ( rule__Object2__Group_5_1__0 ) ) )
                    // InternalBug304681TestLanguage.g:4867:6: ( ( rule__Object2__Group_5_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getObject2Access().getUnorderedGroup_5(), 1);
                    selected = true;
                    // InternalBug304681TestLanguage.g:4873:6: ( ( rule__Object2__Group_5_1__0 ) )
                    // InternalBug304681TestLanguage.g:4875:7: ( rule__Object2__Group_5_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObject2Access().getGroup_5_1()); 
                    }
                    // InternalBug304681TestLanguage.g:4876:7: ( rule__Object2__Group_5_1__0 )
                    // InternalBug304681TestLanguage.g:4876:8: rule__Object2__Group_5_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object2__Group_5_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObject2Access().getGroup_5_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug304681TestLanguage.g:4882:4: ({...}? => ( ( ( rule__Object2__Group_5_2__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:4882:4: ({...}? => ( ( ( rule__Object2__Group_5_2__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:4883:5: {...}? => ( ( ( rule__Object2__Group_5_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Object2__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 2)");
                    }
                    // InternalBug304681TestLanguage.g:4883:104: ( ( ( rule__Object2__Group_5_2__0 ) ) )
                    // InternalBug304681TestLanguage.g:4884:6: ( ( rule__Object2__Group_5_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getObject2Access().getUnorderedGroup_5(), 2);
                    selected = true;
                    // InternalBug304681TestLanguage.g:4890:6: ( ( rule__Object2__Group_5_2__0 ) )
                    // InternalBug304681TestLanguage.g:4892:7: ( rule__Object2__Group_5_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObject2Access().getGroup_5_2()); 
                    }
                    // InternalBug304681TestLanguage.g:4893:7: ( rule__Object2__Group_5_2__0 )
                    // InternalBug304681TestLanguage.g:4893:8: rule__Object2__Group_5_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object2__Group_5_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObject2Access().getGroup_5_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBug304681TestLanguage.g:4899:4: ({...}? => ( ( ( rule__Object2__Group_5_3__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:4899:4: ({...}? => ( ( ( rule__Object2__Group_5_3__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:4900:5: {...}? => ( ( ( rule__Object2__Group_5_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Object2__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 3)");
                    }
                    // InternalBug304681TestLanguage.g:4900:104: ( ( ( rule__Object2__Group_5_3__0 ) ) )
                    // InternalBug304681TestLanguage.g:4901:6: ( ( rule__Object2__Group_5_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getObject2Access().getUnorderedGroup_5(), 3);
                    selected = true;
                    // InternalBug304681TestLanguage.g:4907:6: ( ( rule__Object2__Group_5_3__0 ) )
                    // InternalBug304681TestLanguage.g:4909:7: ( rule__Object2__Group_5_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObject2Access().getGroup_5_3()); 
                    }
                    // InternalBug304681TestLanguage.g:4910:7: ( rule__Object2__Group_5_3__0 )
                    // InternalBug304681TestLanguage.g:4910:8: rule__Object2__Group_5_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object2__Group_5_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObject2Access().getGroup_5_3()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalBug304681TestLanguage.g:4916:4: ({...}? => ( ( ( ( rule__Object2__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object2__FeaturesAssignment_5_4 )=> rule__Object2__FeaturesAssignment_5_4 )* ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:4916:4: ({...}? => ( ( ( ( rule__Object2__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object2__FeaturesAssignment_5_4 )=> rule__Object2__FeaturesAssignment_5_4 )* ) ) ) )
                    // InternalBug304681TestLanguage.g:4917:5: {...}? => ( ( ( ( rule__Object2__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object2__FeaturesAssignment_5_4 )=> rule__Object2__FeaturesAssignment_5_4 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Object2__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 4)");
                    }
                    // InternalBug304681TestLanguage.g:4917:104: ( ( ( ( rule__Object2__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object2__FeaturesAssignment_5_4 )=> rule__Object2__FeaturesAssignment_5_4 )* ) ) )
                    // InternalBug304681TestLanguage.g:4918:6: ( ( ( rule__Object2__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object2__FeaturesAssignment_5_4 )=> rule__Object2__FeaturesAssignment_5_4 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getObject2Access().getUnorderedGroup_5(), 4);
                    selected = true;
                    // InternalBug304681TestLanguage.g:4924:6: ( ( ( rule__Object2__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object2__FeaturesAssignment_5_4 )=> rule__Object2__FeaturesAssignment_5_4 )* ) )
                    // InternalBug304681TestLanguage.g:4925:6: ( ( rule__Object2__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object2__FeaturesAssignment_5_4 )=> rule__Object2__FeaturesAssignment_5_4 )* )
                    {
                    // InternalBug304681TestLanguage.g:4925:6: ( ( rule__Object2__FeaturesAssignment_5_4 ) )
                    // InternalBug304681TestLanguage.g:4926:7: ( rule__Object2__FeaturesAssignment_5_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObject2Access().getFeaturesAssignment_5_4()); 
                    }
                    // InternalBug304681TestLanguage.g:4927:7: ( rule__Object2__FeaturesAssignment_5_4 )
                    // InternalBug304681TestLanguage.g:4927:8: rule__Object2__FeaturesAssignment_5_4
                    {
                    pushFollow(FollowSets000.FOLLOW_27);
                    rule__Object2__FeaturesAssignment_5_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObject2Access().getFeaturesAssignment_5_4()); 
                    }

                    }

                    // InternalBug304681TestLanguage.g:4930:6: ( ( ( rule__Object2__FeaturesAssignment_5_4 )=> rule__Object2__FeaturesAssignment_5_4 )* )
                    // InternalBug304681TestLanguage.g:4931:7: ( ( rule__Object2__FeaturesAssignment_5_4 )=> rule__Object2__FeaturesAssignment_5_4 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObject2Access().getFeaturesAssignment_5_4()); 
                    }
                    // InternalBug304681TestLanguage.g:4932:7: ( ( rule__Object2__FeaturesAssignment_5_4 )=> rule__Object2__FeaturesAssignment_5_4 )*
                    loop35:
                    do {
                        int alt35=2;
                        alt35 = dfa35.predict(input);
                        switch (alt35) {
                    	case 1 :
                    	    // InternalBug304681TestLanguage.g:4932:8: ( rule__Object2__FeaturesAssignment_5_4 )=> rule__Object2__FeaturesAssignment_5_4
                    	    {
                    	    pushFollow(FollowSets000.FOLLOW_27);
                    	    rule__Object2__FeaturesAssignment_5_4();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObject2Access().getFeaturesAssignment_5_4()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObject2Access().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__UnorderedGroup_5__Impl"


    // $ANTLR start "rule__Object2__UnorderedGroup_5__0"
    // InternalBug304681TestLanguage.g:4947:1: rule__Object2__UnorderedGroup_5__0 : rule__Object2__UnorderedGroup_5__Impl ( rule__Object2__UnorderedGroup_5__1 )? ;
    public final void rule__Object2__UnorderedGroup_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4951:1: ( rule__Object2__UnorderedGroup_5__Impl ( rule__Object2__UnorderedGroup_5__1 )? )
            // InternalBug304681TestLanguage.g:4952:2: rule__Object2__UnorderedGroup_5__Impl ( rule__Object2__UnorderedGroup_5__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__Object2__UnorderedGroup_5__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:4953:2: ( rule__Object2__UnorderedGroup_5__1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( LA37_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 0) ) {
                alt37=1;
            }
            else if ( LA37_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 1) ) {
                alt37=1;
            }
            else if ( LA37_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 2) ) {
                alt37=1;
            }
            else if ( LA37_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 3) ) {
                alt37=1;
            }
            else if ( LA37_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 4) ) {
                alt37=1;
            }
            else if ( LA37_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 4) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Object2__UnorderedGroup_5__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object2__UnorderedGroup_5__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__UnorderedGroup_5__0"


    // $ANTLR start "rule__Object2__UnorderedGroup_5__1"
    // InternalBug304681TestLanguage.g:4960:1: rule__Object2__UnorderedGroup_5__1 : rule__Object2__UnorderedGroup_5__Impl ( rule__Object2__UnorderedGroup_5__2 )? ;
    public final void rule__Object2__UnorderedGroup_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4964:1: ( rule__Object2__UnorderedGroup_5__Impl ( rule__Object2__UnorderedGroup_5__2 )? )
            // InternalBug304681TestLanguage.g:4965:2: rule__Object2__UnorderedGroup_5__Impl ( rule__Object2__UnorderedGroup_5__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__Object2__UnorderedGroup_5__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:4966:2: ( rule__Object2__UnorderedGroup_5__2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( LA38_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 0) ) {
                alt38=1;
            }
            else if ( LA38_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 1) ) {
                alt38=1;
            }
            else if ( LA38_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 2) ) {
                alt38=1;
            }
            else if ( LA38_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 3) ) {
                alt38=1;
            }
            else if ( LA38_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 4) ) {
                alt38=1;
            }
            else if ( LA38_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 4) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Object2__UnorderedGroup_5__2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object2__UnorderedGroup_5__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__UnorderedGroup_5__1"


    // $ANTLR start "rule__Object2__UnorderedGroup_5__2"
    // InternalBug304681TestLanguage.g:4973:1: rule__Object2__UnorderedGroup_5__2 : rule__Object2__UnorderedGroup_5__Impl ( rule__Object2__UnorderedGroup_5__3 )? ;
    public final void rule__Object2__UnorderedGroup_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4977:1: ( rule__Object2__UnorderedGroup_5__Impl ( rule__Object2__UnorderedGroup_5__3 )? )
            // InternalBug304681TestLanguage.g:4978:2: rule__Object2__UnorderedGroup_5__Impl ( rule__Object2__UnorderedGroup_5__3 )?
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__Object2__UnorderedGroup_5__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:4979:2: ( rule__Object2__UnorderedGroup_5__3 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( LA39_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 0) ) {
                alt39=1;
            }
            else if ( LA39_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 1) ) {
                alt39=1;
            }
            else if ( LA39_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 2) ) {
                alt39=1;
            }
            else if ( LA39_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 3) ) {
                alt39=1;
            }
            else if ( LA39_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 4) ) {
                alt39=1;
            }
            else if ( LA39_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 4) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Object2__UnorderedGroup_5__3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object2__UnorderedGroup_5__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__UnorderedGroup_5__2"


    // $ANTLR start "rule__Object2__UnorderedGroup_5__3"
    // InternalBug304681TestLanguage.g:4986:1: rule__Object2__UnorderedGroup_5__3 : rule__Object2__UnorderedGroup_5__Impl ( rule__Object2__UnorderedGroup_5__4 )? ;
    public final void rule__Object2__UnorderedGroup_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:4990:1: ( rule__Object2__UnorderedGroup_5__Impl ( rule__Object2__UnorderedGroup_5__4 )? )
            // InternalBug304681TestLanguage.g:4991:2: rule__Object2__UnorderedGroup_5__Impl ( rule__Object2__UnorderedGroup_5__4 )?
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__Object2__UnorderedGroup_5__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:4992:2: ( rule__Object2__UnorderedGroup_5__4 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 1) ) {
                alt40=1;
            }
            else if ( LA40_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 2) ) {
                alt40=1;
            }
            else if ( LA40_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 3) ) {
                alt40=1;
            }
            else if ( LA40_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 4) ) {
                alt40=1;
            }
            else if ( LA40_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 4) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Object2__UnorderedGroup_5__4
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Object2__UnorderedGroup_5__4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__UnorderedGroup_5__3"


    // $ANTLR start "rule__Object2__UnorderedGroup_5__4"
    // InternalBug304681TestLanguage.g:4999:1: rule__Object2__UnorderedGroup_5__4 : rule__Object2__UnorderedGroup_5__Impl ;
    public final void rule__Object2__UnorderedGroup_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5003:1: ( rule__Object2__UnorderedGroup_5__Impl )
            // InternalBug304681TestLanguage.g:5004:2: rule__Object2__UnorderedGroup_5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Object2__UnorderedGroup_5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__UnorderedGroup_5__4"


    // $ANTLR start "rule__Attribute2__UnorderedGroup_3_0_1"
    // InternalBug304681TestLanguage.g:5021:1: rule__Attribute2__UnorderedGroup_3_0_1 : ( rule__Attribute2__UnorderedGroup_3_0_1__0 )? ;
    public final void rule__Attribute2__UnorderedGroup_3_0_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1());
            
        try {
            // InternalBug304681TestLanguage.g:5026:1: ( ( rule__Attribute2__UnorderedGroup_3_0_1__0 )? )
            // InternalBug304681TestLanguage.g:5027:2: ( rule__Attribute2__UnorderedGroup_3_0_1__0 )?
            {
            // InternalBug304681TestLanguage.g:5027:2: ( rule__Attribute2__UnorderedGroup_3_0_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 1) ) {
                alt41=1;
            }
            else if ( LA41_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 2) ) {
                alt41=1;
            }
            else if ( LA41_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 3) ) {
                alt41=1;
            }
            else if ( LA41_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 4) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Attribute2__UnorderedGroup_3_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute2__UnorderedGroup_3_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__UnorderedGroup_3_0_1"


    // $ANTLR start "rule__Attribute2__UnorderedGroup_3_0_1__Impl"
    // InternalBug304681TestLanguage.g:5037:1: rule__Attribute2__UnorderedGroup_3_0_1__Impl : ( ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* ) ) ) ) | ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_4__0 ) ) ) ) ) ;
    public final void rule__Attribute2__UnorderedGroup_3_0_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // InternalBug304681TestLanguage.g:5042:1: ( ( ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* ) ) ) ) | ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_4__0 ) ) ) ) ) )
            // InternalBug304681TestLanguage.g:5043:3: ( ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* ) ) ) ) | ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_4__0 ) ) ) ) )
            {
            // InternalBug304681TestLanguage.g:5043:3: ( ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* ) ) ) ) | ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_4__0 ) ) ) ) )
            int alt43=5;
            int LA43_0 = input.LA(1);

            if ( LA43_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 1) ) {
                alt43=2;
            }
            else if ( LA43_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 2) ) {
                alt43=3;
            }
            else if ( LA43_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 3) ) {
                alt43=4;
            }
            else if ( LA43_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 4) ) {
                alt43=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalBug304681TestLanguage.g:5045:4: ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_0__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:5045:4: ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_0__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:5046:5: {...}? => ( ( ( rule__Attribute2__Group_3_0_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Attribute2__UnorderedGroup_3_0_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 0)");
                    }
                    // InternalBug304681TestLanguage.g:5046:111: ( ( ( rule__Attribute2__Group_3_0_1_0__0 ) ) )
                    // InternalBug304681TestLanguage.g:5047:6: ( ( rule__Attribute2__Group_3_0_1_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 0);
                    selected = true;
                    // InternalBug304681TestLanguage.g:5053:6: ( ( rule__Attribute2__Group_3_0_1_0__0 ) )
                    // InternalBug304681TestLanguage.g:5055:7: ( rule__Attribute2__Group_3_0_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttribute2Access().getGroup_3_0_1_0()); 
                    }
                    // InternalBug304681TestLanguage.g:5056:7: ( rule__Attribute2__Group_3_0_1_0__0 )
                    // InternalBug304681TestLanguage.g:5056:8: rule__Attribute2__Group_3_0_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute2__Group_3_0_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttribute2Access().getGroup_3_0_1_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug304681TestLanguage.g:5062:4: ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_1__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:5062:4: ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_1__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:5063:5: {...}? => ( ( ( rule__Attribute2__Group_3_0_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Attribute2__UnorderedGroup_3_0_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 1)");
                    }
                    // InternalBug304681TestLanguage.g:5063:111: ( ( ( rule__Attribute2__Group_3_0_1_1__0 ) ) )
                    // InternalBug304681TestLanguage.g:5064:6: ( ( rule__Attribute2__Group_3_0_1_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 1);
                    selected = true;
                    // InternalBug304681TestLanguage.g:5070:6: ( ( rule__Attribute2__Group_3_0_1_1__0 ) )
                    // InternalBug304681TestLanguage.g:5072:7: ( rule__Attribute2__Group_3_0_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttribute2Access().getGroup_3_0_1_1()); 
                    }
                    // InternalBug304681TestLanguage.g:5073:7: ( rule__Attribute2__Group_3_0_1_1__0 )
                    // InternalBug304681TestLanguage.g:5073:8: rule__Attribute2__Group_3_0_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute2__Group_3_0_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttribute2Access().getGroup_3_0_1_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug304681TestLanguage.g:5079:4: ({...}? => ( ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:5079:4: ({...}? => ( ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* ) ) ) )
                    // InternalBug304681TestLanguage.g:5080:5: {...}? => ( ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Attribute2__UnorderedGroup_3_0_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 2)");
                    }
                    // InternalBug304681TestLanguage.g:5080:111: ( ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* ) ) )
                    // InternalBug304681TestLanguage.g:5081:6: ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 2);
                    selected = true;
                    // InternalBug304681TestLanguage.g:5087:6: ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* ) )
                    // InternalBug304681TestLanguage.g:5088:6: ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* )
                    {
                    // InternalBug304681TestLanguage.g:5088:6: ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) )
                    // InternalBug304681TestLanguage.g:5089:7: ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttribute2Access().getConstraintDefinitionsAssignment_3_0_1_2()); 
                    }
                    // InternalBug304681TestLanguage.g:5090:7: ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )
                    // InternalBug304681TestLanguage.g:5090:8: rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2
                    {
                    pushFollow(FollowSets000.FOLLOW_28);
                    rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttribute2Access().getConstraintDefinitionsAssignment_3_0_1_2()); 
                    }

                    }

                    // InternalBug304681TestLanguage.g:5093:6: ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* )
                    // InternalBug304681TestLanguage.g:5094:7: ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttribute2Access().getConstraintDefinitionsAssignment_3_0_1_2()); 
                    }
                    // InternalBug304681TestLanguage.g:5095:7: ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )*
                    loop42:
                    do {
                        int alt42=2;
                        alt42 = dfa42.predict(input);
                        switch (alt42) {
                    	case 1 :
                    	    // InternalBug304681TestLanguage.g:5095:8: ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2
                    	    {
                    	    pushFollow(FollowSets000.FOLLOW_28);
                    	    rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttribute2Access().getConstraintDefinitionsAssignment_3_0_1_2()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBug304681TestLanguage.g:5101:4: ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_3__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:5101:4: ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_3__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:5102:5: {...}? => ( ( ( rule__Attribute2__Group_3_0_1_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Attribute2__UnorderedGroup_3_0_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 3)");
                    }
                    // InternalBug304681TestLanguage.g:5102:111: ( ( ( rule__Attribute2__Group_3_0_1_3__0 ) ) )
                    // InternalBug304681TestLanguage.g:5103:6: ( ( rule__Attribute2__Group_3_0_1_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 3);
                    selected = true;
                    // InternalBug304681TestLanguage.g:5109:6: ( ( rule__Attribute2__Group_3_0_1_3__0 ) )
                    // InternalBug304681TestLanguage.g:5111:7: ( rule__Attribute2__Group_3_0_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttribute2Access().getGroup_3_0_1_3()); 
                    }
                    // InternalBug304681TestLanguage.g:5112:7: ( rule__Attribute2__Group_3_0_1_3__0 )
                    // InternalBug304681TestLanguage.g:5112:8: rule__Attribute2__Group_3_0_1_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute2__Group_3_0_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttribute2Access().getGroup_3_0_1_3()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalBug304681TestLanguage.g:5118:4: ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_4__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:5118:4: ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_4__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:5119:5: {...}? => ( ( ( rule__Attribute2__Group_3_0_1_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Attribute2__UnorderedGroup_3_0_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 4)");
                    }
                    // InternalBug304681TestLanguage.g:5119:111: ( ( ( rule__Attribute2__Group_3_0_1_4__0 ) ) )
                    // InternalBug304681TestLanguage.g:5120:6: ( ( rule__Attribute2__Group_3_0_1_4__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 4);
                    selected = true;
                    // InternalBug304681TestLanguage.g:5126:6: ( ( rule__Attribute2__Group_3_0_1_4__0 ) )
                    // InternalBug304681TestLanguage.g:5128:7: ( rule__Attribute2__Group_3_0_1_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttribute2Access().getGroup_3_0_1_4()); 
                    }
                    // InternalBug304681TestLanguage.g:5129:7: ( rule__Attribute2__Group_3_0_1_4__0 )
                    // InternalBug304681TestLanguage.g:5129:8: rule__Attribute2__Group_3_0_1_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute2__Group_3_0_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttribute2Access().getGroup_3_0_1_4()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__UnorderedGroup_3_0_1__Impl"


    // $ANTLR start "rule__Attribute2__UnorderedGroup_3_0_1__0"
    // InternalBug304681TestLanguage.g:5144:1: rule__Attribute2__UnorderedGroup_3_0_1__0 : rule__Attribute2__UnorderedGroup_3_0_1__Impl ( rule__Attribute2__UnorderedGroup_3_0_1__1 )? ;
    public final void rule__Attribute2__UnorderedGroup_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5148:1: ( rule__Attribute2__UnorderedGroup_3_0_1__Impl ( rule__Attribute2__UnorderedGroup_3_0_1__1 )? )
            // InternalBug304681TestLanguage.g:5149:2: rule__Attribute2__UnorderedGroup_3_0_1__Impl ( rule__Attribute2__UnorderedGroup_3_0_1__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__Attribute2__UnorderedGroup_3_0_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:5150:2: ( rule__Attribute2__UnorderedGroup_3_0_1__1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( LA44_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 1) ) {
                alt44=1;
            }
            else if ( LA44_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 2) ) {
                alt44=1;
            }
            else if ( LA44_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 3) ) {
                alt44=1;
            }
            else if ( LA44_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 4) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Attribute2__UnorderedGroup_3_0_1__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute2__UnorderedGroup_3_0_1__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__UnorderedGroup_3_0_1__0"


    // $ANTLR start "rule__Attribute2__UnorderedGroup_3_0_1__1"
    // InternalBug304681TestLanguage.g:5157:1: rule__Attribute2__UnorderedGroup_3_0_1__1 : rule__Attribute2__UnorderedGroup_3_0_1__Impl ( rule__Attribute2__UnorderedGroup_3_0_1__2 )? ;
    public final void rule__Attribute2__UnorderedGroup_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5161:1: ( rule__Attribute2__UnorderedGroup_3_0_1__Impl ( rule__Attribute2__UnorderedGroup_3_0_1__2 )? )
            // InternalBug304681TestLanguage.g:5162:2: rule__Attribute2__UnorderedGroup_3_0_1__Impl ( rule__Attribute2__UnorderedGroup_3_0_1__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__Attribute2__UnorderedGroup_3_0_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:5163:2: ( rule__Attribute2__UnorderedGroup_3_0_1__2 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( LA45_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 0) ) {
                alt45=1;
            }
            else if ( LA45_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 1) ) {
                alt45=1;
            }
            else if ( LA45_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 2) ) {
                alt45=1;
            }
            else if ( LA45_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 3) ) {
                alt45=1;
            }
            else if ( LA45_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 4) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Attribute2__UnorderedGroup_3_0_1__2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute2__UnorderedGroup_3_0_1__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__UnorderedGroup_3_0_1__1"


    // $ANTLR start "rule__Attribute2__UnorderedGroup_3_0_1__2"
    // InternalBug304681TestLanguage.g:5170:1: rule__Attribute2__UnorderedGroup_3_0_1__2 : rule__Attribute2__UnorderedGroup_3_0_1__Impl ( rule__Attribute2__UnorderedGroup_3_0_1__3 )? ;
    public final void rule__Attribute2__UnorderedGroup_3_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5174:1: ( rule__Attribute2__UnorderedGroup_3_0_1__Impl ( rule__Attribute2__UnorderedGroup_3_0_1__3 )? )
            // InternalBug304681TestLanguage.g:5175:2: rule__Attribute2__UnorderedGroup_3_0_1__Impl ( rule__Attribute2__UnorderedGroup_3_0_1__3 )?
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__Attribute2__UnorderedGroup_3_0_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:5176:2: ( rule__Attribute2__UnorderedGroup_3_0_1__3 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 1) ) {
                alt46=1;
            }
            else if ( LA46_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 2) ) {
                alt46=1;
            }
            else if ( LA46_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 3) ) {
                alt46=1;
            }
            else if ( LA46_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 4) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Attribute2__UnorderedGroup_3_0_1__3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute2__UnorderedGroup_3_0_1__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__UnorderedGroup_3_0_1__2"


    // $ANTLR start "rule__Attribute2__UnorderedGroup_3_0_1__3"
    // InternalBug304681TestLanguage.g:5183:1: rule__Attribute2__UnorderedGroup_3_0_1__3 : rule__Attribute2__UnorderedGroup_3_0_1__Impl ( rule__Attribute2__UnorderedGroup_3_0_1__4 )? ;
    public final void rule__Attribute2__UnorderedGroup_3_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5187:1: ( rule__Attribute2__UnorderedGroup_3_0_1__Impl ( rule__Attribute2__UnorderedGroup_3_0_1__4 )? )
            // InternalBug304681TestLanguage.g:5188:2: rule__Attribute2__UnorderedGroup_3_0_1__Impl ( rule__Attribute2__UnorderedGroup_3_0_1__4 )?
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__Attribute2__UnorderedGroup_3_0_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:5189:2: ( rule__Attribute2__UnorderedGroup_3_0_1__4 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( LA47_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 1) ) {
                alt47=1;
            }
            else if ( LA47_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 2) ) {
                alt47=1;
            }
            else if ( LA47_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 3) ) {
                alt47=1;
            }
            else if ( LA47_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 4) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Attribute2__UnorderedGroup_3_0_1__4
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute2__UnorderedGroup_3_0_1__4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__UnorderedGroup_3_0_1__3"


    // $ANTLR start "rule__Attribute2__UnorderedGroup_3_0_1__4"
    // InternalBug304681TestLanguage.g:5196:1: rule__Attribute2__UnorderedGroup_3_0_1__4 : rule__Attribute2__UnorderedGroup_3_0_1__Impl ;
    public final void rule__Attribute2__UnorderedGroup_3_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5200:1: ( rule__Attribute2__UnorderedGroup_3_0_1__Impl )
            // InternalBug304681TestLanguage.g:5201:2: rule__Attribute2__UnorderedGroup_3_0_1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute2__UnorderedGroup_3_0_1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__UnorderedGroup_3_0_1__4"


    // $ANTLR start "rule__Reference2__UnorderedGroup_4_0_1"
    // InternalBug304681TestLanguage.g:5218:1: rule__Reference2__UnorderedGroup_4_0_1 : ( rule__Reference2__UnorderedGroup_4_0_1__0 )? ;
    public final void rule__Reference2__UnorderedGroup_4_0_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1());
            
        try {
            // InternalBug304681TestLanguage.g:5223:1: ( ( rule__Reference2__UnorderedGroup_4_0_1__0 )? )
            // InternalBug304681TestLanguage.g:5224:2: ( rule__Reference2__UnorderedGroup_4_0_1__0 )?
            {
            // InternalBug304681TestLanguage.g:5224:2: ( rule__Reference2__UnorderedGroup_4_0_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( LA48_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 1) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Reference2__UnorderedGroup_4_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Reference2__UnorderedGroup_4_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__UnorderedGroup_4_0_1"


    // $ANTLR start "rule__Reference2__UnorderedGroup_4_0_1__Impl"
    // InternalBug304681TestLanguage.g:5234:1: rule__Reference2__UnorderedGroup_4_0_1__Impl : ( ({...}? => ( ( ( rule__Reference2__Group_4_0_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Reference2__Group_4_0_1_1__0 ) ) ) ) ) ;
    public final void rule__Reference2__UnorderedGroup_4_0_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // InternalBug304681TestLanguage.g:5239:1: ( ( ({...}? => ( ( ( rule__Reference2__Group_4_0_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Reference2__Group_4_0_1_1__0 ) ) ) ) ) )
            // InternalBug304681TestLanguage.g:5240:3: ( ({...}? => ( ( ( rule__Reference2__Group_4_0_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Reference2__Group_4_0_1_1__0 ) ) ) ) )
            {
            // InternalBug304681TestLanguage.g:5240:3: ( ({...}? => ( ( ( rule__Reference2__Group_4_0_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Reference2__Group_4_0_1_1__0 ) ) ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( LA49_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 0) ) {
                alt49=1;
            }
            else if ( LA49_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 1) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalBug304681TestLanguage.g:5242:4: ({...}? => ( ( ( rule__Reference2__Group_4_0_1_0__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:5242:4: ({...}? => ( ( ( rule__Reference2__Group_4_0_1_0__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:5243:5: {...}? => ( ( ( rule__Reference2__Group_4_0_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Reference2__UnorderedGroup_4_0_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 0)");
                    }
                    // InternalBug304681TestLanguage.g:5243:111: ( ( ( rule__Reference2__Group_4_0_1_0__0 ) ) )
                    // InternalBug304681TestLanguage.g:5244:6: ( ( rule__Reference2__Group_4_0_1_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 0);
                    selected = true;
                    // InternalBug304681TestLanguage.g:5250:6: ( ( rule__Reference2__Group_4_0_1_0__0 ) )
                    // InternalBug304681TestLanguage.g:5252:7: ( rule__Reference2__Group_4_0_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReference2Access().getGroup_4_0_1_0()); 
                    }
                    // InternalBug304681TestLanguage.g:5253:7: ( rule__Reference2__Group_4_0_1_0__0 )
                    // InternalBug304681TestLanguage.g:5253:8: rule__Reference2__Group_4_0_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Reference2__Group_4_0_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReference2Access().getGroup_4_0_1_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug304681TestLanguage.g:5259:4: ({...}? => ( ( ( rule__Reference2__Group_4_0_1_1__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:5259:4: ({...}? => ( ( ( rule__Reference2__Group_4_0_1_1__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:5260:5: {...}? => ( ( ( rule__Reference2__Group_4_0_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Reference2__UnorderedGroup_4_0_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 1)");
                    }
                    // InternalBug304681TestLanguage.g:5260:111: ( ( ( rule__Reference2__Group_4_0_1_1__0 ) ) )
                    // InternalBug304681TestLanguage.g:5261:6: ( ( rule__Reference2__Group_4_0_1_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 1);
                    selected = true;
                    // InternalBug304681TestLanguage.g:5267:6: ( ( rule__Reference2__Group_4_0_1_1__0 ) )
                    // InternalBug304681TestLanguage.g:5269:7: ( rule__Reference2__Group_4_0_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReference2Access().getGroup_4_0_1_1()); 
                    }
                    // InternalBug304681TestLanguage.g:5270:7: ( rule__Reference2__Group_4_0_1_1__0 )
                    // InternalBug304681TestLanguage.g:5270:8: rule__Reference2__Group_4_0_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Reference2__Group_4_0_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReference2Access().getGroup_4_0_1_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__UnorderedGroup_4_0_1__Impl"


    // $ANTLR start "rule__Reference2__UnorderedGroup_4_0_1__0"
    // InternalBug304681TestLanguage.g:5285:1: rule__Reference2__UnorderedGroup_4_0_1__0 : rule__Reference2__UnorderedGroup_4_0_1__Impl ( rule__Reference2__UnorderedGroup_4_0_1__1 )? ;
    public final void rule__Reference2__UnorderedGroup_4_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5289:1: ( rule__Reference2__UnorderedGroup_4_0_1__Impl ( rule__Reference2__UnorderedGroup_4_0_1__1 )? )
            // InternalBug304681TestLanguage.g:5290:2: rule__Reference2__UnorderedGroup_4_0_1__Impl ( rule__Reference2__UnorderedGroup_4_0_1__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__Reference2__UnorderedGroup_4_0_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:5291:2: ( rule__Reference2__UnorderedGroup_4_0_1__1 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( LA50_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 1) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__Reference2__UnorderedGroup_4_0_1__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Reference2__UnorderedGroup_4_0_1__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__UnorderedGroup_4_0_1__0"


    // $ANTLR start "rule__Reference2__UnorderedGroup_4_0_1__1"
    // InternalBug304681TestLanguage.g:5298:1: rule__Reference2__UnorderedGroup_4_0_1__1 : rule__Reference2__UnorderedGroup_4_0_1__Impl ;
    public final void rule__Reference2__UnorderedGroup_4_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5302:1: ( rule__Reference2__UnorderedGroup_4_0_1__Impl )
            // InternalBug304681TestLanguage.g:5303:2: rule__Reference2__UnorderedGroup_4_0_1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference2__UnorderedGroup_4_0_1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__UnorderedGroup_4_0_1__1"


    // $ANTLR start "rule__ConstraintDefinition__UnorderedGroup_3"
    // InternalBug304681TestLanguage.g:5314:1: rule__ConstraintDefinition__UnorderedGroup_3 : rule__ConstraintDefinition__UnorderedGroup_3__0 {...}?;
    public final void rule__ConstraintDefinition__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3());
            
        try {
            // InternalBug304681TestLanguage.g:5319:1: ( rule__ConstraintDefinition__UnorderedGroup_3__0 {...}?)
            // InternalBug304681TestLanguage.g:5320:2: rule__ConstraintDefinition__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintDefinition__UnorderedGroup_3__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__ConstraintDefinition__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__UnorderedGroup_3"


    // $ANTLR start "rule__ConstraintDefinition__UnorderedGroup_3__Impl"
    // InternalBug304681TestLanguage.g:5331:1: rule__ConstraintDefinition__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ConstraintDefinition__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ConstraintDefinition__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__ConstraintDefinition__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // InternalBug304681TestLanguage.g:5336:1: ( ( ({...}? => ( ( ( rule__ConstraintDefinition__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ConstraintDefinition__Group_3_1__0 ) ) ) ) ) )
            // InternalBug304681TestLanguage.g:5337:3: ( ({...}? => ( ( ( rule__ConstraintDefinition__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ConstraintDefinition__Group_3_1__0 ) ) ) ) )
            {
            // InternalBug304681TestLanguage.g:5337:3: ( ({...}? => ( ( ( rule__ConstraintDefinition__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ConstraintDefinition__Group_3_1__0 ) ) ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalBug304681TestLanguage.g:5339:4: ({...}? => ( ( ( rule__ConstraintDefinition__Group_3_0__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:5339:4: ({...}? => ( ( ( rule__ConstraintDefinition__Group_3_0__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:5340:5: {...}? => ( ( ( rule__ConstraintDefinition__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ConstraintDefinition__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalBug304681TestLanguage.g:5340:117: ( ( ( rule__ConstraintDefinition__Group_3_0__0 ) ) )
                    // InternalBug304681TestLanguage.g:5341:6: ( ( rule__ConstraintDefinition__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalBug304681TestLanguage.g:5347:6: ( ( rule__ConstraintDefinition__Group_3_0__0 ) )
                    // InternalBug304681TestLanguage.g:5349:7: ( rule__ConstraintDefinition__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstraintDefinitionAccess().getGroup_3_0()); 
                    }
                    // InternalBug304681TestLanguage.g:5350:7: ( rule__ConstraintDefinition__Group_3_0__0 )
                    // InternalBug304681TestLanguage.g:5350:8: rule__ConstraintDefinition__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ConstraintDefinition__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstraintDefinitionAccess().getGroup_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug304681TestLanguage.g:5356:4: ({...}? => ( ( ( rule__ConstraintDefinition__Group_3_1__0 ) ) ) )
                    {
                    // InternalBug304681TestLanguage.g:5356:4: ({...}? => ( ( ( rule__ConstraintDefinition__Group_3_1__0 ) ) ) )
                    // InternalBug304681TestLanguage.g:5357:5: {...}? => ( ( ( rule__ConstraintDefinition__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ConstraintDefinition__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalBug304681TestLanguage.g:5357:117: ( ( ( rule__ConstraintDefinition__Group_3_1__0 ) ) )
                    // InternalBug304681TestLanguage.g:5358:6: ( ( rule__ConstraintDefinition__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalBug304681TestLanguage.g:5364:6: ( ( rule__ConstraintDefinition__Group_3_1__0 ) )
                    // InternalBug304681TestLanguage.g:5366:7: ( rule__ConstraintDefinition__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstraintDefinitionAccess().getGroup_3_1()); 
                    }
                    // InternalBug304681TestLanguage.g:5367:7: ( rule__ConstraintDefinition__Group_3_1__0 )
                    // InternalBug304681TestLanguage.g:5367:8: rule__ConstraintDefinition__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ConstraintDefinition__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstraintDefinitionAccess().getGroup_3_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__ConstraintDefinition__UnorderedGroup_3__0"
    // InternalBug304681TestLanguage.g:5382:1: rule__ConstraintDefinition__UnorderedGroup_3__0 : rule__ConstraintDefinition__UnorderedGroup_3__Impl ( rule__ConstraintDefinition__UnorderedGroup_3__1 )? ;
    public final void rule__ConstraintDefinition__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5386:1: ( rule__ConstraintDefinition__UnorderedGroup_3__Impl ( rule__ConstraintDefinition__UnorderedGroup_3__1 )? )
            // InternalBug304681TestLanguage.g:5387:2: rule__ConstraintDefinition__UnorderedGroup_3__Impl ( rule__ConstraintDefinition__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__ConstraintDefinition__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalBug304681TestLanguage.g:5388:2: ( rule__ConstraintDefinition__UnorderedGroup_3__1 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( LA52_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBug304681TestLanguage.g:0:0: rule__ConstraintDefinition__UnorderedGroup_3__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ConstraintDefinition__UnorderedGroup_3__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__UnorderedGroup_3__0"


    // $ANTLR start "rule__ConstraintDefinition__UnorderedGroup_3__1"
    // InternalBug304681TestLanguage.g:5395:1: rule__ConstraintDefinition__UnorderedGroup_3__1 : rule__ConstraintDefinition__UnorderedGroup_3__Impl ;
    public final void rule__ConstraintDefinition__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5399:1: ( rule__ConstraintDefinition__UnorderedGroup_3__Impl )
            // InternalBug304681TestLanguage.g:5400:2: rule__ConstraintDefinition__UnorderedGroup_3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintDefinition__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__UnorderedGroup_3__1"


    // $ANTLR start "rule__Model__DefinitionAssignment_0_1"
    // InternalBug304681TestLanguage.g:5411:1: rule__Model__DefinitionAssignment_0_1 : ( rulePackageDefinition ) ;
    public final void rule__Model__DefinitionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5415:1: ( ( rulePackageDefinition ) )
            // InternalBug304681TestLanguage.g:5416:1: ( rulePackageDefinition )
            {
            // InternalBug304681TestLanguage.g:5416:1: ( rulePackageDefinition )
            // InternalBug304681TestLanguage.g:5417:1: rulePackageDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDefinitionPackageDefinitionParserRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulePackageDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getDefinitionPackageDefinitionParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DefinitionAssignment_0_1"


    // $ANTLR start "rule__Model__DefinitionAssignment_1_1"
    // InternalBug304681TestLanguage.g:5426:1: rule__Model__DefinitionAssignment_1_1 : ( rulePackageDefinition2 ) ;
    public final void rule__Model__DefinitionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5430:1: ( ( rulePackageDefinition2 ) )
            // InternalBug304681TestLanguage.g:5431:1: ( rulePackageDefinition2 )
            {
            // InternalBug304681TestLanguage.g:5431:1: ( rulePackageDefinition2 )
            // InternalBug304681TestLanguage.g:5432:1: rulePackageDefinition2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDefinitionPackageDefinition2ParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulePackageDefinition2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getDefinitionPackageDefinition2ParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DefinitionAssignment_1_1"


    // $ANTLR start "rule__PackageDefinition__NamespaceAssignment_2"
    // InternalBug304681TestLanguage.g:5441:1: rule__PackageDefinition__NamespaceAssignment_2 : ( RULE_ID ) ;
    public final void rule__PackageDefinition__NamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5445:1: ( ( RULE_ID ) )
            // InternalBug304681TestLanguage.g:5446:1: ( RULE_ID )
            {
            // InternalBug304681TestLanguage.g:5446:1: ( RULE_ID )
            // InternalBug304681TestLanguage.g:5447:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getNamespaceIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getNamespaceIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__NamespaceAssignment_2"


    // $ANTLR start "rule__PackageDefinition__ContentsAssignment_4"
    // InternalBug304681TestLanguage.g:5456:1: rule__PackageDefinition__ContentsAssignment_4 : ( ruleObject ) ;
    public final void rule__PackageDefinition__ContentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5460:1: ( ( ruleObject ) )
            // InternalBug304681TestLanguage.g:5461:1: ( ruleObject )
            {
            // InternalBug304681TestLanguage.g:5461:1: ( ruleObject )
            // InternalBug304681TestLanguage.g:5462:1: ruleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getContentsObjectParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getContentsObjectParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__ContentsAssignment_4"


    // $ANTLR start "rule__Object__EnabledAssignment_0_0"
    // InternalBug304681TestLanguage.g:5471:1: rule__Object__EnabledAssignment_0_0 : ( ( 'enabled' ) ) ;
    public final void rule__Object__EnabledAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5475:1: ( ( ( 'enabled' ) ) )
            // InternalBug304681TestLanguage.g:5476:1: ( ( 'enabled' ) )
            {
            // InternalBug304681TestLanguage.g:5476:1: ( ( 'enabled' ) )
            // InternalBug304681TestLanguage.g:5477:1: ( 'enabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getEnabledEnabledKeyword_0_0_0()); 
            }
            // InternalBug304681TestLanguage.g:5478:1: ( 'enabled' )
            // InternalBug304681TestLanguage.g:5479:1: 'enabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getEnabledEnabledKeyword_0_0_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getEnabledEnabledKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getEnabledEnabledKeyword_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__EnabledAssignment_0_0"


    // $ANTLR start "rule__Object__AbstractAssignment_0_1"
    // InternalBug304681TestLanguage.g:5494:1: rule__Object__AbstractAssignment_0_1 : ( ( 'abstract' ) ) ;
    public final void rule__Object__AbstractAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5498:1: ( ( ( 'abstract' ) ) )
            // InternalBug304681TestLanguage.g:5499:1: ( ( 'abstract' ) )
            {
            // InternalBug304681TestLanguage.g:5499:1: ( ( 'abstract' ) )
            // InternalBug304681TestLanguage.g:5500:1: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getAbstractAbstractKeyword_0_1_0()); 
            }
            // InternalBug304681TestLanguage.g:5501:1: ( 'abstract' )
            // InternalBug304681TestLanguage.g:5502:1: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getAbstractAbstractKeyword_0_1_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getAbstractAbstractKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getAbstractAbstractKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__AbstractAssignment_0_1"


    // $ANTLR start "rule__Object__NameAssignment_2"
    // InternalBug304681TestLanguage.g:5517:1: rule__Object__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Object__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5521:1: ( ( RULE_ID ) )
            // InternalBug304681TestLanguage.g:5522:1: ( RULE_ID )
            {
            // InternalBug304681TestLanguage.g:5522:1: ( RULE_ID )
            // InternalBug304681TestLanguage.g:5523:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__NameAssignment_2"


    // $ANTLR start "rule__Object__ParentAssignment_3_1"
    // InternalBug304681TestLanguage.g:5532:1: rule__Object__ParentAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Object__ParentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5536:1: ( ( ( RULE_ID ) ) )
            // InternalBug304681TestLanguage.g:5537:1: ( ( RULE_ID ) )
            {
            // InternalBug304681TestLanguage.g:5537:1: ( ( RULE_ID ) )
            // InternalBug304681TestLanguage.g:5538:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getParentObjectCrossReference_3_1_0()); 
            }
            // InternalBug304681TestLanguage.g:5539:1: ( RULE_ID )
            // InternalBug304681TestLanguage.g:5540:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getParentObjectIDTerminalRuleCall_3_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getParentObjectIDTerminalRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getParentObjectCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__ParentAssignment_3_1"


    // $ANTLR start "rule__Object__ShortDescriptionAssignment_5_0_1"
    // InternalBug304681TestLanguage.g:5551:1: rule__Object__ShortDescriptionAssignment_5_0_1 : ( RULE_STRING ) ;
    public final void rule__Object__ShortDescriptionAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5555:1: ( ( RULE_STRING ) )
            // InternalBug304681TestLanguage.g:5556:1: ( RULE_STRING )
            {
            // InternalBug304681TestLanguage.g:5556:1: ( RULE_STRING )
            // InternalBug304681TestLanguage.g:5557:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getShortDescriptionSTRINGTerminalRuleCall_5_0_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getShortDescriptionSTRINGTerminalRuleCall_5_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__ShortDescriptionAssignment_5_0_1"


    // $ANTLR start "rule__Object__LongDescriptionAssignment_5_1_1"
    // InternalBug304681TestLanguage.g:5566:1: rule__Object__LongDescriptionAssignment_5_1_1 : ( RULE_STRING ) ;
    public final void rule__Object__LongDescriptionAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5570:1: ( ( RULE_STRING ) )
            // InternalBug304681TestLanguage.g:5571:1: ( RULE_STRING )
            {
            // InternalBug304681TestLanguage.g:5571:1: ( RULE_STRING )
            // InternalBug304681TestLanguage.g:5572:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getLongDescriptionSTRINGTerminalRuleCall_5_1_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getLongDescriptionSTRINGTerminalRuleCall_5_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__LongDescriptionAssignment_5_1_1"


    // $ANTLR start "rule__Object__SerialVersionUIDAssignment_5_2_1"
    // InternalBug304681TestLanguage.g:5581:1: rule__Object__SerialVersionUIDAssignment_5_2_1 : ( RULE_INT ) ;
    public final void rule__Object__SerialVersionUIDAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5585:1: ( ( RULE_INT ) )
            // InternalBug304681TestLanguage.g:5586:1: ( RULE_INT )
            {
            // InternalBug304681TestLanguage.g:5586:1: ( RULE_INT )
            // InternalBug304681TestLanguage.g:5587:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getSerialVersionUIDINTTerminalRuleCall_5_2_1_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getSerialVersionUIDINTTerminalRuleCall_5_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__SerialVersionUIDAssignment_5_2_1"


    // $ANTLR start "rule__Object__CloneableAssignment_5_3_0"
    // InternalBug304681TestLanguage.g:5596:1: rule__Object__CloneableAssignment_5_3_0 : ( ( 'cloneable' ) ) ;
    public final void rule__Object__CloneableAssignment_5_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5600:1: ( ( ( 'cloneable' ) ) )
            // InternalBug304681TestLanguage.g:5601:1: ( ( 'cloneable' ) )
            {
            // InternalBug304681TestLanguage.g:5601:1: ( ( 'cloneable' ) )
            // InternalBug304681TestLanguage.g:5602:1: ( 'cloneable' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getCloneableCloneableKeyword_5_3_0_0()); 
            }
            // InternalBug304681TestLanguage.g:5603:1: ( 'cloneable' )
            // InternalBug304681TestLanguage.g:5604:1: 'cloneable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getCloneableCloneableKeyword_5_3_0_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getCloneableCloneableKeyword_5_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getCloneableCloneableKeyword_5_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__CloneableAssignment_5_3_0"


    // $ANTLR start "rule__Object__FeaturesAssignment_5_4"
    // InternalBug304681TestLanguage.g:5619:1: rule__Object__FeaturesAssignment_5_4 : ( ruleFeature ) ;
    public final void rule__Object__FeaturesAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5623:1: ( ( ruleFeature ) )
            // InternalBug304681TestLanguage.g:5624:1: ( ruleFeature )
            {
            // InternalBug304681TestLanguage.g:5624:1: ( ruleFeature )
            // InternalBug304681TestLanguage.g:5625:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getFeaturesFeatureParserRuleCall_5_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getFeaturesFeatureParserRuleCall_5_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__FeaturesAssignment_5_4"


    // $ANTLR start "rule__Object__FeaturesAssignment_5_5_1"
    // InternalBug304681TestLanguage.g:5634:1: rule__Object__FeaturesAssignment_5_5_1 : ( ruleFeature ) ;
    public final void rule__Object__FeaturesAssignment_5_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5638:1: ( ( ruleFeature ) )
            // InternalBug304681TestLanguage.g:5639:1: ( ruleFeature )
            {
            // InternalBug304681TestLanguage.g:5639:1: ( ruleFeature )
            // InternalBug304681TestLanguage.g:5640:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getFeaturesFeatureParserRuleCall_5_5_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getFeaturesFeatureParserRuleCall_5_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__FeaturesAssignment_5_5_1"


    // $ANTLR start "rule__Object__FeaturesAssignment_5_6_1"
    // InternalBug304681TestLanguage.g:5649:1: rule__Object__FeaturesAssignment_5_6_1 : ( ruleFeature ) ;
    public final void rule__Object__FeaturesAssignment_5_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5653:1: ( ( ruleFeature ) )
            // InternalBug304681TestLanguage.g:5654:1: ( ruleFeature )
            {
            // InternalBug304681TestLanguage.g:5654:1: ( ruleFeature )
            // InternalBug304681TestLanguage.g:5655:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getFeaturesFeatureParserRuleCall_5_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getFeaturesFeatureParserRuleCall_5_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__FeaturesAssignment_5_6_1"


    // $ANTLR start "rule__Object__FeaturesAssignment_5_7_1"
    // InternalBug304681TestLanguage.g:5664:1: rule__Object__FeaturesAssignment_5_7_1 : ( ruleFeature ) ;
    public final void rule__Object__FeaturesAssignment_5_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5668:1: ( ( ruleFeature ) )
            // InternalBug304681TestLanguage.g:5669:1: ( ruleFeature )
            {
            // InternalBug304681TestLanguage.g:5669:1: ( ruleFeature )
            // InternalBug304681TestLanguage.g:5670:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getFeaturesFeatureParserRuleCall_5_7_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getFeaturesFeatureParserRuleCall_5_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__FeaturesAssignment_5_7_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_1"
    // InternalBug304681TestLanguage.g:5679:1: rule__Attribute__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5683:1: ( ( RULE_ID ) )
            // InternalBug304681TestLanguage.g:5684:1: ( RULE_ID )
            {
            // InternalBug304681TestLanguage.g:5684:1: ( RULE_ID )
            // InternalBug304681TestLanguage.g:5685:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // InternalBug304681TestLanguage.g:5694:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5698:1: ( ( RULE_ID ) )
            // InternalBug304681TestLanguage.g:5699:1: ( RULE_ID )
            {
            // InternalBug304681TestLanguage.g:5699:1: ( RULE_ID )
            // InternalBug304681TestLanguage.g:5700:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__Reference__TypeAssignment_1"
    // InternalBug304681TestLanguage.g:5709:1: rule__Reference__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5713:1: ( ( ( RULE_ID ) ) )
            // InternalBug304681TestLanguage.g:5714:1: ( ( RULE_ID ) )
            {
            // InternalBug304681TestLanguage.g:5714:1: ( ( RULE_ID ) )
            // InternalBug304681TestLanguage.g:5715:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getTypeObjectCrossReference_1_0()); 
            }
            // InternalBug304681TestLanguage.g:5716:1: ( RULE_ID )
            // InternalBug304681TestLanguage.g:5717:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getTypeObjectIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getTypeObjectIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getTypeObjectCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__TypeAssignment_1"


    // $ANTLR start "rule__Reference__ManyAssignment_2"
    // InternalBug304681TestLanguage.g:5728:1: rule__Reference__ManyAssignment_2 : ( ( '*' ) ) ;
    public final void rule__Reference__ManyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5732:1: ( ( ( '*' ) ) )
            // InternalBug304681TestLanguage.g:5733:1: ( ( '*' ) )
            {
            // InternalBug304681TestLanguage.g:5733:1: ( ( '*' ) )
            // InternalBug304681TestLanguage.g:5734:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getManyAsteriskKeyword_2_0()); 
            }
            // InternalBug304681TestLanguage.g:5735:1: ( '*' )
            // InternalBug304681TestLanguage.g:5736:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getManyAsteriskKeyword_2_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getManyAsteriskKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getManyAsteriskKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__ManyAssignment_2"


    // $ANTLR start "rule__Reference__NameAssignment_3"
    // InternalBug304681TestLanguage.g:5751:1: rule__Reference__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5755:1: ( ( RULE_ID ) )
            // InternalBug304681TestLanguage.g:5756:1: ( RULE_ID )
            {
            // InternalBug304681TestLanguage.g:5756:1: ( RULE_ID )
            // InternalBug304681TestLanguage.g:5757:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NameAssignment_3"


    // $ANTLR start "rule__Reference__ShortDescriptionAssignment_4_0_1_0_1"
    // InternalBug304681TestLanguage.g:5766:1: rule__Reference__ShortDescriptionAssignment_4_0_1_0_1 : ( RULE_STRING ) ;
    public final void rule__Reference__ShortDescriptionAssignment_4_0_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5770:1: ( ( RULE_STRING ) )
            // InternalBug304681TestLanguage.g:5771:1: ( RULE_STRING )
            {
            // InternalBug304681TestLanguage.g:5771:1: ( RULE_STRING )
            // InternalBug304681TestLanguage.g:5772:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getShortDescriptionSTRINGTerminalRuleCall_4_0_1_0_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getShortDescriptionSTRINGTerminalRuleCall_4_0_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__ShortDescriptionAssignment_4_0_1_0_1"


    // $ANTLR start "rule__Reference__LongDescriptionAssignment_4_0_1_1_1"
    // InternalBug304681TestLanguage.g:5781:1: rule__Reference__LongDescriptionAssignment_4_0_1_1_1 : ( RULE_STRING ) ;
    public final void rule__Reference__LongDescriptionAssignment_4_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5785:1: ( ( RULE_STRING ) )
            // InternalBug304681TestLanguage.g:5786:1: ( RULE_STRING )
            {
            // InternalBug304681TestLanguage.g:5786:1: ( RULE_STRING )
            // InternalBug304681TestLanguage.g:5787:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getLongDescriptionSTRINGTerminalRuleCall_4_0_1_1_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getLongDescriptionSTRINGTerminalRuleCall_4_0_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__LongDescriptionAssignment_4_0_1_1_1"


    // $ANTLR start "rule__PackageDefinition2__NamespaceAssignment_2"
    // InternalBug304681TestLanguage.g:5796:1: rule__PackageDefinition2__NamespaceAssignment_2 : ( RULE_ID ) ;
    public final void rule__PackageDefinition2__NamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5800:1: ( ( RULE_ID ) )
            // InternalBug304681TestLanguage.g:5801:1: ( RULE_ID )
            {
            // InternalBug304681TestLanguage.g:5801:1: ( RULE_ID )
            // InternalBug304681TestLanguage.g:5802:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinition2Access().getNamespaceIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinition2Access().getNamespaceIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition2__NamespaceAssignment_2"


    // $ANTLR start "rule__PackageDefinition2__ContentsAssignment_4"
    // InternalBug304681TestLanguage.g:5811:1: rule__PackageDefinition2__ContentsAssignment_4 : ( ruleObject2 ) ;
    public final void rule__PackageDefinition2__ContentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5815:1: ( ( ruleObject2 ) )
            // InternalBug304681TestLanguage.g:5816:1: ( ruleObject2 )
            {
            // InternalBug304681TestLanguage.g:5816:1: ( ruleObject2 )
            // InternalBug304681TestLanguage.g:5817:1: ruleObject2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinition2Access().getContentsObject2ParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleObject2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinition2Access().getContentsObject2ParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition2__ContentsAssignment_4"


    // $ANTLR start "rule__Object2__EnabledAssignment_0_0"
    // InternalBug304681TestLanguage.g:5826:1: rule__Object2__EnabledAssignment_0_0 : ( ( 'enabled' ) ) ;
    public final void rule__Object2__EnabledAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5830:1: ( ( ( 'enabled' ) ) )
            // InternalBug304681TestLanguage.g:5831:1: ( ( 'enabled' ) )
            {
            // InternalBug304681TestLanguage.g:5831:1: ( ( 'enabled' ) )
            // InternalBug304681TestLanguage.g:5832:1: ( 'enabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getEnabledEnabledKeyword_0_0_0()); 
            }
            // InternalBug304681TestLanguage.g:5833:1: ( 'enabled' )
            // InternalBug304681TestLanguage.g:5834:1: 'enabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getEnabledEnabledKeyword_0_0_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getEnabledEnabledKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getEnabledEnabledKeyword_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__EnabledAssignment_0_0"


    // $ANTLR start "rule__Object2__AbstractAssignment_0_1"
    // InternalBug304681TestLanguage.g:5849:1: rule__Object2__AbstractAssignment_0_1 : ( ( 'abstract' ) ) ;
    public final void rule__Object2__AbstractAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5853:1: ( ( ( 'abstract' ) ) )
            // InternalBug304681TestLanguage.g:5854:1: ( ( 'abstract' ) )
            {
            // InternalBug304681TestLanguage.g:5854:1: ( ( 'abstract' ) )
            // InternalBug304681TestLanguage.g:5855:1: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getAbstractAbstractKeyword_0_1_0()); 
            }
            // InternalBug304681TestLanguage.g:5856:1: ( 'abstract' )
            // InternalBug304681TestLanguage.g:5857:1: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getAbstractAbstractKeyword_0_1_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getAbstractAbstractKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getAbstractAbstractKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__AbstractAssignment_0_1"


    // $ANTLR start "rule__Object2__NameAssignment_2"
    // InternalBug304681TestLanguage.g:5872:1: rule__Object2__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Object2__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5876:1: ( ( RULE_ID ) )
            // InternalBug304681TestLanguage.g:5877:1: ( RULE_ID )
            {
            // InternalBug304681TestLanguage.g:5877:1: ( RULE_ID )
            // InternalBug304681TestLanguage.g:5878:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__NameAssignment_2"


    // $ANTLR start "rule__Object2__ParentAssignment_3_1"
    // InternalBug304681TestLanguage.g:5887:1: rule__Object2__ParentAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Object2__ParentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5891:1: ( ( ( RULE_ID ) ) )
            // InternalBug304681TestLanguage.g:5892:1: ( ( RULE_ID ) )
            {
            // InternalBug304681TestLanguage.g:5892:1: ( ( RULE_ID ) )
            // InternalBug304681TestLanguage.g:5893:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getParentObjectCrossReference_3_1_0()); 
            }
            // InternalBug304681TestLanguage.g:5894:1: ( RULE_ID )
            // InternalBug304681TestLanguage.g:5895:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getParentObjectIDTerminalRuleCall_3_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getParentObjectIDTerminalRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getParentObjectCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__ParentAssignment_3_1"


    // $ANTLR start "rule__Object2__ShortDescriptionAssignment_5_0_1"
    // InternalBug304681TestLanguage.g:5906:1: rule__Object2__ShortDescriptionAssignment_5_0_1 : ( RULE_STRING ) ;
    public final void rule__Object2__ShortDescriptionAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5910:1: ( ( RULE_STRING ) )
            // InternalBug304681TestLanguage.g:5911:1: ( RULE_STRING )
            {
            // InternalBug304681TestLanguage.g:5911:1: ( RULE_STRING )
            // InternalBug304681TestLanguage.g:5912:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getShortDescriptionSTRINGTerminalRuleCall_5_0_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getShortDescriptionSTRINGTerminalRuleCall_5_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__ShortDescriptionAssignment_5_0_1"


    // $ANTLR start "rule__Object2__LongDescriptionAssignment_5_1_1"
    // InternalBug304681TestLanguage.g:5921:1: rule__Object2__LongDescriptionAssignment_5_1_1 : ( RULE_STRING ) ;
    public final void rule__Object2__LongDescriptionAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5925:1: ( ( RULE_STRING ) )
            // InternalBug304681TestLanguage.g:5926:1: ( RULE_STRING )
            {
            // InternalBug304681TestLanguage.g:5926:1: ( RULE_STRING )
            // InternalBug304681TestLanguage.g:5927:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getLongDescriptionSTRINGTerminalRuleCall_5_1_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getLongDescriptionSTRINGTerminalRuleCall_5_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__LongDescriptionAssignment_5_1_1"


    // $ANTLR start "rule__Object2__SerialVersionUIDAssignment_5_2_1"
    // InternalBug304681TestLanguage.g:5936:1: rule__Object2__SerialVersionUIDAssignment_5_2_1 : ( RULE_INT ) ;
    public final void rule__Object2__SerialVersionUIDAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5940:1: ( ( RULE_INT ) )
            // InternalBug304681TestLanguage.g:5941:1: ( RULE_INT )
            {
            // InternalBug304681TestLanguage.g:5941:1: ( RULE_INT )
            // InternalBug304681TestLanguage.g:5942:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getSerialVersionUIDINTTerminalRuleCall_5_2_1_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getSerialVersionUIDINTTerminalRuleCall_5_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__SerialVersionUIDAssignment_5_2_1"


    // $ANTLR start "rule__Object2__CloneableAssignment_5_3_0"
    // InternalBug304681TestLanguage.g:5951:1: rule__Object2__CloneableAssignment_5_3_0 : ( ( 'cloneable' ) ) ;
    public final void rule__Object2__CloneableAssignment_5_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5955:1: ( ( ( 'cloneable' ) ) )
            // InternalBug304681TestLanguage.g:5956:1: ( ( 'cloneable' ) )
            {
            // InternalBug304681TestLanguage.g:5956:1: ( ( 'cloneable' ) )
            // InternalBug304681TestLanguage.g:5957:1: ( 'cloneable' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getCloneableCloneableKeyword_5_3_0_0()); 
            }
            // InternalBug304681TestLanguage.g:5958:1: ( 'cloneable' )
            // InternalBug304681TestLanguage.g:5959:1: 'cloneable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getCloneableCloneableKeyword_5_3_0_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getCloneableCloneableKeyword_5_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getCloneableCloneableKeyword_5_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__CloneableAssignment_5_3_0"


    // $ANTLR start "rule__Object2__FeaturesAssignment_5_4"
    // InternalBug304681TestLanguage.g:5974:1: rule__Object2__FeaturesAssignment_5_4 : ( ruleFeature2 ) ;
    public final void rule__Object2__FeaturesAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5978:1: ( ( ruleFeature2 ) )
            // InternalBug304681TestLanguage.g:5979:1: ( ruleFeature2 )
            {
            // InternalBug304681TestLanguage.g:5979:1: ( ruleFeature2 )
            // InternalBug304681TestLanguage.g:5980:1: ruleFeature2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObject2Access().getFeaturesFeature2ParserRuleCall_5_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFeature2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObject2Access().getFeaturesFeature2ParserRuleCall_5_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object2__FeaturesAssignment_5_4"


    // $ANTLR start "rule__Attribute2__TypeAssignment_1"
    // InternalBug304681TestLanguage.g:5989:1: rule__Attribute2__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute2__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:5993:1: ( ( RULE_ID ) )
            // InternalBug304681TestLanguage.g:5994:1: ( RULE_ID )
            {
            // InternalBug304681TestLanguage.g:5994:1: ( RULE_ID )
            // InternalBug304681TestLanguage.g:5995:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getTypeIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getTypeIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__TypeAssignment_1"


    // $ANTLR start "rule__Attribute2__NameAssignment_2"
    // InternalBug304681TestLanguage.g:6004:1: rule__Attribute2__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute2__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:6008:1: ( ( RULE_ID ) )
            // InternalBug304681TestLanguage.g:6009:1: ( RULE_ID )
            {
            // InternalBug304681TestLanguage.g:6009:1: ( RULE_ID )
            // InternalBug304681TestLanguage.g:6010:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__NameAssignment_2"


    // $ANTLR start "rule__Attribute2__ShortDescriptionAssignment_3_0_1_0_1"
    // InternalBug304681TestLanguage.g:6019:1: rule__Attribute2__ShortDescriptionAssignment_3_0_1_0_1 : ( RULE_STRING ) ;
    public final void rule__Attribute2__ShortDescriptionAssignment_3_0_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:6023:1: ( ( RULE_STRING ) )
            // InternalBug304681TestLanguage.g:6024:1: ( RULE_STRING )
            {
            // InternalBug304681TestLanguage.g:6024:1: ( RULE_STRING )
            // InternalBug304681TestLanguage.g:6025:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getShortDescriptionSTRINGTerminalRuleCall_3_0_1_0_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getShortDescriptionSTRINGTerminalRuleCall_3_0_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__ShortDescriptionAssignment_3_0_1_0_1"


    // $ANTLR start "rule__Attribute2__LongDescriptionAssignment_3_0_1_1_1"
    // InternalBug304681TestLanguage.g:6034:1: rule__Attribute2__LongDescriptionAssignment_3_0_1_1_1 : ( RULE_STRING ) ;
    public final void rule__Attribute2__LongDescriptionAssignment_3_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:6038:1: ( ( RULE_STRING ) )
            // InternalBug304681TestLanguage.g:6039:1: ( RULE_STRING )
            {
            // InternalBug304681TestLanguage.g:6039:1: ( RULE_STRING )
            // InternalBug304681TestLanguage.g:6040:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getLongDescriptionSTRINGTerminalRuleCall_3_0_1_1_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getLongDescriptionSTRINGTerminalRuleCall_3_0_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__LongDescriptionAssignment_3_0_1_1_1"


    // $ANTLR start "rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2"
    // InternalBug304681TestLanguage.g:6049:1: rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 : ( ruleConstraintDefinition ) ;
    public final void rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:6053:1: ( ( ruleConstraintDefinition ) )
            // InternalBug304681TestLanguage.g:6054:1: ( ruleConstraintDefinition )
            {
            // InternalBug304681TestLanguage.g:6054:1: ( ruleConstraintDefinition )
            // InternalBug304681TestLanguage.g:6055:1: ruleConstraintDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getConstraintDefinitionsConstraintDefinitionParserRuleCall_3_0_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConstraintDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getConstraintDefinitionsConstraintDefinitionParserRuleCall_3_0_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2"


    // $ANTLR start "rule__Attribute2__RequiredAssignment_3_0_1_3_0"
    // InternalBug304681TestLanguage.g:6064:1: rule__Attribute2__RequiredAssignment_3_0_1_3_0 : ( ( 'required' ) ) ;
    public final void rule__Attribute2__RequiredAssignment_3_0_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:6068:1: ( ( ( 'required' ) ) )
            // InternalBug304681TestLanguage.g:6069:1: ( ( 'required' ) )
            {
            // InternalBug304681TestLanguage.g:6069:1: ( ( 'required' ) )
            // InternalBug304681TestLanguage.g:6070:1: ( 'required' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getRequiredRequiredKeyword_3_0_1_3_0_0()); 
            }
            // InternalBug304681TestLanguage.g:6071:1: ( 'required' )
            // InternalBug304681TestLanguage.g:6072:1: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getRequiredRequiredKeyword_3_0_1_3_0_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getRequiredRequiredKeyword_3_0_1_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getRequiredRequiredKeyword_3_0_1_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__RequiredAssignment_3_0_1_3_0"


    // $ANTLR start "rule__Attribute2__TechnicalAssignment_3_0_1_4_0"
    // InternalBug304681TestLanguage.g:6087:1: rule__Attribute2__TechnicalAssignment_3_0_1_4_0 : ( ( 'technical' ) ) ;
    public final void rule__Attribute2__TechnicalAssignment_3_0_1_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:6091:1: ( ( ( 'technical' ) ) )
            // InternalBug304681TestLanguage.g:6092:1: ( ( 'technical' ) )
            {
            // InternalBug304681TestLanguage.g:6092:1: ( ( 'technical' ) )
            // InternalBug304681TestLanguage.g:6093:1: ( 'technical' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getTechnicalTechnicalKeyword_3_0_1_4_0_0()); 
            }
            // InternalBug304681TestLanguage.g:6094:1: ( 'technical' )
            // InternalBug304681TestLanguage.g:6095:1: 'technical'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttribute2Access().getTechnicalTechnicalKeyword_3_0_1_4_0_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getTechnicalTechnicalKeyword_3_0_1_4_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttribute2Access().getTechnicalTechnicalKeyword_3_0_1_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute2__TechnicalAssignment_3_0_1_4_0"


    // $ANTLR start "rule__Reference2__TypeAssignment_1"
    // InternalBug304681TestLanguage.g:6110:1: rule__Reference2__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference2__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:6114:1: ( ( ( RULE_ID ) ) )
            // InternalBug304681TestLanguage.g:6115:1: ( ( RULE_ID ) )
            {
            // InternalBug304681TestLanguage.g:6115:1: ( ( RULE_ID ) )
            // InternalBug304681TestLanguage.g:6116:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getTypeObjectCrossReference_1_0()); 
            }
            // InternalBug304681TestLanguage.g:6117:1: ( RULE_ID )
            // InternalBug304681TestLanguage.g:6118:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getTypeObjectIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getTypeObjectIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getTypeObjectCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__TypeAssignment_1"


    // $ANTLR start "rule__Reference2__ManyAssignment_2"
    // InternalBug304681TestLanguage.g:6129:1: rule__Reference2__ManyAssignment_2 : ( ( '*' ) ) ;
    public final void rule__Reference2__ManyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:6133:1: ( ( ( '*' ) ) )
            // InternalBug304681TestLanguage.g:6134:1: ( ( '*' ) )
            {
            // InternalBug304681TestLanguage.g:6134:1: ( ( '*' ) )
            // InternalBug304681TestLanguage.g:6135:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getManyAsteriskKeyword_2_0()); 
            }
            // InternalBug304681TestLanguage.g:6136:1: ( '*' )
            // InternalBug304681TestLanguage.g:6137:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getManyAsteriskKeyword_2_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getManyAsteriskKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getManyAsteriskKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__ManyAssignment_2"


    // $ANTLR start "rule__Reference2__NameAssignment_3"
    // InternalBug304681TestLanguage.g:6152:1: rule__Reference2__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Reference2__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:6156:1: ( ( RULE_ID ) )
            // InternalBug304681TestLanguage.g:6157:1: ( RULE_ID )
            {
            // InternalBug304681TestLanguage.g:6157:1: ( RULE_ID )
            // InternalBug304681TestLanguage.g:6158:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__NameAssignment_3"


    // $ANTLR start "rule__Reference2__ShortDescriptionAssignment_4_0_1_0_1"
    // InternalBug304681TestLanguage.g:6167:1: rule__Reference2__ShortDescriptionAssignment_4_0_1_0_1 : ( RULE_STRING ) ;
    public final void rule__Reference2__ShortDescriptionAssignment_4_0_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:6171:1: ( ( RULE_STRING ) )
            // InternalBug304681TestLanguage.g:6172:1: ( RULE_STRING )
            {
            // InternalBug304681TestLanguage.g:6172:1: ( RULE_STRING )
            // InternalBug304681TestLanguage.g:6173:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getShortDescriptionSTRINGTerminalRuleCall_4_0_1_0_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getShortDescriptionSTRINGTerminalRuleCall_4_0_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__ShortDescriptionAssignment_4_0_1_0_1"


    // $ANTLR start "rule__Reference2__LongDescriptionAssignment_4_0_1_1_1"
    // InternalBug304681TestLanguage.g:6182:1: rule__Reference2__LongDescriptionAssignment_4_0_1_1_1 : ( RULE_STRING ) ;
    public final void rule__Reference2__LongDescriptionAssignment_4_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:6186:1: ( ( RULE_STRING ) )
            // InternalBug304681TestLanguage.g:6187:1: ( RULE_STRING )
            {
            // InternalBug304681TestLanguage.g:6187:1: ( RULE_STRING )
            // InternalBug304681TestLanguage.g:6188:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReference2Access().getLongDescriptionSTRINGTerminalRuleCall_4_0_1_1_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReference2Access().getLongDescriptionSTRINGTerminalRuleCall_4_0_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference2__LongDescriptionAssignment_4_0_1_1_1"


    // $ANTLR start "rule__ConstraintDefinition__TypeAssignment_1"
    // InternalBug304681TestLanguage.g:6197:1: rule__ConstraintDefinition__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConstraintDefinition__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:6201:1: ( ( RULE_ID ) )
            // InternalBug304681TestLanguage.g:6202:1: ( RULE_ID )
            {
            // InternalBug304681TestLanguage.g:6202:1: ( RULE_ID )
            // InternalBug304681TestLanguage.g:6203:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintDefinitionAccess().getTypeIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintDefinitionAccess().getTypeIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__TypeAssignment_1"


    // $ANTLR start "rule__ConstraintDefinition__ParametersAssignment_3_0_1"
    // InternalBug304681TestLanguage.g:6212:1: rule__ConstraintDefinition__ParametersAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__ConstraintDefinition__ParametersAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:6216:1: ( ( RULE_STRING ) )
            // InternalBug304681TestLanguage.g:6217:1: ( RULE_STRING )
            {
            // InternalBug304681TestLanguage.g:6217:1: ( RULE_STRING )
            // InternalBug304681TestLanguage.g:6218:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintDefinitionAccess().getParametersSTRINGTerminalRuleCall_3_0_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintDefinitionAccess().getParametersSTRINGTerminalRuleCall_3_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__ParametersAssignment_3_0_1"


    // $ANTLR start "rule__ConstraintDefinition__MessageAssignment_3_1_1"
    // InternalBug304681TestLanguage.g:6227:1: rule__ConstraintDefinition__MessageAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__ConstraintDefinition__MessageAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBug304681TestLanguage.g:6231:1: ( ( RULE_STRING ) )
            // InternalBug304681TestLanguage.g:6232:1: ( RULE_STRING )
            {
            // InternalBug304681TestLanguage.g:6232:1: ( RULE_STRING )
            // InternalBug304681TestLanguage.g:6233:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintDefinitionAccess().getMessageSTRINGTerminalRuleCall_3_1_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintDefinitionAccess().getMessageSTRINGTerminalRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintDefinition__MessageAssignment_3_1_1"

    // $ANTLR start synpred13_InternalBug304681TestLanguage
    public final void synpred13_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:1648:2: ( rule__Object__FeaturesAssignment_5_6_1 )
        // InternalBug304681TestLanguage.g:1648:2: rule__Object__FeaturesAssignment_5_6_1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object__FeaturesAssignment_5_6_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalBug304681TestLanguage

    // $ANTLR start synpred14_InternalBug304681TestLanguage
    public final void synpred14_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:1717:2: ( rule__Object__FeaturesAssignment_5_7_1 )
        // InternalBug304681TestLanguage.g:1717:2: rule__Object__FeaturesAssignment_5_7_1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object__FeaturesAssignment_5_7_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalBug304681TestLanguage

    // $ANTLR start synpred21_InternalBug304681TestLanguage
    public final void synpred21_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4441:2: ( rule__Object__UnorderedGroup_5__0 )
        // InternalBug304681TestLanguage.g:4441:2: rule__Object__UnorderedGroup_5__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object__UnorderedGroup_5__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalBug304681TestLanguage

    // $ANTLR start synpred22_InternalBug304681TestLanguage
    public final void synpred22_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4459:4: ( ({...}? => ( ( ( rule__Object__Group_5_0__0 ) ) ) ) )
        // InternalBug304681TestLanguage.g:4459:4: ({...}? => ( ( ( rule__Object__Group_5_0__0 ) ) ) )
        {
        // InternalBug304681TestLanguage.g:4459:4: ({...}? => ( ( ( rule__Object__Group_5_0__0 ) ) ) )
        // InternalBug304681TestLanguage.g:4460:5: {...}? => ( ( ( rule__Object__Group_5_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred22_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 0)");
        }
        // InternalBug304681TestLanguage.g:4460:103: ( ( ( rule__Object__Group_5_0__0 ) ) )
        // InternalBug304681TestLanguage.g:4461:6: ( ( rule__Object__Group_5_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 0);
        // InternalBug304681TestLanguage.g:4467:6: ( ( rule__Object__Group_5_0__0 ) )
        // InternalBug304681TestLanguage.g:4469:7: ( rule__Object__Group_5_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getObjectAccess().getGroup_5_0()); 
        }
        // InternalBug304681TestLanguage.g:4470:7: ( rule__Object__Group_5_0__0 )
        // InternalBug304681TestLanguage.g:4470:8: rule__Object__Group_5_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object__Group_5_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalBug304681TestLanguage

    // $ANTLR start synpred23_InternalBug304681TestLanguage
    public final void synpred23_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4476:4: ( ({...}? => ( ( ( rule__Object__Group_5_1__0 ) ) ) ) )
        // InternalBug304681TestLanguage.g:4476:4: ({...}? => ( ( ( rule__Object__Group_5_1__0 ) ) ) )
        {
        // InternalBug304681TestLanguage.g:4476:4: ({...}? => ( ( ( rule__Object__Group_5_1__0 ) ) ) )
        // InternalBug304681TestLanguage.g:4477:5: {...}? => ( ( ( rule__Object__Group_5_1__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred23_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 1)");
        }
        // InternalBug304681TestLanguage.g:4477:103: ( ( ( rule__Object__Group_5_1__0 ) ) )
        // InternalBug304681TestLanguage.g:4478:6: ( ( rule__Object__Group_5_1__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 1);
        // InternalBug304681TestLanguage.g:4484:6: ( ( rule__Object__Group_5_1__0 ) )
        // InternalBug304681TestLanguage.g:4486:7: ( rule__Object__Group_5_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getObjectAccess().getGroup_5_1()); 
        }
        // InternalBug304681TestLanguage.g:4487:7: ( rule__Object__Group_5_1__0 )
        // InternalBug304681TestLanguage.g:4487:8: rule__Object__Group_5_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object__Group_5_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalBug304681TestLanguage

    // $ANTLR start synpred24_InternalBug304681TestLanguage
    public final void synpred24_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4493:4: ( ({...}? => ( ( ( rule__Object__Group_5_2__0 ) ) ) ) )
        // InternalBug304681TestLanguage.g:4493:4: ({...}? => ( ( ( rule__Object__Group_5_2__0 ) ) ) )
        {
        // InternalBug304681TestLanguage.g:4493:4: ({...}? => ( ( ( rule__Object__Group_5_2__0 ) ) ) )
        // InternalBug304681TestLanguage.g:4494:5: {...}? => ( ( ( rule__Object__Group_5_2__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred24_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 2)");
        }
        // InternalBug304681TestLanguage.g:4494:103: ( ( ( rule__Object__Group_5_2__0 ) ) )
        // InternalBug304681TestLanguage.g:4495:6: ( ( rule__Object__Group_5_2__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 2);
        // InternalBug304681TestLanguage.g:4501:6: ( ( rule__Object__Group_5_2__0 ) )
        // InternalBug304681TestLanguage.g:4503:7: ( rule__Object__Group_5_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getObjectAccess().getGroup_5_2()); 
        }
        // InternalBug304681TestLanguage.g:4504:7: ( rule__Object__Group_5_2__0 )
        // InternalBug304681TestLanguage.g:4504:8: rule__Object__Group_5_2__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object__Group_5_2__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalBug304681TestLanguage

    // $ANTLR start synpred25_InternalBug304681TestLanguage
    public final void synpred25_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4510:4: ( ({...}? => ( ( ( rule__Object__Group_5_3__0 ) ) ) ) )
        // InternalBug304681TestLanguage.g:4510:4: ({...}? => ( ( ( rule__Object__Group_5_3__0 ) ) ) )
        {
        // InternalBug304681TestLanguage.g:4510:4: ({...}? => ( ( ( rule__Object__Group_5_3__0 ) ) ) )
        // InternalBug304681TestLanguage.g:4511:5: {...}? => ( ( ( rule__Object__Group_5_3__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred25_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 3)");
        }
        // InternalBug304681TestLanguage.g:4511:103: ( ( ( rule__Object__Group_5_3__0 ) ) )
        // InternalBug304681TestLanguage.g:4512:6: ( ( rule__Object__Group_5_3__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 3);
        // InternalBug304681TestLanguage.g:4518:6: ( ( rule__Object__Group_5_3__0 ) )
        // InternalBug304681TestLanguage.g:4520:7: ( rule__Object__Group_5_3__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getObjectAccess().getGroup_5_3()); 
        }
        // InternalBug304681TestLanguage.g:4521:7: ( rule__Object__Group_5_3__0 )
        // InternalBug304681TestLanguage.g:4521:8: rule__Object__Group_5_3__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object__Group_5_3__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalBug304681TestLanguage

    // $ANTLR start synpred26_InternalBug304681TestLanguage
    public final void synpred26_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4543:8: ( rule__Object__FeaturesAssignment_5_4 )
        // InternalBug304681TestLanguage.g:4543:9: rule__Object__FeaturesAssignment_5_4
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object__FeaturesAssignment_5_4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalBug304681TestLanguage

    // $ANTLR start synpred27_InternalBug304681TestLanguage
    public final void synpred27_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4527:4: ( ({...}? => ( ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) ) ) ) )
        // InternalBug304681TestLanguage.g:4527:4: ({...}? => ( ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) ) ) )
        {
        // InternalBug304681TestLanguage.g:4527:4: ({...}? => ( ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) ) ) )
        // InternalBug304681TestLanguage.g:4528:5: {...}? => ( ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred27_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4)");
        }
        // InternalBug304681TestLanguage.g:4528:103: ( ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) ) )
        // InternalBug304681TestLanguage.g:4529:6: ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4);
        // InternalBug304681TestLanguage.g:4535:6: ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) )
        // InternalBug304681TestLanguage.g:4536:6: ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* )
        {
        // InternalBug304681TestLanguage.g:4536:6: ( ( rule__Object__FeaturesAssignment_5_4 ) )
        // InternalBug304681TestLanguage.g:4537:7: ( rule__Object__FeaturesAssignment_5_4 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getObjectAccess().getFeaturesAssignment_5_4()); 
        }
        // InternalBug304681TestLanguage.g:4538:7: ( rule__Object__FeaturesAssignment_5_4 )
        // InternalBug304681TestLanguage.g:4538:8: rule__Object__FeaturesAssignment_5_4
        {
        pushFollow(FollowSets000.FOLLOW_14);
        rule__Object__FeaturesAssignment_5_4();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalBug304681TestLanguage.g:4541:6: ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* )
        // InternalBug304681TestLanguage.g:4542:7: ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )*
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getObjectAccess().getFeaturesAssignment_5_4()); 
        }
        // InternalBug304681TestLanguage.g:4543:7: ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )*
        loop53:
        do {
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==26) && (synpred26_InternalBug304681TestLanguage())) {
                alt53=1;
            }
            else if ( (LA53_0==27) && (synpred26_InternalBug304681TestLanguage())) {
                alt53=1;
            }


            switch (alt53) {
        	case 1 :
        	    // InternalBug304681TestLanguage.g:4543:8: ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4
        	    {
        	    pushFollow(FollowSets000.FOLLOW_14);
        	    rule__Object__FeaturesAssignment_5_4();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop53;
            }
        } while (true);


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalBug304681TestLanguage

    // $ANTLR start synpred28_InternalBug304681TestLanguage
    public final void synpred28_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4549:4: ( ({...}? => ( ( ( rule__Object__Group_5_5__0 ) ) ) ) )
        // InternalBug304681TestLanguage.g:4549:4: ({...}? => ( ( ( rule__Object__Group_5_5__0 ) ) ) )
        {
        // InternalBug304681TestLanguage.g:4549:4: ({...}? => ( ( ( rule__Object__Group_5_5__0 ) ) ) )
        // InternalBug304681TestLanguage.g:4550:5: {...}? => ( ( ( rule__Object__Group_5_5__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 5) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred28_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 5)");
        }
        // InternalBug304681TestLanguage.g:4550:103: ( ( ( rule__Object__Group_5_5__0 ) ) )
        // InternalBug304681TestLanguage.g:4551:6: ( ( rule__Object__Group_5_5__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 5);
        // InternalBug304681TestLanguage.g:4557:6: ( ( rule__Object__Group_5_5__0 ) )
        // InternalBug304681TestLanguage.g:4559:7: ( rule__Object__Group_5_5__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getObjectAccess().getGroup_5_5()); 
        }
        // InternalBug304681TestLanguage.g:4560:7: ( rule__Object__Group_5_5__0 )
        // InternalBug304681TestLanguage.g:4560:8: rule__Object__Group_5_5__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object__Group_5_5__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred28_InternalBug304681TestLanguage

    // $ANTLR start synpred29_InternalBug304681TestLanguage
    public final void synpred29_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4566:4: ( ({...}? => ( ( ( rule__Object__Group_5_6__0 ) ) ) ) )
        // InternalBug304681TestLanguage.g:4566:4: ({...}? => ( ( ( rule__Object__Group_5_6__0 ) ) ) )
        {
        // InternalBug304681TestLanguage.g:4566:4: ({...}? => ( ( ( rule__Object__Group_5_6__0 ) ) ) )
        // InternalBug304681TestLanguage.g:4567:5: {...}? => ( ( ( rule__Object__Group_5_6__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 6) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred29_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 6)");
        }
        // InternalBug304681TestLanguage.g:4567:103: ( ( ( rule__Object__Group_5_6__0 ) ) )
        // InternalBug304681TestLanguage.g:4568:6: ( ( rule__Object__Group_5_6__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 6);
        // InternalBug304681TestLanguage.g:4574:6: ( ( rule__Object__Group_5_6__0 ) )
        // InternalBug304681TestLanguage.g:4576:7: ( rule__Object__Group_5_6__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getObjectAccess().getGroup_5_6()); 
        }
        // InternalBug304681TestLanguage.g:4577:7: ( rule__Object__Group_5_6__0 )
        // InternalBug304681TestLanguage.g:4577:8: rule__Object__Group_5_6__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object__Group_5_6__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred29_InternalBug304681TestLanguage

    // $ANTLR start synpred30_InternalBug304681TestLanguage
    public final void synpred30_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4615:2: ( rule__Object__UnorderedGroup_5__1 )
        // InternalBug304681TestLanguage.g:4615:2: rule__Object__UnorderedGroup_5__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object__UnorderedGroup_5__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalBug304681TestLanguage

    // $ANTLR start synpred31_InternalBug304681TestLanguage
    public final void synpred31_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4628:2: ( rule__Object__UnorderedGroup_5__2 )
        // InternalBug304681TestLanguage.g:4628:2: rule__Object__UnorderedGroup_5__2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object__UnorderedGroup_5__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalBug304681TestLanguage

    // $ANTLR start synpred32_InternalBug304681TestLanguage
    public final void synpred32_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4641:2: ( rule__Object__UnorderedGroup_5__3 )
        // InternalBug304681TestLanguage.g:4641:2: rule__Object__UnorderedGroup_5__3
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object__UnorderedGroup_5__3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalBug304681TestLanguage

    // $ANTLR start synpred33_InternalBug304681TestLanguage
    public final void synpred33_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4654:2: ( rule__Object__UnorderedGroup_5__4 )
        // InternalBug304681TestLanguage.g:4654:2: rule__Object__UnorderedGroup_5__4
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object__UnorderedGroup_5__4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalBug304681TestLanguage

    // $ANTLR start synpred34_InternalBug304681TestLanguage
    public final void synpred34_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4667:2: ( rule__Object__UnorderedGroup_5__5 )
        // InternalBug304681TestLanguage.g:4667:2: rule__Object__UnorderedGroup_5__5
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object__UnorderedGroup_5__5();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalBug304681TestLanguage

    // $ANTLR start synpred35_InternalBug304681TestLanguage
    public final void synpred35_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4680:2: ( rule__Object__UnorderedGroup_5__6 )
        // InternalBug304681TestLanguage.g:4680:2: rule__Object__UnorderedGroup_5__6
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object__UnorderedGroup_5__6();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalBug304681TestLanguage

    // $ANTLR start synpred36_InternalBug304681TestLanguage
    public final void synpred36_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4693:2: ( rule__Object__UnorderedGroup_5__7 )
        // InternalBug304681TestLanguage.g:4693:2: rule__Object__UnorderedGroup_5__7
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object__UnorderedGroup_5__7();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalBug304681TestLanguage

    // $ANTLR start synpred37_InternalBug304681TestLanguage
    public final void synpred37_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4734:2: ( rule__Reference__UnorderedGroup_4_0_1__0 )
        // InternalBug304681TestLanguage.g:4734:2: rule__Reference__UnorderedGroup_4_0_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Reference__UnorderedGroup_4_0_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalBug304681TestLanguage

    // $ANTLR start synpred38_InternalBug304681TestLanguage
    public final void synpred38_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4752:4: ( ({...}? => ( ( ( rule__Reference__Group_4_0_1_0__0 ) ) ) ) )
        // InternalBug304681TestLanguage.g:4752:4: ({...}? => ( ( ( rule__Reference__Group_4_0_1_0__0 ) ) ) )
        {
        // InternalBug304681TestLanguage.g:4752:4: ({...}? => ( ( ( rule__Reference__Group_4_0_1_0__0 ) ) ) )
        // InternalBug304681TestLanguage.g:4753:5: {...}? => ( ( ( rule__Reference__Group_4_0_1_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred38_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 0)");
        }
        // InternalBug304681TestLanguage.g:4753:110: ( ( ( rule__Reference__Group_4_0_1_0__0 ) ) )
        // InternalBug304681TestLanguage.g:4754:6: ( ( rule__Reference__Group_4_0_1_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getReferenceAccess().getUnorderedGroup_4_0_1(), 0);
        // InternalBug304681TestLanguage.g:4760:6: ( ( rule__Reference__Group_4_0_1_0__0 ) )
        // InternalBug304681TestLanguage.g:4762:7: ( rule__Reference__Group_4_0_1_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getReferenceAccess().getGroup_4_0_1_0()); 
        }
        // InternalBug304681TestLanguage.g:4763:7: ( rule__Reference__Group_4_0_1_0__0 )
        // InternalBug304681TestLanguage.g:4763:8: rule__Reference__Group_4_0_1_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Reference__Group_4_0_1_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred38_InternalBug304681TestLanguage

    // $ANTLR start synpred39_InternalBug304681TestLanguage
    public final void synpred39_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4801:2: ( rule__Reference__UnorderedGroup_4_0_1__1 )
        // InternalBug304681TestLanguage.g:4801:2: rule__Reference__UnorderedGroup_4_0_1__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Reference__UnorderedGroup_4_0_1__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalBug304681TestLanguage

    // $ANTLR start synpred40_InternalBug304681TestLanguage
    public final void synpred40_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4830:2: ( rule__Object2__UnorderedGroup_5__0 )
        // InternalBug304681TestLanguage.g:4830:2: rule__Object2__UnorderedGroup_5__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object2__UnorderedGroup_5__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalBug304681TestLanguage

    // $ANTLR start synpred41_InternalBug304681TestLanguage
    public final void synpred41_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4848:4: ( ({...}? => ( ( ( rule__Object2__Group_5_0__0 ) ) ) ) )
        // InternalBug304681TestLanguage.g:4848:4: ({...}? => ( ( ( rule__Object2__Group_5_0__0 ) ) ) )
        {
        // InternalBug304681TestLanguage.g:4848:4: ({...}? => ( ( ( rule__Object2__Group_5_0__0 ) ) ) )
        // InternalBug304681TestLanguage.g:4849:5: {...}? => ( ( ( rule__Object2__Group_5_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred41_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 0)");
        }
        // InternalBug304681TestLanguage.g:4849:104: ( ( ( rule__Object2__Group_5_0__0 ) ) )
        // InternalBug304681TestLanguage.g:4850:6: ( ( rule__Object2__Group_5_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getObject2Access().getUnorderedGroup_5(), 0);
        // InternalBug304681TestLanguage.g:4856:6: ( ( rule__Object2__Group_5_0__0 ) )
        // InternalBug304681TestLanguage.g:4858:7: ( rule__Object2__Group_5_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getObject2Access().getGroup_5_0()); 
        }
        // InternalBug304681TestLanguage.g:4859:7: ( rule__Object2__Group_5_0__0 )
        // InternalBug304681TestLanguage.g:4859:8: rule__Object2__Group_5_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object2__Group_5_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred41_InternalBug304681TestLanguage

    // $ANTLR start synpred42_InternalBug304681TestLanguage
    public final void synpred42_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4865:4: ( ({...}? => ( ( ( rule__Object2__Group_5_1__0 ) ) ) ) )
        // InternalBug304681TestLanguage.g:4865:4: ({...}? => ( ( ( rule__Object2__Group_5_1__0 ) ) ) )
        {
        // InternalBug304681TestLanguage.g:4865:4: ({...}? => ( ( ( rule__Object2__Group_5_1__0 ) ) ) )
        // InternalBug304681TestLanguage.g:4866:5: {...}? => ( ( ( rule__Object2__Group_5_1__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred42_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 1)");
        }
        // InternalBug304681TestLanguage.g:4866:104: ( ( ( rule__Object2__Group_5_1__0 ) ) )
        // InternalBug304681TestLanguage.g:4867:6: ( ( rule__Object2__Group_5_1__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getObject2Access().getUnorderedGroup_5(), 1);
        // InternalBug304681TestLanguage.g:4873:6: ( ( rule__Object2__Group_5_1__0 ) )
        // InternalBug304681TestLanguage.g:4875:7: ( rule__Object2__Group_5_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getObject2Access().getGroup_5_1()); 
        }
        // InternalBug304681TestLanguage.g:4876:7: ( rule__Object2__Group_5_1__0 )
        // InternalBug304681TestLanguage.g:4876:8: rule__Object2__Group_5_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object2__Group_5_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred42_InternalBug304681TestLanguage

    // $ANTLR start synpred43_InternalBug304681TestLanguage
    public final void synpred43_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4882:4: ( ({...}? => ( ( ( rule__Object2__Group_5_2__0 ) ) ) ) )
        // InternalBug304681TestLanguage.g:4882:4: ({...}? => ( ( ( rule__Object2__Group_5_2__0 ) ) ) )
        {
        // InternalBug304681TestLanguage.g:4882:4: ({...}? => ( ( ( rule__Object2__Group_5_2__0 ) ) ) )
        // InternalBug304681TestLanguage.g:4883:5: {...}? => ( ( ( rule__Object2__Group_5_2__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred43_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 2)");
        }
        // InternalBug304681TestLanguage.g:4883:104: ( ( ( rule__Object2__Group_5_2__0 ) ) )
        // InternalBug304681TestLanguage.g:4884:6: ( ( rule__Object2__Group_5_2__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getObject2Access().getUnorderedGroup_5(), 2);
        // InternalBug304681TestLanguage.g:4890:6: ( ( rule__Object2__Group_5_2__0 ) )
        // InternalBug304681TestLanguage.g:4892:7: ( rule__Object2__Group_5_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getObject2Access().getGroup_5_2()); 
        }
        // InternalBug304681TestLanguage.g:4893:7: ( rule__Object2__Group_5_2__0 )
        // InternalBug304681TestLanguage.g:4893:8: rule__Object2__Group_5_2__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object2__Group_5_2__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred43_InternalBug304681TestLanguage

    // $ANTLR start synpred44_InternalBug304681TestLanguage
    public final void synpred44_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4899:4: ( ({...}? => ( ( ( rule__Object2__Group_5_3__0 ) ) ) ) )
        // InternalBug304681TestLanguage.g:4899:4: ({...}? => ( ( ( rule__Object2__Group_5_3__0 ) ) ) )
        {
        // InternalBug304681TestLanguage.g:4899:4: ({...}? => ( ( ( rule__Object2__Group_5_3__0 ) ) ) )
        // InternalBug304681TestLanguage.g:4900:5: {...}? => ( ( ( rule__Object2__Group_5_3__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred44_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getObject2Access().getUnorderedGroup_5(), 3)");
        }
        // InternalBug304681TestLanguage.g:4900:104: ( ( ( rule__Object2__Group_5_3__0 ) ) )
        // InternalBug304681TestLanguage.g:4901:6: ( ( rule__Object2__Group_5_3__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getObject2Access().getUnorderedGroup_5(), 3);
        // InternalBug304681TestLanguage.g:4907:6: ( ( rule__Object2__Group_5_3__0 ) )
        // InternalBug304681TestLanguage.g:4909:7: ( rule__Object2__Group_5_3__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getObject2Access().getGroup_5_3()); 
        }
        // InternalBug304681TestLanguage.g:4910:7: ( rule__Object2__Group_5_3__0 )
        // InternalBug304681TestLanguage.g:4910:8: rule__Object2__Group_5_3__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object2__Group_5_3__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred44_InternalBug304681TestLanguage

    // $ANTLR start synpred45_InternalBug304681TestLanguage
    public final void synpred45_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4932:8: ( rule__Object2__FeaturesAssignment_5_4 )
        // InternalBug304681TestLanguage.g:4932:9: rule__Object2__FeaturesAssignment_5_4
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object2__FeaturesAssignment_5_4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalBug304681TestLanguage

    // $ANTLR start synpred46_InternalBug304681TestLanguage
    public final void synpred46_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4953:2: ( rule__Object2__UnorderedGroup_5__1 )
        // InternalBug304681TestLanguage.g:4953:2: rule__Object2__UnorderedGroup_5__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object2__UnorderedGroup_5__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalBug304681TestLanguage

    // $ANTLR start synpred47_InternalBug304681TestLanguage
    public final void synpred47_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4966:2: ( rule__Object2__UnorderedGroup_5__2 )
        // InternalBug304681TestLanguage.g:4966:2: rule__Object2__UnorderedGroup_5__2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object2__UnorderedGroup_5__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalBug304681TestLanguage

    // $ANTLR start synpred48_InternalBug304681TestLanguage
    public final void synpred48_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4979:2: ( rule__Object2__UnorderedGroup_5__3 )
        // InternalBug304681TestLanguage.g:4979:2: rule__Object2__UnorderedGroup_5__3
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object2__UnorderedGroup_5__3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalBug304681TestLanguage

    // $ANTLR start synpred49_InternalBug304681TestLanguage
    public final void synpred49_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:4992:2: ( rule__Object2__UnorderedGroup_5__4 )
        // InternalBug304681TestLanguage.g:4992:2: rule__Object2__UnorderedGroup_5__4
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Object2__UnorderedGroup_5__4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalBug304681TestLanguage

    // $ANTLR start synpred50_InternalBug304681TestLanguage
    public final void synpred50_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:5027:2: ( rule__Attribute2__UnorderedGroup_3_0_1__0 )
        // InternalBug304681TestLanguage.g:5027:2: rule__Attribute2__UnorderedGroup_3_0_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Attribute2__UnorderedGroup_3_0_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalBug304681TestLanguage

    // $ANTLR start synpred51_InternalBug304681TestLanguage
    public final void synpred51_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:5045:4: ( ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_0__0 ) ) ) ) )
        // InternalBug304681TestLanguage.g:5045:4: ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_0__0 ) ) ) )
        {
        // InternalBug304681TestLanguage.g:5045:4: ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_0__0 ) ) ) )
        // InternalBug304681TestLanguage.g:5046:5: {...}? => ( ( ( rule__Attribute2__Group_3_0_1_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred51_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 0)");
        }
        // InternalBug304681TestLanguage.g:5046:111: ( ( ( rule__Attribute2__Group_3_0_1_0__0 ) ) )
        // InternalBug304681TestLanguage.g:5047:6: ( ( rule__Attribute2__Group_3_0_1_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 0);
        // InternalBug304681TestLanguage.g:5053:6: ( ( rule__Attribute2__Group_3_0_1_0__0 ) )
        // InternalBug304681TestLanguage.g:5055:7: ( rule__Attribute2__Group_3_0_1_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAttribute2Access().getGroup_3_0_1_0()); 
        }
        // InternalBug304681TestLanguage.g:5056:7: ( rule__Attribute2__Group_3_0_1_0__0 )
        // InternalBug304681TestLanguage.g:5056:8: rule__Attribute2__Group_3_0_1_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Attribute2__Group_3_0_1_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred51_InternalBug304681TestLanguage

    // $ANTLR start synpred52_InternalBug304681TestLanguage
    public final void synpred52_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:5062:4: ( ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_1__0 ) ) ) ) )
        // InternalBug304681TestLanguage.g:5062:4: ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_1__0 ) ) ) )
        {
        // InternalBug304681TestLanguage.g:5062:4: ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_1__0 ) ) ) )
        // InternalBug304681TestLanguage.g:5063:5: {...}? => ( ( ( rule__Attribute2__Group_3_0_1_1__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred52_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 1)");
        }
        // InternalBug304681TestLanguage.g:5063:111: ( ( ( rule__Attribute2__Group_3_0_1_1__0 ) ) )
        // InternalBug304681TestLanguage.g:5064:6: ( ( rule__Attribute2__Group_3_0_1_1__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 1);
        // InternalBug304681TestLanguage.g:5070:6: ( ( rule__Attribute2__Group_3_0_1_1__0 ) )
        // InternalBug304681TestLanguage.g:5072:7: ( rule__Attribute2__Group_3_0_1_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAttribute2Access().getGroup_3_0_1_1()); 
        }
        // InternalBug304681TestLanguage.g:5073:7: ( rule__Attribute2__Group_3_0_1_1__0 )
        // InternalBug304681TestLanguage.g:5073:8: rule__Attribute2__Group_3_0_1_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Attribute2__Group_3_0_1_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred52_InternalBug304681TestLanguage

    // $ANTLR start synpred53_InternalBug304681TestLanguage
    public final void synpred53_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:5095:8: ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )
        // InternalBug304681TestLanguage.g:5095:9: rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalBug304681TestLanguage

    // $ANTLR start synpred54_InternalBug304681TestLanguage
    public final void synpred54_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:5079:4: ( ({...}? => ( ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* ) ) ) ) )
        // InternalBug304681TestLanguage.g:5079:4: ({...}? => ( ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* ) ) ) )
        {
        // InternalBug304681TestLanguage.g:5079:4: ({...}? => ( ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* ) ) ) )
        // InternalBug304681TestLanguage.g:5080:5: {...}? => ( ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred54_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 2)");
        }
        // InternalBug304681TestLanguage.g:5080:111: ( ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* ) ) )
        // InternalBug304681TestLanguage.g:5081:6: ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 2);
        // InternalBug304681TestLanguage.g:5087:6: ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* ) )
        // InternalBug304681TestLanguage.g:5088:6: ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) ) ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* )
        {
        // InternalBug304681TestLanguage.g:5088:6: ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 ) )
        // InternalBug304681TestLanguage.g:5089:7: ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAttribute2Access().getConstraintDefinitionsAssignment_3_0_1_2()); 
        }
        // InternalBug304681TestLanguage.g:5090:7: ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )
        // InternalBug304681TestLanguage.g:5090:8: rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2
        {
        pushFollow(FollowSets000.FOLLOW_28);
        rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalBug304681TestLanguage.g:5093:6: ( ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )* )
        // InternalBug304681TestLanguage.g:5094:7: ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )*
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAttribute2Access().getConstraintDefinitionsAssignment_3_0_1_2()); 
        }
        // InternalBug304681TestLanguage.g:5095:7: ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )*
        loop54:
        do {
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==28) && (synpred53_InternalBug304681TestLanguage())) {
                alt54=1;
            }


            switch (alt54) {
        	case 1 :
        	    // InternalBug304681TestLanguage.g:5095:8: ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2
        	    {
        	    pushFollow(FollowSets000.FOLLOW_28);
        	    rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop54;
            }
        } while (true);


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred54_InternalBug304681TestLanguage

    // $ANTLR start synpred55_InternalBug304681TestLanguage
    public final void synpred55_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:5101:4: ( ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_3__0 ) ) ) ) )
        // InternalBug304681TestLanguage.g:5101:4: ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_3__0 ) ) ) )
        {
        // InternalBug304681TestLanguage.g:5101:4: ({...}? => ( ( ( rule__Attribute2__Group_3_0_1_3__0 ) ) ) )
        // InternalBug304681TestLanguage.g:5102:5: {...}? => ( ( ( rule__Attribute2__Group_3_0_1_3__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred55_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 3)");
        }
        // InternalBug304681TestLanguage.g:5102:111: ( ( ( rule__Attribute2__Group_3_0_1_3__0 ) ) )
        // InternalBug304681TestLanguage.g:5103:6: ( ( rule__Attribute2__Group_3_0_1_3__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getAttribute2Access().getUnorderedGroup_3_0_1(), 3);
        // InternalBug304681TestLanguage.g:5109:6: ( ( rule__Attribute2__Group_3_0_1_3__0 ) )
        // InternalBug304681TestLanguage.g:5111:7: ( rule__Attribute2__Group_3_0_1_3__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAttribute2Access().getGroup_3_0_1_3()); 
        }
        // InternalBug304681TestLanguage.g:5112:7: ( rule__Attribute2__Group_3_0_1_3__0 )
        // InternalBug304681TestLanguage.g:5112:8: rule__Attribute2__Group_3_0_1_3__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Attribute2__Group_3_0_1_3__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred55_InternalBug304681TestLanguage

    // $ANTLR start synpred56_InternalBug304681TestLanguage
    public final void synpred56_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:5150:2: ( rule__Attribute2__UnorderedGroup_3_0_1__1 )
        // InternalBug304681TestLanguage.g:5150:2: rule__Attribute2__UnorderedGroup_3_0_1__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Attribute2__UnorderedGroup_3_0_1__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalBug304681TestLanguage

    // $ANTLR start synpred57_InternalBug304681TestLanguage
    public final void synpred57_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:5163:2: ( rule__Attribute2__UnorderedGroup_3_0_1__2 )
        // InternalBug304681TestLanguage.g:5163:2: rule__Attribute2__UnorderedGroup_3_0_1__2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Attribute2__UnorderedGroup_3_0_1__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalBug304681TestLanguage

    // $ANTLR start synpred58_InternalBug304681TestLanguage
    public final void synpred58_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:5176:2: ( rule__Attribute2__UnorderedGroup_3_0_1__3 )
        // InternalBug304681TestLanguage.g:5176:2: rule__Attribute2__UnorderedGroup_3_0_1__3
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Attribute2__UnorderedGroup_3_0_1__3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalBug304681TestLanguage

    // $ANTLR start synpred59_InternalBug304681TestLanguage
    public final void synpred59_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:5189:2: ( rule__Attribute2__UnorderedGroup_3_0_1__4 )
        // InternalBug304681TestLanguage.g:5189:2: rule__Attribute2__UnorderedGroup_3_0_1__4
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Attribute2__UnorderedGroup_3_0_1__4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalBug304681TestLanguage

    // $ANTLR start synpred60_InternalBug304681TestLanguage
    public final void synpred60_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:5224:2: ( rule__Reference2__UnorderedGroup_4_0_1__0 )
        // InternalBug304681TestLanguage.g:5224:2: rule__Reference2__UnorderedGroup_4_0_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Reference2__UnorderedGroup_4_0_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalBug304681TestLanguage

    // $ANTLR start synpred61_InternalBug304681TestLanguage
    public final void synpred61_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:5242:4: ( ({...}? => ( ( ( rule__Reference2__Group_4_0_1_0__0 ) ) ) ) )
        // InternalBug304681TestLanguage.g:5242:4: ({...}? => ( ( ( rule__Reference2__Group_4_0_1_0__0 ) ) ) )
        {
        // InternalBug304681TestLanguage.g:5242:4: ({...}? => ( ( ( rule__Reference2__Group_4_0_1_0__0 ) ) ) )
        // InternalBug304681TestLanguage.g:5243:5: {...}? => ( ( ( rule__Reference2__Group_4_0_1_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred61_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 0)");
        }
        // InternalBug304681TestLanguage.g:5243:111: ( ( ( rule__Reference2__Group_4_0_1_0__0 ) ) )
        // InternalBug304681TestLanguage.g:5244:6: ( ( rule__Reference2__Group_4_0_1_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getReference2Access().getUnorderedGroup_4_0_1(), 0);
        // InternalBug304681TestLanguage.g:5250:6: ( ( rule__Reference2__Group_4_0_1_0__0 ) )
        // InternalBug304681TestLanguage.g:5252:7: ( rule__Reference2__Group_4_0_1_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getReference2Access().getGroup_4_0_1_0()); 
        }
        // InternalBug304681TestLanguage.g:5253:7: ( rule__Reference2__Group_4_0_1_0__0 )
        // InternalBug304681TestLanguage.g:5253:8: rule__Reference2__Group_4_0_1_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Reference2__Group_4_0_1_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred61_InternalBug304681TestLanguage

    // $ANTLR start synpred62_InternalBug304681TestLanguage
    public final void synpred62_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:5291:2: ( rule__Reference2__UnorderedGroup_4_0_1__1 )
        // InternalBug304681TestLanguage.g:5291:2: rule__Reference2__UnorderedGroup_4_0_1__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Reference2__UnorderedGroup_4_0_1__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalBug304681TestLanguage

    // $ANTLR start synpred63_InternalBug304681TestLanguage
    public final void synpred63_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:5339:4: ( ({...}? => ( ( ( rule__ConstraintDefinition__Group_3_0__0 ) ) ) ) )
        // InternalBug304681TestLanguage.g:5339:4: ({...}? => ( ( ( rule__ConstraintDefinition__Group_3_0__0 ) ) ) )
        {
        // InternalBug304681TestLanguage.g:5339:4: ({...}? => ( ( ( rule__ConstraintDefinition__Group_3_0__0 ) ) ) )
        // InternalBug304681TestLanguage.g:5340:5: {...}? => ( ( ( rule__ConstraintDefinition__Group_3_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred63_InternalBug304681TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalBug304681TestLanguage.g:5340:117: ( ( ( rule__ConstraintDefinition__Group_3_0__0 ) ) )
        // InternalBug304681TestLanguage.g:5341:6: ( ( rule__ConstraintDefinition__Group_3_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getConstraintDefinitionAccess().getUnorderedGroup_3(), 0);
        // InternalBug304681TestLanguage.g:5347:6: ( ( rule__ConstraintDefinition__Group_3_0__0 ) )
        // InternalBug304681TestLanguage.g:5349:7: ( rule__ConstraintDefinition__Group_3_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getConstraintDefinitionAccess().getGroup_3_0()); 
        }
        // InternalBug304681TestLanguage.g:5350:7: ( rule__ConstraintDefinition__Group_3_0__0 )
        // InternalBug304681TestLanguage.g:5350:8: rule__ConstraintDefinition__Group_3_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__ConstraintDefinition__Group_3_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred63_InternalBug304681TestLanguage

    // $ANTLR start synpred64_InternalBug304681TestLanguage
    public final void synpred64_InternalBug304681TestLanguage_fragment() throws RecognitionException {   
        // InternalBug304681TestLanguage.g:5388:2: ( rule__ConstraintDefinition__UnorderedGroup_3__1 )
        // InternalBug304681TestLanguage.g:5388:2: rule__ConstraintDefinition__UnorderedGroup_3__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__ConstraintDefinition__UnorderedGroup_3__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalBug304681TestLanguage

    // Delegated rules

    public final boolean synpred27_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalBug304681TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalBug304681TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\1\31\uffff";
    static final String dfa_3s = "\1\21\1\uffff\4\4\1\13\1\4\1\13\1\0\1\21\1\0\1\uffff\2\5\1\0\2\13\2\21\2\5\2\13\2\21";
    static final String dfa_4s = "\1\41\1\uffff\3\4\1\42\1\13\1\4\1\20\1\0\1\24\1\0\1\uffff\2\5\1\0\2\13\2\24\2\5\2\13\2\21";
    static final String dfa_5s = "\1\uffff\1\2\12\uffff\1\1\15\uffff";
    static final String dfa_6s = "\11\uffff\1\0\1\uffff\1\1\3\uffff\1\2\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\4\1\1\uffff\2\1\1\2\1\3\5\uffff\1\1",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\10\35\uffff\1\7",
            "\1\11",
            "\1\10",
            "\1\13\4\uffff\1\12",
            "\1\uffff",
            "\1\17\1\uffff\1\15\1\16",
            "\1\uffff",
            "",
            "\1\20",
            "\1\21",
            "\1\uffff",
            "\1\22",
            "\1\23",
            "\1\17\1\uffff\1\24\1\25",
            "\1\17\1\uffff\1\24\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\17",
            "\1\17"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1648:1: ( rule__Object__FeaturesAssignment_5_6_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_9 = input.LA(1);

                         
                        int index13_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalBug304681TestLanguage()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_11 = input.LA(1);

                         
                        int index13_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalBug304681TestLanguage()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_15 = input.LA(1);

                         
                        int index13_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalBug304681TestLanguage()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\11\uffff\1\2\1\uffff\1\0\3\uffff\1\1\12\uffff}>";
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_8;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1717:1: ( rule__Object__FeaturesAssignment_5_7_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_11 = input.LA(1);

                         
                        int index14_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalBug304681TestLanguage()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_15 = input.LA(1);

                         
                        int index14_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalBug304681TestLanguage()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_9 = input.LA(1);

                         
                        int index14_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalBug304681TestLanguage()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_9s = "\13\uffff";
    static final String dfa_10s = "\1\21\12\uffff";
    static final String dfa_11s = "\1\41\12\uffff";
    static final String dfa_12s = "\1\uffff\11\1\1\2";
    static final String dfa_13s = "\1\0\12\uffff}>";
    static final String[] dfa_14s = {
            "\1\12\1\uffff\1\1\1\2\1\3\1\7\1\uffff\1\10\1\11\1\5\1\6\5\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_9;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4441:2: ( rule__Object__UnorderedGroup_5__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                         
                        int index21_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA21_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA21_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA21_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA21_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( LA21_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA21_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( LA21_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                        else if ( LA21_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 6) ) {s = 8;}

                        else if ( LA21_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 7) ) {s = 9;}

                        else if ( (LA21_0==17) ) {s = 10;}

                         
                        input.seek(index21_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\12\uffff";
    static final String dfa_16s = "\1\23\11\uffff";
    static final String dfa_17s = "\1\41\11\uffff";
    static final String dfa_18s = "\1\uffff\1\1\1\2\1\3\1\4\2\5\1\6\1\7\1\10";
    static final String dfa_19s = "\1\0\11\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\1\2\1\3\1\7\1\uffff\1\10\1\11\1\5\1\6\5\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "4457:3: ( ({...}? => ( ( ( rule__Object__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_3__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Object__FeaturesAssignment_5_4 ) ) ( ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )* ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_5_7__0 ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA23_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA23_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA23_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA23_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( LA23_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA23_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( LA23_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                        else if ( LA23_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 6) ) {s = 8;}

                        else if ( LA23_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 7) ) {s = 9;}

                         
                        input.seek(index23_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\11\uffff\1\2\1\uffff\1\1\3\uffff\1\0\12\uffff}>";
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_21;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 4543:7: ( ( rule__Object__FeaturesAssignment_5_4 )=> rule__Object__FeaturesAssignment_5_4 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_15 = input.LA(1);

                         
                        int index22_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalBug304681TestLanguage()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_15);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_11 = input.LA(1);

                         
                        int index22_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalBug304681TestLanguage()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_9 = input.LA(1);

                         
                        int index22_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalBug304681TestLanguage()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_22s = "\1\12\12\uffff";
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_9;
            this.eof = dfa_22;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4615:2: ( rule__Object__UnorderedGroup_5__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_0 = input.LA(1);

                         
                        int index24_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA24_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA24_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA24_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA24_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( LA24_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA24_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( LA24_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                        else if ( LA24_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 6) ) {s = 8;}

                        else if ( LA24_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 7) ) {s = 9;}

                        else if ( (LA24_0==EOF||LA24_0==17) ) {s = 10;}

                         
                        input.seek(index24_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_9;
            this.eof = dfa_22;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4628:2: ( rule__Object__UnorderedGroup_5__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_0 = input.LA(1);

                         
                        int index25_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA25_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA25_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA25_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA25_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( LA25_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA25_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( LA25_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                        else if ( LA25_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 6) ) {s = 8;}

                        else if ( LA25_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 7) ) {s = 9;}

                        else if ( (LA25_0==EOF||LA25_0==17) ) {s = 10;}

                         
                        input.seek(index25_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_9;
            this.eof = dfa_22;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4641:2: ( rule__Object__UnorderedGroup_5__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA26_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA26_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA26_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA26_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( LA26_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA26_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( LA26_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                        else if ( LA26_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 6) ) {s = 8;}

                        else if ( LA26_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 7) ) {s = 9;}

                        else if ( (LA26_0==EOF||LA26_0==17) ) {s = 10;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_9;
            this.eof = dfa_22;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4654:2: ( rule__Object__UnorderedGroup_5__4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA27_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA27_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA27_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA27_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( LA27_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA27_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( LA27_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                        else if ( LA27_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 6) ) {s = 8;}

                        else if ( LA27_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 7) ) {s = 9;}

                        else if ( (LA27_0==EOF||LA27_0==17) ) {s = 10;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_9;
            this.eof = dfa_22;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4667:2: ( rule__Object__UnorderedGroup_5__5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_0 = input.LA(1);

                         
                        int index28_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA28_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA28_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA28_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA28_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( LA28_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA28_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( LA28_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                        else if ( LA28_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 6) ) {s = 8;}

                        else if ( LA28_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 7) ) {s = 9;}

                        else if ( (LA28_0==EOF||LA28_0==17) ) {s = 10;}

                         
                        input.seek(index28_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_9;
            this.eof = dfa_22;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4680:2: ( rule__Object__UnorderedGroup_5__6 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_0 = input.LA(1);

                         
                        int index29_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA29_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA29_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA29_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA29_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( LA29_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA29_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( LA29_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                        else if ( LA29_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 6) ) {s = 8;}

                        else if ( LA29_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 7) ) {s = 9;}

                        else if ( (LA29_0==EOF||LA29_0==17) ) {s = 10;}

                         
                        input.seek(index29_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_9;
            this.eof = dfa_22;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4693:2: ( rule__Object__UnorderedGroup_5__7 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA30_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA30_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA30_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA30_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( LA30_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA30_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( LA30_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                        else if ( LA30_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 6) ) {s = 8;}

                        else if ( LA30_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup_5(), 7) ) {s = 9;}

                        else if ( (LA30_0==EOF||LA30_0==17) ) {s = 10;}

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_23s = "\u01fa\uffff";
    static final String dfa_24s = "\1\1\u01f9\uffff";
    static final String dfa_25s = "\1\21\1\uffff\4\4\1\13\1\4\1\13\1\21\1\0\1\21\1\0\2\5\1\4\2\13\1\0\1\uffff\2\5\1\0\2\13\1\20\2\21\2\13\2\21\1\35\2\5\1\4\2\13\2\21\2\5\2\13\1\20\2\21\3\5\1\21\1\13\2\21\1\35\2\5\1\4\4\13\2\5\2\21\2\5\2\13\1\20\4\21\1\5\1\21\1\13\1\4\1\5\1\21\1\13\2\21\1\35\2\5\1\4\2\13\1\21\1\20\2\5\2\21\2\5\2\13\1\20\2\21\1\35\1\5\1\21\1\13\1\4\1\5\1\21\1\13\2\21\1\35\2\5\1\4\2\13\2\5\1\21\1\20\2\5\2\21\2\5\2\13\1\20\2\21\1\5\1\21\1\13\1\35\1\5\1\21\1\13\1\4\1\5\1\21\1\13\2\21\1\35\2\5\2\21\2\5\1\21\1\20\2\5\2\21\3\5\1\21\1\13\1\4\2\5\2\13\1\5\1\21\1\13\1\35\1\5\1\21\1\13\1\4\1\5\1\21\1\13\1\21\1\20\2\13\2\21\2\5\2\21\2\5\1\21\1\20\2\5\2\21\1\35\2\21\2\5\1\4\2\13\1\5\1\21\1\13\1\4\1\5\1\21\1\13\1\35\1\5\1\21\1\13\1\4\2\5\2\13\1\20\3\21\1\20\2\5\2\21\2\5\1\21\1\20\1\5\1\21\1\13\2\21\1\35\2\5\1\4\2\13\1\35\1\5\1\21\1\13\1\4\1\5\1\21\1\13\1\35\2\5\2\21\2\5\2\13\1\20\2\21\2\5\1\21\1\20\2\5\2\21\3\5\1\21\1\13\1\4\2\5\2\13\1\5\1\21\1\13\2\21\1\35\1\5\1\21\1\13\1\35\1\5\1\21\1\13\1\4\1\5\1\21\1\13\1\21\1\20\2\13\2\21\2\5\2\21\4\5\2\21\2\5\1\21\1\20\2\5\2\21\1\35\2\21\2\5\1\4\2\13\1\5\1\21\1\13\1\5\1\21\1\13\1\5\1\21\1\13\1\4\1\5\1\21\1\13\1\35\1\5\1\21\1\13\2\5\2\13\1\20\3\21\2\5\3\21\1\20\2\5\2\21\2\5\1\21\1\5\1\21\1\13\2\21\1\35\1\5\1\21\1\13\1\35\1\5\1\21\1\13\1\4\1\5\1\21\1\13\2\5\2\21\2\5\1\21\2\5\1\21\1\20\2\5\2\21\1\5\1\21\1\13\1\4\2\5\2\13\1\5\1\21\1\13\1\5\1\21\1\13\1\35\1\5\1\21\1\13\1\21\1\20\2\13\2\21\2\5\2\21\2\5\2\21\2\5\1\21\1\35\2\21\1\5\1\21\1\13\1\5\1\21\1\13\1\4\1\5\1\21\1\13\2\5\2\21\1\20\2\5\2\21\1\5\1\21\1\13\1\35\1\5\1\21\1\13\2\5\2\21\2\5\1\21\1\5\1\21\1\13\1\4\1\5\1\21\1\13\1\21\1\20\2\5\2\21\1\35\1\5\1\21\1\13\2\5\1\21\1\5\1\21\1\13\2\5\2\21\1\5\1\21\1\13\1\21";
    static final String dfa_26s = "\1\41\1\uffff\3\4\1\42\1\20\1\4\1\20\1\44\1\0\1\24\1\0\2\5\1\4\2\13\1\0\1\uffff\2\5\1\0\2\13\1\20\2\44\2\13\2\44\1\36\2\5\1\4\2\13\2\24\1\13\1\5\2\13\1\20\2\44\2\5\1\13\1\36\1\13\2\44\1\36\2\5\1\4\5\13\1\5\1\44\1\36\1\13\1\5\2\13\1\20\2\44\2\21\1\13\1\21\1\13\1\4\1\13\1\36\1\13\2\44\1\36\2\5\1\4\2\13\1\21\1\20\1\13\1\5\1\44\1\36\1\13\1\5\2\13\1\20\2\44\1\36\1\13\1\21\1\13\1\4\1\13\1\36\1\13\2\44\1\36\2\5\1\4\3\13\1\5\1\21\1\20\1\13\1\5\1\44\1\36\1\13\1\5\2\13\1\20\2\21\1\13\1\36\1\13\1\36\1\13\1\21\1\13\1\4\1\13\1\36\1\13\2\21\1\36\1\13\1\5\1\44\1\36\1\13\1\5\1\21\1\20\1\13\1\5\1\44\1\36\1\13\1\5\1\13\1\21\1\13\1\4\2\5\3\13\1\36\1\13\1\36\1\13\1\21\1\13\1\4\1\13\1\36\1\13\1\21\1\20\2\13\2\44\1\13\1\5\1\44\1\36\1\13\1\5\1\21\1\20\1\13\1\5\1\34\2\36\2\44\2\5\1\4\3\13\1\21\1\13\1\4\1\13\1\36\1\13\1\36\1\13\1\21\1\13\1\4\1\13\1\5\2\13\1\20\2\44\1\21\1\20\1\13\1\5\1\44\1\36\1\13\1\5\1\21\1\20\1\13\1\36\1\13\2\44\1\36\2\5\1\4\2\13\1\36\1\13\1\21\1\13\1\4\1\13\1\36\1\13\1\36\1\13\1\5\1\44\1\36\1\13\1\5\2\13\1\20\2\44\1\13\1\5\1\21\1\20\1\13\1\5\1\44\1\36\1\13\1\5\1\13\1\21\1\13\1\4\2\5\3\13\1\36\1\13\2\44\1\36\1\13\1\36\1\13\1\36\1\13\1\21\1\13\1\4\1\13\1\36\1\13\1\21\1\20\2\13\2\44\1\13\1\5\1\44\1\36\1\13\1\5\1\13\1\5\1\44\1\36\1\13\1\5\1\21\1\20\1\13\1\5\1\34\2\36\2\44\2\5\1\4\3\13\1\21\2\13\1\36\2\13\1\21\1\13\1\4\1\13\1\36\1\13\1\36\1\13\1\21\2\13\1\5\2\13\1\20\2\44\1\21\1\13\1\5\1\44\1\36\1\21\1\20\1\13\1\5\1\44\1\36\1\13\1\5\1\21\1\13\1\36\1\13\2\44\1\36\1\13\1\21\1\13\1\36\1\13\1\21\1\13\1\4\1\13\1\36\2\13\1\5\1\44\1\36\1\13\1\5\1\21\1\13\1\5\1\21\1\20\1\13\1\5\1\44\1\36\1\13\1\21\1\13\1\4\2\5\3\13\1\36\2\13\1\36\1\13\1\36\1\13\1\21\1\13\1\21\1\20\2\13\2\44\1\13\1\5\1\44\1\36\1\13\1\5\1\44\1\36\1\13\1\5\1\21\1\36\2\44\1\13\1\21\2\13\1\21\1\13\1\4\1\13\1\36\2\13\1\5\2\21\1\20\1\13\1\5\1\44\1\36\1\13\1\36\1\13\1\36\1\13\1\21\2\13\1\5\1\44\1\36\1\13\1\5\1\21\1\13\1\21\1\13\1\4\1\13\1\36\1\13\1\21\1\20\1\13\1\5\1\44\2\36\1\13\1\21\2\13\1\5\1\21\1\13\1\36\2\13\1\5\1\44\1\36\1\13\1\21\1\13\1\21";
    static final String dfa_27s = "\1\uffff\1\2\21\uffff\1\1\u01e6\uffff";
    static final String dfa_28s = "\12\uffff\1\3\1\uffff\1\1\5\uffff\1\2\3\uffff\1\0\u01e3\uffff}>";
    static final String[] dfa_29s = {
            "\1\1\1\uffff\3\1\4\uffff\1\2\1\3\5\uffff\1\1",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\10\35\uffff\1\7",
            "\1\12\4\uffff\1\11",
            "\1\10",
            "\1\14\4\uffff\1\13",
            "\1\22\1\uffff\1\15\1\16\7\uffff\1\17\6\uffff\1\20\1\21",
            "\1\uffff",
            "\1\26\1\uffff\1\24\1\25",
            "\1\uffff",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\uffff",
            "",
            "\1\34",
            "\1\35",
            "\1\uffff",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\22\1\uffff\1\41\1\42\7\uffff\1\43\6\uffff\1\44\1\45",
            "\1\22\1\uffff\1\41\1\42\7\uffff\1\43\6\uffff\1\44\1\45",
            "\1\46",
            "\1\47",
            "\1\22\1\uffff\1\41\1\42\7\uffff\1\43\6\uffff\1\44\1\45",
            "\1\22\1\uffff\1\41\1\42\7\uffff\1\43\6\uffff\1\44\1\45",
            "\1\50\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\26\1\uffff\1\57\1\60",
            "\1\26\1\uffff\1\57\1\60",
            "\1\61\5\uffff\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\22\1\uffff\1\67\1\70\7\uffff\1\71\6\uffff\1\72\1\73",
            "\1\22\1\uffff\1\67\1\70\7\uffff\1\71\6\uffff\1\72\1\73",
            "\1\74",
            "\1\75",
            "\1\61\5\uffff\1\62",
            "\1\100\13\uffff\1\76\1\77",
            "\1\101",
            "\1\22\1\uffff\1\67\1\70\7\uffff\1\71\6\uffff\1\72\1\73",
            "\1\22\1\uffff\1\67\1\70\7\uffff\1\71\6\uffff\1\72\1\73",
            "\1\102\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113\5\uffff\1\114",
            "\1\115",
            "\1\22\1\uffff\1\41\1\42\7\uffff\1\116\6\uffff\1\44\1\45",
            "\1\100\13\uffff\1\76\1\77",
            "\1\117\5\uffff\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\22\1\uffff\1\125\1\126\7\uffff\1\127\6\uffff\1\130\1\131",
            "\1\22\1\uffff\1\125\1\126\7\uffff\1\127\6\uffff\1\130\1\131",
            "\1\26",
            "\1\26",
            "\1\113\5\uffff\1\114",
            "\1\100",
            "\1\132",
            "\1\133",
            "\1\117\5\uffff\1\120",
            "\1\136\13\uffff\1\134\1\135",
            "\1\137",
            "\1\22\1\uffff\1\125\1\126\7\uffff\1\127\6\uffff\1\130\1\131",
            "\1\22\1\uffff\1\125\1\126\7\uffff\1\127\6\uffff\1\130\1\131",
            "\1\140\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\100",
            "\1\147",
            "\1\150\5\uffff\1\151",
            "\1\152",
            "\1\22\1\uffff\1\67\1\70\7\uffff\1\153\6\uffff\1\72\1\73",
            "\1\136\13\uffff\1\134\1\135",
            "\1\154\5\uffff\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\22\1\uffff\1\162\1\163\7\uffff\1\164\6\uffff\1\165\1\166",
            "\1\22\1\uffff\1\162\1\163\7\uffff\1\164\6\uffff\1\165\1\166",
            "\1\167\1\170",
            "\1\150\5\uffff\1\151",
            "\1\136",
            "\1\171",
            "\1\172",
            "\1\154\5\uffff\1\155",
            "\1\175\13\uffff\1\173\1\174",
            "\1\176",
            "\1\22\1\uffff\1\162\1\163\7\uffff\1\164\6\uffff\1\165\1\166",
            "\1\22\1\uffff\1\162\1\163\7\uffff\1\164\6\uffff\1\165\1\166",
            "\1\177\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086\5\uffff\1\u0087",
            "\1\u0088",
            "\1\136",
            "\1\u0089",
            "\1\u008a\5\uffff\1\u008b",
            "\1\u008c",
            "\1\22\1\uffff\1\125\1\126\7\uffff\1\u008d\6\uffff\1\130\1\131",
            "\1\175\13\uffff\1\173\1\174",
            "\1\u008e\5\uffff\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\22",
            "\1\22",
            "\1\u0086\5\uffff\1\u0087",
            "\1\u0096\13\uffff\1\u0094\1\u0095",
            "\1\u0097",
            "\1\u0098\1\u0099",
            "\1\u008a\5\uffff\1\u008b",
            "\1\175",
            "\1\u009a",
            "\1\u009b",
            "\1\u008e\5\uffff\1\u008f",
            "\1\u009e\13\uffff\1\u009c\1\u009d",
            "\1\u009f",
            "\1\22",
            "\1\22",
            "\1\u00a0\1\u00a1",
            "\1\u00a2\5\uffff\1\u00a3",
            "\1\u00a4",
            "\1\22\1\uffff\1\u00a6\1\u00a7\7\uffff\1\u00a5\6\uffff\1\u00a8\1\u00a9",
            "\1\u0096\13\uffff\1\u0094\1\u0095",
            "\1\u00aa\5\uffff\1\u00ab",
            "\1\u00ac",
            "\1\175",
            "\1\u00ad",
            "\1\u00ae\5\uffff\1\u00af",
            "\1\u00b0",
            "\1\22\1\uffff\1\162\1\163\7\uffff\1\u00b1\6\uffff\1\165\1\166",
            "\1\u009e\13\uffff\1\u009c\1\u009d",
            "\1\u00b2\5\uffff\1\u00b3",
            "\1\u00b4",
            "\1\u00a2\5\uffff\1\u00a3",
            "\1\u0096",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00aa\5\uffff\1\u00ab",
            "\1\u00bd\13\uffff\1\u00bb\1\u00bc",
            "\1\u00be",
            "\1\u00bf\1\u00c0",
            "\1\u00ae\5\uffff\1\u00af",
            "\1\u009e",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00b2\5\uffff\1\u00b3",
            "\1\u00c5\13\uffff\1\u00c3\1\u00c4",
            "\1\u00c6",
            "\1\u0096",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\22\1\uffff\1\u00ca\1\u00cb\7\uffff\1\u00cc\6\uffff\1\u00cd\1\u00ce",
            "\1\22\1\uffff\1\u00ca\1\u00cb\7\uffff\1\u00cc\6\uffff\1\u00cd\1\u00ce",
            "\1\u00cf\5\uffff\1\u00d0",
            "\1\u00d1",
            "\1\22\1\uffff\1\u00ca\1\u00cb\7\uffff\1\u00d2\6\uffff\1\u00cd\1\u00ce",
            "\1\u00bd\13\uffff\1\u00bb\1\u00bc",
            "\1\u00d3\5\uffff\1\u00d4",
            "\1\u00d5",
            "\1\u009e",
            "\1\u00d6",
            "\1\u00d7\5\uffff\1\u00d8",
            "\1\u00d9",
            "\1\22\12\uffff\1\u00da",
            "\1\u00c5\13\uffff\1\u00c3\1\u00c4",
            "\1\u00db\1\u00dc",
            "\1\22\1\uffff\1\u00ca\1\u00cb\7\uffff\1\u00cc\6\uffff\1\u00cd\1\u00ce",
            "\1\22\1\uffff\1\u00ca\1\u00cb\7\uffff\1\u00cc\6\uffff\1\u00cd\1\u00ce",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00cf\5\uffff\1\u00d0",
            "\1\u00bd",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00d3\5\uffff\1\u00d4",
            "\1\u00e6\13\uffff\1\u00e4\1\u00e5",
            "\1\u00e7",
            "\1\u00e8\1\u00e9",
            "\1\u00d7\5\uffff\1\u00d8",
            "\1\u00c5",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec\5\uffff\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\22\1\uffff\1\u00f2\1\u00f3\7\uffff\1\u00f4\6\uffff\1\u00f5\1\u00f6",
            "\1\22\1\uffff\1\u00f2\1\u00f3\7\uffff\1\u00f4\6\uffff\1\u00f5\1\u00f6",
            "\1\u00bd",
            "\1\u00f7",
            "\1\u00f8\5\uffff\1\u00f9",
            "\1\u00fa",
            "\1\22\1\uffff\1\u00f2\1\u00f3\7\uffff\1\u00fb\6\uffff\1\u00f5\1\u00f6",
            "\1\u00e6\13\uffff\1\u00e4\1\u00e5",
            "\1\u00fc\5\uffff\1\u00fd",
            "\1\u00fe",
            "\1\u00c5",
            "\1\u00ff",
            "\1\u00ec\5\uffff\1\u00ed",
            "\1\u0102\13\uffff\1\u0100\1\u0101",
            "\1\u0103",
            "\1\22\1\uffff\1\u00f2\1\u00f3\7\uffff\1\u00f4\6\uffff\1\u00f5\1\u00f6",
            "\1\22\1\uffff\1\u00f2\1\u00f3\7\uffff\1\u00f4\6\uffff\1\u00f5\1\u00f6",
            "\1\u0104\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b\1\u010c",
            "\1\u00f8\5\uffff\1\u00f9",
            "\1\u00e6",
            "\1\u010d",
            "\1\u010e",
            "\1\u00fc\5\uffff\1\u00fd",
            "\1\u0111\13\uffff\1\u010f\1\u0110",
            "\1\u0112",
            "\1\u0113\1\u0114",
            "\1\u0115\5\uffff\1\u0116",
            "\1\u0117",
            "\1\22\1\uffff\1\u0119\1\u011a\7\uffff\1\u0118\6\uffff\1\u011b\1\u011c",
            "\1\u0102\13\uffff\1\u0100\1\u0101",
            "\1\u011d\5\uffff\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\22\1\uffff\1\162\1\163\7\uffff\1\164\6\uffff\1\165\1\166",
            "\1\22\1\uffff\1\162\1\163\7\uffff\1\164\6\uffff\1\165\1\166",
            "\1\u0123\5\uffff\1\u0124",
            "\1\u0125",
            "\1\u00e6",
            "\1\u0126",
            "\1\u0127\5\uffff\1\u0128",
            "\1\u0129",
            "\1\22\1\uffff\1\162\1\163\7\uffff\1\u012a\6\uffff\1\165\1\166",
            "\1\u0111\13\uffff\1\u010f\1\u0110",
            "\1\u012b\5\uffff\1\u012c",
            "\1\u012d",
            "\1\u0115\5\uffff\1\u0116",
            "\1\u0102",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u011d\5\uffff\1\u011e",
            "\1\u0136\13\uffff\1\u0134\1\u0135",
            "\1\u0137",
            "\1\22\1\uffff\1\162\1\163\7\uffff\1\164\6\uffff\1\165\1\166",
            "\1\22\1\uffff\1\162\1\163\7\uffff\1\164\6\uffff\1\165\1\166",
            "\1\u0138\1\u0139",
            "\1\u0123\5\uffff\1\u0124",
            "\1\u013c\13\uffff\1\u013a\1\u013b",
            "\1\u013d",
            "\1\u013e\1\u013f",
            "\1\u0127\5\uffff\1\u0128",
            "\1\u0111",
            "\1\u0140",
            "\1\u0141",
            "\1\u012b\5\uffff\1\u012c",
            "\1\u0144\13\uffff\1\u0142\1\u0143",
            "\1\u0145",
            "\1\u0102",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\22\1\uffff\1\u0149\1\u014a\7\uffff\1\u014b\6\uffff\1\u014c\1\u014d",
            "\1\22\1\uffff\1\u0149\1\u014a\7\uffff\1\u014b\6\uffff\1\u014c\1\u014d",
            "\1\u014e\5\uffff\1\u014f",
            "\1\u0150",
            "\1\22\1\uffff\1\u00f2\1\u00f3\7\uffff\1\u00fb\6\uffff\1\u00f5\1\u00f6",
            "\1\u0136\13\uffff\1\u0134\1\u0135",
            "\1\u0151\5\uffff\1\u0152",
            "\1\u0153",
            "\1\u0154\5\uffff\1\u0155",
            "\1\u0156",
            "\1\22\1\uffff\1\u0149\1\u014a\7\uffff\1\u0157\6\uffff\1\u014c\1\u014d",
            "\1\u013c\13\uffff\1\u013a\1\u013b",
            "\1\u0158\5\uffff\1\u0159",
            "\1\u015a",
            "\1\u0111",
            "\1\u015b",
            "\1\u015c\5\uffff\1\u015d",
            "\1\u015e",
            "\1\22\12\uffff\1\u00da",
            "\1\u0144\13\uffff\1\u0142\1\u0143",
            "\1\u015f\1\u0160",
            "\1\22\1\uffff\1\u0149\1\u014a\7\uffff\1\u014b\6\uffff\1\u014c\1\u014d",
            "\1\22\1\uffff\1\u0149\1\u014a\7\uffff\1\u014b\6\uffff\1\u014c\1\u014d",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u014e\5\uffff\1\u014f",
            "\1\u0136",
            "\1\u0166",
            "\1\u0151\5\uffff\1\u0152",
            "\1\u0169\13\uffff\1\u0167\1\u0168",
            "\1\u016a",
            "\1\u0154\5\uffff\1\u0155",
            "\1\u013c",
            "\1\u016b",
            "\1\u016c",
            "\1\u0158\5\uffff\1\u0159",
            "\1\u016f\13\uffff\1\u016d\1\u016e",
            "\1\u0170",
            "\1\u0171\1\u0172",
            "\1\u015c\5\uffff\1\u015d",
            "\1\u0144",
            "\1\u0173",
            "\1\u0174\5\uffff\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\22\1\uffff\1\u00f2\1\u00f3\7\uffff\1\u00f4\6\uffff\1\u00f5\1\u00f6",
            "\1\22\1\uffff\1\u00f2\1\u00f3\7\uffff\1\u00f4\6\uffff\1\u00f5\1\u00f6",
            "\1\u0136",
            "\1\u017a\5\uffff\1\u017b",
            "\1\u017c",
            "\1\22\1\uffff\1\162\1\163\7\uffff\1\u012a\6\uffff\1\165\1\166",
            "\1\u0169\13\uffff\1\u0167\1\u0168",
            "\1\u013c",
            "\1\u017d",
            "\1\u017e\5\uffff\1\u017f",
            "\1\u0180",
            "\1\22\1\uffff\1\u00f2\1\u00f3\7\uffff\1\u0181\6\uffff\1\u00f5\1\u00f6",
            "\1\u016f\13\uffff\1\u016d\1\u016e",
            "\1\u0182\5\uffff\1\u0183",
            "\1\u0184",
            "\1\u0144",
            "\1\u0174\5\uffff\1\u0175",
            "\1\u0187\13\uffff\1\u0185\1\u0186",
            "\1\u0188",
            "\1\22\1\uffff\1\u00f2\1\u00f3\7\uffff\1\u00f4\6\uffff\1\u00f5\1\u00f6",
            "\1\22\1\uffff\1\u00f2\1\u00f3\7\uffff\1\u00f4\6\uffff\1\u00f5\1\u00f6",
            "\1\u0189\1\u018a",
            "\1\u017a\5\uffff\1\u017b",
            "\1\u0169",
            "\1\u018b",
            "\1\u018c\1\u018d",
            "\1\u017e\5\uffff\1\u017f",
            "\1\u016f",
            "\1\u018e",
            "\1\u018f",
            "\1\u0182\5\uffff\1\u0183",
            "\1\u0192\13\uffff\1\u0190\1\u0191",
            "\1\u0193",
            "\1\u0194\5\uffff\1\u0195",
            "\1\u0196",
            "\1\22\1\uffff\1\u0198\1\u0199\7\uffff\1\u0197\6\uffff\1\u019a\1\u019b",
            "\1\u0187\13\uffff\1\u0185\1\u0186",
            "\1\u019c\5\uffff\1\u019d",
            "\1\u019e",
            "\1\u0169",
            "\1\u019f\5\uffff\1\u01a0",
            "\1\u01a1",
            "\1\u016f",
            "\1\u01a2",
            "\1\u01a3\5\uffff\1\u01a4",
            "\1\u01a5",
            "\1\22\1\uffff\1\162\1\163\7\uffff\1\u012a\6\uffff\1\165\1\166",
            "\1\u0192\13\uffff\1\u0190\1\u0191",
            "\1\u0194\5\uffff\1\u0195",
            "\1\u0187",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u019c\5\uffff\1\u019d",
            "\1\u01ae\13\uffff\1\u01ac\1\u01ad",
            "\1\u01af",
            "\1\u019f\5\uffff\1\u01a0",
            "\1\u01b2\13\uffff\1\u01b0\1\u01b1",
            "\1\u01b3",
            "\1\u01b4\1\u01b5",
            "\1\u01a3\5\uffff\1\u01a4",
            "\1\u0192",
            "\1\u01b6",
            "\1\u0187",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\22\1\uffff\1\u0149\1\u014a\7\uffff\1\u014b\6\uffff\1\u014c\1\u014d",
            "\1\22\1\uffff\1\u0149\1\u014a\7\uffff\1\u014b\6\uffff\1\u014c\1\u014d",
            "\1\u01ba\5\uffff\1\u01bb",
            "\1\u01bc",
            "\1\22\1\uffff\1\u00f2\1\u00f3\7\uffff\1\u0181\6\uffff\1\u00f5\1\u00f6",
            "\1\u01ae\13\uffff\1\u01ac\1\u01ad",
            "\1\u01bd\5\uffff\1\u01be",
            "\1\u01bf",
            "\1\22\1\uffff\1\u0149\1\u014a\7\uffff\1\u01c0\6\uffff\1\u014c\1\u014d",
            "\1\u01b2\13\uffff\1\u01b0\1\u01b1",
            "\1\u01c1\5\uffff\1\u01c2",
            "\1\u01c3",
            "\1\u0192",
            "\1\u01c4\1\u01c5",
            "\1\22\1\uffff\1\u0149\1\u014a\7\uffff\1\u014b\6\uffff\1\u014c\1\u014d",
            "\1\22\1\uffff\1\u0149\1\u014a\7\uffff\1\u014b\6\uffff\1\u014c\1\u014d",
            "\1\u01ba\5\uffff\1\u01bb",
            "\1\u01ae",
            "\1\u01c6",
            "\1\u01bd\5\uffff\1\u01be",
            "\1\u01b2",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c1\5\uffff\1\u01c2",
            "\1\u01cb\13\uffff\1\u01c9\1\u01ca",
            "\1\u01cc",
            "\1\u01cd\5\uffff\1\u01ce",
            "\1\u01cf",
            "\1\u01ae",
            "\1\u01b2",
            "\1\u01d0",
            "\1\u01d1\5\uffff\1\u01d2",
            "\1\u01d3",
            "\1\22\1\uffff\1\u00f2\1\u00f3\7\uffff\1\u0181\6\uffff\1\u00f5\1\u00f6",
            "\1\u01cb\13\uffff\1\u01c9\1\u01ca",
            "\1\u01cd\5\uffff\1\u01ce",
            "\1\u01d6\13\uffff\1\u01d4\1\u01d5",
            "\1\u01d7",
            "\1\u01d8\1\u01d9",
            "\1\u01d1\5\uffff\1\u01d2",
            "\1\u01cb",
            "\1\u01da",
            "\1\u01db\5\uffff\1\u01dc",
            "\1\u01dd",
            "\1\22\1\uffff\1\u0198\1\u0199\7\uffff\1\u01de\6\uffff\1\u019a\1\u019b",
            "\1\u01d6\13\uffff\1\u01d4\1\u01d5",
            "\1\u01df\5\uffff\1\u01e0",
            "\1\u01e1",
            "\1\u01cb",
            "\1\u01db\5\uffff\1\u01dc",
            "\1\u01d6",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01df\5\uffff\1\u01e0",
            "\1\u01e6\13\uffff\1\u01e4\1\u01e5",
            "\1\u01e7",
            "\1\u01d6",
            "\1\u01e8",
            "\1\u01e9\5\uffff\1\u01ea",
            "\1\u01eb",
            "\1\22\1\uffff\1\u0149\1\u014a\7\uffff\1\u01c0\6\uffff\1\u014c\1\u014d",
            "\1\u01e6\13\uffff\1\u01e4\1\u01e5",
            "\1\u01ec\1\u01ed",
            "\1\u01e9\5\uffff\1\u01ea",
            "\1\u01e6",
            "\1\u01ee",
            "\1\u01ef\5\uffff\1\u01f0",
            "\1\u01f1",
            "\1\u01e6",
            "\1\u01ef\5\uffff\1\u01f0",
            "\1\u01f4\13\uffff\1\u01f2\1\u01f3",
            "\1\u01f5",
            "\1\u01f6\5\uffff\1\u01f7",
            "\1\u01f8",
            "\1\22\1\uffff\1\u0198\1\u0199\7\uffff\1\u01de\6\uffff\1\u019a\1\u019b",
            "\1\u01f4\13\uffff\1\u01f2\1\u01f3",
            "\1\u01f6\5\uffff\1\u01f7",
            "\1\u01f4",
            "\1\u01f9",
            "\1\u01f4"
    };

    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[][] dfa_29 = unpackEncodedStringArray(dfa_29s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_23;
            this.eof = dfa_24;
            this.min = dfa_25;
            this.max = dfa_26;
            this.accept = dfa_27;
            this.special = dfa_28;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "()* loopback of 4932:7: ( ( rule__Object2__FeaturesAssignment_5_4 )=> rule__Object2__FeaturesAssignment_5_4 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_22 = input.LA(1);

                         
                        int index35_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalBug304681TestLanguage()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index35_22);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_12 = input.LA(1);

                         
                        int index35_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalBug304681TestLanguage()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index35_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_18 = input.LA(1);

                         
                        int index35_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalBug304681TestLanguage()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index35_18);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA35_10 = input.LA(1);

                         
                        int index35_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalBug304681TestLanguage()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index35_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_30s = "\23\uffff";
    static final String dfa_31s = "\1\1\22\uffff";
    static final String dfa_32s = "\1\21\1\uffff\1\4\1\20\1\35\3\5\1\21\1\13\2\5\1\0\1\21\1\5\1\21\1\13\1\uffff\1\21";
    static final String dfa_33s = "\1\44\1\uffff\1\4\1\20\1\36\1\13\1\5\1\13\1\36\2\13\1\5\1\0\1\36\1\13\1\21\1\13\1\uffff\1\21";
    static final String dfa_34s = "\1\uffff\1\2\17\uffff\1\1\1\uffff";
    static final String dfa_35s = "\14\uffff\1\0\6\uffff}>";
    static final String[] dfa_36s = {
            "\1\1\1\uffff\2\1\7\uffff\1\2\6\uffff\2\1",
            "",
            "\1\3",
            "\1\4",
            "\1\5\1\6",
            "\1\7\5\uffff\1\10",
            "\1\11",
            "\1\7\5\uffff\1\10",
            "\1\14\13\uffff\1\12\1\13",
            "\1\15",
            "\1\16\5\uffff\1\17",
            "\1\20",
            "\1\uffff",
            "\1\14\13\uffff\1\12\1\13",
            "\1\16\5\uffff\1\17",
            "\1\14",
            "\1\22",
            "",
            "\1\14"
    };

    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_30;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "()* loopback of 5095:7: ( ( rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )=> rule__Attribute2__ConstraintDefinitionsAssignment_3_0_1_2 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_12 = input.LA(1);

                         
                        int index42_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalBug304681TestLanguage()) ) {s = 17;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000180008000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000180008002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000020F780000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000C800000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000010L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010800L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000020C380000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001810180000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000820L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000020F780002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000180002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000020C380002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001810180002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000060000002L});
    }


}