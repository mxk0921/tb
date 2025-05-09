package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class qbs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final qbs INSTANCE = new qbs();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<a>> f26660a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(String str, JSON json);
    }

    static {
        t2o.a(839909422);
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[0]);
        } else {
            f26660a.clear();
        }
    }

    @JvmStatic
    public static final void b(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1761c13a", new Object[]{str, json});
            return;
        }
        ckf.g(str, "eventName");
        CopyOnWriteArrayList<a> copyOnWriteArrayList = f26660a.get(str);
        if (copyOnWriteArrayList != null) {
            for (a aVar : copyOnWriteArrayList) {
                aVar.a(str, json);
            }
        }
    }

    @JvmStatic
    public static final void c(String str, a aVar) {
        CopyOnWriteArrayList<a> putIfAbsent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aadd423", new Object[]{str, aVar});
            return;
        }
        ckf.g(str, "eventName");
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        ConcurrentHashMap<String, CopyOnWriteArrayList<a>> concurrentHashMap = f26660a;
        CopyOnWriteArrayList<a> copyOnWriteArrayList = concurrentHashMap.get(str);
        if (copyOnWriteArrayList == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (copyOnWriteArrayList = new CopyOnWriteArrayList<>()))) != null) {
            copyOnWriteArrayList = putIfAbsent;
        }
        copyOnWriteArrayList.add(aVar);
    }

    @JvmStatic
    public static final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44253228", new Object[]{str});
            return;
        }
        ckf.g(str, "eventName");
        f26660a.remove(str);
    }
}
