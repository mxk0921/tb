package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.ConfigCenter;
import com.taobao.orange.model.ConfigDO;
import com.taobao.orange.model.CustomConfigDO;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.orange.util.OLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dy4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ConfigDO> f18148a = new ConcurrentHashMap();

    static {
        t2o.a(613417052);
    }

    public boolean a(ConfigDO configDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc8398db", new Object[]{this, configDO})).booleanValue();
        }
        if (!ConfigCenter.getInstance().checkCriticalConfigValid(configDO)) {
            return false;
        }
        ((ConcurrentHashMap) this.f18148a).put(configDO.name, configDO);
        r9b.e(configDO.name, configDO.type);
        ConfigCenter.getInstance().notifyListeners(configDO.name, configDO.getCurVersion(), false, true);
        return true;
    }

    public boolean b(ConfigDO configDO) {
        ConfigDO configDO2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bd61616", new Object[]{this, configDO})).booleanValue();
        }
        if (configDO == null || (configDO2 = (ConfigDO) ((ConcurrentHashMap) this.f18148a).get(configDO.name)) == null || configDO2.isExpired.get() || ibl.k(configDO2.getChangeVersion()) > ibl.k(configDO.getChangeVersion())) {
            return false;
        }
        configDO2.isExpired.set(true);
        ((ConcurrentHashMap) this.f18148a).remove(configDO.name);
        OLog.e("CriticalConfigCache", "check config " + configDO2.name + " changeVersion old in CriticalConfigCache is expired", new Object[0]);
        return true;
    }

    public Map<String, ConfigDO> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7d126180", new Object[]{this});
        }
        return this.f18148a;
    }

    public <T> T d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21c12842", new Object[]{this, str});
        }
        ConfigDO configDO = (ConfigDO) ((ConcurrentHashMap) this.f18148a).get(str);
        T t = null;
        if (configDO == null) {
            return null;
        }
        if (configDO.isExpired.get()) {
            OLog.e("CriticalConfigCache", "config " + str + "is expired", new Object[0]);
            return null;
        }
        if (NameSpaceDO.TYPE_STANDARD.equals(configDO.type)) {
            t = (T) configDO.content;
        } else if ("CUSTOM".equals(configDO.type)) {
            t = (T) ((CustomConfigDO) configDO).stringContent;
        } else {
            OLog.e("CriticalConfigCache", "getConfigs fail, type " + configDO.type + " not support", new Object[0]);
        }
        if (!configDO.monitored) {
            eal.h(configDO.name, configDO.version, configDO.getChangeVersion(), true);
            configDO.monitored = true;
        }
        return t;
    }
}
