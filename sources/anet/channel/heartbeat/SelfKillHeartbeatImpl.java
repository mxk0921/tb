package anet.channel.heartbeat;

import anet.channel.Constants;
import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SelfKillHeartbeatImpl implements IHeartbeat, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.IdleSessionChecker";
    private Session session = null;
    private volatile boolean isCancelled = false;
    private volatile long expectSelfKillTime = System.currentTimeMillis();

    static {
        t2o.a(607125668);
        t2o.a(607125667);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd73a171", new Object[]{this});
        } else {
            this.expectSelfKillTime = System.currentTimeMillis() + Constants.MAX_SESSION_IDLE_TIME;
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af21441", new Object[]{this, session});
        } else if (session != null) {
            this.session = session;
            this.expectSelfKillTime = System.currentTimeMillis() + Constants.MAX_SESSION_IDLE_TIME;
            ThreadPoolExecutorFactory.submitScheduledTask(this, Constants.MAX_SESSION_IDLE_TIME, TimeUnit.MILLISECONDS);
        } else {
            throw new NullPointerException("session is null");
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            this.isCancelled = true;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!this.isCancelled) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < this.expectSelfKillTime - 1000) {
                ThreadPoolExecutorFactory.submitScheduledTask(this, this.expectSelfKillTime - currentTimeMillis, TimeUnit.MILLISECONDS);
                return;
            }
            Session session = this.session;
            ALog.e(TAG, "close idle session.", session.mSeq, "isDeprecated", Boolean.valueOf(session.isDeprecated));
            this.session.close(false, "idle close");
        }
    }
}
