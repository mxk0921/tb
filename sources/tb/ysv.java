package tb;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.TBLiveBaseCommonPlugin;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.business.MtopIliadUsertaskTasksDotaskResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.business.MtopIliadUsertaskTasksEntryResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.business.UserTaskProcess;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ysv implements u7e, b0d, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static float K;
    public static float L;
    public static int M;
    public final Runnable A;
    public final Runnable B;
    public dtv C;
    public ftv D;
    public final t54 E;
    public boolean F;
    public htv G;
    public MtopIliadUsertaskTasksDotaskResponseData H;
    public NetBaseOutDo I;
    public boolean J;

    /* renamed from: a  reason: collision with root package name */
    public boolean f32330a;
    public MtopIliadUsertaskTasksEntryResponseData b;
    public boolean c;
    public int d;
    public String e;
    public long f;
    public long g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public JSONObject n;
    public boolean o;
    public String p;
    public String q;
    public String r;
    public boolean s;
    public final String t;
    public String u;
    public String v;
    public String w;
    public final String x;
    public szd y;
    public ValueAnimator z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ysv.a(ysv.this) != null) {
                ysv.b(ysv.this, "mShowScoreRunnable");
                ysv.m(ysv.this, 0.0f);
                ysv.u(ysv.this);
                ysv.v(ysv.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            ysv.b(ysv.this, "EntryRequest error");
            ysv.l(ysv.this, null);
            if (ysv.o(ysv.this) != null) {
                ysv.o(ysv.this).a(ysv.w(ysv.this));
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onError(i, netResponse, obj);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netBaseOutDo == null || !(netBaseOutDo.getData() instanceof MtopIliadUsertaskTasksEntryResponseData)) {
                onError(i, netResponse, obj);
            } else {
                MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData = (MtopIliadUsertaskTasksEntryResponseData) netBaseOutDo.getData();
                ysv ysvVar = ysv.this;
                StringBuilder sb = new StringBuilder("dotask onError ");
                if (netResponse != null) {
                    str = netResponse.getRetMsg();
                } else {
                    str = "netResponse==null";
                }
                sb.append(str);
                ysv.b(ysvVar, sb.toString());
                if ("shopTrain".equals(mtopIliadUsertaskTasksEntryResponseData.bizType)) {
                    ysv.i(ysv.this, "UserTaskEntrySuccess", 1);
                    ysv.j(ysv.this, 19999, "UserTaskEntrySuccess", new HashMap());
                }
                if (mtopIliadUsertaskTasksEntryResponseData.showEntry) {
                    ysv.k(ysv.this, true);
                }
                ysv.l(ysv.this, mtopIliadUsertaskTasksEntryResponseData);
                ysv.n(ysv.this);
                if (ysv.o(ysv.this) != null) {
                    ysv.o(ysv.this).a(ysv.w(ysv.this));
                }
                ysv.b(ysv.this, "EntryRequest success");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (ysv.a(ysv.this) != null) {
                ysv.z(ysv.this, 4);
                ysv.m(ysv.this, 0.0f);
                ysv.a(ysv.this).setEntryImage("", ysv.p(ysv.this), false);
                ysv.a(ysv.this).setEntryText(ysv.A(ysv.this));
                if (ysv.a(ysv.this).isNew()) {
                    ysv.a(ysv.this).changeGoldUI(ysv.q(ysv.this));
                }
                ysv.g(ysv.this);
                ysv.a(ysv.this).getView().postDelayed(ysv.r(ysv.this), ysv.s(ysv.this));
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ysv.m(ysv.this, ((Float) valueAnimator.getAnimatedValue()).floatValue() % 360.0f);
            if (ysv.a(ysv.this) != null && ysv.t(ysv.this) != null && !ysv.t(ysv.this).hideProcessBar) {
                ysv.a(ysv.this).setProgress(ysv.e(ysv.this));
            }
        }
    }

    static {
        t2o.a(295700090);
        t2o.a(806355299);
        t2o.a(806355932);
        t2o.a(806355016);
        fsw.h("TBLiveBaseCommonPlugin", TBLiveBaseCommonPlugin.class);
    }

    public ysv(String str, String str2) {
        this(str, str2, null, null);
    }

    public static /* synthetic */ String A(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73ace47d", new Object[]{ysvVar});
        }
        return ysvVar.m;
    }

    public static /* synthetic */ String B(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccb82ffe", new Object[]{ysvVar});
        }
        return ysvVar.i;
    }

    public static boolean M(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fadf915", new Object[]{ux9Var})).booleanValue();
        }
        if ("liveshop.shoptab3_live".equals(up6.r(ux9Var)) || "liveshop.shopcard_live".equals(up6.r(ux9Var))) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ szd a(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (szd) ipChange.ipc$dispatch("5dce15ba", new Object[]{ysvVar});
        }
        return ysvVar.y;
    }

    public static /* synthetic */ void b(ysv ysvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1d3534", new Object[]{ysvVar, str});
        } else {
            ysvVar.R(str);
        }
    }

    public static /* synthetic */ String c(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7c88164", new Object[]{ysvVar});
        }
        return ysvVar.l;
    }

    public static /* synthetic */ String d(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40d3cce5", new Object[]{ysvVar});
        }
        return ysvVar.k;
    }

    public static /* synthetic */ float e(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1ce7f6a", new Object[]{ysvVar})).floatValue();
        }
        return ysvVar.P();
    }

    public static /* synthetic */ void f(ysv ysvVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fee540b", new Object[]{ysvVar, new Long(j)});
        } else {
            ysvVar.b0(j);
        }
    }

    public static /* synthetic */ void g(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61cd3c38", new Object[]{ysvVar});
        } else {
            ysvVar.W();
        }
    }

    public static /* synthetic */ Runnable h(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("70813d9d", new Object[]{ysvVar});
        }
        return ysvVar.A;
    }

    public static /* synthetic */ void i(ysv ysvVar, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f6589c3", new Object[]{ysvVar, str, new Integer(i)});
        } else {
            ysvVar.C(str, i);
        }
    }

    public static /* synthetic */ void j(ysv ysvVar, int i, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f351fed", new Object[]{ysvVar, new Integer(i), str, map});
        } else {
            ysvVar.I(i, str, map);
        }
    }

    public static /* synthetic */ boolean k(ysv ysvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6846726", new Object[]{ysvVar, new Boolean(z)})).booleanValue();
        }
        ysvVar.f32330a = z;
        return z;
    }

    public static /* synthetic */ void l(ysv ysvVar, MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833d5d6a", new Object[]{ysvVar, mtopIliadUsertaskTasksEntryResponseData});
        } else {
            ysvVar.a0(mtopIliadUsertaskTasksEntryResponseData);
        }
    }

    public static /* synthetic */ void m(ysv ysvVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f62097", new Object[]{ysvVar, new Float(f)});
        } else {
            ysvVar.Z(f);
        }
    }

    public static /* synthetic */ void n(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9bc303d", new Object[]{ysvVar});
        } else {
            ysvVar.Y();
        }
    }

    public static /* synthetic */ htv o(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (htv) ipChange.ipc$dispatch("4d236806", new Object[]{ysvVar});
        }
        return ysvVar.G;
    }

    public static /* synthetic */ String p(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("623d3d05", new Object[]{ysvVar});
        }
        return ysvVar.j;
    }

    public static /* synthetic */ MtopIliadUsertaskTasksDotaskResponseData q(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopIliadUsertaskTasksDotaskResponseData) ipChange.ipc$dispatch("b0adf5d7", new Object[]{ysvVar});
        }
        return ysvVar.H;
    }

    public static /* synthetic */ Runnable r(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("5682473b", new Object[]{ysvVar});
        }
        return ysvVar.B;
    }

    public static /* synthetic */ int s(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b9080b", new Object[]{ysvVar})).intValue();
        }
        return ysvVar.h;
    }

    public static /* synthetic */ MtopIliadUsertaskTasksEntryResponseData t(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopIliadUsertaskTasksEntryResponseData) ipChange.ipc$dispatch("3476844", new Object[]{ysvVar});
        }
        return ysvVar.b;
    }

    public static /* synthetic */ void u(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d293aea8", new Object[]{ysvVar});
        } else {
            ysvVar.O();
        }
    }

    public static /* synthetic */ void v(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a930d07", new Object[]{ysvVar});
        } else {
            ysvVar.K();
        }
    }

    public static /* synthetic */ boolean w(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62926b6a", new Object[]{ysvVar})).booleanValue();
        }
        return ysvVar.c;
    }

    public static /* synthetic */ long x(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa91c9b9", new Object[]{ysvVar})).longValue();
        }
        return ysvVar.g;
    }

    public static /* synthetic */ int y(ysv ysvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2912817", new Object[]{ysvVar})).intValue();
        }
        return ysvVar.d;
    }

    public static /* synthetic */ int z(ysv ysvVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae8c02d4", new Object[]{ysvVar, new Integer(i)})).intValue();
        }
        ysvVar.d = i;
        return i;
    }

    public final void C(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f4b13c", new Object[]{this, str, new Integer(i)});
        } else if (v2s.o().e() != null) {
            v2s.o().e().a("taolive", str, i);
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57237f88", new Object[]{this});
            return;
        }
        R("cancelAnimator");
        ValueAnimator valueAnimator = this.z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.z = null;
        }
    }

    public void F(String str, String str2, String str3, String str4, String str5, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feae8c23", new Object[]{this, str, str2, str3, str4, str5, new Boolean(z)});
            return;
        }
        if (this.f32330a && TextUtils.equals(this.q, str2) && !z) {
            z2 = false;
        }
        R("isNeedEntryRequest:" + z2);
        if (z2) {
            this.F = false;
            this.p = str;
            this.q = str2;
            this.r = str5;
            this.f32330a = false;
            ftv ftvVar = new ftv(new c());
            this.D = ftvVar;
            ftvVar.K(str, str2, str5, str3, str4, this.x);
        }
    }

    public void G(String str, htv htvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd8281b5", new Object[]{this, str, htvVar});
            return;
        }
        R("checkUserTask");
        this.p = str;
        if (this.f32330a) {
            htvVar.a(this.c);
        } else {
            this.G = htvVar;
        }
    }

    public final void I(int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0c6f88", new Object[]{this, new Integer(i), str, map});
        } else if (v2s.o().t() != null) {
            v2s.o().t().g(i, str, map);
        }
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("176d45c4", new Object[]{this});
        } else {
            new xsv(new d()).K(this.f, this.p, this.q);
        }
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6195069", new Object[]{this});
            return;
        }
        R("endAnimator");
        ValueAnimator valueAnimator = this.z;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.z = null;
        }
    }

    public final float P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ba5fa9a", new Object[]{this})).floatValue();
        }
        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData = this.b;
        if (mtopIliadUsertaskTasksEntryResponseData == null || !"shopTrain".equals(mtopIliadUsertaskTasksEntryResponseData.bizType)) {
            return K;
        }
        return L;
    }

    public final void Q(String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64341246", new Object[]{this, str, str2, str3});
        } else if (!TextUtils.isEmpty(str)) {
            if (str.contains("?")) {
                str4 = str + "&creatorId=" + str2 + "&liveId=" + str3 + "&taskSource=liveroom&spm=" + this.t;
            } else {
                str4 = str + "?creatorId=" + str2 + "&liveId=" + str3 + "&taskSource=liveroom&spm=" + this.t;
            }
            voj.a(this.y.getView().getContext(), str4);
        }
    }

    public final void R(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ada172", new Object[]{this, str});
        } else if (v2s.o().A() != null) {
            v2s.o().A().c("UserTaskController", str);
        }
    }

    public boolean S(String str, String str2) {
        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData;
        MtopIliadUsertaskTasksEntryResponseData.BizData bizData;
        ArrayList<String> arrayList;
        MtopIliadUsertaskTasksEntryResponseData.BizData bizData2;
        ArrayList<String> arrayList2;
        MtopIliadUsertaskTasksEntryResponseData.BizData bizData3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d893da0", new Object[]{this, str, str2})).booleanValue();
        }
        this.w = this.v;
        this.v = str;
        this.u = str2;
        if (this.F) {
            return true;
        }
        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData2 = this.b;
        if (mtopIliadUsertaskTasksEntryResponseData2 != null && (bizData3 = mtopIliadUsertaskTasksEntryResponseData2.bizData) != null && bizData3.userJoin) {
            return true;
        }
        if (mtopIliadUsertaskTasksEntryResponseData2 != null && (bizData2 = mtopIliadUsertaskTasksEntryResponseData2.bizData) != null && (arrayList2 = bizData2.anchorIdList) != null && arrayList2.contains(str)) {
            return true;
        }
        String str3 = this.w;
        if (str3 == null || (mtopIliadUsertaskTasksEntryResponseData = this.b) == null || (bizData = mtopIliadUsertaskTasksEntryResponseData.bizData) == null || (arrayList = bizData.anchorIdList) == null || !arrayList.contains(str3)) {
            return false;
        }
        return true;
    }

    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        if (!(!this.c || this.y == null || this.b == null)) {
            R("onResume");
            if (!"shopTrain".equals(this.b.bizType) && L()) {
                W();
                this.y.getView().post(this.B);
            }
        }
        szd szdVar = this.y;
        if (szdVar != null) {
            szdVar.onResume();
        }
    }

    public void V(String str, String str2, t54 t54Var) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8605424f", new Object[]{this, str, str2, t54Var});
        } else if (this.y != null) {
            MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData = this.b;
            if (mtopIliadUsertaskTasksEntryResponseData != null && "shopTrain".equals(mtopIliadUsertaskTasksEntryResponseData.bizType)) {
                HashMap hashMap = new HashMap();
                hashMap.put(gf0.K_DELIVERY_ID, this.f + "");
                Map<String, String> map = this.b.utParams;
                if (map != null) {
                    hashMap.putAll(map);
                }
                if (v2s.o().t() != null) {
                    v2s.o().t().f("rightAssembly_entrance", hashMap);
                }
            }
            if (this.d == 9) {
                R("procClick doClick");
                J();
                return;
            }
            MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData2 = this.b;
            if (mtopIliadUsertaskTasksEntryResponseData2 == null || TextUtils.isEmpty(mtopIliadUsertaskTasksEntryResponseData2.jumpType)) {
                R("procClick jumpUrl");
                Q(this.e, str, str2);
            } else if (DMComponent.RESET.equals(this.b.jumpType)) {
                R("procClick reset");
                this.y.reset(this.b.entryConfig.text);
                this.b.jumpType = "openUrl";
            } else if ("openUrl".equals(this.b.jumpType)) {
                R("procClick openUrl");
                Q(this.b.jumpData, str, str2);
            } else if (!"openAliveComponent".equals(this.b.jumpType)) {
                "openH5Layer".equals(this.b.jumpType);
            } else if (!TextUtils.isEmpty(this.b.jumpData)) {
                R("procClick openAliveComponent");
                JSONObject d2 = fkx.d(this.b.jumpData);
                String string = d2.getString("aliveComponentMsgEvent");
                JSONObject jSONObject = d2.getJSONObject("aliveComponentMsg");
                if (!(jSONObject == null || jSONObject.getJSONObject("data") == null)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    long j = this.g;
                    if (j == 0) {
                        i = M;
                    } else {
                        i = ((int) ((((float) j) * (P() % 360.0f)) / 360.0f)) / 1000;
                    }
                    jSONObject2.put("nativeTime", (Object) Integer.valueOf(i));
                    jSONObject.put("data", (Object) jSONObject2);
                }
                t54Var.z0().v(string, jSONObject);
            }
            MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData3 = this.b;
            if (mtopIliadUsertaskTasksEntryResponseData3 != null && !"shopTrain".equals(mtopIliadUsertaskTasksEntryResponseData3.bizType)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(gf0.K_DELIVERY_ID, this.f + "");
                Map<String, String> map2 = this.b.utParams;
                if (map2 != null) {
                    hashMap2.putAll(map2);
                }
                if (v2s.o().t() != null) {
                    v2s.o().t().f("NewTask_liveEntrance_Click", hashMap2);
                }
            }
        }
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58438431", new Object[]{this});
        } else {
            X(false);
        }
    }

    public final void X(boolean z) {
        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02db4c3", new Object[]{this, new Boolean(z)});
        } else if (this.y != null && (mtopIliadUsertaskTasksEntryResponseData = this.b) != null) {
            if (!z || !"shopTrain".equals(mtopIliadUsertaskTasksEntryResponseData.bizType) || !L()) {
                this.y.getView().removeCallbacks(this.B);
                this.y.getView().removeCallbacks(this.A);
            }
        }
    }

    public final void Z(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData = this.b;
        if (mtopIliadUsertaskTasksEntryResponseData == null || !"shopTrain".equals(mtopIliadUsertaskTasksEntryResponseData.bizType)) {
            K = f;
            return;
        }
        L = f;
        M = ((int) ((((float) this.g) * (f % 360.0f)) / 360.0f)) / 1000;
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return null;
    }

    public void c0(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d878e5", new Object[]{this, recyclerView});
            return;
        }
        R("unBindBottomUserTaskBtn");
        E();
        W();
        szd szdVar = this.y;
        if (szdVar != null && (szdVar.getView().getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.y.getView().getParent()).removeView(this.y.getView());
        }
        if (recyclerView != null) {
            recyclerView.setTag(R.id.taolive_user_task_view_recycle_flexalocal, this.y);
        }
        this.y = null;
        this.n = null;
        this.G = null;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.interactive_component_render_complete", "com.taobao.live.usertask.permissionSuccess"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        return null;
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        str.hashCode();
        if (str.equals("com.taobao.taolive.room.interactive_component_render_complete") && (obj instanceof IInteractiveProxy.e) && TextUtils.equals(((IInteractiveProxy.e) obj).getFedName(), "@ali/alivemodx-platform-task-popup") && this.y != null) {
            this.o = true;
            Y();
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ysv.w(ysv.this) && ysv.a(ysv.this) != null && ysv.x(ysv.this) > 0) {
                if (ysv.y(ysv.this) == 3) {
                    ysv.b(ysv.this, "mShowProgressRunnable status 3");
                    ysv.m(ysv.this, 0.0f);
                    ysv.a(ysv.this).setEntryText(ysv.A(ysv.this));
                    ysv.a(ysv.this).setEntryImage(ysv.B(ysv.this), "", false);
                } else if (ysv.y(ysv.this) == 9) {
                    ysv.b(ysv.this, "mShowProgressRunnable status 9");
                    ysv.m(ysv.this, 0.0f);
                    ysv.a(ysv.this).setEntryText(ysv.c(ysv.this));
                    ysv.a(ysv.this).setEntryImage(ysv.d(ysv.this), "", false);
                } else {
                    ysv.a(ysv.this).hideEntryInnerText();
                    if (ysv.y(ysv.this) == 10) {
                        ysv.b(ysv.this, "mShowProgressRunnable status 10");
                        ysv.a(ysv.this).setEntryText(ysv.c(ysv.this));
                        ysv.a(ysv.this).setEntryImage(ysv.d(ysv.this), "", true);
                    } else {
                        ysv.b(ysv.this, "mShowProgressRunnable status");
                        ysv.a(ysv.this).setEntryText(ysv.A(ysv.this));
                        ysv.a(ysv.this).setEntryImage(ysv.B(ysv.this), "", true);
                    }
                    long x = (((float) ysv.x(ysv.this)) * (360.0f - (ysv.e(ysv.this) % 360.0f))) / 360.0f;
                    ysv.f(ysv.this, x);
                    ysv.g(ysv.this);
                    ysv.a(ysv.this).getView().postDelayed(ysv.h(ysv.this), x);
                }
            }
        }
    }

    public ysv(String str, String str2, t54 t54Var, String str3) {
        this.c = false;
        this.d = 0;
        this.g = 20000L;
        this.h = 5000;
        this.i = "";
        this.j = "";
        this.o = false;
        this.s = false;
        this.A = new a();
        this.B = new b();
        this.F = true;
        this.J = true;
        this.E = t54Var;
        this.x = str3;
        bxg.f16701a = 0;
        bxg.b = 0;
        this.t = str2;
        sjr.g().a(this);
    }

    public void D(szd szdVar) {
        String str;
        Map<String, String> map;
        szd szdVar2;
        szd szdVar3;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d71f3a", new Object[]{this, szdVar});
            return;
        }
        this.y = szdVar;
        if (szdVar != null) {
            R("bindBottomUserTaskBtn");
            W();
            this.y.getView().post(this.B);
            MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData = this.b;
            if (!(mtopIliadUsertaskTasksEntryResponseData == null || (szdVar3 = this.y) == null || (jSONObject = mtopIliadUsertaskTasksEntryResponseData.newAtmosphere) == null)) {
                szdVar3.setAtmosphere(jSONObject);
                if (!RVStartParams.TRANSPARENT_TITLE_ALWAYS.equals(this.b.newAtmosphere.getString("durationType"))) {
                    this.b.newAtmosphere = null;
                }
            }
            MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData2 = this.b;
            if (!(mtopIliadUsertaskTasksEntryResponseData2 == null || (szdVar2 = this.y) == null)) {
                szdVar2.changeGoldUI(mtopIliadUsertaskTasksEntryResponseData2);
                this.y.setEntryImage(this.i, "", true);
                this.y.setEntryText(this.m);
            }
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(gf0.K_DELIVERY_ID, this.f + "");
            MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData3 = this.b;
            if (!(mtopIliadUsertaskTasksEntryResponseData3 == null || (map = mtopIliadUsertaskTasksEntryResponseData3.utParams) == null)) {
                hashMap.putAll(map);
            }
            if (v2s.o().t() != null) {
                MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData4 = this.b;
                if (mtopIliadUsertaskTasksEntryResponseData4 == null || !"shopTrain".equals(mtopIliadUsertaskTasksEntryResponseData4.bizType)) {
                    str = "NewTask_liveEntrance_exporsure";
                } else {
                    str = "Show-rightAssembly_entrance";
                }
                v2s.o().t().a(str, hashMap);
            }
        }
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c730b7", new Object[]{this});
            return;
        }
        R("doSendTimeUserTask");
        C("UserTaskDoTask", 1);
        if (this.C == null) {
            this.C = new dtv(this);
        }
        if (!this.s && this.b != null) {
            this.s = true;
            JSONObject jSONObject = new JSONObject();
            String str = this.r;
            if (str != null) {
                jSONObject = fkx.d(str);
            }
            jSONObject.put("bizType", (Object) this.b.bizType);
            jSONObject.put("bizId", (Object) this.b.bizId);
            jSONObject.put("liveId", (Object) this.u);
            jSONObject.put(RequestConfig.KEY_ANCHOR_ID, (Object) this.v);
            jSONObject.put("action", (Object) "stay");
            jSONObject.put("actionValue", (Object) Integer.valueOf(this.b.countdownTime));
            this.C.K(this.f, this.p, this.q, fkx.i(jSONObject));
            MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData = this.b;
            if (mtopIliadUsertaskTasksEntryResponseData != null && "shopTrain".equals(mtopIliadUsertaskTasksEntryResponseData.bizType)) {
                C("UserTaskDoTaskRequest", 1);
            }
        }
    }

    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        R("onPause");
        E();
        X(true);
        szd szdVar = this.y;
        if (szdVar != null) {
            szdVar.onPause();
        }
    }

    public final void a0(MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55af2636", new Object[]{this, mtopIliadUsertaskTasksEntryResponseData});
            return;
        }
        R("setUsertaskTasksEntryData");
        this.b = mtopIliadUsertaskTasksEntryResponseData;
        if (mtopIliadUsertaskTasksEntryResponseData != null) {
            this.g = mtopIliadUsertaskTasksEntryResponseData.countdownTime * 1000;
            this.c = mtopIliadUsertaskTasksEntryResponseData.showEntry;
            this.n = mtopIliadUsertaskTasksEntryResponseData.taskWelfarePopLayer;
            this.f = mtopIliadUsertaskTasksEntryResponseData.deliveryId;
            this.e = mtopIliadUsertaskTasksEntryResponseData.entryUrl;
            UserTaskProcess userTaskProcess = mtopIliadUsertaskTasksEntryResponseData.process;
            if (userTaskProcess != null) {
                this.d = userTaskProcess.status;
            }
            MtopIliadUsertaskTasksEntryResponseData.EntryConfig entryConfig = mtopIliadUsertaskTasksEntryResponseData.entryConfig;
            if (entryConfig != null) {
                int i = (entryConfig.animationDuration * 1000) - 200;
                this.h = i;
                if (i < 0) {
                    this.h = 0;
                }
                this.i = entryConfig.normalIcon;
                this.j = entryConfig.successIcon;
                this.k = entryConfig.pauseIcon;
                this.l = entryConfig.pauseText;
                this.m = entryConfig.text;
                return;
            }
            return;
        }
        this.c = false;
    }

    @Override // tb.u7e
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        R("onDestroy");
        sjr.g().b(this);
        E();
        W();
        dtv dtvVar = this.C;
        if (dtvVar != null) {
            dtvVar.destroy();
            this.C = null;
        }
        ftv ftvVar = this.D;
        if (ftvVar != null) {
            ftvVar.destroy();
            this.D = null;
        }
        this.p = null;
        this.q = null;
        this.r = null;
        this.y = null;
        this.G = null;
        this.f32330a = false;
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f410cf9a", new Object[]{this})).booleanValue();
        }
        return v2s.o().p() != null && yqq.h(v2s.o().p().b("tblive", "enableDoTask4Background", "true"));
    }

    public final boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a73906f4", new Object[]{this})).booleanValue();
        }
        return v2s.o().p() != null && yqq.h(v2s.o().p().b("tblive", "enableShopTrainErrorDoTask0", "true"));
    }

    public final void Y() {
        t54 t54Var;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a14a46", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder("sendTaskWelfarePopLayer ");
        sb.append(this.o);
        sb.append(" ");
        if (this.n != null) {
            z = true;
        }
        sb.append(z);
        R(sb.toString());
        if (this.o && this.n != null && (t54Var = this.E) != null) {
            t54Var.z0().o("TBLiveWVPlugin.Event.showTaskWelfare", this.n.toJSONString());
        }
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        StringBuilder sb = new StringBuilder("dotask onError ");
        if (netResponse != null) {
            str = netResponse.getRetMsg();
        } else {
            str = "netResponse==null";
        }
        sb.append(str);
        R(sb.toString());
        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData = this.b;
        if (mtopIliadUsertaskTasksEntryResponseData != null && "shopTrain".equals(mtopIliadUsertaskTasksEntryResponseData.bizType)) {
            C("UserTaskDoTaskError", 1);
            I(19999, "UserTaskDoTaskError", new HashMap());
        }
        if (this.I == null || !N() || !"shopTrain".equals(this.b.bizType)) {
            this.s = false;
            if (this.J) {
                this.J = false;
                K();
                return;
            }
            szd szdVar = this.y;
            if (szdVar != null) {
                szdVar.setEntryText(this.m);
                this.y.setEntryImage(this.i, "", false);
                E();
                W();
                return;
            }
            return;
        }
        C("UserTaskDoTaskError2Success", 1);
        onSuccess(0, null, this.I, null);
    }

    public final void b0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96952b54", new Object[]{this, new Long(j)});
            return;
        }
        ValueAnimator valueAnimator = this.z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        R("startAnimator");
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.z = valueAnimator2;
        valueAnimator2.setFloatValues(P(), 360.0f);
        this.z.setDuration(j);
        this.z.setInterpolator(new LinearInterpolator());
        this.z.setRepeatCount(0);
        this.z.addUpdateListener(new e());
        this.z.start();
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        szd szdVar;
        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        this.s = false;
        this.J = true;
        if (!(netBaseOutDo == null || !(netBaseOutDo.getData() instanceof MtopIliadUsertaskTasksDotaskResponseData) || this.b == null)) {
            if (N() && "shopTrain".equals(this.b.bizType)) {
                this.I = netBaseOutDo;
            }
            MtopIliadUsertaskTasksDotaskResponseData mtopIliadUsertaskTasksDotaskResponseData = (MtopIliadUsertaskTasksDotaskResponseData) netBaseOutDo.getData();
            MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData2 = this.b;
            if (mtopIliadUsertaskTasksEntryResponseData2 != null && "shopTrain".equals(mtopIliadUsertaskTasksEntryResponseData2.bizType)) {
                R("dotask onSuccess " + fkx.i(netBaseOutDo.getData()));
                C("UserTaskDoTaskSuccess", 1);
                if (N()) {
                    this.I = netBaseOutDo;
                }
            }
            this.H = mtopIliadUsertaskTasksDotaskResponseData;
            if (mtopIliadUsertaskTasksDotaskResponseData != null) {
                int i2 = mtopIliadUsertaskTasksDotaskResponseData.countdownTime;
                if (i2 > 0 && (mtopIliadUsertaskTasksEntryResponseData = this.b) != null) {
                    mtopIliadUsertaskTasksEntryResponseData.countdownTime = i2;
                    this.g = i2 * 1000;
                }
                this.f = mtopIliadUsertaskTasksDotaskResponseData.deliveryId;
                JSONObject jSONObject = mtopIliadUsertaskTasksDotaskResponseData.deltaPoint;
                if (jSONObject != null && !TextUtils.isEmpty(jSONObject.getString("text"))) {
                    this.m = mtopIliadUsertaskTasksDotaskResponseData.deltaPoint.getString("text");
                }
                JSONObject jSONObject2 = mtopIliadUsertaskTasksDotaskResponseData.newAtmosphere;
                if (!(jSONObject2 == null || (szdVar = this.y) == null)) {
                    szdVar.setAtmosphere(jSONObject2);
                    MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData3 = this.b;
                    if (!(mtopIliadUsertaskTasksEntryResponseData3 == null || mtopIliadUsertaskTasksEntryResponseData3.newAtmosphere == null)) {
                        JSONObject jSONObject3 = mtopIliadUsertaskTasksDotaskResponseData.newAtmosphere;
                        mtopIliadUsertaskTasksEntryResponseData3.newAtmosphere = jSONObject3;
                        if (jSONObject3 != null) {
                            jSONObject3.remove("notice");
                        }
                    }
                }
                MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData4 = this.b;
                if (mtopIliadUsertaskTasksEntryResponseData4 != null) {
                    mtopIliadUsertaskTasksEntryResponseData4.utParams = mtopIliadUsertaskTasksDotaskResponseData.utParams;
                    mtopIliadUsertaskTasksEntryResponseData4.jumpType = mtopIliadUsertaskTasksDotaskResponseData.jumpType;
                    mtopIliadUsertaskTasksEntryResponseData4.jumpData = mtopIliadUsertaskTasksDotaskResponseData.jumpData;
                    mtopIliadUsertaskTasksEntryResponseData4.rewards = mtopIliadUsertaskTasksDotaskResponseData.rewards;
                    MtopIliadUsertaskTasksEntryResponseData.EntryConfig entryConfig = mtopIliadUsertaskTasksDotaskResponseData.entryConfig;
                    if (entryConfig != null && !TextUtils.isEmpty(entryConfig.text)) {
                        MtopIliadUsertaskTasksEntryResponseData.EntryConfig entryConfig2 = this.b.entryConfig;
                        String str = mtopIliadUsertaskTasksDotaskResponseData.entryConfig.text;
                        entryConfig2.text = str;
                        this.m = str;
                    }
                }
                szd szdVar2 = this.y;
                if (szdVar2 != null && !szdVar2.isNew()) {
                    this.y.changeGoldUI(mtopIliadUsertaskTasksDotaskResponseData);
                }
                MtopIliadUsertaskTasksEntryResponseData.EntryConfig entryConfig3 = mtopIliadUsertaskTasksDotaskResponseData.entryConfig;
                if (entryConfig3 != null) {
                    if (!TextUtils.isEmpty(entryConfig3.normalIcon)) {
                        this.i = mtopIliadUsertaskTasksDotaskResponseData.entryConfig.normalIcon;
                    }
                    if (!TextUtils.isEmpty(mtopIliadUsertaskTasksDotaskResponseData.entryConfig.successIcon)) {
                        this.j = mtopIliadUsertaskTasksDotaskResponseData.entryConfig.successIcon;
                    }
                    MtopIliadUsertaskTasksEntryResponseData.EntryConfig entryConfig4 = mtopIliadUsertaskTasksDotaskResponseData.entryConfig;
                    int i3 = entryConfig4.animationDuration;
                    if (i3 > 0) {
                        int i4 = (i3 * 1000) - 200;
                        this.h = i4;
                        if (i4 < 0) {
                            this.h = 0;
                        }
                    }
                    if (!TextUtils.isEmpty(entryConfig4.pauseIcon)) {
                        this.k = mtopIliadUsertaskTasksDotaskResponseData.entryConfig.pauseIcon;
                    }
                    if (!TextUtils.isEmpty(mtopIliadUsertaskTasksDotaskResponseData.entryConfig.pauseText)) {
                        this.l = mtopIliadUsertaskTasksDotaskResponseData.entryConfig.pauseText;
                    }
                }
                UserTaskProcess userTaskProcess = mtopIliadUsertaskTasksDotaskResponseData.process;
                if (userTaskProcess != null) {
                    int i5 = userTaskProcess.status;
                    this.d = i5;
                    if (i5 != 3) {
                        Z(0.0f);
                        szd szdVar3 = this.y;
                        if (szdVar3 == null) {
                            return;
                        }
                        if (this.d == 9) {
                            W();
                            this.y.setEntryText(this.l);
                            this.y.setEntryImage(this.k, "", false);
                            return;
                        }
                        if (szdVar3.isNew()) {
                            this.y.changeGoldUI(mtopIliadUsertaskTasksDotaskResponseData);
                        }
                        if (this.d == 10) {
                            this.y.setEntryText(this.l);
                            this.y.setEntryImage(this.k, "", false);
                        } else {
                            this.y.setEntryImage("", this.j, false);
                            this.y.setEntryText(this.m);
                        }
                        W();
                        this.y.getView().postDelayed(this.B, this.h);
                        return;
                    }
                    Z(0.0f);
                }
            }
        }
        szd szdVar4 = this.y;
        if (szdVar4 != null) {
            szdVar4.setEntryText(this.m);
            this.y.setEntryImage(this.i, "", false);
            E();
            W();
        }
    }
}
