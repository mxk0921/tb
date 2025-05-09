package androidx.core.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.function.Consumer;
import kotlin.Metadata;
import tb.ar4;
import tb.ok4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Ltb/ar4;", "Ljava/util/function/Consumer;", "asConsumer", "(Ltb/ar4;)Ljava/util/function/Consumer;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ConsumerKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final <T> Consumer<T> asConsumer(ar4<? super T> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ok4.a(ipChange.ipc$dispatch("405eaf45", new Object[]{ar4Var}));
        }
        return ok4.a(new ContinuationConsumer(ar4Var));
    }
}
