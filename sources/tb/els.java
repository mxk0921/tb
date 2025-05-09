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
public class els extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(329252933);
    }

    public els(String str) {
    }

    public static els c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (els) ipChange.ipc$dispatch("fd4f0755", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@foreachEncodeQuery")) {
            return new els(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(els elsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/other/TSForeachDecodeQueryExpression");
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
                        jSONObject.put(str, (Object) j.getQueryParameter(str));
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
