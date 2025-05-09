package androidx.core.os;

import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import tb.d1a;
import tb.hpl;
import tb.pg1;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "", hpl.SECTION_NAME, "Lkotlin/Function0;", pg1.ATOM_EXT_block, "trace", "(Ljava/lang/String;Ltb/d1a;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TraceKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Deprecated(message = "Use androidx.tracing.Trace instead", replaceWith = @ReplaceWith(expression = "trace(sectionName, block)", imports = {"androidx.tracing.trace"}))
    public static final <T> T trace(String str, d1a<? extends T> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("a11a555", new Object[]{str, d1aVar});
        }
        Trace.beginSection(str);
        try {
            return (T) d1aVar.invoke();
        } finally {
            Trace.endSection();
        }
    }
}
