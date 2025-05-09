package io.unicorn.plugin.platform;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex_framework.MUSDKInstance;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.ati;
import tb.dwh;
import tb.exp;
import tb.l5m;
import tb.lk2;
import tb.m7x;
import tb.t2o;
import tb.wgw;
import tb.yce;
import tb.ysi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class WeexPlatformView implements l5m, Serializable {
    private static final String TAG = "UnicornPlatformView";
    private Context mContext;
    private ysi mInvokerExecutor;
    private exp mInvokersHolder;
    private int mViewId;
    private String mWhiteScreenInfo;
    private m7x nestedScrollManager;
    private final String KEY_BOOL_WHITE_SCREEN = "isWhiteScreen";
    private final String KEY_WHITE_MSG = "message";
    private HashMap<String, String> mWhiteScreenInfoMap = new HashMap<>();

    static {
        t2o.a(945815822);
        t2o.a(945815804);
    }

    public WeexPlatformView(Context context, int i) {
        this.mContext = context;
        this.mViewId = i;
    }

    private void dispatchPlatformViewMessage(String str, JSONArray jSONArray) {
        str.hashCode();
        if (str.equals("scroll")) {
            scroll(jSONArray);
        }
    }

    private void scroll(JSONArray jSONArray) {
        try {
            m7x m7xVar = this.nestedScrollManager;
            if (m7xVar != null) {
                m7xVar.c(jSONArray.getBoolean(0), jSONArray.getDouble(1));
            }
        } catch (Exception e) {
            dwh.g("Weex", "dispatchPlatformViewMessage:", e);
        }
    }

    private void updateProperties(Map<String, String> map) {
        if (!this.mInvokersHolder.g()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                ati e = this.mInvokersHolder.e(entry.getKey());
                if (e != null) {
                    try {
                        Type[] a2 = e.a();
                        if (a2.length != 1) {
                            Log.e(TAG, "setXXX method only supports one parameter：" + e);
                        } else {
                            e.b(this, ysi.j(a2[0], entry.getValue()));
                        }
                    } catch (Exception e2) {
                        dwh.g(TAG, " Invoker " + e.toString(), e2);
                    }
                }
            }
        }
    }

    public WeexValue CallUINodeMethod(String str, WeexValue[] weexValueArr) {
        boolean z;
        m7x m7xVar;
        exp expVar = this.mInvokersHolder;
        if (weexValueArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        ati d = expVar.d(str, z);
        if (d != null) {
            return WeexValueImpl.convert(this.mInvokerExecutor.i(this, d, weexValueArr));
        }
        if (!"scroll".equals(str) || (m7xVar = this.nestedScrollManager) == null) {
            return null;
        }
        m7xVar.c(((Boolean) weexValueArr[0].getValue()).booleanValue(), ((Double) weexValueArr[1].getValue()).doubleValue());
        return null;
    }

    public void attach(exp expVar, ysi ysiVar) {
        this.mInvokersHolder = expVar;
        this.mInvokerExecutor = ysiVar;
    }

    public void bindData(HashMap<String, String> hashMap, HashMap<String, String> hashMap2, HashSet<String> hashSet) {
        if (hashMap != null) {
            onUpdateStyles(hashMap);
        }
        if (hashMap2 != null) {
            onUpdateAttrs(hashMap2);
        }
        if (hashSet != null) {
            onUpdateEvents(hashSet);
        }
        onCreated();
    }

    public boolean checkIsWhiteScreen() {
        if (getView() == null) {
            return true;
        }
        if (!wgw.e(getView()) || !wgw.a(getView().getParent())) {
            return false;
        }
        return !wgw.d(getView(), 3);
    }

    public Map<String, String> checkWhiteScreenInfo() {
        this.mWhiteScreenInfoMap.put("isWhiteScreen", String.valueOf(checkIsWhiteScreen()));
        this.mWhiteScreenInfoMap.put("message", String.valueOf(this.mWhiteScreenInfo));
        return this.mWhiteScreenInfoMap;
    }

    @Override // tb.l5m
    public void dispose() {
        onDispose();
    }

    public void fireEvent(String str, Object obj) {
        this.mInvokerExecutor.h(this.mViewId, str, obj);
    }

    public Context getContext() {
        return this.mContext;
    }

    public MUSDKInstance getMUSInstance() {
        return this.mInvokerExecutor.f();
    }

    public m7x getNestedScrollManager() {
        return this.nestedScrollManager;
    }

    @Override // tb.l5m
    public abstract View getView();

    public int getViewId() {
        return this.mViewId;
    }

    public WeexInstance getWeexInstance() {
        return this.mInvokerExecutor.g();
    }

    public void onInvokeUnknownMethod(String str, JSONArray jSONArray) {
        if ("scroll".equals(str)) {
            dispatchPlatformViewMessage(str, jSONArray);
        }
    }

    @Deprecated
    public void onReceivedMessage(String str, JSONArray jSONArray, lk2 lk2Var) {
    }

    @Deprecated
    public void onReceivedRender(JSONArray jSONArray, lk2 lk2Var) {
    }

    @Override // tb.l5m
    public void onUpdateAttrs(Map<String, String> map) {
        updateProperties(map);
    }

    public void onUpdateStyles(Map<String, String> map) {
        updateProperties(map);
    }

    public void setWeexPlatformListDelegate(yce yceVar) {
        if (this.nestedScrollManager == null) {
            this.nestedScrollManager = new m7x(this, yceVar);
        }
    }

    public void setWhiteScreenInfo(String str) {
        this.mWhiteScreenInfo = str;
    }

    public void fireEvent(String str) {
        this.mInvokerExecutor.h(this.mViewId, str, null);
    }

    @Deprecated
    public void onReceivedMessage(String str, JSONObject jSONObject, lk2 lk2Var) {
    }

    @Deprecated
    public void onReceivedRender(JSONObject jSONObject, lk2 lk2Var) {
    }

    @Override // tb.l5m
    public void onActivityDestroy() {
    }

    @Override // tb.l5m
    public void onActivityPause() {
    }

    @Override // tb.l5m
    public void onActivityResume() {
    }

    @Override // tb.l5m
    public void onActivityStart() {
    }

    @Override // tb.l5m
    public void onActivityStop() {
    }

    public void onCreated() {
    }

    public void onDispose() {
    }

    @Override // tb.l5m
    public void onFlutterViewDetached() {
    }

    @Deprecated
    public void onInputConnectionLocked() {
    }

    @Deprecated
    public void onInputConnectionUnlocked() {
    }

    @Deprecated
    public void onPause() {
    }

    @Deprecated
    public void onResume() {
    }

    public void onAddEvent(String str) {
    }

    @Override // tb.l5m
    public void onFlutterViewAttached(View view) {
    }

    public void onRemoveEvent(String str) {
    }

    public void onUpdateEvents(HashSet<String> hashSet) {
    }
}
