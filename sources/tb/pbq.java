package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pbq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f26002a;

    static {
        t2o.a(736100460);
    }

    public pbq(JSONObject jSONObject) {
        this.f26002a = jSONObject;
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7e00cd49", new Object[]{this});
        }
        JSONObject a2 = sm1.a(this.f26002a, "subSection", "animationExpo", i2b.TRACK_EXPOSURE_PARAM);
        return a2 == null ? new JSONObject() : a2;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5b3e9d0c", new Object[]{this});
        }
        JSONObject a2 = sm1.a(this.f26002a, "item", "0", "clickParam");
        return a2 == null ? new JSONObject() : a2;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e5707c2f", new Object[]{this});
        }
        JSONObject a2 = sm1.a(this.f26002a, "subSection", "coldStartExpo", i2b.TRACK_EXPOSURE_PARAM);
        return a2 == null ? new JSONObject() : a2;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fa80206d", new Object[]{this});
        }
        JSONObject a2 = sm1.a(this.f26002a, i2b.TRACK_EXPOSURE_PARAM);
        if (a2 == null) {
            return new JSONObject();
        }
        return a2;
    }
}
