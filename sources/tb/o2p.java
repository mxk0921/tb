package tb;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.ArrayMap;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.nav.Nav;
import com.taobao.android.task.Coordinator;
import com.taobao.login4android.api.Login;
import com.taobao.search.common.util.ClientIntelligenceHelper;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.ActivateWidget;
import com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.uikit.TopCropImageView;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.search.sf.widgets.searchbar.SearchBarTagBean;
import com.taobao.tao.timestamp.TimeStampManager;
import com.taobao.tao.util.MyUrlEncoder;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.view.TRecyclerView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.h1p;
import tb.i5p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class o2p extends abx implements zo6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TUrlImageView b;
    public final SearchDoorContext d;
    public SearchBarWidget e;
    public ActivateWidget f;
    public m12 g;
    public phw h;
    public View i;
    public paj j;
    public ViewGroup k;
    public TUrlImageView l;
    public wnd m;
    public boolean n;
    public volatile List<b2p> p;
    public boolean q;
    public boolean r;
    public final boolean v;
    public final boolean w;
    public ViewGroup x;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25101a = true;
    public boolean c = false;
    public String o = "";
    public boolean s = false;
    public final boolean t = o4p.m2();
    public boolean u = false;
    public boolean y = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f25102a;

        /* compiled from: Taobao */
        /* renamed from: tb.o2p$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C1014a extends xpo {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ View c;

            public C1014a(View view) {
                this.c = view;
            }

            public static /* synthetic */ Object ipc$super(C1014a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/SearchDoorWidget$13$1");
            }

            @Override // tb.xpo
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                } else {
                    a.this.f25102a.addView(this.c);
                }
            }
        }

        public a(ViewGroup viewGroup) {
            this.f25102a = viewGroup;
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else {
                o2p.this.getActivity().runOnUiThread(new C1014a(view));
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements kzn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f25103a;
        public final /* synthetic */ JSONObject b;

        public b(boolean z, JSONObject jSONObject) {
            this.f25103a = z;
            this.b = jSONObject;
        }

        @Override // tb.kzn
        public void a(phw<?, ? extends View, ?> phwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa7e6235", new Object[]{this, phwVar});
                return;
            }
            o2p.F2(o2p.this, phwVar);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("newEntrance", (Object) Boolean.valueOf(this.f25103a));
                jSONObject.put(HorizontalXslComponent.ATTR_PAGE_INFO, (Object) this.b);
                phwVar.bindWithData(jSONObject);
            } catch (Exception unused) {
            }
            o2p o2pVar = o2p.this;
            o2p.G2(o2pVar, o2p.E2(o2pVar));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f25104a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a extends xpo {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ View c;

            public a(View view) {
                this.c = view;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/SearchDoorWidget$15$1");
            }

            @Override // tb.xpo
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                } else {
                    c.this.f25104a.addView(this.c);
                }
            }
        }

        public c(ViewGroup viewGroup) {
            this.f25104a = viewGroup;
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else {
                o2p.this.getActivity().runOnUiThread(new a(view));
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements kzn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f25105a;

        public d(JSONObject jSONObject) {
            this.f25105a = jSONObject;
        }

        @Override // tb.kzn
        public void a(phw<?, ? extends View, ?> phwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa7e6235", new Object[]{this, phwVar});
                return;
            }
            o2p.F2(o2p.this, phwVar);
            phwVar.bindWithData(this.f25105a);
            o2p o2pVar = o2p.this;
            o2p.G2(o2pVar, o2p.E2(o2pVar));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vxm.b.b(snl.f28161a.f(o2p.t2(o2p.this)).b()).a(r4p.KEY_GRAY_HAIR, String.valueOf(o2p.this.s));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/SearchDoorWidget$18");
        }

        @Override // tb.xpo
        public void c() {
            JSONArray jSONArray;
            b2p a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            String Y = o4p.Y();
            if (!TextUtils.equals(Y, o2p.u2(o2p.this))) {
                o2p.v2(o2p.this, Y);
                ArrayList arrayList = new ArrayList();
                try {
                    jSONArray = JSON.parseArray(o2p.u2(o2p.this));
                } catch (Throwable unused) {
                    b4p.b("SearchDoorWidget", "interceptConfigParseFailed:" + o2p.u2(o2p.this));
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        Object obj = jSONArray.get(i);
                        if ((obj instanceof JSONObject) && (a2 = b2p.a((JSONObject) obj)) != null) {
                            arrayList.add(a2);
                        }
                    }
                    o2p.w2(o2p.this, arrayList);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements hk4<am1> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        /* renamed from: a */
        public void accept(am1 am1Var) {
            SearchBarHintBean u;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7393fd3", new Object[]{this, am1Var});
            } else if (am1Var != null && am1Var.a() != null && !am1Var.a().isEmpty() && am1Var.a().get(0) != null && (u = o2p.this.d.u("all")) != null) {
                u.updateHint(am1Var);
                u.handleMultiHint();
                o2p.this.postEvent(l0p.a(u));
                o2p.x2(o2p.this, u);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f25108a;

        public h(ViewGroup viewGroup) {
            this.f25108a = viewGroup;
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
                return;
            }
            this.f25108a.getLayoutParams().height = -2;
            this.f25108a.addView(view, 0);
            o2p.this.e.attachedToWindow();
            o2p.this.l3();
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i extends u0p {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i(o2p o2pVar, String str) {
            super(str);
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            if (str.hashCode() == 1569381830) {
                super.accept((Throwable) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/SearchDoorWidget$20");
        }

        @Override // tb.u0p
        /* renamed from: a */
        public void accept(Throwable th) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d8addc6", new Object[]{this, th});
                return;
            }
            super.accept(th);
            TLogTracker.i("Unknown", "-1", th.getMessage());
            AppMonitor.Alarm.commitFail("Page_SearchItemList", "SearchDoorMain", "30001", th.getMessage());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f25109a;

        public j(o2p o2pVar, ViewGroup viewGroup) {
            this.f25109a = viewGroup;
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else {
                this.f25109a.addView(view);
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            } else {
                kgw.c(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/SearchDoorWidget$2");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                o2p.this.s3();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class l extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements ViewTreeObserver.OnGlobalLayoutListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                    return;
                }
                int width = o2p.s2(o2p.this).getWidth();
                int height = o2p.s2(o2p.this).getHeight();
                if (width != 0 && height != 0) {
                    Rect rect = new Rect();
                    o2p.s2(o2p.this).getWindowVisibleDisplayFrame(rect);
                    int height2 = rect.height() + SystemBarDecorator.getStatusBarHeight(o2p.this.getActivity());
                    c4p.D("SearchDoorLayout", "height:" + height + ",visibleHeight:" + height2, new Object[0]);
                    if (height2 < height - 10) {
                        o2p o2pVar = o2p.this;
                        o2pVar.d.H(o2pVar.getActivity(), true);
                        return;
                    }
                    o2p o2pVar2 = o2p.this;
                    o2pVar2.d.H(o2pVar2.getActivity(), false);
                }
            }
        }

        public l() {
        }

        public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/SearchDoorWidget$3");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else if (!o2p.q2(o2p.this).isFinishing()) {
                o2p.s2(o2p.this).getViewTreeObserver().addOnGlobalLayoutListener(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class m implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tot f25111a;
        public final /* synthetic */ Activity b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a extends xpo {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ View c;

            public a(View view) {
                this.c = view;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/SearchDoorWidget$4$1");
            }

            @Override // tb.xpo
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                    return;
                }
                o2p.z2(o2p.this, this.c);
                if (o2p.A2(o2p.this)) {
                    this.c.setVisibility(4);
                }
                o2p.this.I2(this.c);
            }
        }

        public m(tot totVar, Activity activity) {
            this.f25111a = totVar;
            this.b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (!o2p.y2(o2p.this) || cpt.g() || cpt.h()) {
                view = cpt.c().b(o2p.this.getActivity(), this.f25111a);
            } else {
                view = new View(o2p.this.getActivity());
                view.setBackgroundColor(-1);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            }
            if (view != null) {
                a aVar = new a(view);
                if (kgw.b(this.b)) {
                    o2p.s2(o2p.this).postDelayed(aVar, 100L);
                } else {
                    o2p.B2(o2p.this).runOnUiThread(aVar);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class n implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TopCropImageView f25112a;
        public final /* synthetic */ hrs b;

        public n(TopCropImageView topCropImageView, hrs hrsVar) {
            this.f25112a = topCropImageView;
            this.b = hrsVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            o2p.this.I2(this.f25112a);
            if (!TextUtils.isEmpty(this.b.e)) {
                o2p.C2(o2p.this).setImageUrl(this.b.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class o implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f25113a;

        public o(o2p o2pVar, ViewGroup viewGroup) {
            this.f25113a = viewGroup;
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else {
                this.f25113a.addView(view);
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            } else {
                this.f25113a.removeView(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class p extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ phw c;

        public p(phw phwVar) {
            this.c = phwVar;
        }

        public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/SearchDoorWidget$7");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                this.c.attachToContainer();
            }
        }
    }

    static {
        t2o.a(815793113);
        t2o.a(993002134);
    }

    public o2p(Activity activity, ude udeVar) {
        super(activity, udeVar);
        SearchDoorContext searchDoorContext = new SearchDoorContext();
        this.d = searchDoorContext;
        this.v = xyd.a(activity);
        searchDoorContext.Q(true);
        this.w = ((xnd) activity).n();
    }

    public static /* synthetic */ boolean A2(o2p o2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e72a23d", new Object[]{o2pVar})).booleanValue();
        }
        return o2pVar.a3();
    }

    public static /* synthetic */ Activity B2(o2p o2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("808e48ae", new Object[]{o2pVar});
        }
        return o2pVar.mActivity;
    }

    public static /* synthetic */ TUrlImageView C2(o2p o2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("90585e1", new Object[]{o2pVar});
        }
        return o2pVar.l;
    }

    public static /* synthetic */ TUrlImageView D2(o2p o2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("7f1ba840", new Object[]{o2pVar});
        }
        return o2pVar.b;
    }

    public static /* synthetic */ phw E2(o2p o2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (phw) ipChange.ipc$dispatch("b4a4c7c2", new Object[]{o2pVar});
        }
        return o2pVar.h;
    }

    public static /* synthetic */ phw F2(o2p o2pVar, phw phwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (phw) ipChange.ipc$dispatch("a32c4097", new Object[]{o2pVar, phwVar});
        }
        o2pVar.h = phwVar;
        return phwVar;
    }

    public static /* synthetic */ void G2(o2p o2pVar, phw phwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dcff487", new Object[]{o2pVar, phwVar});
        } else {
            o2pVar.Z2(phwVar);
        }
    }

    public static /* synthetic */ Object ipc$super(o2p o2pVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2033763616:
                return super.findView(((Number) objArr[0]).intValue());
            case 217607196:
                super.onCtxResume();
                return null;
            case 299066517:
                super.onCtxPause();
                return null;
            case 593843865:
                super.onCtxDestroy();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/SearchDoorWidget");
        }
    }

    public static /* synthetic */ Activity q2(o2p o2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("2467fb93", new Object[]{o2pVar});
        }
        return o2pVar.mActivity;
    }

    public static /* synthetic */ ViewGroup s2(o2p o2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4573c31f", new Object[]{o2pVar});
        }
        return o2pVar.k;
    }

    public static /* synthetic */ Activity t2(o2p o2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("85d32284", new Object[]{o2pVar});
        }
        return o2pVar.mActivity;
    }

    public static /* synthetic */ String u2(o2p o2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d034f49b", new Object[]{o2pVar});
        }
        return o2pVar.o;
    }

    public static /* synthetic */ String v2(o2p o2pVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9ae078f", new Object[]{o2pVar, str});
        }
        o2pVar.o = str;
        return str;
    }

    public static /* synthetic */ List w2(o2p o2pVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("adf3c10e", new Object[]{o2pVar, list});
        }
        o2pVar.p = list;
        return list;
    }

    public static /* synthetic */ void x2(o2p o2pVar, SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a16274", new Object[]{o2pVar, searchBarHintBean});
        } else {
            o2pVar.P2(searchBarHintBean);
        }
    }

    public static /* synthetic */ boolean y2(o2p o2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2f3b23b", new Object[]{o2pVar})).booleanValue();
        }
        return o2pVar.v;
    }

    public static /* synthetic */ View z2(o2p o2pVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b6ce5a1a", new Object[]{o2pVar, view});
        }
        o2pVar.i = view;
        return view;
    }

    public final void B3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc9b511", new Object[]{this});
        } else {
            this.mActivity.runOnUiThread(new e());
        }
    }

    public final void C3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8210a55", new Object[]{this});
            return;
        }
        String w = this.d.w();
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", w);
        hashMap.putAll(this.d.p());
        hashMap.put("channelSrp", this.d.d());
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), hashMap);
    }

    public final void H2(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02e8f7f", new Object[]{this, map});
        } else if (map != null && o4p.W1()) {
            String f2 = ClientIntelligenceHelper.e().f(ClientIntelligenceHelper.INVOKE_ID_SEARCH_DOOR_BG_WORD, SearchDoorActivity.PAGE_NAME, Integer.valueOf(o4p.W()));
            if (!TextUtils.isEmpty(f2)) {
                map.put("bxFeature", f2);
            }
        }
    }

    public void I2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8498bc9b", new Object[]{this, view});
        } else {
            this.k.addView(view, 0);
        }
    }

    public final String M2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2be6a93c", new Object[]{this, str});
        }
        String r = this.d.r("from", "");
        if (TextUtils.isEmpty(r)) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            return r;
        }
        return str + "-" + r;
    }

    public final hrs N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hrs) ipChange.ipc$dispatch("d42b01de", new Object[]{this});
        }
        String d2 = this.d.d();
        if (TextUtils.isEmpty(d2)) {
            return null;
        }
        String q = this.d.q("pageCfg");
        if (TextUtils.isEmpty(q)) {
            q = this.d.q("g_pageCfg");
        }
        if (TextUtils.isEmpty(q)) {
            aj3.INSTANCE.b(d2);
            return null;
        }
        JSONObject parseObject = JSON.parseObject(q);
        if (parseObject == null) {
            aj3.INSTANCE.b(d2);
            return null;
        }
        hrs a2 = hrs.a(parseObject.getJSONObject("tabAtmosphere"));
        if (a2 == null) {
            aj3.INSTANCE.b(d2);
            return null;
        }
        aj3.INSTANCE.c(d2, a2);
        return a2;
    }

    public SearchBarWidget O2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchBarWidget) ipChange.ipc$dispatch("9188af99", new Object[]{this});
        }
        return this.e;
    }

    public final void P2(SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdb0777c", new Object[]{this, searchBarHintBean});
            return;
        }
        paj pajVar = this.j;
        if (pajVar != null) {
            pajVar.destroyAndRemoveFromParent();
        }
        if (searchBarHintBean.multiSearchText != null) {
            ViewGroup viewGroup = (ViewGroup) findView(R.id.tbsearch_searchbar_container);
            paj pajVar2 = new paj(getActivity(), this, this.d, viewGroup, new j(this, viewGroup));
            this.j = pajVar2;
            pajVar2.attachToContainer();
            this.j.bindWithData(searchBarHintBean);
            if (this.c) {
                this.j.hide();
            }
        }
    }

    public void R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3962ce8b", new Object[]{this});
        } else {
            this.y = false;
        }
    }

    public final void S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        subscribeEvent(this);
        Q2();
        W2();
        postEvent(v1p.a());
    }

    public final void T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af5492a", new Object[]{this});
            return;
        }
        U2(false);
        this.n = false;
    }

    public void U2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08b2546", new Object[]{this, new Boolean(z)});
        } else if (this.n && this.m != null) {
            if (this.f == null) {
                ViewGroup viewGroup = (ViewGroup) findView(R.id.tbsearch_activate_container);
                if (a3()) {
                    viewGroup.setBackgroundResource(R.drawable.tbsearch_activate_bg_night);
                }
                ActivateWidget a2 = this.m.a(this.mActivity, this, this.d, viewGroup, new o(this, viewGroup));
                this.f = a2;
                a2.ensureView();
                this.f.show();
            }
            if (z) {
                this.f.S2();
            } else {
                this.f.K2();
            }
            ActivateWidget activateWidget = this.f;
            if (activateWidget != null) {
                Z2(activateWidget);
            }
        }
    }

    public final void W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e5fc86", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) findView(R.id.tbsearch_searchbar_container);
        this.mActivity.runOnUiThread(new p2p(this));
        if (this.e == null) {
            SearchBarWidget b2 = this.m.b(this.mActivity, this, this.d, viewGroup, new q2p(this, viewGroup));
            this.e = b2;
            b2.initSearchHint();
            Z2(this.e);
            T2();
        } else {
            T2();
            this.e.ensureView();
            this.e.applyDefaultSearchHint();
            Z2(this.e);
        }
        ViewGroup viewGroup2 = (ViewGroup) findView(R.id.tbsearch_suggest_container);
        k2p k2pVar = new k2p(this.mActivity, this, this.d, viewGroup2, new l2p(this, viewGroup2));
        this.g = k2pVar;
        Z2(k2pVar);
        ViewGroup viewGroup3 = (ViewGroup) findView(R.id.tbsearch_realtime_speech_container);
        if (!this.t) {
            V2(false, false, null);
        }
        Z2(new j2p(getActivity(), this, this.d, viewGroup3, new m2p(this, viewGroup3)));
        getActivity().runOnUiThread(new n2p(this, viewGroup3));
    }

    public final boolean X2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abe56b3b", new Object[]{this, str})).booleanValue();
        }
        List<b2p> list = this.p;
        if (list != null && !list.isEmpty()) {
            long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp();
            for (b2p b2pVar : list) {
                if (currentTimeStamp >= b2pVar.f16147a && currentTimeStamp <= b2pVar.b) {
                    Iterator it = ((ArrayList) b2pVar.c).iterator();
                    while (it.hasNext()) {
                        if (TextUtils.equals((String) it.next(), str)) {
                            z3(str);
                            Nav.from(getActivity()).toUri(b2pVar.d);
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    public final void Z2(phw phwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e1f4ad", new Object[]{this, phwVar});
            return;
        }
        phwVar.ensureView();
        getActivity().runOnUiThread(new p(phwVar));
    }

    public final boolean a3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        if (!(getActivity() instanceof oxb) || !((oxb) getActivity()).E1()) {
            return false;
        }
        return true;
    }

    public void b3(String str, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb61c53", new Object[]{this, str, map, new Boolean(z)});
        } else {
            c3(str, map, z, null);
        }
    }

    public void c3(String str, Map<String, String> map, boolean z, JSONObject jSONObject) {
        String t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497834fd", new Object[]{this, str, map, new Boolean(z), jSONObject});
            return;
        }
        if (z) {
            t3();
            y3(str);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("query", str);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), hashMap);
        map.putAll(this.d.z());
        map.put("search_action", r4p.VALUE_SEARCH_ACTION_ZD);
        if (o4p.c2()) {
            t = this.d.g();
        } else {
            t = this.d.t("");
        }
        if (!TextUtils.isEmpty(t)) {
            map.put("tab", t);
        }
        x3(str, z, t);
        a0p.d();
        a0p.a("whole");
        HashMap hashMap2 = new HashMap();
        if (d3()) {
            map.put(r4p.KEY_TB_2024, String.valueOf(this.v));
            A3(map, z, t, hashMap2);
        }
        if (jSONObject != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.add(jSONObject);
            map.put(h1p.KEY_SEARCH_BAR_TAG, jSONArray.toJSONString());
        }
        String n2 = this.d.n();
        if (!TextUtils.isEmpty(n2)) {
            map.put("lastQ", n2);
        }
        this.d.P(str);
        hashMap2.put("spm", this.d.w());
        if (!J2(str, map)) {
            x3p.c(map, this.mActivity, t, true, hashMap2, this.d.F());
        }
        postEvent(x1p.a(str));
    }

    public final boolean d3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de982f2d", new Object[]{this})).booleanValue();
        }
        return true ^ "cart_search".equals(this.d.d());
    }

    public boolean e3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c2d38c9", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final jrh f3(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jrh) ipChange.ipc$dispatch("8cffb2c1", new Object[]{this, map});
        }
        CommonSearchContext fromMap = CommonSearchContext.fromMap(map);
        fromMap.init();
        return gu6.b(true, fromMap, getCore());
    }

    @Override // tb.abx
    public View findView(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("86c73ae0", new Object[]{this, new Integer(i2)});
        }
        ViewGroup viewGroup = this.x;
        if (viewGroup != null) {
            return viewGroup.findViewById(i2);
        }
        return super.findView(i2);
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "SearchDoorWidget";
    }

    public void i3(uwq uwqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ab4058e", new Object[]{this, uwqVar});
            return;
        }
        throw null;
    }

    public Map<String, String> k3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8538e012", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        postEvent(t1p.a());
        if (TextUtils.isEmpty(str)) {
            b4p.n("SearchDoorWidget", "要搜索的内容为空，不进行操作");
            return hashMap;
        }
        this.d.O(str);
        hashMap.put("q", str);
        return hashMap;
    }

    public void l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59531c77", new Object[]{this});
        }
    }

    @Override // tb.abx
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        destroyComponent();
        if (getActivity() instanceof oxb) {
            ((oxb) getActivity()).j0(this);
        }
    }

    @Override // tb.abx
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
        } else {
            super.onCtxPause();
        }
    }

    public void onEventMainThread(ca0 ca0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbf0a6c", new Object[]{this, ca0Var});
            return;
        }
        C3();
        if (this.t) {
            ja0 ja0Var = ca0Var.f16933a;
            if (ja0Var != null) {
                V2(ja0Var.s, ja0Var.t, ja0Var.v);
            } else {
                V2(false, false, null);
            }
        }
    }

    @Override // tb.zo6
    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) findView(R.id.tbsearch_activate_container);
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(R.drawable.tbsearch_activate_bg_night);
        }
        TUrlImageView tUrlImageView = this.b;
        if (tUrlImageView != null) {
            tUrlImageView.setBackgroundResource(R.color.tbsearch_main_card_bg_night);
        }
        m12 m12Var = this.g;
        if (!(m12Var == null || m12Var.getView() == 0)) {
            ((TRecyclerView) this.g.getView()).setBackgroundResource(R.color.tbsearch_main_card_bg_night);
        }
        View view = this.i;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public void p3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        postEvent(z1p.a(z, this.d.v()));
        this.d.Q(false);
        this.d.R(false);
    }

    public final void q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec355b78", new Object[]{this});
        } else {
            Coordinator.execute(new f());
        }
    }

    public boolean r3(Handler handler, us7 us7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c37ff488", new Object[]{this, handler, us7Var})).booleanValue();
        }
        Q2();
        if (this.s) {
            return false;
        }
        this.n = true;
        ViewGroup viewGroup = (ViewGroup) findView(R.id.tbsearch_searchbar_container);
        if (e3()) {
            viewGroup.getLayoutParams().height = SystemBarDecorator.getStatusBarHeight(getActivity()) + o1p.a(48.0f);
        } else {
            viewGroup.getLayoutParams().height = o1p.a(48.0f);
        }
        U2(true);
        SearchBarWidget b2 = this.m.b(this.mActivity, this, this.d, viewGroup, new h(viewGroup));
        this.e = b2;
        b2.initHint();
        handler.post(new k());
        return true;
    }

    public final void t3() {
        SharedPreferences b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c065bd", new Object[]{this});
            return;
        }
        String nick = Login.getNick();
        if (!TextUtils.isEmpty(nick) && (b2 = v4p.b()) != null) {
            SharedPreferences.Editor edit = b2.edit();
            edit.putBoolean(nick + "_hintUsed", true).apply();
        }
    }

    public void u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72245e30", new Object[]{this});
        } else if (o4p.X1()) {
            HashMap hashMap = new HashMap();
            hashMap.put("access_from", "search_door");
            String d2 = this.d.d();
            if (!TextUtils.isEmpty(d2)) {
                hashMap.put("channelSrp", d2);
            }
            String q = this.d.q("searchBoxTestParam");
            if (!TextUtils.isEmpty(q)) {
                hashMap.put("searchBoxTestParam", q);
            }
            String nick = Login.getNick();
            if (!TextUtils.isEmpty(nick)) {
                hashMap.put("u", nick);
            }
            String userId = Login.getUserId();
            if (!TextUtils.isEmpty(userId)) {
                hashMap.put("user_id", userId);
            }
            H2(hashMap);
            hashMap.put(r4p.KEY_GOOD_PRICE, this.d.s(r4p.KEY_GOOD_PRICE));
            new i5p.c().c(new cm1(hashMap)).b(new bm1()).d(new v5p("BGWords")).a().e().j().n(new g(), new i(this, "bgwords"));
        }
    }

    public final void v3(hrs hrsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d126efb", new Object[]{this, hrsVar});
            return;
        }
        this.d.L(hrsVar);
        TopCropImageView topCropImageView = new TopCropImageView(getActivity());
        topCropImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, o1p.b(150)));
        if (!TextUtils.isEmpty(hrsVar.c)) {
            topCropImageView.setImageUrl(hrsVar.c);
        } else if (!TextUtils.isEmpty(hrsVar.d)) {
            topCropImageView.setBackgroundColor(srl.c(hrsVar.d, 0));
        }
        topCropImageView.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_IGNORE);
        this.mActivity.runOnUiThread(new n(topCropImageView, hrsVar));
    }

    public void w3(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b890e44", new Object[]{this, viewGroup});
        } else {
            this.x = viewGroup;
        }
    }

    public final void x3(String str, boolean z, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3eec4ea", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "all";
        }
        HashMap hashMap = new HashMap();
        if (z) {
            str3 = Constants.VAL_YES;
        } else {
            str3 = "no";
        }
        hashMap.put("use_hintq", str3);
        hashMap.put("search_text", str);
        hashMap.put("tab", str2);
        SearchBarHintBean u = this.d.u(str2);
        if (u != null) {
            hashMap.put("display_text", u.displayText);
            if (!TextUtils.isEmpty(u.iconName)) {
                hashMap.put(ChangeAppIconBridge.KEY_ICONNAME, u.iconName);
            }
            Map<String, String> map = u.utParams;
            if (map != null && !map.isEmpty()) {
                hashMap.putAll(u.utParams);
            }
        }
        hashMap.put(h1p.KEY_SUGGEST_RN, this.d.y(str2));
        String d2 = this.d.d();
        if (!TextUtils.isEmpty(d2)) {
            hashMap.put("channelSrp", d2);
        }
        hashMap.put("item_id", this.d.q("targetItemId"));
        sen.d(z9u.SEARCH_START_SEARCH, hashMap);
        if (z && u != null && u.isAdvHint()) {
            AlimamaAdvertising.instance().buildTanxClickTracking(getActivity().getApplication(), u.advInfo.getClickParams()).b(r4p.RUNTIME_PERMISSION_REQUEST_BIZ_NAME).a();
        }
    }

    public final void y3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8549bc", new Object[]{this, str});
            return;
        }
        long j2 = this.d.j();
        if (j2 != 0 && System.currentTimeMillis() - j2 <= 10000) {
            HashMap hashMap = new HashMap();
            hashMap.put("hintq", str);
            hashMap.put(h1p.KEY_SUGGEST_RN, this.d.y("all"));
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(SearchDoorActivity.PAGE_NAME, 2101, "hintq_guide_click", "", "", hashMap).build());
        }
    }

    public final void z3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4b9fd6", new Object[]{this, str});
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("q", str);
        arrayMap.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(new Date(TimeStampManager.instance().getCurrentTimeStamp())));
        sen.f("QueryIntercept", arrayMap);
    }

    public final void A3(Map<String, String> map, boolean z, String str, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e81b901", new Object[]{this, map, new Boolean(z), str, map2});
            return;
        }
        jrh f3 = f3(map);
        f3.addParam("schemaType", "auction");
        if (z) {
            SearchDoorContext searchDoorContext = this.d;
            if (TextUtils.isEmpty(str)) {
                str = "all";
            }
            SearchBarHintBean u = searchDoorContext.u(str);
            if (u != null && u.isAdvHint()) {
                Map<String, String> clickUrlParams = u.advInfo.getClickUrlParams();
                if (clickUrlParams != null) {
                    map2.putAll(clickUrlParams);
                }
                if (u.advInfo.getRequestParams() != null && !u.advInfo.getRequestParams().isEmpty()) {
                    for (Map.Entry<String, String> entry : u.advInfo.getRequestParams().entrySet()) {
                        f3.setParam(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        if (!gtf.i().k()) {
            f3.setParam(r4p.KEY_JARVIS_DISABLED, String.valueOf(true));
            map.put(r4p.KEY_JARVIS_DISABLED, String.valueOf(true));
        }
        f3.doNewSearch();
        f3.setParam("schemaType", "all");
        map.put(h1p.KEY_DATASOURCE_TOKEN, n1p.b().c(f3));
    }

    public final void K2(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c42717", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            b4p.b("SearchDoorWidget", "dynamicNavToSrp:paramsObject为空");
        } else {
            String string = jSONObject.getString("q");
            if (!Y2(string)) {
                Map<String, String> k3 = k3(string);
                for (String str : jSONObject.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String string2 = jSONObject.getString(str);
                        if (!TextUtils.isEmpty(string2)) {
                            k3.put(str, string2);
                        }
                    }
                }
                k3.put("from", M2(jSONObject.getString("from")));
                Object remove = jSONObject.remove("tag");
                if (remove instanceof JSONObject) {
                    jSONObject2 = (JSONObject) remove;
                    SearchBarTagBean fromJson = SearchBarTagBean.fromJson(jSONObject2);
                    for (Map.Entry<String, String> entry : fromJson.getParams().entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                            k3.put(key, value);
                        }
                    }
                    if (!TextUtils.isEmpty(fromJson.getQ())) {
                        string = string + " " + fromJson.getQ();
                        k3.put(r4p.KEY_TAG_SEARCH_KEYWORD, string);
                    }
                } else {
                    jSONObject2 = null;
                }
                c3(string, k3, false, jSONObject2);
            }
        }
    }

    public boolean L2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97a31ba6", new Object[]{this})).booleanValue();
        }
        return true ^ "false".equals(this.d.s("tbsearch_popup_animated"));
    }

    public final void V2(boolean z, boolean z2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a005ed3", new Object[]{this, new Boolean(z), new Boolean(z2), jSONObject});
        } else if (!this.u) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) getActivity().getSystemService("accessibility");
            if (accessibilityManager == null || !accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                this.u = true;
                ViewGroup viewGroup = (ViewGroup) findView(R.id.tbsearch_realtime_speech_container);
                viewGroup.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_IGNORE);
                if (!Localization.p()) {
                    return;
                }
                if (this.q && this.r) {
                    return;
                }
                if (z) {
                    bcq.a().f(getActivity(), "taowise_android_aar");
                    lzn.INSTANCE.h("voice_search", new mzn(this.mActivity, this, this.d.z(), viewGroup, new a(viewGroup)), new b(z2, jSONObject));
                    return;
                }
                lzn.INSTANCE.g(z9u.SOURCE_SPEECH, new mzn(this.mActivity, this, this.d.z(), viewGroup, new c(viewGroup)), new d(jSONObject));
            }
        }
    }

    public final void g3(z90 z90Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7659a", new Object[]{this, z90Var});
            return;
        }
        ActivateBean activateBean = z90Var.f32611a;
        int i2 = z90Var.b;
        String str2 = activateBean.keyword;
        if (!Y2(str2)) {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("tab", this.d.g());
            arrayMap.put("q", str2);
            if (!TextUtils.isEmpty(z90Var.c)) {
                arrayMap.put(h1p.KEY_SUGGEST_RN, z90Var.c);
            }
            arrayMap.put("channelSrp", this.d.d());
            if ("true".equals(this.d.s(r4p.KEY_GOOD_PRICE))) {
                str = "1";
            } else {
                str = "0";
            }
            arrayMap.put("digou_flag", str);
            sen.f("Activate_" + activateBean.groupType, arrayMap);
            Map<String, String> k3 = k3(str2);
            k3.put("from", M2(activateBean.groupType));
            k3.put("subtype", activateBean.subType);
            k3.put("index", String.valueOf(i2));
            k3.put("sugg", MyUrlEncoder.encod(this.e.getSearchEditContent(), "utf-8") + "_" + i2 + "_1");
            if (!TextUtils.isEmpty(activateBean.suggestRn)) {
                k3.put(h1p.KEY_SUGGEST_RN, activateBean.suggestRn);
            }
            Map<String, String> map = activateBean.searchparams;
            if (map != null) {
                k3.putAll(map);
            }
            b3(str2, k3, false);
        }
    }

    public void h3(twq twqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3528caad", new Object[]{this, twqVar});
            return;
        }
        SearchBarWidget searchBarWidget = this.e;
        if (searchBarWidget != null) {
            searchBarWidget.setSearchWord(twqVar.f29006a);
            ArrayMap arrayMap = new ArrayMap(1);
            arrayMap.put("type", "mainsearch");
            sen.f("AppendSuggest", arrayMap);
        }
    }

    public void j3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24ef44", new Object[]{this});
            return;
        }
        if (this.w) {
            this.m = null;
        }
        this.d.R(true);
        UTAnalytics.getInstance().getDefaultTracker().skipPageBack(getActivity());
        Q2();
        this.d.V("srp");
        this.d.X(true);
        postEvent(v1p.a());
    }

    public final void n3(fbq fbqVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df034fa2", new Object[]{this, fbqVar});
            return;
        }
        String str2 = fbqVar.f19174a;
        String str3 = fbqVar.b;
        if (!Y2(str2)) {
            Map<String, String> k3 = k3(str2);
            if (this.s) {
                str = h1p.b.TYPE_ELDER_OLD_VOICE;
            } else {
                str = "voice";
            }
            k3.put("from", M2(str));
            k3.put("asrrn", str3);
            b3(str2, k3, false);
        }
    }

    public final void o3(vwq vwqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2af7ec8e", new Object[]{this, vwqVar});
            return;
        }
        String str = vwqVar.f30305a;
        String searchEditContent = this.e.getSearchEditContent();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("query", searchEditContent);
        arrayMap.put(mf6.TYPE_SELECTED, str);
        arrayMap.put("sug_content", vwqVar.d);
        if (!TextUtils.isEmpty(vwqVar.b)) {
            arrayMap.put(h1p.KEY_SUGGEST_RN, vwqVar.b);
        }
        String r = this.d.r("searchDoorFrom", "");
        if (TextUtils.isEmpty(r)) {
            r = "shouye";
        }
        arrayMap.put("stats_show", r);
        arrayMap.put("tab", this.d.g());
        sen.f("SearchSuggest", arrayMap);
        if (!Y2(str)) {
            Map<String, String> k3 = k3(str);
            if (!TextUtils.isEmpty(vwqVar.b)) {
                k3.put(h1p.KEY_SUGGEST_RN, vwqVar.b);
            }
            Map<String, String> map = vwqVar.c;
            if (map != null) {
                k3.putAll(map);
            }
            b3(str, k3, false);
        }
    }

    public final boolean J2(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e34b8fd4", new Object[]{this, str, map})).booleanValue();
        }
        if (!"cart_search".equals(this.d.d())) {
            return false;
        }
        if (!map.containsKey(na3.sQueryParamsKeyDefaultFilterItem)) {
            map.put(na3.sQueryParamsKeyDefaultFilterItem, "xsearch_kwd_" + str);
        }
        Nav.from(getActivity()).toUri(g6p.c("https://main.m.taobao.com/cart/index.html?feedFlowType=xsearch&hasback=true", map));
        return true;
    }

    public final void Q2() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77db0355", new Object[]{this});
        } else if (this.m == null || !this.w) {
            this.d.A(bql.c(this.mActivity.getIntent()));
            this.d.S(r4p.KEY_TB_2024, String.valueOf(this.v));
            if (TextUtils.isEmpty(this.d.q(r4p.KEY_SEARCH_ELDER_HOME_OPEN))) {
                this.d.S(r4p.KEY_SEARCH_ELDER_HOME_OPEN, String.valueOf(cvr.INSTANCE.f()));
            }
            this.s = "true".equals(this.d.q(r4p.KEY_SEARCH_ELDER_HOME_OPEN));
            B3();
            this.d.S(r4p.KEY_GRAY_HAIR, String.valueOf(this.s));
            wnd a2 = a2p.a(this.d);
            if (this.m != a2) {
                z = true;
            }
            this.n = z;
            this.m = a2;
            if (o4p.a()) {
                this.d.K("from");
            }
            B3();
            C3();
        }
    }

    public final boolean Y2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b16af3a", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            b4p.n("SearchDoorWidget", "关键词为空，不进行操作");
            return false;
        } else if (!e6p.a(str, this.mActivity)) {
            return X2(str);
        } else {
            this.d.O(str);
            return true;
        }
    }

    public final void m3(String str, SearchBarHintBean searchBarHintBean) {
        String str2;
        HashMap<String, String> hashMap;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7801ce98", new Object[]{this, str, searchBarHintBean});
            return;
        }
        TextUtils.equals(str, wr3.SIGNAL);
        String v2 = this.g.v2();
        String u2 = this.g.u2();
        boolean isEmpty = TextUtils.isEmpty(str);
        if (!TextUtils.isEmpty(v2)) {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("suggestRN", v2);
            sen.f(z9u.SEARCH_ENTRANCE_CLICK, arrayMap);
        } else {
            sen.e(z9u.SEARCH_ENTRANCE_CLICK);
        }
        if (!TextUtils.isEmpty(str) || searchBarHintBean == null || TextUtils.isEmpty(searchBarHintBean.searchText)) {
            z = false;
        } else {
            str = searchBarHintBean.searchText;
        }
        if (!TextUtils.isEmpty(str) && !Y2(str)) {
            Map<String, String> k3 = k3(str);
            if (!TextUtils.isEmpty(u2) && !isEmpty) {
                k3.put("sug_session_id", u2);
            }
            if (z && (hashMap = searchBarHintBean.extraParams) != null) {
                k3.putAll(hashMap);
            }
            if (!z) {
                str2 = "input";
            } else if (searchBarHintBean.hasRefresh) {
                str2 = "hintq_search_door";
            } else {
                str2 = "hintq";
            }
            k3.put("from", M2(str2));
            b3(str, k3, z);
            sen.e(r4p.VALUE_SEARCH_ACTION_ZD);
        }
    }

    @Override // tb.abx
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        q3();
        C3();
        if (this.f25101a) {
            this.d.V("homepage");
            this.f25101a = false;
            return;
        }
        if (!this.d.E()) {
            this.d.V("srpBack");
            m12 m12Var = this.g;
            if (!(m12Var == null || m12Var.getView() == 0 || ((TRecyclerView) this.g.getView()).getVisibility() != 0)) {
                this.d.X(true);
                this.g.B2(this.e.getSearchEditContent(), this.d.g());
            }
        }
        if (TextUtils.isEmpty(this.d.d())) {
            u3();
        }
    }

    public void s3() {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bd12155", new Object[]{this});
            return;
        }
        Activity activity = getActivity();
        ViewGroup viewGroup = (ViewGroup) findView(R.id.tbsearch_searchdoor);
        this.k = viewGroup;
        this.l = (TUrlImageView) viewGroup.findViewById(R.id.tbsearch_atmosphere_logo);
        if ((getActivity() instanceof oic) && ((oic) getActivity()).i1()) {
            this.mActivity.runOnUiThread(new l());
        }
        TUrlImageView tUrlImageView = (TUrlImageView) findView(R.id.imv_searchdoor_header);
        this.b = tUrlImageView;
        tUrlImageView.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_IGNORE);
        this.r = o4p.Y1();
        if (activity instanceof f2c) {
            f2c f2cVar = (f2c) activity;
            if (f2cVar.J2() && f2cVar.B0()) {
                z = true;
            }
            this.q = z;
        }
        S2();
        hrs N2 = N2();
        if (N2 != null) {
            v3(N2);
        } else if (this.y) {
            if (o4p.D2()) {
                x5p x5pVar = x5p.INSTANCE;
                x5pVar.b();
                str = x5pVar.a();
            } else {
                str = "search";
            }
            this.mActivity.runOnUiThread(new m(new tot(str, o1p.b(150)), activity));
        }
        if (activity instanceof oxb) {
            ((oxb) activity).P(this);
        }
    }

    public void onEventMainThread(n0p n0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d049359a", new Object[]{this, n0pVar});
        } else {
            C3();
        }
    }

    public void onEventMainThread(i0p i0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a21771b", new Object[]{this, i0pVar});
        } else if (this.j != null) {
            if (i0pVar.b()) {
                this.c = false;
                this.j.show();
                return;
            }
            this.c = true;
            this.j.hide();
        }
    }

    public void onEventMainThread(c9j c9jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d05a615", new Object[]{this, c9jVar});
            return;
        }
        Map<String, String> k3 = k3(c9jVar.a());
        k3.put("from", "hintq_under_search_door");
        b3(c9jVar.a(), k3, false);
    }

    public void onEventMainThread(j0p j0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98bd41ac", new Object[]{this, j0pVar});
        } else {
            m3(j0pVar.f21692a, j0pVar.b);
        }
    }

    public void onEventMainThread(twq twqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f67e5d", new Object[]{this, twqVar});
        } else {
            h3(twqVar);
        }
    }

    public void onEventMainThread(uwq uwqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbba33f", new Object[]{this, uwqVar});
        } else {
            i3(uwqVar);
        }
    }

    public void onEventMainThread(fbq fbqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52f952d", new Object[]{this, fbqVar});
        } else {
            n3(fbqVar);
        }
    }

    public void onEventMainThread(z90 z90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a402d6", new Object[]{this, z90Var});
        } else {
            g3(z90Var);
        }
    }

    public void onEventMainThread(f64 f64Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23ff93", new Object[]{this, f64Var});
        } else if ("goToSrp".equals(f64Var.f19044a)) {
            K2(f64Var.b);
        }
    }

    public void onEventMainThread(vwq vwqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b400cf3", new Object[]{this, vwqVar});
        } else {
            o3(vwqVar);
        }
    }

    public void onEventMainThread(k0p k0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448a68e3", new Object[]{this, k0pVar});
        } else if (this.j == null) {
            P2(k0pVar.f22330a);
        }
    }
}
