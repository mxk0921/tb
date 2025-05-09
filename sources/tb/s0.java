package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile feh f27705a = new feh(t0.TAG, "Global");
    public static final Map<String, Long> b = new ConcurrentHashMap();
    public static final Map<String, Long> c = new ConcurrentHashMap();
    public static final Map<String, Long> d = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f27706a;
        public final String b;
        public final String c;

        static {
            t2o.a(774897948);
        }

        public a(String str, String str2, String str3) {
            this.f27706a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    static {
        t2o.a(774897947);
    }

    public static <T> T a(VariationSet variationSet, String str, Class<? extends T> cls) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("e3618e8e", new Object[]{variationSet, str, cls});
        }
        if (variationSet == null || (variation = variationSet.getVariation(str)) == null) {
            return null;
        }
        String valueAsString = variation.getValueAsString(null);
        if (TextUtils.isEmpty(valueAsString)) {
            return null;
        }
        try {
            return (T) JSON.parseObject(valueAsString, cls);
        } catch (Throwable th) {
            AVSDKLog.e(t0.TAG, "invalid json", th);
            return null;
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a93e0bf", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        for (Long l : ((ConcurrentHashMap) c).values()) {
            if (sb.length() > 0) {
                sb.append("_");
            }
            sb.append(l);
        }
        return sb.toString();
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("918d0e4c", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        for (Long l : ((ConcurrentHashMap) b).values()) {
            if (sb.length() > 0) {
                sb.append("_");
            }
            sb.append(l);
        }
        return sb.toString();
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a262b010", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        for (Long l : ((ConcurrentHashMap) d).values()) {
            if (sb.length() > 0) {
                sb.append("_");
            }
            sb.append(l);
        }
        return sb.toString();
    }

    public static String e(VariationSet variationSet, Context context, a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8337fc8", new Object[]{variationSet, context, aVar, str, str2});
        }
        if (variationSet == null) {
            return str2;
        }
        Variation variation = variationSet.getVariation(str);
        if (variation == null) {
            return str2;
        }
        String valueAsString = variation.getValueAsString(str2);
        ((ConcurrentHashMap) b).put(aVar.f27706a, Long.valueOf(variationSet.getExperimentId()));
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c;
        concurrentHashMap.put(aVar.f27706a, Long.valueOf(variationSet.getExperimentBucketId()));
        ((ConcurrentHashMap) d).put(aVar.f27706a, Long.valueOf(variationSet.getExperimentReleaseId()));
        if (ja1.s()) {
            String g = g(context, aVar.f27706a, aVar.b, str);
            if (!TextUtils.isEmpty(g)) {
                valueAsString = g;
            }
            String f = f(context, aVar.f27706a, aVar.b, aVar.c);
            if (!TextUtils.isEmpty(f)) {
                concurrentHashMap.put(aVar.f27706a, Long.valueOf(f));
            }
        }
        return valueAsString;
    }

    public static String g(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67d49bea", new Object[]{context, str, str2, str3});
        }
        try {
            if (context == null) {
                AVSDKLog.e(f27705a, "getSharedPreferencesABMockValue failed by context is null ");
                return "";
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("ab_mock_value", 0);
            if (sharedPreferences == null) {
                return "";
            }
            String string = sharedPreferences.getString(str + "_" + str2 + "_" + str3, "");
            if (TextUtils.isEmpty(string)) {
                return "";
            }
            return string;
        } catch (Throwable th) {
            feh fehVar = f27705a;
            AVSDKLog.e(fehVar, "get SharedPreferences value failed: " + th.toString());
            return "";
        }
    }

    public static VariationSet h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("7dc97c3d", new Object[]{aVar});
        }
        if (aVar != null && !TextUtils.isEmpty(aVar.f27706a) && !TextUtils.isEmpty(aVar.b)) {
            try {
                return UTABTest.activate(aVar.f27706a, aVar.b);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String f(Context context, String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b73f14ae", new Object[]{context, str, str2, str3});
        }
        try {
        } catch (Throwable th) {
            feh fehVar = f27705a;
            AVSDKLog.e(fehVar, "get SharedPreferences value failed: " + th.toString());
        }
        if (context == null) {
            AVSDKLog.e(f27705a, "getSharedPreferencesABMockValue failed by context is null ");
            return "";
        }
        SharedPreferences sharedPreferences2 = context.getApplicationContext().getSharedPreferences("ab_mock_value", 0);
        if (sharedPreferences2 == null) {
            AVSDKLog.e(f27705a, "prefs is null ");
        } else {
            String string = sharedPreferences2.getString(str + "_" + str2, "");
            if (!TextUtils.isEmpty(string)) {
                JSONObject parseObject = JSON.parseObject(string);
                if (parseObject.containsKey("experimentBucketId")) {
                    return parseObject.getString("experimentBucketId");
                }
            }
        }
        if (TextUtils.isEmpty(str3) || (sharedPreferences = context.getApplicationContext().getSharedPreferences("CheckedStates", 0)) == null) {
            return "";
        }
        Map<String, ?> all = sharedPreferences.getAll();
        if (all.containsKey(str3)) {
            Object obj = all.get(str3);
            if (obj instanceof Integer) {
                String valueOf = String.valueOf(obj);
                feh fehVar2 = f27705a;
                AVSDKLog.e(fehVar2, str + "_" + str2 + "_BucketId" + valueOf);
                return valueOf;
            }
        }
        return "";
    }
}
