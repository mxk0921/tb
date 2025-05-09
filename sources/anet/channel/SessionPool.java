package anet.channel;

import anet.channel.entity.ProtocolType;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SessionPool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.SessionPool";
    private final Map<SessionRequest, List<Session>> connPool = new HashMap();
    private final ReentrantReadWriteLock lock;
    private final ReentrantReadWriteLock.ReadLock readLock;
    private final ReentrantReadWriteLock.WriteLock writeLock;

    static {
        t2o.a(607125540);
    }

    public SessionPool() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.lock = reentrantReadWriteLock;
        this.readLock = reentrantReadWriteLock.readLock();
        this.writeLock = reentrantReadWriteLock.writeLock();
    }

    public void add(SessionRequest sessionRequest, Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588a2c59", new Object[]{this, sessionRequest, session});
        } else if (sessionRequest != null && sessionRequest.getHost() != null && session != null) {
            this.writeLock.lock();
            try {
                List<Session> list = this.connPool.get(sessionRequest);
                if (list == null) {
                    list = new ArrayList<>();
                    this.connPool.put(sessionRequest, list);
                }
                if (list.indexOf(session) != -1) {
                    this.writeLock.unlock();
                    return;
                }
                list.add(session);
                Collections.sort(list);
                this.writeLock.unlock();
            } catch (Throwable th) {
                this.writeLock.unlock();
                throw th;
            }
        }
    }

    public boolean containsValue(SessionRequest sessionRequest, Session session) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21d4e34c", new Object[]{this, sessionRequest, session})).booleanValue();
        }
        this.readLock.lock();
        try {
            List<Session> list = this.connPool.get(sessionRequest);
            if (list == null) {
                return false;
            }
            if (list.indexOf(session) == -1) {
                z = false;
            }
            return z;
        } finally {
            this.readLock.unlock();
        }
    }

    public List<SessionRequest> getInfos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2971eeb1", new Object[]{this});
        }
        List<SessionRequest> list = Collections.EMPTY_LIST;
        this.readLock.lock();
        try {
            if (this.connPool.isEmpty()) {
                return list;
            }
            return new ArrayList(this.connPool.keySet());
        } finally {
            this.readLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r10.get(0).isDeprecated == false) goto L_0x0074;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        r5.mSessionStat.selectSessionType = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        if (1 != r10.indexOf(r5)) goto L_0x0074;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        r5.mSessionStat.selectSessionType = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
        r3 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public anet.channel.Session getSession(anet.channel.SessionRequest r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = anet.channel.SessionPool.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "3a31470c"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r9
            r2[r0] = r10
            java.lang.Object r10 = r3.ipc$dispatch(r4, r2)
            anet.channel.Session r10 = (anet.channel.Session) r10
            return r10
        L_0x0018:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r9.readLock
            r3.lock()
            java.util.Map<anet.channel.SessionRequest, java.util.List<anet.channel.Session>> r3 = r9.connPool     // Catch: all -> 0x005a
            java.lang.Object r10 = r3.get(r10)     // Catch: all -> 0x005a
            java.util.List r10 = (java.util.List) r10     // Catch: all -> 0x005a
            r3 = 0
            if (r10 == 0) goto L_0x007b
            boolean r4 = r10.isEmpty()     // Catch: all -> 0x005a
            if (r4 == 0) goto L_0x002f
            goto L_0x007b
        L_0x002f:
            java.util.Iterator r4 = r10.iterator()     // Catch: all -> 0x005a
        L_0x0033:
            boolean r5 = r4.hasNext()     // Catch: all -> 0x005a
            if (r5 == 0) goto L_0x0075
            java.lang.Object r5 = r4.next()     // Catch: all -> 0x005a
            anet.channel.Session r5 = (anet.channel.Session) r5     // Catch: all -> 0x005a
            if (r5 == 0) goto L_0x0033
            boolean r6 = r5.isAvailable()     // Catch: all -> 0x005a
            if (r6 == 0) goto L_0x0033
            boolean r6 = r5.isDeprecated     // Catch: all -> 0x005a
            if (r6 == 0) goto L_0x005c
            r5.isNetworkStatusChangeNewSession = r0     // Catch: all -> 0x005a
            java.lang.String r6 = "awcn.SessionPool"
            java.lang.String r7 = "session is deprecated"
            java.lang.String r5 = r5.mSeq     // Catch: all -> 0x005a
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch: all -> 0x005a
            anet.channel.util.ALog.e(r6, r7, r5, r8)     // Catch: all -> 0x005a
            goto L_0x0033
        L_0x005a:
            r10 = move-exception
            goto L_0x0081
        L_0x005c:
            java.lang.Object r1 = r10.get(r1)     // Catch: all -> 0x005a
            anet.channel.Session r1 = (anet.channel.Session) r1     // Catch: all -> 0x005a
            boolean r1 = r1.isDeprecated     // Catch: all -> 0x005a
            if (r1 == 0) goto L_0x0074
            anet.channel.statist.SessionStatistic r1 = r5.mSessionStat     // Catch: all -> 0x005a
            r1.selectSessionType = r0     // Catch: all -> 0x005a
            int r10 = r10.indexOf(r5)     // Catch: all -> 0x005a
            if (r0 != r10) goto L_0x0074
            anet.channel.statist.SessionStatistic r10 = r5.mSessionStat     // Catch: all -> 0x005a
            r10.selectSessionType = r2     // Catch: all -> 0x005a
        L_0x0074:
            r3 = r5
        L_0x0075:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r10 = r9.readLock
            r10.unlock()
            return r3
        L_0x007b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r10 = r9.readLock
            r10.unlock()
            return r3
        L_0x0081:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r9.readLock
            r0.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.SessionPool.getSession(anet.channel.SessionRequest):anet.channel.Session");
    }

    public void remove(SessionRequest sessionRequest, Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38694916", new Object[]{this, sessionRequest, session});
            return;
        }
        this.writeLock.lock();
        try {
            List<Session> list = this.connPool.get(sessionRequest);
            if (list == null) {
                this.writeLock.unlock();
                return;
            }
            list.remove(session);
            if (AwcnConfig.isSessionReuseOptimized()) {
                Iterator<Session> it = list.iterator();
                while (it.hasNext()) {
                    Session next = it.next();
                    if (next != null && next.isReuse(session)) {
                        it.remove();
                    }
                }
            }
            if (list.size() == 0) {
                this.connPool.remove(sessionRequest);
            }
            this.writeLock.unlock();
        } catch (Throwable th) {
            this.writeLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    public List<Session> getAvailableSessions(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b8c2955", new Object[]{this, sessionRequest});
        }
        this.readLock.lock();
        try {
            List<Session> list = this.connPool.get(sessionRequest);
            ArrayList arrayList = new ArrayList();
            if (list != null && !list.isEmpty()) {
                Iterator<Session> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Session next = it.next();
                        if (next != null && next.isAvailable()) {
                            if (!next.isDeprecated) {
                                arrayList.add(next);
                                break;
                            }
                            ALog.e(TAG, "session is deprecated", next.mSeq, new Object[0]);
                        }
                    } else {
                        break;
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                this.readLock.unlock();
                return arrayList2;
            }
            this.readLock.unlock();
            return null;
        } catch (Throwable th) {
            this.readLock.unlock();
            throw th;
        }
    }

    public List<Session> getSessions(SessionRequest sessionRequest) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f0c81798", new Object[]{this, sessionRequest});
        }
        this.readLock.lock();
        try {
            List<Session> list = this.connPool.get(sessionRequest);
            if (list == null) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (Session session : list) {
                boolean z = session.isDeprecated;
                if (z) {
                    str = "true";
                } else {
                    str = "false";
                }
                if (z) {
                    session.isNetworkStatusChangeNewSession = true;
                    ALog.e(TAG, "[smoothSwitch] getSessions BB host= " + sessionRequest.getHost() + " session= " + session.toString() + "ip =" + session.getIp() + " isDeprecated =" + str, session.mSeq, new Object[0]);
                } else {
                    arrayList.add(session);
                }
            }
            return arrayList;
        } finally {
            this.readLock.unlock();
        }
    }

    public Session getSession(SessionRequest sessionRequest, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("5d09d56d", new Object[]{this, sessionRequest, new Integer(i)}) : getSession(sessionRequest, i, ProtocolType.ALL, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
        if (r13 != anet.channel.entity.SessionType.LONG_LINK) goto L_0x00de;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
        if (r12.ipSource != 0) goto L_0x00de;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dc, code lost:
        if (r12.isStrategyInvalid != false) goto L_0x00de;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public anet.channel.Session getSession(anet.channel.SessionRequest r25, int r26, int r27, anet.channel.SessionParamStat r28) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.SessionPool.getSession(anet.channel.SessionRequest, int, int, anet.channel.SessionParamStat):anet.channel.Session");
    }
}
