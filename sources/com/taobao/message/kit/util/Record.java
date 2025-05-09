package com.taobao.message.kit.util;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/message/kit/util/Record;", "", "()V", "blockingGcCount", "", "getBlockingGcCount", "()I", "setBlockingGcCount", "(I)V", "blockingGcTime", "", "getBlockingGcTime", "()J", "setBlockingGcTime", "(J)V", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class Record {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int blockingGcCount;
    private long blockingGcTime;

    static {
        t2o.a(529531012);
    }

    public final int getBlockingGcCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("893e55e2", new Object[]{this})).intValue();
        }
        return this.blockingGcCount;
    }

    public final long getBlockingGcTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f98d29cf", new Object[]{this})).longValue();
        }
        return this.blockingGcTime;
    }

    public final void setBlockingGcCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18e00a00", new Object[]{this, new Integer(i)});
        } else {
            this.blockingGcCount = i;
        }
    }

    public final void setBlockingGcTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("865d47bd", new Object[]{this, new Long(j)});
        } else {
            this.blockingGcTime = j;
        }
    }
}
