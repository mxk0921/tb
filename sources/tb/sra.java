package tb;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sra extends ltg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FrameLayout h;
    public View i;
    public int j;

    static {
        t2o.a(993001869);
    }

    public sra(View view, zwm zwmVar) {
        super(view, false, 0, zwmVar);
        n(view);
    }

    public static /* synthetic */ Object ipc$super(sra sraVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/meta/uikit/header/behavior/HalfStickyBehavior");
    }

    @Override // tb.kr1, tb.kcc
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86368875", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.ltg, tb.kcc
    public int e(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b8e4ea6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        float f = this.b;
        float f2 = f - i;
        float f3 = 0.0f;
        if (i < 0 && f2 > 0.0f) {
            f2 = 0.0f;
        } else if (i > 0) {
            float measuredHeight = (k().getMeasuredHeight() + f2) - this.e;
            if (!p()) {
                measuredHeight += i2;
            }
            float f4 = i2;
            if (measuredHeight < f4) {
                if (p()) {
                    f3 = f4;
                }
                f2 = this.e + (f3 - k().getMeasuredHeight());
                measuredHeight = f3;
            }
            int i4 = this.j;
            if (measuredHeight < i4) {
                f2 = this.e + (i4 - k().getMeasuredHeight());
            }
        }
        this.b = (int) f2;
        if (p()) {
            j(1.0f - ((Math.abs(this.b) * 1.0f) / ((k().getMeasuredHeight() - this.e) - i2)));
        } else {
            j(1.0f - ((Math.abs(this.b) * 1.0f) / (k().getMeasuredHeight() - this.e)));
        }
        int i5 = (int) (f - f2);
        this.i.setTranslationY(this.b);
        return i5;
    }

    @Override // tb.kr1
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5b5a8a", new Object[]{this})).intValue();
        }
        return -this.b;
    }

    @Override // tb.kr1
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.i.getMeasuredHeight();
    }

    @Override // tb.kr1
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.h;
    }

    @Override // tb.ltg
    public View k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("88fe3592", new Object[]{this});
        }
        return this.i;
    }

    public FrameLayout l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("7451d442", new Object[]{this, context});
        }
        return new FrameLayout(context);
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb5c1060", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public final void n(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce90a9db", new Object[]{this, view});
            return;
        }
        this.i = view;
        this.h = l(view.getContext());
        igw.a(view);
        if (view.getLayoutParams() != null) {
            this.h.addView(view);
        } else {
            this.h.addView(view, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbc7caa", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public sra(View view, boolean z, zwm zwmVar) {
        super(view, z, 0, zwmVar);
        n(view);
    }

    public sra(View view, boolean z, int i) {
        super(view, z, i, zwm.HALF_STICKY);
        n(view);
    }

    public sra(View view, boolean z, int i, zwm zwmVar) {
        super(view, z, i, zwmVar);
        n(view);
    }
}
