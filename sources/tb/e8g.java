package tb;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.widgets.LCBubble;
import java.util.HashMap;
import java.util.List;
import tb.dov;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e8g extends b8g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public b8g e;

    static {
        t2o.a(511705534);
        t2o.a(511705485);
    }

    public e8g() {
        new HashMap();
        new HashMap();
        new HashMap();
    }

    public static /* synthetic */ Object ipc$super(e8g e8gVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/framework/context/LCContextWrapper");
    }

    @Override // tb.b8g
    public void A(e8g e8gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("696e10c9", new Object[]{this, e8gVar});
        } else {
            this.e.A(e8gVar);
        }
    }

    @Override // tb.b8g
    public void B(LCBubble lCBubble, LCBubble.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207de11a", new Object[]{this, lCBubble, hVar});
        } else {
            this.e.B(lCBubble, hVar);
        }
    }

    @Override // tb.b8g
    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
        } else {
            this.e.C();
        }
    }

    @Override // tb.b8g
    public void D(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed9df0e", new Object[]{this, new Boolean(z)});
        } else {
            this.e.D(z);
        }
    }

    @Override // tb.b8g
    public void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864ba978", new Object[]{this, str});
        } else {
            this.e.E(str);
        }
    }

    @Override // tb.b8g
    public void F(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e90ae82b", new Object[]{this, charSequence});
        } else {
            this.e.F(charSequence);
        }
    }

    public void G(b8g b8gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cafef61", new Object[]{this, b8gVar});
            return;
        }
        this.e = b8gVar;
        this.d = b8gVar.d;
    }

    public <T> void I(String str, Observer<T> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1c369d", new Object[]{this, str, observer});
        } else {
            this.e.o(str).observe((LifecycleOwner) this.d, observer);
        }
    }

    public void J(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    public <T> void K(String str, Observer<T> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8963697f", new Object[]{this, str, observer});
        } else {
            this.e.o(str).removeObserver(observer);
        }
    }

    public <T> void L(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9cd65", new Object[]{this, str, t});
        } else {
            this.e.o(str).setValue(t);
        }
    }

    public b8g b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8g) ipChange.ipc$dispatch("1fc04f17", new Object[]{this});
        }
        return this;
    }

    @Override // tb.b8g
    public void g(v8e v8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40be9131", new Object[]{this, v8eVar});
        } else {
            this.e.g(v8eVar);
        }
    }

    @Override // tb.b8g
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cb6573", new Object[]{this});
        } else {
            this.e.h();
        }
    }

    @Override // tb.b8g
    public b8g i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8g) ipChange.ipc$dispatch("43afadc8", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.b8g
    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue();
        }
        return this.e.j();
    }

    @Override // tb.b8g
    public <T extends u1c> T k(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((u1c) ipChange.ipc$dispatch("469b4237", new Object[]{this, cls}));
        }
        return (T) this.e.k(cls);
    }

    @Override // tb.b8g
    public <T extends u1c> List<T> l(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("508c2512", new Object[]{this, cls});
        }
        return this.e.l(cls);
    }

    @Override // tb.b8g
    public yke n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yke) ipChange.ipc$dispatch("46d9fb6b", new Object[]{this});
        }
        return this.e.n();
    }

    @Override // tb.b8g
    @Deprecated
    public MutableLiveData o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLiveData) ipChange.ipc$dispatch("36e99b37", new Object[]{this, str});
        }
        return this.e.o(str);
    }

    @Override // tb.b8g
    public dov.a q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dov.a) ipChange.ipc$dispatch("2cbf1799", new Object[]{this});
        }
        return this.e.q();
    }

    @Override // tb.b8g
    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("648be081", new Object[]{this});
        }
        return this.e.r();
    }

    @Override // tb.b8g
    public c5e s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c5e) ipChange.ipc$dispatch("1ebed9f4", new Object[]{this});
        }
        return this.e.s();
    }

    @Override // tb.b8g
    public v8e t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v8e) ipChange.ipc$dispatch("b04a5d84", new Object[]{this});
        }
        return this.e.t();
    }

    @Override // tb.b8g
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
        } else {
            this.e.u();
        }
    }

    @Override // tb.b8g
    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57054a76", new Object[]{this})).booleanValue();
        }
        return this.e.v();
    }

    @Override // tb.b8g
    public boolean w(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50a2a524", new Object[]{this, view})).booleanValue();
        }
        return this.e.w(view);
    }

    @Override // tb.b8g
    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeebd8b1", new Object[]{this})).booleanValue();
        }
        return this.e.x();
    }

    @Override // tb.b8g
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            this.e.y();
        }
    }

    @Override // tb.b8g
    public void z(View view, yic yicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e84581d", new Object[]{this, view, yicVar});
        } else {
            this.e.z(view, yicVar);
        }
    }
}
