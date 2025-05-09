package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.umbrella.link.export.TraceLogEventType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TTraceLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class org {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25598a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ TraceLogEventType g;

        public a(String str, String str2, String str3, String str4, String str5, String str6, TraceLogEventType traceLogEventType) {
            this.f25598a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = traceLogEventType;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c263aadc", new Object[]{this, str});
                return;
            }
            Log.e(this.f25598a, str);
            TTraceLog.event("", "", this.f25598a + "[" + this.b + "]", this.c, 0L, this.d, this.e, this.f, this.g.getValue(), str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
    }

    public static String a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6453e00", new Object[]{str, strArr});
        }
        if (strArr == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append(".");
                }
                sb.append(strArr[i]);
                if (strArr.length > 1) {
                    sb.append(" |");
                }
            } else {
                sb.append(" ");
                sb.append(strArr[i]);
            }
        }
        return sb.toString();
    }

    public static void b(String str, b bVar) {
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1efc30b1", new Object[]{str, bVar});
        } else if (str != null) {
            if (str.length() == 0) {
                str = " ";
            }
            while (i < str.length()) {
                int i2 = i + 25600;
                if (str.length() <= i2) {
                    str2 = str.substring(i);
                } else {
                    str2 = str.substring(i, i2);
                }
                if (i != 0) {
                    str2 = "----- log split -----\n" + str2;
                }
                ((a) bVar).a(str2);
                i = i2;
            }
        }
    }

    public static void c(String str, String str2, String str3, String str4, String str5, String str6, TraceLogEventType traceLogEventType, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e3476d", new Object[]{str, str2, str3, str4, str5, str6, traceLogEventType, strArr});
        } else if (!idv.F()) {
            b(a(str3, strArr), new a(str, str2, str3, str4, str5, str6, traceLogEventType));
        }
    }
}
