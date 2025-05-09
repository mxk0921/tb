package tb;

import android.content.Context;
import android.os.Build;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.aliprivacy.AliPrivacyCore;
import com.alibaba.wireless.aliprivacy.AuthStatus;
import com.alibaba.wireless.aliprivacy.PrivacyAuthGetParam;
import com.alibaba.wireless.aliprivacy.PrivacyAuthResult;
import com.alibaba.wireless.aliprivacyext.jsbridge.c;
import com.alibaba.wireless.aliprivacyext.model.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@c(name = {"getAuthStatusByScenes"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class oyx extends osx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(oyx oyxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacyext/jsbridge/api/c");
    }

    public final Map<String, Map<String, AuthStatus>> d(List<PrivacyAuthResult> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71436bce", new Object[]{this, list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (PrivacyAuthResult privacyAuthResult : list) {
            hashMap.put(privacyAuthResult.getSceneCode(), privacyAuthResult.getPermissions());
        }
        return hashMap;
    }

    public final PrivacyAuthGetParam e(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrivacyAuthGetParam) ipChange.ipc$dispatch("e5fb0639", new Object[]{this, list});
        }
        if (list == null) {
            return null;
        }
        PrivacyAuthGetParam.b bVar = new PrivacyAuthGetParam.b();
        for (b bVar2 : list) {
            bVar.b(bVar2.getSceneCode(), bVar2.getPermissions());
        }
        return bVar.c();
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
            List<b> parseArray = JSON.parseArray(h.getJSONArray("authGetParams").toJSONString(), b.class);
            if (parseArray != null && !parseArray.isEmpty()) {
                List<PrivacyAuthResult> q = AliPrivacyCore.q(context, e(parseArray), "h5");
                HashMap hashMap = new HashMap(1);
                hashMap.put("jsAuthOfSceneResult", mwx.e(d(q)));
                hashMap.put("buildTargetVersion", Integer.valueOf(Build.VERSION.SDK_INT));
                c(pwxVar, "调用成功", hashMap);
                return true;
            }
            a(pwxVar, "参数异常", null);
            return true;
        } catch (Throwable th) {
            g01.d("c", "", th);
            a(pwxVar, osx.d, null);
            return true;
        }
    }
}
