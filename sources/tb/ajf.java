package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ajf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<wif> f15774a = new AtomicReference<>(null);
    public static final wif b = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements wif {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.wif
        public int b(String str, Map<String, String> map, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7164108b", new Object[]{this, str, map, obj})).intValue();
            }
            return 0;
        }

        @Override // tb.wif
        public int c(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cf6f902e", new Object[]{this, str, map})).intValue();
            }
            return 0;
        }
    }

    public static int a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf6f902e", new Object[]{str, map})).intValue();
        }
        wif wifVar = f15774a.get();
        if (wifVar == null) {
            wifVar = b;
        }
        return wifVar.c(str, map);
    }

    public static int b(String str, Map<String, String> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7164108b", new Object[]{str, map, obj})).intValue();
        }
        wif wifVar = f15774a.get();
        if (wifVar == null) {
            wifVar = b;
        }
        return wifVar.b(str, map, obj);
    }

    public static void c(wif wifVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd5c9373", new Object[]{wifVar});
        } else if (sng.a(f15774a, null, wifVar)) {
            Log.e("ScheduleInterceptor", "settled interceptor");
        } else {
            Log.e("ScheduleInterceptor", "already settled interceptor");
        }
    }
}
