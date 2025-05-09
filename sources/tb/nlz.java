package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import com.taobao.android.nanocompose.runtime.pipeline.render_stage.RenderPipelineTaskResultType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class nlz extends klz<llz<xhv>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final waz d;
    public final e7z e;

    static {
        t2o.a(598737479);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlz(RenderContext renderContext, waz wazVar, glz glzVar, flz flzVar, e7z e7zVar) {
        super("RenderStage", renderContext, glzVar);
        ckf.g(renderContext, "renderContext");
        ckf.g(wazVar, "layoutNodeRoot");
        this.d = wazVar;
        this.e = e7zVar;
    }

    public static /* synthetic */ Object ipc$super(nlz nlzVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/pipeline/render_stage/RenderStage");
    }

    public llz<xhv> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (llz) ipChange.ipc$dispatch("6d292ef3", new Object[]{this});
        }
        glz a2 = a();
        if (a2 != null) {
            a2.a(b());
        }
        elz.INSTANCE.a(c(), this.d, this.e, null);
        glz a3 = a();
        if (a3 != null) {
            a3.b(b(), null);
        }
        return new llz<>(RenderPipelineTaskResultType.SUCCESS, xhv.INSTANCE);
    }
}
