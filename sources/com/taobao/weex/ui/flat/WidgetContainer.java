package com.taobao.weex.ui.flat;

import android.util.Pair;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import com.taobao.weex.ui.flat.widget.AndroidViewWidget;
import com.taobao.weex.ui.flat.widget.Widget;
import java.util.LinkedList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class WidgetContainer<T extends ViewGroup> extends WXVContainer<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<Widget> widgets;

    static {
        t2o.a(985661723);
    }

    public WidgetContainer(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
    }

    private void addFlatChild(Widget widget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4346e64", new Object[]{this, widget, new Integer(i)});
            return;
        }
        if (this.widgets == null) {
            this.widgets = new LinkedList();
        }
        if (i >= this.widgets.size()) {
            this.widgets.add(widget);
        } else {
            this.widgets.add(i, widget);
        }
        mountFlatGUI();
    }

    public static /* synthetic */ Object ipc$super(WidgetContainer widgetContainer, String str, Object... objArr) {
        if (str.hashCode() == -588170492) {
            super.createChildViewAt(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/flat/WidgetContainer");
    }

    @Override // com.taobao.weex.ui.component.WXVContainer
    public void createChildViewAt(int i) {
        AndroidViewWidget androidViewWidget;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf13b04", new Object[]{this, new Integer(i)});
        } else if (intendToBeFlatContainer()) {
            Pair<WXComponent, Integer> rearrangeIndexAndGetChild = rearrangeIndexAndGetChild(i);
            Object obj = rearrangeIndexAndGetChild.first;
            if (obj != null) {
                WXComponent wXComponent = (WXComponent) obj;
                FlatGUIContext J = getInstance().J();
                WidgetContainer<T> flatComponentAncestor = J.getFlatComponentAncestor(this);
                if (flatComponentAncestor == null || J.getAndroidViewWidget(this) != null) {
                    flatComponentAncestor = this;
                }
                J.register(wXComponent, flatComponentAncestor);
                if (wXComponent instanceof FlatComponent) {
                    FlatComponent flatComponent = (FlatComponent) wXComponent;
                    if (!flatComponent.promoteToView(false)) {
                        androidViewWidget = flatComponent.getOrCreateFlatWidget();
                        J.register(androidViewWidget, wXComponent);
                        addFlatChild(androidViewWidget, ((Integer) rearrangeIndexAndGetChild.second).intValue());
                    }
                }
                AndroidViewWidget androidViewWidget2 = new AndroidViewWidget(J);
                J.register(wXComponent, androidViewWidget2);
                wXComponent.createView();
                androidViewWidget2.setContentView(wXComponent.getHostView());
                flatComponentAncestor.addSubView(wXComponent.getHostView(), -1);
                androidViewWidget = androidViewWidget2;
                J.register(androidViewWidget, wXComponent);
                addFlatChild(androidViewWidget, ((Integer) rearrangeIndexAndGetChild.second).intValue());
            }
        } else {
            super.createChildViewAt(i);
        }
    }

    public boolean intendToBeFlatContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73ef49e9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract void mountFlatGUI();

    public abstract void unmountFlatGUI();
}
