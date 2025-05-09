package tb;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rbp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String j = rbp.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public String f27264a;
    public Paint c;
    public int b = -1;
    public BitmapDrawable d = null;
    public Path e = null;
    public RectF f = null;
    public final int g = pb6.c(Globals.getApplication(), 18.0f);
    public int h = -1;
    public int i = pb6.s(Globals.getApplication());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            rbp.b(rbp.this, succPhenixEvent.getDrawable());
            rbp rbpVar = rbp.this;
            rbp.c(rbpVar, rbp.a(rbpVar));
            return false;
        }
    }

    static {
        t2o.a(491782840);
    }

    public rbp() {
        g();
    }

    public static /* synthetic */ BitmapDrawable a(rbp rbpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("8d5c03e0", new Object[]{rbpVar});
        }
        return rbpVar.d;
    }

    public static /* synthetic */ BitmapDrawable b(rbp rbpVar, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("d24ee6cd", new Object[]{rbpVar, bitmapDrawable});
        }
        rbpVar.d = bitmapDrawable;
        return bitmapDrawable;
    }

    public static /* synthetic */ void c(rbp rbpVar, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c865b3ce", new Object[]{rbpVar, drawable});
        } else {
            rbpVar.d(drawable);
        }
    }

    public final void d(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c117b", new Object[]{this, drawable});
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth < 0) {
            this.h = 0;
        } else {
            this.h = (this.i * intrinsicHeight) / intrinsicWidth;
        }
    }

    public final void e(View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35c2568b", new Object[]{this, view, viewGroup});
            return;
        }
        if (this.e == null) {
            this.e = new Path();
        }
        if (this.f == null) {
            this.f = new RectF();
        }
        this.e.reset();
        this.e.moveTo(viewGroup.getLeft(), viewGroup.getBottom());
        this.e.lineTo(viewGroup.getLeft(), view.getTop() + this.g);
        this.f.set(viewGroup.getLeft(), view.getTop(), viewGroup.getLeft() + (this.g * 2), view.getTop() + (this.g * 2));
        this.e.arcTo(this.f, 180.0f, 90.0f);
        this.e.lineTo(viewGroup.getRight() - this.g, view.getTop());
        this.f.set(viewGroup.getRight() - (this.g * 2), view.getTop(), viewGroup.getRight(), view.getTop() + (this.g * 2));
        this.e.arcTo(this.f, 270.0f, 90.0f);
        this.e.lineTo(viewGroup.getRight(), viewGroup.getBottom());
        this.e.close();
    }

    public void f(Canvas canvas, ViewGroup viewGroup, View view, int i, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa747db", new Object[]{this, canvas, viewGroup, view, new Integer(i), iArr});
            return;
        }
        canvas.save();
        this.c.setColor(this.b);
        if (view != null) {
            BitmapDrawable bitmapDrawable = this.d;
            if (bitmapDrawable != null) {
                bitmapDrawable.setBounds(0, view.getTop(), this.i, view.getTop() + this.h);
                this.d.draw(canvas);
                canvas.drawRect(viewGroup.getLeft(), view.getTop() + this.h, viewGroup.getRight(), viewGroup.getBottom(), this.c);
            } else {
                e(view, viewGroup);
                canvas.drawPath(this.e, this.c);
            }
        } else if (iArr == null || iArr[0] <= i) {
            this.c.setColor(0);
            canvas.drawRect(0.0f, 0.0f, viewGroup.getRight(), viewGroup.getBottom(), this.c);
        } else {
            canvas.drawRect(0.0f, 0.0f, viewGroup.getRight(), viewGroup.getBottom(), this.c);
        }
        canvas.restore();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c866a327", new Object[]{this});
            return;
        }
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.c.setColor(-1);
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e637b98d", new Object[]{this, str});
        } else {
            s0m.B().U(p2b.c(str, null), str).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, p2b.f(str, "5401")).succListener(new a()).fetch();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885643da", new Object[]{this});
            return;
        }
        this.i = pb6.s(Globals.getApplication());
        BitmapDrawable bitmapDrawable = this.d;
        if (bitmapDrawable != null) {
            d(bitmapDrawable);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5bdb53", new Object[]{this});
            return;
        }
        this.d = null;
        this.f27264a = null;
        this.c.setColor(-1);
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("443c99d8", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                this.b = Color.parseColor(str);
            } catch (Exception e) {
                fve.e(j, "setMaskBackgroundColor color error");
                e.printStackTrace();
            }
        } else {
            this.b = -1;
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ba3728", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            j();
        } else {
            if (this.d == null || !str.equals(this.f27264a)) {
                h(str);
            }
            this.f27264a = str;
        }
    }
}
