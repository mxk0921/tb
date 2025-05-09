package com.taobao.weex.ui.flat;

import android.text.TextUtils;
import android.view.View;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import com.taobao.weex.common.Destroyable;
import com.taobao.weex.dom.WXAttr;
import com.taobao.weex.dom.WXStyle;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.flat.widget.AndroidViewWidget;
import com.taobao.weex.ui.flat.widget.Widget;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FlatGUIContext implements Destroyable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<WXComponent, WidgetContainer> mWidgetRegistry = new ArrayMap();
    private Map<WXComponent, AndroidViewWidget> mViewWidgetRegistry = new ArrayMap();
    private Map<Widget, WXComponent> widgetToComponent = new ArrayMap();

    static {
        t2o.a(985661722);
        t2o.a(985661561);
    }

    private WXComponent getComponent(Widget widget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXComponent) ipChange.ipc$dispatch("51c36421", new Object[]{this, widget});
        }
        return this.widgetToComponent.get(widget);
    }

    @Override // com.taobao.weex.common.Destroyable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.widgetToComponent.clear();
        for (Map.Entry<WXComponent, AndroidViewWidget> entry : this.mViewWidgetRegistry.entrySet()) {
            entry.getValue().destroy();
        }
        this.mViewWidgetRegistry.clear();
        for (Map.Entry<WXComponent, WidgetContainer> entry2 : this.mWidgetRegistry.entrySet()) {
            entry2.getValue().unmountFlatGUI();
        }
        this.mWidgetRegistry.clear();
    }

    public AndroidViewWidget getAndroidViewWidget(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidViewWidget) ipChange.ipc$dispatch("16fc5014", new Object[]{this, wXComponent});
        }
        return this.mViewWidgetRegistry.get(wXComponent);
    }

    public WidgetContainer getFlatComponentAncestor(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetContainer) ipChange.ipc$dispatch("1042d697", new Object[]{this, wXComponent});
        }
        return this.mWidgetRegistry.get(wXComponent);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View] */
    public View getWidgetContainerView(Widget widget) {
        WidgetContainer flatComponentAncestor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3166fd17", new Object[]{this, widget});
        }
        WXComponent component = getComponent(widget);
        if (component == null || (flatComponentAncestor = getFlatComponentAncestor(component)) == null) {
            return null;
        }
        return flatComponentAncestor.getHostView();
    }

    public boolean isFlatUIEnabled(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("995fd0da", new Object[]{this, wXComponent})).booleanValue();
        }
        return false;
    }

    public boolean promoteToView(WXComponent wXComponent, boolean z, Class<? extends WXComponent<?>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52ec7839", new Object[]{this, wXComponent, new Boolean(z), cls})).booleanValue();
        }
        if (!isFlatUIEnabled(wXComponent) || !cls.equals(wXComponent.getClass()) || TextUtils.equals(wXComponent.getRef(), WXComponent.ROOT)) {
            return true;
        }
        if ((!z || getFlatComponentAncestor(wXComponent) != null) && !checkComponent(wXComponent)) {
            return false;
        }
        return true;
    }

    public void register(WXComponent wXComponent, WidgetContainer widgetContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa7a40b", new Object[]{this, wXComponent, widgetContainer});
        } else if (!(widgetContainer instanceof FlatComponent) || ((FlatComponent) widgetContainer).promoteToView(true)) {
            this.mWidgetRegistry.put(wXComponent, widgetContainer);
        }
    }

    private boolean checkComponent(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a5f04c5", new Object[]{this, wXComponent})).booleanValue();
        }
        if (wXComponent != null) {
            WXStyle styles = wXComponent.getStyles();
            WXAttr attrs = wXComponent.getAttrs();
            if (styles.containsKey("opacity") || styles.containsKey("transform") || styles.containsKey("visibility") || attrs.containsKey("elevation") || attrs.containsKey(Constants.Name.ARIA_HIDDEN) || attrs.containsKey(Constants.Name.ARIA_LABEL) || attrs.containsKey(WXComponent.PROP_FIXED_SIZE) || attrs.containsKey("disabled") || styles.isFixed() || styles.isSticky() || !styles.getPesudoStyles().isEmpty() || wXComponent.getEvents().size() > 0) {
                return true;
            }
        }
        return false;
    }

    public void register(WXComponent wXComponent, AndroidViewWidget androidViewWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c1ddcdb", new Object[]{this, wXComponent, androidViewWidget});
        } else {
            this.mViewWidgetRegistry.put(wXComponent, androidViewWidget);
        }
    }

    public void register(Widget widget, WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1685e823", new Object[]{this, widget, wXComponent});
        } else {
            this.widgetToComponent.put(widget, wXComponent);
        }
    }
}
