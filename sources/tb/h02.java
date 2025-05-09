package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.BaseResultActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h02 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseResultActivity f20338a;

    public h02(BaseResultActivity baseResultActivity) {
        this.f20338a = baseResultActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            BaseResultActivity.q3(this.f20338a).V();
        }
    }
}
