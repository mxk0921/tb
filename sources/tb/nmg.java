package tb;

import com.alipay.birdnest.platform.Platform;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.FBTemplateDecider;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class nmg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y0a f24826a;
        public final /* synthetic */ String b;
        public final /* synthetic */ tu8 c;

        public a(y0a y0aVar, String str, tu8 tu8Var) {
            this.f24826a = y0aVar;
            this.b = str;
            this.c = tu8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f24826a.apply(FBTemplateDecider.i(this.b, this.c));
            }
        }
    }

    @Deprecated
    public static void a(String str, tu8 tu8Var, y0a<FBTemplateDecider, Void, Void> y0aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d196439", new Object[]{str, tu8Var, y0aVar});
            return;
        }
        Platform.i();
        if (jst.b()) {
            jst.f22189a.submit(new a(y0aVar, str, tu8Var));
        } else {
            y0aVar.apply(FBTemplateDecider.i(str, tu8Var));
        }
    }
}
