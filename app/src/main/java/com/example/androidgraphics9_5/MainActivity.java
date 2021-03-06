package com.example.androidgraphics9_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyGraphicView(this));
    }
    private static class MyGraphicView extends View {
        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);

            int cenX = this.getWidth() / 2;
            int cenY = this.getHeight() / 2;

            Paint paint = new Paint();
            paint.setColor(Color.GRAY);
            EmbossMaskFilter eMask;
//            eMask = new EmbossMaskFilter(new float[] {3, 3, 3},
//                    0.5f, 5, 20);
//            eMask = new EmbossMaskFilter(new float[] {10, 3, 3},
//                    0.5f, 5, 20);

//            eMask = new EmbossMaskFilter(new float[] {3, 10, 3},
//                    0.5f, 5, 20);

            eMask = new EmbossMaskFilter(new float[] {3, 3, 10},
                    0.9f, 20, 20);

            paint.setMaskFilter(eMask);
            canvas.drawCircle(cenX, cenY, 150, paint);
        }
        public MyGraphicView(Context context) {
            super(context);
        }
    }
}