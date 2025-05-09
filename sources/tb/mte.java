package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.widget.ScrollFrameLayout;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class mte extends oa4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final float EXIT_BTN_MARGIN_TOP;
    public volatile boolean isComponentExpand;
    public ScrollFrameLayout mContentContainer;
    private View mExitBtn;
    private Application.ActivityLifecycleCallbacks mActivityLifecycleCallbacks = new a();
    private ScrollFrameLayout.a mOnScrollInterceptor = new b();
    private ScrollFrameLayout.b mOnViewLifecycleListener = new c();
    private final zy9 mFrameSize = new zy9(-1, -1, 17);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                mte.this.onActivityPageCreated(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                mte.this.onActivityPageDestroyed(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else {
                mte.this.onActivityPagePaused(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                mte.this.onActivityPageResumed(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                mte.this.onActivityPageStarted(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                mte.this.onActivityPageStopped(activity);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements ScrollFrameLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1e9a3a6f", new Object[]{this})).booleanValue();
            }
            return true ^ mte.this.isComponentExpand;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a1b1001", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements ScrollFrameLayout.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41eca05a", new Object[]{this});
            } else {
                mte.this.onComponentViewAttachedToWindow();
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de8e6617", new Object[]{this});
                return;
            }
            mte.this.onComponentViewDetachedFromWindow();
            mte.this.shrinkComponent();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                mte.this.shrinkComponent();
            }
        }
    }

    static {
        t2o.a(440401936);
    }

    public mte(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
        this.EXIT_BTN_MARGIN_TOP = TypedValue.applyDimension(1, 42.0f, context.getResources().getDisplayMetrics());
    }

    private int getTopWindowInset(Context context) {
        WindowInsets rootWindowInsets;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4311f466", new Object[]{this, context})).intValue();
        }
        try {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (Build.VERSION.SDK_INT >= 23) {
                    rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                    return rootWindowInsets.getStableInsetTop();
                }
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    public static /* synthetic */ Object ipc$super(mte mteVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else if (hashCode == 1252518699) {
            super.onDisAppear();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/industry/component/IndustryBaseComponent");
        }
    }

    private void registerActivityLifecycleCallbacks(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769691eb", new Object[]{this, context});
        } else if (context instanceof Activity) {
            ((Activity) context).getApplication().registerActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
        }
    }

    private void unregisterActivityLifecycleCallbacks(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cc81432", new Object[]{this, context});
        } else if (context instanceof Activity) {
            ((Activity) context).getApplication().unregisterActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
        }
    }

    public final void expandComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("775e368a", new Object[]{this});
        } else if (!this.isComponentExpand) {
            qql parentComponent = getParentComponent();
            if (parentComponent instanceof sx9) {
                ((sx9) parentComponent).U("9:15");
                this.isComponentExpand = true;
                onComponentExpand();
                View view = this.mExitBtn;
                if (view != null) {
                    view.setVisibility(0);
                }
            }
        }
    }

    public float getFrameDimensionRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92b6853", new Object[]{this})).floatValue();
        }
        qql parentComponent = getParentComponent();
        if (parentComponent instanceof sx9) {
            return ((sx9) parentComponent).A();
        }
        return 1.0f;
    }

    public void onActivityPageCreated(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d7af44", new Object[]{this, activity});
        }
    }

    public void onActivityPageDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c663d675", new Object[]{this, activity});
        }
    }

    public void onActivityPagePaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e932e24", new Object[]{this, activity});
        }
    }

    public void onActivityPageResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a119173", new Object[]{this, activity});
        }
    }

    public void onActivityPageStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a988339d", new Object[]{this, activity});
        }
    }

    public void onActivityPageStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27aa3de9", new Object[]{this, activity});
        }
    }

    public void onComponentExpand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8edc7e9f", new Object[]{this});
        }
    }

    public void onComponentShrink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df0968e", new Object[]{this});
        }
    }

    public void onComponentViewAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64519f59", new Object[]{this});
        }
    }

    public void onComponentViewDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbafa156", new Object[]{this});
        }
    }

    @Override // tb.oa4
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        registerActivityLifecycleCallbacks(this.mContext);
    }

    @Override // tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        unregisterActivityLifecycleCallbacks(this.mContext);
    }

    @Override // tb.oa4
    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
            return;
        }
        super.onDisAppear();
        shrinkComponent();
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        if (view == null || view.getId() != R.id.fl_industry_root) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.industry_base_layout_component, (ViewGroup) null);
            ((ViewGroup.MarginLayoutParams) view.findViewById(R.id.tv_industry_exit_expand).getLayoutParams()).topMargin = (int) (getTopWindowInset(this.mContext) + this.EXIT_BTN_MARGIN_TOP);
        }
        View findViewById = view.findViewById(R.id.tv_industry_exit_expand);
        this.mExitBtn = findViewById;
        ViewProxy.setOnClickListener(findViewById, new d());
        ScrollFrameLayout scrollFrameLayout = (ScrollFrameLayout) view.findViewById(R.id.fl_industry_base_container);
        this.mContentContainer = scrollFrameLayout;
        scrollFrameLayout.setOnViewLifecycleListener(this.mOnViewLifecycleListener);
        this.mContentContainer.setOnScrollInterceptor(this.mOnScrollInterceptor);
        onViewUpdate(view);
        return view;
    }

    @Override // tb.oa4
    public zy9 onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zy9) ipChange.ipc$dispatch("5fd8d0bf", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return this.mFrameSize;
    }

    public abstract void onViewUpdate(View view);

    public final void shrinkComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48849b7b", new Object[]{this});
        } else if (this.isComponentExpand) {
            qql parentComponent = getParentComponent();
            if (parentComponent instanceof sx9) {
                ((sx9) parentComponent).U(null);
                this.isComponentExpand = false;
                onComponentShrink();
                View view = this.mExitBtn;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
        }
    }
}
