package com.taobao.favorites.components.category.offerout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.favorites.FavoriteBaseActivity;
import com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryQueryShareListResponseData;
import com.taobao.favorites.template.FavTemplateConstant;
import com.taobao.orange.OrangeConfig;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import tb.acq;
import tb.ih4;
import tb.pyu;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FavCategoryPopupActivity extends FavoriteBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f10540a = false;
    public FavCategoryPopupWindow b;
    public String c;
    public int d;
    public int e;
    public ComTaobaoMercuryQueryShareListResponseData f;

    static {
        t2o.a(707788815);
    }

    public static /* synthetic */ Object ipc$super(FavCategoryPopupActivity favCategoryPopupActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/favorites/components/category/offerout/FavCategoryPopupActivity");
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

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupActivity", "public void finish()", "20180112");
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupActivity", "protected void onCreate(Bundle savedInstanceState)", "20180112");
        super.onCreate(bundle);
        if ("true".equals(OrangeConfig.getInstance().getConfig(ih4.GROUP_NAME, "fixPopWhiteBg", "true"))) {
            getWindow().getDecorView().setBackground(null);
            getWindow().getDecorView().setBackgroundColor(0);
        }
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        overridePendingTransition(0, 0);
        disableFinishAnimationOnce();
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        if (getIntent() != null) {
            try {
                Map<String, String> a2 = pyu.a(getIntent().getData());
                this.c = a2.get(FavTemplateConstant.ITEM_ID);
                this.d = Integer.valueOf(a2.get(FavTemplateConstant.XOFFSET)).intValue();
                this.e = Integer.valueOf(a2.get(FavTemplateConstant.YOFFSET)).intValue();
                String decode = Uri.decode(a2.get(FavTemplateConstant.REQUEST_RESPONSE));
                if (!TextUtils.isEmpty(decode)) {
                    this.f = (ComTaobaoMercuryQueryShareListResponseData) JSON.parseObject(decode, ComTaobaoMercuryQueryShareListResponseData.class);
                } else {
                    finish();
                }
            } catch (Exception unused) {
                finish();
            }
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupActivity", "protected void onDestroy()", "20180112");
        super.onDestroy();
        FavCategoryPopupWindow favCategoryPopupWindow = this.b;
        if (favCategoryPopupWindow != null && favCategoryPopupWindow.isShowing()) {
            FavCategoryPopupWindow favCategoryPopupWindow2 = this.b;
            favCategoryPopupWindow2.isActivityOwnFinish = true;
            favCategoryPopupWindow2.dismiss();
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryPopupActivity", "public void onWindowFocusChanged(boolean hasFocus)", "20180112");
        super.onWindowFocusChanged(z);
        if (z && !this.f10540a) {
            this.f10540a = true;
            this.b = new FavCategoryPopupWindow(this, this.c, this.d, this.e, this.f);
        } else if (!z && !isFinishing()) {
            finish();
        }
    }
}
