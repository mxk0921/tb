package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wv7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static wv7 f30954a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f30955a;
        public final /* synthetic */ String b;

        public a(wv7 wv7Var, b bVar, String str) {
            this.f30955a = bVar;
            this.b = str;
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            TLog.logd("BehaviX", "DownloaderManager", "onDownloadError" + i + str2);
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            TLog.logd("BehaviX", "DownloaderManager", "onDownloadFinish" + str2);
            b bVar = this.f30955a;
            if (bVar != null) {
                try {
                    ((NativeDelegate.AnonymousClass23.a) bVar).a(this.b, wv7.f(str2));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            TLog.logd("BehaviX", "DownloaderManager", "onDownloadProgress" + i);
        }

        @Override // tb.tu7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
                return;
            }
            TLog.logd("BehaviX", "DownloaderManager", "onDownloadStateChange" + z);
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            TLog.logd("BehaviX", "DownloaderManager", "onFinish" + z);
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
                return;
            }
            TLog.logd("BehaviX", "DownloaderManager", "onNetworkLimit" + i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
    }

    static {
        t2o.a(404750550);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4a84112", new Object[]{str});
        }
        return c(str, "([^/]+)$");
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39a2fe32", new Object[]{str});
        }
        return c(str, "MD5S_(\\w{32})_MD5E");
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ad6a2b3", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }

    public static wv7 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wv7) ipChange.ipc$dispatch("4ab057f7", new Object[0]);
        }
        if (f30954a == null) {
            synchronized (wv7.class) {
                try {
                    if (f30954a == null) {
                        f30954a = new wv7();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f30954a;
    }

    public static String f(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dd59156", new Object[]{str});
        }
        File file = new File(str);
        if (file.exists()) {
            StringBuilder sb = new StringBuilder();
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                try {
                    int read = fileInputStream.read();
                    if (read != -1) {
                        sb.append((char) read);
                    } else {
                        fileInputStream.close();
                        return sb.toString();
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
        } else {
            throw new IOException("文件不存在: " + str);
        }
    }

    public void d(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fcaabc9", new Object[]{this, str, bVar});
            return;
        }
        String b2 = b(str);
        String a2 = a(str);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(b2) && !TextUtils.isEmpty(a2)) {
            a aVar = new a(this, bVar, str);
            zu7 zu7Var = new zu7();
            zu7Var.b.f29547a = "BehaviX";
            onf onfVar = new onf();
            onfVar.f25507a = str;
            onfVar.d = a2;
            onfVar.c = b2;
            zu7Var.f33016a.add(onfVar);
            rv7.e().b(zu7Var, aVar);
        }
    }
}
