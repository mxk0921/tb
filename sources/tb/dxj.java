package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dxj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_MODULE = "AliNewDetailExtend";
    public static k0d f;

    /* renamed from: a  reason: collision with root package name */
    public final gnm f18134a = new gnm();
    public final jnm b = new jnm();
    public final exj c = new exj();
    public final gxo d = new gxo();
    public final String e;

    public dxj(String str) {
        this.e = str.concat(String.valueOf(hashCode()));
        b();
    }

    public static void f(k0d k0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c75327ac", new Object[]{k0dVar});
        } else {
            f = k0dVar;
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e382c8cc", new Object[]{this});
        }
        return this.e;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e610d4f0", new Object[]{this});
            return;
        }
        k0d k0dVar = f;
        if (k0dVar == null) {
            TLog.loge("AliNewDetailExtend", "NewDetailController", "initNewDetailExtendHelper sNewDetailExtendHandler is null!");
        } else {
            ((yq0) k0dVar).g(this);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbe9ac15", new Object[]{this})).booleanValue();
        }
        return this.b.a();
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f514fa", new Object[]{this, new Boolean(z)});
        } else {
            this.c.a(z);
        }
    }

    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b6af97", new Object[]{this, context});
        } else {
            this.b.b(context);
        }
    }

    public void g(ncd ncdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afaaa2ec", new Object[]{this, ncdVar});
            return;
        }
        gnm gnmVar = this.f18134a;
        if (gnmVar == null) {
            TLog.loge("AliNewDetailExtend", "NewDetailController", "registerPreloadMtopHandler mPreLoadMtopManager is null!");
        } else {
            gnmVar.a(ncdVar);
        }
    }

    public void h(vcd vcdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee40b34c", new Object[]{this, vcdVar});
            return;
        }
        jnm jnmVar = this.b;
        if (jnmVar == null) {
            TLog.loge("AliNewDetailExtend", "NewDetailController", "registerPreloadWeexHandler mPreLoadWeexManager is null!");
        } else {
            jnmVar.c(vcdVar);
        }
    }

    public void i(gnd gndVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14991a6c", new Object[]{this, gndVar});
            return;
        }
        gxo gxoVar = this.d;
        if (gxoVar == null) {
            TLog.loge("AliNewDetailExtend", "NewDetailController", "registerScreenValueHandler mScreenValueManager is null!");
        } else {
            gxoVar.a(gndVar);
        }
    }
}
