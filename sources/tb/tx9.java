package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tx9 extends rql {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FRAME_TYPE = "_tt_detail_header_frame_";
    public static final String KEY_CONTENT = "content";
    public static final String KEY_DIMENSION = "dimension";
    public static final String KEY_ENABLE_LIGHT_OFF = "enableLightOff";
    public static final String KEY_FLOAT = "floatContent";
    public static final String KEY_TAG_NAME = "tagName";
    public String k;

    static {
        t2o.a(912261533);
    }

    public tx9(JSONObject jSONObject) {
        super(jSONObject);
        s(jSONObject, null);
    }

    public static /* synthetic */ Object ipc$super(tx9 tx9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/FrameComponentData");
    }

    public final void s(JSONObject jSONObject, qdb qdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8396a", new Object[]{this, jSONObject, qdbVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            o(new nb4(jSONObject2, qdbVar));
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(KEY_FLOAT);
        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
            o(new nb4(jSONObject3, qdbVar));
        }
        this.k = p();
        this.c = "native$_tt_detail_header_frame_";
    }

    public <T extends nb4> T t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((nb4) ipChange.ipc$dispatch("bfaef846", new Object[]{this}));
        }
        List<nb4> list = this.j;
        if (list == null || ((ArrayList) list).size() <= 0) {
            return null;
        }
        return (T) q(0);
    }

    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55e95e49", new Object[]{this});
        }
        return this.f24614a.getString("dimension");
    }

    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("534b14a", new Object[]{this});
        }
        return this.f24614a.getString(KEY_TAG_NAME);
    }

    public String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41cc0ed4", new Object[]{this});
        }
        return this.k;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("437a6071", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(this.f24614a.getString(KEY_ENABLE_LIGHT_OFF));
    }

    public tx9(JSONObject jSONObject, qdb qdbVar) {
        super(jSONObject, qdbVar);
        s(jSONObject, qdbVar);
    }
}
