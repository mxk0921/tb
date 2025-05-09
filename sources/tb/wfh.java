package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadReason;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wfh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(767557705);
    }

    public static void a(z24 z24Var, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d0b3f5", new Object[]{z24Var, str, str2, str3, str4, str5});
            return;
        }
        j5s.j().s().c(b6s.c, z24Var.c, "发送文件上传失败消息");
        c(z24Var, str, str2, str5, str3, str4, "", "");
        TLogEventHelper.n(v4s.UT_TLOG_FILE_UPLOAD_REPLY_ERROR, TLogEventHelper.i(str5), UploadReason.SERVER_PULL, z24Var.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
        if (r0.f28810a.equals("arup") != false) goto L_0x0072;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(tb.z24 r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.wfh.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0024
            java.lang.String r1 = "de432078"
            r2 = 7
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r8
            r8 = 1
            r2[r8] = r9
            r8 = 2
            r2[r8] = r10
            r8 = 3
            r2[r8] = r11
            r8 = 4
            r2[r8] = r12
            r8 = 5
            r2[r8] = r13
            r8 = 6
            r2[r8] = r14
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0024:
            tb.j5s r0 = tb.j5s.j()
            tb.s5s r0 = r0.s()
            java.lang.String r1 = tb.b6s.c
            java.lang.String r2 = r8.c
            java.lang.String r3 = "发送文件上传成功消息"
            r0.b(r1, r2, r3)
            tb.j5s r0 = tb.j5s.j()
            tb.zfh r0 = r0.k()
            tb.tmv r0 = r0.b()
            java.lang.String r1 = r0.f28810a
            java.lang.String r2 = "oss"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0074
            if (r14 == 0) goto L_0x007f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "http://"
            r0.<init>(r1)
            tb.j5s r1 = tb.j5s.j()
            java.lang.String r1 = r1.d
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            r0.append(r14)
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
        L_0x0072:
            r7 = r11
            goto L_0x0082
        L_0x0074:
            java.lang.String r14 = r0.f28810a
            java.lang.String r0 = "arup"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x007f
            goto L_0x0072
        L_0x007f:
            java.lang.String r11 = ""
            goto L_0x0072
        L_0x0082:
            java.lang.String r4 = "200"
            java.lang.String r5 = ""
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r12
            r6 = r13
            c(r0, r1, r2, r3, r4, r5, r6, r7)
            com.taobao.tao.log.statistics.UploadFileType r9 = com.taobao.tao.log.statistics.TLogEventHelper.i(r12)
            com.taobao.tao.log.statistics.UploadReason r10 = com.taobao.tao.log.statistics.UploadReason.SERVER_PULL
            java.lang.String r8 = r8.c
            java.lang.String r11 = "ut_tlog_file_upload_reply_success"
            com.taobao.tao.log.statistics.TLogEventHelper.n(r11, r9, r10, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wfh.b(tb.z24, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0 A[Catch: Exception -> 0x0078, TryCatch #0 {Exception -> 0x0078, blocks: (B:6:0x003b, B:8:0x0063, B:10:0x006d, B:15:0x007b, B:16:0x0099, B:18:0x00a0, B:20:0x00ab, B:22:0x00d6, B:23:0x00da), top: B:26:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(tb.z24 r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wfh.c(tb.z24, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
