package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Segment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SIZE = 2048;
    public final byte[] data = new byte[2048];
    public int limit;
    public Segment next;
    public int pos;
    public Segment prev;

    public final void compact() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce94762a", new Object[]{this});
            return;
        }
        Segment segment = this.prev;
        if (segment != this) {
            int i = segment.limit - segment.pos;
            int i2 = this.limit;
            int i3 = this.pos;
            if (i + (i2 - i3) <= 2048) {
                writeTo(segment, i2 - i3);
                pop();
                SegmentPool.INSTANCE.recycle(this);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final Segment pop() {
        Segment segment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Segment) ipChange.ipc$dispatch("dc5e0756", new Object[]{this});
        }
        Segment segment2 = this.next;
        if (segment2 != this) {
            segment = segment2;
        } else {
            segment = null;
        }
        Segment segment3 = this.prev;
        segment3.next = segment2;
        this.next.prev = segment3;
        this.next = null;
        this.prev = null;
        return segment;
    }

    public final Segment push(Segment segment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Segment) ipChange.ipc$dispatch("5cb61d8b", new Object[]{this, segment});
        }
        segment.prev = this;
        segment.next = this.next;
        this.next.prev = segment;
        this.next = segment;
        return segment;
    }

    public final Segment split(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Segment) ipChange.ipc$dispatch("65c96c00", new Object[]{this, new Integer(i)});
        }
        int i2 = (this.limit - this.pos) - i;
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        } else if (i < i2) {
            Segment take = SegmentPool.INSTANCE.take();
            System.arraycopy(this.data, this.pos, take.data, take.pos, i);
            this.pos += i;
            take.limit += i;
            this.prev.push(take);
            return take;
        } else {
            Segment take2 = SegmentPool.INSTANCE.take();
            System.arraycopy(this.data, this.pos + i, take2.data, take2.pos, i2);
            this.limit -= i2;
            take2.limit += i2;
            push(take2);
            return this;
        }
    }

    public final void writeTo(Segment segment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a02a2f6", new Object[]{this, segment, new Integer(i)});
            return;
        }
        int i2 = segment.limit;
        int i3 = segment.pos;
        if ((i2 - i3) + i <= 2048) {
            if (i2 + i > 2048) {
                byte[] bArr = segment.data;
                System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                segment.limit -= segment.pos;
                segment.pos = 0;
            }
            System.arraycopy(this.data, this.pos, segment.data, segment.limit, i);
            segment.limit += i;
            this.pos += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
