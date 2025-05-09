package tb;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class cnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537628);
    }

    public static final String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7b63c6f", new Object[]{str, str2, str3});
        }
        ckf.h(str, "$this$overwriteQueryParameter");
        ckf.h(str2, "key");
        ckf.h(str3, "value");
        try {
            Uri parse = Uri.parse(str);
            ckf.c(parse, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            for (String str4 : queryParameterNames) {
                if (!ckf.b(str2, str4)) {
                    clearQuery.appendQueryParameter(str4, parse.getQueryParameter(str4));
                }
            }
            String uri = clearQuery.appendQueryParameter(str2, str3).build().toString();
            ckf.c(uri, "uriBuilder.appendQueryPa…value).build().toString()");
            return uri;
        } catch (Throwable unused) {
            return str;
        }
    }
}
