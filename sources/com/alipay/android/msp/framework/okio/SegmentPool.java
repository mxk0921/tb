package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class SegmentPool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final SegmentPool INSTANCE = new SegmentPool();
    public static final long MAX_SIZE = 65536;

    /* renamed from: a  reason: collision with root package name */
    public Segment f3653a;
    public long byteCount;

    public final void recycle(Segment segment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccdbf534", new Object[]{this, segment});
        } else if (segment.next == null && segment.prev == null) {
            synchronized (this) {
                try {
                    long j = this.byteCount;
                    if (j + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX <= MAX_SIZE) {
                        this.byteCount = j + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                        segment.next = this.f3653a;
                        segment.limit = 0;
                        segment.pos = 0;
                        this.f3653a = segment;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final Segment take() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Segment) ipChange.ipc$dispatch("cc06500c", new Object[]{this});
        }
        synchronized (this) {
            try {
                Segment segment = this.f3653a;
                if (segment == null) {
                    return new Segment();
                }
                this.f3653a = segment.next;
                segment.next = null;
                this.byteCount -= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                return segment;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
