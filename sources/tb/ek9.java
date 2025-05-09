package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ek9 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f18638a;
    private Object b;

    static {
        t2o.a(486539724);
    }

    public ek9(View view, Object obj) {
        this.f18638a = view;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        View view = this.f18638a;
        if (view != null) {
            view.setTag(R.id.tag_guess_item_id, this.b);
        }
    }
}
