package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y7l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Nav:OptionalInterceptor";

    static {
        t2o.a(578814087);
    }

    public static Uri a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("38e7ba7f", new Object[]{uri});
        }
        String str = null;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme == null) {
            String uri2 = uri.toString();
            if (uri2.startsWith(itw.URL_SEPARATOR)) {
                str = "http:".concat(uri2);
            } else {
                str = h1p.HTTP_PREFIX.concat(uri2);
            }
        } else if (scheme.startsWith(itw.URL_SEPARATOR)) {
            str = "http:" + uri;
        }
        if (TextUtils.isEmpty(str)) {
            return uri;
        }
        TLog.loge("Nav", "The Url used to determine has a scheme added, urlString: " + str);
        return Uri.parse(str);
    }

    public static String b(String[] strArr, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82d18711", new Object[]{strArr, uri});
        }
        if (!(strArr == null || uri == null)) {
            try {
                for (String str : strArr) {
                    if (uri.getQueryParameter(str) != null) {
                        return str;
                    }
                }
                return null;
            } catch (UnsupportedOperationException e) {
                TLog.loge(TAG, "不支持的 Uri:" + Log.getStackTraceString(e));
            } catch (Exception e2) {
                TLog.loge(TAG, "未知异常 Uri:" + Log.getStackTraceString(e2));
                return null;
            }
        }
        return null;
    }
}
