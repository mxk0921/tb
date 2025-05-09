package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.baseactivity.CustomBaseActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class ky<E extends CustomBaseActivity> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ShopManager";

    /* renamed from: a  reason: collision with root package name */
    public final E f22996a;

    static {
        t2o.a(764411986);
    }

    public ky(E e) {
        this.f22996a = e;
    }

    public abstract void a();

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            a();
        } catch (Exception e) {
            Log.e(TAG, "Initialize shop manager exception:", e);
        }
    }
}
