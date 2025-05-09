package com.taobao.tao.alipay.callservice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.alipay.export.CashdeskConstants;
import com.taobao.taobao.R;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopAccountSiteUtils;
import org.json.JSONException;
import org.json.JSONObject;
import tb.acq;
import tb.nyn;
import tb.ov2;
import tb.sih;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AlipayCallServiceActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIPAY_EXTERN_TOKEN = "extern_token";
    public static final int ALIPAY_RESULT_CODE = 1001;

    public static /* synthetic */ Object ipc$super(AlipayCallServiceActivity alipayCallServiceActivity, String str, Object... objArr) {
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
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/alipay/callservice/AlipayCallServiceActivity");
        }
    }

    public final String a(String str) {
        sih c;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22690597", new Object[]{this, str});
        }
        return (str == null || !str.equalsIgnoreCase("xianyu") || (c = nyn.c(Mtop.instance(MtopAccountSiteUtils.getInstanceId("xianyu"), getApplicationContext()), null)) == null || (str2 = c.f28073a) == null) ? Login.getSid() : str2;
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

    public String b(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2998d7e9", new Object[]{this, intent, str});
        }
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            ov2.c().a(intent);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
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
        getWindow().addFlags(16);
        String b = b(getIntent(), "bizType");
        String b2 = b(getIntent(), ov2.ALIPAY_SIGN_PARAMS);
        String b3 = b(getIntent(), ov2.ALIPAY_ACCOUNT_SITE);
        if (b == null || b2 == null) {
            finish();
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(getApplication().getPackageName());
        intent.setAction(CashdeskConstants.ALIPAY_ACTION);
        intent.putExtra("bizType", b);
        try {
            intent.putExtra("data", new JSONObject().put(ov2.ALIPAY_SIGN_PARAMS, b2).put(ALIPAY_EXTERN_TOKEN, a(b3)).toString());
            startActivityForResult(intent, 1001);
        } catch (JSONException unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ov2.c().b();
        super.onDestroy();
    }
}
