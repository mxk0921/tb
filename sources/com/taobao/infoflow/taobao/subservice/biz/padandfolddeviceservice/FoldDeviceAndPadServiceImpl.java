package com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.OnWindowChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.WindowType;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.tao.Globals;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.a9c;
import tb.ao4;
import tb.cfc;
import tb.dji;
import tb.duk;
import tb.f4b;
import tb.fve;
import tb.gj7;
import tb.guk;
import tb.iqb;
import tb.ki7;
import tb.mue;
import tb.mve;
import tb.n7c;
import tb.qwo;
import tb.t2o;
import tb.u5d;
import tb.wq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FoldDeviceAndPadServiceImpl implements IFoldDeviceAndPadService, OnScreenChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_COLUMN_CONFIG = "{\"min\":\"2\",\"small\":\"2\",\"medium\":\"4\",\"large\":\"5\",\"max\":\"5\"}";
    private static final int DEFAULT_INFO_FLOW_COLUMN = 2;
    private static final String IS_HUD_SCREEN = "isHudScreen";
    private static final String KEY_COLUMN_CONFIG = "columnCountConfig";
    private static final String ORANGE_KEY_ENABLE_NEW_SCREEN_CHANGE_LISTENER = "enableNewScreenChangeListener";
    private static final String TAG = "FoldDeviceAndPadServiceImpl";
    private Context mActivityContext;
    private JSONObject mColumnConfig;
    private IContainerDataService<?> mContainerDataService;
    private iqb.a mContainerListener;
    private IContainerService<?> mContainerService;
    private IDxItemRenderService mDxRenderService;
    private boolean mEnableInfoFlowScale;
    private boolean mEnableNewListener;
    private IMainFeedsViewService<?> mFeedsViewService;
    private IHostService mHostService;
    private cfc mInfoFlowContext;
    private boolean mIsAdaptHudScreen;
    private boolean mIsHudDevice;
    private boolean mIsScreenPortrait;
    private OnWindowChangedListener mOnWindowChangeListener;
    private ki7 mParamsCreator;
    private dji mScaleGestureDetector;
    private final List<IFoldDeviceAndPadService.a> mScreenChangeLifeCycle = new CopyOnWriteArrayList();
    private IContainerService.a mUiRefreshListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements iqb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.iqb.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30cf99d1", new Object[]{this});
            }
        }

        @Override // tb.iqb.a
        public void b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df5adadd", new Object[]{this, context});
                return;
            }
            FoldDeviceAndPadServiceImpl.access$102(FoldDeviceAndPadServiceImpl.this, gj7.c(context));
            FoldDeviceAndPadServiceImpl.access$202(FoldDeviceAndPadServiceImpl.this, wq4.a(context));
            if (FoldDeviceAndPadServiceImpl.access$300(FoldDeviceAndPadServiceImpl.this)) {
                FoldDeviceAndPadServiceImpl.access$400(FoldDeviceAndPadServiceImpl.this);
            }
        }

        @Override // tb.iqb.a
        public void c() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afa2fd3d", new Object[]{this});
            } else if (FoldDeviceAndPadServiceImpl.access$500(FoldDeviceAndPadServiceImpl.this) != null && FoldDeviceAndPadServiceImpl.access$600(FoldDeviceAndPadServiceImpl.this)) {
                boolean isAdaptHudScreen = FoldDeviceAndPadServiceImpl.this.isAdaptHudScreen();
                IDxItemRenderService access$500 = FoldDeviceAndPadServiceImpl.access$500(FoldDeviceAndPadServiceImpl.this);
                if (isAdaptHudScreen && FoldDeviceAndPadServiceImpl.access$700(FoldDeviceAndPadServiceImpl.this)) {
                    z = true;
                }
                access$500.setDxEngineDesignScaleEnable(isAdaptHudScreen, z);
                fve.e(FoldDeviceAndPadServiceImpl.TAG, "createContainerEnd setDxEngineDesignScaleEnable: " + isAdaptHudScreen);
                FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl = FoldDeviceAndPadServiceImpl.this;
                FoldDeviceAndPadServiceImpl.access$900(foldDeviceAndPadServiceImpl, FoldDeviceAndPadServiceImpl.access$800(foldDeviceAndPadServiceImpl));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements IContainerService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void a(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acfd1f16", new Object[]{this, iUiRefreshActionModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void b(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("154ae7b7", new Object[]{this, iUiRefreshActionModel});
            } else if (FoldDeviceAndPadServiceImpl.access$600(FoldDeviceAndPadServiceImpl.this)) {
                boolean access$1000 = FoldDeviceAndPadServiceImpl.access$1000(FoldDeviceAndPadServiceImpl.this);
                boolean isAdaptHudScreen = FoldDeviceAndPadServiceImpl.this.isAdaptHudScreen();
                if (!(isAdaptHudScreen == FoldDeviceAndPadServiceImpl.access$1100(FoldDeviceAndPadServiceImpl.this) && access$1000 == FoldDeviceAndPadServiceImpl.access$1200(FoldDeviceAndPadServiceImpl.this))) {
                    FoldDeviceAndPadServiceImpl.access$1202(FoldDeviceAndPadServiceImpl.this, access$1000);
                    if (isAdaptHudScreen) {
                        FoldDeviceAndPadServiceImpl.access$1300(FoldDeviceAndPadServiceImpl.this);
                    } else {
                        FoldDeviceAndPadServiceImpl.access$1400(FoldDeviceAndPadServiceImpl.this);
                    }
                }
                FoldDeviceAndPadServiceImpl.access$1102(FoldDeviceAndPadServiceImpl.this, isAdaptHudScreen);
                if (TextUtils.equals("pullRefresh", iUiRefreshActionModel.getRequestType())) {
                    mue.d();
                    fve.e(FoldDeviceAndPadServiceImpl.TAG, "base refresh reset card width cache");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements duk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.duk
        public void a(dji.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33366006", new Object[]{this, cVar});
            } else if (!FoldDeviceAndPadServiceImpl.access$1000(FoldDeviceAndPadServiceImpl.this)) {
                fve.e(FoldDeviceAndPadServiceImpl.TAG, "info flow scale disable");
            } else {
                if (FoldDeviceAndPadServiceImpl.access$1600(FoldDeviceAndPadServiceImpl.this) != FoldDeviceAndPadServiceImpl.access$1500(FoldDeviceAndPadServiceImpl.this).getInfoFlowColumn()) {
                    FoldDeviceAndPadServiceImpl.access$1700(FoldDeviceAndPadServiceImpl.this);
                }
                fve.e(FoldDeviceAndPadServiceImpl.TAG, "column config changed: " + cVar);
            }
        }

        @Override // tb.duk
        public void onScale(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2015500", new Object[]{this, scaleGestureDetector});
            } else {
                fve.e(FoldDeviceAndPadServiceImpl.TAG, "onScale");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements qwo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.qwo
        public WindowType a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowType) ipChange.ipc$dispatch("e9085da8", new Object[]{this});
            }
            Activity access$800 = FoldDeviceAndPadServiceImpl.access$800(FoldDeviceAndPadServiceImpl.this);
            if (access$800 == null) {
                return WindowType.MEDIUM;
            }
            return TBAutoSizeConfig.x().M(access$800);
        }

        @Override // tb.qwo
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f0ca8d0", new Object[]{this})).booleanValue();
            }
            Activity access$800 = FoldDeviceAndPadServiceImpl.access$800(FoldDeviceAndPadServiceImpl.this);
            if (!gj7.a() || access$800 == null) {
                return false;
            }
            return !TBAutoSizeConfig.x().T(access$800);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements a9c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public void a(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9b14c36", new Object[]{this, motionEvent});
            } else if (!FoldDeviceAndPadServiceImpl.access$1100(FoldDeviceAndPadServiceImpl.this)) {
            } else {
                if ((!gj7.a() || !FoldDeviceAndPadServiceImpl.access$100(FoldDeviceAndPadServiceImpl.this)) && FoldDeviceAndPadServiceImpl.access$1200(FoldDeviceAndPadServiceImpl.this)) {
                    FoldDeviceAndPadServiceImpl.access$1800(FoldDeviceAndPadServiceImpl.this).l(motionEvent);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class g {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$autosize$WindowType;

        static {
            int[] iArr = new int[WindowType.values().length];
            $SwitchMap$com$taobao$android$autosize$WindowType = iArr;
            try {
                iArr[WindowType.MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.MAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        t2o.a(491782515);
        t2o.a(488636564);
    }

    public static /* synthetic */ void access$000(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d7f972", new Object[]{foldDeviceAndPadServiceImpl});
        } else {
            foldDeviceAndPadServiceImpl.onScreenChangedInternal();
        }
    }

    public static /* synthetic */ boolean access$100(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e361e15", new Object[]{foldDeviceAndPadServiceImpl})).booleanValue();
        }
        return foldDeviceAndPadServiceImpl.mIsScreenPortrait;
    }

    public static /* synthetic */ boolean access$1000(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8211e67", new Object[]{foldDeviceAndPadServiceImpl})).booleanValue();
        }
        return foldDeviceAndPadServiceImpl.enableInfoFlowScale();
    }

    public static /* synthetic */ boolean access$102(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa4ede9", new Object[]{foldDeviceAndPadServiceImpl, new Boolean(z)})).booleanValue();
        }
        foldDeviceAndPadServiceImpl.mIsScreenPortrait = z;
        return z;
    }

    public static /* synthetic */ boolean access$1100(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c07f4306", new Object[]{foldDeviceAndPadServiceImpl})).booleanValue();
        }
        return foldDeviceAndPadServiceImpl.mIsAdaptHudScreen;
    }

    public static /* synthetic */ boolean access$1102(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1806718", new Object[]{foldDeviceAndPadServiceImpl, new Boolean(z)})).booleanValue();
        }
        foldDeviceAndPadServiceImpl.mIsAdaptHudScreen = z;
        return z;
    }

    public static /* synthetic */ boolean access$1200(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88dd67a5", new Object[]{foldDeviceAndPadServiceImpl})).booleanValue();
        }
        return foldDeviceAndPadServiceImpl.mEnableInfoFlowScale;
    }

    public static /* synthetic */ boolean access$1202(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44e6d659", new Object[]{foldDeviceAndPadServiceImpl, new Boolean(z)})).booleanValue();
        }
        foldDeviceAndPadServiceImpl.mEnableInfoFlowScale = z;
        return z;
    }

    public static /* synthetic */ void access$1300(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513b8c40", new Object[]{foldDeviceAndPadServiceImpl});
        } else {
            foldDeviceAndPadServiceImpl.setMainFeedsHudScreenStyle();
        }
    }

    public static /* synthetic */ void access$1400(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1999b0df", new Object[]{foldDeviceAndPadServiceImpl});
        } else {
            foldDeviceAndPadServiceImpl.resetMainFeedsStyle();
        }
    }

    public static /* synthetic */ IMainFeedsViewService access$1500(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsViewService) ipChange.ipc$dispatch("278dc1a6", new Object[]{foldDeviceAndPadServiceImpl});
        }
        return foldDeviceAndPadServiceImpl.mFeedsViewService;
    }

    public static /* synthetic */ int access$1600(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa55fa10", new Object[]{foldDeviceAndPadServiceImpl})).intValue();
        }
        return foldDeviceAndPadServiceImpl.getScaleColumnByScreenType();
    }

    public static /* synthetic */ void access$1700(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b41ebc", new Object[]{foldDeviceAndPadServiceImpl});
        } else {
            foldDeviceAndPadServiceImpl.triggerUiRefresh();
        }
    }

    public static /* synthetic */ dji access$1800(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dji) ipChange.ipc$dispatch("2cc9b01b", new Object[]{foldDeviceAndPadServiceImpl});
        }
        return foldDeviceAndPadServiceImpl.mScaleGestureDetector;
    }

    public static /* synthetic */ Context access$202(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c4a81112", new Object[]{foldDeviceAndPadServiceImpl, context});
        }
        foldDeviceAndPadServiceImpl.mActivityContext = context;
        return context;
    }

    public static /* synthetic */ boolean access$300(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fef26753", new Object[]{foldDeviceAndPadServiceImpl})).booleanValue();
        }
        return foldDeviceAndPadServiceImpl.mEnableNewListener;
    }

    public static /* synthetic */ void access$400(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7508bee", new Object[]{foldDeviceAndPadServiceImpl});
        } else {
            foldDeviceAndPadServiceImpl.registerScreenChangedListener();
        }
    }

    public static /* synthetic */ IDxItemRenderService access$500(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDxItemRenderService) ipChange.ipc$dispatch("cb941a14", new Object[]{foldDeviceAndPadServiceImpl});
        }
        return foldDeviceAndPadServiceImpl.mDxRenderService;
    }

    public static /* synthetic */ boolean access$600(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("580cd530", new Object[]{foldDeviceAndPadServiceImpl})).booleanValue();
        }
        return foldDeviceAndPadServiceImpl.mIsHudDevice;
    }

    public static /* synthetic */ boolean access$700(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("206af9cf", new Object[]{foldDeviceAndPadServiceImpl})).booleanValue();
        }
        return foldDeviceAndPadServiceImpl.isLargeScreen();
    }

    public static /* synthetic */ Activity access$800(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("3854c27e", new Object[]{foldDeviceAndPadServiceImpl});
        }
        return foldDeviceAndPadServiceImpl.getActivityContext();
    }

    public static /* synthetic */ void access$900(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ccc94df", new Object[]{foldDeviceAndPadServiceImpl, context});
        } else {
            foldDeviceAndPadServiceImpl.registerGestureDetectorCallback(context);
        }
    }

    private IContainerService.a createUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerService.a) ipChange.ipc$dispatch("c4ddacd6", new Object[]{this});
        }
        return new c();
    }

    private boolean enableInfoFlowScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b9831f6", new Object[]{this})).booleanValue();
        }
        IHostService iHostService = this.mHostService;
        if (iHostService == null) {
            return getScaleOrange();
        }
        n7c d2 = iHostService.getInvokeCallback().d();
        if (d2 == null) {
            return getScaleOrange();
        }
        return d2.m();
    }

    private boolean enableNewScreenChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a8b3ed8", new Object[]{this})).booleanValue();
        }
        return mve.a(ORANGE_KEY_ENABLE_NEW_SCREEN_CHANGE_LISTENER, true);
    }

    private Activity getActivityContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("b26b5e57", new Object[]{this});
        }
        Context context = this.mActivityContext;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || !activity.isDestroyed()) {
            return activity;
        }
        fve.e(TAG, "activity is destroyed");
        Activity hostActivity = getHostActivity();
        if (hostActivity == null) {
            return activity;
        }
        fve.e(TAG, "获取到host activity");
        return hostActivity;
    }

    private JSONObject getColumnConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("98f9155", new Object[]{this});
        }
        JSONObject jSONObject = this.mColumnConfig;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject parseObject = JSON.parseObject(getServerColumnConfig());
            this.mColumnConfig = parseObject;
            return parseObject;
        } catch (Exception unused) {
            fve.e(TAG, "parse config error");
            return null;
        }
    }

    private Activity getHostActivity() {
        u5d j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("be0669d4", new Object[]{this});
        }
        IHostService iHostService = this.mHostService;
        if (iHostService == null || (j = iHostService.getInvokeCallback().j()) == null) {
            return null;
        }
        Context f2 = j.f();
        if (f2 instanceof Activity) {
            return (Activity) f2;
        }
        return null;
    }

    private int getScaleColumnByScreenType() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c3633a1", new Object[]{this})).intValue();
        }
        Activity activityContext = getActivityContext();
        int i2 = 2;
        if (activityContext == null) {
            return 2;
        }
        WindowType M = TBAutoSizeConfig.x().M(activityContext);
        dji.c p = dji.c.p(activityContext);
        if (gj7.a() && !gj7.c(activityContext)) {
            return p.o();
        }
        int i3 = g.$SwitchMap$com$taobao$android$autosize$WindowType[M.ordinal()];
        if (i3 == 1) {
            i = p.t();
        } else if (i3 == 2) {
            i = p.v();
        } else if (i3 == 3) {
            i = p.s();
        } else if (i3 == 4) {
            i = p.q();
        } else if (i3 != 5) {
            i = 2;
        } else {
            i = p.r();
        }
        if (i >= 2) {
            i2 = i;
        }
        fve.e(TAG, "getScaleColumnByScreenType: " + i2);
        return i2;
    }

    private boolean getScaleOrange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d54066d", new Object[]{this})).booleanValue();
        }
        return f4b.b("enableHudDeviceInfoFlowZoom", true);
    }

    private String getServerColumnConfig() {
        IContainerDataModel containerData;
        IContainerInnerDataModel base;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17857088", new Object[]{this});
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService == null || (containerData = iContainerDataService.getContainerData()) == null || (base = containerData.getBase()) == null || (ext = base.getExt()) == null) {
            return DEFAULT_COLUMN_CONFIG;
        }
        String string = ext.getString(KEY_COLUMN_CONFIG);
        return TextUtils.isEmpty(string) ? DEFAULT_COLUMN_CONFIG : string;
    }

    private boolean isAdaptHudScreenInternal() {
        IContainerDataService<?> iContainerDataService;
        IContainerDataModel containerData;
        IContainerInnerDataModel base;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6e4e373", new Object[]{this})).booleanValue();
        }
        if (!isLargeScreen() || (iContainerDataService = this.mContainerDataService) == null || (containerData = iContainerDataService.getContainerData()) == null || (base = containerData.getBase()) == null || (ext = base.getExt()) == null) {
            return false;
        }
        boolean booleanValue = ext.getBooleanValue(IS_HUD_SCREEN);
        fve.e(TAG, "isHudScreen: " + booleanValue);
        return booleanValue;
    }

    private boolean isLargeScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("174baa08", new Object[]{this})).booleanValue();
        }
        if (gj7.e() || (gj7.a() && !gj7.c(getActivityContext()))) {
            return true;
        }
        return false;
    }

    private void onScreenChangedInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3258c06d", new Object[]{this});
            return;
        }
        boolean c2 = gj7.c(getActivityContext());
        if (!this.mScreenChangeLifeCycle.isEmpty()) {
            for (IFoldDeviceAndPadService.a aVar : this.mScreenChangeLifeCycle) {
                aVar.onScreenChanged(c2, isAdaptHudScreen());
            }
        }
        if (this.mIsScreenPortrait != c2) {
            this.mIsScreenPortrait = c2;
            if (gj7.e()) {
                triggerUiRefresh();
                fve.e(TAG, "trigger pad ui refresh");
            }
            if (gj7.a()) {
                triggerUiRefresh();
                triggerPullRefreshRequest();
                fve.e(TAG, "trigger fold phone data refresh");
            }
        } else {
            triggerUiRefresh();
        }
        fve.e(TAG, "onScreenChange:  isPortrait: " + c2);
    }

    private void registerContainerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2d6b79", new Object[]{this});
            return;
        }
        IContainerService<?> iContainerService = this.mContainerService;
        if (iContainerService != null) {
            b bVar = new b();
            this.mContainerListener = bVar;
            iContainerService.addOnContainerListener(bVar);
        }
    }

    private void registerDeviceInfoParamsCreator(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2703109a", new Object[]{this, cfcVar});
        } else if (this.mContainerDataService != null) {
            ki7 ki7Var = new ki7(cfcVar);
            this.mParamsCreator = ki7Var;
            this.mContainerDataService.addRequestCommonBizParamsCreator(ki7Var);
        }
    }

    private void registerGestureDetectorCallback(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758d3750", new Object[]{this, context});
        } else if (this.mFeedsViewService != null && this.mIsHudDevice && (context instanceof Activity)) {
            dji djiVar = new dji((Activity) context);
            this.mScaleGestureDetector = djiVar;
            djiVar.o(new d());
            this.mScaleGestureDetector.r(new e());
            this.mFeedsViewService.setGestureDetectorCallback(new f());
            fve.e(TAG, "register scale gesture detector");
        }
    }

    private void registerScreenChangedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad36ea0", new Object[]{this});
        } else if (this.mIsHudDevice) {
            Activity activityContext = getActivityContext();
            if (!this.mEnableNewListener || activityContext == null) {
                TBAutoSizeConfig.x().d0(this);
                return;
            }
            this.mOnWindowChangeListener = new a();
            TBAutoSizeConfig.x().e0(activityContext, this.mOnWindowChangeListener);
        }
    }

    private void registerUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb2e39f", new Object[]{this});
            return;
        }
        IContainerService.a createUiRefreshListener = createUiRefreshListener();
        this.mUiRefreshListener = createUiRefreshListener;
        this.mContainerService.addUiRefreshListener(createUiRefreshListener);
    }

    private void triggerPullRefreshRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf490b8", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("strategy", (Object) "cancelOther");
            String containerId = this.mInfoFlowContext.getContainerType().getContainerId();
            if (ao4.a(containerId)) {
                jSONObject.put("forceRequest", (Object) "true");
                jSONObject.put("containerId", (Object) containerId);
                iContainerDataService.triggerEvent("PageEnter", jSONObject);
            } else {
                iContainerDataService.triggerEvent("PullToRefresh", jSONObject);
            }
            fve.e(TAG, "trigger pull refresh request");
        }
    }

    private void unRegisterContainerListener() {
        iqb.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c61f60", new Object[]{this});
            return;
        }
        IContainerService<?> iContainerService = this.mContainerService;
        if (iContainerService != null && (aVar = this.mContainerListener) != null) {
            iContainerService.removeOnContainerListener(aVar);
        }
    }

    private void unRegisterGestureDetectorCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e40c961f", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mFeedsViewService;
        if (iMainFeedsViewService != null) {
            iMainFeedsViewService.setGestureDetectorCallback(null);
        }
        dji djiVar = this.mScaleGestureDetector;
        if (djiVar != null) {
            djiVar.j();
        }
    }

    private void unRegisterScreenChangedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5491d707", new Object[]{this});
        } else if (this.mIsHudDevice) {
            Activity activityContext = getActivityContext();
            if (!this.mEnableNewListener || this.mOnWindowChangeListener == null || activityContext == null) {
                TBAutoSizeConfig.x().h0(this);
            } else {
                TBAutoSizeConfig.x().i0(activityContext, this.mOnWindowChangeListener);
            }
        }
    }

    private void unRegisterUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b9786", new Object[]{this});
            return;
        }
        IContainerService.a aVar = this.mUiRefreshListener;
        if (aVar != null) {
            this.mContainerService.removeUiRefreshListener(aVar);
        }
    }

    private void unregisterDeviceInfoParamsCreator() {
        ki7 ki7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8300ebad", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService != null && (ki7Var = this.mParamsCreator) != null) {
            iContainerDataService.removeRequestCommonBizParamsCreator(ki7Var);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService
    public void addOnScreenChangeListener(IFoldDeviceAndPadService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("993df50f", new Object[]{this, aVar});
        } else {
            this.mScreenChangeLifeCycle.add(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService
    public int getInfoFlowAdaptiveColumn(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b72c8356", new Object[]{this, context})).intValue();
        }
        if (!isAdaptHudScreen()) {
            return 2;
        }
        if (gj7.a() && gj7.c(getActivityContext())) {
            return 2;
        }
        if (this.mEnableInfoFlowScale) {
            return getScaleColumnByScreenType();
        }
        return getColumnByScreenType();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService
    public boolean isAdaptHudScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11522a16", new Object[]{this})).booleanValue();
        }
        IHostService iHostService = this.mHostService;
        if (iHostService == null) {
            return isAdaptHudScreenInternal();
        }
        n7c d2 = iHostService.getInvokeCallback().d();
        if (d2 == null) {
            return isAdaptHudScreenInternal();
        }
        return d2.isAdaptHudScreen();
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
        guk.a(this, activity, i, configuration);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        this.mContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        if (!gj7.a() && !gj7.e()) {
            z = false;
        }
        this.mIsHudDevice = z;
        this.mContainerService = (IContainerService) cfcVar.a(IContainerService.class);
        this.mHostService = (IHostService) cfcVar.a(IHostService.class);
        this.mFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.mDxRenderService = (IDxItemRenderService) cfcVar.a(IDxItemRenderService.class);
        this.mEnableNewListener = enableNewScreenChangeListener();
        registerDeviceInfoParamsCreator(cfcVar);
        if (!this.mEnableNewListener) {
            registerScreenChangedListener();
        }
        registerUiRefreshListener();
        registerContainerListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unregisterDeviceInfoParamsCreator();
        unRegisterScreenChangedListener();
        unRegisterUiRefreshListener();
        unRegisterContainerListener();
        unRegisterGestureDetectorCallback();
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onScreenChanged(int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
        } else if (this.mIsHudDevice) {
            onScreenChangedInternal();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService
    public void removeOnScreenChangeListener(IFoldDeviceAndPadService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5898a9cc", new Object[]{this, aVar});
        } else {
            this.mScreenChangeLifeCycle.remove(aVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements OnWindowChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.autosize.OnWindowChangedListener
        public void a(OnWindowChangedListener.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6c2a252", new Object[]{this, aVar});
            } else if (aVar != null) {
                fve.e(FoldDeviceAndPadServiceImpl.TAG, "onWindowChange: " + aVar);
                int i = aVar.f6410a;
                if ((2 & i) != 0 || (i & 1) != 0) {
                    fve.e(FoldDeviceAndPadServiceImpl.TAG, "screen change");
                    FoldDeviceAndPadServiceImpl.access$000(FoldDeviceAndPadServiceImpl.this);
                }
            }
        }
    }

    private int getColumnByScreenType() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d2bf5e3", new Object[]{this})).intValue();
        }
        Activity activityContext = getActivityContext();
        int i2 = 2;
        if (activityContext == null) {
            return 2;
        }
        WindowType M = TBAutoSizeConfig.x().M(activityContext);
        JSONObject columnConfig = getColumnConfig();
        if (columnConfig == null) {
            return 2;
        }
        int i3 = g.$SwitchMap$com$taobao$android$autosize$WindowType[M.ordinal()];
        if (i3 == 1) {
            i = columnConfig.getIntValue("min");
        } else if (i3 == 2) {
            i = columnConfig.getIntValue("small");
        } else if (i3 == 3) {
            i = columnConfig.getIntValue("medium");
        } else if (i3 != 4) {
            i = i3 != 5 ? 2 : columnConfig.getIntValue("max");
        } else {
            i = columnConfig.getIntValue("large");
        }
        if (i >= 2) {
            i2 = i;
        }
        fve.e(TAG, "getColumnByScreenType: " + i2);
        return i2;
    }

    private void resetMainFeedsStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b1e86b", new Object[]{this});
            return;
        }
        mue.d();
        IDxItemRenderService iDxItemRenderService = this.mDxRenderService;
        if (iDxItemRenderService != null) {
            iDxItemRenderService.setDxEngineDesignScaleEnable(false, false);
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mFeedsViewService;
        if (iMainFeedsViewService != null) {
            iMainFeedsViewService.setInfoFlowColumn(2);
        }
        fve.e(TAG, "resetMainFeedsStyle");
    }

    private void setMainFeedsHudScreenStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f430106f", new Object[]{this});
            return;
        }
        mue.d();
        IDxItemRenderService iDxItemRenderService = this.mDxRenderService;
        if (iDxItemRenderService != null) {
            iDxItemRenderService.setDxEngineDesignScaleEnable(true, isLargeScreen());
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mFeedsViewService;
        if (iMainFeedsViewService != null) {
            iMainFeedsViewService.setInfoFlowColumn(getInfoFlowAdaptiveColumn(Globals.getApplication()));
        }
        fve.e(TAG, "setMainFeedsHudScreenStyle");
    }

    private void triggerUiRefresh() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36c8bd6", new Object[]{this});
            return;
        }
        mue.d();
        if (this.mDxRenderService != null) {
            boolean isAdaptHudScreen = isAdaptHudScreen();
            IDxItemRenderService iDxItemRenderService = this.mDxRenderService;
            if (!isAdaptHudScreen || !isLargeScreen()) {
                z = false;
            }
            iDxItemRenderService.setDxEngineDesignScaleEnable(isAdaptHudScreen, z);
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mFeedsViewService;
        if (iMainFeedsViewService != null) {
            int[] visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange();
            int i = (visiblePositionRange == null || visiblePositionRange.length <= 0) ? -1 : visiblePositionRange[0];
            this.mFeedsViewService.setInfoFlowColumn(getInfoFlowAdaptiveColumn(Globals.getApplication()));
            this.mFeedsViewService.reloadUi();
            if (i > 0) {
                this.mFeedsViewService.scrollToPosition(i);
            }
        }
        fve.e(TAG, "trigger ui refresh");
    }
}
