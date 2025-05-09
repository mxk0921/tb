package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h07 implements tu7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.tu7
    public void onDownloadError(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
        }
    }

    @Override // tb.tu7
    public void onDownloadFinish(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
        }
    }

    @Override // tb.tu7
    public void onDownloadProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.tu7
    public void onDownloadStateChange(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
        }
    }

    @Override // tb.tu7
    public void onFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.tu7
    public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
        }
    }
}
