package tb;

import com.alibaba.jsi.standard.JSEngine;
import com.alibaba.jsi.standard.js.Bridge;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class iit implements wa7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSEngine f21334a;
    public long b;
    public boolean c = false;

    static {
        t2o.a(921698358);
        t2o.a(921698332);
    }

    public iit(JSEngine jSEngine, long j) {
        this.f21334a = jSEngine;
        this.b = j;
        lwx.a(jSEngine, this);
    }

    public static iit d(JSEngine jSEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iit) ipChange.ipc$dispatch("2426fef6", new Object[]{jSEngine});
        }
        return new iit(jSEngine, Bridge.createNative(jSEngine, 22, 0L, (double) vu3.b.GEO_NOT_SUPPORT, (Object[]) null));
    }

    public static iit e(JSEngine jSEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iit) ipChange.ipc$dispatch("751644cf", new Object[]{jSEngine});
        }
        return new iit(jSEngine, Bridge.createNative(jSEngine, 22, 2L, (double) vu3.b.GEO_NOT_SUPPORT, (Object[]) null));
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c) {
            throw new RuntimeException("Template has been deleted: " + this);
        }
    }

    public boolean b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34a09b8e", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        a();
        if (Bridge.cmd(null, 651, this.b, i, new Object[]{str}) != null) {
            return true;
        }
        return false;
    }

    public boolean c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4eaeedd", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        a();
        if (Bridge.cmd(null, 650, this.b, i, new Object[]{str}) != null) {
            return true;
        }
        return false;
    }

    @Override // tb.wa7
    public void delete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691b3cb2", new Object[]{this});
            return;
        }
        long j = this.b;
        if (j != 0 && !this.c) {
            Bridge.nativeDelete(j, 2);
            this.b = 0L;
            lwx.f(this.f21334a, this);
        }
        this.c = true;
    }

    public yrf f(dqf dqfVar, ypf ypfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yrf) ipChange.ipc$dispatch("803c09e2", new Object[]{this, dqfVar, ypfVar});
        }
        a();
        Object cmd = Bridge.cmd(dqfVar, 653, this.b, new Object[]{ypfVar});
        if (cmd instanceof yrf) {
            return (yrf) cmd;
        }
        return null;
    }
}
