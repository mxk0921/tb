package tb;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class de5 extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PRICE_TEXT_STYLE_ALI_STYLE = "alistyle";
    public static final String PRICE_TEXT_STYLE_BOLD = "bold";
    public static final String PRICE_TEXT_STYLE_BOLD_ITALIC = "bold_italic";
    public static final String PRICE_TEXT_STYLE_ITALIC = "italic";
    public static final String PRICE_TEXT_STYLE_NORMAL = "normal";
    public static final long R_PRICE_TEXT = 2082245569794182932L;
    public static final long R_PRICE_TEXT_ALIGNMENT = -543018877117248068L;
    public static final long R_PRICE_TEXT_COLOR = 3235869418129297432L;
    public static final long R_PRICE_TEXT_SIZE = -3926857452327547469L;
    public static final long R_PRICE_TEXT_STYLE = 3238159488123598378L;
    public static final long R_PRICE_VIEW = -7577370574697348630L;
    public static Typeface e;

    /* renamed from: a  reason: collision with root package name */
    public String f17755a;
    public String b;
    public int c = pb6.f(DinamicXEngine.x(), 16.0f);
    public d25 d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729809069);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new de5();
        }
    }

    static {
        t2o.a(729809068);
    }

    public static /* synthetic */ Object ipc$super(de5 de5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 28626114:
                super.onEndParser();
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/widgetnode/DXButterRPriceViewWidgetNode");
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new de5();
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof de5) {
            de5 de5Var = (de5) dXWidgetNode;
            this.f17755a = de5Var.f17755a;
            this.b = de5Var.b;
            this.c = de5Var.c;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndParser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4ccc2", new Object[]{this});
            return;
        }
        super.onEndParser();
        setText(t());
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (-3926857452327547469L == j) {
            this.c = i;
            setTextSize(i);
        } else if (-543018877117248068L == j) {
            setTextGravity(i);
        } else if (3235869418129297432L == j) {
            setTextColor(i);
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (3238159488123598378L == j) {
            this.f17755a = str;
        } else if (2082245569794182932L == j) {
            this.b = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff39a9e4", new Object[]{this});
        } else if (e == null) {
            e = Typeface.createFromAsset(Globals.getApplication().getAssets(), "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf");
        }
    }

    public final SpannableString t() {
        int i;
        StyleSpan styleSpan;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("bbe26d70", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.b)) {
            return null;
        }
        JSONObject parseObject = JSON.parseObject(this.b);
        String string = parseObject.getString(pg1.ATOM_symbol);
        String str = "";
        if (string == null) {
            string = str;
        }
        String string2 = parseObject.getString("yuan");
        if (string2 == null) {
            string2 = str;
        }
        String string3 = parseObject.getString("separator");
        if (string3 == null) {
            string3 = str;
        }
        String string4 = parseObject.getString("cent");
        if (string4 == null) {
            string4 = str;
        }
        String string5 = parseObject.getString(mh1.PRICE_UNIT);
        if (string5 != null) {
            str = string5;
        }
        SpannableString spannableString = new SpannableString(string + string2 + string3 + string4 + str);
        int i2 = (int) (((double) this.c) * 0.625d);
        if ("alistyle".equals(this.f17755a)) {
            float f = this.c;
            i2 = (int) (0.571f * f);
            i = (int) (f * 0.762f);
        } else {
            i = i2;
        }
        int length = string.length();
        if (length != 0) {
            spannableString.setSpan(new AbsoluteSizeSpan(i2), 0, length, 33);
        }
        int length2 = string2.length() + string3.length();
        int i3 = length + length2;
        if (length2 != 0) {
            spannableString.setSpan(new AbsoluteSizeSpan(this.c), length, i3, 33);
        }
        int length3 = string4.length() + str.length();
        int i4 = i3 + length3;
        if (length3 != 0) {
            spannableString.setSpan(new AbsoluteSizeSpan(i), i3, i4, 33);
        }
        if ("normal".equals(this.f17755a)) {
            styleSpan = new StyleSpan(0);
        } else if ("bold".equals(this.f17755a)) {
            styleSpan = new StyleSpan(1);
        } else if ("italic".equals(this.f17755a)) {
            styleSpan = new StyleSpan(2);
        } else if ("bold_italic".equals(this.f17755a)) {
            styleSpan = new StyleSpan(3);
        } else {
            styleSpan = new StyleSpan(0);
        }
        spannableString.setSpan(styleSpan, length, i4, 33);
        if ("alistyle".equals(this.f17755a)) {
            u();
            if (e != null) {
                if (this.d == null) {
                    this.d = new d25(e);
                }
                spannableString.setSpan(this.d, length, i4, 33);
            }
            if (length != 0) {
                spannableString.setSpan(new b15(0.3f), 0, length, 33);
            }
        }
        return spannableString;
    }
}
