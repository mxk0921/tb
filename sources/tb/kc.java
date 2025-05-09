package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.tracelog.TraceModel;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kc extends ov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809887);
    }

    public kc(String str) {
        super(str);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("751f459e", new Object[0])).booleanValue();
        }
        return true;
    }

    public static void g(g9u g9uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d5874", new Object[]{g9uVar});
        } else if (e()) {
            g9uVar.c("APMLauncherInterceptor", new kc(g9uVar.a()));
            TLog.loge("home", "GlobalTrace", "register interceptor success, name=APMLauncherInterceptor");
        }
    }

    public static /* synthetic */ Object ipc$super(kc kcVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/tracelog/interceptor/APMLauncherInterceptor");
    }

    @Override // tb.ov
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b10ec9bd", new Object[]{this})).intValue();
        }
        return 2;
    }

    @Override // tb.ov
    public boolean d(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("561fd916", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        if ((z || !TextUtils.equals(traceModel.getName(), "homeSmoothInteractive")) && traceModel.getPriority() != 2) {
            return false;
        }
        return true;
    }

    public final String f(TraceModel traceModel, String str) {
        Map<String, Object> subProperties;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3bdaf3c", new Object[]{this, traceModel, str});
        }
        if (traceModel == null || TextUtils.isEmpty(str) || (subProperties = traceModel.getSubProperties()) == null || (obj = subProperties.get(str)) == null) {
            return null;
        }
        return obj.toString();
    }

    @Override // tb.ov
    public boolean c(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6724b2dc", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        String name = traceModel.getName();
        if (TextUtils.equals(name, "homeSmoothInteractive")) {
            vxm.b.e().j("smoothInteractiveTime", traceModel.getEndTime());
            return true;
        }
        String f = f(traceModel, "requestType");
        if (!TextUtils.isEmpty(f) && !TextUtils.equals("coldStart", f) && !TextUtils.equals(s0j.MTS_SUB_STAGE_LOAD_CACHE, f) && !TextUtils.equals("locationChange", f)) {
            return false;
        }
        String str = "Home_" + name;
        if (z) {
            u5r.i(str);
        } else {
            String f2 = f(traceModel, g0b.h(traceModel.getName()));
            if (TextUtils.isEmpty(f2) || Boolean.valueOf(f2).booleanValue()) {
                u5r.j(str, traceModel.getSubProperties());
            } else {
                u5r.h(str, this.f25669a, traceModel.getSubProperties());
            }
        }
        return true;
    }
}
