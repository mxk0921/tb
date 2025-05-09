package com.taobao.android.shop.activity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.appcompat.taobao.TBActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.nav.Nav;
import com.taobao.android.shop.features.category.MCategoryController;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselViewFragment;
import com.taobao.vessel.utils.VesselType;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import java.util.HashMap;
import tb.acq;
import tb.g4v;
import tb.jjx;
import tb.pf3;
import tb.t2o;
import tb.wnp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ShopCategoryActivity extends CustomBaseActivity implements pf3 {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MCategoryController f9377a;
    public String b;
    public String c;
    public String d;
    public String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.shop.activity.ShopCategoryActivity$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0484a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0484a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ShopCategoryActivity.l3(ShopCategoryActivity.this, "Page_Shop_Category");
                g4v.a("a2141.7666909");
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                new Handler().post(new RunnableC0484a());
            }
        }
    }

    static {
        t2o.a(764411915);
        t2o.a(764411971);
    }

    public static /* synthetic */ Object ipc$super(ShopCategoryActivity shopCategoryActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
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
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/activity/ShopCategoryActivity");
        }
    }

    public static /* synthetic */ void l3(ShopCategoryActivity shopCategoryActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29853f7", new Object[]{shopCategoryActivity, str});
        } else {
            shopCategoryActivity.u3(str);
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

    public final void m3(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c623490", new Object[]{this, uri});
            return;
        }
        if (this.c == null) {
            this.c = uri.getQueryParameter("shop_id");
        }
        if (this.b == null) {
            this.b = uri.getQueryParameter("user_id");
        }
    }

    public final void n3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
            return;
        }
        VesselViewFragment r2 = VesselViewFragment.r2();
        r2.p2(VesselType.Weex, str, null);
        q3(r2, R.id.weex_container);
    }

    public void o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf3096a", new Object[]{this});
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        wnp.b();
        super.onCreate(bundle);
        getSupportActionBar().setTitle("宝贝分类");
        setContentView(R.layout.tshop_cat_view);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.c = extras.getString("shop_id");
            this.b = extras.getString("user_id");
            this.e = extras.getString("searchTips");
            this.d = extras.getString("searchWord");
        }
        m3(getIntent().getData());
        MCategoryController mCategoryController = new MCategoryController(this, (ViewGroup) findViewById(R.id.shop_category_root_view), this.b, this.c);
        this.f9377a = mCategoryController;
        mCategoryController.setCategorySelectionListener(this);
        this.f9377a.startRequest();
        getWindow().getDecorView().post(new a());
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        MCategoryController mCategoryController = this.f9377a;
        if (mCategoryController != null) {
            mCategoryController.destroy();
        }
        super.onDestroy();
    }

    public void onError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (FestivalMgr.i().v("global")) {
            t3();
        }
        u3("Page_Shop_Category");
    }

    public void p3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed2e9b98", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            n3(str);
        }
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle.putString("pageName", "n_shopgoodscategory");
        String str = this.c;
        if (str == null) {
            str = "0";
        }
        bundle.putString("shopId", str);
        bundle2.putBundle(jjx.ZZB_BUNDLE_KEY, bundle);
        return bundle2;
    }

    public final void q3(Fragment fragment, int i) {
        FragmentTransaction beginTransaction;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38456ec0", new Object[]{this, fragment, new Integer(i)});
        } else if (fragment != null && (beginTransaction = getSupportFragmentManager().beginTransaction()) != null) {
            beginTransaction.replace(i, fragment);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    public final void r3(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5e7a52", new Object[]{this, str, str2});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("user_id", this.b);
        bundle.putString("shop_id", this.c);
        bundle.putString("catId", str);
        bundle.putString("catText", str2);
        bundle.putString("searchTips", this.e);
        bundle.putString("searchWord", this.d);
        bundle.putString("from", "category");
        Nav.from(this).withExtras(bundle).toUri("https://shop.m.taobao.com/goods/index.htm");
    }

    public void s3(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("856f3a35", new Object[]{this, str, str2});
        } else {
            r3(str, str2);
        }
    }

    public final void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a226968", new Object[]{this});
            return;
        }
        FestivalMgr i = FestivalMgr.i();
        getSupportActionBar();
        i.C(this, TBActionBar.ActionBarStyle.NORMAL);
    }

    public final void u3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fd59013", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            setUTPageName(str);
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            defaultTracker.updatePageName(this, str);
            HashMap hashMap = new HashMap();
            hashMap.put("shop_id", this.c);
            hashMap.put("seller_id", this.b);
            hashMap.put("spm-cnt", "a2141.7666909");
            defaultTracker.updatePageProperties(this, hashMap);
        }
    }
}
