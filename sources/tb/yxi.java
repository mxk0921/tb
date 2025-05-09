package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.internal.util.LogUtil;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class yxi implements adt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944713);
        t2o.a(1034944593);
    }

    @Override // tb.adt
    public Map<String, String> a(Map<String, String> map) {
        String str;
        String str2;
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            str = map.get(r4p.KEY_MODEL_NAME);
            str2 = map.get("type");
        } catch (Throwable th) {
            LogUtil.e("ModelRegisterTask", th.toString(), th);
        }
        if (str2.equals("register")) {
            qtf.a().e(qtf.a().c(new JSONObject(map.get("config_str"))));
        } else if (MiPushClient.COMMAND_UNREGISTER.equals(str2)) {
            DAI.unregisterModel(str);
            hashMap.put("result", "" + z);
            return hashMap;
        }
        z = false;
        hashMap.put("result", "" + z);
        return hashMap;
    }
}
