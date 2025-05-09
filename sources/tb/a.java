package tb;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<View> f15457a;
    public final long b = System.currentTimeMillis();
    public final int c;
    public final Map<String, String> d;

    static {
        t2o.a(335544329);
    }

    public a(View view, AccessibilityEvent accessibilityEvent, Map<String, String> map) {
        this.c = -1;
        this.f15457a = new WeakReference<>(view);
        this.c = accessibilityEvent.getEventType();
        this.d = map;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ac77340", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("46c4490f", new Object[]{this});
        }
        return this.d;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0aad42f", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b9599910", new Object[]{this});
        }
        WeakReference<View> weakReference = this.f15457a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
