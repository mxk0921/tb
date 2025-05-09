package com.taobao.android.xsearchplugin.weex.weex;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXException;
import com.taobao.weex.common.WXModule;
import tb.cbk;
import tb.cnx;
import tb.f64;
import tb.fj4;
import tb.t2o;
import tb.zak;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class XSearchUtilModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String METHOD_COMMIT_CLICK = "commitClick";
    public static final String METHOD_COMMIT_EXPOSE = "commitExpose";
    public static final String METHOD_REQUEST_LOST_FOCUS = "requestLostFocus";
    public static final String METHOD_UPDATE_STORAGE = "updateStorage";
    public static final String MODULE_NAME = "xsearchUtil";
    public static boolean REGISTERED = false;
    private static final String TAG = "XSearchUtilModule";
    public static volatile fj4 sConstantAdapter;

    static {
        t2o.a(993002203);
    }

    public static /* synthetic */ Object ipc$super(XSearchUtilModule xSearchUtilModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/weex/weex/XSearchUtilModule");
    }

    private void performAction(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        cnx D1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f368568", new Object[]{this, str, jSONObject, aVar, aVar2});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if ((wXSDKInstance instanceof cbk) && (D1 = ((cbk) wXSDKInstance).D1()) != null) {
            D1.K(str, jSONObject, aVar, aVar2);
        }
    }

    @JSMethod(uiThread = false)
    public JSONObject getLocalParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b66d71c2", new Object[]{this});
        }
        String a2 = sConstantAdapter.a();
        String utdid = sConstantAdapter.getUtdid();
        String ttid = sConstantAdapter.getTtid();
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(a2)) {
            jSONObject.put("sversion", (Object) a2);
            jSONObject.put("utd_id", (Object) utdid);
            jSONObject.put("ttid", (Object) ttid);
        }
        return jSONObject;
    }

    @JSMethod(uiThread = true)
    public void requestLostFocus(JSCallback jSCallback) {
        cnx D1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c2d00bc", new Object[]{this, jSCallback});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if ((wXSDKInstance instanceof cbk) && (D1 = ((cbk) wXSDKInstance).D1()) != null) {
            D1.K("updateStorage", null, zak.a(jSCallback), null);
        }
    }

    @JSMethod(uiThread = true)
    public void updateStorage(JSONObject jSONObject) {
        cnx D1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b3a517", new Object[]{this, jSONObject});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if ((wXSDKInstance instanceof cbk) && (D1 = ((cbk) wXSDKInstance).D1()) != null) {
            D1.K("updateStorage", jSONObject, null, null);
        }
    }

    public static void install(fj4 fj4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ead74", new Object[]{fj4Var});
        } else if (!REGISTERED) {
            REGISTERED = true;
            sConstantAdapter = fj4Var;
            try {
                WXSDKEngine.registerModule("xsearchUtil", XSearchUtilModule.class);
            } catch (WXException e) {
                e.printStackTrace();
            }
        }
    }
}
