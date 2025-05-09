package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class i02 implements zkg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f21001a;
    public final boolean b;
    public final TextPaint c = new TextPaint(1);
    public final Paint d = new Paint(1);
    public final tfe e;
    public float f;
    public int g;
    public ykg h;
    public int i;
    public boolean j;

    static {
        t2o.a(815792387);
        t2o.a(815792392);
    }

    public i02(View view, boolean z) {
        ckf.g(view, "view");
        this.f21001a = view;
        this.b = z;
        this.e = new tfe(view, null, 2, null);
    }

    @Override // tb.zkg
    public void a(ykg ykgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbd43c", new Object[]{this, ykgVar, new Boolean(z)});
            return;
        }
        if (!this.j) {
            this.j = true;
            c();
        }
        if (this.h != ykgVar) {
            this.h = ykgVar;
            this.g = 0;
            this.f = 0.0f;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
            return;
        }
        ykg ykgVar = this.h;
        if (ykgVar != null && this.g > 0) {
            this.e.d(ykgVar.b(), this.i, h(ykgVar));
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca249742", new Object[]{this});
            return;
        }
        this.c.setColor(n());
        this.c.setTextSize(q());
        this.d.setColor(f());
    }

    public void d(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "cns");
        ykg ykgVar = this.h;
        if (ykgVar != null) {
            if (e() || this.f > 0.0f) {
                float k = k();
                float l = l();
                canvas.translate(k, l);
                if (this.f > 0.0f) {
                    canvas.drawRoundRect(0.0f, 0.0f, this.g, g(), m(), m(), this.d);
                }
                float g = (g() - h(ykgVar)) / 2.0f;
                int i = i();
                int i2 = (g > 0.0f ? 1 : (g == 0.0f ? 0 : -1));
                if (i2 > 0 || i > 0) {
                    canvas.translate(i, g);
                }
                this.e.c(canvas);
                if (i2 > 0 || i > 0) {
                    canvas.translate(-i, -g);
                }
                if (this.f > 0.0f) {
                    String f = ykgVar.f();
                    ckf.d(f);
                    kw1.a(canvas, this.c, i + this.i + o(), f, 0.0f, g());
                }
                canvas.translate(-k, -l);
            }
        }
    }

    @Override // tb.zkg
    public void detach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
        } else {
            this.e.e();
        }
    }

    public abstract boolean e();

    public abstract int f();

    public abstract int g();

    public abstract int h(ykg ykgVar);

    public abstract int i();

    public abstract int j(ykg ykgVar);

    public abstract float k();

    public abstract float l();

    public abstract float m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract float q();

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35dab6d0", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void s() {
        ykg ykgVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d54ae5", new Object[]{this});
        } else if (this.g <= 0 && (ykgVar = this.h) != null) {
            this.i = j(ykgVar);
            this.e.e();
            this.e.d(ykgVar.b(), this.i, h(ykgVar));
            this.f = 0.0f;
            t(ykgVar);
            int i = this.i + i();
            this.g = i;
            float f = this.f;
            if (f > 0.0f) {
                this.g = i + ((int) (f + o() + p()));
            }
        }
    }

    public final void t(ykg ykgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf99cfa", new Object[]{this, ykgVar});
            return;
        }
        String e = ykgVar.e();
        if (e != null) {
            if (ckf.b(e, "list")) {
                if (!this.b) {
                    return;
                }
            } else if (ckf.b(e, "wf") && this.b) {
                return;
            }
        }
        this.f = ilt.Companion.a(ykgVar.f(), this.c);
    }
}
