package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.promotion.content.ContentDetailActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wo4 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ContentDetailActivity f30813a;

    public wo4(ContentDetailActivity contentDetailActivity) {
        this.f30813a = contentDetailActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            ContentDetailActivity.x3(this.f30813a);
        }
    }
}
