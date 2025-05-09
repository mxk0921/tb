package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class eeh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f18511a = "TLOG.LogConfigureReplyTask";

    static {
        t2o.a(767557704);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009d A[Catch: Exception -> 0x0087, TRY_LEAVE, TryCatch #0 {Exception -> 0x0087, blocks: (B:6:0x0012, B:8:0x0072, B:10:0x007c, B:15:0x0089, B:16:0x0095, B:18:0x009d), top: B:21:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(tb.z24 r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.eeh.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "52428ce3"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0012:
            tb.j5s r0 = tb.j5s.j()     // Catch: Exception -> 0x0087
            tb.s5s r0 = r0.s()     // Catch: Exception -> 0x0087
            java.lang.String r1 = tb.b6s.c     // Catch: Exception -> 0x0087
            java.lang.String r2 = tb.eeh.f18511a     // Catch: Exception -> 0x0087
            java.lang.String r3 = "消息处理：修改日志请求服务端回复消息"
            r0.b(r1, r2, r3)     // Catch: Exception -> 0x0087
            tb.deh r0 = new tb.deh     // Catch: Exception -> 0x0087
            r0.<init>()     // Catch: Exception -> 0x0087
            tb.hfh r1 = new tb.hfh     // Catch: Exception -> 0x0087
            r1.<init>()     // Catch: Exception -> 0x0087
            tb.j5s r2 = tb.j5s.j()     // Catch: Exception -> 0x0087
            java.lang.String r2 = r2.f()     // Catch: Exception -> 0x0087
            r1.b = r2     // Catch: Exception -> 0x0087
            tb.j5s r2 = tb.j5s.j()     // Catch: Exception -> 0x0087
            java.lang.String r2 = r2.d()     // Catch: Exception -> 0x0087
            r1.c = r2     // Catch: Exception -> 0x0087
            java.lang.String r2 = "200"
            r1.e = r2     // Catch: Exception -> 0x0087
            java.lang.String r2 = ""
            r1.f = r2     // Catch: Exception -> 0x0087
            java.lang.String r2 = "RDWP_LOG_CONFIGURE_REPLY"
            r1.d = r2     // Catch: Exception -> 0x0087
            java.lang.String r2 = tb.j5s.q()     // Catch: Exception -> 0x0087
            r1.f20602a = r2     // Catch: Exception -> 0x0087
            tb.j5s r2 = tb.j5s.j()     // Catch: Exception -> 0x0087
            tb.zfh r2 = r2.k()     // Catch: Exception -> 0x0087
            tb.tmv r2 = r2.b()     // Catch: Exception -> 0x0087
            com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo r3 = new com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo     // Catch: Exception -> 0x0087
            r3.<init>()     // Catch: Exception -> 0x0087
            java.lang.String r4 = r2.f28810a     // Catch: Exception -> 0x0087
            r0.f17759a = r4     // Catch: Exception -> 0x0087
            java.lang.String r5 = "oss"
            boolean r4 = r4.equals(r5)     // Catch: Exception -> 0x0087
            if (r4 != 0) goto L_0x0089
            java.lang.String r4 = r2.f28810a     // Catch: Exception -> 0x0087
            java.lang.String r5 = "arup"
            boolean r4 = r4.equals(r5)     // Catch: Exception -> 0x0087
            if (r4 != 0) goto L_0x0089
            java.lang.String r2 = r2.f28810a     // Catch: Exception -> 0x0087
            java.lang.String r4 = "ceph"
            boolean r2 = r2.equals(r4)     // Catch: Exception -> 0x0087
            if (r2 == 0) goto L_0x0095
            goto L_0x0089
        L_0x0087:
            r6 = move-exception
            goto L_0x00b6
        L_0x0089:
            java.lang.String r2 = "ossBucketName"
            tb.j5s r4 = tb.j5s.j()     // Catch: Exception -> 0x0087
            java.lang.String r4 = r4.d     // Catch: Exception -> 0x0087
            r3.put(r2, r4)     // Catch: Exception -> 0x0087
        L_0x0095:
            r0.b = r3     // Catch: Exception -> 0x0087
            java.lang.String r6 = r0.a(r6, r1)     // Catch: Exception -> 0x0087
            if (r6 == 0) goto L_0x00cb
            tb.p5o r0 = new tb.p5o     // Catch: Exception -> 0x0087
            r0.<init>()     // Catch: Exception -> 0x0087
            r0.f25893a = r6     // Catch: Exception -> 0x0087
            tb.j5s r6 = tb.j5s.j()     // Catch: Exception -> 0x0087
            android.content.Context r6 = r6.h()     // Catch: Exception -> 0x0087
            tb.oap.a(r6, r0)     // Catch: Exception -> 0x0087
            java.lang.String r6 = "ut_tlog_config_reply"
            com.taobao.tao.log.statistics.TLogEventHelper.e(r6)     // Catch: Exception -> 0x0087
            goto L_0x00cb
        L_0x00b6:
            java.lang.String r0 = tb.eeh.f18511a
            java.lang.String r1 = "execute error"
            android.util.Log.e(r0, r1, r6)
            tb.j5s r1 = tb.j5s.j()
            tb.s5s r1 = r1.s()
            java.lang.String r2 = tb.b6s.c
            r1.a(r2, r0, r6)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.eeh.a(tb.z24):void");
    }
}
