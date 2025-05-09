package tb;

import android.text.TextUtils;
import com.alibaba.analytics.core.config.UTClientConfigMgr;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.module.plugin.UTPluginConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class h2v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public UTPluginConfig d = null;
    public final f2v e = new f2v();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, g2v> f20381a = new ConcurrentHashMap();
    public final Map<String, g2v> b = new ConcurrentHashMap();
    public final Map<String, g2v> c = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements UTClientConfigMgr.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
        public String getKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
            }
            return ku0.TRACK_PAGE_COUNTER_TYPE_PLUGIN;
        }

        @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
        public void onChange(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bfd17c0", new Object[]{this, str});
            } else {
                h2v.access$000(h2v.this, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements UTClientConfigMgr.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
        public String getKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
            }
            return "plugin2";
        }

        @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
        public void onChange(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bfd17c0", new Object[]{this, str});
            } else {
                h2v.access$100(h2v.this, str);
            }
        }
    }

    static {
        t2o.a(962593314);
    }

    public h2v() {
        UTClientConfigMgr.c().e(new a());
        UTClientConfigMgr.c().e(new b());
    }

    public static /* synthetic */ void access$000(h2v h2vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa1261f", new Object[]{h2vVar, str});
        } else {
            h2vVar.c(str);
        }
    }

    public static /* synthetic */ void access$100(h2v h2vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888186be", new Object[]{h2vVar, str});
        } else {
            h2vVar.b(str);
        }
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11215629", new Object[]{this, str})).booleanValue();
        }
        UTPluginConfig uTPluginConfig = this.d;
        if (uTPluginConfig == null) {
            return true;
        }
        List<String> open = uTPluginConfig.getOpen();
        if (open != null && open.contains(str)) {
            return true;
        }
        List<String> close = this.d.getClose();
        if (close != null && close.contains(str)) {
            return false;
        }
        String other = this.d.getOther();
        if (TextUtils.isEmpty(other) || !other.equals("close")) {
            return true;
        }
        return false;
    }

    public Iterator getOpenAsyncUTPluginMapIterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("563f7554", new Object[]{this});
        }
        return ((ConcurrentHashMap) this.c).entrySet().iterator();
    }

    public Iterator getOpenUTPluginMapIterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("9e0d1b78", new Object[]{this});
        }
        return ((ConcurrentHashMap) this.b).entrySet().iterator();
    }

    public boolean isAsyncOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e983f767", new Object[]{this})).booleanValue();
        }
        Map<String, g2v> map = this.c;
        if (map == null || ((ConcurrentHashMap) map).size() <= 0) {
            return false;
        }
        return true;
    }

    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        Map<String, g2v> map = this.b;
        if (map == null || ((ConcurrentHashMap) map).size() <= 0) {
            return false;
        }
        return true;
    }

    public boolean isWritableKey(g2v g2vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a92d9f8", new Object[]{this, g2vVar, str})).booleanValue();
        }
        if (g2vVar == null) {
            return false;
        }
        return g2vVar.isWritableKey(str);
    }

    public boolean isWritableUtparamCnt(g2v g2vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("585816a8", new Object[]{this, g2vVar, str})).booleanValue();
        }
        if (g2vVar == null) {
            return false;
        }
        return g2vVar.isWritableUtparamCnt(str);
    }

    public void unregisterPlugin(g2v g2vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37d4c24", new Object[]{this, g2vVar});
        } else if (g2vVar != null) {
            String pluginName = g2vVar.getPluginName();
            if (TextUtils.isEmpty(pluginName)) {
                pluginName = "OldUTPlugin_" + g2vVar.hashCode();
            }
            if (!TextUtils.isEmpty(pluginName)) {
                ((ConcurrentHashMap) this.f20381a).remove(pluginName);
                ((ConcurrentHashMap) this.b).remove(pluginName);
                ((ConcurrentHashMap) this.c).remove(pluginName);
            }
        }
    }

    public final synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d264160", new Object[]{this, str});
            return;
        }
        nhh.f("UTPluginConfigMgr", "parseUTPlugin2Config", str);
        try {
            this.e.plugin2ConfigMap = (Map) JSON.parseObject(str, Map.class);
        } catch (Exception unused) {
            this.e.plugin2ConfigMap = null;
        }
        for (Map.Entry entry : ((ConcurrentHashMap) this.f20381a).entrySet()) {
            String str2 = (String) entry.getKey();
            if (this.e.containPluginName(str2)) {
                ((g2v) entry.getValue()).setUTPluginParam(false, this.e.isSync(str2), this.e.getWritableKeyList(str2), this.e.getUtparamCntList(str2));
            }
        }
        Iterator it = ((ConcurrentHashMap) this.b).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            String str3 = (String) entry2.getKey();
            if (this.e.containPluginName(str3)) {
                g2v g2vVar = (g2v) entry2.getValue();
                if (!g2vVar.isSyncMessage()) {
                    it.remove();
                    ((ConcurrentHashMap) this.c).put(str3, g2vVar);
                    nhh.f("UTPluginConfigMgr", "move openUTPluginMap to openAsyncUTPluginMap", str3);
                }
            }
        }
        Iterator it2 = ((ConcurrentHashMap) this.c).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it2.next();
            String str4 = (String) entry3.getKey();
            if (this.e.containPluginName(str4)) {
                g2v g2vVar2 = (g2v) entry3.getValue();
                if (g2vVar2.isSyncMessage()) {
                    it2.remove();
                    ((ConcurrentHashMap) this.b).put(str4, g2vVar2);
                    nhh.f("UTPluginConfigMgr", "move openAsyncUTPluginMap to openUTPluginMap", str4);
                }
            }
        }
    }

    public final synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2104a558", new Object[]{this, str});
            return;
        }
        nhh.f("UTPluginConfigMgr", "parseUTPluginConfig", str);
        try {
            this.d = (UTPluginConfig) JSON.parseObject(str, UTPluginConfig.class);
        } catch (Exception unused) {
            this.d = null;
        }
        for (Map.Entry entry : ((ConcurrentHashMap) this.f20381a).entrySet()) {
            String str2 = (String) entry.getKey();
            if (!a(str2)) {
                ((ConcurrentHashMap) this.b).remove(str2);
                ((ConcurrentHashMap) this.c).remove(str2);
                nhh.f("UTPluginConfigMgr", "remove", str2);
            } else {
                g2v g2vVar = (g2v) entry.getValue();
                boolean isSyncMessage = g2vVar.isSyncMessage();
                if (!((ConcurrentHashMap) this.b).containsKey(str2) && isSyncMessage) {
                    ((ConcurrentHashMap) this.b).put(str2, g2vVar);
                    nhh.f("UTPluginConfigMgr", "openUTPluginMap put", str2);
                } else if (!((ConcurrentHashMap) this.c).containsKey(str2) && !isSyncMessage) {
                    ((ConcurrentHashMap) this.c).put(str2, g2vVar);
                    nhh.f("UTPluginConfigMgr", "openAsyncUTPluginMap put", str2);
                }
            }
        }
    }

    public void registerPlugin(g2v g2vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("736cca4b", new Object[]{this, g2vVar});
        } else if (g2vVar != null) {
            String pluginName = g2vVar.getPluginName();
            if (TextUtils.isEmpty(pluginName)) {
                pluginName = "OldUTPlugin_" + g2vVar.hashCode();
            }
            if (!TextUtils.isEmpty(pluginName) && !((ConcurrentHashMap) this.f20381a).containsKey(pluginName)) {
                if (this.e.containPluginName(pluginName)) {
                    g2vVar.setUTPluginParam(false, this.e.isSync(pluginName), this.e.getWritableKeyList(pluginName), this.e.getUtparamCntList(pluginName));
                }
                ((ConcurrentHashMap) this.f20381a).put(pluginName, g2vVar);
                if (a(pluginName)) {
                    nhh.f("UTPluginConfigMgr", "isOpen", pluginName);
                    if (g2vVar.isSyncMessage()) {
                        ((ConcurrentHashMap) this.b).put(pluginName, g2vVar);
                        nhh.f("UTPluginConfigMgr", "openUTPluginMap.put", pluginName);
                        return;
                    }
                    ((ConcurrentHashMap) this.c).put(pluginName, g2vVar);
                    nhh.f("UTPluginConfigMgr", "openAsyncUTPluginMap.put", pluginName);
                }
            }
        }
    }
}
