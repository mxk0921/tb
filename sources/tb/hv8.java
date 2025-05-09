package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class hv8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hv8 INSTANCE = new hv8();

    static {
        t2o.a(834666498);
    }

    @JvmStatic
    public static final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efc2bc5c", new Object[0])).booleanValue();
        }
        if (bzn.d().b("fcanvas_v8_jsi") || INSTANCE.c()) {
            return true;
        }
        return false;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99365fde", new Object[]{this});
        } else {
            bzn.b().d("fcanvas_v8_jsi");
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d002ac9", new Object[]{this})).booleanValue();
        }
        if (b()) {
            return true;
        }
        try {
            l6h c = bzn.d().c("fcanvas_v8_jsi");
            ckf.f(c, "loader().loadSync(LIBRARY_NAME)");
            if (c.i()) {
                return true;
            }
        } catch (Exception e) {
            TMSLogger.c("FCanvasLibraryInit", "loadFCanvasLibrarySync", e);
        }
        return c();
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2063aaa9", new Object[]{this})).booleanValue();
        }
        try {
            System.loadLibrary("fcanvas_v8_jsi");
            return true;
        } catch (Throwable th) {
            TMSLogger.c("FCanvasLibraryInit", "loadFCanvasLibraryFromLocal", th);
            return false;
        }
    }
}
