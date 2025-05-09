package tb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.uikit.iconlist.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tqp implements a.d, Drawable.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int t;

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f28888a;
    public final boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public com.taobao.search.mmd.uikit.iconlist.a g;
    public String h;
    public Drawable i;
    public float j;
    public String k;
    public int l;
    public Drawable m;
    public boolean n = false;
    public boolean o = false;
    public final float p;
    public float q;
    public String r;
    public Paint s;
    public String u;
    public int v;
    public List<b> w;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f28889a;
        public final boolean b;
        public final float c;

        static {
            t2o.a(815792576);
        }

        public static /* synthetic */ boolean a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5e2b2237", new Object[]{bVar})).booleanValue();
            }
            return bVar.b;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d702f88e", new Object[]{bVar});
            }
            return bVar.f28889a;
        }

        public static /* synthetic */ float c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("328a3261", new Object[]{bVar})).floatValue();
            }
            return bVar.c;
        }

        public b(String str, boolean z, float f) {
            this.f28889a = str;
            this.b = z;
            this.c = f;
        }
    }

    static {
        t2o.a(815792574);
        t2o.a(815792570);
    }

    public tqp(TextPaint textPaint, boolean z) {
        float a2 = p1p.a(12.0f);
        this.p = a2;
        this.q = a2;
        this.f28888a = textPaint;
        this.b = z;
    }

    public void a(Canvas canvas, Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bde7104c", new Object[]{this, canvas, typeface});
        } else if (this.g != null) {
            Drawable drawable = this.i;
            if (drawable != null) {
                if (!this.n) {
                    this.n = true;
                    drawable.setBounds(this.c, this.d, this.e, this.f);
                }
                this.i.setBounds(this.c, this.d, this.e, this.f);
                if ("circle".equals(this.r)) {
                    c();
                    int i = this.c;
                    int i2 = this.e;
                    canvas.drawCircle((i + i2) / 2.0f, (this.d + this.f) / 2.0f, ((i2 - i) / 2.0f) + 1.0f, this.s);
                }
                this.i.draw(canvas);
            }
        } else {
            if (this.b && this.f28888a.getTypeface() == null) {
                this.f28888a.setTypeface(typeface);
            }
            this.f28888a.setTextSize(this.q);
            this.f28888a.setFakeBoldText(this.o);
            this.f28888a.setColor(this.l);
            List<b> list = this.w;
            if (list == null || ((ArrayList) list).isEmpty() || this.v == this.l) {
                canvas.drawText(this.k, this.c, this.j, this.f28888a);
                return;
            }
            float f = this.c;
            Iterator it = ((ArrayList) this.w).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (b.a(bVar)) {
                    this.f28888a.setColor(this.v);
                } else {
                    this.f28888a.setColor(this.l);
                }
                canvas.drawText(b.b(bVar), f, this.j, this.f28888a);
                f += b.c(bVar);
            }
            this.f28888a.setColor(this.l);
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1d449e0", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaed3e30", new Object[]{this});
        } else if (this.s == null) {
            Paint paint = new Paint();
            this.s = paint;
            paint.setAntiAlias(true);
            this.s.setColor(Color.parseColor("#ff0040"));
            this.s.setStyle(Paint.Style.STROKE);
            this.s.setStrokeWidth(1.0f);
        }
    }

    public void d(String str, int i, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("544e5f8b", new Object[]{this, str, new Integer(i), context});
            return;
        }
        int i2 = this.f - this.d;
        int i3 = t;
        t = i3 + 1;
        this.g = new com.taobao.search.mmd.uikit.iconlist.a(context, this, i, i2, i3);
        if ("circle".equals(this.r)) {
            this.g.g(true);
        }
        this.h = str;
    }

    public void e(String str, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc43cfc7", new Object[]{this, str, new Float(f), new Integer(i)});
            return;
        }
        this.j = f;
        this.k = str;
        this.l = i;
    }

    public void f(String str, float f, int i, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da9c3d1b", new Object[]{this, str, new Float(f), new Integer(i), new Float(f2), new Boolean(z)});
            return;
        }
        this.j = f;
        this.k = str;
        this.l = i;
        if (f2 <= 0.0f) {
            f2 = this.p;
        }
        this.q = f2;
        this.o = z;
    }

    public void g(vuu vuuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46a2867c", new Object[]{this, vuuVar});
            return;
        }
        this.m = vuuVar;
        com.taobao.search.mmd.uikit.iconlist.a aVar = this.g;
        if (aVar != null) {
            aVar.h(this.h);
        }
    }

    public void h(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e04c29", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1876487", new Object[]{this, str});
        } else {
            this.r = str;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c16ae24", new Object[]{this, drawable});
            return;
        }
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            drawable2.invalidateSelf();
        }
    }

    @Override // com.taobao.search.mmd.uikit.iconlist.a.d
    public boolean isLayoutRequested() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb97a465", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        this.i = null;
        this.m = null;
        this.n = false;
        com.taobao.search.mmd.uikit.iconlist.a aVar = this.g;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void k(String str, float f, int i, float f2, boolean z, String str2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5beac17e", new Object[]{this, str, new Float(f), new Integer(i), new Float(f2), new Boolean(z), str2, new Integer(i2)});
            return;
        }
        f(str, f, i, f2, z);
        this.u = str2;
        this.v = i2;
        l();
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a286965c", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.u)) {
            this.w = new ArrayList();
            float measureText = this.f28888a.measureText(this.u);
            int i = 0;
            while (true) {
                int indexOf = this.k.indexOf(this.u, i);
                if (indexOf < 0) {
                    break;
                }
                String substring = this.k.substring(i, indexOf);
                ((ArrayList) this.w).add(new b(substring, false, this.f28888a.measureText(substring)));
                ((ArrayList) this.w).add(new b(this.u, true, measureText));
                i = this.u.length() + indexOf;
            }
            if (i < this.k.length()) {
                ((ArrayList) this.w).add(new b(this.k.substring(i), false, 0.0f));
            }
        }
    }

    @Override // com.taobao.search.mmd.uikit.iconlist.a.d
    public void onDrawableLoaded(BitmapDrawable bitmapDrawable, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b55dc0f", new Object[]{this, bitmapDrawable, new Integer(i), str});
        } else if (bitmapDrawable != null) {
            if (bitmapDrawable instanceof cy0) {
                if (l3p.INSTANCE.d()) {
                    ((cy0) bitmapDrawable).D();
                } else {
                    ((cy0) bitmapDrawable).C();
                }
            }
            this.i = bitmapDrawable;
            bitmapDrawable.setCallback(this);
            Drawable drawable = this.m;
            if (drawable != null) {
                drawable.invalidateSelf();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4282486", new Object[]{this, drawable, runnable, new Long(j)});
            return;
        }
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            drawable2.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77f3b17", new Object[]{this, drawable, runnable});
            return;
        }
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            drawable2.unscheduleSelf(runnable);
        }
    }
}
