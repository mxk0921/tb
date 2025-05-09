package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class e4i implements e8q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final f4i f18272a;

    static {
        t2o.a(677380214);
        t2o.a(677380220);
    }

    public e4i(f4i f4iVar) {
        this.f18272a = f4iVar;
    }

    @Override // tb.e8q
    public void a(tjj tjjVar, File file, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea576dbf", new Object[]{this, tjjVar, file, new Boolean(z)});
            return;
        }
        this.f18272a.b.add(file);
        if (!z) {
            this.f18272a.c.set(false);
        }
    }
}
