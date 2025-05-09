package com.taobao.android.sku.dinamicx.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.sku.utils.SkuLogUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import tb.cjz;
import tb.gi6;
import tb.k06;
import tb.t2o;
import tb.xq0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RichTextView extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_WIDGET_ID = k06.a("skuRichTextView");
    public static final long c = k06.a("textColor");
    public static final long d = k06.a("richText");
    public static final long e = k06.a("htmlText");

    /* renamed from: a  reason: collision with root package name */
    public JSONArray f9443a = new JSONArray();
    public int b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f9444a;
        public int b;
        public final int c = 33;
        public final List<Object> d = new ArrayList();

        static {
            t2o.a(442499179);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends ClickableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f9445a;
        public final int b;

        static {
            t2o.a(442499180);
        }

        public b(String str, int i) {
            this.f9445a = str;
            this.b = i;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/dinamicx/widget/RichTextView$UrlSpan");
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                xq0.c().a(view.getContext()).c(this.f9445a);
            } catch (Throwable th) {
                SkuLogUtils.i(th.toString());
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                return;
            }
            textPaint.setColor(this.b);
            textPaint.setUnderlineText(false);
        }
    }

    public static /* synthetic */ Object ipc$super(RichTextView richTextView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/dinamicx/widget/RichTextView");
        }
    }

    public final ForegroundColorSpan B(a aVar) {
        List<Object> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ForegroundColorSpan) ipChange.ipc$dispatch("339b15d7", new Object[]{this, aVar});
        }
        if (!(aVar == null || (list = aVar.d) == null || ((ArrayList) list).size() <= 0)) {
            Iterator it = ((ArrayList) aVar.d).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof ForegroundColorSpan) {
                    return (ForegroundColorSpan) next;
                }
            }
        }
        return null;
    }

    public final Object C(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("54e33caa", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return new RelativeSizeSpan(Float.parseFloat(jSONObject.getString("size")));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final CharSequence D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("feeb68b", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null && uRLSpanArr.length > 0) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if (uRLSpan == null) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                } else {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    final String url = uRLSpan.getURL();
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new URLSpan(url) { // from class: com.taobao.android.sku.dinamicx.widget.RichTextView.1
                        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                        public void onClick(View view) {
                            AliNavServiceInterface c2 = xq0.c();
                            if (c2 != null && url != null) {
                                c2.a(view.getContext()).c(url);
                            }
                        }
                    }, spanStart, spanEnd, spanFlags);
                }
            }
        }
        return spannableStringBuilder;
    }

    public final Object E(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d7c773b0", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && Boolean.parseBoolean(jSONObject.getString("strikeThrough"))) {
            return new StrikethroughSpan();
        }
        return null;
    }

    public final JSONObject F(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("350a9ced", new Object[]{this, jSONObject});
        }
        return jSONObject.getJSONObject("style");
    }

    public final a G(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("58a15e97", new Object[]{this, jSONObject, str, str2});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject F = F(jSONObject);
        a aVar = new a();
        int indexOf = str.indexOf(str2);
        aVar.f9444a = indexOf;
        aVar.b = indexOf + str2.length();
        Object C = C(F);
        if (C != null) {
            ((ArrayList) aVar.d).add(C);
        }
        Object u = u(F);
        if (u != null) {
            ((ArrayList) aVar.d).add(u);
        }
        Object t = t(F);
        if (t != null) {
            ((ArrayList) aVar.d).add(t);
        }
        Object x = x(F);
        if (x != null) {
            ((ArrayList) aVar.d).add(x);
        }
        Object E = E(F);
        if (E != null) {
            ((ArrayList) aVar.d).add(E);
        }
        if (((ArrayList) aVar.d).size() > 0) {
            return aVar;
        }
        return null;
    }

    public final int H(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c923b015", new Object[]{this, str, new Integer(i)})).intValue();
        }
        if (str == null || str.length() <= 0) {
            return i;
        }
        String lowerCase = str.toLowerCase(Locale.SIMPLIFIED_CHINESE);
        StringBuilder sb = new StringBuilder("#");
        for (int i2 = 1; i2 < 9 && i2 < lowerCase.length(); i2++) {
            char charAt = lowerCase.charAt(i2);
            if ((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'f')) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() == 7 || sb2.length() == 9) {
            return Color.parseColor(sb2);
        }
        return i;
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        if (cjz.a()) {
            SkuLogUtils.x("RichTextView.build");
        }
        return new RichTextView();
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof RichTextView) {
            RichTextView richTextView = (RichTextView) dXWidgetNode;
            this.b = richTextView.b;
            this.f9443a = (JSONArray) richTextView.f9443a.clone();
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        View onCreateView = super.onCreateView(context);
        if (onCreateView instanceof TextView) {
            ((TextView) onCreateView).setMovementMethod(LinkMovementMethod.getInstance());
        }
        return onCreateView;
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        super.onSetIntAttribute(j, i);
        if (c == j) {
            this.b = i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
            return;
        }
        super.onSetObjAttribute(j, obj);
        if (d == j) {
            if (obj instanceof JSONArray) {
                this.f9443a = (JSONArray) obj;
            } else {
                this.f9443a = z(obj.toString());
            }
            setText(A(this.f9443a));
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        CharSequence charSequence;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        super.onSetStringAttribute(j, str);
        if (e == j) {
            try {
                charSequence = D(str);
            } catch (Throwable th) {
                SkuLogUtils.i(th.toString());
                charSequence = null;
            }
            setText(charSequence);
        }
    }

    public final Object t(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7694aa2e", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && Boolean.parseBoolean(jSONObject.getString("bold"))) {
            return new StyleSpan(1);
        }
        return null;
    }

    public final Object u(JSONObject jSONObject) {
        int H;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3901ba60", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (H = H(jSONObject.getString("color"), 1193046)) == 1193046) {
            return null;
        }
        return new ForegroundColorSpan(H);
    }

    public final JSONObject v(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("82e730d6", new Object[]{this, jSONObject});
        }
        return jSONObject.getJSONObject("event");
    }

    public final a w(JSONObject jSONObject, String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7e1be407", new Object[]{this, jSONObject, str, str2, aVar});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject v = v(jSONObject);
        a aVar2 = new a();
        int indexOf = str.indexOf(str2);
        aVar2.f9444a = indexOf;
        aVar2.b = indexOf + str2.length();
        ForegroundColorSpan B = B(aVar);
        int i = this.b;
        if (B != null) {
            i = B.getForegroundColor();
        }
        Object y = y(v, i);
        if (y != null) {
            ((ArrayList) aVar2.d).add(y);
        }
        if (((ArrayList) aVar2.d).size() > 0) {
            return aVar2;
        }
        return null;
    }

    public final Object y(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cb8086ff", new Object[]{this, jSONObject, new Integer(i)});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("openUrl");
        if (!TextUtils.isEmpty(string)) {
            return new b(string, i);
        }
        return null;
    }

    public final JSONArray z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("a33ce3c6", new Object[]{this, str});
        }
        JSONArray jSONArray = new JSONArray();
        try {
            return JSON.parseArray(str);
        } catch (Throwable th) {
            SkuLogUtils.i(th.toString());
            return jSONArray;
        }
    }

    public final Object x(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("87b84899", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && Boolean.parseBoolean(jSONObject.getString("italic"))) {
            return new StyleSpan(2);
        }
        return null;
    }

    public final SpannableString A(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("3d18968a", new Object[]{this, jSONArray});
        }
        String str = "";
        if (jSONArray != null) {
            ArrayList arrayList = new ArrayList();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String string = jSONObject.getString("text");
                    if (!TextUtils.isEmpty(string)) {
                        str = str + string;
                        a G = G(jSONObject, str, string);
                        if (G != null) {
                            arrayList.add(G);
                        }
                        a w = w(jSONObject, str, string, G);
                        if (w != null) {
                            arrayList.add(w);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                SpannableString spannableString = new SpannableString(str);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    Iterator it2 = ((ArrayList) aVar.d).iterator();
                    while (it2.hasNext()) {
                        spannableString.setSpan(it2.next(), aVar.f9444a, aVar.b, aVar.c);
                    }
                }
                return spannableString;
            }
        }
        return new SpannableString(str);
    }

    static {
        t2o.a(442499176);
    }
}
