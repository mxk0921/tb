package tb;

import android.app.Application;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.ejv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class s7j implements n6e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEGRADE = "degrade";

    /* renamed from: a  reason: collision with root package name */
    public final ejv f27843a;
    public a c;
    public b d;
    public final List<ijv> b = new ArrayList();
    public final gdh e = fih.getLog(s7j.class, (gdh) null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void onDegrade();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void hasUpdate(String str);

        void noUpdate();
    }

    static {
        t2o.a(950009896);
        t2o.a(950009863);
    }

    public s7j(Application application, String str, String str2, boolean z) {
        this.f27843a = ejv.b.newBuilder(application).setTtid(str).setGroup(str2).setOutApk(z).setFrom(from()).build();
    }

    @Override // tb.n6e
    public void dispatchUpdate(String str, boolean z, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6221f5", new Object[]{this, str, new Boolean(z), str2, strArr});
            return;
        }
        Iterator it = new ArrayList(this.b).iterator();
        while (it.hasNext()) {
            ((ijv) it.next()).onUpdate(str, null, z, str2, strArr);
        }
    }

    @Override // tb.n6e
    public String from() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dad658f", new Object[]{this});
        }
        return gjv.MTOP_SOURCE;
    }

    @Override // tb.n6e
    public void registerDataListener(ijv ijvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6319f22", new Object[]{this, ijvVar});
            return;
        }
        synchronized (this.b) {
            ((ArrayList) this.b).add(ijvVar);
        }
    }

    public s7j setDegradeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s7j) ipChange.ipc$dispatch("a265935b", new Object[]{this, aVar});
        }
        this.c = aVar;
        return this;
    }

    public s7j setMtopDataListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s7j) ipChange.ipc$dispatch("e112dbc5", new Object[]{this, bVar});
        }
        this.d = bVar;
        return this;
    }

    @Override // tb.n6e
    public void unRegisterDataListener(ijv ijvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d6321b", new Object[]{this, ijvVar});
            return;
        }
        synchronized (this.b) {
            ((ArrayList) this.b).remove(ijvVar);
        }
    }

    public void startUpdate(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5102cd2", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.e.e("UpdateSDK use old mtop update");
        System.setProperty("update_patch", "send UpdateRequest");
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject queryUpdateInfo = this.f27843a.queryUpdateInfo(z);
        if (queryUpdateInfo != null && queryUpdateInfo.containsKey("hasUpdate") && queryUpdateInfo.getBooleanValue("hasUpdate")) {
            vtl.stat(true, "request", System.currentTimeMillis() - currentTimeMillis, 0, "", 0L);
            gdh gdhVar = this.e;
            gdhVar.e("dispatch mtop response:" + queryUpdateInfo.toJSONString());
            System.setProperty("update_patch", "pulled data:" + queryUpdateInfo.toJSONString());
            b bVar = this.d;
            if (bVar != null) {
                bVar.hasUpdate(queryUpdateInfo.toJSONString());
            }
            dispatchUpdate(from(), z, queryUpdateInfo.toJSONString(), new String[0]);
        } else if (queryUpdateInfo == null || !queryUpdateInfo.containsKey("degrade")) {
            b bVar2 = this.d;
            if (bVar2 != null) {
                bVar2.noUpdate();
            }
        } else {
            a aVar = this.c;
            if (aVar != null) {
                aVar.onDegrade();
            }
        }
    }
}
