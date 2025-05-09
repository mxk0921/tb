package androidx.lifecycle;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.internal.ArtcParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "R", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = ArtcParams.SD180pVideoParams.HEIGHT)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class WithLifecycleStateKt$withStateAtLeastUnchecked$2 extends Lambda implements d1a<R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d1a<R> $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WithLifecycleStateKt$withStateAtLeastUnchecked$2(d1a<? extends R> d1aVar) {
        super(0);
        this.$block = d1aVar;
    }

    public static /* synthetic */ Object ipc$super(WithLifecycleStateKt$withStateAtLeastUnchecked$2 withLifecycleStateKt$withStateAtLeastUnchecked$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [R, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [R, java.lang.Object] */
    @Override // tb.d1a
    public final R invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5a980813", new Object[]{this});
        }
        return this.$block.invoke();
    }
}
