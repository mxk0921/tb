package tb;

import com.alibaba.android.icart.core.data.DataBizContext;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class h0r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f20348a = new CopyOnWriteArrayList();
    public static volatile boolean b = false;
    public static final String sNamespace = "cart_switch";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if ("cart_switch".equals(str)) {
                h0r.a();
                DataBizContext.ShareContext.updateOnlySPForOrangeChange();
                h0r.b(true);
            }
        }
    }

    static {
        t2o.a(479199549);
        OrangeConfig.getInstance().registerListener(new String[]{"cart_switch"}, new a(), true);
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            c();
        }
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace7a89c", new Object[0]);
        } else {
            ((CopyOnWriteArrayList) f20348a).clear();
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78e78d68", new Object[0])).booleanValue();
        }
        return v9v.i("aura_purchase_perf", "enableCartDataTransmit", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa40a19d", new Object[0])).booleanValue();
        }
        return v9v.i("cart_switch", "enableCouponPerf", true);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("287111e0", new Object[0])).booleanValue();
        }
        return v9v.i("aura_purchase_perf", "enableICartAsyncUT", true);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4cdcdca", new Object[0])).booleanValue();
        }
        return v9v.i("cart_switch", "enablePrefetchV2Perf", true);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e291e76a", new Object[0])).booleanValue();
        }
        return v9v.i("cart_switch", "enablePrefetchViewV2", true);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66f6df52", new Object[0])).booleanValue();
        }
        return v9v.i("cart_switch", "enableTouchDownPerf", true);
    }

    public static List<String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ce46e5dc", new Object[0]);
        }
        List<String> list = f20348a;
        if (!((CopyOnWriteArrayList) list).isEmpty()) {
            return list;
        }
        try {
            Iterator<Object> it = JSON.parseArray(OrangeConfig.getInstance().getConfig("cart_switch", "widgetIds", "[\"taoTrade\",\"taoCartsMini\"]")).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                ((CopyOnWriteArrayList) f20348a).add(String.valueOf(next));
            }
        } catch (Exception unused) {
        }
        return f20348a;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a69f4ae", new Object[0])).booleanValue();
        }
        return b;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d77a99d5", new Object[0])).booleanValue();
        }
        return v9v.i("cart_switch", "needUseLocalInCalculatePop", false);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7876efe", new Object[0])).booleanValue();
        }
        return v9v.i("cart_switch", "needShowCushionView", true);
    }
}
