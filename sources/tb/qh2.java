package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.mmad.TopShowBootImage;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.rhq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qh2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<hkb> f26748a = new LinkedList<>();
    public hkb b;

    static {
        t2o.a(736100383);
    }

    public qh2(mjb mjbVar) {
        i();
        c(mjbVar);
    }

    public final void b(String str, lh2 lh2Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b84cac", new Object[]{this, str, lh2Var, new Integer(i)});
            return;
        }
        List<JSONObject> i2 = lh2Var.i(str);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(i2);
        if (i2 != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<hkb> it = this.f26748a.iterator();
            while (it.hasNext()) {
                hkb next = it.next();
                if (TextUtils.equals(next.getBusinessCode(), str)) {
                    next.onDownload(copyOnWriteArrayList, i);
                }
            }
        }
    }

    public final void c(mjb mjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ce0045", new Object[]{this, mjbVar});
            return;
        }
        Iterator<hkb> it = this.f26748a.iterator();
        while (it.hasNext()) {
            it.next().instantiate(mjbVar);
        }
    }

    public void d(BootImageInfo bootImageInfo, ei2 ei2Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("529c79f3", new Object[]{this, bootImageInfo, ei2Var, new Integer(i)});
            return;
        }
        tm1.a("2ARCH_DispatcherCenter", "onCreateView: ");
        hkb hkbVar = this.b;
        if (hkbVar == null) {
            tm1.a("2ARCH_DispatcherCenter", "onCreateView business bootImage null: ");
        } else {
            hkbVar.onCreateView(bootImageInfo, ei2Var, i);
        }
    }

    public void e(lh2 lh2Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47b9fde", new Object[]{this, lh2Var, new Integer(i)});
            return;
        }
        tm1.a("2ARCH_DispatcherCenter", "onDownLoad: ");
        b(nwi.BIZ_CODE, lh2Var, i);
        b("TopView", lh2Var, i);
        b("Market", lh2Var, i);
    }

    public void f(lh2 lh2Var, int i, acc accVar, int i2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("720c79dc", new Object[]{this, lh2Var, new Integer(i), accVar, new Integer(i2)});
            return;
        }
        tm1.a("2ARCH_DispatcherCenter", "onStart currentIndex: " + i2);
        usg.d().b().m();
        if (a(i2)) {
            tm1.a("2ARCH_DispatcherCenter", "onStart: businessBootImage isInvalid handle next");
            if (accVar != null) {
                ((rhq.a) accVar).a();
                return;
            }
            return;
        }
        List<JSONObject> i3 = lh2Var.i(this.b.getBusinessCode());
        if (i3.isEmpty()) {
            tm1.a("2ARCH_DispatcherCenter", "onStart: data null:" + this.b.getBusinessCode());
            if (accVar != null) {
                ((rhq.a) accVar).a();
                return;
            }
            return;
        }
        tm1.a("2ARCH_DispatcherCenter", "onStart BusinessCode " + this.b.getBusinessCode());
        if (accVar != null) {
            ((rhq.a) accVar).b();
        }
        wzi e = usg.d().e();
        if (i == 1000) {
            str = "ColdStart";
        } else {
            str = "HotStart";
        }
        e.c(wzi.LAUNCHER, "Actual".concat(str), "", "", "", "");
        this.b.onStart(i3, i);
    }

    public void g(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cfaf3a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        tm1.a("2ARCH_DispatcherCenter", "onTerminate : ");
        hkb hkbVar = this.b;
        if (hkbVar != null) {
            hkbVar.onTerminate(i, i2, i3);
        }
    }

    public void h(ei2 ei2Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fc759ce", new Object[]{this, ei2Var, new Integer(i)});
            return;
        }
        tm1.a("2ARCH_DispatcherCenter", "onViewShown: ");
        hkb hkbVar = this.b;
        if (hkbVar == null) {
            tm1.a("2ARCH_DispatcherCenter", "onCreateView business bootImage null: ");
        } else {
            hkbVar.onViewShown(ei2Var, i);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("305d3fad", new Object[]{this});
            return;
        }
        j();
        this.f26748a.add(new s4i());
    }

    public final void j() {
        try {
            tm1.a("2ARCH_DispatcherCenter", "registerTopShowBootImage start create TopShowBootImage. ");
            IpChange ipChange = TopShowBootImage.$ipChange;
            this.f26748a.add((hkb) TopShowBootImage.class.newInstance());
            tm1.a("2ARCH_DispatcherCenter", "registerTopShowBootImage create end. ");
        } catch (Throwable th) {
            tm1.b("2ARCH_DispatcherCenter", "registerTopShowBootImage error: ", th);
            Log.e("BootImage", "registerTopShowBootImage error:" + th);
            th.printStackTrace();
        }
    }

    public final boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3524f3ea", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i >= this.f26748a.size()) {
            tm1.a("2ARCH_DispatcherCenter", "onStart reSet currentIndex: " + i);
            return false;
        }
        hkb hkbVar = this.f26748a.get(i);
        this.b = hkbVar;
        return hkbVar == null;
    }
}
