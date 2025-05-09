package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.smallwindow.InitiativeSmallWindowController;
import com.taobao.android.miniLive.smallwindow.PassiveSmallWindowController;
import com.taobao.taolive.room.service.IPlayPublicService;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class u4q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBLiveService";
    public static u4q b;

    /* renamed from: a  reason: collision with root package name */
    public t02 f29142a;

    static {
        t2o.a(779092036);
    }

    public static u4q b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u4q) ipChange.ipc$dispatch("67c40695", new Object[0]);
        }
        if (b == null) {
            synchronized (u4q.class) {
                try {
                    if (b == null) {
                        b = new u4q();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d066bf33", new Object[]{this})).booleanValue();
        }
        t02 t02Var = this.f29142a;
        if (t02Var != null) {
            return t02Var.b();
        }
        return false;
    }

    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        t02 t02Var = this.f29142a;
        if (t02Var != null) {
            return t02Var.e();
        }
        return null;
    }

    public void d(htn htnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f836655", new Object[]{this, htnVar});
            return;
        }
        t02 t02Var = this.f29142a;
        if (t02Var != null) {
            t02Var.f(htnVar);
        }
    }

    public void e(so9 so9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d153b76", new Object[]{this, so9Var});
            return;
        }
        t02 t02Var = this.f29142a;
        if (t02Var != null) {
            t02Var.g(so9Var);
        }
    }

    public void f(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a0aed6", new Object[]{this, onClickListener});
            return;
        }
        t02 t02Var = this.f29142a;
        if (t02Var != null) {
            t02Var.h(onClickListener);
        }
    }

    public void g(Context context, r4d r4dVar, VideoInfo videoInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, i7c i7cVar, tjl tjlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a617d9", new Object[]{this, context, r4dVar, videoInfo, str, str2, str3, str4, str5, str6, str7, new Boolean(z), new Boolean(z2), i7cVar, tjlVar});
            return;
        }
        t02 t02Var = this.f29142a;
        if (t02Var != null) {
            t02Var.c();
        }
        InitiativeSmallWindowController initiativeSmallWindowController = new InitiativeSmallWindowController(context, r4dVar, videoInfo, str, str2, str3, str4, str5, tjlVar, z, z2);
        initiativeSmallWindowController.i(str6);
        initiativeSmallWindowController.j(str7);
        initiativeSmallWindowController.A(i7cVar);
        initiativeSmallWindowController.b();
        this.f29142a = initiativeSmallWindowController;
    }

    public void h(Context context, IPlayPublicService iPlayPublicService, VideoInfo videoInfo, String str, String str2, String str3, String str4, String str5, String str6, boolean z, i7c i7cVar, tjl tjlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca8da34", new Object[]{this, context, iPlayPublicService, videoInfo, str, str2, str3, str4, str5, str6, new Boolean(z), i7cVar, tjlVar});
            return;
        }
        t02 t02Var = this.f29142a;
        if (t02Var != null) {
            t02Var.c();
        }
        PassiveSmallWindowController passiveSmallWindowController = new PassiveSmallWindowController(context, iPlayPublicService, videoInfo, str, str2, str3, str4, tjlVar, z);
        passiveSmallWindowController.i(str5);
        passiveSmallWindowController.j(str6);
        passiveSmallWindowController.A(i7cVar);
        this.f29142a = passiveSmallWindowController;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be082416", new Object[]{this});
            return;
        }
        t02 t02Var = this.f29142a;
        if (t02Var != null) {
            t02Var.c();
            this.f29142a = null;
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69803698", new Object[]{this});
            return;
        }
        t02 t02Var = this.f29142a;
        if (t02Var instanceof PassiveSmallWindowController) {
            t02Var.c();
            this.f29142a = null;
        }
    }
}
