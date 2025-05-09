package com.taobao.tao;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.alibaba.security.realidentity.ui.activity.BaseBioNavigatorActivity;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguActivity;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.tao.util.TBDialog;
import com.taobao.tao.util.TBMainLog;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.immersive.ITBImmersive;
import com.taobao.uikit.toolbar.ToolBarStyleManager;
import com.taobao.uikit.toolbar.api.IToolBarStyleSelector;
import com.ut.mini.UTAnalytics;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import tb.ah0;
import tb.b6r;
import tb.c21;
import tb.nx9;
import tb.r3g;
import tb.srk;
import tb.t2o;
import tb.wpg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BaseActivity extends PanguActivity implements ITBPublicMenu, ITBImmersive, r3g, IToolBarStyleSelector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LAUNCH_TYPE_COLD = "COLD";
    private static final String LAUNCH_TYPE_HOT = "HOT";
    private srk mOnKeyDownListener;
    private TBPublicMenu mPublicMenu;
    private Toolbar mToolbar;
    public SystemBarDecorator systemBarDecorator;
    private final String TAG = BaseBioNavigatorActivity.g;
    private boolean disablefinishAnimation = false;
    private boolean mNeedPublicMenuShow = true;
    private boolean mActionbarInited = false;
    private boolean mTbPublicMenuInited = false;
    private boolean mIgnoreFestival = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBDialog f11871a;
        public final /* synthetic */ Method b;
        public final /* synthetic */ Object c;

        public a(TBDialog tBDialog, Method method, Object obj) {
            this.f11871a = tBDialog;
            this.b = method;
            this.c = obj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f11871a.dismiss();
            SharedPreferences.Editor edit = BaseActivity.this.getApplicationContext().getSharedPreferences(TransportConstants.KEY_UUID, 0).edit();
            edit.clear();
            edit.commit();
            try {
                this.b.invoke(this.c, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBDialog f11872a;
        public final /* synthetic */ Method b;
        public final /* synthetic */ Object c;

        public b(BaseActivity baseActivity, TBDialog tBDialog, Method method, Object obj) {
            this.f11872a = tBDialog;
            this.b = method;
            this.c = obj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f11872a.dismiss();
            try {
                this.b.invoke(this.c, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    static {
        t2o.a(775946304);
        t2o.a(927989771);
        t2o.a(775946309);
        t2o.a(775946319);
        t2o.a(927989848);
        c21.a(new b6r(), true);
    }

    private void initDefaultActionBar() {
        Toolbar toolbar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ec4c73", new Object[]{this});
        } else if (!this.mActionbarInited) {
            if (!nx9.k()) {
                ActionBar supportActionBar = getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.setElevation(0.0f);
                    supportActionBar.setBackgroundDrawable(ContextCompat.getDrawable(this, R.color.uik_action_bar_normal));
                    ViewGroup viewGroup = (ViewGroup) findViewById(R.id.action_bar_container);
                    Toolbar toolbar2 = (Toolbar) findViewById(R.id.action_bar);
                    if (toolbar2 == null && (toolbar = this.mToolbar) != null) {
                        toolbar2 = toolbar;
                    }
                    if (viewGroup != null) {
                        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                        layoutParams.height = (int) getResources().getDimension(R.dimen.uik_action_bar_height);
                        viewGroup.setLayoutParams(layoutParams);
                    }
                    if (toolbar2 != null) {
                        toolbar2.setContentInsetStartWithNavigation(0);
                        ViewGroup.LayoutParams layoutParams2 = toolbar2.getLayoutParams();
                        layoutParams2.height = (int) getResources().getDimension(R.dimen.uik_action_bar_height);
                        toolbar2.setLayoutParams(layoutParams2);
                        toolbar2.setTitleTextAppearance(this, R.style.TBTitle);
                        toolbar2.setSubtitleTextAppearance(this, R.style.TBSubTitle);
                        toolbar2.setTitleMargin(0, toolbar2.getTitleMarginTop(), 0, toolbar2.getTitleMarginBottom());
                        int i = R.color.uik_action_icon_normal;
                        toolbar2.setTitleTextColor(ContextCompat.getColor(this, i));
                        toolbar2.setSubtitleTextColor(ContextCompat.getColor(this, i));
                        if ((supportActionBar.getDisplayOptions() & 4) != 0) {
                            toolbar2.setNavigationIcon(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
                        }
                        Drawable navigationIcon = toolbar2.getNavigationIcon();
                        if (navigationIcon != null) {
                            Drawable wrap = DrawableCompat.wrap(navigationIcon);
                            wrap.mutate();
                            DrawableCompat.setTint(wrap, ContextCompat.getColor(this, i));
                        }
                        Drawable overflowIcon = toolbar2.getOverflowIcon();
                        if (overflowIcon != null) {
                            Drawable wrap2 = DrawableCompat.wrap(overflowIcon);
                            wrap2.mutate();
                            DrawableCompat.setTint(wrap2, ContextCompat.getColor(this, i));
                        }
                    }
                } else {
                    return;
                }
            } else {
                ToolBarStyleManager.initActionBarStyle(this);
            }
            ToolBarStyleManager.updateActionViewIconColor(this, this.mPublicMenu);
            this.mActionbarInited = true;
        }
    }

    private void initTBPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de2b30d", new Object[]{this});
        } else if (!this.mTbPublicMenuInited) {
            this.mPublicMenu = new TBPublicMenu(this);
            if (!nx9.k() && toolbarNeedNewStyle()) {
                this.mPublicMenu.useNewActionViewStyle();
            }
            ToolBarStyleManager.updateActionViewIconColor(this, this.mPublicMenu);
            this.mTbPublicMenuInited = true;
        }
    }

    public static /* synthetic */ Object ipc$super(BaseActivity baseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1824869760:
                return new Boolean(super.onPrepareOptionsMenu((Menu) objArr[0]));
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -1512649357:
                super.onResume();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 523352648:
                super.setSupportActionBar((Toolbar) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 902425770:
                super.startActivityForResult((Intent) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 921927566:
                super.setContentView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1683598447:
                super.setContentView((View) objArr[0]);
                return null;
            case 1770587104:
                super.setContentView(((Number) objArr[0]).intValue());
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/BaseActivity");
        }
    }

    private boolean needActionBarInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d90fd9a", new Object[]{this})).booleanValue();
        }
        return needActionBar();
    }

    public void disableFinishAnimationOnce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c331d1", new Object[]{this});
        } else {
            this.disablefinishAnimation = true;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        wpg.c(getIntent(), this);
        super.finish();
        if (!this.disablefinishAnimation) {
            overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
        } else {
            this.disablefinishAnimation = false;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("isbk", "1");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
    }

    public final Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getCacheDir() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4c9546e5", new Object[]{this});
        }
        return getApplicationContext().getCacheDir();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getDatabasePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("477c0ba6", new Object[]{this, str});
        }
        return getApplicationContext().getDatabasePath(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getDir(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("3f9f0d92", new Object[]{this, str, new Integer(i)});
        }
        return getApplicationContext().getDir(str, i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getFilesDir() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("71bd455a", new Object[]{this});
        }
        return getApplicationContext().getFilesDir();
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public TBPublicMenu getPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
        }
        return this.mPublicMenu;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SharedPreferences getSharedPreferences(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("fd9d24e9", new Object[]{this, str, new Integer(i)});
        }
        return getApplicationContext().getSharedPreferences(str, i);
    }

    public SystemBarDecorator getSystemBarDecorator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SystemBarDecorator) ipChange.ipc$dispatch("c560c54d", new Object[]{this});
        }
        if (this.systemBarDecorator == null) {
            this.systemBarDecorator = new SystemBarDecorator(this);
        }
        return this.systemBarDecorator;
    }

    @Override // com.taobao.uikit.toolbar.api.IToolBarStyleSelector
    public int getToolBarStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74a86c06", new Object[]{this})).intValue();
        }
        if (toolbarNeedNewStyle()) {
            return 2;
        }
        return 1;
    }

    public Toolbar getToolbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toolbar) ipChange.ipc$dispatch("2f69ac9b", new Object[]{this});
        }
        return this.mToolbar;
    }

    public String getUTClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b84448b", new Object[]{this});
        }
        return getClass().getName();
    }

    public final <E extends View> E getView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ((View) ipChange.ipc$dispatch("c9ef8723", new Object[]{this, new Integer(i)}));
        }
        try {
            return (E) findViewById(i);
        } catch (ClassCastException e) {
            Log.e(BaseBioNavigatorActivity.g, "Could not cast View to concrete class.", e);
            throw e;
        }
    }

    public boolean isFitsWindowsOnRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86dc3ce3", new Object[]{this})).booleanValue();
        }
        if (this.systemBarDecorator == null) {
            this.systemBarDecorator = new SystemBarDecorator(this);
        }
        if (this.systemBarDecorator.getType() != 1) {
            return isTranslucent();
        }
        return true;
    }

    public boolean isIgnoreFestival() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5f87bbf", new Object[]{this})).booleanValue();
        }
        return this.mIgnoreFestival;
    }

    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab05a0da", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean needActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4205b12", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean needPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24050629", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ActionBar supportActionBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        getTheme().applyStyle(R.style.TBDefaultStyle, true);
        this.systemBarDecorator = new SystemBarDecorator(this);
        super.onCreate(bundle);
        if (needActionBarInner() && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.setDisplayShowHomeEnabled(false);
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setDisplayUseLogoEnabled(true);
        }
        if (this.systemBarDecorator != null) {
            if (isImmersiveStatus()) {
                this.systemBarDecorator.enableImmersiveStatusBar();
            } else {
                this.systemBarDecorator.enableImmersiveStatus("#00000000", isTranslucent());
            }
        }
        if (needPublicMenu()) {
            initTBPublicMenu();
        }
        if (needActionBarInner()) {
            initDefaultActionBar();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        TBPublicMenu tBPublicMenu = this.mPublicMenu;
        if (tBPublicMenu == null) {
            return super.onCreateOptionsMenu(menu);
        }
        tBPublicMenu.togglePublicMenu(this.mNeedPublicMenuShow);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null && supportActionBar.isShowing()) {
            menu = this.mPublicMenu.onCreateOptionsMenu(getMenuInflater(), menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onMenuPanelKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4ff2f5f", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public boolean onPanelKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        TBPublicMenu tBPublicMenu = this.mPublicMenu;
        if (tBPublicMenu != null) {
            tBPublicMenu.onPause();
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("933ab280", new Object[]{this, menu})).booleanValue();
        }
        TBPublicMenu tBPublicMenu = this.mPublicMenu;
        if (tBPublicMenu != null) {
            menu = tBPublicMenu.onPrepareOptionsMenu(menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        TBPublicMenu tBPublicMenu = this.mPublicMenu;
        if (tBPublicMenu != null) {
            tBPublicMenu.onResume();
        }
        if (needActionBar()) {
            initDefaultActionBar();
        }
        this.mActionbarInited = true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8788f87", new Object[]{this})).booleanValue();
        }
        if (onPanelKeyDown(4, new KeyEvent(1, 4))) {
            return true;
        }
        finish();
        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        if (Constants.statusBarHeight == 0) {
            Rect rect = new Rect();
            getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            Constants.statusBarHeight = rect.top;
        }
    }

    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        return null;
    }

    @Override // tb.r3g
    public void registerOnKeyDownListener(srk srkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc596f3", new Object[]{this, srkVar});
        } else {
            this.mOnKeyDownListener = srkVar;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698903e0", new Object[]{this, new Integer(i)});
            return;
        }
        super.setContentView(i);
        getSystemBarDecorator().enableFitsWindowsOnRoot(isFitsWindowsOnRoot());
    }

    public void setIgnoreFestival(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc688441", new Object[]{this, new Boolean(z)});
        } else {
            this.mIgnoreFestival = z;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public void setSupportActionBar(Toolbar toolbar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f31ba48", new Object[]{this, toolbar});
            return;
        }
        super.setSupportActionBar(toolbar);
        this.mToolbar = toolbar;
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowHomeEnabled(false);
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setDisplayUseLogoEnabled(true);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35c9ecaa", new Object[]{this, intent, new Integer(i)});
        } else {
            super.startActivityForResult(intent, i);
        }
    }

    @Deprecated
    public void supportDisablePublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0884068", new Object[]{this});
        } else {
            this.mNeedPublicMenuShow = false;
        }
    }

    public void togglePublicMenu(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c9aad1", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedPublicMenuShow = z;
        }
    }

    @Deprecated
    public boolean toolbarNeedNewStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("405dd14d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        srk srkVar;
        if (isFinishing()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (keyEvent.getRepeatCount() > 0 && ((i == 4 || i == 25) && getString(R.string.env_switch).equals("1"))) {
            try {
                Class<?> cls = Class.forName("android.taobao.mulitenv.EnvironmentViewControler");
                Method method = cls.getMethod("getRootView", new Class[0]);
                Method method2 = cls.getMethod("exit", new Class[0]);
                Object newInstance = cls.getConstructor(Activity.class).newInstance(this);
                if (newInstance != null) {
                    TBDialog tBDialog = new TBDialog(this, -1, "环境设置", null, (View) method.invoke(newInstance, new Object[0]), true);
                    tBDialog.setPositiveButton(new a(tBDialog, method2, newInstance));
                    tBDialog.setNegativeButton(new b(this, tBDialog, method2, newInstance));
                    tBDialog.show();
                    TBMainLog.tlog(BaseBioNavigatorActivity.g, "show debug dialog");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        } else if (keyEvent.getRepeatCount() <= 0 && (srkVar = this.mOnKeyDownListener) != null && srkVar.onKeyDown(i, keyEvent)) {
            return false;
        } else {
            if (keyEvent.getRepeatCount() > 0 || onMenuPanelKeyDown(i, keyEvent) || onPanelKeyDown(i, keyEvent)) {
                if (i == 4) {
                    return true;
                }
                return super.onKeyDown(i, keyEvent);
            } else if (i != 4) {
                return super.onKeyDown(i, keyEvent);
            } else {
                finish();
                return true;
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
            return;
        }
        super.setContentView(view);
        getSystemBarDecorator().enableFitsWindowsOnRoot(isFitsWindowsOnRoot());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f37f8e", new Object[]{this, view, layoutParams});
            return;
        }
        super.setContentView(view, layoutParams);
        getSystemBarDecorator().enableFitsWindowsOnRoot(isFitsWindowsOnRoot());
    }

    public void finish(boolean z) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d82167a", new Object[]{this, new Boolean(z)});
        } else if (z) {
            Intent intent = getIntent();
            if (!(intent == null || (data = intent.getData()) == null)) {
                ComponentName component = intent.getComponent();
                TBS.Ext.commitEvent(ah0.PAGE_FLOWCUSTOMS, 1013, "afc_finish_exception", data.toString(), component == null ? "Unknow" : component.getClassName());
            }
            super.finish();
        } else {
            finish();
        }
    }
}
