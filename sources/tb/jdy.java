package tb;

import com.unionpay.UPPayWapActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class jdy implements xux {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UPPayWapActivity f21943a;

    public jdy(UPPayWapActivity uPPayWapActivity) {
        this.f21943a = uPPayWapActivity;
    }

    @Override // tb.xux
    public final void a(String str, zux zuxVar) {
        String i;
        UPPayWapActivity.f(this.f21943a, Boolean.parseBoolean(str));
        if (zuxVar != null) {
            i = UPPayWapActivity.i("0", "success", null);
            zuxVar.a(i);
        }
    }
}
