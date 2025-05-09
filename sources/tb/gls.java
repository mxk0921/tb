package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gls extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(329252935);
    }

    public gls(String str) {
    }

    public static gls c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gls) ipChange.ipc$dispatch("7e7ba647", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@foreachQuery")) {
            return new gls(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(gls glsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/other/TSForeachQueryExpression");
    }

    /* renamed from: d */
    public JSONObject b(wp8 wp8Var) {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("904aa89c", new Object[]{this, wp8Var});
        }
        try {
            Uri j = wp8Var.j();
            if (!(j == null || (queryParameterNames = j.getQueryParameterNames()) == null || queryParameterNames.isEmpty())) {
                JSONObject jSONObject = new JSONObject();
                List<String> a2 = wp8Var.a();
                for (String str : queryParameterNames) {
                    if (a2 == null || !a2.contains(str)) {
                        String queryParameter = j.getQueryParameter(str);
                        if (!TextUtils.isEmpty(queryParameter)) {
                            String encode = Uri.encode(queryParameter);
                            zdh.a(als.TAG, "origin value = " + queryParameter + "; encode value = " + encode);
                            jSONObject.put(str, (Object) encode);
                        }
                    }
                }
                return jSONObject;
            }
            return null;
        } catch (Throwable th) {
            zdh.b(als.TAG, "parseUrlParams error", th);
            return null;
        }
    }
}
