package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wlt extends ylt implements vlt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(315621395);
        t2o.a(315621394);
    }

    public wlt(Map<String, String> map) {
        super(map);
    }

    public static /* synthetic */ Object ipc$super(wlt wltVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/opentracing/api/propagation/TextMapAdapter");
    }

    @Override // tb.zlt
    public void put(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fc7a2a", new Object[]{this, str, str2});
        } else {
            this.f32179a.put(str, str2);
        }
    }
}
