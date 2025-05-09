package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023TopNavBarNativeComponent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class onp implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Shop2023TopNavBarNativeComponent f25516a;
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ int c;

    public onp(Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent, JSONObject jSONObject, int i) {
        this.f25516a = shop2023TopNavBarNativeComponent;
        this.b = jSONObject;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        a1v.q(this.f25516a.h(), this.b.getString("utArg1"), null, 2, null);
        this.f25516a.p(this.c);
    }
}
