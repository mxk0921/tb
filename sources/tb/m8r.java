package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m8r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, Integer> f23849a;
    public static long e;
    public static final Map<String, Drawable> b = new ConcurrentHashMap();
    public static final Set<String> c = new CopyOnWriteArraySet();
    public static final Set<String> d = new CopyOnWriteArraySet();
    public static boolean f = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f23850a;
        public final /* synthetic */ Context b;

        public a(int i, Context context) {
            this.f23850a = i;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ck.g().e("触发购物车小图prealod", ck.b.b().i("AURA/performance").a());
            if (m8r.a().size() < m8r.b().size()) {
                m8r.m(m8r.b(), this.f23850a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            rbb g = ck.g();
            g.e("【下单小图】图片预加载失败:" + failPhenixEvent.getUrl(), ck.b.b().i("AURA/performance").a());
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23851a;

        public c(String str) {
            this.f23851a = str;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable != null && !succPhenixEvent.isIntermediate()) {
                if (drawable instanceof uwn) {
                    ((uwn) drawable).l();
                }
                m8r.a().put(this.f23851a, drawable);
                if (m8r.a().size() == m8r.b().size()) {
                    m8r.d(m8r.c());
                }
            }
            return false;
        }
    }

    static {
        t2o.a(708837578);
        i();
    }

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ Set b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d589fca7", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a27ded", new Object[0])).longValue();
        }
        return e;
    }

    public static /* synthetic */ void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158ee4ca", new Object[]{new Long(j)});
        } else {
            k(j);
        }
    }

    public static void e(int i, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ebf866", new Object[]{new Integer(i), context});
        } else {
            dn.h(new a(i, context));
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[0]);
        } else {
            ((ConcurrentHashMap) b).clear();
        }
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f245d717", new Object[0])).booleanValue();
        }
        return !((ConcurrentHashMap) b).isEmpty();
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7406f55", new Object[0]);
            return;
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        f23849a = hashMap;
        hashMap.put("https://img.alicdn.com/imgextra/i4/O1CN01DhxFsl1Ug74Neipic_!!6000000002546-2-tps-66-66.png", Integer.valueOf(R.drawable.buy_location));
        f23849a.put("https://img.alicdn.com/imgextra/i1/O1CN01VFY5Jb1tbPNzE4lwK_!!6000000005920-2-tps-32-32.png", Integer.valueOf(R.drawable.plus_sign));
        f23849a.put("https://img.alicdn.com/imgextra/i1/O1CN01MTaKxl1DC1ZQfVKxt_!!6000000000179-2-tps-32-5.png", Integer.valueOf(R.drawable.minus_sign));
        f23849a.put("https://gw.alicdn.com/imgextra/i3/O1CN016eG6gK1NRHAxMEpf4_!!6000000001566-2-tps-48-48.png", Integer.valueOf(R.drawable.right_arrow));
        Collections.addAll(c, "https://img.alicdn.com/imgextra/i4/O1CN01DhxFsl1Ug74Neipic_!!6000000002546-2-tps-66-66.png", "https://img.alicdn.com/imgextra/i1/O1CN01VFY5Jb1tbPNzE4lwK_!!6000000005920-2-tps-32-32.png", "https://img.alicdn.com/imgextra/i1/O1CN01MTaKxl1DC1ZQfVKxt_!!6000000000179-2-tps-32-5.png", "https://gw.alicdn.com/imgextra/i3/O1CN016eG6gK1NRHAxMEpf4_!!6000000001566-2-tps-48-48.png", "//img.alicdn.com/imgextra/i3/O1CN01VVKCEj1JLzy7JwdqC_!!6000000001013-2-tps-88-88.png", "//gw.alicdn.com/tfs/TB1CzD7SXXXXXXJaXXXXXXXXXXX-32-32.png", "//img.alicdn.com/tps/i2/TB1wopUHVXXXXXyXpXXAAT2HVXX-63-63.png", "https://img.alicdn.com/imgextra/i4/O1CN017rfbTj1hByBjCGYmw_!!6000000004240-2-tps-60-48.png", "https://img.alicdn.com/imgextra/i2/O1CN01tjnqoR1Jb79T2if5y_!!6000000001046-2-tps-48-48.png", "https://img.alicdn.com/imgextra/i2/O1CN01iuN6Bp1OCRp2vn6bD_!!6000000001669-2-tps-66-66.png", "https://img.alicdn.com/imgextra/i1/O1CN01SM1aqA278SzDahErR_!!6000000007752-2-tps-66-66.png", "//img.alicdn.com/imgextra/i2/O1CN01GU2o4m1VzBAjv2zYV_!!6000000002723-2-tps-66-66.png", "//img.alicdn.com/imgextra/i4/O1CN01U4WSFq1cwcGj2zGOS_!!6000000003665-2-tps-66-66.png", "https://img.alicdn.com/imgextra/i1/O1CN01QKhsKS23TkxhwpL7L_!!6000000007257-2-tps-32-32.png", "https://img.alicdn.com/imgextra/i1/O1CN01EuZ7xH1DaIamKYT04_!!6000000000232-2-tps-66-66.png");
        String string = AliBuyPerfSwitcher.getString("thumbnailPreloadBlacklistList", "https://gw.alicdn.com/imgextra/i4/O1CN01xiK5xl1RJGfUvuGsJ_!!6000000002090-2-tps-76-36.png,//img.alicdn.com/imgextra/i2/O1CN016XDyFB1scUjGwta3x_!!6000000005787-2-tps-28-28.png,https://img.alicdn.com/imgextra/i2/O1CN01Hmr2Ci26MNUuPMsFy_!!6000000007647-2-tps-360-72.png,https://img.alicdn.com/imgextra/i2/O1CN011M9pg41KJzseITw00_!!6000000001144-2-tps-104-72.png,https://img.alicdn.com/imgextra/i2/O1CN014TcqC329wVaSq99sF_!!6000000008132-2-tps-32-36.png,https://img.alicdn.com/imgextra/i3/O1CN01sc2SfN1rZSd24UOE6_!!6000000005645-2-tps-75-77.png,https://img.alicdn.com/imgextra/i4/O1CN01tpw7ik1UOiAdmPi2G_!!6000000002508-2-tps-78-81.png,https://img.alicdn.com/imgextra/i3/O1CN01gwu5kE1KNf6mnFpUB_!!6000000001152-2-tps-75-75.png");
        if (!TextUtils.isEmpty(string)) {
            String[] split = string.split(",");
            ck.g().e("小图url黑名单添加完成: ".concat(string), ck.b.b().i("AURA/performance").a());
            Collections.addAll(d, split);
        }
    }

    public static Drawable j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("deba27e", new Object[]{str});
        }
        return (Drawable) ((ConcurrentHashMap) b).get(g(str));
    }

    public static void k(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1682c9a3", new Object[]{new Long(j)});
            return;
        }
        long j2 = 0;
        for (Map.Entry entry : ((ConcurrentHashMap) b).entrySet()) {
            Drawable drawable = (Drawable) entry.getValue();
            if (drawable instanceof BitmapDrawable) {
                j2 += ((BitmapDrawable) drawable).getBitmap().getByteCount();
            }
        }
        rbb g = ck.g();
        StringBuilder sb = new StringBuilder("【下单小图】preload成功。耗费内存");
        sb.append(j2 / 1024.0d);
        sb.append("KB。耗时：");
        sb.append(System.currentTimeMillis() - j);
        sb.append("mspreload图片成功率");
        Map<String, Drawable> map = b;
        sb.append(((ConcurrentHashMap) map).size());
        sb.append("-");
        Set<String> set = c;
        sb.append(((CopyOnWriteArraySet) set).size());
        sb.append(" = ");
        sb.append((((ConcurrentHashMap) map).size() / ((CopyOnWriteArraySet) set).size()) * 100);
        sb.append(f7l.MOD);
        g.e(sb.toString(), ck.b.b().i("AURA/performance").a());
    }

    public static void l(String str, int i, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733606b1", new Object[]{str, new Integer(i), context});
            return;
        }
        String g = g(str);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) b;
        if (!concurrentHashMap.containsKey(g)) {
            if (f23849a.containsKey(str)) {
                concurrentHashMap.put(g, ContextCompat.getDrawable(context, f23849a.get(str).intValue()));
                return;
            }
            if (!f) {
                e = System.currentTimeMillis();
                f = true;
            }
            PhenixCreator failListener = s0m.B().T(str).succListener(new c(g)).failListener(new b());
            if (i > 0) {
                failListener.limitSize(null, i, i);
            }
            failListener.fetch();
        }
    }

    public static void m(Set<String> set, int i, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348fb422", new Object[]{set, new Integer(i), context});
            return;
        }
        for (String str : set) {
            if (str != null) {
                l(str, i, context);
            }
        }
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91797af6", new Object[]{str});
        }
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf != -1) {
            return str.substring(lastIndexOf + 1);
        }
        ck.g().e("【下单小图】url格式错误 （TBBuyImagePreLoader#extractNameFromUrl）");
        return "";
    }

    public static boolean n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9cf35e3", new Object[]{str})).booleanValue();
        }
        return ((CopyOnWriteArraySet) d).contains(str) || str.contains("sns_logo");
    }
}
