package com.alibaba.ariver.integration.embedview;

import android.view.Surface;
import android.webkit.ValueCallback;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.hib;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class BaseEmbedView implements IEmbedView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public hib mEmbedViewProxy;
    public App mOuterApp;
    public Page mOuterPage;
    public String mViewId;

    public Page getOuterPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Page) ipChange.ipc$dispatch("dafe6c17", new Object[]{this});
        }
        return this.mOuterPage;
    }

    public Resource getResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resource) ipChange.ipc$dispatch("e7aadc39", new Object[]{this, str});
        }
        hib hibVar = this.mEmbedViewProxy;
        if (hibVar != null) {
            return hibVar.getResource(str);
        }
        return null;
    }

    public String getViewId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b88d723", new Object[]{this});
        }
        return this.mViewId;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        try {
            this.mEmbedViewProxy = (hib) Class.forName("com.alibaba.ariver.integration.embedview.BaseEmbedViewImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            RVLogger.e("BaseEmbedView", th);
        }
        hib hibVar = this.mEmbedViewProxy;
        if (hibVar == null) {
            RVLogger.e("BaseEmbedView", "get Null BaseEmbedImpl!");
            return;
        }
        try {
            hibVar.onCreate(map);
            Page outerPage = this.mEmbedViewProxy.getOuterPage();
            this.mOuterPage = outerPage;
            if (outerPage != null) {
                this.mOuterApp = outerPage.getApp();
            }
            this.mViewId = this.mEmbedViewProxy.getViewId();
        } catch (Throwable th2) {
            RVLogger.e("BaseEmbedView", th2);
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mOuterPage = null;
        hib hibVar = this.mEmbedViewProxy;
        if (hibVar != null) {
            hibVar.onDestroy();
        }
    }

    public void onEmbedViewSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6967c1b", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onParamChanged(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
            return;
        }
        hib hibVar = this.mEmbedViewProxy;
        if (hibVar != null) {
            hibVar.onParamChanged(strArr, strArr2);
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onSurfaceAvailable(Surface surface, int i, int i2, ValueCallback<Integer> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a22c14", new Object[]{this, surface, new Integer(i), new Integer(i2), valueCallback});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public boolean onSurfaceDestroyed(Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab668b42", new Object[]{this, surface})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onSurfaceSizeChanged(Surface surface, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f22df8", new Object[]{this, surface, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void sendEvent(String str, JSONObject jSONObject, IEmbedCallback iEmbedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b74017", new Object[]{this, str, jSONObject, iEmbedCallback});
            return;
        }
        hib hibVar = this.mEmbedViewProxy;
        if (hibVar != null) {
            hibVar.sendEvent(getType(), str, jSONObject, iEmbedCallback);
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void triggerPreSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43893db6", new Object[]{this});
        }
    }
}
