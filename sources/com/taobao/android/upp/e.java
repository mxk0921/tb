package com.taobao.android.upp;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.android.upp.d;
import com.taobao.tao.log.TLog;
import java.util.Iterator;
import java.util.Map;
import tb.f82;
import tb.fm1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e extends UppProtocolImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750773);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/upp/UppProtocolImplCpp");
    }

    @Override // com.taobao.android.upp.UppProtocolImpl, com.taobao.android.upp.d
    public void addBizFeatures(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc5b50b9", new Object[]{this, map, str});
        } else if (map != null) {
            NativeDelegate.AddUserFeature(str, new JSONObject(map));
        }
    }

    @Override // com.taobao.android.upp.UppProtocolImpl
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    @Override // com.taobao.android.upp.UppProtocolImpl
    public String registerUCPResourceScheme(String str, JSONObject jSONObject, String str2, Object obj, d.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("523e9407", new Object[]{this, str, jSONObject, str2, obj, aVar}) : NativeDelegate.registerResourceSchemeToCpp(str2, obj, str, jSONObject, new b(aVar));
    }

    @Override // com.taobao.android.upp.UppProtocolImpl, com.taobao.android.upp.d
    public void registerUPPCallbackWithScene(String str, Object obj, d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557953fc", new Object[]{this, str, obj, bVar});
        } else {
            NativeDelegate.addSceneCallback(str, obj, bVar, null);
        }
    }

    @Override // com.taobao.android.upp.UppProtocolImpl
    public void unRegisterUPPCallbackWithScene(String str, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c0e598b", new Object[]{this, str, activity});
        } else {
            NativeDelegate.removeSceneCallback(str, activity);
        }
    }

    @Override // com.taobao.android.upp.UppProtocolImpl
    public void registerUCPPlans(JSONObject jSONObject, JSONObject jSONObject2, String str, Activity activity, d.a aVar, d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260fa0c4", new Object[]{this, jSONObject, jSONObject2, str, activity, aVar, bVar});
        } else if (!f82.j()) {
            UtUtils.e("UCP", 19999, "behavixNull", "registerUCPPlans", "", "");
            UppProtocolImpl.printThreadName("registerUCPPlans");
        } else {
            Log.e("sijian", "aaa");
            if (jSONObject != null && !jSONObject.isEmpty()) {
                try {
                    if (jSONObject.containsKey("ucpData")) {
                        jSONObject = jSONObject.getJSONObject("ucpData");
                    }
                    NativeDelegate.registerUCPPlansToCpp(jSONObject);
                    JSONArray jSONArray = jSONObject.getJSONObject("plan").getJSONArray("diff");
                    if (jSONArray != null) {
                        Iterator<Object> it = jSONArray.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObject3 = (JSONObject) it.next();
                            if (jSONObject3 != null) {
                                NativeDelegate.registerResourceSchemeToCpp(str, activity, jSONObject3.getJSONObject("data").getString("schemeId"), jSONObject2, new c(aVar));
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            registerUPPCallbackWithScene(str, activity, bVar);
                        }
                        BHREvent buildInternalEvent = BHREvent.buildInternalEvent(str, "PlanRegister", String.valueOf(activity.hashCode()), true);
                        JSONObject jSONObject4 = new JSONObject();
                        if (jSONObject2 != null) {
                            jSONObject4.putAll(jSONObject2);
                        }
                        jSONObject4.put("br_action", (Object) "register");
                        jSONObject4.put("br_from", (Object) "ucp");
                        buildInternalEvent.bizArgKVMapObject = jSONObject4;
                        fm1.f().a(buildInternalEvent);
                    }
                } catch (Exception e) {
                    TLog.loge("UppProtocolImplCpp", "registerUCPPlans", e);
                }
            }
        }
    }

    @Override // com.taobao.android.upp.UppProtocolImpl
    public String registerUCPResourceScheme(String str, JSONObject jSONObject, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8631894d", new Object[]{this, str, jSONObject, str2, obj}) : NativeDelegate.registerResourceSchemeToCpp(str2, obj, str, jSONObject, null);
    }

    @Override // com.taobao.android.upp.UppProtocolImpl
    public void registerUPPCallbackWithScene(String str, Object obj, d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2443e", new Object[]{this, str, obj, cVar});
        } else {
            NativeDelegate.addSceneCallback(str, obj, null, cVar);
        }
    }

    @Override // com.taobao.android.upp.UppProtocolImpl
    public void registerUPPCallbackWithScene(String str, Activity activity, d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa93b446", new Object[]{this, str, activity, bVar});
        } else {
            NativeDelegate.addSceneCallback(str, activity, bVar, null);
        }
    }
}
