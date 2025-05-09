package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class ty implements dzd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355755);
        t2o.a(806355757);
    }

    public Float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("e3ddd75b", new Object[]{this});
        }
        return Float.valueOf(0.0f);
    }

    public Float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("6e8f1b4b", new Object[]{this});
        }
        return Float.valueOf(0.0f);
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8630a21b", new Object[]{this});
        }
        return null;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a115a601", new Object[]{this})).intValue();
        }
        return -1;
    }
}
