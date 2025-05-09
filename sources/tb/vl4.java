package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.pop.IPopPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vl4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f30082a;
    public final Map<String, IPopData> b = new ConcurrentHashMap();
    public final Map<Integer, Map<String, List<IPopData>>> c = new ConcurrentHashMap();
    public final Map<Integer, List<IPopData>> d = new ConcurrentHashMap();
    public final Map<Integer, List<IPopData>> e = new ConcurrentHashMap();

    public vl4(int i) {
        this.f30082a = i;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ((ConcurrentHashMap) this.e).clear();
        ((ConcurrentHashMap) this.c).clear();
    }

    public final void b(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0a33660", new Object[]{this, iPopData});
        } else if (iPopData.isAllowShow()) {
            bgm.b("PopShowCountValid", iPopData);
            int trigger = iPopData.getPopConfig().getTrigger();
            List list = (List) ((ConcurrentHashMap) this.d).get(Integer.valueOf(trigger));
            if (list == null) {
                list = new ArrayList(16);
                ((ConcurrentHashMap) this.d).put(Integer.valueOf(trigger), list);
            }
            list.add(iPopData);
        }
    }

    public final void c(IPopData iPopData) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9b1e3f", new Object[]{this, iPopData});
        } else if (iPopData.isAllowShow()) {
            int trigger = iPopData.getPopConfig().getTrigger();
            Map map = (Map) ((ConcurrentHashMap) this.c).get(Integer.valueOf(trigger));
            if (map == null) {
                map = new HashMap();
                ((ConcurrentHashMap) this.c).put(Integer.valueOf(trigger), map);
            }
            IPopPoint point = iPopData.getPopConfig().getPoint();
            if (point == null) {
                str = null;
            } else {
                str = point.getSectionBizCode();
            }
            List list = (List) map.get(str);
            if (list == null) {
                list = new ArrayList();
                map.put(str, list);
            }
            list.add(iPopData);
        }
    }

    public void d(Map<String, IPopData> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6508b1b1", new Object[]{this, map});
            return;
        }
        ((ConcurrentHashMap) this.b).clear();
        ((ConcurrentHashMap) this.e).clear();
        ((ConcurrentHashMap) this.c).clear();
        ((ConcurrentHashMap) this.d).clear();
        for (IPopData iPopData : map.values()) {
            if (this.f30082a == iPopData.getPopConfig().getHierarchy()) {
                ((ConcurrentHashMap) this.b).put(iPopData.getBusinessID(), iPopData);
                e(iPopData);
                b(iPopData);
                c(iPopData);
            }
        }
    }

    public final void e(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da017c71", new Object[]{this, iPopData});
            return;
        }
        int popContentType = iPopData.getPopConfig().getPopContentType();
        List list = (List) ((ConcurrentHashMap) this.e).get(Integer.valueOf(popContentType));
        if (list == null) {
            list = new ArrayList();
            ((ConcurrentHashMap) this.e).put(Integer.valueOf(popContentType), list);
        }
        list.add(iPopData);
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eed9b079", new Object[]{this})).intValue();
        }
        return this.f30082a;
    }

    public IPopData g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopData) ipChange.ipc$dispatch("4bbd77f8", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (IPopData) ((ConcurrentHashMap) this.b).get(str);
    }

    public List<IPopData> h(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("15431b4a", new Object[]{this, new Integer(i), str});
        }
        Map map = (Map) ((ConcurrentHashMap) this.c).get(Integer.valueOf(i));
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) map.get(str);
    }

    public List<IPopData> i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9b3a5ae7", new Object[]{this, new Integer(i)});
        }
        return (List) ((ConcurrentHashMap) this.d).get(Integer.valueOf(i));
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return ((ConcurrentHashMap) this.b).size();
    }

    public Map<Integer, List<IPopData>> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d4b5fe2", new Object[]{this});
        }
        return this.e;
    }
}
