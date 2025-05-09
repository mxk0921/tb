package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.aspect.lifecycle.protocolCache")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class fg extends ms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81788959);
    }

    public static /* synthetic */ Object ipc$super(fg fgVar, String str, Object... objArr) {
        if (str.hashCode() == 1111077198) {
            super.beforeServiceExecute((AURAInputData) objArr[0], (cg) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/aspect/AURAAspectLifecycleProtocolCacheExtension");
    }

    public final void P0(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a27b0df", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject != null && (jSONObject3 = jSONObject.getJSONObject("meta")) != null && (jSONObject4 = jSONObject3.getJSONObject("template")) != null) {
            String string = jSONObject4.getString("id");
            if (!TextUtils.isEmpty(string)) {
                nbb c = M0().c();
                Object a2 = yg.a(c, yg.CACHE_KEY_TEMPLATE_CONTAINER + string);
                if (a2 instanceof JSONObject) {
                    jSONObject2.put("container", a2);
                }
            }
        }
    }

    @Override // tb.ms, tb.xab
    public void beforeServiceExecute(AURAInputData aURAInputData, cg cgVar) {
        rl rlVar;
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4239b14e", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, cgVar);
        if (cgVar.b().equals(dl.PARSE_SERVICE_CODE) && (aURAInputData.getData() instanceof AURAParseIO) && (rlVar = ((AURAParseIO) aURAInputData.getData()).getData().get(0)) != null && (b = rlVar.b()) != null) {
            JSONObject jSONObject = b.getJSONObject(AURASubmitEvent.RPC_ENDPOINT);
            JSONObject jSONObject2 = b.getJSONObject("container");
            if (jSONObject2 == null) {
                P0(jSONObject, b);
            } else {
                Q0(jSONObject, jSONObject2);
            }
        }
    }

    public final void Q0(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        boolean z = false;
        z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f8d132", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject != null && (jSONObject3 = jSONObject.getJSONObject("meta")) != null && (jSONObject4 = jSONObject3.getJSONObject("template")) != null) {
            String string = jSONObject4.getString("id");
            String string2 = jSONObject4.getString("version");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                nbb c = M0().c();
                Object a2 = yg.a(c, yg.CACHE_KEY_TEMPLATE_INFO);
                if (!(a2 instanceof JSONArray)) {
                    a2 = new JSONArray();
                }
                JSONArray jSONArray = (JSONArray) a2;
                int i = 0;
                boolean z2 = false;
                while (true) {
                    if (i >= jSONArray.size()) {
                        break;
                    }
                    JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                    if (jSONObject5 != null && TextUtils.equals(jSONObject5.getString("id"), string)) {
                        if (!TextUtils.equals(jSONObject5.getString("version"), string2)) {
                            jSONObject5.putAll(jSONObject4);
                            z = true;
                            z2 = true;
                            break;
                        }
                        z2 = true;
                    }
                    i++;
                }
                if (!z2) {
                    jSONArray.add(jSONObject4);
                }
                if (z) {
                    yg.b(c, yg.CACHE_KEY_TEMPLATE_INFO, jSONArray, null);
                    yg.b(c, yg.CACHE_KEY_TEMPLATE_CONTAINER + string, jSONObject2, null);
                }
            }
        }
    }
}
