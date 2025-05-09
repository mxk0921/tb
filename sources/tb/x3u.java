package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class x3u extends esi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993002072);
    }

    public x3u(kae<?, ?> kaeVar) {
        super(kaeVar);
    }

    public static /* synthetic */ Object ipc$super(x3u x3uVar, String str, Object... objArr) {
        if (str.hashCode() == -1685172570) {
            return new Integer(super.e(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/refact/TopHeader");
    }

    @Override // tb.esi, tb.kcc
    public int e(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b8e4ea6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int e = super.e(i, i2, i3);
        if (c() > i2 - getHeight()) {
            getHeight();
        }
        return e;
    }
}
