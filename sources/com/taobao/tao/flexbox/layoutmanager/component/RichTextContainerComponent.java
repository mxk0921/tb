package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaMeasureMode;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.component.d;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.bqe;
import tb.db8;
import tb.gg0;
import tb.gpe;
import tb.io1;
import tb.ir2;
import tb.iu3;
import tb.jfw;
import tb.mx7;
import tb.nwv;
import tb.ol4;
import tb.pg1;
import tb.rbi;
import tb.slt;
import tb.t2o;
import tb.ut2;
import tb.ymt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RichTextContainerComponent extends TextComponent implements ol4, io1.a, com.taobao.tao.flexbox.layoutmanager.component.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private n ellipsizeNode;
    private boolean hasClickEventHandler;
    private boolean hasEllipsize;
    private boolean showEllipsize;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends ClickableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f12080a;
        public final /* synthetic */ String b;

        public a(n nVar, String str) {
            this.f12080a = nVar;
            this.b = str;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/RichTextContainerComponent$1");
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                RichTextContainerComponent.access$000(RichTextContainerComponent.this, this.f12080a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements gpe.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12081a;
        public final /* synthetic */ int b;
        public final /* synthetic */ SpannableString c;
        public final /* synthetic */ n d;
        public final /* synthetic */ bqe e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;
        public final /* synthetic */ boolean[] h;

        public b(int i, int i2, SpannableString spannableString, n nVar, bqe bqeVar, int i3, int i4, boolean[] zArr) {
            this.f12081a = i;
            this.b = i2;
            this.c = spannableString;
            this.d = nVar;
            this.e = bqeVar;
            this.f = i3;
            this.g = i4;
            this.h = zArr;
        }

        @Override // tb.gpe.b
        public void a(Object obj, Drawable drawable) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49f720e8", new Object[]{this, obj, drawable});
                return;
            }
            int i2 = this.f12081a;
            if (i2 > 0 && (i = this.b) > 0) {
                drawable.setBounds(0, 0, i2, i);
            }
            RichTextContainerComponent.access$100(RichTextContainerComponent.this, this.c, this.d, drawable, this.e, this.f, this.g);
            this.h[0] = true;
            Object obj2 = this.e.x0;
            if (obj2 instanceof String) {
                nwv.B0(this.d, true, (String) obj2, (String) obj2, drawable);
            }
        }

        @Override // tb.gpe.b
        public void b(Object obj, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7545a341", new Object[]{this, obj, new Integer(i)});
                return;
            }
            Object obj2 = this.e.x0;
            if (obj2 instanceof String) {
                nwv.B0(this.d, false, (String) obj2, (String) obj2, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends ClickableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f12082a;
        public final /* synthetic */ String b;

        public c(n nVar, String str) {
            this.f12082a = nVar;
            this.b = str;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/RichTextContainerComponent$3");
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                RichTextContainerComponent.access$000(RichTextContainerComponent.this, this.f12082a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d extends ClickableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f12083a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        public d(n nVar, String str, int i) {
            this.f12083a = nVar;
            this.b = str;
            this.c = i;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/RichTextContainerComponent$4");
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                RichTextContainerComponent.access$000(RichTextContainerComponent.this, this.f12083a, this.b);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                return;
            }
            textPaint.setColor(this.c);
            textPaint.setUnderlineText(false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f extends io1 implements iu3.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final CharSequence o;
        public int p;
        public int q;
        public boolean r;

        static {
            t2o.a(503316812);
            t2o.a(503316931);
        }

        public f(CharSequence charSequence, Drawable drawable) {
            super(RichTextContainerComponent.this, drawable, 0);
            this.o = charSequence;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/RichTextContainerComponent$EllipsizeSpan");
        }

        @Override // tb.io1
        public String d(CharSequence charSequence, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("384c294e", new Object[]{this, charSequence, new Integer(i), new Integer(i2)});
            }
            if (!this.r) {
                this.p = i;
                this.q = i2;
                this.r = true;
            }
            RichTextContainerComponent.access$402(RichTextContainerComponent.this, true);
            if (i == this.p && i2 == this.q) {
                return this.o.toString();
            }
            return "";
        }

        @Override // tb.io1
        public int e(Paint paint, CharSequence charSequence, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c6e89bbf", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2)})).intValue();
            }
            float textSize = paint.getTextSize();
            paint.setTextSize((float) (((ymt) RichTextContainerComponent.access$500(RichTextContainerComponent.this).K().getViewParams()).w0 * RichTextContainerComponent.access$1800(RichTextContainerComponent.this).P().U()));
            int round = Math.round(paint.measureText(this.o.toString()));
            paint.setTextSize(textSize);
            return round;
        }

        @Override // tb.iu3.a
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            RichTextContainerComponent richTextContainerComponent = RichTextContainerComponent.this;
            RichTextContainerComponent.access$000(richTextContainerComponent, RichTextContainerComponent.access$500(richTextContainerComponent), (String) RichTextContainerComponent.access$500(RichTextContainerComponent.this).H("onclick"));
        }

        public boolean r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5efd1466", new Object[]{this})).booleanValue();
            }
            return true ^ TextUtils.isEmpty((String) RichTextContainerComponent.access$500(RichTextContainerComponent.this).H("onclick"));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class g extends SpannableStringBuilder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public e f12084a;

        static {
            t2o.a(503316813);
        }

        public g(CharSequence charSequence) {
            super(charSequence);
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/RichTextContainerComponent$EllipsizeSpannableStringBuilder");
        }

        public e a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("39b7f54", new Object[]{this});
            }
            return this.f12084a;
        }

        public void b(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1d5ebc2", new Object[]{this, eVar});
            } else {
                this.f12084a = eVar;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h extends ymt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(503316814);
        }

        public h() {
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            if (str.hashCode() == -998046064) {
                super.B((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/RichTextContainerComponent$RichTextViewParams");
        }

        @Override // tb.ymt, tb.jfw
        public void B(Context context, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4830690", new Object[]{this, context, hashMap});
                return;
            }
            super.B(context, hashMap);
            this.I0 = J(null);
        }

        public final boolean M(SpannableString spannableString) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("40cee54b", new Object[]{this, spannableString})).booleanValue();
            }
            if (this.E0 == Integer.MAX_VALUE) {
                return true;
            }
            slt sltVar = new slt();
            int i = this.f21973a;
            if (i > 0) {
                sltVar.K((i - ((ymt) RichTextContainerComponent.access$1300(RichTextContainerComponent.this)).g) - ((ymt) RichTextContainerComponent.access$1400(RichTextContainerComponent.this)).h);
            } else {
                sltVar.K(-1);
            }
            sltVar.O(YogaMeasureMode.EXACTLY, (RichTextContainerComponent.access$1500(RichTextContainerComponent.this).f27261a - ((ymt) RichTextContainerComponent.access$1600(RichTextContainerComponent.this)).g) - ((ymt) RichTextContainerComponent.access$1700(RichTextContainerComponent.this)).h);
            sltVar.N(this.E0);
            sltVar.Q(spannableString);
            if (sltVar.B().getLineCount() <= this.E0) {
                return true;
            }
            return false;
        }

        @Override // tb.ymt
        public CharSequence J(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("412d3946", new Object[]{this, str});
            }
            RichTextContainerComponent.access$202(RichTextContainerComponent.this, false);
            RichTextContainerComponent.access$302(RichTextContainerComponent.this, false);
            RichTextContainerComponent.access$402(RichTextContainerComponent.this, false);
            RichTextContainerComponent.access$502(RichTextContainerComponent.this, null);
            StringBuilder sb = new StringBuilder();
            RichTextContainerComponent richTextContainerComponent = RichTextContainerComponent.this;
            RichTextContainerComponent.access$700(richTextContainerComponent, RichTextContainerComponent.access$600(richTextContainerComponent), sb);
            SpannableString spannableString = new SpannableString(sb.toString());
            RichTextContainerComponent richTextContainerComponent2 = RichTextContainerComponent.this;
            RichTextContainerComponent.access$900(richTextContainerComponent2, spannableString, RichTextContainerComponent.access$800(richTextContainerComponent2), 0);
            if (RichTextContainerComponent.access$300(RichTextContainerComponent.this)) {
                db8 db8Var = new db8(spannableString);
                ymt ymtVar = (ymt) RichTextContainerComponent.access$500(RichTextContainerComponent.this).K().getViewParams();
                Drawable d = mx7.d(null, ymtVar);
                if (d == null) {
                    d = ut2.b(0);
                }
                if (((ArrayList) RichTextContainerComponent.access$500(RichTextContainerComponent.this).d).size() != 0 || RichTextContainerComponent.access$500(RichTextContainerComponent.this).H("text") == null) {
                    RichTextContainerComponent richTextContainerComponent3 = RichTextContainerComponent.this;
                    e eVar = new e(RichTextContainerComponent.access$500(richTextContainerComponent3), d);
                    RichTextContainerComponent.access$1000(RichTextContainerComponent.this, eVar, ymtVar);
                    if (!e.r(eVar)) {
                        db8Var.e(eVar);
                        return db8Var;
                    } else if (M(spannableString)) {
                        g gVar = new g(spannableString);
                        gVar.append((CharSequence) "\n");
                        gVar.append((CharSequence) e.s(eVar));
                        gVar.b(eVar);
                        e.s(eVar).setSpan(eVar, 0, e.s(eVar).length(), 33);
                        return gVar;
                    } else {
                        db8Var.e(eVar);
                        return db8Var;
                    }
                } else if (ymtVar.I0 != null) {
                    f fVar = new f(ymtVar.I0, d);
                    RichTextContainerComponent.access$1000(RichTextContainerComponent.this, fVar, ymtVar);
                    db8Var.e(fVar);
                    return db8Var;
                }
            }
            return spannableString;
        }
    }

    static {
        t2o.a(503316806);
        t2o.a(503317030);
        t2o.a(503317356);
        t2o.a(503316802);
    }

    public static /* synthetic */ void access$000(RichTextContainerComponent richTextContainerComponent, n nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36525a72", new Object[]{richTextContainerComponent, nVar, str});
        } else {
            richTextContainerComponent.handleSpanClick(nVar, str);
        }
    }

    public static /* synthetic */ void access$100(RichTextContainerComponent richTextContainerComponent, SpannableString spannableString, n nVar, Drawable drawable, bqe bqeVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f835c937", new Object[]{richTextContainerComponent, spannableString, nVar, drawable, bqeVar, new Integer(i), new Integer(i2)});
        } else {
            richTextContainerComponent.setupImageSpan(spannableString, nVar, drawable, bqeVar, i, i2);
        }
    }

    public static /* synthetic */ void access$1000(RichTextContainerComponent richTextContainerComponent, io1 io1Var, jfw jfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa412af3", new Object[]{richTextContainerComponent, io1Var, jfwVar});
        } else {
            richTextContainerComponent.setupBackgroundSpan(io1Var, jfwVar);
        }
    }

    public static /* synthetic */ jfw access$1300(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("1975223b", new Object[]{richTextContainerComponent});
        }
        return richTextContainerComponent.viewParams;
    }

    public static /* synthetic */ jfw access$1400(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("24f507bc", new Object[]{richTextContainerComponent});
        }
        return richTextContainerComponent.viewParams;
    }

    public static /* synthetic */ rbi access$1500(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rbi) ipChange.ipc$dispatch("7f80e513", new Object[]{richTextContainerComponent});
        }
        return richTextContainerComponent.measureResult;
    }

    public static /* synthetic */ jfw access$1600(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("3bf4d2be", new Object[]{richTextContainerComponent});
        }
        return richTextContainerComponent.viewParams;
    }

    public static /* synthetic */ jfw access$1700(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("4774b83f", new Object[]{richTextContainerComponent});
        }
        return richTextContainerComponent.viewParams;
    }

    public static /* synthetic */ n access$1800(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("fde19a55", new Object[]{richTextContainerComponent});
        }
        return richTextContainerComponent.node;
    }

    public static /* synthetic */ boolean access$202(RichTextContainerComponent richTextContainerComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e74d1b2", new Object[]{richTextContainerComponent, new Boolean(z)})).booleanValue();
        }
        richTextContainerComponent.hasClickEventHandler = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("544a3c4b", new Object[]{richTextContainerComponent})).booleanValue();
        }
        return richTextContainerComponent.hasEllipsize;
    }

    public static /* synthetic */ boolean access$302(RichTextContainerComponent richTextContainerComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5f0ab73", new Object[]{richTextContainerComponent, new Boolean(z)})).booleanValue();
        }
        richTextContainerComponent.hasEllipsize = z;
        return z;
    }

    public static /* synthetic */ boolean access$402(RichTextContainerComponent richTextContainerComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d6c8534", new Object[]{richTextContainerComponent, new Boolean(z)})).booleanValue();
        }
        richTextContainerComponent.showEllipsize = z;
        return z;
    }

    public static /* synthetic */ n access$500(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("a6632887", new Object[]{richTextContainerComponent});
        }
        return richTextContainerComponent.ellipsizeNode;
    }

    public static /* synthetic */ n access$502(RichTextContainerComponent richTextContainerComponent, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("896d0971", new Object[]{richTextContainerComponent, nVar});
        }
        richTextContainerComponent.ellipsizeNode = nVar;
        return nVar;
    }

    public static /* synthetic */ n access$600(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("3a8238a6", new Object[]{richTextContainerComponent});
        }
        return richTextContainerComponent.node;
    }

    public static /* synthetic */ void access$700(RichTextContainerComponent richTextContainerComponent, n nVar, StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb1fe1c", new Object[]{richTextContainerComponent, nVar, sb});
        } else {
            richTextContainerComponent.buildRichTextString(nVar, sb);
        }
    }

    public static /* synthetic */ n access$800(RichTextContainerComponent richTextContainerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("62c058e4", new Object[]{richTextContainerComponent});
        }
        return richTextContainerComponent.node;
    }

    public static /* synthetic */ void access$900(RichTextContainerComponent richTextContainerComponent, SpannableString spannableString, n nVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f20c7b4", new Object[]{richTextContainerComponent, spannableString, nVar, new Integer(i)});
        } else {
            richTextContainerComponent.applyStyleForSpannableString(spannableString, nVar, i);
        }
    }

    private void applyStyleForSpannableString(SpannableString spannableString, n nVar, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9a0463", new Object[]{this, spannableString, nVar, new Integer(i)});
            return;
        }
        if (nVar != this.node) {
            getSpannableString(nVar, spannableString, i, nVar.f0() + i);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < ((ArrayList) nVar.d).size(); i4++) {
            if (!((n) ((ArrayList) nVar.d).get(i4)).r0().equals("ellipsize")) {
                if (i4 == 0) {
                    i2 = 0;
                } else {
                    i2 = ((n) ((ArrayList) nVar.d).get(i4 - 1)).f0();
                }
                i3 += i2;
                applyStyleForSpannableString(spannableString, (n) ((ArrayList) nVar.d).get(i4), i + i3);
            }
        }
    }

    private void buildRichTextString(n nVar, StringBuilder sb) {
        String e0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("145daa88", new Object[]{this, nVar, sb});
            return;
        }
        if (!(nVar == this.node || (e0 = nVar.e0()) == null)) {
            sb.append(e0);
        }
        Iterator it = ((ArrayList) nVar.d).iterator();
        while (it.hasNext()) {
            n nVar2 = (n) it.next();
            if (!nVar2.r0().equals("ellipsize")) {
                buildRichTextString(nVar2, sb);
            } else {
                this.hasEllipsize = true;
                this.ellipsizeNode = nVar2;
                nVar2.e0();
            }
        }
    }

    private SpannableString getSpannableString(n nVar, SpannableString spannableString, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("f81d4ee4", new Object[]{this, nVar, spannableString, new Integer(i), new Integer(i2)});
        }
        String r0 = nVar.r0();
        if (r0.equals("text")) {
            parseTextSpannable(spannableString, (ymt) nVar.K().getViewParams(), nVar, i, i2);
        } else if (r0.equals("image")) {
            parseImageSpannable(spannableString, (bqe) nVar.K().getViewParams(), nVar, i, i2);
            d.a aVar = new d.a();
            View view = this.view;
            if (view != null) {
                aVar.d(view);
            }
            spannableString.setSpan(aVar, i, i2, 33);
        } else if (r0.equals("div")) {
            parseDivSpannable(spannableString, nVar.K().getViewParams(), nVar, i, i2);
        }
        return spannableString;
    }

    private void handleSpanClick(n nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db490adf", new Object[]{this, nVar, str});
            return;
        }
        removePerformClickCallback();
        sendMessage(nVar, "onclick", str, clickArgs(), null);
        sendMessage(nVar, "click", null, null, null);
    }

    private boolean hasBackgroundDrawable(jfw jfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57edbf4e", new Object[]{this, jfwVar})).booleanValue();
        }
        if (jfwVar.E == 1 && jfwVar.F == 1 && jfwVar.P == 1 && jfwVar.O <= 0 && jfwVar.J <= 0 && jfwVar.H == null) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(RichTextContainerComponent richTextContainerComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -5587276) {
            return new Boolean(super.needUpdateViewParam());
        }
        if (hashCode == 98971100) {
            return new Boolean(super.canbeDrawable());
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/RichTextContainerComponent");
    }

    private void parseImageSpannable(SpannableString spannableString, bqe bqeVar, n nVar, int i, int i2) {
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1290af", new Object[]{this, spannableString, bqeVar, nVar, new Integer(i), new Integer(i2)});
            return;
        }
        int i5 = bqeVar.f21973a;
        if (i5 >= 0) {
            i3 = i5;
        } else {
            i3 = 0;
        }
        int i6 = bqeVar.b;
        if (i6 >= 0) {
            i4 = i6;
        } else {
            i4 = 0;
        }
        boolean[] zArr = {false};
        if (bqeVar.x0 != null) {
            gpe.f(null, this.node.P(), bqeVar.x0, i3, i4, ImageLoader.b.a(), null, false, new b(i3, i4, spannableString, nVar, bqeVar, i, i2, zArr));
            ColorDrawable colorDrawable = new ColorDrawable(com.taobao.tao.flexbox.layoutmanager.component.d.placeHolder);
            if (!zArr[0]) {
                if (i3 <= 0 || i4 <= 0) {
                    colorDrawable.setBounds(0, 0, colorDrawable.getIntrinsicWidth(), colorDrawable.getIntrinsicHeight());
                } else {
                    colorDrawable.setBounds(0, 0, i3, i4);
                }
                setupImageSpan(spannableString, nVar, colorDrawable, bqeVar, i, i2);
            }
        }
    }

    private void setupBackgroundSpan(io1 io1Var, jfw jfwVar) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("232c8d54", new Object[]{this, io1Var, jfwVar});
            return;
        }
        if ((jfwVar instanceof ymt) && (i = ((ymt) jfwVar).C0) != 1) {
            i2 = i;
        }
        int i3 = jfwVar.f21973a;
        if (i3 >= 0) {
            io1Var.i(i3);
        }
        int i4 = jfwVar.b;
        if (i4 >= 0) {
            io1Var.h(i4);
        }
        io1Var.p(i2);
        io1Var.m(jfwVar.g);
        io1Var.o(jfwVar.i);
        io1Var.n(jfwVar.h);
        io1Var.l(jfwVar.j);
        io1Var.j(jfwVar.k);
        io1Var.k(jfwVar.l);
        if ((jfwVar instanceof ymt) && ((ymt) jfwVar).z0) {
            io1Var.f(true);
        }
        io1Var.g(jfwVar.O);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.c
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        if (!super.canbeDrawable() || this.hasClickEventHandler || this.hasEllipsize) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public HashMap clickArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("16a46aef", new Object[]{this});
        }
        if (!this.hasEllipsize) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("showEllipsize", Boolean.valueOf(this.showEllipsize));
        return hashMap;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean needUpdateViewParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffaabeb4", new Object[]{this})).booleanValue();
        }
        if (super.needUpdateViewParam() || this.node.F0()) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return ut2.k(context);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e extends io1 implements iu3.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final SpannableString o;
        public final slt p;
        public final boolean q;

        static {
            t2o.a(503316811);
            t2o.a(503316931);
        }

        public e(n nVar, Drawable drawable) {
            super(RichTextContainerComponent.this, drawable, 0);
            nVar.K0();
            boolean o = nwv.o(nVar.H("expand"), false);
            this.q = o;
            StringBuilder sb = new StringBuilder();
            RichTextContainerComponent.access$700(RichTextContainerComponent.this, nVar, sb);
            SpannableString spannableString = new SpannableString(sb.toString());
            this.o = spannableString;
            RichTextContainerComponent.access$900(RichTextContainerComponent.this, spannableString, nVar, 0);
            if (o) {
                spannableString.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE), 0, 1, 33);
            }
            slt sltVar = new slt();
            this.p = sltVar;
            jfw viewParams = nVar.K().getViewParams();
            if (viewParams != null) {
                if (viewParams.f21973a > 0) {
                    sltVar.K((nVar.S().f27261a - viewParams.g) - viewParams.h);
                } else {
                    sltVar.K(-1);
                }
                sltVar.O(YogaMeasureMode.EXACTLY, (nVar.S().f27261a - viewParams.g) - viewParams.h);
            }
            sltVar.Q(spannableString);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/RichTextContainerComponent$ComposeEllipsizeSpan");
        }

        public static /* synthetic */ boolean r(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("12af3b71", new Object[]{eVar})).booleanValue();
            }
            return eVar.q;
        }

        public static /* synthetic */ SpannableString s(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SpannableString) ipChange.ipc$dispatch("e77a47aa", new Object[]{eVar});
            }
            return eVar.o;
        }

        @Override // tb.io1
        public int a(int i, int i2, int i3, int i4, int i5, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7492c478", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), paint})).intValue();
            }
            return (i2 + ((i4 - i2) / 2)) - (c(paint) / 2);
        }

        @Override // tb.io1
        public void b(Canvas canvas, CharSequence charSequence, int i, int i2, int i3, int i4, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5c1942", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), paint});
                return;
            }
            RichTextContainerComponent.access$402(RichTextContainerComponent.this, true);
            canvas.translate(i3, i4);
            this.p.m(canvas);
        }

        @Override // tb.io1
        public int c(Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1c35ab90", new Object[]{this, paint})).intValue();
            }
            return this.p.B().getHeight();
        }

        @Override // tb.io1
        public int e(Paint paint, CharSequence charSequence, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c6e89bbf", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2)})).intValue();
            }
            return this.p.B().getWidth();
        }

        @Override // tb.iu3.a
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                t(RichTextContainerComponent.access$500(RichTextContainerComponent.this));
            }
        }

        public SpannableString u() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SpannableString) ipChange.ipc$dispatch("8d4bc658", new Object[]{this});
            }
            return this.o;
        }

        public boolean v() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a18482ef", new Object[]{this})).booleanValue();
            }
            return this.q;
        }

        public final void t(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbcc87c0", new Object[]{this, nVar});
            } else if (nVar != null) {
                RichTextContainerComponent.access$000(RichTextContainerComponent.this, nVar, (String) nVar.H("onclick"));
                for (int i = 0; i < ((ArrayList) nVar.d).size(); i++) {
                    t((n) ((ArrayList) nVar.d).get(i));
                }
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.Component
    public ymt generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ymt) ipChange.ipc$dispatch("d956c9bf", new Object[]{this}) : new h();
    }

    private void parseDivSpannable(SpannableString spannableString, jfw jfwVar, n nVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9859b9cc", new Object[]{this, spannableString, jfwVar, nVar, new Integer(i), new Integer(i2)});
            return;
        }
        Drawable d2 = mx7.d(null, jfwVar);
        if (d2 != null) {
            io1 io1Var = new io1(this, d2, 0);
            setupBackgroundSpan(io1Var, jfwVar);
            spannableString.setSpan(io1Var, i, i2, 33);
        }
        if (jfwVar.F != 1) {
            spannableString.setSpan(new ForegroundColorSpan(jfwVar.F), i, i2, 33);
        }
        String str = (String) nVar.H("onclick");
        if (!TextUtils.isEmpty(str)) {
            this.hasClickEventHandler = true;
            spannableString.setSpan(new a(nVar, str), i, i2, 33);
        }
    }

    private void parseTextSpannable(SpannableString spannableString, ymt ymtVar, n nVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f6e7fbb", new Object[]{this, spannableString, ymtVar, nVar, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = ymtVar.C0;
        if (i3 == 1) {
            i3 = 0;
        }
        if (hasBackgroundDrawable(ymtVar)) {
            io1 io1Var = new io1(this, mx7.d(null, ymtVar), 0);
            setupBackgroundSpan(io1Var, ymtVar);
            spannableString.setSpan(io1Var, i, i2, 33);
        } else {
            if (ymtVar.k > 0 || ymtVar.l > 0) {
                io1 io1Var2 = new io1(this, ut2.b(0), 0);
                setupBackgroundSpan(io1Var2, ymtVar);
                spannableString.setSpan(io1Var2, i, i2, 33);
            } else if (i3 != 0) {
                spannableString.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            }
            if (ymtVar.z0) {
                spannableString.setSpan(new StyleSpan(1), i, i2, 33);
            }
        }
        float f2 = ymtVar.w0;
        if (f2 > 0.0f) {
            int U = (int) (f2 * this.node.P().U());
            spannableString.setSpan(new AbsoluteSizeSpan(U), i, i2, 33);
            if (getViewParams() != 0) {
                float f3 = U;
                if (f3 > ((ymt) getViewParams()).w0) {
                    ((ymt) getViewParams()).w0 = f3;
                }
            }
        }
        if (ymtVar.K0 != null) {
            io1[] io1VarArr = (io1[]) spannableString.getSpans(i, i2, io1.class);
            if (io1VarArr != null && io1VarArr.length > 0) {
                for (io1 io1Var3 : io1VarArr) {
                    io1Var3.q(ymtVar.K0);
                }
            } else if (pg1.ATOM_EXT_UDL_line_through.equals(ymtVar.K0)) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            } else if (pg1.ATOM_EXT_underline.equals(ymtVar.K0)) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
        }
        String str = (String) nVar.H("onclick");
        if (!TextUtils.isEmpty(str)) {
            this.hasClickEventHandler = true;
            spannableString.setSpan(new d(nVar, str, i3), i, i2, 33);
        }
    }

    private void setupImageSpan(SpannableString spannableString, n nVar, Drawable drawable, bqe bqeVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c697c7d", new Object[]{this, spannableString, nVar, drawable, bqeVar, new Integer(i), new Integer(i2)});
            return;
        }
        gg0 gg0Var = new gg0(drawable, 0, 0);
        gg0Var.g(bqeVar.k);
        gg0Var.h(bqeVar.l);
        gg0Var.a(bqeVar.J);
        gg0Var.d(bqeVar.E0);
        int i3 = bqeVar.f21973a;
        if (i3 >= 0) {
            gg0Var.j(i3);
        }
        int i4 = bqeVar.b;
        if (i4 >= 0) {
            gg0Var.e(i4);
        }
        if (getViewParams() != 0) {
            gg0Var.f(((ymt) getViewParams()).y0);
        }
        int i5 = bqeVar.K;
        if (i5 > 0 || bqeVar.L > 0 || bqeVar.M > 0 || bqeVar.N > 0) {
            float f2 = i5;
            float f3 = bqeVar.L;
            float f4 = bqeVar.N;
            float f5 = bqeVar.M;
            gg0Var.b(new float[]{f2, f2, f3, f3, f4, f4, f5, f5});
        }
        gg0Var.c(bqeVar.O);
        String str = (String) nVar.H(pg1.ATOM_EXT_UDL_vertical_align);
        if (str != null) {
            gg0Var.i(ir2.w(str));
        }
        String str2 = (String) nVar.H("onclick");
        synchronized (spannableString) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    this.hasClickEventHandler = true;
                    spannableString.setSpan(new c(nVar, str2), i, i2, 33);
                }
                spannableString.setSpan(gg0Var, i, i2, 33);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
