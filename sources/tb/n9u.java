package tb;

import android.os.Trace;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.streamv2.trace.TraceName;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class n9u {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final n9u INSTANCE = new n9u();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<TraceName, Long> f24598a = new LinkedHashMap();

    public final void a(TraceName traceName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e88b201", new Object[]{this, traceName});
            return;
        }
        ckf.g(traceName, "traceName");
        if (w2k.a()) {
            Trace.beginSection(traceName.name());
            f24598a.put(traceName, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public final void b(TraceName traceName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f86380f", new Object[]{this, traceName});
            return;
        }
        ckf.g(traceName, "traceName");
        if (w2k.a()) {
            Trace.endSection();
            StringBuilder sb = new StringBuilder();
            sb.append(traceName);
            sb.append(", time=");
            long currentTimeMillis = System.currentTimeMillis();
            Long l = (Long) ((LinkedHashMap) f24598a).get(traceName);
            sb.append(currentTimeMillis - (l != null ? l.longValue() : 0L));
            UnifyLog.d("NextRPC", sb.toString(), new Object[0]);
        }
    }
}
