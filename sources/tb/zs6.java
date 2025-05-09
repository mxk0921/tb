package tb;

import android.text.TextUtils;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.ultron.trade.utils.NetType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zs6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199298);
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fdd629a", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("extStatus", "0");
        NetType b = zvj.b(Globals.getApplication());
        if (b != null) {
            hashMap.put("netType", String.valueOf(b.getCode()));
        }
        if (TextUtils.isEmpty(str)) {
            str = QueryParamsManager.DEFAULT_CART_FROM;
        }
        hashMap.put("cartFrom", str);
        hashMap.put("exParams", new JSONObject().toJSONString());
        hashMap.put("isPage", "true");
        return hashMap;
    }

    public static Map<String, String> b(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("611465d3", new Object[]{kmbVar});
        }
        return a(kmbVar.W().f());
    }

    public static b3o c(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3o) ipChange.ipc$dispatch("25f3178a", new Object[]{kmbVar});
        }
        return b3o.p().s("mtop.trade.update.bag").t("4.0").w(b(kmbVar));
    }

    public static b3o f(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3o) ipChange.ipc$dispatch("9cf14bc2", new Object[]{kmbVar});
        }
        return b3o.p().s("mtop.trade.update.structure").t("1.0").w(b(kmbVar));
    }

    public static b3o d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3o) ipChange.ipc$dispatch("c82d8f50", new Object[]{str});
        }
        return b3o.p().s("mtop.trade.query.bag").t(AfcCustomSdk.SDK_VERSION).w(a(str)).x(false);
    }

    public static b3o e(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3o) ipChange.ipc$dispatch("e7666617", new Object[]{kmbVar});
        }
        return b3o.p().s("mtop.trade.query.bag").t(AfcCustomSdk.SDK_VERSION).w(b(kmbVar)).x(false);
    }
}
