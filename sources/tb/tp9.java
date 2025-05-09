package tb;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ltb/tp9;", "T", "Ltb/wuo;", "Lkotlin/coroutines/d;", "context", "Ltb/ar4;", "uCont", "<init>", "(Lkotlin/coroutines/d;Ltb/ar4;)V", "", "cause", "", ExifInterface.LATITUDE_SOUTH, "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class tp9<T> extends wuo<T> {
    public tp9(d dVar, ar4<? super T> ar4Var) {
        super(dVar, ar4Var);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean S(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return N(th);
    }
}
