package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class udh implements jnc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(487588004);
        t2o.a(487587958);
    }

    @Override // tb.jnc
    public void logd(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bebe7bb", new Object[]{this, str, str2});
        }
    }

    @Override // tb.jnc
    public void loge(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{this, str, str2});
        }
    }

    @Override // tb.jnc
    public void logw(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bcf18ce", new Object[]{this, str, str2});
        }
    }

    @Override // tb.jnc
    public void loge(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc02eb9", new Object[]{this, str, str2, th});
        }
    }
}
