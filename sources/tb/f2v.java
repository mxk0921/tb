package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class f2v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Map<String, Object>> plugin2ConfigMap;

    static {
        t2o.a(962593312);
    }

    public boolean containPluginName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef52e567", new Object[]{this, str})).booleanValue();
        }
        Map<String, Map<String, Object>> map = this.plugin2ConfigMap;
        if (map == null) {
            return false;
        }
        return map.containsKey(str);
    }

    public List<String> getUtparamCntList(String str) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("14472787", new Object[]{this, str});
        }
        if (!containPluginName(str) || (map = this.plugin2ConfigMap.get(str)) == null) {
            return null;
        }
        try {
            return (List) map.get("utparam-cnt");
        } catch (Exception unused) {
            return null;
        }
    }

    public List<String> getWritableKeyList(String str) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d10f124f", new Object[]{this, str});
        }
        if (!containPluginName(str) || (map = this.plugin2ConfigMap.get(str)) == null) {
            return null;
        }
        try {
            return (List) map.get("wk");
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean isSync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a25c7ba", new Object[]{this, str})).booleanValue();
        }
        if (!containPluginName(str)) {
            return true;
        }
        Map<String, Object> map = this.plugin2ConfigMap.get(str);
        if (map == null) {
            return false;
        }
        return "1".equalsIgnoreCase((String) map.get("sync"));
    }
}
