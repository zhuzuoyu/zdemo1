package com.zzy.login.servlet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImageServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//req.setCharacterEncoding("utf-8");
		//resp.setCharacterEncoding("utf-8");
		BufferedImage bi = new BufferedImage(70, 40, BufferedImage.TYPE_INT_RGB);
		Color c = new Color(240, 230, 140);
		Graphics g = bi.getGraphics();
		g.setColor(c);
		g.fillRect(0, 0, 70, 40);
		
		char ch[] ="abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		StringBuffer sb = new StringBuffer();
		Random r = new Random();
		int len = ch.length;
		
		for (int i = 0; i < 4; i++) {
			int index = r.nextInt(len);
			g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
			g.drawString(ch[index]+" ", i*15+9, 20);
			sb.append(ch[index]);
		}
		
		req.getSession().setAttribute("verifyCode", sb.toString());
		ImageIO.write(bi,"JPG",resp.getOutputStream());
	}
	
}
