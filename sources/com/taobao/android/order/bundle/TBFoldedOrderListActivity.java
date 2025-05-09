package com.taobao.android.order.bundle;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBFoldedOrderListActivity extends TBOrderListActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031686);
    }

    public static /* synthetic */ Object ipc$super(TBFoldedOrderListActivity tBFoldedOrderListActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1104351997) {
            super.s3((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/order/bundle/TBFoldedOrderListActivity");
        }
    }

    @Override // com.taobao.android.order.bundle.TBOrderListActivity
    public void N4(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8173b645", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            jSONObject.put("foldDeviceRelatedPage", "true");
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
        super.s3(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}
