package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.dynamicdataencrypt.IDynamicDataEncryptComponent;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class d7p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d7p INSTANCE = new d7p();

    static {
        t2o.a(843055403);
    }

    public final IDynamicDataEncryptComponent a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDynamicDataEncryptComponent) ipChange.ipc$dispatch("1b084e4d", new Object[]{this, context});
        }
        SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
        if (instance == null) {
            return null;
        }
        return instance.getDynamicDataEncryptComp();
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{this, str});
        }
        ckf.g(str, "key");
        IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
        String str2 = null;
        Application applicationContext = iEnvironmentService == null ? null : iEnvironmentService.getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        str2 = "";
        String d = wcs.d(applicationContext, "tbSecStorageSP", str, str2);
        if (!TextUtils.isEmpty(d)) {
            try {
                IDynamicDataEncryptComponent a2 = a(applicationContext);
                if (a2 != null) {
                    str2 = a2.dynamicDecryptDDp(d);
                }
            } catch (Throwable th) {
                TMSLogger.c("SecSPUtils", str2, th);
            }
        }
        TMSLogger.a("SecSPUtils", "get key: " + str + " value:" + ((Object) str2));
        return str2;
    }

    public final void c(String str, String str2) {
        String dynamicEncryptDDp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb567a1b", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "key");
        ckf.g(str2, "value");
        IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
        xhv xhvVar = null;
        Application applicationContext = iEnvironmentService == null ? null : iEnvironmentService.getApplicationContext();
        if (applicationContext != null) {
            TMSLogger.a("SecSPUtils", "put key: " + str + " value:" + str2);
            try {
                IDynamicDataEncryptComponent a2 = INSTANCE.a(applicationContext);
                if (!(a2 == null || (dynamicEncryptDDp = a2.dynamicEncryptDDp(str2)) == null)) {
                    wcs.j(applicationContext, "tbSecStorageSP", str, dynamicEncryptDDp);
                    xhvVar = xhv.INSTANCE;
                }
                Result.m1108constructorimpl(xhvVar);
            } catch (Throwable th) {
                Result.m1108constructorimpl(b.a(th));
            }
        }
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{this, str});
            return;
        }
        ckf.g(str, "key");
        IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
        Application applicationContext = iEnvironmentService == null ? null : iEnvironmentService.getApplicationContext();
        if (applicationContext != null) {
            wcs.f(applicationContext, "tbSecStorageSP", str);
            TMSLogger.a("SecSPUtils", ckf.p("remove key: ", str));
        }
    }
}
