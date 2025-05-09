package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class l12 implements qtd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lcu f23048a;
    public Context b;
    public fdd c;
    public fsb d;
    public IDMComponent e;
    public boolean f = false;
    public int g = 200;
    public long h = 0;
    public String i = "";

    static {
        t2o.a(155189307);
        t2o.a(155189330);
    }

    @Override // tb.qtd
    public void a(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaee5f8e", new Object[]{this, lcuVar});
        } else if (lcuVar == null) {
            hav.g("DX事件", "BaseSubscriber", "event is null");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.h >= this.g || !this.f || !this.i.equals(lcuVar.d())) {
                this.h = currentTimeMillis;
                this.i = lcuVar.d();
                this.f23048a = lcuVar;
                this.b = lcuVar.b();
                fdd f = lcuVar.f();
                this.c = f;
                if (this.b == null || f == null) {
                    hav.g("DX事件", "BaseSubscriber", "context or presenter is null,eventType=", this.i);
                    return;
                }
                this.d = f.b();
                IDMComponent a2 = lcuVar.a();
                this.e = a2;
                if (a2 != null) {
                    a2.updateModifiedCount();
                }
                j(lcuVar);
                return;
            }
            hav.g("DX事件", "BaseSubscriber", "事件触发太频繁,eventType=", lcuVar.d());
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b09fa9", new Object[]{this});
        } else {
            this.f = true;
        }
    }

    public JSONObject c() {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bd54c1e4", new Object[]{this});
        }
        gsb g = g();
        if (g == null || (fields = g.getFields()) == null) {
            return null;
        }
        return fields;
    }

    public <T> T d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("37f60f1d", new Object[]{this, str});
        }
        lcu lcuVar = this.f23048a;
        if (lcuVar == null) {
            return null;
        }
        return (T) lcuVar.e(str);
    }

    public final <T> T e(String str, int i) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("741df2c2", new Object[]{this, str, new Integer(i)});
        }
        lcu lcuVar = this.f23048a;
        if (lcuVar == null) {
            return null;
        }
        Object e = lcuVar.e(str);
        if (e instanceof Object[]) {
            list = Arrays.asList((Object[]) e);
        } else if (e instanceof List) {
            list = (List) e;
        } else {
            list = null;
        }
        if (list == null || i >= list.size()) {
            return null;
        }
        return (T) list.get(i);
    }

    public <T> T f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3ea6cfd6", new Object[]{this, new Integer(i)});
        }
        return (T) e("extraParams", i);
    }

    public gsb g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("4b3e610c", new Object[]{this});
        }
        lcu lcuVar = this.f23048a;
        if (lcuVar == null) {
            return null;
        }
        Object c = lcuVar.c();
        if (c instanceof gsb) {
            return (gsb) c;
        }
        return null;
    }

    public <T> T h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("54577d17", new Object[]{this, new Integer(i)});
        }
        return (T) e("viewParams", i);
    }

    public abstract void j(lcu lcuVar);

    public boolean k(IDMComponent iDMComponent, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3881a6ae", new Object[]{this, iDMComponent, map})).booleanValue();
        }
        if (!(map == null || map.isEmpty() || iDMComponent == null)) {
            try {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    iDMComponent.getFields().put(entry.getKey(), entry.getValue());
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public boolean l(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eae22cf0", new Object[]{this, map})).booleanValue();
        }
        return k(this.e, map);
    }

    public boolean m(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0465db3", new Object[]{this, map})).booleanValue();
        }
        return n(g(), map);
    }

    public boolean n(gsb gsbVar, Map<String, ? extends Object> map) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("489620a8", new Object[]{this, gsbVar, map})).booleanValue();
        }
        if (map == null || map.isEmpty() || gsbVar == null || (fields = gsbVar.getFields()) == null) {
            return false;
        }
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            fields.put(entry.getKey(), entry.getValue());
        }
        return true;
    }

    public void o() {
        JSONObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc39e12a", new Object[]{this});
        } else if (this.e != null && (c = c()) != null) {
            String string = c.getString("action");
            if (!TextUtils.isEmpty(string)) {
                this.e.setAdjustOperatorAction(string);
            }
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b8f75a0", new Object[]{this})).booleanValue();
        }
        JSONObject c = c();
        return c != null && c.getBooleanValue("request");
    }
}
