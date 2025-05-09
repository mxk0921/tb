package com.taobao.android.tschedule.protocol;

import android.content.BroadcastReceiver;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class MultiProcessor$2 extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MultiProcessor$2 multiProcessor$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/protocol/MultiProcessor$2");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (r11.equals(tb.kaj.TYPE_SCHEDULE_TASK) == false) goto L_0x005a;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceive(android.content.Context r11, android.content.Intent r12) {
        /*
            r10 = this;
            java.lang.String r0 = "scheduleTaskWithConfigs"
            java.lang.String r1 = "scheduleTask"
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            com.android.alibaba.ip.runtime.IpChange r6 = com.taobao.android.tschedule.protocol.MultiProcessor$2.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x001e
            java.lang.String r0 = "3c04d85a"
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r10
            r1[r3] = r11
            r1[r2] = r12
            r6.ipc$dispatch(r0, r1)
            return
        L_0x001e:
            java.lang.String r11 = r12.getAction()
            boolean r6 = android.text.TextUtils.isEmpty(r11)
            if (r6 == 0) goto L_0x0029
            return
        L_0x0029:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "onReceive, action="
            r6.<init>(r7)
            r6.append(r11)
            java.lang.String r7 = ", process="
            r6.append(r7)
            java.lang.String r7 = tb.cns.d()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "TS.MultiProcessor"
            tb.zdh.a(r7, r6)
            r11.hashCode()
            java.lang.String r6 = "protocolClass"
            java.lang.String r7 = "protocolBizCode"
            r8 = -1
            int r9 = r11.hashCode()
            switch(r9) {
                case -2123610111: goto L_0x0077;
                case -955176800: goto L_0x006c;
                case 1162156220: goto L_0x0065;
                case 1171227503: goto L_0x005c;
                default: goto L_0x005a;
            }
        L_0x005a:
            r2 = -1
            goto L_0x0081
        L_0x005c:
            boolean r2 = r11.equals(r0)
            if (r2 != 0) goto L_0x0063
            goto L_0x005a
        L_0x0063:
            r2 = 3
            goto L_0x0081
        L_0x0065:
            boolean r3 = r11.equals(r1)
            if (r3 != 0) goto L_0x0081
            goto L_0x005a
        L_0x006c:
            java.lang.String r2 = "changeTriverProtocol"
            boolean r2 = r11.equals(r2)
            if (r2 != 0) goto L_0x0075
            goto L_0x005a
        L_0x0075:
            r2 = 1
            goto L_0x0081
        L_0x0077:
            java.lang.String r2 = "changeWebViewProtocol"
            boolean r2 = r11.equals(r2)
            if (r2 != 0) goto L_0x0080
            goto L_0x005a
        L_0x0080:
            r2 = 0
        L_0x0081:
            switch(r2) {
                case 0: goto L_0x00cf;
                case 1: goto L_0x00bf;
                case 2: goto L_0x0085;
                case 3: goto L_0x0085;
                default: goto L_0x0084;
            }
        L_0x0084:
            goto L_0x00de
        L_0x0085:
            java.lang.String r2 = "targetProcess"
            java.lang.String r2 = r12.getStringExtra(r2)
            java.lang.String r3 = tb.cns.d()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 != 0) goto L_0x0097
            return
        L_0x0097:
            java.lang.String r2 = "taskUrl"
            java.lang.String r2 = r12.getStringExtra(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x00a5
            return
        L_0x00a5:
            if (r11 != r1) goto L_0x00b2
            java.lang.String r11 = "targetTasks"
            java.util.ArrayList r11 = r12.getStringArrayListExtra(r11)
            tb.kaj.a(r2, r11)
            goto L_0x00de
        L_0x00b2:
            if (r11 != r0) goto L_0x00de
            java.lang.String r11 = "targetTasksConfigs"
            java.util.ArrayList r11 = r12.getStringArrayListExtra(r11)
            tb.kaj.b(r2, r11)
            goto L_0x00de
        L_0x00bf:
            java.lang.String r11 = r12.getStringExtra(r7)
            java.lang.String r12 = r12.getStringExtra(r6)
            tb.vms r0 = tb.vms.c()
            r0.h(r11, r12)
            goto L_0x00de
        L_0x00cf:
            java.lang.String r11 = r12.getStringExtra(r7)
            java.lang.String r12 = r12.getStringExtra(r6)
            tb.vms r0 = tb.vms.c()
            r0.i(r11, r12)
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tschedule.protocol.MultiProcessor$2.onReceive(android.content.Context, android.content.Intent):void");
    }
}
