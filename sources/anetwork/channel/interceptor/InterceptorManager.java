package anetwork.channel.interceptor;

import anet.channel.util.ALog;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InterceptorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.InterceptorManager";
    private static final CopyOnWriteArrayList<Interceptor> interceptors = new CopyOnWriteArrayList<>();
    private static Interceptor securityInterceptor = null;
    private static Interceptor privacyInterceptor = null;

    static {
        t2o.a(607126068);
    }

    private InterceptorManager() {
    }

    public static boolean contains(Interceptor interceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("356e7dcc", new Object[]{interceptor})).booleanValue();
        }
        return interceptors.contains(interceptor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        return new androidx.core.util.Pair<>(java.lang.Integer.valueOf(r7), r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.core.util.Pair<java.lang.Integer, anetwork.channel.interceptor.Interceptor> getInterceptor(int r7, long r8) {
        /*
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = anetwork.channel.interceptor.InterceptorManager.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0022
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r8)
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r9 = 0
            r8[r9] = r2
            r8[r0] = r7
            java.lang.String r7 = "acf8f80b"
            java.lang.Object r7 = r1.ipc$dispatch(r7, r8)
            androidx.core.util.Pair r7 = (androidx.core.util.Pair) r7
            return r7
        L_0x0022:
            java.util.concurrent.CopyOnWriteArrayList<anetwork.channel.interceptor.Interceptor> r1 = anetwork.channel.interceptor.InterceptorManager.interceptors
            int r2 = r1.size()
            if (r7 >= r2) goto L_0x0054
            java.lang.Object r1 = r1.get(r7)
            anetwork.channel.interceptor.Interceptor r1 = (anetwork.channel.interceptor.Interceptor) r1
            r2 = 2
            long r2 = r2 & r8
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x003d
            anetwork.channel.interceptor.Interceptor r2 = anetwork.channel.interceptor.InterceptorManager.privacyInterceptor
            if (r1 == r2) goto L_0x0048
        L_0x003d:
            r2 = 1
            long r2 = r2 & r8
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x004a
            anetwork.channel.interceptor.Interceptor r2 = anetwork.channel.interceptor.InterceptorManager.securityInterceptor
            if (r1 != r2) goto L_0x004a
        L_0x0048:
            int r7 = r7 + r0
            goto L_0x0022
        L_0x004a:
            androidx.core.util.Pair r8 = new androidx.core.util.Pair
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8.<init>(r7, r1)
            return r8
        L_0x0054:
            androidx.core.util.Pair r8 = new androidx.core.util.Pair
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 0
            r8.<init>(r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.interceptor.InterceptorManager.getInterceptor(int, long):androidx.core.util.Pair");
    }

    public static int getSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[0])).intValue();
        }
        return interceptors.size();
    }

    public static void removeInterceptor(Interceptor interceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426bc72a", new Object[]{interceptor});
            return;
        }
        CopyOnWriteArrayList<Interceptor> copyOnWriteArrayList = interceptors;
        if (copyOnWriteArrayList.contains(interceptor)) {
            copyOnWriteArrayList.remove(interceptor);
        }
    }

    public static void addInterceptor(Interceptor interceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde0e5ad", new Object[]{interceptor});
            return;
        }
        CopyOnWriteArrayList<Interceptor> copyOnWriteArrayList = interceptors;
        if (!copyOnWriteArrayList.contains(interceptor) && interceptor != null) {
            copyOnWriteArrayList.add(interceptor);
            boolean contains = interceptor.toString().toLowerCase().contains(Baggage.Amnet.CFG_SSL);
            boolean contains2 = interceptor.toString().toLowerCase().contains("aliprivacyext");
            if (contains) {
                securityInterceptor = interceptor;
            }
            if (contains2) {
                privacyInterceptor = interceptor;
            }
            ALog.e(TAG, "[Interceptor] addInterceptor", null, "interceptors", copyOnWriteArrayList.toString(), "securityInterceptor", securityInterceptor, "privacyInterceptor", privacyInterceptor);
        }
    }

    public static Interceptor getInterceptor(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Interceptor) ipChange.ipc$dispatch("b400bccb", new Object[]{new Integer(i)}) : interceptors.get(i);
    }
}
