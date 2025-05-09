package tb;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class tfe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f28684a;
    public final hpc b;
    public Drawable c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements ufe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Object f28685a;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        public a(int i, int i2) {
            this.c = i;
            this.d = i2;
        }

        @Override // tb.hpc.a
        public void c(Drawable drawable) {
            cy0 cy0Var;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56ebcd44", new Object[]{this, drawable});
                return;
            }
            tfe.b(tfe.this, drawable);
            if (drawable != null) {
                drawable.setBounds(0, 0, this.c, this.d);
            }
            if (drawable != null) {
                drawable.setCallback(tfe.a(tfe.this));
            }
            if (drawable instanceof cy0) {
                cy0Var = (cy0) drawable;
            } else {
                cy0Var = null;
            }
            if (cy0Var != null) {
                cy0Var.C();
            }
            tfe.a(tfe.this).invalidate();
        }

        @Override // tb.hpc.a
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5e62fda", new Object[]{this});
            }
        }

        @Override // tb.hpc.a
        public void g(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e11aa67b", new Object[]{this, obj});
            } else {
                this.f28685a = obj;
            }
        }

        @Override // tb.hpc.a
        public int getHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
            }
            return this.d;
        }

        @Override // tb.hpc.a
        public Object getTag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("61e2c7a7", new Object[]{this});
            }
            return this.f28685a;
        }

        @Override // tb.hpc.a
        public int getWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
            }
            return this.c;
        }
    }

    static {
        t2o.a(815792321);
    }

    public tfe(View view, hpc hpcVar) {
        ckf.g(view, "view");
        this.f28684a = view;
        this.b = hpcVar;
    }

    public static final /* synthetic */ View a(tfe tfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b59f919", new Object[]{tfeVar});
        }
        return tfeVar.f28684a;
    }

    public static final /* synthetic */ void b(tfe tfeVar, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d76e9add", new Object[]{tfeVar, drawable});
        } else {
            tfeVar.c = drawable;
        }
    }

    public final void c(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public final void d(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e20030", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (!TextUtils.isEmpty(str)) {
            hpc hpcVar = this.b;
            if (hpcVar != null || (hpcVar = uvh.f().e()) != null) {
                hpcVar.b(this.f28684a.getContext(), str, new a(i, i2), MUSImageQuality.AUTO);
            }
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470471a7", new Object[]{this});
        } else if (this.b == null) {
            uvh.f().e();
        }
    }

    public /* synthetic */ tfe(View view, hpc hpcVar, int i, a07 a07Var) {
        this(view, (i & 2) != 0 ? null : hpcVar);
    }
}
