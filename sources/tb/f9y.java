package tb;

import android.view.View;
import com.unionpay.UPPayWapActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class f9y implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UPPayWapActivity f19135a;

    public f9y(UPPayWapActivity uPPayWapActivity) {
        this.f19135a = uPPayWapActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f19135a.finish();
    }
}
