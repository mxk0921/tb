package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.tracelog.TraceModel;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uu3 extends ov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809890);
    }

    public uu3(String str) {
        super(str);
    }

    public static void f(g9u g9uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d5874", new Object[]{g9uVar});
            return;
        }
        g9uVar.c("ClientToServiceStageInterceptor", new uu3(g9uVar.a()));
        TLog.loge("home", "GlobalTrace", "register interceptor success, name=ClientToServiceStageInterceptor");
    }

    public static /* synthetic */ Object ipc$super(uu3 uu3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/tracelog/interceptor/ClientToServiceStageInterceptor");
    }

    @Override // tb.ov
    public boolean c(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6724b2dc", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        e(traceModel.getCostTime(), traceModel.getEndTime() - g0b.e());
        return false;
    }

    public final void e(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f78d5bf4", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("coldStartFromProcessStartTime", String.valueOf(j));
            hashMap.put("coldstartTime", String.valueOf(j2));
        } catch (Exception e) {
            TLog.loge("home", "GlobalTrace", "commitMonitorData occur Exception" + e);
        }
        HashMap hashMap2 = new HashMap(8);
        hashMap2.put(PopConst.POP_CLIENT_PARAMS_KEY, hashMap);
        wri.d().b("nativeColdStart", z4a.NEW_FACE_PARENT.c, hashMap2);
        fve.e("ClientToServiceStageInterceptor", "上传冷启时间");
    }

    @Override // tb.ov
    public boolean d(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("561fd916", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        if (f4b.b("enableOpenStabilityMonitor", true)) {
            return "homeVisible".equals(traceModel.getName());
        }
        fve.e("ClientToServiceStageInterceptor", "orange开关关闭");
        return false;
    }
}
