package com.taobao.search.musie.weex;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.musview.a;
import com.taobao.weex.WXSDKInstance;
import tb.ckf;
import tb.gbe;
import tb.kgw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MusWeexHost extends FrameLayout implements gbe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Point mMeasureResult;
    private String mScriptUrl;
    private UINode mUiNode;
    private WXSDKInstance mWeexInstance;

    static {
        t2o.a(815792807);
        t2o.a(985661443);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusWeexHost(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    private final WXSDKInstance createWeexInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("351f977", new Object[]{this});
        }
        WXSDKInstance wXSDKInstance = new WXSDKInstance(getContext());
        wXSDKInstance.registerRenderListener(this);
        return wXSDKInstance;
    }

    private final void destroyWeexInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81687157", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWeexInstance;
        if (wXSDKInstance != null) {
            wXSDKInstance.destroy();
        }
        this.mScriptUrl = null;
        this.mWeexInstance = null;
        removeAllViews();
    }

    public static /* synthetic */ Object ipc$super(MusWeexHost musWeexHost, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/weex/MusWeexHost");
    }

    public final void mount(UINode uINode, String str, JSONObject jSONObject, Point point) {
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a6eca1", new Object[]{this, uINode, str, jSONObject, point});
            return;
        }
        ckf.g(uINode, "uiNode");
        ckf.g(point, "measureResult");
        this.mUiNode = uINode;
        this.mMeasureResult = point;
        if (!TextUtils.isEmpty(str)) {
            String str2 = null;
            if (!TextUtils.equals(this.mScriptUrl, str) || (wXSDKInstance = this.mWeexInstance) == null) {
                destroyWeexInstance();
                WXSDKInstance createWeexInstance = createWeexInstance();
                if (jSONObject != null) {
                    str2 = jSONObject.toString();
                }
                createWeexInstance.X0("", str, null, str2, null);
                this.mWeexInstance = createWeexInstance;
                this.mScriptUrl = str;
                return;
            }
            ckf.d(wXSDKInstance);
            if (jSONObject != null) {
                str2 = jSONObject.toString();
            }
            wXSDKInstance.refreshInstance(str2);
        }
    }

    @Override // tb.gbe
    public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "errorCode", str);
        jSONObject.put((JSONObject) "message", str2);
        UINode uINode = this.mUiNode;
        if (uINode != null) {
            uINode.fireEvent("exception", jSONObject);
        }
    }

    @Override // tb.gbe
    public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
        } else if (wXSDKInstance != null) {
            Point point = this.mMeasureResult;
            if (point != null) {
                point.x = i;
            }
            if (point != null) {
                point.y = i2;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "isRefresh", "false");
            UINode uINode = this.mUiNode;
            if (uINode != null) {
                uINode.fireEvent(a.EVENT_LOAD, jSONObject);
            }
            View containerView = wXSDKInstance.getContainerView();
            kgw.c(containerView);
            addView(containerView);
            wXSDKInstance.getContainerView().measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
            wXSDKInstance.getContainerView().layout(0, 0, i, i2);
            UINode uINode2 = this.mUiNode;
            if (uINode2 != null) {
                uINode2.notifyEngineRelayout();
            }
        }
    }

    @Override // tb.gbe
    public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
        }
    }

    public final void unMount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b27987", new Object[]{this});
        } else {
            destroyWeexInstance();
        }
    }

    @Override // tb.gbe
    public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
        } else if (wXSDKInstance != null) {
            Point point = this.mMeasureResult;
            if (point != null) {
                point.x = i;
            }
            if (point != null) {
                point.y = i2;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "isRefresh", "true");
            UINode uINode = this.mUiNode;
            if (uINode != null) {
                uINode.fireEvent(a.EVENT_LOAD, jSONObject);
            }
            wXSDKInstance.getContainerView().measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
            wXSDKInstance.getContainerView().layout(0, 0, i, i2);
            UINode uINode2 = this.mUiNode;
            if (uINode2 != null) {
                uINode2.notifyEngineRelayout();
            }
        }
    }
}
