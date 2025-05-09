package kotlinx.coroutines;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.b;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Lambda;
import tb.a07;
import tb.g1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable {
    public static final Key Key = new Key(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class Key extends b<CoroutineDispatcher, ExecutorCoroutineDispatcher> {

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/d$b;", AdvanceSetting.NETWORK_TYPE, "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke", "(Lkotlin/coroutines/d$b;)Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.ExecutorCoroutineDispatcher$Key$1  reason: invalid class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public static final class AnonymousClass1 extends Lambda implements g1a<d.b, ExecutorCoroutineDispatcher> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            public final ExecutorCoroutineDispatcher invoke(d.b bVar) {
                if (bVar instanceof ExecutorCoroutineDispatcher) {
                    return (ExecutorCoroutineDispatcher) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ Key(a07 a07Var) {
            this();
        }

        public Key() {
            super(CoroutineDispatcher.Key, AnonymousClass1.INSTANCE);
        }
    }
}
