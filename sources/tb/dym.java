package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.d91;
import tb.wmp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dym {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements wmp.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f18156a;

        public a(c cVar) {
            this.f18156a = cVar;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34e3bcc4", new Object[]{this, str});
            } else if (!dym.a(str, this.f18156a)) {
                TLog.loge(yr2.MODULE, "ProcessMapsHelper", "readFromProcess: parse line error, line " + str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public long f18157a;
        public long b;
        public long c;
        public String d;

        static {
            t2o.a(737149035);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
    }

    static {
        t2o.a(737149033);
    }

    public static /* synthetic */ boolean a(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b53ea1bc", new Object[]{str, cVar})).booleanValue();
        }
        return b(str, cVar);
    }

    public static void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921e682d", new Object[]{cVar});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            wmp.e("/proc/self/maps", new a(cVar));
            TLog.loge(yr2.MODULE, "ProcessMapsHelper", "readFromProcess: read maps complete, consume time " + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable th) {
            TLog.loge(yr2.MODULE, "ProcessMapsHelper", "readFromProcess: read maps with exception " + th);
            s71.i("ReadProcMaps_" + th, "");
        }
    }

    public static long d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77c2092", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            return Long.parseLong(str, 16);
        } catch (NumberFormatException unused) {
            TLog.loge(yr2.MODULE, "ProcessMapsHelper", "safeParseHex: parse string error, input string " + str);
            return j;
        }
    }

    public static int e(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf01e97c", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            TLog.loge(yr2.MODULE, "ProcessMapsHelper", "safeParseInt: parse string error, input string " + str);
            return i;
        }
    }

    public static boolean b(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef29f23f", new Object[]{str, cVar})).booleanValue();
        }
        String[] split = str.split("\\s+");
        if (split.length != 6) {
            TLog.loge(yr2.MODULE, "ProcessMapsHelper", "parse: maps item len is wrong, item length " + split.length);
            return false;
        } else if (TextUtils.isEmpty(split[0])) {
            TLog.loge(yr2.MODULE, "ProcessMapsHelper", "parse: maps address is wrong, addresses is " + split[0]);
            return false;
        } else {
            String[] split2 = split[0].split("-");
            if (split2.length != 2) {
                TLog.loge(yr2.MODULE, "ProcessMapsHelper", "parse: maps address is wrong, addresses is " + split[0]);
                return false;
            }
            b bVar = new b();
            bVar.f18157a = d(split2[0], -1L);
            bVar.b = d(split2[1], -1L);
            String str2 = split[1];
            bVar.c = d(split[2], -1L);
            String str3 = split[3];
            e(split[4], -1);
            bVar.d = split[5];
            if (cVar != null) {
                ((d91.a) cVar).a(bVar);
            }
            return true;
        }
    }
}
