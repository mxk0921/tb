package com.facebook.jni;

import java.util.Iterator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IteratorHelper {
    private Object mElement;
    private final Iterator mIterator;

    static {
        t2o.a(503316485);
    }

    public IteratorHelper(Iterator it) {
        this.mIterator = it;
    }

    public boolean hasNext() {
        if (this.mIterator.hasNext()) {
            this.mElement = this.mIterator.next();
            return true;
        }
        this.mElement = null;
        return false;
    }

    public IteratorHelper(Iterable iterable) {
        this.mIterator = iterable.iterator();
    }
}
