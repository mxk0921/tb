package com.alibaba.android.ultron.trade.dinamicX.constructor;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.constructor.DTextViewConstructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.b24;
import tb.bn7;
import tb.t2o;
import tb.tkt;
import tb.xq0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TradeRichTextViewConstructor extends DTextViewConstructor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String D_RICH_TEXT = "dRichText";
    private static final String EVENT = "event";
    private static final String E_OPEN_URL = "openUrl";
    private static final String STYLE = "style";
    private static final String S_BOLD = "bold";
    private static final String S_COLOR = "color";
    private static final String S_ITALIC = "italic";
    private static final String S_SIZE = "size";
    private static final String S_STRIKE_THROUGH = "strikeThrough";
    private static final String TEXT = "text";
    private static final String TV_TEXT_COLOR = "dTextColor";
    public static final String VIEW_TAG = "TradeRichTextView";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2297a;
        public int b;
        public final int c = 33;
        public final List<Object> d = new ArrayList();

        static {
            t2o.a(155189263);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b extends ClickableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f2298a;
        public final int b;

        static {
            t2o.a(155189264);
        }

        public b(String str, int i) {
            this.f2298a = str;
            this.b = i;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/dinamicX/constructor/TradeRichTextViewConstructor$UrlSpan");
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                xq0.c().a(view.getContext()).c(this.f2298a);
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

    static {
        t2o.a(155189262);
    }

    private Object getBoldSpan(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7694aa2e", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && Boolean.parseBoolean(jSONObject.getString("bold"))) {
            return new StyleSpan(1);
        }
        return null;
    }

    private Object getColorSpan(JSONObject jSONObject) {
        int e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3901ba60", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (e = b24.e(jSONObject.getString("color"), -1)) == -1) {
            return null;
        }
        return new ForegroundColorSpan(e);
    }

    private JSONObject getEventObj(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("82e730d6", new Object[]{this, jSONObject});
        }
        return jSONObject.getJSONObject("event");
    }

    private a getEventSpan(Map<String, Object> map, JSONObject jSONObject, String str, String str2, a aVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("bcb2d51e", new Object[]{this, map, jSONObject, str, str2, aVar});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject eventObj = getEventObj(jSONObject);
        a aVar2 = new a();
        int indexOf = str.indexOf(str2);
        aVar2.f2297a = indexOf;
        aVar2.b = indexOf + str2.length();
        ForegroundColorSpan richTextColor = getRichTextColor(aVar);
        int i = tkt.DEFAULT_LINK_COLOR;
        if (!(map == null || (obj = map.get("dTextColor")) == null)) {
            i = b24.e(obj.toString(), tkt.DEFAULT_LINK_COLOR);
        }
        if (richTextColor != null) {
            i = richTextColor.getForegroundColor();
        }
        Object openUrlSpan = getOpenUrlSpan(eventObj, i);
        if (openUrlSpan != null) {
            ((ArrayList) aVar2.d).add(openUrlSpan);
        }
        if (((ArrayList) aVar2.d).size() > 0) {
            return aVar2;
        }
        return null;
    }

    private Object getItalicSpan(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("87b84899", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && Boolean.parseBoolean(jSONObject.getString("italic"))) {
            return new StyleSpan(2);
        }
        return null;
    }

    private Object getOpenUrlSpan(JSONObject jSONObject, int i) {
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

    private ForegroundColorSpan getRichTextColor(a aVar) {
        List<Object> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ForegroundColorSpan) ipChange.ipc$dispatch("518b1295", new Object[]{this, aVar});
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

    private Object getSizeSpan(JSONObject jSONObject) {
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

    private Object getStrikeThroughSpan(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d7c773b0", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && Boolean.parseBoolean(jSONObject.getString(S_STRIKE_THROUGH))) {
            return new StrikethroughSpan();
        }
        return null;
    }

    private JSONObject getStyleObj(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("350a9ced", new Object[]{this, jSONObject});
        }
        return jSONObject.getJSONObject("style");
    }

    private a getStyleSpan(Map<String, Object> map, JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("afa4cb8c", new Object[]{this, map, jSONObject, str, str2});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject styleObj = getStyleObj(jSONObject);
        a aVar = new a();
        int indexOf = str.indexOf(str2);
        aVar.f2297a = indexOf;
        aVar.b = indexOf + str2.length();
        Object sizeSpan = getSizeSpan(styleObj);
        if (sizeSpan != null) {
            ((ArrayList) aVar.d).add(sizeSpan);
        }
        Object colorSpan = getColorSpan(styleObj);
        if (colorSpan != null) {
            ((ArrayList) aVar.d).add(colorSpan);
        }
        Object boldSpan = getBoldSpan(styleObj);
        if (boldSpan != null) {
            ((ArrayList) aVar.d).add(boldSpan);
        }
        Object italicSpan = getItalicSpan(styleObj);
        if (italicSpan != null) {
            ((ArrayList) aVar.d).add(italicSpan);
        }
        Object strikeThroughSpan = getStrikeThroughSpan(styleObj);
        if (strikeThroughSpan != null) {
            ((ArrayList) aVar.d).add(strikeThroughSpan);
        }
        if (((ArrayList) aVar.d).size() > 0) {
            return aVar;
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(TradeRichTextViewConstructor tradeRichTextViewConstructor, String str, Object... objArr) {
        if (str.hashCode() == -1372344534) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (bn7) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/dinamicX/constructor/TradeRichTextViewConstructor");
    }

    private void setMovement(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6180d20c", new Object[]{this, textView});
        } else if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    private void setTextInternal(TextView textView, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcd1435", new Object[]{this, textView, charSequence});
        } else if (textView != null && charSequence != null) {
            textView.setText(charSequence);
        }
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor, tb.sn7
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet});
        }
        TextView textView = new TextView(context, attributeSet);
        setMovement(textView);
        return textView;
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor, tb.sn7
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, bn7 bn7Var) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae33af2a", new Object[]{this, view, map, arrayList, bn7Var});
            return;
        }
        super.setAttributes(view, map, arrayList, bn7Var);
        if (view instanceof TextView) {
            textView = (TextView) view;
        } else {
            textView = null;
        }
        if (arrayList.contains(D_RICH_TEXT)) {
            Object obj = map.get(D_RICH_TEXT);
            if (obj == null) {
                setTextInternal(textView, "");
                return;
            }
            try {
                setTextInternal(textView, getRichText(map, JSON.parseArray(obj.toString())));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor
    public void setText(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9914798", new Object[]{this, textView, str});
        }
    }

    private SpannableString getRichText(Map<String, Object> map, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("8ed4dbb1", new Object[]{this, map, jSONArray});
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
                        a styleSpan = getStyleSpan(map, jSONObject, str, string);
                        if (styleSpan != null) {
                            arrayList.add(styleSpan);
                        }
                        a eventSpan = getEventSpan(map, jSONObject, str, string, styleSpan);
                        if (eventSpan != null) {
                            arrayList.add(eventSpan);
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
                        spannableString.setSpan(it2.next(), aVar.f2297a, aVar.b, aVar.c);
                    }
                }
                return spannableString;
            }
        }
        return new SpannableString(str);
    }
}
