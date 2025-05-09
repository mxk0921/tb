package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.aliprivacyext.jsbridge.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
@c(name = {"getPrivacyProfile"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class u5y extends osx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(u5y u5yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacyext/jsbridge/api/e");
    }

    @Override // tb.osx
    public boolean b(Context context, String str, String str2, pwx pwxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, pwxVar})).booleanValue();
        }
        g01.a("GetRecommendSwitchApi", "GetPrivacyProfileApi start: " + str2);
        JSONObject h = mwx.h(str2);
        if (h == null) {
            g01.c("GetRecommendSwitchApi", "GetPrivacyProfileApi jsonObject == null");
            a(pwxVar, "参数异常", null);
            return true;
        }
        String string = h.getString("profile");
        if (TextUtils.isEmpty(string)) {
            g01.c("GetRecommendSwitchApi", "GetPrivacyProfileApi TextUtils.isEmpty(profile)");
            a(pwxVar, "参数异常", null);
            return true;
        }
        String a2 = hwx.a(context, string);
        g01.a("GetRecommendSwitchApi", "GetPrivacyProfileApi end: " + a2);
        HashMap hashMap = new HashMap();
        hashMap.put(string, a2);
        c(pwxVar, "调用成功", hashMap);
        return true;
    }
}
