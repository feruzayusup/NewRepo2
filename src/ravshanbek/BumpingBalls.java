//package ravshanbek;
//import java.awt.Color;
//import stddraw.StdDraw.*;
//import java.awt.Graphics;
//public class BumpingBalls {
//
//  public static void main(String[] args) {
//
////	  		ArgsProcessor ap = new ArgsProcessor(args);
//	  		
//	  		int b = 7;  //ap.nextInt("How many balls do you want?");
//	  		int N = 100;   //ap.nextInt("How many times do you want to run the simulation?");
//	  		
//	  		StdDraw.setPenColor(StdDraw.BLUE);
//	  		StdDraw.setXscale(-2.0, 2.0);
//	  		StdDraw.setYscale(-2.0, 2.0);
//
//	  		double[][] pos = new double[b][2];
//	  		double[][] vel = new double[b][2];
//	  		double rx = 0, ry = 0;
//	  		double xDiff = 0, yDiff = 0;
//	  		//double vx = 0, vy = 0;
//	  		double radius = 0.10;
//
//	  		//generate random x and y positions for each ball...
//	  		for (int i = 0; i < b; i++) {
//	  			for (int j = 0; j < 2; j++) {
//	  				pos[i][j] = Math.random();
//	  			}
//	  			//System.out.println(rx + "\t" + pos[i][0] + "\t" + ry + "\t" + pos[i][1]);
//	  		}
//
//	  		//generate random x and y velocities for each ball...
//	  		for (int i = 0; i < b; i++) {
//	  			for (int j = 0; j < 2; j++) {
//	  				vel[i][j] = Math.random()*0.25;
//	  				//				if (j == 1) {
//	  				//					vy = vel[i][j];
//	  				//				}
//	  				//				else {
//	  				//					vx = vel[i][j];
//	  				//				}
//
//	  			}
//	  			//System.out.println(vx + "\t" + vel[i][0] + "\t" + vy + "\t" + vel[i][1]);
//	  		}
//
//	  		// main animating loop
//	  		//while (true) {
//
//
//	  		//			rx = rx + vx;
//	  		//			ry = ry + vy;
//	  		//			distance formula: Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
//
//	  		//StdDraw.clear();
//	  		for (int z = 0; z < N; z++) {
//	  			StdDraw.clear();
//	  			// law of elastic collision
//	  			for (int i = 0; i < b; i++) {
//	  				for (int j = 0; j < 2; j++) {
//	  					if (Math.abs(pos[i][j] + vel[i][j]) > 2.0 - radius) vel[i][j] = -vel[i][j];
//	  				}
//	  			}
//	  			//distance
//	  			for (int i = 0; i < b; i++) {
//	  				for (int j = i+1; j < b; j++) {
//	  					xDiff = Math.pow(pos[i][0] - pos[j][0], 2);
//	  					yDiff = Math.pow(pos[i][1] - pos[j][1], 2);
//	  					if (Math.sqrt(xDiff + yDiff) <= 2*radius) {
//	  						vel[i][0] = -vel[i][0];
//	  						vel[i][1] = -vel[i][1];
//	  						vel[j][0] = -vel[j][0];
//	  						vel[j][1] = -vel[j][1];
//	  					}
//	  				}
//	  			}
//	  			for (int i = 0; i < b; i++) {
//	  				for (int j = 0; j < 2; j++) {
//	  					if (j == 0) {
//	  						pos[i][j] = pos[i][j] + vel[i][j];
//	  						rx = pos[i][j];
//	  					}
//	  					else {
//	  						pos[i][j] = pos[i][j] + vel[i][j];
//	  						ry = pos[i][j];
//	  					}
//	  				}
//	  				StdDraw.filledCircle(rx, ry, radius);
//
//	  			}
//	  			StdDraw.show(17);
//	  			//if (i >= b-1) i = 0; <-- this isn't needed bc while (true)_loop already keeps this going
//	  		}
//
//	  	}
//
//	  }
//
//	  
//	  
//	  
//  }
//}
