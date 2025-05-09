package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.widgets.headerskin.SkinView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class oig extends phw<Void, View, acx<? extends o02<? extends BaseSearchResult, ?>>> implements wdd, zo6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SFPromotionBean f25406a;
    public SkinView b;
    public final boolean c;
    public boolean d = false;
    public boolean e;
    public final String f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f25407a;

        public a(View view) {
            this.f25407a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!(oig.q2(oig.this) instanceof oxb) || !((oxb) oig.s2(oig.this)).E1()) {
                this.f25407a.setVisibility(0);
            }
        }
    }

    static {
        t2o.a(815793574);
        t2o.a(815793583);
        t2o.a(993002134);
    }

    public oig(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
        boolean z = false;
        this.f = "search";
        vdd vddVar = (vdd) getModel().d().h(vdd.CONFIG_KEY);
        if (vddVar != null) {
            vddVar.l2(this);
        }
        if ((getActivity() instanceof vyd) && ((vyd) getActivity()).e0()) {
            z = true;
        }
        this.c = z;
        if ((((CommonSearchContext) acxVar.f()).isPopupSrp() && o4p.n1()) || o4p.D2()) {
            x5p x5pVar = x5p.INSTANCE;
            x5pVar.b();
            this.f = x5pVar.a();
        }
        if (activity instanceof oxb) {
            ((oxb) activity).P(this);
        }
    }

    public static /* synthetic */ Object ipc$super(oig oigVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -211767613) {
            super.onComponentDestroy();
            return null;
        } else if (hashCode == 593843865) {
            super.onCtxDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/headerskin/LayeredHeaderBgWidget");
        }
    }

    public static /* synthetic */ Activity q2(oig oigVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("5bb3bae7", new Object[]{oigVar});
        }
        return oigVar.mActivity;
    }

    public static /* synthetic */ Activity s2(oig oigVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("21de43a8", new Object[]{oigVar});
        }
        return oigVar.mActivity;
    }

    @Override // tb.phw, tb.khq
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
        } else {
            u2();
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "HeaderSkinWidget";
    }

    @Override // tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        SkinView skinView = this.b;
        if (skinView != null) {
            skinView.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.taobao.search.common.uikit.SearchUrlImageView, android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.taobao.search.sf.uikit.TopCropImageView] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // tb.phw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView() {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.oig.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "ebecba09"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            android.view.View r0 = (android.view.View) r0
            return r0
        L_0x0015:
            android.app.Activity r2 = r6.getActivity()
            boolean r2 = r2 instanceof tb.mec
            if (r2 == 0) goto L_0x0031
            android.app.Activity r2 = r6.getActivity()
            tb.mec r2 = (tb.mec) r2
            boolean r2 = r2.o2()
            if (r2 == 0) goto L_0x0031
            android.app.Activity r0 = r6.getActivity()
            int r0 = com.taobao.tao.util.SystemBarDecorator.getStatusBarHeight(r0)
        L_0x0031:
            r2 = 48
            int r2 = tb.o1p.b(r2)
            int r2 = r2 + r0
            java.lang.Object r0 = r6.getModel()
            tb.acx r0 = (tb.acx) r0
            tb.tnd r0 = r0.f()
            com.taobao.search.sf.context.CommonSearchContext r0 = (com.taobao.search.sf.context.CommonSearchContext) r0
            tb.aj3 r3 = tb.aj3.INSTANCE
            java.lang.String r0 = r0.getChannelSrp()
            tb.hrs r0 = r3.a(r0)
            if (r0 == 0) goto L_0x005d
            r6.e = r1
            com.taobao.search.sf.uikit.TopCropImageView r0 = new com.taobao.search.sf.uikit.TopCropImageView
            android.app.Activity r1 = r6.getActivity()
            r0.<init>(r1)
            goto L_0x00e1
        L_0x005d:
            boolean r0 = r6.c
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r6.d
            if (r0 == 0) goto L_0x007c
            com.taobao.search.sf.widgets.headerskin.SkinView r0 = new com.taobao.search.sf.widgets.headerskin.SkinView
            android.app.Activity r1 = r6.getActivity()
            java.lang.String r3 = r6.f
            r0.<init>(r2, r1, r3)
            r6.b = r0
            r0.i()
            com.taobao.search.sf.widgets.headerskin.SkinView r0 = r6.b
            android.widget.FrameLayout r0 = r0.f()
            goto L_0x0091
        L_0x007c:
            tb.tot r0 = new tb.tot
            java.lang.String r1 = r6.f
            r0.<init>(r1, r2)
            r0.e = r2
            tb.cpt r1 = tb.cpt.c()
            android.app.Activity r3 = r6.getActivity()
            com.taobao.android.tbtheme.kit.ThemeFrameLayout r0 = r1.b(r3, r0)
        L_0x0091:
            android.app.Activity r1 = r6.getActivity()
            boolean r1 = tb.kgw.b(r1)
            if (r1 == 0) goto L_0x00b6
            if (r0 == 0) goto L_0x00b6
            r1 = 4
            r0.setVisibility(r1)
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r1.<init>(r3)
            tb.oig$a r3 = new tb.oig$a
            r3.<init>(r0)
            r4 = 200(0xc8, double:9.9E-322)
            r1.postDelayed(r3, r4)
            goto L_0x00b6
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            if (r0 != 0) goto L_0x00e1
            boolean r0 = r6.d
            if (r0 == 0) goto L_0x00d3
            com.taobao.search.sf.widgets.headerskin.SkinView r0 = new com.taobao.search.sf.widgets.headerskin.SkinView
            android.app.Activity r1 = r6.getActivity()
            java.lang.String r3 = r6.f
            r0.<init>(r2, r1, r3)
            r6.b = r0
            r0.g()
            com.taobao.search.sf.widgets.headerskin.SkinView r0 = r6.b
            android.widget.FrameLayout r0 = r0.f()
            goto L_0x00e1
        L_0x00d3:
            com.taobao.search.common.uikit.SearchUrlImageView r0 = new com.taobao.search.common.uikit.SearchUrlImageView
            android.app.Activity r1 = r6.getActivity()
            r0.<init>(r1)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setScaleType(r1)
        L_0x00e1:
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r3 = -1
            r1.<init>(r3, r2)
            boolean r2 = r6.d
            if (r2 == 0) goto L_0x00ed
            r1.height = r3
        L_0x00ed:
            r0.setLayoutParams(r1)
            int r1 = tb.dgw.APM_VIEW_TOKEN
            java.lang.String r2 = "ignore_view"
            r0.setTag(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oig.onCreateView():android.view.View");
    }

    @Override // tb.abx
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        SkinView skinView = this.b;
        if (skinView != null) {
            skinView.c();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // tb.zo6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onHitDarkMode() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.oig.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0013
            java.lang.String r1 = "f95f2594"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0013:
            android.view.View r0 = r4.getView()
            if (r0 == 0) goto L_0x001e
            int r1 = com.taobao.taobao.R.color.tbsearch_main_card_bg_night
            r0.setBackgroundResource(r1)
        L_0x001e:
            com.taobao.search.sf.widgets.headerskin.SkinView r0 = r4.b
            if (r0 == 0) goto L_0x0032
            android.widget.FrameLayout r0 = r0.f()
            if (r0 == 0) goto L_0x0032
            com.taobao.search.sf.widgets.headerskin.SkinView r0 = r4.b
            android.widget.FrameLayout r0 = r0.f()
            r1 = 4
            r0.setVisibility(r1)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oig.onHitDarkMode():void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u2() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.oig.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "18b5bbef"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0012:
            android.view.View r0 = r4.getView()
            if (r0 == 0) goto L_0x009c
            com.taobao.search.mmd.datasource.bean.SFPromotionBean r1 = r4.f25406a
            if (r1 != 0) goto L_0x001e
            goto L_0x009c
        L_0x001e:
            boolean r2 = r4.e
            if (r2 == 0) goto L_0x0040
            boolean r2 = r0 instanceof com.taobao.search.sf.uikit.TopCropImageView
            if (r2 == 0) goto L_0x0040
            com.taobao.search.sf.uikit.TopCropImageView r0 = (com.taobao.search.sf.uikit.TopCropImageView) r0
            java.lang.String r1 = r1.b
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0038
            com.taobao.search.mmd.datasource.bean.SFPromotionBean r1 = r4.f25406a
            java.lang.String r1 = r1.b
            r0.setImageUrl(r1)
            goto L_0x003f
        L_0x0038:
            com.taobao.search.mmd.datasource.bean.SFPromotionBean r1 = r4.f25406a
            int r1 = r1.c
            r0.setBackgroundColor(r1)
        L_0x003f:
            return
        L_0x0040:
            android.app.Activity r1 = r4.getActivity()
            boolean r1 = r1 instanceof tb.oxb
            if (r1 == 0) goto L_0x005a
            android.app.Activity r1 = r4.getActivity()
            tb.oxb r1 = (tb.oxb) r1
            boolean r1 = r1.E1()
            if (r1 == 0) goto L_0x005a
            int r1 = com.taobao.taobao.R.color.tbsearch_main_card_bg_night
            r0.setBackgroundResource(r1)
            return
        L_0x005a:
            com.taobao.search.sf.widgets.headerskin.SkinView r1 = r4.b
            if (r1 == 0) goto L_0x0078
            com.taobao.search.mmd.datasource.bean.SFPromotionBean r0 = r4.f25406a
            java.lang.String r0 = r0.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0072
            com.taobao.search.sf.widgets.headerskin.SkinView r0 = r4.b
            com.taobao.search.mmd.datasource.bean.SFPromotionBean r1 = r4.f25406a
            java.lang.String r1 = r1.b
            r0.j(r1)
            goto L_0x0077
        L_0x0072:
            com.taobao.search.sf.widgets.headerskin.SkinView r0 = r4.b
            r0.k()
        L_0x0077:
            return
        L_0x0078:
            boolean r1 = r0 instanceof com.taobao.search.common.uikit.SearchUrlImageView
            if (r1 != 0) goto L_0x007d
            return
        L_0x007d:
            com.taobao.search.common.uikit.SearchUrlImageView r0 = (com.taobao.search.common.uikit.SearchUrlImageView) r0
            com.taobao.search.mmd.datasource.bean.SFPromotionBean r1 = r4.f25406a
            java.lang.String r1 = r1.b
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0091
            com.taobao.search.mmd.datasource.bean.SFPromotionBean r1 = r4.f25406a
            java.lang.String r1 = r1.b
            r0.setImageUrl(r1)
            goto L_0x009c
        L_0x0091:
            r1 = 0
            r0.setImageUrl(r1)
            com.taobao.search.mmd.datasource.bean.SFPromotionBean r1 = r4.f25406a
            int r1 = r1.c
            r0.setBackgroundColor(r1)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oig.u2():void");
    }

    /* renamed from: u3 */
    public void bindWithData(Void r5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7816d11b", new Object[]{this, r5});
        }
    }

    public void v2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f3d7370", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    @Override // tb.wdd
    public void w1(SFPromotionBean sFPromotionBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76bf7be", new Object[]{this, sFPromotionBean});
            return;
        }
        this.f25406a = sFPromotionBean;
        u2();
    }
}
