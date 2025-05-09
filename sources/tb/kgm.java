package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kgm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DEFAULT_OPERATION_TIMEOUT = 300000;

    /* renamed from: a  reason: collision with root package name */
    public final xad f22654a;
    public long b;

    public kgm(xad xadVar, long j) {
        this.f22654a = xadVar;
        this.b = j;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c51a6c6", new Object[]{this})).booleanValue();
        }
        xad xadVar = this.f22654a;
        if (xadVar != null && !xadVar.isShown() && !b()) {
            return false;
        }
        return true;
    }

    public boolean b() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("350f0744", new Object[]{this})).booleanValue();
        }
        xad xadVar = this.f22654a;
        if (xadVar != null) {
            if (xadVar.l() < 0) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.b;
            if (this.f22654a.l() == 0) {
                j = 300000;
            } else {
                j = this.f22654a.l();
            }
            if (currentTimeMillis <= j2 + j) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        xad xadVar = this.f22654a;
        if (xadVar == null || !(obj instanceof kgm)) {
            return false;
        }
        return xadVar.equals(((kgm) obj).f22654a);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        xad xadVar = this.f22654a;
        if (xadVar == null) {
            return 0;
        }
        return xadVar.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "strategyIdentifier=" + this.f22654a.o() + ", operationStartTime=" + this.b + ", showTimeout=" + this.f22654a.l();
    }
}
