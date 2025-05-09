package tb;

import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uuv extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465573);
    }

    public static /* synthetic */ Object ipc$super(uuv uuvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/UserTrackV2Subscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "2612854805172685265";
    }

    public boolean J(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3525d797", new Object[]{this, b8vVar})).booleanValue();
        }
        if (b8vVar == null || !(E(b8vVar) instanceof JSONObject) || !(E(b8vVar).get("eventId") instanceof String)) {
            return false;
        }
        return "2201".equals(E(b8vVar).getString("eventId"));
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (b8vVar.d() != null) {
            if (b8vVar.d().getExtMap() != null && J(b8vVar)) {
                ArrayMap<String, Object> extMap = b8vVar.d().getExtMap();
                if (extMap.get("exposureCount" + E(b8vVar).getString("arg1")) == null) {
                    ArrayMap<String, Object> extMap2 = b8vVar.d().getExtMap();
                    extMap2.put("exposureCount" + E(b8vVar).getString("arg1"), 1);
                } else {
                    return;
                }
            }
            z(b8vVar, "userTrack", E(b8vVar));
        }
    }
}
