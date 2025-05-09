package tb;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.XSSuggestRecyclerPool;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.downgrade.Downgrade;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.base.SearchDoorAdapter;
import com.taobao.search.searchdoor.sf.widgets.suggest.TppSuggestAdapter;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.SmoothRecyclerScrollFeature;
import com.taobao.uikit.feature.view.TRecyclerView;
import com.taobao.weex.WXSDKInstance;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.MethodEnum;
import tb.i5p;
import tb.rpc;
import tb.zzo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class m12 extends phw<Void, TRecyclerView, SearchDoorContext> implements View.OnTouchListener, vnd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final SearchDoorAdapter b;
    public final LinearLayoutManager c;
    public final qaf e;
    public or7 f;
    public final SearchDoorContext g;

    /* renamed from: a  reason: collision with root package name */
    public String f23707a = null;
    public boolean d = false;
    public final Map<String, TemplateBean> h = new ConcurrentHashMap();
    public final Map<String, rpc.c> i = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements hk4<ja0> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public void accept(ja0 ja0Var) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("870eba5f", new Object[]{this, ja0Var});
                return;
            }
            b4p.a("SuggestWidget", "suggest callback thread:" + Thread.currentThread().toString());
            m12.q2(m12.this, ja0Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends glo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(m12 m12Var) {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 1569381830) {
                super.a((Throwable) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/suggest/BaseSuggestWidget$2");
        }

        @Override // tb.glo, tb.u0p
        /* renamed from: a */
        public void accept(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d8addc6", new Object[]{this, th});
                return;
            }
            super.a(th);
            if (th != null) {
                TLogTracker.i("Default", "-1", th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements hk4<ja0> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public void accept(ja0 ja0Var) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("870eba5f", new Object[]{this, ja0Var});
                return;
            }
            com.taobao.android.weex_framework.c cVar = new com.taobao.android.weex_framework.c();
            Intent intent = m12.this.getActivity().getIntent();
            if (intent == null || intent.getData() == null) {
                m12.this.c().l().d("SuggestWidget", "No bundleUrl");
            } else {
                cVar.q(intent.getData().toString());
            }
            cVar.r(SearchDoorActivity.PAGE_NAME);
            xjt.c(cVar, ja0Var.j, m12.this.c(), ja0Var.n);
        }
    }

    static {
        t2o.a(815793264);
        t2o.a(815793101);
    }

    public m12(Activity activity, ude udeVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
        qaf qafVar = new qaf();
        this.e = qafVar;
        this.c = new LinearLayoutManager(activity);
        this.g = searchDoorContext;
        this.b = new TppSuggestAdapter(activity, this, new c2p(searchDoorContext, this, null));
        subscribeEvent(qafVar);
        subscribeEvent(this);
    }

    public static /* synthetic */ Object ipc$super(m12 m12Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode == 593843865) {
            super.onCtxDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/searchdoor/sf/widgets/suggest/BaseSuggestWidget");
        }
    }

    public static /* synthetic */ void q2(m12 m12Var, ja0 ja0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("878a62a5", new Object[]{m12Var, ja0Var});
        } else {
            m12Var.w2(ja0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A2() {
        /*
            r5 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.m12.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0012
            java.lang.String r2 = "ebbb9904"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r5
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0012:
            android.view.View r1 = r5.getView()
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 != r3) goto L_0x0031
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r3, r4)
            r3 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r3)
            r1.startAnimation(r2)
            r1.setVisibility(r0)
        L_0x0031:
            com.taobao.search.searchdoor.sf.widgets.SearchDoorContext r0 = r5.g
            r1 = 10002(0x2712, float:1.4016E-41)
            r0.W(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.m12.A2():void");
    }

    @Override // tb.vnd
    public void B1(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a16e30", new Object[]{this, wXSDKInstance});
        }
    }

    public void C2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8c99c", new Object[]{this});
            return;
        }
        t2();
        b4p.g("SuggestWidget", "清空搜索框取消关键词推荐任务");
        x2();
    }

    @Override // tb.vnd
    public void Z(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3397ed", new Object[]{this, wXSDKInstance});
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "SuggestWidget";
    }

    @Override // tb.vnd
    public TemplateBean o1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("5cdb49ef", new Object[]{this, str});
        }
        if (((ConcurrentHashMap) this.h).isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        return (TemplateBean) ((ConcurrentHashMap) this.h).get(str);
    }

    @Override // tb.abx
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        h2p.c().g(Integer.valueOf(this.g.hashCode()));
        t2();
        b4p.g("SuggestWidget", "退出页面取消关键词推荐任务");
    }

    @Override // tb.abx
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        this.d = o4p.e2();
        zzo.d.b().c(this.d);
    }

    public void onEventMainThread(i0p i0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a21771b", new Object[]{this, i0pVar});
        } else if (i0pVar.b()) {
            C2();
        } else {
            B2(i0pVar.f21021a, this.g.g());
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 2) {
            ((InputMethodManager) Globals.getApplication().getSystemService("input_method")).hideSoftInputFromWindow(((TRecyclerView) getView()).getWindowToken(), 0);
        }
        return false;
    }

    public final void s2(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b65b782", new Object[]{this, map});
        } else if ("degrade".equals(Downgrade.getInstance().getDowngradeStrategy("search").getTacticsPerformance())) {
            map.put("devicePerformanceLevel", "low");
            l3p l3pVar = l3p.INSTANCE;
            if (l3pVar.h()) {
                map.put("devicePerformanceType", "NonVideo");
            }
            if (l3pVar.g()) {
                map.put("devicePerformanceType", "NonIntelligEnd");
            }
            if (l3pVar.f()) {
                map.put("devicePerformanceType", "DPicDegraded");
            }
        }
    }

    @Override // tb.vnd
    public rpc.c t1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("ac4c6847", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (rpc.c) ((ConcurrentHashMap) this.i).get(str);
    }

    public final void t2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c63b58c", new Object[]{this});
            return;
        }
        or7 or7Var = this.f;
        if (or7Var != null && !or7Var.isDisposed()) {
            this.f.dispose();
        }
    }

    public String u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9be9eb6b", new Object[]{this});
        }
        return this.e.b();
    }

    public String v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e027c45", new Object[]{this});
        }
        return this.f23707a;
    }

    public final void x2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        ((TRecyclerView) getView()).setVisibility(8);
        this.b.m0(new ArrayList());
        this.g.W(10001);
    }

    /* renamed from: y2 */
    public TRecyclerView onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TRecyclerView) ipChange.ipc$dispatch("1f82a2b1", new Object[]{this});
        }
        TRecyclerView tRecyclerView = new TRecyclerView(this.mActivity);
        tRecyclerView.setBackgroundResource(R.drawable.tbsearch_sortbar_background);
        tRecyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tRecyclerView.setOverScrollMode(2);
        tRecyclerView.setHasFixedSize(true);
        tRecyclerView.setLayoutManager(this.c);
        tRecyclerView.setAdapter(this.b);
        tRecyclerView.addFeature(new SmoothRecyclerScrollFeature());
        tRecyclerView.setOnTouchListener(this);
        tRecyclerView.setVisibility(8);
        tRecyclerView.setRecycledViewPool(new XSSuggestRecyclerPool());
        return tRecyclerView;
    }

    public abstract Map<String, String> z2();

    public void B2(String str, String str2) {
        ywq ywqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25c73850", new Object[]{this, str, str2});
            return;
        }
        b4p.g(kis.TAO, "startSearchAssocWord :" + str);
        t2();
        b4p.g("SuggestWidget", "取消前一个关键词推荐任务");
        Map<String, String> z = this.g.z();
        if (this.g.G()) {
            z.put("firstBackRequest", "true");
            this.g.X(false);
        }
        String n = this.g.n();
        if (!TextUtils.isEmpty(n)) {
            z.put("lastQ", n);
        }
        z.put(r4p.KEY_GRAY_HAIR, String.valueOf("true".equals(this.g.q(r4p.KEY_SEARCH_ELDER_HOME_OPEN))));
        s2(z);
        z.putAll(z2());
        z.put("sessionId", this.e.b());
        if (z.containsKey("bxFeature")) {
            ywqVar = new ywq(str, str2, this.g.v(), z, MethodEnum.POST);
        } else {
            ywqVar = new ywq(str, str2, this.g.v(), z);
        }
        this.f = new i5p.c().c(ywqVar).b(new xwq(str2, this.d)).d(new v5p("Suggest")).a().e().i(new c()).j().n(new a(), new b(this));
        A2();
    }

    public final void w2(ja0 ja0Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("241f1690", new Object[]{this, ja0Var});
        } else if (ja0Var == null) {
            zzo.d.b().e(zzo.d.b().a(zzo.d.TYPE_SUCCESS_WITH_EMPTY_DATA, null));
        } else {
            if (ja0Var.a() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("code", String.valueOf(ja0Var.a().getErrorCode()));
                hashMap.put("msg", ja0Var.a().getErrorMsg());
                zzo.d.b().e(zzo.d.b().a("failure", hashMap));
            } else {
                z = false;
            }
            h2p.c().j(Integer.valueOf(this.g.hashCode()), ja0Var.o);
            postEvent(wwq.a(ja0Var));
            Map<String, TemplateBean> map = ja0Var.j;
            if (map != null) {
                ((ConcurrentHashMap) this.h).putAll(map);
            }
            ((ConcurrentHashMap) this.i).putAll(ja0Var.n);
            this.f23707a = ja0Var.d;
            this.b.m0(ja0Var.g);
            if (!z) {
                if (((ArrayList) ja0Var.g).isEmpty()) {
                    zzo.d.b().e(zzo.d.b().a(zzo.d.TYPE_SUCCESS_WITH_EMPTY_DATA, null));
                } else {
                    zzo.d.b().e(zzo.d.b().a(zzo.d.TYPE_SUCCESS, null));
                }
            }
        }
    }
}
