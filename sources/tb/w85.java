package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w85 implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y85 f30512a;

    public w85(y85 y85Var) {
        this.f30512a = y85Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!ewj.a(y85.a(this.f30512a).getActivity())) {
            y85 y85Var = this.f30512a;
            y85.b(y85Var, y85.a(y85Var).getActivity().getString(R.string.tbavsdk_nonetwork_error_state));
        } else {
            y85.c(this.f30512a, false);
            y85.a(this.f30512a).getVideo().retryVideo();
            this.f30512a.n();
        }
    }
}
