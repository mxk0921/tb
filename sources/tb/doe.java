package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.loader.network.HttpCodeResponseException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class doe implements qkd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f17983a;

    static {
        t2o.a(919601219);
        t2o.a(620757102);
    }

    public final doe a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (doe) ipChange.ipc$dispatch("3b7b90d", new Object[]{this, str});
        }
        if (str == null || !tsq.w(str, "END_IMAGE_URL", false, 2, null)) {
            this.f17983a = str;
        } else {
            String substring = str.substring(0, str.length() - 13);
            ckf.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            this.f17983a = substring;
        }
        return this;
    }

    @Override // tb.qkd
    public Pair<String, String> getDefaultRetryUrlPair() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("101e44dd", new Object[]{this});
        }
        return null;
    }

    @Override // tb.qkd
    public String getRetryUrl(PhenixCreator phenixCreator, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bd53dee", new Object[]{this, phenixCreator, th});
        }
        ckf.g(phenixCreator, "creator");
        ckf.g(th, "throwable");
        if (!(th instanceof HttpCodeResponseException) || ((HttpCodeResponseException) th).getHttpCode() != 404) {
            return null;
        }
        String str = this.f17983a;
        ckf.d(str);
        return str;
    }
}
