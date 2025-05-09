package com.taobao.tbpoplayer.watermask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.watermask.WaterMaskView;
import tb.hst;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WaterMaskView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Bitmap mBitmap;
    private Paint mPaint;

    static {
        t2o.a(790626564);
    }

    public WaterMaskView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(WaterMaskView waterMaskView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/watermask/WaterMaskView");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroy$159() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("325c5f15", new Object[]{this});
            return;
        }
        try {
            wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "WaterMaskView.destroy");
            Bitmap bitmap = this.mBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.mBitmap = null;
                wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "WaterMaskView.destroy.bitmap.recycle");
            }
        } catch (Throwable th) {
            wdm.h("WaterMaskView.destroy.error", th);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            hst.c(new Runnable() { // from class: tb.byw
                @Override // java.lang.Runnable
                public final void run() {
                    WaterMaskView.this.lambda$destroy$159();
                }
            });
        }
    }

    public final String init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ab693e9", new Object[]{this});
        }
        Bitmap h = a.m().h();
        this.mBitmap = h;
        if (h == null) {
            wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "WaterMaskView.init.bitmap=null.cancel");
            return "bitMapNull";
        }
        wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "WaterMaskView.init.bitmapWidth=" + this.mBitmap.getWidth() + ".bitmapHeight=" + this.mBitmap.getHeight());
        Paint paint = new Paint();
        this.mPaint = paint;
        Bitmap bitmap = this.mBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        setAlpha(0.03f);
        return "";
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        Bitmap bitmap = this.mBitmap;
        if (!(bitmap == null || bitmap.isRecycled())) {
            int width = getWidth();
            int height = getHeight();
            int width2 = this.mBitmap.getWidth();
            int height2 = this.mBitmap.getHeight();
            int i = width2 / 160;
            int i2 = height / height2;
            for (int i3 = 0; i3 < i2 + 1; i3++) {
                int i4 = i3 * height2;
                for (int i5 = 0; i5 < (width / width2) + 1; i5++) {
                    int i6 = (i5 * width2) - (i * i3);
                    if (i6 < width) {
                        Bitmap bitmap2 = this.mBitmap;
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            canvas.drawBitmap(this.mBitmap, i6, i4, this.mPaint);
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public WaterMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaterMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
