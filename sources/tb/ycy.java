package tb;

import com.unionpay.UPPayWapActivity;
import com.unionpay.utils.UPUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ycy implements xux {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UPPayWapActivity f31993a;

    public ycy(UPPayWapActivity uPPayWapActivity) {
        this.f31993a = uPPayWapActivity;
    }

    @Override // tb.xux
    public final void a(String str, zux zuxVar) {
        String i;
        UPUtils.j(this.f31993a, str);
        if (zuxVar != null) {
            i = UPPayWapActivity.i("0", "success", null);
            zuxVar.a(i);
        }
    }
}
