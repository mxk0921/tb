package androidx.collection.internal;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\u0004\u001a4\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\f\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"", "message", "Ltb/xhv;", "throwIllegalStateException", "(Ljava/lang/String;)V", "", "value", "Lkotlin/Function0;", "lazyMessage", "checkPrecondition", "(ZLtb/d1a;)V", "throwIllegalArgumentException", "requirePrecondition", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class RuntimeHelpersKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final void checkPrecondition(boolean z, d1a<String> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbf9594", new Object[]{new Boolean(z), d1aVar});
            return;
        }
        ckf.g(d1aVar, "lazyMessage");
        if (!z) {
            throwIllegalStateException(d1aVar.invoke());
        }
    }

    public static final void requirePrecondition(boolean z, d1a<String> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d14152d7", new Object[]{new Boolean(z), d1aVar});
            return;
        }
        ckf.g(d1aVar, "lazyMessage");
        if (!z) {
            throwIllegalArgumentException(d1aVar.invoke());
        }
    }

    public static final void throwIllegalArgumentException(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d9d353", new Object[]{str});
        } else {
            ckf.g(str, "message");
            throw new IllegalArgumentException(str);
        }
    }

    public static final void throwIllegalStateException(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b0a89f", new Object[]{str});
        } else {
            ckf.g(str, "message");
            throw new IllegalStateException(str);
        }
    }
}
