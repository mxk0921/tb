package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.binder.AsyncBitmapBinder;
import com.taobao.android.nav.binder.BitmapBinder;
import com.taobao.android.nav.binder.SyncBitmapBinder;
import com.taobao.android.nav.jump.JumpAbility;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zmj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f32869a;
    public Bundle f;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public String l;
    public String m;
    public Fragment n;
    public int[] p;
    public boolean q;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public int g = -1;
    public String o = JumpAbility.JUMP_ABILITY_DEFAULT;
    public Bundle e = null;

    static {
        t2o.a(578814047);
    }

    public zmj(Context context) {
        this.f32869a = context;
    }

    public void A(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c434e84", new Object[]{this, new Boolean(z), str});
            return;
        }
        TLog.loge("NavContext", "setSkipFollowProcessors By: " + str);
        this.b = z;
    }

    public void B(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b9f4a08", new Object[]{this, new Boolean(z), str});
            return;
        }
        TLog.loge("NavContext", "setSkipJump By: " + str);
        this.c = z;
    }

    public void C(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39425920", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void D(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50bf8a4b", new Object[]{this, drawable});
        } else {
            b().putBinder("view_source_drawable", new BitmapBinder(drawable));
        }
    }

    public void F(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b551353e", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.p = new int[]{i, i2};
        }
    }

    public void G(ueu ueuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee857698", new Object[]{this, ueuVar});
        } else if (ueuVar != null) {
            Bundle b = b();
            RectF h = ueuVar.h();
            b.putFloat("view_screen_start_x", h.left);
            b.putFloat("view_screen_start_y", h.top);
            b.putFloat("view_height", h.height());
            b.putFloat("view_width", h.width());
            b.putBinder("view_screenshot", ueuVar.g());
        }
    }

    public void H(View view, boolean z) {
        IBinder iBinder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb7d3470", new Object[]{this, view, new Boolean(z)});
        } else if (view != null && (this.f32869a instanceof Activity)) {
            Bundle b = b();
            if (z) {
                iBinder = new AsyncBitmapBinder(view);
            } else {
                iBinder = new SyncBitmapBinder(view);
            }
            b.putBinder("view_screenshot", iBinder);
            E(view);
        }
    }

    public void I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c9c8012", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public Bundle a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("88145fed", new Object[]{this});
        }
        return this.f;
    }

    public final Bundle b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("b172da1f", new Object[]{this});
        }
        if (this.f == null) {
            this.f = new Bundle();
        }
        return this.f;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this});
        }
        return this.m;
    }

    public Context d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f32869a;
    }

    public Fragment e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("34dee721", new Object[]{this});
        }
        return this.n;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81b006b9", new Object[]{this});
        }
        return this.o;
    }

    public Bundle g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("d234f1f3", new Object[]{this});
        }
        return this.e;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[]{this});
        }
        return this.l;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ae49d60", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b2f2e80", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e025f95e", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("958963fb", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf5c5364", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab2f47a6", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87a2fea2", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0310f00", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9652fba0", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373579b2", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e077d9f2", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae165185", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "NavContext{mContext=" + this.f32869a + ", mSkipFollowProcessors=" + this.b + ", mSkipJump=" + this.c + ", mSkipAllProcessors=" + this.d + ", mOptions=" + this.e + ", mRequestCode=" + this.g + ", mAllowLeaving=" + this.h + ", mDisallowLoopback=" + this.i + ", mDisableTransition=" + this.j + ", mSkipPreProcess=" + this.k + ", mPackageName='" + this.l + "', mClassName='" + this.m + "', mFragment='" + this.n + "', mJumpAbilityType='" + this.o + "'}";
    }

    public void u(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ddd551", new Object[]{this, fragment});
        } else {
            this.n = fragment;
        }
    }

    public void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e78a545", new Object[]{this, str});
            return;
        }
        Log.e("NavContext", "setJumpAbilityType: " + str);
        this.o = str;
    }

    public void w(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43204591", new Object[]{this, bundle});
        } else {
            this.e = bundle;
        }
    }

    public void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2292780", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public void y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5ac1842", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e80cc0ac", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void E(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f3839d4", new Object[]{this, view});
        } else if (view != null) {
            Bundle b = b();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            b.putFloat("view_screen_start_x", iArr[0]);
            b.putFloat("view_screen_start_y", iArr[1]);
            b.putFloat("view_height", view.getHeight());
            b.putFloat("view_width", view.getWidth());
        }
    }
}
