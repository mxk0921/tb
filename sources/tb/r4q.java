package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ju.track.server.JTrackParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class r4q extends rql {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String k;
    public JSONObject l;
    public JSONObject m;

    static {
        t2o.a(912261546);
    }

    public r4q(JSONObject jSONObject, qdb qdbVar) {
        super(jSONObject, qdbVar);
        v(jSONObject, qdbVar);
    }

    public static /* synthetic */ Object ipc$super(r4q r4qVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/SmallWindowComponentData");
    }

    public JSONObject s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bc47a812", new Object[]{this});
        }
        return this.l;
    }

    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a3ac5e", new Object[]{this});
        }
        return this.k;
    }

    public JSONObject u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f9fb2ba2", new Object[]{this});
        }
        return this.m;
    }

    public final void v(JSONObject jSONObject, qdb qdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a3dead", new Object[]{this, jSONObject, qdbVar});
            return;
        }
        this.k = jSONObject.getString("type");
        this.l = jSONObject.getJSONObject("data");
        JSONObject jSONObject2 = jSONObject.getJSONObject(JTrackParams.TRACK_PARAMS);
        this.m = jSONObject2;
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            this.l.put(JTrackParams.TRACK_PARAMS, (Object) this.m);
        }
    }
}
