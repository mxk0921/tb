package com.taobao.message.lab.comfrm.util;

import anetwork.channel.download.DownloadManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.FileUtil;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.doh;
import tb.onf;
import tb.rv7;
import tb.t2o;
import tb.tu7;
import tb.upl;
import tb.zu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DownloadUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DownloadUtil";
    private static Map<String, Long> timeStartMap = new HashMap();
    private static Map<String, Long> timeRetryMap = new HashMap();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.message.lab.comfrm.util.DownloadUtil$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class AnonymousClass1 implements DownloadManager.DownloadListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ DownloadCallback val$callback;
        public final /* synthetic */ String val$fileName;
        public final /* synthetic */ String val$url;

        public AnonymousClass1(String str, DownloadCallback downloadCallback, String str2) {
            this.val$url = str;
            this.val$callback = downloadCallback;
            this.val$fileName = str2;
        }

        @Override // anetwork.channel.download.DownloadManager.DownloadListener
        public void onFail(int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a94ab7ce", new Object[]{this, new Integer(i), new Integer(i2), str});
                return;
            }
            Logger.e(DownloadUtil.TAG, this.val$url + "DownloadManager fail cost" + (System.currentTimeMillis() - ((Long) DownloadUtil.access$000().get(this.val$url)).longValue()));
            DownloadCallback downloadCallback = this.val$callback;
            if (downloadCallback != null) {
                downloadCallback.onFinish(this.val$url, null);
            }
            zu7 zu7Var = new zu7();
            zu7Var.b.g = DownloadUtil.access$100("common", "other");
            zu7Var.b.f29547a = "taobao_message";
            onf onfVar = new onf();
            onfVar.f25507a = this.val$url;
            onfVar.d = this.val$fileName + ".tmp";
            zu7Var.f33016a.add(onfVar);
            DownloadUtil.access$200().put(this.val$url, Long.valueOf(System.currentTimeMillis()));
            rv7.e().b(zu7Var, new tu7() { // from class: com.taobao.message.lab.comfrm.util.DownloadUtil.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.tu7
                public void onDownloadError(String str2, int i3, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str2, new Integer(i3), str3});
                        return;
                    }
                    Logger.e(DownloadUtil.TAG, AnonymousClass1.this.val$url + "Downloader fail cost" + (System.currentTimeMillis() - ((Long) DownloadUtil.access$200().get(AnonymousClass1.this.val$url)).longValue()));
                    if (AnonymousClass1.this.val$callback != null) {
                        UIHandler.post(new Runnable() { // from class: com.taobao.message.lab.comfrm.util.DownloadUtil.1.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                AnonymousClass1 r0 = AnonymousClass1.this;
                                r0.val$callback.onFinish(r0.val$url, null);
                            }
                        });
                    }
                }

                @Override // tb.tu7
                public void onDownloadFinish(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str2, str3});
                        return;
                    }
                    DownloadCallback downloadCallback2 = AnonymousClass1.this.val$callback;
                    if (downloadCallback2 != null) {
                        downloadCallback2.onFinish(str2, str3);
                    }
                }

                @Override // tb.tu7
                public void onDownloadProgress(int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i3)});
                    }
                }

                @Override // tb.tu7
                public void onDownloadStateChange(String str2, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str2, new Boolean(z)});
                    }
                }

                @Override // tb.tu7
                public void onFinish(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                    }
                }

                @Override // tb.tu7
                public void onNetworkLimit(int i3, upl uplVar, tu7.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i3), uplVar, aVar});
                    }
                }
            });
        }

        @Override // anetwork.channel.download.DownloadManager.DownloadListener
        public void onProgress(int i, long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0712230", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
            } else if (ApplicationUtil.isDebug()) {
                Logger.d(DownloadUtil.TAG, "pos: " + j + "total: " + j2);
            }
        }

        @Override // anetwork.channel.download.DownloadManager.DownloadListener
        public void onSuccess(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                return;
            }
            synchronized (this) {
                try {
                    Logger.e(DownloadUtil.TAG, this.val$url + "DownloadManager success cost" + (System.currentTimeMillis() - ((Long) DownloadUtil.access$000().get(this.val$url)).longValue()));
                    DownloadCallback downloadCallback = this.val$callback;
                    if (downloadCallback != null) {
                        downloadCallback.onFinish(this.val$url, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface DownloadCallback {
        void onFinish(String str, String str2);
    }

    static {
        t2o.a(537919876);
    }

    private static String URLtoFileName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b57b84be", new Object[]{str});
        }
        String d = doh.d(str);
        if (!"ogg".equals(getUrlExtension(str))) {
            return d;
        }
        return d + ".ogg";
    }

    public static /* synthetic */ Map access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
        }
        return timeStartMap;
    }

    public static /* synthetic */ String access$100(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80990a54", new Object[]{str, str2});
        }
        return getLocalDir(str, str2);
    }

    public static /* synthetic */ Map access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e220286e", new Object[0]);
        }
        return timeRetryMap;
    }

    public static synchronized void download(String str, DownloadCallback downloadCallback) {
        synchronized (DownloadUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cc2bddc", new Object[]{str, downloadCallback});
                return;
            }
            String URLtoFileName = URLtoFileName(str);
            timeStartMap.put(str, Long.valueOf(System.currentTimeMillis()));
            DownloadManager.getInstance().enqueue(str, URLtoFileName, new AnonymousClass1(str, downloadCallback, URLtoFileName));
        }
    }

    private static String getUrlExtension(String str) {
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf083d69", new Object[]{str});
        }
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) > 0 && lastIndexOf < str.length() - 1) {
            return str.substring(lastIndexOf + 1);
        }
        return "";
    }

    private static String getLocalDir(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c39984d", new Object[]{str, str2});
        }
        String diskCacheDir = FileUtil.getDiskCacheDir(ApplicationUtil.getApplication(), "dojo_patch");
        if (str2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(diskCacheDir);
            String str4 = File.separator;
            sb.append(str4);
            sb.append("common");
            sb.append(str4);
            sb.append(doh.d(str).substring(0, 6));
            str3 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(diskCacheDir);
            String str5 = File.separator;
            sb2.append(str5);
            sb2.append(str2);
            sb2.append(str5);
            sb2.append(doh.d(str).substring(0, 6));
            str3 = sb2.toString();
        }
        File file = new File(str3);
        if (!file.exists() && !file.mkdirs() && ApplicationUtil.isDebug()) {
            Logger.d(TAG, "mkdirs failed.");
        }
        return str3;
    }
}
