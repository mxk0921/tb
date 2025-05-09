package com.taobao.android.upp;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.external.UCPManager;
import com.taobao.android.upp.d;
import com.taobao.tao.log.TLog;
import java.util.Map;
import tb.eyu;
import tb.f82;
import tb.mj7;
import tb.t2o;
import tb.w5v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UppProtocolImpl implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UppProtocolImpl";
    private static boolean sInitSwitch = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final UppProtocolImpl f9877a = new e();

        static {
            t2o.a(404750772);
        }

        public static /* synthetic */ UppProtocolImpl a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UppProtocolImpl) ipChange.ipc$dispatch("8a49221d", new Object[0]);
            }
            return f9877a;
        }
    }

    static {
        t2o.a(404750771);
    }

    public UppProtocolImpl() {
        sInitSwitch = getUppEnabled();
    }

    public static d getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("4a7a9473", new Object[0]);
        }
        return a.a();
    }

    public static UppProtocolImpl getInstanceImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UppProtocolImpl) ipChange.ipc$dispatch("6210d973", new Object[0]);
        }
        return a.a();
    }

    private boolean getUppEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee6553cd", new Object[]{this})).booleanValue();
        }
        return eyu.b();
    }

    public static void printThreadName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("502aff53", new Object[]{str});
        } else {
            TLog.loge(TAG, TAG, str, Thread.currentThread().getName());
        }
    }

    @Override // com.taobao.android.upp.d
    public void addBizFeatures(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc5b50b9", new Object[]{this, map, str});
        } else if (!f82.j()) {
            UtUtils.e("UCP", 19999, "behavixNull", "addBizFeatures", "", "");
            printThreadName("addBizFeatures");
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (eyu.b()) {
            BehaviR.getInstance().registerSolution("UCP", w5v.p());
        }
    }

    @Override // com.taobao.android.upp.d
    public boolean isDisableWithSchemeIdAndBizIdString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d4241a1", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    @Deprecated
    public String registerResourceScheme(String str, Object obj, String str2, JSONObject jSONObject, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1467bf37", new Object[]{this, str, obj, str2, jSONObject, aVar});
        }
        return w5v.p().t(str, obj, str2, jSONObject, null, new c(aVar));
    }

    @Deprecated
    public String registerResourceSpace(String str, JSONObject jSONObject, d.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("962d4a72", new Object[]{this, str, jSONObject, bVar}) : registerResourceSpace((String) null, (Activity) null, str, jSONObject, bVar);
    }

    public void registerUCPPlans(JSONObject jSONObject, JSONObject jSONObject2, String str, Activity activity, d.a aVar, d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260fa0c4", new Object[]{this, jSONObject, jSONObject2, str, activity, aVar, bVar});
        } else if (!f82.j()) {
            UtUtils.e("UCP", 19999, "behavixNull", "registerUCPPlans", "", "");
            printThreadName("registerUCPPlans");
        }
    }

    public String registerUCPResourceScheme(String str, JSONObject jSONObject, String str2, Object obj, d.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("523e9407", new Object[]{this, str, jSONObject, str2, obj, aVar}) : w5v.p().t(str2, obj, str, jSONObject, null, new b(aVar));
    }

    @Deprecated
    public void registerUPPCallbackWithScene(String str, Activity activity, d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa93b446", new Object[]{this, str, activity, bVar});
        } else {
            w5v.p().n(str, activity, bVar, null);
        }
    }

    @Override // com.taobao.android.upp.d
    public void sendUCPEventWithScene(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933376f", new Object[]{this, str, str2, jSONObject});
        } else {
            UCPManager.p(str, "internal", str2, jSONObject);
        }
    }

    public void unRegisterUPPCallbackWithScene(String str, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c0e598b", new Object[]{this, str, activity});
        } else {
            w5v.p().u(str, activity);
        }
    }

    public void unregisterResourceSpace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3035384d", new Object[]{this, str});
        } else {
            w5v.p().v(str);
        }
    }

    @Deprecated
    public String registerResourceSpace(String str, Activity activity, String str2, JSONObject jSONObject, d.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4e92456", new Object[]{this, str, activity, str2, jSONObject, bVar}) : w5v.p().t(str, activity, str2, jSONObject, bVar, null);
    }

    public String registerUCPResourceScheme(String str, JSONObject jSONObject, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8631894d", new Object[]{this, str, jSONObject, str2, obj}) : w5v.p().t(str2, obj, str, jSONObject, null, null);
    }

    @Override // com.taobao.android.upp.d
    public void registerUPPCallbackWithScene(String str, Object obj, d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557953fc", new Object[]{this, str, obj, bVar});
        } else {
            w5v.p().n(str, obj, bVar, null);
        }
    }

    @Override // com.taobao.android.upp.d
    public boolean isUppEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6790ea1", new Object[]{this})).booleanValue();
        }
        if (!sInitSwitch) {
            UtUtils.f("UPP", "upp_not_available", "init_switch_close", null);
            return false;
        } else if (!getUppEnabled()) {
            UtUtils.f("UPP", "upp_not_available", "switch_close", null);
            return false;
        } else if (mj7.c()) {
            return true;
        } else {
            UtUtils.f("UPP", "upp_not_available", "device_downgrade", null);
            return false;
        }
    }

    @Override // com.taobao.android.upp.d
    @Deprecated
    public String registerResourceSpace(String str, Object obj, String str2, JSONObject jSONObject, d.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b090f60c", new Object[]{this, str, obj, str2, jSONObject, bVar}) : w5v.p().t(str, obj, str2, jSONObject, bVar, null);
    }

    public void registerUPPCallbackWithScene(String str, Object obj, d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2443e", new Object[]{this, str, obj, cVar});
        } else {
            w5v.p().n(str, obj, null, cVar);
        }
    }

    @Deprecated
    public String registerResourceSpace(String str, Activity activity, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("19751dbe", new Object[]{this, str, activity, str2}) : w5v.p().s(str, activity, str2);
    }
}
