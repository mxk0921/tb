package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXRichTextLinkEvent;
import com.taobao.android.dinamicx.view.richtext.DXNativeRichText;
import com.taobao.android.dinamicx.view.richtext.node.RichText;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.schedule.ViewProxy;
import java.util.ArrayList;
import java.util.List;
import tb.meo;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class eb6 extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TEXT_COLOR = -16777216;
    public static final long DXRICHTEXT_BASELINE = 1445754069157927243L;
    public static final int DXRICHTEXT_BASELINE_BOTTOM = 0;
    public static final int DXRICHTEXT_BASELINE_DESCENT = 3;
    public static final int DXRICHTEXT_BASELINE_MIDDLE = 1;
    public static final int DXRICHTEXT_BASELINE_TOP = 2;
    public static final long DXRICHTEXT_ENABLECUSTOMTRUNCATION = -7904255114002670305L;
    public static final long DXRICHTEXT_ENABLEELLIPSIZEENDFIX_ANDROID = -7798689015804333677L;
    public static final long DXRICHTEXT_ENABLELINEBREAKMODECHAR = -3815747705576429330L;
    public static final long DXRICHTEXT_ENABLETEXTSIZESTRATEGY = 4822617398935994384L;
    public static final long DXRICHTEXT_EXPANDED = 2355535793353806417L;
    public static final long DXRICHTEXT_EXPANDLINES = 8720999726396813958L;
    public static final long DXRICHTEXT_FIRSTLINEHEADINDENT = 4761283217210504855L;
    public static final long DXRICHTEXT_FIRSTLINEHEADINDENTAP = 2302980643468677162L;
    public static final long DXRICHTEXT_FONT = 34149272427L;
    public static final long DXRICHTEXT_FORCEORIGINAL = -6490331624039946159L;
    public static final long DXRICHTEXT_IGNOREUNTRUNCATEDTAP = 867831422994583882L;
    public static final long DXRICHTEXT_ISBOLD = 9423384817756195L;
    public static final long DXRICHTEXT_ISITALIC = 3527554185889034042L;
    public static final int DXRICHTEXT_LABEL_TRUNCATION_BE_REMOVED = 2;
    public static final int DXRICHTEXT_LABEL_TRUNCATION_COMPLETE_DISPLAY = 1;
    public static final int DXRICHTEXT_LABEL_TRUNCATION_NO_TRIGGER = 0;
    public static final long DXRICHTEXT_LINEBREAKMODE = 1650157837879951391L;
    public static final int DXRICHTEXT_LINEBREAKMODE_CHAR = 4;
    public static final int DXRICHTEXT_LINEBREAKMODE_END = 3;
    public static final int DXRICHTEXT_LINEBREAKMODE_MIDDLE = 2;
    public static final int DXRICHTEXT_LINEBREAKMODE_NONE = 0;
    public static final int DXRICHTEXT_LINEBREAKMODE_START = 1;
    public static final long DXRICHTEXT_LINEHEIGHT = 6086495633913771275L;
    public static final long DXRICHTEXT_LINESPACING = -2369181291898902408L;
    public static final long DXRICHTEXT_LINK = 35873943762L;
    public static final long DXRICHTEXT_MAXHEIGHT = -2628143228636041048L;
    public static final long DXRICHTEXT_MAXLINES = 4685059187929305417L;
    public static final long DXRICHTEXT_MAXWIDTH = 4685059378591825230L;
    public static final long DXRICHTEXT_ONLINK = 9859228430928305L;
    public static final long DXRICHTEXT_ONPRESS = 5176476879387311985L;
    public static final long DXRICHTEXT_PRESS = 19050239308914L;
    public static final long DXRICHTEXT_RICHTEXT = -3256835378505648333L;
    public static final long DXRICHTEXT_SHADOWCOLOR = -7272671779511765872L;
    public static final long DXRICHTEXT_SHADOWOFFSET = -946588628814454279L;
    public static final long DXRICHTEXT_SHADOWRADIUS = -946376925464026374L;
    public static final long DXRICHTEXT_SHRINKLINES = 5091055928078111125L;
    public static final long DXRICHTEXT_STRIKETHROUGHCOLOR = -5920401438808043356L;
    public static final long DXRICHTEXT_STRIKETHROUGHSTYLE = -5902081368050436426L;
    public static final int DXRICHTEXT_STRIKETHROUGHSTYLE_DOUBLE = 3;
    public static final int DXRICHTEXT_STRIKETHROUGHSTYLE_NONE = 0;
    public static final int DXRICHTEXT_STRIKETHROUGHSTYLE_SINGLE = 1;
    public static final int DXRICHTEXT_STRIKETHROUGHSTYLE_THICK = 2;
    public static final long DXRICHTEXT_TAILINDENT = 4447194305819364374L;
    public static final long DXRICHTEXT_TEXTCOLOR = 5737767606580872653L;
    public static final long DXRICHTEXT_TEXTGRAVITY = -1564827143683948874L;
    public static final int DXRICHTEXT_TEXTGRAVITY_CENTER = 1;
    public static final int DXRICHTEXT_TEXTGRAVITY_LEFT = 0;
    public static final int DXRICHTEXT_TEXTGRAVITY_RIGHT = 2;
    public static final long DXRICHTEXT_TEXTSIZE = 6751005219504497256L;
    public static final long DXRICHTEXT_UNDERLINECOLOR = 2436253123551448787L;
    public static final long DXRICHTEXT_UNDERLINESTYLE = 2437398193491227877L;
    public static final int DXRICHTEXT_UNDERLINESTYLE_DOUBLE = 3;
    public static final int DXRICHTEXT_UNDERLINESTYLE_NONE = 0;
    public static final int DXRICHTEXT_UNDERLINESTYLE_SINGLE = 1;
    public static final int DXRICHTEXT_UNDERLINESTYLE_THICK = 2;
    public static final long DXRICHTEXT_WORDKERN = 7645877425838446932L;
    public int b;
    public String c;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public meo j;
    public short m;
    public e n;
    public static int o = 0;
    public static final CharSequence ELLIPSIS_TEXT = "…";
    public static final short p = 1;
    public static final short q = 2;
    public static final short r = 4;
    public static final short s = 8;
    public static final short t = 16;
    public static final short u = 32;
    public static final short v = 64;

    /* renamed from: a  reason: collision with root package name */
    public int f18436a = 0;
    public boolean k = false;
    public int l = 0;
    public int C0 = 0;
    public Integer d = -16777216;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                eb6.t(eb6.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                eb6.u(eb6.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            eb6.v(eb6.this);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597672);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new eb6();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public double f18440a;
        public int b;
        public String c;
        public String f;
        public int i;
        public JSONArray j;
        public double k;
        public int l;
        public Integer n;
        public double p;
        public double d = -1.0d;
        public double e = -1.0d;
        public int g = Integer.MAX_VALUE;
        public int h = Integer.MAX_VALUE;
        public int m = 0;
        public int o = 0;

        static {
            t2o.a(444597673);
        }

        public e() {
        }

        public e a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("834b3498", new Object[]{this});
            }
            e eVar = new e();
            eVar.f18440a = this.f18440a;
            eVar.b = this.b;
            eVar.c = this.c;
            eVar.d = this.d;
            eVar.e = this.e;
            eVar.f = this.f;
            eVar.g = this.g;
            eVar.h = this.h;
            eVar.i = this.i;
            eVar.j = this.j;
            eVar.k = this.k;
            eVar.l = this.l;
            eVar.m = this.m;
            eVar.n = this.n;
            eVar.o = this.o;
            eVar.p = this.p;
            return eVar;
        }
    }

    public eb6() {
        this.b = 0;
        this.e = 0;
        if (o == 0 && DinamicXEngine.x() != null) {
            o = pb6.f(DinamicXEngine.x(), 12.0f);
        }
        this.f = o;
        this.b = -1;
        this.e = 0;
        f0(r);
        f0(t);
    }

    public static /* synthetic */ Object ipc$super(eb6 eb6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/richtext/DXRichTextWidgetNode");
        }
    }

    public static /* synthetic */ void t(eb6 eb6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36124bd5", new Object[]{eb6Var});
        } else {
            eb6Var.a0();
        }
    }

    public static /* synthetic */ void u(eb6 eb6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1e32d6", new Object[]{eb6Var});
        } else {
            eb6Var.c0();
        }
    }

    public static /* synthetic */ void v(eb6 eb6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b3600d8", new Object[]{eb6Var});
        } else {
            eb6Var.b0();
        }
    }

    public int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a69e703", new Object[]{this})).intValue();
        }
        e eVar = this.n;
        if (eVar == null) {
            return 0;
        }
        return eVar.b;
    }

    public void A0(short s2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d84d487", new Object[]{this, new Short(s2)});
        } else {
            this.m = (short) ((~s2) & this.m);
        }
    }

    public final List<DXWidgetNode> B(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f74862b4", new Object[]{this, dXWidgetNode});
        }
        ArrayList arrayList = new ArrayList();
        if (dXWidgetNode == null) {
            return arrayList;
        }
        List<DXWidgetNode> children = dXWidgetNode.getChildren();
        if (children != null && !children.isEmpty()) {
            for (DXWidgetNode dXWidgetNode2 : children) {
                if (dXWidgetNode2.getVisibility() != 2) {
                    if (dXWidgetNode2 instanceof ny5) {
                        arrayList.addAll(B(dXWidgetNode2));
                    } else {
                        arrayList.add(dXWidgetNode2);
                    }
                }
            }
        }
        return arrayList;
    }

    public int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f698da1", new Object[]{this})).intValue();
        }
        return this.l;
    }

    public double D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e80b2226", new Object[]{this})).doubleValue();
        }
        e eVar = this.n;
        if (eVar == null) {
            return -1.0d;
        }
        return eVar.d;
    }

    public double E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea7b986e", new Object[]{this})).doubleValue();
        }
        e eVar = this.n;
        if (eVar == null) {
            return -1.0d;
        }
        return eVar.e;
    }

    public String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c509bc89", new Object[]{this});
        }
        e eVar = this.n;
        if (eVar == null) {
            return null;
        }
        return eVar.f;
    }

    public int G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d041faef", new Object[]{this})).intValue();
        }
        e eVar = this.n;
        if (eVar == null) {
            return Integer.MAX_VALUE;
        }
        return eVar.g;
    }

    public final int H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e7fc00c", new Object[]{this})).intValue();
        }
        int i = this.f18436a;
        if (i == 0) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 3) {
            return 3;
        }
        return 0;
    }

    public final int I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d66a785", new Object[]{this})).intValue();
        }
        int Q = Q();
        if (Q == 1) {
            return 1;
        }
        if (Q == 3) {
            return 3;
        }
        if (Q == 2) {
            return 2;
        }
        return 0;
    }

    public final int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcfd9d8e", new Object[]{this})).intValue();
        }
        int i = this.e;
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        return 0;
    }

    public final int K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5c3062c", new Object[]{this})).intValue();
        }
        int S = S();
        if (S == 1) {
            return 1;
        }
        if (S == 3) {
            return 3;
        }
        if (S == 2) {
            return 2;
        }
        return 0;
    }

    public int L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ac1f5a", new Object[]{this})).intValue();
        }
        if (W() || this.b != 4) {
            return this.b;
        }
        return 0;
    }

    public int M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6fd606e7", new Object[]{this})).intValue();
        }
        e eVar = this.n;
        if (eVar == null) {
            return 0;
        }
        return eVar.i;
    }

    public JSONArray N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("661753ee", new Object[]{this});
        }
        e eVar = this.n;
        if (eVar == null) {
            return null;
        }
        return eVar.j;
    }

    public double O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bf92cbd", new Object[]{this})).doubleValue();
        }
        e eVar = this.n;
        if (eVar == null) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        return eVar.k;
    }

    public int P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("586e5fc0", new Object[]{this})).intValue();
        }
        e eVar = this.n;
        if (eVar == null) {
            return 0;
        }
        return eVar.l;
    }

    public int Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4df6770e", new Object[]{this})).intValue();
        }
        e eVar = this.n;
        if (eVar == null) {
            return 0;
        }
        return eVar.m;
    }

    public Integer R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("c8aa351b", new Object[]{this});
        }
        e eVar = this.n;
        if (eVar == null) {
            return null;
        }
        return eVar.n;
    }

    public int S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdb20235", new Object[]{this})).intValue();
        }
        e eVar = this.n;
        if (eVar == null) {
            return 0;
        }
        return eVar.o;
    }

    public double T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d994a2b", new Object[]{this})).doubleValue();
        }
        e eVar = this.n;
        if (eVar == null) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        return eVar.p;
    }

    public boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42a09bda", new Object[]{this})).booleanValue();
        }
        short s2 = this.m;
        short s3 = p;
        if ((s2 & s3) == s3) {
            return true;
        }
        return false;
    }

    public boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("debf79b5", new Object[]{this})).booleanValue();
        }
        return y(v);
    }

    public boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14c89f62", new Object[]{this})).booleanValue();
        }
        return y(u);
    }

    public boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8470805d", new Object[]{this})).booleanValue();
        }
        return y(t);
    }

    public boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("761c9a65", new Object[]{this})).booleanValue();
        }
        return y(s);
    }

    public boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48b52385", new Object[]{this})).booleanValue();
        }
        short s2 = this.m;
        short s3 = q;
        if ((s2 & s3) == s3) {
            return true;
        }
        return false;
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec35ca80", new Object[]{this});
            return;
        }
        DXRichTextLinkEvent dXRichTextLinkEvent = new DXRichTextLinkEvent(9859228430928305L);
        dXRichTextLinkEvent.setLink(F());
        postEvent(dXRichTextLinkEvent);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513026fe", new Object[]{this, new Integer(i)});
        } else {
            this.C0 = i;
        }
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6134112f", new Object[]{this});
        } else {
            postEvent(new DXEvent(-6544685697300501093L));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new eb6();
    }

    public final void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3bebbcb", new Object[]{this});
        } else if (!Y() || this.j.v()) {
            postEvent(new DXEvent(18903999933159L));
        }
    }

    public void e0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f78186", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.m = (short) (this.m | p);
        } else {
            this.m = (short) (this.m & (~p));
        }
    }

    public void f0(short s2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("addb17ee", new Object[]{this, new Short(s2)});
        } else {
            this.m = (short) (s2 | this.m);
        }
    }

    public void g0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6370507b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            f0(v);
        } else {
            A0(v);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j == DXRICHTEXT_LINEHEIGHT || j == -2369181291898902408L) {
            return -1.0d;
        }
        return super.getDefaultValueForDoubleAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXRICHTEXT_BASELINE || j == DXRICHTEXT_ENABLECUSTOMTRUNCATION || j == 1650157837879951391L || j == -5902081368050436426L || j == 2437398193491227877L) {
            return 0;
        }
        if (j == 5737767606580872653L) {
            return -16777216;
        }
        if (j == 4822617398935994384L) {
            return 1;
        }
        if (j == 6751005219504497256L) {
            return o;
        }
        if (j == DXRICHTEXT_FORCEORIGINAL) {
            return 1;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    public String getFont() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ea4d754", new Object[]{this});
        }
        e eVar = this.n;
        if (eVar == null) {
            return null;
        }
        return eVar.c;
    }

    public int getMaxWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f83cb2", new Object[]{this})).intValue();
        }
        e eVar = this.n;
        if (eVar == null) {
            return Integer.MAX_VALUE;
        }
        return eVar.h;
    }

    public void h0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b2a6e", new Object[]{this, new Boolean(z)});
        } else if (z) {
            f0(u);
        } else {
            A0(u);
        }
    }

    public void i0(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c708889", new Object[]{this, new Double(d2)});
            return;
        }
        r0();
        this.n.f18440a = d2;
    }

    @Override // com.taobao.android.dinamicx.widget.j
    public boolean isDisableFlatten() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e18ffb51", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean isEnableTextSizeStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9368a359", new Object[]{this})).booleanValue();
        }
        return y(r);
    }

    public void j0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29223ff", new Object[]{this, new Integer(i)});
            return;
        }
        r0();
        this.n.b = i;
    }

    public void k0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1798ed3", new Object[]{this, new Boolean(z)});
        } else if (z) {
            f0(t);
        } else {
            A0(t);
        }
    }

    public void l0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f2c45b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            f0(s);
        } else {
            A0(s);
        }
    }

    public void m0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92371d3b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.m = (short) (this.m | q);
        } else {
            this.m = (short) (this.m & (~q));
        }
    }

    public void n0(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50301e7a", new Object[]{this, new Double(d2)});
            return;
        }
        r0();
        this.n.d = d2;
    }

    public void o0(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f46cca", new Object[]{this, new Double(d2)});
            return;
        }
        r0();
        this.n.e = d2;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else if (j == 9859228430928305L && !TextUtils.isEmpty(F())) {
            ViewProxy.setOnClickListener(view, new a());
        } else if (j == 5176476879387311985L && !TextUtils.isEmpty(this.c)) {
        } else {
            if (j == 18903999933159L) {
                ViewProxy.setOnClickListener(view, new b());
            } else if (j == -6544685697300501093L) {
                ViewProxy.setOnLongClickListener(view, new c());
            } else {
                super.onBindEvent(context, view, j);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof eb6)) {
            super.onClone(dXWidgetNode, z);
            eb6 eb6Var = (eb6) dXWidgetNode;
            this.n = eb6Var.n;
            this.f18436a = eb6Var.f18436a;
            this.b = eb6Var.b;
            this.c = eb6Var.c;
            this.d = eb6Var.d;
            this.e = eb6Var.e;
            this.f = eb6Var.f;
            this.h = eb6Var.h;
            this.g = eb6Var.g;
            this.i = eb6Var.i;
            this.j = eb6Var.j;
            this.m = eb6Var.m;
            this.l = eb6Var.l;
            this.C0 = eb6Var.C0;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        DXNativeRichText dXNativeRichText = new DXNativeRichText(context);
        ic5.i(dXNativeRichText);
        return dXNativeRichText;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndParser() {
        DXEngineConfig c2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4ccc2", new Object[]{this});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        List<DXWidgetNode> B = B(this);
        boolean isEnableTextSizeStrategy = isEnableTextSizeStrategy();
        for (int i = 0; i < B.size(); i++) {
            DXWidgetNode dXWidgetNode = B.get(i);
            if (dXWidgetNode.getVisibility() != 2 && (dXWidgetNode instanceof ei6)) {
                ei6 ei6Var = (ei6) dXWidgetNode;
                if (isEnableTextSizeStrategy && ei6Var.isEnableTextSizeStrategy() && ei6Var.E() > 0) {
                    ei6Var.U((int) vu5.b(dXRuntimeContext, ei6Var.E()));
                }
                if (!isEnableTextSizeStrategy || !ei6Var.isEnableTextSizeStrategy()) {
                    z = false;
                } else {
                    z = true;
                }
                ei6Var.setEnableTextSizeStrategy(z);
            }
        }
        if (isEnableTextSizeStrategy && dXRuntimeContext != null && (c2 = dXRuntimeContext.s().c()) != null && c2.E()) {
            this.f = (int) vu5.b(dXRuntimeContext, this.f);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        d0();
        meo.b A = this.j.A(i, i2);
        this.l = this.j.j();
        if (A == null) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(A.b(), A.a());
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view instanceof DXNativeRichText) {
            DXNativeRichText dXNativeRichText = (DXNativeRichText) view;
            dXNativeRichText.setRichTextRender(this.j);
            w();
            ic5.k(dXNativeRichText);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d2)});
        } else if (j == DXRICHTEXT_FIRSTLINEHEADINDENT) {
            i0(d2);
        } else if (j == DXRICHTEXT_LINEHEIGHT) {
            n0(d2);
        } else if (j == -2369181291898902408L) {
            o0(d2);
        } else if (j == -946376925464026374L) {
            u0(d2);
        } else if (j == DXRICHTEXT_WORDKERN) {
            z0(d2);
        } else {
            super.onSetDoubleAttribute(j, d2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXRICHTEXT_BASELINE) {
            this.f18436a = i;
        } else if (j == DXRICHTEXT_EXPANDLINES) {
            this.g = i;
        } else if (j == DXRICHTEXT_EXPANDED) {
            if (i == 0) {
                z = false;
            }
            this.h = z;
        } else if (j == DXRICHTEXT_SHRINKLINES) {
            this.i = i;
        } else if (j == 9423384817756195L) {
            if (i == 0) {
                z = false;
            }
            e0(z);
        } else if (j == 3527554185889034042L) {
            if (i == 0) {
                z = false;
            }
            m0(z);
        } else if (j == 1650157837879951391L) {
            this.b = i;
        } else if (j == DXRICHTEXT_MAXHEIGHT) {
            q0(i);
        } else if (j == DXRICHTEXT_MAXWIDTH) {
            setMaxWidth(i);
        } else if (j == -7272671779511765872L) {
            s0(i);
        } else if (j == -5920401438808043356L) {
            v0(i);
        } else if (j == -5902081368050436426L) {
            w0(i);
        } else if (j == 5737767606580872653L) {
            this.d = Integer.valueOf(i);
        } else if (j == -1564827143683948874L) {
            this.e = i;
        } else if (j == 6751005219504497256L) {
            this.f = i;
        } else if (j == 2436253123551448787L) {
            x0(Integer.valueOf(i));
        } else if (j == 2437398193491227877L) {
            y0(i);
        } else if (j == 4822617398935994384L) {
            if (i == 0) {
                z = false;
            }
            setEnableTextSizeStrategy(z);
        } else if (j == DXRICHTEXT_IGNOREUNTRUNCATEDTAP) {
            if (i == 0) {
                z = false;
            }
            l0(z);
        } else if (j == DXRICHTEXT_FORCEORIGINAL) {
            if (i == 0) {
                z = false;
            }
            k0(z);
        } else if (j == DXRICHTEXT_FIRSTLINEHEADINDENTAP) {
            j0(i);
        } else if (j == DXRICHTEXT_ENABLELINEBREAKMODECHAR) {
            if (i == 0) {
                z = false;
            }
            h0(z);
        } else if (j == -7798689015804333677L) {
            if (i == 0) {
                z = false;
            }
            g0(z);
        } else if (j == DXRICHTEXT_TAILINDENT) {
            b(i);
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == -946588628814454279L) {
            t0(jSONArray);
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 34149272427L) {
            setFont(str);
        } else if (j == 35873943762L) {
            p0(str);
        } else if (j == 19050239308914L) {
            this.c = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public void p0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ad150d", new Object[]{this, str});
            return;
        }
        r0();
        this.n.f = str;
    }

    public void q0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff43f93", new Object[]{this, new Integer(i)});
            return;
        }
        r0();
        this.n.g = i;
    }

    public void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d4d85d", new Object[]{this});
            return;
        }
        e eVar = this.n;
        if (eVar == null) {
            this.n = new e();
            this.k = true;
        } else if (!this.k) {
            this.n = eVar.a();
            this.k = true;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 50;
    }

    public void s0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee7df9b", new Object[]{this, new Integer(i)});
            return;
        }
        r0();
        this.n.i = i;
    }

    public void setEnableTextSizeStrategy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72cf07e7", new Object[]{this, new Boolean(z)});
        } else if (z) {
            f0(r);
        } else {
            A0(r);
        }
    }

    public void setFont(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7553a2", new Object[]{this, str});
            return;
        }
        r0();
        this.n.c = str;
    }

    public void setMaxWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e63498", new Object[]{this, new Integer(i)});
            return;
        }
        r0();
        this.n.h = i;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void t0(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d323a84", new Object[]{this, jSONArray});
            return;
        }
        r0();
        this.n.j = jSONArray;
    }

    public void u0(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2d9c3", new Object[]{this, new Double(d2)});
            return;
        }
        r0();
        this.n.k = d2;
    }

    public void v0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8df24a", new Object[]{this, new Integer(i)});
            return;
        }
        r0();
        this.n.l = i;
    }

    public final void w() {
        DXWidgetNode dXWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c758602", new Object[]{this});
        } else if (zg5.N4()) {
            try {
                List<DXWidgetNode> B = B(this);
                if (!B.isEmpty()) {
                    for (int i = 0; i < B.size(); i++) {
                        DXWidgetNode dXWidgetNode2 = B.get(i);
                        if (((dXWidgetNode2 instanceof ei6) || (dXWidgetNode2 instanceof y06)) && zg5.b4(dXWidgetNode2)) {
                            if (!dXWidgetNode2.isFlatten()) {
                                dXWidgetNode = dXWidgetNode2.getReferenceNode();
                            } else {
                                dXWidgetNode = dXWidgetNode2;
                            }
                            if (dXWidgetNode != null) {
                                dXWidgetNode.bindEvent(dXWidgetNode2.getDXRuntimeContext().h());
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                xv5.b(e2);
            }
        }
    }

    public void w0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8708c4bc", new Object[]{this, new Integer(i)});
            return;
        }
        r0();
        this.n.m = i;
    }

    public final RichText x() {
        y06 y06Var;
        ane t2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RichText) ipChange.ipc$dispatch("3f64992f", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        List<DXWidgetNode> B = B(this);
        for (int i = 0; i < B.size(); i++) {
            DXWidgetNode dXWidgetNode = B.get(i);
            if (dXWidgetNode.getVisibility() != 2) {
                if (dXWidgetNode instanceof ei6) {
                    ei6 ei6Var = (ei6) dXWidgetNode;
                    gmt t3 = ei6Var.t();
                    if (t3 != null) {
                        if (!ei6Var.I()) {
                            if (ei6Var.F() == 1 && this.b == 3 && !this.j.i()) {
                                this.j.L(true);
                                RichText richText = new RichText();
                                richText.addAll(arrayList);
                                this.j.X(richText);
                            }
                            arrayList.add(t3);
                        } else if (!this.h) {
                            RichText richText2 = new RichText();
                            richText2.add(t3);
                            this.j.G(richText2.renderText());
                            this.b = 3;
                            this.j.R(3);
                        }
                        sb.append(t3.getText());
                    }
                } else if ((dXWidgetNode instanceof y06) && (t2 = (y06Var = (y06) dXWidgetNode).t(true, X())) != null) {
                    if (!y06Var.u()) {
                        arrayList.add(t2);
                    } else if (!this.h) {
                        RichText richText3 = new RichText();
                        richText3.add(t2);
                        this.j.G(richText3.renderText());
                        this.b = 3;
                        this.j.R(3);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        RichText richText4 = new RichText();
        richText4.addAll(arrayList);
        if (getAccessibilityText() == null) {
            setAccessibilityText(sb.toString());
        }
        return richText4;
    }

    public void x0(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186d0d77", new Object[]{this, num});
            return;
        }
        r0();
        this.n.n = num;
    }

    public boolean y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb9154b9", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if ((this.m & i) == i) {
            return true;
        }
        return false;
    }

    public void y0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46d37875", new Object[]{this, new Integer(i)});
            return;
        }
        r0();
        this.n.o = i;
    }

    public double z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fe43ccf", new Object[]{this})).doubleValue();
        }
        e eVar = this.n;
        if (eVar == null) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        return eVar.f18440a;
    }

    public void z0(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f866c415", new Object[]{this, new Double(d2)});
            return;
        }
        r0();
        this.n.p = d2;
    }

    public final void d0() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b4e458", new Object[]{this});
            return;
        }
        meo meoVar = new meo();
        this.j = meoVar;
        if (this.h) {
            i = this.g;
        } else {
            i = this.i;
        }
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        meoVar.C(getBorderColor());
        this.j.D(Math.max(getBorderWidth(), 0));
        this.j.E(getDXRuntimeContext().h());
        this.j.F(getCornerRadius());
        meo meoVar2 = this.j;
        if (A() > 0) {
            i2 = A();
        } else {
            i2 = (int) z();
        }
        meoVar2.J(i2);
        this.j.K(getFont());
        this.j.M(U());
        this.j.N(Z());
        this.j.P(getDirection());
        this.j.Q((float) T());
        this.j.R(L());
        this.j.V(i);
        this.j.W(getMaxWidth());
        this.j.U(G());
        this.j.n0(R());
        this.j.o0(K());
        this.j.h0(P());
        this.j.i0(I());
        this.j.Z(getPaddingLeft());
        this.j.a0(getPaddingRight());
        this.j.Y(getPaddingBottom());
        this.j.b0(getPaddingTop());
        this.j.l0(J());
        this.j.B(H());
        this.j.S((float) D());
        this.j.T((float) E());
        this.j.H(V());
        int i3 = this.f;
        if (i3 > 0) {
            this.j.m0(i3);
        }
        Integer num = this.d;
        if (num != null) {
            this.j.k0(tryFetchDarkModeColor("textColor", 0, num.intValue()));
        }
        JSONArray N = N();
        if (N != null) {
            if (N.size() >= 1) {
                this.j.d0(N.getFloat(0).floatValue());
            }
            if (N.size() >= 2) {
                this.j.e0(N.getFloat(1).floatValue());
            }
        }
        this.j.O(this.l);
        this.j.p0(this.C0);
        this.j.I(this.h);
        this.j.g0(this.i);
        this.j.f0((float) O());
        this.j.c0(M());
        this.j.j0(x());
    }

    static {
        t2o.a(444597664);
    }
}
