package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ao4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f15892a;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d68e362", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (f15892a.contains(str) || b(str) || c(str)) {
            return true;
        }
        return false;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1385f6a", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("recommend_multi_channel");
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2300959", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals("recommend_daily_outfit", str) || TextUtils.equals("recommend_outfit_trend_outbound", str);
    }

    static {
        t2o.a(487587968);
        HashSet hashSet = new HashSet();
        hashSet.add("recommend_logistics_main");
        hashSet.add("recommend_cart_main");
        hashSet.add("recommend_orderlist_main");
        hashSet.add("recommend_orderlist_catapult_main");
        hashSet.add("recommend_orderdetail_main");
        hashSet.add("recommend_my_taobao");
        f15892a = Collections.unmodifiableSet(hashSet);
    }
}
