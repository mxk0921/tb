package androidx.core.os;

import androidx.core.util.ObjectsCompat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String str) {
        super(ObjectsCompat.toString(str, "The operation has been canceled."));
    }
}
