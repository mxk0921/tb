package tb;

import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class zrw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f32979a = false;
    public static String b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a extends ktw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(989855811);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/debug/WVPageFinishJSRender$WVDevelopToolWebViewClientFilter");
        }

        @Override // tb.ktw
        public void a(IWVWebView iWVWebView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("224b7655", new Object[]{this, iWVWebView, str});
            } else if (zrw.a() && !TextUtils.isEmpty(zrw.b()) && (iWVWebView instanceof IWVWebView)) {
                iWVWebView.evaluateJavascript(zrw.b());
            }
        }
    }

    static {
        t2o.a(989855810);
        lqw.d().c(new a(), lqw.f);
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return f32979a;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return b;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742fac33", new Object[0]);
            return;
        }
        f32979a = false;
        b = null;
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10280bf", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            f32979a = true;
            b = str;
        }
    }
}
