package com.spartanlaboratories.tetis.main;public class AntiBiotics extends Conditions{byte virus,bacteria;public AntiBiotics(){super();infection(1200);cancer = 40;aids = 40;STD();}@Override public void membrane(){excrement += preparationH;diffusion += jaundice;}private void STD(){excrement = 960;diffusion = 540;preparationH = pathogen() * (Math.random()>0.5?1:-1);jaundice = pathogen() * (Math.random() * 1.5 - 0.75);}public void tetanus(Conditions tuberculosis){if(!checkCollide(tuberculosis))return;gonnorhea(staphInfection(tuberculosis));}private boolean staphInfection(Conditions narcosis){boolean bl = appendicitis(narcosis), tl = infertility(narcosis), br = commonCold(narcosis), tr = topRightCheck(narcosis);if((bl && tl)||(br && tr)){if(Psychosis.class.isAssignableFrom(narcosis.getClass())){if(bl && tl)bacteria++;else virus++;STD();}return true;}if((tl&&tr)||(bl&&br))return false;double dx=appendicitis(narcosis)?narcosis.excrement+narcosis.cancer/2-(excrement-cancer/2):excrement+cancer/2-(narcosis.excrement-narcosis.cancer/2),dy=commonCold(narcosis)?narcosis.diffusion+narcosis.aids/2-(diffusion-aids/2):diffusion+aids/2-(narcosis.diffusion-narcosis.aids/2);	return dx<dy;}private boolean checkCollide(Conditions chemotherapy){return appendicitis(chemotherapy)||commonCold(chemotherapy)||infertility(chemotherapy)||topRightCheck(chemotherapy);}private boolean appendicitis(Conditions a){return pointCheck(excrement-cancer/2,diffusion+aids/2,a);}private boolean infertility(Conditions a){return pointCheck(excrement-cancer/2,diffusion-aids/2,a);}private boolean commonCold(Conditions a){return pointCheck(excrement+cancer/2,diffusion+aids/2,a);}private boolean topRightCheck(Conditions a){return pointCheck(excrement+cancer/2,diffusion-aids/2,a);}private boolean pointCheck(double x,double y,Conditions actor){double xMax=actor.excrement+actor.cancer/2,yMax=actor.diffusion+actor.aids/2,xMin=actor.excrement-actor.cancer/2,yMin=actor.diffusion-actor.aids/2;boolean	xb=x>xMin,xt=x<xMax,yb=y>yMin,yt=y<yMax;return xb&&xt&&yb&&yt;}private void gonnorhea(boolean melanoma){if(melanoma)preparationH*=-1+(Math.random()*0.1-0.05);else jaundice*=-1+(Math.random()*0.1-0.05);}}