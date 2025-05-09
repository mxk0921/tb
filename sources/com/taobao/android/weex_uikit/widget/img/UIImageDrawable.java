package com.taobao.android.weex_uikit.widget.img;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_uikit.ui.UINode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.dwh;
import tb.hpc;
import tb.hxh;
import tb.t2o;
import tb.vuu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UIImageDrawable extends vuu implements hpc.a, Drawable.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Drawable c;
    public Object d;
    public int e;
    public String f;
    public UIImageDrawable g;
    public Matrix h;
    public boolean i;
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public final Rect l = new Rect();
    public int m;
    public int n;
    public UINode o;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface ResizeMode {
    }

    static {
        t2o.a(986710143);
        t2o.a(982516044);
    }

    public static /* synthetic */ Object ipc$super(UIImageDrawable uIImageDrawable, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        } else if (hashCode == -913381501) {
            super.n((Rect) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/weex_uikit/widget/img/UIImageDrawable");
        }
    }

    public static int t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70110331", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 3;
        }
        str.hashCode();
        if (str.equals("cover")) {
            return 1;
        }
        if (!str.equals("contain")) {
            return 3;
        }
        return 2;
    }

    public final void A(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb68291d", new Object[]{this, mUSDKInstance});
        } else if (!TextUtils.isEmpty(this.f)) {
            mUSDKInstance.getImageAdapter().a(this.f, this);
            if (this.c != null) {
                mUSDKInstance.getImageAdapter().c(this.c, this);
            }
            this.c = null;
        }
    }

    public final void B(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aad2fa60", new Object[]{this, mUSDKInstance});
            return;
        }
        this.f = null;
        this.f30271a = null;
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
            if (mUSDKInstance.getImageAdapter() != null) {
                mUSDKInstance.getImageAdapter().c(this.c, this);
            }
            this.c = null;
        }
        this.d = null;
    }

    public void C(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5038a61", new Object[]{this, new Integer(i)});
        }
    }

    public void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbbb4a1", new Object[]{this, str});
            return;
        }
        this.e = t(str);
        UIImageDrawable uIImageDrawable = this.g;
        if (uIImageDrawable != null) {
            uIImageDrawable.D(str);
        }
        this.h = null;
        invalidateSelf();
    }

    public void E(MUSDKInstance mUSDKInstance, String str, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d20eaac6", new Object[]{this, mUSDKInstance, str, mUSImageQuality});
        } else if (mUSDKInstance.getImageAdapter() != null) {
            s();
            this.g.F(mUSDKInstance, str, mUSImageQuality);
        }
    }

    public void F(MUSDKInstance mUSDKInstance, String str, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa24b4d7", new Object[]{this, mUSDKInstance, str, mUSImageQuality});
        } else if (mUSDKInstance.getImageAdapter() != null) {
            A(mUSDKInstance);
            this.f = str;
            if (!TextUtils.isEmpty(str)) {
                mUSDKInstance.getImageAdapter().b(mUSDKInstance.getContext().a(), str, this, mUSImageQuality);
            }
            invalidateSelf();
        }
    }

    @Override // tb.hpc.a
    public void c(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ebcd44", new Object[]{this, drawable});
        } else if (hxh.a()) {
            this.c = drawable;
            drawable.setCallback(this);
            this.h = null;
            invalidateSelf();
            UINode uINode = this.o;
            if (uINode != null) {
                if ((uINode instanceof Image) && ((Image) uINode).mountState.b(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight())) {
                    this.o.notifyEngineRelayout();
                }
                w();
            }
        } else {
            throw new RuntimeException("should call this method from UI thread");
        }
    }

    @Override // tb.hpc.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e62fda", new Object[]{this});
        } else if (!hxh.a()) {
            throw new RuntimeException("should call this method from UI thread");
        } else if (this.o != null) {
            v();
        }
    }

    @Override // tb.hpc.a
    public void g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11aa67b", new Object[]{this, obj});
        } else {
            this.d = obj;
        }
    }

    @Override // tb.hpc.a
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.n;
    }

    @Override // tb.hpc.a
    public Object getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("61e2c7a7", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.hpc.a
    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c16ae24", new Object[]{this, drawable});
        } else if (getCallback() != null) {
            getCallback().invalidateDrawable(drawable);
            invalidateSelf();
        }
    }

    @Override // tb.vuu
    public void l(Canvas canvas) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        int width = getBounds().width();
        int height = getBounds().height();
        if (this.c == null) {
            UIImageDrawable uIImageDrawable = this.g;
            if (uIImageDrawable != null) {
                if (!(uIImageDrawable.getBounds().width() == width && this.g.getBounds().height() == height)) {
                    this.g.setBounds(0, 0, width, height);
                }
                try {
                    this.g.l(canvas);
                } catch (Throwable th) {
                    dwh.i(th);
                }
            }
        } else {
            o();
            if (this.i) {
                i = canvas.save();
                canvas.concat(this.h);
            } else {
                i = -1;
            }
            if (!this.c.getBounds().equals(this.l)) {
                this.c.setBounds(this.l);
            }
            try {
                this.c.draw(canvas);
            } catch (Throwable th2) {
                dwh.i(th2);
            }
            if (this.i) {
                canvas.restoreToCount(i);
            }
        }
    }

    @Override // tb.vuu
    public void n(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98ee783", new Object[]{this, rect});
            return;
        }
        super.n(rect);
        this.h = null;
        UIImageDrawable uIImageDrawable = this.g;
        if (uIImageDrawable != null) {
            uIImageDrawable.n(rect);
        }
    }

    public final void o() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ded244d6", new Object[]{this});
        } else if (this.h == null) {
            this.h = new Matrix();
            int intrinsicWidth = this.c.getIntrinsicWidth();
            int intrinsicHeight = this.c.getIntrinsicHeight();
            int width = (getBounds().width() - i()) - j();
            int height = (getBounds().height() - k()) - h();
            if ((intrinsicWidth < 0 || width == intrinsicWidth) && (intrinsicHeight < 0 || height == intrinsicHeight)) {
                z = true;
            } else {
                z = false;
            }
            int i = this.e;
            if (i == 1) {
                this.c.setBounds(i(), k(), i() + intrinsicWidth, k() + intrinsicHeight);
                this.l.set(this.c.getBounds());
                if (z) {
                    this.i = false;
                    return;
                }
                r(this.h, intrinsicWidth, intrinsicHeight, width, height);
            } else if (i == 2) {
                this.c.setBounds(i(), k(), i() + intrinsicWidth, k() + intrinsicHeight);
                this.l.set(this.c.getBounds());
                if (z) {
                    this.i = false;
                    return;
                }
                q(this.h, intrinsicWidth, intrinsicHeight, width, height);
            } else if (i == 3) {
                this.i = false;
                this.c.setBounds(i(), k(), i() + width, k() + height);
            }
            this.l.set(this.c.getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        super.onBoundsChange(rect);
        this.h = null;
    }

    public final void p(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3355ce15", new Object[]{this, mUSDKInstance});
        } else if (!TextUtils.isEmpty(this.f) && mUSDKInstance.getImageAdapter() != null) {
            mUSDKInstance.getImageAdapter().a(this.f, this);
        }
    }

    public final void q(Matrix matrix, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89343ae0", new Object[]{this, matrix, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.j.set(0.0f, 0.0f, i, i2);
        this.k.set(0.0f, 0.0f, i3, i4);
        matrix.setRectToRect(this.j, this.k, Matrix.ScaleToFit.CENTER);
        this.i = true;
    }

    public final void r(Matrix matrix, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af18e29d", new Object[]{this, matrix, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        float f3 = 0.0f;
        if (i * i4 > i3 * i2) {
            f = i4 / i2;
            f3 = (i3 - (i * f)) * 0.5f;
            f2 = 0.0f;
        } else {
            float f4 = i3 / i;
            f2 = (i4 - (i2 * f4)) * 0.5f;
            f = f4;
        }
        matrix.setScale(f, f);
        matrix.postTranslate(Math.round(f3), Math.round(f2));
        this.i = true;
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d125705c", new Object[]{this});
        } else if (this.g == null) {
            UIImageDrawable uIImageDrawable = new UIImageDrawable();
            this.g = uIImageDrawable;
            uIImageDrawable.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4282486", new Object[]{this, drawable, runnable, new Long(j)});
        } else if (getCallback() != null) {
            getCallback().scheduleDrawable(drawable, runnable, j);
            invalidateSelf();
        }
    }

    @Override // tb.vuu, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            return;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        UIImageDrawable uIImageDrawable = this.g;
        if (uIImageDrawable != null) {
            uIImageDrawable.setAlpha(i);
        }
    }

    public final void u(MUSDKInstance mUSDKInstance, String str, String str2, int i, int i2, int i3, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea0bda8", new Object[]{this, mUSDKInstance, str, str2, new Integer(i), new Integer(i2), new Integer(i3), mUSImageQuality});
            return;
        }
        this.e = t(str2);
        this.f = str;
        this.m = i2;
        this.n = i3;
        if (mUSDKInstance.getImageAdapter() == null) {
            dwh.w("UIImageDrawable", "image Adapter is null");
        } else if (!TextUtils.isEmpty(this.f)) {
            mUSDKInstance.getImageAdapter().b(mUSDKInstance.getContext().a(), this.f, this, mUSImageQuality);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77f3b17", new Object[]{this, drawable, runnable});
        } else if (getCallback() != null) {
            getCallback().unscheduleDrawable(drawable, runnable);
            invalidateSelf();
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c073f0e", new Object[]{this});
            return;
        }
        UINode uINode = this.o;
        if (uINode != null && uINode.getInstance() != null && this.o.getNodeInfo().n("fail")) {
            this.o.getInstance().fireEventOnNode(this.o.getNodeId(), "fail", null);
        }
    }

    public void w() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c93595", new Object[]{this});
            return;
        }
        UINode uINode = this.o;
        if (uINode != null) {
            if (uINode.getAttachedView() != null) {
                this.o.getAttachedView().markImageLoaded();
            }
            if (this.o.getInstance() != null && this.o.getNodeInfo().n("load")) {
                if (this.c != null) {
                    jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("width", (Object) String.valueOf(this.c.getIntrinsicWidth()));
                    jSONObject2.put("height", (Object) String.valueOf(this.c.getIntrinsicHeight()));
                    jSONObject.put("size", (Object) jSONObject2);
                } else {
                    jSONObject = null;
                }
                this.o.getInstance().fireEventOnNode(this.o.getNodeId(), "load", jSONObject);
            }
        }
    }

    public void x(UINode uINode, MUSDKInstance mUSDKInstance, String str, String str2, String str3, int i, int i2, int i3, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bffc02b8", new Object[]{this, uINode, mUSDKInstance, str, str2, str3, new Integer(i), new Integer(i2), new Integer(i3), mUSImageQuality});
            return;
        }
        this.o = uINode;
        if (!TextUtils.isEmpty(str2)) {
            s();
            this.g.n(this.f30271a);
            this.g.u(mUSDKInstance, str2, str3, i, i2, i3, mUSImageQuality);
        }
        u(mUSDKInstance, str, str3, i, i2, i3, mUSImageQuality);
    }

    public void y(UINode uINode, MUSDKInstance mUSDKInstance, String str, String str2, String str3, int i, int i2, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f05121", new Object[]{this, uINode, mUSDKInstance, str, str2, str3, new Integer(i), new Integer(i2), mUSImageQuality});
            return;
        }
        this.o = uINode;
        if (!TextUtils.isEmpty(str2)) {
            s();
            this.g.n(this.f30271a);
            this.g.u(mUSDKInstance, str2, str3, 0, i, i2, mUSImageQuality);
        }
        u(mUSDKInstance, str, str3, 0, i, i2, mUSImageQuality);
    }

    public void z(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b5b64ae", new Object[]{this, mUSDKInstance});
            return;
        }
        this.o = null;
        p(mUSDKInstance);
        UIImageDrawable uIImageDrawable = this.g;
        if (uIImageDrawable != null) {
            uIImageDrawable.p(mUSDKInstance);
            this.g.B(mUSDKInstance);
        }
        B(mUSDKInstance);
    }
}
