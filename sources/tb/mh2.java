package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import java.util.List;
import tb.psg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mh2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final mjb f24037a;
    public nwi b;

    static {
        t2o.a(573571073);
    }

    public mh2(mjb mjbVar) {
        this.f24037a = mjbVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e539127", new Object[]{this});
        } else {
            this.f24037a.f();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4073ee", new Object[]{this});
        } else {
            this.f24037a.h();
        }
    }

    public void c(List<qt7> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9930d73", new Object[]{this, list, str});
        } else {
            this.f24037a.i(list, str);
        }
    }

    public void d(BootImageInfo bootImageInfo, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d6b375", new Object[]{this, bootImageInfo, new Integer(i), new Integer(i2)});
        } else {
            this.f24037a.d(bootImageInfo, i, i2);
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29190544", new Object[]{this, new Integer(i)});
            return;
        }
        this.f24037a.b(i);
        nwi nwiVar = this.b;
        if (nwiVar != null && nwiVar.d() != null) {
            this.b.d().p();
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fab6572", new Object[]{this, new Integer(i)});
        } else {
            this.f24037a.c(i);
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83eb919", new Object[]{this, new Integer(i)});
        } else {
            this.f24037a.a(i);
        }
    }

    public void h(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f65a079d", new Object[]{this, nwiVar});
        } else {
            this.b = nwiVar;
        }
    }

    public boolean i(psg.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("932c859d", new Object[]{this, aVar})).booleanValue();
        }
        return this.f24037a.e(aVar);
    }

    public boolean j(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cac902e", new Object[]{this, jSONObject, new Integer(i)})).booleanValue();
        }
        return this.f24037a.g(jSONObject, i);
    }
}
