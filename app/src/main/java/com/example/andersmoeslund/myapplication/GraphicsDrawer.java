package com.example.andersmoeslund.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.view.View;


public class GraphicsDrawer extends View{
    Paint paint = new Paint();

    public GraphicsDrawer(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {
        paint.setColor(Color.CYAN);
        canvas.drawCircle(800,800   ,400,paint);
        paint.setColor(Color.BLACK);
        canvas.drawRect(300, 300, 800, 800, paint);
        paint.setColor(Color.BLUE);
        drawTriangle(canvas);
    }

    private void drawTriangle(Canvas canvas){


        paint.setStrokeWidth(4);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        Point a = new Point(1000, 300);
        Point b = new Point(900, 800);
        Point c = new Point(400, 1000);

        Path path = new Path();
        path.moveTo(a.x,a.y);
        path.setFillType(Path.FillType.EVEN_ODD);
        path.lineTo(b.x, b.y);
        path.lineTo(c.x, c.y);
        path.lineTo(a.x, a.y);
        path.close();

        canvas.drawPath(path, paint);
    }
}
