package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bef extends w30<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(315621403);
    }

    public bef(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(bef befVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/opentracing/api/tag/IntTag");
    }

    public void a(paq paqVar, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef7683a8", new Object[]{this, paqVar, num});
        } else {
            paqVar.f(this.f30428a, num);
        }
    }
}
