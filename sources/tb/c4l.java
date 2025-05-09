package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c4l extends zrk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final alc f16855a;

    static {
        t2o.a(779092142);
    }

    public c4l(alc alcVar) {
        this.f16855a = alcVar;
    }

    public static /* synthetic */ Object ipc$super(c4l c4lVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1940644637:
                c4lVar.i(objArr[0], (String) objArr[1]);
                return null;
            case -1752924240:
                return super.b(objArr[0]);
            case -1106051504:
                super.g(objArr[0], (String) objArr[1]);
                return null;
            case -364247363:
                return super.a((Activity) objArr[0]);
            case 608513303:
                super.h(objArr[0], (Map) objArr[1]);
                return null;
            case 653433751:
                super.f(objArr[0]);
                return null;
            case 1224673222:
                super.e(objArr[0]);
                return null;
            case 1375885991:
                super.d(objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/open/OpenPageUTImpl");
        }
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74be6932", new Object[0])).booleanValue();
        }
        return d4s.e("enableLiveAppearTrack", true);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c2e0a7f", new Object[0])).booleanValue();
        }
        if (!d4s.e("enableTab2NativeTrack", true) || !akt.l1()) {
            return false;
        }
        return true;
    }

    @Override // tb.zrk
    public Map<String, String> a(Activity activity) {
        alc alcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ea4a06bd", new Object[]{this, activity});
        }
        if (!akt.p2("enableGetAllLiveProperties", true)) {
            return super.a(activity);
        }
        if (!k() || l() != null || (alcVar = this.f16855a) == null || alcVar.getTab2ServiceDelegate() == null) {
            return od0.D().d().getPageAllProperties(activity);
        }
        return this.f16855a.getTab2ServiceDelegate().C(bps.TABID_INNERLIVE);
    }

    @Override // tb.zrk
    public Map<String, String> b(Object obj) {
        alc alcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("97847fb0", new Object[]{this, obj});
        }
        if (!akt.p2("enableGetLiveProperties", true)) {
            return super.b(obj);
        }
        Object l = l();
        if (!k() || l != null || (alcVar = this.f16855a) == null || alcVar.getTab2ServiceDelegate() == null) {
            return od0.D().d().c(l);
        }
        return this.f16855a.getTab2ServiceDelegate().w(bps.TABID_INNERLIVE);
    }

    @Override // tb.zrk
    public void d(Object obj) {
        alc alcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52025aa7", new Object[]{this, obj});
        } else if (j()) {
            Object l = l();
            if (!k() || l != null || (alcVar = this.f16855a) == null || alcVar.getTab2ServiceDelegate() == null) {
                od0.D().d().d(l, null);
            } else {
                this.f16855a.getTab2ServiceDelegate().P(bps.TABID_INNERLIVE, "Page_TaobaoLiveWatch", true);
            }
        } else {
            super.d(obj);
        }
    }

    @Override // tb.zrk
    public void e(Object obj) {
        alc alcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ff07c6", new Object[]{this, obj});
        } else if (j()) {
            Object l = l();
            if (!k() || l != null || (alcVar = this.f16855a) == null || alcVar.getTab2ServiceDelegate() == null) {
                od0.D().d().h(l, null);
            } else {
                this.f16855a.getTab2ServiceDelegate().P(bps.TABID_INNERLIVE, "Page_TaobaoLiveWatch", false);
            }
        } else {
            super.e(obj);
        }
    }

    @Override // tb.zrk
    public void f(Object obj) {
        alc alcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f29b97", new Object[]{this, obj});
        } else if (j()) {
            Object l = l();
            if (!k() || l != null || (alcVar = this.f16855a) == null || alcVar.getTab2ServiceDelegate() == null) {
                od0.D().d().pageDisAppear(l);
            } else {
                this.f16855a.getTab2ServiceDelegate().S(bps.TABID_INNERLIVE);
            }
        } else {
            super.f(obj);
        }
    }

    @Override // tb.zrk
    public void g(Object obj, String str) {
        alc alcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be12fe50", new Object[]{this, obj, str});
        } else if (!j() || (alcVar = this.f16855a) == null) {
            super.g(obj, str);
        } else {
            alcVar.updatePageName(str);
        }
    }

    @Override // tb.zrk
    public void h(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{this, obj, map});
        } else if (!j() || this.f16855a == null) {
            super.h(obj, map);
        } else {
            Object l = l();
            if (!k() || l != null || this.f16855a.getTab2ServiceDelegate() == null) {
                this.f16855a.updatePageProperties(l, map);
            } else {
                this.f16855a.getTab2ServiceDelegate().J(bps.TABID_INNERLIVE, map);
            }
        }
    }

    public final Object l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dbe25f7", new Object[]{this});
        }
        return this.f16855a.getNode();
    }
}
