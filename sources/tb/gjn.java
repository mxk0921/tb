package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gjn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<v4g> f20045a;
    public final long b;

    public gjn() {
    }

    public List<v4g> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7f240944", new Object[]{this});
        }
        if (this.f20045a == null) {
            return new ArrayList();
        }
        return new ArrayList(this.f20045a);
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88e2a1e9", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public gjn(long j, List<v4g> list) {
        this.b = j;
        this.f20045a = list;
    }
}
