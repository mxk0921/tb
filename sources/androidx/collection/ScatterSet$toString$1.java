package androidx.collection;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "E", "element", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ScatterSet$toString$1 extends Lambda implements g1a<E, CharSequence> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ScatterSet<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterSet$toString$1(ScatterSet<E> scatterSet) {
        super(1);
        this.this$0 = scatterSet;
    }

    public static /* synthetic */ Object ipc$super(ScatterSet$toString$1 scatterSet$toString$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/ScatterSet$toString$1");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.g1a
    public final CharSequence invoke(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("dc93be3f", new Object[]{this, e});
        }
        if (e == this.this$0) {
            return "(this)";
        }
        return String.valueOf(e);
    }
}
