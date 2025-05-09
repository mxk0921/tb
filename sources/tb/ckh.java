package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ckh extends w30<Long> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(315621405);
    }

    public ckh(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(ckh ckhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/opentracing/api/tag/LongTag");
    }

    public void a(paq paqVar, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270c44ae", new Object[]{this, paqVar, l});
        } else {
            paqVar.f(this.f30428a, l);
        }
    }
}
