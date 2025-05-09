package tb;

import com.alibaba.fastjson.TypeReference;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tbreachflow.shortcuts.config.ShortcutConfig;
import com.taobao.tbreachflow.shortcuts.config.ShortcutControlConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class aal {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALENDAR_CLEAR_TITLE = "calendar_clear_title";
    public static final String STORAGE_MONITOR_MIN_SIZE_KEY = "storage_monitor_min_size";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                djn.e(aal.CALENDAR_CLEAR_TITLE, w8l.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends TypeReference<Map<String, ShortcutConfig>> {
        public b(aal aalVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c extends TypeReference<Map<String, ShortcutControlConfig>> {
        public c(aal aalVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final aal f15628a = new aal();

        public static /* synthetic */ aal a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (aal) ipChange.ipc$dispatch("f03de3ba", new Object[0]);
            }
            return f15628a;
        }
    }

    public static aal d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aal) ipChange.ipc$dispatch("606ffcb5", new Object[0]);
        }
        return d.a();
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f41a24ff", new Object[]{this, str});
        }
        return OrangeConfig.getInstance().getConfig("android_reach_flow", str, "");
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8876706b", new Object[]{this});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"android_reach_flow"}, new obk() { // from class: tb.z9l
                @Override // tb.obk
                public final void onConfigUpdate(String str, Map map) {
                    aal.this.e(str, map);
                }
            }, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:8:0x0021, B:10:0x0027, B:16:0x0038, B:18:0x0053, B:19:0x0056, B:21:0x0062, B:22:0x0065, B:24:0x0071, B:26:0x007d, B:27:0x008b, B:29:0x0097, B:30:0x009a, B:32:0x00a7, B:33:0x00aa, B:35:0x00b6, B:36:0x00c6, B:38:0x00d3, B:39:0x00da, B:42:0x00e0, B:44:0x00ed, B:45:0x0105, B:47:0x0112, B:48:0x0126, B:50:0x0133, B:51:0x013e, B:53:0x014b, B:54:0x0156, B:56:0x0163, B:57:0x016a, B:59:0x0174, B:60:0x017b), top: B:63:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:8:0x0021, B:10:0x0027, B:16:0x0038, B:18:0x0053, B:19:0x0056, B:21:0x0062, B:22:0x0065, B:24:0x0071, B:26:0x007d, B:27:0x008b, B:29:0x0097, B:30:0x009a, B:32:0x00a7, B:33:0x00aa, B:35:0x00b6, B:36:0x00c6, B:38:0x00d3, B:39:0x00da, B:42:0x00e0, B:44:0x00ed, B:45:0x0105, B:47:0x0112, B:48:0x0126, B:50:0x0133, B:51:0x013e, B:53:0x014b, B:54:0x0156, B:56:0x0163, B:57:0x016a, B:59:0x0174, B:60:0x017b), top: B:63:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:8:0x0021, B:10:0x0027, B:16:0x0038, B:18:0x0053, B:19:0x0056, B:21:0x0062, B:22:0x0065, B:24:0x0071, B:26:0x007d, B:27:0x008b, B:29:0x0097, B:30:0x009a, B:32:0x00a7, B:33:0x00aa, B:35:0x00b6, B:36:0x00c6, B:38:0x00d3, B:39:0x00da, B:42:0x00e0, B:44:0x00ed, B:45:0x0105, B:47:0x0112, B:48:0x0126, B:50:0x0133, B:51:0x013e, B:53:0x014b, B:54:0x0156, B:56:0x0163, B:57:0x016a, B:59:0x0174, B:60:0x017b), top: B:63:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:8:0x0021, B:10:0x0027, B:16:0x0038, B:18:0x0053, B:19:0x0056, B:21:0x0062, B:22:0x0065, B:24:0x0071, B:26:0x007d, B:27:0x008b, B:29:0x0097, B:30:0x009a, B:32:0x00a7, B:33:0x00aa, B:35:0x00b6, B:36:0x00c6, B:38:0x00d3, B:39:0x00da, B:42:0x00e0, B:44:0x00ed, B:45:0x0105, B:47:0x0112, B:48:0x0126, B:50:0x0133, B:51:0x013e, B:53:0x014b, B:54:0x0156, B:56:0x0163, B:57:0x016a, B:59:0x0174, B:60:0x017b), top: B:63:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:8:0x0021, B:10:0x0027, B:16:0x0038, B:18:0x0053, B:19:0x0056, B:21:0x0062, B:22:0x0065, B:24:0x0071, B:26:0x007d, B:27:0x008b, B:29:0x0097, B:30:0x009a, B:32:0x00a7, B:33:0x00aa, B:35:0x00b6, B:36:0x00c6, B:38:0x00d3, B:39:0x00da, B:42:0x00e0, B:44:0x00ed, B:45:0x0105, B:47:0x0112, B:48:0x0126, B:50:0x0133, B:51:0x013e, B:53:0x014b, B:54:0x0156, B:56:0x0163, B:57:0x016a, B:59:0x0174, B:60:0x017b), top: B:63:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:8:0x0021, B:10:0x0027, B:16:0x0038, B:18:0x0053, B:19:0x0056, B:21:0x0062, B:22:0x0065, B:24:0x0071, B:26:0x007d, B:27:0x008b, B:29:0x0097, B:30:0x009a, B:32:0x00a7, B:33:0x00aa, B:35:0x00b6, B:36:0x00c6, B:38:0x00d3, B:39:0x00da, B:42:0x00e0, B:44:0x00ed, B:45:0x0105, B:47:0x0112, B:48:0x0126, B:50:0x0133, B:51:0x013e, B:53:0x014b, B:54:0x0156, B:56:0x0163, B:57:0x016a, B:59:0x0174, B:60:0x017b), top: B:63:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0 A[Catch: all -> 0x0102, TRY_ENTER, TryCatch #1 {all -> 0x0034, blocks: (B:8:0x0021, B:10:0x0027, B:16:0x0038, B:18:0x0053, B:19:0x0056, B:21:0x0062, B:22:0x0065, B:24:0x0071, B:26:0x007d, B:27:0x008b, B:29:0x0097, B:30:0x009a, B:32:0x00a7, B:33:0x00aa, B:35:0x00b6, B:36:0x00c6, B:38:0x00d3, B:39:0x00da, B:42:0x00e0, B:44:0x00ed, B:45:0x0105, B:47:0x0112, B:48:0x0126, B:50:0x0133, B:51:0x013e, B:53:0x014b, B:54:0x0156, B:56:0x0163, B:57:0x016a, B:59:0x0174, B:60:0x017b), top: B:63:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void e(java.lang.String r9, java.util.Map r10) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.aal.e(java.lang.String, java.util.Map):void");
    }
}
