package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rue {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, HomeInfoFlowDataService> f27613a = new ConcurrentHashMap(2);
    public static final Set<String> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            throw new InfoFlowRuntimeException("新架构已经全量，这里有个拖后腿的case，赶紧查看一下~~~");
        }
    }

    static {
        t2o.a(729809395);
        HashSet hashSet = new HashSet(4);
        b = hashSet;
        hashSet.add(z4a.NEW_FACE_CHILD.f32522a);
        hashSet.add(z4a.NEW_FACE_CHILD_INTL.f32522a);
    }

    public static HomeInfoFlowDataService a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeInfoFlowDataService) ipChange.ipc$dispatch("f59c978e", new Object[]{str});
        }
        if (((HashSet) b).contains(str)) {
            return (HomeInfoFlowDataService) ((ConcurrentHashMap) f27613a).get(xti.f());
        }
        sfh.d("InfoFlowDataServiceDetector", "findInfoFlowDataService 容器ID未开放新架构信息流 : " + str);
        if (!eue.b()) {
            return null;
        }
        if (!z4a.NEW_FACE_CHILD.f32522a.equals(str) && !z4a.NEW_FACE_CHILD_INTL.f32522a.equals(str)) {
            return null;
        }
        Coordinator.execute(new a());
        return null;
    }

    public static void b(String str, HomeInfoFlowDataService homeInfoFlowDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfda9f18", new Object[]{str, homeInfoFlowDataService});
        } else {
            ((ConcurrentHashMap) f27613a).put(str, homeInfoFlowDataService);
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c873b700", new Object[]{str});
        } else {
            ((ConcurrentHashMap) f27613a).remove(str);
        }
    }
}
