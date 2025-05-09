package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ss9 extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FOLD_STATE = "foldState";
    public static final String STATE_DISABLE = "DISABLE";
    public static final String STATE_HIDE = "HIDE";
    public static final String STATE_SHOW = "SHOW";
    public static final String STATE_SOLID = "SOLID";
    public static final String VISIBLE = "visible";

    static {
        t2o.a(614465755);
    }

    public static /* synthetic */ Object ipc$super(ss9 ss9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/FoldComponentV2Subscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "3864592043693486457";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        J(b8vVar.d().getFields());
        if (b8vVar.n() instanceof a) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(b8vVar.d());
            b8vVar.n().e(arrayList);
        }
    }

    public final void J(JSONObject jSONObject) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4946500d", new Object[]{this, jSONObject});
            return;
        }
        if (!(jSONObject == null || jSONObject.getString(FOLD_STATE) == null)) {
            String string = jSONObject.getString(FOLD_STATE);
            if (!TextUtils.isEmpty(string)) {
                if ("HIDE".equals(string.toUpperCase())) {
                    jSONObject.put(FOLD_STATE, "SHOW");
                } else {
                    if ("SHOW".equals(string.toUpperCase())) {
                        jSONObject.put(FOLD_STATE, "HIDE");
                    } else if (STATE_DISABLE.equals(string.toUpperCase())) {
                        return;
                    }
                    z = false;
                }
                kor.a("RefreshComponentV2Subscriber", "replaceFoldState ", "isFold = " + z);
            } else {
                return;
            }
        }
        K(jSONObject);
    }

    public final <T> T K(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ba99763a", new Object[]{this, t});
        }
        if (t instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) t;
            for (int i = 0; i < jSONArray.size(); i++) {
                K(jSONArray.get(i));
            }
        } else if (t instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) t;
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof JSONArray) {
                    K((JSONArray) value);
                } else if (value instanceof JSONObject) {
                    K((JSONObject) value);
                } else if (value instanceof String) {
                    entry.getKey();
                    if ("visible".equals(entry.getKey())) {
                        String str = (String) value;
                        if ("HIDE".equals(str.toUpperCase())) {
                            jSONObject.put("visible", (Object) "SHOW");
                        } else if ("SHOW".equals(str.toUpperCase())) {
                            jSONObject.put("visible", (Object) "HIDE");
                        }
                    }
                }
            }
        }
        kor.a("RefreshComponentV2Subscriber", "replaceJsonValue", t.toString());
        return t;
    }
}
