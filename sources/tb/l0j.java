package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.net.URL;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class l0j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public URL f23039a;
        public long b;
        public boolean c;
        public boolean d;
        public long e;
        public long f;
        public final long g = System.currentTimeMillis();
        public double h;
        public String i;
        public long j;
        public boolean k;
        public String l;
        public long m;
        public String n;
        public String o;
        public boolean p;
        public boolean q;
        public long r;
        public String s;
        public String t;
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92f2d47", new Object[]{str, str2, str3, str4});
            return;
        }
        wyi wyiVar = xh4.c;
        if (wyiVar != null) {
            ((hzi) wyiVar).c("download-sdk", str, str2, str3, str4);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a6c664", new Object[]{str, str2});
            return;
        }
        try {
            wyi wyiVar = xh4.c;
            if (wyiVar != null) {
                ((hzi) wyiVar).d("download-sdk", str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void c(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e9467e", new Object[]{aVar, str});
            return;
        }
        wyi wyiVar = xh4.c;
        if (wyiVar != null) {
            try {
                ((hzi) wyiVar).e(aVar, str);
            } catch (Throwable th) {
                fs7.d("stat", "on exception", th, new Object[0]);
            }
        }
    }
}
