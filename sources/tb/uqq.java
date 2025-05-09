package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uqq extends w30<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(315621406);
    }

    public uqq(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(uqq uqqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/opentracing/api/tag/StringTag");
    }

    public void a(paq paqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843fd679", new Object[]{this, paqVar, str});
        } else {
            paqVar.X(this.f30428a, str);
        }
    }
}
