package androidx.activity.contextaware;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.internal.ArtcParams;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import tb.ar4;
import tb.ckf;
import tb.g1a;
import tb.q23;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1", "Landroidx/activity/contextaware/OnContextAvailableListener;", "Landroid/content/Context;", "context", "Ltb/xhv;", "onContextAvailable", "(Landroid/content/Context;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = ArtcParams.SD180pVideoParams.HEIGHT)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ q23<R> $co;
    public final /* synthetic */ g1a<Context, R> $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(q23<R> q23Var, g1a<Context, R> g1aVar) {
        this.$co = q23Var;
        this.$onContextAvailable = g1aVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed5fd9e8", new Object[]{this, context});
            return;
        }
        ckf.g(context, "context");
        ar4 ar4Var = this.$co;
        try {
            obj = Result.m1108constructorimpl(this.$onContextAvailable.invoke(context));
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        ar4Var.resumeWith(obj);
    }
}
