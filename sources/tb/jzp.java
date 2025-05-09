package tb;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ilt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class jzp extends l32 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final float i;
    public static final int j;
    public final g1n b;
    public final boolean c;
    public final View d;
    public final Paint e;
    public final Paint f;
    public int g;
    public static final a Companion = new a(null);
    public static final int h = Color.parseColor("#f7f7f7");
    public static final int k = Color.parseColor("#333333");
    public static final int l = Color.parseColor("#999999");
    public static final int m = o1p.a(6.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792444);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue();
            }
            return jzp.d();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792443);
        float a2 = o1p.a(12.0f);
        i = a2;
        j = (int) a2;
    }

    public jzp(g1n g1nVar, Integer num, boolean z, View view) {
        int i2;
        ckf.g(g1nVar, "info");
        ckf.g(view, "view");
        this.b = g1nVar;
        this.c = z;
        this.d = view;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint.setColor(h);
        if (num != null) {
            i2 = num.intValue();
        } else if (z) {
            i2 = k;
        } else {
            i2 = l;
        }
        paint2.setColor(i2);
        paint2.setTextSize(i);
    }

    public static final /* synthetic */ int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87db8426", new Object[0])).intValue();
        }
        return j;
    }

    public static /* synthetic */ Object ipc$super(jzp jzpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/property/SingleLineDrawable");
    }

    @Override // tb.gtd
    public void draw(Canvas canvas) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        if (this.c) {
            float height = this.d.getHeight() / 2.0f;
            canvas.drawRoundRect(0.0f, 0.0f, this.g, this.d.getHeight(), height, height, this.e);
            f = 0.0f + m;
        } else {
            f = 0.0f;
        }
        if (this.b.a()) {
            kw1.a(canvas, this.f, f, this.b.b(), 0.0f, this.d.getHeight());
        } else {
            kw1.a(canvas, this.f, f, this.b.c(), 0.0f, this.d.getHeight());
        }
    }

    @Override // tb.gtd
    public int getWidth() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        if (this.g == 0) {
            float f = 0.0f;
            if (this.c) {
                f = 0.0f + (m * 2);
            }
            ilt.a aVar = ilt.Companion;
            if (this.b.a()) {
                str = this.b.b();
            } else {
                str = this.b.c();
            }
            this.g = (int) (f + aVar.a(str, this.f));
        }
        return this.g;
    }
}
