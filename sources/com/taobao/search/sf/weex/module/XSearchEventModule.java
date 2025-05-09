package com.taobao.search.sf.weex.module;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXRenderStrategy;
import java.util.HashMap;
import java.util.Map;
import tb.amo;
import tb.c2v;
import tb.c4p;
import tb.dnx;
import tb.fo6;
import tb.gtf;
import tb.h19;
import tb.t2o;
import tb.vjx;
import tb.yak;
import tb.zak;
import tb.zvr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class XSearchEventModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "xsearchEvent";
    private static final String TAG = "XSearchEventModule";
    private dnx bizImpl = new dnx();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements fo6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.fo6
        public void errorReport(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28fdfd81", new Object[]{this, str, str2, str3});
            }
        }

        @Override // tb.fo6
        public void notify(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12981c64", new Object[]{this, str, str2});
            } else if (XSearchEventModule.this.mWXSDKInstance != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("contentList", str2);
                XSearchEventModule.this.mWXSDKInstance.B("jarvis_reorderList", hashMap);
            }
        }
    }

    static {
        t2o.a(815793534);
    }

    public static /* synthetic */ Object ipc$super(XSearchEventModule xSearchEventModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/weex/module/XSearchEventModule");
    }

    @JSMethod
    public void addParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54883a22", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.a(this.mWXSDKInstance, jSONObject);
        }
    }

    @JSMethod
    public void clearParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc56a8f6", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.b(this.mWXSDKInstance, jSONObject);
        }
    }

    @JSMethod(uiThread = false)
    public Map<String, String> getParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this});
        }
        return this.bizImpl.d(this.mWXSDKInstance);
    }

    @JSMethod(uiThread = false)
    public JSONObject getVcStorage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45e5111", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null && !jSONObject.isEmpty()) {
            JSONArray c = h19.c(jSONObject, "keys");
            for (int i = 0; i < c.size(); i++) {
                String string = c.getString(i);
                jSONObject2.put(string, (Object) vjx.b(this.mWXSDKInstance.getContext(), string));
            }
        }
        return jSONObject2;
    }

    @JSMethod(uiThread = true)
    public void goToSrp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b286da9b", new Object[]{this, jSONObject});
            return;
        }
        dnx dnxVar = this.bizImpl;
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        dnxVar.e(wXSDKInstance, wXSDKInstance.getContext(), jSONObject);
    }

    @JSMethod(uiThread = true)
    public void jumpToTab(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd53f3d", new Object[]{this, jSONObject});
            return;
        }
        dnx dnxVar = this.bizImpl;
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        dnxVar.f(wXSDKInstance, wXSDKInstance.getContext(), jSONObject);
    }

    @JSMethod
    public void jumpToTimeline(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c25adf", new Object[]{this, jSONObject});
            return;
        }
        dnx dnxVar = this.bizImpl;
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        dnxVar.g(wXSDKInstance, wXSDKInstance.getContext(), jSONObject);
    }

    @JSMethod
    public void openTaobaoExperience(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f8f4e7", new Object[]{this, jSONObject});
            return;
        }
        dnx dnxVar = this.bizImpl;
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        dnxVar.h(wXSDKInstance, wXSDKInstance.getContext(), jSONObject);
    }

    @JSMethod
    public void operateSearchList(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c2da7f", new Object[]{this, jSONObject});
            return;
        }
        dnx dnxVar = this.bizImpl;
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        dnxVar.i(wXSDKInstance, wXSDKInstance.getContext(), jSONObject);
    }

    @JSMethod
    public void prepareCompassRequest(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f998ffc5", new Object[]{this, jSONObject});
            return;
        }
        dnx dnxVar = this.bizImpl;
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        dnxVar.m(wXSDKInstance, wXSDKInstance.getContext(), jSONObject);
    }

    @JSMethod
    public void refreshAuction(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24174d61", new Object[]{this, jSONObject});
            return;
        }
        dnx dnxVar = this.bizImpl;
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        dnxVar.n(wXSDKInstance, wXSDKInstance.getContext(), jSONObject);
    }

    @JSMethod(uiThread = true)
    public void refreshList(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3a5cd0", new Object[]{this, jSONObject});
            return;
        }
        dnx dnxVar = this.bizImpl;
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        dnxVar.s(wXSDKInstance, wXSDKInstance.getContext(), jSONObject);
    }

    @JSMethod
    public void removeDynamicCard(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f9495e", new Object[]{this, jSONObject});
            return;
        }
        dnx dnxVar = this.bizImpl;
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        dnxVar.o(wXSDKInstance, wXSDKInstance.getContext(), jSONObject);
    }

    @JSMethod
    public void removeParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b886ca5f", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.p(this.mWXSDKInstance, jSONObject);
        }
    }

    @JSMethod
    public void removeSelf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f16677", new Object[]{this});
        } else {
            this.bizImpl.q(this.mWXSDKInstance);
        }
    }

    @JSMethod(uiThread = false)
    public void removeVcStorage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b18329f", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            JSONArray c = h19.c(jSONObject, "keys");
            for (int i = 0; i < c.size(); i++) {
                vjx.c(this.mWXSDKInstance.getContext(), c.getString(i));
            }
        }
    }

    @JSMethod(uiThread = true)
    public void reorderList(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe1f2b0", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            c4p.n(TAG, "options参数为空");
        } else if (jSONObject.containsKey("pageName") && jSONObject.containsKey("contentList")) {
            String string = jSONObject.getString("pageName");
            JSONArray jSONArray = jSONObject.getJSONArray("contentList");
            if (jSONArray != null && jSONArray.size() != 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("args", jSONArray.toString());
                gtf.i().o(string, "reorderList", hashMap, new a());
            }
        }
    }

    @JSMethod(uiThread = true)
    public void search(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626126a1", new Object[]{this, jSONObject});
            return;
        }
        dnx dnxVar = this.bizImpl;
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        dnxVar.r(wXSDKInstance, wXSDKInstance.getContext(), jSONObject);
    }

    @JSMethod(uiThread = true)
    public void searchOption(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d5792c", new Object[]{this, jSONObject});
            return;
        }
        dnx dnxVar = this.bizImpl;
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        dnxVar.s(wXSDKInstance, wXSDKInstance.getContext(), jSONObject);
    }

    @JSMethod
    public void searchOptionWithCallback(JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b069281", new Object[]{this, jSONObject, jSCallback, jSCallback2});
            return;
        }
        dnx dnxVar = this.bizImpl;
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        dnxVar.t(wXSDKInstance, wXSDKInstance.getContext(), jSONObject, zak.a(jSCallback), zak.a(jSCallback2));
    }

    @JSMethod
    public void setParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285787c1", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.u(this.mWXSDKInstance, jSONObject);
        }
    }

    @JSMethod
    public void tagSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86792a7", new Object[]{this, jSONObject});
            return;
        }
        dnx dnxVar = this.bizImpl;
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        dnxVar.v(wXSDKInstance, wXSDKInstance.getContext(), jSONObject);
    }

    @JSMethod(uiThread = true)
    public void updateStorage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b3a517", new Object[]{this, jSONObject});
            return;
        }
        dnx dnxVar = this.bizImpl;
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        dnxVar.w(wXSDKInstance, wXSDKInstance.getContext(), jSONObject);
    }

    @JSMethod(uiThread = false)
    public void updateVcStorage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af89c224", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    vjx.d(this.mWXSDKInstance.getContext(), key, value.toString());
                }
            }
        }
    }

    @JSMethod(uiThread = true)
    public void utClickLog(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686053ce", new Object[]{this, jSONObject});
        } else {
            dnx.x(jSONObject);
        }
    }

    @JSMethod
    public void commitAppmonitorAvailableJSError(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("904dd6e3", new Object[]{this, jSONObject});
        } else if (this.mWXSDKInstance != null) {
            zvr.u(yak.f31939a).e().b(jSONObject.getString("tItemType"), jSONObject.getString(amo.DIMENSION_JSVERSION), c2v.getInstance().getCurrentPageName(), 2.0d, jSONObject.getString("errorMsg"), this.mWXSDKInstance.V() == WXRenderStrategy.DATA_RENDER_BINARY);
        }
    }
}
