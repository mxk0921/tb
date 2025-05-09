package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.context.RenderContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class klz<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f22751a;
    public final RenderContext b;
    public final glz c;

    static {
        t2o.a(598737477);
    }

    public klz(String str, RenderContext renderContext, glz glzVar) {
        ckf.g(str, "name");
        ckf.g(renderContext, "renderContext");
        this.f22751a = str;
        this.b = renderContext;
        this.c = glzVar;
    }

    public final glz a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (glz) ipChange.ipc$dispatch("7feaea12", new Object[]{this});
        }
        return this.c;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f22751a;
    }

    public final RenderContext c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderContext) ipChange.ipc$dispatch("cc4f291d", new Object[]{this});
        }
        return this.b;
    }
}
