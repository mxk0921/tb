package tb;

import android.view.View;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.input.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hu6 implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final UINode f20901a;

    static {
        t2o.a(986710156);
    }

    public hu6(UINode uINode) {
        this.f20901a = uINode;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        a.h(view.getContext(), (EditText) view);
        rtt.c((String) this.f20901a.getAttribute("max"), (String) this.f20901a.getAttribute("min"), this.f20901a);
    }
}
