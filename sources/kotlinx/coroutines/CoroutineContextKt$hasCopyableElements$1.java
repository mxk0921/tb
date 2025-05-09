package kotlinx.coroutines;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Lambda;
import tb.st4;
import tb.u1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "result", "Lkotlin/coroutines/d$b;", AdvanceSetting.NETWORK_TYPE, "invoke", "(ZLkotlin/coroutines/d$b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class CoroutineContextKt$hasCopyableElements$1 extends Lambda implements u1a<Boolean, d.b, Boolean> {
    public static final CoroutineContextKt$hasCopyableElements$1 INSTANCE = new CoroutineContextKt$hasCopyableElements$1();

    public CoroutineContextKt$hasCopyableElements$1() {
        super(2);
    }

    public final Boolean invoke(boolean z, d.b bVar) {
        return Boolean.valueOf(z || (bVar instanceof st4));
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, d.b bVar) {
        return invoke(bool.booleanValue(), bVar);
    }
}
