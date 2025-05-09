package androidx.activity.contextaware;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.c;
import tb.ar4;
import tb.dkf;
import tb.g1a;
import tb.jv6;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0006\u001a\u00078\u0000¢\u0006\u0002\b\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001e\b\u0004\u0010\u0005\u001a\u0018\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u0002H\u0086H¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"R", "Landroidx/activity/contextaware/ContextAware;", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkotlin/jvm/JvmSuppressWildcards;", "onContextAvailable", "withContextAvailable", "(Landroidx/activity/contextaware/ContextAware;Ltb/g1a;Ltb/ar4;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ContextAwareKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final <R> Object withContextAvailable(ContextAware contextAware, g1a<Context, R> g1aVar, ar4<R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9adf4a75", new Object[]{contextAware, g1aVar, ar4Var});
        }
        Context peekAvailableContext = contextAware.peekAvailableContext();
        if (peekAvailableContext != null) {
            return g1aVar.invoke(peekAvailableContext);
        }
        c cVar = new c(IntrinsicsKt__IntrinsicsJvmKt.c(ar4Var), 1);
        cVar.E();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(cVar, g1aVar);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        cVar.h(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object A = cVar.A();
        if (A == dkf.d()) {
            jv6.c(ar4Var);
        }
        return A;
    }

    private static final <R> Object withContextAvailable$$forInline(ContextAware contextAware, g1a<Context, R> g1aVar, ar4<R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2b05d0b7", new Object[]{contextAware, g1aVar, ar4Var});
        }
        Context peekAvailableContext = contextAware.peekAvailableContext();
        if (peekAvailableContext != null) {
            return g1aVar.invoke(peekAvailableContext);
        }
        c cVar = new c(IntrinsicsKt__IntrinsicsJvmKt.c(ar4Var), 1);
        cVar.E();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(cVar, g1aVar);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        cVar.h(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        xhv xhvVar = xhv.INSTANCE;
        Object A = cVar.A();
        if (A == dkf.d()) {
            jv6.c(ar4Var);
        }
        return A;
    }
}
