package com.flybird;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import com.alipay.birdnest.util.BorderHelper;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBFrameLayout extends FrameLayout implements IBorderable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BorderHelper f4928a;

    public FBFrameLayout(Context context) {
        super(context);
        this.f4928a = null;
        this.f4928a = new BorderHelper();
    }

    public static /* synthetic */ Object ipc$super(FBFrameLayout fBFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/flybird/FBFrameLayout");
        }
    }

    @Override // com.flybird.IBorderable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f4928a.a();
        this.f4928a = null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        try {
            super.draw(canvas);
            BorderHelper borderHelper = this.f4928a;
            if (borderHelper != null) {
                borderHelper.b(canvas);
            }
        } catch (Throwable th) {
            FBLogger.e("FBFrameLayout", th);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        try {
            BorderHelper borderHelper = this.f4928a;
            if (borderHelper != null) {
                borderHelper.a(canvas);
            }
            super.onDraw(canvas);
        } catch (Throwable th) {
            FBLogger.e("FBFrameLayout", th);
        }
    }

    @Override // com.flybird.IBorderable
    public void setBorder(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7080fd5", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.f4928a.a(i, i2);
        }
    }

    @Override // com.flybird.IBorderable
    public void setBorderRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e73d1fc", new Object[]{this, new Integer(i)});
        } else {
            this.f4928a.d = i;
        }
    }

    @Override // com.flybird.IBorderable
    public void setBorderRadiusArray(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f810ab", new Object[]{this, fArr});
        } else {
            this.f4928a.e = fArr;
        }
    }
}
