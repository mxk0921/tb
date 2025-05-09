package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ocv extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465569);
    }

    public static /* synthetic */ Object ipc$super(ocv ocvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/UltronUpdateUTPagePropertiesSubscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "999772743302037878";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        JSONObject E;
        Map<String, Object> innerMap;
        Map<String, Object> innerMap2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (b8vVar != null && b8vVar.e() != null && (E = E(b8vVar)) != null) {
            try {
                UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
                if (!(E.getJSONObject("currentPageProperties") == null || (innerMap2 = E.getJSONObject("currentPageProperties").getInnerMap()) == null || innerMap2.isEmpty())) {
                    defaultTracker.updatePageProperties(b8vVar.e(), innerMap2);
                    if (innerMap2.get("utparam-cnt") instanceof String) {
                        defaultTracker.updatePageUtparam(b8vVar.e(), (String) innerMap2.get("utparam-cnt"));
                    }
                }
                if (E.getJSONObject("nextPageProperties") != null && (innerMap = E.getJSONObject("nextPageProperties").getInnerMap()) != null && !innerMap.isEmpty()) {
                    defaultTracker.updateNextPageProperties(innerMap);
                    if ((innerMap.get("scm") instanceof String) && !TextUtils.isEmpty((String) innerMap.get("scm")) && (b8vVar.e() instanceof i4d)) {
                        ((i4d) b8vVar.e()).H2((String) innerMap.get("scm"));
                    }
                    if (innerMap.get(z9u.KEY_UTPARAM_URL) instanceof String) {
                        defaultTracker.updateNextPageUtparam((String) innerMap.get(z9u.KEY_UTPARAM_URL));
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
