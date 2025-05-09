package com.taobao.weex.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.dom.CSSConstants;
import com.taobao.weex.dom.CSSShorthand;
import com.taobao.weex.ui.component.WXComponent;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXDomUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(985661815);
    }

    public static float getContentHeight(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3d6ee66", new Object[]{wXComponent})).floatValue();
        }
        float layoutHeight = wXComponent.getLayoutHeight();
        CSSShorthand padding = wXComponent.getPadding();
        CSSShorthand border = wXComponent.getBorder();
        CSSShorthand.EDGE edge = CSSShorthand.EDGE.TOP;
        float f = padding.get(edge);
        if (!CSSConstants.isUndefined(f)) {
            layoutHeight -= f;
        }
        CSSShorthand.EDGE edge2 = CSSShorthand.EDGE.BOTTOM;
        float f2 = padding.get(edge2);
        if (!CSSConstants.isUndefined(f2)) {
            layoutHeight -= f2;
        }
        float f3 = border.get(edge);
        if (!CSSConstants.isUndefined(f3)) {
            layoutHeight -= f3;
        }
        float f4 = border.get(edge2);
        if (!CSSConstants.isUndefined(f4)) {
            return layoutHeight - f4;
        }
        return layoutHeight;
    }

    public static float getContentWidth(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("825f29f", new Object[]{wXComponent})).floatValue();
        }
        float layoutWidth = wXComponent.getLayoutWidth();
        CSSShorthand padding = wXComponent.getPadding();
        CSSShorthand border = wXComponent.getBorder();
        CSSShorthand.EDGE edge = CSSShorthand.EDGE.LEFT;
        float f = padding.get(edge);
        if (!CSSConstants.isUndefined(f)) {
            layoutWidth -= f;
        }
        CSSShorthand.EDGE edge2 = CSSShorthand.EDGE.RIGHT;
        float f2 = padding.get(edge2);
        if (!CSSConstants.isUndefined(f2)) {
            layoutWidth -= f2;
        }
        float f3 = border.get(edge);
        if (!CSSConstants.isUndefined(f3)) {
            layoutWidth -= f3;
        }
        float f4 = border.get(edge2);
        return !CSSConstants.isUndefined(f4) ? layoutWidth - f4 : layoutWidth;
    }

    public static float getContentWidth(CSSShorthand cSSShorthand, CSSShorthand cSSShorthand2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f9f9528", new Object[]{cSSShorthand, cSSShorthand2, new Float(f)})).floatValue();
        }
        CSSShorthand.EDGE edge = CSSShorthand.EDGE.LEFT;
        float f2 = cSSShorthand.get(edge);
        if (!CSSConstants.isUndefined(f2)) {
            f -= f2;
        }
        CSSShorthand.EDGE edge2 = CSSShorthand.EDGE.RIGHT;
        float f3 = cSSShorthand.get(edge2);
        if (!CSSConstants.isUndefined(f3)) {
            f -= f3;
        }
        float f4 = cSSShorthand2.get(edge);
        if (!CSSConstants.isUndefined(f4)) {
            f -= f4;
        }
        float f5 = cSSShorthand2.get(edge2);
        return !CSSConstants.isUndefined(f5) ? f - f5 : f;
    }
}
