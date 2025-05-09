package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class s47 implements zcd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f27785a;
    public final List<String> b;
    public final List<String> c;

    static {
        t2o.a(989856366);
        t2o.a(989856367);
    }

    public s47(int i, List<String> list, List<String> list2) {
        this.f27785a = i;
        this.b = list;
        this.c = list2;
    }

    @Override // tb.zcd
    public boolean a(String str, String str2) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("743286b2", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "preRenderUrl");
        ckf.g(str2, "pageUrl");
        try {
            int i = this.f27785a;
            if (i == 0) {
                return false;
            }
            if (i == 1) {
                String queryParameter = Uri.parse(str2).getQueryParameter("spm");
                List z0 = queryParameter != null ? wsq.z0(queryParameter, new String[]{"."}, false, 0, 6, null) : null;
                List<String> list = this.b;
                if (list != null) {
                    List<String> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (String str3 : list2) {
                            if (TextUtils.equals(str3, "*")) {
                                z2 = true;
                                continue;
                            } else {
                                if (z0 != null && z0.size() >= 2) {
                                    z2 = TextUtils.equals(str3, (String) z0.get(1));
                                    continue;
                                }
                                z2 = false;
                            }
                            if (z2) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                z = false;
                if (!z) {
                    lcn.f(RVLLevel.Error, "Themis/Performance/Prerender", "spm not matched");
                    return false;
                }
            }
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(str2);
            ckf.f(parse, "preRenderUri");
            String scheme = parse.getScheme();
            ckf.f(parse2, "pageUri");
            if (ckf.b(scheme, parse2.getScheme()) && ckf.b(parse.getHost(), parse2.getHost()) && ckf.b(parse.getPath(), parse2.getPath())) {
                for (String str4 : parse.getQueryParameterNames()) {
                    List<String> list3 = this.c;
                    if (list3 == null || !list3.contains(str4)) {
                        ckf.f(str4, "query");
                        if (!(wsq.O(str2, str4, false, 2, null) && ckf.b(parse.getQueryParameter(str4), parse2.getQueryParameter(str4)))) {
                            return false;
                        }
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
            return false;
        }
    }
}
