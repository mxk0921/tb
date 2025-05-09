package androidx.collection;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import tb.ar4;
import tb.u1a;
import tb.vbp;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", "V", "Ltb/vbp;", "", "Ltb/xhv;", "<anonymous>", "(Ltb/vbp;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {703}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ScatterMap$MapWrapper$entries$1$iterator$1 extends RestrictedSuspendLambda implements u1a<vbp<? super Map.Entry<? extends K, ? extends V>>, ar4<? super xhv>, Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public long J$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ ScatterMap<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterMap$MapWrapper$entries$1$iterator$1(ScatterMap<K, V> scatterMap, ar4<? super ScatterMap$MapWrapper$entries$1$iterator$1> ar4Var) {
        super(2, ar4Var);
        this.this$0 = scatterMap;
    }

    public static /* synthetic */ Object ipc$super(ScatterMap$MapWrapper$entries$1$iterator$1 scatterMap$MapWrapper$entries$1$iterator$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ar4) ipChange.ipc$dispatch("513284d7", new Object[]{this, obj, ar4Var});
        }
        ScatterMap$MapWrapper$entries$1$iterator$1 scatterMap$MapWrapper$entries$1$iterator$1 = new ScatterMap$MapWrapper$entries$1$iterator$1(this.this$0, ar4Var);
        scatterMap$MapWrapper$entries$1$iterator$1.L$0 = obj;
        return scatterMap$MapWrapper$entries$1$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0067 -> B:18:0x007c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0085 -> B:24:0x00b0). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00ad -> B:24:0x00b0). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c2 -> B:29:0x00c4). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(vbp<? super Map.Entry<? extends K, ? extends V>> vbpVar, ar4<? super xhv> ar4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d1c4479a", new Object[]{this, vbpVar, ar4Var}) : ((ScatterMap$MapWrapper$entries$1$iterator$1) create(vbpVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
