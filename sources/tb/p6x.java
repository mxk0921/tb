package tb;

import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.c;
import com.taobao.android.weex_framework.monitor.MUSMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface p6x {
    void a(String str, a.AbstractC0518a aVar);

    void b(String str, a.b bVar);

    void c(String str, a.b bVar);

    MUSMonitor d();

    void fireNativeEvent(String str, String str2);

    c getMonitorInfo();

    String getNativeState(String str);

    void registerNativeEventCallback(String str, a.AbstractC0518a aVar);

    void setMonitorDetailDims(String str, String str2);

    void setMonitorDetailTime(String str, long j);

    void updateNativeState(String str, String str2);
}
