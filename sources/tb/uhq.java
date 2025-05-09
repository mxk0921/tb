package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uhq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f29389a = "TLOG.StartUpRequestTask";
    public static final String b = "adapter.config";
    public static final String c = "logStartUp";
    public static final Integer d = 0;
    public static final Integer e = 10000;
    public static Integer f = 10000;

    static {
        t2o.a(767557711);
    }

    public static Boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("64a2d6e7", new Object[0]);
        }
        int intValue = f().intValue();
        if (intValue <= 0 || intValue > f.intValue()) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[0]);
            return;
        }
        try {
            final Long valueOf = Long.valueOf(System.currentTimeMillis());
            if (!h(j5s.j().h(), j5s.j().e()).booleanValue()) {
                j5s.j().s().b(b6s.d, f29389a, "启动事件：不发送启动事件");
            } else {
                e6s.d().g(new Runnable() { // from class: tb.thq
                    @Override // java.lang.Runnable
                    public final void run() {
                        uhq.i(valueOf);
                    }
                }, 5000L, TimeUnit.MILLISECONDS);
            }
        } catch (Exception e2) {
            String str = f29389a;
            Log.e(str, "send startUpRequest error", e2);
            j5s.j().s().a(b6s.c, str, e2);
        }
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2374b6b6", new Object[]{context});
        }
        String g = g(context);
        String j = n6s.j(g + File.separator + b);
        if (j == null || j.length() <= 0) {
            return null;
        }
        return j;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ffbaab61", new Object[0]);
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        return nextElement.getHostAddress().toString();
                    }
                }
            }
            return "-";
        } catch (Exception e2) {
            s5s s = j5s.j().s();
            String str = b6s.f;
            String str2 = f29389a;
            s.c(str, str2, "启动事件：getLocalIpAddress 异常:" + e2.getMessage());
            return "-";
        }
    }

    public static Integer f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("73ca36e7", new Object[0]);
        }
        Random random = new Random();
        Integer num = e;
        int nextInt = random.nextInt(num.intValue());
        int intValue = num.intValue();
        Integer num2 = d;
        return Integer.valueOf((nextInt % ((intValue - num2.intValue()) + 1)) + num2.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00bc A[Catch: Exception -> 0x008e, TRY_LEAVE, TryCatch #0 {Exception -> 0x008e, blocks: (B:6:0x0012, B:8:0x0079, B:10:0x0083, B:15:0x0090, B:16:0x009c, B:18:0x00bc), top: B:21:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void i(java.lang.Long r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.uhq.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "b07cb6ea"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0012:
            tb.j5s r0 = tb.j5s.j()     // Catch: Exception -> 0x008e
            tb.s5s r0 = r0.s()     // Catch: Exception -> 0x008e
            java.lang.String r1 = tb.b6s.d     // Catch: Exception -> 0x008e
            java.lang.String r2 = tb.uhq.f29389a     // Catch: Exception -> 0x008e
            java.lang.String r3 = "启动事件：发送启动事件"
            r0.b(r1, r2, r3)     // Catch: Exception -> 0x008e
            tb.j5s r0 = tb.j5s.j()     // Catch: Exception -> 0x008e
            tb.zfh r0 = r0.k()     // Catch: Exception -> 0x008e
            tb.tmv r0 = r0.b()     // Catch: Exception -> 0x008e
            tb.fiq r1 = new tb.fiq     // Catch: Exception -> 0x008e
            r1.<init>()     // Catch: Exception -> 0x008e
            tb.j5s r2 = tb.j5s.j()     // Catch: Exception -> 0x008e
            java.lang.String r2 = r2.r()     // Catch: Exception -> 0x008e
            r1.d = r2     // Catch: Exception -> 0x008e
            tb.j5s r2 = tb.j5s.j()     // Catch: Exception -> 0x008e
            java.lang.String r2 = r2.e()     // Catch: Exception -> 0x008e
            r1.h = r2     // Catch: Exception -> 0x008e
            tb.j5s r2 = tb.j5s.j()     // Catch: Exception -> 0x008e
            java.lang.String r2 = r2.f()     // Catch: Exception -> 0x008e
            r1.f21291a = r2     // Catch: Exception -> 0x008e
            tb.j5s r2 = tb.j5s.j()     // Catch: Exception -> 0x008e
            java.lang.String r2 = r2.d()     // Catch: Exception -> 0x008e
            r1.b = r2     // Catch: Exception -> 0x008e
            java.lang.String r2 = tb.j5s.q()     // Catch: Exception -> 0x008e
            r1.c = r2     // Catch: Exception -> 0x008e
            java.lang.String r2 = "RDWP_STARTUP"
            r1.e = r2     // Catch: Exception -> 0x008e
            com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo r2 = new com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo     // Catch: Exception -> 0x008e
            r2.<init>()     // Catch: Exception -> 0x008e
            java.lang.String r3 = r0.f28810a     // Catch: Exception -> 0x008e
            r1.f = r3     // Catch: Exception -> 0x008e
            java.lang.String r4 = "oss"
            boolean r3 = r3.equals(r4)     // Catch: Exception -> 0x008e
            if (r3 != 0) goto L_0x0090
            java.lang.String r3 = r0.f28810a     // Catch: Exception -> 0x008e
            java.lang.String r4 = "arup"
            boolean r3 = r3.equals(r4)     // Catch: Exception -> 0x008e
            if (r3 != 0) goto L_0x0090
            java.lang.String r0 = r0.f28810a     // Catch: Exception -> 0x008e
            java.lang.String r3 = "ceph"
            boolean r0 = r0.equals(r3)     // Catch: Exception -> 0x008e
            if (r0 == 0) goto L_0x009c
            goto L_0x0090
        L_0x008e:
            r5 = move-exception
            goto L_0x00ca
        L_0x0090:
            java.lang.String r0 = "ossBucketName"
            tb.j5s r3 = tb.j5s.j()     // Catch: Exception -> 0x008e
            java.lang.String r3 = r3.d     // Catch: Exception -> 0x008e
            r2.put(r0, r3)     // Catch: Exception -> 0x008e
        L_0x009c:
            r1.g = r2     // Catch: Exception -> 0x008e
            java.lang.String r0 = "android"
            r1.k = r0     // Catch: Exception -> 0x008e
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch: Exception -> 0x008e
            r1.l = r0     // Catch: Exception -> 0x008e
            java.lang.String r0 = android.os.Build.BRAND     // Catch: Exception -> 0x008e
            r1.n = r0     // Catch: Exception -> 0x008e
            java.lang.String r0 = android.os.Build.MODEL     // Catch: Exception -> 0x008e
            r1.j = r0     // Catch: Exception -> 0x008e
            java.lang.String r0 = e()     // Catch: Exception -> 0x008e
            r1.o = r0     // Catch: Exception -> 0x008e
            r1.m = r5     // Catch: Exception -> 0x008e
            tb.p5o r5 = r1.a()     // Catch: Exception -> 0x008e
            if (r5 == 0) goto L_0x00df
            tb.j5s r0 = tb.j5s.j()     // Catch: Exception -> 0x008e
            android.content.Context r0 = r0.h()     // Catch: Exception -> 0x008e
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: Exception -> 0x008e
            tb.oap.b(r0, r5, r1)     // Catch: Exception -> 0x008e
            goto L_0x00df
        L_0x00ca:
            java.lang.String r0 = tb.uhq.f29389a
            java.lang.String r1 = "start up request build error"
            android.util.Log.e(r0, r1, r5)
            tb.j5s r1 = tb.j5s.j()
            tb.s5s r1 = r1.s()
            java.lang.String r2 = tb.b6s.c
            r1.a(r2, r0, r5)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.uhq.i(java.lang.Long):void");
    }

    public static Boolean j(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("4cf44548", new Object[]{num});
        }
        Integer f2 = f();
        if (num == null) {
            return b();
        }
        if (num.equals(0)) {
            return Boolean.FALSE;
        }
        if (f2.intValue() <= 0 || f2.intValue() > num.intValue()) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public static synchronized Boolean k(String str, Context context, Boolean bool) {
        synchronized (uhq.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("76b54d7e", new Object[]{str, context, bool});
            }
            m(context, str + "^" + bool);
            return bool;
        }
    }

    public static void l(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b16655d", new Object[]{num});
        } else if (num != null) {
            f = num;
            s5s s = j5s.j().s();
            String str = b6s.d;
            String str2 = f29389a;
            s.b(str, str2, "启动事件：收到服务端采样配置,更新采样：" + num);
            k(j5s.j().e(), j5s.j().h(), j(num));
        }
    }

    public static void m(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e863cd8", new Object[]{context, str});
            return;
        }
        String g = g(context);
        n6s.m(g + File.separator + b, str);
    }

    public static String g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1516638f", new Object[]{context});
        }
        String str = context.getDir("tombstone", 0).getAbsolutePath() + File.separator + c;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        return str;
    }

    public static Boolean h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("954c85d", new Object[]{context, str});
        }
        String d2 = d(context);
        if (d2 == null) {
            j5s.j().s().b(b6s.d, f29389a, "启动事件：文件内容不存在，执行随机采样");
            return k(str, context, b());
        }
        s5s s = j5s.j().s();
        String str2 = b6s.d;
        String str3 = f29389a;
        s.b(str2, str3, "启动事件：采样内容存在：".concat(d2));
        String[] split = d2.split(c0c.UNESCAPED_SEPARATOR);
        if (split.length <= 1) {
            return Boolean.FALSE;
        }
        String str4 = split[0];
        try {
            Boolean valueOf = Boolean.valueOf(split[1]);
            if (str4.equals(str)) {
                return valueOf;
            }
            j5s.j().s().b(str2, str3, "启动事件：版本号变更了，更新采样：".concat(d2));
            return k(str, context, b());
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }
}
