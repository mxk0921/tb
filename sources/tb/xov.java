package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class xov {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final xov INSTANCE = new xov();

    static {
        t2o.a(758120585);
    }

    @JvmStatic
    public static final boolean a(Uri uri, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fadc4001", new Object[]{uri, str, new Boolean(z)})).booleanValue();
        }
        return krq.b(c(uri, str, null, 4, null), z);
    }

    @JvmStatic
    public static final String b(Uri uri, String str, String str2) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20455f14", new Object[]{uri, str, str2});
        }
        if (uri == null || str == null || (queryParameter = uri.getQueryParameter(str)) == null) {
            return str2;
        }
        return queryParameter;
    }

    public static /* synthetic */ String c(Uri uri, String str, String str2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6fdd2f0", new Object[]{uri, str, str2, new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return b(uri, str, str2);
    }
}
