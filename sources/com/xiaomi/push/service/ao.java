package com.xiaomi.push.service;

import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.cq;
import com.xiaomi.push.el;
import com.xiaomi.push.gb;
import com.xiaomi.push.x;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import tb.xg4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ao {

    /* renamed from: a  reason: collision with other field name */
    private static final Pattern f1559a = Pattern.compile("([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})");

    /* renamed from: a  reason: collision with root package name */
    private static long f15048a = 0;

    /* renamed from: a  reason: collision with other field name */
    private static ThreadPoolExecutor f1558a = new ThreadPoolExecutor(1, 1, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private static String a(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(str)));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append("\n");
                        sb.append(readLine);
                    } else {
                        String sb2 = sb.toString();
                        x.a(bufferedReader);
                        return sb2;
                    }
                }
            } catch (Exception unused) {
                x.a(bufferedReader);
                return null;
            } catch (Throwable th2) {
                th = th2;
                x.a(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    public static void b() {
        String a2 = a("/proc/self/net/tcp");
        if (!TextUtils.isEmpty(a2)) {
            b.m410a("dump tcp for uid = " + Process.myUid());
            b.m410a(a2);
        }
        String a3 = a("/proc/self/net/tcp6");
        if (!TextUtils.isEmpty(a3)) {
            b.m410a("dump tcp6 for uid = " + Process.myUid());
            b.m410a(a3);
        }
    }

    public static void a() {
        el.a a2;
        long currentTimeMillis = System.currentTimeMillis();
        if ((f1558a.getActiveCount() <= 0 || currentTimeMillis - f15048a >= xg4.DEFAULT_SMALL_MAX_AGE) && gb.m710a().m715a() && (a2 = bw.a().m1064a()) != null && a2.e() > 0) {
            f15048a = currentTimeMillis;
            a(a2.mo666a(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            b.m410a("ConnectivityTest: begin to connect to " + str);
            Socket socket = new Socket();
            socket.connect(cq.m560a(str, 5222), 5000);
            socket.setTcpNoDelay(true);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            b.m410a("ConnectivityTest: connect to " + str + " in " + currentTimeMillis2);
            socket.close();
            return true;
        } catch (Throwable th) {
            b.d("ConnectivityTest: could not connect to:" + str + " exception: " + th.getClass().getSimpleName() + " description: " + th.getMessage());
            return false;
        }
    }

    public static void a(List<String> list, boolean z) {
        f1558a.execute(new ap(list, z));
    }
}
