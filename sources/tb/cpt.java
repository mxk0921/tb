package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cpt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    @Deprecated
    public static final String ACTION_THEME_CHANGE = "com.taobao.android.action.THEME_CHANGE";
    public static final String MODULE_NAME_GLOBAL = "global";
    public static final String MODULE_NAME_MY_TAOBAO = "mytaobao";

    /* renamed from: a  reason: collision with root package name */
    public static volatile cpt f17223a;
    public static FestivalMgr b;

    static {
        t2o.a(464519268);
    }

    public cpt() {
        b = FestivalMgr.i();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b6511e6", new Object[0])).booleanValue();
        }
        return true;
    }

    public static cpt c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cpt) ipChange.ipc$dispatch("d038c41f", new Object[0]);
        }
        if (f17223a == null) {
            synchronized (cpt.class) {
                try {
                    if (f17223a == null) {
                        f17223a = new cpt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17223a;
    }

    public static ThemeData d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("3b4c66e", new Object[0]);
        }
        return FestivalMgr.i().m(null);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("534658b7", new Object[0])).booleanValue();
        }
        return FestivalMgr.i().t();
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7804b2a5", new Object[0])).booleanValue();
        }
        return FestivalMgr.i().v("global");
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccf4b305", new Object[0])).booleanValue();
        }
        return FestivalMgr.i().J();
    }

    public ThemeFrameLayout b(Context context, tot totVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeFrameLayout) ipChange.ipc$dispatch("74f571d6", new Object[]{this, context, totVar});
        }
        return b.c(context, totVar);
    }

    public ThemeData e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("657b58e4", new Object[]{this, str});
        }
        return b.m(str);
    }

    public String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2cd966d5", new Object[]{this, str, str2});
        }
        return b.o(str, str2);
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdc6d1b8", new Object[]{this, str});
        } else {
            b.B(str);
        }
    }

    public void j(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f15a3516", new Object[]{this, str, jSONObject});
        } else {
            b.G(str, jSONObject);
        }
    }

    public void k(String str, ThemeData themeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf6ec96", new Object[]{this, str, themeData});
        } else {
            b.H(str, themeData);
        }
    }
}
