package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h28 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HSETTOCURRENTMODEL = -5475101679954006979L;
    public static final String KEY_CLIENT_CACHE = "clientCache";

    static {
        t2o.a(473956354);
    }

    public static /* synthetic */ Object ipc$super(h28 h28Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/home/component/event/DxHSetToCurrentModelEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length < 1) {
            bqa.d("setToCurrentModel", "dx args is null");
        } else {
            String str = (String) objArr[0];
            String str2 = objArr.length > 1 ? (String) objArr[1] : null;
            if (TextUtils.isEmpty(str)) {
                bqa.d("setToCurrentModel", "args key is null");
                return;
            }
            JSONObject i = dXRuntimeContext.i();
            if (i == null) {
                bqa.d("setToCurrentModel", "sectionData == null, key=" + str);
                return;
            }
            JSONObject jSONObject = i.getJSONObject("ext");
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                i.put("ext", (Object) jSONObject);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("clientCache");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject(16);
                jSONObject.put("clientCache", (Object) jSONObject2);
            }
            if (str2 == null) {
                jSONObject2.remove(str);
            } else {
                jSONObject2.put(str, (Object) str2);
            }
            bqa.d("setToCurrentModel", "set, key=" + str + ", value=" + str2);
        }
    }
}
