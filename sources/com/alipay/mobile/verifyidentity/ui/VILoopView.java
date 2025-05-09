package com.alipay.mobile.verifyidentity.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.tkt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VILoopView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Paint d;
    private Paint e;
    private int h;

    /* renamed from: a  reason: collision with root package name */
    private Bitmap f4466a = null;
    private Canvas b = null;
    private boolean c = false;
    private int f = 0;
    private long g = -1;

    public VILoopView(Context context) {
        super(context);
        a(context);
    }

    private Paint a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("86f68170", new Object[]{this, new Integer(i)});
        }
        if (this.f == i) {
            return this.d;
        }
        return this.e;
    }

    public static /* synthetic */ Object ipc$super(VILoopView vILoopView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/ui/VILoopView");
    }

    public static int toPixel(Context context, float f) {
        Resources resources;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48f2223d", new Object[]{context, new Float(f)})).intValue();
        }
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        return (int) (f * resources.getDisplayMetrics().density);
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            this.c = true;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (!this.c) {
            if (System.currentTimeMillis() - this.g >= 200) {
                this.g = System.currentTimeMillis();
                float pixel = toPixel(getContext(), 4.0f);
                this.b.drawCircle(toPixel(getContext(), 4.0f), pixel, this.h, a(0));
                this.b.drawCircle(toPixel(getContext(), 20.0f), pixel, this.h, a(1));
                this.b.drawCircle(toPixel(getContext(), 36.0f), pixel, this.h, a(2));
                this.b.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
                this.f = (this.f + 1) % 3;
            }
            canvas.drawBitmap(this.f4466a, 0.0f, 0.0f, new Paint());
            invalidate();
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(-1118482);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setColor(tkt.DEFAULT_SHADOW_COLOR);
        this.h = toPixel(getContext(), 4.0f);
        this.b = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(toPixel(context, 40.0f), toPixel(context, 8.0f), Bitmap.Config.ARGB_8888);
        this.f4466a = createBitmap;
        this.b.setBitmap(createBitmap);
    }

    public VILoopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }
}
