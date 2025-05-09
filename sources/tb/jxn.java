package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.appbundle.a;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class jxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jxn INSTANCE = new jxn();

    static {
        t2o.a(815793461);
    }

    @JvmStatic
    public static final boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("660d8118", new Object[]{context, str})).booleanValue();
        }
        ckf.g(context, "context");
        if (str == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return INSTANCE.a(context, str);
    }

    public final boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7456ddb7", new Object[]{this, context, str})).booleanValue();
        }
        if (o4p.c()) {
            try {
                bcq.a().g(context, false, str);
            } catch (Exception unused) {
            }
        }
        try {
            ucq h = a.Companion.a().h();
            if (!(h == null || BundleInfoManager.instance().getDynamicFeatureInfo(str) == null)) {
                if (h.f().contains(str)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }
}
