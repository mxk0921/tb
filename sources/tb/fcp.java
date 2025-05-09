package tb;

import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fcp implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseFrame f19192a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ViewStub c;
    public final /* synthetic */ dy9 d;
    public final /* synthetic */ ecp e;

    public fcp(ecp ecpVar, BaseFrame baseFrame, String str, ViewStub viewStub, dy9 dy9Var) {
        this.e = ecpVar;
        this.f19192a = baseFrame;
        this.b = str;
        this.c = viewStub;
        this.d = dy9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        ecp.n(this.e, this.f19192a, this.b, this.c, this.d);
        ecp.m(this.e).remove(this);
    }
}
