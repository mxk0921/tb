package com.taobao.tao.detail.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;
import tb.acq;
import tb.h8n;
import tb.t2o;
import tb.xq0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DetailActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(698351635);
    }

    public DetailActivity() {
        ApplicationInvoker.getInstance("com.taobao.android.detail").invoke("com.taobao.android.detail.DetailApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(DetailActivity detailActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/detail/activity/DetailActivity");
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

    public final void l3(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49674199", new Object[]{this, str, str2});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(Constants.MYBROWSERURL, str2);
        bundle.putString("ItemIdForceH5", str);
        xq0.c().a(this).d(bundle).c(str2);
        overridePendingTransition(R.anim.old_detail_h5_fade_in, R.anim.old_detail_h5_fade_out);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(null);
        Intent intent = getIntent();
        if (intent != null) {
            String c = new h8n(intent).c();
            if (!TextUtils.isEmpty(c)) {
                l3(c, "https://main.m.taobao.com/detail/index.html?id=" + c + "&hybrid=true");
            }
        }
        finish();
    }
}
