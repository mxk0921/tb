package com.android.dingtalk.share.ddsharemodule.message;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.ShareConstant;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class BaseReq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mTransaction;

    static {
        t2o.a(90177545);
    }

    public void attachContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ff7db7", new Object[]{this, context});
        }
    }

    public abstract boolean checkArgs();

    public void fromBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338d7aa1", new Object[]{this, bundle});
        } else if (bundle != null) {
            this.mTransaction = bundle.getString(ShareConstant.EXTRA_BASEREQ_TRANSACTION);
        }
    }

    public abstract int getSupportVersion();

    public abstract int getType();

    public void toBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4016170", new Object[]{this, bundle});
        } else if (bundle != null) {
            bundle.putInt(ShareConstant.EXTRA_COMMAND_TYPE, getType());
            bundle.putString(ShareConstant.EXTRA_BASEREQ_TRANSACTION, this.mTransaction);
        }
    }
}
