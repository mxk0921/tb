package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.inside.adapter.TMSOrangeProxy;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class v9s implements vwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final v9s INSTANCE = new v9s();

    static {
        t2o.a(847249438);
        t2o.a(847249434);
    }

    public final List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eebc7ecc", new Object[]{this});
        }
        List<String> z0 = wsq.z0(TMSOrangeProxy.INSTANCE.getConfigByGroupAndNameFromLocal("pha_tab_config", "themis_domain_white_list", "*.taobao.com,*.tmall.com,*.alicdn.com,*.alibaba-inc.com"), new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(zz3.q(z0, 10));
        for (String str : z0) {
            arrayList.add(wsq.Q0(str).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // tb.vwd
    public boolean a(mpj mpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4350870", new Object[]{this, mpjVar})).booleanValue();
        }
        ckf.g(mpjVar, "navigationInfo");
        try {
            if (ckf.b("true", mpjVar.c().getQueryParameter("skip_domain_check")) && CommonExtKt.j()) {
                return true;
            }
            String host = mpjVar.c().getHost();
            if (host == null) {
                return false;
            }
            List<String> b = INSTANCE.b();
            if (!(b instanceof Collection) || !b.isEmpty()) {
                for (String str : b) {
                    if (INSTANCE.c(str, host)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            Object obj = Result.m1108constructorimpl(b.a(th));
            if (Result.m1111exceptionOrNullimpl(obj) != null) {
                obj = Boolean.FALSE;
            }
            return ((Boolean) obj).booleanValue();
        }
    }

    public final boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da4e0780", new Object[]{this, str, str2})).booleanValue();
        }
        if (ckf.b("*", str)) {
            return true;
        }
        if (!tsq.I(str, "*.", false, 2, null)) {
            return ckf.b(str, str2);
        }
        String substring = str.substring(2);
        ckf.f(substring, "this as java.lang.String).substring(startIndex)");
        return tsq.w(str2, substring, false, 2, null) && str2.length() > substring.length() && str2.charAt((str2.length() - substring.length()) - 1) == '.';
    }
}
