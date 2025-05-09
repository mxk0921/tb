package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jrm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CACHE = 0;
    public static final int LOCAL = 1;

    /* renamed from: a  reason: collision with root package name */
    public static final List f22175a = Arrays.asList(0, 1);
    public static final List b = Arrays.asList(0);
    public static final List c = Arrays.asList(1);
    public static final List d = Arrays.asList(new Object[0]);

    static {
        t2o.a(468714672);
    }

    public static String b(List<Integer> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24167618", new Object[]{list});
        }
        if (f22175a.equals(list)) {
            return "cacheFirst";
        }
        if (b.equals(list)) {
            return "cacheOnly";
        }
        if (c.equals(list)) {
            return RemoteMessageConst.Notification.LOCAL_ONLY;
        }
        if (d.equals(list)) {
            return "none";
        }
        return "unknown";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r5.equals("cacheOnly") == false) goto L_0x0037;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List a(android.net.Uri r5, boolean r6) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.jrm.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001d
            java.lang.Boolean r4 = new java.lang.Boolean
            r4.<init>(r6)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r5
            r6[r0] = r4
            java.lang.String r5 = "71951a94"
            java.lang.Object r5 = r3.ipc$dispatch(r5, r6)
            java.util.List r5 = (java.util.List) r5
            return r5
        L_0x001d:
            if (r5 == 0) goto L_0x0080
            java.lang.String r3 = "videoStrategy"
            java.lang.String r5 = r5.getQueryParameter(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L_0x0080
            r5.hashCode()
            r3 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case -1205353033: goto L_0x0059;
                case -553733554: goto L_0x0050;
                case 3387192: goto L_0x0044;
                case 5674062: goto L_0x0039;
                default: goto L_0x0037;
            }
        L_0x0037:
            r0 = -1
            goto L_0x0064
        L_0x0039:
            java.lang.String r0 = "cacheFirst"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0042
            goto L_0x0037
        L_0x0042:
            r0 = 3
            goto L_0x0064
        L_0x0044:
            java.lang.String r0 = "none"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x004e
            goto L_0x0037
        L_0x004e:
            r0 = 2
            goto L_0x0064
        L_0x0050:
            java.lang.String r1 = "cacheOnly"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0064
            goto L_0x0037
        L_0x0059:
            java.lang.String r0 = "localOnly"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0063
            goto L_0x0037
        L_0x0063:
            r0 = 0
        L_0x0064:
            switch(r0) {
                case 0: goto L_0x007d;
                case 1: goto L_0x007a;
                case 2: goto L_0x0077;
                case 3: goto L_0x0074;
                default: goto L_0x0067;
            }
        L_0x0067:
            java.lang.String r0 = "unknown strategy "
            java.lang.String r5 = r0.concat(r5)
            java.lang.String r0 = "PreloadCacheStrategy"
            tb.ir9.b(r0, r5)
            goto L_0x0080
        L_0x0074:
            java.util.List r5 = tb.jrm.f22175a
            return r5
        L_0x0077:
            java.util.List r5 = tb.jrm.d
            return r5
        L_0x007a:
            java.util.List r5 = tb.jrm.b
            return r5
        L_0x007d:
            java.util.List r5 = tb.jrm.c
            return r5
        L_0x0080:
            if (r6 != 0) goto L_0x0085
            java.util.List r5 = tb.jrm.b
            return r5
        L_0x0085:
            java.util.List r5 = tb.jrm.c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jrm.a(android.net.Uri, boolean):java.util.List");
    }
}
