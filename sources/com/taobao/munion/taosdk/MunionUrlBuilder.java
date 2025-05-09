package com.taobao.munion.taosdk;

import android.net.Uri;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.utils.UserTrackLogs;
import tb.js0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MunionUrlBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1017118856);
    }

    public static String appendClickidToTargetUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef52932b", new Object[]{str, str2});
        }
        if (str == null || str.trim().length() == 0) {
            return "";
        }
        return appendQueryParameter(str, "clickid", str2, true);
    }

    @Deprecated
    public static String appendEparamsToTargetUrl(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c1abd69", new Object[]{str, str2, str3});
        }
        if (str == null || str.trim().length() == 0) {
            return "";
        }
        return appendQueryParameter(appendQueryParameter(str, js0.E_URL, str2), "etype", str3);
    }

    public static String appendQueryParameter(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f8c1b3c0", new Object[]{str, str2, str3}) : appendQueryParameter(str, str2, str3, false);
    }

    public static String appendQueryParameter(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2b2e92c", new Object[]{str, str2, str3, new Boolean(z)});
        }
        if (str2 == null || str2.trim().length() == 0) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter(str2);
        if (queryParameter == null || queryParameter.trim().length() == 0) {
            Uri.Builder buildUpon = parse.buildUpon();
            String path = parse.getPath();
            if (path == null || path.length() == 0) {
                buildUpon.appendPath("");
            }
            return buildUpon.appendQueryParameter(str2, str3).toString();
        } else if (!z) {
            return str;
        } else {
            String replace = str.replace(str2 + "=" + queryParameter, str2 + "=" + str3);
            AppMonitor.Alarm.commitSuccess(UserTrackLogs.UT_PAGE_NAME, "Munion_Url_Param_Replace", String.format("%s%c%s", str, 1, replace));
            return replace;
        }
    }

    public static Uri appendClickidToTargetUrl(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("799ee767", new Object[]{uri, str});
        }
        if (uri == null) {
            return null;
        }
        return appendQueryParameter(uri, "clickid", str, true);
    }

    @Deprecated
    public static String appendEparamsToTargetUrl(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("436de09f", new Object[]{str, str2, str3, str4});
        }
        if (str == null || str.trim().length() == 0) {
            return "";
        }
        return appendQueryParameter(appendQueryParameter(appendQueryParameter(str, js0.E_URL, str2), "etype", str3), "epid", str4);
    }

    @Deprecated
    public static Uri appendEparamsToTargetUrl(Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("6a6b86b9", new Object[]{uri, str, str2});
        }
        if (uri == null) {
            return null;
        }
        return appendQueryParameter(appendQueryParameter(uri, js0.E_URL, str), "etype", str2);
    }

    @Deprecated
    public static Uri appendEparamsToTargetUrl(Uri uri, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("80384003", new Object[]{uri, str, str2, str3});
        }
        if (uri == null) {
            return null;
        }
        return appendQueryParameter(appendQueryParameter(appendQueryParameter(uri, js0.E_URL, str), "etype", str2), "epid", str3);
    }

    public static Uri appendQueryParameter(Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("303a26d0", new Object[]{uri, str, str2}) : appendQueryParameter(uri, str, str2, false);
    }

    public static Uri appendQueryParameter(Uri uri, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("645da992", new Object[]{uri, str, str2, new Boolean(z)});
        }
        if (str == null || str.trim().length() == 0) {
            return uri;
        }
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null || queryParameter.trim().length() == 0) {
            Uri.Builder buildUpon = uri.buildUpon();
            String path = uri.getPath();
            if (path == null || path.length() == 0) {
                buildUpon.appendPath("");
            }
            return buildUpon.appendQueryParameter(str, str2).build();
        } else if (!z) {
            return uri;
        } else {
            String uri2 = uri.toString();
            String replace = uri2.replace(str + "=" + queryParameter, str + "=" + str2);
            AppMonitor.Alarm.commitSuccess(UserTrackLogs.UT_PAGE_NAME, "Munion_Url_Param_Replace", String.format("%s%c%s", uri2, 1, replace));
            return Uri.parse(replace);
        }
    }
}
