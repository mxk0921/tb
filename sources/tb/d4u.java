package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.Arrays;
import java.util.List;
import tb.psg;
import tb.yqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d4u implements psg, q1e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public IMainFeedsViewService<?> b;
    public final IVideoPlayControllerService c;
    public final IContainerService<?> d;
    public LinkedSplashData g;
    public final e4u h;
    public final n1e j;
    public final IContainerDataService<?> k;
    public boolean l;
    public final yqx m;

    /* renamed from: a  reason: collision with root package name */
    public boolean f17575a = false;
    public boolean e = false;
    public long f = 0;
    public final int i = mve.c("keepCardInterval", 10000);
    public final List<String> n = Arrays.asList("coldStart", r78.LOCATION_CHANGED);
    public final IContainerService.a o = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void a(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acfd1f16", new Object[]{this, iUiRefreshActionModel});
                return;
            }
            d4u d4uVar = d4u.this;
            d4u.n(d4uVar, d4u.q(d4uVar).n());
            if (d4u.m(d4u.this)) {
                d4u.r(d4u.this, true);
                d4u.k(d4u.this, SystemClock.elapsedRealtime());
            }
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#RefreshFinish " + d4u.m(d4u.this));
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void b(IUiRefreshActionModel iUiRefreshActionModel) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("154ae7b7", new Object[]{this, iUiRefreshActionModel});
                return;
            }
            String requestType = iUiRefreshActionModel.getRequestType();
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#RefreshStart requestType:" + requestType);
            if (SystemClock.elapsedRealtime() - d4u.j(d4u.this) <= d4u.l(d4u.this)) {
                z = false;
            }
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#RefreshStart isInserted:" + d4u.m(d4u.this) + ",timeOut:" + z);
            if (d4u.m(d4u.this) && !z) {
                if (d4u.o(d4u.this).contains(requestType)) {
                    fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#RefreshStart forceMergeAction:");
                    d4u.p(d4u.this, false);
                    return;
                }
                boolean n = d4u.q(d4u.this).n();
                fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#RefreshStart alreadyInsertSuccess:" + n);
                if (!n) {
                    fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#RefreshStart mergeData");
                    d4u.p(d4u.this, false);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements yqx.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(BaseSectionModel<?> baseSectionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d28b119c", new Object[]{this, baseSectionModel});
                return;
            }
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#shouldShow onZoomInReplaceCard");
            d4u.q(d4u.this).r(baseSectionModel);
            d4u.s(d4u.this, true, baseSectionModel);
        }
    }

    static {
        t2o.a(491782708);
        t2o.a(736100448);
        t2o.a(491782722);
    }

    public d4u(cfc cfcVar) {
        b bVar = new b();
        this.h = new e4u(cfcVar);
        this.j = new m4u(cfcVar);
        this.b = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.c = (IVideoPlayControllerService) cfcVar.a(IVideoPlayControllerService.class);
        this.d = (IContainerService) cfcVar.a(IContainerService.class);
        this.k = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.m = new yqx(cfcVar, bVar);
    }

    public static /* synthetic */ long j(d4u d4uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f10931a", new Object[]{d4uVar})).longValue();
        }
        return d4uVar.f;
    }

    public static /* synthetic */ long k(d4u d4uVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0194a54", new Object[]{d4uVar, new Long(j)})).longValue();
        }
        d4uVar.f = j;
        return j;
    }

    public static /* synthetic */ int l(d4u d4uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71f53238", new Object[]{d4uVar})).intValue();
        }
        return d4uVar.i;
    }

    public static /* synthetic */ boolean m(d4u d4uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4d9d168", new Object[]{d4uVar})).booleanValue();
        }
        return d4uVar.e;
    }

    public static /* synthetic */ boolean n(d4u d4uVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3780ff6", new Object[]{d4uVar, new Boolean(z)})).booleanValue();
        }
        d4uVar.e = z;
        return z;
    }

    public static /* synthetic */ List o(d4u d4uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("53bdeb64", new Object[]{d4uVar});
        }
        return d4uVar.n;
    }

    public static /* synthetic */ void p(d4u d4uVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19bf9772", new Object[]{d4uVar, new Boolean(z)});
        } else {
            d4uVar.v(z);
        }
    }

    public static /* synthetic */ e4u q(d4u d4uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e4u) ipChange.ipc$dispatch("74512b33", new Object[]{d4uVar});
        }
        return d4uVar.h;
    }

    public static /* synthetic */ boolean r(d4u d4uVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a3522fa", new Object[]{d4uVar, new Boolean(z)})).booleanValue();
        }
        d4uVar.f17575a = z;
        return z;
    }

    public static /* synthetic */ void s(d4u d4uVar, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95571fdb", new Object[]{d4uVar, new Boolean(z), jSONObject});
        } else {
            d4uVar.w(z, jSONObject);
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef426e4c", new Object[]{this});
        } else if (this.e && this.c != null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#triggerVideoStop");
            this.c.triggerVideoStop();
        }
    }

    @Override // tb.psg
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d6a55f9", new Object[]{this});
            return;
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#onShown：");
        B();
    }

    @Override // tb.q1e
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a9a1c29", new Object[]{this})).booleanValue();
        }
        if (SystemClock.elapsedRealtime() - this.f <= this.i) {
            return this.f17575a;
        }
        this.f17575a = false;
        return false;
    }

    @Override // tb.psg
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("daf1e05e", new Object[]{this});
        }
        return "feeds";
    }

    @Override // tb.psg
    public void f(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae02dd", new Object[]{this, linkedSplashData});
        } else {
            this.h.c(linkedSplashData);
        }
    }

    @Override // tb.q1e
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd02409", new Object[]{this});
        } else {
            this.f17575a = false;
        }
    }

    @Override // tb.psg
    public void onAnimationEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
        }
    }

    @Override // tb.psg
    public void onAnimationStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771cb104", new Object[]{this});
        }
    }

    public final int u() {
        JSONObject feedsJson;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a1a09d5", new Object[]{this})).intValue();
        }
        LinkedSplashData linkedSplashData = this.g;
        if (linkedSplashData == null || linkedSplashData.getFeedsData() == null || (feedsJson = this.g.getFeedsData().getFeedsJson()) == null || (jSONObject = feedsJson.getJSONObject("bizData")) == null) {
            return -1;
        }
        String string = jSONObject.getString("previewPosition");
        if (TextUtils.isEmpty(string)) {
            return -1;
        }
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException unused) {
            fve.e("TopShowInsertCallbackImp", "广告预览位置数据格式异常");
            return -1;
        }
    }

    public final void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16b7524", new Object[]{this, new Boolean(z)});
        } else {
            w(z, this.h.j(this.g));
        }
    }

    public final void w(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bcfa4c", new Object[]{this, new Boolean(z), jSONObject});
        } else if (jSONObject != null) {
            this.h.l(new SectionModel(jSONObject), z, this.l, u());
        }
    }

    public final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11db6d21", new Object[]{this})).booleanValue();
        }
        boolean e = ((m4u) this.j).e();
        fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#isAtRecommendFeeds-> " + e);
        return e;
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.e = false;
        IContainerService<?> iContainerService = this.d;
        if (iContainerService != null) {
            iContainerService.removeUiRefreshListener(this.o);
        }
        if (this.b != null) {
            this.b = null;
        }
        this.m.f();
    }

    @Override // tb.psg
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea470ec9", new Object[]{this});
            return;
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#onTerminate mIsInsert：" + this.e);
        if (this.e) {
            B();
            A();
            this.f17575a = true;
            this.f = SystemClock.elapsedRealtime();
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#onTerminate done");
        }
    }

    @Override // tb.psg
    public boolean g(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54bc039b", new Object[]{this, linkedSplashData})).booleanValue();
        }
        this.l = true;
        fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#shouldColdStartShow");
        z(linkedSplashData, true);
        return true;
    }

    @Override // tb.psg
    public boolean h(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34c8cb58", new Object[]{this, linkedSplashData})).booleanValue();
        }
        this.l = false;
        boolean z = z(linkedSplashData, x());
        fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#shouldHotStartShow shouldShow：" + z);
        return z;
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f573bfcc", new Object[]{this})).booleanValue();
        }
        IContainerDataService<?> iContainerDataService = this.k;
        if (iContainerDataService == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#disableInsert mIContainerService null");
            return false;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#disableInsert containerData null");
            return false;
        }
        IContainerInnerDataModel base = containerData.getBase();
        if (base == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#disableInsert containerDataBase null");
            return false;
        }
        JSONObject topViewSplashSection = base.getTopViewSplashSection();
        if (topViewSplashSection == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#disableInsert topViewSplashSection null");
            return false;
        }
        JSONObject jSONObject = topViewSplashSection.getJSONObject("ext");
        if (jSONObject == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#disableInsert ext null");
            return false;
        }
        boolean booleanValue = jSONObject.getBooleanValue("disableInsert");
        fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#disableInsert result:" + booleanValue);
        return booleanValue;
    }

    public final void A() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bbaed86", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder("TopShowInsert#forceInsertPlayQueueHeader：");
        if (this.c != null) {
            z = true;
        }
        sb.append(z);
        fve.e(obq.SPLASH_BUSINESS_TAG, sb.toString());
        if (this.e && this.c != null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#forceVideoSeekToPlay do");
            this.c.forceInsertToQueueHeader(e4u.USER_ID, this.h.i(this.g));
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#triggerVideoStart");
            this.c.triggerVideoStart();
        }
    }

    @Override // tb.psg
    public boolean e(psg.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("932c859d", new Object[]{this, aVar})).booleanValue();
        }
        if (t() || !this.e || this.b == null) {
            return false;
        }
        boolean a2 = ((m4u) this.j).a();
        boolean b2 = ((m4u) this.j).b();
        aVar.getClass();
        boolean equals = psg.a.FROM_CLOSE.equals(null);
        if (equals || a2 || b2) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#shouldAnimate 用户点了闪屏跳过:" + equals + "当前有pop:" + a2 + ",或者有淘口令:" + b2 + ",不再执行缩放动画");
            return false;
        }
        this.h.a(aVar);
        B();
        return true;
    }

    public final boolean z(LinkedSplashData linkedSplashData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b3b32d9", new Object[]{this, linkedSplashData, new Boolean(z)})).booleanValue();
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#shouldShow enableShow " + z);
        this.e = false;
        if (!z) {
            return false;
        }
        this.g = linkedSplashData;
        this.h.r(null);
        IContainerService<?> iContainerService = this.d;
        if (iContainerService == null) {
            return false;
        }
        iContainerService.addUiRefreshListener(this.o);
        if (t()) {
            return false;
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#shouldShow insertCard");
        this.m.k(this.h.j(this.g));
        v(true);
        return this.e;
    }
}
