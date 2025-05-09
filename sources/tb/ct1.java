package tb;

import android.content.Context;
import com.alibaba.android.ultron.trade.data.request.DataInfo;
import com.alibaba.android.ultron.trade.data.request.PageInfo;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.LinkageType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ct1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f17296a;
    public final fdd b;
    public fsb c;
    public kcu d;
    public final List<b> e = new ArrayList();
    public final List<a> f = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        void a(PageInfo pageInfo, DataInfo dataInfo);
    }

    static {
        t2o.a(155189363);
    }

    public ct1(fdd fddVar) {
        if (fddVar != null) {
            this.b = fddVar;
            this.f17296a = fddVar.getContext();
            e();
            return;
        }
        throw new IllegalArgumentException("param presenter can not be null");
    }

    public List<a> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("141234da", new Object[]{this});
        }
        return this.f;
    }

    public List<b> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1efdf47", new Object[]{this});
        }
        return this.e;
    }

    public fsb c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsb) ipChange.ipc$dispatch("b8d7dd5a", new Object[]{this});
        }
        return this.c;
    }

    public kcu d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kcu) ipChange.ipc$dispatch("b6417b2a", new Object[]{this});
        }
        return this.d;
    }

    public abstract void e();

    public void f(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ca50748", new Object[]{this, list});
        } else if (list != null && list.size() >= 1) {
            for (JSONObject jSONObject : list) {
                mrl mrlVar = new mrl();
                fsb fsbVar = this.c;
                if (fsbVar instanceof u55) {
                    mrlVar.a((u55) fsbVar, jSONObject, null);
                }
            }
            vx.b(this, this.c, this.f17296a, false);
        }
    }

    public void g(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fbb6018", new Object[]{this, iDMComponent});
        } else {
            h(iDMComponent, null);
        }
    }

    public void h(IDMComponent iDMComponent, lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4bdcd", new Object[]{this, iDMComponent, lcuVar});
        } else {
            i(iDMComponent, lcuVar, true, null, null);
        }
    }

    public void i(IDMComponent iDMComponent, lcu lcuVar, boolean z, ux uxVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd115d8", new Object[]{this, iDMComponent, lcuVar, new Boolean(z), uxVar, obj});
        } else if (iDMComponent != null) {
            if (iDMComponent.getLinkageType() == LinkageType.REFRESH) {
                this.b.e().G();
            } else {
                j(iDMComponent, lcuVar, z, uxVar, obj);
            }
        }
    }

    public abstract void j(IDMComponent iDMComponent, lcu lcuVar, boolean z, ux uxVar, Object obj);

    public void k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe571a3", new Object[]{this, aVar});
        } else {
            ((ArrayList) this.f).add(aVar);
        }
    }

    public void l(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89845e12", new Object[]{this, bVar});
        } else {
            ((ArrayList) this.e).add(bVar);
        }
    }

    public void m(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d02e4", new Object[]{this, fsbVar});
        } else {
            this.c = fsbVar;
        }
    }

    public void n(kcu kcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c8797aa", new Object[]{this, kcuVar});
        } else {
            this.d = kcuVar;
        }
    }
}
