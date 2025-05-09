package tb;

import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.poplayer.norm.ITrackLogAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class aor implements ITrackLogAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626346);
        t2o.a(625999978);
    }

    public static /* synthetic */ void c(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19c15096", new Object[]{str, str2, str3, str4});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "Common";
        }
        TLog.loge("PopLayer", str, wdm.j(str2, str3, str4));
    }

    public static /* synthetic */ void d(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad82a19", new Object[]{str, str2, str3, str4});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "Common";
        }
        TLog.loge("PopLayer", str, wdm.j(str2, str3, str4));
    }

    @Override // com.alibaba.poplayer.norm.ILogAdapter
    public void Loge(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e833d92", new Object[]{this, str});
        }
    }

    @Override // com.alibaba.poplayer.norm.ILogAdapter
    public void Logi(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6780c4db", new Object[]{this, str, objArr});
        }
    }

    @Override // com.alibaba.poplayer.norm.ITrackLogAdapter
    public void LogiImmediate(boolean z, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ba4e69", new Object[]{this, new Boolean(z), str, str2, str3, str4});
        } else if (z) {
            try {
                if (TextUtils.isEmpty(str)) {
                    str = "Common";
                }
                TLog.loge("PopLayer", str, wdm.j(str2, str3, str4));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.alibaba.poplayer.norm.ITrackLogAdapter
    public void Loge(boolean z, final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10bfba34", new Object[]{this, new Boolean(z), str, str2, str3, str4});
        } else if (z) {
            try {
                Runnable ynrVar = new Runnable() { // from class: tb.ynr
                    @Override // java.lang.Runnable
                    public final void run() {
                        aor.c(str, str2, str3, str4);
                    }
                };
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    hst.b(ynrVar);
                } else {
                    ynrVar.run();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.alibaba.poplayer.norm.ITrackLogAdapter
    public void Logi(boolean z, final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c500b0", new Object[]{this, new Boolean(z), str, str2, str3, str4});
        } else if (z) {
            try {
                Runnable znrVar = new Runnable() { // from class: tb.znr
                    @Override // java.lang.Runnable
                    public final void run() {
                        aor.d(str, str2, str3, str4);
                    }
                };
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    hst.b(znrVar);
                } else {
                    znrVar.run();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
