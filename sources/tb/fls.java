package tb;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fls extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(329252934);
    }

    public fls(String str) {
    }

    public static fls c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fls) ipChange.ipc$dispatch("c8d6865b", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@foreachIntent")) {
            return new fls(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(fls flsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/other/TSForeachIntentExpression");
    }

    /* renamed from: d */
    public JSONObject b(wp8 wp8Var) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("904aa89c", new Object[]{this, wp8Var});
        }
        try {
            Intent f = wp8Var.f();
            if (!(f == null || (extras = f.getExtras()) == null || extras.isEmpty())) {
                JSONObject jSONObject = new JSONObject();
                List<String> a2 = wp8Var.a();
                for (String str : extras.keySet()) {
                    if (a2 == null || !a2.contains(str)) {
                        Object obj = extras.get(str);
                        if (obj != null) {
                            jSONObject.put(str, (Object) obj.toString());
                        }
                    }
                }
                return jSONObject;
            }
            return null;
        } catch (Throwable th) {
            zdh.b(als.TAG, "foreachQueryIntent error", th);
            return null;
        }
    }
}
