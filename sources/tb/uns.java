package tb;

import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.ObserverImageView;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class uns implements ObserverImageView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ rns f29520a;
    public final /* synthetic */ Ref$ObjectRef b;

    public uns(rns rnsVar, Ref$ObjectRef ref$ObjectRef) {
        this.f29520a = rnsVar;
        this.b = ref$ObjectRef;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.ObserverImageView.a
    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3c9bc8", new Object[]{this, new Integer(i)});
        } else if (i != rns.z(this.f29520a)) {
            rns.A(this.f29520a, i);
            ((LinearLayout) this.b.element).getLayoutParams().height = rns.z(this.f29520a);
        }
    }
}
