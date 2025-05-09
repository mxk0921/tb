package com.taobao.tao.topmultitab.service.view;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import tb.fzo;
import tb.h5b;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TopMultiTabBindingXMsg extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONObject mParamJson;

    static {
        t2o.a(729810399);
    }

    public TopMultiTabBindingXMsg() {
        JSONObject jSONObject = new JSONObject();
        this.mParamJson = jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject2.put(pg1.ATOM_EXT_repeat, (Object) String.valueOf(bool));
        Boolean bool2 = Boolean.TRUE;
        jSONObject2.put("resetOnExit", (Object) String.valueOf(bool2));
        jSONObject2.put("resetOnCancel", (Object) String.valueOf(bool2));
        jSONObject2.put("resetOnFinish", (Object) String.valueOf(bool));
        jSONObject.put("mode", (Object) "scroll");
        jSONObject.put("action", (Object) fzo.SCROLLING);
        jSONObject.put(BaseOuterComponent.b.SOURCE_COMPONENT_ID, (Object) "home_scroll_tab");
        jSONObject.put("args", (Object) jSONObject2);
        jSONObject.put("offsetX", (Object) 0);
        jSONObject.put("offsetY", (Object) 1);
        put("type", "BNDX");
        put("params", (Object) jSONObject);
    }

    public static /* synthetic */ Object ipc$super(TopMultiTabBindingXMsg topMultiTabBindingXMsg, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/view/TopMultiTabBindingXMsg");
    }

    private void setWidgetNode(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d421aa20", new Object[]{this, dXWidgetNode});
        } else {
            this.mParamJson.put("widget", (Object) dXWidgetNode);
        }
    }

    private void setXOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df25b893", new Object[]{this, new Integer(i)});
        } else {
            this.mParamJson.put("offsetX", (Object) Integer.valueOf(i));
        }
    }

    public void postMessage(DXRootView dXRootView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f21f0914", new Object[]{this, dXRootView, new Integer(i)});
        } else if (dXRootView != null) {
            setXOffset(i);
            setWidgetNode(dXRootView.getExpandWidgetNode());
            this.mParamJson.put("action", (Object) fzo.SCROLLING);
            h5b.e().d().y0(dXRootView, this);
        }
    }

    public void postMessageEnd(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c14b051c", new Object[]{this, dXRootView});
        } else if (dXRootView != null) {
            setWidgetNode(dXRootView.getExpandWidgetNode());
            this.mParamJson.put("action", (Object) "scroll_end");
            h5b.e().d().y0(dXRootView, this);
        }
    }
}
