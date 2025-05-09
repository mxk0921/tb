package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jd5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_BINDINGX = 1454898448112604731L;

    static {
        t2o.a(444596641);
    }

    public static /* synthetic */ Object ipc$super(jd5 jd5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/bindingx/DXBindingXEventHandler");
    }

    @Override // tb.ob5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "bindingX";
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        DXRootView L = dXRuntimeContext.L();
        if (L != null && objArr != null && objArr.length != 0) {
            DXWidgetNode W = dXRuntimeContext.W();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) "BNDX");
            JSONObject jSONObject2 = new JSONObject();
            a(jSONObject2, objArr);
            jSONObject2.put("widget", (Object) W);
            jSONObject.put("params", (Object) jSONObject2);
            if (dXRuntimeContext.s() != null) {
                dXRuntimeContext.s().t(L, jSONObject);
            }
        }
    }

    public void a(JSONObject jSONObject, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3868934", new Object[]{this, jSONObject, objArr});
        } else if (objArr != null && jSONObject != null) {
            int length = objArr.length;
            if (objArr.length >= 2) {
                JSONArray jSONArray = new JSONArray();
                Object obj = objArr[0];
                if (obj instanceof String) {
                    if (!TextUtils.isEmpty((String) obj)) {
                        jSONArray.add(objArr[0]);
                    }
                } else if (obj instanceof JSONArray) {
                    jSONArray.addAll((JSONArray) obj);
                } else if (obj != null) {
                    jSONArray.add(obj);
                }
                jSONObject.put("spec", (Object) jSONArray);
                String str = (String) objArr[1];
                if ("start".equalsIgnoreCase(str)) {
                    jSONObject.put("action", "start");
                } else if ("stop".equalsIgnoreCase(str)) {
                    jSONObject.put("action", "stop");
                }
            }
            HashMap hashMap = null;
            for (int i = 2; i < length; i += 2) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                int i2 = i + 1;
                if (i2 >= length) {
                    break;
                }
                hashMap.put((String) objArr[i], objArr[i2]);
            }
            if (hashMap != null) {
                jSONObject.put("args", (Object) hashMap);
            }
        }
    }
}
