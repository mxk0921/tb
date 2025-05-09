package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h1d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONSTANT_READ_BYTES = "read_bytes";
    public static final String CONSTANT_READ_CHAR = "rchar";
    public static final String CONSTANT_SYS_CALL_READ = "syscr";
    public static final String CONSTANT_SYS_CALL_WRITE = "syscw";
    public static final String CONSTANT_WRITE_BYTES = "write_bytes";
    public static final String CONSTANT_WRITE_CHAR = "wchar";
    public static final h1d DEFAULT = new h1d();

    /* renamed from: a  reason: collision with root package name */
    public long f20359a = 0;
    public long b = 0;
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public long f = 0;

    static {
        t2o.a(737149019);
    }

    public static h1d a(Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h1d) ipChange.ipc$dispatch("a50e444f", new Object[]{map});
        }
        h1d h1dVar = new h1d();
        h1dVar.f20359a = b(map, CONSTANT_READ_CHAR, 0L);
        h1dVar.b = b(map, CONSTANT_WRITE_CHAR, 0L);
        h1dVar.c = b(map, CONSTANT_READ_BYTES, 0L);
        h1dVar.d = b(map, CONSTANT_WRITE_BYTES, 0L);
        h1dVar.e = b(map, CONSTANT_SYS_CALL_READ, 0L);
        h1dVar.f = b(map, CONSTANT_SYS_CALL_WRITE, 0L);
        return h1dVar;
    }

    public static long b(Map<String, Long> map, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("435e6b78", new Object[]{map, str, new Long(j)})).longValue();
        }
        Long l = map.get(str);
        if (l == null) {
            return j;
        }
        return l.longValue();
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d25002ba", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6030d6fd", new Object[]{this})).longValue();
        }
        return this.f20359a;
    }

    public long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b5dcc6", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("455451c5", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21aa173d", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4d0a61a", new Object[]{this})).longValue();
        }
        return this.b;
    }
}
