package anet.channel.heartbeat;

import anet.channel.Constants;
import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DefaultBgAccsHeartbeatImpl implements IHeartbeat, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Session session = null;
    public volatile boolean isCancelled = false;

    static {
        t2o.a(607125664);
        t2o.a(607125667);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd73a171", new Object[]{this});
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!this.isCancelled) {
            this.session.ping(true);
            ThreadPoolExecutorFactory.submitScheduledTask(this, Constants.MAX_SESSION_IDLE_TIME, TimeUnit.MILLISECONDS);
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af21441", new Object[]{this, session});
        } else if (session != null) {
            this.session = session;
            run();
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
}
