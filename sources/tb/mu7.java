package tb;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.download.CheckAppStatusJsBridge;
import com.taobao.wireless.link.download.DownLoadJsBridge;
import com.taobao.wireless.link.download.LinkAppJsBridge;
import com.taobao.wireless.link.download.LinkDownloadItem;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mu7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, LinkDownloadItem> f24307a;
    public String b;
    public Context c;
    public hqg d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                mu7.this.e();
            } catch (Throwable th) {
                irg.c("DownloadCenter", th.getMessage(), th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24309a;

        public b(String str) {
            this.f24309a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                mu7.this.d.b(this.f24309a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24310a;

        public c(String str) {
            this.f24310a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                mu7.this.d.b(this.f24310a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final cqg f24312a;
        public final LinkDownloadItem b;

        static {
            t2o.a(1030750273);
        }

        public e(cqg cqgVar, LinkDownloadItem linkDownloadItem) {
            this.f24312a = cqgVar;
            this.b = linkDownloadItem;
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            irg.a("link_tag", "DownloadCenter === onDownloadError === 下载失败errorCode=" + i + " msg=" + str2);
            cqg cqgVar = this.f24312a;
            if (cqgVar != null) {
                ((dqg) cqgVar).b(str, i, str2);
            }
            mu7.this.d.b(this.b.packageName);
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            irg.a("link_tag", "DownloadCenter === onDownloadFinish === url：" + str + "  filePath=" + str2);
            cqg cqgVar = this.f24312a;
            if (cqgVar != null) {
                ((dqg) cqgVar).a();
            }
            esg.c(esg.ARG1_FINISH_APK_DOWNLOAD, this.b);
            mu7.a(mu7.this, new File(str2), this.b);
            mu7.this.d.b(this.b.packageName);
            LinkDownloadItem linkDownloadItem = this.b;
            if (linkDownloadItem.visibilityNotification) {
                linkDownloadItem.filePath = str2;
                mu7.this.d.g(linkDownloadItem);
            }
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            irg.a("link_tag", "DownloadCenter === onDownloadProgress === 下载进度：" + i + f7l.MOD);
            cqg cqgVar = this.f24312a;
            if (cqgVar != null) {
                ((dqg) cqgVar).d(i);
            }
            LinkDownloadItem linkDownloadItem = this.b;
            if (linkDownloadItem.visibilityNotification) {
                mu7.this.d.f(linkDownloadItem, i);
            }
        }

        @Override // tb.tu7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
                return;
            }
            irg.a("link_tag", "DownloadCenter === onDownloadStateChange === 是否正在下载：" + z);
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            irg.a("link_tag", "DownloadCenter === onFinish === 所有的下载请求都完成=" + z);
            cqg cqgVar = this.f24312a;
            if (cqgVar != null) {
                ((dqg) cqgVar).c(z);
            }
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
                return;
            }
            irg.a("link_tag", "DownloadCenter === onNetworkLimit === 网络受限：" + uplVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final mu7 f24313a = new mu7(null);

        static {
            t2o.a(1030750274);
        }

        public static /* synthetic */ mu7 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mu7) ipChange.ipc$dispatch("bfc89b21", new Object[0]);
            }
            return f24313a;
        }
    }

    static {
        t2o.a(1030750268);
    }

    public /* synthetic */ mu7(a aVar) {
        this();
    }

    public static /* synthetic */ void a(mu7 mu7Var, File file, LinkDownloadItem linkDownloadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ae3a1c", new Object[]{mu7Var, file, linkDownloadItem});
        } else {
            mu7Var.j(file, linkDownloadItem);
        }
    }

    public static /* synthetic */ String b(mu7 mu7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fee0c484", new Object[]{mu7Var});
        }
        return mu7Var.b;
    }

    public static String h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1516638f", new Object[]{context});
        }
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        return externalCacheDir.getAbsolutePath();
    }

    public static mu7 k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mu7) ipChange.ipc$dispatch("26ffbe9c", new Object[0]);
        }
        return f.a();
    }

    public void c(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17f58aa4", new Object[]{this, new Integer(i), str});
            return;
        }
        irg.a("link_tag", "DownloadCenter === cancelDownLoad === 取消下载：" + i);
        rv7.e().a(i);
        if (!TextUtils.isEmpty(str)) {
            LinkDownloadItem g = g(str);
            if (g != null) {
                esg.c(esg.ARG1_CANCEL_APK_DOWNLOAD, g);
            }
            mr4.b().a().postDelayed(new b(str), 1000L);
        }
    }

    public void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb2f3c1a", new Object[]{this, context, str});
        } else {
            rqg.b.a(new d(context, str));
        }
    }

    public final int f(LinkDownloadItem linkDownloadItem, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a1bdbb2", new Object[]{this, linkDownloadItem, eVar})).intValue();
        }
        zu7 zu7Var = new zu7();
        upl uplVar = zu7Var.b;
        uplVar.f29547a = "1111";
        uplVar.g = this.b;
        irg.a("link_tag", "DownloadCenter === startDownload === 下载参数：" + zu7Var.b);
        onf onfVar = new onf();
        onfVar.f25507a = linkDownloadItem.downloadUrl;
        onfVar.d = linkDownloadItem.fileName;
        zu7Var.f33016a.add(onfVar);
        int b2 = rv7.e().b(zu7Var, eVar);
        irg.a("link_tag", "DownloadCenter === startDownload === 开始下载mTaskId=" + b2);
        return b2;
    }

    public LinkDownloadItem g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkDownloadItem) ipChange.ipc$dispatch("bdf1fc67", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LinkDownloadItem linkDownloadItem = this.f24307a.get(str);
        if (linkDownloadItem == null) {
            cno b2 = cno.b(this.c);
            linkDownloadItem = (LinkDownloadItem) b2.a("download_" + str, new LinkDownloadItem());
        }
        if (linkDownloadItem == null || !TextUtils.isEmpty(linkDownloadItem.packageName)) {
            return linkDownloadItem;
        }
        return null;
    }

    public void i(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
        } else if (application == null) {
            irg.a("link_tag", "DownloadCenter === init === application为空，无法初始化下载组件");
        } else {
            this.c = application;
            this.b = h(application) + "/linkapkdownload/";
            fsw.h(DownLoadJsBridge.CLASSNAME_ACTION_DOWNLOAD, DownLoadJsBridge.class);
            fsw.h(CheckAppStatusJsBridge.CLASSNAME_CHECK_APP_STATUS, CheckAppStatusJsBridge.class);
            fsw.h(LinkAppJsBridge.CLASSNAME_APP, LinkAppJsBridge.class);
            this.d = new hqg(this.c);
            irg.a("link_tag", "DownloadCenter === init === 初始化下载组件完成");
            rrg.e();
            rqg.b.a(new a());
        }
    }

    public void l(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8977a3a8", new Object[]{this, new Integer(i), str});
            return;
        }
        irg.a("link_tag", "DownloadCenter === pauseDownLoad === 暂停下载：" + i);
        rv7.e().i(i);
        if (!TextUtils.isEmpty(str)) {
            LinkDownloadItem g = g(str);
            if (g != null) {
                esg.c(esg.ARG1_PAUSE_APK_DOWNLOAD, g);
            }
            mr4.b().a().postDelayed(new c(str), 1000L);
        }
    }

    public void m(LinkDownloadItem linkDownloadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14f32752", new Object[]{this, linkDownloadItem});
            return;
        }
        ConcurrentHashMap<String, LinkDownloadItem> concurrentHashMap = this.f24307a;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(linkDownloadItem.packageName, linkDownloadItem);
        }
        cno b2 = cno.b(this.c);
        b2.d("download_" + linkDownloadItem.packageName, linkDownloadItem);
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc7b4d07", new Object[]{this, str});
            return;
        }
        ConcurrentHashMap<String, LinkDownloadItem> concurrentHashMap = this.f24307a;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(str);
        }
        cno b2 = cno.b(this.c);
        b2.f("download_" + str);
    }

    public void o(int i, String str) {
        LinkDownloadItem g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ab7a91", new Object[]{this, new Integer(i), str});
            return;
        }
        irg.a("link_tag", "DownloadCenter === resumeDownLoad === 恢复下载：" + i);
        rv7.e().h(i);
        if (!TextUtils.isEmpty(str) && (g = g(str)) != null) {
            esg.c(esg.ARG1_RESUME_APK_DOWNLOAD, g);
        }
    }

    public int p(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, cqg cqgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("641803ad", new Object[]{this, str, str2, str3, str4, str5, str6, new Boolean(z), str7, cqgVar})).intValue();
        }
        e eVar = null;
        esg.b(esg.ARG1_START_APK_DOWNLOAD, str, str4, null);
        if (TextUtils.isEmpty(str4)) {
            irg.a("link_tag", "DownloadCenter === startDownload === 下载URL为空，不下载");
            return -1;
        }
        irg.a("link_tag", "DownloadCenter === startDownload === 开始下载URL=" + str4);
        LinkDownloadItem linkDownloadItem = new LinkDownloadItem();
        linkDownloadItem.businessId = str;
        linkDownloadItem.title = str2;
        linkDownloadItem.packageName = str3;
        linkDownloadItem.downloadUrl = str4;
        linkDownloadItem.fileName = str3 + jcq.APK_EXTENSION;
        linkDownloadItem.fileMd5 = str6;
        linkDownloadItem.visibilityNotification = z;
        linkDownloadItem.notificationUrl = str7;
        m(linkDownloadItem);
        if (cqgVar != null) {
            eVar = new e(cqgVar, linkDownloadItem);
        }
        return f(linkDownloadItem, eVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24311a;
        public final /* synthetic */ String b;

        public d(Context context, String str) {
            this.f24311a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f24311a != null) {
                LinkDownloadItem g = mu7.this.g(this.b);
                if (g == null || g.downloadUrl == null) {
                    irg.a("link_tag", "DownloadCenter === deleteApk === 存储的下载信息为空，无法删除apk");
                    return;
                }
                mu7.this.d.b(this.b);
                File[] listFiles = new File(mu7.b(mu7.this)).listFiles();
                if (listFiles == null || listFiles.length == 0) {
                    irg.a("link_tag", "DownloadCenter === deleteApk === 下载目录无文件，无需删除apk");
                    return;
                }
                for (File file : listFiles) {
                    if (TextUtils.equals(file.getName(), g.fileName)) {
                        file.delete();
                        irg.a("link_tag", "DownloadCenter === deleteApk === 删除文件：" + file.getName());
                        esg.c(esg.ARG1_DELETE_APK_DOWNLOAD, g);
                        return;
                    }
                }
            }
        }
    }

    public mu7() {
        this.f24307a = new ConcurrentHashMap<>();
    }

    public final void j(File file, LinkDownloadItem linkDownloadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5d2c70e", new Object[]{this, file, linkDownloadItem});
        } else if (file == null || !file.getPath().endsWith(jcq.APK_EXTENSION)) {
            irg.a("link_tag", "DownloadCenter === installApp === 安装APP异常，找不到");
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (Build.VERSION.SDK_INT >= 24) {
                irg.a("link_tag", "DownloadCenter === installApp === 安装APP，7.0以上");
                Uri uriForFile = FileProvider.getUriForFile(this.c, "com.taobao.taobao.update.provider", file);
                intent.addFlags(1);
                intent.addFlags(268435456);
                intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            } else {
                irg.a("link_tag", "DownloadCenter === installApp === 安装APP，7.0以下");
                intent.addFlags(268435456);
                intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
            }
            this.c.startActivity(intent);
            esg.c(esg.ARG1_INSTALL_APK_DOWNLOAD, linkDownloadItem);
        }
    }

    public void e() {
        String name;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3655391d", new Object[]{this});
            return;
        }
        File file = new File(this.b);
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            irg.a("DownloadCenter", "No files in the link download path.");
            return;
        }
        String g = aqg.g(this.c, "downloadApkFileExpirationTime", null);
        long j = 86400000;
        if (!TextUtils.isEmpty(g)) {
            try {
                long parseLong = Long.parseLong(g);
                if (parseLong > 0) {
                    j = parseLong;
                }
            } catch (Exception unused) {
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        int length = listFiles.length;
        for (int i2 = 0; i2 < length; i2 += i) {
            File file2 = listFiles[i2];
            try {
                name = file2.getName();
            } catch (Exception unused2) {
                irg.b("DownloadCenter", "Failed to delete expired file(" + file2.toString() + ").");
            }
            if (name.endsWith(jcq.APK_EXTENSION)) {
                if (currentTimeMillis - file2.lastModified() > j) {
                    file2.delete();
                    irg.a("link_tag", "DownloadCenter === checkAndDelete === 超过最大存在时间(" + j + ")，删除文件：" + file2.getName());
                    String substring = name.substring(0, name.length() + (-4));
                    StringBuilder sb = new StringBuilder();
                    sb.append("packageName === ");
                    sb.append(substring);
                    irg.a("DownloadCenter", sb.toString());
                    n(substring);
                }
                irg.a("link_tag", "DownloadCenter === checkAndDelete === 删除本地下载记录");
                i = 1;
            }
        }
        irg.a("link_tag", "DownloadCenter === checkAndDelete === 完成apk过期文件删除检查");
        File[] listFiles2 = file.listFiles();
        if (listFiles2 != null && listFiles2.length > 0) {
            long j2 = 0;
            for (File file3 : listFiles2) {
                j2 += file3.length();
            }
            rrg.a(j2, listFiles2.length);
        }
    }
}
