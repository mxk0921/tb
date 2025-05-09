package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cqh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String Namespace = "EdgeComputingIsEnabled";
    public static final List<b> e = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17231a;
    public final boolean b;
    public final List<String> c;
    public final List<String> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f17232a;

        public a(long j) {
            this.f17232a = j;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            kgh.j("MRTConfiguration", "get orange config need " + (currentTimeMillis - this.f17232a) + " (ms)");
            cqh.c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void a(cqh cqhVar);
    }

    static {
        t2o.a(577765382);
    }

    public cqh(boolean z, boolean z2, int i, List<String> list, List<String> list2) {
        this.f17231a = z;
        this.d = list;
        this.c = list2;
        this.b = z2;
    }

    public static List<String> a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("61386aea", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || (split = str.split(",")) == null) {
            return null;
        }
        return Arrays.asList(split);
    }

    public static void b(cqh cqhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce10045d", new Object[]{cqhVar});
            return;
        }
        List<b> list = e;
        synchronized (list) {
            try {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a(cqhVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b57f431e", new Object[0]);
            return;
        }
        cqh f = f();
        oqh.d().o(f);
        b(f);
    }

    public static boolean d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f97c9673", new Object[]{bVar})).booleanValue();
        }
        if (bVar == null) {
            return false;
        }
        List<b> list = e;
        synchronized (list) {
            try {
                if (((ArrayList) list).contains(bVar)) {
                    return true;
                }
                ((ArrayList) list).add(bVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7692283", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        OrangeConfig.getInstance().registerListener(new String[]{"EdgeComputingIsEnabled"}, new a(currentTimeMillis), true);
        try {
            OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "whitelist", null);
        } catch (Throwable unused) {
        }
    }

    public static cqh f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cqh) ipChange.ipc$dispatch("7c2d9159", new Object[0]);
        }
        String config = OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "whitelist", null);
        String config2 = OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "blacklist", null);
        String config3 = OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "isEnabled", "true");
        String config4 = OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "stopRunCompute", "false");
        String config5 = OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "maxDelayTime", "10");
        List<String> a2 = a(config2);
        return new cqh(Boolean.valueOf(config3).booleanValue(), Boolean.valueOf(config4).booleanValue(), Integer.valueOf(config5).intValue(), a(config), a2);
    }
}
