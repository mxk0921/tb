package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class m9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f23858a = "fadeInOut";
    public static final String b = "topInOut";
    public static final String c = nbf.STDPOP_ANIMATION_BOTTOM;
    public static final String d = "leftInOut";
    public static final String e = "rightInOut";
    public static final String f = "actTransBottomInOut";
    public static final Map<String, Class<? extends fab>> g;

    public static fab a(String str) {
        Class cls;
        if (str == null || (cls = (Class) ((HashMap) g).get(str)) == null) {
            return null;
        }
        try {
            return (fab) cls.newInstance();
        } catch (IllegalAccessException | InstantiationException unused) {
            return null;
        }
    }

    static {
        t2o.a(336592996);
        HashMap hashMap = new HashMap(5);
        g = hashMap;
        hashMap.put("fadeInOut", f9.class);
        hashMap.put("topInOut", j9.class);
        hashMap.put(nbf.STDPOP_ANIMATION_BOTTOM, c9.class);
        hashMap.put("leftInOut", g9.class);
        hashMap.put("rightInOut", i9.class);
        hashMap.put("actTransBottomInOut", oc0.class);
    }
}
