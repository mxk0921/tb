package tb;

import android.content.res.Resources;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zx0 extends bu2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final by0 i;

    static {
        t2o.a(620757051);
    }

    public zx0(by0 by0Var, String str, String str2, int i, int i2) {
        super(str, str2, i, i2);
        this.i = by0Var;
    }

    public static /* synthetic */ Object ipc$super(zx0 zx0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/cache/memory/AnimatedCachedImage");
    }

    @Override // tb.bu2
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        by0 by0Var = this.i;
        if (by0Var == null) {
            return 0;
        }
        return by0Var.getSizeInBytes();
    }

    @Override // tb.bu2
    public dtl d(String str, String str2, int i, int i2, boolean z, Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dtl) ipChange.ipc$dispatch("a6a39e79", new Object[]{this, str, str2, new Integer(i), new Integer(i2), new Boolean(z), resources});
        }
        return new cy0(str, str2, i, i2, this.i);
    }
}
