package tb;

import android.os.SystemClock;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.entity.ConnType;
import anet.channel.entity.SessionType;
import anet.channel.util.HttpUrl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.utl.ALog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class l70 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile long f23146a;

    static {
        t2o.a(343933150);
    }

    public static Session a(SessionCenter sessionCenter, String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("e4c9e2ca", new Object[]{sessionCenter, str, new Long(j), str2});
        }
        return b(sessionCenter, str, ConnType.TypeLevel.SPDY, j, str2);
    }

    public static Session b(SessionCenter sessionCenter, String str, ConnType.TypeLevel typeLevel, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("5af51a20", new Object[]{sessionCenter, str, typeLevel, new Long(j), str2});
        }
        if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(str2)) {
            return null;
        }
        return sessionCenter.get(str, typeLevel, j);
    }

    public static Session c(SessionCenter sessionCenter, String str, int i, long j, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("1cc00003", new Object[]{sessionCenter, str, new Integer(i), new Long(j), str2});
        }
        if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(str2)) {
            return null;
        }
        return sessionCenter.getThrowsException(HttpUrl.parse(str), SessionType.LONG_LINK, i, j);
    }

    public static Session d(SessionCenter sessionCenter, String str, long j, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("d99f8e40", new Object[]{sessionCenter, str, new Long(j), str2});
        }
        if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(str2)) {
            return null;
        }
        return sessionCenter.getThrowsException(str, j);
    }

    public static Session e(SessionCenter sessionCenter, String str, ConnType.TypeLevel typeLevel, long j, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("e5579796", new Object[]{sessionCenter, str, typeLevel, new Long(j), str2});
        }
        if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(str2)) {
            return null;
        }
        return sessionCenter.getThrowsException(str, typeLevel, j);
    }

    public static void f(Session session, Integer... numArr) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f4b493", new Object[]{session, numArr});
        } else if (session != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (f23146a <= 0 || elapsedRealtime - f23146a >= 3000) {
                if (numArr == null || numArr.length <= 0 || (num = numArr[0]) == null || num.intValue() <= 0) {
                    session.ping(true);
                } else {
                    session.ping(true, numArr[0].intValue());
                }
                f23146a = elapsedRealtime;
                return;
            }
            ALog.e("AccsSessionCenter", "ping freq", new Object[0]);
        }
    }
}
