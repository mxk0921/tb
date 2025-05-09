package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yxr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OrangeEnablePrefetch = "enable_zcache_prefetch";
    public static final String OrangeNameSpace = "trade_zcache";

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f32410a;
    public static final List<String> b;
    public static final List<String> c;
    public static final List<String> d;
    public static final List<String> e;
    public static final List<String> f;
    public static final List<String> g;
    public static final List<String> h;
    public static final List<String> i;
    public static final List<String> j;
    public static final List<String> k;
    public static final List<String> l;
    public static final List<String> m;
    public static final List<String> n;
    public static final List<String> o;
    public static final List<String> p;
    public static final List<String> q;
    public static final List<String> r;
    public static final List<List<String>> s;

    public static List<String> a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8eb9d1a0", new Object[]{str, list});
        }
        String g2 = v9v.g(OrangeNameSpace, str, null);
        if (g2 == null) {
            hav.d("Trade_ZCache", str + " orange load error");
            return list;
        }
        try {
            return JSON.parseArray(g2, String.class);
        } catch (Exception unused) {
            hav.d("Trade_ZCache", "JSONArray parse error");
            return list;
        }
    }

    public static void b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94109fc5", new Object[]{new Integer(i2)});
        } else if (Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(OrangeNameSpace, OrangeEnablePrefetch, "true"))) {
            ArrayList arrayList = (ArrayList) s;
            if (i2 >= arrayList.size()) {
                hav.d("Trade_ZCache", i2 + " invalid bizType");
                return;
            }
            List<String> a2 = a(ae2.BizNames.get(i2), (List) arrayList.get(i2));
            if (a2.size() == 0) {
                hav.d("Trade_ZCache", i2 + " bizPrefetchList is empty");
                return;
            }
            hav.d("Trade_ZCache", i2 + " prefetch: " + a2.toString());
            c(a2);
        }
    }

    public static void c(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a01b4119", new Object[]{list});
        } else if (list != null && !list.isEmpty()) {
            if (TextUtils.equals("true", OrangeConfig.getInstance().getConfig(OrangeNameSpace, "enable_zcache_setup", "false")) && yox.g() == null) {
                ppx.b();
                hav.d("Trade_ZCache", "上下文为空，执行ZCache初始化操作！" + list.toString());
            }
            yox.n(list);
        }
    }

    static {
        t2o.a(157286578);
        List<String> asList = Arrays.asList("pay-success-v3", "odetail4", "refund_list_weex", "tbsuperbuy");
        f32410a = asList;
        List<String> asList2 = Arrays.asList(new String[0]);
        b = asList2;
        List<String> asList3 = Arrays.asList("pay-success-v3", "tbsuperbuy");
        c = asList3;
        List<String> asList4 = Arrays.asList("odetail4", "pay-success-v3", "refund_list_weex", "new_osearch");
        d = asList4;
        List<String> asList5 = Arrays.asList("tbsuperbuy");
        e = asList5;
        List<String> asList6 = Arrays.asList(new String[0]);
        f = asList6;
        List<String> asList7 = Arrays.asList("tbsuperbuy");
        g = asList7;
        List<String> asList8 = Arrays.asList("pay-success-v3");
        h = asList8;
        List<String> asList9 = Arrays.asList("odetail4");
        i = asList9;
        List<String> asList10 = Arrays.asList("refund_list_weex");
        j = asList10;
        List<String> asList11 = Arrays.asList("tbsuperbuy");
        k = asList11;
        List<String> asList12 = Arrays.asList("tbsuperbuy");
        l = asList12;
        List<String> asList13 = Arrays.asList("tbsuperbuy");
        m = asList13;
        List<String> asList14 = Arrays.asList(new String[0]);
        n = asList14;
        List<String> asList15 = Arrays.asList(new String[0]);
        o = asList15;
        List<String> asList16 = Arrays.asList("odetail4");
        p = asList16;
        List<String> asList17 = Arrays.asList(new String[0]);
        q = asList17;
        List<String> asList18 = Arrays.asList(new String[0]);
        r = asList18;
        s = new ArrayList(Arrays.asList(asList, asList2, asList3, asList4, asList5, asList6, asList7, asList8, asList9, asList10, asList11, asList12, asList13, asList14, asList15, asList16, asList17, asList18));
    }

    public static void d(String str) {
        int i2 = 6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27d4a4", new Object[]{str});
            return;
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -708204916:
                if (str.equals(SkuLogUtils.DEFAULT_BIZ_NAME)) {
                    c2 = 0;
                    break;
                }
                break;
            case -390864660:
                if (str.equals(OrderBizCode.orderList)) {
                    c2 = 1;
                    break;
                }
                break;
            case 3046176:
                if (str.equals("cart")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3322092:
                if (str.equals("live")) {
                    c2 = 3;
                    break;
                }
                break;
            case 99062569:
                if (str.equals(c9x.CART_BIZ_NAME)) {
                    c2 = 4;
                    break;
                }
                break;
            case 120528346:
                if (str.equals("mytaobao")) {
                    c2 = 5;
                    break;
                }
                break;
            case 1557721601:
                if (str.equals("detail2")) {
                    c2 = 6;
                    break;
                }
                break;
            case 1743324417:
                if (str.equals("purchase")) {
                    c2 = 7;
                    break;
                }
                break;
            case 2103471391:
                if (str.equals(OrderBizCode.orderDetail)) {
                    c2 = '\b';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                break;
            case 1:
                i2 = 3;
                break;
            case 2:
            case 4:
                i2 = 1;
                break;
            case 3:
                i2 = 11;
                break;
            case 5:
                i2 = 9;
                break;
            case 6:
                i2 = 10;
                break;
            case 7:
                i2 = 2;
                break;
            case '\b':
                i2 = 4;
                break;
            default:
                i2 = 0;
                break;
        }
        b(i2);
    }
}
