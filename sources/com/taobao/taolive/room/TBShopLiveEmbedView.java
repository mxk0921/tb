package com.taobao.taolive.room;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.app.api.point.app.AppResumePoint;
import com.alibaba.ariver.app.api.point.app.AppStartPoint;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import java.util.Map;
import tb.cwd;
import tb.fkx;
import tb.t2o;
import tb.v2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBShopLiveEmbedView extends BaseEmbedView implements AppResumePoint, AppStartPoint, AppDestroyPoint {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int H5EmbedVersion = 1;
    private static final String TAG = TBShopLiveEmbedView.class.getSimpleName();
    public static final String TYPE = "tbliveroom";
    private FrameLayout mRootView;

    static {
        t2o.a(779092749);
    }

    public static /* synthetic */ Object ipc$super(TBShopLiveEmbedView tBShopLiveEmbedView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 1664325763) {
            super.onCreate((Map) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/room/TBShopLiveEmbedView");
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public Bitmap getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a92c69f", new Object[]{this});
        }
        v2s.o().A().c(TAG, "getSnapshot");
        return null;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        v2s.o().A().c(TAG, NetworkAbility.API_GET_TYPE);
        return TYPE;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public View getView(int i, int i2, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        cwd A = v2s.o().A();
        String str3 = TAG;
        A.c(str3, "getView " + fkx.i(map));
        Activity activity = this.mOuterPage.getPageContext().getActivity();
        if (activity == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.mRootView = frameLayout;
        return frameLayout;
    }

    @Override // com.alibaba.ariver.app.api.point.app.AppDestroyPoint
    public void onAppDestroy(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ffc9373", new Object[]{this, app});
        } else {
            v2s.o().A().c(TAG, "onAppDestroy");
        }
    }

    @Override // com.alibaba.ariver.app.api.point.app.AppResumePoint
    public void onAppResume(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af37acaa", new Object[]{this, app});
        } else {
            v2s.o().A().c(TAG, "onAppResume");
        }
    }

    @Override // com.alibaba.ariver.app.api.point.app.AppStartPoint
    public void onAppStart(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a9c35b", new Object[]{this, app});
        } else {
            v2s.o().A().c(TAG, "onAppStart");
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
        } else {
            v2s.o().A().c(TAG, "onAttachedToWebView");
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63339883", new Object[]{this, map});
        } else {
            super.onCreate(map);
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDetachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850d0fb4", new Object[]{this});
        } else {
            v2s.o().A().c(TAG, "onDetachedToWebView");
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onEmbedViewVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c81239", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        } else {
            v2s.o().A().c(TAG, "onFinalized");
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        } else {
            v2s.o().A().c(TAG, "onInitialized");
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onParamChanged(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedMessage(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231420a4", new Object[]{this, str, jSONObject, bridgeCallback});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa2a2d", new Object[]{this, new Integer(i), strArr, iArr});
        } else {
            v2s.o().A().c(TAG, "onRequestPermissionResult");
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457ef63", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
        }
    }
}
