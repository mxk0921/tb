package com.taobao.search.weex.module;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXRenderStrategy;
import tb.amo;
import tb.b4p;
import tb.c2v;
import tb.cbk;
import tb.dnx;
import tb.t2o;
import tb.yak;
import tb.zvr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchEventModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "searchEvent";
    private static final String TAG = "SearchEventModule";
    private dnx bizImpl = new dnx();

    static {
        t2o.a(815793814);
    }

    public static /* synthetic */ Object ipc$super(SearchEventModule searchEventModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/weex/module/SearchEventModule");
    }

    private void postEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a3afb65", new Object[]{this, str, jSONObject});
        } else if (TextUtils.isEmpty(str)) {
            b4p.b(TAG, "event为空");
        } else if (!checkInstanceAvailable()) {
            b4p.b(TAG, str + ": instance不支持");
        } else {
            cbk.a E1 = ((cbk) this.mWXSDKInstance).E1();
            if (E1 == null) {
                b4p.b(TAG, str + ": eventListener为空");
                return;
            }
            E1.r2(str, jSONObject, null, null);
        }
    }

    @JSMethod(uiThread = true)
    public void clickAuction(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2af08e", new Object[]{this, jSONObject});
        }
    }

    @JSMethod(uiThread = true)
    public void goToSrp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b286da9b", new Object[]{this, jSONObject});
        } else {
            postEvent("goToSrp", jSONObject);
        }
    }

    @JSMethod(uiThread = true)
    public void jumpToTab(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd53f3d", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            b4p.b(TAG, "options参数为空");
        } else {
            WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
            if (wXSDKInstance != null && (wXSDKInstance.getContext() instanceof BaseResultActivity)) {
                ((BaseResultActivity) this.mWXSDKInstance.getContext()).u4("jumpToTab", jSONObject, null, null);
            }
        }
    }

    @JSMethod(uiThread = true)
    public void popSearchDoor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ed5fae", new Object[]{this});
            return;
        }
        Context context = this.mWXSDKInstance.getContext();
        if (context instanceof SearchDoorActivity) {
            ((SearchDoorActivity) context).finish();
        }
    }

    @JSMethod
    public void requestCompassWithParams(JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587f4e5a", new Object[]{this, jSONObject, jSCallback, jSCallback2});
        } else if (jSONObject != null && jSCallback != null) {
            jSCallback.invoke(new JSONObject());
        }
    }

    @JSMethod(uiThread = true)
    public void search(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626126a1", new Object[]{this, jSONObject});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (wXSDKInstance instanceof cbk) {
            this.bizImpl.r(wXSDKInstance, wXSDKInstance.getContext(), jSONObject);
        }
    }

    @JSMethod(uiThread = true)
    public void searchOption(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d5792c", new Object[]{this, jSONObject});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (wXSDKInstance instanceof cbk) {
            this.bizImpl.s(wXSDKInstance, wXSDKInstance.getContext(), jSONObject);
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

    @JSMethod(uiThread = true)
    public void searchDoorHideSoftInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9524414f", new Object[]{this});
            return;
        }
        Context context = this.mWXSDKInstance.getContext();
        if (!(context instanceof Activity)) {
            b4p.b(TAG, "无法获取到当前activity");
        }
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(((Activity) context).getWindow().getDecorView().getWindowToken(), 0);
    }

    private boolean checkInstanceAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fbe5817", new Object[]{this})).booleanValue();
        }
        if (this.mWXSDKInstance instanceof cbk) {
            return true;
        }
        b4p.b(TAG, "当前实例不是NxWeexInstance，不能使用该module");
        return false;
    }

    @JSMethod
    public void commitAppmonitorAvailableJSError(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("904dd6e3", new Object[]{this, jSONObject});
            return;
        }
        zvr.u(yak.f31939a).e().b(jSONObject.getString("tItemType"), jSONObject.getString(amo.DIMENSION_JSVERSION), c2v.getInstance().getCurrentPageName(), 2.0d, jSONObject.getString("errorMsg"), this.mWXSDKInstance.V() == WXRenderStrategy.DATA_RENDER_BINARY);
    }
}
