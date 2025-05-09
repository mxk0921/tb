package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.widget.ObserverImageView;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class sns implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ff7 f28166a;
    public final /* synthetic */ rns b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ Ref$ObjectRef d;

    public sns(ff7 ff7Var, rns rnsVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
        this.f28166a = ff7Var;
        this.b = rnsVar;
        this.c = ref$ObjectRef;
        this.d = ref$ObjectRef2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        ObserverImageView observerImageView = (ObserverImageView) this.d.element;
        Integer valueOf = observerImageView != null ? Integer.valueOf(observerImageView.getVisibility()) : null;
        if (valueOf != null && valueOf.intValue() == 8) {
            ObserverImageView observerImageView2 = (ObserverImageView) this.d.element;
            observerImageView2.setVisibility(0);
            observerImageView2.setImageUrl(this.f28166a.i);
            ((ObserverImageView) this.c.element).setVisibility(8);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("arg1", (Object) "DESC_Price");
            q84.f(rns.y(this.b), new rc7("user_track", jSONObject, new RuntimeAbilityParam[0]));
        }
    }
}
