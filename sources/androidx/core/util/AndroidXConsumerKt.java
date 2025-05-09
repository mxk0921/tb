package androidx.core.util;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ar4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Ltb/ar4;", "Landroidx/core/util/Consumer;", "asAndroidXConsumer", "(Ltb/ar4;)Landroidx/core/util/Consumer;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class AndroidXConsumerKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final <T> Consumer<T> asAndroidXConsumer(ar4<? super T> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Consumer) ipChange.ipc$dispatch("9be33ee2", new Object[]{ar4Var});
        }
        return new AndroidXContinuationConsumer(ar4Var);
    }
}
