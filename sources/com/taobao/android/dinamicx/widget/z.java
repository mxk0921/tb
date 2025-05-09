package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliImageInterface;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.aq0;
import tb.ch3;
import tb.gi6;
import tb.qub;
import tb.vp0;
import tb.xp0;
import tb.xq0;
import tb.zp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class z extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_WIDGET_ID = -911702450770524810L;
    public static final String EVENT = "event";
    public static final String E_OPEN_URL = "openUrl";
    public static final String IMAGE_DESCRIPTION = "description";
    public static final String IMAGE_URL = "imageUrl";
    public static final String STYLE = "style";
    public static final long TAG_SPAN_USE_AP = -2338107240079086442L;
    public static final String TEXT = "text";
    public static final String TYPE_IMAGE = "image";
    public static final String TYPE_KEY = "type";

    /* renamed from: a  reason: collision with root package name */
    public boolean f7536a;
    public SpannableString e;
    public JSONArray b = new JSONArray();
    public final HashMap<String, d> f = new HashMap<>();
    public final v c = new v();
    public final y d = new y();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements xp0<vp0> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map.Entry f7537a;

        public a(z zVar, Map.Entry entry) {
            this.f7537a = entry;
        }

        /* renamed from: b */
        public boolean a(vp0 vp0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("432ffc2f", new Object[]{this, vp0Var})).booleanValue();
            }
            ((d) this.f7537a.getValue()).c = true;
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements xp0<aq0> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map.Entry f7538a;
        public final /* synthetic */ View b;

        public b(Map.Entry entry, View view) {
            this.f7538a = entry;
            this.b = view;
        }

        /* renamed from: b */
        public boolean a(aq0 aq0Var) {
            BitmapDrawable drawable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("58f2cb53", new Object[]{this, aq0Var})).booleanValue();
            }
            if (!(aq0Var == null || (drawable = aq0Var.getDrawable()) == null)) {
                drawable.setBounds(0, 0, (int) (((d) this.f7538a.getValue()).e * ((d) this.f7538a.getValue()).d), (int) ((d) this.f7538a.getValue()).e);
                ch3 ch3Var = new ch3(drawable, ((d) this.f7538a.getValue()).e);
                ((ArrayList) ((d) this.f7538a.getValue()).f7539a.d).clear();
                ((ArrayList) ((d) this.f7538a.getValue()).f7539a.d).add(ch3Var);
                Iterator it = ((ArrayList) ((d) this.f7538a.getValue()).f7539a.d).iterator();
                while (it.hasNext()) {
                    z.this.e.setSpan(it.next(), ((d) this.f7538a.getValue()).f7539a.f7540a, ((d) this.f7538a.getValue()).f7539a.b, ((d) this.f7538a.getValue()).f7539a.c);
                }
                View view = this.b;
                if (view instanceof TextView) {
                    ((TextView) view).setText(z.this.e);
                }
                ((d) this.f7538a.getValue()).c = true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new z();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public e f7539a;
        public boolean b = false;
        public boolean c = false;
        public float d = 0.0f;
        public float e = 0.0f;
        public String f = "";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public int f7540a;
        public int b;
        public final int c = 33;
        public final List<Object> d = new ArrayList();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f extends ClickableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f7541a;
        public final int b;

        public f(String str, int i) {
            this.f7541a = str;
            this.b = i;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/XQRichTextView$UrlSpan");
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                xq0.c().a(view.getContext()).c(this.f7541a);
            } catch (Throwable th) {
                Log.e("TBXQRichText", th.toString());
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

    public static /* synthetic */ Object ipc$super(z zVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/XQRichTextView");
        }
    }

    public JSONObject A(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("350a9ced", new Object[]{this, jSONObject});
        }
        return jSONObject.getJSONObject("style");
    }

    public void B(String str, e eVar, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54877dc7", new Object[]{this, str, eVar, new Float(f2), new Float(f3)});
        } else if (this.f.get(str) != null) {
            d dVar = this.f.get(str);
            dVar.d = f2;
            dVar.f7539a = eVar;
            dVar.e = f3;
        } else {
            d dVar2 = new d();
            dVar2.d = f2;
            dVar2.f7539a = eVar;
            dVar2.e = f3;
            this.f.put(str, dVar2);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new z();
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (TAG_SPAN_USE_AP == j) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof z) {
            z zVar = (z) dXWidgetNode;
            this.b = (JSONArray) zVar.b.clone();
            this.f7536a = zVar.f7536a;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        RichTextViewImpl richTextViewImpl = new RichTextViewImpl(context);
        richTextViewImpl.setMovementMethod(LinkMovementMethod.getInstance());
        return richTextViewImpl;
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setText(y(this.b, DXWidgetNode.DXMeasureSpec.b(i)));
        setAccessibilityText(w(this.b));
        super.onMeasure(i, i2);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        HashMap<String, d> hashMap = this.f;
        if (hashMap != null) {
            for (Map.Entry<String, d> entry : hashMap.entrySet()) {
                if (!entry.getValue().b && !entry.getValue().c) {
                    try {
                        AliImageInterface a2 = zp0.c().a(getDXRuntimeContext().h());
                        entry.getValue().b = true;
                        a2.load(entry.getKey()).succListener(new b(entry, view)).c(new a(this, entry)).a();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (TAG_SPAN_USE_AP == j) {
            if (i == 0) {
                z = false;
            }
            this.f7536a = z;
        } else {
            super.onSetIntAttribute(j, i);
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
        if (6166534142713395027L != j) {
            return;
        }
        if (obj instanceof JSONArray) {
            this.b = (JSONArray) obj;
        } else {
            this.b = x(obj.toString());
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        Spanned spanned;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        super.onSetStringAttribute(j, str);
        if (3234380036921181282L == j) {
            try {
                spanned = Html.fromHtml(str);
            } catch (Throwable th) {
                Log.e("TBXQRichText", th.toString());
                spanned = null;
            }
            setText(spanned);
        }
    }

    public JSONObject t(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("82e730d6", new Object[]{this, jSONObject});
        }
        return jSONObject.getJSONObject("event");
    }

    public e u(JSONObject jSONObject, String str, String str2, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("1f0760e7", new Object[]{this, jSONObject, str, str2, eVar});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject t = t(jSONObject);
        e eVar2 = new e();
        int indexOf = str.indexOf(str2);
        eVar2.f7540a = indexOf;
        eVar2.b = indexOf + str2.length();
        ForegroundColorSpan z = z(eVar);
        int textColor = getTextColor();
        if (z != null) {
            textColor = z.getForegroundColor();
        }
        Object v = v(t, textColor);
        if (v != null) {
            ((ArrayList) eVar2.d).add(v);
        }
        if (((ArrayList) eVar2.d).size() > 0) {
            return eVar2;
        }
        return null;
    }

    public Object v(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cb8086ff", new Object[]{this, jSONObject, new Integer(i)});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("openUrl");
        if (!TextUtils.isEmpty(string)) {
            return new f(string, i);
        }
        return null;
    }

    public final JSONArray x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("a33ce3c6", new Object[]{this, str});
        }
        JSONArray jSONArray = new JSONArray();
        try {
            return JSON.parseArray(str);
        } catch (Throwable th) {
            Log.e("TBXQRichText", th.toString());
            return jSONArray;
        }
    }

    public final ForegroundColorSpan z(e eVar) {
        List<Object> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ForegroundColorSpan) ipChange.ipc$dispatch("c43d2d30", new Object[]{this, eVar});
        }
        if (!(eVar == null || (list = eVar.d) == null || ((ArrayList) list).size() <= 0)) {
            Iterator it = ((ArrayList) eVar.d).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof ForegroundColorSpan) {
                    return (ForegroundColorSpan) next;
                }
            }
        }
        return null;
    }

    public String w(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e24cf608", new Object[]{this, jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                if ("image".equals(jSONObject.getString("type"))) {
                    String string = jSONObject.getString("description");
                    if (!TextUtils.isEmpty(string)) {
                        sb.append(string);
                    }
                } else {
                    String string2 = jSONObject.getString("text");
                    if (!TextUtils.isEmpty(string2)) {
                        sb.append(string2);
                    }
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02fc, code lost:
        if (r12 < 0) goto L_0x031a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02fe, code lost:
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0303, code lost:
        if (r12 >= r14.size()) goto L_0x031a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0305, code lost:
        r1 = (com.taobao.android.dinamicx.widget.z.e) r14.get(r12);
        r1.f7540a -= r10;
        r1.b -= r10;
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x031c, code lost:
        return r24.e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.text.SpannableString y(com.alibaba.fastjson.JSONArray r25, int r26) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.z.y(com.alibaba.fastjson.JSONArray, int):android.text.SpannableString");
    }
}
