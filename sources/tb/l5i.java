package tb;

import android.animation.TimeInterpolator;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.frameanim.NewDetailMaskFrameLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class l5i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public NewDetailMaskFrameLayout f23120a;
    public int b = -1;

    static {
        t2o.a(352322009);
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57c26e68", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("517f71f8", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58aff94c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45a248ad", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean E() {
        NewDetailMaskFrameLayout newDetailMaskFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a15e60fe", new Object[]{this})).booleanValue();
        }
        if (this.b == -1 && (newDetailMaskFrameLayout = this.f23120a) != null) {
            this.b = newDetailMaskFrameLayout.animItemIsRunning() ? 1 : 0;
        }
        if (this.b == 1) {
            return true;
        }
        return false;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b08c31b9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d172c5b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9ea9c23", new Object[]{this})).booleanValue();
        }
        if (E()) {
            return true;
        }
        return false;
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c245bf9", new Object[]{this})).booleanValue();
        }
        if (f()) {
            return false;
        }
        return true;
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("966081bf", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75a85d94", new Object[]{this, str, str2});
        } else {
            Log.e(str, str2);
        }
    }

    public void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91eb9ae1", new Object[]{this, str, str2, th});
        } else {
            Log.e(str, str2, th);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd395fda", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fda44fa5", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f123bb74", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee65c79e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("701fb09c", new Object[]{this})).intValue();
        }
        return 10;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6421f56", new Object[]{this})).intValue();
        }
        return 460;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6428b2", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4629b9ac", new Object[]{this})).intValue();
        }
        return 17;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5366272a", new Object[]{this})).intValue();
        }
        return -2;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f32ae7b5", new Object[]{this})).intValue();
        }
        return 12;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71e80ab3", new Object[]{this})).intValue();
        }
        return 32;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fec598ca", new Object[]{this});
        }
        return "无极缩放Default";
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2339b08f", new Object[]{this})).intValue();
        }
        return 80;
    }

    public float p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2bc17881", new Object[]{this})).floatValue();
        }
        if (A()) {
            return 1.5f;
        }
        if (w()) {
            return 3.0f;
        }
        return 1.8f;
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3304b26", new Object[]{this})).intValue();
        }
        return 10;
    }

    public int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e166ebf", new Object[]{this})).intValue();
        }
        return 201;
    }

    public int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9de920a", new Object[]{this})).intValue();
        }
        return 300;
    }

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d2ff5b6", new Object[]{this})).intValue();
        }
        return 92;
    }

    public float u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f69808a5", new Object[]{this})).floatValue();
        }
        if (A()) {
            return 1.5f;
        }
        if (w()) {
            return 4.0f;
        }
        return 0.3f;
    }

    public TimeInterpolator v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeInterpolator) ipChange.ipc$dispatch("86291875", new Object[]{this});
        }
        return new AccelerateDecelerateInterpolator();
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ec0c03d", new Object[]{this})).booleanValue();
        }
        if (r() == 201) {
            return true;
        }
        return false;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdf9c9cb", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2016d0c7", new Object[]{this});
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d01d14", new Object[]{this});
        }
    }
}
