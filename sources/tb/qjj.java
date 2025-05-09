package tb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbreakpad.TBreakpadConfig;
import com.taobao.android.tbreakpad.TBreakpadNativeBridge;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qjj implements ljj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f26785a;
    public final UncaughtCrashHeader b = new a();
    public final boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements UncaughtCrashHeader {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.tcrash.UncaughtCrashHeader
        public void addHeaderInfo(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc462277", new Object[]{this, str, str2});
            } else {
                TBreakpadNativeBridge.addHeaderInfo(str, str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBreakpadNativeBridge.initAnrLooper();
            }
        }
    }

    public qjj(x0s x0sVar, boolean z) {
        this.f26785a = x0sVar;
        i1r a2 = o1r.a(x0sVar.g());
        boolean z2 = true;
        boolean z3 = z && a2.b("supportNewAnr", false);
        if (Build.VERSION.SDK_INT < 35) {
            z2 = z3;
        } else if (!z3 || !a2.b("supportNewAnrAndroid15", false)) {
            z2 = false;
        }
        this.c = z2;
    }

    public static /* synthetic */ void g(ValueCallback valueCallback, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94287b56", new Object[]{valueCallback, file});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("logType", "anr");
        bundle.putString("filePathName", file.getAbsolutePath());
        valueCallback.onReceiveValue(bundle);
    }

    public static /* synthetic */ String h(Callable callable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68b8d297", new Object[]{callable});
        }
        try {
            return (String) callable.call();
        } catch (Throwable th) {
            ehh.d(th);
            return "";
        }
    }

    @Override // tb.ljj
    public void a(final Callable<String> callable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6263cd94", new Object[]{this, callable});
        } else {
            TBreakpadNativeBridge.addOnAnrListener(new ipk() { // from class: tb.pjj
                @Override // tb.ipk
                public final String a() {
                    String h;
                    h = qjj.h(callable);
                    return h;
                }
            });
        }
    }

    @Override // tb.ljj
    public void b(ValueCallback<Bundle> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407a6415", new Object[]{this, valueCallback});
        } else {
            TBreakpadNativeBridge.setOnAnrCompletedListener(new ojj(valueCallback));
        }
    }

    @Override // tb.ljj
    public void disable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5097f36f", new Object[]{this});
        }
    }

    @Override // tb.ljj
    public UncaughtCrashHeader getUncaughtCrashHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UncaughtCrashHeader) ipChange.ipc$dispatch("d410a0ab", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.ljj
    public void enable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c6308a", new Object[]{this});
            return;
        }
        final Application g = this.f26785a.g();
        i1r b2 = o1r.b(g, true);
        final koq b3 = poq.b(this.f26785a, new HashMap());
        File b4 = new q1s(g, this.f26785a.h()).b();
        if (!b4.exists()) {
            b4.mkdirs();
        }
        Application g2 = this.f26785a.g();
        TBreakpadConfig.a aVar = new TBreakpadConfig.a(g2, b4, "TCrash2_df_df_df_12278902_" + this.f26785a.f(), this.c);
        aVar.d(this.f26785a.h());
        aVar.c(this.f26785a.f());
        aVar.b(this.f26785a.d("buildId", "600000"));
        aVar.g("100");
        aVar.e("0");
        aVar.f(b2.b("supportForceDump", b3.defaultValue()));
        TBreakpadNativeBridge.initBreakpad(aVar.a());
        v9a.c().b().post(new b());
        v9a.c().b().postDelayed(new Runnable() { // from class: tb.njj
            @Override // java.lang.Runnable
            public final void run() {
                qjj.f(g, b3);
            }
        }, 20000L);
        ehh.b("TBreakPadCore", "init");
    }

    public static /* synthetic */ void f(Context context, koq koqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("324ea666", new Object[]{context, koqVar});
            return;
        }
        i1r b2 = o1r.b(context, true);
        TBreakpadNativeBridge.doLazyAction(new TBreakpadConfig.NativeSwitch[]{new TBreakpadConfig.NativeSwitch("supportArtAbortBelow31", b2.b("supportArtAbortBelow31", koqVar.defaultValue())), new TBreakpadConfig.NativeSwitch("supportArtAbortAbove31", b2.b("supportArtAbortAbove31", koqVar.defaultValue()))});
    }
}
