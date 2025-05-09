package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.tracelog.TraceModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k5s extends ov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809895);
    }

    public k5s(String str) {
        super(str);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("751f459e", new Object[0])).booleanValue();
        }
        return vxl.b().t();
    }

    public static void f(g9u g9uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d5874", new Object[]{g9uVar});
        } else if (e()) {
            g9uVar.c("TLogInterceptor", new k5s(g9uVar.a()));
            TLog.loge("home", "GlobalTrace", "register interceptor success, name=TLogInterceptor");
        }
    }

    public static /* synthetic */ Object ipc$super(k5s k5sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/tracelog/interceptor/TLogInterceptor");
    }

    @Override // tb.ov
    public boolean d(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("561fd916", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        return true;
    }

    @Override // tb.ov
    public boolean c(TraceModel traceModel, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6724b2dc", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        if (TextUtils.equals(traceModel.getName(), "homeFirstTouch")) {
            return false;
        }
        if (traceModel.isLaunchStage()) {
            str = "launchStage[";
        } else if (z) {
            str = "start[";
        } else {
            str = "end[";
        }
        g0b.j(str + traceModel.getPriority() + "], " + traceModel);
        return true;
    }
}
