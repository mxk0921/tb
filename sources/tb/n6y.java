package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.aliprivacyext.jsbridge.c;
import com.alibaba.wireless.aliprivacyext.recommendation.e;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
@c(name = {"getRecommendSwitch", "queryRecommendSwitch"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class n6y extends osx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(n6y n6yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacyext/jsbridge/api/f");
    }

    public final String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if ("queryRecommendSwitch".equals(str)) {
            return "OpenJSBridge";
        }
        return "CROJSBridge";
    }

    public final void e(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fc7488", new Object[]{this, context, str, str2, str3, str4});
        } else {
            TrackLog.trackQueryRecommendStatusLog(context, str, d(str2), str3, str4, 0L);
        }
    }

    @Override // tb.osx
    public boolean b(Context context, String str, String str2, pwx pwxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, pwxVar})).booleanValue();
        }
        JSONObject h = mwx.h(str2);
        if (h == null) {
            a(pwxVar, "参数异常", null);
            return true;
        }
        String string = h.getString("fromSource");
        if (TextUtils.isEmpty(string) && "queryRecommendSwitch".equals(str)) {
            a(pwxVar, "缺少fromSource参数,请联系业务方分配", null);
            return true;
        } else if (rsx.b(context)) {
            boolean d = rsx.d(context);
            HashMap hashMap = new HashMap();
            hashMap.put("switch", Boolean.valueOf(d));
            c(pwxVar, "调用成功", hashMap);
            e(context, "noUidExt", str, string, str2);
            return true;
        } else {
            e b = com.alibaba.wireless.aliprivacyext.recommendation.c.R().b(string);
            boolean recommendSwitchBooleanStatus = b.getRecommendSwitchBooleanStatus();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("switch", Boolean.valueOf(recommendSwitchBooleanStatus));
            c(pwxVar, "调用成功", hashMap2);
            e(context, b.getStatus(), str, string, str2);
            return true;
        }
    }
}
