package com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.ISmartNextPageRequestService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl.ScoreLevel;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import tb.cfc;
import tb.fve;
import tb.h6c;
import tb.kr8;
import tb.kve;
import tb.m58;
import tb.mve;
import tb.o2k;
import tb.sgc;
import tb.t2o;
import tb.ul4;
import tb.vu3;
import tb.w1e;
import tb.wi8;
import tb.zza;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SmartNextPageRequestServiceImpl implements ISmartNextPageRequestService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String REQUEST_TYPE_NEXT_PAGE = "scrollNextPage";
    private static final String TAG = "SmartNextPageRequestServiceImpl";
    private IContainerDataService<?> mContainerDataService;
    private long mLayoutFinishTime;
    private IMainFeedsViewService<?> mMainFeedsViewService;
    private String mNextPageBxIntention;
    private IContainerDataService.a mOnDataProcessListener;
    private h6c.b mOnFeedsLayoutListener;
    private h6c.c<ViewGroup> mOnFeedsScrollListener;
    private sgc.b mOnItemRenderListener;
    private IContainerDataService.c mOnRequestListener;
    private IContainerDataService.f mRequestCommonBizParamsCreator;
    private String mScoreLevel = "default";
    private int mScrollPreRequestY = DensityUtil.dip2px(Globals.getApplication(), 30.0f);
    private int totalScrollDistance = 0;
    private final m58 mDynamicRtUserTracer = new m58();
    private final List<Integer> mNextPageLastCardIndexList = new ArrayList();
    private boolean isZeroScroll = false;
    private wi8 mEscapeDurationCounter = new wi8();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void j(w1e w1eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0b6e76", new Object[]{this, w1eVar});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void l(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec3ff412", new Object[]{this, w1eVar, iContainerDataModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void m(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e9a5c54", new Object[]{this, w1eVar, iContainerDataModel});
                return;
            }
            if (!ul4.g(iContainerDataModel) && ul4.f(iContainerDataModel)) {
                SmartNextPageRequestServiceImpl.access$002(SmartNextPageRequestServiceImpl.this, true);
            }
            if (TextUtils.equals(ScoreLevel.N0, SmartNextPageRequestServiceImpl.access$100(SmartNextPageRequestServiceImpl.this))) {
                fve.e(SmartNextPageRequestServiceImpl.TAG, "触发：ScoreLevel.N0");
                SmartNextPageRequestServiceImpl.access$200(SmartNextPageRequestServiceImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
                return;
            }
            if (TextUtils.equals(str, SmartNextPageRequestServiceImpl.REQUEST_TYPE_NEXT_PAGE)) {
                SmartNextPageRequestServiceImpl.access$500(SmartNextPageRequestServiceImpl.this).i(SmartNextPageRequestServiceImpl.access$700(SmartNextPageRequestServiceImpl.this));
                int access$800 = SmartNextPageRequestServiceImpl.access$800(SmartNextPageRequestServiceImpl.this, iContainerDataModel);
                if (access$800 > 0) {
                    SmartNextPageRequestServiceImpl.access$900(SmartNextPageRequestServiceImpl.this).add(Integer.valueOf(access$800));
                }
            }
            SmartNextPageRequestServiceImpl.access$002(SmartNextPageRequestServiceImpl.this, ul4.f(iContainerDataModel));
            if (SmartNextPageRequestServiceImpl.access$000(SmartNextPageRequestServiceImpl.this)) {
                SmartNextPageRequestServiceImpl.access$600(SmartNextPageRequestServiceImpl.this).s();
                SmartNextPageRequestServiceImpl.access$500(SmartNextPageRequestServiceImpl.this).h();
            }
            try {
                SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl = SmartNextPageRequestServiceImpl.this;
                SmartNextPageRequestServiceImpl.access$102(smartNextPageRequestServiceImpl, SmartNextPageRequestServiceImpl.access$1000(smartNextPageRequestServiceImpl, iContainerDataModel));
            } catch (JSONException e) {
                fve.c(SmartNextPageRequestServiceImpl.TAG, "calculateScoreLevel error", e);
                SmartNextPageRequestServiceImpl.access$1100(SmartNextPageRequestServiceImpl.this);
            }
            fve.e(SmartNextPageRequestServiceImpl.TAG, "calculateScoreLevel mScoreLevel: " + SmartNextPageRequestServiceImpl.access$100(SmartNextPageRequestServiceImpl.this));
            if (!ul4.f(iContainerDataModel)) {
                SmartNextPageRequestServiceImpl.access$1100(SmartNextPageRequestServiceImpl.this);
                return;
            }
            SmartNextPageRequestServiceImpl.access$900(SmartNextPageRequestServiceImpl.this).clear();
            int access$1200 = SmartNextPageRequestServiceImpl.access$1200(SmartNextPageRequestServiceImpl.this, iContainerDataModel);
            if (access$1200 > 0) {
                SmartNextPageRequestServiceImpl.access$900(SmartNextPageRequestServiceImpl.this).add(Integer.valueOf(access$1200));
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void b(w1e w1eVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void c(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d49a26c0", new Object[]{this, w1eVar, str});
            } else if (TextUtils.equals(str, SmartNextPageRequestServiceImpl.REQUEST_TYPE_NEXT_PAGE)) {
                SmartNextPageRequestServiceImpl.access$500(SmartNextPageRequestServiceImpl.this).j(SmartNextPageRequestServiceImpl.access$300(SmartNextPageRequestServiceImpl.this), SmartNextPageRequestServiceImpl.access$400(SmartNextPageRequestServiceImpl.this));
                SmartNextPageRequestServiceImpl.access$600(SmartNextPageRequestServiceImpl.this).r();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements IContainerDataService.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.f
        public Map<String, String> a(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("80a7626", new Object[]{this, w1eVar, str});
            }
            if (TextUtils.equals(str, "coldStart")) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("networkStatus", kve.a());
            if (TextUtils.equals(str, SmartNextPageRequestServiceImpl.REQUEST_TYPE_NEXT_PAGE)) {
                SmartNextPageRequestServiceImpl.access$302(SmartNextPageRequestServiceImpl.this, o2k.a());
                fve.e(SmartNextPageRequestServiceImpl.TAG, "mNextPageBxIntention: " + SmartNextPageRequestServiceImpl.access$300(SmartNextPageRequestServiceImpl.this));
                JSONObject b = o2k.b(SmartNextPageRequestServiceImpl.access$300(SmartNextPageRequestServiceImpl.this));
                if (b != null && !b.isEmpty()) {
                    hashMap.put("smartRTFeatures", b.toJSONString());
                }
            }
            return hashMap;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements h6c.c<ViewGroup> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.h6c.c
        public void n(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
        }

        @Override // tb.h6c.c
        public void onScrollStateChanged(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e409bdce", new Object[]{this, viewGroup, new Integer(i)});
            } else if (1 == i) {
                SmartNextPageRequestServiceImpl.access$600(SmartNextPageRequestServiceImpl.this).q();
            }
        }

        @Override // tb.h6c.c
        public void onScrolled(ViewGroup viewGroup, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7f64c91", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
                return;
            }
            SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl = SmartNextPageRequestServiceImpl.this;
            SmartNextPageRequestServiceImpl.access$1302(smartNextPageRequestServiceImpl, SmartNextPageRequestServiceImpl.access$1300(smartNextPageRequestServiceImpl) + i2);
            if (SmartNextPageRequestServiceImpl.access$000(SmartNextPageRequestServiceImpl.this) && i2 > 0) {
                SmartNextPageRequestServiceImpl.access$002(SmartNextPageRequestServiceImpl.this, false);
                SmartNextPageRequestServiceImpl.access$500(SmartNextPageRequestServiceImpl.this).l(SmartNextPageRequestServiceImpl.access$400(SmartNextPageRequestServiceImpl.this), SystemClock.uptimeMillis(), SmartNextPageRequestServiceImpl.access$1400(SmartNextPageRequestServiceImpl.this));
            }
            if (TextUtils.equals(ScoreLevel.N1, SmartNextPageRequestServiceImpl.access$100(SmartNextPageRequestServiceImpl.this)) && i2 > 0) {
                fve.e(SmartNextPageRequestServiceImpl.TAG, "触发：ScoreLevel.N1");
                SmartNextPageRequestServiceImpl.access$200(SmartNextPageRequestServiceImpl.this);
            }
            if (TextUtils.equals(ScoreLevel.N2, SmartNextPageRequestServiceImpl.access$100(SmartNextPageRequestServiceImpl.this)) && SmartNextPageRequestServiceImpl.access$1300(SmartNextPageRequestServiceImpl.this) >= SmartNextPageRequestServiceImpl.access$1500(SmartNextPageRequestServiceImpl.this)) {
                fve.e(SmartNextPageRequestServiceImpl.TAG, "触发：ScoreLevel.N2");
                SmartNextPageRequestServiceImpl.access$200(SmartNextPageRequestServiceImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements sgc.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.sgc.b
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
            }
        }

        @Override // tb.sgc.b
        public void h(int i, View view, BaseSectionModel baseSectionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab94fc2e", new Object[]{this, new Integer(i), view, baseSectionModel});
            }
        }

        @Override // tb.sgc.b
        public void i(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe58018e", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
            }
        }

        @Override // tb.sgc.b
        public void o(int i, View view, BaseSectionModel baseSectionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4bbbcc6", new Object[]{this, new Integer(i), view, baseSectionModel});
                return;
            }
            int intValue = !SmartNextPageRequestServiceImpl.access$900(SmartNextPageRequestServiceImpl.this).isEmpty() ? ((Integer) SmartNextPageRequestServiceImpl.access$900(SmartNextPageRequestServiceImpl.this).get(0)).intValue() : -1;
            if (i == intValue) {
                SmartNextPageRequestServiceImpl.access$900(SmartNextPageRequestServiceImpl.this).remove(0);
                fve.e(SmartNextPageRequestServiceImpl.TAG, "mNextPageLastCardIndex: " + intValue);
                SmartNextPageRequestServiceImpl.access$500(SmartNextPageRequestServiceImpl.this).k(SmartNextPageRequestServiceImpl.access$600(SmartNextPageRequestServiceImpl.this).o());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements h6c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.h6c.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34aa13bd", new Object[]{this});
            } else {
                SmartNextPageRequestServiceImpl.access$1402(SmartNextPageRequestServiceImpl.this, SystemClock.uptimeMillis());
            }
        }

        @Override // tb.h6c.b
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d673366", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(491782675);
        t2o.a(488636606);
    }

    public static /* synthetic */ boolean access$000(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a699c090", new Object[]{smartNextPageRequestServiceImpl})).booleanValue();
        }
        return smartNextPageRequestServiceImpl.isZeroScroll;
    }

    public static /* synthetic */ boolean access$002(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeb778ce", new Object[]{smartNextPageRequestServiceImpl, new Boolean(z)})).booleanValue();
        }
        smartNextPageRequestServiceImpl.isZeroScroll = z;
        return z;
    }

    public static /* synthetic */ String access$100(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e42cd9d5", new Object[]{smartNextPageRequestServiceImpl});
        }
        return smartNextPageRequestServiceImpl.mScoreLevel;
    }

    public static /* synthetic */ String access$1000(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e14113c2", new Object[]{smartNextPageRequestServiceImpl, iContainerDataModel});
        }
        return smartNextPageRequestServiceImpl.calculateScoreLevel(iContainerDataModel);
    }

    public static /* synthetic */ String access$102(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1afeee8d", new Object[]{smartNextPageRequestServiceImpl, str});
        }
        smartNextPageRequestServiceImpl.mScoreLevel = str;
        return str;
    }

    public static /* synthetic */ void access$1100(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14667a1c", new Object[]{smartNextPageRequestServiceImpl});
        } else {
            smartNextPageRequestServiceImpl.resetScoreLevel();
        }
    }

    public static /* synthetic */ int access$1200(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca766293", new Object[]{smartNextPageRequestServiceImpl, iContainerDataModel})).intValue();
        }
        return smartNextPageRequestServiceImpl.getBaseSize(iContainerDataModel);
    }

    public static /* synthetic */ int access$1300(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("955ca54d", new Object[]{smartNextPageRequestServiceImpl})).intValue();
        }
        return smartNextPageRequestServiceImpl.totalScrollDistance;
    }

    public static /* synthetic */ int access$1302(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d850edde", new Object[]{smartNextPageRequestServiceImpl, new Integer(i)})).intValue();
        }
        smartNextPageRequestServiceImpl.totalScrollDistance = i;
        return i;
    }

    public static /* synthetic */ long access$1400(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5d7baed", new Object[]{smartNextPageRequestServiceImpl})).longValue();
        }
        return smartNextPageRequestServiceImpl.mLayoutFinishTime;
    }

    public static /* synthetic */ long access$1402(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7388fe1", new Object[]{smartNextPageRequestServiceImpl, new Long(j)})).longValue();
        }
        smartNextPageRequestServiceImpl.mLayoutFinishTime = j;
        return j;
    }

    public static /* synthetic */ int access$1500(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1652d08b", new Object[]{smartNextPageRequestServiceImpl})).intValue();
        }
        return smartNextPageRequestServiceImpl.mScrollPreRequestY;
    }

    public static /* synthetic */ void access$200(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278febca", new Object[]{smartNextPageRequestServiceImpl});
        } else {
            smartNextPageRequestServiceImpl.triggerRequestNextPage();
        }
    }

    public static /* synthetic */ String access$300(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca46d257", new Object[]{smartNextPageRequestServiceImpl});
        }
        return smartNextPageRequestServiceImpl.mNextPageBxIntention;
    }

    public static /* synthetic */ String access$302(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c108a8f", new Object[]{smartNextPageRequestServiceImpl, str});
        }
        smartNextPageRequestServiceImpl.mNextPageBxIntention = str;
        return str;
    }

    public static /* synthetic */ IContainerDataService access$400(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService) ipChange.ipc$dispatch("b3d921da", new Object[]{smartNextPageRequestServiceImpl});
        }
        return smartNextPageRequestServiceImpl.mContainerDataService;
    }

    public static /* synthetic */ m58 access$500(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m58) ipChange.ipc$dispatch("7a894001", new Object[]{smartNextPageRequestServiceImpl});
        }
        return smartNextPageRequestServiceImpl.mDynamicRtUserTracer;
    }

    public static /* synthetic */ wi8 access$600(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wi8) ipChange.ipc$dispatch("1b587274", new Object[]{smartNextPageRequestServiceImpl});
        }
        return smartNextPageRequestServiceImpl.mEscapeDurationCounter;
    }

    public static /* synthetic */ String access$700(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("967ac35b", new Object[]{smartNextPageRequestServiceImpl});
        }
        return smartNextPageRequestServiceImpl.getExtendedTime();
    }

    public static /* synthetic */ int access$800(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c144052a", new Object[]{smartNextPageRequestServiceImpl, iContainerDataModel})).intValue();
        }
        return smartNextPageRequestServiceImpl.getNextPageLastCardIndex(iContainerDataModel);
    }

    public static /* synthetic */ List access$900(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f97344c4", new Object[]{smartNextPageRequestServiceImpl});
        }
        return smartNextPageRequestServiceImpl.mNextPageLastCardIndexList;
    }

    private IContainerDataService.a createDataProcessListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.a) ipChange.ipc$dispatch("a5b738e0", new Object[]{this});
        }
        return new a();
    }

    private h6c.b createOnFeedsLayoutListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.b) ipChange.ipc$dispatch("a8a36fe", new Object[]{this});
        }
        return new f();
    }

    private h6c.c<ViewGroup> createOnFeedsScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.c) ipChange.ipc$dispatch("424ddef8", new Object[]{this});
        }
        return new d();
    }

    private sgc.b createOnItemRenderListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgc.b) ipChange.ipc$dispatch("2df3f22b", new Object[]{this});
        }
        return new e();
    }

    private IContainerDataService.c createOnRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("7d4f9901", new Object[]{this});
        }
        return new b();
    }

    private IContainerDataService.f createRequestCommonBizParamsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.f) ipChange.ipc$dispatch("79bb35e1", new Object[]{this});
        }
        return new c();
    }

    private int getBaseSize(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        List<?> sections;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f501c15f", new Object[]{this, iContainerDataModel})).intValue();
        }
        if (iContainerDataModel == null || (base = iContainerDataModel.getBase()) == null || (sections = base.getSections()) == null || sections.isEmpty()) {
            return -1;
        }
        return sections.size();
    }

    private String getExtendedTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d03a565d", new Object[]{this});
        }
        JSONObject A = zza.c().A();
        if (A != null) {
            return A.getString("extendedTime");
        }
        fve.e(TAG, "getExtendedTime ext == null");
        return "";
    }

    private int getNextPageLastCardIndex(IContainerDataModel<?> iContainerDataModel) {
        IContainerDataModel containerData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2ff18d3", new Object[]{this, iContainerDataModel})).intValue();
        }
        if (iContainerDataModel == null || (containerData = this.mContainerDataService.getContainerData()) == null) {
            return -1;
        }
        int size = containerData.getTotalData().size();
        int baseSize = getBaseSize(iContainerDataModel);
        if (baseSize <= 0) {
            return -1;
        }
        return (size + baseSize) - 1;
    }

    private static String getScoreLevel(NavigableMap<Double, String> navigableMap, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e01391f", new Object[]{navigableMap, new Double(d2)});
        }
        if (navigableMap.floorEntry(Double.valueOf(d2)) == null) {
            return "default";
        }
        return navigableMap.floorEntry(Double.valueOf(d2)).getValue();
    }

    private boolean isAllowCalculate(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeb23991", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (!ul4.f(iContainerDataModel) || !ul4.g(iContainerDataModel)) {
            return false;
        }
        return true;
    }

    private void resetScoreLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6c8d6c8", new Object[]{this});
        } else {
            this.mScoreLevel = "default";
        }
    }

    private void triggerRequestNextPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f1a300", new Object[]{this});
            return;
        }
        resetScoreLevel();
        if (this.mContainerDataService == null) {
            fve.e(TAG, "triggerRequestNextPage mContainerDataService == null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", (Object) (-1));
        this.mContainerDataService.triggerEvent("ViewAppear", jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mScrollPreRequestY = DensityUtil.dip2px(Globals.getApplication(), mve.c("willingnessScoreDefaultScrollOffset", 30));
        this.mEscapeDurationCounter.p(cfcVar);
        IContainerDataService<?> iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.mContainerDataService = iContainerDataService;
        if (iContainerDataService != null) {
            this.mOnDataProcessListener = createDataProcessListener();
            this.mOnRequestListener = createOnRequestListener();
            this.mRequestCommonBizParamsCreator = createRequestCommonBizParamsCreator();
            this.mContainerDataService.addDataProcessListener(this.mOnDataProcessListener);
            this.mContainerDataService.addRequestListener(this.mOnRequestListener);
            this.mContainerDataService.addRequestCommonBizParamsCreator(this.mRequestCommonBizParamsCreator);
        }
        IMainFeedsViewService<?> iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.mMainFeedsViewService = iMainFeedsViewService;
        if (iMainFeedsViewService != null) {
            this.mOnFeedsScrollListener = createOnFeedsScrollListener();
            this.mOnItemRenderListener = createOnItemRenderListener();
            this.mOnFeedsLayoutListener = createOnFeedsLayoutListener();
            h6c lifeCycleRegister = this.mMainFeedsViewService.getLifeCycleRegister();
            lifeCycleRegister.h(this.mOnFeedsScrollListener);
            lifeCycleRegister.y(this.mOnItemRenderListener);
            lifeCycleRegister.M(this.mOnFeedsLayoutListener);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService != null) {
            iContainerDataService.removeDataProcessListener(this.mOnDataProcessListener);
            this.mContainerDataService.removeRequestListener(this.mOnRequestListener);
            this.mContainerDataService.removeRequestCommonBizParamsCreator(this.mRequestCommonBizParamsCreator);
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mMainFeedsViewService;
        if (!(iMainFeedsViewService == null || this.mOnFeedsScrollListener == null)) {
            h6c lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
            lifeCycleRegister.v(this.mOnFeedsScrollListener);
            lifeCycleRegister.q(this.mOnItemRenderListener);
            lifeCycleRegister.k(this.mOnFeedsLayoutListener);
        }
        this.mEscapeDurationCounter.n();
    }

    private String calculateScoreLevel(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bb5c0e4", new Object[]{this, iContainerDataModel});
        }
        if (!isAllowCalculate(iContainerDataModel)) {
            return "default";
        }
        JSONObject A = zza.c().A();
        if (A == null) {
            fve.e(TAG, "calculateScoreLevel ext == null");
            return "default";
        }
        double doubleValue = A.getDoubleValue("willingness_score");
        if (doubleValue == vu3.b.GEO_NOT_SUPPORT) {
            fve.e(TAG, "calculateScoreLevel targetScore == 0");
            return "default";
        }
        JSONObject jSONObject = (JSONObject) kr8.b("clientABTest.smartScrollNextPage", A);
        if (jSONObject == null) {
            fve.e(TAG, "smartScrollNextPage == null");
            return "default";
        }
        TreeMap treeMap = new TreeMap();
        String[] strArr = {ScoreLevel.N0, ScoreLevel.N1, ScoreLevel.N2, ScoreLevel.N3};
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (jSONObject.containsKey(str)) {
                treeMap.put(jSONObject.getDouble(str), str);
            }
        }
        return getScoreLevel(treeMap, doubleValue);
    }
}
