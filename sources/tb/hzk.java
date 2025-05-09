package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.thc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class hzk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hzk INSTANCE = new hzk();

    static {
        t2o.a(1004536608);
    }

    public final void a(zyk zykVar, u1a<? super l0g, ? super Boolean, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("823174fb", new Object[]{this, zykVar, u1aVar});
            return;
        }
        ckf.g(zykVar, "heartBeatObj");
        ckf.g(u1aVar, "callback");
        Map f = v3i.f(jpu.a("v", "1.0"));
        thc.a.b(mhr.d0(), "mtop.taobao.content.log.live.heartbeat.report", "1.0", zykVar.o(), v3i.f(jpu.a(p1t.kLiveMtopBizCodeKey, "TAOBAO")), f, null, null, u1aVar, 96, null);
    }
}
