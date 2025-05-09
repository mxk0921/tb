package tb;

import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.ObserverImageView;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class tns implements ObserverImageView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ rns f28831a;
    public final /* synthetic */ Ref$ObjectRef b;

    public tns(rns rnsVar, Ref$ObjectRef ref$ObjectRef) {
        this.f28831a = rnsVar;
        this.b = ref$ObjectRef;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.ObserverImageView.a
    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3c9bc8", new Object[]{this, new Integer(i)});
        } else if (i != rns.z(this.f28831a)) {
            rns.A(this.f28831a, i);
            ((LinearLayout) this.b.element).setMinimumHeight(rns.z(this.f28831a));
        }
    }
}
