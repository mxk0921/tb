package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.xue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class n58 extends tv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public n58(fdc fdcVar) {
        super(fdcVar, "");
    }

    public static /* synthetic */ Object ipc$super(n58 n58Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/dynamictab/DynamicTabController");
    }

    @Override // tb.tv1
    public xue b(fdc fdcVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xue) ipChange.ipc$dispatch("dd4e6eed", new Object[]{this, fdcVar, str});
        }
        return new xue.b(new p48()).d(new z48(new lza(this, fdcVar))).c();
    }

    @Override // tb.tv1, tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnablePullReFresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20c9b34", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
