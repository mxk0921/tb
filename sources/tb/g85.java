package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.component.DWComponent;
import com.taobao.avplayer.interactivelifecycle.display.DWInteractiveTypeEnum;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g85 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ADDED = 1;
    public static final int CREATE = 0;
    public static final int SHOWING = 2;
    public static final int SHOWN = 4;
    public static final int UPDATING = 3;
    public int b;
    public int c;
    public boolean h;
    public HashMap<String, String> i;
    public String j;
    public boolean k;
    public boolean l;

    /* renamed from: a  reason: collision with root package name */
    public DWVideoScreenType f19782a = DWVideoScreenType.NORMAL;
    public int d = 0;
    public x65 e = null;
    public x65 f = null;
    public x65 g = null;

    static {
        t2o.a(452985093);
    }

    public g85() {
        IpChange ipChange = DWInteractiveTypeEnum.$ipChange;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        DWComponent dWComponent = this.e.f31174a;
        DWComponent dWComponent2 = this.g.f31174a;
        DWComponent dWComponent3 = this.f.f31174a;
        if (dWComponent3.getView() != null) {
            dWComponent3.hide(false);
        }
        if (dWComponent2.getView() != null) {
            dWComponent2.hide(false);
        }
        if (dWComponent.getView() != null) {
            dWComponent.hide(false);
        }
    }

    public boolean b() {
        x65 x65Var;
        x65 x65Var2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c71da302", new Object[]{this})).booleanValue();
        }
        x65 x65Var3 = this.e;
        if (x65Var3 == null || x65Var3.f31174a == null || (x65Var = this.g) == null || x65Var.f31174a == null || (x65Var2 = this.f) == null || x65Var2.f31174a == null) {
            return true;
        }
        return false;
    }

    public void c() {
        DWComponent dWComponent;
        DWComponent dWComponent2;
        DWComponent dWComponent3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a29462", new Object[]{this});
        } else if (!this.l) {
            this.l = true;
            x65 x65Var = this.e;
            if (!(x65Var == null || (dWComponent3 = x65Var.f31174a) == null)) {
                dWComponent3.renderView();
            }
            x65 x65Var2 = this.g;
            if (!(x65Var2 == null || (dWComponent2 = x65Var2.f31174a) == null)) {
                dWComponent2.renderView();
            }
            x65 x65Var3 = this.f;
            if (x65Var3 != null && (dWComponent = x65Var3.f31174a) != null) {
                dWComponent.renderView();
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        this.e.f31174a.show(false, this.f19782a);
        this.f.f31174a.show(false, this.f19782a);
        this.g.f31174a.show(false, this.f19782a);
    }
}
