package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.detail.rate.RateDisplayApplication;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class m96 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c0b45199", new Object[]{this})).longValue();
            }
            return m96.f();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static final /* synthetic */ long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad8b24ee", new Object[0])).longValue();
        }
        return 3627895340241609799L;
    }

    public static /* synthetic */ Object ipc$super(m96 m96Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/parser/DXRateViewPagerParam");
    }

    public final JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d6a9285b", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject2 == null) {
            return null;
        }
        String string = jSONObject2.getString("bizType");
        RateDisplayApplication.clear();
        if (ckf.b("rate", string)) {
            jSONObject3.put((JSONObject) "isNewRate", (String) Boolean.TRUE);
        } else {
            jSONObject3.put((JSONObject) "isNewPreview", (String) Boolean.TRUE);
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        jSONObject3.put((JSONObject) "tagId", valueOf);
        jSONObject3.put((JSONObject) "isFromDX", "true");
        HashMap<String, JSONObject> hashMap = RateDisplayApplication.previewDataMap;
        ckf.f(hashMap, "RateDisplayApplication.previewDataMap");
        hashMap.put(valueOf, jSONObject2);
        return jSONObject3;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        if (obj != null) {
            return b((JSONObject) obj);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
    }
}
