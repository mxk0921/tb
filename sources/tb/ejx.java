package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tracker.intercept.ui.TFrameLayoutEx2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ejx implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bed f18631a;
    public final View.OnClickListener b;

    static {
        t2o.a(455082017);
    }

    public ejx(View.OnClickListener onClickListener, bed bedVar) {
        this.b = onClickListener;
        this.f18631a = bedVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        bed bedVar = this.f18631a;
        if (bedVar != null) {
            z = ((TFrameLayoutEx2.c) bedVar).a(this, view);
        }
        if (!z && (onClickListener = this.b) != null) {
            onClickListener.onClick(view);
        }
    }
}
