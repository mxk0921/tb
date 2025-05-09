package com.taobao.android.detail.wrapper.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.fragment.weex.DetailFullScreenVesselFragment;
import com.taobao.taobao.R;
import java.net.URLDecoder;
import java.util.Map;
import tb.acq;
import tb.ask;
import tb.cbo;
import tb.g4w;
import tb.i4w;
import tb.kq0;
import tb.q2q;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AreaLocationActivity extends AppCompatActivity implements ask, i4w {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AreaLocationActivity";
    public static final String h = "method";
    public static final String i = "close_page";
    public static final String j = "sellected_area";
    public static final String k = "open_native_area_view";

    /* renamed from: a  reason: collision with root package name */
    public String f7070a;
    public String b;
    public String c;
    public String d;
    public String e;
    public DetailFullScreenVesselFragment f;
    public boolean g;

    public static /* synthetic */ Object ipc$super(AreaLocationActivity areaLocationActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/wrapper/activity/AreaLocationActivity");
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

    public final void l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc6d1ae", new Object[]{this});
        } else {
            finish();
        }
    }

    public final void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2807cf7", new Object[]{this});
            return;
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        DetailFullScreenVesselFragment z2 = DetailFullScreenVesselFragment.z2();
        this.f = z2;
        z2.s2(this.f7070a);
        this.f.C2(this);
        this.f.D2(this);
        beginTransaction.replace(R.id.ll_wrapper_fragment_container, this.f).commit();
    }

    public final void o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
        } else {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ll_wrapper_fragment_container);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.x_detail_new_sku_wrapper_activity_layout);
        q3();
        o3();
        if (!m3()) {
            finish();
        } else {
            n3();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.g) {
            Intent intent = new Intent();
            intent.setAction("com.taobao.sku.intent.action.updateData");
            intent.putExtra("originalItemId", this.b);
            intent.putExtra("skuToken", this.e);
            intent.putExtra("targetItemId", this.b);
            intent.putExtra(q2q.KEY_AREA_ID, this.c);
            intent.putExtra("addressId", this.d);
            intent.putExtra("areaChangedByUser", "true");
            intent.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        }
        super.onDestroy();
    }

    @Override // tb.ask
    public void onDowngrade(g4w g4wVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36618407", new Object[]{this, g4wVar, map});
        } else {
            tgh.b(TAG, "打开配送区域的Vessel发生降级，使用Native版本兜底ing");
        }
    }

    @Override // tb.ask
    public void onLoadError(g4w g4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("365c1211", new Object[]{this, g4wVar});
        } else {
            onDowngrade(null, null);
        }
    }

    @Override // tb.ask
    public void onLoadFinish(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
        }
    }

    @Override // tb.ask
    public void onLoadStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f829aa04", new Object[]{this});
        }
    }

    public final void p3(Map<String, Object> map, cbo cboVar) {
        String str;
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db4135b0", new Object[]{this, map, cboVar});
            return;
        }
        String str2 = "";
        if (map == null || !map.containsKey(q2q.KEY_AREA_ID) || (obj2 = map.get(q2q.KEY_AREA_ID)) == null) {
            str = str2;
        } else {
            str = obj2.toString();
        }
        if (!(map == null || !map.containsKey("addressId") || (obj = map.get("addressId")) == null)) {
            str2 = obj.toString();
        }
        this.c = str;
        this.d = str2;
        this.g = true;
        l3();
    }

    public final void q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83cd1e8f", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 23) {
            Window window = getWindow();
            View decorView = window.getDecorView();
            window.addFlags(Integer.MIN_VALUE);
            decorView.setSystemUiVisibility(8192);
            window.setStatusBarColor(-1);
        }
    }

    @Override // tb.i4w
    public void u2(Map<String, Object> map, cbo cboVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef7dc0c", new Object[]{this, map, cboVar});
        } else if (map != null) {
            String str = h;
            if (map.containsKey(str)) {
                Object obj = map.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (i.equals(str2)) {
                        l3();
                    }
                    if (j.equals(str2)) {
                        p3(map, cboVar);
                    }
                    k.equals(str2);
                }
            }
        }
    }

    public final boolean m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1ae4865", new Object[]{this})).booleanValue();
        }
        Uri data = getIntent().getData();
        if (data == null || kq0.c() == null) {
            return false;
        }
        this.b = data.getQueryParameter("itemId");
        data.getQueryParameter("sellerId");
        this.f7070a = data.getQueryParameter("loadUrl");
        this.e = data.getQueryParameter("sku_token");
        try {
            this.f7070a = URLDecoder.decode(this.f7070a, "UTF-8");
        } catch (Throwable unused) {
            tgh.b(TAG, "配送区域URL解码失败： " + this.f7070a);
        }
        return true;
    }

    static {
        t2o.a(443547651);
        t2o.a(967835662);
        t2o.a(967835664);
    }
}
