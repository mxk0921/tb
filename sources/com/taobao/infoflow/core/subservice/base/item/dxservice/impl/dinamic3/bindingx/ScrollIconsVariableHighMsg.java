package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.bindingx;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import tb.fzo;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ScrollIconsVariableHighMsg extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ICON_SCROLL_SOURCE_ID = "icon_ref";
    private JSONObject mParamJson;

    static {
        t2o.a(486539342);
    }

    public ScrollIconsVariableHighMsg() {
        init();
    }

    public static /* synthetic */ Object ipc$super(ScrollIconsVariableHighMsg scrollIconsVariableHighMsg, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/bindingx/ScrollIconsVariableHighMsg");
    }

    private void setOffSetH(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197683c9", new Object[]{this, new Integer(i)});
        } else {
            this.mParamJson.put("offsetY", (Object) Integer.valueOf(i));
        }
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

    public void postMessage(DinamicXEngine dinamicXEngine, DXRootView dXRootView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb92f60", new Object[]{this, dinamicXEngine, dXRootView, new Integer(i), new Integer(i2)});
        } else if (dXRootView != null) {
            setXOffset(i);
            setOffSetH(i2);
            setWidgetNode(dXRootView.getExpandWidgetNode());
            this.mParamJson.put("action", (Object) fzo.SCROLLING);
            dinamicXEngine.y0(dXRootView, this);
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mParamJson = new JSONObject();
        JSONObject jSONObject = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject.put(pg1.ATOM_EXT_repeat, (Object) String.valueOf(bool));
        Boolean bool2 = Boolean.TRUE;
        jSONObject.put("resetOnExit", (Object) String.valueOf(bool2));
        jSONObject.put("resetOnCancel", (Object) String.valueOf(bool2));
        jSONObject.put("resetOnFinish", (Object) String.valueOf(bool));
        this.mParamJson.put("mode", (Object) "scroll");
        this.mParamJson.put("action", (Object) fzo.SCROLLING);
        this.mParamJson.put(BaseOuterComponent.b.SOURCE_COMPONENT_ID, (Object) ICON_SCROLL_SOURCE_ID);
        this.mParamJson.put("args", (Object) jSONObject);
        this.mParamJson.put("offsetX", (Object) 0);
        this.mParamJson.put("offsetY", (Object) 1);
        put("type", "BNDX");
        put("params", (Object) this.mParamJson);
    }
}
