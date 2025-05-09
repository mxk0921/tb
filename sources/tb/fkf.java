package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fkf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f19354a = new HashMap();
    public static final Map<String, ppj> b = new HashMap();

    public ppj a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppj) ipChange.ipc$dispatch("a5b100f4", new Object[]{this, str});
        }
        HashMap hashMap = (HashMap) b;
        ppj ppjVar = (ppj) hashMap.get(str);
        if (ppjVar == null && (ppjVar = c((String) ((HashMap) f19354a).get(str))) != null) {
            hashMap.put(str, ppjVar);
        }
        return ppjVar;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            ((HashMap) f19354a).put("tab2", "com.taobao.android.layoutmanager.module.NavigationTabModule");
        }
    }

    public final ppj c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (ppj) Class.forName(str).newInstance();
        } catch (Exception e) {
            TLog.loge(y9a.c(), "IntroductoryCallbackManager", "instantiateCallback error", e);
            return null;
        }
    }
}
