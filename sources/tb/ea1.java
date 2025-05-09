package tb;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ea1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final b f18399a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        d a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f18400a;
        public final String b;
        public final SharedPreferences c;

        public c(Context context, String str) {
            this.f18400a = context;
            this.b = str;
            this.c = m7l.a(context, "ApplicationExitImpl", 0);
        }

        @Override // tb.ea1.b
        public d a() {
            Object systemService;
            List historicalProcessExitReasons;
            int reason;
            String applicationExitInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("fc313abf", new Object[]{this});
            }
            systemService = this.f18400a.getSystemService(ActivityManager.class);
            try {
                historicalProcessExitReasons = ((ActivityManager) systemService).getHistoricalProcessExitReasons(this.f18400a.getPackageName(), b(), 1);
                c();
                Iterator it = historicalProcessExitReasons.iterator();
                if (!it.hasNext()) {
                    return null;
                }
                ApplicationExitInfo a2 = p01.a(it.next());
                reason = a2.getReason();
                String valueOf = String.valueOf(reason);
                applicationExitInfo = a2.toString();
                return new d(valueOf + "/-1", applicationExitInfo);
            } catch (Exception e) {
                ehh.d(e);
                return null;
            }
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9f55dc0d", new Object[]{this})).intValue();
            }
            return this.c.getInt(this.b, 0);
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4494449", new Object[]{this});
            } else {
                this.c.edit().putInt(this.b, Process.myPid()).apply();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f18401a;
        public final String b;

        public d(String str, String str2) {
            this.f18401a = str;
            this.b = str2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.ea1.b
        public d a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("fc313abf", new Object[]{this});
            }
            return null;
        }
    }

    public ea1(Context context, String str) {
        b bVar;
        if (Build.VERSION.SDK_INT >= 30) {
            bVar = new c(context, str);
        } else {
            bVar = new e();
        }
        this.f18399a = bVar;
    }

    public d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("fc313abf", new Object[]{this});
        }
        return this.f18399a.a();
    }
}
