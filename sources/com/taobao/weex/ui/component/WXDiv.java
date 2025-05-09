package com.taobao.weex.ui.component;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.Component;
import com.taobao.weex.ui.ComponentCreator;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.flat.FlatComponent;
import com.taobao.weex.ui.flat.WidgetContainer;
import com.taobao.weex.ui.flat.widget.WidgetGroup;
import com.taobao.weex.ui.view.WXFrameLayout;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import tb.t2o;

/* compiled from: Taobao */
@Component(lazyload = false)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXDiv extends WidgetContainer<WXFrameLayout> implements FlatComponent<WidgetGroup> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WidgetGroup mWidgetGroup;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Ceator implements ComponentCreator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(985661701);
            t2o.a(985661647);
        }

        @Override // com.taobao.weex.ui.ComponentCreator
        public WXComponent createInstance(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) throws IllegalAccessException, InvocationTargetException, InstantiationException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WXComponent) ipChange.ipc$dispatch("a264c511", new Object[]{this, wXSDKInstance, wXVContainer, basicComponentData});
            }
            return new WXDiv(wXSDKInstance, wXVContainer, basicComponentData);
        }
    }

    static {
        t2o.a(985661700);
        t2o.a(985661721);
    }

    @Deprecated
    public WXDiv(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, String str, boolean z, BasicComponentData basicComponentData) {
        this(wXSDKInstance, wXVContainer, basicComponentData);
    }

    public static /* synthetic */ Object ipc$super(WXDiv wXDiv, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/component/WXDiv");
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public boolean isVirtualComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1960fe07", new Object[]{this})).booleanValue();
        }
        return true ^ promoteToView(true);
    }

    @Override // com.taobao.weex.ui.flat.WidgetContainer
    public void mountFlatGUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae2fcb0", new Object[]{this});
            return;
        }
        if (this.widgets == null) {
            this.widgets = new LinkedList();
        }
        if (!promoteToView(true)) {
            this.mWidgetGroup.replaceAll(this.widgets);
        } else if (getHostView() != 0) {
            ((WXFrameLayout) getHostView()).mountFlatGUI(this.widgets);
        }
    }

    @Override // com.taobao.weex.ui.flat.FlatComponent
    public boolean promoteToView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5800f91", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (getInstance().J() == null) {
            return false;
        }
        if (!intendToBeFlatContainer() || getInstance().J().promoteToView(this, z, WXDiv.class)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.weex.ui.flat.WidgetContainer
    public void unmountFlatGUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa8cb949", new Object[]{this});
        } else if (getHostView() != 0) {
            ((WXFrameLayout) getHostView()).unmountFlatGUI();
        }
    }

    public WXDiv(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
    }

    @Override // com.taobao.weex.ui.flat.FlatComponent
    public WidgetGroup getOrCreateFlatWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetGroup) ipChange.ipc$dispatch("566769a6", new Object[]{this});
        }
        if (this.mWidgetGroup == null) {
            this.mWidgetGroup = new WidgetGroup(getInstance().J());
            for (int i = 0; i < getChildCount(); i++) {
                createChildViewAt(i);
            }
            mountFlatGUI();
        }
        return this.mWidgetGroup;
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public WXFrameLayout initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXFrameLayout) ipChange.ipc$dispatch("243cce4c", new Object[]{this, context});
        }
        WXFrameLayout wXFrameLayout = new WXFrameLayout(context);
        wXFrameLayout.holdComponent(this);
        return wXFrameLayout;
    }

    @Override // com.taobao.weex.ui.flat.WidgetContainer
    public boolean intendToBeFlatContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73ef49e9", new Object[]{this})).booleanValue();
        }
        try {
            if (getInstance().J().isFlatUIEnabled(this)) {
                return WXDiv.class.equals(getClass());
            }
            return false;
        } catch (Throwable th) {
            WXLogUtils.e("weex1", th);
            return false;
        }
    }
}
