package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.tracelog.TraceModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class ov {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INTERCEPTOR_THREAD_ASYNC = 1;
    public static final int INTERCEPTOR_THREAD_CURRENT = 2;
    public static final int INTERCEPTOR_THREAD_MAIN = 3;

    /* renamed from: a  reason: collision with root package name */
    public final String f25669a;

    static {
        t2o.a(729809888);
    }

    public ov(String str) {
        this.f25669a = str;
    }

    public final boolean a(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8392b211", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        if (traceModel != null) {
            try {
                if (d(traceModel, z)) {
                    return c(traceModel, z);
                }
            } catch (Throwable th) {
                TLog.loge("home", "GlobalTrace", "do intercept error", th);
            }
        }
        return false;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b10ec9bd", new Object[]{this})).intValue();
        }
        return 1;
    }

    public abstract boolean c(TraceModel traceModel, boolean z);

    public abstract boolean d(TraceModel traceModel, boolean z);
}
