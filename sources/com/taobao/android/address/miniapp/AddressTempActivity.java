package com.taobao.android.address.miniapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.acq;
import tb.ef0;
import tb.mf0;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AddressTempActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AddressTempActivity";
    public static BridgeCallback b;

    /* renamed from: a  reason: collision with root package name */
    public LinearLayout f6302a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                AddressTempActivity.this.finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements ef0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.ef0
        public void onFail(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                return;
            }
            AddressTempActivity addressTempActivity = AddressTempActivity.this;
            BridgeCallback bridgeCallback = AddressTempActivity.b;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            AddressTempActivity.a(addressTempActivity, bridgeCallback, i, str);
            AddressTempActivity.this.finish();
        }

        @Override // tb.ef0
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            if (AddressTempActivity.b != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("data", (Object) str);
                AddressTempActivity.b.sendJSONResponse(jSONObject);
            }
            AddressTempActivity.this.finish();
        }
    }

    public static /* synthetic */ void a(AddressTempActivity addressTempActivity, BridgeCallback bridgeCallback, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ad23f3", new Object[]{addressTempActivity, bridgeCallback, new Integer(i), str});
        } else {
            addressTempActivity.c(bridgeCallback, i, str);
        }
    }

    public static /* synthetic */ Object ipc$super(AddressTempActivity addressTempActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/address/miniapp/AddressTempActivity");
        }
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

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2202f59c", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        if (intent == null) {
            d();
            finish();
            return;
        }
        try {
            mf0.k(this, intent.getStringExtra("bizIdentity"), intent.getStringExtra("channel"), intent.getStringExtra(z9u.KEY_TAOKE_BIZSCENE), new b());
        } catch (Exception unused) {
            c(b, -1, "系统异常");
            finish();
        }
    }

    public final void c(BridgeCallback bridgeCallback, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54cae59a", new Object[]{this, bridgeCallback, new Integer(i), str});
        } else if (bridgeCallback != null) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(i, str));
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f242a67", new Object[]{this});
            return;
        }
        BridgeCallback bridgeCallback = b;
        if (bridgeCallback != null) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(-2, ""));
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i == 2001) {
            if (i2 != -1 && !TextUtils.isEmpty(mf0.c)) {
                i2 = -1;
            }
            mf0.i(i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        LinearLayout linearLayout = new LinearLayout(this);
        this.f6302a = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setContentView(this.f6302a);
        this.f6302a.setOnClickListener(new a());
        this.f6302a.setClickable(true);
        this.f6302a.setLongClickable(true);
        b();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        b = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        overridePendingTransition(0, 0);
        super.onPause();
    }
}
