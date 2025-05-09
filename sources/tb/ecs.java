package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ecs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f18479a;
    public ITMSPage b;
    public TabBarItem c;

    static {
        t2o.a(835715112);
    }

    public final TabBarItem a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBarItem) ipChange.ipc$dispatch("ce2fb85a", new Object[]{this});
        }
        return this.c;
    }

    public final ITMSPage b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("b17e45f5", new Object[]{this});
        }
        return this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("551c67f9", new Object[]{this});
        }
        return this.f18479a;
    }

    public final void d(TabBarItem tabBarItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ece642", new Object[]{this, tabBarItem});
        } else {
            this.c = tabBarItem;
        }
    }

    public final void e(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11535bc3", new Object[]{this, iTMSPage});
        } else {
            this.b = iTMSPage;
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1a849d", new Object[]{this, str});
        } else {
            this.f18479a = str;
        }
    }
}
