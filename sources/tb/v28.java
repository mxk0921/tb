package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class v28 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HOST = "h5.m.taobao.com";
    public static final v28 INSTANCE = new v28();
    public static final String PATH = "/guangguang/dx.htm";

    static {
        t2o.a(502267906);
    }

    public final boolean a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29b9d74e", new Object[]{this, context, intent})).booleanValue();
        }
        ckf.g(context, "context");
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        Uri data = intent.getData();
        if (data == null || !ckf.b("h5.m.taobao.com", data.getHost()) || !ckf.b(PATH, data.getPath())) {
            return false;
        }
        return true;
    }
}
