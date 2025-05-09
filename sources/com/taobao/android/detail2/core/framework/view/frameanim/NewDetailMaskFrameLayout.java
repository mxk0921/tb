package com.taobao.android.detail2.core.framework.view.frameanim;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.binder.BitmapBinder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import tb.aqz;
import tb.bew;
import tb.bx0;
import tb.ja7;
import tb.l5i;
import tb.mhq;
import tb.nz0;
import tb.qp0;
import tb.t2o;
import tb.tpz;
import tb.vxj;
import tb.xoz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NewDetailMaskFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CHECK_ACTIVITY_TIME = 800;
    public static final int DEFAULT_AUTO_ADAPTER_ANIM_DURATION_SPEED = 1;
    public static final int DEFAULT_AUTO_DEVICE_DURATION_MULTIPLIER = -2;
    public static final int DEFAULT_FRAME_SPEED_AVG_CHECK_COUNT = 3;
    public static final int DEFAULT_MASK_AUTO_ADAPTER_ANIM_DURATION_MAX_VALUE = 460;
    public static final int DEFAULT_MASK_AUTO_ADAPTER_MIN_FRAME_TIME = 17;
    public static final int DEFAULT_VALUE_MASK_FRAME_ANIM_DURATION = 280;
    public static final String KEY_EXTRA_AUTO_ADAPTER_SPEED = "extraAutoAdapterSpeed";
    public static final String KEY_EXTRA_PRE_BOTTOM_BAR_COLOR = "extraPreBottomBarColor";
    public static int sFrameSpeedAvgCheckCount;
    public static long sFrameSpeedAvgDuration;
    public static long sFrameSpeedCheckStartTime;
    public static long sFrameSpeedLastTokenTime;
    private Activity mActivity;
    private Bundle mActivityBundle;
    public tpz mAnimCardInfo;
    public WeakReference<Bitmap> mCardBitmapRef;
    private Context mContext;
    private boolean mDetachedFromWindow;
    public int mDeviceScore;
    public int mFrozenCountDown;
    public int mFrozenLayoutCount;
    public int mFrozenOutLayoutCount;
    private Handler mHandler;
    public boolean mHasCatchException;
    private boolean mHasConvertActivityFromTranslucent;
    private boolean mHasConvertActivityToTranslucent;
    public boolean mHasFrozenOuterSuccessLayout;
    public boolean mHasSetMaskViewFullAlpha;
    public boolean mHasSetRootViewFullAlpha;
    public boolean mHasSetScaleImageViewZeroAlpha;
    public float mImageViewScreenStartX;
    public float mImageViewScreenStartY;
    public float mImageViewStartHeight;
    public float mImageViewStartLeftMargin;
    public float mImageViewStartTopMargin;
    public float mImageViewStartWidth;
    private boolean mIsDestroy;
    private View mItemWhiteHolderView;
    private ImageView mMainViewHolderIv;
    public View mMaskView;
    public FrameLayout mParentFrameLayout;
    public ImageView mScaleImageView;
    public View mScaleWhiteBgView;
    public int mScreenHeight;
    public int mScreenWidth;
    private boolean mSupportScaleWhiteBgView;
    private aqz mTRNAnimParams;
    public vxj mNewDetailMaskFrameLayoutContext = new vxj();
    public boolean mHasShowAnim = false;
    public boolean mHasSetBottomBarColor = false;
    private int mCurrentPageBottomBarColor = -1;
    public float mRootLayoutRealStartPreProcess = -1.0f;
    public float mRootLayoutRealStartProcess = -1.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7165a;

        public a(int i) {
            this.f7165a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!NewDetailMaskFrameLayout.this.isDestroy()) {
                NewDetailMaskFrameLayout.this.checkAndTryConvertActivityFromTranslucent();
                NewDetailMaskFrameLayout.this.checkAndTryProcessDelayTask();
                NewDetailMaskFrameLayout newDetailMaskFrameLayout = NewDetailMaskFrameLayout.this;
                newDetailMaskFrameLayout.mNewDetailMaskFrameLayoutContext.f = false;
                try {
                    newDetailMaskFrameLayout.resumeNoneCoreLayout();
                    NewDetailMaskFrameLayout.this.resumeOuterNoneCoreLayout();
                } catch (Throwable th) {
                    l5i l5iVar = NewDetailMaskFrameLayout.this.mNewDetailMaskFrameLayoutContext.j;
                    String n = l5iVar.n();
                    l5iVar.b(n, "resumeLayout with error. currentCheckActivityTime = " + this.f7165a, th);
                }
                if (NewDetailMaskFrameLayout.access$000(NewDetailMaskFrameLayout.this)) {
                    NewDetailMaskFrameLayout.this.autoCheckAnimEndStatusForV2();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Choreographer.FrameCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f7166a;
        public final /* synthetic */ long b;

        public b(long j, long j2) {
            this.f7166a = j;
            this.b = j2;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
            } else if (this.f7166a == NewDetailMaskFrameLayout.sFrameSpeedLastTokenTime) {
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = currentTimeMillis - NewDetailMaskFrameLayout.sFrameSpeedCheckStartTime;
                long j3 = this.b;
                if (j2 > j3) {
                    j2 = j3;
                }
                NewDetailMaskFrameLayout.sFrameSpeedCheckStartTime = currentTimeMillis;
                if (j2 > 16) {
                    long j4 = NewDetailMaskFrameLayout.sFrameSpeedAvgDuration;
                    if (j4 != 0) {
                        j2 = (j4 + j2) / 2;
                    }
                    NewDetailMaskFrameLayout.sFrameSpeedAvgDuration = j2;
                }
                int i = NewDetailMaskFrameLayout.sFrameSpeedAvgCheckCount - 1;
                NewDetailMaskFrameLayout.sFrameSpeedAvgCheckCount = i;
                if (i > 0) {
                    Choreographer.getInstance().postFrameCallback(this);
                }
            }
        }
    }

    static {
        t2o.a(352322010);
    }

    public NewDetailMaskFrameLayout(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ boolean access$000(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef7876d9", new Object[]{newDetailMaskFrameLayout})).booleanValue();
        }
        return newDetailMaskFrameLayout.isV2Version();
    }

    private void createItemWhiteHolderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a487852", new Object[]{this});
            return;
        }
        View view = new View(this.mContext);
        this.mItemWhiteHolderView = view;
        view.setBackgroundColor(-1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.mImageViewStartWidth, (int) this.mImageViewStartHeight);
        layoutParams.gravity = 51;
        layoutParams.leftMargin = (int) this.mImageViewScreenStartX;
        layoutParams.topMargin = (int) this.mImageViewScreenStartY;
        this.mParentFrameLayout.addView(this.mItemWhiteHolderView, 0, layoutParams);
    }

    private void createMaskView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28adfed4", new Object[]{this});
        } else if (this.mActivity != null && this.mContext != null && this.mParentFrameLayout != null && this.mNewDetailMaskFrameLayoutContext.j.C()) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            View view = new View(this.mContext);
            this.mMaskView = view;
            view.setBackgroundColor(Color.parseColor("#80000000"));
            this.mMaskView.setLayoutParams(layoutParams);
            this.mMaskView.setAlpha(0.001f);
            this.mParentFrameLayout.addView(this.mMaskView, 0);
        }
    }

    public static boolean degradeToOldTransition(Activity activity, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af3c8188", new Object[]{activity, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        activity.overridePendingTransition(i, i2);
        return true;
    }

    private void directProcessDelayTask() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26025989", new Object[]{this});
            return;
        }
        vxj vxjVar = this.mNewDetailMaskFrameLayoutContext;
        if (!vxjVar.b) {
            vxjVar.b = true;
            ArrayList<ja7> arrayList = vxjVar.f30315a;
            vxjVar.f30315a = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                this.mNewDetailMaskFrameLayoutContext.c = arrayList.size();
                this.mNewDetailMaskFrameLayoutContext.d = System.currentTimeMillis();
                Iterator<ja7> it = arrayList.iterator();
                while (it.hasNext()) {
                    ja7 next = it.next();
                    i++;
                    this.mHandler.postDelayed(next, i + next.a());
                }
            }
        }
    }

    public static int getAdapterSpeedFromIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd85776b", new Object[]{intent})).intValue();
        }
        if (intent == null) {
            return -1;
        }
        return intent.getIntExtra("extraAutoAdapterSpeed", -1);
    }

    public static int getAndSetFromPageBottomBarColor(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dda0417c", new Object[]{context, intent})).intValue();
        }
        if (intent == null || context == null) {
            return -1;
        }
        int bottomBarColor = getBottomBarColor(context);
        setFromPageBottomBarColor(bottomBarColor, intent);
        return bottomBarColor;
    }

    public static int getBottomBarColor(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b59b4363", new Object[]{context})).intValue();
        }
        Activity realActivity = getRealActivity(context);
        if (realActivity != null) {
            return realActivity.getWindow().getNavigationBarColor();
        }
        return -1;
    }

    public static int getDeviceScore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e89be20", new Object[0])).intValue();
        }
        int c = (int) qp0.c();
        if (c < 0 || c > 100) {
            return 80;
        }
        return c;
    }

    private StringBuilder getErrorMsgStringBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("3f992ddd", new Object[]{this});
        }
        return this.mNewDetailMaskFrameLayoutContext.h();
    }

    public static Activity getRealActivity(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("f2c7faaa", new Object[]{context});
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof bew)) {
            return null;
        }
        Context b2 = ((bew) context).b();
        if (b2 instanceof Activity) {
            return (Activity) b2;
        }
        return null;
    }

    public static int getScreenHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenWidth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        }
    }

    private void initActivityAndAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3893b8ad", new Object[]{this});
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.mHandler = handler;
        this.mNewDetailMaskFrameLayoutContext.i = handler;
        Context context = getContext();
        this.mContext = context;
        this.mActivity = getRealActivity(context);
    }

    private void initScreenSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a289c4", new Object[]{this});
            return;
        }
        this.mScreenWidth = getScreenWidth(this.mContext);
        this.mScreenHeight = getScreenHeight(this.mContext);
    }

    public static /* synthetic */ Object ipc$super(NewDetailMaskFrameLayout newDetailMaskFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/frameanim/NewDetailMaskFrameLayout");
    }

    private boolean isV1Version() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("770f1ade", new Object[]{this})).booleanValue();
        }
        if (this.mNewDetailMaskFrameLayoutContext.j.r() == 101) {
            return true;
        }
        return false;
    }

    private boolean isV2Version() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ec0c03d", new Object[]{this})).booleanValue();
        }
        if (this.mNewDetailMaskFrameLayoutContext.j.r() == 201) {
            return true;
        }
        return false;
    }

    private void saveCurrentBottomBarColor(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b499090", new Object[]{this, activity});
        } else if (this.mNewDetailMaskFrameLayoutContext.j.x()) {
            this.mCurrentPageBottomBarColor = getBottomBarColor(activity);
        }
    }

    public static void setAdapterSpeedAndStartCheckStatus(int i, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd18804", new Object[]{new Integer(i), intent});
        } else if (i > 0 && intent != null) {
            intent.putExtra("extraAutoAdapterSpeed", i);
            startCheckCurrentDeviceStatus(3);
        }
    }

    private static void setBottomBarColor(Activity activity, int i, boolean z) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf15c67", new Object[]{activity, new Integer(i), new Boolean(z)});
        } else if (activity != null) {
            if ((z || i >= 0) && (window = activity.getWindow()) != null) {
                window.setNavigationBarColor(i);
            }
        }
    }

    private void setBottomBarColorAsPrePage(Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c097f3c", new Object[]{this, activity});
        } else if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                int intExtra = intent.getIntExtra("extraPreBottomBarColor", -1);
                if (this.mNewDetailMaskFrameLayoutContext.j.F() || intExtra >= 0) {
                    setBottomBarColor(activity, intExtra, this.mNewDetailMaskFrameLayoutContext.j.F());
                }
            } catch (Throwable th) {
                l5i l5iVar = this.mNewDetailMaskFrameLayoutContext.j;
                l5iVar.b(l5iVar.n(), "未知异常。 BottomBarColor 处理失败。Pre 。", th);
            }
        }
    }

    public static void setFromPageBottomBarColor(int i, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91853fc3", new Object[]{new Integer(i), intent});
        } else if (i >= 0 && intent != null) {
            intent.putExtra("extraPreBottomBarColor", i);
        }
    }

    public static void startCheckCurrentDeviceStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2581e1", new Object[]{new Integer(i)});
            return;
        }
        sFrameSpeedAvgCheckCount = i;
        long min = Math.min((sFrameSpeedAvgDuration / 2) + 70, 120L);
        sFrameSpeedAvgDuration = 0L;
        long currentTimeMillis = System.currentTimeMillis();
        sFrameSpeedCheckStartTime = currentTimeMillis;
        sFrameSpeedLastTokenTime = currentTimeMillis;
        Choreographer.getInstance().postFrameCallback(new b(currentTimeMillis, min));
    }

    public boolean animItemIsRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb108cdc", new Object[]{this})).booleanValue();
        }
        Intent intent = this.mActivity.getIntent();
        if (intent == null) {
            return false;
        }
        return intent.getBooleanExtra(bx0.PARAMS_KEY_ANIM_ITEM_IS_RUNNING, false);
    }

    public void autoCheckAnimEndStatusForV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7e1ce9", new Object[]{this});
            return;
        }
        ImageView imageView = this.mMainViewHolderIv;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void bindItemCardMainView(View view) {
        Drawable g;
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3142ed", new Object[]{this, view});
        } else if (this.mNewDetailMaskFrameLayoutContext.f() && view != null && (g = bx0.g(view.getContext())) != null) {
            if (view instanceof ImageView) {
                imageView = (ImageView) view;
            } else {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.mImageViewStartWidth, (int) this.mImageViewStartHeight);
                layoutParams.gravity = 51;
                layoutParams.leftMargin = (int) this.mImageViewScreenStartX;
                layoutParams.topMargin = (int) this.mImageViewScreenStartY;
                ImageView imageView2 = new ImageView(view.getContext());
                imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                float floatExtra = this.mActivity.getIntent().getFloatExtra(bx0.PARAMS_KEY_ANIM_MAIN_IMAGE_VIEW_HEIGHT, -1.0f);
                if (floatExtra > 0.0f) {
                    layoutParams.height = (int) floatExtra;
                    l5i maskHandler = getMaskHandler();
                    String logTag = getLogTag();
                    maskHandler.a(logTag, "anim_main_image_view_height = " + floatExtra);
                }
                imageView2.setLayoutParams(layoutParams);
                imageView = imageView2;
            }
            this.mMainViewHolderIv = imageView;
            imageView.setImageDrawable(g);
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).addView(imageView, 0);
            }
        }
    }

    public void checkAndTryConvertActivityFromTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c0dc0", new Object[]{this});
        } else if (!isDestroy()) {
            tryConvertActivityFromTranslucent();
        }
    }

    public void checkAndTryProcessDelayTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41765ac", new Object[]{this});
            return;
        }
        try {
            directProcessDelayTask();
        } catch (Throwable th) {
            this.mNewDetailMaskFrameLayoutContext.j.b(this.mNewDetailMaskFrameLayoutContext.j.n(), "新转场完成后，非核心任务恢复出错。", th);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.mIsDestroy = true;
        }
    }

    public void frozenNoneCoreLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c8bc8", new Object[]{this});
        } else if (this.mNewDetailMaskFrameLayoutContext.j.e()) {
            l5i l5iVar = this.mNewDetailMaskFrameLayoutContext.j;
            l5iVar.a(l5iVar.n(), "FrozenUI:hasSkipFrozenFeature");
        } else if (!this.mNewDetailMaskFrameLayoutContext.j.d()) {
            this.mFrozenLayoutCount++;
            RecyclerView recyclerView = this.mNewDetailMaskFrameLayoutContext.h;
            if (recyclerView != null && !recyclerView.isLayoutFrozen()) {
                this.mNewDetailMaskFrameLayoutContext.h.setLayoutFrozen(true);
            }
        }
    }

    public void frozenOuterNoneCoreLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6977ca23", new Object[]{this});
        } else if (this.mNewDetailMaskFrameLayoutContext.j.e()) {
            l5i l5iVar = this.mNewDetailMaskFrameLayoutContext.j;
            l5iVar.a(l5iVar.n(), "FrozenUI:hasSkipOuterFrozenFeature");
        } else if (!this.mNewDetailMaskFrameLayoutContext.j.d()) {
            this.mFrozenOutLayoutCount++;
            this.mNewDetailMaskFrameLayoutContext.j.y();
        }
    }

    public Activity getCurrentActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
        }
        if (this.mActivity == null) {
            this.mActivity = getRealActivity(getContext());
        }
        return this.mActivity;
    }

    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return this.mNewDetailMaskFrameLayoutContext.j.n();
    }

    public Handler getMainHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("590b0a64", new Object[]{this});
        }
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.getMainLooper());
        }
        return this.mHandler;
    }

    public l5i getMaskHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5i) ipChange.ipc$dispatch("31d2a6c6", new Object[]{this});
        }
        return this.mNewDetailMaskFrameLayoutContext.j;
    }

    public vxj getNewDetailMaskFrameLayoutContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vxj) ipChange.ipc$dispatch("b3d739c5", new Object[]{this});
        }
        return this.mNewDetailMaskFrameLayoutContext;
    }

    public boolean isDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b933fb", new Object[]{this})).booleanValue();
        }
        if (this.mDetachedFromWindow || this.mIsDestroy) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        tryConvertActivityFromTranslucent();
        super.onDetachedFromWindow();
        this.mDetachedFromWindow = true;
    }

    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
        } else {
            tryConvertActivityFromTranslucent();
        }
    }

    public boolean prepareActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bbe66c1", new Object[]{this})).booleanValue();
        }
        Context context = getContext();
        if (context instanceof Activity) {
            return prepareActivity((Activity) context);
        }
        return false;
    }

    public void resumeNoneCoreLayout() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef05d815", new Object[]{this});
        } else if (!this.mNewDetailMaskFrameLayoutContext.j.d() && (i = this.mFrozenLayoutCount) > 0) {
            this.mFrozenLayoutCount = i - 1;
            RecyclerView recyclerView = this.mNewDetailMaskFrameLayoutContext.h;
            if (recyclerView != null) {
                recyclerView.setLayoutFrozen(false);
            }
        }
    }

    public void resumeOuterNoneCoreLayout() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("401325f6", new Object[]{this});
        } else if (!this.mNewDetailMaskFrameLayoutContext.j.d() && (i = this.mFrozenOutLayoutCount) > 0) {
            this.mFrozenOutLayoutCount = i - 1;
            this.mNewDetailMaskFrameLayoutContext.j.z();
        }
    }

    public void setAnimParams(aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19423323", new Object[]{this, aqzVar});
        } else {
            this.mTRNAnimParams = aqzVar;
        }
    }

    public void setMaskFrameLayoutHandler(l5i l5iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a682d05f", new Object[]{this, l5iVar});
            return;
        }
        l5iVar.f23120a = this;
        this.mNewDetailMaskFrameLayoutContext.j = l5iVar;
    }

    public void setParentFrameLayout(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84474b35", new Object[]{this, frameLayout});
        } else {
            this.mParentFrameLayout = frameLayout;
        }
    }

    public void setSupportScaleWhiteBgView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93152757", new Object[]{this, new Boolean(z)});
        } else {
            this.mSupportScaleWhiteBgView = z;
        }
    }

    public boolean supportScaleWhiteBgView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e16df0e3", new Object[]{this})).booleanValue();
        }
        return this.mSupportScaleWhiteBgView;
    }

    public void tryConvertActivityFromTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc0ac2f", new Object[]{this});
        } else if (!this.mHasConvertActivityFromTranslucent && this.mHasConvertActivityToTranslucent) {
            nz0.a(getRealActivity(getContext()));
            this.mHasConvertActivityFromTranslucent = true;
        }
    }

    public void setCurrentBottomBarColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c83c79", new Object[]{this});
            return;
        }
        try {
            this.mHasSetBottomBarColor = true;
            if (this.mNewDetailMaskFrameLayoutContext.j.F()) {
                setBottomBarColor(this.mActivity, this.mCurrentPageBottomBarColor, true);
            } else {
                Activity activity = this.mActivity;
                int i = this.mCurrentPageBottomBarColor;
                if (i < 0) {
                    i = -16777216;
                }
                setBottomBarColor(activity, i, this.mNewDetailMaskFrameLayoutContext.j.F());
            }
        } catch (Throwable th) {
            l5i l5iVar = this.mNewDetailMaskFrameLayoutContext.j;
            l5iVar.b(l5iVar.n(), "未知异常。 BottomBarColor 处理失败。Current 。", th);
        }
    }

    public static boolean checkHasMaskFrameAnimParams(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("561f304b", new Object[]{bundle})).booleanValue();
        }
        return bundle != null && bundle.containsKey("view_screen_start_x") && bundle.containsKey("view_screen_start_y") && bundle.getFloat("view_height", -1.0f) > 0.0f && bundle.getFloat("view_width", -1.0f) > 0.0f;
    }

    private boolean createScaleImageView() {
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a38d0c1d", new Object[]{this})).booleanValue();
        }
        if (this.mActivity == null || this.mContext == null || this.mParentFrameLayout == null) {
            l5i l5iVar = this.mNewDetailMaskFrameLayoutContext.j;
            String n = l5iVar.n();
            l5iVar.a(n, "createScaleImageView 出错。mParentFrameLayout:" + this.mParentFrameLayout + " mActivity:" + this.mActivity + " mContext:" + this.mContext);
            StringBuilder errorMsgStringBuilder = getErrorMsgStringBuilder();
            errorMsgStringBuilder.append("|act:");
            errorMsgStringBuilder.append(this.mActivity == null);
            errorMsgStringBuilder.append("ctx:");
            errorMsgStringBuilder.append(this.mContext == null);
            errorMsgStringBuilder.append(":pfl");
            if (this.mParentFrameLayout != null) {
                z = false;
            }
            errorMsgStringBuilder.append(z);
            return false;
        }
        this.mScaleImageView = new ImageView(this.mContext);
        Bundle bundleExtra = this.mActivity.getIntent().getBundleExtra("nav_animation_extra");
        this.mActivityBundle = bundleExtra;
        if (bundleExtra == null) {
            l5i l5iVar2 = this.mNewDetailMaskFrameLayoutContext.j;
            l5iVar2.a(l5iVar2.n(), "createScaleImageView nav_animation_extra bundle is null.");
            getErrorMsgStringBuilder().append("|noActivityBundle");
            return false;
        }
        this.mImageViewScreenStartX = bundleExtra.getFloat("view_screen_start_x", -1.0f);
        this.mImageViewScreenStartY = this.mActivityBundle.getFloat("view_screen_start_y", -1.0f);
        this.mImageViewStartHeight = this.mActivityBundle.getFloat("view_height", -1.0f);
        float f = this.mActivityBundle.getFloat("view_width", -1.0f);
        this.mImageViewStartWidth = f;
        if (this.mImageViewStartHeight <= 0.0f || f <= 0.0f) {
            l5i l5iVar3 = this.mNewDetailMaskFrameLayoutContext.j;
            String n2 = l5iVar3.n();
            l5iVar3.a(n2, "error width or height ,abort anim .mImageViewStartHeight = " + this.mImageViewStartHeight + " mImageViewStartWidth =" + this.mImageViewStartWidth);
            StringBuilder errorMsgStringBuilder2 = getErrorMsgStringBuilder();
            errorMsgStringBuilder2.append("|height:");
            errorMsgStringBuilder2.append(this.mImageViewStartHeight <= 0.0f);
            errorMsgStringBuilder2.append("width:");
            if (this.mImageViewStartWidth > 0.0f) {
                z = false;
            }
            errorMsgStringBuilder2.append(z);
            return false;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.mImageViewStartWidth, (int) this.mImageViewStartHeight);
        layoutParams.gravity = 51;
        int i = (int) this.mImageViewScreenStartX;
        layoutParams.leftMargin = i;
        int i2 = (int) this.mImageViewScreenStartY;
        layoutParams.topMargin = i2;
        this.mImageViewStartLeftMargin = i;
        this.mImageViewStartTopMargin = i2;
        this.mParentFrameLayout.addView(this.mScaleImageView, layoutParams);
        IBinder binder = this.mActivityBundle.getBinder("view_screenshot");
        if (!(binder instanceof BitmapBinder)) {
            l5i l5iVar4 = this.mNewDetailMaskFrameLayoutContext.j;
            String n3 = l5iVar4.n();
            StringBuilder sb = new StringBuilder("view_screenshot iBinder class 类型不对。预期 BitmapBinder ，实际: ");
            if (binder == null) {
                str = "null";
            } else {
                str = binder.getClass().getCanonicalName();
            }
            sb.append(str);
            l5iVar4.a(n3, sb.toString());
            getErrorMsgStringBuilder().append("|iBinderIsNotBitmap");
            return false;
        }
        BitmapBinder bitmapBinder = (BitmapBinder) binder;
        if (bitmapBinder != null) {
            Bitmap bitmap = bitmapBinder.getBitmap();
            this.mCardBitmapRef = new WeakReference<>(bitmap);
            if (bitmap != null) {
                l5i l5iVar5 = this.mNewDetailMaskFrameLayoutContext.j;
                l5iVar5.a(l5iVar5.n(), "startProcessAnim bitmap is not null");
                this.mScaleImageView.setImageBitmap(bitmap);
            } else {
                l5i l5iVar6 = this.mNewDetailMaskFrameLayoutContext.j;
                l5iVar6.a(l5iVar6.n(), "异常:view_screenshot iBinder.getBitmap 为 null: ");
            }
        }
        return true;
    }

    private boolean initBasicScaleViewData() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a000ea06", new Object[]{this})).booleanValue();
        }
        Activity activity = this.mActivity;
        if (activity == null || this.mContext == null || this.mParentFrameLayout == null) {
            StringBuilder errorMsgStringBuilder = getErrorMsgStringBuilder();
            errorMsgStringBuilder.append("|ini:act:");
            errorMsgStringBuilder.append(this.mActivity == null);
            errorMsgStringBuilder.append("ctx:");
            errorMsgStringBuilder.append(this.mContext == null);
            errorMsgStringBuilder.append(":pfl");
            if (this.mParentFrameLayout != null) {
                z = false;
            }
            errorMsgStringBuilder.append(z);
            return false;
        }
        Bundle bundleExtra = activity.getIntent().getBundleExtra("nav_animation_extra");
        this.mActivityBundle = bundleExtra;
        if (bundleExtra == null) {
            l5i l5iVar = this.mNewDetailMaskFrameLayoutContext.j;
            l5iVar.a(l5iVar.n(), "createScaleImageView bundle is null.");
            getErrorMsgStringBuilder().append("|ini:noActivityBundle");
            return false;
        }
        this.mImageViewScreenStartX = bundleExtra.getFloat("view_screen_start_x", -1.0f);
        this.mImageViewScreenStartY = this.mActivityBundle.getFloat("view_screen_start_y", -1.0f);
        this.mImageViewStartHeight = this.mActivityBundle.getFloat("view_height", -1.0f);
        float f = this.mActivityBundle.getFloat("view_width", -1.0f);
        this.mImageViewStartWidth = f;
        if (this.mImageViewStartHeight <= 0.0f || f <= 0.0f) {
            l5i l5iVar2 = this.mNewDetailMaskFrameLayoutContext.j;
            String n = l5iVar2.n();
            l5iVar2.a(n, "error width or height ,abort anim .mImageViewStartHeight = " + this.mImageViewStartHeight + " mImageViewStartWidth =" + this.mImageViewStartWidth);
            StringBuilder errorMsgStringBuilder2 = getErrorMsgStringBuilder();
            errorMsgStringBuilder2.append("|ini:height:");
            errorMsgStringBuilder2.append(this.mImageViewStartHeight <= 0.0f);
            errorMsgStringBuilder2.append("width:");
            if (this.mImageViewStartWidth > 0.0f) {
                z = false;
            }
            errorMsgStringBuilder2.append(z);
            return false;
        }
        this.mImageViewStartLeftMargin = (int) this.mImageViewScreenStartX;
        this.mImageViewStartTopMargin = (int) this.mImageViewScreenStartY;
        return true;
    }

    public boolean initAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("579f8f4c", new Object[]{this})).booleanValue();
        }
        if (!this.mNewDetailMaskFrameLayoutContext.j.c()) {
            getErrorMsgStringBuilder().append("|NotEnableAnim");
            return false;
        }
        initActivityAndAlpha();
        Activity activity = this.mActivity;
        if (activity == null) {
            l5i l5iVar = this.mNewDetailMaskFrameLayoutContext.j;
            l5iVar.a(l5iVar.n(), "initAnim 出错。mActivity 为空。");
            checkAndTryProcessDelayTask();
            getErrorMsgStringBuilder().append("|ActivityIsNull");
            return false;
        } else if (!nz0.b(activity)) {
            checkAndTryProcessDelayTask();
            l5i l5iVar2 = this.mNewDetailMaskFrameLayoutContext.j;
            l5iVar2.a(l5iVar2.n(), "initAnim 出错。convertActivityToTranslucent 失败。");
            getErrorMsgStringBuilder().append("|ConvertActivityErr");
            return false;
        } else {
            int deviceScore = getDeviceScore();
            this.mDeviceScore = deviceScore;
            this.mHasConvertActivityToTranslucent = true;
            int i = ((100 - this.mDeviceScore) * (deviceScore > this.mNewDetailMaskFrameLayoutContext.j.o() ? 20 : 40)) + 800;
            this.mHandler.postDelayed(new a(i), i);
            this.mNewDetailMaskFrameLayoutContext.f = true;
            createMaskView();
            if (getMaskHandler().I()) {
                if (!createScaleImageView()) {
                    checkAndTryProcessDelayTask();
                    l5i l5iVar3 = this.mNewDetailMaskFrameLayoutContext.j;
                    l5iVar3.a(l5iVar3.n(), "initAnim 出错。createScaleImageView 失败。");
                    getErrorMsgStringBuilder().append("|CreateScaleErr");
                    return false;
                }
            } else if (!initBasicScaleViewData()) {
                checkAndTryProcessDelayTask();
                l5i l5iVar4 = this.mNewDetailMaskFrameLayoutContext.j;
                l5iVar4.a(l5iVar4.n(), "initAnim 出错。checkAndTryProcessDelayTask 失败。");
                getErrorMsgStringBuilder().append("|ini:CreateScaleErr");
                return false;
            }
            if (getMaskHandler().H()) {
                getMaskHandler().a(getLogTag(), "supportItemWhiteHolderView,will createItemWhiteHolderView.");
                createItemWhiteHolderView();
            }
            setAlpha(0.001f);
            initScreenSize();
            if (supportScaleWhiteBgView()) {
                xoz.d(this, this.mTRNAnimParams);
            } else {
                mhq.b(this);
            }
            saveCurrentBottomBarColor(this.mActivity);
            setBottomBarColorAsPrePage(this.mActivity);
            return true;
        }
    }

    public boolean prepareActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c3c8253", new Object[]{this, activity})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        activity.overridePendingTransition(0, 0);
        return true;
    }

    public NewDetailMaskFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public NewDetailMaskFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
