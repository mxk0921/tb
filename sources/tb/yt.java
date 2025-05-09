package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class yt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bkc f32337a;

    static {
        t2o.a(144703547);
    }

    public yt(bkc bkcVar) {
        ckf.g(bkcVar, "lifecycleEvent");
        this.f32337a = bkcVar;
    }

    public final bkc a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bkc) ipChange.ipc$dispatch("2da51503", new Object[]{this});
        }
        return this.f32337a;
    }

    public abstract void b();

    public abstract void c();
}
