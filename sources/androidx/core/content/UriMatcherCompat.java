package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.content.UriMatcherCompat;
import androidx.core.util.Predicate;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UriMatcherCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private UriMatcherCompat() {
    }

    public static Predicate<Uri> asPredicate(final UriMatcher uriMatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Predicate) ipChange.ipc$dispatch("a0fe48b2", new Object[]{uriMatcher});
        }
        return new Predicate() { // from class: tb.fnv
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return ppm.a(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return ppm.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate) {
                return ppm.c(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                boolean lambda$asPredicate$0;
                lambda$asPredicate$0 = UriMatcherCompat.lambda$asPredicate$0(uriMatcher, (Uri) obj);
                return lambda$asPredicate$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$asPredicate$0(UriMatcher uriMatcher, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc66fcbd", new Object[]{uriMatcher, uri})).booleanValue();
        }
        if (uriMatcher.match(uri) != -1) {
            return true;
        }
        return false;
    }
}
