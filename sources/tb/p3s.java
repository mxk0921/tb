package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p3s implements cwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092318);
        t2o.a(806355915);
    }

    @Override // tb.cwd
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d8b84d2", new Object[]{this, str, obj});
        } else {
            TLog.logi("TBLive", str, String.valueOf(obj));
        }
    }

    @Override // tb.cwd
    public void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6aadcd", new Object[]{this, str, obj});
        } else {
            TLog.logd("TBLive", str, String.valueOf(obj));
        }
    }

    @Override // tb.cwd
    public void c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b0ad8ce", new Object[]{this, str, obj});
        } else {
            TLog.loge("TBLive", str, String.valueOf(obj));
        }
    }

    @Override // tb.cwd
    public void d(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e4ddee0", new Object[]{this, str, obj});
        } else {
            TLog.logw("TBLive", str, String.valueOf(obj));
        }
    }

    @Override // tb.cwd
    public void e(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1adb3df", new Object[]{this, str, obj});
        } else {
            TLog.logv("TBLive", str, String.valueOf(obj));
        }
    }

    @Override // tb.cwd
    public void f(String str, Object obj, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c047e7", new Object[]{this, str, obj, th});
            return;
        }
        TLog.loge("TBLive" + str, String.valueOf(obj), th);
    }
}
