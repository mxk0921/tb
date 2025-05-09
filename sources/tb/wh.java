package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wh extends os {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789036);
    }

    public static /* synthetic */ Object ipc$super(wh whVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/condition/AURADeviceCondition");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
        if (r8.equals("greater") == false) goto L_0x0073;
     */
    @Override // tb.zab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.wh.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "63f7f74c"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            java.lang.Object r8 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x001c:
            java.lang.String r3 = "value"
            java.lang.Object r3 = r8.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "diff"
            java.lang.Object r8 = r8.get(r4)
            java.lang.String r8 = (java.lang.String) r8
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x00ad
            boolean r4 = android.text.TextUtils.isEmpty(r8)
            if (r4 == 0) goto L_0x003b
            goto L_0x00ad
        L_0x003b:
            tb.yh$a r4 = tb.yh.a()
            int r5 = r4.f32082a
            if (r5 != 0) goto L_0x0044
            return r1
        L_0x0044:
            java.lang.String r5 = "low"
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x004f
            r3 = 1
            goto L_0x0065
        L_0x004f:
            java.lang.String r5 = "middle"
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x005a
            r3 = 2
            goto L_0x0065
        L_0x005a:
            java.lang.String r5 = "high"
            boolean r3 = r3.equalsIgnoreCase(r5)
            if (r3 == 0) goto L_0x0064
            r3 = 3
            goto L_0x0065
        L_0x0064:
            r3 = 0
        L_0x0065:
            if (r3 != 0) goto L_0x0068
            return r1
        L_0x0068:
            r8.hashCode()
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case 3318169: goto L_0x0089;
                case 96757556: goto L_0x007e;
                case 283601914: goto L_0x0075;
                default: goto L_0x0073;
            }
        L_0x0073:
            r2 = -1
            goto L_0x0094
        L_0x0075:
            java.lang.String r6 = "greater"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x0094
            goto L_0x0073
        L_0x007e:
            java.lang.String r2 = "equal"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0087
            goto L_0x0073
        L_0x0087:
            r2 = 1
            goto L_0x0094
        L_0x0089:
            java.lang.String r2 = "less"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0093
            goto L_0x0073
        L_0x0093:
            r2 = 0
        L_0x0094:
            switch(r2) {
                case 0: goto L_0x00a6;
                case 1: goto L_0x009f;
                case 2: goto L_0x0098;
                default: goto L_0x0097;
            }
        L_0x0097:
            return r1
        L_0x0098:
            int r8 = r4.f32082a
            if (r8 <= r3) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            return r0
        L_0x009f:
            int r8 = r4.f32082a
            if (r8 != r3) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r0 = 0
        L_0x00a5:
            return r0
        L_0x00a6:
            int r8 = r4.f32082a
            if (r8 >= r3) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r0 = 0
        L_0x00ac:
            return r0
        L_0x00ad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wh.a(java.util.Map):boolean");
    }
}
