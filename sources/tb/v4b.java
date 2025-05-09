package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class v4b extends nv1 implements c8e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782824);
        t2o.a(488636434);
    }

    public v4b(lza lzaVar) {
        super(lzaVar);
    }

    public static /* synthetic */ Object ipc$super(v4b v4bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/hostservice/callbcak/impl/HomeUtCallback");
    }

    @Override // tb.c8e
    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a94ff3", new Object[]{this, map});
        } else {
            w().B(map);
        }
    }
}
