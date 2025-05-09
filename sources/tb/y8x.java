package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y8x extends yio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ hde d;
    public final /* synthetic */ x8x e;

    public y8x(x8x x8xVar, hde hdeVar) {
        this.e = x8xVar;
        this.d = hdeVar;
    }

    public static /* synthetic */ Object ipc$super(y8x y8xVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/ext/WeexUnicornExtendImpl$16");
    }

    @Override // tb.yio
    public void e() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4134b145", new Object[]{this});
        } else if (x8x.q(this.e) != null) {
            x8x.q(this.e).y(this.d);
        }
    }
}
