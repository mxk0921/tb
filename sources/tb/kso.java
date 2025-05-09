package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.v2.result.MaResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class kso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public x6n f22893a;
    public MaResult b;
    public boolean c = false;

    static {
        t2o.a(481296704);
    }

    public static kso a(MaResult maResult, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kso) ipChange.ipc$dispatch("4d6d4d20", new Object[]{maResult, new Boolean(z)});
        }
        kso ksoVar = new kso();
        ksoVar.b = maResult;
        ksoVar.c = z;
        return ksoVar;
    }

    public static kso b(x6n x6nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kso) ipChange.ipc$dispatch("8c7cce01", new Object[]{x6nVar});
        }
        kso ksoVar = new kso();
        ksoVar.f22893a = x6nVar;
        return ksoVar;
    }

    public MaResult c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("75286427", new Object[]{this});
        }
        return this.b;
    }

    public x6n d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x6n) ipChange.ipc$dispatch("95e24800", new Object[]{this});
        }
        return this.f22893a;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42f7363d", new Object[]{this})).booleanValue();
        }
        return this.c;
    }
}
