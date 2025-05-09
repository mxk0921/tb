package tb;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.downgrade.Downgrade;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class w4p extends abx implements vdd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final tnl e;
    public SFPromotionBean f;
    public final SFPromotionBean h;
    public int i;
    public boolean j;
    public smd k;
    public final int l;
    public final int m;
    public final boolean n;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<wdd> f30453a = new ArrayList<>();
    public final ArrayList<jcc> b = new ArrayList<>();
    public final ArrayList<CommonBaseDatasource> c = new ArrayList<>();
    public final ueq d = new ueq();
    public float g = 1.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ wdd f30454a;

        public a(wdd wddVar) {
            this.f30454a = wddVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!w4p.q2(w4p.this).contains(this.f30454a)) {
                w4p.q2(w4p.this).add(this.f30454a);
                this.f30454a.w1(w4p.s2(w4p.this));
            }
        }
    }

    static {
        t2o.a(815793576);
        t2o.a(815793582);
    }

    public w4p(Activity activity, ude udeVar, tnl tnlVar) {
        super(activity, udeVar);
        SFPromotionBean sFPromotionBean = new SFPromotionBean();
        this.h = sFPromotionBean;
        CommonSearchContext commonSearchContext = (CommonSearchContext) tnlVar.j();
        boolean isGallerySrp = commonSearchContext.isGallerySrp();
        if ("degrade".equals(Downgrade.getInstance().getDowngradeStrategy("search").getTacticsPerformance())) {
            this.n = o4p.F0();
        } else {
            this.n = false;
        }
        subscribeEvent(this);
        this.e = tnlVar;
        boolean z = true;
        boolean z2 = FestivalMgr.i().v("global") || isGallerySrp;
        boolean z3 = commonSearchContext.isPopupSrp() && o4p.n1();
        Resources resources = activity.getResources();
        int color = resources.getColor(R.color.tbsearch_srp_tab_text_unselected);
        int color2 = resources.getColor(R.color.tbsearch_tab_selected);
        int color3 = resources.getColor(R.color.tbsearch_srp_prom_tab_text_normal);
        this.l = color3;
        int color4 = resources.getColor(R.color.tbsearch_srp_prom_tab_text_selected);
        this.m = color4;
        hrs a2 = aj3.INSTANCE.a(commonSearchContext.getChannelSrp());
        if (a2 != null) {
            sFPromotionBean.f11550a = a2.f;
            sFPromotionBean.c = srl.c(a2.d, 0);
            sFPromotionBean.b = a2.c;
            sFPromotionBean.d = srl.c(a2.f20846a, color);
            sFPromotionBean.e = srl.c(a2.b, color2);
        } else {
            int i = 10001;
            if (!z2 || z3) {
                sFPromotionBean.f11550a = 10001;
                sFPromotionBean.c = resources.getColor(R.color.tbsearch_srp_header_color);
                sFPromotionBean.b = null;
                sFPromotionBean.d = color;
                sFPromotionBean.e = color2;
            } else {
                if (!TextUtils.equals(FestivalMgr.i().f("global", slo.KEY_NAVI_STYLE), "0") && !isGallerySrp) {
                    z = false;
                }
                sFPromotionBean.f11550a = z ? 10002 : i;
                sFPromotionBean.c = 0;
                sFPromotionBean.b = FestivalMgr.i().l("mytaobao", "skinPic");
                sFPromotionBean.d = z ? color3 : color;
                sFPromotionBean.e = z ? color4 : color2;
            }
        }
        this.f = sFPromotionBean.clone();
    }

    public static /* synthetic */ Object ipc$super(w4p w4pVar, String str, Object... objArr) {
        if (str.hashCode() == -211767613) {
            super.onComponentDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/headerskin/SearchPromotionWidget");
    }

    public static /* synthetic */ ArrayList q2(w4p w4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("1c76d802", new Object[]{w4pVar});
        }
        return w4pVar.f30453a;
    }

    public static /* synthetic */ SFPromotionBean s2(w4p w4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SFPromotionBean) ipChange.ipc$dispatch("147725ec", new Object[]{w4pVar});
        }
        return w4pVar.f;
    }

    public final void A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9af556b", new Object[]{this});
            return;
        }
        float f = this.g;
        if (this.n) {
            f = Math.round(f);
        }
        Iterator<jcc> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(f);
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "SearchPromotionWidget";
    }

    @Override // tb.vdd
    public void l2(wdd wddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e67674f9", new Object[]{this, wddVar});
        } else if (wddVar != null) {
            getActivity().runOnUiThread(new a(wddVar));
        }
    }

    @Override // tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        Iterator<CommonBaseDatasource> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().unsubscribe(this);
        }
    }

    public void onEventMainThread(t2p t2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b8d6ed", new Object[]{this, t2pVar});
        } else if (t2pVar.c()) {
            w2((CommonBaseDatasource) this.e.e());
        }
    }

    public final void t2() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z = false;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870467b4", new Object[]{this});
            return;
        }
        smd smdVar = this.k;
        if (smdVar != null) {
            if (smdVar.i0() == null) {
                i = this.l;
            } else {
                i = this.k.i0().intValue();
            }
            if (this.k.f0() == null) {
                i2 = this.m;
            } else {
                i2 = this.k.f0().intValue();
            }
            int i7 = 10002;
            if (this.k.W() == null || this.k.W().intValue() == 10000) {
                i3 = 10002;
            } else {
                i3 = this.k.W().intValue();
            }
            SFPromotionBean sFPromotionBean = this.h;
            if (sFPromotionBean.d != i || sFPromotionBean.e != i2 || sFPromotionBean.f11550a != i3) {
                if (this.k.W() != null) {
                    i4 = this.k.W().intValue();
                } else {
                    i4 = 10002;
                }
                if (this.k.i0() == null) {
                    i5 = this.l;
                } else {
                    i5 = this.k.i0().intValue();
                }
                if (this.k.f0() == null) {
                    i6 = this.m;
                } else {
                    i6 = this.k.f0().intValue();
                }
                if (this.n) {
                    int i8 = (this.g > 0.5f ? 1 : (this.g == 0.5f ? 0 : -1));
                    if (i8 < 0) {
                        i5 = this.h.d;
                    }
                    if (i8 < 0) {
                        i6 = this.h.e;
                    }
                } else {
                    i5 = this.d.a(this.h.d, i5, this.g);
                    i6 = this.d.a(this.h.e, i6, this.g);
                }
                if (!this.k.x1()) {
                    if (this.k.W() == null || this.k.W().intValue() == 10000) {
                        if (this.g < 0.5f) {
                            i7 = this.h.f11550a;
                        }
                        i4 = i7;
                    } else if (this.g >= 0.5f) {
                        i4 = this.k.W().intValue();
                    } else {
                        i4 = this.h.f11550a;
                    }
                }
                SFPromotionBean sFPromotionBean2 = this.f;
                if (sFPromotionBean2.d != i5) {
                    sFPromotionBean2.d = i5;
                    z = true;
                }
                if (sFPromotionBean2.e != i6) {
                    sFPromotionBean2.e = i6;
                    z = true;
                }
                if (sFPromotionBean2.f11550a != i4) {
                    sFPromotionBean2.f11550a = i4;
                } else {
                    z2 = z;
                }
                if (z2) {
                    z2();
                }
            }
        }
    }

    public final void u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c7de92", new Object[]{this});
            return;
        }
        if (this.k != null) {
            v2();
        }
        smd smdVar = this.k;
        if (smdVar != null && smdVar.h2()) {
            t2();
        }
    }

    public final void v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aad5afa", new Object[]{this});
            return;
        }
        smd smdVar = this.k;
        float f = 1.0f;
        if (!(smdVar == null || smdVar.g2() == 0)) {
            f = 1.0f - Math.max(Math.min(this.i / this.k.g2(), 1.0f), 0.0f);
        }
        if (f != this.g) {
            this.g = f;
            A2();
        }
    }

    public void w2(CommonBaseDatasource commonBaseDatasource) {
        hrs hrsVar;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f46280", new Object[]{this, commonBaseDatasource});
            return;
        }
        if (!commonBaseDatasource.isSubscribed(this)) {
            commonBaseDatasource.subscribe(this);
            this.c.add(commonBaseDatasource);
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
        if (commonSearchResult != null) {
            hrsVar = commonSearchResult.tabPromotionBean;
        } else {
            hrsVar = null;
        }
        if (hrsVar != null) {
            boolean y2 = y2(hrsVar);
            this.j = true;
            z = y2;
        } else if (this.j) {
            this.f = this.h.clone();
        } else {
            z = false;
        }
        if (z) {
            z2();
        }
    }

    public final void x2(smd smdVar) {
        int i;
        int i2;
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ec6a4cd", new Object[]{this, smdVar});
            return;
        }
        this.k = smdVar;
        SFPromotionBean sFPromotionBean = this.f;
        int i3 = sFPromotionBean.f11550a;
        int i4 = sFPromotionBean.d;
        int i5 = sFPromotionBean.e;
        if (smdVar == null || !smdVar.h2()) {
            i2 = this.h.f11550a;
            i = i5;
        } else {
            if (smdVar.W() == null || smdVar.W().intValue() == 10000) {
                i2 = 10002;
            } else {
                i2 = smdVar.W().intValue();
            }
            if (smdVar.i0() == null) {
                i4 = this.l;
            } else {
                i4 = smdVar.i0().intValue();
            }
            if (smdVar.f0() == null) {
                i = this.m;
            } else {
                i = smdVar.f0().intValue();
            }
        }
        SFPromotionBean sFPromotionBean2 = this.f;
        if (sFPromotionBean2.f11550a != i2) {
            sFPromotionBean2.f11550a = i2;
            z2 = true;
        }
        if (sFPromotionBean2.e != i) {
            sFPromotionBean2.e = i;
            z2 = true;
        }
        if (sFPromotionBean2.d != i4) {
            sFPromotionBean2.d = i4;
        } else {
            z = z2;
        }
        if (z) {
            z2();
        }
    }

    public final boolean y2(hrs hrsVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec07bc96", new Object[]{this, hrsVar})).booleanValue();
        }
        if (!TextUtils.isEmpty(hrsVar.d)) {
            int c = srl.c(hrsVar.d, this.f.c);
            SFPromotionBean sFPromotionBean = this.f;
            if (sFPromotionBean.c != c) {
                sFPromotionBean.b = null;
                sFPromotionBean.c = c;
                z = true;
            }
        }
        if (!TextUtils.equals(this.f.b, hrsVar.c)) {
            this.f.b = hrsVar.c;
            z = true;
        }
        if (!TextUtils.isEmpty(hrsVar.f20846a)) {
            int c2 = srl.c(hrsVar.f20846a, this.f.d);
            SFPromotionBean sFPromotionBean2 = this.f;
            if (sFPromotionBean2.d != c2) {
                sFPromotionBean2.d = c2;
                z = true;
            }
        }
        if (!TextUtils.isEmpty(hrsVar.b)) {
            int c3 = srl.c(hrsVar.b, this.f.e);
            SFPromotionBean sFPromotionBean3 = this.f;
            if (sFPromotionBean3.e != c3) {
                sFPromotionBean3.e = c3;
                z = true;
            }
        }
        int i = hrsVar.f;
        if (i != 10000) {
            SFPromotionBean sFPromotionBean4 = this.f;
            if (i != sFPromotionBean4.f11550a) {
                sFPromotionBean4.f11550a = i;
                return true;
            }
        }
        return z;
    }

    public final void z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b53181", new Object[]{this});
            return;
        }
        b4p.a("SearchPromotionWidget", "notifyPromotionChanged:" + this.f);
        Iterator<wdd> it = this.f30453a.iterator();
        while (it.hasNext()) {
            it.next().w1(this.f);
        }
    }

    public void onEventMainThread(kr3 kr3Var) {
        smd smdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe21f6e", new Object[]{this, kr3Var});
            return;
        }
        List<kae> list = kr3Var.d;
        if (list != null && !list.isEmpty()) {
            kae kaeVar = kr3Var.d.get(0);
            if (kaeVar instanceof smd) {
                smdVar = (smd) kaeVar;
                x2(smdVar);
            }
        }
        smdVar = null;
        x2(smdVar);
    }

    public void onEventMainThread(hml hmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aeb8ea", new Object[]{this, hmlVar});
            return;
        }
        int abs = Math.abs(hmlVar.f20749a);
        if (this.i != abs) {
            this.i = abs;
            u2();
        }
    }
}
