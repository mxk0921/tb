package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.FitWindowsViewGroup;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.appcompat.widget.ViewUtils;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.NavUtils;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.uc.crashsdk.export.LogType;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import tb.h31;
import tb.pg1;
import tb.q31;
import tb.tck;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppCompatDelegateImpl extends AppCompatDelegate implements MenuBuilder.Callback, LayoutInflater.Factory2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXCEPTION_HANDLER_MESSAGE_SUFFIX = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    private static boolean sInstalledExceptionHandler;
    public ActionBar mActionBar;
    private ActionMenuPresenterCallback mActionMenuPresenterCallback;
    public ActionMode mActionMode;
    public PopupWindow mActionModePopup;
    public ActionBarContextView mActionModeView;
    private int mActivityHandlesConfigFlags;
    private boolean mActivityHandlesConfigFlagsChecked;
    public final AppCompatCallback mAppCompatCallback;
    private AppCompatViewInflater mAppCompatViewInflater;
    private AppCompatWindowCallback mAppCompatWindowCallback;
    private AutoNightModeManager mAutoBatteryNightModeManager;
    private AutoNightModeManager mAutoTimeNightModeManager;
    private OnBackInvokedCallback mBackCallback;
    private boolean mBaseContextAttached;
    private boolean mClosingActionMenu;
    public final Context mContext;
    private boolean mCreated;
    private DecorContentParent mDecorContentParent;
    public boolean mDestroyed;
    private OnBackInvokedDispatcher mDispatcher;
    private Configuration mEffectiveConfiguration;
    private boolean mEnableDefaultActionBarUp;
    public ViewPropertyAnimatorCompat mFadeAnim;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private boolean mHandleNativeActionModes;
    public boolean mHasActionBar;
    public final Object mHost;
    public int mInvalidatePanelMenuFeatures;
    public boolean mInvalidatePanelMenuPosted;
    private final Runnable mInvalidatePanelMenuRunnable;
    public boolean mIsFloating;
    private LayoutIncludeDetector mLayoutIncludeDetector;
    private int mLocalNightMode;
    private boolean mLongPressBackDown;
    public MenuInflater mMenuInflater;
    public boolean mOverlayActionBar;
    public boolean mOverlayActionMode;
    private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private PanelFeatureState[] mPanels;
    private PanelFeatureState mPreparedPanel;
    public Runnable mShowActionModePopup;
    private View mStatusGuard;
    public ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private Rect mTempRect1;
    private Rect mTempRect2;
    private int mThemeResId;
    private CharSequence mTitle;
    private TextView mTitleView;
    public Window mWindow;
    public boolean mWindowNoTitle;
    private static final SimpleArrayMap<String, Integer> sLocalNightModes = new SimpleArrayMap<>();
    private static final boolean IS_PRE_LOLLIPOP = false;
    private static final int[] sWindowBackgroundStyleable = {16842836};
    private static final boolean sCanReturnDifferentContext = !"robolectric".equals(Build.FINGERPRINT);

    /* compiled from: Taobao */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$4  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class AnonymousClass4 implements FitWindowsViewGroup.OnFitSystemWindowsListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass4() {
        }

        @Override // androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
        public void onFitSystemWindows(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1fa1c30", new Object[]{this, rect});
            } else {
                rect.top = AppCompatDelegateImpl.this.updateStatusGuard(null, rect);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class ActionBarDrawableToggleImpl implements ActionBarDrawerToggle.Delegate {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ActionBarDrawableToggleImpl() {
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public Context getActionBarThemedContext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("1292726c", new Object[]{this});
            }
            return AppCompatDelegateImpl.this.getActionBarThemedContext();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public Drawable getThemeUpIndicator() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("78f11d12", new Object[]{this});
            }
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getActionBarThemedContext(), (AttributeSet) null, new int[]{R.attr.homeAsUpIndicator});
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4ffc363f", new Object[]{this})).booleanValue();
            }
            ActionBar supportActionBar = AppCompatDelegateImpl.this.getSupportActionBar();
            if (supportActionBar == null || (supportActionBar.getDisplayOptions() & 4) == 0) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c56b0abb", new Object[]{this, new Integer(i)});
                return;
            }
            ActionBar supportActionBar = AppCompatDelegateImpl.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeActionContentDescription(i);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(Drawable drawable, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df99955f", new Object[]{this, drawable, new Integer(i)});
                return;
            }
            ActionBar supportActionBar = AppCompatDelegateImpl.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeAsUpIndicator(drawable);
                supportActionBar.setHomeActionContentDescription(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface ActionBarMenuCallback {
        View onCreatePanelView(int i);

        boolean onPreparePanel(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5ca4aca", new Object[]{this, menuBuilder, new Boolean(z)});
            } else {
                AppCompatDelegateImpl.this.checkCloseActionMenu(menuBuilder);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ff68f2c", new Object[]{this, menuBuilder})).booleanValue();
            }
            Window.Callback windowCallback = AppCompatDelegateImpl.this.getWindowCallback();
            if (windowCallback != null) {
                windowCallback.onMenuOpened(108, menuBuilder);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class ActionModeCallbackWrapperV9 implements ActionMode.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ActionMode.Callback mWrapped;

        public ActionModeCallbackWrapperV9(ActionMode.Callback callback) {
            this.mWrapped = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9256e145", new Object[]{this, actionMode, menuItem})).booleanValue();
            }
            return this.mWrapped.onActionItemClicked(actionMode, menuItem);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cc104483", new Object[]{this, actionMode, menu})).booleanValue();
            }
            return this.mWrapped.onCreateActionMode(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9265a419", new Object[]{this, actionMode});
                return;
            }
            this.mWrapped.onDestroyActionMode(actionMode);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.mActionModePopup != null) {
                appCompatDelegateImpl.mWindow.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.mShowActionModePopup);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.mActionModeView != null) {
                appCompatDelegateImpl2.endOnGoingFadeAnimation();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.mFadeAnim = ViewCompat.animate(appCompatDelegateImpl3.mActionModeView).alpha(0.0f);
                AppCompatDelegateImpl.this.mFadeAnim.setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/app/AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1");
                    }

                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                    public void onAnimationEnd(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("80ae01f5", new Object[]{this, view});
                            return;
                        }
                        AppCompatDelegateImpl.this.mActionModeView.setVisibility(8);
                        AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
                        PopupWindow popupWindow = appCompatDelegateImpl4.mActionModePopup;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                        } else if (appCompatDelegateImpl4.mActionModeView.getParent() instanceof View) {
                            ViewCompat.requestApplyInsets((View) AppCompatDelegateImpl.this.mActionModeView.getParent());
                        }
                        AppCompatDelegateImpl.this.mActionModeView.killMode();
                        AppCompatDelegateImpl.this.mFadeAnim.setListener(null);
                        AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
                        appCompatDelegateImpl5.mFadeAnim = null;
                        ViewCompat.requestApplyInsets(appCompatDelegateImpl5.mSubDecor);
                    }
                });
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            AppCompatCallback appCompatCallback = appCompatDelegateImpl4.mAppCompatCallback;
            if (appCompatCallback != null) {
                appCompatCallback.onSupportActionModeFinished(appCompatDelegateImpl4.mActionMode);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.mActionMode = null;
            ViewCompat.requestApplyInsets(appCompatDelegateImpl5.mSubDecor);
            AppCompatDelegateImpl.this.updateBackInvokedCallbackState();
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d0859236", new Object[]{this, actionMode, menu})).booleanValue();
            }
            ViewCompat.requestApplyInsets(AppCompatDelegateImpl.this.mSubDecor);
            return this.mWrapped.onPrepareActionMode(actionMode, menu);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static boolean isPowerSaveMode(PowerManager powerManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("90bd6d90", new Object[]{powerManager})).booleanValue();
            }
            return powerManager.isPowerSaveMode();
        }

        public static String toLanguageTag(Locale locale) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8ff9d1dd", new Object[]{locale});
            }
            return locale.toLanguageTag();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static void generateConfigDelta_locale(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7e1a6d1", new Object[]{configuration, configuration2, configuration3});
                return;
            }
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (!equals) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        public static LocaleListCompat getLocales(Configuration configuration) {
            LocaleList locales;
            String languageTags;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LocaleListCompat) ipChange.ipc$dispatch("7291807c", new Object[]{configuration});
            }
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            return LocaleListCompat.forLanguageTags(languageTags);
        }

        public static void setDefaultLocales(LocaleListCompat localeListCompat) {
            LocaleList forLanguageTags;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("139c7605", new Object[]{localeListCompat});
                return;
            }
            forLanguageTags = LocaleList.forLanguageTags(localeListCompat.toLanguageTags());
            LocaleList.setDefault(forLanguageTags);
        }

        public static void setLocales(Configuration configuration, LocaleListCompat localeListCompat) {
            LocaleList forLanguageTags;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85396334", new Object[]{configuration, localeListCompat});
                return;
            }
            forLanguageTags = LocaleList.forLanguageTags(localeListCompat.toLanguageTags());
            configuration.setLocales(forLanguageTags);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api26Impl() {
        }

        public static void generateConfigDelta_colorMode(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4190a81", new Object[]{configuration, configuration2, configuration3});
                return;
            }
            i = configuration.colorMode;
            int i9 = i & 3;
            i2 = configuration2.colorMode;
            if (i9 != (i2 & 3)) {
                i7 = configuration3.colorMode;
                i8 = configuration2.colorMode;
                configuration3.colorMode = (3 & i8) | i7;
            }
            i3 = configuration.colorMode;
            int i10 = i3 & 12;
            i4 = configuration2.colorMode;
            if (i10 != (i4 & 12)) {
                i5 = configuration3.colorMode;
                i6 = configuration2.colorMode;
                configuration3.colorMode = i5 | (i6 & 12);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api33Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api33Impl() {
        }

        public static OnBackInvokedDispatcher getOnBackInvokedDispatcher(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return h31.a(ipChange.ipc$dispatch("b9dfab67", new Object[]{activity}));
            }
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        public static OnBackInvokedCallback registerOnBackPressedCallback(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return q31.a(ipChange.ipc$dispatch("ba208b1", new Object[]{obj, appCompatDelegateImpl}));
            }
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback u31Var = new OnBackInvokedCallback() { // from class: tb.u31
                public final void onBackInvoked() {
                    AppCompatDelegateImpl.this.onBackPressed();
                }
            };
            h31.a(obj).registerOnBackInvokedCallback(1000000, u31Var);
            return u31Var;
        }

        public static void unregisterOnBackInvokedCallback(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3eeee", new Object[]{obj, obj2});
            } else {
                h31.a(obj).unregisterOnBackInvokedCallback(q31.a(obj2));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class AppCompatWindowCallback extends WindowCallbackWrapper {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ActionBarMenuCallback mActionBarCallback;
        private boolean mDispatchKeyEventBypassEnabled;
        private boolean mOnContentChangedBypassEnabled;
        private boolean mOnPanelClosedBypassEnabled;

        public AppCompatWindowCallback(Window.Callback callback) {
            super(callback);
        }

        public static /* synthetic */ Object ipc$super(AppCompatWindowCallback appCompatWindowCallback, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2067683862:
                    return new Boolean(super.onPreparePanel(((Number) objArr[0]).intValue(), (View) objArr[1], (Menu) objArr[2]));
                case -2012012406:
                    return new Boolean(super.dispatchKeyShortcutEvent((KeyEvent) objArr[0]));
                case -1910120743:
                    return super.onWindowStartingActionMode((ActionMode.Callback) objArr[0], ((Number) objArr[1]).intValue());
                case -1601511123:
                    super.onPanelClosed(((Number) objArr[0]).intValue(), (Menu) objArr[1]);
                    return null;
                case -1115540218:
                    return super.onWindowStartingActionMode((ActionMode.Callback) objArr[0]);
                case -730211576:
                    return new Boolean(super.onCreatePanelMenu(((Number) objArr[0]).intValue(), (Menu) objArr[1]));
                case 366229479:
                    return new Boolean(super.onMenuOpened(((Number) objArr[0]).intValue(), (Menu) objArr[1]));
                case 1246973220:
                    return new Boolean(super.dispatchKeyEvent((KeyEvent) objArr[0]));
                case 1320984464:
                    return super.onCreatePanelView(((Number) objArr[0]).intValue());
                case 2042035911:
                    super.onProvideKeyboardShortcuts((List) objArr[0], (Menu) objArr[1], ((Number) objArr[2]).intValue());
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/app/AppCompatDelegateImpl$AppCompatWindowCallback");
            }
        }

        public void bypassOnContentChanged(Window.Callback callback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87b699e9", new Object[]{this, callback});
                return;
            }
            try {
                this.mOnContentChangedBypassEnabled = true;
                callback.onContentChanged();
            } finally {
                this.mOnContentChangedBypassEnabled = false;
            }
        }

        public void bypassOnPanelClosed(Window.Callback callback, int i, Menu menu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c481f885", new Object[]{this, callback, new Integer(i), menu});
                return;
            }
            try {
                this.mOnPanelClosedBypassEnabled = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.mOnPanelClosedBypassEnabled = false;
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
            }
            if (this.mDispatchKeyEventBypassEnabled) {
                return getWrapped().dispatchKeyEvent(keyEvent);
            }
            if (AppCompatDelegateImpl.this.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8813208a", new Object[]{this, keyEvent})).booleanValue();
            }
            if (super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.onKeyShortcut(keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onContentChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f48f3b41", new Object[]{this});
            } else if (this.mOnContentChangedBypassEnabled) {
                getWrapped().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View onCreatePanelView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("4ebc9f90", new Object[]{this, new Integer(i)});
            }
            ActionBarMenuCallback actionBarMenuCallback = this.mActionBarCallback;
            if (actionBarMenuCallback == null || (onCreatePanelView = actionBarMenuCallback.onCreatePanelView(i)) == null) {
                return super.onCreatePanelView(i);
            }
            return onCreatePanelView;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("15d437e7", new Object[]{this, new Integer(i), menu})).booleanValue();
            }
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.onMenuOpened(i);
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a08ae12d", new Object[]{this, new Integer(i), menu});
            } else if (this.mOnPanelClosedBypassEnabled) {
                getWrapped().onPanelClosed(i, menu);
            } else {
                super.onPanelClosed(i, menu);
                AppCompatDelegateImpl.this.onPanelClosed(i);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            MenuBuilder menuBuilder;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("84c1a5ea", new Object[]{this, new Integer(i), view, menu})).booleanValue();
            }
            if (menu instanceof MenuBuilder) {
                menuBuilder = (MenuBuilder) menu;
            } else {
                menuBuilder = null;
            }
            if (i == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(true);
            }
            ActionBarMenuCallback actionBarMenuCallback = this.mActionBarCallback;
            if (actionBarMenuCallback == null || !actionBarMenuCallback.onPreparePanel(i)) {
                z = false;
            }
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(false);
            }
            return z;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            MenuBuilder menuBuilder;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79b6fec7", new Object[]{this, list, menu, new Integer(i)});
                return;
            }
            PanelFeatureState panelState = AppCompatDelegateImpl.this.getPanelState(0, true);
            if (panelState == null || (menuBuilder = panelState.menu) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menuBuilder, i);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (android.view.ActionMode) ipChange.ipc$dispatch("bd823506", new Object[]{this, callback});
            }
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.isHandleNativeActionModesEnabled()) {
                return startAsSupportActionMode(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        public void setActionBarCallback(ActionBarMenuCallback actionBarMenuCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c73a6291", new Object[]{this, actionBarMenuCallback});
            } else {
                this.mActionBarCallback = actionBarMenuCallback;
            }
        }

        public final android.view.ActionMode startAsSupportActionMode(ActionMode.Callback callback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (android.view.ActionMode) ipChange.ipc$dispatch("a72ec9f2", new Object[]{this, callback});
            }
            SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(AppCompatDelegateImpl.this.mContext, callback);
            androidx.appcompat.view.ActionMode startSupportActionMode = AppCompatDelegateImpl.this.startSupportActionMode(callbackWrapper);
            if (startSupportActionMode != null) {
                return callbackWrapper.getActionModeWrapper(startSupportActionMode);
            }
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d479db08", new Object[]{this, new Integer(i), menu})).booleanValue();
            }
            if (i != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean bypassDispatchKeyEvent(Window.Callback callback, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e6050abc", new Object[]{this, callback, keyEvent})).booleanValue();
            }
            try {
                this.mDispatchKeyEventBypassEnabled = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.mDispatchKeyEventBypassEnabled = false;
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (android.view.ActionMode) ipChange.ipc$dispatch("8e25ded9", new Object[]{this, callback, new Integer(i)});
            }
            if (!AppCompatDelegateImpl.this.isHandleNativeActionModesEnabled() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return startAsSupportActionMode(callback);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class AutoBatteryNightModeManager extends AutoNightModeManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final PowerManager mPowerManager;

        public AutoBatteryNightModeManager(Context context) {
            super();
            this.mPowerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        public static /* synthetic */ Object ipc$super(AutoBatteryNightModeManager autoBatteryNightModeManager, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/app/AppCompatDelegateImpl$AutoBatteryNightModeManager");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public IntentFilter createIntentFilterForBroadcastReceiver() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IntentFilter) ipChange.ipc$dispatch("9fb8a9bd", new Object[]{this});
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void onChange() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47f89f76", new Object[]{this});
            } else {
                AppCompatDelegateImpl.this.applyDayNight();
            }
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int getApplyableNightMode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dfca7ee3", new Object[]{this})).intValue();
            }
            return Api21Impl.isPowerSaveMode(this.mPowerManager) ? 2 : 1;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public abstract class AutoNightModeManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private BroadcastReceiver mReceiver;

        public AutoNightModeManager() {
        }

        public void cleanup() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("792e92b", new Object[]{this});
                return;
            }
            BroadcastReceiver broadcastReceiver = this.mReceiver;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.mContext.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.mReceiver = null;
            }
        }

        public abstract IntentFilter createIntentFilterForBroadcastReceiver();

        public abstract int getApplyableNightMode();

        public boolean isListening() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("720be6bc", new Object[]{this})).booleanValue();
            }
            if (this.mReceiver != null) {
                return true;
            }
            return false;
        }

        public abstract void onChange();

        public void setup() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cce3884", new Object[]{this});
                return;
            }
            cleanup();
            IntentFilter createIntentFilterForBroadcastReceiver = createIntentFilterForBroadcastReceiver();
            if (createIntentFilterForBroadcastReceiver != null && createIntentFilterForBroadcastReceiver.countActions() != 0) {
                if (this.mReceiver == null) {
                    this.mReceiver = new BroadcastReceiver() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/app/AppCompatDelegateImpl$AutoNightModeManager$1");
                        }

                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                            } else {
                                AutoNightModeManager.this.onChange();
                            }
                        }
                    };
                }
                AppCompatDelegateImpl.this.mContext.registerReceiver(this.mReceiver, createIntentFilterForBroadcastReceiver);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class AutoTimeNightModeManager extends AutoNightModeManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final TwilightManager mTwilightManager;

        public AutoTimeNightModeManager(TwilightManager twilightManager) {
            super();
            this.mTwilightManager = twilightManager;
        }

        public static /* synthetic */ Object ipc$super(AutoTimeNightModeManager autoTimeNightModeManager, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/app/AppCompatDelegateImpl$AutoTimeNightModeManager");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public IntentFilter createIntentFilterForBroadcastReceiver() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IntentFilter) ipChange.ipc$dispatch("9fb8a9bd", new Object[]{this});
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void onChange() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47f89f76", new Object[]{this});
            } else {
                AppCompatDelegateImpl.this.applyDayNight();
            }
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int getApplyableNightMode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dfca7ee3", new Object[]{this})).intValue();
            }
            return this.mTwilightManager.isNight() ? 2 : 1;
        }
    }

    public AppCompatDelegateImpl(Activity activity, AppCompatCallback appCompatCallback) {
        this(activity, null, appCompatCallback, activity);
    }

    private boolean applyApplicationSpecificConfig(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cebedc3b", new Object[]{this, new Boolean(z)})).booleanValue() : applyApplicationSpecificConfig(z, true);
    }

    private void applyFixedSizeWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba6d719e", new Object[]{this});
            return;
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.mSubDecor.findViewById(16908290);
        View decorView = this.mWindow.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(R.styleable.AppCompatTheme);
        obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        int i = R.styleable.AppCompatTheme_windowFixedWidthMajor;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = R.styleable.AppCompatTheme_windowFixedWidthMinor;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = R.styleable.AppCompatTheme_windowFixedHeightMajor;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = R.styleable.AppCompatTheme_windowFixedHeightMinor;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private int calculateNightMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3edac70f", new Object[]{this})).intValue();
        }
        int i = this.mLocalNightMode;
        if (i != -100) {
            return i;
        }
        return AppCompatDelegate.getDefaultNightMode();
    }

    private void cleanupAutoManagers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0bbe00", new Object[]{this});
            return;
        }
        AutoNightModeManager autoNightModeManager = this.mAutoTimeNightModeManager;
        if (autoNightModeManager != null) {
            autoNightModeManager.cleanup();
        }
        AutoNightModeManager autoNightModeManager2 = this.mAutoBatteryNightModeManager;
        if (autoNightModeManager2 != null) {
            autoNightModeManager2.cleanup();
        }
    }

    private ViewGroup createSubDecor() {
        ViewGroup viewGroup;
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("b7b7c4ed", new Object[]{this});
        }
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(R.styleable.AppCompatTheme);
        int i = R.styleable.AppCompatTheme_windowActionBar;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowNoTitle, false)) {
                requestWindowFeature(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                requestWindowFeature(108);
            }
            if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                requestWindowFeature(109);
            }
            if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                requestWindowFeature(10);
            }
            this.mIsFloating = obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            ensureWindow();
            this.mWindow.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.mContext);
            if (this.mWindowNoTitle) {
                viewGroup = this.mOverlayActionMode ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
            } else if (this.mIsFloating) {
                viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                this.mOverlayActionBar = false;
                this.mHasActionBar = false;
            } else if (this.mHasActionBar) {
                TypedValue typedValue = new TypedValue();
                this.mContext.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new ContextThemeWrapper(this.mContext, typedValue.resourceId);
                } else {
                    context = this.mContext;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(R.id.decor_content_parent);
                this.mDecorContentParent = decorContentParent;
                decorContentParent.setWindowCallback(getWindowCallback());
                if (this.mOverlayActionBar) {
                    this.mDecorContentParent.initFeature(109);
                }
                if (this.mFeatureProgress) {
                    this.mDecorContentParent.initFeature(2);
                }
                if (this.mFeatureIndeterminateProgress) {
                    this.mDecorContentParent.initFeature(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new OnApplyWindowInsetsListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (WindowInsetsCompat) ipChange2.ipc$dispatch("eb890e0c", new Object[]{this, view, windowInsetsCompat});
                        }
                        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
                        int updateStatusGuard = AppCompatDelegateImpl.this.updateStatusGuard(windowInsetsCompat, null);
                        if (systemWindowInsetTop != updateStatusGuard) {
                            windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), updateStatusGuard, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                        }
                        return ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                    }
                });
                if (this.mDecorContentParent == null) {
                    this.mTitleView = (TextView) viewGroup.findViewById(R.id.title);
                }
                ViewUtils.makeOptionalFitsSystemWindows(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.mWindow.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.mWindow.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new ContentFrameLayout.OnAttachListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
                    public void onAttachedFromWindow() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("61fbe344", new Object[]{this});
                        }
                    }

                    @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
                    public void onDetachedFromWindow() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3896b092", new Object[]{this});
                        } else {
                            AppCompatDelegateImpl.this.dismissPopups();
                        }
                    }
                });
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.mHasActionBar + ", windowActionBarOverlay: " + this.mOverlayActionBar + ", android:windowIsFloating: " + this.mIsFloating + ", windowActionModeOverlay: " + this.mOverlayActionMode + ", windowNoTitle: " + this.mWindowNoTitle + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void ensureWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2471ab55", new Object[]{this});
            return;
        }
        if (this.mWindow == null) {
            Object obj = this.mHost;
            if (obj instanceof Activity) {
                attachToWindow(((Activity) obj).getWindow());
            }
        }
        if (this.mWindow == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration generateConfigDelta(Configuration configuration, Configuration configuration2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Configuration) ipChange.ipc$dispatch("bd8075c8", new Object[]{configuration, configuration2});
        }
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                Api24Impl.generateConfigDelta_locale(configuration, configuration2, configuration3);
            } else if (!ObjectsCompat.equals(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & tck.DETECT_WIDTH;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & tck.DETECT_WIDTH)) {
                configuration3.screenLayout |= i21 & tck.DETECT_WIDTH;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & LogType.UNEXP_OTHER;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & LogType.UNEXP_OTHER)) {
                configuration3.screenLayout |= i25 & LogType.UNEXP_OTHER;
            }
            if (i5 >= 26) {
                Api26Impl.generateConfigDelta_colorMode(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            int i36 = configuration.densityDpi;
            int i37 = configuration2.densityDpi;
            if (i36 != i37) {
                configuration3.densityDpi = i37;
            }
        }
        return configuration3;
    }

    private AutoNightModeManager getAutoBatteryNightModeManager(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoNightModeManager) ipChange.ipc$dispatch("979770fb", new Object[]{this, context});
        }
        if (this.mAutoBatteryNightModeManager == null) {
            this.mAutoBatteryNightModeManager = new AutoBatteryNightModeManager(context);
        }
        return this.mAutoBatteryNightModeManager;
    }

    private void initWindowDecorActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("228327df", new Object[]{this});
            return;
        }
        ensureSubDecor();
        if (this.mHasActionBar && this.mActionBar == null) {
            Object obj = this.mHost;
            if (obj instanceof Activity) {
                this.mActionBar = new WindowDecorActionBar((Activity) this.mHost, this.mOverlayActionBar);
            } else if (obj instanceof Dialog) {
                this.mActionBar = new WindowDecorActionBar((Dialog) this.mHost);
            }
            ActionBar actionBar = this.mActionBar;
            if (actionBar != null) {
                actionBar.setDefaultDisplayHomeAsUpEnabled(this.mEnableDefaultActionBarUp);
            }
        }
    }

    private boolean initializePanelContent(PanelFeatureState panelFeatureState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14cccebc", new Object[]{this, panelFeatureState})).booleanValue();
        }
        View view = panelFeatureState.createdPanelView;
        if (view != null) {
            panelFeatureState.shownPanelView = view;
            return true;
        } else if (panelFeatureState.menu == null) {
            return false;
        } else {
            if (this.mPanelMenuPresenterCallback == null) {
                this.mPanelMenuPresenterCallback = new PanelMenuPresenterCallback();
            }
            View view2 = (View) panelFeatureState.getListMenuView(this.mPanelMenuPresenterCallback);
            panelFeatureState.shownPanelView = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    private boolean initializePanelMenu(PanelFeatureState panelFeatureState) {
        Resources.Theme theme;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a07c520a", new Object[]{this, panelFeatureState})).booleanValue();
        }
        Context context = this.mContext;
        int i = panelFeatureState.featureId;
        if ((i == 0 || i == 108) && this.mDecorContentParent != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                contextThemeWrapper.getTheme().setTo(theme);
                context = contextThemeWrapper;
            }
        }
        MenuBuilder menuBuilder = new MenuBuilder(context);
        menuBuilder.setCallback(this);
        panelFeatureState.setMenu(menuBuilder);
        return true;
    }

    private void invalidatePanelMenu(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d3c1d4", new Object[]{this, new Integer(i)});
            return;
        }
        this.mInvalidatePanelMenuFeatures = (1 << i) | this.mInvalidatePanelMenuFeatures;
        if (!this.mInvalidatePanelMenuPosted) {
            ViewCompat.postOnAnimation(this.mWindow.getDecorView(), this.mInvalidatePanelMenuRunnable);
            this.mInvalidatePanelMenuPosted = true;
        }
    }

    public static /* synthetic */ Object ipc$super(AppCompatDelegateImpl appCompatDelegateImpl, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -661230208) {
            return super.attachBaseContext2((Context) objArr[0]);
        }
        if (hashCode == 509211859) {
            super.setOnBackInvokedDispatcher(h31.a(objArr[0]));
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/appcompat/app/AppCompatDelegateImpl");
    }

    private boolean onKeyUpPanel(int i, KeyEvent keyEvent) {
        AudioManager audioManager;
        boolean z;
        DecorContentParent decorContentParent;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2421ea6d", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (this.mActionMode != null) {
            return false;
        }
        PanelFeatureState panelState = getPanelState(i, true);
        if (i != 0 || (decorContentParent = this.mDecorContentParent) == null || !decorContentParent.canShowOverflowMenu() || ViewConfiguration.get(this.mContext).hasPermanentMenuKey()) {
            boolean z3 = panelState.isOpen;
            if (z3 || panelState.isHandled) {
                closePanel(panelState, true);
                z2 = z3;
            } else {
                if (panelState.isPrepared) {
                    if (panelState.refreshMenuContent) {
                        panelState.isPrepared = false;
                        z = preparePanel(panelState, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        openPanel(panelState, keyEvent);
                    }
                }
                z2 = false;
            }
            if (z2 && (audioManager = (AudioManager) this.mContext.getApplicationContext().getSystemService("audio")) != null) {
                audioManager.playSoundEffect(0);
            }
            return z2;
        }
        if (!this.mDecorContentParent.isOverflowMenuShowing()) {
            if (!this.mDestroyed && preparePanel(panelState, keyEvent)) {
                z2 = this.mDecorContentParent.showOverflowMenu();
            }
            z2 = false;
        } else {
            z2 = this.mDecorContentParent.hideOverflowMenu();
        }
        if (z2) {
            audioManager.playSoundEffect(0);
        }
        return z2;
    }

    private boolean performPanelShortcut(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        MenuBuilder menuBuilder;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19bef792", new Object[]{this, panelFeatureState, new Integer(i), keyEvent, new Integer(i2)})).booleanValue();
        }
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.isPrepared || preparePanel(panelFeatureState, keyEvent)) && (menuBuilder = panelFeatureState.menu) != null) {
            z = menuBuilder.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.mDecorContentParent == null) {
            closePanel(panelFeatureState, true);
        }
        return z;
    }

    private boolean preparePanel(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z;
        int i;
        boolean z2;
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        DecorContentParent decorContentParent3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82ef6850", new Object[]{this, panelFeatureState, keyEvent})).booleanValue();
        }
        if (this.mDestroyed) {
            return false;
        }
        if (panelFeatureState.isPrepared) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.mPreparedPanel;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            closePanel(panelFeatureState2, false);
        }
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null) {
            panelFeatureState.createdPanelView = windowCallback.onCreatePanelView(panelFeatureState.featureId);
        }
        int i2 = panelFeatureState.featureId;
        if (i2 == 0 || i2 == 108) {
            z = true;
        } else {
            z = false;
        }
        if (z && (decorContentParent3 = this.mDecorContentParent) != null) {
            decorContentParent3.setMenuPrepared();
        }
        if (panelFeatureState.createdPanelView == null && (!z || !(peekSupportActionBar() instanceof ToolbarActionBar))) {
            MenuBuilder menuBuilder = panelFeatureState.menu;
            if (menuBuilder == null || panelFeatureState.refreshMenuContent) {
                if (menuBuilder == null && (!initializePanelMenu(panelFeatureState) || panelFeatureState.menu == null)) {
                    return false;
                }
                if (z && this.mDecorContentParent != null) {
                    if (this.mActionMenuPresenterCallback == null) {
                        this.mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
                    }
                    this.mDecorContentParent.setMenu(panelFeatureState.menu, this.mActionMenuPresenterCallback);
                }
                panelFeatureState.menu.stopDispatchingItemsChanged();
                if (!windowCallback.onCreatePanelMenu(panelFeatureState.featureId, panelFeatureState.menu)) {
                    panelFeatureState.setMenu(null);
                    if (z && (decorContentParent2 = this.mDecorContentParent) != null) {
                        decorContentParent2.setMenu(null, this.mActionMenuPresenterCallback);
                    }
                    return false;
                }
                panelFeatureState.refreshMenuContent = false;
            }
            panelFeatureState.menu.stopDispatchingItemsChanged();
            Bundle bundle = panelFeatureState.frozenActionViewState;
            if (bundle != null) {
                panelFeatureState.menu.restoreActionViewStates(bundle);
                panelFeatureState.frozenActionViewState = null;
            }
            if (!windowCallback.onPreparePanel(0, panelFeatureState.createdPanelView, panelFeatureState.menu)) {
                if (z && (decorContentParent = this.mDecorContentParent) != null) {
                    decorContentParent.setMenu(null, this.mActionMenuPresenterCallback);
                }
                panelFeatureState.menu.startDispatchingItemsChanged();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            panelFeatureState.qwertyMode = z2;
            panelFeatureState.menu.setQwertyMode(z2);
            panelFeatureState.menu.startDispatchingItemsChanged();
        }
        panelFeatureState.isPrepared = true;
        panelFeatureState.isHandled = false;
        this.mPreparedPanel = panelFeatureState;
        return true;
    }

    private void reopenMenu(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82376b1", new Object[]{this, new Boolean(z)});
            return;
        }
        DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent == null || !decorContentParent.canShowOverflowMenu() || (ViewConfiguration.get(this.mContext).hasPermanentMenuKey() && !this.mDecorContentParent.isOverflowMenuShowPending())) {
            PanelFeatureState panelState = getPanelState(0, true);
            panelState.refreshDecorView = true;
            closePanel(panelState, false);
            openPanel(panelState, null);
            return;
        }
        Window.Callback windowCallback = getWindowCallback();
        if (this.mDecorContentParent.isOverflowMenuShowing() && z) {
            this.mDecorContentParent.hideOverflowMenu();
            if (!this.mDestroyed) {
                windowCallback.onPanelClosed(108, getPanelState(0, true).menu);
            }
        } else if (windowCallback != null && !this.mDestroyed) {
            if (this.mInvalidatePanelMenuPosted && (this.mInvalidatePanelMenuFeatures & 1) != 0) {
                this.mWindow.getDecorView().removeCallbacks(this.mInvalidatePanelMenuRunnable);
                this.mInvalidatePanelMenuRunnable.run();
            }
            PanelFeatureState panelState2 = getPanelState(0, true);
            MenuBuilder menuBuilder = panelState2.menu;
            if (menuBuilder != null && !panelState2.refreshMenuContent && windowCallback.onPreparePanel(0, panelState2.createdPanelView, menuBuilder)) {
                windowCallback.onMenuOpened(108, panelState2.menu);
                this.mDecorContentParent.showOverflowMenu();
            }
        }
    }

    private int sanitizeWindowFeatureId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e427f957", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 8) {
            return 108;
        }
        if (i == 9) {
            return 109;
        }
        return i;
    }

    private boolean shouldInheritContext(ViewParent viewParent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1afb7a3e", new Object[]{this, viewParent})).booleanValue();
        }
        if (viewParent == null) {
            return false;
        }
        View decorView = this.mWindow.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private void throwFeatureRequestIfSubDecorInstalled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73a2eca0", new Object[]{this});
        } else if (this.mSubDecorInstalled) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private AppCompatActivity tryUnwrapContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppCompatActivity) ipChange.ipc$dispatch("5925c41b", new Object[]{this});
        }
        for (Context context = this.mContext; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof AppCompatActivity) {
                return (AppCompatActivity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void updateActivityConfiguration(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb2716b", new Object[]{this, configuration});
            return;
        }
        Activity activity = (Activity) this.mHost;
        if (activity instanceof LifecycleOwner) {
            if (((LifecycleOwner) activity).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (this.mCreated && !this.mDestroyed) {
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean updateAppConfiguration(int r12, androidx.core.os.LocaleListCompat r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.updateAppConfiguration(int, androidx.core.os.LocaleListCompat, boolean):boolean");
    }

    private void updateResourcesConfiguration(int i, LocaleListCompat localeListCompat, boolean z, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11cdb2c0", new Object[]{this, new Integer(i), localeListCompat, new Boolean(z), configuration});
            return;
        }
        Resources resources = this.mContext.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        if (localeListCompat != null) {
            setConfigurationLocales(configuration2, localeListCompat);
        }
        resources.updateConfiguration(configuration2, null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            ResourcesFlusher.flush(resources);
        }
        int i3 = this.mThemeResId;
        if (i3 != 0) {
            this.mContext.setTheme(i3);
            if (i2 >= 23) {
                this.mContext.getTheme().applyStyle(this.mThemeResId, true);
            }
        }
        if (z && (this.mHost instanceof Activity)) {
            updateActivityConfiguration(configuration2);
        }
    }

    private void updateStatusGuardColor(View view) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b6092", new Object[]{this, view});
            return;
        }
        if ((ViewCompat.getWindowSystemUiVisibility(view) & 8192) != 0) {
            i = ContextCompat.getColor(this.mContext, R.color.abc_decor_view_status_guard_light);
        } else {
            i = ContextCompat.getColor(this.mContext, R.color.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(i);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4ac66f", new Object[]{this, view, layoutParams});
            return;
        }
        ensureSubDecor();
        ((ViewGroup) this.mSubDecor.findViewById(16908290)).addView(view, layoutParams);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean applyAppLocales() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0b7e391", new Object[]{this})).booleanValue();
        }
        if (AppCompatDelegate.isAutoStorageOptedIn(this.mContext) && AppCompatDelegate.getRequestedAppLocales() != null && !AppCompatDelegate.getRequestedAppLocales().equals(AppCompatDelegate.getStoredAppLocales())) {
            asyncExecuteSyncRequestedAndStoredLocales(this.mContext);
        }
        return applyApplicationSpecificConfig(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean applyDayNight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b012af5", new Object[]{this})).booleanValue();
        }
        return applyApplicationSpecificConfig(true);
    }

    public LocaleListCompat calculateApplicationLocales(Context context) {
        LocaleListCompat requestedAppLocales;
        LocaleListCompat localeListCompat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("4151e788", new Object[]{this, context});
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (requestedAppLocales = AppCompatDelegate.getRequestedAppLocales()) == null) {
            return null;
        }
        LocaleListCompat configurationLocales = getConfigurationLocales(context.getApplicationContext().getResources().getConfiguration());
        if (i >= 24) {
            localeListCompat = LocaleOverlayHelper.combineLocalesIfOverlayExists(requestedAppLocales, configurationLocales);
        } else if (requestedAppLocales.isEmpty()) {
            localeListCompat = LocaleListCompat.getEmptyLocaleList();
        } else {
            localeListCompat = LocaleListCompat.forLanguageTags(Api21Impl.toLanguageTag(requestedAppLocales.get(0)));
        }
        if (localeListCompat.isEmpty()) {
            return configurationLocales;
        }
        return localeListCompat;
    }

    public void callOnPanelClosed(int i, PanelFeatureState panelFeatureState, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4dc82c3", new Object[]{this, new Integer(i), panelFeatureState, menu});
            return;
        }
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.mPanels;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.menu;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.isOpen) && !this.mDestroyed) {
            this.mAppCompatWindowCallback.bypassOnPanelClosed(this.mWindow.getCallback(), i, menu);
        }
    }

    public void checkCloseActionMenu(MenuBuilder menuBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63d6cd7", new Object[]{this, menuBuilder});
        } else if (!this.mClosingActionMenu) {
            this.mClosingActionMenu = true;
            this.mDecorContentParent.dismissPopups();
            Window.Callback windowCallback = getWindowCallback();
            if (windowCallback != null && !this.mDestroyed) {
                windowCallback.onPanelClosed(108, menuBuilder);
            }
            this.mClosingActionMenu = false;
        }
    }

    public void closePanel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a1bbf0", new Object[]{this, new Integer(i)});
        } else {
            closePanel(getPanelState(i, true), true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public View createView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.mAppCompatViewInflater == null) {
            TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(R.styleable.AppCompatTheme);
            String string = obtainStyledAttributes.getString(R.styleable.AppCompatTheme_viewInflaterClass);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.mAppCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.mAppCompatViewInflater = (AppCompatViewInflater) this.mContext.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    this.mAppCompatViewInflater = new AppCompatViewInflater();
                }
            }
        }
        boolean z3 = IS_PRE_LOLLIPOP;
        if (z3) {
            if (this.mLayoutIncludeDetector == null) {
                this.mLayoutIncludeDetector = new LayoutIncludeDetector();
            }
            if (this.mLayoutIncludeDetector.detect(attributeSet)) {
                z = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    z2 = shouldInheritContext((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z2 = true;
                }
                z = z2;
            }
        } else {
            z = false;
        }
        return this.mAppCompatViewInflater.createView(view, str, context, attributeSet, z, z3, true, VectorEnabledTintResources.shouldBeUsed());
    }

    public void dismissPopups() {
        MenuBuilder menuBuilder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c15a9878", new Object[]{this});
            return;
        }
        DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (this.mActionModePopup != null) {
            this.mWindow.getDecorView().removeCallbacks(this.mShowActionModePopup);
            if (this.mActionModePopup.isShowing()) {
                try {
                    this.mActionModePopup.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.mActionModePopup = null;
        }
        endOnGoingFadeAnimation();
        PanelFeatureState panelState = getPanelState(0, false);
        if (panelState != null && (menuBuilder = panelState.menu) != null) {
            menuBuilder.close();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
        }
        Object obj = this.mHost;
        if (((obj instanceof KeyEventDispatcher.Component) || (obj instanceof AppCompatDialog)) && (decorView = this.mWindow.getDecorView()) != null && KeyEventDispatcher.dispatchBeforeHierarchy(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.mAppCompatWindowCallback.bypassDispatchKeyEvent(this.mWindow.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            return onKeyDown(keyCode, keyEvent);
        }
        return onKeyUp(keyCode, keyEvent);
    }

    public void endOnGoingFadeAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5344b6cf", new Object[]{this});
            return;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.mFadeAnim;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
    }

    public PanelFeatureState findMenuPanel(Menu menu) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PanelFeatureState) ipChange.ipc$dispatch("5a0eb85d", new Object[]{this, menu});
        }
        PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        if (panelFeatureStateArr != null) {
            i = panelFeatureStateArr.length;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
            if (panelFeatureState != null && panelFeatureState.menu == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public <T extends View> T findViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)}));
        }
        ensureSubDecor();
        return (T) this.mWindow.findViewById(i);
    }

    public final Context getActionBarThemedContext() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1292726c", new Object[]{this});
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            context = supportActionBar.getThemedContext();
        } else {
            context = null;
        }
        if (context == null) {
            return this.mContext;
        }
        return context;
    }

    public final AutoNightModeManager getAutoTimeNightModeManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AutoNightModeManager) ipChange.ipc$dispatch("7272a4bf", new Object[]{this}) : getAutoTimeNightModeManager(this.mContext);
    }

    public LocaleListCompat getConfigurationLocales(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("d721be66", new Object[]{this, configuration});
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.getLocales(configuration);
        }
        return LocaleListCompat.forLanguageTags(Api21Impl.toLanguageTag(configuration.locale));
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public Context getContextForDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("4fc88334", new Object[]{this});
        }
        return this.mContext;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionBarDrawerToggle.Delegate) ipChange.ipc$dispatch("900955f1", new Object[]{this});
        }
        return new ActionBarDrawableToggleImpl();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public int getLocalNightMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9328bd20", new Object[]{this})).intValue();
        }
        return this.mLocalNightMode;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public MenuInflater getMenuInflater() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuInflater) ipChange.ipc$dispatch("fc0e7c4", new Object[]{this});
        }
        if (this.mMenuInflater == null) {
            initWindowDecorActionBar();
            ActionBar actionBar = this.mActionBar;
            if (actionBar != null) {
                context = actionBar.getThemedContext();
            } else {
                context = this.mContext;
            }
            this.mMenuInflater = new SupportMenuInflater(context);
        }
        return this.mMenuInflater;
    }

    public ViewGroup getSubDecor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2ddee853", new Object[]{this});
        }
        return this.mSubDecor;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public ActionBar getSupportActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionBar) ipChange.ipc$dispatch("e9bb2ffd", new Object[]{this});
        }
        initWindowDecorActionBar();
        return this.mActionBar;
    }

    public final CharSequence getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1db95d71", new Object[]{this});
        }
        Object obj = this.mHost;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.mTitle;
    }

    public final Window.Callback getWindowCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window.Callback) ipChange.ipc$dispatch("5a807824", new Object[]{this});
        }
        return this.mWindow.getCallback();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean hasWindowFeature(int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cbdd274", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int sanitizeWindowFeatureId = sanitizeWindowFeatureId(i);
        if (sanitizeWindowFeatureId == 1) {
            z = this.mWindowNoTitle;
        } else if (sanitizeWindowFeatureId == 2) {
            z = this.mFeatureProgress;
        } else if (sanitizeWindowFeatureId == 5) {
            z = this.mFeatureIndeterminateProgress;
        } else if (sanitizeWindowFeatureId == 10) {
            z = this.mOverlayActionMode;
        } else if (sanitizeWindowFeatureId == 108) {
            z = this.mHasActionBar;
        } else if (sanitizeWindowFeatureId != 109) {
            z = false;
        } else {
            z = this.mOverlayActionBar;
        }
        if (z || this.mWindow.hasFeature(i)) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void installViewFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ade2d91", new Object[]{this});
            return;
        }
        LayoutInflater from = LayoutInflater.from(this.mContext);
        if (from.getFactory() == null) {
            LayoutInflaterCompat.setFactory2(from, this);
        } else {
            boolean z = from.getFactory2() instanceof AppCompatDelegateImpl;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void invalidateOptionsMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2380c869", new Object[]{this});
        } else if (peekSupportActionBar() != null && !getSupportActionBar().invalidateOptionsMenu()) {
            invalidatePanelMenu(0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean isHandleNativeActionModesEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c15a25b", new Object[]{this})).booleanValue();
        }
        return this.mHandleNativeActionModes;
    }

    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        boolean z = this.mLongPressBackDown;
        this.mLongPressBackDown = false;
        PanelFeatureState panelState = getPanelState(0, false);
        if (panelState == null || !panelState.isOpen) {
            androidx.appcompat.view.ActionMode actionMode = this.mActionMode;
            if (actionMode != null) {
                actionMode.finish();
                return true;
            }
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar == null || !supportActionBar.collapseActionView()) {
                return false;
            }
            return true;
        }
        if (!z) {
            closePanel(panelState, true);
        }
        return true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4fe43b3d", new Object[]{this, view, str, context, attributeSet}) : createView(view, str, context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDestroy() {
        /*
            r4 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = androidx.appcompat.app.AppCompatDelegateImpl.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0012
            java.lang.String r2 = "a6532022"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r4
            r1.ipc$dispatch(r2, r0)
            return
        L_0x0012:
            java.lang.Object r1 = r4.mHost
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x001b
            androidx.appcompat.app.AppCompatDelegate.removeActivityDelegate(r4)
        L_0x001b:
            boolean r1 = r4.mInvalidatePanelMenuPosted
            if (r1 == 0) goto L_0x002a
            android.view.Window r1 = r4.mWindow
            android.view.View r1 = r1.getDecorView()
            java.lang.Runnable r2 = r4.mInvalidatePanelMenuRunnable
            r1.removeCallbacks(r2)
        L_0x002a:
            r4.mDestroyed = r0
            int r0 = r4.mLocalNightMode
            r1 = -100
            if (r0 == r1) goto L_0x0056
            java.lang.Object r0 = r4.mHost
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0056
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0056
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.sLocalNightModes
            java.lang.Object r1 = r4.mHost
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r4.mLocalNightMode
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0065
        L_0x0056:
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.sLocalNightModes
            java.lang.Object r1 = r4.mHost
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0065:
            androidx.appcompat.app.ActionBar r0 = r4.mActionBar
            if (r0 == 0) goto L_0x006c
            r0.onDestroy()
        L_0x006c:
            r4.cleanupAutoManagers()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.onDestroy():void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.mLongPressBackDown = z;
        } else if (i == 82) {
            onKeyDownPanel(0, keyEvent);
            return true;
        }
        return false;
    }

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bee514a", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null && supportActionBar.onKeyShortcut(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.mPreparedPanel;
        if (panelFeatureState == null || !performPanelShortcut(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.mPreparedPanel == null) {
                PanelFeatureState panelState = getPanelState(0, true);
                preparePanel(panelState, keyEvent);
                boolean performPanelShortcut = performPanelShortcut(panelState, keyEvent.getKeyCode(), keyEvent, 1);
                panelState.isPrepared = false;
                if (performPanelShortcut) {
                    return true;
                }
            }
            return false;
        }
        PanelFeatureState panelFeatureState2 = this.mPreparedPanel;
        if (panelFeatureState2 != null) {
            panelFeatureState2.isHandled = true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        PanelFeatureState findMenuPanel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5a05a4b", new Object[]{this, menuBuilder, menuItem})).booleanValue();
        }
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback == null || this.mDestroyed || (findMenuPanel = findMenuPanel(menuBuilder.getRootMenu())) == null) {
            return false;
        }
        return windowCallback.onMenuItemSelected(findMenuPanel.featureId, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public void onMenuModeChange(MenuBuilder menuBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f6216e3", new Object[]{this, menuBuilder});
        } else {
            reopenMenu(true);
        }
    }

    public void onMenuOpened(int i) {
        ActionBar supportActionBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8adcb1d5", new Object[]{this, new Integer(i)});
        } else if (i == 108 && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.dispatchMenuVisibilityChanged(true);
        }
    }

    public void onPanelClosed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa648cb", new Object[]{this, new Integer(i)});
        } else if (i == 108) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.dispatchMenuVisibilityChanged(false);
            }
        } else if (i == 0) {
            PanelFeatureState panelState = getPanelState(i, true);
            if (panelState.isOpen) {
                closePanel(panelState, false);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d697592", new Object[]{this, bundle});
        } else {
            ensureSubDecor();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9f42b3", new Object[]{this});
            return;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            applyApplicationSpecificConfig(true, false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
        }
    }

    public void onSubDecorInstalled(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7349c", new Object[]{this, viewGroup});
        }
    }

    public final ActionBar peekSupportActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionBar) ipChange.ipc$dispatch("6d1b0718", new Object[]{this});
        }
        return this.mActionBar;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean requestWindowFeature(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c320ff29", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int sanitizeWindowFeatureId = sanitizeWindowFeatureId(i);
        if (this.mWindowNoTitle && sanitizeWindowFeatureId == 108) {
            return false;
        }
        if (this.mHasActionBar && sanitizeWindowFeatureId == 1) {
            this.mHasActionBar = false;
        }
        if (sanitizeWindowFeatureId == 1) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mWindowNoTitle = true;
            return true;
        } else if (sanitizeWindowFeatureId == 2) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mFeatureProgress = true;
            return true;
        } else if (sanitizeWindowFeatureId == 5) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mFeatureIndeterminateProgress = true;
            return true;
        } else if (sanitizeWindowFeatureId == 10) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mOverlayActionMode = true;
            return true;
        } else if (sanitizeWindowFeatureId == 108) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mHasActionBar = true;
            return true;
        } else if (sanitizeWindowFeatureId != 109) {
            return this.mWindow.requestFeature(sanitizeWindowFeatureId);
        } else {
            throwFeatureRequestIfSubDecorInstalled();
            this.mOverlayActionBar = true;
            return true;
        }
    }

    public void setConfigurationLocales(Configuration configuration, LocaleListCompat localeListCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4ee622", new Object[]{this, configuration, localeListCompat});
        } else if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.setLocales(configuration, localeListCompat);
        } else {
            configuration.setLocale(localeListCompat.get(0));
            configuration.setLayoutDirection(localeListCompat.get(0));
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
            return;
        }
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    public void setDefaultLocalesForLocaleList(LocaleListCompat localeListCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4f6538", new Object[]{this, localeListCompat});
        } else if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.setDefaultLocales(localeListCompat);
        } else {
            Locale.setDefault(localeListCompat.get(0));
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setHandleNativeActionModesEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e45ba125", new Object[]{this, new Boolean(z)});
        } else {
            this.mHandleNativeActionModes = z;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setLocalNightMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20341aea", new Object[]{this, new Integer(i)});
        } else if (this.mLocalNightMode != i) {
            this.mLocalNightMode = i;
            if (this.mBaseContextAttached) {
                applyDayNight();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e59f4d3", new Object[]{this, onBackInvokedDispatcher});
            return;
        }
        super.setOnBackInvokedDispatcher(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.mDispatcher;
        if (!(onBackInvokedDispatcher2 == null || (onBackInvokedCallback = this.mBackCallback) == null)) {
            Api33Impl.unregisterOnBackInvokedCallback(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.mBackCallback = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.mHost;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.mDispatcher = Api33Impl.getOnBackInvokedDispatcher((Activity) this.mHost);
                updateBackInvokedCallbackState();
            }
        }
        this.mDispatcher = onBackInvokedDispatcher;
        updateBackInvokedCallbackState();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setSupportActionBar(Toolbar toolbar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f31ba48", new Object[]{this, toolbar});
        } else if (this.mHost instanceof Activity) {
            ActionBar supportActionBar = getSupportActionBar();
            if (!(supportActionBar instanceof WindowDecorActionBar)) {
                this.mMenuInflater = null;
                if (supportActionBar != null) {
                    supportActionBar.onDestroy();
                }
                this.mActionBar = null;
                if (toolbar != null) {
                    ToolbarActionBar toolbarActionBar = new ToolbarActionBar(toolbar, getTitle(), this.mAppCompatWindowCallback);
                    this.mActionBar = toolbarActionBar;
                    this.mAppCompatWindowCallback.setActionBarCallback(toolbarActionBar.mMenuCallback);
                    toolbar.setBackInvokedCallbackEnabled(true);
                } else {
                    this.mAppCompatWindowCallback.setActionBarCallback(null);
                }
                invalidateOptionsMenu();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setTheme(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4c4535", new Object[]{this, new Integer(i)});
        } else {
            this.mThemeResId = i;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70050a41", new Object[]{this, charSequence});
            return;
        }
        this.mTitle = charSequence;
        DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
        } else if (peekSupportActionBar() != null) {
            peekSupportActionBar().setWindowTitle(charSequence);
        } else {
            TextView textView = this.mTitleView;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public final boolean shouldAnimateActionModeView() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a656c317", new Object[]{this})).booleanValue();
        }
        if (!this.mSubDecorInstalled || (viewGroup = this.mSubDecor) == null || !viewGroup.isLaidOut()) {
            return false;
        }
        return true;
    }

    public boolean shouldRegisterBackInvokedCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7173189f", new Object[]{this})).booleanValue();
        }
        if (this.mDispatcher == null) {
            return false;
        }
        PanelFeatureState panelState = getPanelState(0, false);
        if ((panelState == null || !panelState.isOpen) && this.mActionMode == null) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public androidx.appcompat.view.ActionMode startSupportActionMode(ActionMode.Callback callback) {
        AppCompatCallback appCompatCallback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (androidx.appcompat.view.ActionMode) ipChange.ipc$dispatch("e3b481f8", new Object[]{this, callback});
        }
        if (callback != null) {
            androidx.appcompat.view.ActionMode actionMode = this.mActionMode;
            if (actionMode != null) {
                actionMode.finish();
            }
            ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9 = new ActionModeCallbackWrapperV9(callback);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                androidx.appcompat.view.ActionMode startActionMode = supportActionBar.startActionMode(actionModeCallbackWrapperV9);
                this.mActionMode = startActionMode;
                if (!(startActionMode == null || (appCompatCallback = this.mAppCompatCallback) == null)) {
                    appCompatCallback.onSupportActionModeStarted(startActionMode);
                }
            }
            if (this.mActionMode == null) {
                this.mActionMode = startSupportActionModeFromWindow(actionModeCallbackWrapperV9);
            }
            updateBackInvokedCallbackState();
            return this.mActionMode;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public void updateBackInvokedCallbackState() {
        OnBackInvokedCallback onBackInvokedCallback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a219b7", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 33) {
            boolean shouldRegisterBackInvokedCallback = shouldRegisterBackInvokedCallback();
            if (shouldRegisterBackInvokedCallback && this.mBackCallback == null) {
                this.mBackCallback = Api33Impl.registerOnBackPressedCallback(this.mDispatcher, this);
            } else if (!shouldRegisterBackInvokedCallback && (onBackInvokedCallback = this.mBackCallback) != null) {
                Api33Impl.unregisterOnBackInvokedCallback(this.mDispatcher, onBackInvokedCallback);
                this.mBackCallback = null;
            }
        }
    }

    public final int updateStatusGuard(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        boolean z3 = true;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c662f364", new Object[]{this, windowInsetsCompat, rect})).intValue();
        }
        if (windowInsetsCompat != null) {
            i = windowInsetsCompat.getSystemWindowInsetTop();
        } else if (rect != null) {
            i = rect.top;
        } else {
            i = 0;
        }
        ActionBarContextView actionBarContextView = this.mActionModeView;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mActionModeView.getLayoutParams();
            if (this.mActionModeView.isShown()) {
                if (this.mTempRect1 == null) {
                    this.mTempRect1 = new Rect();
                    this.mTempRect2 = new Rect();
                }
                Rect rect2 = this.mTempRect1;
                Rect rect3 = this.mTempRect2;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                }
                ViewUtils.computeFitSystemWindows(this.mSubDecor, rect2, rect3);
                int i5 = rect2.top;
                int i6 = rect2.left;
                int i7 = rect2.right;
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this.mSubDecor);
                if (rootWindowInsets == null) {
                    i2 = 0;
                } else {
                    i2 = rootWindowInsets.getSystemWindowInsetLeft();
                }
                if (rootWindowInsets == null) {
                    i3 = 0;
                } else {
                    i3 = rootWindowInsets.getSystemWindowInsetRight();
                }
                if (marginLayoutParams.topMargin == i5 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.leftMargin = i6;
                    marginLayoutParams.rightMargin = i7;
                    z2 = true;
                }
                if (i5 <= 0 || this.mStatusGuard != null) {
                    View view = this.mStatusGuard;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i8 = marginLayoutParams2.height;
                        int i9 = marginLayoutParams.topMargin;
                        if (!(i8 == i9 && marginLayoutParams2.leftMargin == i2 && marginLayoutParams2.rightMargin == i3)) {
                            marginLayoutParams2.height = i9;
                            marginLayoutParams2.leftMargin = i2;
                            marginLayoutParams2.rightMargin = i3;
                            this.mStatusGuard.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.mContext);
                    this.mStatusGuard = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i2;
                    layoutParams.rightMargin = i3;
                    this.mSubDecor.addView(this.mStatusGuard, -1, layoutParams);
                }
                View view3 = this.mStatusGuard;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    updateStatusGuardColor(this.mStatusGuard);
                }
                if (!this.mOverlayActionMode && z3) {
                    i = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.mActionModeView.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.mStatusGuard;
        if (view4 != null) {
            if (!z) {
                i4 = 8;
            }
            view4.setVisibility(i4);
        }
        return i;
    }

    /* compiled from: Taobao */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class AnonymousClass1 implements Thread.UncaughtExceptionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Thread.UncaughtExceptionHandler val$defHandler;

        public AnonymousClass1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.val$defHandler = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca89fd43", new Object[]{this, thread, th});
            } else if (shouldWrapException(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + AppCompatDelegateImpl.EXCEPTION_HANDLER_MESSAGE_SUFFIX);
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.val$defHandler.uncaughtException(thread, notFoundException);
            } else {
                this.val$defHandler.uncaughtException(thread, th);
            }
        }

        private boolean shouldWrapException(Throwable th) {
            String message;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("68ec8de0", new Object[]{this, th})).booleanValue();
            }
            return (th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains(zk4.CONTACTS_INFO_NOT_EMPTY_STATUS) || message.contains("Drawable"));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class ListMenuDecorView extends ContentFrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ListMenuDecorView(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(ListMenuDecorView listMenuDecorView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -407533570) {
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            }
            if (hashCode == 1246973220) {
                return new Boolean(super.dispatchKeyEvent((KeyEvent) objArr[0]));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/appcompat/app/AppCompatDelegateImpl$ListMenuDecorView");
        }

        private boolean isOutOfBounds(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a5b8187b", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5) {
                return true;
            }
            return false;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
            }
            if (AppCompatDelegateImpl.this.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d9196be", new Object[]{this, new Integer(i)});
            } else {
                setBackgroundDrawable(AppCompatResources.getDrawable(getContext(), i));
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
            }
            if (motionEvent.getAction() != 0 || !isOutOfBounds((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.closePanel(0);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class PanelFeatureState {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int background;
        public View createdPanelView;
        public ViewGroup decorView;
        public int featureId;
        public Bundle frozenActionViewState;
        public Bundle frozenMenuState;
        public int gravity;
        public boolean isHandled;
        public boolean isOpen;
        public boolean isPrepared;
        public ListMenuPresenter listMenuPresenter;
        public Context listPresenterContext;
        public MenuBuilder menu;
        public boolean qwertyMode;
        public boolean refreshDecorView = false;
        public boolean refreshMenuContent;
        public View shownPanelView;
        public boolean wasLastOpen;
        public int windowAnimations;
        public int x;
        public int y;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.Parcelable.Creator
                public SavedState[] newArray(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState[]) ipChange.ipc$dispatch("eb70a74", new Object[]{this, new Integer(i)}) : new SavedState[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState) ipChange.ipc$dispatch("9a0c7519", new Object[]{this, parcel, classLoader}) : SavedState.readFromParcel(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public SavedState createFromParcel(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState) ipChange.ipc$dispatch("7fbae8fd", new Object[]{this, parcel}) : SavedState.readFromParcel(parcel, null);
                }
            };
            int featureId;
            boolean isOpen;
            Bundle menuState;

            public static SavedState readFromParcel(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.featureId = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.isOpen = z;
                if (z) {
                    savedState.menuState = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.featureId);
                parcel.writeInt(this.isOpen ? 1 : 0);
                if (this.isOpen) {
                    parcel.writeBundle(this.menuState);
                }
            }
        }

        public PanelFeatureState(int i) {
            this.featureId = i;
        }

        public void applyFrozenState() {
            Bundle bundle;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("515bc48a", new Object[]{this});
                return;
            }
            MenuBuilder menuBuilder = this.menu;
            if (menuBuilder != null && (bundle = this.frozenMenuState) != null) {
                menuBuilder.restorePresenterStates(bundle);
                this.frozenMenuState = null;
            }
        }

        public void clearMenuPresenters() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3caa223e", new Object[]{this});
                return;
            }
            MenuBuilder menuBuilder = this.menu;
            if (menuBuilder != null) {
                menuBuilder.removeMenuPresenter(this.listMenuPresenter);
            }
            this.listMenuPresenter = null;
        }

        public MenuView getListMenuView(MenuPresenter.Callback callback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MenuView) ipChange.ipc$dispatch("191ebbbf", new Object[]{this, callback});
            }
            if (this.menu == null) {
                return null;
            }
            if (this.listMenuPresenter == null) {
                ListMenuPresenter listMenuPresenter = new ListMenuPresenter(this.listPresenterContext, R.layout.abc_list_menu_item_layout);
                this.listMenuPresenter = listMenuPresenter;
                listMenuPresenter.setCallback(callback);
                this.menu.addMenuPresenter(this.listMenuPresenter);
            }
            return this.listMenuPresenter.getMenuView(this.decorView);
        }

        public boolean hasPanelItems() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a4236fe1", new Object[]{this})).booleanValue();
            }
            if (this.shownPanelView == null) {
                return false;
            }
            if (this.createdPanelView == null && this.listMenuPresenter.getAdapter().getCount() <= 0) {
                return false;
            }
            return true;
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            this.featureId = savedState.featureId;
            this.wasLastOpen = savedState.isOpen;
            this.frozenMenuState = savedState.menuState;
            this.shownPanelView = null;
            this.decorView = null;
        }

        public Parcelable onSaveInstanceState() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
            }
            SavedState savedState = new SavedState();
            savedState.featureId = this.featureId;
            savedState.isOpen = this.isOpen;
            if (this.menu != null) {
                Bundle bundle = new Bundle();
                savedState.menuState = bundle;
                this.menu.savePresenterStates(bundle);
            }
            return savedState;
        }

        public void setMenu(MenuBuilder menuBuilder) {
            ListMenuPresenter listMenuPresenter;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("864e6613", new Object[]{this, menuBuilder});
                return;
            }
            MenuBuilder menuBuilder2 = this.menu;
            if (menuBuilder != menuBuilder2) {
                if (menuBuilder2 != null) {
                    menuBuilder2.removeMenuPresenter(this.listMenuPresenter);
                }
                this.menu = menuBuilder;
                if (menuBuilder != null && (listMenuPresenter = this.listMenuPresenter) != null) {
                    menuBuilder.addMenuPresenter(listMenuPresenter);
                }
            }
        }

        public void setStyle(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f46ca912", new Object[]{this, context});
                return;
            }
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(R.style.Theme_AppCompat_CompactMenu, true);
            }
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
            contextThemeWrapper.getTheme().setTo(newTheme);
            this.listPresenterContext = contextThemeWrapper;
            TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R.styleable.AppCompatTheme);
            this.background = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTheme_panelBackground, 0);
            this.windowAnimations = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class PanelMenuPresenterCallback implements MenuPresenter.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public PanelMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            Window.Callback windowCallback;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ff68f2c", new Object[]{this, menuBuilder})).booleanValue();
            }
            if (menuBuilder == menuBuilder.getRootMenu()) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if (appCompatDelegateImpl.mHasActionBar && (windowCallback = appCompatDelegateImpl.getWindowCallback()) != null && !AppCompatDelegateImpl.this.mDestroyed) {
                    windowCallback.onMenuOpened(108, menuBuilder);
                }
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            boolean z2 = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5ca4aca", new Object[]{this, menuBuilder, new Boolean(z)});
                return;
            }
            MenuBuilder rootMenu = menuBuilder.getRootMenu();
            if (rootMenu != menuBuilder) {
                z2 = true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                menuBuilder = rootMenu;
            }
            PanelFeatureState findMenuPanel = appCompatDelegateImpl.findMenuPanel(menuBuilder);
            if (findMenuPanel == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.callOnPanelClosed(findMenuPanel.featureId, findMenuPanel, rootMenu);
                AppCompatDelegateImpl.this.closePanel(findMenuPanel, true);
                return;
            }
            AppCompatDelegateImpl.this.closePanel(findMenuPanel, z);
        }
    }

    public AppCompatDelegateImpl(Dialog dialog, AppCompatCallback appCompatCallback) {
        this(dialog.getContext(), dialog.getWindow(), appCompatCallback, dialog);
    }

    private boolean applyApplicationSpecificConfig(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91d5d81", new Object[]{this, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (this.mDestroyed) {
            return false;
        }
        int calculateNightMode = calculateNightMode();
        int mapNightMode = mapNightMode(this.mContext, calculateNightMode);
        LocaleListCompat calculateApplicationLocales = Build.VERSION.SDK_INT < 33 ? calculateApplicationLocales(this.mContext) : null;
        if (!z2 && calculateApplicationLocales != null) {
            calculateApplicationLocales = getConfigurationLocales(this.mContext.getResources().getConfiguration());
        }
        boolean updateAppConfiguration = updateAppConfiguration(mapNightMode, calculateApplicationLocales, z);
        if (calculateNightMode == 0) {
            getAutoTimeNightModeManager(this.mContext).setup();
        } else {
            AutoNightModeManager autoNightModeManager = this.mAutoTimeNightModeManager;
            if (autoNightModeManager != null) {
                autoNightModeManager.cleanup();
            }
        }
        if (calculateNightMode == 3) {
            getAutoBatteryNightModeManager(this.mContext).setup();
        } else {
            AutoNightModeManager autoNightModeManager2 = this.mAutoBatteryNightModeManager;
            if (autoNightModeManager2 != null) {
                autoNightModeManager2.cleanup();
            }
        }
        return updateAppConfiguration;
    }

    private void attachToWindow(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efff810", new Object[]{this, window});
        } else if (this.mWindow == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof AppCompatWindowCallback)) {
                AppCompatWindowCallback appCompatWindowCallback = new AppCompatWindowCallback(callback);
                this.mAppCompatWindowCallback = appCompatWindowCallback;
                window.setCallback(appCompatWindowCallback);
                TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.mContext, (AttributeSet) null, sWindowBackgroundStyleable);
                Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
                if (drawableIfKnown != null) {
                    window.setBackgroundDrawable(drawableIfKnown);
                }
                obtainStyledAttributes.recycle();
                this.mWindow = window;
                if (Build.VERSION.SDK_INT >= 33 && this.mDispatcher == null) {
                    setOnBackInvokedDispatcher(null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        } else {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
    }

    private AutoNightModeManager getAutoTimeNightModeManager(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoNightModeManager) ipChange.ipc$dispatch("c4585151", new Object[]{this, context});
        }
        if (this.mAutoTimeNightModeManager == null) {
            this.mAutoTimeNightModeManager = new AutoTimeNightModeManager(TwilightManager.getInstance(context));
        }
        return this.mAutoTimeNightModeManager;
    }

    private boolean initializePanelDecor(PanelFeatureState panelFeatureState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de21d0a8", new Object[]{this, panelFeatureState})).booleanValue();
        }
        panelFeatureState.setStyle(getActionBarThemedContext());
        panelFeatureState.decorView = new ListMenuDecorView(panelFeatureState.listPresenterContext);
        panelFeatureState.gravity = 81;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public Context attachBaseContext2(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d8966d80", new Object[]{this, context});
        }
        this.mBaseContextAttached = true;
        int mapNightMode = mapNightMode(context, calculateNightMode());
        if (AppCompatDelegate.isAutoStorageOptedIn(context)) {
            AppCompatDelegate.syncRequestedAndStoredLocales(context);
        }
        LocaleListCompat calculateApplicationLocales = calculateApplicationLocales(context);
        if (context instanceof android.view.ContextThemeWrapper) {
            try {
                ((android.view.ContextThemeWrapper) context).applyOverrideConfiguration(createOverrideAppConfiguration(context, mapNightMode, calculateApplicationLocales, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(createOverrideAppConfiguration(context, mapNightMode, calculateApplicationLocales, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!sCanReturnDifferentContext) {
            return super.attachBaseContext2(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration createOverrideAppConfiguration = createOverrideAppConfiguration(context, mapNightMode, calculateApplicationLocales, !configuration2.equals(configuration3) ? generateConfigDelta(configuration2, configuration3) : null, true);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_AppCompat_Empty);
        contextThemeWrapper.applyOverrideConfiguration(createOverrideAppConfiguration);
        try {
            if (context.getTheme() != null) {
                ResourcesCompat.ThemeCompat.rebase(contextThemeWrapper.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.attachBaseContext2(contextThemeWrapper);
    }

    public void closePanel(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f748215", new Object[]{this, panelFeatureState, new Boolean(z)});
        } else if (!z || panelFeatureState.featureId != 0 || (decorContentParent = this.mDecorContentParent) == null || !decorContentParent.isOverflowMenuShowing()) {
            WindowManager windowManager = (WindowManager) this.mContext.getSystemService(pg1.ATOM_EXT_window);
            if (!(windowManager == null || !panelFeatureState.isOpen || (viewGroup = panelFeatureState.decorView) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    callOnPanelClosed(panelFeatureState.featureId, panelFeatureState, null);
                }
            }
            panelFeatureState.isPrepared = false;
            panelFeatureState.isHandled = false;
            panelFeatureState.isOpen = false;
            panelFeatureState.shownPanelView = null;
            panelFeatureState.refreshDecorView = true;
            if (this.mPreparedPanel == panelFeatureState) {
                this.mPreparedPanel = null;
            }
            if (panelFeatureState.featureId == 0) {
                updateBackInvokedCallbackState();
            }
        } else {
            checkCloseActionMenu(panelFeatureState.menu);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onConfigurationChanged(Configuration configuration) {
        ActionBar supportActionBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        if (this.mHasActionBar && this.mSubDecorInstalled && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.onConfigurationChanged(configuration);
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.mContext);
        this.mEffectiveConfiguration = new Configuration(this.mContext.getResources().getConfiguration());
        applyApplicationSpecificConfig(false, false);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e7644cd9", new Object[]{this, str, context, attributeSet}) : onCreateView(null, str, context, attributeSet);
    }

    public AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback) {
        this(context, window, appCompatCallback, context);
    }

    private void ensureSubDecor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0ddd06a", new Object[]{this});
        } else if (!this.mSubDecorInstalled) {
            this.mSubDecor = createSubDecor();
            CharSequence title = getTitle();
            if (!TextUtils.isEmpty(title)) {
                DecorContentParent decorContentParent = this.mDecorContentParent;
                if (decorContentParent != null) {
                    decorContentParent.setWindowTitle(title);
                } else if (peekSupportActionBar() != null) {
                    peekSupportActionBar().setWindowTitle(title);
                } else {
                    TextView textView = this.mTitleView;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
            applyFixedSizeWindow();
            onSubDecorInstalled(this.mSubDecor);
            this.mSubDecorInstalled = true;
            PanelFeatureState panelState = getPanelState(0, false);
            if (this.mDestroyed) {
                return;
            }
            if (panelState == null || panelState.menu == null) {
                invalidatePanelMenu(108);
            }
        }
    }

    private int getActivityHandlesConfigChangesFlags(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd076108", new Object[]{this, context})).intValue();
        }
        if (!this.mActivityHandlesConfigFlagsChecked && (this.mHost instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.mHost.getClass()), i >= 29 ? 269221888 : i >= 24 ? 786432 : 0);
                if (activityInfo != null) {
                    this.mActivityHandlesConfigFlags = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.mActivityHandlesConfigFlags = 0;
            }
        }
        this.mActivityHandlesConfigFlagsChecked = true;
        return this.mActivityHandlesConfigFlags;
    }

    private boolean onKeyDownPanel(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdf7946", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState panelState = getPanelState(i, true);
            if (!panelState.isOpen) {
                return preparePanel(panelState, keyEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void openPanel(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.openPanel(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    public void doInvalidatePanelMenu(int i) {
        PanelFeatureState panelState;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf77c17f", new Object[]{this, new Integer(i)});
            return;
        }
        PanelFeatureState panelState2 = getPanelState(i, true);
        if (panelState2.menu != null) {
            Bundle bundle = new Bundle();
            panelState2.menu.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                panelState2.frozenActionViewState = bundle;
            }
            panelState2.menu.stopDispatchingItemsChanged();
            panelState2.menu.clear();
        }
        panelState2.refreshMenuContent = true;
        panelState2.refreshDecorView = true;
        if ((i == 108 || i == 0) && this.mDecorContentParent != null && (panelState = getPanelState(0, false)) != null) {
            panelState.isPrepared = false;
            preparePanel(panelState, null);
        }
    }

    public PanelFeatureState getPanelState(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PanelFeatureState) ipChange.ipc$dispatch("ed550847", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[1 + i];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.mPanels = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onCreate(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.mBaseContextAttached = true;
        applyApplicationSpecificConfig(false);
        ensureWindow();
        Object obj = this.mHost;
        if (obj instanceof Activity) {
            try {
                str = NavUtils.getParentActivityName((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ActionBar peekSupportActionBar = peekSupportActionBar();
                if (peekSupportActionBar == null) {
                    this.mEnableDefaultActionBarUp = true;
                } else {
                    peekSupportActionBar.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            AppCompatDelegate.addActiveDelegate(this);
        }
        this.mEffectiveConfiguration = new Configuration(this.mContext.getResources().getConfiguration());
        this.mCreated = true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed33fa1f", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4) {
            if (i == 82) {
                onKeyUpPanel(0, keyEvent);
                return true;
            }
        } else if (onBackPressed()) {
            return true;
        }
        return false;
    }

    public AppCompatDelegateImpl(Context context, Activity activity, AppCompatCallback appCompatCallback) {
        this(context, null, appCompatCallback, activity);
    }

    private Configuration createOverrideAppConfiguration(Context context, int i, LocaleListCompat localeListCompat, Configuration configuration, boolean z) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Configuration) ipChange.ipc$dispatch("eb0a968b", new Object[]{this, context, new Integer(i), localeListCompat, configuration, new Boolean(z)});
        }
        if (i == 1) {
            i2 = 16;
        } else if (i == 2) {
            i2 = 32;
        } else if (!z) {
            i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = (configuration2.uiMode & (-49)) | i2;
        if (localeListCompat != null) {
            setConfigurationLocales(configuration2, localeListCompat);
        }
        return configuration2;
    }

    public int mapNightMode(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("109ef194", new Object[]{this, context, new Integer(i)})).intValue();
        }
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        return getAutoBatteryNightModeManager(context).getApplyableNightMode();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                return getAutoTimeNightModeManager(context).getApplyableNightMode();
            } else {
                return -1;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.appcompat.view.ActionMode startSupportActionModeFromWindow(androidx.appcompat.view.ActionMode.Callback r9) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.startSupportActionModeFromWindow(androidx.appcompat.view.ActionMode$Callback):androidx.appcompat.view.ActionMode");
    }

    private AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        SimpleArrayMap<String, Integer> simpleArrayMap;
        Integer num;
        AppCompatActivity tryUnwrapContext;
        this.mFadeAnim = null;
        this.mHandleNativeActionModes = true;
        this.mLocalNightMode = -100;
        this.mInvalidatePanelMenuRunnable = new Runnable() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if ((1 & appCompatDelegateImpl.mInvalidatePanelMenuFeatures) != 0) {
                    appCompatDelegateImpl.doInvalidatePanelMenu(0);
                }
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                if ((appCompatDelegateImpl2.mInvalidatePanelMenuFeatures & 4096) != 0) {
                    appCompatDelegateImpl2.doInvalidatePanelMenu(108);
                }
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.mInvalidatePanelMenuPosted = false;
                appCompatDelegateImpl3.mInvalidatePanelMenuFeatures = 0;
            }
        };
        this.mContext = context;
        this.mAppCompatCallback = appCompatCallback;
        this.mHost = obj;
        if (this.mLocalNightMode == -100 && (obj instanceof Dialog) && (tryUnwrapContext = tryUnwrapContext()) != null) {
            this.mLocalNightMode = tryUnwrapContext.getDelegate().getLocalNightMode();
        }
        if (this.mLocalNightMode == -100 && (num = (simpleArrayMap = sLocalNightModes).get(obj.getClass().getName())) != null) {
            this.mLocalNightMode = num.intValue();
            simpleArrayMap.remove(obj.getClass().getName());
        }
        if (window != null) {
            attachToWindow(window);
        }
        AppCompatDrawableManager.preload();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698903e0", new Object[]{this, new Integer(i)});
            return;
        }
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.mContext).inflate(i, viewGroup);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f37f8e", new Object[]{this, view, layoutParams});
            return;
        }
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }
}
