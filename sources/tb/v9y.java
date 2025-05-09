package tb;

import android.content.Context;
import com.alibaba.wireless.aliprivacyext.jsbridge.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
@c(name = {"setPrivacyProfile"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class v9y extends osx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(v9y v9yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacyext/jsbridge/api/j");
    }

    @Override // tb.osx
    public boolean b(Context context, String str, String str2, pwx pwxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, pwxVar})).booleanValue();
        }
        Map<String, Object> k = mwx.k(str2);
        if (k == null) {
            a(pwxVar, "参数异常", null);
            return true;
        }
        Iterator<Map.Entry<String, Object>> it = k.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Object> next = it.next();
            if (!hwx.d(context, next.getKey(), (String) next.getValue())) {
                HashMap hashMap = new HashMap();
                hashMap.put("result", "false");
                c(pwxVar, "调用成功", hashMap);
                break;
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("result", "true");
        c(pwxVar, "调用成功", hashMap2);
        return true;
    }
}
