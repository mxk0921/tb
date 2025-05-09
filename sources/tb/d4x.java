package tb;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import anetwork.channel.download.DownloadManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.ut.share.business.ShareBusiness;
import tb.a0m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d4x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SHARE_PANEL = "saveWeexFinish";
    public static final String KEY_SHARE_PANEL_JS = "shareFile.js";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f17580a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements a0m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17581a;

        public a(Context context) {
            this.f17581a = context;
        }

        @Override // tb.a0m.a
        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ba42d9de", new Object[]{this, str})).booleanValue();
            }
            if (ContextCompat.checkSelfPermission(this.f17581a, str) == 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.d4x.e
        public void onFail(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                return;
            }
            d4x.f17580a = false;
            new StringBuilder("verifyStoragePermissionsAndDownloadAsync 3 onFail isDownLoading=").append(d4x.f17580a);
        }

        @Override // tb.d4x.e
        public void onSuccess(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                return;
            }
            d4x.f17580a = false;
            new StringBuilder("verifyStoragePermissionsAndDownloadAsync 3 onSuccess isDownLoading=").append(d4x.f17580a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.d4x.e
        public void onFail(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                return;
            }
            d4x.f17580a = false;
            new StringBuilder("verifyStoragePermissionsAndDownloadAsync 3-1 onFail isDownLoading=").append(d4x.f17580a);
        }

        @Override // tb.d4x.e
        public void onSuccess(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                return;
            }
            d4x.f17580a = false;
            new StringBuilder("verifyStoragePermissionsAndDownloadAsync 3-1 onSuccess isDownLoading=").append(d4x.f17580a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d implements DownloadManager.DownloadListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17582a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ e d;

        public d(Context context, String str, boolean z, e eVar) {
            this.f17582a = context;
            this.b = str;
            this.c = z;
            this.d = eVar;
        }

        @Override // anetwork.channel.download.DownloadManager.DownloadListener
        public void onFail(int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a94ab7ce", new Object[]{this, new Integer(i), new Integer(i2), str});
                return;
            }
            Thread.currentThread().getName();
            d4x.a(this.c);
            this.d.onFail(i, str);
        }

        @Override // anetwork.channel.download.DownloadManager.DownloadListener
        public void onProgress(int i, long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0712230", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
            } else {
                new StringBuilder("downloadFileCallBack onProgress ").append(Thread.currentThread().getName());
            }
        }

        @Override // anetwork.channel.download.DownloadManager.DownloadListener
        public void onSuccess(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                return;
            }
            Thread.currentThread().getName();
            kwr.g(this.f17582a, this.b, "true");
            if (this.c) {
                ShareBusiness.sShareUTArgs.put(ShareBusiness.WEEX_LOAD_END_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
                oj8.d().b();
                fwr.b("TIMECOST", "weex_load_end: " + (System.currentTimeMillis() - ShareBusiness.sShareStartTime));
            }
            this.d.onSuccess(i, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
        void onFail(int i, String str);

        void onSuccess(int i, String str);
    }

    static {
        t2o.a(667942914);
    }

    public static /* synthetic */ void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddeb9a3d", new Object[]{new Boolean(z)});
        } else {
            d(z);
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("548371e3", new Object[]{context})).booleanValue();
        }
        return a0m.b(new a(context));
    }

    public static void c(Context context, String str, String str2, String str3, boolean z, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e00c95", new Object[]{context, str, str2, str3, new Boolean(z), eVar});
            return;
        }
        if (TextUtils.isEmpty(str) || eVar == null) {
            eVar.onFail(-1, "");
        }
        if (!str.contains("wh_ttid=native")) {
            str = str.concat("&wh_ttid=native");
        }
        kwr.g(context, str3, "false");
        DownloadManager.getInstance().enqueue(str, ShareBizAdapter.getInstance().getAppEnv().getApplication().getApplicationContext().getFilesDir().getAbsolutePath(), str2, new d(context, str3, z, eVar));
    }

    public static void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18381e02", new Object[]{new Boolean(z)});
        } else if (z) {
            ShareBusiness.sShareUTArgs.put(ShareBusiness.WEEX_LOAD_END_KEY, (Object) (-1L));
            oj8.d().b();
            fwr.b("TIMECOST", "weex_load_end: -1");
        }
    }

    public static void e(Context context, String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c2a62b4", new Object[]{context, str, str2, str3, new Boolean(z)});
            return;
        }
        try {
            if (!f17580a) {
                f17580a = true;
                if (kip.y()) {
                    c(context, str, str2, str3, z, new b());
                }
                if (b(context)) {
                    c(context, str, str2, str3, z, new c());
                    return;
                }
                d(z);
                f17580a = false;
            }
        } catch (Throwable unused) {
            f17580a = false;
        }
    }
}
