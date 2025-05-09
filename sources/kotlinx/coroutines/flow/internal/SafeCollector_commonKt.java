package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlinx.coroutines.m;
import tb.wuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class SafeCollector_commonKt {
    public static final void a(SafeCollector<?> safeCollector, d dVar) {
        if (((Number) dVar.fold(0, new SafeCollector_commonKt$checkContext$result$1(safeCollector))).intValue() != safeCollector.collectContextSize) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + dVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    public static final m b(m mVar, m mVar2) {
        while (mVar != null) {
            if (mVar == mVar2) {
                return mVar;
            }
            if (!(mVar instanceof wuo)) {
                return mVar;
            }
            mVar = mVar.getParent();
        }
        return null;
    }
}
