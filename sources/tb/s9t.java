package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.UncaughtCrashManager;
import com.taobao.login4android.session.SessionManager;
import com.taobao.tao.TaobaoApplication;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class s9t implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String d = ":gpu_process";

    /* renamed from: a  reason: collision with root package name */
    public final Application f27892a;
    public final String b;
    public final String c;

    public s9t(Application application, String str, String str2) {
        this.f27892a = application;
        this.b = str;
        this.c = str2;
    }

    public static s9t a(Application application, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s9t) ipChange.ipc$dispatch("a829b3f9", new Object[]{application, str, str2, new Boolean(z)});
        }
        if (str2.startsWith(d) || z) {
            return new xui(application, str, str2);
        }
        if (TextUtils.equals(str, str2)) {
            return new v0i(application, str, str2);
        }
        return new x42(application, str, str2);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31b1f5da", new Object[]{this});
            return;
        }
        try {
            x0s x0sVar = new x0s(this.f27892a);
            x0sVar.a("STARTUP_TIME", Long.valueOf(TaobaoApplication.sStartTime));
            x0sVar.a("APP_ID", "12278902@android");
            x0sVar.a("APP_KEY", "12278902");
            x0sVar.a(oeh.CHANNEL, "60000");
            x0sVar.a(SessionManager.CURRENT_PROCESS, this.c);
            x0sVar.a("APP_VERSION", TaobaoApplication.sAppVersion);
            HashMap hashMap = new HashMap();
            hashMap.put(SessionManager.CURRENT_PROCESS, this.c);
            wbr.b(this.f27892a, "12278902", TaobaoApplication.sAppVersion, x0sVar.d(oeh.CHANNEL, "60000"), null, hashMap);
            UncaughtCrashManager n = s0s.k(x0sVar, null).n();
            if (n instanceof k1s) {
                ((k1s) n).b();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        c();
        b();
    }
}
