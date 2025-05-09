package tb;

import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.CodeUsageCounter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v85 implements g0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(451936311);
        t2o.a(774897669);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0077 A[ADDED_TO_REGION] */
    @Override // tb.g0d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getNetworkStutas() {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "2G"
            com.android.alibaba.ip.runtime.IpChange r3 = tb.v85.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0017
            java.lang.String r2 = "b40e8c2f"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r9
            java.lang.Object r0 = r3.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0017:
            com.taobao.taobaoavsdk.CodeUsageCounter r3 = com.taobao.taobaoavsdk.CodeUsageCounter.c()
            com.taobao.taobaoavsdk.CodeUsageCounter$componentName r4 = com.taobao.taobaoavsdk.CodeUsageCounter.componentName.dw_adapter_DWNetworkUtilsAdapter
            r3.a(r4)
            anet.channel.status.NetworkStatusHelper$NetworkStatus r3 = anet.channel.status.NetworkStatusHelper.getStatus()     // Catch: Exception -> 0x0081
            java.lang.String r3 = r3.getType()     // Catch: Exception -> 0x0081
            int r4 = r3.hashCode()     // Catch: Exception -> 0x0081
            r5 = 1621(0x655, float:2.272E-42)
            r6 = 4
            r7 = 3
            r8 = 2
            if (r4 == r5) goto L_0x006c
            r5 = 1652(0x674, float:2.315E-42)
            if (r4 == r5) goto L_0x0062
            r5 = 1683(0x693, float:2.358E-42)
            if (r4 == r5) goto L_0x0058
            r5 = 1714(0x6b2, float:2.402E-42)
            if (r4 == r5) goto L_0x004e
            r5 = 2664213(0x28a715, float:3.733358E-39)
            if (r4 == r5) goto L_0x0045
            goto L_0x0074
        L_0x0045:
            java.lang.String r4 = "WIFI"
            boolean r4 = r3.equals(r4)     // Catch: Exception -> 0x0081
            if (r4 == 0) goto L_0x0074
            goto L_0x0075
        L_0x004e:
            java.lang.String r0 = "5G"
            boolean r0 = r3.equals(r0)     // Catch: Exception -> 0x0081
            if (r0 == 0) goto L_0x0074
            r0 = 1
            goto L_0x0075
        L_0x0058:
            java.lang.String r0 = "4G"
            boolean r0 = r3.equals(r0)     // Catch: Exception -> 0x0081
            if (r0 == 0) goto L_0x0074
            r0 = 2
            goto L_0x0075
        L_0x0062:
            java.lang.String r0 = "3G"
            boolean r0 = r3.equals(r0)     // Catch: Exception -> 0x0081
            if (r0 == 0) goto L_0x0074
            r0 = 3
            goto L_0x0075
        L_0x006c:
            boolean r0 = r3.equals(r2)     // Catch: Exception -> 0x0081
            if (r0 == 0) goto L_0x0074
            r0 = 4
            goto L_0x0075
        L_0x0074:
            r0 = -1
        L_0x0075:
            if (r0 == 0) goto L_0x0080
            if (r0 == r1) goto L_0x0080
            if (r0 == r8) goto L_0x0080
            if (r0 == r7) goto L_0x0080
            if (r0 == r6) goto L_0x0080
            return r2
        L_0x0080:
            return r3
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.v85.getNetworkStutas():java.lang.String");
    }

    @Override // tb.g0d
    public boolean isConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1c220a", new Object[]{this})).booleanValue();
        }
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_adapter_DWNetworkUtilsAdapter);
        return NetworkStatusHelper.isConnected();
    }
}
