package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class arm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FAILED = "failed";
    public static final String OPTIMIZE_TYPE_ORDER_LIST_T_SCHEDULE = "orderList_tschdule";
    public static final String OPTIMIZE_TYPE_PS_ORDER = "ps_order";
    public static final String OPTIMIZE_TYPE_PS_T_SCHEDULE = "ps_tschedule";
    public static final String OPTIMIZE_TYPE_T_SCHEDULE = "tschdule";
    public static final String OPTIMIZE_TYPE_T_SCHEDULE_AND_INSTANT = "tscheduleAndInstantOpen";
    public static final String ORIGIN_MY_TAO_BAO = "myTaoBao";
    public static final String ORIGIN_NEW_BUY = "newbuy";
    public static final String ORIGIN_ORDER = "order";
    public static final String ORIGIN_T_SCHEDULE = "tschedule";
    public static final String SUCCESS = "success";

    /* renamed from: a  reason: collision with root package name */
    public static String f15953a = "none";
    public static String b = "none";
    public static String c = "none";

    static {
        t2o.a(729809727);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5acb0aec", new Object[0]);
        }
        return f15953a;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c30a065d", new Object[0]);
        }
        return b;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3877f3a", new Object[0]);
        }
        return c;
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463f76e6", new Object[0]);
            return;
        }
        f15953a = "none";
        b = "none";
        c = "none";
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f34c70a", new Object[]{str});
        } else {
            f15953a = str;
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3de0b2b9", new Object[]{str});
        } else {
            b = str;
        }
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c395e4", new Object[]{str});
        } else {
            c = str;
        }
    }
}
