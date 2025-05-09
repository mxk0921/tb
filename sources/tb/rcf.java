package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class rcf implements f8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Long> f27275a = new ConcurrentHashMap();
    public final Map<String, Object> b = new ConcurrentHashMap();

    static {
        t2o.a(839909841);
        t2o.a(839909838);
    }

    @Override // tb.f8d
    public void a(u1a<? super String, ? super Long, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ff6f50", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, "callback");
        for (Map.Entry entry : ((ConcurrentHashMap) this.f27275a).entrySet()) {
            u1aVar.invoke(entry.getKey(), entry.getValue());
        }
    }

    @Override // tb.f8d
    public void d(u1a<? super String, Object, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09ecf9b", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, "callback");
        for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
            u1aVar.invoke(entry.getKey(), entry.getValue());
        }
    }

    @Override // tb.f8d
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6691b1b0", new Object[]{this, str});
            return;
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        long uptimeMillis = SystemClock.uptimeMillis();
        ((ConcurrentHashMap) this.f27275a).put(str, Long.valueOf(uptimeMillis));
        TMSLogger.f("InstancePerformanceMonitor", "onStage: " + str + ", ts: " + uptimeMillis);
    }

    @Override // tb.f8d
    public void onProperty(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1991a501", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "key");
        ckf.g(obj, "value");
        ((ConcurrentHashMap) this.b).put(str, obj);
        TMSLogger.f("InstancePerformanceMonitor", "onProperty: " + str + ", value: " + obj);
    }
}
