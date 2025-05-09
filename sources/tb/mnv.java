package tb;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class mnv {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601446);
        }

        public a() {
        }

        public final Uri a(Uri uri, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("1a2f94cd", new Object[]{this, uri, str, str2});
            }
            ckf.g(str, "key");
            ckf.g(str2, "value");
            if (uri == null) {
                return uri;
            }
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                tpu.a aVar = tpu.Companion;
                aVar.d("UriUtil", "addUriParameter failed, already has key :" + str + "  value:" + queryParameter);
                return uri;
            }
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter(str, str2);
            Uri build = buildUpon.build();
            tpu.a aVar2 = tpu.Companion;
            aVar2.d("UriUtil", "addUriParameter success, key :" + str + "  value:" + str2);
            return build;
        }

        public final Uri b(Uri uri, Map<?, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("3a9b860b", new Object[]{this, uri, map});
            }
            if (uri == null || map == null || map.isEmpty()) {
                return uri;
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            HashMap hashMap = new HashMap();
            for (String str : queryParameterNames) {
                String encode = Uri.encode(str);
                ckf.f(encode, "Uri.encode(key)");
                String encode2 = Uri.encode(uri.getQueryParameter(str));
                ckf.f(encode2, "Uri.encode(uri.getQueryParameter(key))");
                hashMap.put(encode, encode2);
            }
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (!(key == null || value == null)) {
                    hashMap.put(key.toString(), value.toString());
                }
            }
            String str2 = "";
            for (Map.Entry entry2 : hashMap.entrySet()) {
                String str3 = (String) entry2.getKey();
                String str4 = (String) entry2.getValue();
                if (!(str3 == null || str3.length() == 0 || str4 == null || str4.length() == 0)) {
                    if (str2.length() > 0) {
                        str2 = str2 + '&';
                    }
                    str2 = str2 + str3 + '=' + str4;
                }
            }
            return uri.buildUpon().encodedQuery(str2).build();
        }

        public final Uri c(Uri uri, Map<?, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("eb286291", new Object[]{this, uri, map});
            }
            ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            if (map == null || map.isEmpty()) {
                return uri;
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Uri.Builder clearQuery = uri.buildUpon().clearQuery();
            HashMap hashMap = new HashMap();
            for (String str : queryParameterNames) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (!(key == null || value == null)) {
                    hashMap.put(key.toString(), Uri.decode(value.toString()));
                }
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                clearQuery.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
            }
            return clearQuery.build();
        }

        public final String d(String str, Map<?, ?> map) {
            String uri;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8f1ecc81", new Object[]{this, str, map});
            }
            ckf.g(str, "url");
            Uri parse = Uri.parse(str);
            ckf.f(parse, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            Uri c = c(parse, map);
            return (c == null || (uri = c.toString()) == null) ? str : uri;
        }

        public final Map<String, String> e(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d0978672", new Object[]{this, uri});
            }
            HashMap hashMap = new HashMap();
            if (uri != null) {
                for (String str : uri.getQueryParameterNames()) {
                    String queryParameter = uri.getQueryParameter(str);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        ckf.f(str, "key");
                        ckf.d(queryParameter);
                        hashMap.put(str, queryParameter);
                    }
                }
            }
            return hashMap;
        }

        public final Uri f(Uri uri, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("d729a7a4", new Object[]{this, uri, str});
            }
            if (TextUtils.isEmpty(str) || uri == null) {
                return uri;
            }
            String encodedQuery = uri.getEncodedQuery();
            if (!TextUtils.isEmpty(encodedQuery)) {
                str = ckf.p(str, "?" + encodedQuery);
            }
            return Uri.parse(str);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601445);
    }
}
