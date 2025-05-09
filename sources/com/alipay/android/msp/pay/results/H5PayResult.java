package com.alipay.android.msp.pay.results;

import android.os.Bundle;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class H5PayResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3718a = false;
    public String b = null;

    public static H5PayResult fromBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (H5PayResult) ipChange.ipc$dispatch("597f8768", new Object[]{bundle});
        }
        H5PayResult h5PayResult = new H5PayResult();
        fromBundle(bundle, h5PayResult);
        return h5PayResult;
    }

    public static String getCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62e82389", new Object[0]);
        }
        ResultStatus resultState = ResultStatus.getResultState(ResultStatus.CANCELED.getStatus());
        return a(resultState.getStatus(), resultState.getMemo(), "");
    }

    public static String getParamsError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c7c478d", new Object[0]);
        }
        ResultStatus resultState = ResultStatus.getResultState(ResultStatus.PARAMS_ERROR.getStatus());
        return a(resultState.getStatus(), resultState.getMemo(), "");
    }

    public static Bundle toBundle(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("915ce7e", new Object[]{new Boolean(z), str});
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("s", z);
        bundle.putString("r", str);
        return bundle;
    }

    public String getResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ea3fdc6", new Object[]{this});
        }
        return this.b;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.f3718a;
    }

    public void setResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2585a870", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void setSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
        } else {
            this.f3718a = z;
        }
    }

    public static String a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c48ece0", new Object[]{new Integer(i), str, str2});
        }
        String str3 = "resultStatus={" + i + "};memo={" + str + "};result={" + str2 + "}";
        LogUtil.record(2, "H5PayResult:parseResult", "sb=".concat(String.valueOf(str3)));
        return str3;
    }

    public static void fromBundle(Bundle bundle, H5PayResult h5PayResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67dfdef4", new Object[]{bundle, h5PayResult});
        } else if (bundle != null && h5PayResult != null) {
            h5PayResult.b = bundle.getString("r");
            h5PayResult.f3718a = bundle.getBoolean("s", false);
        }
    }
}
