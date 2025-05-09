package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class l29 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f23064a;
    public final long b;
    public final long c;

    static {
        t2o.a(1007681557);
    }

    public l29(List<String> list, long j) {
        ckf.g(list, "favIdList");
        this.f23064a = list;
        this.b = j;
        this.c = 518400000L;
        String a2 = h8l.INSTANCE.a("favorite_sdk", uzo.FAV_ORANGE_INVALID_TIME);
        if (a2 != null) {
            try {
                this.c = Long.parseLong(a2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c21f6b5a", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public final List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("632b8982", new Object[]{this});
        }
        return this.f23064a;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (this.b - bvt.d(ftt.Companion) < this.c) {
            return true;
        }
        return false;
    }
}
