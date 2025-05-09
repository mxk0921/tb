package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class mnq extends kr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Boolean h;
    public final int i;
    public final dvk j;
    public boolean k;

    static {
        t2o.a(815793421);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnq(View view, Boolean bool, phw<?, ?, ?> phwVar, boolean z, int i, dvk dvkVar) {
        super(view, z, new zwm(1000, 1001, 3000), 0);
        ckf.g(phwVar, "widget");
        this.h = bool;
        this.i = i;
        this.j = dvkVar;
    }

    public static /* synthetic */ Object ipc$super(mnq mnqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/newsearch/header/StickySceneHeaderBehavior");
    }

    @Override // tb.kcc
    public int e(int i, int i2, int i3) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b8e4ea6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (ckf.b(this.h, Boolean.TRUE)) {
            if (i != 0) {
                if (i <= 0) {
                    z = false;
                }
                if (this.k != z) {
                    dvk dvkVar = this.j;
                    if (dvkVar != null) {
                        dvkVar.a(z);
                    }
                    this.k = z;
                }
            }
            return 0;
        }
        float f = this.b;
        float f2 = f - i;
        int min = Math.min(this.i, this.f22863a.getMeasuredHeight());
        if (i < 0 && f2 > 0.0f) {
            f2 = 0.0f;
        } else if (i > 0) {
            float measuredHeight = (this.f22863a.getMeasuredHeight() + f2) - f();
            if (!p()) {
                measuredHeight += i2;
            }
            float f3 = i2 + min;
            if (measuredHeight < f3) {
                if (!p()) {
                    f3 = min;
                }
                f2 = (f3 - this.f22863a.getMeasuredHeight()) + f();
            }
        }
        this.b = (int) f2;
        if (p()) {
            j(1.0f - ((Math.abs(this.b) * 1.0f) / (((this.f22863a.getMeasuredHeight() - f()) - i2) - min)));
        } else {
            j(1.0f - ((Math.abs(this.b) * 1.0f) / ((this.f22863a.getMeasuredHeight() - f()) - min)));
        }
        if (h() >= 1.0E-6f) {
            z = false;
        }
        if (this.k != z) {
            dvk dvkVar2 = this.j;
            if (dvkVar2 != null) {
                dvkVar2.a(z);
            }
            this.k = z;
        }
        return (int) (f - f2);
    }
}
