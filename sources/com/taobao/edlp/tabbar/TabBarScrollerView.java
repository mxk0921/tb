package com.taobao.edlp.tabbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.edlp.tabbar.IEdlpTabBarActionButtonProvider;
import com.taobao.login4android.api.Login;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import tb.b98;
import tb.f98;
import tb.fbl;
import tb.fs0;
import tb.reu;
import tb.t2o;
import tb.uto;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TabBarScrollerView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MSG_SCROL = 1;
    private String ANIMATION_FADE;
    private String ANIMATION_FADE_UPDOWN;
    private final String TAG;
    public int animationCount;
    private String animationMode;
    private AnimatorSet animatorSet;
    private fs0 curAlienLogo;
    private int curAnimationLimitCount;
    public boolean curDegradeStatus;
    private long durationTime;
    private final Handler handler;
    private boolean isCancel;
    private long lastAnimationTime;
    private View ll_down;
    private View ll_now;
    private View ll_selected;
    private View ll_selected_save;
    private View ll_static;
    private View ll_strange;
    private long periodTime;
    private long tabPeriodTime;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/edlp/tabbar/TabBarScrollerView$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 1 && !TabBarScrollerView.access$000(TabBarScrollerView.this)) {
                TabBarScrollerView.access$100(TabBarScrollerView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            try {
                TabBarScrollerView.access$500(TabBarScrollerView.this).setAlpha(0.0f);
                TabBarScrollerView.access$600(TabBarScrollerView.this).setAlpha(1.0f);
                TabBarScrollerView.access$500(TabBarScrollerView.this).setTranslationY(0.0f);
                TabBarScrollerView.access$600(TabBarScrollerView.this).setTranslationY(0.0f);
                View access$500 = TabBarScrollerView.access$500(TabBarScrollerView.this);
                TabBarScrollerView tabBarScrollerView = TabBarScrollerView.this;
                TabBarScrollerView.access$502(tabBarScrollerView, TabBarScrollerView.access$600(tabBarScrollerView));
                TabBarScrollerView.access$602(TabBarScrollerView.this, access$500);
                TabBarScrollerView.access$700(TabBarScrollerView.this).removeMessages(1);
                if (!TabBarScrollerView.access$000(TabBarScrollerView.this)) {
                    if (TabBarScrollerView.access$500(TabBarScrollerView.this) instanceof FrameLayout) {
                        TabBarScrollerView.access$700(TabBarScrollerView.this).sendEmptyMessageDelayed(1, TabBarScrollerView.access$800(TabBarScrollerView.this));
                    } else {
                        TabBarScrollerView.access$700(TabBarScrollerView.this).sendEmptyMessageDelayed(1, TabBarScrollerView.access$900(TabBarScrollerView.this));
                    }
                }
            } catch (Throwable th) {
                TLog.loge("EdlpTabBarScrollerView", "onAnimationEnd Wrong! + " + Log.getStackTraceString(th));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else if (!TabBarScrollerView.access$000(TabBarScrollerView.this)) {
                if (TabBarScrollerView.access$200(TabBarScrollerView.this)) {
                    TabBarScrollerView.access$300(TabBarScrollerView.this);
                    TLog.loge("tab3edlp", "OverAnimationLimitCount true");
                    return;
                }
                TabBarScrollerView tabBarScrollerView = TabBarScrollerView.this;
                tabBarScrollerView.animationCount++;
                TabBarScrollerView.access$400(tabBarScrollerView, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f10421a;

        public c(long j) {
            this.f10421a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String userId = Login.getUserId();
            if (userId == null) {
                TLog.loge("EdlpTabBarScrollerView", "userId is null");
            }
            SharedPreferences.Editor edit = b98.a().getSharedPreferences("OverAnimationLimitCount", 0).edit();
            edit.putLong(userId + TabBarScrollerView.access$1000(TabBarScrollerView.this).k + "lastTime", this.f10421a);
            edit.apply();
        }
    }

    static {
        t2o.a(1032847417);
    }

    public TabBarScrollerView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ boolean access$000(TabBarScrollerView tabBarScrollerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f282e779", new Object[]{tabBarScrollerView})).booleanValue();
        }
        return tabBarScrollerView.isCancel;
    }

    public static /* synthetic */ void access$100(TabBarScrollerView tabBarScrollerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e42c8d94", new Object[]{tabBarScrollerView});
        } else {
            tabBarScrollerView.startAnimation();
        }
    }

    public static /* synthetic */ fs0 access$1000(TabBarScrollerView tabBarScrollerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fs0) ipChange.ipc$dispatch("31b6cf22", new Object[]{tabBarScrollerView});
        }
        return tabBarScrollerView.curAlienLogo;
    }

    public static /* synthetic */ boolean access$200(TabBarScrollerView tabBarScrollerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5d633b7", new Object[]{tabBarScrollerView})).booleanValue();
        }
        return tabBarScrollerView.getOverAnimationLimitCount();
    }

    public static /* synthetic */ void access$300(TabBarScrollerView tabBarScrollerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77fd9d2", new Object[]{tabBarScrollerView});
        } else {
            tabBarScrollerView.animationLimitCount();
        }
    }

    public static /* synthetic */ void access$400(TabBarScrollerView tabBarScrollerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c073103", new Object[]{tabBarScrollerView, new Boolean(z)});
        } else {
            tabBarScrollerView.saveAnimationLimitCount(z);
        }
    }

    public static /* synthetic */ View access$500(TabBarScrollerView tabBarScrollerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("89ba5a52", new Object[]{tabBarScrollerView});
        }
        return tabBarScrollerView.ll_now;
    }

    public static /* synthetic */ View access$502(TabBarScrollerView tabBarScrollerView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8012bf86", new Object[]{tabBarScrollerView, view});
        }
        tabBarScrollerView.ll_now = view;
        return view;
    }

    public static /* synthetic */ View access$600(TabBarScrollerView tabBarScrollerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("262856b1", new Object[]{tabBarScrollerView});
        }
        return tabBarScrollerView.ll_down;
    }

    public static /* synthetic */ View access$602(TabBarScrollerView tabBarScrollerView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ee99d0c7", new Object[]{tabBarScrollerView, view});
        }
        tabBarScrollerView.ll_down = view;
        return view;
    }

    public static /* synthetic */ Handler access$700(TabBarScrollerView tabBarScrollerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("2db34db8", new Object[]{tabBarScrollerView});
        }
        return tabBarScrollerView.handler;
    }

    public static /* synthetic */ long access$800(TabBarScrollerView tabBarScrollerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fd01861", new Object[]{tabBarScrollerView})).longValue();
        }
        return tabBarScrollerView.tabPeriodTime;
    }

    public static /* synthetic */ long access$900(TabBarScrollerView tabBarScrollerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7179be80", new Object[]{tabBarScrollerView})).longValue();
        }
        return tabBarScrollerView.periodTime;
    }

    private void animationLimitCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e801fd3f", new Object[]{this});
            return;
        }
        this.curDegradeStatus = true;
        stopScroll();
        View view = this.ll_static;
        this.ll_down = view;
        view.setVisibility(0);
        this.ll_down.setAlpha(1.0f);
        View view2 = this.ll_strange;
        this.ll_now = view2;
        view2.setVisibility(0);
        this.ll_now.setAlpha(0.0f);
        if (f98.a(this.curAlienLogo)) {
            f98.c(this.curAlienLogo.l, this.ll_down);
        }
    }

    public static /* synthetic */ Object ipc$super(TabBarScrollerView tabBarScrollerView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/edlp/tabbar/TabBarScrollerView");
    }

    private boolean isTheSameDay(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92f0547a", new Object[]{this, new Long(j), new Long(j2)})).booleanValue();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(new Date(j)).equals(simpleDateFormat.format(new Date(j2)));
    }

    private void prepareViews(Context context, fs0 fs0Var, Map<String, Drawable> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd97b939", new Object[]{this, context, fs0Var, map});
            return;
        }
        if (fs0Var == null) {
            TLog.loge("EdlpTabBarScrollerView", "initScrollerView alien logo is null！");
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setSkipAutoSize(true);
        tUrlImageView.setAdjustViewBounds(true);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        tUrlImageView.setScaleType(scaleType);
        tUrlImageView.setAutoRelease(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        tUrlImageView.setLayoutParams(layoutParams);
        tUrlImageView.setClickable(false);
        this.ll_strange = tUrlImageView;
        View inflate = LayoutInflater.from(b98.a()).inflate(R.layout.edlp_tab_button_static, (ViewGroup) null);
        TUrlImageView tUrlImageView2 = (TUrlImageView) inflate.findViewById(R.id.image_view);
        tUrlImageView2.setAdjustViewBounds(true);
        tUrlImageView2.setAutoRelease(false);
        tUrlImageView2.setScaleType(scaleType);
        inflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        inflate.setClickable(false);
        this.ll_static = inflate;
        TUrlImageView tUrlImageView3 = new TUrlImageView(context);
        tUrlImageView3.setAdjustViewBounds(true);
        tUrlImageView3.setScaleType(scaleType);
        tUrlImageView3.setLayoutParams(layoutParams);
        tUrlImageView3.setClickable(false);
        this.ll_selected = tUrlImageView3;
        this.ll_selected_save = tUrlImageView3;
        if (map == null || !fbl.d()) {
            tUrlImageView.setImageUrl(this.curAlienLogo.i);
            tUrlImageView2.setImageUrl(this.curAlienLogo.f19495a);
            tUrlImageView3.setImageUrl(this.curAlienLogo.h);
        } else {
            Drawable drawable = map.get(this.curAlienLogo.i);
            if (drawable != null) {
                tUrlImageView.setImageDrawable(drawable);
                tUrlImageView.setAutoRelease(false);
            } else {
                tUrlImageView.setImageUrl(this.curAlienLogo.i);
            }
            Drawable drawable2 = map.get(this.curAlienLogo.f19495a);
            if (drawable2 != null) {
                tUrlImageView2.setImageDrawable(drawable2);
                tUrlImageView2.setAutoRelease(false);
            } else {
                tUrlImageView2.setImageUrl(this.curAlienLogo.f19495a);
            }
            Drawable drawable3 = map.get(this.curAlienLogo.h);
            if (drawable3 != null) {
                tUrlImageView3.setImageDrawable(drawable3);
                tUrlImageView3.setAutoRelease(false);
            } else {
                tUrlImageView3.setImageUrl(this.curAlienLogo.h);
            }
        }
        addView(this.ll_selected);
    }

    private void removeParent(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2238edd", new Object[]{this, view});
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    private void saveAnimationLimitCount(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ee4dc12", new Object[]{this, new Boolean(z)});
        } else {
            uto.a().execute(new d(z));
        }
    }

    private void saveOverAnimationLimitCountLastTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("598170b3", new Object[]{this, new Long(j)});
        } else {
            uto.a().execute(new c(j));
        }
    }

    private void setViews(Context context, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d7b2b5", new Object[]{this, context, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.curDegradeStatus = z;
        stopScroll();
        if (!z) {
            View view = this.ll_strange;
            this.ll_now = view;
            removeParent(view);
            addView(this.ll_now);
        }
        View view2 = this.ll_static;
        this.ll_down = view2;
        removeParent(view2);
        addView(this.ll_down);
        if (z) {
            this.ll_down.setVisibility(0);
            this.ll_down.setAlpha(1.0f);
            this.ll_selected.setVisibility(4);
            return;
        }
        this.ll_down.setVisibility(0);
        this.ll_now.setVisibility(0);
        this.ll_now.setAlpha(1.0f);
        this.ll_down.setAlpha(0.0f);
        this.ll_selected.setVisibility(4);
        if (!z2) {
            startScroll();
        }
    }

    public String getCurImgUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a17ff663", new Object[]{this});
        }
        if (this.curDegradeStatus) {
            return this.curAlienLogo.f19495a;
        }
        if (this.animationCount % 2 == 0) {
            return this.curAlienLogo.i;
        }
        return this.curAlienLogo.f19495a;
    }

    public IEdlpTabBarActionButtonProvider.ExposeUtTypeEnum getCurTabBarStatus() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IEdlpTabBarActionButtonProvider.ExposeUtTypeEnum) ipChange.ipc$dispatch("6ad5373b", new Object[]{this});
        }
        if (!this.curDegradeStatus && ((i = this.animationCount) == 0 || i % 2 == 1)) {
            return IEdlpTabBarActionButtonProvider.ExposeUtTypeEnum.STRANGE_ICON;
        }
        if (f98.a(this.curAlienLogo)) {
            return IEdlpTabBarActionButtonProvider.ExposeUtTypeEnum.STATIC_ICON;
        }
        return IEdlpTabBarActionButtonProvider.ExposeUtTypeEnum.STATIC_ICON_WITH_RED;
    }

    public void initScrollerView(Context context, fs0 fs0Var, boolean z, Map<String, Drawable> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1eb1075", new Object[]{this, context, fs0Var, new Boolean(z), map});
        } else if (fs0Var == null) {
            TLog.loge("EdlpTabBarScrollerView", "initScrollerView alien logo is null！");
        } else {
            this.curAlienLogo = fs0Var;
            try {
                this.animationMode = fs0Var.g;
                long parseDouble = (long) (Double.parseDouble(fs0Var.c) * 1000.0d);
                long parseDouble2 = (long) (Double.parseDouble(fs0Var.d) * 1000.0d);
                long parseDouble3 = (long) (Double.parseDouble(fs0Var.e) * 1000.0d);
                if (parseDouble2 > 1000) {
                    this.tabPeriodTime = parseDouble2;
                }
                if (parseDouble > 1000) {
                    this.periodTime = parseDouble;
                }
                if (parseDouble3 > 100) {
                    this.durationTime = parseDouble3;
                }
            } catch (Throwable th) {
                TLog.loge("EdlpTabBarScrollerView", "initScrollerView ParseData Wrong + " + th);
            }
            prepareViews(context, fs0Var, map);
            boolean overAnimationLimitCount = getOverAnimationLimitCount();
            this.curDegradeStatus = overAnimationLimitCount;
            setViews(context, overAnimationLimitCount, z);
        }
    }

    public void setShowPromotionCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f45ffb1", new Object[]{this, new Integer(i)});
            return;
        }
        View view = this.ll_down;
        if (view != null) {
            f98.c(i, view);
        }
    }

    public void stopScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec88676", new Object[]{this});
        } else {
            this.isCancel = true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f10422a;

        public d(boolean z) {
            this.f10422a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String userId = Login.getUserId();
            if (userId == null) {
                TLog.loge("EdlpTabBarScrollerView", "userId is null");
            }
            SharedPreferences sharedPreferences = b98.a().getSharedPreferences("OverAnimationLimitCount", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (this.f10422a) {
                edit.putInt(userId + TabBarScrollerView.access$1000(TabBarScrollerView.this).k + "animationCount", 0);
            } else {
                int i = sharedPreferences.getInt(userId + TabBarScrollerView.access$1000(TabBarScrollerView.this).k + "animationCount", 0);
                edit.putInt(userId + TabBarScrollerView.access$1000(TabBarScrollerView.this).k + "animationCount", i + 1);
            }
            edit.apply();
        }
    }

    public TabBarScrollerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void foregroundToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c215c173", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            TLog.loge("EdlpTabBarScrollerView", "取消动画");
        }
        if (this.curDegradeStatus) {
            this.ll_down.setVisibility(0);
            this.ll_down.setAlpha(1.0f);
            return;
        }
        stopScroll();
        View view = this.ll_static;
        this.ll_down = view;
        view.setVisibility(0);
        this.ll_down.setAlpha(1.0f);
        View view2 = this.ll_strange;
        this.ll_now = view2;
        view2.setAlpha(0.0f);
        this.ll_now.setVisibility(0);
    }

    public void onClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4c31cf", new Object[]{this});
            return;
        }
        TLog.loge("EdlpTabBarScrollerView", "点击EDLP Tab3");
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        stopScroll();
        View view = this.ll_static;
        this.ll_down = view;
        ((TextView) view.findViewById(R.id.edlp_tab_badge)).setVisibility(4);
        this.ll_down.setVisibility(0);
        this.ll_down.setAlpha(0.0f);
        if (!this.curDegradeStatus) {
            View view2 = this.ll_strange;
            this.ll_now = view2;
            view2.setAlpha(0.0f);
        }
        View view3 = this.ll_selected_save;
        this.ll_selected = view3;
        view3.setVisibility(0);
        this.ll_selected.setAlpha(1.0f);
    }

    public void recoverFromClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838a3281", new Object[]{this});
            return;
        }
        TLog.loge("EdlpTabBarScrollerView", "点击EDLP 从Tab3切换到其他Tab");
        if (this.curDegradeStatus) {
            this.ll_down.setAlpha(1.0f);
            this.ll_selected.setVisibility(4);
            return;
        }
        View view = this.ll_strange;
        this.ll_now = view;
        view.setVisibility(0);
        this.ll_now.setAlpha(1.0f);
        View view2 = this.ll_static;
        this.ll_down = view2;
        view2.setVisibility(0);
        this.ll_down.setAlpha(0.0f);
        this.ll_selected.setVisibility(4);
        startScroll();
    }

    public TabBarScrollerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "EdlpTabBarScrollerView";
        this.durationTime = 800L;
        this.periodTime = 2400L;
        this.tabPeriodTime = 2400L;
        this.ANIMATION_FADE = reu.TRANSITION_TYPE_FADE;
        this.ANIMATION_FADE_UPDOWN = "fadeUpDown";
        this.animationMode = reu.TRANSITION_TYPE_FADE;
        this.curAlienLogo = null;
        this.curDegradeStatus = false;
        this.animationCount = 0;
        this.animatorSet = null;
        this.handler = new a();
        this.lastAnimationTime = 0L;
        this.curAnimationLimitCount = 0;
    }

    private boolean getOverAnimationLimitCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c74dc99", new Object[]{this})).booleanValue();
        }
        String userId = Login.getUserId();
        if (userId == null) {
            TLog.loge("EdlpTabBarScrollerView", "userId is null");
        }
        if (this.curAlienLogo.j == -1) {
            return false;
        }
        if (this.lastAnimationTime == 0) {
            SharedPreferences sharedPreferences = b98.a().getSharedPreferences("OverAnimationLimitCount", 0);
            this.lastAnimationTime = sharedPreferences.getLong(userId + this.curAlienLogo.k + "lastTime", 0L);
            this.curAnimationLimitCount = sharedPreferences.getInt(userId + this.curAlienLogo.k + "animationCount", 0);
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.lastAnimationTime = currentTimeMillis;
        if (!isTheSameDay(currentTimeMillis, currentTimeMillis)) {
            saveOverAnimationLimitCountLastTime(currentTimeMillis);
            saveAnimationLimitCount(true);
            return false;
        }
        int i = this.curAnimationLimitCount + 1;
        this.curAnimationLimitCount = i;
        return i >= this.curAlienLogo.j + 1;
    }

    public void startScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75254ad6", new Object[]{this});
            return;
        }
        try {
            SharedPreferences sharedPreferences = b98.a().getSharedPreferences("OverAnimationLimitCount", 0);
            int i = sharedPreferences.getInt(Login.getUserId() + this.curAlienLogo.k + "animationCount", 0);
            this.curAnimationLimitCount = i;
            if (i > this.curAlienLogo.j) {
                TLog.loge("EdlpTabBarScrollerView", " startScroll end count " + this.curAnimationLimitCount);
                animationLimitCount();
                return;
            }
            this.isCancel = false;
            TLog.loge("EdlpTabBarScrollerView", "startScroll " + this.periodTime);
            this.handler.removeMessages(1);
            this.handler.sendEmptyMessage(1);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void startAnimation() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        } else if (!this.isCancel && (view = this.ll_down) != null && this.ll_now != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.ll_now, "alpha", 1.0f, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.ll_now, "translationY", 0.0f, 20.0f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.ll_down, "translationY", 20.0f, 0.0f);
            this.animatorSet = new AnimatorSet();
            if (this.ANIMATION_FADE_UPDOWN.equals(this.animationMode)) {
                this.animatorSet.playTogether(ofFloat, ofFloat4, ofFloat2, ofFloat3);
            } else {
                this.animatorSet.playTogether(ofFloat, ofFloat2);
            }
            this.animatorSet.setDuration(this.durationTime);
            this.animatorSet.addListener(new b());
            this.animatorSet.start();
        }
    }
}
