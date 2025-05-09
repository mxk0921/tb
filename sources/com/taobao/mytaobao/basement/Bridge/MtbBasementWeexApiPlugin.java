package com.taobao.mytaobao.basement.Bridge;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.mytaobao.basement.weex.BasementFeedDataProvider;
import com.taobao.mytaobao.homepage.MyTaobaoFragment;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import tb.pvh;
import tb.r4v;
import tb.s32;
import tb.suv;
import tb.t2o;
import tb.u3j;
import tb.uuu;
import tb.vib;
import tb.z6t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtbBasementWeexApiPlugin extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static WeakReference<vib> abilityRef = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vib f11180a;

        public a(vib vibVar) {
            this.f11180a = vibVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f11180a.a();
            }
        }
    }

    static {
        t2o.a(745537597);
    }

    public MtbBasementWeexApiPlugin(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static void commitWeexEventTrace(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f4605c", new Object[]{str, jSONObject});
        } else if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", (Object) str);
            jSONObject2.put("uuid", (Object) (jSONObject == null ? null : jSONObject.getString("uuid")));
            s32.c().g("TBBridgeEvent_Weex", jSONObject2, 1.0d, false);
            r4v.a(s32.MODULE_NAME, 19997, "TBBridgeEvent", null, null, jSONObject2);
        }
    }

    public static /* synthetic */ Object ipc$super(MtbBasementWeexApiPlugin mtbBasementWeexApiPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/basement/Bridge/MtbBasementWeexApiPlugin");
    }

    public static void setBasementWeexBridgeAbility(vib vibVar, MyTaobaoFragment myTaobaoFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f013903", new Object[]{vibVar, myTaobaoFragment});
            return;
        }
        myTaobaoFragment.f = vibVar;
        abilityRef = new WeakReference<>(vibVar);
    }

    @MUSMethod(uiThread = false)
    public void changeTaoFriendArrowHiddenStatus(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bebb0b4", new Object[]{this, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString("uuid");
            boolean booleanValue = jSONObject.getBooleanValue("isHidden");
            TLog.loge("basementWeexLog", "changeTaoFriendArrowHiddenStatus uuid:" + string + " isHidden:" + booleanValue);
            WeakReference<vib> weakReference = abilityRef;
            vib vibVar = weakReference == null ? null : weakReference.get();
            if (vibVar != null) {
                vibVar.b(booleanValue);
            }
        } catch (Throwable unused) {
        }
    }

    @MUSMethod(uiThread = false)
    public void endPerformanceMonitor(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ec2724", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("node");
        try {
            jSONObject2 = jSONObject.getJSONObject("args");
        } catch (Throwable unused) {
            jSONObject2 = null;
        }
        TLog.loge("basementWeexLog", "MtbBasementWeexApiPlugin.endPointWithNodeType:" + string);
        z6t.S().e(string, jSONObject2);
        commitWeexEventTrace("endPerformanceMonitor", jSONObject);
    }

    @MUSMethod(uiThread = false)
    public JSONObject getPreloadData(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4468a6d5", new Object[]{this, jSONObject, pvhVar});
        }
        TLog.loge("mtbMainLink", "MtbBasementWeexApiPlugin.getPreloadData");
        commitWeexEventTrace("getPreloadData", jSONObject);
        WeakReference<vib> weakReference = abilityRef;
        vib vibVar = weakReference == null ? null : weakReference.get();
        if (vibVar != null) {
            return vibVar.d(pvhVar);
        }
        return BasementFeedDataProvider.INSTANCE.B(pvhVar);
    }

    @MUSMethod(uiThread = false)
    public void onScrollEnd(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0c3cfa", new Object[]{this, jSONObject});
        }
    }

    @MUSMethod(uiThread = true)
    public void openWindowFromEmbedView(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12bbdfaf", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("url");
        TLog.loge("basementWeexLog", "MtbBasementWeexApiPlugin.openWindowFromEmbedView url:" + string);
        if (!TextUtils.isEmpty(string)) {
            String queryParameter = Uri.parse(string).getQueryParameter("spm");
            WeakReference<vib> weakReference = abilityRef;
            vib vibVar = weakReference == null ? null : weakReference.get();
            if (vibVar != null) {
                vibVar.e(string, queryParameter);
            }
        }
        commitWeexEventTrace("openWindowFromEmbedView", jSONObject);
    }

    @MUSMethod(uiThread = false)
    public void renderSuccess(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb76c5dc", new Object[]{this, jSONObject});
            return;
        }
        com.taobao.android.weex_framework.a instance = getInstance();
        if (instance != null) {
            instance.setTag("mtbRenderSuccess", "true");
        }
        TLog.loge("mtbMainLink", "MtbBasementWeexApiPlugin.renderSuccess");
        WeakReference<vib> weakReference = abilityRef;
        vib vibVar = weakReference == null ? null : weakReference.get();
        if (vibVar != null) {
            uuu.a(new a(vibVar));
        }
        commitWeexEventTrace("renderSuccess", jSONObject);
        suv.d(u3j.b, "Page_MyTaobao_Basement-RenderSuccess", "a2141.7631743.67.1", null, jSONObject);
    }

    @MUSMethod(uiThread = false)
    public void secScreenCeiling(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc501569", new Object[]{this, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString("uuid");
            TLog.loge("basementWeexLog", "secScreenCeiling uuid:" + string);
            WeakReference<vib> weakReference = abilityRef;
            vib vibVar = weakReference == null ? null : weakReference.get();
            if (vibVar != null) {
                vibVar.c();
            }
        } catch (Throwable unused) {
        }
    }

    @MUSMethod(uiThread = false)
    public void startPerformanceMonitor(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21023fbd", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("node");
        TLog.loge("basementLog", "MtbBasementWeexApiPlugin.startPerformanceMonitor:" + string);
        z6t.S().b(string);
        commitWeexEventTrace("startPerformanceMonitor", jSONObject);
    }

    @MUSMethod(uiThread = false)
    public void verifyFirstCardExpose(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa184e1e", new Object[]{this, jSONObject});
        }
    }

    @MUSMethod(uiThread = false)
    public void verifyFirstCardExposeV2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8e93c2", new Object[]{this, jSONObject});
        }
    }
}
