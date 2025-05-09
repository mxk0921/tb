package com.huawei.hms.common.data;

import com.huawei.hms.common.internal.Preconditions;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DBInnerIter<O> implements Iterator<O> {
    protected final DataBuffer<O> dataBuffer;
    protected int index = -1;

    public DBInnerIter(DataBuffer<O> dataBuffer) {
        Preconditions.checkNotNull(dataBuffer, "dataBuffer cannot be null");
        this.dataBuffer = dataBuffer;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index + 1 < this.dataBuffer.getCount()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public O next() {
        if (!hasNext()) {
            return null;
        }
        DataBuffer<O> dataBuffer = this.dataBuffer;
        int i = this.index + 1;
        this.index = i;
        return dataBuffer.get(i);
    }
}
