package tb;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.entity.FaceDetectionReport;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartErrorCode;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartLayerStage;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartLayerState;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.view.SmartLayerFrameLayout;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.viewmodel.SmartLayerViewModel;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class n6q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SmartLayerController";

    /* renamed from: a  reason: collision with root package name */
    public final g6q f24542a;
    public final l6q b;
    public final SmartLayerViewModel c;
    public final brd d;
    public boolean e;
    public boolean f;
    public TextView g;
    public boolean h;
    public String i;
    public SmartLayerConstant$SmartLayerState j = SmartLayerConstant$SmartLayerState.INITIAL;
    public SmartLayerFrameLayout k;
    public ViewGroup l;

    static {
        t2o.a(295699759);
    }

    public n6q(g6q g6qVar, l6q l6qVar, SmartLayerViewModel smartLayerViewModel, brd brdVar) {
        this.f24542a = g6qVar;
        this.b = l6qVar;
        this.c = smartLayerViewModel;
        this.d = brdVar;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83660fe", new Object[]{this});
        } else if (hw0.l() && j() != null) {
            TextView textView = new TextView(j());
            this.g = textView;
            textView.setText("layerId: " + this.f24542a.f19759a + "bizId: " + this.f24542a.c);
            this.g.setBackgroundColor(Color.parseColor("#33FF0000"));
            this.g.setTextColor(-1);
            this.g.setPadding(4, 2, 4, 2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = FaceDetectionReport.NATIVE_EXTRA_FLOAT_OUT_LENGTH;
            this.k.addView(this.g, layoutParams);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffda107", new Object[]{this});
            return;
        }
        SmartLayerFrameLayout smartLayerFrameLayout = this.k;
        if (smartLayerFrameLayout != null) {
            smartLayerFrameLayout.removeView(this.g);
        }
        this.g = null;
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74e7edd", new Object[]{this, str, str2});
            return;
        }
        SmartLayerConstant$SmartLayerState smartLayerConstant$SmartLayerState = this.j;
        if (smartLayerConstant$SmartLayerState == SmartLayerConstant$SmartLayerState.LOAD_CONTENT || smartLayerConstant$SmartLayerState == SmartLayerConstant$SmartLayerState.INITIAL) {
            this.j = SmartLayerConstant$SmartLayerState.ERROR_CLOSE;
        }
        l(str, str2, false);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb62283", new Object[]{this});
            return;
        }
        l6q l6qVar = this.b;
        if (l6qVar != null) {
            SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage = SmartLayerConstant$SmartLayerStage.SMART_JUMP;
            l6qVar.e(smartLayerConstant$SmartLayerStage);
            HashMap hashMap = new HashMap();
            hashMap.put("jumpType", "custom");
            this.h = true;
            b7q.e(this.f24542a, this.b, smartLayerConstant$SmartLayerStage, SmartLayerConstant$SmartLayerStage.SMART_SHOW, hashMap);
        }
    }

    public void f(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf45bfb", new Object[]{this, viewGroup});
        } else if (this.j == SmartLayerConstant$SmartLayerState.INITIAL) {
            this.k = new SmartLayerFrameLayout(j(), this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            this.k.setVisibility(8);
            if (b7q.b(this.b.a())) {
                ViewGroup viewGroup2 = (ViewGroup) e9m.a(j(), R.id.taolive_open_popview_frame);
                this.l = viewGroup2;
                if (viewGroup2 == null && viewGroup != null) {
                    this.l = viewGroup;
                }
                if (this.l == null) {
                    SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode = SmartLayerConstant$SmartErrorCode.ERROR_CONTROLLER_CREATE_NO_ROOT;
                    d(smartLayerConstant$SmartErrorCode.errorCode, smartLayerConstant$SmartErrorCode.errorMessage);
                    return;
                }
            } else if (viewGroup != null) {
                this.l = viewGroup;
            } else {
                SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode2 = SmartLayerConstant$SmartErrorCode.ERROR_CONTROLLER_CREATE_NO_ROOT;
                d(smartLayerConstant$SmartErrorCode2.errorCode, smartLayerConstant$SmartErrorCode2.errorMessage);
                return;
            }
            this.l.addView(this.k, layoutParams);
            l6q l6qVar = this.b;
            SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage = SmartLayerConstant$SmartLayerStage.SMART_VALID;
            l6qVar.e(smartLayerConstant$SmartLayerStage);
            b7q.e(this.f24542a, this.b, smartLayerConstant$SmartLayerStage, SmartLayerConstant$SmartLayerStage.SMART_DATA_LOAD, null);
            r();
            p6q.d(smartLayerConstant$SmartLayerStage, this.f24542a, TAG, "createLayer-成功创建弹层");
            n();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("661c6c49", new Object[]{this});
            return;
        }
        SmartLayerConstant$SmartLayerState smartLayerConstant$SmartLayerState = this.j;
        if (smartLayerConstant$SmartLayerState == SmartLayerConstant$SmartLayerState.LOAD_CONTENT || smartLayerConstant$SmartLayerState == SmartLayerConstant$SmartLayerState.READY) {
            l6q l6qVar = this.b;
            SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage = SmartLayerConstant$SmartLayerStage.SMART_DISPLAY;
            l6qVar.e(smartLayerConstant$SmartLayerStage);
            p6q.d(smartLayerConstant$SmartLayerStage, this.f24542a, TAG, "业务触发display");
            b7q.e(this.f24542a, this.b, smartLayerConstant$SmartLayerStage, SmartLayerConstant$SmartLayerStage.SMART_VALID, null);
            this.j = SmartLayerConstant$SmartLayerState.READY;
            brd brdVar = this.d;
            if (brdVar != null) {
                ((j6q) brdVar).h();
            }
            z();
            return;
        }
        SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage2 = SmartLayerConstant$SmartLayerStage.SMART_DISPLAY;
        g6q g6qVar = this.f24542a;
        p6q.c(smartLayerConstant$SmartLayerStage2, g6qVar, TAG, "触发display调用，但是当前状态已经展示或者关闭, state = " + this.j);
    }

    public String h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3269c4b0", new Object[]{this, new Boolean(z)});
        }
        if (!z) {
            return "no";
        }
        if (this.h) {
            return "jumpClose";
        }
        return "manualClose";
    }

    public abstract View i();

    public Activity j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("f6a0d16d", new Object[]{this});
        }
        l6q l6qVar = this.b;
        if (l6qVar != null) {
            return l6qVar.a();
        }
        return null;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        SmartLayerConstant$SmartLayerState smartLayerConstant$SmartLayerState = this.j;
        if (smartLayerConstant$SmartLayerState == SmartLayerConstant$SmartLayerState.CLOSED) {
            p6q.c(SmartLayerConstant$SmartLayerStage.SMART_PROCESS, this.f24542a, TAG, "hide-当前弹层已关闭，无法隐藏");
            return;
        }
        if (smartLayerConstant$SmartLayerState == SmartLayerConstant$SmartLayerState.SHOWING) {
            this.j = SmartLayerConstant$SmartLayerState.BACKGROUND;
            p6q.c(SmartLayerConstant$SmartLayerStage.SMART_PROCESS, this.f24542a, TAG, "hide-隐藏当前弹层");
        }
        v();
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84eacbba", new Object[]{this});
        } else if (i() != null && !this.f) {
            this.f = true;
            this.k.addView(i());
            b();
            this.j = SmartLayerConstant$SmartLayerState.LOAD_CONTENT;
            p6q.d(SmartLayerConstant$SmartLayerStage.SMART_LOAD_CONTENT, this.f24542a, TAG, "loadContent");
            t();
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac343d59", new Object[]{this});
        } else {
            p(null, null);
        }
    }

    public void p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ec52837", new Object[]{this, str, str2});
            return;
        }
        SmartLayerConstant$SmartLayerState smartLayerConstant$SmartLayerState = this.j;
        if (smartLayerConstant$SmartLayerState == SmartLayerConstant$SmartLayerState.LOAD_CONTENT || smartLayerConstant$SmartLayerState == SmartLayerConstant$SmartLayerState.INITIAL) {
            this.j = SmartLayerConstant$SmartLayerState.ERROR_CLOSE;
        }
        l(str, str2, true);
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7582434d", new Object[]{this});
            return;
        }
        l6q l6qVar = this.b;
        SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage = SmartLayerConstant$SmartLayerStage.SMART_CONTEXT_UPDATE;
        l6qVar.e(smartLayerConstant$SmartLayerStage);
        b7q.e(this.f24542a, this.b, smartLayerConstant$SmartLayerStage, SmartLayerConstant$SmartLayerStage.SMART_TRIGGER, null);
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7675095d", new Object[]{this});
        }
    }

    public String s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49b9e85e", new Object[]{this, new Boolean(z)});
        }
        c();
        return this.i;
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38eb6f8d", new Object[]{this});
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9814c91", new Object[]{this});
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaba1ceb", new Object[]{this});
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e8be86", new Object[]{this});
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0cdb93b", new Object[]{this});
        }
    }

    public void m(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9559eae2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (z) {
            l6q l6qVar = this.b;
            SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage = SmartLayerConstant$SmartLayerStage.SMART_JUMP;
            l6qVar.e(smartLayerConstant$SmartLayerStage);
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("jumpType", ybu.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP);
                hashMap.put(rg0.JUMP_URL, str);
            } else {
                hashMap.put("jumpType", "noJump");
            }
            b7q.e(this.f24542a, this.b, smartLayerConstant$SmartLayerStage, SmartLayerConstant$SmartLayerStage.SMART_SHOW, hashMap);
        }
        if (TextUtils.isEmpty(str)) {
            SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage2 = SmartLayerConstant$SmartLayerStage.SMART_JUMP;
            g6q g6qVar = this.f24542a;
            p6q.c(smartLayerConstant$SmartLayerStage2, g6qVar, TAG, "无跳转URL, close = " + z);
        } else {
            SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage3 = SmartLayerConstant$SmartLayerStage.SMART_JUMP;
            g6q g6qVar2 = this.f24542a;
            p6q.c(smartLayerConstant$SmartLayerStage3, g6qVar2, TAG, "跳转URL, close = " + str + ", close = " + z);
            Nav.from(j()).toUri(str);
        }
        if (z) {
            this.h = true;
            o();
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        SmartLayerConstant$SmartLayerState smartLayerConstant$SmartLayerState = this.j;
        if (smartLayerConstant$SmartLayerState == SmartLayerConstant$SmartLayerState.CLOSED) {
            p6q.c(SmartLayerConstant$SmartLayerStage.SMART_PROCESS, this.f24542a, TAG, "resume-当前弹层已关闭，无法恢复");
        } else if (smartLayerConstant$SmartLayerState == SmartLayerConstant$SmartLayerState.BACKGROUND) {
            this.j = SmartLayerConstant$SmartLayerState.SHOWING;
            SmartLayerFrameLayout smartLayerFrameLayout = this.k;
            if (smartLayerFrameLayout != null) {
                if (smartLayerFrameLayout.getParent() == null) {
                    if (this.l != null) {
                        this.l.addView(this.k, new FrameLayout.LayoutParams(-1, -1));
                    } else {
                        p6q.d(SmartLayerConstant$SmartLayerStage.SMART_PROCESS, this.f24542a, TAG, "resume-宿主HostView为空，无法恢复");
                        SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode = SmartLayerConstant$SmartErrorCode.ERROR_CONTROLLER_RESUME_NO_ROOT;
                        d(smartLayerConstant$SmartErrorCode.errorCode, smartLayerConstant$SmartErrorCode.errorMessage);
                        return;
                    }
                }
                this.k.setVisibility(0);
                this.k.bringToFront();
            }
            p6q.c(SmartLayerConstant$SmartLayerStage.SMART_PROCESS, this.f24542a, TAG, "resume-当前弹层已关闭，无法恢复");
            w();
        } else {
            p6q.c(SmartLayerConstant$SmartLayerStage.SMART_PROCESS, this.f24542a, TAG, "resume-恢复展示当前弹层");
            z();
        }
    }

    public void l(String str, String str2, boolean z) {
        ViewGroup viewGroup;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5de7f00", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        SmartLayerConstant$SmartLayerState smartLayerConstant$SmartLayerState = this.j;
        SmartLayerConstant$SmartLayerState smartLayerConstant$SmartLayerState2 = SmartLayerConstant$SmartLayerState.CLOSED;
        if (smartLayerConstant$SmartLayerState == smartLayerConstant$SmartLayerState2) {
            p6q.c(SmartLayerConstant$SmartLayerStage.SMART_CLOSE, this.f24542a, TAG, "重复关闭当前弹层");
            return;
        }
        x();
        this.i = h(z);
        SmartLayerConstant$SmartLayerState smartLayerConstant$SmartLayerState3 = this.j;
        if (smartLayerConstant$SmartLayerState3 == SmartLayerConstant$SmartLayerState.SHOWING || smartLayerConstant$SmartLayerState3 == SmartLayerConstant$SmartLayerState.BACKGROUND) {
            l6q l6qVar = this.b;
            SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage = SmartLayerConstant$SmartLayerStage.SMART_CLOSE;
            l6qVar.e(smartLayerConstant$SmartLayerStage);
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(str)) {
                hashMap.put("errorCode", str);
            }
            if (TextUtils.isEmpty(str2)) {
                hashMap.put("errorMessage", str2);
            }
            if (!TextUtils.isEmpty(this.i)) {
                hashMap.put(ep6.ACTION_CLOSE_TYPE_PARAM, this.i);
            }
            b7q.e(this.f24542a, this.b, smartLayerConstant$SmartLayerStage, SmartLayerConstant$SmartLayerStage.SMART_SHOW, hashMap);
        } else if (smartLayerConstant$SmartLayerState3 == SmartLayerConstant$SmartLayerState.ERROR_CLOSE) {
            if (TextUtils.isEmpty(str)) {
                SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode = SmartLayerConstant$SmartErrorCode.ERROR_CONTROLLER_RESUME_NO_NEED;
                str = smartLayerConstant$SmartErrorCode.errorCode;
                str2 = smartLayerConstant$SmartErrorCode.errorMessage;
            }
            b7q.d(this.f24542a, this.b, SmartLayerConstant$SmartLayerStage.SMART_CLOSE, str, str2);
            z2 = false;
        } else {
            if (TextUtils.isEmpty(str)) {
                SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode2 = SmartLayerConstant$SmartErrorCode.ERROR_CONTROLLER_RESUME_NO_DISPLAY;
                str = smartLayerConstant$SmartErrorCode2.errorCode;
                str2 = smartLayerConstant$SmartErrorCode2.errorMessage;
            }
            b7q.d(this.f24542a, this.b, SmartLayerConstant$SmartLayerStage.SMART_CLOSE, str, str2);
            z2 = false;
        }
        this.j = smartLayerConstant$SmartLayerState2;
        SmartLayerFrameLayout smartLayerFrameLayout = this.k;
        if (!(smartLayerFrameLayout == null || (viewGroup = this.l) == null)) {
            viewGroup.removeView(smartLayerFrameLayout);
        }
        s(z);
        p6q.e(SmartLayerConstant$SmartLayerStage.SMART_CLOSE, this.f24542a, TAG, "关闭当前弹层, isManual= " + z + ",closeType=" + this.i, str + " ," + str2, true);
        brd brdVar = this.d;
        if (brdVar == null) {
            return;
        }
        if (z2) {
            ((j6q) brdVar).f(this.i, null, null);
        } else {
            ((j6q) brdVar).f(this.i, str, str2);
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        SmartLayerConstant$SmartLayerState smartLayerConstant$SmartLayerState = this.j;
        if (smartLayerConstant$SmartLayerState != SmartLayerConstant$SmartLayerState.READY && smartLayerConstant$SmartLayerState != SmartLayerConstant$SmartLayerState.READY_INACTIVE) {
            SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage = SmartLayerConstant$SmartLayerStage.SMART_SHOW;
            g6q g6qVar = this.f24542a;
            p6q.c(smartLayerConstant$SmartLayerStage, g6qVar, TAG, "当前状态不支持展示弹层, state = " + this.j);
        } else if (this.b.a() != c21.i()) {
            p6q.e(SmartLayerConstant$SmartLayerStage.SMART_SHOW, this.f24542a, TAG, "流程阻塞", "当前应用不是topActivity，暂时不做展示", false);
            this.j = SmartLayerConstant$SmartLayerState.BACKGROUND;
        } else {
            brd brdVar = this.d;
            if (brdVar == null || ((j6q) brdVar).c()) {
                SmartLayerFrameLayout smartLayerFrameLayout = this.k;
                if (smartLayerFrameLayout != null) {
                    smartLayerFrameLayout.setVisibility(0);
                    this.k.bringToFront();
                    this.j = SmartLayerConstant$SmartLayerState.SHOWING;
                    SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage2 = SmartLayerConstant$SmartLayerStage.SMART_SHOW;
                    p6q.d(smartLayerConstant$SmartLayerStage2, this.f24542a, TAG, "成功展示弹层");
                    brd brdVar2 = this.d;
                    if (brdVar2 != null) {
                        ((j6q) brdVar2).g();
                    }
                    this.e = true;
                    u();
                    this.b.e(smartLayerConstant$SmartLayerStage2);
                    b7q.e(this.f24542a, this.b, smartLayerConstant$SmartLayerStage2, SmartLayerConstant$SmartLayerStage.SMART_DISPLAY, null);
                    return;
                }
                return;
            }
            p6q.e(SmartLayerConstant$SmartLayerStage.SMART_SHOW, this.f24542a, TAG, "流程阻塞", "页面不可见导致校验不通过", false);
        }
    }
}
