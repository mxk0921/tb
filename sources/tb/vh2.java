package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vh2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f30011a;
    public final BootImageInfo b;
    public boolean c = false;

    static {
        t2o.a(573571123);
    }

    public vh2(Context context, BootImageInfo bootImageInfo) {
        this.f30011a = context;
        this.b = bootImageInfo;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.c = true;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue();
        }
        if (this.c) {
            tm1.a("BootImageInteractBasePresenter", "isDestroyed");
            return true;
        }
        Context context = this.f30011a;
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            return false;
        }
        tm1.a("BootImageInteractBasePresenter", "activity_finished");
        return true;
    }
}
