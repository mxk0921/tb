package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uks extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 12;

    /* renamed from: a  reason: collision with root package name */
    public static final String f29446a = "TSBizinfoAldExpression";

    static {
        t2o.a(329252923);
    }

    public uks(String str) {
    }

    public static String c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c78cb0eb", new Object[]{uri});
        }
        String d = d(uri);
        if (d == null) {
            return e(uri);
        }
        return d;
    }

    public static String e(Uri uri) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d991a58", new Object[]{uri});
        }
        String host = uri.getHost();
        if (host != null) {
            String[] split = host.split("\\.");
            if (split.length >= 2) {
                str = split[split.length - 2];
                String path = uri.getPath();
                if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(path)) {
                    return null;
                }
                return "business=" + str + ";page=" + path;
            }
        }
        str = null;
        String path2 = uri.getPath();
        if (!TextUtils.isEmpty(str)) {
        }
        return null;
    }

    public static uks f(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uks) ipChange.ipc$dispatch("8d5af403", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@bizinfo_ald")) {
            return new uks(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(uks uksVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/headers/TSBizinfoAldExpression");
    }

    /* renamed from: g */
    public String b(wp8 wp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        try {
            Uri j = wp8Var.j();
            if (j == null) {
                return null;
            }
            String c = c(j);
            String str = f29446a;
            zdh.a(str, "parse bizinfo_ald params = " + c);
            return c;
        } catch (Throwable th) {
            zdh.b(f29446a, "parse bizinfo_ald params error", th);
            return null;
        }
    }

    public static String d(Uri uri) {
        String str;
        int indexOf;
        int i;
        int indexOf2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c069684", new Object[]{uri});
        }
        String path = uri.getPath();
        String substring = (TextUtils.isEmpty(path) || (indexOf = path.indexOf("/wow/a/act/")) < 0 || (indexOf2 = path.indexOf("/", (i = indexOf + 11))) <= i) ? null : path.substring(i, indexOf2);
        String queryParameter = uri.getQueryParameter("wh_pid");
        if (!TextUtils.isEmpty(queryParameter)) {
            String[] split = queryParameter.split("-");
            if (split.length > 0) {
                str = split[split.length - 1];
                if (!TextUtils.isEmpty(substring) || TextUtils.isEmpty(str)) {
                    return null;
                }
                return "business=" + substring + ";page=" + str;
            }
        }
        str = null;
        if (!TextUtils.isEmpty(substring)) {
        }
        return null;
    }
}
