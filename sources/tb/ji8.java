package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.toolchain.ErrorViewActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ji8 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ErrorViewActivity f22005a;

    public ji8(ErrorViewActivity errorViewActivity) {
        this.f22005a = errorViewActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            ErrorViewActivity.l3(this.f22005a).setVisibility(0);
        }
    }
}
