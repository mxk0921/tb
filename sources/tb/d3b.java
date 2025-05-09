package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d3b extends nv1 implements iad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782820);
        t2o.a(488636430);
    }

    public d3b(lza lzaVar) {
        super(lzaVar);
    }

    public static /* synthetic */ Object ipc$super(d3b d3bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/hostservice/callbcak/impl/HomePopCallback");
    }

    @Override // tb.iad
    public void g(zve zveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69759066", new Object[]{this, zveVar});
        } else {
            w().v(zveVar);
        }
    }
}
