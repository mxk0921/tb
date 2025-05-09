package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class aaa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744489034);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("faea78e3", new Object[0])).booleanValue();
        }
        try {
            boolean b = ABGlobal.b(Globals.getApplication(), "taobao", "tbspeed", "link_afc_id_opt_off");
            vp9.b("linkx", "GlobalAbUtil === link_afc_id_opt_off === " + b);
            return !b;
        } catch (Exception unused) {
            vp9.b("linkx", "GlobalAbUtil === link_afc_id_opt_off === error");
            return true;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe54a64d", new Object[0])).booleanValue();
        }
        try {
            return ABGlobal.b(Globals.getApplication(), "taobao", "tbspeed", "link_launch_opt");
        } catch (Exception unused) {
            vp9.b("linkx", "GlobalAbUtil === link_launch_opt === error");
            return false;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7904cc69", new Object[0])).booleanValue();
        }
        try {
            return ABGlobal.b(Globals.getApplication(), "taobao", "tbspeed", "afcPreFetch2");
        } catch (Exception unused) {
            vp9.b("linkx", "GlobalAbUtil === afcPreFetch2AB === error");
            return false;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67d79141", new Object[0])).booleanValue();
        }
        try {
            return ABGlobal.b(Globals.getApplication(), "taobao", "tbspeed", "afcPreFetch");
        } catch (Exception unused) {
            vp9.b("linkx", "GlobalAbUtil === afcPreFetchAB === error");
            return false;
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3722a46", new Object[0])).booleanValue();
        }
        try {
            boolean b = ABGlobal.b(Globals.getApplication(), "taobao", "tbspeed", "link_ut_sync_opt_off");
            vp9.b("linkx", "GlobalAbUtil === link_ut_sync_opt_off === " + b);
            return !b;
        } catch (Exception unused) {
            vp9.b("linkx", "GlobalAbUtil === link_ut_sync_opt_off === error");
            return false;
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("923c2473", new Object[0])).booleanValue();
        }
        try {
            boolean b = ABGlobal.b(Globals.getApplication(), "taobao", "tbspeed", "link_h5url_rewriter");
            vp9.b("linkx", "GlobalAbUtil === link_h5url_rewriter === " + b);
            return b;
        } catch (Exception unused) {
            vp9.b("linkx", "GlobalAbUtil === link_h5url_rewriter === error");
            return false;
        }
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("852d10bb", new Object[0])).booleanValue();
        }
        try {
            return ABGlobal.b(Globals.getApplication(), "taobao", "tbspeed", "linkInOrder");
        } catch (Exception unused) {
            vp9.b("linkx", "GlobalAbUtil === linkInOrder === error");
            return false;
        }
    }
}
