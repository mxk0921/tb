package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gnq extends kr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001874);
    }

    public gnq(View view, boolean z) {
        super(view, z, zwm.STICKY);
    }

    public static /* synthetic */ Object ipc$super(gnq gnqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/meta/uikit/header/behavior/StickyBehavior");
    }

    @Override // tb.kcc
    public int e(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b8e4ea6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        float f = this.b;
        float f2 = f - i;
        if (i < 0 && f2 > 0.0f) {
            f2 = 0.0f;
        } else if (i >= 0) {
            f2 = Math.max(0.0f, f2);
        }
        this.b = (int) f2;
        return (int) (f - f2);
    }

    public gnq(View view, boolean z, int i) {
        super(view, z, zwm.STICKY, i);
    }
}
