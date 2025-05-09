package tb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.android.msp.biz.thirdpay.ThirdPayManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.utils.CashDeskLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xp3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<b> f31508a;
    public static final ConcurrentHashMap<String, b> b = new ConcurrentHashMap<>();
    public static final ExecutorService c = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: tb.wp3
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread i;
            i = xp3.i(runnable);
            return i;
        }
    });
    public static final Handler d = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f31509a;
        public final /* synthetic */ Runnable b;

        public a(Context context, Runnable runnable) {
            this.f31509a = context;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            xp3.e(this.f31509a);
            xp3.d().post(this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "instanceID")
        private final String mInstId;
        @JSONField(name = "onlyUseInBuy")
        private final boolean mOnlyUseInBuy;
        @JSONField(name = "packageName")
        private final String mPackageName;
        @JSONField(name = "versionCode")
        private final long mVersionCode;

        public b(String str, String str2, long j, boolean z) {
            this.mInstId = str;
            this.mPackageName = str2;
            this.mVersionCode = j;
            this.mOnlyUseInBuy = z;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d2492662", new Object[]{this});
            }
            return this.mInstId;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[]{this});
            }
            return this.mPackageName;
        }

        public long c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9a446eaa", new Object[]{this})).longValue();
            }
            return this.mVersionCode;
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9dbdab31", new Object[]{this})).booleanValue();
            }
            return this.mOnlyUseInBuy;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f31508a = arrayList;
        arrayList.add(new b(ThirdPayManager.ThirdPayTypeVal.VAL_CUP, "com.unionpay", 0L, true));
        arrayList.add(new b("BOCOMC", "com.bankcomm.maidanba", 0L, true));
        arrayList.add(new b("CMBCC", "com.cmbc.cc.mbank", 0L, true));
        arrayList.add(new b("ICBC", "com.icbc", 0L, true));
        arrayList.add(new b("WX", "com.tencent.mm", 0L, true));
        arrayList.add(new b("ALIPAY", "com.eg.android.AlipayGphone", 73L, true));
        arrayList.add(new b("BESTPAY", "com.chinatelecom.bestpayclient", 101330L, false));
        arrayList.add(new b("CMPAY", "com.cmcc.hebao", 140911500L, false));
        arrayList.add(new b("SPABANK", "com.pingan.paces.ccms", 4290L, false));
        arrayList.add(new b("DCEP", "cn.gov.pbc.dcep", 0L, false));
        arrayList.add(new b("YFZFYXGS", "com.android.yufuec", 308L, false));
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260f3e1e", new Object[]{context});
        } else {
            c(context, null);
        }
    }

    public static void c(Context context, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545fed9c", new Object[]{context, runnable});
        } else {
            c.execute(new a(context, runnable));
        }
    }

    public static /* synthetic */ Handler d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("1554edef", new Object[0]);
        }
        return d;
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6cace1a", new Object[]{context});
            return;
        }
        Iterator it = ((ArrayList) f31508a).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (h(context, bVar.b(), bVar.c())) {
                b.put(bVar.b(), bVar);
            }
        }
    }

    public static String f(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fe83a34", new Object[]{context, new Boolean(z)});
        }
        ConcurrentHashMap<String, b> concurrentHashMap = b;
        if (concurrentHashMap.isEmpty()) {
            e(context);
        }
        StringBuilder sb = new StringBuilder();
        for (b bVar : concurrentHashMap.values()) {
            if (!z || !bVar.d()) {
                if (sb.length() != 0) {
                    sb.append("|");
                }
                sb.append(bVar.a());
            }
        }
        b(context);
        String sb2 = sb.toString();
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "getSupportedThirdPay:" + sb2);
        return sb2;
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9ef691f", new Object[]{context})).booleanValue();
        }
        if (b.containsKey("com.eg.android.AlipayGphone")) {
            return true;
        }
        return h(context, "com.eg.android.AlipayGphone", 73L);
    }

    public static boolean h(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("357e5e20", new Object[]{context, str, new Long(j)})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null && str.equals(packageInfo.packageName)) {
                if (packageInfo.versionCode >= j) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            CashDeskLog.b("CheckAppInstalledHelper", "Package not found: " + str + ", message: " + e.getMessage());
            return false;
        } catch (Exception e2) {
            CashDeskLog.b("CheckAppInstalledHelper", "Error checking package: " + str + ", message: " + e2.getMessage());
            return false;
        }
    }

    public static /* synthetic */ Thread i(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("b5ab8d0b", new Object[]{runnable});
        }
        Thread thread = new Thread(runnable);
        thread.setName("CheckAppInstalledHelperThread");
        return thread;
    }
}
