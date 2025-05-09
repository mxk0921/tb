package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dmt implements rjh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ gmt f17947a;

    public dmt(gmt gmtVar) {
        this.f17947a = gmtVar;
    }

    @Override // tb.rjh
    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        return gmt.B(this.f17947a).a(gmt.p(this.f17947a));
    }
}
