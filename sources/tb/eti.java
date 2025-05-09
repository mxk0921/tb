package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.hti;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class eti {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_BLOCK_STACK = 94;
    public static final int EVENT_HONOR_PRESSURE_TEMPERATURE = 53;
    public static final int EVENT_MEMORY_COLLECTED = 15;
    public static final int EVENT_POWER_SAVE_MODE_OFF = 93;
    public static final int EVENT_POWER_SAVE_MODE_ON = 92;

    /* renamed from: a  reason: collision with root package name */
    public static b f18806a;
    public static final Object b = new Object();
    public static final Map<Integer, List<a>> c = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void onEvent(int i, Map<String, ?> map);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
    }

    public static void a(int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60ac4090", new Object[]{new Integer(i), aVar});
            return;
        }
        b bVar = f18806a;
        if (bVar != null) {
            ((hti.c) bVar).a(i, aVar);
            return;
        }
        synchronized (b) {
            try {
                Map<Integer, List<a>> map = c;
                List list = (List) ((HashMap) map).get(Integer.valueOf(i));
                if (list == null) {
                    list = new ArrayList();
                    ((HashMap) map).put(Integer.valueOf(i), list);
                }
                list.add(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68146981", new Object[]{bVar});
            return;
        }
        synchronized (b) {
            try {
                f18806a = bVar;
                for (Map.Entry entry : ((HashMap) c).entrySet()) {
                    if (entry.getValue() != null) {
                        for (a aVar : (List) entry.getValue()) {
                            ((hti.c) bVar).a(((Integer) entry.getKey()).intValue(), aVar);
                        }
                    }
                }
                ((HashMap) c).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
