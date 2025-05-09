package tb;

import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import tb.p9o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class qv2<T extends p9o> {
    protected long mExpiredTime = 0;
    protected ThreadStrategy mThreadStrategy;
    protected long mThreshold;

    public qv2(ThreadStrategy threadStrategy, long j) {
        this.mThreadStrategy = threadStrategy;
        this.mThreshold = j;
    }

    public long getExpiredTime() {
        return this.mExpiredTime;
    }

    public ThreadStrategy getThreadStrategy() {
        return this.mThreadStrategy;
    }

    public long getThreshold() {
        return this.mThreshold;
    }

    public abstract void onResult(T t);

    public void setExpiredTime(long j) {
        this.mExpiredTime = j;
    }
}
