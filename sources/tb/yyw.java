package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class yyw implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714115);
    }

    public abstract void a(float f, float f2);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else {
            a(view.getPivotX(), view.getPivotY());
        }
    }
}
