package com.taobao.android.detail.core.detail.activity;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class DetailCoreActivity extends TaobaoBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(438304777);
    }

    public static /* synthetic */ Object ipc$super(DetailCoreActivity detailCoreActivity, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/core/detail/activity/DetailCoreActivity");
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity, com.taobao.android.detail.core.detail.activity.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }
}
