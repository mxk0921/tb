package com.taobao.message.chatv2.viewcenter;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.inner2.ClassPool;
import com.taobao.message.lab.comfrm.inner2.Plugins;
import com.taobao.message.lab.comfrm.inner2.config.LayoutInfo;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.lab.comfrm.render.WidgetInterface;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RenderServiceImpl implements IRenderService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ViewCenterService";
    private Plugins mPlugins;
    private ViewCenterProps mProps;
    private Map<String, Object> mRenderContext;

    static {
        t2o.a(552599604);
        t2o.a(552599597);
    }

    @Override // com.taobao.message.chatv2.viewcenter.IRenderService
    public WidgetInterface createWidget(Context context, String str, LayoutInfo layoutInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetInterface) ipChange.ipc$dispatch("4d1d5921", new Object[]{this, context, str, layoutInfo});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) layoutInfo.renderTemplate.name);
        jSONObject.put("renderType", (Object) layoutInfo.renderTemplate.renderType);
        jSONObject.put("renderData", (Object) layoutInfo.renderTemplate.renderData);
        ClassPool instance = ClassPool.instance();
        String str2 = layoutInfo.renderTemplate.name;
        ViewCenterProps viewCenterProps = this.mProps;
        WidgetInstance widgetInstance = (WidgetInstance) instance.getInstance(str2, (Class<Object>) WidgetInstance.class, str, true, viewCenterProps == null ? null : viewCenterProps.classNamespace);
        if (widgetInstance != null) {
            widgetInstance.setPlugins(this.mPlugins);
            widgetInstance.setRenderContext(this.mRenderContext);
            View createView = widgetInstance.createView(context, layoutInfo.renderTemplate);
            if (createView != null) {
                createView.setTag(R.id.viewcenterLayoutInfo, layoutInfo);
            }
            widgetInstance.injectView(createView, null);
            return widgetInstance;
        } else if (!ApplicationUtil.isDebug()) {
            TLog.loge(TAG, "not find:" + layoutInfo.renderTemplate.name);
            return null;
        } else {
            throw new IllegalArgumentException("not find:" + layoutInfo.renderTemplate.name);
        }
    }

    @Override // com.taobao.message.chatv2.viewcenter.IRenderService
    public void setPlugin(Plugins plugins) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96463d2c", new Object[]{this, plugins});
        } else {
            this.mPlugins = plugins;
        }
    }

    public void setRenderContext(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("659d34c7", new Object[]{this, map});
        } else {
            this.mRenderContext = map;
        }
    }

    public void setViewCenterProps(ViewCenterProps viewCenterProps) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1037e609", new Object[]{this, viewCenterProps});
        } else {
            this.mProps = viewCenterProps;
        }
    }
}
