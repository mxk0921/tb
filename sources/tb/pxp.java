package tb;

import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class pxp implements hpc.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Object f26382a;

    @Override // tb.hpc.a
    public void c(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ebcd44", new Object[]{this, drawable});
        }
    }

    @Override // tb.hpc.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e62fda", new Object[]{this});
        }
    }

    @Override // tb.hpc.a
    public void g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11aa67b", new Object[]{this, obj});
        } else {
            this.f26382a = obj;
        }
    }

    @Override // tb.hpc.a
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.hpc.a
    public Object getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("61e2c7a7", new Object[]{this});
        }
        return this.f26382a;
    }

    @Override // tb.hpc.a
    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return 0;
    }
}
