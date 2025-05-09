package com.taobao.taolive.room.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TRoundLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float CORNER_RADIUS = 10.0f;
    private float cornerRadius;
    private Bitmap maskBitmap;
    private Paint maskPaint;
    private Paint paint;

    static {
        t2o.a(779093290);
    }

    public TRoundLinearLayout(Context context) {
        super(context);
        init(context, null, 0, -1.0f);
    }

    private Bitmap createMask(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b9cee90d", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float f = i;
        float f2 = i2;
        canvas.drawRect(0.0f, 0.0f, f, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        float f3 = this.cornerRadius;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        return createBitmap;
    }

    private void init(Context context, AttributeSet attributeSet, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aae2d3a", new Object[]{this, context, attributeSet, new Integer(i), new Float(f)});
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TaoLiveRoomRoundFeature);
            float dimension = obtainStyledAttributes.getDimension(R.styleable.TaoLiveRoomRoundFeature_tliveRoom_allRadius, f);
            if (dimension < 0.0f) {
                dimension = obtainStyledAttributes.getDimension(R.styleable.TaoLiveRoomRoundFeature_tliveRoom_cornerRadius, dimension);
            }
            f = dimension;
            obtainStyledAttributes.recycle();
        }
        if (f < 0.0f) {
            this.cornerRadius = 0.0f;
        } else {
            this.cornerRadius = f;
        }
        this.paint = new Paint(1);
        Paint paint = new Paint(3);
        this.maskPaint = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setWillNotDraw(false);
    }

    public static /* synthetic */ Object ipc$super(TRoundLinearLayout tRoundLinearLayout, String str, Object... objArr) {
        if (str.hashCode() == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/view/TRoundLinearLayout");
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else if (canvas != null && canvas.getWidth() > 0 && canvas.getHeight() > 0) {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                super.draw(canvas2);
                if (this.maskBitmap == null) {
                    this.maskBitmap = createMask(canvas.getWidth(), canvas.getHeight());
                }
                canvas2.drawBitmap(this.maskBitmap, 0.0f, 0.0f, this.maskPaint);
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, this.paint);
            } catch (OutOfMemoryError unused) {
                super.draw(canvas);
            }
        }
    }

    public TRoundLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0, -1.0f);
    }

    public TRoundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i, -1.0f);
    }

    public TRoundLinearLayout(Context context, float f) {
        super(context);
        init(context, null, 0, f);
    }
}
