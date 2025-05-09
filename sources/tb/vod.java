package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.TurboEngineConfig;
import com.taobao.monitor.procedure.IPage;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface vod {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601252);
        }

        public static /* synthetic */ String a(vod vodVar, String str, String str2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dc45d0f0", new Object[]{vodVar, str, str2, new Integer(i), obj});
            }
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                return vodVar.c(str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: beginMetricsTask");
        }

        public static /* synthetic */ void b(vod vodVar, String str, boolean z, long j, String str2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33475de9", new Object[]{vodVar, str, new Boolean(z), new Long(j), str2, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 8) != 0) {
                    str2 = null;
                }
                vodVar.a(str, z, j, str2);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endMetricsStage");
            }
        }

        public static /* synthetic */ void c(vod vodVar, String str, boolean z, String str2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("446d3efd", new Object[]{vodVar, str, new Boolean(z), str2, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                vodVar.l(str, z, str2);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endMetricsStage");
            }
        }

        public static /* synthetic */ void d(vod vodVar, String str, boolean z, String str2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71cf1b14", new Object[]{vodVar, str, new Boolean(z), str2, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                vodVar.h(str, z, str2);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endMetricsTask");
            }
        }
    }

    void F(String str, z0d z0dVar);

    TurboEngineConfig G();

    void H(String str, z0d z0dVar);

    Map<String, String> R();

    void a(String str, boolean z, long j, String str2);

    String c(String str, String str2);

    void g(String str, long j, String str2);

    int getScrollState();

    void h(String str, boolean z, String str2);

    void i(String str, String str2);

    void j(boolean z, String str, String str2);

    void k(String str, String str2, boolean z);

    void l(String str, boolean z, String str2);

    void m(boolean z, String str, long j, String str2);

    void n(String str, Object obj, String str2);

    IPage o(String str);

    void q(String str);

    String s();

    void v(String str, Map<String, ? extends Object> map);
}
