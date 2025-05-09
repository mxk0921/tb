package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dfg extends b20 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699231);
    }

    public static /* synthetic */ Object ipc$super(dfg dfgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultronnew/events/LVToastEventHandler");
    }

    @Override // tb.b20
    public void a(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792eff86", new Object[]{this, context, jSONObject, jSONObject2});
            return;
        }
        if (!(jSONObject == null || context == null)) {
            try {
                String string = jSONObject.getString("message");
                if (!TextUtils.isEmpty(string)) {
                    a1u.a(context, string);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
