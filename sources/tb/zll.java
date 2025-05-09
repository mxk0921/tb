package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zll implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f32850a;
    public final /* synthetic */ s5h b;
    public final /* synthetic */ cml c;

    public zll(cml cmlVar, List list, s5h s5hVar) {
        this.c = cmlVar;
        this.f32850a = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            cml.a(this.c, this.f32850a, null);
        }
    }
}
