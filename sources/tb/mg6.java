package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mg6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLCARDDATAEXPO = 4879316639758331617L;

    static {
        t2o.a(310378546);
    }

    public static /* synthetic */ Object ipc$super(mg6 mg6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/DXTblCardDataExpoEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONArray jSONArray;
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (!(jSONObject.getJSONArray("cardData") == null || (jSONArray = jSONObject.getJSONArray("cardData")) == null || jSONArray.size() == 0)) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2 != null) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("showMaidian");
                            if (jSONObject3 != null) {
                                str3 = jSONObject3.getString("pageName");
                                str2 = jSONObject3.getString("name");
                                str = jSONObject3.getString("params");
                            } else {
                                str3 = "";
                                str = str3;
                                str2 = str;
                            }
                            String string = jSONObject2.getString("trackInfo");
                            if (!lrq.a(string)) {
                                str = str + ",trackInfo=" + string;
                            }
                            if (!lrq.a(str2)) {
                                s9m.d(str3, str2, str);
                            }
                        }
                    }
                }
            }
        }
    }
}
