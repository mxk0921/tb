package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vk8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_LOGIN = "login";
    public static final String EVENT_LOGOUT = "logout";
    public static final String EVENT_RENDER_SUCCESS = "renderSuccess";
    public static final String EVENT_TAB_PAGE_INFO_REFRESH = "tabPageInfoRefresh";
    public static final String KEY_DATA = "data";
    public static final vk8 b = new vk8();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<m3c>> f30066a = new ConcurrentHashMap();

    static {
        t2o.a(1032847367);
    }

    public static vk8 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vk8) ipChange.ipc$dispatch("1ee34192", new Object[0]);
        }
        return b;
    }

    public void a(List<String> list, m3c m3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a492d29", new Object[]{this, list, m3cVar});
        } else if (m3cVar == null || list == null || list.size() == 0) {
            throw new IllegalStateException("eventListener is not null");
        } else {
            for (String str : list) {
                List list2 = (List) ((ConcurrentHashMap) this.f30066a).get(str);
                if (list2 == null) {
                    list2 = new ArrayList();
                    ((ConcurrentHashMap) this.f30066a).put(str, list2);
                }
                if (!list2.contains(m3cVar)) {
                    list2.add(m3cVar);
                }
            }
        }
    }

    public void c(List<String> list, m3c m3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f547a84c", new Object[]{this, list, m3cVar});
        } else if (m3cVar != null) {
            for (String str : list) {
                List list2 = (List) ((ConcurrentHashMap) this.f30066a).get(str);
                if (list2 != null) {
                    list2.remove(m3cVar);
                }
            }
        } else {
            throw new IllegalStateException("eventListener is not null");
        }
    }

    public void d(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88045422", new Object[]{this, str, map});
            return;
        }
        List<m3c> list = (List) ((ConcurrentHashMap) this.f30066a).get(str);
        if (list != null) {
            for (m3c m3cVar : list) {
                try {
                    m3cVar.onEvent(str, map);
                } catch (Throwable th) {
                    TLog.loge("tab3edlp", "sendEvent error " + Log.getStackTraceString(th));
                }
            }
        }
    }
}
