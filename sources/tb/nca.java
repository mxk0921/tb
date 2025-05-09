package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceInfo;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nca {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f24637a = false;
    public static boolean b = false;
    public static volatile boolean c = false;
    public static boolean d = false;
    public static String e = "";
    public static int f = 0;
    public static String g = "unknown";
    public static String h = "unknown";
    public static long i = -1;
    public static long j = -1;
    public static int k = 0;
    public static long l = -1;
    public static long m = -1;
    public static String n = "false";
    public static long o = -1;
    public static long p = -1;
    public static String q = null;
    public static String r = "background";
    public static final a s = new a();
    public static int t;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final HashMap<String, Boolean> f24638a = new HashMap<>();

        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1582d9bb", new Object[]{this, str})).booleanValue();
            }
            Boolean bool = this.f24638a.get(str);
            if (bool == null) {
                return true;
            }
            return bool.booleanValue();
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aea5677f", new Object[]{this, str});
            } else if (this.f24638a.get(str) == null) {
                this.f24638a.put(str, Boolean.TRUE);
            } else {
                this.f24638a.put(str, Boolean.FALSE);
            }
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37b43413", new Object[0]);
        }
        return TBDeviceInfo.b(TBDeviceInfo.a(w9a.g().a()));
    }
}
