package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.login4android.api.Login;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class hvr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final hvr INSTANCE = new hvr();
    public static final String SOURCE_HOME_TO_SEARCH_DOOR = "homeClickSearchInput";
    public static final String SOURCE_HOME_TO_SRP = "homeClickSearchButton";

    static {
        t2o.a(815793509);
    }

    public final void a(Intent intent, String str) {
        Uri data;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f8254b", new Object[]{this, intent, str});
            return;
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        ckf.g(str, "source");
        if (o4p.g0() && (data = intent.getData()) != null && (queryParameter = data.getQueryParameter("spm")) != null && tsq.I(queryParameter, "a2141.1.", false, 2, null) && Login.recordAndCheckNeedLogin(str)) {
            c4p.D("TBSLoginUtils", "needLogin==true, call Login.login()", new Object[0]);
            Bundle bundle = new Bundle();
            bundle.putString("source", str);
            Login.login(true, bundle);
        }
    }
}
