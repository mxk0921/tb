package com.taobao.search.musie.component.shadow;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.search.musie.component.shadow.TbShadow;
import tb.t2o;
import tb.vuu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a extends vuu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Bitmap c;
    public TbShadow.a d;
    public UINode f;
    public int h;
    public boolean e = false;
    public float g = 1.0f;

    static {
        t2o.a(815792705);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/component/shadow/ShadowDrawable");
    }

    @Override // tb.vuu
    public void l(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        TbShadow.a aVar = this.d;
        if (aVar == null || !aVar.b()) {
            p();
            return;
        }
        q();
        canvas.save();
        float f = 1.0f / this.g;
        canvas.scale(f, f, 0.0f, 0.0f);
        canvas.translate(-((int) ((this.c.getWidth() - (this.f.getLayoutWidth() * this.g)) / 2.0f)), -((int) ((this.c.getHeight() - (this.f.getLayoutHeight() * this.g)) / 2.0f)));
        TbShadow.a aVar2 = this.d;
        int i = aVar2.f11587a;
        if (!(i == 0 && aVar2.b == 0)) {
            canvas.translate(i, aVar2.b);
        }
        canvas.drawBitmap(this.c, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    public void o(UINode uINode, TbShadow.a aVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7be1e13d", new Object[]{this, uINode, aVar, new Float(f)});
            return;
        }
        this.f = uINode;
        this.d = aVar;
        this.e = true;
        this.h = (int) f;
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa1e09a", new Object[]{this});
            return;
        }
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            bitmap.recycle();
            this.c = null;
        }
    }

    public final void q() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d717471", new Object[]{this});
            return;
        }
        boolean z2 = this.e;
        this.e = false;
        int i = this.d.c * 3;
        int layoutWidth = this.f.getLayoutWidth() + i;
        int layoutHeight = this.f.getLayoutHeight() + i;
        float f = layoutHeight;
        float f2 = layoutWidth;
        float f3 = (f * 1.0f) / f2;
        int max = (int) Math.max(f2 * 0.5f, 100.0f);
        int max2 = (int) Math.max(0.5f * f, max * f3);
        this.g = (max2 * 1.0f) / f;
        Bitmap bitmap = this.c;
        if (bitmap != null && bitmap.getWidth() == max && this.c.getHeight() == max2) {
            z = z2;
        } else {
            p();
            this.c = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
        }
        if (z) {
            Canvas canvas = new Canvas();
            canvas.setBitmap(this.c);
            float f4 = this.g;
            canvas.scale(f4, f4);
            this.d.a(canvas, layoutWidth, layoutHeight, this.h);
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        this.d = null;
        p();
    }
}
