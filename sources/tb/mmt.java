package tb;

import android.content.Context;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.widget.FontDO;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.richtext.RichText;
import com.taobao.weex.common.Constants;
import tb.pu9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mmt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_CLICK_SPAN = "clickSpan";
    public static final String ATTR_IMAGE_SPAN = "imageSpan";
    public static final int DEFAULT_COLOR = -16777216;
    public static final String DEFAULT_ELLIPSIS_POSITION = "end";
    public static final int DEFAULT_FONT_SIZE = Math.round(fxh.a(32.0f));
    public static final int DEFAULT_FONT_STYLE = tkt.TEXT_STYLE;
    public static final int DEFAULT_FONT_WEIGHT = 0;
    public static final float DEFAULT_LINE_HEIGHT = Float.MAX_VALUE;
    public static final String DEFAULT_TEXT_ALIGN = "left";
    public static final String DEFAULT_TEXT_OVERFLOW = "clip";
    public static final String EXTRA_FONT_FACE = "fontFace";
    public static final String EXTRA_LAYOUT = "textLayout";
    public static final int WORD_BREAK_ALL = 2;
    public static final int WORD_BREAK_NONE = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements pu9.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UINode f24152a;

        public a(UINode uINode) {
            this.f24152a = uINode;
        }

        @Override // tb.pu9.f
        public void a(FontDO fontDO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fff9633", new Object[]{this, fontDO});
            } else if (TextUtils.equals((String) this.f24152a.getAttribute("fontFamily"), fontDO.b()) && fontDO.e() != null) {
                this.f24152a.notifyEngineRelayout();
            }
        }
    }

    static {
        t2o.a(986710273);
    }

    public static void a(UINode uINode, egl<hlt> eglVar, egl<pu9.f> eglVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cfa5a6", new Object[]{uINode, eglVar, eglVar2});
            return;
        }
        eglVar.c(new hlt(uINode));
        eglVar2.c(new a(uINode));
    }

    public static wkt b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wkt) ipChange.ipc$dispatch("8c9be4e5", new Object[]{context});
        }
        return new wkt();
    }

    public static void c(UINode uINode, int i, int i2, int i3, int i4, int[] iArr, hlt hltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b60ad95", new Object[]{uINode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr, hltVar});
            return;
        }
        x(uINode);
        hltVar.k(uINode instanceof RichText, i, i2, i3, i4, iArr, ((Integer) uINode.getAttribute(pg1.ATOM_EXT_wordBreak)).intValue(), uINode);
    }

    public static void e(UINode uINode, MUSDKInstance mUSDKInstance, wkt wktVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47068b", new Object[]{uINode, mUSDKInstance, wktVar});
        } else {
            wktVar.J();
        }
    }

    public static void f(UINode uINode, int i, int i2, int i3, int i4, hlt hltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baed93d4", new Object[]{uINode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), hltVar});
            return;
        }
        x(uINode);
        hltVar.l(uINode instanceof RichText, i, i2, i3, i4, ((Integer) uINode.getAttribute(pg1.ATOM_EXT_wordBreak)).intValue(), uINode);
    }

    public static void g(UINode uINode, wkt wktVar, CharSequence charSequence, hlt hltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfc5b7", new Object[]{uINode, wktVar, charSequence, hltVar});
        } else {
            d(uINode, uINode.getInstance(), wktVar, hltVar);
        }
    }

    public static void h(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e1b32a", new Object[]{uINode, str});
        } else if (TextUtils.isEmpty(str)) {
            uINode.setAttribute("color", -16777216);
        } else {
            uINode.setAttribute("color", Integer.valueOf(cxh.c(str)));
        }
    }

    public static void i(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("add4664f", new Object[]{uINode, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "end";
        }
        uINode.setAttribute("ellipsisPosition", str);
    }

    public static void j(UINode uINode, String str, pu9.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3acfbf4e", new Object[]{uINode, str, fVar});
            return;
        }
        String str2 = (String) uINode.getAttribute("fontFamily");
        if (!TextUtils.isEmpty(str2)) {
            pu9.g().n(str2, fVar);
        }
        if (!TextUtils.isEmpty(str)) {
            pu9.g().m(str, fVar);
        }
        uINode.setAttribute("fontFamily", str);
    }

    public static void k(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22fbbdb9", new Object[]{uINode, str});
        } else if (TextUtils.isEmpty(str)) {
            uINode.setAttribute("fontSize", Float.valueOf(32.0f));
        } else {
            uINode.setAttribute("fontSize", Integer.valueOf(Math.round(fxh.a(fxh.h(str, uINode.getInstance().getRpxPerRem())))));
        }
    }

    public static void l(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("859d6b0b", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("fontStyle", Integer.valueOf(rmt.b(str)));
        }
    }

    public static void m(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c9108a2", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("fontWeight", Integer.valueOf(rmt.e(str)));
        }
    }

    public static void o(UINode uINode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2133ac3f", new Object[]{uINode, new Integer(i)});
        } else {
            uINode.setAttribute(Constants.Name.LINES, Integer.valueOf(i));
        }
    }

    public static void p(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f993d4dc", new Object[]{uINode, str});
            return;
        }
        uINode.setAttribute("value", str);
        uINode.setExtra(Constants.Name.ARIA_LABEL, str);
        uINode.setAttribute(hlt.BREAK_VALUE, "");
    }

    public static void q(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aadc115", new Object[]{uINode, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        uINode.setAttribute(Constants.Name.TEXT_ALIGN, str);
    }

    public static void r(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b24e8ccc", new Object[]{uINode, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        uINode.setAttribute("textDecoration", str);
    }

    public static void s(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dadb3f7a", new Object[]{uINode, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        uINode.setAttribute("textOverflow", str);
    }

    public static void t(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ff0a72c", new Object[]{uINode, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "normal";
        }
        uINode.setAttribute(pg1.ATOM_EXT_whiteSpace, str);
    }

    public static void v(UINode uINode, wkt wktVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("966f9f5", new Object[]{uINode, wktVar, str, obj});
        } else if (wktVar != null && TextUtils.equals(str, EXTRA_LAYOUT)) {
            w(uINode);
            wktVar.C((Layout) obj);
        }
    }

    public static void x(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d008e341", new Object[]{uINode});
        } else if (Build.VERSION.SDK_INT < 28) {
            uINode.setExtra("fontFace", ult.h().i((String) uINode.getAttribute("fontFamily"), ((Integer) uINode.getAttribute("fontStyle")).intValue(), ((Integer) uINode.getAttribute("fontWeight")).intValue()));
        } else {
            uINode.setExtra("fontFace", rmt.c(((Integer) uINode.getAttribute("fontStyle")).intValue(), ((Integer) uINode.getAttribute("fontWeight")).intValue(), (String) uINode.getAttribute("fontFamily")));
        }
    }

    public static void n(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a7e771", new Object[]{uINode, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            uINode.setAttribute("lineHeight", Float.valueOf(Float.MAX_VALUE));
        } else if (mUSValue.isInt() || mUSValue.isFloat()) {
            uINode.setAttribute("lineHeight", Float.valueOf(-mUSValue.convertToFloat()));
        } else if (mUSValue.isString()) {
            String stringValue = mUSValue.getStringValue();
            if (stringValue.length() <= 0 || !(stringValue.charAt(stringValue.length() - 1) == 'x' || stringValue.charAt(stringValue.length() - 1) == 'm')) {
                uINode.setAttribute("lineHeight", Float.valueOf(-Float.parseFloat(stringValue)));
            } else {
                uINode.setAttribute("lineHeight", Float.valueOf(Math.round(fxh.f(stringValue, uINode.getInstance().getRpxPerRem())) * 1.0f));
            }
        }
    }

    public static void d(UINode uINode, MUSDKInstance mUSDKInstance, wkt wktVar, hlt hltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c351589", new Object[]{uINode, mUSDKInstance, wktVar, hltVar});
            return;
        }
        w(uINode);
        wktVar.z((CharSequence) uINode.getAttribute("value"), (Layout) uINode.getExtra(EXTRA_LAYOUT), tkt.TEXT_COLOR_STATE_LIST, hltVar.d(), 0, (ClickableSpan[]) uINode.getAttribute(ATTR_CLICK_SPAN), (ImageSpan[]) uINode.getAttribute(ATTR_IMAGE_SPAN), null, null, -1, -1, 0.0f, vbm.TYPE_TEXT);
    }

    public static void u(UINode uINode, String str) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33808b38", new Object[]{uINode, str});
            return;
        }
        if (TextUtils.equals(str, pg1.ATOM_EXT_UDL_break_all)) {
            i = 2;
        }
        uINode.setAttribute(pg1.ATOM_EXT_wordBreak, Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void w(com.taobao.android.weex_uikit.ui.UINode r6) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.mmt.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "dd1056bb"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            java.lang.String r2 = "textLayout"
            java.lang.Object r2 = r6.getExtra(r2)
            android.text.Layout r2 = (android.text.Layout) r2
            if (r2 != 0) goto L_0x001e
            return
        L_0x001e:
            java.lang.String r3 = "textDecoration"
            java.lang.Object r6 = r6.getAttribute(r3)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x002b
            java.lang.String r6 = ""
        L_0x002b:
            int r3 = r6.hashCode()
            r4 = -1171789332(0xffffffffba27e9ec, float:-6.4054015E-4)
            r5 = 2
            if (r3 == r4) goto L_0x0056
            r4 = -1026963764(0xffffffffc2c9c6cc, float:-100.888275)
            if (r3 == r4) goto L_0x004b
            r4 = 3387192(0x33af38, float:4.746467E-39)
            if (r3 == r4) goto L_0x0040
            goto L_0x0061
        L_0x0040:
            java.lang.String r3 = "none"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x0061
            r6 = 2
            goto L_0x0062
        L_0x004b:
            java.lang.String r3 = "underline"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x0061
            r6 = 0
            goto L_0x0062
        L_0x0056:
            java.lang.String r3 = "line-through"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x0061
            r6 = 1
            goto L_0x0062
        L_0x0061:
            r6 = -1
        L_0x0062:
            r3 = 3
            if (r6 == 0) goto L_0x006b
            if (r6 == r1) goto L_0x0069
            r6 = 1
            goto L_0x006c
        L_0x0069:
            r6 = 3
            goto L_0x006c
        L_0x006b:
            r6 = 2
        L_0x006c:
            android.text.TextPaint r4 = r2.getPaint()
            if (r6 != r5) goto L_0x0074
            r5 = 1
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            r4.setUnderlineText(r5)
            android.text.TextPaint r2 = r2.getPaint()
            if (r6 != r3) goto L_0x007f
            r0 = 1
        L_0x007f:
            r2.setStrikeThruText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mmt.w(com.taobao.android.weex_uikit.ui.UINode):void");
    }
}
