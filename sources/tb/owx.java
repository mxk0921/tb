package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.aliprivacy.AliPrivacyCore;
import com.alibaba.wireless.aliprivacy.AuthStatus;
import com.alibaba.wireless.aliprivacyext.jsbridge.c;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
@c(name = {"querySupportAuth"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class owx extends osx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(owx owxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacyext/jsbridge/api/b");
    }

    public final void d(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b0622c", new Object[]{this, str, new Boolean(z), str2});
        } else {
            TrackLog.trackQuerySupportLog(str, z, str2);
        }
    }

    @Override // tb.osx
    public boolean b(Context context, String str, String str2, pwx pwxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, pwxVar})).booleanValue();
        }
        try {
            JSONObject h = mwx.h(str2);
            if (h == null) {
                a(pwxVar, "参数异常", null);
                return true;
            }
            JSONArray jSONArray = h.getJSONArray("authList");
            if (!(jSONArray == null || jSONArray.size() == 0)) {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("authKey");
                    int intValue = jSONObject.getInteger("miniOSVersion").intValue();
                    Integer integer = jSONObject.containsKey("lessMaxOSVersion") ? jSONObject.getInteger("lessMaxOSVersion") : null;
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= intValue && ((integer == null || i2 <= integer.intValue()) && AliPrivacyCore.j(context, string))) {
                        AuthStatus a2 = br0.c().a((Activity) context, string);
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("authKey", string);
                        jSONObject2.put("authStatus", mwx.a(a2));
                        jSONArray2.put(jSONObject2);
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("resultList", jSONArray2);
                g01.a("GetAuthStatusApi", mwx.e(hashMap));
                c(pwxVar, "调用成功", hashMap);
                d(str2, true, mwx.e(hashMap));
                return true;
            }
            a(pwxVar, "参数异常", null);
            return true;
        } catch (Throwable th) {
            g01.d("GetAuthStatusApi", "", th);
            a(pwxVar, osx.d, null);
            d(str2, false, th.getMessage());
            return true;
        }
    }
}
