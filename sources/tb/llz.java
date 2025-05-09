package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.pipeline.render_stage.RenderPipelineTaskResultType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class llz<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RenderPipelineTaskResultType f23404a;
    public final T b;

    static {
        t2o.a(598737478);
    }

    public llz(RenderPipelineTaskResultType renderPipelineTaskResultType, T t) {
        ckf.g(renderPipelineTaskResultType, "type");
        this.f23404a = renderPipelineTaskResultType;
        this.b = t;
    }

    public final T a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.b;
    }

    public final RenderPipelineTaskResultType b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderPipelineTaskResultType) ipChange.ipc$dispatch("950952ac", new Object[]{this});
        }
        return this.f23404a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llz)) {
            return false;
        }
        llz llzVar = (llz) obj;
        if (this.f23404a == llzVar.f23404a && ckf.b(this.b, llzVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int hashCode = this.f23404a.hashCode() * 31;
        T t = this.b;
        if (t != null) {
            i = t.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RenderPipelineTaskStageResult(type=" + this.f23404a + ", data=" + this.b + ')';
    }
}
