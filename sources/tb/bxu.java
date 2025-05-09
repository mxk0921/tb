package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bxu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f16708a;
    public String b;
    public final txu c;
    public final AURARenderComponent d;
    public Object[] e;
    public DXEvent f;
    public f8v g;

    static {
        t2o.a(80740747);
    }

    public bxu(String str, txu txuVar, AURARenderComponent aURARenderComponent, Object[] objArr) {
        this.c = txuVar;
        this.d = aURARenderComponent;
        h(objArr);
    }

    public Object[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("60d4303b", new Object[]{this});
        }
        return this.e;
    }

    public DXEvent b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEvent) ipChange.ipc$dispatch("7b6015c1", new Object[]{this});
        }
        return this.f;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3369a89", new Object[]{this});
        }
        return this.b;
    }

    public f8v d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8v) ipChange.ipc$dispatch("558f0945", new Object[]{this});
        }
        return this.g;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return this.f16708a;
    }

    public AURARenderComponent f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("659b1b43", new Object[]{this});
        }
        return this.d;
    }

    public txu g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (txu) ipChange.ipc$dispatch("e808fe32", new Object[]{this});
        }
        return this.c;
    }

    public void i(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460b98ad", new Object[]{this, dXEvent});
        } else {
            this.f = dXEvent;
        }
    }

    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76e061b8", new Object[]{this, jSONObject});
        }
    }

    public void k(f8v f8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65cbeb5", new Object[]{this, f8vVar});
        } else {
            this.g = f8vVar;
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e513c3", new Object[]{this, str});
        } else {
            this.f16708a = str;
        }
    }

    public void h(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e6180b", new Object[]{this, objArr});
            return;
        }
        this.e = objArr;
        if (objArr.length < 1) {
            dxu.a().e("UMFEventModel", "setArgs#eventFlag is empty");
            return;
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            this.b = (String) obj;
        } else {
            dxu.a().e("UMFEventModel", "setArgs#eventFlag is empty");
        }
    }
}
