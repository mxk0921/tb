package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ltg extends kr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001870);
    }

    public ltg(View view, boolean z, int i) {
        super(view, z, zwm.LIST_HEADER, i);
    }

    public static /* synthetic */ Object ipc$super(ltg ltgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/meta/uikit/header/behavior/ListBehavior");
    }

    @Override // tb.kcc
    public int e(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b8e4ea6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (k().getMeasuredHeight() == 0) {
            this.b = 0;
            return 0;
        }
        float f = this.b;
        float f2 = f - i;
        float f3 = 0.0f;
        if (i < 0 && f2 > 0.0f) {
            f2 = 0.0f;
        } else if (i > 0) {
            float measuredHeight = (k().getMeasuredHeight() + f2) - f();
            if (!p()) {
                measuredHeight += i2;
            }
            float f4 = i2;
            if (measuredHeight < f4) {
                if (p()) {
                    f3 = f4;
                }
                f2 = (f3 - k().getMeasuredHeight()) + f();
            }
        }
        this.b = (int) f2;
        if (p()) {
            j(1.0f - ((Math.abs(this.b) * 1.0f) / ((k().getMeasuredHeight() - f()) - i2)));
        } else {
            j(1.0f - ((Math.abs(this.b) * 1.0f) / (k().getMeasuredHeight() - f())));
        }
        return (int) (f - f2);
    }

    public View k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("88fe3592", new Object[]{this});
        }
        return this.f22863a;
    }

    public ltg(View view, boolean z, int i, zwm zwmVar) {
        super(view, z, zwmVar, i);
    }

    public ltg(View view, boolean z, zwm zwmVar) {
        super(view, z, zwmVar);
    }
}
