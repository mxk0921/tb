package com.taobao.android.interactive_common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.WeexPopContainer;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import tb.acq;
import tb.ev4;
import tb.jjx;
import tb.kq9;
import tb.rtw;
import tb.wvw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CXCommonActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONTENT_PATH = "/apps/market/content/index.html";
    public static final String EXTRA_CURRENT_TARGET = "current_target";
    public static final String EXTRA_START_TARGET = "start_target";
    public static final String FLOAT_LAYER_DETAIL_HOST = "market.m.taobao.com";
    public static final String FLOAT_LAYER_DETAIL_HOST_PRE = "market.wapa.taobao.com";
    public static final String FLOAT_LAYER_DETAIL_PATH = "/apps/market/content/floatlayer.html";
    public static final String NAV_HIDDEN = "wx_navbar_hidden";
    public static final String NAV_OVERLAY = "wx_navbar_transparent";
    public static final String UNITE_VIDEO_CONTENT_PATH = "/app/mtb/content/pages/content";
    public static final String UNITE_VIDEO_FULLPAGE_PATH = "/app/mtb/content/pages/video";
    public static final String VIDEO_FULLPAGE_HOST = "market.m.taobao.com";
    public static final String VIDEO_FULLPAGE_HOST_PRE = "market.wapa.taobao.com";
    public static final String VIDEO_FULLPAGE_PATH = "/app/tb-source-app/video-fullpage/pages/index2";
    public static final String WX_DATA_RENDER = "_data_render";
    public static final String WX_EAGLE = "wx_eagle";

    /* renamed from: a  reason: collision with root package name */
    public rtw f8105a;
    public String b;
    public String c;
    public Uri d;
    public final BroadcastReceiver e = new BroadcastReceiver() { // from class: com.taobao.android.interactive_common.CXCommonActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/interactive_common/CXCommonActivity$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (TextUtils.equals(intent.getAction(), WeexPopContainer.ACTION_DEGRADE_TO_WINDVANE)) {
                CXCommonActivity cXCommonActivity = CXCommonActivity.this;
                wvw.a(cXCommonActivity, cXCommonActivity.getIntent());
                CXCommonActivity.this.finish();
            }
        }
    };

    public static /* synthetic */ Object ipc$super(CXCommonActivity cXCommonActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1270686685:
                super.onLowMemory();
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/interactive_common/CXCommonActivity");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final boolean l3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a658fe", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        this.d = m3(data);
        getIntent().setData(this.d);
        this.c = this.d.toString();
        return true;
    }

    public final Uri m3(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("f509beae", new Object[]{this, uri});
        }
        if (uri == null) {
            return null;
        }
        new StringBuilder("before:").append(uri.toString());
        Uri.Builder buildUpon = uri.buildUpon();
        if (buildUpon == null) {
            return null;
        }
        if (UNITE_VIDEO_FULLPAGE_PATH.equals(uri.getPath())) {
            String queryParameter = uri.getQueryParameter("bizFrom");
            if (!TextUtils.isEmpty(queryParameter)) {
                buildUpon.appendQueryParameter("type", queryParameter);
                buildUpon.appendQueryParameter("source", queryParameter);
            }
            buildUpon.path("/app/tb-source-app/video-fullpage/pages/index2");
        } else if (UNITE_VIDEO_CONTENT_PATH.equals(uri.getPath())) {
            String queryParameter2 = uri.getQueryParameter("id");
            String queryParameter3 = uri.getQueryParameter("bizFrom");
            if (!TextUtils.isEmpty(queryParameter2) && !TextUtils.isEmpty(queryParameter3)) {
                buildUpon.appendQueryParameter("contentId", queryParameter2);
                buildUpon.appendQueryParameter("source", queryParameter3);
            }
            if ("floatlayer".equals(uri.getQueryParameter("content_style"))) {
                buildUpon.path(FLOAT_LAYER_DETAIL_PATH);
            } else {
                buildUpon.path(CONTENT_PATH);
                buildUpon.appendQueryParameter(WX_EAGLE, "true");
            }
        }
        new StringBuilder("after:").append(buildUpon.toString());
        return buildUpon.build();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else if (!processOnBackPressed()) {
            super.onBackPressed();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        int i;
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        boolean z = true;
        try {
            try {
                Field declaredField = getClass().getSuperclass().getSuperclass().getDeclaredField("mNeedPublicMenuShow");
                declaredField.setAccessible(true);
                z = ((Boolean) declaredField.get(this)).booleanValue();
            } catch (Exception e) {
                WXLogUtils.d("error in get mNeedPublicMenuShow from BaseActivity", e);
            }
            if (z) {
                if (menu != null) {
                    if (menu.findItem(R.id.uik_menu_overflow) == null) {
                    }
                    i = R.id.uik_menu_overflow;
                    if (!(menu.findItem(i) == null || menu.findItem(i).getActionView() == null)) {
                        TBActionView tBActionView = (TBActionView) menu.findItem(i).getActionView();
                    }
                }
                menu = new TBPublicMenu(this).onCreateOptionsMenu(getMenuInflater(), menu);
                i = R.id.uik_menu_overflow;
                if (menu.findItem(i) == null) {
                    TBActionView tBActionView2 = (TBActionView) menu.findItem(i).getActionView();
                }
            }
        } catch (Exception e2) {
            WXLogUtils.d("CXCommonActivity", "error in find overflow menu button. " + e2.getMessage());
        }
        return onCreateOptionsMenu;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        rtw rtwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (WXEnvironment.isApkDebugable() && (rtwVar = this.f8105a) != null) {
            rtwVar.b();
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (processOnBackPressed() || super.onKeyDown(i, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else {
            super.onLowMemory();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (processOnBackPressed() || super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        rtw rtwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.e);
        if (WXEnvironment.isApkDebugable() && (rtwVar = this.f8105a) != null) {
            rtwVar.c();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        Intent intent = new Intent(WXModule.ACTION_REQUEST_PERMISSIONS_RESULT);
        intent.putExtra("requestCode", i);
        intent.putExtra("permissions", strArr);
        intent.putExtra(WXModule.GRANT_RESULTS, iArr);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        rtw rtwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        LocalBroadcastManager.getInstance(this).registerReceiver(this.e, new IntentFilter(WeexPopContainer.ACTION_DEGRADE_TO_WINDVANE));
        if (WXEnvironment.isApkDebugable() && (rtwVar = this.f8105a) != null) {
            rtwVar.d();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        rtw rtwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        if (WXEnvironment.isApkDebugable() && (rtwVar = this.f8105a) != null) {
            rtwVar.e();
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        rtw rtwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        if (WXEnvironment.isApkDebugable() && (rtwVar = this.f8105a) != null) {
            rtwVar.f();
        }
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        String str = this.b;
        Bundle bundle = new Bundle();
        if (TextUtils.isEmpty(str)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("pageName", this.c);
            bundle.putParcelable(jjx.ZZB_BUNDLE_KEY, bundle2);
        } else {
            Bundle bundle3 = new Bundle();
            try {
                JSONObject jSONObject = new JSONObject(this.b);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle3.putString(next, jSONObject.optString(next));
                }
            } catch (Throwable unused) {
            }
            bundle.putParcelable(jjx.ZZB_BUNDLE_KEY, bundle3);
        }
        return bundle;
    }

    public boolean processOnBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8522e9b8", new Object[]{this})).booleanValue();
        }
        finish();
        return true;
    }

    public void setPageUserInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef7c35b", new Object[]{this, str});
            return;
        }
        WXLogUtils.d("CXCommonActivity", "setPageUserInfo:" + str);
        this.b = str;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        ev4.f18834a = System.currentTimeMillis();
        ev4.a("onCreate");
        if (getIntent() == null || getIntent().getData() == null) {
            finish();
            super.onCreate(bundle);
            return;
        }
        l3(getIntent());
        if (WXEnvironment.isApkDebugable()) {
            rtw rtwVar = new rtw(this);
            this.f8105a = rtwVar;
            rtwVar.a();
        }
        if (WXEnvironment.isApkDebugable()) {
            Toast.makeText(this, "CXCommonActivity WEEX_SDK 初始化失败!", 0).show();
        }
        Intent intent = getIntent();
        intent.putExtra(WeexPopContainer.DEGRADE_TYPE, "DEGRADE_TYPE_INIT_ERROR");
        intent.putExtra(WeexPopContainer.DEGRADE_MSG, "WEEX_SDK 初始化失败!降级到h5");
        wvw.a(this, intent);
        finish();
        super.onCreate(bundle);
        HashMap hashMap = new HashMap();
        hashMap.put("isDegradeToH5", "true");
        kq9.a(this, "CXCommonActivity_onCreate", hashMap);
    }
}
