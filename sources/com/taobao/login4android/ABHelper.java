package com.taobao.login4android;

import com.ali.user.mobile.service.ABService;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.ab.ABDefault;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ABHelper implements ABService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String TAG = "Login.ab";

    static {
        t2o.a(517996545);
        t2o.a(68157604);
    }

    @Override // com.ali.user.mobile.service.ABService
    public int getStrategyValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c16e8c", new Object[]{this, str})).intValue();
        }
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if ("oppo_finger".equals(str)) {
            return ABDefault.getValue(ALBiometricsActivityParentView.p);
        }
        if ("reinstall_login".equals(str)) {
            return ABDefault.getValue("blo");
        }
        if ("line_display".equals(str)) {
            return ABDefault.getValue("line_display");
        }
        return 0;
    }
}
