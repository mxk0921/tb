package anet.channel;

import android.text.TextUtils;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SessionAttributeManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Integer> publicKeyMap = new HashMap();
    public Map<String, SessionInfo> sessionInfoMap = new ConcurrentHashMap();

    static {
        t2o.a(607125529);
    }

    public int getPublicKey(String str) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c8b3b04", new Object[]{this, str})).intValue();
        }
        synchronized (this.publicKeyMap) {
            num = this.publicKeyMap.get(str);
        }
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public SessionInfo getSessionInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionInfo) ipChange.ipc$dispatch("f396c701", new Object[]{this, str});
        }
        return this.sessionInfoMap.get(str);
    }

    public Collection<SessionInfo> getSessionInfos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("e5fda33b", new Object[]{this});
        }
        return this.sessionInfoMap.values();
    }

    public void registerPublicKey(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db5ec55f", new Object[]{this, str, new Integer(i)});
        } else if (!TextUtils.isEmpty(str)) {
            synchronized (this.publicKeyMap) {
                this.publicKeyMap.put(str, Integer.valueOf(i));
            }
        } else {
            throw new IllegalArgumentException("host cannot be null or empty");
        }
    }

    public SessionInfo unregisterSessionInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionInfo) ipChange.ipc$dispatch("8232c067", new Object[]{this, str});
        }
        ALog.e("awcn.SessionAttributeManager", "[unregisterSessionInfo] host=" + str, null, new Object[0]);
        return this.sessionInfoMap.remove(str);
    }

    public void registerSessionInfo(SessionInfo sessionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54836d52", new Object[]{this, sessionInfo});
        } else if (sessionInfo == null) {
            throw new NullPointerException("info is null");
        } else if (!TextUtils.isEmpty(sessionInfo.host)) {
            ALog.e("awcn.SessionAttributeManager", "[registerSessionInfo] host=" + sessionInfo.host, null, new Object[0]);
            this.sessionInfoMap.put(sessionInfo.host, sessionInfo);
        } else {
            throw new IllegalArgumentException("host cannot be null or empty");
        }
    }
}
