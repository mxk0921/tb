package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bzw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dzw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bzw f18185a = new bzw();

    static {
        t2o.a(468713617);
    }

    public bzw.a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bzw.a) ipChange.ipc$dispatch("6d68d835", new Object[]{this});
        }
        return this.f18185a.a();
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51289497", new Object[]{this})).longValue();
        }
        bzw bzwVar = this.f18185a;
        if (bzwVar != null) {
            return bzwVar.o;
        }
        return 0L;
    }

    public void c(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("890ce2e8", new Object[]{this, str, str2, str3, str4, str5, str6});
            return;
        }
        bzw bzwVar = this.f18185a;
        bzwVar.f16745a = str;
        bzwVar.b = str2;
        bzwVar.c = str3;
        bzwVar.d = str4;
        bzwVar.e = str5;
        bzwVar.f = str6;
        bzwVar.l = SystemClock.elapsedRealtime();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f41c109c", new Object[]{this});
            return;
        }
        bzw bzwVar = this.f18185a;
        if (bzwVar != null) {
            bzwVar.o = 0L;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
        if (r7.equals("destroytimeout") == false) goto L_0x0036;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(java.lang.String r7, java.util.Map r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = tb.dzw.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r5 = "81231fbb"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            r3[r1] = r7
            r3[r0] = r8
            r4.ipc$dispatch(r5, r3)
            return
        L_0x0018:
            tb.bzw$a r4 = r6.a()
            tb.bzw r5 = r6.f18185a
            r5.g = r7
            tb.bzw$a r5 = r4.b()
            tb.bzw$a r5 = r5.k()
            r5.i(r8)
            r7.hashCode()
            r8 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -99989769: goto L_0x0089;
                case 310351011: goto L_0x007d;
                case 507551783: goto L_0x0074;
                case 545472344: goto L_0x0068;
                case 1330016653: goto L_0x005c;
                case 1344973996: goto L_0x0050;
                case 1508646476: goto L_0x0044;
                case 1879530535: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            r0 = -1
            goto L_0x0094
        L_0x0038:
            java.lang.String r0 = "playnext"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0042
            goto L_0x0036
        L_0x0042:
            r0 = 7
            goto L_0x0094
        L_0x0044:
            java.lang.String r0 = "waittimeout"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x004e
            goto L_0x0036
        L_0x004e:
            r0 = 6
            goto L_0x0094
        L_0x0050:
            java.lang.String r0 = "webloadfinished"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x005a
            goto L_0x0036
        L_0x005a:
            r0 = 5
            goto L_0x0094
        L_0x005c:
            java.lang.String r0 = "webterminate"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0066
            goto L_0x0036
        L_0x0066:
            r0 = 4
            goto L_0x0094
        L_0x0068:
            java.lang.String r0 = "loadfinished"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0072
            goto L_0x0036
        L_0x0072:
            r0 = 3
            goto L_0x0094
        L_0x0074:
            java.lang.String r1 = "destroytimeout"
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x0094
            goto L_0x0036
        L_0x007d:
            java.lang.String r0 = "loadfailed"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0087
            goto L_0x0036
        L_0x0087:
            r0 = 1
            goto L_0x0094
        L_0x0089:
            java.lang.String r0 = "webloadfailed"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0093
            goto L_0x0036
        L_0x0093:
            r0 = 0
        L_0x0094:
            switch(r0) {
                case 0: goto L_0x009c;
                case 1: goto L_0x0098;
                case 2: goto L_0x009c;
                case 3: goto L_0x0098;
                case 4: goto L_0x009c;
                case 5: goto L_0x009c;
                case 6: goto L_0x009c;
                case 7: goto L_0x0098;
                default: goto L_0x0097;
            }
        L_0x0097:
            goto L_0x009f
        L_0x0098:
            r4.c(r7)
            goto L_0x009f
        L_0x009c:
            r4.l(r7)
        L_0x009f:
            java.lang.String r8 = "webloadinit"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00c7
            java.util.Map r7 = r4.a()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "埋点上报："
            r8.<init>(r0)
            java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r7)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "[webcomponent_tracker]"
            tb.ir9.b(r0, r8)
            tb.xau.C(r7)
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dzw.e(java.lang.String, java.util.Map):void");
    }
}
