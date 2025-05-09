package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.musie.InterceptFrameLayout;
import com.taobao.search.musie.NSMuiseViewHolder;
import com.taobao.search.musie.SearchMuiseViewHolder;
import com.taobao.search.musie.component.filter.TbFilter;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.search.refactor.MSController;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.Iterator;
import java.util.Map;
import tb.f64;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j4p extends m8j implements GestureDetector.OnGestureListener, auc, ree, ynd, vde {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ay4<gu1, ? extends pwc> CREATOR = new a();
    public String q;
    public String r;
    public GestureDetector s;
    public whj t;
    public LottieAnimationView u;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ay4<gu1, pwc> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public pwc a(gu1 gu1Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pwc) ipChange.ipc$dispatch("d46acc52", new Object[]{this, gu1Var});
            }
            return new j4p(gu1Var.f31046a, gu1Var.b, gu1Var.c, gu1Var.f, gu1Var.d, gu1Var.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements frk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.frk
        public void r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4389135", new Object[]{this});
            } else {
                j4p.V2(j4p.this, NSMuiseViewHolder.ACTION_STOP_SCROLL);
            }
        }
    }

    static {
        t2o.a(815792667);
        t2o.a(993001866);
        t2o.a(993002142);
        t2o.a(815792860);
        t2o.a(993002141);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    public j4p(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, TemplateBean templateBean, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, templateBean, viewGroup, vfwVar);
        if (activity instanceof oxb) {
            ((oxb) activity).closeViewDarkMode(getView());
        }
    }

    public static /* synthetic */ void U2(j4p j4pVar, MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93577e19", new Object[]{j4pVar, muiseBean});
        } else {
            super.bindWithData(muiseBean);
        }
    }

    public static /* synthetic */ void V2(j4p j4pVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12036e7a", new Object[]{j4pVar, str});
        } else {
            j4pVar.b3(str);
        }
    }

    public static /* synthetic */ Object ipc$super(j4p j4pVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1698538053:
                return new Boolean(super.m2((String) objArr[0], (JSONObject) objArr[1], (f64.a) objArr[2], (f64.a) objArr[3]));
            case -1292754206:
                super.J2(((Number) objArr[0]).intValue());
                return null;
            case -1261951496:
                return super.getModel();
            case -871580117:
                super.onRenderFailed((com.taobao.android.weex_framework.a) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -506257491:
                super.findAllViews();
                return null;
            case -211767613:
                super.onComponentDestroy();
                return null;
            case 523666796:
                return new Boolean(super.K((String) objArr[0], (JSONObject) objArr[1], (f64.a) objArr[2], (f64.a) objArr[3]));
            case 724233032:
                super.onRenderSuccess((com.taobao.android.weex_framework.a) objArr[0]);
                return null;
            case 857891591:
                return super.C2((MuiseBean) objArr[0]);
            case 1268056981:
                super.bindWithData((MuiseBean) objArr[0]);
                return null;
            case 1618343666:
                return super.onCreateView();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/SearchMuiseModWidget");
        }
    }

    @Override // tb.khq, tb.ree
    public /* bridge */ /* synthetic */ acx B() {
        return (acx) super.getModel();
    }

    @Override // tb.ynd
    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc762f42", new Object[]{this});
        } else if (this.c.x() != null && !this.c.x().isDestroyed() && this.c.x().getTag(TbFilter.FILTER_TAG) == TbFilter.FILTER_TAG) {
            this.c.x().sendInstanceMessage("MUISE", "paramsChange", null);
        }
    }

    @Override // tb.m8j
    public Map<String, Object> C2(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("33226307", new Object[]{this, muiseBean});
        }
        Map<String, Object> C2 = super.C2(muiseBean);
        BaseSearchResult baseSearchResult = (BaseSearchResult) getModel().e().getLastSearchResult();
        if ((baseSearchResult instanceof CommonSearchResult) && C2 != null) {
            C2.put("iconData", ((CommonSearchResult) baseSearchResult).nxRawIcon);
        }
        k3(C2, muiseBean);
        return C2;
    }

    @Override // tb.m8j
    /* renamed from: G2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        if (!o4p.z1()) {
            return super.onCreateView();
        }
        InterceptFrameLayout interceptFrameLayout = new InterceptFrameLayout(getActivity());
        interceptFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        if ((getModel().e() instanceof jrh) && ((jrh) getModel().e()).V0()) {
            LottieAnimationView lottieAnimationView = new LottieAnimationView(getActivity());
            this.u = lottieAnimationView;
            lottieAnimationView.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_IGNORE);
            this.u.setImageAssetsFolder("");
            this.u.setScaleType(ImageView.ScaleType.FIT_XY);
            this.u.setRepeatCount(-1);
            this.u.setRepeatMode(1);
            interceptFrameLayout.addView(this.u, new ViewGroup.LayoutParams(-1, 0));
            this.u.setVisibility(8);
        }
        return interceptFrameLayout;
    }

    @Override // tb.m8j
    public void I2(fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f2e05", new Object[]{this, fwVar});
            return;
        }
        if (getModel().e() instanceof jrh) {
            fwVar.y = ((jrh) getModel().e()).V0();
        }
        fwVar.c0(this);
        new bv9().a(fwVar, getModel().f().getBooleanParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN));
        Activity activity = this.mActivity;
        if (activity instanceof gnh) {
            ((gnh) activity).c0(this.q, this.r, fwVar);
        }
        fwVar.Y(this);
    }

    @Override // tb.m8j
    public void J2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2f222e2", new Object[]{this, new Integer(i)});
            return;
        }
        super.J2(i);
        LottieAnimationView lottieAnimationView = this.u;
        if (lottieAnimationView != null) {
            lottieAnimationView.getLayoutParams().height = i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e0, code lost:
        if (r12.equals("openDropLayer") == false) goto L_0x0038;
     */
    @Override // tb.m8j, tb.cnx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean K(java.lang.String r12, com.alibaba.fastjson.JSONObject r13, tb.f64.a r14, tb.f64.a r15) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j4p.K(java.lang.String, com.alibaba.fastjson.JSONObject, tb.f64$a, tb.f64$a):boolean");
    }

    public void K0(boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224521ba", new Object[]{this, new Boolean(z), new Float(f)});
        }
    }

    public final void X2(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73293d5", new Object[]{this, muiseBean});
            return;
        }
        U2(this, muiseBean);
        if (!getModel().e().isSubscribed(this)) {
            getModel().e().subscribe(this);
        }
        z64 e3 = e3();
        if (e3 instanceof MSController) {
            ((MSController) e3).N0((CommonBaseDatasource) getModel().e(), this);
        }
    }

    public final void Y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd07aa41", new Object[]{this});
            return;
        }
        asi c3 = c3();
        if (!(c3 == null || c3.r() == null)) {
            c3().r().removeAllParams();
        }
        f3().removeAllParams();
        tnd f = getModel().f();
        if (f instanceof CommonSearchContext) {
            f3().setParams(((CommonSearchContext) f).getOtherTabParams());
        }
    }

    public void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a95530d", new Object[]{this});
        }
    }

    public final void Z2(JSONObject jSONObject) {
        JSONArray c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc56a8f6", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (c = h19.c(jSONObject, "keys")) != null) {
            for (int i = 0; i < c.size(); i++) {
                String string = c.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    f3().clearParam(string);
                }
            }
        }
    }

    public void a3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc35c11", new Object[]{this});
        } else {
            postEvent(new a08());
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6833c7a", new Object[]{this, new Integer(i)});
        }
    }

    public final void b3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8a477e", new Object[]{this, str});
            return;
        }
        fw fwVar = this.c;
        if (fwVar != null && fwVar.x() != null) {
            this.c.x().fireNativeEvent(str, "");
        }
    }

    public final asi c3() {
        MSearchResult U0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (asi) ipChange.ipc$dispatch("18232bcb", new Object[]{this});
        }
        o02 e = getModel().e();
        if ((e instanceof jrh) && (U0 = ((jrh) e).U0()) != null && U0.comboSize() <= 1) {
            return U0.getCombo(0);
        }
        return null;
    }

    public final int d3(rhj rhjVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e20f6f7e", new Object[]{this, rhjVar})).intValue();
        }
        if (rhjVar == null) {
            return 0;
        }
        Iterator<BaseCellBean> it = rhjVar.N0().iterator();
        while (it.hasNext()) {
            i += ((MuiseCellBean) it.next()).mMuiseBean.getCachedHeight(ListStyle.LIST);
        }
        return i;
    }

    public final z64 e3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z64) ipChange.ipc$dispatch("42b711ce", new Object[]{this});
        }
        return (z64) getModel().d().h("controller");
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5b5a8a", new Object[]{this})).intValue();
        }
        return 0;
    }

    public final gy f3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gy) ipChange.ipc$dispatch("1ca610f8", new Object[]{this});
        }
        return getModel().e();
    }

    @Override // tb.phw, tb.khq
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        super.findAllViews();
        if (getView() instanceof sif) {
            this.s = new GestureDetector(getActivity().getApplicationContext(), this);
            ((sif) getView()).setOnInterceptTouchEventListener(new x6a(this.s));
        }
    }

    public final void g3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5586f4ff", new Object[]{this, jSONObject});
            return;
        }
        h3();
        whj whjVar = this.t;
        if (whjVar != null) {
            whjVar.i(jSONObject);
        }
    }

    public kr1 getBehavior() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kr1) ipChange.ipc$dispatch("9c30dbef", new Object[]{this});
        }
        return null;
    }

    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("726a97c8", new Object[]{this});
        }
    }

    public final void h3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76efbae7", new Object[]{this});
        } else if (this.t == null && (getActivity() instanceof oad)) {
            this.t = ((oad) getActivity()).y0();
        }
    }

    public void i3(String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edca0b6e", new Object[]{this, str});
        } else if (this.u != null) {
            if (getActivity() instanceof oxb) {
                z = ((oxb) getActivity()).E1();
            } else {
                z = false;
            }
            String a2 = gjt.INSTANCE.a(str, z);
            if (TextUtils.isEmpty(a2)) {
                this.u.setVisibility(8);
                return;
            }
            this.u.setVisibility(0);
            this.u.setAnimationFromUrl(a2);
            this.u.playAnimation();
        }
    }

    public final void j3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("660601e9", new Object[]{this});
            return;
        }
        BaseTypedBean c = c().n().c(JSON.parseObject(((BaseSearchResult) getModel().e().getTotalSearchResult()).getExtMod("sideMod")), (BaseSearchResult) getModel().e().getTotalSearchResult());
        TemplateBean template = getModel().e().getTemplate(c.type);
        if (template != null && (c instanceof MuiseBean)) {
            new lcj(getActivity(), (ude) getRoot(), getModel(), template, (ViewGroup) getActivity().getWindow().getDecorView(), new k4p(this)).bindWithData((MuiseBean) c);
        }
    }

    public void k3(Map<String, Object> map, MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40ee8a0d", new Object[]{this, map, muiseBean});
            return;
        }
        JSONObject jSONObject = muiseBean.pageInfoExtraStatus;
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject(jSONObject);
            jSONObject2.put("pageName", (Object) c2v.getInstance().getCurrentPageName());
            map.put(HorizontalXslComponent.ATTR_PAGE_INFO, jSONObject2);
        }
    }

    public void l3(String str, tzd tzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e75503c", new Object[]{this, str, tzdVar});
        } else {
            getModel().e().registerTemplateListener(str, tzdVar);
        }
    }

    public final void n3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285787c1", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                f3().setParam(entry.getKey(), entry.getValue().toString());
            }
        }
    }

    public final void o3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68626144", new Object[]{this, jSONObject});
            return;
        }
        BaseTypedBean c = c().n().c(jSONObject, (BaseSearchResult) getModel().e().getTotalSearchResult());
        TemplateBean template = getModel().e().getTemplate(c.type);
        if (template != null) {
            if (c instanceof WeexBean) {
                new n84(getActivity(), this, getModel(), template, (ViewGroup) getView(), new k4k()).bindWithData((WeexBean) c);
            } else if (c instanceof MuiseBean) {
                new c64(getActivity(), this, getModel(), template, (ViewGroup) getView(), new k4k()).bindWithData((MuiseBean) c);
            }
        }
    }

    @Override // tb.m8j, tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        if (getModel().e().isSubscribed(this)) {
            getModel().e().unsubscribe(this);
        }
        z64 e3 = e3();
        if (e3 instanceof MSController) {
            ((MSController) e3).b1((CommonBaseDatasource) getModel().e(), this);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    public void onEventMainThread(u2p u2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa51d788", new Object[]{this, u2pVar});
        } else {
            C();
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
        }
    }

    @Override // tb.m8j, tb.npc
    public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        super.onRenderFailed(aVar, i, str, z);
        LottieAnimationView lottieAnimationView = this.u;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
    }

    @Override // tb.m8j, tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        super.onRenderSuccess(aVar);
        LottieAnimationView lottieAnimationView = this.u;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b398c1c3", new Object[]{this, motionEvent});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        if (o4p.z1()) {
            qkn.d(B2(), null, getActivity(), -1, getModel().e());
        }
        return false;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void p3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31cb98fa", new Object[]{this, jSONObject});
            return;
        }
        h3();
        if (this.t != null) {
            this.t.l(jSONObject.getJSONObject("options"), jSONObject.getJSONObject("data"), getParent(), this, null);
        }
    }

    public void q3(String str, tzd tzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46475183", new Object[]{this, str, tzdVar});
        } else {
            getModel().e().unregisterTemplateListener(str, tzdVar);
        }
    }

    @Override // tb.m8j
    /* renamed from: v2 */
    public void bindWithData(MuiseBean muiseBean) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b950395", new Object[]{this, muiseBean});
            return;
        }
        if (muiseBean != null) {
            str = muiseBean.type;
        } else {
            str = "";
        }
        this.q = str;
        String str2 = D2().version;
        this.r = str2;
        if (this.c == null) {
            Activity activity = this.mActivity;
            if ((activity instanceof gnh) && ((gnh) activity).O(this.q, str2)) {
                fw w2 = w2();
                this.c = w2;
                w2.X(false);
                I2(this.c);
            }
        }
        X2(muiseBean);
    }

    @Override // tb.m8j
    public void K2(Map<String, Object> map) {
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5d87ab", new Object[]{this, map});
            return;
        }
        String currentPageName = c2v.getInstance().getCurrentPageName();
        map.put("pageName", currentPageName);
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(amo.DIMENSION_BUSINESS_NAME, zvr.BIZ_TBSEARCH);
        arrayMap.put("tItemType", this.q);
        arrayMap.put("sversion", r4p.SERVER_VERSION_VALUE);
        arrayMap.put(amo.DIMENSION_JSVERSION, this.r);
        try {
            String str2 = this.q;
            arrayMap.put("rainbow", oen.n("tbAndroid" + str2 + "EnableLT"));
        } catch (Exception unused) {
            c4p.n("SearchWeexModWidget", "getBucketIdFail");
        }
        map.put("hubbleInfo", arrayMap);
        BaseSearchResult baseSearchResult = (BaseSearchResult) getModel().e().getTotalSearchResult();
        String str3 = null;
        if (baseSearchResult != null) {
            Map<String, String> map2 = baseSearchResult.getMainInfo().pageTraceArgs;
            if (map2 != null) {
                str3 = map2.get("spm-cnt");
                map.put("spm", str3 == null ? "" : str3);
            }
            map.put(h1p.a.PARAM_KEY_FIRST_RN, baseSearchResult.getMainInfo().rn);
            if (baseSearchResult instanceof CommonSearchResult) {
                map.put("switches", ((CommonSearchResult) baseSearchResult).switches);
            }
        }
        if (baseSearchResult instanceof CommonSearchResult) {
            Object obj = map.get(HorizontalXslComponent.ATTR_PAGE_INFO);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                jSONObject.put("pageName", (Object) currentPageName);
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("spm", (Object) str3);
                }
                ResultMainInfoBean mainInfo = baseSearchResult.getMainInfo();
                jSONObject.put("pageTraceArgs", (Object) mainInfo.originalPageTraceArgs);
                jSONObject.put("pageSize", (Object) Integer.valueOf(mainInfo.pageSize));
                jSONObject.put("page", (Object) Integer.valueOf(mainInfo.page));
                jSONObject.put("totalPage", (Object) Integer.valueOf(mainInfo.totalPage));
                jSONObject.put("totalResults", (Object) Integer.valueOf(mainInfo.totalResult));
                jSONObject.put("pageTraceName", (Object) mainInfo.pageTraceName);
                jSONObject.put("sessionid", (Object) mainInfo.sessionid);
                jSONObject.put("rootPageName", (Object) currentPageName);
                jSONObject.put("style", (Object) getModel().e().getUIListStyle().getValue());
            }
        }
        map.put("elderHome", String.valueOf(cvr.INSTANCE.c()));
        boolean booleanParam = getModel().f().getBooleanParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN);
        map.put("fontSizeLevel", Integer.valueOf(h3p.a(booleanParam)));
        map.put(r4p.KEY_EDITION_CODE, k1p.c());
        map.put(r4p.KEY_GRAY_HAIR, String.valueOf(booleanParam));
        map.put("rainbow", oen.j());
        if (getModel().e().getTotalSearchResult() instanceof CommonSearchResult) {
            z = ((CommonSearchResult) getModel().e().getTotalSearchResult()).hasTopHeader;
            if (getModel().f() instanceof CommonSearchContext) {
                if (!z && (!((CommonSearchContext) getModel().f()).isPopupSrp() || (!((CommonSearchContext) getModel().f()).isPopupDrag() && !((CommonSearchContext) getModel().f()).isPopupIcon()))) {
                    z = false;
                }
            }
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            map.put(r4p.KEY_HAS_TOP_HEADER, str);
        }
        SearchMuiseViewHolder.C2(map, getActivity());
        Object obj2 = B2().mExtraObj.get("pageData");
        if (obj2 != null) {
            map.put("pageData", obj2);
        }
    }

    public final void W2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54883a22", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray c = h19.c(jSONObject, "params");
            for (int i = 0; i < c.size(); i++) {
                JSONObject jSONObject2 = c.getJSONObject(i);
                if (jSONObject2 != null) {
                    f3().addParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }

    @Override // tb.m8j, tb.cnx
    public boolean m2(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac25dbb", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        if (getActivity() instanceof BaseResultActivity) {
            return super.m2(str, jSONObject, aVar, aVar2);
        }
        str.hashCode();
        if (!str.equals("searchOption")) {
            if (!str.equals("refreshAuction")) {
                return false;
            }
            if (jSONObject == null) {
                c4p.n("SearchWeexModWidget", "doRefreshAuction: paramsObject is null");
                return true;
            }
            JSONObject d = h19.d(jSONObject, "params");
            if (d == null) {
                c4p.n("SearchWeexModWidget", "doRefreshAuction: realParamsObject is null");
                return true;
            }
            CommonBaseDatasource commonBaseDatasource = (CommonBaseDatasource) getModel().e();
            for (String str2 : d.keySet()) {
                String string = d.getString(str2);
                if (string == null) {
                    string = "";
                }
                commonBaseDatasource.setParam(str2, string);
            }
            commonBaseDatasource.doRefreshListSearch();
            return true;
        } else if (jSONObject == null) {
            c4p.n("SearchWeexModWidget", "doNewSearch: paramsObject is null");
            return true;
        } else {
            JSONObject d2 = h19.d(jSONObject, "params");
            if (d2 == null) {
                c4p.n("SearchWeexModWidget", "doNewSearch: realParamsObject is null");
                return true;
            }
            CommonBaseDatasource commonBaseDatasource2 = (CommonBaseDatasource) getModel().e();
            for (String str3 : d2.keySet()) {
                String string2 = d2.getString(str3);
                if (string2 == null) {
                    string2 = "";
                }
                commonBaseDatasource2.setParam(str3, string2);
                if (CommonSearchContext.sOtherTabWhiteList.contains(str3)) {
                    getModel().f().setParam(str3, string2);
                }
            }
            commonBaseDatasource2.doNewSearch();
            return true;
        }
    }

    public final void m3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b886ca5f", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray c = h19.c(jSONObject, "params");
            for (int i = 0; i < c.size(); i++) {
                JSONObject jSONObject2 = c.getJSONObject(i);
                if (jSONObject2 != null) {
                    f3().removeParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }
}
