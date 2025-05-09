package tb;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.widgets.LCBubble;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.dov;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class b8g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public yke f16245a;
    public v8e b;
    public final Map<String, MutableLiveData> c = new HashMap();
    public Context d;

    static {
        t2o.a(511705530);
    }

    public abstract void A(e8g e8gVar);

    public abstract void B(LCBubble lCBubble, LCBubble.h hVar);

    public abstract void C();

    public abstract void D(boolean z);

    public abstract void E(String str);

    public abstract void F(CharSequence charSequence);

    public void f(yke ykeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75524f8c", new Object[]{this, ykeVar});
        } else {
            this.f16245a = ykeVar;
        }
    }

    public void g(v8e v8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40be9131", new Object[]{this, v8eVar});
        } else {
            this.b = v8eVar;
        }
    }

    public abstract void h();

    public abstract b8g i();

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue();
        }
        yke ykeVar = this.f16245a;
        if (ykeVar != null) {
            return ykeVar.j();
        }
        return 0;
    }

    public <T extends u1c> T k(Class<T> cls) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((u1c) ipChange.ipc$dispatch("469b4237", new Object[]{this, cls}));
        }
        ydc m = m();
        if (m == null) {
            z = true;
        } else {
            z = false;
        }
        odg.b(RPCDataItems.SWITCH_TAG_LOG, "aYou thumbnailL onDestroy, LCContext ,imageEditor==null is=" + z);
        if (m != null) {
            return m;
        }
        return t();
    }

    public <T extends u1c> List<T> l(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("508c2512", new Object[]{this, cls});
        }
        ArrayList arrayList = new ArrayList();
        v8e v8eVar = this.b;
        if (v8eVar != null) {
            arrayList.add(v8eVar);
        } else {
            yke ykeVar = this.f16245a;
            if (ykeVar != null) {
                arrayList.addAll(ykeVar.h());
            }
        }
        return arrayList;
    }

    public ydc m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ydc) ipChange.ipc$dispatch("7af793c4", new Object[]{this});
        }
        yke ykeVar = this.f16245a;
        if (ykeVar == null) {
            return null;
        }
        return ykeVar.f();
    }

    public yke n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yke) ipChange.ipc$dispatch("46d9fb6b", new Object[]{this});
        }
        return this.f16245a;
    }

    public abstract MutableLiveData o(String str);

    public Context p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("8667574", new Object[]{this});
        }
        return this.d;
    }

    public abstract dov.a q();

    public abstract String r();

    public abstract c5e s();

    public v8e t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v8e) ipChange.ipc$dispatch("b04a5d84", new Object[]{this});
        }
        return this.b;
    }

    public abstract void u();

    public abstract boolean v();

    public abstract boolean w(View view);

    public abstract boolean x();

    public abstract void y();

    public abstract void z(View view, yic yicVar);
}
