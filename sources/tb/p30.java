package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class p30 implements yrd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<xrd> f25847a = new LinkedList();
    public final List<wrd> b = new LinkedList();

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // tb.yrd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r11, tb.efq r12) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.p30.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "5b81000d"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r10
            r3 = 1
            r2[r3] = r11
            r11 = 2
            r2[r11] = r12
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0018:
            java.util.List<tb.wrd> r11 = r10.b
            java.util.Iterator r11 = r11.iterator()
        L_0x001e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r0 = r11.next()
            tb.wrd r0 = (tb.wrd) r0
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = r0.d(r12)
            mtopsdk.common.util.TBSdkLog$LogEnable r4 = mtopsdk.common.util.TBSdkLog.LogEnable.DebugEnable
            boolean r4 = mtopsdk.common.util.TBSdkLog.isLogEnable(r4)
            java.lang.String r5 = "[callback]execute AfterFilter: "
            java.lang.String r6 = "ssr.AbstractSsrFilterManager"
            if (r4 == 0) goto L_0x0061
            java.lang.String r4 = r12.b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r5)
            java.lang.String r8 = r0.getName()
            r7.append(r8)
            java.lang.String r8 = ",time(ms)= "
            r7.append(r8)
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r1
            r7.append(r8)
            java.lang.String r1 = r7.toString()
            mtopsdk.common.util.TBSdkLog.d(r6, r4, r1)
        L_0x0061:
            if (r3 == 0) goto L_0x006b
            java.lang.String r1 = "STOP"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x001e
        L_0x006b:
            mtopsdk.common.util.TBSdkLog$LogEnable r11 = mtopsdk.common.util.TBSdkLog.LogEnable.InfoEnable
            boolean r11 = mtopsdk.common.util.TBSdkLog.isLogEnable(r11)
            if (r11 == 0) goto L_0x0090
            java.lang.String r11 = r12.b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r5)
            java.lang.String r0 = r0.getName()
            r12.append(r0)
            java.lang.String r0 = ",result="
            r12.append(r0)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            mtopsdk.common.util.TBSdkLog.i(r6, r11, r12)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.p30.a(java.lang.String, tb.efq):void");
    }

    public void b(wrd wrdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f862793", new Object[]{this, wrdVar});
        } else {
            ((LinkedList) this.b).add(wrdVar);
        }
    }

    public void c(xrd xrdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27351b7", new Object[]{this, xrdVar});
        } else {
            ((LinkedList) this.f25847a).add(xrdVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(java.lang.String r11, tb.efq r12) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.p30.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "22a102ea"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r10
            r3 = 1
            r2[r3] = r11
            r11 = 2
            r2[r11] = r12
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0018:
            java.util.List<tb.xrd> r11 = r10.f25847a
            java.util.Iterator r11 = r11.iterator()
        L_0x001e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r0 = r11.next()
            tb.xrd r0 = (tb.xrd) r0
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = r0.b(r12)
            mtopsdk.common.util.TBSdkLog$LogEnable r4 = mtopsdk.common.util.TBSdkLog.LogEnable.DebugEnable
            boolean r4 = mtopsdk.common.util.TBSdkLog.isLogEnable(r4)
            java.lang.String r5 = "[start]execute BeforeFilter: "
            java.lang.String r6 = "ssr.AbstractSsrFilterManager"
            if (r4 == 0) goto L_0x0061
            java.lang.String r4 = r12.b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r5)
            java.lang.String r8 = r0.getName()
            r7.append(r8)
            java.lang.String r8 = ",time(ms)= "
            r7.append(r8)
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r1
            r7.append(r8)
            java.lang.String r1 = r7.toString()
            mtopsdk.common.util.TBSdkLog.d(r6, r4, r1)
        L_0x0061:
            if (r3 == 0) goto L_0x006b
            java.lang.String r1 = "STOP"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x001e
        L_0x006b:
            mtopsdk.common.util.TBSdkLog$LogEnable r11 = mtopsdk.common.util.TBSdkLog.LogEnable.InfoEnable
            boolean r11 = mtopsdk.common.util.TBSdkLog.isLogEnable(r11)
            if (r11 == 0) goto L_0x0090
            java.lang.String r11 = r12.b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r5)
            java.lang.String r0 = r0.getName()
            r12.append(r0)
            java.lang.String r0 = ",result="
            r12.append(r0)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            mtopsdk.common.util.TBSdkLog.i(r6, r11, r12)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.p30.d(java.lang.String, tb.efq):void");
    }
}
