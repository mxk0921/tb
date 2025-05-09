package tb;

import android.text.TextUtils;
import com.nirvana.tools.requestqueue.strategy.CallbackStrategy;
import com.nirvana.tools.requestqueue.strategy.ExecuteStrategy;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import tb.p9o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class d3o<T extends p9o> {
    private static final long MIN_TIMEOUT_MILLS = 500;
    private pvt<T> mAction;
    private qv2<T> mCallback;
    private CallbackStrategy mCallbackStrategy;
    private ExecuteStrategy mExecuteStrategy;
    private String mID;
    private String mResponseType;
    private ThreadStrategy mThreadStrategy;
    private long mTimeoutMills;

    public d3o(qv2<T> qv2Var, pvt<T> pvtVar, ThreadStrategy threadStrategy, ExecuteStrategy executeStrategy, CallbackStrategy callbackStrategy, long j, Class<T> cls) {
        this.mTimeoutMills = 500L;
        this.mCallback = qv2Var;
        this.mAction = pvtVar;
        this.mThreadStrategy = threadStrategy;
        this.mExecuteStrategy = executeStrategy;
        this.mCallbackStrategy = callbackStrategy;
        if (j > 500) {
            this.mTimeoutMills = j;
        }
        this.mResponseType = cls.getName();
    }

    public pvt<T> getAction() {
        return this.mAction;
    }

    public qv2<T> getCallback() {
        return this.mCallback;
    }

    public CallbackStrategy getCallbackStrategy() {
        return this.mCallbackStrategy;
    }

    public ExecuteStrategy getExecuteStrategy() {
        return this.mExecuteStrategy;
    }

    public String getID() {
        if (TextUtils.isEmpty(this.mID)) {
            this.mID = getKey() + this.mResponseType;
        }
        return this.mID;
    }

    public abstract String getKey();

    public ThreadStrategy getThreadStrategy() {
        return this.mThreadStrategy;
    }

    public long getTimeout() {
        return this.mTimeoutMills;
    }

    public void setTimeout(long j) {
        this.mTimeoutMills = j;
    }
}
