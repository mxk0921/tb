package com.taobao.weex.ui.component.basic;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.dom.CSSShorthand;
import com.taobao.weex.dom.WXAttr;
import com.taobao.weex.dom.WXEvent;
import com.taobao.weex.dom.WXStyle;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.action.GraphicPosition;
import com.taobao.weex.ui.action.GraphicSize;
import com.taobao.weex.ui.component.WXComponent;
import java.util.Map;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class WXBasicComponent<T extends View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BasicComponentData mBasicComponentData;
    private String mComponentType;
    private Object mExtra;
    private boolean mIsLayoutRTL;
    private GraphicPosition mLayoutPosition;
    private GraphicSize mLayoutSize;
    private String mRef;
    private int mViewPortWidth = 750;

    static {
        t2o.a(985661711);
    }

    public WXBasicComponent(BasicComponentData basicComponentData) {
        this.mBasicComponentData = basicComponentData;
        this.mRef = basicComponentData.mRef;
        this.mComponentType = basicComponentData.mComponentType;
    }

    public final void addAttr(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35368ac", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            this.mBasicComponentData.addAttr(map);
        }
    }

    public final void addEvent(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44fa683f", new Object[]{this, set});
        } else if (set != null && !set.isEmpty()) {
            this.mBasicComponentData.addEvent(set);
        }
    }

    public final void addShorthand(Map<String, String> map) {
        BasicComponentData basicComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b57c94", new Object[]{this, map});
        } else if (!map.isEmpty() && (basicComponentData = this.mBasicComponentData) != null) {
            basicComponentData.addShorthand(map);
        }
    }

    public final void addStyle(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44fadc8e", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            this.mBasicComponentData.addStyle(map);
        }
    }

    public void bindComponent(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b390dec", new Object[]{this, wXComponent});
            return;
        }
        this.mComponentType = wXComponent.getComponentType();
        this.mRef = wXComponent.getRef();
    }

    public final WXAttr getAttrs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXAttr) ipChange.ipc$dispatch("e2b4aa58", new Object[]{this});
        }
        return this.mBasicComponentData.getAttrs();
    }

    public BasicComponentData getBasicComponentData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasicComponentData) ipChange.ipc$dispatch("61ce693d", new Object[]{this});
        }
        return this.mBasicComponentData;
    }

    public CSSShorthand getBorder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CSSShorthand) ipChange.ipc$dispatch("902d3b8c", new Object[]{this});
        }
        return this.mBasicComponentData.getBorder();
    }

    public float getCSSLayoutBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cfb4d9", new Object[]{this})).floatValue();
        }
        GraphicPosition graphicPosition = this.mLayoutPosition;
        if (graphicPosition == null) {
            return 0.0f;
        }
        return graphicPosition.getBottom();
    }

    public float getCSSLayoutLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7b9ee75", new Object[]{this})).floatValue();
        }
        GraphicPosition graphicPosition = this.mLayoutPosition;
        if (graphicPosition == null) {
            return 0.0f;
        }
        return graphicPosition.getLeft();
    }

    public float getCSSLayoutRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8cec61fc", new Object[]{this})).floatValue();
        }
        GraphicPosition graphicPosition = this.mLayoutPosition;
        if (graphicPosition == null) {
            return 0.0f;
        }
        return graphicPosition.getRight();
    }

    public float getCSSLayoutTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39f762f5", new Object[]{this})).floatValue();
        }
        GraphicPosition graphicPosition = this.mLayoutPosition;
        if (graphicPosition == null) {
            return 0.0f;
        }
        return graphicPosition.getTop();
    }

    public String getComponentType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533be778", new Object[]{this});
        }
        return this.mComponentType;
    }

    public final WXEvent getEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXEvent) ipChange.ipc$dispatch("9d1805d6", new Object[]{this});
        }
        return this.mBasicComponentData.getEvents();
    }

    public Object getExtra() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("88ef371", new Object[]{this});
        }
        return this.mExtra;
    }

    public float getLayoutHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d58ffc5e", new Object[]{this})).floatValue();
        }
        GraphicSize graphicSize = this.mLayoutSize;
        if (graphicSize == null) {
            return 0.0f;
        }
        return graphicSize.getHeight();
    }

    public GraphicPosition getLayoutPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GraphicPosition) ipChange.ipc$dispatch("d075aca9", new Object[]{this});
        }
        if (this.mLayoutPosition == null) {
            this.mLayoutPosition = new GraphicPosition(0.0f, 0.0f, 0.0f, 0.0f);
        }
        return this.mLayoutPosition;
    }

    public GraphicSize getLayoutSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GraphicSize) ipChange.ipc$dispatch("ad586d29", new Object[]{this});
        }
        if (this.mLayoutSize == null) {
            this.mLayoutSize = new GraphicSize(0.0f, 0.0f);
        }
        return this.mLayoutSize;
    }

    public float getLayoutWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a60b44fd", new Object[]{this})).floatValue();
        }
        GraphicSize graphicSize = this.mLayoutSize;
        if (graphicSize == null) {
            return 0.0f;
        }
        return graphicSize.getWidth();
    }

    public final CSSShorthand getMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CSSShorthand) ipChange.ipc$dispatch("a687534a", new Object[]{this});
        }
        return this.mBasicComponentData.getMargin();
    }

    public final CSSShorthand getPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CSSShorthand) ipChange.ipc$dispatch("5e728a73", new Object[]{this});
        }
        return this.mBasicComponentData.getPadding();
    }

    public String getRef() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fee331bc", new Object[]{this});
        }
        return this.mRef;
    }

    public final WXStyle getStyles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXStyle) ipChange.ipc$dispatch("92801168", new Object[]{this});
        }
        return this.mBasicComponentData.getStyles();
    }

    public int getViewPortWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca639864", new Object[]{this})).intValue();
        }
        return this.mViewPortWidth;
    }

    public boolean isLayoutRTL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b16fe661", new Object[]{this})).booleanValue();
        }
        return this.mIsLayoutRTL;
    }

    public final void setBorders(CSSShorthand cSSShorthand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50d6a10b", new Object[]{this, cSSShorthand});
        } else {
            this.mBasicComponentData.setBorders(cSSShorthand);
        }
    }

    public void setIsLayoutRTL(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8629499", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsLayoutRTL = z;
        }
    }

    public void setLayoutPosition(GraphicPosition graphicPosition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70c800d", new Object[]{this, graphicPosition});
        } else {
            this.mLayoutPosition = graphicPosition;
        }
    }

    public void setLayoutSize(GraphicSize graphicSize) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c627d5d", new Object[]{this, graphicSize});
        } else {
            this.mLayoutSize = graphicSize;
        }
    }

    public final void setMargins(CSSShorthand cSSShorthand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3909c149", new Object[]{this, cSSShorthand});
        } else {
            this.mBasicComponentData.setMargins(cSSShorthand);
        }
    }

    public final void setPaddings(CSSShorthand cSSShorthand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f773ca", new Object[]{this, cSSShorthand});
        } else {
            this.mBasicComponentData.setPaddings(cSSShorthand);
        }
    }

    public void setViewPortWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("193b6abe", new Object[]{this, new Integer(i)});
        } else {
            this.mViewPortWidth = i;
        }
    }

    public void updateExtra(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552da22a", new Object[]{this, obj});
        } else {
            this.mExtra = obj;
        }
    }

    public final void updateStyle(Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6fa4de", new Object[]{this, map, new Boolean(z)});
        } else if (map != null && !map.isEmpty()) {
            this.mBasicComponentData.getStyles().updateStyle(map, z);
        }
    }

    public final void addStyle(Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a616806", new Object[]{this, map, new Boolean(z)});
        } else if (map != null && !map.isEmpty()) {
            this.mBasicComponentData.addStyle(map, z);
        }
    }
}
