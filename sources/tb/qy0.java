package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class qy0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f26995a;
    public long b;
    public int c;
    public int d = 0;
    public xy0 e;
    public List<t3g> f;
    public wy0 g;
    public long h;
    public wy0 i;

    static {
        t2o.a(503316621);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ae19878", new Object[]{this})).intValue();
        }
        if (this.e.c) {
            return -1;
        }
        return this.d;
    }
}
