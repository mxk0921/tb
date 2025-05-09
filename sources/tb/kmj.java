package tb;

import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.taobao.windvane.jsbridge.WVJsBridge;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kmj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IWVWebView f22760a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void onFailed(String str);

        void onSuccess(String str);
    }

    static {
        t2o.a(790626488);
    }

    public kmj(IWVWebView iWVWebView) {
        this.f22760a = iWVWebView;
    }

    public static /* synthetic */ void d(spw spwVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6c87", new Object[]{spwVar, str});
            return;
        }
        try {
            WVJsBridge.g().e(spwVar, str);
        } catch (Throwable th) {
            wdm.h("NativeWindvaneRequest.WVJsBridge.callMethod.error", th);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements r4c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f22761a;
        public final /* synthetic */ b b;

        public a(kmj kmjVar, AtomicBoolean atomicBoolean, b bVar) {
            this.f22761a = atomicBoolean;
            this.b = bVar;
        }

        @Override // tb.r4c
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("310f3b65", new Object[]{this, str});
            } else if (this.f22761a.compareAndSet(false, true)) {
                if (TextUtils.isEmpty(str)) {
                    str = "{}";
                }
                wdm.d("PopWVJsBridge.successAndKeepAlive.ret=%s", str);
                b bVar = this.b;
                if (bVar != null) {
                    bVar.onSuccess(str);
                }
            }
        }

        @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
        public void succeed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5b77b53", new Object[]{this, str});
            } else if (this.f22761a.compareAndSet(false, true)) {
                if (TextUtils.isEmpty(str)) {
                    str = "{}";
                }
                wdm.d("PopWVJsBridge.succeed.ret=%s", str);
                b bVar = this.b;
                if (bVar != null) {
                    bVar.onSuccess(str);
                }
            }
        }
    }

    public static /* synthetic */ void c(AtomicBoolean atomicBoolean, b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f6c9ec2", new Object[]{atomicBoolean, bVar, str});
        } else if (atomicBoolean.compareAndSet(false, true)) {
            if (TextUtils.isEmpty(str)) {
                str = "{}";
            }
            wdm.d("PopWVJsBridge.onFailed.ret=%s", str);
            if (bVar != null) {
                bVar.onFailed(str);
            }
        }
    }

    public boolean e(String str, String str2, final String str3, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32151040", new Object[]{this, str, str2, str3, bVar})).booleanValue();
        }
        try {
            final spw spwVar = new spw();
            String[] split = str.split("\\.");
            if (split.length != 2) {
                return false;
            }
            spwVar.d = split[0];
            spwVar.e = split[1];
            spwVar.f28213a = this.f22760a;
            spwVar.g = "0";
            spwVar.f = str2;
            if (TextUtils.isEmpty(str2)) {
                spwVar.f = "{}";
            }
            wdm.d("nativeRequestWindvane", new Object[0]);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            spwVar.i = new a(this, atomicBoolean, bVar);
            spwVar.h = new IJsApiFailedCallBack() { // from class: tb.imj
                @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
                public final void fail(String str4) {
                    kmj.c(atomicBoolean, bVar, str4);
                }
            };
            hst.b(new Runnable() { // from class: tb.jmj
                @Override // java.lang.Runnable
                public final void run() {
                    kmj.d(spw.this, str3);
                }
            });
            return true;
        } catch (Throwable th) {
            wdm.h("NativeWindvaneRequest.nativeRequestWindvane.error.name=" + str + ".param=" + str2, th);
            return false;
        }
    }
}
