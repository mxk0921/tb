package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class cu1 implements tu7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f17324a;

    static {
        t2o.a(961544227);
    }

    public abstract String b();

    public abstract String c();

    @Override // tb.tu7
    public void onDownloadFinish(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
            return;
        }
        if (ogh.c()) {
            ogh.f("BaseDownloadListener", "【" + b() + "】数据文件下载成功，文件地址：" + str + "，文件大小：" + new File(str2).length());
        }
        try {
            ku0.d(c(), str, new File(str2).length(), System.currentTimeMillis() - this.f17324a, true);
        } catch (Throwable th) {
            ogh.h("BaseDownloadListener", th.getMessage(), th);
        }
        ku0.i(ku0.DOWNLOAD_ALARM, c());
    }

    @Override // tb.tu7
    public void onDownloadProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            return;
        }
        ogh.e("BaseDownloadListener", "onDownloadProgress, progress=" + i + ", " + this);
    }

    @Override // tb.tu7
    public void onDownloadStateChange(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            return;
        }
        ogh.e("BaseDownloadListener", "onDownloadStateChange, url=" + str + ", isDownloading=" + z + ", " + this);
        if (z && this.f17324a == 0) {
            this.f17324a = System.currentTimeMillis();
        }
    }

    @Override // tb.tu7
    public void onFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
            return;
        }
        ogh.e("BaseDownloadListener", "onFinish, allSuccess=" + z + ", " + this);
    }

    @Override // tb.tu7
    public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
            return;
        }
        ogh.e("BaseDownloadListener", "onNetworkLimit, netType=" + i + ", downloadParam=" + uplVar + ", networkLimitCallback=" + aVar + ", " + this);
    }

    @Override // tb.tu7
    public void onDownloadError(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        if (ogh.c()) {
            ogh.n("BaseDownloadListener", "【" + b() + "】文件下载失败，文件地址：" + str + "，错误码：" + i + "，错误消息：" + str2);
        }
        try {
            ku0.d(c(), str, 0L, System.currentTimeMillis() - this.f17324a, false);
        } catch (Throwable th) {
            ogh.h("BaseDownloadListener", th.getMessage(), th);
        }
        ku0.g(ku0.DOWNLOAD_ALARM, c(), String.valueOf(i), str2, true);
    }
}
