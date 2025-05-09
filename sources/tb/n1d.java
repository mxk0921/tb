package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import tb.wmp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n1d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class b implements wmp.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(737149012);
            t2o.a(737149078);
        }
    }

    static {
        t2o.a(737149008);
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd29cc4", new Object[]{aVar});
        } else {
            wmp.a("cat /proc/self/io", aVar);
        }
    }

    public static void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca530624", new Object[]{bVar});
        } else {
            wmp.d("/proc/self/sched", bVar);
        }
    }

    public static String c(h1d h1dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2cd9719", new Object[]{h1dVar});
        }
        return e(h1dVar, h1d.DEFAULT);
    }

    public static String d(l2d l2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c901c39", new Object[]{l2dVar});
        }
        return f(l2dVar, l2d.DEFAULT);
    }

    public static String e(h1d h1dVar, h1d h1dVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b056f714", new Object[]{h1dVar, h1dVar2});
        }
        return "rchar:" + (h1dVar.d() - h1dVar2.d()) + ",wchar:" + (h1dVar.h() - h1dVar2.h()) + ",read_bytes:" + (h1dVar.c() - h1dVar2.c()) + ",write_bytes:" + (h1dVar.g() - h1dVar2.g()) + ",syscr:" + (h1dVar.e() - h1dVar2.e()) + ",syscw:" + (h1dVar.f() - h1dVar2.f());
    }

    public static String f(l2d l2dVar, l2d l2dVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("324c5c9", new Object[]{l2dVar, l2dVar2});
        }
        return "se.statistics.iowait_count:" + (l2dVar.a() - l2dVar2.a()) + ",se.statistics.iowait_sum:" + (l2dVar.b() - l2dVar2.b());
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class a implements wmp.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(737149011);
            t2o.a(737149078);
        }

        public h1d a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h1d) ipChange.ipc$dispatch("2299cad", new Object[]{this, str});
            }
            HashMap hashMap = new HashMap();
            String[] split = str.split("\n");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String[] split2 = split[i].split(":");
                if (split2.length != 2) {
                    TLog.loge(yr2.MODULE, "IORecorder", "parse: parse with wrong result ".concat(str));
                    break;
                }
                hashMap.put(split2[0].trim(), Long.valueOf(orl.a(split2[1].trim(), 0L)));
                i++;
            }
            return h1d.a(hashMap);
        }
    }
}
