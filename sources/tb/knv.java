package tb;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class knv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705660);
    }

    public static Uri a(Uri uri, StringBuilder sb) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("dfc92434", new Object[]{uri, sb});
        }
        try {
            String encodedQuery = uri.getEncodedQuery();
            if (TextUtils.isEmpty(encodedQuery)) {
                str = sb.toString();
            } else {
                str = ((Object) sb) + "&" + encodedQuery;
            }
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(uri.getScheme()).encodedAuthority(uri.getEncodedAuthority()).encodedPath(uri.getEncodedPath()).encodedQuery(str).fragment(uri.getEncodedFragment());
            return builder.build();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Uri b(Uri uri, Map<String, String> map) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("4649720e", new Object[]{uri, map});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                if (z) {
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                    z = false;
                } else {
                    sb.append("&");
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                }
            }
        }
        return a(uri, sb);
    }

    public static Uri c(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("8429d31a", new Object[]{str, jSONObject});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
            }
        }
        return buildUpon.build();
    }

    public static Uri d(String str, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("49e4906f", new Object[]{str, map});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
            }
        }
        return buildUpon.build();
    }

    public static Uri e(String str, org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("ea540268", new Object[]{str, jSONObject});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    buildUpon.appendQueryParameter(next, jSONObject.get(next).toString());
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return buildUpon.build();
    }

    public static InputStream f(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("a91437fd", new Object[]{context, uri});
        }
        try {
            return context.getContentResolver().openInputStream(uri);
        } catch (IOException unused) {
            return null;
        }
    }

    public static boolean g(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a790fc74", new Object[]{uri, uri2})).booleanValue();
        }
        if (uri == uri2) {
            return true;
        }
        if (uri == null || uri2 == null) {
            return false;
        }
        return uri.equals(uri2);
    }

    public static Uri j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("15a00c1", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Uri.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean h(Context context, Uri uri) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59ab0d5b", new Object[]{context, uri})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            if (openAssetFileDescriptor == null) {
                z = false;
            }
            if (openAssetFileDescriptor != null) {
                try {
                    openAssetFileDescriptor.close();
                    new StringBuilder("method[isFileExist] cost:").append(System.currentTimeMillis() - currentTimeMillis);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean i(Uri uri, Uri uri2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("449415ca", new Object[]{uri, uri2})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (uri == uri2) {
            return true;
        }
        if (uri == null || uri2 == null) {
            return false;
        }
        if (uri.equals(uri2)) {
            return true;
        }
        String scheme = uri.getScheme();
        String scheme2 = uri2.getScheme();
        if ((!TextUtils.equals(scheme, scheme2) && ((!TextUtils.equals(scheme, "http") && !TextUtils.equals(scheme, "https")) || (!TextUtils.equals(scheme2, "http") && !TextUtils.equals(scheme2, "https")))) || !TextUtils.equals(uri.getHost(), uri2.getHost()) || !TextUtils.equals(uri.getPath(), uri2.getPath())) {
            z = false;
        }
        new StringBuilder("method[isSame] cost:").append(System.currentTimeMillis() - currentTimeMillis);
        return z;
    }
}
