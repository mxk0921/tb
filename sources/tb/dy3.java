package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class dy3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Integer[]> f18147a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262086);
        }

        public a() {
        }

        public final HashMap<String, Integer[]> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("19e82c3c", new Object[]{this});
            }
            return dy3.a();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(912262085);
        HashMap<String, Integer[]> hashMap = new HashMap<>();
        hashMap.put("D-N", new Integer[]{-300007, -300008, -300009, -300003, -300004, -300005, -300006, -300019, -300020});
        hashMap.put("D-R", new Integer[]{-100001, -100011, -100002, -100040, -100041, -100042});
        hashMap.put("D-Other", new Integer[]{-100016, -100017, -100018, -300010, -100008, -100015, -100021, -100022, -100025, -100026, -100027, -100028, -100029, -500005, -500006, -800007, -500007, -600007, -600008, -600009, -900001, -900002, -900003, -900004, -100043, -100044});
        hashMap.put("D-SKU", new Integer[]{-700001, -700002, -700003, -700004, -700005, -700006, -700007, -700008, -700026, -700027, -700018, 700019, -700020, -700021, -700022, -700023, -700024, -700028, -700030});
        f18147a = hashMap;
    }

    public static final /* synthetic */ HashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a9eed6e9", new Object[0]);
        }
        return f18147a;
    }
}
