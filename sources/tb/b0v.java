package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.behavior.config.UTBehaviorConfig;
import com.ut.mini.behavior.module.ModulesConfig;
import com.ut.mini.behavior.trigger.TriggerConfig;
import java.io.File;
import java.util.Random;
import tb.m8b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b0v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int c;

    /* renamed from: a  reason: collision with root package name */
    public static long f16118a = 0;
    public static boolean b = false;
    public static boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String access$000 = b0v.access$000();
            if (access$000 != null) {
                b0v.access$100(sg9.c(access$000));
            }
            a0v.init();
        }
    }

    static {
        t2o.a(962593198);
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return b();
    }

    public static /* synthetic */ boolean access$100(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd2b2e86", new Object[]{str})).booleanValue();
        }
        return c(str);
    }

    public static /* synthetic */ boolean access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26a27dfd", new Object[0])).booleanValue();
        }
        return b;
    }

    public static /* synthetic */ boolean access$202(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b117a53d", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static /* synthetic */ void access$300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b88b93a", new Object[0]);
        } else {
            d();
        }
    }

    public static /* synthetic */ long access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("906ef46f", new Object[0])).longValue();
        }
        return f16118a;
    }

    public static /* synthetic */ void access$500(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdec6286", new Object[]{str});
        } else {
            a(str);
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51fa764f", new Object[0]);
        }
        Context g = o2w.k().g();
        if (g == null) {
            g = wu3.c().b();
        }
        if (g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(g.getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(zj4.UT_FILE_DIR);
        String sb2 = sb.toString();
        sg9.b(sb2);
        return sb2 + str + "3c080a1447baf9ff";
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60dc73a5", new Object[]{str})).booleanValue();
        }
        if (hsq.f(str)) {
            d();
            return false;
        }
        try {
            UTBehaviorConfig uTBehaviorConfig = (UTBehaviorConfig) JSON.parseObject(str, UTBehaviorConfig.class);
            if (uTBehaviorConfig != null && uTBehaviorConfig.v == 1) {
                f16118a = uTBehaviorConfig.timestamp;
                vyi.getInstance().init(uTBehaviorConfig.modulesConfig);
                bgu.getInstance().init(uTBehaviorConfig.triggerConfig);
                nhh.f("UTBehaviorConfigMgr", "init config timestamp", Long.valueOf(f16118a));
                return true;
            }
        } catch (Exception e) {
            nhh.h("UTBehaviorConfigMgr", e, new Object[0]);
        }
        d();
        return false;
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156ae7be", new Object[0]);
            return;
        }
        f16118a = 0L;
        vyi.getInstance().init((ModulesConfig) null);
        bgu.getInstance().init((TriggerConfig) null);
        nhh.f("UTBehaviorConfigMgr", "init null config");
    }

    public static boolean enableSample(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54d00a34", new Object[]{new Long(j)})).booleanValue();
        }
        if (c < j) {
            return true;
        }
        return false;
    }

    public static synchronized void initConfig() {
        synchronized (b0v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6811c3f9", new Object[0]);
            } else if (!d) {
                d = true;
                nhh.f("UTBehaviorConfigMgr", "init");
                c = new Random().nextInt(10000);
                zdt.c().f(new a());
            }
        }
    }

    public static void updateConfig(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78117888", new Object[]{str, new Long(j)});
        } else {
            zdt.c().f(new b(str, j));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$host;
        public final /* synthetic */ long val$timestamp;

        public b(String str, long j) {
            this.val$host = str;
            this.val$timestamp = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (b0v.access$200()) {
                nhh.f("UTBehaviorConfigMgr", "Config is updating...");
            } else {
                b0v.access$202(true);
                nhh.f("UTBehaviorConfigMgr", "updateConfig host", this.val$host, "timestamp", Long.valueOf(this.val$timestamp));
                if (hsq.f(this.val$host)) {
                    b0v.access$300();
                    String access$000 = b0v.access$000();
                    if (access$000 != null) {
                        sg9.a(access$000);
                        return;
                    }
                    return;
                }
                nhh.f("UTBehaviorConfigMgr", "File Timestamp", Long.valueOf(b0v.access$400()));
                if (this.val$timestamp > b0v.access$400()) {
                    b0v.access$500(this.val$host);
                } else {
                    nhh.f("UTBehaviorConfigMgr", "Do not need update Config");
                }
                b0v.access$202(false);
            }
        }
    }

    public static void a(String str) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbff40fb", new Object[]{str});
        } else if (!hsq.f(str)) {
            String str2 = str + "/v1.json";
            m8b.a a2 = new m8b().a(str2);
            nhh.f("UTBehaviorConfigMgr", "downloadConfig url", str2, "response", a2);
            if (a2 != null && (bArr = a2.f23843a) != null) {
                try {
                    String str3 = new String(bArr, 0, bArr.length);
                    if (c(str3)) {
                        sg9.d(b(), str3);
                    }
                } catch (Throwable th) {
                    nhh.h("UTBehaviorConfigMgr", th, new Object[0]);
                }
            }
        }
    }
}
