package tb;

import com.unionpay.UPPayWapActivity;
import com.unionpay.utils.UPUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class vcy implements xux {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UPPayWapActivity f29929a;

    public vcy(UPPayWapActivity uPPayWapActivity) {
        this.f29929a = uPPayWapActivity;
    }

    @Override // tb.xux
    public final void a(String str, zux zuxVar) {
        String i;
        String c = UPUtils.c(this.f29929a, str);
        if (zuxVar != null) {
            i = UPPayWapActivity.i("0", "success", c);
            zuxVar.a(i);
        }
    }
}
