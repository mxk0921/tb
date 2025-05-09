package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import com.taobao.android.nanocompose.runtime.pipeline.render_stage.RenderPipelineTaskResultType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ilz extends hlz<waz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final glz c;
    public boolean d;

    static {
        t2o.a(598737482);
    }

    public /* synthetic */ ilz(RenderContext renderContext, glz glzVar, flz flzVar, int i, a07 a07Var) {
        this(renderContext, glzVar, (i & 4) != 0 ? null : flzVar);
    }

    public static /* synthetic */ Object ipc$super(ilz ilzVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/pipeline/task/RenderPipelineTaskAndroid");
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f7ff55d", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilz(RenderContext renderContext, glz glzVar, flz flzVar) {
        super(renderContext, null, 2, null);
        ckf.g(renderContext, "renderContext");
        ckf.g(glzVar, "stageListener");
        this.c = glzVar;
    }

    @Override // tb.vqz
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        llz<waz> e = new g6z(a(), this.c).e();
        if (e != null) {
            waz a2 = e.a();
            if (a2 == null) {
                throw new RuntimeException("layoutRoot is null");
            } else if (new nlz(a(), a2, this.c, null, a().i()).d().b() == RenderPipelineTaskResultType.SUCCESS) {
                c(a2);
                this.d = true;
            } else {
                throw new RuntimeException("render failed");
            }
        }
    }
}
