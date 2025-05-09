package com.taobao.taobao.wxapi;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.acq;
import tb.gvw;
import tb.hav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class WXApiEntryActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WXApiEntryActivity wXApiEntryActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taobao/wxapi/WXApiEntryActivity");
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

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        if (data == null) {
            finish();
        }
        String queryParameter = data.getQueryParameter("userName");
        String queryParameter2 = data.getQueryParameter("path");
        String queryParameter3 = data.getQueryParameter("miniProgramType");
        if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2) || TextUtils.isEmpty(queryParameter3)) {
            finish();
        }
        hav.d("WXApiEntryActivity", "调用 launchMiniProgram userName:" + queryParameter + ";path:" + queryParameter2 + ";miniProgramType:" + queryParameter3);
        gvw.l(this);
        gvw.b().k(queryParameter, queryParameter2, Integer.parseInt(queryParameter3));
    }
}
