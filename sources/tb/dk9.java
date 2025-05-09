package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dk9 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f17881a;
    private Object b;

    static {
        t2o.a(729809225);
    }

    public dk9(View view, Object obj) {
        this.f17881a = view;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        View view = this.f17881a;
        if (view != null) {
            view.setTag(R.id.tag_guess_item_id, this.b);
        }
    }
}
