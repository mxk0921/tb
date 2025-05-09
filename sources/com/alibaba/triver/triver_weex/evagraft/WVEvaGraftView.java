package com.alibaba.triver.triver_weex.evagraft;

import android.content.Context;
import android.taobao.windvane.embed.BaseEmbedView;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;
import com.uc.webview.export.extension.EmbedViewConfig;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WVEvaGraftView extends BaseEmbedView implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RenderContainer mRenderContainer;
    private WXSDKInstance mInstance = null;
    private String mUrl = "https://market.m.taobao.com/app/taskhub/graftview-mission-cd/home?wh_weex=true";

    private void initParams() {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        EmbedViewConfig embedViewConfig = this.params;
        if (embedViewConfig != null && (map = embedViewConfig.mObjectParam) != null && map.get("debugUrl") != null) {
            this.mUrl = this.params.mObjectParam.get("debugUrl").toString();
        }
    }

    public static /* synthetic */ Object ipc$super(WVEvaGraftView wVEvaGraftView, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_weex/evagraft/WVEvaGraftView");
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        initParams();
        RenderContainer renderContainer = new RenderContainer(context);
        this.mRenderContainer = renderContainer;
        renderContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WXSDKInstance wXSDKInstance = new WXSDKInstance(context);
        this.mInstance = wXSDKInstance;
        wXSDKInstance.setRenderContainer(this.mRenderContainer);
        this.mInstance.setUseSandBox(true);
        this.mInstance.y1(true);
        this.mInstance.a1(this.mUrl);
        HashMap hashMap = new HashMap();
        hashMap.put("bundleUrl", this.mUrl);
        this.mInstance.X0("EvaGraftView", this.mUrl, hashMap, "", WXRenderStrategy.APPEND_ASYNC);
        return this.mRenderContainer;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        return "evagraftview";
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        WXSDKInstance wXSDKInstance = this.mInstance;
        if (wXSDKInstance != null) {
            wXSDKInstance.destroy();
        }
    }
}
