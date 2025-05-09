package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class muh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Map<String, zoc>> f24317a = new ConcurrentHashMap();
    public final Map<String, zoc> b = new ConcurrentHashMap();

    public zoc a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zoc) ipChange.ipc$dispatch("dcf444b2", new Object[]{this, str, str2});
        }
        Map map = (Map) ((ConcurrentHashMap) this.f24317a).get(str);
        if (map == null) {
            return null;
        }
        return (zoc) map.get(str2);
    }

    public void b(String str, String str2, zoc zocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83c50021", new Object[]{this, str, str2, zocVar});
            return;
        }
        Map map = (Map) ((ConcurrentHashMap) this.f24317a).get(str);
        if (map == null) {
            map = new ConcurrentHashMap();
            ((ConcurrentHashMap) this.f24317a).put(str, map);
        }
        ((ConcurrentHashMap) this.b).put(zocVar.h(), zocVar);
        map.put(str2, zocVar);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e33e65f", new Object[]{this, str});
            return;
        }
        zoc zocVar = (zoc) ((ConcurrentHashMap) this.b).remove(str);
        if (zocVar != null) {
            d(zocVar.a(), zocVar.w());
        }
    }

    public void d(String str, String str2) {
        Map map;
        zoc zocVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5045d669", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (map = (Map) ((ConcurrentHashMap) this.f24317a).remove(str)) != null && (zocVar = (zoc) map.get(str2)) != null) {
            ((ConcurrentHashMap) this.b).remove(zocVar.h());
        }
    }
}
