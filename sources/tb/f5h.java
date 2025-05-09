package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f5h implements dmc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final g2e f19026a;

    static {
        t2o.a(779092373);
        t2o.a(806355914);
    }

    public f5h() {
        g2e q = qau.q("tblive");
        this.f19026a = q;
        q.f(yj4.TRACK_ORANGES);
    }

    @Override // tb.dmc
    public void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35871006", new Object[]{this, str, str2, map});
            return;
        }
        HashMap hashMap = new HashMap();
        g2e g2eVar = this.f19026a;
        if (g2eVar != null) {
            for (Map.Entry<String, String> entry : g2eVar.e().entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        hashMap.put("tintType", str);
        hashMap.put("tintPage", str2);
        if (map != null) {
            hashMap.putAll(map);
        }
        if (v2s.o().E() != null) {
            v2s.o().E().trackCustom(yj4.STAIN_TRACK_PAGE, 2101, yj4.STAIN_TRACK_ARG1, null, null, hashMap);
        }
    }
}
