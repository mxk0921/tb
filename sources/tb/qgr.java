package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.taobao.impl.TBTMSSDK;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qgr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(835715217);
    }

    public static void a(Context context) {
        try {
            IpChange ipChange = TBTMSSDK.$ipChange;
            TBTMSSDK.class.getDeclaredMethod("initTBTMS", Context.class).invoke(null, context);
        } catch (Throwable th) {
            TMSLogger.c("TBInitUtils", "initNecessary failed", th);
        }
    }
}
