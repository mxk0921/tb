package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.timestamp.TimeStampManager;
import com.taobao.taobaocompat.lifecycle.TimestampSynchronizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a7t implements r0e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092403);
        t2o.a(806356473);
    }

    @Override // tb.r0e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c8cd8a", new Object[]{this});
        } else {
            TimeStampManager.instance().pullTimeStampIfNeeded();
        }
    }

    @Override // tb.r0e
    public long getServerTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cda1621", new Object[]{this})).longValue();
        }
        return TimestampSynchronizer.getServerTime();
    }
}
