package tb;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class sfe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f28010a;
    public final hpc b;
    public final boolean c;
    public Drawable d;
    public Matrix f;
    public final RectF e = new RectF();
    public final Rect g = new Rect();
    public final RectF h = new RectF();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements ufe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Object f28011a;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        public a(int i, int i2) {
            this.c = i;
            this.d = i2;
        }

        @Override // tb.hpc.a
        public void c(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56ebcd44", new Object[]{this, drawable});
                return;
            }
            sfe.f(sfe.this, drawable);
            cy0 cy0Var = null;
            if (drawable != null) {
                sfe sfeVar = sfe.this;
                int i = this.c;
                int i2 = this.d;
                if (sfeVar.i()) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    sfe.e(sfeVar, new Matrix());
                    Matrix b = sfe.b(sfeVar);
                    ckf.d(b);
                    sfe.a(sfeVar, b, intrinsicWidth, intrinsicHeight, i, i2);
                } else {
                    sfe.e(sfeVar, null);
                    drawable.setBounds(0, 0, i, i2);
                }
                sfe.c(sfeVar).set(drawable.getBounds());
                drawable.setCallback(sfe.d(sfeVar));
            }
            if (drawable instanceof cy0) {
                cy0Var = (cy0) drawable;
            }
            if (cy0Var != null) {
                cy0Var.C();
            }
            sfe.d(sfe.this).invalidate();
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
                this.f28011a = obj;
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
            return this.f28011a;
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
        t2o.a(815793034);
    }

    public sfe(View view, hpc hpcVar, boolean z) {
        ckf.g(view, "view");
        ckf.g(hpcVar, "delegateAdapter");
        this.f28010a = view;
        this.b = hpcVar;
        this.c = z;
    }

    public static final /* synthetic */ void a(sfe sfeVar, Matrix matrix, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13afa0f6", new Object[]{sfeVar, matrix, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            sfeVar.g(matrix, i, i2, i3, i4);
        }
    }

    public static final /* synthetic */ Matrix b(sfe sfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("58dbb8c0", new Object[]{sfeVar});
        }
        return sfeVar.f;
    }

    public static final /* synthetic */ Rect c(sfe sfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("29b95195", new Object[]{sfeVar});
        }
        return sfeVar.g;
    }

    public static final /* synthetic */ View d(sfe sfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8af92076", new Object[]{sfeVar});
        }
        return sfeVar.f28010a;
    }

    public static final /* synthetic */ void e(sfe sfeVar, Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8716bb4", new Object[]{sfeVar, matrix});
        } else {
            sfeVar.f = matrix;
        }
    }

    public static final /* synthetic */ void f(sfe sfeVar, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd5bd7a", new Object[]{sfeVar, drawable});
        } else {
            sfeVar.d = drawable;
        }
    }

    public final void g(Matrix matrix, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89343ae0", new Object[]{this, matrix, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.e.set(0.0f, 0.0f, i, i2);
        this.h.set(0.0f, 0.0f, i3, i4);
        matrix.setRectToRect(this.e, this.h, Matrix.ScaleToFit.CENTER);
    }

    public final void h(Canvas canvas) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        Drawable drawable = this.d;
        if (drawable != null) {
            if (this.f != null) {
                i = canvas.save();
                canvas.concat(this.f);
            } else {
                i = -1;
            }
            if (!ckf.b(drawable.getBounds(), this.g)) {
                drawable.setBounds(this.g);
            }
            try {
                drawable.draw(canvas);
            } catch (Throwable th) {
                dwh.i(th);
            }
            if (this.f != null) {
                canvas.restoreToCount(i);
            }
        }
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e61c6629", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final void j(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e20030", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (!TextUtils.isEmpty(str)) {
            this.b.b(this.f28010a.getContext(), str, new a(i, i2), MUSImageQuality.AUTO);
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470471a7", new Object[]{this});
        } else if (this.b == null) {
            uvh.f().e();
        }
    }
}
