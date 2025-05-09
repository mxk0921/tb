package com.taobao.android.detail.ttdetail.transfer.widget;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.alibaba.ability.impl.stdpop.StdPopAbility;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.RichTextViewImpl;
import com.taobao.android.dinamicx.widget.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.aq0;
import tb.ch3;
import tb.h9;
import tb.hij;
import tb.jov;
import tb.k06;
import tb.kji;
import tb.nxt;
import tb.q84;
import tb.qub;
import tb.rc7;
import tb.s2d;
import tb.t2o;
import tb.tq4;
import tb.uxt;
import tb.vp0;
import tb.xp0;
import tb.zp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DXTBDetailRichTextWidgetNode extends z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DETAIL_WIDGET_ID;
    public static final long DX_EVENT_ID;
    public boolean g = false;
    public final List<z.d> i = new ArrayList();
    public final uxt h = new uxt();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements xp0<vp0> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z.d f6963a;

        public a(DXTBDetailRichTextWidgetNode dXTBDetailRichTextWidgetNode, z.d dVar) {
            this.f6963a = dVar;
        }

        /* renamed from: b */
        public boolean a(vp0 vp0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("432ffc2f", new Object[]{this, vp0Var})).booleanValue();
            }
            this.f6963a.c = true;
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements xp0<aq0> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z.d f6964a;
        public final /* synthetic */ View b;

        public b(z.d dVar, View view) {
            this.f6964a = dVar;
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
                z.d dVar = this.f6964a;
                float f = dVar.e;
                drawable.setBounds(0, 0, (int) (dVar.d * f), (int) f);
                ch3 ch3Var = new ch3(drawable, this.f6964a.e);
                SpannableString spannableString = DXTBDetailRichTextWidgetNode.this.e;
                z.e eVar = this.f6964a.f7539a;
                spannableString.setSpan(ch3Var, eVar.f7540a, eVar.b, eVar.c);
                View view = this.b;
                if (view instanceof TextView) {
                    ((TextView) view).setText(DXTBDetailRichTextWidgetNode.this.e);
                }
                this.f6964a.c = true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            } else {
                DXTBDetailRichTextWidgetNode.C(DXTBDetailRichTextWidgetNode.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262700);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXTBDetailRichTextWidgetNode();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e extends ClickableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6966a;
        public final int b;

        static {
            t2o.a(912262701);
        }

        public e(String str, int i) {
            this.f6966a = str;
            this.b = i;
            DXTBDetailRichTextWidgetNode.C(DXTBDetailRichTextWidgetNode.this, false);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/DXTBDetailRichTextWidgetNode$UrlSpan");
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                if (!TextUtils.isEmpty(this.f6966a)) {
                    if (this.f6966a.contains("detailOpenFullFloat=true")) {
                        DXTBDetailRichTextWidgetNode.D(DXTBDetailRichTextWidgetNode.this, view, this.f6966a);
                    } else {
                        jov.k(tq4.d(view), this.f6966a);
                    }
                }
            } catch (Throwable unused) {
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
        t2o.a(912262695);
        long a2 = k06.a("TBDetailRichText");
        DX_EVENT_ID = a2;
        DETAIL_WIDGET_ID = a2;
    }

    public static /* synthetic */ boolean C(DXTBDetailRichTextWidgetNode dXTBDetailRichTextWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7cb6fe8c", new Object[]{dXTBDetailRichTextWidgetNode, new Boolean(z)})).booleanValue();
        }
        dXTBDetailRichTextWidgetNode.g = z;
        return z;
    }

    public static /* synthetic */ void D(DXTBDetailRichTextWidgetNode dXTBDetailRichTextWidgetNode, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34a22cf", new Object[]{dXTBDetailRichTextWidgetNode, view, str});
        } else {
            dXTBDetailRichTextWidgetNode.E(view, str);
        }
    }

    public static /* synthetic */ Object ipc$super(DXTBDetailRichTextWidgetNode dXTBDetailRichTextWidgetNode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/DXTBDetailRichTextWidgetNode");
    }

    @Override // com.taobao.android.dinamicx.widget.z
    public void B(String str, z.e eVar, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54877dc7", new Object[]{this, str, eVar, new Float(f), new Float(f2)});
            return;
        }
        z.d dVar = new z.d();
        dVar.f = str;
        dVar.d = f;
        dVar.f7539a = eVar;
        dVar.e = f2;
        ((ArrayList) this.i).add(dVar);
    }

    @Override // com.taobao.android.dinamicx.widget.z, tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXTBDetailRichTextWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.z, tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        RichTextViewImpl richTextViewImpl = new RichTextViewImpl(context);
        richTextViewImpl.setMovementMethod(nxt.a());
        return richTextViewImpl;
    }

    @Override // com.taobao.android.dinamicx.widget.z, tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(this.e);
        }
        Iterator it = ((ArrayList) this.i).iterator();
        while (it.hasNext()) {
            z.d dVar = (z.d) it.next();
            if (!dVar.b && !dVar.c) {
                try {
                    dVar.b = true;
                    zp0.c().a(getDXRuntimeContext().h()).load(dVar.f).succListener(new b(dVar, view)).c(new a(this, dVar)).a();
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.z
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
            return new e(string, i);
        }
        return null;
    }

    public final void E(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f33a372", new Object[]{this, view, str});
        } else if (!this.g) {
            this.g = true;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bizId", (Object) "tbDetail");
            jSONObject.put("popId", (Object) null);
            jSONObject.put("url", (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("maxHeight", (Object) 1);
            jSONObject2.put(hij.KEY_CORNER_RADIUS, (Object) 0);
            Boolean bool = Boolean.FALSE;
            jSONObject2.put("isOpaque", (Object) bool);
            jSONObject2.put("panEnable", (Object) bool);
            jSONObject2.put("attachMode", (Object) "activity");
            jSONObject2.put("droidFullScreen", (Object) Boolean.TRUE);
            jSONObject.put(h9.KEY_POP_CONFIG, (Object) jSONObject2);
            kji.c(tq4.d(view), view, "stdPop", StdPopAbility.API_H5, jSONObject, new c());
            q84.f(tq4.d(view), new rc7("userTrack", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.transfer.widget.DXTBDetailRichTextWidgetNode.4
                {
                    put("eventId", "2101");
                    put("arg1", "Page_Detail_Button-WordExplain");
                }
            }, new RuntimeAbilityParam[0]));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1 A[SYNTHETIC] */
    @Override // com.taobao.android.dinamicx.widget.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.text.SpannableString y(com.alibaba.fastjson.JSONArray r16, int r17) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.transfer.widget.DXTBDetailRichTextWidgetNode.y(com.alibaba.fastjson.JSONArray, int):android.text.SpannableString");
    }
}
