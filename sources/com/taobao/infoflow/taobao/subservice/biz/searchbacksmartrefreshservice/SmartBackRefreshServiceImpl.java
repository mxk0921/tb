package com.taobao.infoflow.taobao.subservice.biz.searchbacksmartrefreshservice;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.upp.UppProtocolImpl;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.tao.Globals;
import java.util.Map;
import tb.b5q;
import tb.b92;
import tb.c6o;
import tb.cfc;
import tb.fve;
import tb.get;
import tb.h6c;
import tb.h6d;
import tb.lnn;
import tb.m47;
import tb.mgb;
import tb.n7q;
import tb.sve;
import tb.t2o;
import tb.to2;
import tb.ulp;
import tb.w1e;
import tb.wq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SmartBackRefreshServiceImpl implements ISmartBackRefreshService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_ANCHOR = "feedsStartSectionBizCode";
    private static final String KEY_HOME_GLOBAL_AB_TEST = "homeGlobalABTest";
    private static final int MIN_SCROLL_THRESHOLD = 10;
    private static final String OUT_LINK_ENABLE_TAG = "mEnableOutLinkBackRefresh";
    private static final String OUT_LINK_LOCK_POSITION_ITEM_TAG = "outLinkItemIdKeyList";
    private static final String OUT_LINK_LOCK_POSITION_TAG = "mEnableOutLinkLockPosition";
    private static final int STATUS_BX_REQUEST = 0;
    private static final int STATUS_INVALID_REQUEST = -1;
    private static final int STATUS_NOT_BX_REQUEST = 1;
    private static final String TAG = "SmartBackRefreshServiceImpl";
    private h6c.c feedsScrollListener;
    private mgb mAppLifeCycle;
    private String mBizCode;
    private IContainerDataService<?> mContainerDataService;
    private IMainFeedsViewService<?> mFeedsViewService;
    private cfc mInfoFlowContext;
    private IContainerDataService.c mOnRequestListener;
    private String[] mOutLinkItemIdKey;
    private h6d mPageLifeCycle;
    private IContainerDataService.e mRequestBizParamsCreator;
    private IContainerDataService.f mRequestCommonBizParamsCreator;
    private b5q mSmartBackRefresher;
    private IMainFeedsLoopStartStopService.a mStartAndStopListener;
    private IContainerService.a mUiRefreshListener;
    private boolean mEnableSearchClickCheck = false;
    private boolean mEnableIpvBackRefresh = false;
    private boolean isDirectClickIntoPages = false;
    private boolean isDirectClickIntoPagesForCommon = false;
    private boolean needBaseRefresh = false;
    private long comeBackFrontTimeMills = 0;
    private boolean isComebackFrontForCommon = false;
    public boolean mEnableSearchBaseRefreshNew = false;
    public boolean mEnableIpvBaseRefreshNew = false;
    public boolean mEnableSearchClickRefreshNew = false;
    public boolean mEnablePaySuccessBackRefreshNew = false;
    public boolean mEnableNormalBaseRefresh = false;
    public boolean mEnableSearchPageBackIPVSignal = false;
    private Boolean mEnableOutLinkBackRefresh = null;
    private Boolean mEnableOutLinkLockPosition = null;
    public boolean mIsOutLinkBackRefresh = false;
    private boolean mHasBeenRequestWithBxFeature = false;
    private int scrollBeforeStatus = -1;
    private boolean isStartScroll = false;
    private boolean hasBeenUpload = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f10800a;

        public a(int i) {
            this.f10800a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SmartBackRefreshServiceImpl.access$600(SmartBackRefreshServiceImpl.this).smoothScrollToPositionWithOffset(this.f10800a, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10801a;

        public b(String str) {
            this.f10801a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SharedPreferences e = ulp.c(Globals.getApplication()).e();
            if (e != null) {
                SharedPreferences.Editor edit = e.edit();
                if (SmartBackRefreshServiceImpl.access$1900(SmartBackRefreshServiceImpl.this) != null) {
                    edit.putString(SmartBackRefreshServiceImpl.OUT_LINK_LOCK_POSITION_ITEM_TAG, this.f10801a);
                }
                edit.apply();
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
            return SmartBackRefreshServiceImpl.access$000(SmartBackRefreshServiceImpl.this).k(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements IContainerDataService.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.e
        public Map<String, String> a(w1e w1eVar, String str) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("54f7099b", new Object[]{this, w1eVar, str});
            }
            if (c6o.b(str) && wq4.b()) {
                SmartBackRefreshServiceImpl.this.mIsOutLinkBackRefresh = true;
            }
            if (c6o.c(str)) {
                SmartBackRefreshServiceImpl smartBackRefreshServiceImpl = SmartBackRefreshServiceImpl.this;
                if (smartBackRefreshServiceImpl.mEnableSearchPageBackIPVSignal) {
                    SmartBackRefreshServiceImpl.access$100(smartBackRefreshServiceImpl);
                }
            }
            if (SystemClock.uptimeMillis() - SmartBackRefreshServiceImpl.access$200(SmartBackRefreshServiceImpl.this) < 500) {
                z = true;
            } else {
                z = false;
            }
            Map<String, String> j = SmartBackRefreshServiceImpl.access$000(SmartBackRefreshServiceImpl.this).j(str, z);
            if (j == null || j.isEmpty()) {
                if (c6o.c(str)) {
                    SmartBackRefreshServiceImpl.access$302(SmartBackRefreshServiceImpl.this, 1);
                } else {
                    SmartBackRefreshServiceImpl.access$302(SmartBackRefreshServiceImpl.this, -1);
                }
                z2 = false;
            } else {
                SmartBackRefreshServiceImpl.access$302(SmartBackRefreshServiceImpl.this, 0);
                z2 = true;
            }
            SmartBackRefreshServiceImpl.access$402(SmartBackRefreshServiceImpl.this, false);
            if (c6o.c(str)) {
                if (!SmartBackRefreshServiceImpl.this.enableSearchBackRefresh() && !SmartBackRefreshServiceImpl.this.enableIpvBackRefresh()) {
                    z3 = false;
                }
                n7q.a(z3, z2);
            }
            return j;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements h6c.c<ViewGroup> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
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
            } else if (i == 1 && !SmartBackRefreshServiceImpl.access$400(SmartBackRefreshServiceImpl.this)) {
                SmartBackRefreshServiceImpl.access$402(SmartBackRefreshServiceImpl.this, true);
                SmartBackRefreshServiceImpl.access$502(SmartBackRefreshServiceImpl.this, true);
            }
        }

        @Override // tb.h6c.c
        public void onScrolled(ViewGroup viewGroup, int i, int i2) {
            int[] findFirstCompletelyVisibleItemPositions;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7f64c91", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
            } else if (viewGroup instanceof RecyclerView) {
                if (i2 > 10 && SmartBackRefreshServiceImpl.access$500(SmartBackRefreshServiceImpl.this)) {
                    SmartBackRefreshServiceImpl.access$502(SmartBackRefreshServiceImpl.this, false);
                    if (SmartBackRefreshServiceImpl.access$300(SmartBackRefreshServiceImpl.this) == 0) {
                        n7q.b(true);
                    } else if (SmartBackRefreshServiceImpl.access$300(SmartBackRefreshServiceImpl.this) == 1) {
                        n7q.b(false);
                    }
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) ((RecyclerView) viewGroup).getLayoutManager();
                if (!(staggeredGridLayoutManager == null || SmartBackRefreshServiceImpl.access$600(SmartBackRefreshServiceImpl.this) == null)) {
                    int i3 = Integer.MAX_VALUE;
                    for (int i4 : staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(null)) {
                        if (i4 != -1) {
                            i3 = Math.min(i3, i4);
                        }
                    }
                    if (!(i3 == Integer.MAX_VALUE || lnn.b(SmartBackRefreshServiceImpl.access$700(SmartBackRefreshServiceImpl.this)) == -1)) {
                        if (SmartBackRefreshServiceImpl.access$700(SmartBackRefreshServiceImpl.this) == null || i3 >= lnn.b(SmartBackRefreshServiceImpl.access$700(SmartBackRefreshServiceImpl.this))) {
                            BaseSectionModel<?> findItemDataByPosition = SmartBackRefreshServiceImpl.access$600(SmartBackRefreshServiceImpl.this).findItemDataByPosition(i3);
                            if (!(findItemDataByPosition == null || findItemDataByPosition.getSectionBizCode() == null)) {
                                SmartBackRefreshServiceImpl.access$802(SmartBackRefreshServiceImpl.this, findItemDataByPosition.getSectionBizCode());
                                return;
                            }
                            return;
                        }
                        SmartBackRefreshServiceImpl smartBackRefreshServiceImpl = SmartBackRefreshServiceImpl.this;
                        SmartBackRefreshServiceImpl.access$802(smartBackRefreshServiceImpl, lnn.a(SmartBackRefreshServiceImpl.access$700(smartBackRefreshServiceImpl)));
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements mgb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.mgb
        public void onAppToBackground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            }
        }

        @Override // tb.mgb
        public void onAppToFront() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
                return;
            }
            SmartBackRefreshServiceImpl.access$902(SmartBackRefreshServiceImpl.this, true);
            SmartBackRefreshServiceImpl.access$202(SmartBackRefreshServiceImpl.this, SystemClock.uptimeMillis());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
                return;
            }
            if (SmartBackRefreshServiceImpl.access$1000(SmartBackRefreshServiceImpl.this, iContainerDataModel) && !TextUtils.equals(str, Constant.KEY_PAGEBACK)) {
                SmartBackRefreshServiceImpl.access$802(SmartBackRefreshServiceImpl.this, null);
            }
            SmartBackRefreshServiceImpl.access$1100(SmartBackRefreshServiceImpl.this, iContainerDataModel);
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
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h implements IContainerService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void a(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acfd1f16", new Object[]{this, iUiRefreshActionModel});
            } else if (!TextUtils.equals(iUiRefreshActionModel.getDataSourceType(), "local")) {
                SmartBackRefreshServiceImpl.access$1200(SmartBackRefreshServiceImpl.this, iUiRefreshActionModel.getContainerModel(), iUiRefreshActionModel.getDataChangeType());
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void b(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("154ae7b7", new Object[]{this, iUiRefreshActionModel});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class i implements IMainFeedsLoopStartStopService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0b7652", new Object[]{this, str});
            } else {
                SmartBackRefreshServiceImpl.access$000(SmartBackRefreshServiceImpl.this).l(str);
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService.a
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SharedPreferences e = ulp.c(Globals.getApplication()).e();
            if (e != null) {
                SharedPreferences.Editor edit = e.edit();
                if (SmartBackRefreshServiceImpl.access$1700(SmartBackRefreshServiceImpl.this) != null) {
                    edit.putBoolean(SmartBackRefreshServiceImpl.OUT_LINK_ENABLE_TAG, SmartBackRefreshServiceImpl.access$1700(SmartBackRefreshServiceImpl.this).booleanValue());
                }
                if (SmartBackRefreshServiceImpl.access$1800(SmartBackRefreshServiceImpl.this) != null) {
                    edit.putBoolean(SmartBackRefreshServiceImpl.OUT_LINK_LOCK_POSITION_TAG, SmartBackRefreshServiceImpl.access$1800(SmartBackRefreshServiceImpl.this).booleanValue());
                }
                edit.apply();
            }
        }
    }

    static {
        t2o.a(491782643);
        t2o.a(488636605);
    }

    public static /* synthetic */ b5q access$000(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b5q) ipChange.ipc$dispatch("73bfe1ea", new Object[]{smartBackRefreshServiceImpl});
        }
        return smartBackRefreshServiceImpl.mSmartBackRefresher;
    }

    public static /* synthetic */ void access$100(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc355af", new Object[]{smartBackRefreshServiceImpl});
        } else {
            smartBackRefreshServiceImpl.checkIPVSignalSendUCPEvent();
        }
    }

    public static /* synthetic */ boolean access$1000(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b3fba1e", new Object[]{smartBackRefreshServiceImpl, iContainerDataModel})).booleanValue();
        }
        return smartBackRefreshServiceImpl.isZeroBaseRefresh(iContainerDataModel);
    }

    public static /* synthetic */ void access$1100(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdbeff5b", new Object[]{smartBackRefreshServiceImpl, iContainerDataModel});
        } else {
            smartBackRefreshServiceImpl.initExperimentTag(iContainerDataModel);
        }
    }

    public static /* synthetic */ void access$1200(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl, IContainerDataModel iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a54dff66", new Object[]{smartBackRefreshServiceImpl, iContainerDataModel, str});
        } else {
            smartBackRefreshServiceImpl.checkAndScrollToTop(iContainerDataModel, str);
        }
    }

    public static /* synthetic */ boolean access$1300(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ec324a2", new Object[]{smartBackRefreshServiceImpl})).booleanValue();
        }
        return smartBackRefreshServiceImpl.mHasBeenRequestWithBxFeature;
    }

    public static /* synthetic */ boolean access$1400(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23f51601", new Object[]{smartBackRefreshServiceImpl})).booleanValue();
        }
        return smartBackRefreshServiceImpl.isLockPositionFeatureExist();
    }

    public static /* synthetic */ boolean access$1500(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9270760", new Object[]{smartBackRefreshServiceImpl})).booleanValue();
        }
        return smartBackRefreshServiceImpl.isIpvFeatureExist();
    }

    public static /* synthetic */ void access$1600(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae58f8bb", new Object[]{smartBackRefreshServiceImpl});
        } else {
            smartBackRefreshServiceImpl.triggerPageBackEvent();
        }
    }

    public static /* synthetic */ Boolean access$1700(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f04b6917", new Object[]{smartBackRefreshServiceImpl});
        }
        return smartBackRefreshServiceImpl.mEnableOutLinkBackRefresh;
    }

    public static /* synthetic */ Boolean access$1800(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("e37d60b6", new Object[]{smartBackRefreshServiceImpl});
        }
        return smartBackRefreshServiceImpl.mEnableOutLinkLockPosition;
    }

    public static /* synthetic */ String[] access$1900(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("42a61aa7", new Object[]{smartBackRefreshServiceImpl});
        }
        return smartBackRefreshServiceImpl.mOutLinkItemIdKey;
    }

    public static /* synthetic */ long access$200(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4f54702", new Object[]{smartBackRefreshServiceImpl})).longValue();
        }
        return smartBackRefreshServiceImpl.comeBackFrontTimeMills;
    }

    public static /* synthetic */ long access$202(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a09deec", new Object[]{smartBackRefreshServiceImpl, new Long(j2)})).longValue();
        }
        smartBackRefreshServiceImpl.comeBackFrontTimeMills = j2;
        return j2;
    }

    public static /* synthetic */ int access$300(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a273860", new Object[]{smartBackRefreshServiceImpl})).intValue();
        }
        return smartBackRefreshServiceImpl.scrollBeforeStatus;
    }

    public static /* synthetic */ int access$302(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b1615ab", new Object[]{smartBackRefreshServiceImpl, new Integer(i2)})).intValue();
        }
        smartBackRefreshServiceImpl.scrollBeforeStatus = i2;
        return i2;
    }

    public static /* synthetic */ boolean access$400(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f5929d0", new Object[]{smartBackRefreshServiceImpl})).booleanValue();
        }
        return smartBackRefreshServiceImpl.hasBeenUpload;
    }

    public static /* synthetic */ boolean access$402(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c22900e", new Object[]{smartBackRefreshServiceImpl, new Boolean(z)})).booleanValue();
        }
        smartBackRefreshServiceImpl.hasBeenUpload = z;
        return z;
    }

    public static /* synthetic */ boolean access$500(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48b1b2f", new Object[]{smartBackRefreshServiceImpl})).booleanValue();
        }
        return smartBackRefreshServiceImpl.isStartScroll;
    }

    public static /* synthetic */ boolean access$502(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2eca8f", new Object[]{smartBackRefreshServiceImpl, new Boolean(z)})).booleanValue();
        }
        smartBackRefreshServiceImpl.isStartScroll = z;
        return z;
    }

    public static /* synthetic */ IMainFeedsViewService access$600(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsViewService) ipChange.ipc$dispatch("b582ccb2", new Object[]{smartBackRefreshServiceImpl});
        }
        return smartBackRefreshServiceImpl.mFeedsViewService;
    }

    public static /* synthetic */ cfc access$700(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("4a7e2dd9", new Object[]{smartBackRefreshServiceImpl});
        }
        return smartBackRefreshServiceImpl.mInfoFlowContext;
    }

    public static /* synthetic */ String access$802(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6764d0d0", new Object[]{smartBackRefreshServiceImpl, str});
        }
        smartBackRefreshServiceImpl.mBizCode = str;
        return str;
    }

    public static /* synthetic */ boolean access$902(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("915fb493", new Object[]{smartBackRefreshServiceImpl, new Boolean(z)})).booleanValue();
        }
        smartBackRefreshServiceImpl.isComebackFrontForCommon = z;
        return z;
    }

    private void checkAndScrollToTop(IContainerDataModel<?> iContainerDataModel, String str) {
        IContainerInnerDataModel<?> iContainerInnerDataModel;
        JSONObject ext;
        int positionBySectionBizCode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1449c00", new Object[]{this, iContainerDataModel, str});
        } else if (iContainerDataModel != null) {
            if (TextUtils.equals(str, "base")) {
                iContainerInnerDataModel = iContainerDataModel.getBase();
            } else {
                iContainerInnerDataModel = iContainerDataModel.getDelta();
            }
            if (iContainerInnerDataModel != null && (ext = iContainerInnerDataModel.getExt()) != null && TextUtils.equals(ext.getString("needScrollToTop"), "true") && this.mFeedsViewService != null) {
                IFirstScreenDataService iFirstScreenDataService = (IFirstScreenDataService) this.mInfoFlowContext.a(IFirstScreenDataService.class);
                if (iFirstScreenDataService == null) {
                    fve.e(TAG, "firstScreenDataService == null");
                    return;
                }
                JSONObject firstScreenExt = iFirstScreenDataService.getFirstScreenExt();
                if (firstScreenExt == null) {
                    fve.e(TAG, "firstScreenExt == null");
                    return;
                }
                String string = firstScreenExt.getString(KEY_ANCHOR);
                if (!TextUtils.isEmpty(string) && (positionBySectionBizCode = this.mFeedsViewService.getPositionBySectionBizCode(string)) >= 0) {
                    get.a().h(new a(positionBySectionBizCode));
                }
            }
        }
    }

    private void checkIPVSignalSendUCPEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8a81f6", new Object[]{this});
            return;
        }
        String a2 = to2.a(this.mSmartBackRefresher.a(), b92.BX_INVOKE_ID, TAG);
        if (!TextUtils.isEmpty(a2) && a2.contains(b92.IPV_SIGNAL_NAME)) {
            UppProtocolImpl.getInstance().sendUCPEventWithScene("Page_Home", "search_ipv_signal", null);
        }
    }

    private mgb createAppLifeCycleListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mgb) ipChange.ipc$dispatch("4515559d", new Object[]{this});
        }
        return new f();
    }

    private h6c.c<ViewGroup> createFeedsScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.c) ipChange.ipc$dispatch("9fa113f9", new Object[]{this});
        }
        return new e();
    }

    private h6d createPageLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6d) ipChange.ipc$dispatch("8602dec9", new Object[]{this});
        }
        return new j();
    }

    private IContainerDataService.e createRequestBizParamsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.e) ipChange.ipc$dispatch("9c9cb41", new Object[]{this});
        }
        return new d();
    }

    private IContainerDataService.f createRequestCommonBizParamsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.f) ipChange.ipc$dispatch("79bb35e1", new Object[]{this});
        }
        return new c();
    }

    private IContainerDataService.c createRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("2a3a89a0", new Object[]{this});
        }
        return new g();
    }

    private IMainFeedsLoopStartStopService.a createStartAndStopListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsLoopStartStopService.a) ipChange.ipc$dispatch("a8447e40", new Object[]{this});
        }
        return new i();
    }

    private IContainerService.a createUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerService.a) ipChange.ipc$dispatch("c4ddacd6", new Object[]{this});
        }
        return new h();
    }

    private JSONObject getSubBaseExt(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2496718e", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel == null) {
            fve.e(TAG, "containerDataModel == null");
            return null;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base != null) {
            return base.getExt();
        }
        fve.e(TAG, "baseData == null");
        return null;
    }

    private boolean isIpvFeatureExist() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e259a71", new Object[]{this})).booleanValue();
        }
        b5q b5qVar = this.mSmartBackRefresher;
        if (b5qVar == null) {
            return false;
        }
        return b5qVar.f();
    }

    private boolean isLockPositionFeatureExist() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69978a", new Object[]{this})).booleanValue();
        }
        b5q b5qVar = this.mSmartBackRefresher;
        if (b5qVar == null) {
            return false;
        }
        return b5qVar.g();
    }

    private boolean isZeroBaseRefresh(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c24eee0", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null || iContainerDataModel.getBase() == null || iContainerDataModel.getBase().getPageParams() == null || iContainerDataModel.getBase().getPageParams().getPageNum() != 0) {
            return false;
        }
        return true;
    }

    private void parseOutLinkItemIdKey(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("659a7f8d", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString(OUT_LINK_LOCK_POSITION_ITEM_TAG);
            if (!TextUtils.isEmpty(string)) {
                this.mOutLinkItemIdKey = string.split(",");
                get.a().e(new b(string));
            }
        }
    }

    private void registerFrontBackgroundListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23af646f", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.mInfoFlowContext.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null) {
            this.mAppLifeCycle = createAppLifeCycleListener();
            iMainLifecycleService.getAppLifeCycleRegister().b(this.mAppLifeCycle);
        }
    }

    private void registerHomeLeaveListener(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0906b0", new Object[]{this, cfcVar});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null) {
            this.mPageLifeCycle = createPageLifeCycle();
            iMainLifecycleService.getPageLifeCycleRegister().a(this.mPageLifeCycle);
        }
    }

    private void registerInfoFlowVisibleListener(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be534f2", new Object[]{this, cfcVar});
            return;
        }
        IMainFeedsLoopStartStopService iMainFeedsLoopStartStopService = (IMainFeedsLoopStartStopService) cfcVar.a(IMainFeedsLoopStartStopService.class);
        if (iMainFeedsLoopStartStopService != null) {
            IMainFeedsLoopStartStopService.a createStartAndStopListener = createStartAndStopListener();
            this.mStartAndStopListener = createStartAndStopListener;
            iMainFeedsLoopStartStopService.registerStartStopListener(createStartAndStopListener);
        }
    }

    private void registerRequestBizParamsCreator(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eff087a", new Object[]{this, cfcVar});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            IContainerDataService.f createRequestCommonBizParamsCreator = createRequestCommonBizParamsCreator();
            this.mRequestCommonBizParamsCreator = createRequestCommonBizParamsCreator;
            iContainerDataService.addRequestCommonBizParamsCreator(createRequestCommonBizParamsCreator);
            IContainerDataService.e createRequestBizParamsCreator = createRequestBizParamsCreator();
            this.mRequestBizParamsCreator = createRequestBizParamsCreator;
            iContainerDataService.addRequestBizParamsCreator(createRequestBizParamsCreator);
        }
    }

    private void registerRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2910fc7", new Object[]{this});
            return;
        }
        this.mOnRequestListener = createRequestListener();
        IContainerDataService<?> iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        this.mContainerDataService = iContainerDataService;
        if (iContainerDataService == null) {
            fve.e(TAG, "IContainerDataService is null");
        } else {
            iContainerDataService.addRequestListener(this.mOnRequestListener);
        }
    }

    private void registerScrollListener() {
        IMainFeedsViewService<?> iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d9e6ab", new Object[]{this});
        } else if (this.feedsScrollListener == null && (iMainFeedsViewService = this.mFeedsViewService) != null) {
            h6c lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
            h6c.c<ViewGroup> createFeedsScrollListener = createFeedsScrollListener();
            this.feedsScrollListener = createFeedsScrollListener;
            lifeCycleRegister.h(createFeedsScrollListener);
        }
    }

    private void registerUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb2e39f", new Object[]{this});
            return;
        }
        this.mUiRefreshListener = createUiRefreshListener();
        IContainerService iContainerService = (IContainerService) this.mInfoFlowContext.a(IContainerService.class);
        if (iContainerService != null) {
            iContainerService.addUiRefreshListener(this.mUiRefreshListener);
        }
    }

    private void triggerPageBackEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da1887d3", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e(TAG, "onPullRefresh dataService == null");
            return;
        }
        iContainerDataService.triggerEvent("PageBack", null, new sve("PageBack" + SystemClock.uptimeMillis()));
    }

    private void unRegisterFrontBackgroundListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37754f16", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.mInfoFlowContext.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null && this.mAppLifeCycle != null) {
            iMainLifecycleService.getAppLifeCycleRegister().a(this.mAppLifeCycle);
        }
    }

    private void unRegisterHomeLeaveListener(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e7803e9", new Object[]{this, cfcVar});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null && this.mPageLifeCycle != null) {
            iMainLifecycleService.getPageLifeCycleRegister().b(this.mPageLifeCycle);
            this.mPageLifeCycle = null;
        }
    }

    private void unRegisterInfoFlowVisibleListener(cfc cfcVar) {
        IMainFeedsLoopStartStopService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a5a36b", new Object[]{this, cfcVar});
            return;
        }
        IMainFeedsLoopStartStopService iMainFeedsLoopStartStopService = (IMainFeedsLoopStartStopService) cfcVar.a(IMainFeedsLoopStartStopService.class);
        if (iMainFeedsLoopStartStopService != null && (aVar = this.mStartAndStopListener) != null) {
            iMainFeedsLoopStartStopService.unregisterStartStopListener(aVar);
            this.mStartAndStopListener = null;
        }
    }

    private void unRegisterRequestBizParamsCreator(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77bf76f3", new Object[]{this, cfcVar});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            IContainerDataService.f fVar = this.mRequestCommonBizParamsCreator;
            if (fVar != null) {
                iContainerDataService.removeRequestCommonBizParamsCreator(fVar);
            }
            IContainerDataService.e eVar = this.mRequestBizParamsCreator;
            if (eVar != null) {
                iContainerDataService.removeRequestBizParamsCreator(eVar);
            }
            this.mRequestBizParamsCreator = null;
        }
    }

    private void unRegisterRequestListener() {
        IContainerDataService<?> iContainerDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c3916e", new Object[]{this});
            return;
        }
        IContainerDataService.c cVar = this.mOnRequestListener;
        if (cVar != null && (iContainerDataService = this.mContainerDataService) != null) {
            iContainerDataService.removeRequestListener(cVar);
        }
    }

    private void unRegisterScrollListener() {
        IMainFeedsViewService<?> iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0d1424", new Object[]{this});
        } else if (this.feedsScrollListener != null && (iMainFeedsViewService = this.mFeedsViewService) != null) {
            iMainFeedsViewService.getLifeCycleRegister().v(this.feedsScrollListener);
            this.feedsScrollListener = null;
        }
    }

    private void unRegisterUiRefreshListener() {
        IContainerService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b9786", new Object[]{this});
            return;
        }
        IContainerService iContainerService = (IContainerService) this.mInfoFlowContext.a(IContainerService.class);
        if (iContainerService != null && (aVar = this.mUiRefreshListener) != null) {
            iContainerService.removeUiRefreshListener(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean enableBaseRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1b49252", new Object[]{this})).booleanValue();
        }
        return this.needBaseRefresh;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean enableIpvBackRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8afa1133", new Object[]{this})).booleanValue();
        }
        if (this.mEnableIpvBackRefresh || this.mEnableIpvBaseRefreshNew) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean enableNormalBackRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2ca08d5", new Object[]{this})).booleanValue();
        }
        return this.mEnableNormalBaseRefresh;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean enableOutLinkLockPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9503184", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.mEnableOutLinkLockPosition;
        if (bool != null) {
            return bool.booleanValue();
        }
        SharedPreferences e2 = ulp.c(Globals.getApplication()).e();
        if (e2 == null) {
            return false;
        }
        return e2.getBoolean(OUT_LINK_LOCK_POSITION_TAG, false);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean enablePaySuccessBackRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2f281", new Object[]{this})).booleanValue();
        }
        return this.mEnablePaySuccessBackRefreshNew;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean enableSearchBackRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f09a5f4", new Object[]{this})).booleanValue();
        }
        if (this.mEnableSearchBaseRefreshNew || enableSearchBackRefreshOld()) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean enableSearchClickCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7735ed6", new Object[]{this})).booleanValue();
        }
        if (this.mEnableSearchClickCheck || this.mEnableSearchClickRefreshNew) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public String getFirstCompletelyVisibleBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e88195ab", new Object[]{this});
        }
        return lnn.a(this.mInfoFlowContext);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public String[] getOutLinkItemIdKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("5fc86b35", new Object[]{this});
        }
        if (this.mOutLinkItemIdKey == null) {
            SharedPreferences e2 = ulp.c(Globals.getApplication()).e();
            if (e2 == null) {
                return null;
            }
            String string = e2.getString(OUT_LINK_LOCK_POSITION_ITEM_TAG, "");
            if (string != null) {
                return string.split(",");
            }
        }
        return this.mOutLinkItemIdKey;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean isBackgroundToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d683ce1", new Object[]{this})).booleanValue();
        }
        return this.isComebackFrontForCommon;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean isCurrentRefreshByOutLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bba6a090", new Object[]{this})).booleanValue();
        }
        return this.mIsOutLinkBackRefresh;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean isDirectClickInInfoFlow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ec18e41", new Object[]{this})).booleanValue();
        }
        return this.isDirectClickIntoPages;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean isDirectClickInInfoFlowForCommon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d103589", new Object[]{this})).booleanValue();
        }
        return this.isDirectClickIntoPagesForCommon;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        this.mSmartBackRefresher = new b5q(cfcVar);
        cfc cfcVar2 = this.mInfoFlowContext;
        if (cfcVar2 != null) {
            this.mFeedsViewService = (IMainFeedsViewService) cfcVar2.a(IMainFeedsViewService.class);
        }
        registerRequestBizParamsCreator(this.mInfoFlowContext);
        registerInfoFlowVisibleListener(this.mInfoFlowContext);
        registerHomeLeaveListener(this.mInfoFlowContext);
        registerRequestListener();
        registerScrollListener();
        registerFrontBackgroundListener();
        registerUiRefreshListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterRequestBizParamsCreator(this.mInfoFlowContext);
        unRegisterInfoFlowVisibleListener(this.mInfoFlowContext);
        unRegisterHomeLeaveListener(this.mInfoFlowContext);
        unRegisterRequestListener();
        unRegisterScrollListener();
        unRegisterFrontBackgroundListener();
        unRegisterUiRefreshListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public void resetCommonStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63cb33", new Object[]{this});
            return;
        }
        this.isComebackFrontForCommon = false;
        this.isDirectClickIntoPagesForCommon = false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public void resetStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b50ee28", new Object[]{this});
            return;
        }
        this.isDirectClickIntoPages = false;
        this.mIsOutLinkBackRefresh = false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public void setDirectClickInInfoFlow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e61856f", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isDirectClickIntoPages = z;
        this.isDirectClickIntoPagesForCommon = z;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public void setRequestWithBxFeature(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d2a680", new Object[]{this, new Boolean(z)});
        } else {
            this.mHasBeenRequestWithBxFeature = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class j extends m47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/searchbacksmartrefreshservice/SmartBackRefreshServiceImpl$8");
        }

        @Override // tb.m47, tb.h6d
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            } else {
                SmartBackRefreshServiceImpl.access$000(SmartBackRefreshServiceImpl.this).l(IMainFeedsLoopStartStopService.a.PAGE_SWITCH);
            }
        }

        @Override // tb.m47, tb.h6d
        public void onColdStartResume() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45e9b853", new Object[]{this});
                return;
            }
            fve.e(SmartBackRefreshServiceImpl.TAG, "触发onColdStartResumemHasBeenRequestWithBxFeature:" + SmartBackRefreshServiceImpl.access$1300(SmartBackRefreshServiceImpl.this));
            if (SmartBackRefreshServiceImpl.this.enableOutLinkLockPosition() && SmartBackRefreshServiceImpl.access$1400(SmartBackRefreshServiceImpl.this)) {
                z = true;
            }
            if (SmartBackRefreshServiceImpl.access$1300(SmartBackRefreshServiceImpl.this)) {
                return;
            }
            if (SmartBackRefreshServiceImpl.access$1500(SmartBackRefreshServiceImpl.this) || z) {
                fve.e(SmartBackRefreshServiceImpl.TAG, "onColdStartResume: triggerPageBackEvent");
                SmartBackRefreshServiceImpl.access$1600(SmartBackRefreshServiceImpl.this);
                SmartBackRefreshServiceImpl.this.mIsOutLinkBackRefresh = true;
            }
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean enableOutLinkBackRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a56bea5a", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.mEnableOutLinkBackRefresh;
        if (bool != null) {
            return bool.booleanValue();
        }
        SharedPreferences e2 = ulp.c(Globals.getApplication()).e();
        if (e2 == null) {
            return false;
        }
        return e2.getBoolean(OUT_LINK_ENABLE_TAG, false);
    }

    private boolean enableSearchBackRefreshOld() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecaa5909", new Object[]{this})).booleanValue();
        }
        IFirstScreenDataService iFirstScreenDataService = (IFirstScreenDataService) this.mInfoFlowContext.a(IFirstScreenDataService.class);
        if (iFirstScreenDataService == null) {
            fve.e(TAG, "enableFirstScreenSmartRefresh firstScreenDataService is null");
            return false;
        }
        JSONObject firstScreenExt = iFirstScreenDataService.getFirstScreenExt();
        return firstScreenExt != null && firstScreenExt.getBooleanValue("zeroRefreshEnable");
    }

    private void initExperimentTag(IContainerDataModel<?> iContainerDataModel) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1a38b87", new Object[]{this, iContainerDataModel});
            return;
        }
        JSONObject subBaseExt = getSubBaseExt(iContainerDataModel);
        if (subBaseExt != null) {
            this.mEnableSearchBaseRefreshNew = subBaseExt.getBooleanValue("searchBackRefresh");
            this.mEnableIpvBaseRefreshNew = subBaseExt.getBooleanValue("ipvBackRefresh");
            this.mEnableNormalBaseRefresh = subBaseExt.getBooleanValue("normalBackRefresh");
            this.mEnableSearchClickRefreshNew = subBaseExt.getBooleanValue("enableSearchBackRefresh");
            this.mEnablePaySuccessBackRefreshNew = subBaseExt.getBooleanValue("paySuccessRefresh");
            this.mEnableSearchPageBackIPVSignal = subBaseExt.getBooleanValue("enableSearchPageBackIPVSignal");
            if (!this.mEnableSearchBaseRefreshNew && !this.mEnableIpvBaseRefreshNew && !this.mEnableNormalBaseRefresh && !this.mEnablePaySuccessBackRefreshNew) {
                z = false;
            }
            this.needBaseRefresh = z;
            parseOutLinkItemIdKey(subBaseExt);
            JSONObject jSONObject = subBaseExt.getJSONObject(KEY_HOME_GLOBAL_AB_TEST);
            if (ObjectUtils.c(jSONObject)) {
                fve.e(TAG, "enablePreLoadNewDetail homeGlobalAbTest is null");
                return;
            }
            this.mEnableSearchClickCheck = jSONObject.getBooleanValue("enableSearchBackRefresh");
            this.mEnableIpvBackRefresh = jSONObject.getBooleanValue("enableOtherBackRefresh");
            this.mEnableOutLinkLockPosition = Boolean.valueOf(enableOutLinkLockPosition(iContainerDataModel));
            Boolean bool = jSONObject.getBoolean("enableOuterBackRefresh");
            if (bool != null) {
                this.mEnableOutLinkBackRefresh = bool;
            }
            get.a().e(new k());
        }
    }

    private boolean enableOutLinkLockPosition(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4a70bbf", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null || (base = iContainerDataModel.getBase()) == null || (ext = base.getExt()) == null) {
            return false;
        }
        return TextUtils.equals(ext.getString("enableOutLinkLockPosition"), "true");
    }
}
