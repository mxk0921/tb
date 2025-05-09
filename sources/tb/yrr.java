package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yrr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile yrr f32307a = null;
    public static final HashMap<String, b> b = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final s f32308a;
        public int b;
        public final Handler c;
        public Runnable d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f32309a;
            public final /* synthetic */ long b;

            public a(String str, long j) {
                this.f32309a = str;
                this.b = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b.a(b.this).j();
                b.g(b.this, null);
                yrr.a().remove(this.f32309a);
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "lee +++ remove instance delay,token:" + b.a(b.this) + ", delayMillis:" + this.b);
            }
        }

        static {
            t2o.a(451936301);
        }

        public static /* synthetic */ s a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (s) ipChange.ipc$dispatch("169f51aa", new Object[]{bVar});
            }
            return bVar.f32308a;
        }

        public static /* synthetic */ int b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6af73145", new Object[]{bVar})).intValue();
            }
            return bVar.b;
        }

        public static /* synthetic */ int c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f0a5974d", new Object[]{bVar})).intValue();
            }
            int i = bVar.b;
            bVar.b = 1 + i;
            return i;
        }

        public static /* synthetic */ int d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("70fafca4", new Object[]{bVar})).intValue();
            }
            int i = bVar.b;
            bVar.b = i - 1;
            return i;
        }

        public static /* synthetic */ void e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("256cd1d3", new Object[]{bVar});
            } else {
                bVar.i();
            }
        }

        public static /* synthetic */ Runnable f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Runnable) ipChange.ipc$dispatch("fdd14ac0", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ Runnable g(b bVar, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Runnable) ipChange.ipc$dispatch("5021edc0", new Object[]{bVar, runnable});
            }
            bVar.d = runnable;
            return runnable;
        }

        public static /* synthetic */ void h(b bVar, String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7429145", new Object[]{bVar, str, new Long(j)});
            } else {
                bVar.j(str, j);
            }
        }

        public final void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3170af9f", new Object[]{this});
                return;
            }
            Runnable runnable = this.d;
            if (runnable != null) {
                this.c.removeCallbacks(runnable);
                this.d = null;
            }
        }

        public final void j(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("769d0ae3", new Object[]{this, str, new Long(j)});
            } else if (j <= 0) {
                this.f32308a.j();
                this.d = null;
                yrr.a().remove(str);
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "lee +++ remove instance,token:" + this.f32308a + ", delayMillis:" + j);
            } else {
                if (j > 3000) {
                    j = 3000;
                }
                i();
                a aVar = new a(str, j);
                this.d = aVar;
                this.c.postDelayed(aVar, j);
            }
        }

        public b(s sVar, int i) {
            this.f32308a = sVar;
            this.b = i;
            this.c = new Handler(Looper.getMainLooper());
        }
    }

    static {
        t2o.a(451936299);
    }

    public static /* synthetic */ HashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1cf2bb20", new Object[0]);
        }
        return b;
    }

    public static yrr c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yrr) ipChange.ipc$dispatch("6b7ac00e", new Object[0]);
        }
        if (f32307a == null) {
            synchronized (yrr.class) {
                try {
                    if (f32307a == null) {
                        f32307a = new yrr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f32307a;
    }

    public void b(s sVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a381572c", new Object[]{this, sVar, str});
            return;
        }
        HashMap<String, b> hashMap = b;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new b(sVar, 1));
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, sVar + ",lee +++ addInstance, token:" + str);
        }
    }

    public s d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("44aaabe2", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        b bVar = null;
        for (Map.Entry<String, b> entry : b.entrySet()) {
            String key = entry.getKey();
            b value = entry.getValue();
            if (key.startsWith(str) || str.startsWith(key)) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "lee +++ find:" + str + ", startsWith: " + key + ", instance: " + value);
                bVar = value;
            }
        }
        if (bVar == null) {
            return null;
        }
        if (b.b(bVar) == 0 && b.f(bVar) != null) {
            b.e(bVar);
        }
        b.c(bVar);
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, b.a(bVar) + ", lee +++ get refCount:" + b.b(bVar) + ", token:" + str);
        return b.a(bVar);
    }

    public long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ce57eec", new Object[]{this})).longValue();
        }
        return b.size();
    }

    public String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46464eda", new Object[]{this, str});
        }
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (Map.Entry<String, b> entry : b.entrySet()) {
            String key = entry.getKey();
            b value = entry.getValue();
            if (key.startsWith(str) || str.startsWith(key)) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "lee +++ getReuseWithToken find:" + str + ", startsWith: " + key + ", instance: " + value);
                str2 = key;
            }
        }
        return str2;
    }

    public boolean h(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2996229", new Object[]{this, str, new Long(j)})).booleanValue();
        }
        b bVar = b.get(str);
        if (bVar == null || b.b(bVar) == 0) {
            return false;
        }
        b.d(bVar);
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, b.a(bVar) + ", lee +++ ret refCount:" + b.b(bVar) + ", delayMillis:" + j);
        if (b.b(bVar) == 0 && b.f(bVar) == null) {
            b.h(bVar, str, j);
        }
        return true;
    }

    public boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec4f6a65", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        b bVar = null;
        for (Map.Entry<String, b> entry : b.entrySet()) {
            String key = entry.getKey();
            b value = entry.getValue();
            if (key.startsWith(str)) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "lee +++ has PlayerInstance:" + str + ", startsWith: " + key + ", instance: " + value);
                bVar = value;
            }
        }
        return bVar != null;
    }
}
