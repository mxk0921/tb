package com.facebook.jni;

import java.util.Iterator;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MapIteratorHelper {
    private final Iterator<Map.Entry> mIterator;
    private Object mKey;
    private Object mValue;

    static {
        t2o.a(503316486);
    }

    public MapIteratorHelper(Map map) {
        this.mIterator = map.entrySet().iterator();
    }

    public boolean hasNext() {
        if (this.mIterator.hasNext()) {
            Map.Entry next = this.mIterator.next();
            this.mKey = next.getKey();
            this.mValue = next.getValue();
            return true;
        }
        this.mKey = null;
        this.mValue = null;
        return false;
    }
}
