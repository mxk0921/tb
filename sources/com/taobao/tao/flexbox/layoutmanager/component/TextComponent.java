package com.taobao.tao.flexbox.layoutmanager.component;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import com.facebook.yoga.YogaNode;
import com.taobao.tao.flexbox.layoutmanager.component.d;
import com.taobao.tao.flexbox.layoutmanager.core.c;
import com.taobao.tao.flexbox.layoutmanager.core.e;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView;
import java.util.List;
import java.util.Map;
import tb.akt;
import tb.hfs;
import tb.hk8;
import tb.jfw;
import tb.nwv;
import tb.pg1;
import tb.rbi;
import tb.s6o;
import tb.skg;
import tb.slt;
import tb.t2o;
import tb.ut2;
import tb.xkt;
import tb.ymt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TextComponent extends c<View, ymt, xkt> implements skg, j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int lineCount;
    private float metaWidth;
    public slt textLayoutHelper;
    private YogaMeasureFunction measureFunction = new YogaMeasureFunction() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TextComponent.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("15b3ebfa", new Object[]{this, yogaNode, new Float(f), yogaMeasureMode, new Float(f2), yogaMeasureMode2})).longValue();
            }
            if (TextComponent.access$000(TextComponent.this) != null && !TextComponent.access$100(TextComponent.this).F0() && !TextComponent.access$200(TextComponent.this).D0() && !TextComponent.access$300(TextComponent.this, f, yogaMeasureMode)) {
                return YogaMeasureOutput.make((TextComponent.access$900(TextComponent.this).f27261a - ((ymt) TextComponent.access$1000(TextComponent.this)).g) - ((ymt) TextComponent.access$1100(TextComponent.this)).h, (TextComponent.access$1200(TextComponent.this).b - ((ymt) TextComponent.access$1300(TextComponent.this)).i) - ((ymt) TextComponent.access$1400(TextComponent.this)).j);
            }
            TextComponent.access$402(TextComponent.this, f);
            TextComponent textComponent = TextComponent.this;
            textComponent.setupLayoutHelper((ymt) TextComponent.access$500(textComponent), -1);
            TextComponent.this.textLayoutHelper.O(yogaMeasureMode, f);
            TextComponent textComponent2 = TextComponent.this;
            textComponent2.textLayoutHelper.Q(((ymt) TextComponent.access$600(textComponent2)).I0);
            if (TextUtils.isEmpty(((ymt) TextComponent.access$700(TextComponent.this)).I0) || TextComponent.this.textLayoutHelper.B() == null) {
                return YogaMeasureOutput.make(0, 0);
            }
            int i = ((ymt) TextComponent.access$800(TextComponent.this)).E0;
            if (TextComponent.this.textLayoutHelper.B().getLineCount() > i) {
                return YogaMeasureOutput.make(TextComponent.this.textLayoutHelper.F(), TextComponent.this.textLayoutHelper.B().getLineBottom(i - 1));
            }
            return YogaMeasureOutput.make(TextComponent.this.textLayoutHelper.F(), TextComponent.this.textLayoutHelper.p());
        }
    };
    private com.taobao.tao.flexbox.layoutmanager.core.b color = new a();
    private com.taobao.tao.flexbox.layoutmanager.core.b boxshadow = new b(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends com.taobao.tao.flexbox.layoutmanager.core.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TextComponent$2");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void c(e eVar, Object obj, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1bb4e98", new Object[]{this, eVar, obj, jfwVar, fVar});
            } else if (((ymt) TextComponent.access$1500(TextComponent.this)).C0 != 1) {
                if (obj instanceof TextView) {
                    ((TextView) obj).setTextColor(((ymt) TextComponent.access$1600(TextComponent.this)).C0);
                }
                if (obj instanceof StaticLayoutView) {
                    ((StaticLayoutView) obj).setTextColor(((ymt) TextComponent.access$1700(TextComponent.this)).C0);
                }
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void d(e eVar, Object[] objArr, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2604ed22", new Object[]{this, eVar, objArr, jfwVar, fVar});
            } else if (((ymt) TextComponent.access$1800(TextComponent.this)).C0 != 1 && objArr != null && objArr.length > 2) {
                Object obj = objArr[1];
                if (obj instanceof xkt) {
                    ((xkt) obj).g(((ymt) TextComponent.access$1900(TextComponent.this)).C0);
                }
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void j(n nVar, jfw jfwVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d67596e5", new Object[]{this, nVar, jfwVar, str, obj});
            } else if ((jfwVar instanceof ymt) && TextUtils.equals(str, "color")) {
                ((ymt) jfwVar).K(nVar.N(), obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends com.taobao.tao.flexbox.layoutmanager.core.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(TextComponent textComponent) {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TextComponent$3");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void c(e eVar, Object obj, jfw jfwVar, n.f fVar) {
            ymt ymtVar;
            jfw.a aVar;
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1bb4e98", new Object[]{this, eVar, obj, jfwVar, fVar});
            } else if ((jfwVar instanceof ymt) && (aVar = (ymtVar = (ymt) jfwVar).G) != null && (i = aVar.c) > 0 && (obj instanceof StaticLayoutView)) {
                ((StaticLayoutView) obj).setBoxShadow(i, aVar.f21974a, aVar.b, l(ymtVar));
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void d(e eVar, Object[] objArr, jfw jfwVar, n.f fVar) {
            ymt ymtVar;
            jfw.a aVar;
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2604ed22", new Object[]{this, eVar, objArr, jfwVar, fVar});
            } else if (objArr != null && objArr.length > 2) {
                Object obj = objArr[1];
                if ((obj instanceof xkt) && (jfwVar instanceof ymt) && (aVar = (ymtVar = (ymt) jfwVar).G) != null && (i = aVar.c) > 0) {
                    ((xkt) obj).c(i, aVar.f21974a, aVar.b, l(ymtVar));
                }
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void j(n nVar, jfw jfwVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d67596e5", new Object[]{this, nVar, jfwVar, str, obj});
            } else if ((jfwVar instanceof ymt) && TextUtils.equals(str, pg1.ATOM_EXT_UDL_box_shadow)) {
                ((ymt) jfwVar).s(nVar.N(), obj);
            }
        }

        public final int l(ymt ymtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2e219e38", new Object[]{this, ymtVar})).intValue();
            }
            int i = ymtVar.C0;
            int i2 = ymtVar.G.e;
            if (i2 != 0) {
                return i2;
            }
            return i;
        }
    }

    static {
        t2o.a(503316881);
        t2o.a(503317089);
        t2o.a(503317092);
    }

    public static /* synthetic */ rbi access$000(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rbi) ipChange.ipc$dispatch("80b4606e", new Object[]{textComponent});
        }
        return textComponent.measureResult;
    }

    public static /* synthetic */ n access$100(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("e67899d4", new Object[]{textComponent});
        }
        return textComponent.node;
    }

    public static /* synthetic */ jfw access$1000(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("650903b3", new Object[]{textComponent});
        }
        return textComponent.viewParams;
    }

    public static /* synthetic */ jfw access$1100(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("f17d4092", new Object[]{textComponent});
        }
        return textComponent.viewParams;
    }

    public static /* synthetic */ rbi access$1200(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rbi) ipChange.ipc$dispatch("f7bc6d5f", new Object[]{textComponent});
        }
        return textComponent.measureResult;
    }

    public static /* synthetic */ jfw access$1300(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("a65ba50", new Object[]{textComponent});
        }
        return textComponent.viewParams;
    }

    public static /* synthetic */ jfw access$1400(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("96d9f72f", new Object[]{textComponent});
        }
        return textComponent.viewParams;
    }

    public static /* synthetic */ jfw access$1500(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("234e340e", new Object[]{textComponent});
        }
        return textComponent.viewParams;
    }

    public static /* synthetic */ jfw access$1600(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("afc270ed", new Object[]{textComponent});
        }
        return textComponent.viewParams;
    }

    public static /* synthetic */ jfw access$1700(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("3c36adcc", new Object[]{textComponent});
        }
        return textComponent.viewParams;
    }

    public static /* synthetic */ jfw access$1800(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("c8aaeaab", new Object[]{textComponent});
        }
        return textComponent.viewParams;
    }

    public static /* synthetic */ jfw access$1900(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("551f278a", new Object[]{textComponent});
        }
        return textComponent.viewParams;
    }

    public static /* synthetic */ n access$200(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("3326c355", new Object[]{textComponent});
        }
        return textComponent.node;
    }

    public static /* synthetic */ boolean access$300(TextComponent textComponent, float f, YogaMeasureMode yogaMeasureMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d230ba0c", new Object[]{textComponent, new Float(f), yogaMeasureMode})).booleanValue();
        }
        return textComponent.measureModeChanged(f, yogaMeasureMode);
    }

    public static /* synthetic */ float access$402(TextComponent textComponent, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26ea4cb9", new Object[]{textComponent, new Float(f)})).floatValue();
        }
        textComponent.metaWidth = f;
        return f;
    }

    public static /* synthetic */ jfw access$500(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("56418b5d", new Object[]{textComponent});
        }
        return textComponent.viewParams;
    }

    public static /* synthetic */ jfw access$600(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("e2b5c83c", new Object[]{textComponent});
        }
        return textComponent.viewParams;
    }

    public static /* synthetic */ jfw access$700(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("6f2a051b", new Object[]{textComponent});
        }
        return textComponent.viewParams;
    }

    public static /* synthetic */ jfw access$800(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("fb9e41fa", new Object[]{textComponent});
        }
        return textComponent.viewParams;
    }

    public static /* synthetic */ rbi access$900(TextComponent textComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rbi) ipChange.ipc$dispatch("432e3cf7", new Object[]{textComponent});
        }
        return textComponent.measureResult;
    }

    public static /* synthetic */ Object ipc$super(TextComponent textComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1791440821:
                return new Boolean(super.setComponentAlpha(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).floatValue(), (List) objArr[2]));
            case -1500175553:
                super.applyAttrForDrawable((TextComponent) ((Drawable) objArr[0]), (Drawable) ((jfw) objArr[1]), (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -767938565:
                return super.getAttributeHandler((String) objArr[0]);
            case -703216504:
                super.applyAttrForView((TextComponent) ((View) objArr[0]), (View) ((jfw) objArr[1]), (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case 98971100:
                return new Boolean(super.canbeDrawable());
            case 978512890:
                return super.getContentDescription();
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TextComponent");
        }
    }

    private boolean isLayoutChanged(slt sltVar, ymt ymtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff2c0c9d", new Object[]{this, sltVar, ymtVar})).booleanValue();
        }
        if (!textEquals(sltVar.y(), ymtVar.I0) || ymtVar.x0 != sltVar.z()) {
            return true;
        }
        int i = ymtVar.C0;
        if ((i == 1 || i == sltVar.A()) && ymtVar.w0 == sltVar.C() && sltVar.E() != null && sltVar.E().equals(ymtVar.O0)) {
            return false;
        }
        return true;
    }

    private boolean measureModeChanged(float f, YogaMeasureMode yogaMeasureMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("937b1292", new Object[]{this, new Float(f), yogaMeasureMode})).booleanValue();
        }
        slt sltVar = this.textLayoutHelper;
        if (sltVar == null) {
            return false;
        }
        YogaMeasureMode s = sltVar.s();
        float r = this.textLayoutHelper.r();
        if (s == yogaMeasureMode && r == f) {
            return false;
        }
        return true;
    }

    private boolean textEquals(CharSequence charSequence, CharSequence charSequence2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("207c651f", new Object[]{this, charSequence, charSequence2})).booleanValue();
        }
        if (!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(charSequence2)) {
            return TextUtils.equals(charSequence, charSequence2);
        }
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.c
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        if (this.node.P().p0()) {
            return false;
        }
        return super.canbeDrawable();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.c, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        slt sltVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        V v = this.view;
        if (v != 0) {
            if (v instanceof StaticLayoutView) {
                ut2.A((StaticLayoutView) v);
            } else if (v instanceof TextView) {
                ut2.B((TextView) v);
                ((TextView) this.view).setMovementMethod(null);
            }
        }
        if (z && (sltVar = this.textLayoutHelper) != null) {
            sltVar.j();
            this.textLayoutHelper = null;
        }
        super.detach(z);
    }

    public void elementSetText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b09a7464", new Object[]{this, str});
            return;
        }
        n nVar = this.node;
        if (nVar != null) {
            nVar.g1("text", str);
            ((ymt) this.viewParams).I0 = str;
        }
        V v = this.view;
        if (v instanceof TextView) {
            ((TextView) v).setText(str);
            V v2 = this.view;
            if ((v2 instanceof EditText) && str != null) {
                ((EditText) v2).setSelection(str.length());
            }
        } else if (v instanceof StaticLayoutView) {
            ((StaticLayoutView) v).setText(str);
        }
    }

    public boolean ensureTextLayoutHelper(boolean z) {
        boolean z2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("483cfb6e", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        int i2 = -1;
        if (this.textLayoutHelper == null) {
            P p = this.viewParams;
            if (((ymt) p).f21973a < 0 || ((ymt) p).b < 0) {
                i = -1;
            } else {
                i = (this.measureResult.f27261a - ((ymt) p).g) - ((ymt) p).h;
            }
            setupLayoutHelper((ymt) p, i);
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !isLayoutChanged(this.textLayoutHelper, (ymt) this.viewParams) && this.textLayoutHelper.B() != null) {
            return false;
        }
        if (!z2) {
            P p2 = this.viewParams;
            if (((ymt) p2).f21973a >= 0 && ((ymt) p2).b >= 0) {
                i2 = (this.measureResult.f27261a - ((ymt) p2).g) - ((ymt) p2).h;
            }
            setupLayoutHelper((ymt) p2, i2);
        }
        this.textLayoutHelper.O(YogaMeasureMode.EXACTLY, this.node.S().f27261a);
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public com.taobao.tao.flexbox.layoutmanager.core.b getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.b) ipChange.ipc$dispatch("d23a2ffb", new Object[]{this, str});
        }
        if (akt.p2("enableOptTextAttr", true)) {
            if (TextUtils.equals(str, "color")) {
                return this.color;
            }
            if (TextUtils.equals(str, pg1.ATOM_EXT_UDL_box_shadow)) {
                return this.boxshadow;
            }
        }
        return super.getAttributeHandler(str);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public CharSequence getContentDescription() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("3a52ebfa", new Object[]{this});
        }
        CharSequence contentDescription = super.getContentDescription();
        if (contentDescription == null) {
            return ((ymt) this.viewParams).I0;
        }
        return contentDescription;
    }

    public int getLineCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7b394bf", new Object[]{this})).intValue();
        }
        return this.lineCount;
    }

    public int getLineSpacing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea7b9873", new Object[]{this})).intValue();
        }
        return ((ymt) this.viewParams).y0;
    }

    public String getText() {
        CharSequence y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        slt sltVar = this.textLayoutHelper;
        if (sltVar == null || (y = sltVar.y()) == null) {
            return null;
        }
        return y.toString();
    }

    public void layoutText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e0007e", new Object[]{this});
        } else {
            this.textLayoutHelper.Q(((ymt) this.viewParams).I0);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public YogaMeasureFunction onCreateMeasureFunction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaMeasureFunction) ipChange.ipc$dispatch("622da8f1", new Object[]{this});
        }
        return this.measureFunction;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        return false;
    }

    public void refreshText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1481572f", new Object[]{this});
            return;
        }
        if (ensureTextLayoutHelper(true)) {
            layoutText();
        }
        updateTextLayout();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.c, com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean setComponentAlpha(boolean z, float f, List<n> list) {
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9538c84b", new Object[]{this, new Boolean(z), new Float(f), list})).booleanValue();
        }
        boolean componentAlpha = super.setComponentAlpha(z, f, list);
        if (componentAlpha && (v = this.view) != 0) {
            if (!z) {
                f *= ((ymt) this.viewParams).T;
            }
            v.setAlpha(f);
        }
        return componentAlpha;
    }

    public void setFontSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec360be7", new Object[]{this, new Float(f)});
        } else {
            this.textLayoutHelper.U((float) (f * this.node.P().U()));
        }
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else if (this.textLayoutHelper != null) {
            this.node.g1("text", str);
            n L = this.node.L();
            L.K0();
            L.b1(this.view.getContext());
        }
    }

    public void setupLayoutHelper(ymt ymtVar, int i) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc184bf7", new Object[]{this, ymtVar, new Integer(i)});
            return;
        }
        if (this.textLayoutHelper == null) {
            this.textLayoutHelper = new slt(this);
        }
        if (akt.k()) {
            rbi rbiVar = this.measureResult;
            if (rbiVar != null) {
                i3 = rbiVar.b;
            } else {
                i3 = -1;
            }
            this.textLayoutHelper.V(ymtVar.P0, ymtVar.Q0, ymtVar.w0, i, i3);
        } else {
            float f = ymtVar.w0;
            if (f > 0.0f) {
                setFontSize(f);
            }
        }
        jfw.a aVar = ymtVar.G;
        if (aVar != null && (i2 = aVar.c) > 0) {
            int i4 = ymtVar.C0;
            int i5 = aVar.e;
            if (i5 != 0) {
                i4 = i5;
            }
            this.textLayoutHelper.P(i2, aVar.f21974a, aVar.b, i4);
        }
        this.textLayoutHelper.N(ymtVar.E0);
        this.textLayoutHelper.M(ymtVar.y0);
        this.textLayoutHelper.R(ymtVar.x0);
        this.textLayoutHelper.J(ymtVar.F0);
        this.textLayoutHelper.L(!((ymt) this.viewParams).J0);
        slt sltVar = this.textLayoutHelper;
        ymt ymtVar2 = (ymt) this.viewParams;
        sltVar.W(ymtVar2.O0, ymtVar2.B0);
        if (isDrawable()) {
            this.textLayoutHelper.I((int) (ymtVar.T * 255.0f));
        }
        int i6 = ymtVar.C0;
        if (i6 != 1) {
            this.textLayoutHelper.S(i6);
        }
        this.textLayoutHelper.T(((ymt) this.viewParams).K0);
        this.textLayoutHelper.K(i);
    }

    public void updateTextLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeff98e7", new Object[]{this});
            return;
        }
        V v = this.view;
        if (v instanceof StaticLayoutView) {
            ((StaticLayoutView) v).setLayout(this.textLayoutHelper);
            return;
        }
        Drawable[] drawableArr = this.drawable;
        if (drawableArr != null && drawableArr.length > 1) {
            Drawable drawable = drawableArr[1];
            if (drawable instanceof xkt) {
                ((xkt) drawable).h(this.textLayoutHelper);
            }
        }
    }

    public void applyAttrForDrawable(xkt xktVar, ymt ymtVar, Map map, boolean z) {
        d.a[] aVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8bc38a", new Object[]{this, xktVar, ymtVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForDrawable((TextComponent) xktVar, (xkt) ymtVar, map, z);
        rbi rbiVar = this.measureResult;
        xktVar.setBounds(0, 0, rbiVar.f27261a, rbiVar.b);
        xktVar.d(ymtVar.g, ymtVar.i, ymtVar.h, ymtVar.j);
        xktVar.f(ymtVar.x0);
        if (ensureTextLayoutHelper(false)) {
            layoutText();
        }
        xktVar.h(this.textLayoutHelper);
        if (this instanceof d) {
            CharSequence charSequence = ymtVar.I0;
            if ((charSequence instanceof Spanned) && (aVarArr = (d.a[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), d.a.class)) != null) {
                for (d.a aVar : aVarArr) {
                    aVar.c(xktVar);
                }
            }
        }
        this.lineCount = xktVar.b();
    }

    public void applyAttrForView(View view, ymt ymtVar, Map map, boolean z) {
        d.a[] aVarArr;
        slt sltVar;
        TextView textView;
        int selectionStart;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a2bc5b", new Object[]{this, view, ymtVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView((TextComponent) view, (View) ymtVar, map, z);
        boolean z2 = view instanceof TextView;
        if (z2) {
            TextView textView2 = (TextView) view;
            float f = ymtVar.w0;
            if (f > 0.0f) {
                textView2.setTextSize(0, f);
            }
            int i = ymtVar.C0;
            if (i != 1) {
                textView2.setTextColor(i);
            }
            textView2.setGravity(ymtVar.x0);
            if (ymtVar.z0 && !ymtVar.J0) {
                textView2.setTypeface(Typeface.DEFAULT_BOLD);
            }
            TextUtils.TruncateAt truncateAt = ymtVar.F0;
            if (truncateAt != null) {
                textView2.setEllipsize(truncateAt);
            }
            int i2 = ymtVar.E0;
            if (i2 != Integer.MAX_VALUE) {
                textView2.setMaxLines(i2);
            }
            int i3 = ymtVar.y0;
            if (i3 > 0) {
                textView2.setLineSpacing(i3, 1.0f);
            }
            textView2.setTypeface(ymtVar.O0, ymtVar.B0);
            int i4 = ymtVar.D0;
            if (i4 != 1) {
                textView2.setHintTextColor(i4);
            }
        }
        if (ymtVar.I0 != null) {
            if (z2) {
                if (!akt.p2("enableFixInputIme", true) || ((TextView) view).getText() != ymtVar.I0) {
                    ((TextView) view).setText(ymtVar.I0);
                }
                if ((view instanceof EditText) && (selectionStart = (textView = (TextView) view).getSelectionStart()) == textView.getSelectionEnd()) {
                    ((EditText) view).setSelection(Math.min(selectionStart, ymtVar.I0.length()));
                }
            } else if (!considerLayoutAnimation() || (sltVar = this.textLayoutHelper) == null || sltVar.C() == ymtVar.w0 || !TextUtils.equals(this.textLayoutHelper.y(), ymtVar.I0)) {
                if (ensureTextLayoutHelper(false)) {
                    layoutText();
                }
                StaticLayoutView staticLayoutView = (StaticLayoutView) view;
                staticLayoutView.setTextAlign(ymtVar.x0);
                staticLayoutView.setLayout(this.textLayoutHelper);
            } else {
                Animator i5 = hfs.i(this, this.textLayoutHelper.C(), ymtVar.w0);
                i5.setDuration(150L);
                i5.start();
            }
            if (this instanceof d) {
                CharSequence charSequence = ymtVar.I0;
                if ((charSequence instanceof Spanned) && (aVarArr = (d.a[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), d.a.class)) != null) {
                    for (d.a aVar : aVarArr) {
                        aVar.d(view);
                    }
                }
            }
        }
        if (z2) {
            this.lineCount = ((TextView) view).getLineCount();
            return;
        }
        slt sltVar2 = this.textLayoutHelper;
        if (sltVar2 != null) {
            this.lineCount = sltVar2.q();
        } else {
            this.lineCount = 0;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public ymt generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ymt) ipChange.ipc$dispatch("d956c9bf", new Object[]{this}) : new ymt();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.c
    public xkt onCreateDrawable(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xkt) ipChange.ipc$dispatch("cb59d86a", new Object[]{this, context}) : ut2.l();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        StaticLayoutView k = ut2.k(context);
        k.enableNewMarquee(false, null);
        n nVar = this.node;
        k.setScrollAmount(s6o.U(nVar, context, nwv.r(nVar.H("scrollamount"), 6)));
        n nVar2 = this.node;
        k.setMarqueeScrollGap(s6o.U(nVar2, context, nwv.t(nVar2.H("scrollgap"), 0)));
        k.setLoopCount(nwv.t(this.node.H("loop"), -1));
        k.setLoopDelay(nwv.t(this.node.H("delay"), 0));
        k.setDirection(nwv.I(this.node.H("direction"), "left"));
        return k;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleMessage(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
        }
        String str = gVar.d;
        str.hashCode();
        if (str.equals("onwilldisappear")) {
            V v = this.view;
            if (v instanceof StaticLayoutView) {
                ((StaticLayoutView) v).stopMarquee();
            }
        } else if (str.equals("onwillappear")) {
            V v2 = this.view;
            if (v2 instanceof StaticLayoutView) {
                ((StaticLayoutView) v2).startMarquee();
            }
        }
        return false;
    }
}
