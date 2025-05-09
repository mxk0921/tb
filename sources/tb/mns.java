package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mns implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ lns f24172a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((DescNativeController) lns.z(mns.this.f24172a)).Y(0);
            }
        }
    }

    public mns(lns lnsVar) {
        this.f24172a = lnsVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        if (lns.z(this.f24172a) instanceof DescNativeController) {
            ((DescNativeController) lns.z(this.f24172a)).d0(true);
        }
        TTDetailScrollerLayout.LayoutParams layoutParams = new TTDetailScrollerLayout.LayoutParams(-1, -1);
        lns lnsVar = this.f24172a;
        layoutParams.f7033a = lnsVar;
        lns.E(lnsVar).setLayoutParams(layoutParams);
        lns.F(this.f24172a).setVisibility(8);
        lns.G(this.f24172a).setVisibility(8);
        lns lnsVar2 = this.f24172a;
        lnsVar2.b = false;
        q84.f(lns.y(lnsVar2), new DescNativeController.c("expand"));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("arg1", (Object) "DESC_Fold");
        q84.f(lns.y(this.f24172a), new rc7("user_track", jSONObject, new RuntimeAbilityParam[0]));
        if (lns.z(this.f24172a) instanceof DescNativeController) {
            lns.F(this.f24172a).post(new a());
        }
    }
}
