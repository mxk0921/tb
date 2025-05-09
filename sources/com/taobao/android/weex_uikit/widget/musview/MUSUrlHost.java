package com.taobao.android.weex_uikit.widget.musview;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.b;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.musview.a;
import java.util.Map;
import tb.dwh;
import tb.npc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSUrlHost extends ViewGroup implements npc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View mContentView;
    private MUSDKInstance mInstance;
    private String mJsUrl;
    private boolean mRendered = false;
    private a.C0525a mResult;
    private UINode mTargetNode;

    static {
        t2o.a(986710188);
        t2o.a(982515990);
    }

    public MUSUrlHost(Context context) {
        super(context);
    }

    private JSONObject assembleData(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("75b7f31", new Object[]{this, new Boolean(z)}) : assembleData(Boolean.valueOf(z), null, null);
    }

    private void destroyInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31293b6", new Object[]{this});
            return;
        }
        MUSDKInstance mUSDKInstance = this.mInstance;
        if (mUSDKInstance != null && !mUSDKInstance.isDestroyed()) {
            this.mInstance.destroy();
            removeAllViews();
            this.mContentView = null;
        }
    }

    public static /* synthetic */ Object ipc$super(MUSUrlHost mUSUrlHost, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/musview/MUSUrlHost");
    }

    @Override // tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    public void onFatalException(com.taobao.android.weex_framework.a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba6b641", new Object[]{this, aVar, new Integer(i), str});
            return;
        }
        UINode uINode = this.mTargetNode;
        if (uINode != null) {
            uINode.fireEvent("failed", assembleData(Boolean.FALSE, String.valueOf(i), str));
        }
    }

    public void onForeground(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fc5c834", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
            return;
        }
        UINode uINode = this.mTargetNode;
        if (uINode != null) {
            uINode.fireEvent("exception", assembleData(String.valueOf(i), str));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        View view = this.mContentView;
        if (view != null && this.mRendered && view.isLayoutRequested()) {
            View view2 = this.mContentView;
            view2.layout(0, 0, view2.getMeasuredWidth(), this.mContentView.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        View view = this.mContentView;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    @Override // tb.npc
    public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        UINode uINode = this.mTargetNode;
        if (uINode != null) {
            uINode.fireEvent("failed", assembleData(Boolean.TRUE, String.valueOf(i), str));
        }
    }

    @Override // tb.npc
    public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        UINode uINode = this.mTargetNode;
        if (uINode != null) {
            uINode.fireEvent("failed", assembleData(Boolean.FALSE, String.valueOf(i), str));
        }
    }

    public void unmount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        destroyInstance();
        this.mJsUrl = null;
        this.mTargetNode = null;
    }

    private JSONObject assembleData(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("451eedd7", new Object[]{this, str, str2}) : assembleData(null, str, str2);
    }

    public void mount(UINode uINode, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, a.C0525a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8db23be7", new Object[]{this, uINode, str, str2, jSONObject, jSONObject2, aVar});
            return;
        }
        this.mResult = aVar;
        this.mTargetNode = uINode;
        if (TextUtils.isEmpty(str)) {
            dwh.e("url mustn't be null");
            return;
        }
        if (!TextUtils.equals(this.mJsUrl, str)) {
            destroyInstance();
        } else {
            MUSDKInstance mUSDKInstance = this.mInstance;
            if (mUSDKInstance != null && !mUSDKInstance.isDestroyed()) {
                this.mInstance.refresh(jSONObject, null);
                this.mRendered = false;
                return;
            }
        }
        MUSDKInstance mUSDKInstance2 = (MUSDKInstance) b.f().b(getContext());
        this.mInstance = mUSDKInstance2;
        mUSDKInstance2.registerRenderListener(this);
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                this.mInstance.addInstanceEnv(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        this.mJsUrl = str;
        this.mInstance.getInstanceTags().putAll(uINode.getInstance().getInstanceTags());
        try {
            this.mInstance.initWithURL(Uri.parse(str));
            if (!TextUtils.equals(str, str2)) {
                this.mInstance.getMonitorInfo().q(str2);
                this.mInstance.addInstanceEnv("bundleUrl", str2);
            }
            this.mInstance.render(jSONObject, null);
        } catch (Exception unused) {
        }
        addView(this.mInstance.getRenderRoot(), new ViewGroup.LayoutParams(-1, -1));
    }

    private JSONObject assembleData(Boolean bool, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("390f0a7e", new Object[]{this, bool, str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        if (bool != null) {
            jSONObject.put("isRefresh", (Object) String.valueOf(bool));
        }
        if (!(str == null || str2 == null)) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", (Object) str);
            jSONObject2.put("msg", (Object) str2);
            jSONObject.put("e", (Object) jSONObject2);
        }
        return jSONObject;
    }

    @Override // tb.npc
    public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            return;
        }
        UINode uINode = this.mTargetNode;
        if (uINode != null) {
            uINode.fireEvent(a.EVENT_LOAD, assembleData(true));
            this.mRendered = true;
            this.mContentView = this.mInstance.getRenderRoot();
            requestLayout();
            invalidate();
            if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
                this.mContentView.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            a.C0525a aVar2 = this.mResult;
            if (aVar2 != null) {
                aVar2.f10019a = this.mInstance.getRootWidth();
                this.mResult.b = this.mInstance.getRootHeight();
            }
            this.mTargetNode.notifyEngineRelayout();
        }
    }

    @Override // tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        UINode uINode = this.mTargetNode;
        if (uINode != null) {
            uINode.fireEvent(a.EVENT_LOAD, assembleData(false));
            this.mRendered = true;
            this.mContentView = this.mInstance.getRenderRoot();
            requestLayout();
            invalidate();
            if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
                this.mContentView.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            a.C0525a aVar2 = this.mResult;
            if (aVar2 != null) {
                aVar2.f10019a = this.mInstance.getRootWidth();
                this.mResult.b = this.mInstance.getRootHeight();
            }
            this.mTargetNode.notifyEngineRelayout();
        }
    }
}
