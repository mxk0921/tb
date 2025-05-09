package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jm7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, zu> f22069a;

    public static h5a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h5a) ipChange.ipc$dispatch("32964e6f", new Object[]{str});
        }
        return (h5a) ((HashMap) f22069a).get(str);
    }

    static {
        t2o.a(475005000);
        HashMap hashMap = new HashMap();
        f22069a = hashMap;
        hashMap.put(dm7.EVENT_PARAM_PREFIX, new al8());
        hashMap.put(dm7.CALLBACK_PARAM_PREFIX, new gw2());
        hashMap.put("const", new fm7());
        hashMap.put("and", new mv0());
        hashMap.put("eq", new eh8());
        hashMap.put("len", new qmg());
        hashMap.put("not", new v7k());
        hashMap.put("else", new eb8());
        hashMap.put("if", new z5i());
        hashMap.put("lc", new qqq());
        hashMap.put("uc", new wqq());
        hashMap.put("concat", new kqq());
        hashMap.put("triple", new qgu());
        hashMap.put("substr", new sqq());
        hashMap.put("afnd", new wi9());
        hashMap.put("aget", new y6a());
        hashMap.put("dget", new y6a());
        hashMap.put("or", new c8l());
        hashMap.put("trim", new ngu());
        hashMap.put("flt", new kt7());
        hashMap.put("flte", new mt7());
        hashMap.put("fgte", new it7());
        hashMap.put("fgt", new gt7());
        hashMap.put("feq", new et7());
        hashMap.put("igte", new qdf());
        hashMap.put("igt", new odf());
        hashMap.put("ilte", new wdf());
        hashMap.put("ilt", new udf());
        hashMap.put("ieq", new jdf());
    }
}
