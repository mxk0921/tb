package com.taobao.tao.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.homepage.HomepageFragment;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.NavigationTabIndicatorView;
import com.taobao.tao.navigation.a;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.aqj;
import tb.bqj;
import tb.dvd;
import tb.hvd;
import tb.pg1;
import tb.rpj;
import tb.s0m;
import tb.s14;
import tb.s8d;
import tb.tud;
import tb.w4v;
import tb.wpj;
import tb.y9a;
import tb.zpj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBFragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBFragmentTabHost";
    private f exposureCallback;
    private boolean isUnset;
    private boolean mAttached;
    private int mContainerId;
    private Context mContext;
    private g mCurrentTab;
    private FragmentManager mFragmentManager;
    private HashMap<String, Fragment> mFragments;
    private g mLastTab;
    private tud mLauncherTaskNotPreparedCallback;
    private dvd mLoginCallback;
    private TabHost.OnTabChangeListener mOnTabChangeListener;
    private g mPreTab;
    private FrameLayout mRealTabContent;
    private FrameLayout mTabBackground;
    private View mTabDivide;
    private NavigationTabIndicatorView.e tabIndicatorViewAbilityCallback;
    private final ArrayList<g> mTabs = new ArrayList<>();
    private boolean mFromLogin = false;
    private boolean mResumed = false;
    private int mTargetTabIndex = 0;
    private final aqj visibilityController = new aqj(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class DummyTabFactory implements TabHost.TabContentFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Context mContext;

        public DummyTabFactory(Context context) {
            this.mContext = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("57322dd3", new Object[]{this, str});
            }
            View view = new View(this.mContext);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        String curTab;
        boolean fromLogin;
        String preTab;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class a implements Parcelable.Creator<SavedState> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState) ipChange.ipc$dispatch("c358d784", new Object[]{this, parcel});
                }
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState[]) ipChange.ipc$dispatch("68c4f36d", new Object[]{this, new Integer(i)});
                }
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TBFragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.curTab + "} preTab=" + this.preTab + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.curTab);
            parcel.writeString(this.preTab);
            parcel.writeInt(this.fromLogin ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.curTab = parcel.readString();
            this.preTab = parcel.readString();
            this.fromLogin = parcel.readInt() != 1 ? false : true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f12550a;

        public a(List list) {
            this.f12550a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (NavigationTabIndicatorView navigationTabIndicatorView : this.f12550a) {
                if (navigationTabIndicatorView != null) {
                    navigationTabIndicatorView.preloadDrawable();
                }
            }
            TLog.loge(y9a.c(), TBFragmentTabHost.TAG, "preload indicator view finished");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            TBFragmentTabHost.access$300(TBFragmentTabHost.this, zpj.f32933a);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() == null || succPhenixEvent.isIntermediate()) {
                TBFragmentTabHost.access$300(TBFragmentTabHost.this, zpj.f32933a);
            } else {
                zpj.f32933a = succPhenixEvent.getDrawable();
                zpj.b = null;
                TBFragmentTabHost.access$300(TBFragmentTabHost.this, zpj.f32933a);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements NavigationTabIndicatorView.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.tao.navigation.NavigationTabIndicatorView.e
        public void a(com.taobao.tao.navigation.b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f9aa3c", new Object[]{this, bVar, str});
            } else {
                com.taobao.tao.navigation.a.z(bVar.e(), 15, str);
            }
        }

        @Override // com.taobao.tao.navigation.NavigationTabIndicatorView.e
        public void b(com.taobao.tao.navigation.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af6aa3a8", new Object[]{this, bVar});
            }
        }

        @Override // com.taobao.tao.navigation.NavigationTabIndicatorView.e
        public void c(com.taobao.tao.navigation.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73d5cfbf", new Object[]{this, bVar});
            } else {
                com.taobao.tao.navigation.a.A(bVar.e(), 14, bVar.A);
            }
        }

        @Override // com.taobao.tao.navigation.NavigationTabIndicatorView.e
        public void d(com.taobao.tao.navigation.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d477e19", new Object[]{this, bVar});
            } else {
                com.taobao.tao.navigation.a.z(bVar.e(), 14, bVar.z);
            }
        }

        @Override // com.taobao.tao.navigation.NavigationTabIndicatorView.e
        public void e(com.taobao.tao.navigation.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fee0b6c7", new Object[]{this, bVar});
            }
        }

        @Override // com.taobao.tao.navigation.NavigationTabIndicatorView.e
        public void f(com.taobao.tao.navigation.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f274faf4", new Object[]{this, bVar});
            } else {
                com.taobao.tao.navigation.a.A(bVar.e(), 13, bVar.z);
            }
        }

        @Override // com.taobao.tao.navigation.NavigationTabIndicatorView.e
        public void g(com.taobao.tao.navigation.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bcad84bd", new Object[]{this, bVar});
            }
        }

        @Override // com.taobao.tao.navigation.NavigationTabIndicatorView.e
        public void i(com.taobao.tao.navigation.b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc64ace2", new Object[]{this, bVar, str});
            } else {
                com.taobao.tao.navigation.a.A(bVar.e(), 15, str);
            }
        }

        @Override // com.taobao.tao.navigation.NavigationTabIndicatorView.e
        public void j(com.taobao.tao.navigation.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e06868c", new Object[]{this, bVar});
            }
        }

        @Override // com.taobao.tao.navigation.NavigationTabIndicatorView.e
        public void h(com.taobao.tao.navigation.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24be4e20", new Object[]{this, bVar});
                return;
            }
            Context context = TBFragmentTabHost.this.getContext();
            Intent intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
            if (intent != null) {
                intent.putExtra("referrer", intent.getData());
                intent.setData(Uri.parse(bVar.q()));
                intent.putExtra(y9a.EXTRA_KEY_CLICK_TO_TAB_CHANGE, true);
            }
            TBFragmentTabHost.this.setCurrentTab(bVar.m());
            if (intent != null) {
                intent.removeExtra(y9a.EXTRA_KEY_CLICK_TO_TAB_CHANGE);
            }
            String c = y9a.c();
            TLog.loge(c, TBFragmentTabHost.TAG, "onUnselectedClicked, biz:" + bVar.e());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface f {
    }

    public TBFragmentTabHost(Context context) {
        super(context, null);
        initFragmentTabHost(context, null);
        wpj.c();
    }

    public static /* synthetic */ boolean access$000(TBFragmentTabHost tBFragmentTabHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("246af14a", new Object[]{tBFragmentTabHost})).booleanValue();
        }
        return tBFragmentTabHost.mAttached;
    }

    public static /* synthetic */ void access$100(TBFragmentTabHost tBFragmentTabHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52438ba5", new Object[]{tBFragmentTabHost});
        } else {
            tBFragmentTabHost.updateTabWidgetIndicatorViews();
        }
    }

    public static /* synthetic */ void access$300(TBFragmentTabHost tBFragmentTabHost, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90aaae07", new Object[]{tBFragmentTabHost, drawable});
        } else {
            tBFragmentTabHost.setTabWidgetBackgroundInternal(drawable);
        }
    }

    private FragmentTransaction doTabChanged(String str, FragmentTransaction fragmentTransaction) {
        String str2;
        Fragment fragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("9bdeffa9", new Object[]{this, str, fragmentTransaction});
        }
        g tabInfoForTag = getTabInfoForTag(str);
        com.taobao.tao.navigation.b bVar = com.taobao.tao.navigation.a.t().get(this.mTabs.indexOf(tabInfoForTag));
        String str3 = null;
        if (bVar != null) {
            if (!"逛逛".equals(bVar.v())) {
                setUnSeletedNavigationTabsColorFilter(-1, null, null);
            }
            if (!wpj.l()) {
                com.android.tools.ir.runtime.a.a(bVar.f(), null);
                String c2 = y9a.c();
                TLog.loge(c2, TAG, "initBundle: " + bVar.f());
            }
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(bVar.r());
        }
        if (this.mLastTab != tabInfoForTag) {
            String c3 = y9a.c();
            TLog.loge(c3, TAG, "start real doTabChange. tabId: " + str);
            if (fragmentTransaction == null) {
                fragmentTransaction = this.mFragmentManager.beginTransaction();
            }
            g gVar = this.mLastTab;
            if (!(gVar == null || (fragment = gVar.e) == null)) {
                fragmentTransaction.detach(fragment);
                String c4 = y9a.c();
                TLog.loge(c4, TAG, "tab fragment detach, tag: " + this.mLastTab.f12554a);
            }
            if (tabInfoForTag != null) {
                Fragment fragment2 = tabInfoForTag.e;
                if (fragment2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    Context context = this.mContext;
                    if (TextUtils.isEmpty(tabInfoForTag.c)) {
                        str2 = tabInfoForTag.b.getName();
                    } else {
                        str2 = tabInfoForTag.c;
                    }
                    Fragment instantiate = Fragment.instantiate(context, str2, tabInfoForTag.d);
                    tabInfoForTag.e = instantiate;
                    y9a.d(instantiate, y9a.CONSTRUCT_PAGE_STAGE, uptimeMillis);
                    if (this.mFragments == null) {
                        this.mFragments = new HashMap<>();
                    }
                    this.mFragments.put(tabInfoForTag.f12554a, tabInfoForTag.e);
                    fragmentTransaction.add(this.mContainerId, tabInfoForTag.e, tabInfoForTag.f12554a);
                    String c5 = y9a.c();
                    TLog.loge(c5, TAG, "tab fragment add, tag: " + tabInfoForTag.f12554a);
                } else {
                    fragmentTransaction.attach(fragment2);
                    String c6 = y9a.c();
                    TLog.loge(c6, TAG, "tab fragment attach, tag: " + tabInfoForTag.f12554a);
                }
            } else {
                String c7 = y9a.c();
                TLog.loge(c7, TAG, "skip tab change, for tab fragment is null. tag: " + str);
            }
            this.mCurrentTab = tabInfoForTag;
            this.mLastTab = tabInfoForTag;
        } else {
            String c8 = y9a.c();
            StringBuilder sb = new StringBuilder("skip tab change, for last tab equals new tab. tabId: ");
            g gVar2 = this.mLastTab;
            if (gVar2 != null) {
                str3 = gVar2.f12554a;
            }
            sb.append(str3);
            TLog.loge(c8, TAG, sb.toString());
        }
        return fragmentTransaction;
    }

    private void ensureContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3346d62", new Object[]{this});
        } else if (this.mRealTabContent == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.mContainerId);
            this.mRealTabContent = frameLayout;
            if (frameLayout == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.mContainerId);
            }
        }
    }

    private void ensureHierarchy(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cef7cea", new Object[]{this, context});
            return;
        }
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0, 0.0f);
            layoutParams.gravity = 80;
            linearLayout.addView(frameLayout, layoutParams);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.mRealTabContent = frameLayout2;
            frameLayout2.setId(this.mContainerId);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setShowDividers(0);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.mTabBackground = (FrameLayout) findViewById(R.id.uik_navigation_tab_background);
        this.mTabDivide = findViewById(R.id.uik_navigation_tab_divide);
    }

    private NavigationTabIndicatorView.e getTabIndicatorViewAbilityCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NavigationTabIndicatorView.e) ipChange.ipc$dispatch("1fee464a", new Object[]{this});
        }
        if (this.tabIndicatorViewAbilityCallback == null) {
            this.tabIndicatorViewAbilityCallback = new e();
        }
        return this.tabIndicatorViewAbilityCallback;
    }

    private int getTabInfoIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31715be9", new Object[]{this, str})).intValue();
        }
        int size = this.mTabs.size();
        for (int i = 0; i < size; i++) {
            if (this.mTabs.get(i).f12554a.equals(str)) {
                return i;
            }
        }
        return 0;
    }

    private void handleLoginBroadcastOld(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6779ad6a", new Object[]{this, loginAction});
        } else if (!this.mResumed) {
            int i = d.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[loginAction.ordinal()];
            if (i == 1) {
                this.mTargetTabIndex = getCurrentTab();
                this.mFromLogin = true;
            } else if (i == 2) {
                com.taobao.tao.navigation.b q = com.taobao.tao.navigation.a.q(getCurrentTab());
                if (q == null) {
                    this.mTargetTabIndex = 0;
                    this.mFromLogin = true;
                } else if (q.y()) {
                    com.taobao.tao.navigation.b q2 = com.taobao.tao.navigation.a.q(getLastTab());
                    if (q2 == null) {
                        this.mTargetTabIndex = 0;
                        this.mFromLogin = true;
                    } else if (q2.y()) {
                        this.mTargetTabIndex = 0;
                        this.mFromLogin = true;
                    } else {
                        this.mTargetTabIndex = getLastTab();
                        this.mFromLogin = true;
                    }
                } else {
                    this.mTargetTabIndex = getCurrentTab();
                    this.mFromLogin = true;
                }
            } else if (i == 3 || i == 4) {
                this.mTargetTabIndex = 0;
                this.mFromLogin = true;
            }
        }
    }

    private void initFragmentTabHost(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a5dce8a", new Object[]{this, context, attributeSet});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.mContainerId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (context instanceof dvd) {
            this.mLoginCallback = (dvd) context;
        }
        super.setOnTabChangedListener(this);
    }

    public static /* synthetic */ Object ipc$super(TBFragmentTabHost tBFragmentTabHost, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1705336120:
                super.setVisibility(((Number) objArr[0]).intValue());
                return null;
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 916363010:
                super.setOnTabChangedListener((TabHost.OnTabChangeListener) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1173054777:
                super.clearAllTabs();
                return null;
            case 1557018756:
                super.setup();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1755658430:
                super.setCurrentTab(((Number) objArr[0]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/navigation/TBFragmentTabHost");
        }
    }

    private void setNavigationBarButtonsColor(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d239f10b", new Object[]{this, activity, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 26) {
            View decorView = activity.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(s14.a(i) ? systemUiVisibility | 16 : systemUiVisibility & (-17));
        }
    }

    private void setNavigationBarColor(Activity activity, int i) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4ec884", new Object[]{this, activity, new Integer(i)});
        } else if (activity != null && (window = activity.getWindow()) != null) {
            window.setNavigationBarColor(i);
        }
    }

    private void setTabSelectedDrawableColorFilter(int i, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b536376a", new Object[]{this, new Integer(i), num});
        } else {
            setTabDrawableColorFilterInner(i, num, true);
        }
    }

    private void setTabWidgetBackgroundInternal(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a58d88d", new Object[]{this, drawable});
            return;
        }
        FrameLayout frameLayout = this.mTabBackground;
        if (frameLayout != null) {
            frameLayout.setBackground(drawable);
        }
    }

    private void setTabsUnselectedDrawableColorFilter(int i, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847d6be4", new Object[]{this, new Integer(i), num});
        } else {
            setTabDrawableColorFilterInner(i, num, false);
        }
    }

    public void addTab(TabHost.TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc949463", new Object[]{this, tabSpec, cls, bundle});
            return;
        }
        tabSpec.setContent(new DummyTabFactory(this.mContext));
        String tag = tabSpec.getTag();
        g gVar = new g(tag, cls, bundle);
        String c2 = y9a.c();
        TLog.loge(c2, TAG, "addTab tab tag: " + tag + ". mAttached: " + this.mAttached);
        if (this.mAttached) {
            Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(tag);
            gVar.e = findFragmentByTag;
            if (findFragmentByTag != null && !findFragmentByTag.isDetached()) {
                FragmentTransaction beginTransaction = this.mFragmentManager.beginTransaction();
                beginTransaction.detach(gVar.e);
                beginTransaction.commitAllowingStateLoss();
            }
        }
        this.mTabs.add(gVar);
        addTab(tabSpec);
    }

    @Override // android.widget.TabHost
    public void clearAllTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45eb6539", new Object[]{this});
            return;
        }
        super.clearAllTabs();
        this.mLastTab = null;
        this.mPreTab = null;
        try {
            Iterator<g> it = this.mTabs.iterator();
            while (it.hasNext()) {
                g next = it.next();
                if (next.e != null) {
                    this.mFragmentManager.beginTransaction().remove(next.e).commitNow();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.mTabs.clear();
    }

    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
            return;
        }
        this.mFromLogin = true;
        this.mTargetTabIndex = getCurrentTab();
    }

    public void fromLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbeff0ae", new Object[]{this, new Boolean(z)});
        } else {
            this.mFromLogin = z;
        }
    }

    public Fragment getCurrentFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("cb9d6b14", new Object[]{this});
        }
        g gVar = this.mCurrentTab;
        if (gVar != null) {
            return gVar.e;
        }
        return null;
    }

    public float getDisplayHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42401bca", new Object[]{this})).floatValue();
        }
        FrameLayout frameLayout = this.mTabBackground;
        if (frameLayout == null) {
            return 0.0f;
        }
        return frameLayout.getHeight();
    }

    public Fragment getFragmentForTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("afe21846", new Object[]{this, str});
        }
        HashMap<String, Fragment> hashMap = this.mFragments;
        if (hashMap != null) {
            return hashMap.get(str);
        }
        return null;
    }

    public FragmentManager getFragmentManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManager) ipChange.ipc$dispatch("97410a9", new Object[]{this});
        }
        return this.mFragmentManager;
    }

    public ArrayList<Fragment> getFragments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("52bc814e", new Object[]{this});
        }
        HashMap<String, Fragment> hashMap = this.mFragments;
        if (hashMap == null || hashMap.size() <= 0) {
            return null;
        }
        return new ArrayList<>(this.mFragments.values());
    }

    public int getLastTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed77c8e3", new Object[]{this})).intValue();
        }
        return this.mTabs.indexOf(this.mPreTab);
    }

    public int getTabCurrentAnimationStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("906bef96", new Object[]{this})).intValue();
        }
        return this.visibilityController.f();
    }

    public NavigationTabIndicatorView getTabViewAtIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NavigationTabIndicatorView) ipChange.ipc$dispatch("649b58d6", new Object[]{this, new Integer(i)});
        }
        if (getTabWidget() == null || i < 0) {
            return null;
        }
        return (NavigationTabIndicatorView) getTabWidget().getChildTabViewAt(i);
    }

    public void handleLoginBroadcast(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e790823", new Object[]{this, loginAction});
        } else if (loginAction != null) {
            if (wpj.n()) {
                handleLoginBroadcastNew(loginAction);
            } else {
                handleLoginBroadcastOld(loginAction);
            }
        }
    }

    public boolean hideNavigation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac744ffb", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!wpj.g()) {
            return false;
        }
        return this.visibilityController.g(z);
    }

    public boolean isNavigationVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ffc363f", new Object[]{this})).booleanValue();
        }
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.mResumed = false;
        }
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.mResumed = true;
        if (this.mFromLogin) {
            setCurrentTab(this.mTargetTabIndex);
            this.mFromLogin = false;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.curTab = getCurrentTabTag();
        g gVar = this.mPreTab;
        if (gVar != null) {
            savedState.preTab = gVar.f12554a;
        } else {
            savedState.preTab = null;
        }
        savedState.fromLogin = this.mFromLogin;
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        dvd dvdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfa8af", new Object[]{this, str});
            return;
        }
        String c2 = y9a.c();
        TLog.loge(c2, TAG, "onTabChanged tabId: " + str);
        long uptimeMillis = SystemClock.uptimeMillis();
        g tabInfoForTag = getTabInfoForTag(str);
        this.mPreTab = this.mCurrentTab;
        if (this.mLastTab != tabInfoForTag) {
            com.taobao.tao.navigation.b bVar = com.taobao.tao.navigation.a.t().get(getCurrentTab());
            com.taobao.tao.navigation.a.E(bVar.e());
            tud tudVar = this.mLauncherTaskNotPreparedCallback;
            if (tudVar != null && !((HomepageFragment.b) tudVar).a()) {
                ((HomepageFragment.b) this.mLauncherTaskNotPreparedCallback).b(getTabInfoIndex(str));
                TLog.loge(y9a.c(), TAG, "onTabChanged, skip doTabChange, launcher task not prepared");
            } else if (!bVar.y() || (dvdVar = this.mLoginCallback) == null || dvdVar.checkLogin()) {
                if (this.mAttached) {
                    FragmentTransaction doTabChanged = doTabChanged(str, null);
                    if (doTabChanged != null) {
                        doTabChanged.commitAllowingStateLoss();
                        String c3 = y9a.c();
                        TLog.loge(c3, TAG, "onTabChanged, committed. tabId: " + str);
                    } else {
                        String c4 = y9a.c();
                        TLog.loge(c4, TAG, "onTabChanged, skip commit. tabId: " + str);
                    }
                }
                TabHost.OnTabChangeListener onTabChangeListener = this.mOnTabChangeListener;
                if (onTabChangeListener != null) {
                    onTabChangeListener.onTabChanged(str);
                }
                CopyOnWriteArrayList<hvd> copyOnWriteArrayList = com.taobao.tao.navigation.a.i;
                if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                    Iterator<hvd> it = com.taobao.tao.navigation.a.i.iterator();
                    while (it.hasNext()) {
                        hvd next = it.next();
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        next.onTabChanged(getCurrentTab(), str);
                        String c5 = y9a.c();
                        TLog.loge(c5, TAG, "onTabChanged: " + (SystemClock.uptimeMillis() - uptimeMillis2) + "  " + next);
                    }
                }
                String c6 = y9a.c();
                TLog.loge(c6, TAG, "onTabChanged, function total time: " + (SystemClock.uptimeMillis() - uptimeMillis));
                NavigationTabIndicatorView currentTabView = getCurrentTabView();
                if (currentTabView != null && currentTabView.mClickTime > 0) {
                    String c7 = y9a.c();
                    TLog.loge(c7, TAG, "tab change from click total time: " + (SystemClock.uptimeMillis() - currentTabView.mClickTime));
                }
            } else {
                this.mLoginCallback.doLogin();
                TLog.loge(y9a.c(), TAG, "onTabChanged, skip doTabChange, do login");
            }
        } else {
            String c8 = y9a.c();
            TLog.loge(c8, TAG, "onTabChanged, don't doTabChange. last tab equals new tab. tabId: " + str);
        }
    }

    public void preloadIndicatorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8e0cd2", new Object[]{this});
        } else if (!wpj.m(this.mContext)) {
            TLog.loge(y9a.c(), TAG, "cancel pre load indicator view, due to switch off");
        } else {
            TabWidget tabWidget = getTabWidget();
            if (tabWidget != null) {
                ArrayList arrayList = new ArrayList(5);
                for (int i = 0; i < tabWidget.getChildCount(); i++) {
                    arrayList.add((NavigationTabIndicatorView) tabWidget.getChildTabViewAt(i));
                }
                Coordinator.execute(new a(arrayList));
            }
        }
    }

    @Override // android.widget.TabHost
    public void setCurrentTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a538be", new Object[]{this, new Integer(i)});
            return;
        }
        String c2 = y9a.c();
        TLog.loge(c2, TAG, "setCurrentTab index: " + i);
        if (this.isUnset) {
            rpj.a(pg1.ATOM_EXT_unset, "setCurrentTab");
        }
        int currentTab = getCurrentTab();
        if (currentTab == getLastTab() || i != currentTab) {
            super.setCurrentTab(i);
        } else {
            onTabChanged(this.mTabs.get(i).f12554a);
        }
    }

    public void setExposureCallback(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8db36043", new Object[]{this, fVar});
        } else {
            this.exposureCallback = fVar;
        }
    }

    public void setLoginCallback(dvd dvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c11ff9d0", new Object[]{this, dvdVar});
        } else {
            this.mLoginCallback = dvdVar;
        }
    }

    @Override // android.widget.TabHost
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("369e9702", new Object[]{this, onTabChangeListener});
        } else {
            this.mOnTabChangeListener = onTabChangeListener;
        }
    }

    public void setTBLauncherTaskNotPreparedCallback(tud tudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70be80e2", new Object[]{this, tudVar});
        } else {
            this.mLauncherTaskNotPreparedCallback = tudVar;
        }
    }

    public void setTabsColorFilter(Integer num, Integer num2, Integer num3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("580f5d75", new Object[]{this, num, num2, num3});
            return;
        }
        String c2 = y9a.c();
        TLog.loge(c2, TAG, "setTabsColorFilter selectedIconColorFilter: " + num + " unselectedIconColorFilter: " + num2 + " backgroundColorFilter: " + num3);
        setTabsUnselectedDrawableColorFilter(-1, num2);
        setTabSelectedDrawableColorFilter(-1, num);
        setAndUpdateNavigationStyle(num3);
    }

    public synchronized void setUnSeletedNavigationTabsColorFilter(int i, Integer num, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff720", new Object[]{this, new Integer(i), num, num2});
            return;
        }
        String c2 = y9a.c();
        TLog.loge(c2, TAG, "setUnselectedNavigationTabsColorFilter index: " + i + " iconColorFilter: " + num + " backgroundColorFilter: " + num2);
        setTabsUnselectedDrawableColorFilter(i, num);
        setAndUpdateNavigationStyle(num2);
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
            return;
        }
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public void updateTabHost() {
        Bundle bundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77966c5b", new Object[]{this});
            return;
        }
        for (int i = 0; i < com.taobao.tao.navigation.a.t().size(); i++) {
            com.taobao.tao.navigation.b bVar = com.taobao.tao.navigation.a.t().get(i);
            TabHost.TabSpec indicator = newTabSpec(bVar.e()).setIndicator(createIndicatorView(i));
            String j = bVar.j();
            if (bVar.i() == null) {
                bundle = new Bundle();
            } else {
                bundle = bVar.i();
            }
            addTab(indicator, j, bundle);
        }
    }

    public void updateTabWidgetStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be86428", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(zpj.b)) {
            s0m.B().N0(getContext()).T(zpj.b).succListener(new c()).failListener(new b()).fetch();
        } else {
            setTabWidgetBackgroundInternal(zpj.f32933a);
        }
        View view = this.mTabDivide;
        if (view != null) {
            view.setBackgroundColor(zpj.c);
        }
    }

    private void setAndUpdateNavigationStyle(Integer num) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2686d1", new Object[]{this, num});
        } else if (zpj.f32933a instanceof ColorDrawable) {
            int intValue = num == null ? -1 : num.intValue();
            Context context = getContext();
            if (num == null && context != null) {
                try {
                    i = ResourcesCompat.getColor(context.getResources(), R.color.uik_divider_color, null);
                } catch (Resources.NotFoundException e2) {
                    TLog.loge("uikit_navigation", TAG, "setAndUpdateNavigationStyle", e2);
                }
            }
            zpj.f32933a = new ColorDrawable(intValue);
            zpj.c = i;
            setTabWidgetBackgroundInternal(zpj.f32933a);
            View view = this.mTabDivide;
            if (view != null) {
                view.setBackgroundColor(zpj.c);
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                setNavigationBarColor(activity, intValue);
                setNavigationBarButtonsColor(activity, intValue);
            }
        }
    }

    public View createIndicatorView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d865b3e6", new Object[]{this, new Integer(i)});
        }
        NavigationTabIndicatorView navigationTabIndicatorView = new NavigationTabIndicatorView(getContext());
        navigationTabIndicatorView.updateStyle(com.taobao.tao.navigation.a.t().get(i), com.taobao.tao.navigation.a.c, false, false);
        navigationTabIndicatorView.mTabHost = this;
        navigationTabIndicatorView.tabIndicatorViewAbilityCallback = getTabIndicatorViewAbilityCallback();
        return navigationTabIndicatorView;
    }

    @Override // android.widget.TabHost
    public NavigationTabIndicatorView getCurrentTabView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NavigationTabIndicatorView) ipChange.ipc$dispatch("557506f9", new Object[]{this});
        }
        if (getTabWidget() == null) {
            return null;
        }
        return (NavigationTabIndicatorView) getTabWidget().getChildTabViewAt(getCurrentTab());
    }

    public boolean hideNavigationAnimate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f94f5d06", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!wpj.g()) {
            return false;
        }
        return this.visibilityController.h(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        TLog.loge(y9a.c(), TAG, "onDetachedFromWindow");
        super.onDetachedFromWindow();
        this.mAttached = false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Fragment fragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
            return;
        }
        TLog.loge(y9a.c(), TAG, "onRestoreInstanceState");
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            TLog.loge(y9a.c(), TAG, "onRestoreInstanceState, state is not instance of TBFragmentTabHost.SavedState. skip");
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        List<Fragment> fragments = this.mFragmentManager.getFragments();
        ArrayList arrayList = new ArrayList(fragments);
        Iterator<com.taobao.tao.navigation.b> it = com.taobao.tao.navigation.a.t().iterator();
        com.taobao.tao.navigation.b bVar = null;
        com.taobao.tao.navigation.b bVar2 = null;
        while (it.hasNext()) {
            com.taobao.tao.navigation.b next = it.next();
            if (next.e().equals(savedState.curTab)) {
                bVar = next;
            }
            if (next.e().equals(savedState.preTab)) {
                bVar2 = next;
            }
            for (Fragment fragment2 : fragments) {
                if (fragment2.getTag().equals(next.e()) || fragment2.getTag().equals("TBAutoSize.ConfigChangeObserver")) {
                    arrayList.remove(fragment2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            FragmentTransaction beginTransaction = this.mFragmentManager.beginTransaction();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                beginTransaction.remove((Fragment) it2.next());
                TLog.loge(y9a.c(), TAG, "onRestoreInstanceState, remove fragment. fragment: " + fragment.getTag());
            }
            beginTransaction.commitAllowingStateLoss();
        }
        if (bVar == null) {
            TLog.loge(y9a.c(), TAG, "onRestoreInstanceState, currentTab is null.");
        } else if (!savedState.fromLogin || this.mLoginCallback == null || !bVar.y() || this.mLoginCallback.checkLogin()) {
            setCurrentTabByTag(savedState.curTab);
            TLog.loge(y9a.c(), TAG, "onRestoreInstanceState, setCurrentTabByTag currentTab:" + savedState.curTab);
        } else if (bVar2 == null || bVar2.y()) {
            setCurrentTab(0);
            TLog.loge(y9a.c(), TAG, "onRestoreInstanceState, setCurrentTab to index 0");
        } else if (!TextUtils.isEmpty(savedState.preTab)) {
            setCurrentTabByTag(savedState.preTab);
            TLog.loge(y9a.c(), TAG, "onRestoreInstanceState, setCurrentTabByTag preTab: " + savedState.preTab);
        }
    }

    public void setup(Context context, FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f102fa7", new Object[]{this, context, fragmentManager});
            return;
        }
        ensureHierarchy(context);
        super.setup();
        this.mContext = context;
        this.mFragmentManager = fragmentManager;
        ensureContent();
        this.mFragmentManager.registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.taobao.tao.navigation.TBFragmentTabHost.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == -1791925260) {
                    super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/navigation/TBFragmentTabHost$1");
            }

            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentResumed(FragmentManager fragmentManager2, Fragment fragment) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("953163f4", new Object[]{this, fragmentManager2, fragment});
                    return;
                }
                super.onFragmentResumed(fragmentManager2, fragment);
                if (TBFragmentTabHost.access$000(TBFragmentTabHost.this) && com.taobao.tao.navigation.a.n() != null && com.taobao.tao.navigation.a.n().contains(fragment.getClass().getName())) {
                    TBFragmentTabHost.access$100(TBFragmentTabHost.this);
                }
            }
        }, false);
    }

    public void unset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc464330", new Object[]{this});
        } else {
            this.isUnset = true;
        }
    }

    private g getTabInfoForTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("fd9a14bd", new Object[]{this, str});
        }
        int size = this.mTabs.size();
        for (int i = 0; i < size; i++) {
            g gVar = this.mTabs.get(i);
            if (gVar.f12554a.equals(str)) {
                return gVar;
            }
        }
        return null;
    }

    private void setTabDrawableColorFilterInner(int i, Integer num, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b368400d", new Object[]{this, new Integer(i), num, new Boolean(z)});
            return;
        }
        Iterator<com.taobao.tao.navigation.b> it = com.taobao.tao.navigation.a.t().iterator();
        while (it.hasNext()) {
            com.taobao.tao.navigation.b next = it.next();
            if (i != next.m()) {
                NavigationTabIndicatorView navigationTabIndicatorView = (NavigationTabIndicatorView) getTabWidget().getChildAt(next.m());
                if (navigationTabIndicatorView != null) {
                    if (z) {
                        if (num == null || next.b0(2)) {
                            navigationTabIndicatorView.setSelectedDrawableColorFilter(num);
                        } else {
                            String c2 = y9a.c();
                            TLog.loge(c2, TAG, "tab shouldFilterApply ICON_FILTER_MODE_SELECTED_APPLY is false. index: " + i);
                        }
                    } else if (num == null || next.b0(4)) {
                        navigationTabIndicatorView.setUnselectedDrawableColorFilter(num);
                    } else {
                        String c3 = y9a.c();
                        TLog.loge(c3, TAG, "tab shouldFilterApply ICON_FILTER_MODE_UNSELECTED_APPLY is false. index: " + i);
                    }
                } else {
                    return;
                }
            }
        }
    }

    private void updateTabWidgetIndicatorViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e03636", new Object[]{this});
        } else if (getTabWidget() != null) {
            for (int i = 0; i < getTabWidget().getTabCount(); i++) {
                NavigationTabIndicatorView navigationTabIndicatorView = (NavigationTabIndicatorView) getTabWidget().getChildAt(i);
                if (navigationTabIndicatorView != null) {
                    if (i == getCurrentTab()) {
                        if (!navigationTabIndicatorView.getSelected()) {
                            navigationTabIndicatorView.setSelect(true, false);
                        }
                    } else if (navigationTabIndicatorView.getSelected()) {
                        navigationTabIndicatorView.setSelect(false, false);
                    }
                }
            }
        }
    }

    public void clearAllTabsWithoutFramgent(int i) {
        Bundle bundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fedc0aa", new Object[]{this, new Integer(i)});
            return;
        }
        super.clearAllTabs();
        if (this.isUnset) {
            rpj.a("isUnset", "clearAllTabsWithoutFramgent");
        }
        this.mLastTab = null;
        this.mPreTab = null;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            fragmentManager.executePendingTransactions();
        }
        for (int i2 = 0; i2 < this.mTabs.size(); i2++) {
            Fragment fragment = this.mTabs.get(i2).e;
            if (fragment != null) {
                com.taobao.tao.navigation.b bVar = com.taobao.tao.navigation.a.t().get(i2);
                if (!fragment.getClass().getName().equals(bVar.j())) {
                    Context context = this.mContext;
                    String j = bVar.j();
                    if (bVar.i() == null) {
                        bundle = new Bundle();
                    } else {
                        bundle = bVar.i();
                    }
                    Fragment instantiate = Fragment.instantiate(context, j, bundle);
                    this.mFragmentManager.beginTransaction().remove(fragment).add(this.mContainerId, instantiate, bVar.e()).detach(instantiate).commitNowAllowingStateLoss();
                }
            }
        }
        this.mTabs.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        dvd dvdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        TLog.loge(y9a.c(), TAG, "onAttachedToWindow");
        super.onAttachedToWindow();
        w4v.d(com.taobao.tao.navigation.a.t());
        updateTabWidgetStyle();
        String currentTabTag = getCurrentTabTag();
        int size = this.mTabs.size();
        FragmentTransaction fragmentTransaction = null;
        for (int i = 0; i < size; i++) {
            g gVar = this.mTabs.get(i);
            Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(gVar.f12554a);
            gVar.e = findFragmentByTag;
            if (findFragmentByTag != null && !findFragmentByTag.isDetached()) {
                if (gVar.f12554a.equals(currentTabTag)) {
                    this.mLastTab = gVar;
                    String c2 = y9a.c();
                    TLog.loge(c2, TAG, "onAttachedToWindow, update last tab to current tab. currentTag: " + currentTabTag);
                } else {
                    if (fragmentTransaction == null) {
                        fragmentTransaction = this.mFragmentManager.beginTransaction();
                    }
                    fragmentTransaction.detach(gVar.e);
                    String c3 = y9a.c();
                    TLog.loge(c3, TAG, "onAttachedToWindow, detach fragment. tab: " + gVar.e.getTag());
                }
            }
        }
        this.mAttached = true;
        g tabInfoForTag = getTabInfoForTag(currentTabTag);
        g gVar2 = this.mLastTab;
        if (gVar2 != tabInfoForTag) {
            com.taobao.tao.navigation.b bVar = com.taobao.tao.navigation.a.t().get(getCurrentTab());
            com.taobao.tao.navigation.a.E(bVar.e());
            if (!bVar.y() || (dvdVar = this.mLoginCallback) == null || dvdVar.checkLogin()) {
                FragmentTransaction doTabChanged = doTabChanged(currentTabTag, fragmentTransaction);
                if (doTabChanged != null) {
                    doTabChanged.commitAllowingStateLoss();
                    this.mFragmentManager.executePendingTransactions();
                } else {
                    String c4 = y9a.c();
                    TLog.loge(c4, TAG, "onAttachedToWindow, doTabChange and committed. currentTag: " + currentTabTag);
                }
                String c5 = y9a.c();
                TLog.loge(c5, TAG, "onAttachedToWindow doTabChanged and committed. currentTag: " + currentTabTag);
            } else {
                this.mLoginCallback.doLogin();
                TLog.loge(y9a.c(), TAG, "onAttachedToWindow, skip doTabChange, do login");
                return;
            }
        } else {
            this.mCurrentTab = gVar2;
            String c6 = y9a.c();
            TLog.loge(c6, TAG, "onAttachedToWindow don't doTabChanged. last tab equals new tab. currentTag: " + currentTabTag);
        }
        if (tabInfoForTag != null && this.mFragmentManager.findFragmentByTag(tabInfoForTag.f12554a) == null && wpj.i()) {
            setCurrentTab(0);
            String c7 = y9a.c();
            TLog.loge(c7, TAG, "onAttachedToWindow, can't find current fragment. setCurrentTab to 0. currentTag: " + currentTabTag);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        String c2 = y9a.c();
        StringBuilder sb = new StringBuilder("onWindowVisibilityChanged is visibility ");
        if (i != 0) {
            z = false;
        }
        sb.append(z);
        TLog.loge(c2, TAG, sb.toString());
        super.onWindowVisibilityChanged(i);
        f fVar = this.exposureCallback;
        if (fVar != null && i == 0) {
            ((a.b) fVar).a();
        }
    }

    public void setNavigationVisibleCallback(bqj bqjVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbc2047", new Object[]{this, bqjVar});
            return;
        }
        this.visibilityController.j(bqjVar);
        String c2 = y9a.c();
        StringBuilder sb = new StringBuilder("setNavigationVisibleCallback is null?");
        if (bqjVar != null) {
            z = false;
        }
        sb.append(z);
        TLog.loge(c2, TAG, sb.toString());
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        String c2 = y9a.c();
        StringBuilder sb = new StringBuilder("set visibility");
        if (i != 0) {
            z = false;
        }
        sb.append(z);
        TLog.loge(c2, TAG, sb.toString());
        super.setVisibility(i);
    }

    private void handleLoginBroadcastNew(LoginAction loginAction) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c00e63", new Object[]{this, loginAction});
            return;
        }
        int i2 = d.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[loginAction.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                com.taobao.tao.navigation.b q = com.taobao.tao.navigation.a.q(getCurrentTab());
                if (q != null) {
                    if (q.y()) {
                        com.taobao.tao.navigation.b q2 = com.taobao.tao.navigation.a.q(getLastTab());
                        if (q2 != null && !q2.y()) {
                            i = getLastTab();
                        }
                    } else {
                        i = getCurrentTab();
                    }
                    this.mFromLogin = true;
                }
            } else if (i2 != 4) {
                i = -1;
                String c2 = y9a.c();
                TLog.loge(c2, TAG, "handleLoginBroadcastNew, loginAction:" + loginAction + ", targetIndex:" + i + ", mFromLogin:" + this.mFromLogin + ", mResumed:" + this.mResumed);
                if (this.mFromLogin && i >= 0) {
                    this.mTargetTabIndex = i;
                    if (this.mResumed) {
                        this.mFromLogin = false;
                        setCurrentTab(i);
                        return;
                    }
                    return;
                }
            }
            i = 0;
            this.mFromLogin = true;
        } else {
            i = getCurrentTab();
            this.mFromLogin = true;
        }
        String c22 = y9a.c();
        TLog.loge(c22, TAG, "handleLoginBroadcastNew, loginAction:" + loginAction + ", targetIndex:" + i + ", mFromLogin:" + this.mFromLogin + ", mResumed:" + this.mResumed);
        if (this.mFromLogin) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final String f12554a;
        public final Class<?> b;
        public final String c;
        public final Bundle d;
        public Fragment e;

        public g(String str, Class<?> cls, Bundle bundle) {
            this.f12554a = str;
            this.b = cls;
            this.d = bundle;
            this.c = null;
        }

        public g(String str, String str2, Bundle bundle) {
            this.f12554a = str;
            this.b = null;
            this.c = str2;
            this.d = bundle;
        }
    }

    public void setup(Context context, FragmentManager fragmentManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f6383c", new Object[]{this, context, fragmentManager, new Integer(i)});
            return;
        }
        ensureHierarchy(context);
        super.setup();
        this.mContext = context;
        this.mFragmentManager = fragmentManager;
        this.mContainerId = i;
        ensureContent();
        this.mRealTabContent.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
        this.mFragmentManager.registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.taobao.tao.navigation.TBFragmentTabHost.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                if (str.hashCode() == -1791925260) {
                    super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/navigation/TBFragmentTabHost$2");
            }

            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentResumed(FragmentManager fragmentManager2, Fragment fragment) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("953163f4", new Object[]{this, fragmentManager2, fragment});
                    return;
                }
                super.onFragmentResumed(fragmentManager2, fragment);
                if (TBFragmentTabHost.access$000(TBFragmentTabHost.this) && com.taobao.tao.navigation.a.n() != null && com.taobao.tao.navigation.a.n().contains(fragment.getClass().getName())) {
                    TBFragmentTabHost.access$100(TBFragmentTabHost.this);
                }
            }
        }, false);
    }

    public TBFragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initFragmentTabHost(context, attributeSet);
        wpj.c();
    }

    public void addTab(TabHost.TabSpec tabSpec, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25d2e5e", new Object[]{this, tabSpec, str, bundle});
            return;
        }
        tabSpec.setContent(new DummyTabFactory(this.mContext));
        String tag = tabSpec.getTag();
        g gVar = new g(tag, str, bundle);
        String c2 = y9a.c();
        TLog.loge(c2, TAG, "addTab tab tag: " + tag + ". mAttached: " + this.mAttached);
        if (this.mAttached) {
            Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(tag);
            gVar.e = findFragmentByTag;
            if (findFragmentByTag != null && !findFragmentByTag.isDetached()) {
                FragmentTransaction beginTransaction = this.mFragmentManager.beginTransaction();
                beginTransaction.detach(gVar.e);
                beginTransaction.commitAllowingStateLoss();
            }
        }
        this.mTabs.add(gVar);
        addTab(tabSpec);
    }
}
