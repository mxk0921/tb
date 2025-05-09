package tb;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.detail.rate.widget.XRateFlowLayout;
import com.taobao.detail.rate.widget.delegate.tag.bean.AssociationTagItem;
import com.taobao.detail.rate.widget.delegate.tag.bean.AssociationTagItemStyle;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xd1 extends zfn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View b;
    public f c;
    public h d;
    public ouk<AssociationTagItem> e;
    public prk<AssociationTagItem> f;
    public int g = -1;
    public boolean h = true;
    public boolean i;
    public XRateFlowLayout j;
    public View k;
    public View l;
    public View m;
    public final g n;
    public wd1 o;
    public final boolean p;
    public final DinamicXEngine q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements XRateFlowLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("832c994b", new Object[]{this, new Boolean(z)});
            } else {
                xd1.a(xd1.this, !z);
            }
        }

        public void b(boolean z, boolean z2, boolean z3) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596c8c97", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
                return;
            }
            View i2 = xd1.i(xd1.this);
            if (!z) {
                i = 8;
            }
            i2.setVisibility(i);
            if (z && z3 && !xd1.j(xd1.this)) {
                xd1.k(xd1.this, !z2);
            }
        }

        public void c(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("989f1342", new Object[]{this, new Integer(i), obj});
            } else if ((obj instanceof AssociationTagItem) && xd1.b(xd1.this) != null) {
                xd1.b(xd1.this).a(i, (AssociationTagItem) obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements ouk<AssociationTagItem> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: b */
        public void a(int i, AssociationTagItem associationTagItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("907514be", new Object[]{this, new Integer(i), associationTagItem});
                return;
            }
            xd1.l(xd1.this, i);
            if (xd1.m(xd1.this) != null) {
                xd1.m(xd1.this).a(i, associationTagItem);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                xd1.n(xd1.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements k25 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AssociationTagItemStyle f31313a;
        public final /* synthetic */ AssociationTagItemStyle b;
        public final /* synthetic */ List c;

        public d(AssociationTagItemStyle associationTagItemStyle, AssociationTagItemStyle associationTagItemStyle2, List list) {
            this.f31313a = associationTagItemStyle;
            this.b = associationTagItemStyle2;
            this.c = list;
        }

        @Override // tb.k25
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc357866", new Object[]{this, view});
                return;
            }
            int j = zhn.j(11.52f);
            view.setPadding(j, 0, j, 0);
            view.setLayoutParams(new ViewGroup.LayoutParams(-2, zhn.j(34.56f)));
        }

        @Override // tb.k25
        public GradientDrawable b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GradientDrawable) ipChange.ipc$dispatch("184f6d67", new Object[]{this, new Boolean(z)});
            }
            int c = i6v.INSTANCE.c(z, this.f31313a.bgColor, this.b.bgColor);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(xd1.o(xd1.this).f);
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(c);
            return gradientDrawable;
        }

        @Override // tb.k25
        public void c(TextView textView, int i, boolean z) {
            AssociationTagItemStyle associationTagItemStyle;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8345ce0c", new Object[]{this, textView, new Integer(i), new Boolean(z)});
                return;
            }
            xd1.p(xd1.this, textView, z);
            xd1 xd1Var = xd1.this;
            if (z) {
                associationTagItemStyle = this.f31313a;
            } else {
                associationTagItemStyle = this.b;
            }
            textView.setTextSize(0, xd1.c(xd1Var, associationTagItemStyle.titleSize));
            i6v i6vVar = i6v.INSTANCE;
            String str2 = this.f31313a.titleColor;
            if (xd1.d(xd1.this, this.c, i)) {
                str = this.b.countColor;
            } else {
                str = this.b.titleColor;
            }
            textView.setTextColor(i6vVar.c(z, str2, str));
        }

        @Override // tb.k25
        public void d(TextView textView, int i, boolean z) {
            AssociationTagItemStyle associationTagItemStyle;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13695c28", new Object[]{this, textView, new Integer(i), new Boolean(z)});
                return;
            }
            xd1.e(xd1.this, textView);
            xd1.p(xd1.this, textView, z);
            xd1 xd1Var = xd1.this;
            if (z) {
                associationTagItemStyle = this.f31313a;
            } else {
                associationTagItemStyle = this.b;
            }
            textView.setTextSize(0, xd1.c(xd1Var, associationTagItemStyle.countSize));
            textView.setTextColor(i6v.INSTANCE.c(z, this.f31313a.countColor, this.b.countColor));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            xd1.f(xd1.this);
            xd1.h(xd1.this).a(xd1.f(xd1.this), xd1.g(xd1.this).getShowLines(), xd1.g(xd1.this).getTotalLines(), BizTaskData.MANUAL_TIME);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface f {
        void a(boolean z, int i, int i2, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public JSONArray f31315a;
        public int b;
        public String d;
        public int g;
        public JSONObject h;
        public JSONObject i;
        public JSONObject j;
        public int c = 2;
        public boolean e = true;
        public int f = 12;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface h {
        void a(boolean z);
    }

    public xd1(Context context, DinamicXEngine dinamicXEngine, g gVar, boolean z) {
        super(context);
        this.n = gVar;
        this.p = z;
        this.q = dinamicXEngine;
        C();
    }

    public static /* synthetic */ void a(xd1 xd1Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c94802", new Object[]{xd1Var, new Boolean(z)});
        } else {
            xd1Var.s(z);
        }
    }

    public static /* synthetic */ prk b(xd1 xd1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (prk) ipChange.ipc$dispatch("db89823", new Object[]{xd1Var});
        }
        return xd1Var.f;
    }

    public static /* synthetic */ float c(xd1 xd1Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d46b8e90", new Object[]{xd1Var, new Integer(i)})).floatValue();
        }
        return xd1Var.q(i);
    }

    public static /* synthetic */ boolean d(xd1 xd1Var, List list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e39cf9d4", new Object[]{xd1Var, list, new Integer(i)})).booleanValue();
        }
        return xd1Var.E(list, i);
    }

    public static /* synthetic */ void e(xd1 xd1Var, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1f700e3", new Object[]{xd1Var, textView});
        } else {
            xd1Var.M(textView);
        }
    }

    public static /* synthetic */ boolean f(xd1 xd1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9feae64", new Object[]{xd1Var})).booleanValue();
        }
        return xd1Var.h;
    }

    public static /* synthetic */ XRateFlowLayout g(xd1 xd1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XRateFlowLayout) ipChange.ipc$dispatch("7e8d6e67", new Object[]{xd1Var});
        }
        return xd1Var.j;
    }

    public static /* synthetic */ f h(xd1 xd1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("e7397e72", new Object[]{xd1Var});
        }
        return xd1Var.c;
    }

    public static /* synthetic */ View i(xd1 xd1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c0e7dd12", new Object[]{xd1Var});
        }
        return xd1Var.k;
    }

    public static /* synthetic */ Object ipc$super(xd1 xd1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/widget/delegate/tag/AssociationTagFlowUIDelegate");
    }

    public static /* synthetic */ boolean j(xd1 xd1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b333eb3", new Object[]{xd1Var})).booleanValue();
        }
        return xd1Var.i;
    }

    public static /* synthetic */ void k(xd1 xd1Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbaea006", new Object[]{xd1Var, new Boolean(z)});
        } else {
            xd1Var.r(z);
        }
    }

    public static /* synthetic */ int l(xd1 xd1Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea797aab", new Object[]{xd1Var, new Integer(i)})).intValue();
        }
        xd1Var.g = i;
        return i;
    }

    public static /* synthetic */ ouk m(xd1 xd1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ouk) ipChange.ipc$dispatch("913a7632", new Object[]{xd1Var});
        }
        return xd1Var.e;
    }

    public static /* synthetic */ void n(xd1 xd1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c300d62b", new Object[]{xd1Var});
        } else {
            xd1Var.N();
        }
    }

    public static /* synthetic */ g o(xd1 xd1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("2ab84e99", new Object[]{xd1Var});
        }
        return xd1Var.n;
    }

    public static /* synthetic */ void p(xd1 xd1Var, TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c87b5b9", new Object[]{xd1Var, textView, new Boolean(z)});
        } else {
            xd1Var.O(textView, z);
        }
    }

    public final void A(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("225e7437", new Object[]{this, gVar});
            return;
        }
        this.j.setInitParams(gVar.g, gVar.b, gVar.c, !gVar.e, this.g, this.p);
        this.j.setFlowViewOuterListener(new a());
    }

    public final void B(g gVar) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2038bc8a", new Object[]{this, gVar});
            return;
        }
        View view = this.l;
        if (this.h) {
            f2 = 180.0f;
        } else {
            f2 = 0.0f;
        }
        view.setRotation(f2);
        ViewProxy.setOnClickListener(this.k, new c());
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        View inflate = LayoutInflater.from(this.f32728a).inflate(R.layout.rate_ugc_association_tag_flow_view, (ViewGroup) null);
        this.b = inflate;
        this.j = (XRateFlowLayout) inflate.findViewById(R.id.association_tag_content_view);
        this.k = this.b.findViewById(R.id.v_fold_view);
        this.l = this.b.findViewById(R.id.v_arrow);
        this.m = this.b.findViewById(R.id.v_fold_button);
        this.k.setVisibility(8);
        D(this.n);
    }

    public void D(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0793b5", new Object[]{this, gVar});
            return;
        }
        List<AssociationTagItem> t = t(gVar.f31315a);
        this.h = gVar.e;
        JSONObject jSONObject = gVar.j;
        if (jSONObject != null) {
            this.g = w(t, jSONObject);
        } else {
            this.g = x(t, gVar.d);
        }
        z(t, gVar);
        A(gVar);
        B(gVar);
    }

    public final boolean E(List<AssociationTagItem> list, int i) {
        AssociationTagItem associationTagItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eff2b6de", new Object[]{this, list, new Integer(i)})).booleanValue();
        }
        if (list == null || i >= list.size() || (associationTagItem = list.get(i)) == null || TextUtils.isEmpty(associationTagItem.status)) {
            return false;
        }
        return TextUtils.equals(associationTagItem.status, "-1");
    }

    public final void F(AssociationTagItemStyle associationTagItemStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2d302b", new Object[]{this, associationTagItemStyle});
            return;
        }
        associationTagItemStyle.titleSize = 26;
        associationTagItemStyle.countSize = 24;
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a29462", new Object[]{this});
        } else if (this.i) {
            this.i = false;
        } else {
            this.j.updateUIByAdapter(this.o);
            this.o.k(this.g);
        }
    }

    public void H(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc6582c", new Object[]{this, fVar});
        } else {
            this.c = fVar;
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b7e588f", new Object[]{this});
        } else {
            this.j.setHasInit();
        }
    }

    public void J(prk<AssociationTagItem> prkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fd885b", new Object[]{this, prkVar});
        } else {
            this.f = prkVar;
        }
    }

    public void K(ouk<AssociationTagItem> oukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470c54c3", new Object[]{this, oukVar});
        } else {
            this.e = oukVar;
        }
    }

    public void L(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa37188c", new Object[]{this, hVar});
        } else {
            this.d = hVar;
        }
    }

    public final void M(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("984a3eb2", new Object[]{this, textView});
        } else if (n9l.INSTANCE.J()) {
            try {
                Typeface createFromAsset = Typeface.createFromAsset(this.f32728a.getAssets(), "iconfonts/AlibabaSans102_v1_TaoBao-Rg.ttf");
                if (createFromAsset != null) {
                    textView.setTypeface(createFromAsset);
                }
            } catch (Exception unused) {
                textView.setTypeface(Typeface.DEFAULT);
            }
        }
    }

    public final void N() {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac857eae", new Object[]{this});
            return;
        }
        this.i = true;
        boolean z = this.h;
        boolean z2 = !z;
        this.h = z2;
        this.n.e = z2;
        View view = this.l;
        if (!z) {
            f2 = 180.0f;
        } else {
            f2 = 0.0f;
        }
        view.setRotation(f2);
        this.j.setFoldStatus(true ^ this.h);
        if (this.c != null) {
            this.j.post(new e());
        }
    }

    public final void O(TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7087a10f", new Object[]{this, textView, new Boolean(z)});
        } else if (textView != null && textView.getPaint() != null) {
            textView.getPaint().setFakeBoldText(z);
        }
    }

    public final float q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84233111", new Object[]{this, new Integer(i)})).floatValue();
        }
        return pb6.d(this.q, this.f32728a, i / 2.0f);
    }

    public final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32430179", new Object[]{this, new Boolean(z)});
            return;
        }
        h hVar = this.d;
        if (hVar != null) {
            hVar.a(z);
        }
    }

    public final void s(boolean z) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("464434d9", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h = z;
        this.n.e = z;
        View view = this.l;
        if (z) {
            f2 = 180.0f;
        } else {
            f2 = 0.0f;
        }
        view.setRotation(f2);
        if (this.c != null) {
            new StringBuilder("ay onStateChanged flowViewForceChangeExpandStatus isExpanded = ").append(this.h);
            this.c.a(this.h, this.j.getShowLines(), this.j.getTotalLines(), "auto");
        }
    }

    public View u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.b;
    }

    public final k25 v(List<AssociationTagItem> list, AssociationTagItemStyle associationTagItemStyle, AssociationTagItemStyle associationTagItemStyle2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k25) ipChange.ipc$dispatch("c7b55d6", new Object[]{this, list, associationTagItemStyle, associationTagItemStyle2});
        }
        return new d(associationTagItemStyle2, associationTagItemStyle, list);
    }

    public final int w(List<AssociationTagItem> list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1921b920", new Object[]{this, list, jSONObject})).intValue();
        }
        if (list.size() > 0 && jSONObject != null) {
            for (int i = 0; i < list.size(); i++) {
                AssociationTagItem associationTagItem = list.get(i);
                String y = y(jSONObject);
                if (associationTagItem != null && TextUtils.equals(associationTagItem.id, y)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final int x(List<AssociationTagItem> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fce9920", new Object[]{this, list, str})).intValue();
        }
        if (list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (int i = 0; i < list.size(); i++) {
                AssociationTagItem associationTagItem = list.get(i);
                if (associationTagItem != null && TextUtils.equals(associationTagItem.title, str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final String y(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc7b7606", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("extraInfo");
        if (jSONObject2 == null || !jSONObject2.containsKey("labelType")) {
            return "-8";
        }
        String string = jSONObject2.getString("labelType");
        if (TextUtils.isEmpty(string)) {
            string = "tab";
        }
        if (TextUtils.equals(string, "tab")) {
            str = jSONObject2.getString("rateType");
            if (TextUtils.isEmpty(str)) {
                return "-8";
            }
        } else if (!TextUtils.equals(string, "impr")) {
            return "-8";
        } else {
            str = jSONObject.getString("labelId");
            if (TextUtils.isEmpty(str)) {
                return "-8";
            }
        }
        return str;
    }

    public final void z(List<AssociationTagItem> list, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1844d8a4", new Object[]{this, list, gVar});
            return;
        }
        AssociationTagItemStyle associationTagItemStyle = (AssociationTagItemStyle) JSON.toJavaObject(gVar.i, AssociationTagItemStyle.class);
        if (associationTagItemStyle == null) {
            associationTagItemStyle = new AssociationTagItemStyle();
        }
        F(associationTagItemStyle);
        AssociationTagItemStyle associationTagItemStyle2 = (AssociationTagItemStyle) JSON.toJavaObject(gVar.h, AssociationTagItemStyle.class);
        if (associationTagItemStyle2 == null) {
            associationTagItemStyle2 = new AssociationTagItemStyle();
            associationTagItemStyle2.bgColor = "#1AFF6200";
            associationTagItemStyle2.titleColor = "#FF6200";
            associationTagItemStyle2.countColor = "#FF6200";
        }
        F(associationTagItemStyle2);
        wd1 wd1Var = new wd1(this.f32728a, list, v(list, associationTagItemStyle, associationTagItemStyle2));
        this.o = wd1Var;
        wd1Var.e(new b());
    }

    public final List<AssociationTagItem> t(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("58c8c9b9", new Object[]{this, jSONArray});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.size() > 0) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String string = jSONObject.getString("title");
                    String string2 = jSONObject.getString("fuzzyCount");
                    String string3 = jSONObject.getString("status");
                    String y = y(jSONObject);
                    if (TextUtils.isEmpty(string2)) {
                        string2 = jSONObject.getString("count");
                    }
                    if (!TextUtils.isEmpty(string)) {
                        arrayList.add(new AssociationTagItem(string, string2, string3, y, jSONObject));
                    }
                }
            }
        }
        return arrayList;
    }
}
