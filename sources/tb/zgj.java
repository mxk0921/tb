package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zgj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PRE_REQUEST_START_TIME_INVALID = -1;
    public static final int PRE_REQUEST_STATUS_NEVER_REQUEST = 0;
    public static final int PRE_REQUEST_STATUS_NID_ABSENT = 3;
    public static final int PRE_REQUEST_STATUS_REQUESTING = 1;
    public static final int PRE_REQUEST_STATUS_REQUEST_FAIL = 2;
    public static final int PRE_REQUEST_STATUS_SUCCESS = 5;
    public static final int PRE_REQUEST_STATUS_WEED_OUT = 4;

    /* renamed from: a  reason: collision with root package name */
    public static int f32756a;
    public static long b;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static int g;
    public static boolean h;
    public static final Map<String, a> i = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f32757a = 0;
        public int b = 0;
        public long c = -1;
        public int d;

        static {
            t2o.a(352321615);
        }
    }

    static {
        t2o.a(352321614);
    }

    public static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("dcbc4bc5", new Object[]{str});
        }
        return (a) ((HashMap) i).get(str);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a59575c2", new Object[]{str});
            return;
        }
        Map<String, a> map = i;
        a aVar = (a) ((HashMap) map).get(str);
        if (aVar == null) {
            aVar = new a();
            ((HashMap) map).put(str, aVar);
        }
        aVar.d++;
    }

    public static void c(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb52bf9", new Object[]{str, new Integer(i2)});
            return;
        }
        Map<String, a> map = i;
        a aVar = (a) ((HashMap) map).get(str);
        if (aVar != null) {
            aVar.f32757a = aVar.b;
            aVar.b = i2;
            return;
        }
        a aVar2 = new a();
        aVar2.b = i2;
        ((HashMap) map).put(str, aVar2);
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c680b3", new Object[]{str});
            return;
        }
        Map<String, a> map = i;
        a aVar = (a) ((HashMap) map).get(str);
        if (aVar == null) {
            aVar = new a();
            ((HashMap) map).put(str, aVar);
        }
        aVar.c = System.currentTimeMillis();
        aVar.d = 0;
    }
}
