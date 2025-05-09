package tb;

import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.PhenixCreator;
import tb.dne;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t0m implements eec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(758120545);
        t2o.a(758120481);
    }

    @Override // tb.eec
    public void a(String str, ImageView imageView, dne dneVar) {
        p1m p1mVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171203e8", new Object[]{this, str, imageView, dneVar});
            return;
        }
        int c = dneVar.c();
        if (c != 0) {
            imageView.setImageResource(c);
        }
        if (imageView.getTag() instanceof p1m) {
            ((p1m) imageView.getTag()).a();
        }
        PhenixCreator T = s0m.B().N0(imageView.getContext()).T(str);
        if (dneVar.a() != 0) {
            T.error(dneVar.a());
        }
        if (c != 0) {
            T.placeholder(c);
        }
        dne.a b = dneVar.b();
        if (b != null) {
            p1mVar = T.into(imageView, b.b(), b.a());
        } else {
            p1mVar = T.into(imageView);
        }
        imageView.setTag(p1mVar);
    }

    @Override // tb.eec
    public void b(String str, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c4d6c4", new Object[]{this, str, imageView});
            return;
        }
        if (imageView.getTag() instanceof p1m) {
            ((p1m) imageView.getTag()).a();
        }
        imageView.setTag(s0m.B().N0(imageView.getContext()).T(str).into(imageView));
    }
}
