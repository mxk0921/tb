package com.alibaba.android.umf.node.service.parse.state;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.AutoUt;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.ComponentView;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RenderComponent implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_POPUP_WINDOW = "popup_window";
    public AutoUt autoUt;
    public Component component;
    public ComponentView componentView;
    public String key;

    static {
        t2o.a(80740717);
    }

    public RenderComponent() {
        this.component = new Component();
        this.componentView = new ComponentView();
        this.component = new Component();
        this.componentView = new ComponentView();
    }

    public AutoUt getAutoUt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoUt) ipChange.ipc$dispatch("ae1f3fc6", new Object[]{this});
        }
        return this.autoUt;
    }

    public Component getComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("e1577502", new Object[]{this});
        }
        if (this.component == null) {
            this.component = new Component();
        }
        return this.component;
    }

    public ComponentView getComponentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentView) ipChange.ipc$dispatch("289935b8", new Object[]{this});
        }
        if (this.componentView == null) {
            this.componentView = new ComponentView();
        }
        return this.componentView;
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.key;
    }

    public void setAutoUt(AutoUt autoUt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bedb3994", new Object[]{this, autoUt});
        } else {
            this.autoUt = autoUt;
        }
    }

    public RenderComponent clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderComponent) ipChange.ipc$dispatch("2a61cc99", new Object[]{this});
        }
        RenderComponent renderComponent = (RenderComponent) super.clone();
        Component component = this.component;
        if (component != null) {
            renderComponent.component = component.clone();
        }
        ComponentView componentView = this.componentView;
        if (componentView != null) {
            renderComponent.componentView = (ComponentView) componentView.clone();
        }
        AutoUt autoUt = this.autoUt;
        if (autoUt != null) {
            renderComponent.autoUt = autoUt.clone();
        }
        return renderComponent;
    }

    public boolean isPopupWindowNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("971217df", new Object[]{this})).booleanValue();
        }
        ComponentView componentView = this.componentView;
        return componentView != null && "layout".equals(componentView.getContainerType()) && KEY_POPUP_WINDOW.equals(this.componentView.getName());
    }

    public RenderComponent(String str, Component component, ComponentView componentView) {
        this.component = new Component();
        this.componentView = new ComponentView();
        this.key = str;
        if (component != null) {
            this.component = component;
        }
        if (componentView != null) {
            this.componentView = componentView;
        }
    }
}
