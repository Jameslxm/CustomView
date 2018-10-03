package com.lxm.customview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class BasicView extends View {
    public BasicView(Context context) {
        super(context);
    }

    public BasicView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BasicView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //save restore
//        canvas.drawColor(Color.RED);
//        canvas.save();
//        canvas.clipRect(100,100,800,800);
//        canvas.drawColor(Color.GRAY);
//        canvas.restore();
//        canvas.drawColor(Color.GREEN);

        //裁剪
//        canvas.drawColor(Color.RED);
//        canvas.clipRect(new Rect(100,100,200,200));
//        canvas.drawColor(Color.GREEN);

//        Rect rect = new Rect(10,10,400,200);
//        Paint redPaint = generatePaint(Color.RED,3);
//        canvas.drawRect(rect,redPaint);
//
//        canvas.translate(100,100);
//        Paint greenPaint = generatePaint(Color.GREEN,3);
//        canvas.drawRect(rect,greenPaint);

//        Rect rect = new Rect(0,0,400,200);
//        Paint paint = new Paint();
//        paint.setColor(Color.RED);
//        paint.setStyle(Paint.Style.FILL);
//        canvas.translate(100,100);
//        canvas.drawRect(rect,paint);

//        Paint fillPaint = new Paint();
//        fillPaint.setColor(Color.GREEN);
//        fillPaint.setStyle(Paint.Style.FILL);
//        Rect rect1 = new Rect(100,100,400,200);
//        Rect rect2 = new Rect(200,0,300,300);
//        Paint paint1 = new Paint();
//        paint1.setColor(Color.RED);
//        paint1.setStyle(Paint.Style.STROKE);
//        canvas.drawRect(rect1,paint1);
//        canvas.drawRect(rect2,paint1);
//        Region region1 = new Region(rect1);
//        Region region2 = new Region(rect2);
//        Region region = new Region();
//        region.op(region1,region2,Region.Op.INTERSECT);
//        drawRegion(canvas,region,fillPaint);

//        Rect rect1 = new Rect(100,100,400,200);
//        Rect rect2 = new Rect(200,0,300,300);
//        Paint paint1 = new Paint();
//        paint1.setColor(Color.RED);
//        paint1.setStyle(Paint.Style.STROKE);
//        paint1.setStrokeWidth(2);
//        canvas.drawRect(rect1,paint1);
//        canvas.drawRect(rect2,paint1);
//        Region region = new Region(rect1);
//        Region region2 = new Region(rect2);
//        region.op(region2, Region.Op.XOR);
//        Paint fillPaint = new Paint();
//        fillPaint.setColor(Color.GREEN);
//        fillPaint.setStyle(Paint.Style.FILL);
//        drawRegion(canvas,region,fillPaint);

//        Paint paint = new Paint();
//        paint.setColor(Color.RED);
//        paint.setStyle(Paint.Style.FILL);
//        Region region = new Region(10,10,200,100);
//        drawRegion(canvas,region,paint);

//        Paint paint = new Paint();
//        paint.setColor(Color.RED);
//        paint.setStyle(Paint.Style.FILL);
//        Path ovalPath = new Path();
//        RectF rect = new RectF(50,50,200,500);
//        ovalPath.addOval(rect,Path.Direction.CW);
//        Region rgn = new Region();
//        rgn.setPath(ovalPath,new Region(50,50,200,200));
//        drawRegion(canvas,rgn,paint);

//        Paint paint = new Paint();
//        paint.setStyle(Paint.Style.FILL);
//        paint.setColor(Color.RED);
//        Region region = new Region(new Rect(50,50,200,200));
//        drawRegion(canvas,region,paint);

//        Paint paint = new Paint();
//        paint.setColor(Color.RED);
//        Path path = new Path();
//        path.moveTo(10,10);
//        RectF rectF = new RectF(100,10,200,100);
//        path.arcTo(rectF,0,90,true);
//        canvas.drawPath(path,paint);

//        Paint paint = new Paint();
//        paint.setColor(Color.RED);
//        paint.setStrokeWidth(50);
//        canvas.drawPoint(100,100,paint);
//
//

//          canvas.drawRGB(0xFF,0x00,0xFF);

//        canvas.drawRGB(255,0,255);


//        Paint paint = new Paint();
//        paint.setColor(0xFFFF0000);
//        paint.setStyle(Paint.Style.FILL_AND_STROKE);
//        paint.setStrokeWidth(50);
//        canvas.drawCircle(190,200,150,paint);
//
//        paint.setColor(0x7EFFFF00);
//        canvas.drawCircle(190,200,100,paint);
//
//
//
//        Paint paint2 = new Paint();
//        paint2.setColor(0xFFFF0000);
//        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
//        paint2.setStrokeWidth(50);
//        canvas.drawCircle(190,600,150,paint2);
//
//        paint2.setColor(0x7EFFFF00);
//        canvas.drawCircle(190,600,100,paint2);

//        Paint paint = new Paint();
//        paint.setColor(Color.RED);
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(50);
//
//        canvas.drawCircle(190,200,150,paint);


    }

    private Paint generatePaint(int color,float width) {
        Paint paint = new Paint();
        paint.setColor(color);
        paint.setStrokeWidth(width);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    private void drawRegion(Canvas canvas, Region region, Paint paint) {
        Rect r = new Rect();
        RegionIterator iter = new RegionIterator(region);
        while (iter.next(r)){
            canvas.drawRect(r,paint);
        }
    }
}
