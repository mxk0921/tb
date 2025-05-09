package tb;

import com.alibaba.appmonitor.event.EventType;
import com.android.alibaba.ip.runtime.IpChange;
import tb.w2v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ko1 implements w2v.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ko1 f22793a = new ko1();

    static {
        t2o.a(962593024);
        t2o.a(962593012);
    }

    public ko1() {
        w2v.d(this);
    }

    public static ko1 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ko1) ipChange.ipc$dispatch("838c282e", new Object[0]);
        }
        return f22793a;
    }

    public final void b(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("748d8a8d", new Object[]{this, new Boolean(z)});
            return;
        }
        nhh.f("BackgroundTrigger", "isAppOnForeground", Boolean.valueOf(z));
        if (z) {
            sa.h().p();
            EventType[] values = EventType.values();
            int length = values.length;
            while (i < length) {
                EventType eventType = values[i];
                j71.l(eventType, eventType.getForegroundStatisticsInterval());
                i++;
            }
            return;
        }
        EventType[] values2 = EventType.values();
        int length2 = values2.length;
        while (i < length2) {
            EventType eventType2 = values2[i];
            j71.l(eventType2, eventType2.getBackgroundStatisticsInterval());
            i++;
        }
        j71.m();
    }

    @Override // tb.w2v.a
    public void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
        } else {
            b(false);
        }
    }

    @Override // tb.w2v.a
    public void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
        } else {
            b(true);
        }
    }
}
