package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXRichTextLinkEvent;
import com.taobao.android.dinamicx.expression.event.DXRichTextPressEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.gmt;
import tb.keo;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ei6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTEXTSPAN_BORDERWIDTHBOTTOM = -7546047556260837628L;
    public static final long DXTEXTSPAN_BORDERWIDTHLEFT = 1317227382400967960L;
    public static final long DXTEXTSPAN_BORDERWIDTHRIGHT = 9159148641061676940L;
    public static final long DXTEXTSPAN_BORDERWIDTHTOP = 3321771109451140287L;
    public static final long DXTEXTSPAN_ENABLETEXTSIZESTRATEGY = 4822617398935994384L;
    public static final long DXTEXTSPAN_FONT = 34149272427L;
    public static final long DXTEXTSPAN_ISBOLD = 9423384817756195L;
    public static final long DXTEXTSPAN_ISITALIC = 3527554185889034042L;
    public static final long DXTEXTSPAN_ISTRUNCATED = -1735247218921453423L;
    public static final long DXTEXTSPAN_LINK = 35873943762L;
    public static final long DXTEXTSPAN_ONLINK = 9859228430928305L;
    public static final long DXTEXTSPAN_ONPRESS = 5176476879387311985L;
    public static final long DXTEXTSPAN_PRESS = 19050239308914L;
    public static final long DXTEXTSPAN_SHADOWCOLOR = -7272671779511765872L;
    public static final long DXTEXTSPAN_SHADOWOFFSET = -946588628814454279L;
    public static final long DXTEXTSPAN_SHADOWRADIUS = -946376925464026374L;
    public static final long DXTEXTSPAN_STRIKETHROUGHCOLOR = -5920401438808043356L;
    public static final long DXTEXTSPAN_STRIKETHROUGHSTYLE = -5902081368050436426L;
    public static final int DXTEXTSPAN_STRIKETHROUGHSTYLE_DOUBLE = 3;
    public static final int DXTEXTSPAN_STRIKETHROUGHSTYLE_NONE = 0;
    public static final int DXTEXTSPAN_STRIKETHROUGHSTYLE_SINGLE = 1;
    public static final int DXTEXTSPAN_STRIKETHROUGHSTYLE_THICK = 2;
    public static final long DXTEXTSPAN_TEXT = 38178040921L;
    public static final long DXTEXTSPAN_TEXTCOLOR = 5737767606580872653L;
    public static final long DXTEXTSPAN_TEXTSIZE = 6751005219504497256L;
    public static final long DXTEXTSPAN_TEXTSPAN = -2672364301597372865L;
    public static final long DXTEXTSPAN_TRUNCATESTRATEGY = -4543350806168160567L;
    public static final int DXTEXTSPAN_TRUNCATESTRATEGY_NONE = 0;
    public static final int DXTEXTSPAN_TRUNCATESTRATEGY_TRUNCATESTART = 1;
    public static final long DXTEXTSPAN_UNDERLINECOLOR = 2436253123551448787L;
    public static final long DXTEXTSPAN_UNDERLINESTYLE = 2437398193491227877L;
    public static final int DXTEXTSPAN_UNDERLINESTYLE_DOUBLE = 3;
    public static final int DXTEXTSPAN_UNDERLINESTYLE_NONE = 0;
    public static final int DXTEXTSPAN_UNDERLINESTYLE_SINGLE = 1;
    public static final int DXTEXTSPAN_UNDERLINESTYLE_THICK = 2;
    public String b;
    public boolean c;
    public boolean d;
    public boolean e;
    public String f;
    public String g;
    public Integer h;
    public int i;
    public gmt j;
    public boolean k;
    public f m;

    /* renamed from: a  reason: collision with root package name */
    public boolean f18593a = true;
    public int l = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements keo.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f18594a;

        public a(long j) {
            this.f18594a = j;
        }

        @Override // tb.keo.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f43e0d7b", new Object[]{this, str});
                return;
            }
            DXRichTextLinkEvent dXRichTextLinkEvent = new DXRichTextLinkEvent(this.f18594a);
            dXRichTextLinkEvent.setLink(str);
            ei6.this.postEvent(dXRichTextLinkEvent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements keo.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f18595a;

        public b(long j) {
            this.f18595a = j;
        }

        @Override // tb.keo.b
        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7caedc9d", new Object[]{this, str})).booleanValue();
            }
            DXRichTextPressEvent dXRichTextPressEvent = new DXRichTextPressEvent(this.f18595a);
            dXRichTextPressEvent.setData(str);
            ei6.this.postEvent(dXRichTextPressEvent);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements keo.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.keo.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3bebbcb", new Object[]{this});
            } else {
                ei6.this.postEvent(new DXEvent(18903999933159L));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements keo.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.keo.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6134112f", new Object[]{this});
            } else {
                ei6.this.postEvent(new DXEvent(-6544685697300501093L));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597679);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new ei6();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f18598a;
        public int g;
        public JSONArray h;
        public double i;
        public int j;
        public int b = 0;
        public int c = -1;
        public int d = -1;
        public int e = -1;
        public int f = -1;
        public int k = 0;
        public String l = "none";

        static {
            t2o.a(444597680);
        }

        public f() {
        }

        public static /* synthetic */ String a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("18c8362f", new Object[]{fVar});
            }
            return fVar.l;
        }

        public static /* synthetic */ String b(f fVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad54a9a3", new Object[]{fVar, str});
            }
            fVar.l = str;
            return str;
        }

        public f c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("99b671d8", new Object[]{this});
            }
            f fVar = new f();
            fVar.f18598a = this.f18598a;
            fVar.b = this.b;
            fVar.c = this.c;
            fVar.d = this.d;
            fVar.e = this.e;
            fVar.f = this.f;
            fVar.g = this.g;
            fVar.h = this.h;
            fVar.i = this.i;
            fVar.j = this.j;
            fVar.k = this.k;
            fVar.l = this.l;
            return fVar;
        }
    }

    static {
        t2o.a(444597674);
    }

    public static /* synthetic */ Object ipc$super(ei6 ei6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
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
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/richtext/DXTextSpanWidgetNode");
        }
    }

    public JSONArray A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("661753ee", new Object[]{this});
        }
        f fVar = this.m;
        if (fVar == null) {
            return null;
        }
        return fVar.h;
    }

    public double B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bf92cbd", new Object[]{this})).doubleValue();
        }
        f fVar = this.m;
        if (fVar == null) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        return fVar.i;
    }

    public int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("586e5fc0", new Object[]{this})).intValue();
        }
        f fVar = this.m;
        if (fVar == null) {
            return 0;
        }
        return fVar.j;
    }

    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4df6770e", new Object[]{this})).intValue();
        }
        f fVar = this.m;
        if (fVar == null) {
            return 0;
        }
        return fVar.k;
    }

    public int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("835f3abe", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public int F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a2ab69", new Object[]{this})).intValue();
        }
        return this.l;
    }

    public int G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c829eae7", new Object[]{this})).intValue();
        }
        f fVar = this.m;
        if (fVar == null) {
            return 0;
        }
        return fVar.f18598a;
    }

    public int H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdb20235", new Object[]{this})).intValue();
        }
        f fVar = this.m;
        if (fVar == null) {
            return 0;
        }
        return fVar.b;
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62da2c3f", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public void J(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b56ebdb9", new Object[]{this, new Integer(i)});
            return;
        }
        R();
        this.m.c = i;
    }

    public void K(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f04b5d", new Object[]{this, new Integer(i)});
            return;
        }
        R();
        this.m.d = i;
    }

    public void L(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b32418", new Object[]{this, new Integer(i)});
            return;
        }
        R();
        this.m.e = i;
    }

    public void M(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c222367f", new Object[]{this, new Integer(i)});
            return;
        }
        R();
        this.m.f = i;
    }

    public void N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbce78d2", new Object[]{this, str});
            return;
        }
        R();
        f.b(this.m, str);
    }

    public void O(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee7df9b", new Object[]{this, new Integer(i)});
            return;
        }
        R();
        this.m.g = i;
    }

    public void P(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d323a84", new Object[]{this, jSONArray});
            return;
        }
        R();
        this.m.h = jSONArray;
    }

    public void Q(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2d9c3", new Object[]{this, new Double(d2)});
            return;
        }
        R();
        this.m.i = d2;
    }

    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bbe3cb", new Object[]{this});
            return;
        }
        f fVar = this.m;
        if (fVar == null) {
            this.m = new f();
            this.k = true;
        } else if (!this.k) {
            this.m = fVar.c();
            this.k = true;
        }
    }

    public void S(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8df24a", new Object[]{this, new Integer(i)});
            return;
        }
        R();
        this.m.j = i;
    }

    public void T(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8708c4bc", new Object[]{this, new Integer(i)});
            return;
        }
        R();
        this.m.k = i;
    }

    public void U(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ef80c", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void V(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc5e8c1", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    public void W(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b58a603", new Object[]{this, new Integer(i)});
            return;
        }
        R();
        this.m.f18598a = i;
    }

    public void X(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46d37875", new Object[]{this, new Integer(i)});
            return;
        }
        R();
        this.m.b = i;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new ei6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == -5902081368050436426L || j == 2437398193491227877L) {
            return 0;
        }
        if (j == 5737767606580872653L) {
            return -16777216;
        }
        if (j == 4822617398935994384L) {
            return 1;
        }
        if (j == DXTEXTSPAN_BORDERWIDTHBOTTOM || j == DXTEXTSPAN_BORDERWIDTHLEFT || j == DXTEXTSPAN_BORDERWIDTHRIGHT || j == DXTEXTSPAN_BORDERWIDTHTOP) {
            return -1;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        if (j == 19050239308914L) {
            return "none";
        }
        return super.getDefaultValueForStringAttr(j);
    }

    public boolean isEnableTextSizeStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9368a359", new Object[]{this})).booleanValue();
        }
        return this.f18593a;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        gmt gmtVar = this.j;
        if (gmtVar == null) {
            if (!zg5.b4(this)) {
                super.onBindEvent(context, view, j);
            }
        } else if (j == 9859228430928305L) {
            gmtVar.T(new a(j));
        } else if (j == 5176476879387311985L) {
            gmtVar.U(new b(j));
        } else if (j == 18903999933159L) {
            gmtVar.W(new c());
        } else if (j == -6544685697300501093L) {
            gmtVar.V(new d());
        } else if (!zg5.b4(this)) {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof ei6)) {
            super.onClone(dXWidgetNode, z);
            ei6 ei6Var = (ei6) dXWidgetNode;
            this.m = ei6Var.m;
            this.b = ei6Var.b;
            this.c = ei6Var.c;
            this.d = ei6Var.d;
            this.e = ei6Var.e;
            this.f = ei6Var.f;
            this.g = ei6Var.g;
            this.h = ei6Var.h;
            this.i = ei6Var.i;
            this.j = ei6Var.j;
            this.f18593a = ei6Var.f18593a;
            this.l = ei6Var.l;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        if (zg5.b4(this)) {
            return null;
        }
        return super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d2)});
        } else if (j == -946376925464026374L) {
            Q(d2);
        } else {
            super.onSetDoubleAttribute(j, d2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 9423384817756195L) {
            if (i == 0) {
                z = false;
            }
            this.c = z;
        } else if (j == 3527554185889034042L) {
            if (i == 0) {
                z = false;
            }
            this.d = z;
        } else if (j == -1735247218921453423L) {
            if (i == 0) {
                z = false;
            }
            this.e = z;
        } else if (j == -7272671779511765872L) {
            O(i);
        } else if (j == -5920401438808043356L) {
            S(i);
        } else if (j == -5902081368050436426L) {
            T(i);
        } else if (j == 5737767606580872653L) {
            this.h = Integer.valueOf(i);
        } else if (j == 6751005219504497256L) {
            this.i = i;
        } else if (j == 2436253123551448787L) {
            W(i);
        } else if (j == 2437398193491227877L) {
            X(i);
        } else if (j == 4822617398935994384L) {
            if (i == 0) {
                z = false;
            }
            this.f18593a = z;
        } else if (j == DXTEXTSPAN_BORDERWIDTHBOTTOM) {
            J(i);
        } else if (j == DXTEXTSPAN_BORDERWIDTHLEFT) {
            K(i);
        } else if (j == DXTEXTSPAN_BORDERWIDTHRIGHT) {
            L(i);
        } else if (j == DXTEXTSPAN_BORDERWIDTHTOP) {
            M(i);
        } else if (j == DXTEXTSPAN_TRUNCATESTRATEGY) {
            V(i);
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == -946588628814454279L) {
            P(jSONArray);
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
            this.b = str;
        } else if (j == 35873943762L) {
            this.f = str;
        } else if (j == 19050239308914L) {
            N(str);
        } else if (j == 38178040921L) {
            this.g = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public void setEnableTextSizeStrategy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72cf07e7", new Object[]{this, new Boolean(z)});
        } else {
            this.f18593a = z;
        }
    }

    public gmt t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gmt) ipChange.ipc$dispatch("17d4dd6b", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.g)) {
            return null;
        }
        int v = v();
        int x = x();
        int w = w();
        int u = u();
        gmt.e c2 = new gmt.e(this.g, getEngine()).z(this.i).b(getBackGroundColor()).c(getBorderColor());
        if (v != 0) {
            v = getBorderWidth();
        }
        if (x != 0) {
            x = getBorderWidth();
        }
        if (w != 0) {
            w = getBorderWidth();
        }
        if (u != 0) {
            u = getBorderWidth();
        }
        gmt.e n = c2.g(new int[]{v, x, w, u}).f(getBorderType()).e(getDashWidth()).d(getDashGap()).i(getCornerRadius()).h(new int[]{getCornerRadiusLeftTop(), getCornerRadiusRightTop(), getCornerRadiusLeftBottom(), getCornerRadiusRightBottom()}).k(this.c).l(this.d).m(this.f).r(y()).v((float) B()).s(z()).A(G()).B(H()).w(C()).x(D()).o(getPaddingLeft()).p(getPaddingRight()).q(getPaddingTop()).n(getPaddingBottom());
        Integer num = this.h;
        if (num != null) {
            n.y(num.intValue());
        }
        JSONArray A = A();
        if (A != null) {
            if (A.size() >= 1) {
                n.t(A.getFloat(0).floatValue());
            }
            if (A.size() >= 2) {
                n.u(A.getFloat(1).floatValue());
            }
        }
        if (!(getDXRuntimeContext() == null || getDXRuntimeContext().h() == null)) {
            n.j(getDXRuntimeContext().h().getAssets(), this.b);
        }
        gmt a2 = n.a();
        this.j = a2;
        return a2;
    }

    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56cfd409", new Object[]{this})).intValue();
        }
        f fVar = this.m;
        if (fVar == null) {
            return -1;
        }
        return fVar.c;
    }

    public int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16a1f4e5", new Object[]{this})).intValue();
        }
        f fVar = this.m;
        if (fVar == null) {
            return -1;
        }
        return fVar.d;
    }

    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb052932", new Object[]{this})).intValue();
        }
        f fVar = this.m;
        if (fVar == null) {
            return -1;
        }
        return fVar.e;
    }

    public int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9ee5aeb", new Object[]{this})).intValue();
        }
        f fVar = this.m;
        if (fVar == null) {
            return -1;
        }
        return fVar.f;
    }

    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f207ee8c", new Object[]{this});
        }
        f fVar = this.m;
        if (fVar == null) {
            return "none";
        }
        return f.a(fVar);
    }

    public int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6fd606e7", new Object[]{this})).intValue();
        }
        f fVar = this.m;
        if (fVar == null) {
            return 0;
        }
        return fVar.g;
    }
}
