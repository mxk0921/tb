package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.view.View;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.AceMultiPortBridge;
import com.taobao.android.searchbaseframe.ace.utils.AceEntryUtils;
import com.taobao.tao.Globals;
import com.uc.webview.export.WebView;
import java.util.LinkedList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y70 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile WVUCWebView f31887a;
    public static final LinkedList<bpl<String, String>> b = new LinkedList<>();
    public static final Handler c = new Handler(Looper.getMainLooper());
    public static boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31888a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.f31888a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            WVStandardEventCenter.postNotificationToJS(y70.c(), this.f31888a, this.b);
            Toast.makeText(Globals.getApplication(), "策略已命中", 0).show();
        }
    }

    static {
        t2o.a(993001572);
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        d = z;
        return z;
    }

    public static /* synthetic */ LinkedList b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("47c3ec76", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ WVUCWebView c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("b6bcf31e", new Object[0]);
        }
        return f31887a;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfedbf58", new Object[0]);
        }
        if (AceEntryUtils.INSTANCE.c()) {
            return "http://onepiece.alibaba-inc.com/ace/#/mobile/home?localBroadcast=true";
        }
        return "http://onepiece.alibaba-inc.com/ace/#/mobile/home";
    }

    public static View e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1ed25ea8", new Object[]{context});
        }
        f(context);
        igw.a(f31887a);
        return f31887a;
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ce7056", new Object[]{context});
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (f31887a == null) {
            synchronized (y70.class) {
                try {
                    if (f31887a == null) {
                        fsw.h(AceMultiPortBridge.PLUGIN_NAME, AceMultiPortBridge.class);
                        f31887a = new WVUCWebView(applicationContext);
                        f31887a.setWebViewClient(new a(applicationContext));
                        f31887a.loadUrl(d());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[0]);
        } else if (f31887a != null) {
            f31887a.loadUrl(d());
        }
    }

    public static void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39487f4", new Object[]{str, str2});
        } else if (f31887a == null || !d) {
            b.add(bpl.a(str, str2));
        } else {
            c.postDelayed(new b(str, str2), 600L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/ace/AceGlobalViewHolder$1");
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            y70.a(true);
            while (!y70.b().isEmpty()) {
                bpl bplVar = (bpl) y70.b().pollFirst();
                String str2 = (String) bplVar.f16534a;
                String str3 = (String) bplVar.b;
                c4p.D("[Ace]", "send pending msg, " + str2 + ":" + str3, new Object[0]);
                WVStandardEventCenter.postNotificationToJS(y70.c(), str2, str3);
            }
        }
    }
}
