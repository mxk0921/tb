package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pjp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Integer f26130a = null;

    static {
        t2o.a(664797244);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [int, boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.pjp.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0016
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "4a71375"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L_0x0016:
            java.lang.Integer r0 = tb.pjp.f26130a
            if (r0 != 0) goto L_0x003d
            boolean r0 = b()
            if (r0 == 0) goto L_0x0028
            r0 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            tb.pjp.f26130a = r1
            return r0
        L_0x0028:
            java.lang.String r0 = "optReflowV4"
            java.lang.String r1 = "true"
            java.lang.String r0 = com.ut.share.utils.OrangeHelper.getBizOrangeConfig(r0, r1)
            boolean r0 = r1.equals(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            tb.pjp.f26130a = r1
            return r0
        L_0x003d:
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pjp.a():int");
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5a6c976", new Object[0])).booleanValue();
        }
        return "true".equals(l7l.f("optReflowDowngrade", null));
    }
}
