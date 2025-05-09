package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Xml;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.component.d;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView;
import com.taobao.weex.common.Constants;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import tb.gg0;
import tb.hqq;
import tb.io1;
import tb.mx7;
import tb.nwv;
import tb.od0;
import tb.pg1;
import tb.s6o;
import tb.t2o;
import tb.tfs;
import tb.tkt;
import tb.ut2;
import tb.ymt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RichTextComponent extends TextComponent implements io1.a, com.taobao.tao.flexbox.layoutmanager.component.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static HashMap<String, e> customParsers = new HashMap<>();
    private List<f> pieces = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends ClickableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f12075a;

        public a(f fVar) {
            this.f12075a = fVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/RichTextComponent$1");
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Map access$200;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            RichTextComponent.this.removePerformClickCallback();
            od0.D().s().e(RichTextComponent.access$100(RichTextComponent.this).N(), this.f12075a.c, null);
            if (!TextUtils.isEmpty(this.f12075a.g) && (access$200 = RichTextComponent.access$200(RichTextComponent.this, this.f12075a.g)) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("pageName", RichTextComponent.this.getNode().q0(RichTextComponent.access$300(RichTextComponent.this, this.f12075a.g)));
                hashMap.put("clickInfo", access$200);
                RichTextComponent richTextComponent = RichTextComponent.this;
                richTextComponent.sendMessage(richTextComponent.getNode(), "click", null, hashMap, null);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
            } else {
                textPaint.setUnderlineText(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ImageLoader.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12076a;
        public final /* synthetic */ int b;
        public final /* synthetic */ SpannableString c;
        public final /* synthetic */ f d;
        public final /* synthetic */ ymt e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;

        public b(int i, int i2, SpannableString spannableString, f fVar, ymt ymtVar, int i3, int i4) {
            this.f12076a = i;
            this.b = i2;
            this.c = spannableString;
            this.d = fVar;
            this.e = ymtVar;
            this.f = i3;
            this.g = i4;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoadFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3feabda6", new Object[]{this});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoaded(BitmapDrawable bitmapDrawable) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                return;
            }
            int i2 = this.f12076a;
            if (i2 > 0 && (i = this.b) > 0) {
                bitmapDrawable.setBounds(0, 0, i2, i);
            }
            RichTextComponent.access$400(RichTextComponent.this, this.c, this.d, bitmapDrawable, this.e, this.f, this.g);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends ClickableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f12077a;

        public c(f fVar) {
            this.f12077a = fVar;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/RichTextComponent$3");
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Map access$200;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            RichTextComponent.this.removePerformClickCallback();
            RichTextComponent richTextComponent = RichTextComponent.this;
            richTextComponent.sendMessage(richTextComponent.getNode(), "onclick", this.f12077a.f, null, null);
            if (!TextUtils.isEmpty(this.f12077a.g) && (access$200 = RichTextComponent.access$200(RichTextComponent.this, this.f12077a.g)) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("pageName", RichTextComponent.this.getNode().q0(RichTextComponent.access$300(RichTextComponent.this, this.f12077a.g)));
                hashMap.put("clickInfo", access$200);
                RichTextComponent richTextComponent2 = RichTextComponent.this;
                richTextComponent2.sendMessage(richTextComponent2.getNode(), "click", null, hashMap, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d extends ClickableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f12078a;

        public d(f fVar) {
            this.f12078a = fVar;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/RichTextComponent$4");
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Map access$200;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            RichTextComponent.this.removePerformClickCallback();
            RichTextComponent richTextComponent = RichTextComponent.this;
            richTextComponent.sendMessage(richTextComponent.getNode(), "onclick", this.f12078a.f, null, null);
            if (!TextUtils.isEmpty(this.f12078a.g) && (access$200 = RichTextComponent.access$200(RichTextComponent.this, this.f12078a.g)) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("pageName", RichTextComponent.this.getNode().q0(RichTextComponent.access$300(RichTextComponent.this, this.f12078a.g)));
                hashMap.put("clickInfo", access$200);
                RichTextComponent richTextComponent2 = RichTextComponent.this;
                richTextComponent2.sendMessage(richTextComponent2.getNode(), "click", null, hashMap, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
        f a(XmlPullParser xmlPullParser);

        void b(SpannableString spannableString, f fVar, int i, int i2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f12079a;
        public String b;
        public String c;
        public ymt d;
        public gg0 e;
        public String f;
        public String g;
        public e h;

        static {
            t2o.a(503316800);
        }

        public f(int i) {
            this.f12079a = i;
        }

        public static /* synthetic */ e a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("4ada2c0a", new Object[]{fVar});
            }
            return fVar.h;
        }

        public static /* synthetic */ e b(f fVar, e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("86d0cd9", new Object[]{fVar, eVar});
            }
            fVar.h = eVar;
            return eVar;
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a668de0", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9ce5bc4", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("152eb9e3", new Object[]{this, str});
            } else {
                this.f = str;
            }
        }

        public void f(ymt ymtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd372566", new Object[]{this, ymtVar});
            } else {
                this.d = ymtVar;
            }
        }

        public void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76382da8", new Object[]{this, str});
            } else {
                this.g = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g extends ymt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(503316801);
        }

        public g() {
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/RichTextComponent$RichTextViewParams");
        }

        @Override // tb.ymt
        public CharSequence J(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("412d3946", new Object[]{this, str});
            }
            return RichTextComponent.access$500(RichTextComponent.this, str);
        }
    }

    static {
        t2o.a(503316794);
        t2o.a(503317356);
        t2o.a(503316802);
    }

    public static /* synthetic */ n access$100(RichTextComponent richTextComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("551e69d0", new Object[]{richTextComponent});
        }
        return richTextComponent.node;
    }

    public static /* synthetic */ Map access$200(RichTextComponent richTextComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7577a54e", new Object[]{richTextComponent, str});
        }
        return richTextComponent.getClickTrackInfo(str);
    }

    public static /* synthetic */ Map access$300(RichTextComponent richTextComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("78ff484f", new Object[]{richTextComponent, str});
        }
        return richTextComponent.getTrackInfo(str);
    }

    public static /* synthetic */ void access$400(RichTextComponent richTextComponent, SpannableString spannableString, f fVar, Drawable drawable, ymt ymtVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cf148b3", new Object[]{richTextComponent, spannableString, fVar, drawable, ymtVar, new Integer(i), new Integer(i2)});
        } else {
            richTextComponent.setupImageSpan(spannableString, fVar, drawable, ymtVar, i, i2);
        }
    }

    public static /* synthetic */ SpannableString access$500(RichTextComponent richTextComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("fab53fc", new Object[]{richTextComponent, str});
        }
        return richTextComponent.getRichText(str);
    }

    private SpannableString applyPieces() {
        SpannableString spannableString;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("2088a67e", new Object[]{this});
        }
        hqq.b a2 = hqq.a();
        for (f fVar : this.pieces) {
            String str = fVar.b;
            if (str != null) {
                a2.b(str);
            }
        }
        SpannableString spannableString2 = new SpannableString(a2.toString());
        synchronized (spannableString2) {
            try {
                spannableString = spannableString2;
                for (f fVar2 : this.pieces) {
                    String str2 = fVar2.b;
                    if (str2 != null) {
                        spannableString = getSpannableString(fVar2, spannableString, i, str2.length() + i);
                        i += fVar2.b.length();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return spannableString;
    }

    private Map getClickTrackInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1311e06d", new Object[]{this, str});
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null) {
                return parseObject.getJSONObject("click");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    private SpannableString getSpannableString(f fVar, SpannableString spannableString, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("cc9f82ca", new Object[]{this, fVar, spannableString, new Integer(i), new Integer(i2)});
        }
        ymt ymtVar = fVar.d;
        if (ymtVar == null) {
            return spannableString;
        }
        int i3 = fVar.f12079a;
        if (i3 == 0) {
            parseTextSpannable(spannableString, ymtVar, fVar, i, i2);
        } else if (i3 == 1) {
            parseImageSpannable(spannableString, ymtVar, fVar, i, i2);
            d.a aVar = new d.a();
            View view = this.view;
            if (view != null) {
                aVar.d(view);
            }
            spannableString.setSpan(aVar, i, i2, 33);
        } else if (i3 == 2) {
            parseHrefSpannable(spannableString, ymtVar, fVar, i, i2);
        } else {
            f.a(fVar).b(spannableString, fVar, i, i2);
            d.a aVar2 = new d.a();
            View view2 = this.view;
            if (view2 != null) {
                aVar2.d(view2);
            }
            spannableString.setSpan(aVar2, i, i2, 33);
        }
        return spannableString;
    }

    private Map getTrackInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7e15a369", new Object[]{this, str});
        }
        try {
            return JSON.parseObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private boolean hasBackgroundDrawable(ymt ymtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e758fca1", new Object[]{this, ymtVar})).booleanValue();
        }
        if (ymtVar.P != 1 || ymtVar.O > 0 || ymtVar.J > 0 || ymtVar.H != null) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(RichTextComponent richTextComponent, String str, Object... objArr) {
        if (str.hashCode() == 1052797818) {
            super.detach(((Boolean) objArr[0]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/RichTextComponent");
    }

    private void parseHrefSpannable(SpannableString spannableString, ymt ymtVar, f fVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5084ca5", new Object[]{this, spannableString, ymtVar, fVar, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = ymtVar.C0;
        if (i3 == 1) {
            i3 = tkt.DEFAULT_LINK_COLOR;
        }
        if (ymtVar.k > 0 || ymtVar.l > 0) {
            io1 io1Var = new io1(this, new ColorDrawable(), 0);
            io1Var.p(i3);
            io1Var.j(ymtVar.k);
            io1Var.k(ymtVar.l);
            if (ymtVar.z0) {
                io1Var.f(true);
            }
            spannableString.setSpan(io1Var, i, i2, 33);
        } else {
            spannableString.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            if (ymtVar.z0) {
                spannableString.setSpan(new StyleSpan(1), i, i2, 33);
            }
        }
        float f2 = ymtVar.w0;
        if (f2 > 0.0f) {
            spannableString.setSpan(new AbsoluteSizeSpan((int) (f2 * this.node.P().U())), i, i2, 33);
        }
        spannableString.setSpan(new a(fVar), i, i2, 33);
    }

    private void parseImageSpannable(SpannableString spannableString, ymt ymtVar, f fVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e723afb", new Object[]{this, spannableString, ymtVar, fVar, new Integer(i), new Integer(i2)});
            return;
        }
        int i6 = ymtVar.f21973a;
        if (i6 >= 0) {
            i3 = i6;
        } else {
            i3 = 0;
        }
        int i7 = ymtVar.b;
        if (i7 >= 0) {
            i4 = i7;
        } else {
            i4 = 0;
        }
        if (!TextUtils.isEmpty(fVar.b)) {
            String str = fVar.b;
            if (str.startsWith("./")) {
                int q = s6o.q(this.node.N(), str);
                if (q != 0) {
                    drawable = this.node.N().getResources().getDrawable(q);
                } else {
                    drawable = null;
                }
                i5 = i4;
            } else {
                i5 = i4;
                od0.D().a().e(this.node.N(), str, i3, i5, new b(i3, i4, spannableString, fVar, ymtVar, i, i2));
                drawable = new ColorDrawable(com.taobao.tao.flexbox.layoutmanager.component.d.placeHolder);
            }
            if (fVar.e == null) {
                if (drawable == null) {
                    drawable = new ColorDrawable(com.taobao.tao.flexbox.layoutmanager.component.d.placeHolder);
                }
                if (i3 <= 0 || i5 <= 0) {
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                } else {
                    drawable.setBounds(0, 0, i3, i5);
                }
                setupImageSpan(spannableString, fVar, drawable, ymtVar, i, i2);
            }
        }
    }

    private void parseTextSpannable(SpannableString spannableString, ymt ymtVar, f fVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d3c5e3", new Object[]{this, spannableString, ymtVar, fVar, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = ymtVar.C0;
        if (i3 == 1) {
            i3 = 0;
        }
        if (hasBackgroundDrawable(ymtVar)) {
            io1 io1Var = new io1(this, mx7.d(null, ymtVar), 0);
            int i4 = ymtVar.f21973a;
            if (i4 >= 0) {
                io1Var.i(i4);
            }
            int i5 = ymtVar.b;
            if (i5 >= 0) {
                io1Var.h(i5);
            }
            io1Var.p(i3);
            io1Var.m(ymtVar.g);
            io1Var.o(ymtVar.i);
            io1Var.n(ymtVar.h);
            io1Var.l(ymtVar.j);
            io1Var.j(ymtVar.k);
            io1Var.k(ymtVar.l);
            if (ymtVar.z0) {
                io1Var.f(true);
            }
            io1Var.g(ymtVar.O);
            spannableString.setSpan(io1Var, i, i2, 33);
        } else {
            if (ymtVar.k > 0 || ymtVar.l > 0) {
                io1 io1Var2 = new io1(this, new ColorDrawable(), 0);
                io1Var2.p(i3);
                io1Var2.j(ymtVar.k);
                io1Var2.k(ymtVar.l);
                spannableString.setSpan(io1Var2, i, i2, 33);
            } else if (i3 != 0) {
                spannableString.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            }
            if (ymtVar.z0) {
                spannableString.setSpan(new StyleSpan(1), i, i2, 33);
            }
        }
        if (ymtVar.w0 > 0.0f && !s6o.E(3)) {
            spannableString.setSpan(new AbsoluteSizeSpan((int) (ymtVar.w0 * this.node.P().U())), i, i2, 33);
        }
        if (!TextUtils.isEmpty(fVar.f)) {
            spannableString.setSpan(new d(fVar), i, i2, 33);
        }
    }

    public static void registerParser(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79da2e24", new Object[]{str, eVar});
        } else {
            customParsers.put(str, eVar);
        }
    }

    private void setupImageSpan(SpannableString spannableString, f fVar, Drawable drawable, ymt ymtVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("372be2b1", new Object[]{this, spannableString, fVar, drawable, ymtVar, new Integer(i), new Integer(i2)});
            return;
        }
        gg0 gg0Var = new gg0(drawable, 0, 0);
        fVar.e = gg0Var;
        gg0Var.g(ymtVar.k);
        fVar.e.h(ymtVar.l);
        fVar.e.i(ymtVar.H0);
        fVar.e.f(ymtVar.y0);
        synchronized (spannableString) {
            try {
                if (!TextUtils.isEmpty(fVar.f)) {
                    spannableString.setSpan(new c(fVar), i, i2, 33);
                }
                spannableString.setSpan(fVar.e, i, i2, 33);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.c
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.c, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        V v = this.view;
        if (v != 0) {
            ut2.A((StaticLayoutView) v);
        }
        this.view = null;
        super.detach(z);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return ut2.k(context);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.Component
    public ymt generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ymt) ipChange.ipc$dispatch("d956c9bf", new Object[]{this}) : new g();
    }

    private SpannableString getRichText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("7907f6a8", new Object[]{this, str});
        }
        if (str != null && !str.startsWith("<span>")) {
            str = "<span>" + str + "</span>";
        }
        this.pieces.clear();
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setInput(new StringReader(str));
            int eventType = newPullParser.getEventType();
            f fVar = null;
            boolean z = false;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = newPullParser.getName();
                    if (pg1.ATOM_EXT_span.equals(name)) {
                        fVar = new f(0);
                        n nVar = this.node;
                        fVar.f(ymt.L(nVar, nVar.N(), newPullParser.getAttributeValue(null, "style")));
                        fVar.g(nwv.r0(newPullParser.getAttributeValue(null, "trackinfo")));
                        this.pieces.add(fVar);
                    } else if ("img".equals(name)) {
                        fVar = new f(1);
                        n nVar2 = this.node;
                        fVar.f(ymt.L(nVar2, nVar2.N(), newPullParser.getAttributeValue(null, "style")));
                        fVar.e(newPullParser.getAttributeValue(null, "onclick"));
                        fVar.d(newPullParser.getAttributeValue(null, "src"));
                        fVar.g(nwv.r0(newPullParser.getAttributeValue(null, "trackinfo")));
                        this.pieces.add(fVar);
                    } else if ("a".equals(name)) {
                        fVar = new f(2);
                        n nVar3 = this.node;
                        fVar.f(ymt.L(nVar3, nVar3.N(), newPullParser.getAttributeValue(null, "style")));
                        fVar.c(nwv.r0(newPullParser.getAttributeValue(null, Constants.Name.HREF)));
                        fVar.g(nwv.r0(newPullParser.getAttributeValue(null, "trackinfo")));
                        this.pieces.add(fVar);
                    } else {
                        e eVar = customParsers.get(name);
                        if (eVar != null) {
                            fVar = eVar.a(newPullParser);
                            f.b(fVar, eVar);
                            this.pieces.add(fVar);
                        }
                    }
                    z = false;
                } else if (eventType == 3) {
                    z = true;
                } else if (eventType == 4) {
                    String r0 = nwv.r0(newPullParser.getText());
                    if (z) {
                        fVar = new f(0);
                        this.pieces.add(fVar);
                    }
                    fVar.d(r0);
                }
                try {
                    eventType = newPullParser.next();
                } catch (XmlPullParserException unused) {
                    eventType = newPullParser.next();
                }
            }
            try {
                return applyPieces();
            } catch (ArrayIndexOutOfBoundsException unused2) {
                tfs.d("arrayIndexOutofBoundsException:" + str);
                return new SpannableString("");
            }
        } catch (Exception e2) {
            tfs.d("setRichText: " + e2.getMessage());
            return new SpannableString("");
        }
    }
}
