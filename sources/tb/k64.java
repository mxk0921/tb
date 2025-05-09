package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.event.IPopMessageListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class k64 extends kx implements IPopMessageListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public k64(bbd bbdVar) {
        super(bbdVar);
    }

    public static /* synthetic */ Object ipc$super(k64 k64Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/listener/CommonPopMessageListener");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r8.equals(com.alibaba.security.realidentity.g4.c.g) == false) goto L_0x002c;
     */
    @Override // com.taobao.homepage.pop.protocol.event.IPopMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMessage(java.lang.String r8, com.taobao.homepage.pop.protocol.model.pop.IPopData r9, com.alibaba.fastjson.JSONObject r10) {
        /*
            r7 = this;
            r0 = -1
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r5 = tb.k64.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001c
            java.lang.String r0 = "b9b3eda9"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r4] = r7
            r6[r3] = r8
            r6[r2] = r9
            r6[r1] = r10
            r5.ipc$dispatch(r0, r6)
            return
        L_0x001c:
            java.lang.String r5 = "other"
            if (r8 != r5) goto L_0x0022
            return
        L_0x0022:
            r8.hashCode()
            int r5 = r8.hashCode()
            switch(r5) {
                case -907680051: goto L_0x004f;
                case 775779035: goto L_0x0044;
                case 1340673488: goto L_0x0038;
                case 1842531918: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            r1 = -1
            goto L_0x005a
        L_0x002e:
            java.lang.String r2 = "netWork"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x005a
            goto L_0x002c
        L_0x0038:
            java.lang.String r1 = "refreshCardView"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x0042
            goto L_0x002c
        L_0x0042:
            r1 = 2
            goto L_0x005a
        L_0x0044:
            java.lang.String r1 = "fatigueReport"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x004d
            goto L_0x002c
        L_0x004d:
            r1 = 1
            goto L_0x005a
        L_0x004f:
            java.lang.String r1 = "scroll"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0059:
            r1 = 0
        L_0x005a:
            switch(r1) {
                case 0: goto L_0x0080;
                case 1: goto L_0x007c;
                case 2: goto L_0x0071;
                case 3: goto L_0x005e;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x0083
        L_0x005e:
            if (r10 == 0) goto L_0x006d
            java.lang.String r1 = "messageId"
            boolean r2 = r10.containsKey(r1)
            if (r2 == 0) goto L_0x006d
            java.lang.String r8 = r10.getString(r1)
        L_0x006d:
            r7.c(r0, r8, r9)
            goto L_0x0083
        L_0x0071:
            java.lang.String r8 = "sectionBizCode"
            java.lang.String r8 = r10.getString(r8)
            r7.b(r8)
            goto L_0x0083
        L_0x007c:
            r7.a(r9)
            goto L_0x0083
        L_0x0080:
            r7.d(r9)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.k64.onMessage(java.lang.String, com.taobao.homepage.pop.protocol.model.pop.IPopData, com.alibaba.fastjson.JSONObject):void");
    }
}
