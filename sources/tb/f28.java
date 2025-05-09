package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class f28 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DinamicXEngine f18957a;
    public boolean b;

    static {
        t2o.a(786432013);
    }

    public final DinamicXEngine a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("350fca7f", new Object[]{this});
        }
        return this.f18957a;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c20c76dd", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2564eee4", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c092acf5", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e83db617", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void f(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8ed1c5", new Object[]{this, dinamicXEngine});
        } else {
            this.f18957a = dinamicXEngine;
        }
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ae9927", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }
}
