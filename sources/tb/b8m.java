package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.TaoInit;
import com.etao.feimagesearch.capture.CaptureJSBridge;
import com.etao.feimagesearch.capture.dynamic.hybrid.TBAlbumImg;
import com.etao.feimagesearch.cip.capture.CaptureModule;
import com.etao.feimagesearch.irp.NewIrpMuiseModule;
import com.etao.feimagesearch.result.IrpJsBridge;
import com.etao.feimagesearch.result.IrpMuiseModule;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.search.jarvis.rcmd.SearchXslSdk;
import com.taobao.tao.Globals;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class b8m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f16249a;
    public static volatile boolean b;
    public static final b8m INSTANCE = new b8m();
    public static final String c = "PltSDK";

    static {
        t2o.a(730857487);
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            INSTANCE.b();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3305d6", new Object[]{this});
        } else if (!f16249a) {
            try {
                TaoInit.init();
            } catch (Throwable unused) {
            }
            f16249a = true;
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b83e11db", new Object[]{this});
        } else if (!b) {
            try {
                k8j.a(Globals.getApplication());
                SearchXslSdk.install();
                MUSEngine.registerModule(IrpMuiseModule.NAME, NewIrpMuiseModule.class);
                MUSEngine.registerModule(CaptureModule.NAME, CaptureModule.class);
                s7m.a();
                MUSEngine.registerUINode(TBAlbumImg.NODE_NAME, TBAlbumImg.class);
                fsw.i(IrpJsBridge.NAME, CaptureJSBridge.class, true);
                b = true;
            } catch (Exception e) {
                agh.d(c, "initPltModule", e);
            }
        }
    }
}
