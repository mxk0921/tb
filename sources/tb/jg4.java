package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appfrmbundle.mkt.MKTHandler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jg4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a f21983a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    static {
        t2o.a(628097055);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dba15a12", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(c(str, "" + i));
        } catch (Exception unused) {
            return i;
        }
    }

    public static long b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95ce36f", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            return Long.parseLong(c(str, "" + j));
        } catch (Exception unused) {
            return j;
        }
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d09da18", new Object[]{str, str2});
        }
        a aVar = f21983a;
        if (aVar == null) {
            return str2;
        }
        return ((MKTHandler.a) aVar).a("message_box_switch", str, str2);
    }

    public static long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cda1621", new Object[0])).longValue();
        }
        a aVar = f21983a;
        if (aVar == null) {
            return System.currentTimeMillis();
        }
        return ((MKTHandler.a) aVar).b();
    }

    public static void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af764a6", new Object[]{aVar});
        } else {
            f21983a = aVar;
        }
    }
}
