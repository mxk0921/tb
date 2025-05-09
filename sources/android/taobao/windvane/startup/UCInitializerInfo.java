package android.taobao.windvane.startup;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UCInitializerInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final UCInitializerInfo b = new UCInitializerInfo();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, Long> f1821a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface UCInitializerStages {
        public static final int BEFORE_INIT = 13;
        public static final int DEX_READY = 5;
        public static final int DOWNLOAD_FINISH = 2;
        public static final int DOWNLOAD_START = 1;
        public static final int EXTRACT_FINISH = 4;
        public static final int EXTRACT_START = 3;
        public static final int FIRST_PRECREATE_WEBVIEW_END = 12;
        public static final int FIRST_PRECREATE_WEBVIEW_START = 11;
        public static final int GPU_PROCESS_READY = 10;
        public static final int INIT_FAIL = 8;
        public static final int INIT_START = 0;
        public static final int INIT_SUCCESS = 7;
        public static final int INIT_UC_PARAM_END = 15;
        public static final int INIT_UC_PARAM_START = 14;
        public static final int NATIVE_READY = 6;
        public static final int PRECREATE_TASK_SCHEDULED = 16;
        public static final int RENDER_PROCESS_READY = 9;
    }

    static {
        t2o.a(989856396);
    }

    public static UCInitializerInfo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCInitializerInfo) ipChange.ipc$dispatch("1559e8d7", new Object[0]);
        }
        return b;
    }

    public long b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e29a308", new Object[]{this, new Integer(i)})).longValue();
        }
        Long l = (Long) ((ConcurrentHashMap) this.f1821a).get(Integer.valueOf(i));
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea8171cb", new Object[]{this, new Integer(i)});
        } else if (!((ConcurrentHashMap) this.f1821a).containsKey(Integer.valueOf(i))) {
            ((ConcurrentHashMap) this.f1821a).put(Integer.valueOf(i), Long.valueOf(SystemClock.uptimeMillis()));
        }
    }
}
