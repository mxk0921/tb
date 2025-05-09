package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.tracelog.TraceModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e2b extends ov {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile e2b c;
    public final Map<String, Long> b = new ConcurrentHashMap();

    static {
        t2o.a(729809891);
    }

    public e2b(String str) {
        super(str);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("751f459e", new Object[0])).booleanValue();
        }
        return f4b.b("enableHomePageDataRecorder", true);
    }

    public static e2b f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2b) ipChange.ipc$dispatch("211b876c", new Object[0]);
        }
        return c;
    }

    public static void h(g9u g9uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d5874", new Object[]{g9uVar});
        } else if (e()) {
            c = new e2b(g9uVar.a());
            g9uVar.c("HomePageApmInterceptor", c);
            TLog.loge("home", "GlobalTrace", "register interceptor success, name=HomePageApmInterceptor");
        }
    }

    public static /* synthetic */ Object ipc$super(e2b e2bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/tracelog/interceptor/HomePageApmInterceptor");
    }

    @Override // tb.ov
    public boolean c(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6724b2dc", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        String name = traceModel.getName();
        if (name.startsWith("homeLoading")) {
            return false;
        }
        if (z) {
            ((ConcurrentHashMap) this.b).put(name.concat("_start"), Long.valueOf(traceModel.getStartTime()));
        } else {
            ((ConcurrentHashMap) this.b).put(name.concat("_end"), Long.valueOf(traceModel.getEndTime()));
        }
        return false;
    }

    @Override // tb.ov
    public boolean d(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("561fd916", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        String name = traceModel.getName();
        if (traceModel.getPriority() == 4 || TextUtils.isEmpty(name)) {
            return false;
        }
        return true;
    }

    public Map<String, Long> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8658c9e7", new Object[]{this});
        }
        return this.b;
    }
}
