package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hls extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 9;

    /* renamed from: a  reason: collision with root package name */
    public final String f20733a;

    static {
        t2o.a(329252936);
    }

    public hls(String str) {
        try {
            this.f20733a = str.substring(9);
        } catch (Throwable th) {
            zdh.b(als.TAG, "parse TSFullUrlExpression error", th);
        }
    }

    public static hls c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hls) ipChange.ipc$dispatch("c4f801c1", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@fullUrl.")) {
            return new hls(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(hls hlsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/other/TSFullUrlExpression");
    }

    /* renamed from: d */
    public String b(wp8 wp8Var) {
        String str;
        char c = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        try {
            Uri j = wp8Var.j();
            if (!TextUtils.isEmpty(this.f20733a) && j != null) {
                String str2 = this.f20733a;
                switch (str2.hashCode()) {
                    case -907987547:
                        if (str2.equals("scheme")) {
                            break;
                        }
                        c = 65535;
                        break;
                    case 96673:
                        if (str2.equals("all")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3208616:
                        if (str2.equals("host")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3433509:
                        if (str2.equals("path")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3446913:
                        if (str2.equals("port")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 107944136:
                        if (str2.equals("query")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1475610435:
                        if (str2.equals("authority")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        str = j.toString();
                        break;
                    case 1:
                        str = j.getScheme();
                        break;
                    case 2:
                        str = j.getHost();
                        break;
                    case 3:
                        str = j.getPath();
                        break;
                    case 4:
                        str = j.getQuery();
                        break;
                    case 5:
                        str = j.getAuthority();
                        break;
                    case 6:
                        str = String.valueOf(j.getPort());
                        break;
                    default:
                        str = null;
                        break;
                }
                zdh.a(als.TAG, "parse fullUrl params = " + str);
                return str;
            }
            return null;
        } catch (Throwable th) {
            zdh.b(als.TAG, "parse fullUrl params error", th);
            return null;
        }
    }
}
