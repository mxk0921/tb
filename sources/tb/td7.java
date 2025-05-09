package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.calendar.api.WVCalendarPlugin;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.jsbridge.WVFloatWindowPlugin;
import com.taobao.desktop.channel.userprefer.PreferServicePlugin;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class td7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile td7 c;

    /* renamed from: a  reason: collision with root package name */
    public Application f28645a;
    public boolean b = false;

    static {
        t2o.a(435159125);
    }

    public static td7 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (td7) ipChange.ipc$dispatch("5cf958cf", new Object[0]);
        }
        if (c == null) {
            synchronized (td7.class) {
                try {
                    if (c == null) {
                        c = new td7();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return this.f28645a;
    }

    public void c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
            return;
        }
        this.f28645a = application;
        fsw.h(WVCalendarPlugin.WV_CALENDAR_PLUGIN, WVCalendarPlugin.class);
        fsw.h(WVFloatWindowPlugin.WV_PLUGIN, WVFloatWindowPlugin.class);
        fsw.h(PreferServicePlugin.USER_PREFER_BRIDGE, PreferServicePlugin.class);
        ekz.d(this.f28645a).k();
    }

    public void d(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        Object obj = hashMap.get("isDebuggable");
        if (obj instanceof Boolean) {
            this.b = ((Boolean) obj).booleanValue();
        }
        yv8.d(this.b);
        try {
            p0m.l(new g8a());
            p0m.l(new wc());
            p0m.q(application);
        } catch (Throwable th) {
            yv8.b("DesktopChannelInit.init.error", th);
        }
    }
}
