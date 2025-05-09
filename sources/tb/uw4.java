package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.RGTypeInfo;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import tb.eyl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uw4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String b = RGTypeInfo.a(101);
    public static final String c = RGTypeInfo.a(101) + "Duration";

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f29643a = new LinkedList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public long f29644a;
        public long b;
        public long c;
        public long d;
        public long e;

        public b() {
        }
    }

    public final float a(b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bea8257", new Object[]{this, bVar, bVar2})).floatValue();
        }
        long j = bVar2.e - bVar.e;
        long j2 = ((bVar2.b + bVar2.f29644a) - bVar.b) - bVar.f29644a;
        if (j <= 0) {
            return 0.0f;
        }
        return ((1000.0f / ((float) a2n.f15511a)) * ((float) j2)) / ((float) j);
    }

    public final float b(b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a85ffc55", new Object[]{this, bVar, bVar2})).floatValue();
        }
        long j = bVar2.e - bVar.e;
        long j2 = ((bVar2.d + bVar2.c) - bVar.d) - bVar.c;
        if (j <= 0) {
            return 0.0f;
        }
        return ((1000.0f / ((float) a2n.f15511a)) * ((float) j2)) / ((float) j);
    }

    public eyl d(it6 it6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyl) ipChange.ipc$dispatch("ac0248b3", new Object[]{this, it6Var});
        }
        return e(it6Var, false);
    }

    public eyl e(it6 it6Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyl) ipChange.ipc$dispatch("3c3f8e33", new Object[]{this, it6Var, new Boolean(z)});
        }
        if (it6Var.b == 6) {
            return c(it6Var, z);
        }
        return null;
    }

    public final eyl c(it6 it6Var, boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyl) ipChange.ipc$dispatch("e17de708", new Object[]{this, it6Var, new Boolean(z)});
        }
        b bVar = new b();
        try {
            String str3 = it6Var.c.get("main_thread_u_time");
            Objects.requireNonNull(str3);
            bVar.f29644a = Long.parseLong(str3);
            String str4 = it6Var.c.get("main_thread_s_time");
            Objects.requireNonNull(str4);
            bVar.b = Long.parseLong(str4);
            String str5 = it6Var.c.get("process_u_time");
            Objects.requireNonNull(str5);
            bVar.c = Long.parseLong(str5);
            String str6 = it6Var.c.get("process_s_time");
            Objects.requireNonNull(str6);
            bVar.d = Long.parseLong(str6);
            String str7 = it6Var.c.get("total_cpu_time");
            Objects.requireNonNull(str7);
            bVar.e = Long.parseLong(str7);
            long d = a2n.d(b, "critical", 80L);
            long d2 = a2n.d(c, "critical", 50L);
            ((LinkedList) this.f29643a).add(0, bVar);
            int i = (int) (d2 / 10);
            if (((LinkedList) this.f29643a).size() <= i) {
                return null;
            }
            b bVar2 = (b) ((LinkedList) this.f29643a).get(i);
            ((LinkedList) this.f29643a).remove(bVar2);
            long b2 = b(bVar2, bVar) * 100.0f;
            long a2 = a(bVar2, bVar) * 100.0f;
            if (b2 > d) {
                str = String.valueOf(b2);
                str2 = "all";
            } else {
                str = "";
                str2 = str;
            }
            if (a2 > d) {
                str = String.valueOf(a2);
                str2 = "main";
            }
            if (!TextUtils.isEmpty(str2)) {
                return new eyl.b().j("critical").i(1).l(101).k(str2).m(str).h();
            }
            if (z) {
                return new eyl.b().j("normal").i(1).l(101).k("main").m(String.valueOf(a2)).h();
            }
            return null;
        } catch (Exception e) {
            s9n.a("CpuLoadWarningProvider", "getCpuLoadWarning error", e.toString());
            return null;
        }
    }
}
