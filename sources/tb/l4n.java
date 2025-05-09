package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l4n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f23108a = "umi_pub_session";

    public static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21946b77", new Object[]{uri});
        }
        if (uri == null) {
            return UUID.randomUUID().toString();
        }
        String queryParameter = uri.getQueryParameter(f23108a);
        if (!TextUtils.isEmpty(queryParameter)) {
            return queryParameter;
        }
        return UUID.randomUUID().toString();
    }

    static {
        t2o.a(511705305);
    }
}
