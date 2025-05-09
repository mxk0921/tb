package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class x5v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, oz8> f31170a;

    public x5v(String str) {
        this(str, null);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a623f959", new Object[]{this});
            return;
        }
        Map<String, oz8> map = this.f31170a;
        if (map != null) {
            ((HashMap) map).clear();
        }
    }

    public x5v(String str, Map<String, String> map) {
        this.f31170a = new HashMap();
        b0r.a(OrangeConfig.getInstance().getConfig(idv.ORANGE_GROUP_NAME, "UmbrellaFullTraceSwitch", "true"), false);
    }
}
