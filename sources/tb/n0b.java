package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.xue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class n0b extends tv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public n0b(fdc fdcVar) {
        super(fdcVar, "");
    }

    public static /* synthetic */ Object ipc$super(n0b n0bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/litetao/HomeLiteTaoTabController");
    }

    @Override // tb.tv1
    public xue b(fdc fdcVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xue) ipChange.ipc$dispatch("dd4e6eed", new Object[]{this, fdcVar, str});
        }
        return new xue.b(new pvg()).d(new qvg(new lza(this, fdcVar))).c();
    }
}
