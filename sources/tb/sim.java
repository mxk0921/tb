package tb;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.search.musie.MUSXSearchEventModule;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class sim {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793371);
    }

    public static final boolean a(Intent intent) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95a68210", new Object[]{intent})).booleanValue();
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        if (!o4p.p1() || (extras = intent.getExtras()) == null) {
            return false;
        }
        String string = extras.getString(MUSXSearchEventModule.KEY_OPEN_URL_EXTRAS);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        ckf.d(string);
        return wsq.O(string, "topHeader", false, 2, null);
    }
}
