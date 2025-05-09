package com.taobao.tao.adapter.biz.plugins.watermask.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.tgw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class VideoWaterBgView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Paint mPaint;
    private int mPosX;
    private int mPosY;
    private int mRadius;

    static {
        t2o.a(793772114);
    }

    public VideoWaterBgView(Context context, int i, int i2) {
        super(context);
        initParams(i, i2);
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setShader(new RadialGradient(this.mPosX, this.mPosY, this.mRadius, Color.parseColor("#262626"), Color.parseColor("#000000"), Shader.TileMode.CLAMP));
        setBackgroundColor(Color.parseColor("#000000"));
    }

    private void initParams(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f061bd5d", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int b = tgw.b(i, i2);
        if (b == 1 || b == 2) {
            this.mPosX = i / 2;
            float f = i2;
            this.mPosY = (int) (0.2f * f);
            this.mRadius = (int) (f * 0.5f);
        } else if (b != 3) {
            int i3 = i / 2;
            this.mPosX = i3;
            this.mPosY = i3;
            this.mRadius = (int) ((i2 * 0.9f) - (i * 0.5f));
        } else {
            float f2 = i2;
            this.mPosX = (int) (0.75f * f2);
            this.mPosY = (int) (f2 * 0.5f);
            this.mRadius = (int) ((f2 * 0.9f) - (i * 0.5f));
        }
    }

    public static /* synthetic */ Object ipc$super(VideoWaterBgView videoWaterBgView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/adapter/biz/plugins/watermask/view/VideoWaterBgView");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        canvas.drawCircle(this.mPosX, this.mPosY, this.mRadius, this.mPaint);
    }
}
