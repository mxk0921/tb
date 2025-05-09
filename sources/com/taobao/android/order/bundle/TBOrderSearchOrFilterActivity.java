package com.taobao.android.order.bundle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.acq;
import tb.hav;
import tb.jql;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBOrderSearchOrFilterActivity extends TBOrderListActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031730);
    }

    public static /* synthetic */ Object ipc$super(TBOrderSearchOrFilterActivity tBOrderSearchOrFilterActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1104351997) {
            super.s3((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/order/bundle/TBOrderSearchOrFilterActivity");
        }
    }

    @Override // com.taobao.android.order.bundle.TBOrderListActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.taobao.android.order.bundle.TBOrderListActivity, com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity
    public void s3(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be2ced03", new Object[]{this, bundle});
            return;
        }
        hav.d("TBOrderSearchOrFilterActivity", "onCreate");
        if (!TextUtils.isEmpty(jql.m(getIntent(), "searchKey"))) {
            getIntent().putExtra("isSearch", "true");
        }
        super.s3(bundle);
    }
}
