package tb;

import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ilt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class uwj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final float g = o1p.a(10.0f);
    public static final int h = Color.parseColor("#ffecd0");
    public static final int i = o1p.a(17.0f);
    public static final int j = o1p.a(6.0f);

    /* renamed from: a  reason: collision with root package name */
    public final View f29649a;
    public final TextPaint b;
    public final tfe c;
    public String d;
    public int e;
    public float f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792402);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792401);
    }

    public uwj(View view) {
        ckf.g(view, "view");
        this.f29649a = view;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        this.c = new tfe(view, null, 2, null);
        textPaint.setTextSize(g);
        textPaint.setColor(h);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
        } else if (this.e != 0 && !TextUtils.isEmpty(this.d)) {
            this.c.d("https://gw.alicdn.com/imgextra/i2/O1CN01buNxLW1lRmNeEPWmb_!!6000000004816-2-tps-228-68.png", this.e, i);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
        } else {
            this.c.e();
        }
    }

    public final void c(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        if (!TextUtils.isEmpty(this.d)) {
            this.c.c(canvas);
            String str = this.d;
            ckf.d(str);
            kw1.a(canvas, this.b, (this.e - this.f) / 2.0f, str, 0.0f, i);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d54ae5", new Object[]{this});
        } else if (this.f <= 0.0f && !TextUtils.isEmpty(this.d)) {
            ilt.a aVar = ilt.Companion;
            String str = this.d;
            ckf.d(str);
            float a2 = aVar.a(str, this.b);
            this.f = a2;
            this.e = (int) (a2 + (j << 1));
            a();
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f52c69a", new Object[]{this, str});
        } else if (!TextUtils.equals(this.d, str)) {
            this.f = 0.0f;
            this.e = 0;
            this.d = str;
            b();
        }
    }
}
