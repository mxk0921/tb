package com.taobao.android.searchbaseframe.chitu;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import java.util.Objects;
import tb.acq;
import tb.cu4;
import tb.ej4;
import tb.fsw;
import tb.t2o;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ChituPanelActivity extends Activity implements cu4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static yko b;

    /* renamed from: a  reason: collision with root package name */
    public WVUCWebView f9339a;

    static {
        t2o.a(993001723);
        t2o.a(993001565);
    }

    public static /* synthetic */ Object ipc$super(ChituPanelActivity chituPanelActivity, String str, Object... objArr) {
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/searchbaseframe/chitu/ChituPanelActivity");
        }
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fae3cf55", new Object[]{this});
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            return extras.getString("chituBiz");
        }
        return "";
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // tb.cu4
    public yko getCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("ce8ff685", new Object[]{this});
        }
        return b;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        WVUCWebView wVUCWebView = this.f9339a;
        if (wVUCWebView != null) {
            wVUCWebView.removeAllViews();
            this.f9339a.coreDestroy();
            this.f9339a = null;
        }
        b = null;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (b == null) {
            finish();
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setContentView(frameLayout);
        Objects.requireNonNull(b.d());
        fsw.i("XSearchChiTuJSBridge", TBSearchChiTuJSBridge.class, true);
        this.f9339a = new WVUCWebView(this);
        b.f().c().getClass();
        this.f9339a.setLayerType(1, null);
        this.f9339a.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        frameLayout.addView(this.f9339a);
        Uri.Builder buildUpon = Uri.parse(b.d().f28897a).buildUpon();
        buildUpon.appendQueryParameter("utdid", UTDevice.getUtdid(this));
        String a2 = a();
        if (!TextUtils.isEmpty(a2)) {
            buildUpon.appendQueryParameter("chituBiz", a2);
        }
        buildUpon.appendQueryParameter("chituSubBiz", "nativeSearch");
        buildUpon.appendQueryParameter("version", "1.0");
        buildUpon.appendQueryParameter("appVersion", ej4.c);
        this.f9339a.loadUrl(buildUpon.toString());
    }
}
