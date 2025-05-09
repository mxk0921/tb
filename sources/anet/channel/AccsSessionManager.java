package anet.channel;

import android.content.Intent;
import android.text.TextUtils;
import anet.channel.entity.ConnType;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IStrategyInstance;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AccsSessionManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.AccsSessionManager";
    private static CopyOnWriteArraySet<ISessionListener> listeners = new CopyOnWriteArraySet<>();
    public SessionCenter instance;
    public Set<String> lastKeys = Collections.EMPTY_SET;

    static {
        t2o.a(607125505);
    }

    public AccsSessionManager(SessionCenter sessionCenter) {
        this.instance = null;
        this.instance = sessionCenter;
    }

    public static /* synthetic */ CopyOnWriteArraySet access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArraySet) ipChange.ipc$dispatch("5205e0b2", new Object[0]);
        }
        return listeners;
    }

    private boolean isNeedCheckSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19bd82f9", new Object[]{this})).booleanValue();
        }
        if ((!GlobalAppRuntimeInfo.isAppBackground() || !AwcnConfig.isAccsSessionCreateForbiddenInBg()) && NetworkStatusHelper.isConnected()) {
            return true;
        }
        return false;
    }

    public synchronized void forceCloseSession(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f48643a", new Object[]{this, str, new Boolean(z)});
            return;
        }
        for (String str2 : this.lastKeys) {
            closeSessions(str2, str);
        }
        if (z) {
            checkAndStartSession();
        }
    }

    public void notifyListener(final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15570e1", new Object[]{this, intent});
        } else {
            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.AccsSessionManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = AccsSessionManager.access$000().iterator();
                    while (it.hasNext()) {
                        try {
                            ((ISessionListener) it.next()).onConnectionChanged(intent);
                        } catch (Exception e) {
                            ALog.e(AccsSessionManager.TAG, "notifyListener exception.", null, e, new Object[0]);
                        }
                    }
                }
            });
        }
    }

    public void registerListener(ISessionListener iSessionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e38643", new Object[]{this, iSessionListener});
        } else if (iSessionListener != null) {
            listeners.add(iSessionListener);
        }
    }

    public void unregisterListener(ISessionListener iSessionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c8fb0a", new Object[]{this, iSessionListener});
        } else {
            listeners.remove(iSessionListener);
        }
    }

    public synchronized void checkAndStartSession() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1034242a", new Object[]{this});
            return;
        }
        Collection<SessionInfo> sessionInfos = this.instance.attributeManager.getSessionInfos();
        Set<String> set = Collections.EMPTY_SET;
        if (!sessionInfos.isEmpty()) {
            set = new TreeSet<>();
        }
        for (SessionInfo sessionInfo : sessionInfos) {
            if (sessionInfo.isKeepAlive) {
                IStrategyInstance instance = StrategyCenter.getInstance();
                String str2 = sessionInfo.host;
                if (sessionInfo.isAccs) {
                    str = "https";
                } else {
                    str = "http";
                }
                set.add(StringUtils.concatString(instance.getSchemeByHost(str2, str), HttpConstant.SCHEME_SPLIT, sessionInfo.host));
            }
        }
        for (String str3 : this.lastKeys) {
            if (!set.contains(str3)) {
                closeSessions(str3, "accs check not need keepAlive");
            }
        }
        if (isNeedCheckSession()) {
            for (String str4 : set) {
                try {
                    this.instance.get(str4, ConnType.TypeLevel.SPDY, 0L);
                    ALog.e(TAG, "checkAndStartSession retry session s=" + str4, null, str4);
                } catch (Exception unused) {
                    ALog.e(TAG, "start session failed", "host", str4);
                }
            }
            this.lastKeys = set;
        }
    }

    private void closeSessions(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00243d0", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            ALog.d(TAG, "closeSessions", this.instance.seqNum, "host", str);
            this.instance.getSessionRequest(str).closeSessions(false, str2);
        }
    }

    public synchronized void checkSessions(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17ffa96", new Object[]{this, str});
            return;
        }
        ALog.e(TAG, "checkSessions", this.instance.seqNum, "checkReason", str);
        for (String str2 : this.lastKeys) {
            this.instance.getSessionRequest(str2).checkSession(1000, str);
        }
    }

    public synchronized void forceCloseSession(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a1f0c4", new Object[]{this, new Boolean(z)});
        } else {
            forceCloseSession("accs forceCloseSession", z);
        }
    }
}
