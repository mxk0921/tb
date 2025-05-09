package tb;

import com.unionpay.UPPayWapActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class acy implements xux {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UPPayWapActivity f15671a;

    public acy(UPPayWapActivity uPPayWapActivity) {
        this.f15671a = uPPayWapActivity;
    }

    @Override // tb.xux
    public final void a(String str, zux zuxVar) {
        String i;
        String c = fyu.c(this.f15671a);
        if (zuxVar != null) {
            i = UPPayWapActivity.i("0", "success", c);
            zuxVar.a(i);
        }
    }
}
