package com.ali.user.mobile.login.presenter;

import android.os.Build;
import com.ali.user.mobile.rpc.login.model.WSecurityData;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ScanFaceWSecurityData extends WSecurityData {
    public String deviceBrand;
    public String deviceModel;
    public String deviceName;
    public ExtRiskData extRiskData;

    static {
        t2o.a(69206141);
    }

    public ScanFaceWSecurityData() {
        String str = Build.BRAND;
        this.deviceBrand = str;
        String str2 = Build.MODEL;
        this.deviceModel = str2;
        this.deviceName = str + f7l.BRACKET_START_STR + str2 + f7l.BRACKET_END_STR;
    }
}
