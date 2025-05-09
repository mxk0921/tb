package com.taobao.tao.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.StateSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.core.view.GestureDetectorCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.view.IconForegroundImageView;
import com.taobao.tao.util.TBSoundPlayer;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import java.util.Map;
import tb.cy0;
import tb.rpj;
import tb.s14;
import tb.sx7;
import tb.wpj;
import tb.y9a;
import tb.ypj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NavigationTabIndicatorView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG;
    private boolean mAttached;
    public long mClickTime;
    public Object mContentSelected;
    public Object mContentUnSelected;
    private int mForegroundViewDisplayMode;
    private final GestureDetectorCompat mGestureDetectorCompat;
    private View mIconForegroundView;
    public NavigationTabIconSourceType mIconSourceType;
    private TUrlImageView mIconView;
    public boolean mIsShowTitleSelected;
    public boolean mIsShowTitleUnSelected;
    public String mMessage;
    private TextView mMessageView;
    private Integer mMessageViewColor;
    public NavigationTabMsgMode mMode;
    private com.taobao.tao.navigation.b mNavigationTab;
    private ypj mNavigationTabListener;
    private boolean mRoundImage;
    private boolean mSelected;
    private Integer mSelectedColorFilter;
    public Drawable mSelectedDrawable;
    private boolean mShowTitle;
    public TBFragmentTabHost mTabHost;
    public int mTextColorSelected;
    public int mTextColorUnSelected;
    private String mTitle;
    private TextView mTitleView;
    public Drawable mUnSelectedDrawable;
    private Integer mUnselectedColorFilter;
    public e tabIndicatorViewAbilityCallback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBSoundPlayer.getInstance().playScene(1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                rpj.a("tab_click", NavigationTabIndicatorView.access$000(NavigationTabIndicatorView.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$tao$navigation$NavigationTabMsgMode;

        static {
            int[] iArr = new int[NavigationTabMsgMode.values().length];
            $SwitchMap$com$taobao$tao$navigation$NavigationTabMsgMode = iArr;
            try {
                iArr[NavigationTabMsgMode.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$tao$navigation$NavigationTabMsgMode[NavigationTabMsgMode.GUARDIAN_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$tao$navigation$NavigationTabMsgMode[NavigationTabMsgMode.RED_POINT_INDICATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$tao$navigation$NavigationTabMsgMode[NavigationTabMsgMode.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$tao$navigation$NavigationTabMsgMode[NavigationTabMsgMode.GUARDIAN_DEFAULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$tao$navigation$NavigationTabMsgMode[NavigationTabMsgMode.GUARDIAN_NUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$tao$navigation$NavigationTabMsgMode[NavigationTabMsgMode.NONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == 1575121015) {
                return new Boolean(super.onSingleTapUp((MotionEvent) objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/navigation/NavigationTabIndicatorView$GestureListener");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
            }
            NavigationTabIndicatorView navigationTabIndicatorView = NavigationTabIndicatorView.this;
            if (!(navigationTabIndicatorView.tabIndicatorViewAbilityCallback == null || NavigationTabIndicatorView.access$100(navigationTabIndicatorView) == null)) {
                NavigationTabIndicatorView navigationTabIndicatorView2 = NavigationTabIndicatorView.this;
                navigationTabIndicatorView2.tabIndicatorViewAbilityCallback.g(NavigationTabIndicatorView.access$100(navigationTabIndicatorView2));
            }
            if (NavigationTabIndicatorView.this.getSelected()) {
                if (NavigationTabIndicatorView.access$200(NavigationTabIndicatorView.this) != null) {
                    NavigationTabIndicatorView.access$200(NavigationTabIndicatorView.this).onCurrentTabDoubleTap();
                }
            } else if (NavigationTabIndicatorView.access$100(NavigationTabIndicatorView.this) != null) {
                NavigationTabIndicatorView navigationTabIndicatorView3 = NavigationTabIndicatorView.this;
                navigationTabIndicatorView3.onClickEvent(NavigationTabIndicatorView.access$100(navigationTabIndicatorView3));
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                return;
            }
            NavigationTabIndicatorView navigationTabIndicatorView = NavigationTabIndicatorView.this;
            if (!(navigationTabIndicatorView.tabIndicatorViewAbilityCallback == null || NavigationTabIndicatorView.access$100(navigationTabIndicatorView) == null)) {
                NavigationTabIndicatorView navigationTabIndicatorView2 = NavigationTabIndicatorView.this;
                navigationTabIndicatorView2.tabIndicatorViewAbilityCallback.b(NavigationTabIndicatorView.access$100(navigationTabIndicatorView2));
            }
            if (NavigationTabIndicatorView.access$200(NavigationTabIndicatorView.this) != null) {
                NavigationTabIndicatorView.access$200(NavigationTabIndicatorView.this).onCurrentTabLongClicked();
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
            }
            NavigationTabIndicatorView.this.mClickTime = SystemClock.uptimeMillis();
            NavigationTabIndicatorView navigationTabIndicatorView = NavigationTabIndicatorView.this;
            if (!(navigationTabIndicatorView.tabIndicatorViewAbilityCallback == null || NavigationTabIndicatorView.access$100(navigationTabIndicatorView) == null)) {
                NavigationTabIndicatorView navigationTabIndicatorView2 = NavigationTabIndicatorView.this;
                navigationTabIndicatorView2.tabIndicatorViewAbilityCallback.j(NavigationTabIndicatorView.access$100(navigationTabIndicatorView2));
            }
            if (NavigationTabIndicatorView.access$100(NavigationTabIndicatorView.this) != null) {
                NavigationTabIndicatorView navigationTabIndicatorView3 = NavigationTabIndicatorView.this;
                navigationTabIndicatorView3.onClickEvent(NavigationTabIndicatorView.access$100(navigationTabIndicatorView3));
            }
            if (wpj.h() || super.onSingleTapUp(motionEvent)) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
        void a(com.taobao.tao.navigation.b bVar, String str);

        void b(com.taobao.tao.navigation.b bVar);

        void c(com.taobao.tao.navigation.b bVar);

        void d(com.taobao.tao.navigation.b bVar);

        void e(com.taobao.tao.navigation.b bVar);

        void f(com.taobao.tao.navigation.b bVar);

        void g(com.taobao.tao.navigation.b bVar);

        void h(com.taobao.tao.navigation.b bVar);

        void i(com.taobao.tao.navigation.b bVar, String str);

        void j(com.taobao.tao.navigation.b bVar);
    }

    public NavigationTabIndicatorView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ String access$000(NavigationTabIndicatorView navigationTabIndicatorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22fa4828", new Object[]{navigationTabIndicatorView});
        }
        return navigationTabIndicatorView.mTitle;
    }

    public static /* synthetic */ com.taobao.tao.navigation.b access$100(NavigationTabIndicatorView navigationTabIndicatorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.navigation.b) ipChange.ipc$dispatch("18b82c64", new Object[]{navigationTabIndicatorView});
        }
        return navigationTabIndicatorView.mNavigationTab;
    }

    public static /* synthetic */ ypj access$200(NavigationTabIndicatorView navigationTabIndicatorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ypj) ipChange.ipc$dispatch("729c1f91", new Object[]{navigationTabIndicatorView});
        }
        return navigationTabIndicatorView.mNavigationTabListener;
    }

    private void clickEvent(com.taobao.tao.navigation.b bVar) {
        com.taobao.tao.navigation.b bVar2;
        com.taobao.tao.navigation.b bVar3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da133222", new Object[]{this, bVar});
        } else if (!getSelected()) {
            Coordinator.execute(new a());
            if (bVar != null && (getContext() instanceof Activity)) {
                e eVar = this.tabIndicatorViewAbilityCallback;
                if (!(eVar == null || (bVar3 = this.mNavigationTab) == null)) {
                    eVar.h(bVar3);
                }
                TBFragmentTabHost tBFragmentTabHost = this.mTabHost;
                if (tBFragmentTabHost != null) {
                    y9a.d(tBFragmentTabHost.getCurrentFragment(), y9a.CLICK_STAGE, this.mClickTime);
                }
            }
        } else {
            e eVar2 = this.tabIndicatorViewAbilityCallback;
            if (!(eVar2 == null || (bVar2 = this.mNavigationTab) == null)) {
                eVar2.e(bVar2);
            }
            ypj ypjVar = this.mNavigationTabListener;
            if (ypjVar != null) {
                ypjVar.onCurrentTabClicked();
            }
            View view = this.mIconForegroundView;
            if (view != null) {
                view.performClick();
            }
        }
    }

    private void ensureHierarchy(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cef7cea", new Object[]{this, context});
            return;
        }
        float f = getContext().getResources().getDisplayMetrics().density;
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        this.mIconView = tUrlImageView;
        int i = (int) (52.0f * f);
        tUrlImageView.setMinimumHeight(i);
        this.mIconView.setMinimumWidth(i);
        this.mIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        this.mIconView.setVisibility(0);
        layoutParams.gravity = 81;
        addView(this.mIconView, layoutParams);
        TextView textView = new TextView(context);
        this.mTitleView = textView;
        textView.setGravity(1);
        this.mTitleView.setTextColor(Color.parseColor("#444444"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        if (wpj.e()) {
            this.mTitleView.setTextSize(1, 11.0f);
            layoutParams2.bottomMargin = (int) (f * 3.0f);
        } else {
            this.mTitleView.setTextSize(1, 10.0f);
            layoutParams2.bottomMargin = (int) (f * 2.0f);
        }
        addView(this.mTitleView, layoutParams2);
        TextView textView2 = new TextView(context);
        this.mMessageView = textView2;
        textView2.setGravity(17);
        this.mMessageView.setTextColor(getResources().getColor(17170443));
        this.mMessageView.setTextSize(1, 11.0f);
        updateMessageViewVisibility(false);
        this.mMessageView.setSingleLine(true);
        this.mMessageView.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        addView(this.mMessageView, layoutParams3);
    }

    private Drawable getIconDrawable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("cd012d1a", new Object[]{this, new Boolean(z)});
        }
        NavigationTabIconSourceType navigationTabIconSourceType = this.mIconSourceType;
        if (navigationTabIconSourceType != NavigationTabIconSourceType.DRAWABLE || !(this.mContentSelected instanceof Integer) || !(this.mContentUnSelected instanceof Integer)) {
            if (navigationTabIconSourceType != NavigationTabIconSourceType.LOCALCACHEDDRAWABLE || this.mNavigationTab.t() == null || this.mNavigationTab.x() == null) {
                return null;
            }
            if (z) {
                return this.mNavigationTab.t();
            }
            return this.mNavigationTab.x();
        } else if (z) {
            return this.mSelectedDrawable;
        } else {
            return this.mUnSelectedDrawable;
        }
    }

    public static /* synthetic */ Object ipc$super(NavigationTabIndicatorView navigationTabIndicatorView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -349229044) {
            super.onConfigurationChanged((Configuration) objArr[0]);
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/navigation/NavigationTabIndicatorView");
        }
    }

    private void loadImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad861c", new Object[]{this});
        } else if (this.mIconSourceType != NavigationTabIconSourceType.DRAWABLE2 || this.mNavigationTab.t() == null || this.mNavigationTab.x() == null) {
            NavigationTabIconSourceType navigationTabIconSourceType = this.mIconSourceType;
            if (navigationTabIconSourceType == NavigationTabIconSourceType.DRAWABLE && (this.mContentSelected instanceof Integer) && (this.mContentUnSelected instanceof Integer)) {
                if (wpj.m(getContext())) {
                    this.mSelectedDrawable = sx7.a(getResources(), ((Integer) this.mContentSelected).intValue(), null);
                    this.mUnSelectedDrawable = sx7.a(getResources(), ((Integer) this.mContentUnSelected).intValue(), null);
                } else {
                    this.mSelectedDrawable = getResources().getDrawable(((Integer) this.mContentSelected).intValue());
                    this.mUnSelectedDrawable = getResources().getDrawable(((Integer) this.mContentUnSelected).intValue());
                }
                if (this.mRoundImage) {
                    makeRoundIcon();
                }
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842913}, this.mSelectedDrawable);
                stateListDrawable.addState(StateSet.WILD_CARD, this.mUnSelectedDrawable);
                this.mIconView.setBackgroundDrawable(stateListDrawable);
            } else if (navigationTabIconSourceType != NavigationTabIconSourceType.LOCALCACHEDDRAWABLE || this.mNavigationTab.t() == null || this.mNavigationTab.x() == null) {
                Log.e("NavTabIndicatorView", "Navigation icon type not write, please check!");
            } else {
                loadLocalImage();
            }
        } else {
            loadLocalImage();
        }
    }

    private void loadLocalImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a83377bd", new Object[]{this});
            return;
        }
        Drawable drawable = this.mSelectedDrawable;
        if (!(drawable instanceof cy0) || drawable != this.mNavigationTab.t() || this.mUnSelectedDrawable != this.mNavigationTab.x()) {
            this.mSelectedDrawable = this.mNavigationTab.t();
            this.mUnSelectedDrawable = this.mNavigationTab.x();
            if (this.mRoundImage) {
                makeRoundIcon();
            }
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842913}, this.mSelectedDrawable);
            stateListDrawable.addState(StateSet.WILD_CARD, this.mUnSelectedDrawable);
            this.mIconView.setBackgroundDrawable(stateListDrawable);
        }
    }

    private void sendUt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2032214e", new Object[]{this});
            return;
        }
        com.taobao.tao.navigation.b bVar = this.mNavigationTab;
        if (!(bVar == null || bVar.h() == null)) {
            Map<String, String> h = this.mNavigationTab.h();
            if (!TextUtils.isEmpty(h.get("pageName")) && !TextUtils.isEmpty(h.get("controlName"))) {
                UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(h.get("pageName"), h.get("controlName"));
                uTHitBuilders$UTControlHitBuilder.setProperty("spm", this.mNavigationTab.r().get("spm-url"));
                UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
            }
        }
        Coordinator.execute(new b());
    }

    private void setDrawableColorFilterInner(boolean z) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2fda72", new Object[]{this, new Boolean(z)});
            return;
        }
        Drawable iconDrawable = getIconDrawable(z);
        if (iconDrawable != null) {
            if (z) {
                num = this.mSelectedColorFilter;
            } else {
                num = this.mUnselectedColorFilter;
            }
            iconDrawable.setColorFilter(num == null ? null : new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_ATOP));
        }
    }

    private void updateForegroundView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b473b8", new Object[]{this});
            return;
        }
        View view = this.mIconForegroundView;
        if (view != null) {
            int i = this.mForegroundViewDisplayMode;
            if (i == 4) {
                view.setVisibility(0);
            } else if (this.mSelected) {
                if (i == 2) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(4);
                }
            } else if (i == 2) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
        }
    }

    private void updateIconStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340082f6", new Object[]{this});
            return;
        }
        this.mIconView.setSkipAutoSize(this.mNavigationTab.u());
        float f = getContext().getResources().getDisplayMetrics().density;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mIconView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        if (this.mRoundImage) {
            int i = (int) (40.0f * f);
            layoutParams.width = i;
            layoutParams.height = i;
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) (f * 4.0f);
            this.mIconView.setMinimumHeight(i);
            this.mIconView.setMinimumWidth(i);
            this.mIconView.setLayoutParams(layoutParams);
        } else {
            int i2 = (int) (f * 52.0f);
            layoutParams.width = i2;
            layoutParams.height = i2;
            this.mIconView.setMinimumHeight(i2);
            this.mIconView.setMinimumWidth(i2);
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = 0;
            this.mIconView.setLayoutParams(layoutParams);
        }
        loadImage();
        setDrawableColorFilterInner(false);
    }

    private void updateIconView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb4a3ae", new Object[]{this});
            return;
        }
        View view = this.mIconForegroundView;
        if (view == null) {
            this.mIconView.setVisibility(0);
        } else if (view.getVisibility() == 0) {
            this.mIconView.setVisibility(4);
        } else if (this.mIconForegroundView.getVisibility() == 4) {
            this.mIconView.setVisibility(0);
        }
    }

    private void updateIndicatorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c91a12", new Object[]{this});
            return;
        }
        updateForegroundView();
        updateIconView();
        updateTitleView();
    }

    private void updateMessageMode(NavigationTabMsgMode navigationTabMsgMode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83ed6e3", new Object[]{this, navigationTabMsgMode, str});
            return;
        }
        switch (c.$SwitchMap$com$taobao$tao$navigation$NavigationTabMsgMode[navigationTabMsgMode.ordinal()]) {
            case 1:
            case 2:
                if (TextUtils.isEmpty(str)) {
                    navigationTabMsgMode = NavigationTabMsgMode.NONE;
                    break;
                }
                break;
            case 3:
                if (TextUtils.isEmpty(str) || "0".equals(str)) {
                    navigationTabMsgMode = NavigationTabMsgMode.NONE;
                    break;
                }
                break;
            case 4:
            case 5:
            case 6:
                if (str != null) {
                    if (Integer.parseInt(str) < 0) {
                        navigationTabMsgMode = NavigationTabMsgMode.NONE;
                        break;
                    }
                } else {
                    NavigationTabMsgMode navigationTabMsgMode2 = NavigationTabMsgMode.NONE;
                    Log.e("NavTabIndicatorView", "updateMessageMode: message is null but messageMode is " + navigationTabMsgMode + ", set to NONE");
                    navigationTabMsgMode = navigationTabMsgMode2;
                    break;
                }
                break;
            default:
                navigationTabMsgMode = NavigationTabMsgMode.NONE;
                break;
        }
        this.mMode = navigationTabMsgMode;
        this.mMessage = str;
    }

    private void updateMessageView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e052679", new Object[]{this, new Integer(i)});
        } else if (this.mMessageViewColor == null) {
            this.mMessageView.setBackgroundResource(i);
        } else {
            Drawable b2 = s14.b(getContext(), i, this.mMessageViewColor.intValue());
            if (b2 != null) {
                this.mMessageView.setBackground(b2);
            } else {
                this.mMessageView.setBackgroundResource(i);
            }
        }
    }

    private void updateMessageViewVisibility(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e625618", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.mMessageView.setVisibility(0);
        } else {
            this.mMessageView.setVisibility(8);
        }
    }

    private void updateStyleInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7019a74c", new Object[]{this});
        } else if (this.mAttached && this.mNavigationTab.c()) {
            this.mContentUnSelected = this.mNavigationTab.k().first;
            this.mContentSelected = this.mNavigationTab.k().second;
            this.mTextColorUnSelected = this.mNavigationTab.w();
            this.mTextColorSelected = this.mNavigationTab.s();
            this.mIsShowTitleSelected = this.mNavigationTab.A();
            this.mIsShowTitleUnSelected = this.mNavigationTab.B();
            this.mIconSourceType = this.mNavigationTab.l();
            this.mTitle = this.mNavigationTab.v();
            this.mRoundImage = this.mNavigationTab.z();
            this.mMessageViewColor = this.mNavigationTab.p();
            if (this.mIconView != null) {
                updateIconStyle();
            }
            if (this.mTitleView != null) {
                updateTitleStyle();
            }
            setSelect(this.mSelected, true);
            updateMessageMode(this.mNavigationTab.o(), this.mNavigationTab.n());
            updateMessageView();
        }
    }

    private void updateTitleStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf6f369", new Object[]{this});
        } else {
            this.mTitleView.setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[0]}, new int[]{this.mTextColorSelected, this.mTextColorUnSelected}));
        }
    }

    private void updateTitleView() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c4d8db", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(this.mTitle)) {
            this.mTitleView.setText(this.mTitle);
            setContentDescription(this.mTitle);
        }
        int i2 = 8;
        if (!this.mShowTitle) {
            this.mTitleView.setVisibility(8);
        } else if (this.mSelected) {
            TextView textView = this.mTitleView;
            if (!this.mIsShowTitleSelected) {
                i = 8;
            }
            textView.setVisibility(i);
            this.mTitleView.setSelected(true);
        } else {
            TextView textView2 = this.mTitleView;
            if (this.mIsShowTitleUnSelected) {
                i2 = 0;
            }
            textView2.setVisibility(i2);
            this.mTitleView.setSelected(false);
        }
    }

    public boolean getSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f84d441c", new Object[]{this})).booleanValue();
        }
        return this.mSelected;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.mAttached = true;
        if (com.taobao.tao.navigation.a.o() != null) {
            if (this.mNavigationTab.m() == com.taobao.tao.navigation.a.o().getCurrentTab()) {
                z = true;
            }
            this.mSelected = z;
        }
        updateStyleInternal();
    }

    public void onClickEvent(com.taobao.tao.navigation.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80100d43", new Object[]{this, bVar});
            return;
        }
        TLog.loge(y9a.c(), "NavTabIndicatorView", "new click event");
        clickEvent(bVar);
        resetGuardianForegroundView();
        sendUt();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        updateStyleInternal();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mGestureDetectorCompat.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void preloadDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("657a82ce", new Object[]{this});
            return;
        }
        com.taobao.tao.navigation.b bVar = this.mNavigationTab;
        if (bVar == null || bVar.l() != NavigationTabIconSourceType.DRAWABLE) {
            TLog.loge(y9a.c(), "NavTabIndicatorView", "preload failed, navigation is null or icon type is not drawable");
            return;
        }
        Pair k = this.mNavigationTab.k();
        if (k == null) {
            TLog.loge(y9a.c(), "NavTabIndicatorView", "preload failed, icon is null");
        } else if (!(k.first instanceof Integer) || !(k.second instanceof Integer)) {
            TLog.loge(y9a.c(), "NavTabIndicatorView", "preload failed, icon is not instanceof integer");
        } else {
            sx7.c(getResources(), ((Integer) k.first).intValue(), null);
            sx7.c(getResources(), ((Integer) k.second).intValue(), null);
        }
    }

    public void resetGuardianForegroundView() {
        e eVar;
        e eVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2f3f72f", new Object[]{this});
            return;
        }
        NavigationTabMsgMode navigationTabMsgMode = this.mMode;
        if (navigationTabMsgMode == NavigationTabMsgMode.GUARDIAN_NUM || navigationTabMsgMode == NavigationTabMsgMode.GUARDIAN_TEXT) {
            View view = this.mIconForegroundView;
            if ((view == null || view.getVisibility() != 0) && (eVar2 = this.tabIndicatorViewAbilityCallback) != null) {
                eVar2.f(this.mNavigationTab);
            }
            updateMessage(NavigationTabMsgMode.NONE, "0");
        }
        View view2 = this.mIconForegroundView;
        if (view2 instanceof IconForegroundImageView) {
            if (view2.getVisibility() == 0 && (eVar = this.tabIndicatorViewAbilityCallback) != null) {
                eVar.f(this.mNavigationTab);
            }
            setForegroundView(null);
        }
    }

    public void setForegroundView(IconForegroundImageView iconForegroundImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bbb132b", new Object[]{this, iconForegroundImageView});
        } else {
            setForegroundView(iconForegroundImageView, 8);
        }
    }

    public void setNavigationTabListener(ypj ypjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7003ded", new Object[]{this, ypjVar});
        } else {
            this.mNavigationTabListener = ypjVar;
        }
    }

    public void setSelect(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd82eec5", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!this.mAttached) {
            this.mSelected = z;
        } else if (this.mSelected != z || z2) {
            this.mSelected = z;
            updateIndicatorView();
            this.mIconView.setSelected(this.mSelected);
        }
    }

    public void setSelectedDrawableColorFilter(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ccafdb0", new Object[]{this, num});
            return;
        }
        this.mSelectedColorFilter = num;
        setDrawableColorFilterInner(true);
    }

    public void setUnselectedDrawableColorFilter(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a295b89", new Object[]{this, num});
            return;
        }
        this.mUnselectedColorFilter = num;
        setDrawableColorFilterInner(false);
    }

    public void updateMessage(NavigationTabMsgMode navigationTabMsgMode, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aab202a", new Object[]{this, navigationTabMsgMode, str, str2});
            return;
        }
        if (str2 != null) {
            this.mNavigationTab.A = str2;
        }
        updateMessage(navigationTabMsgMode, str);
    }

    public void updateMessageViewColor(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("714c9030", new Object[]{this, num});
            return;
        }
        this.mMessageViewColor = num;
        this.mNavigationTab.S(num);
    }

    public void updateStyle(com.taobao.tao.navigation.b bVar, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("214ebf68", new Object[]{this, bVar, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (bVar.c()) {
            this.mNavigationTab = bVar;
            this.mShowTitle = z;
            this.mSelected = z2;
            if (z3) {
                updateStyleInternal();
            }
        }
    }

    public NavigationTabIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    private void makeRoundIcon() {
        Drawable drawable;
        Drawable drawable2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe6940e0", new Object[]{this});
        } else if (this.mRoundImage && (drawable = this.mSelectedDrawable) != null && (drawable2 = this.mUnSelectedDrawable) != null && (drawable instanceof BitmapDrawable) && (drawable2 instanceof BitmapDrawable)) {
            RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(getResources(), ((BitmapDrawable) this.mSelectedDrawable).getBitmap());
            this.mSelectedDrawable = create;
            create.setCircular(true);
            RoundedBitmapDrawable create2 = RoundedBitmapDrawableFactory.create(getResources(), ((BitmapDrawable) this.mUnSelectedDrawable).getBitmap());
            this.mUnSelectedDrawable = create2;
            create2.setCircular(true);
        }
    }

    public void setForegroundView(View view, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e293f24c", new Object[]{this, view, new Integer(i), str});
            return;
        }
        if (str != null) {
            this.mNavigationTab.z = str;
        }
        setForegroundView(view, i);
    }

    public NavigationTabIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "NavTabIndicatorView";
        this.mMode = NavigationTabMsgMode.DEFAULT;
        this.mIconSourceType = NavigationTabIconSourceType.DRAWABLE;
        this.mTitle = null;
        this.mSelected = false;
        this.mMessage = null;
        this.mContentUnSelected = 0;
        this.mContentSelected = 0;
        this.mSelectedDrawable = null;
        this.mUnSelectedDrawable = null;
        this.mTextColorUnSelected = 0;
        this.mTextColorSelected = 0;
        this.mIsShowTitleSelected = true;
        this.mIsShowTitleUnSelected = true;
        this.mForegroundViewDisplayMode = 2;
        this.mTitleView = null;
        this.mShowTitle = false;
        this.mAttached = false;
        this.mRoundImage = false;
        setMinimumHeight((int) (context.getResources().getDisplayMetrics().density * 48.0f));
        setMinimumWidth((int) (context.getResources().getDisplayMetrics().density * 48.0f));
        ensureHierarchy(context);
        this.mGestureDetectorCompat = new GestureDetectorCompat(getContext(), new d());
        setBackgroundColor(ResourcesCompat.getColor(getResources(), 17170445, null));
    }

    public void updateMessage(NavigationTabMsgMode navigationTabMsgMode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b358ce60", new Object[]{this, navigationTabMsgMode, str});
            return;
        }
        if (navigationTabMsgMode == NavigationTabMsgMode.DEFAULT) {
            navigationTabMsgMode = NavigationTabMsgMode.GUARDIAN_DEFAULT;
        }
        this.mNavigationTab.Q(str);
        this.mNavigationTab.R(navigationTabMsgMode);
        updateMessageMode(navigationTabMsgMode, str);
        e eVar = this.tabIndicatorViewAbilityCallback;
        if (eVar != null) {
            if (this.mMode == NavigationTabMsgMode.NONE) {
                com.taobao.tao.navigation.b bVar = this.mNavigationTab;
                eVar.i(bVar, bVar.A);
                this.mNavigationTab.A = null;
            } else {
                eVar.c(this.mNavigationTab);
            }
        }
        updateMessageView();
    }

    public void setForegroundView(View view, int i) {
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e614502", new Object[]{this, view, new Integer(i)});
            return;
        }
        if (view != null) {
            this.tabIndicatorViewAbilityCallback.d(this.mNavigationTab);
        } else {
            e eVar = this.tabIndicatorViewAbilityCallback;
            com.taobao.tao.navigation.b bVar = this.mNavigationTab;
            eVar.a(bVar, bVar.z);
            this.mNavigationTab.z = null;
        }
        View view2 = this.mIconForegroundView;
        if (!(view2 == null || view2.getParent() == null || !(this.mIconForegroundView.getParent() instanceof ViewGroup))) {
            ((ViewGroup) this.mIconForegroundView.getParent()).removeView(this.mIconForegroundView);
        }
        this.mIconForegroundView = view;
        this.mForegroundViewDisplayMode = i;
        if (view != null && view.getParent() == null) {
            View view3 = this.mIconForegroundView;
            if (!(view3 instanceof IconForegroundImageView) || !((IconForegroundImageView) view3).isClip) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            } else {
                int i2 = (int) (getContext().getResources().getDisplayMetrics().density * 48.0f);
                this.mIconForegroundView.setMinimumHeight(i2);
                this.mIconForegroundView.setMinimumWidth(i2);
                ((IconForegroundImageView) this.mIconForegroundView).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                layoutParams = new FrameLayout.LayoutParams(i2, i2);
            }
            layoutParams.gravity = 81;
            addView(this.mIconForegroundView, 2, layoutParams);
        }
        updateIndicatorView();
    }

    public void updateMessageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b17c05ca", new Object[]{this});
            return;
        }
        float f = getContext().getResources().getDisplayMetrics().density;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mMessageView.getLayoutParams();
        this.mMessageView.setTextSize(1, 11.0f);
        switch (c.$SwitchMap$com$taobao$tao$navigation$NavigationTabMsgMode[this.mMode.ordinal()]) {
            case 1:
            case 2:
                updateMessageViewVisibility(true ^ TextUtils.isEmpty(this.mMessage));
                updateMessageView(R.drawable.uik_navigation_message_more_bg);
                this.mMessageView.setText(this.mMessage);
                layoutParams.gravity = 17;
                layoutParams.width = -2;
                layoutParams.height = (int) (18.0f * f);
                layoutParams.leftMargin = (int) (15.0f * f);
                layoutParams.bottomMargin = (int) (f * 10.0f);
                this.mMessageView.setLayoutParams(layoutParams);
                this.mMessageView.setPadding(12, 0, 12, 0);
                break;
            case 3:
                if (!TextUtils.isEmpty(this.mMessage) && !"0".equals(this.mMessage)) {
                    updateMessageView(R.drawable.uik_navigation_message_dot_bg);
                    this.mMessageView.setText("");
                    int i = (int) (10.0f * f);
                    layoutParams.width = i;
                    layoutParams.height = i;
                    layoutParams.leftMargin = (int) (11.0f * f);
                    layoutParams.bottomMargin = (int) (f * 14.0f);
                    layoutParams.gravity = 17;
                    this.mMessageView.setLayoutParams(layoutParams);
                    updateMessageViewVisibility(true);
                    this.mMessageView.setPadding(0, 0, 0, 0);
                    break;
                } else {
                    updateMessageViewVisibility(false);
                    break;
                }
                break;
            case 4:
            case 5:
            case 6:
                int parseInt = Integer.parseInt(this.mMessage);
                if (parseInt <= 99) {
                    if (parseInt < 10) {
                        if (parseInt <= 0) {
                            updateMessageViewVisibility(false);
                            break;
                        } else {
                            updateMessageView(R.drawable.uik_navigation_message_dot_bg);
                            this.mMessageView.setText(String.valueOf(parseInt));
                            updateMessageViewVisibility(true);
                            int i2 = (int) (20.0f * f);
                            layoutParams.width = i2;
                            layoutParams.height = i2;
                            layoutParams.leftMargin = (int) (18.0f * f);
                            layoutParams.bottomMargin = (int) (f * 10.0f);
                            layoutParams.gravity = 17;
                            this.mMessageView.setLayoutParams(layoutParams);
                            this.mMessageView.setPadding(0, 0, 0, 0);
                            break;
                        }
                    } else {
                        updateMessageView(R.drawable.uik_navigation_message_more_bg);
                        this.mMessageView.setText(String.valueOf(parseInt));
                        updateMessageViewVisibility(true);
                        layoutParams.width = (int) (24.0f * f);
                        layoutParams.height = (int) (20.0f * f);
                        layoutParams.leftMargin = (int) (15.0f * f);
                        layoutParams.bottomMargin = (int) (f * 9.0f);
                        layoutParams.gravity = 17;
                        this.mMessageView.setLayoutParams(layoutParams);
                        this.mMessageView.setPadding(10, 0, 10, 0);
                        break;
                    }
                } else {
                    this.mMessageView.setText("99+");
                    updateMessageView(R.drawable.uik_navigation_message_more_bg);
                    updateMessageViewVisibility(true);
                    layoutParams.gravity = 17;
                    layoutParams.width = -2;
                    layoutParams.height = (int) (18.0f * f);
                    layoutParams.leftMargin = (int) (15.0f * f);
                    layoutParams.bottomMargin = (int) (f * 10.0f);
                    this.mMessageView.setLayoutParams(layoutParams);
                    this.mMessageView.setPadding(12, 0, 12, 0);
                    break;
                }
            case 7:
                updateMessageViewVisibility(false);
                break;
        }
        ypj ypjVar = this.mNavigationTabListener;
        if (ypjVar != null) {
            ypjVar.onNavigationTabMessageChanged(this.mMessage);
        }
        String c2 = y9a.c();
        TLog.loge(c2, "NavTabIndicatorView", "updateMessageView: mTitle = " + this.mTitle + " messageMode = " + this.mMode + ", message = " + this.mMessage);
    }
}
