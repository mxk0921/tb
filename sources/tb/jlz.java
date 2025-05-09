package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import tb.iiz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class jlz implements glz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598737484);
        t2o.a(598737480);
    }

    public jlz(RenderContext renderContext) {
        ckf.g(renderContext, "renderContext");
    }

    @Override // tb.glz
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b7b594", new Object[]{this, str});
            return;
        }
        ckf.g(str, "stageName");
        if (iiz.c()) {
            iiz.Companion.j(ckf.p("onStageStart ", str));
        }
    }

    @Override // tb.glz
    public void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb20429", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "stageName");
        if (obj == null) {
            if (iiz.c()) {
                iiz.Companion.j(ckf.p("onStageEnd result is null ", str));
            }
        } else if (obj instanceof waz) {
            if (iiz.c()) {
                iiz.a aVar = iiz.Companion;
                aVar.j("onStageEnd " + str + ' ' + obj);
            }
        } else if (iiz.c()) {
            iiz.a aVar2 = iiz.Companion;
            aVar2.j("onStageEnd " + str + " with unknown result type");
        }
    }
}
