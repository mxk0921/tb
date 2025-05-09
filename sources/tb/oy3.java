package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.alibaba.analytics.AnalyticsMgr;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class oy3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ColdLaunch";
    public static boolean d;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f25741a = kotlin.collections.a.j(jpu.a("video", "com.taobao.android.fluid.framework.preload.launcher.VideoColdLaunch"), jpu.a(bps.TABID_INNERLIVE, "com.taobao.android.tab2liveroom.liveroom.LiveRoomRenderInterceptDelegate"));
    public static final Map<String, Boolean> b = new LinkedHashMap();
    public static final Map<String, Boolean> c = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/taobao/android/turbo/coldlaunch/ColdLaunch$Companion$initLinkBack$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* renamed from: tb.oy3$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class RunnableC1022a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f25742a;
            public final /* synthetic */ Uri b;
            public final /* synthetic */ Context c;

            public RunnableC1022a(String str, Uri uri, Context context) {
                this.f25742a = str;
                this.b = uri;
                this.c = context;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Method b = xtn.Companion.b("initLinkBack", Class.forName(this.f25742a), Context.class, Uri.class);
                    if (b != null) {
                        b.invoke(null, this.c, this.b);
                    }
                    tpu.a.b(tpu.Companion, oy3.TAG, "cold launch initLinkBack success", null, 4, null);
                } catch (Throwable th) {
                    tpu.a aVar = tpu.Companion;
                    tpu.a.b(aVar, oy3.TAG, "cold launch initLinkBack failed, error:" + th, null, 4, null);
                }
            }
        }

        static {
            t2o.a(916455468);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final void b(Context context, Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9640e5b7", new Object[]{this, context, uri});
                return;
            }
            ckf.g(context, "context");
            ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            e0o.q();
            for (Map.Entry entry : oy3.a().entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (kov.Companion.d(uri, str, true)) {
                    Boolean bool = Boolean.TRUE;
                    if (!ckf.b((Boolean) oy3.c().get(str), bool)) {
                        oy3.c().put(str, bool);
                        zrt.Companion.c(new RunnableC1022a(str2, uri, context), true);
                    }
                }
            }
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ebf4f55", new Object[]{this});
            } else if (!oy3.d() && e0o.d()) {
                tpu.a.b(tpu.Companion, oy3.TAG, "notifyAnalyticsMgr", null, 4, null);
                AnalyticsMgr.R();
                oy3.e(true);
            }
        }

        @JvmStatic
        public final void d(Context context, Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("226a0e46", new Object[]{this, context, uri});
                return;
            }
            ckf.g(context, "context");
            ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            if (kov.Companion.d(uri, "video", false) || wps.Companion.b()) {
                tpu.a.b(tpu.Companion, oy3.TAG, "warmUp video page", null, 4, null);
                FluidSDK.startWarmUp(context, uri);
            }
        }

        @JvmStatic
        public final void a(Context context, Uri uri) {
            ckf.g(context, "context");
            ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            String path = uri.getPath();
            String queryParameter = uri.getQueryParameter(bps.CONFIG_LAUNCH);
            String queryParameter2 = uri.getQueryParameter("tabid");
            String queryParameter3 = uri.getQueryParameter("extParams");
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, oy3.TAG, "path:" + path + " sLaunch:" + queryParameter + " tabId:" + queryParameter2 + " extParams:" + queryParameter3, null, 4, null);
            if (kov.Companion.b(uri)) {
                e0o.r(queryParameter2, !TextUtils.equals(path, "/guangguang/index.htm"));
            }
            for (Map.Entry entry : oy3.a().entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (kov.Companion.d(uri, str, true)) {
                    Boolean bool = Boolean.TRUE;
                    if (!ckf.b((Boolean) oy3.b().get(str), bool)) {
                        oy3.b().put(str, bool);
                        try {
                            Method b = xtn.Companion.b("init", Class.forName(str2), Context.class, Uri.class, String.class);
                            if (b != null) {
                                b.invoke(null, context, uri, queryParameter3);
                            }
                            tpu.a.b(tpu.Companion, oy3.TAG, "cold launch init success", null, 4, null);
                        } catch (Throwable th) {
                            tpu.a aVar2 = tpu.Companion;
                            tpu.a.b(aVar2, oy3.TAG, "cold launch init failed, error:" + th, null, 4, null);
                        }
                    }
                }
            }
        }
    }

    public static final /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d678d6c2", new Object[0]);
        }
        return f25741a;
    }

    public static final /* synthetic */ Map b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c660765f", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ Map c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ba1a8455", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bdec8ef", new Object[0])).booleanValue();
        }
        return d;
    }

    public static final /* synthetic */ void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7268955", new Object[]{new Boolean(z)});
        } else {
            d = z;
        }
    }

    @JvmStatic
    public static final void f(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15540756", new Object[]{context, uri});
        } else {
            Companion.a(context, uri);
        }
    }

    @JvmStatic
    public static final void g(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9640e5b7", new Object[]{context, uri});
        } else {
            Companion.b(context, uri);
        }
    }

    @JvmStatic
    public static final void h(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226a0e46", new Object[]{context, uri});
        } else {
            Companion.d(context, uri);
        }
    }

    static {
        t2o.a(916455467);
    }
}
