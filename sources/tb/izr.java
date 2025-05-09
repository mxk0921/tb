package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbwaitpay.impl.aspect.error.build")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class izr extends vs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(725614620);
    }

    public static /* synthetic */ Object ipc$super(izr izrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/waitpay/extension/aspect/TBWaitPayBuildOrderErrorExtension");
    }

    @Override // tb.wab
    public void b(mi miVar) {
        int i;
        String str;
        y7n y7nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            return;
        }
        miVar.b();
        if ("AURANextRPCServiceDomain".equals(miVar.c())) {
            String str2 = null;
            kk kkVar = (kk) fk.b(miVar.d(), "NextRPCRemoteResponse", kk.class, null);
            if (kkVar == null) {
                ck.g().b("TBBuyBuildOrderErrorExtension", "onError", "remoteResponse is null");
            } else if (!om0.b(m0(), kkVar)) {
                String h = kkVar.h();
                String i2 = kkVar.i();
                MtopResponse e = kkVar.e();
                if (e != null) {
                    i = e.getResponseCode();
                    str2 = e.getMappingCode();
                    if (e.isNetworkError()) {
                        str = ds8.NETWORK_ERROR_MSG;
                    } else if (e.isApiLockedResult()) {
                        str = k5n.BUILD_DATA_PARSE_ERROR_MSG_NEW;
                    } else {
                        str = e.getRetMsg();
                    }
                } else {
                    i = 200;
                    str = i2;
                }
                g4o g4oVar = (g4o) m0().g("aliBuyRequestHelper", g4o.class);
                if (g4oVar == null) {
                    y7nVar = new y7n(new HashMap());
                } else {
                    y7nVar = g4oVar.h();
                }
                if (y7nVar == null) {
                    new y7n(new HashMap());
                    L().b(new mi(1, vs.ERROR_DOMAIN, "emptyQueryKey", "queryKey为空"));
                }
                Context f = m0().f();
                if (!"F-10000-00-15-002".equals(h)) {
                    if ("FAIL_SYS_SESSION_EXPIRED".equals(h)) {
                        if (f instanceof Activity) {
                            ((Activity) f).finish();
                        }
                    } else if (i == 419) {
                        i2 = k5n.BUILD_ORDER_WARNING_TITLE_NEW;
                        if (f instanceof Activity) {
                            ((Activity) f).finish();
                        }
                    } else {
                        String str3 = TextUtils.isEmpty(str2) ? h : str2;
                        i2 = k5n.BUILD_ORDER_WARNING_TITLE_NEW;
                        J0(f, e, i2, str3, str, false, true);
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str2 = h;
                    }
                    z9r.b(str2, i2);
                    L().b(new mi(1, vs.ERROR_DOMAIN, h, i2));
                }
            }
        }
    }
}
