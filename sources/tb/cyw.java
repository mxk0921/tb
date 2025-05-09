package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import anetwork.channel.download.DownloadManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.adapter.biz.plugins.watermask.DownloadDialogFragment;
import com.taobao.tao.sharepanel.weex.WeexSharePanel;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.blf;
import tb.xjp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cyw implements xjp.b, mbe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RATIO_ANCHOR_MAP_KEY = "ratioAnchorMap";
    public static final String RATIO_POSITION_MAP_KEY = "ratioPositionMap";
    public static final String RATIO_SCALE_MAP_KEY = "ratioScaleMap";

    /* renamed from: a  reason: collision with root package name */
    public String f17443a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public Map<String, String> h;
    public int i;
    public int j;
    public int k;
    public int l;
    public final DownloadManager m = DownloadManager.getInstance();
    public wcw n;
    public WeakReference<DownloadDialogFragment> o;
    public Handler p;
    public String q;
    public String r;
    public Bitmap s;
    public long t;
    public boolean u;
    public boolean v;
    public String w;
    public String x;
    public long y;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements blf.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.cyw$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0896a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0896a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                cyw.h(cyw.this);
                p0u.a(Globals.getApplication(), Localization.q(R.string.taobao_app_1010_1_18154));
            }
        }

        public a() {
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8df0a16c", new Object[]{this, str});
                return;
            }
            String f = cyw.f(cyw.this);
            TBS.Ext.commitEvent("Page_Share", 19999, "videodownload", wzi.DOWNLOAD_SUCCESS, f, "bizId=" + cyw.g(cyw.this) + ",duration=" + (SystemClock.elapsedRealtime() - cyw.j(cyw.this)));
            Application application = Globals.getApplication();
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            application.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse(sb.toString())));
            if (cyw.k(cyw.this)) {
                oj8.d().c("TBWeexShare.guangVideoDownloadComplete", new JSONObject());
            } else if (cyw.l(cyw.this) != null) {
                cyw.l(cyw.this).post(new RunnableC0896a());
            }
            cyw.this.cancel(false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(cyw cywVar) {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() != null) {
                cyw.b(cyw.this, succPhenixEvent.getDrawable().getBitmap());
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements DownloadManager.DownloadListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // anetwork.channel.download.DownloadManager.DownloadListener
            public void onFail(int i, int i2, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a94ab7ce", new Object[]{this, new Integer(i), new Integer(i2), str});
                    return;
                }
                cyw cywVar = cyw.this;
                cyw.p(cywVar, i2 + "|" + str);
            }

            @Override // anetwork.channel.download.DownloadManager.DownloadListener
            public void onProgress(int i, long j, long j2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d0712230", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
                    return;
                }
                int i2 = (int) ((((float) j) * 100.0f) / ((float) j2));
                cyw.r(cyw.this, i2 / 2);
                int q = (int) ((cyw.q(cyw.this) + cyw.s(cyw.this)) * 0.1f);
                cyw cywVar = cyw.this;
                if (!cyw.u(cywVar)) {
                    i2 = q;
                }
                cyw.v(cywVar, i2);
            }

            @Override // anetwork.channel.download.DownloadManager.DownloadListener
            public void onSuccess(int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                    return;
                }
                cyw.n(cyw.this, str);
                cyw.o(cyw.this);
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            cyw cywVar = cyw.this;
            cyw.d(cywVar, cyw.c(cywVar).enqueue(cyw.m(cyw.this), SystemClock.elapsedRealtime() + "_share_video_temp.mp4", new a()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cyw.p(cyw.this, "PermissionDenied");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements DownloadManager.DownloadListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // anetwork.channel.download.DownloadManager.DownloadListener
            public void onFail(int i, int i2, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a94ab7ce", new Object[]{this, new Integer(i), new Integer(i2), str});
                    return;
                }
                cyw cywVar = cyw.this;
                cyw.p(cywVar, i2 + "|" + str);
            }

            @Override // anetwork.channel.download.DownloadManager.DownloadListener
            public void onProgress(int i, long j, long j2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d0712230", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
                    return;
                }
                int i2 = (int) ((((float) j) * 100.0f) / ((float) j2));
                cyw.r(cyw.this, i2 / 2);
                int q = (int) ((cyw.q(cyw.this) + cyw.s(cyw.this)) * 0.1f);
                cyw cywVar = cyw.this;
                if (!cyw.u(cywVar)) {
                    i2 = q;
                }
                cyw.v(cywVar, i2);
            }

            @Override // anetwork.channel.download.DownloadManager.DownloadListener
            public void onSuccess(int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                    return;
                }
                cyw.n(cyw.this, str);
                cyw.o(cyw.this);
            }
        }

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                cyw cywVar = cyw.this;
                cyw.d(cywVar, cyw.c(cywVar).enqueue(cyw.m(cyw.this), SystemClock.elapsedRealtime() + "_share_video_temp.mp4", new a()));
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements DownloadManager.DownloadListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // anetwork.channel.download.DownloadManager.DownloadListener
        public void onFail(int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a94ab7ce", new Object[]{this, new Integer(i), new Integer(i2), str});
                return;
            }
            cyw cywVar = cyw.this;
            cyw.p(cywVar, i2 + "|" + str);
        }

        @Override // anetwork.channel.download.DownloadManager.DownloadListener
        public void onProgress(int i, long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0712230", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
                return;
            }
            cyw.t(cyw.this, (int) ((((((float) j) * 1.0f) / ((float) j2)) * 100.0f) / 2.0f));
            cyw.v(cyw.this, (int) ((cyw.q(cyw.this) + cyw.s(cyw.this)) * 0.1f));
        }

        @Override // anetwork.channel.download.DownloadManager.DownloadListener
        public void onSuccess(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                return;
            }
            String str2 = Globals.getApplication().getCacheDir().getAbsolutePath() + "/share_video_res";
            if (blf.g(str, str2)) {
                cyw.e(cyw.this, str2);
                cyw.o(cyw.this);
                blf.d(str);
                return;
            }
            cyw.p(cyw.this, "unzipFile err");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String f = cyw.f(cyw.this);
            TBS.Ext.commitEvent("Page_Share", 19999, "videodownload", "downloadCancel", f, "bizId=" + cyw.g(cyw.this));
            String f2 = cyw.f(cyw.this);
            TBS.Ext.commitEvent("Page_Share", 19999, "videodownload", "downloadFail", f2, "bizId=" + cyw.g(cyw.this) + ",errorMsg=cancelByUser");
            cyw.h(cyw.this);
            cyw.this.cancel(true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17454a;

        public i(String str) {
            this.f17454a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            cyw.h(cyw.this);
            cyw.this.cancel(false);
            fwr.b("WaterVideoDownloadPlugin", Localization.q(R.string.taobao_app_1010_1_18152) + this.f17454a);
            String f = cyw.f(cyw.this);
            TBS.Ext.commitEvent("Page_Share", 19999, "videodownload", "downloadFail", f, "bizId=" + cyw.g(cyw.this) + ",errorMsg=" + this.f17454a);
            p0u.a(Globals.getApplication(), Localization.q(R.string.taobao_app_1010_1_18150));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f17455a;

        public j(int i) {
            this.f17455a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadDialogFragment downloadDialogFragment;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (cyw.i(cyw.this) == null) {
                downloadDialogFragment = null;
            } else {
                downloadDialogFragment = (DownloadDialogFragment) cyw.i(cyw.this).get();
            }
            if (downloadDialogFragment != null) {
                downloadDialogFragment.s2(this.f17455a);
            }
        }
    }

    static {
        t2o.a(793772084);
        t2o.a(667942959);
        t2o.a(793772099);
    }

    public static /* synthetic */ Bitmap b(cyw cywVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4631ccae", new Object[]{cywVar, bitmap});
        }
        cywVar.s = bitmap;
        return bitmap;
    }

    public static /* synthetic */ DownloadManager c(cyw cywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DownloadManager) ipChange.ipc$dispatch("a269ef6", new Object[]{cywVar});
        }
        return cywVar.m;
    }

    public static /* synthetic */ int d(cyw cywVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ba81c19", new Object[]{cywVar, new Integer(i2)})).intValue();
        }
        cywVar.i = i2;
        return i2;
    }

    public static /* synthetic */ String e(cyw cywVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("406371a8", new Object[]{cywVar, str});
        }
        cywVar.r = str;
        return str;
    }

    public static /* synthetic */ String f(cyw cywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9aa968b1", new Object[]{cywVar});
        }
        return cywVar.w;
    }

    public static /* synthetic */ String g(cyw cywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5295d632", new Object[]{cywVar});
        }
        return cywVar.x;
    }

    public static /* synthetic */ void h(cyw cywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920bc8d", new Object[]{cywVar});
        } else {
            cywVar.C();
        }
    }

    public static /* synthetic */ WeakReference i(cyw cywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("96c8cbba", new Object[]{cywVar});
        }
        return cywVar.o;
    }

    public static /* synthetic */ long j(cyw cywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41fcb53f", new Object[]{cywVar})).longValue();
        }
        return cywVar.t;
    }

    public static /* synthetic */ boolean k(cyw cywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de6ab1ae", new Object[]{cywVar})).booleanValue();
        }
        return cywVar.v;
    }

    public static /* synthetic */ Handler l(cyw cywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4f60ca1d", new Object[]{cywVar});
        }
        return cywVar.p;
    }

    public static /* synthetic */ String m(cyw cywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa9db1c2", new Object[]{cywVar});
        }
        return cywVar.f17443a;
    }

    public static /* synthetic */ String n(cyw cywVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d054d6fb", new Object[]{cywVar, str});
        }
        cywVar.q = str;
        return str;
    }

    public static /* synthetic */ void o(cyw cywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e80b5c", new Object[]{cywVar});
        } else {
            cywVar.B();
        }
    }

    public static /* synthetic */ void p(cyw cywVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cebcd8c5", new Object[]{cywVar, str});
        } else {
            cywVar.w(str);
        }
    }

    public static /* synthetic */ int q(cyw cywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6dc4040d", new Object[]{cywVar})).intValue();
        }
        return cywVar.k;
    }

    public static /* synthetic */ int r(cyw cywVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23fe99e", new Object[]{cywVar, new Integer(i2)})).intValue();
        }
        cywVar.k = i2;
        return i2;
    }

    public static /* synthetic */ int s(cyw cywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a32006c", new Object[]{cywVar})).intValue();
        }
        return cywVar.l;
    }

    public static /* synthetic */ int t(cyw cywVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f391791f", new Object[]{cywVar, new Integer(i2)})).intValue();
        }
        cywVar.l = i2;
        return i2;
    }

    public static /* synthetic */ boolean u(cyw cywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a69ffcdc", new Object[]{cywVar})).booleanValue();
        }
        return cywVar.u;
    }

    public static /* synthetic */ void v(cyw cywVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb1a0ac", new Object[]{cywVar, new Integer(i2)});
        } else {
            cywVar.H(i2);
        }
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4d2b842", new Object[]{this});
        } else {
            AsyncTask.execute(new f());
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d2da2e", new Object[]{this});
        } else if (this.u && yxw.g(this.q)) {
            F(this.q);
        } else if (!this.u && yxw.g(this.q) && yxw.g(this.r)) {
            try {
                Activity topActivity = ShareBizAdapter.getInstance().getAppEnv().getTopActivity();
                wcw wcwVar = new wcw();
                this.n = wcwVar;
                wcwVar.g(topActivity, this.q, this.d, this.s, this.f, this.r, this.h, this.g, this);
            } catch (Throwable th) {
                w("exportVideo err " + th.getMessage());
            }
        }
    }

    public final void C() {
        DownloadDialogFragment downloadDialogFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31fa2537", new Object[]{this});
            return;
        }
        WeakReference<DownloadDialogFragment> weakReference = this.o;
        if (weakReference == null) {
            downloadDialogFragment = null;
        } else {
            downloadDialogFragment = weakReference.get();
        }
        if (downloadDialogFragment != null) {
            downloadDialogFragment.dismissAllowingStateLoss();
        }
    }

    public void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94045c6f", new Object[]{this, str});
        } else {
            w(str);
        }
    }

    public void E(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2efbf40f", new Object[]{this, new Integer(i2)});
        } else {
            H(Math.min(((int) (i2 * 0.9f)) + 10, 99));
        }
    }

    public void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd59a914", new Object[]{this, str});
            return;
        }
        H(100);
        blf.e(Globals.getApplication(), str, new a());
    }

    public final void H(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28975706", new Object[]{this, new Integer(i2)});
        } else if (this.p != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!this.v || currentTimeMillis - this.y <= 300) {
                this.p.post(new j(i2));
                return;
            }
            this.y = currentTimeMillis;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("percentage", (Object) Float.valueOf(i2 / 100.0f));
            jSONObject.put("videoFileSize", (Object) this.b);
            oj8.d().c("TBWeexShare.guangVideoDownloadPercentage", jSONObject);
        }
    }

    @Override // tb.xjp.b
    public void cancel(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f7d8cf3", new Object[]{this, new Boolean(z)});
            return;
        }
        this.p = null;
        blf.d(this.q, this.r);
        int i2 = this.i;
        if (i2 > 0) {
            this.m.cancel(i2);
            this.i = 0;
        }
        int i3 = this.j;
        if (i3 > 0) {
            this.m.cancel(i3);
            this.j = 0;
        }
        wcw wcwVar = this.n;
        if (wcwVar != null) {
            wcwVar.c();
            this.n.d();
            this.n = null;
        }
        if (this.v && z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", (Object) "cancel");
            jSONObject.put("errorCode", (Object) 100);
            oj8.d().c("TBWeexShare.guangVideoDownloadComplete", jSONObject);
        }
    }

    @Override // tb.xjp.b
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return "videodownload";
    }

    @Override // tb.xjp.b
    public void onEvent(ma4 ma4Var) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611b4fe0", new Object[]{this, ma4Var});
        } else if (a(ma4Var)) {
            TBShareContent a2 = ma4Var.a().a();
            if (!(a2 == null || (map = a2.extraParams) == null)) {
                this.v = TextUtils.equals("true", map.remove("isWeexDownload"));
            }
            this.t = SystemClock.elapsedRealtime();
            G();
            if (!this.g) {
                x();
            }
            y();
            if (a0m.c()) {
                A();
            } else {
                z();
            }
            if (a2 != null) {
                this.x = a2.businessId;
            }
            String str = this.w;
            TBS.Ext.commitEvent("Page_Share", 19999, "videodownload", "downloadStart", str, "bizId=" + this.x);
        }
    }

    public final void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd4b93b6", new Object[]{this, str});
        } else if (this.v) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", (Object) str);
            jSONObject.put("errorCode", (Object) 0);
            oj8.d().c("TBWeexShare.guangVideoDownloadComplete", jSONObject);
            cancel(false);
        } else {
            Handler handler = this.p;
            if (handler != null) {
                handler.post(new i(str));
            }
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfab22", new Object[]{this});
        } else {
            s0m.B().T(this.e).bitmapProcessors(new iy4()).succListener(new c()).failListener(new b(this)).fetch();
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcca6910", new Object[]{this});
        } else if (!this.u) {
            this.j = this.m.enqueue(this.c, SystemClock.elapsedRealtime() + "_share_video_res.zip", new g());
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65d53da", new Object[]{this});
        } else {
            com.taobao.runtimepermission.a.c(Globals.getApplication(), a0m.a()).t("tb_share").x(true).w(Localization.q(R.string.taobao_app_1010_1_18155)).z(new e()).A(new d()).m();
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5646ffb2", new Object[]{this});
            return;
        }
        this.p = new Handler(Looper.getMainLooper());
        if (!this.v) {
            String format = String.format(Locale.CHINA, "%.2f", Double.valueOf((Long.parseLong(this.b) / 1024.0d) / 1024.0d));
            Activity topActivity = ShareBizAdapter.getInstance().getAppEnv().getTopActivity();
            if (topActivity instanceof FragmentActivity) {
                DownloadDialogFragment downloadDialogFragment = new DownloadDialogFragment();
                downloadDialogFragment.r2(new h());
                downloadDialogFragment.show(((FragmentActivity) topActivity).getSupportFragmentManager(), "share_video_download_loading");
                downloadDialogFragment.u2(Localization.q(R.string.taobao_app_1010_1_18160) + format + Localization.q(R.string.taobao_app_1010_1_18158));
                this.o = new WeakReference<>(downloadDialogFragment);
            }
            WeexSharePanel weexSharePanel = (WeexSharePanel) ShareBizAdapter.getInstance().getShareEngine().getCurSharePanel();
            if (weexSharePanel != null && weexSharePanel.getPanel() != null) {
                weexSharePanel.getPanel().b();
            }
        }
    }

    @Override // tb.xjp.b
    public boolean a(ma4 ma4Var) {
        TBShareContent a2;
        Map<String, String> map;
        Map<String, Object> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd9b9ed2", new Object[]{this, ma4Var})).booleanValue();
        }
        if (!mbl.a() || ma4Var == null || ma4Var.a() == null || (a2 = ma4Var.a().a()) == null || (map = a2.extraParams) == null) {
            return false;
        }
        if (!TextUtils.isEmpty(map.get("waterMaskVideoPath"))) {
            this.f17443a = a2.extraParams.get("waterMaskVideoPath");
            this.u = true;
            this.w = "downloadVideoUrl";
        } else {
            this.f17443a = a2.extraParams.get("videoPath");
            this.u = false;
            this.w = "marvelExportVideo";
        }
        this.b = a2.extraParams.get("videoSize");
        HashMap hashMap = new HashMap();
        this.h = hashMap;
        hashMap.put(RATIO_SCALE_MAP_KEY, a2.extraParams.get("waterMarkRatioScaleMap"));
        ((HashMap) this.h).put(RATIO_POSITION_MAP_KEY, a2.extraParams.get("waterMarkRatioPositionMap"));
        ((HashMap) this.h).put(RATIO_ANCHOR_MAP_KEY, a2.extraParams.get("waterMarkRatioAnchorMap"));
        boolean equals = TextUtils.equals("isAddWaterMaskOnly", a2.extraParams.get("videoTemplateScheme"));
        this.g = equals;
        if (equals) {
            this.c = a2.extraParams.get("videoResZipUrl");
            return !TextUtils.isEmpty(this.f17443a) && !TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(this.c);
        }
        OrangeConfig instance = OrangeConfig.getInstance();
        this.c = instance.getConfig("android_share_bizconfig", a2.businessId + "_videoResZipUrl", "https://wantu-1lh1-videotool-hz.oss-cn-hangzhou.aliyuncs.com/material/onion/watermark_gg.zip");
        this.d = a2.extraParams.get("userId");
        String str = a2.extraParams.get("userNick");
        this.f = str;
        if (TextUtils.isEmpty(str) && (map2 = a2.templateParams) != null && map2.containsKey("userNick")) {
            this.f = (String) a2.templateParams.get("userNick");
        }
        this.e = a2.extraParams.get("avatarPath");
        return !TextUtils.isEmpty(this.f17443a) && !TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(this.f) && !TextUtils.isEmpty(this.e);
    }
}
