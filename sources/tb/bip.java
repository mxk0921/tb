package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bip {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMMON_TEMPLATE = "common";
    public static final String DETAIL_TEMPLATE = "detail";
    public static final String GROUP_TEMPLATE = "group";
    public static final String LIVE_TEMPLATE = "live";
    public static final String SHOP_TEMPLATE = "shop";
    public static final String WEEX_TEMPLATE = "weex";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Class<? extends aip>> f16412a;

    static {
        t2o.a(666894560);
        HashMap hashMap = new HashMap();
        f16412a = hashMap;
        hashMap.put("common", iip.class);
    }

    public static aip a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Class cls = (Class) ((HashMap) f16412a).get(str);
            if (cls != null) {
                return (aip) cls.getConstructor(Context.class).newInstance(context);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
