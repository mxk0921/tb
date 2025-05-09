package tb;

import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.navigation.Interface.TabHostStatusListener;
import com.taobao.tao.navigation.NavigationTabIndicatorView;
import com.taobao.tao.navigation.NavigationTabMsgMode;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.a;
import com.taobao.tao.navigation.view.IconForegroundImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class opj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd2b06", new Object[]{str});
        } else {
            g(str, null, null);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4952840b", new Object[]{str});
            return;
        }
        jhj.b("NavigationIntroductoryApi", "clearMessage: " + str);
        NavigationTabIndicatorView c = c(str);
        if (c == null) {
            jhj.b("NavigationIntroductoryApi", "updateForegroundView: indicatorView is null");
        } else {
            c.updateMessage(NavigationTabMsgMode.NONE, null);
        }
    }

    public static NavigationTabIndicatorView c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NavigationTabIndicatorView) ipChange.ipc$dispatch("1b358008", new Object[]{str});
        }
        TBFragmentTabHost o = a.o();
        if (o != null) {
            return o.getTabViewAtIndex(xe2.a(str));
        }
        jhj.b("NavigationIntroductoryApi", "getIndicatorView: tabHost is null");
        return null;
    }

    public static Boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("7da7b994", new Object[]{str});
        }
        NavigationTabIndicatorView c = c(str);
        if (c != null) {
            return Boolean.valueOf(c.isSelected());
        }
        jhj.b("NavigationIntroductoryApi", "updateForegroundView: indicatorView is null");
        return null;
    }

    public static void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd2f195", new Object[]{new Integer(i)});
            return;
        }
        TabHostStatusListener.a aVar = new TabHostStatusListener.a();
        aVar.f12544a = 1;
        aVar.b = i;
        a.F(aVar);
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5915339", new Object[]{str});
            return;
        }
        NavigationTabIndicatorView c = c(str);
        if (c == null) {
            jhj.b("NavigationIntroductoryApi", "resetGuardianForegroundView: indicatorView is null");
            return;
        }
        c.resetGuardianForegroundView();
        jhj.b("NavigationIntroductoryApi", "resetGuardianForegroundView, bizCode: " + str);
    }

    public static void g(String str, Drawable drawable, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c675f0", new Object[]{str, drawable, str2});
        } else {
            h(str, drawable, str2, 12);
        }
    }

    public static void h(String str, Drawable drawable, String str2, int i) {
        IconForegroundImageView iconForegroundImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d308bb13", new Object[]{str, drawable, str2, new Integer(i)});
            return;
        }
        if (drawable != null) {
            iconForegroundImageView = new IconForegroundImageView(a.o().getContext());
            iconForegroundImageView.setImageDrawable(drawable, i);
        } else {
            iconForegroundImageView = null;
        }
        jhj.b("NavigationIntroductoryApi", "updateForegroundView: " + drawable);
        NavigationTabIndicatorView c = c(str);
        if (c == null) {
            jhj.b("NavigationIntroductoryApi", "updateForegroundView: indicatorView is null");
        } else {
            c.setForegroundView(iconForegroundImageView, 8, str2);
        }
    }

    public static void i(String str, String str2, NavigationTabMsgMode navigationTabMsgMode, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1f2eff4", new Object[]{str, str2, navigationTabMsgMode, str3});
            return;
        }
        jhj.b("NavigationIntroductoryApi", "updateMessage: " + str + " " + str2);
        NavigationTabIndicatorView c = c(str);
        if (c == null) {
            jhj.b("NavigationIntroductoryApi", "updateForegroundView: indicatorView is null");
        } else {
            c.updateMessage(navigationTabMsgMode, str2, str3);
        }
    }

    public static void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db7d80cf", new Object[]{new Boolean(z)});
        } else {
            a.c = z;
        }
    }
}
