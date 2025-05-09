package tb;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class s4v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f27798a = new HashMap();
    public static String b = "";

    static {
        t2o.a(817889360);
    }

    public static void a(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aaa79a1", new Object[]{str, str2, strArr});
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (strArr != null && strArr.length > 1) {
                for (int i = 0; i < strArr.length - 1; i += 2) {
                    arrayList.add(strArr[i] + "=" + strArr[i + 1]);
                }
            }
            for (Map.Entry entry : ((HashMap) f27798a).entrySet()) {
                arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            }
            TBS.Ext.commitEvent(str, 19999, str2, null, null, (String[]) arrayList.toArray(new String[arrayList.size()]));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object b(String str, Object obj) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8141639c", new Object[]{str, obj});
        }
        String[] split = str.split("\\.");
        if (!(split.length == 3 || split.length == 2)) {
            return obj;
        }
        String str4 = split[0];
        String str5 = split[1];
        if (split.length == 3) {
            str2 = split[2];
        } else {
            str2 = "";
        }
        VariationSet activate = UTABTest.activate(str4, str5);
        if (activate != null) {
            String valueOf = String.valueOf(activate.getExperimentBucketId());
            if (!b.contains(valueOf)) {
                StringBuilder sb = new StringBuilder();
                sb.append(b);
                if (TextUtils.isEmpty(b)) {
                    str3 = "";
                } else {
                    str3 = ",";
                }
                sb.append(str3);
                sb.append(valueOf);
                b = sb.toString();
            }
            JSONObject jSONObject = new JSONObject();
            Variation variation = activate.getVariation(str2);
            if (variation == null && activate.size() > 0) {
                for (Variation variation2 : activate) {
                    if (variation2 != null) {
                        jSONObject.put(variation2.getName(), (Object) variation2.getValueAsString(""));
                    }
                }
                return jSONObject;
            } else if (variation != null && !TextUtils.isEmpty(variation.getValueAsString(""))) {
                return variation.getValueAsString("");
            }
        }
        return obj;
    }

    public static String c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79bd1043", new Object[]{intent});
        }
        if (intent == null || intent.getData() == null) {
            return "";
        }
        return intent.getData().toString();
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc714639", new Object[0]);
            return;
        }
        b = "";
        ((HashMap) f27798a).clear();
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf905b2", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ((HashMap) f27798a).put(str, str2);
        }
    }
}
