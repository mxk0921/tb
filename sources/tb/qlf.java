package tb;

import android.animation.ValueAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qlf extends ltg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final auc h;
    public ValueAnimator i = null;
    public MetaLayout j;
    public final b k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            qlf.l(qlf.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            qlf qlfVar = qlf.this;
            qlf.s(qlfVar, 1.0f - ((Math.min(0, qlf.m(qlfVar)) * 1.0f) / ((qlf.n(qlf.this).getMeasuredHeight() - qlf.o(qlf.this)) - qlf.r(qlf.this).getListStart())));
            qlf.t(qlf.this).K0(true, qlf.this.h());
            qlf.r(qlf.this).requestLayout();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
    }

    static {
        t2o.a(815793429);
    }

    public qlf(auc aucVar, b bVar, View view, int i) {
        super(view, true, i);
        this.h = aucVar;
        this.k = bVar;
    }

    public static /* synthetic */ Object ipc$super(qlf qlfVar, String str, Object... objArr) {
        if (str.hashCode() == -342080794) {
            super.a(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/newsearch/widgets/IpTopHeaderBehavior");
    }

    public static /* synthetic */ int l(qlf qlfVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("face2f8c", new Object[]{qlfVar, new Integer(i)})).intValue();
        }
        qlfVar.b = i;
        return i;
    }

    public static /* synthetic */ int m(qlf qlfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("611fe45c", new Object[]{qlfVar})).intValue();
        }
        return qlfVar.b;
    }

    public static /* synthetic */ View n(qlf qlfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("71bc01ec", new Object[]{qlfVar});
        }
        return qlfVar.k();
    }

    public static /* synthetic */ int o(qlf qlfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18a2dbde", new Object[]{qlfVar})).intValue();
        }
        return qlfVar.e;
    }

    public static /* synthetic */ MetaLayout r(qlf qlfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaLayout) ipChange.ipc$dispatch("c8d81b21", new Object[]{qlfVar});
        }
        return qlfVar.j;
    }

    public static /* synthetic */ void s(qlf qlfVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349501f3", new Object[]{qlfVar, new Float(f)});
        } else {
            qlfVar.j(f);
        }
    }

    public static /* synthetic */ auc t(qlf qlfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (auc) ipChange.ipc$dispatch("d6408ad1", new Object[]{qlfVar});
        }
        return qlfVar.h;
    }

    @Override // tb.kr1, tb.kcc
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9c42e6", new Object[]{this, new Integer(i)});
        } else {
            super.a(i);
        }
    }

    @Override // tb.kr1, tb.kcc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2da086e", new Object[]{this, new Integer(i)});
            return;
        }
        this.j.setCanFling(true);
        int i2 = this.b;
        if (i2 > 0) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i2, 0);
            this.i = ofInt;
            ofInt.addUpdateListener(new a());
            this.i.start();
            if (this.b >= o1p.b(50)) {
                ((rlf) this.k).r3();
            }
        }
    }

    @Override // tb.kr1, tb.kcc
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86368875", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.kr1, tb.kcc
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be8e58d9", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.ltg, tb.kcc
    public int e(int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b8e4ea6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        float f = this.b;
        float f2 = i;
        float f3 = f - f2;
        if (i3 == 0) {
            u();
            if (this.b < 0 || i >= 0) {
                i4 = i;
                z2 = false;
            } else {
                i4 = (int) (f2 * 0.3f);
                if (i4 == 0) {
                    i4 = -1;
                }
                z2 = true;
            }
            float f4 = f - i4;
            if (i4 < -100000 && f4 > 0.0f) {
                f4 = 0.0f;
            } else if (i4 > 0) {
                float f5 = i2;
                if ((k().getMeasuredHeight() + f4) - this.e < f5) {
                    f4 = (f5 - k().getMeasuredHeight()) + this.e;
                }
            }
            MetaLayout metaLayout = this.j;
            if (f4 <= 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            metaLayout.setCanFling(z3);
            z = z2;
            f3 = f4;
        } else {
            if (i >= 0 || f3 <= 0.0f) {
                if (i > 0) {
                    float f6 = i2;
                    if ((k().getMeasuredHeight() + f3) - this.e < f6) {
                        f3 = (f6 - k().getMeasuredHeight()) + this.e;
                    }
                }
                i4 = i;
            } else {
                i4 = i;
                f3 = 0.0f;
            }
            z = false;
        }
        this.b = (int) f3;
        j(1.0f - ((Math.abs(Math.min(0, i5)) * 1.0f) / ((k().getMeasuredHeight() - this.e) - i2)));
        if (i3 == 1 && i4 < 0) {
            return i4;
        }
        if (z) {
            return i;
        }
        return (int) (f - f3);
    }

    @Override // tb.kr1
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5b5a8a", new Object[]{this})).intValue();
        }
        return (-this.b) + this.e;
    }

    @Override // tb.kr1, tb.kcc
    public void g(MetaLayout metaLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc7c587", new Object[]{this, metaLayout});
        } else {
            this.j = metaLayout;
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5115b1", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.i.cancel();
            this.i = null;
        }
    }
}
