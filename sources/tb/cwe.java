package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import mtopsdk.mtop.intf.MtopPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cwe implements nfc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ft6 f17366a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements dyb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(cwe cweVar) {
        }

        @Override // tb.dyb
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("11ef60b8", new Object[]{this})).booleanValue();
            }
            return false;
        }
    }

    static {
        t2o.a(487587946);
        t2o.a(487587945);
    }

    public cwe(String str, dyb dybVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f17366a = new ft6(str, new gt6(), dybVar);
        i65.c("qinren", "DataSourceEngine use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
    }

    @Override // tb.nfc
    public void a(xn4 xn4Var, MtopPrefetch.IPrefetchCallback iPrefetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5786f0d2", new Object[]{this, xn4Var, iPrefetchCallback});
        } else {
            this.f17366a.g(xn4Var, iPrefetchCallback);
        }
    }

    @Override // tb.nfc
    public boolean b(xn4 xn4Var, vqb vqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("665a1be6", new Object[]{this, xn4Var, vqbVar})).booleanValue();
        }
        return this.f17366a.c(xn4Var, vqbVar);
    }

    @Override // tb.nfc
    public AwesomeGetContainerData c(xn4 xn4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerData) ipChange.ipc$dispatch("6c889dea", new Object[]{this, xn4Var});
        }
        return this.f17366a.a(xn4Var);
    }

    @Override // tb.nfc
    public BaseSectionModel<?> createBaseSectionModel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("f9f699c6", new Object[]{this, jSONObject});
        }
        return new SectionModel(jSONObject);
    }

    @Override // tb.nfc
    public boolean d(xn4 xn4Var, eee eeeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ce8f848", new Object[]{this, xn4Var, eeeVar})).booleanValue();
        }
        return this.f17366a.e(xn4Var, eeeVar);
    }

    @Override // tb.nfc
    public void e(xn4 xn4Var, MtopPrefetch.IPrefetchCallback iPrefetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f9c0d9", new Object[]{this, xn4Var, iPrefetchCallback});
        } else {
            this.f17366a.d(xn4Var, iPrefetchCallback);
        }
    }

    @Override // tb.nfc
    public boolean f(String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("362fbf08", new Object[]{this, str, strArr, jSONObject})).booleanValue();
        }
        return this.f17366a.f(str, strArr, jSONObject);
    }

    public final dyb g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dyb) ipChange.ipc$dispatch("ea9827f9", new Object[]{this});
        }
        return new a(this);
    }

    @Override // tb.nfc
    public b6d getPageInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b6d) ipChange.ipc$dispatch("64f2a92e", new Object[]{this});
        }
        return this.f17366a.b();
    }

    public cwe(String str, boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f17366a = new ft6(str, new gt6(), g(), z);
        i65.c("qinren", "DataSourceEngine use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
    }

    public cwe(String str, iyb iybVar, dyb dybVar, boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        dybVar = dybVar == null ? g() : dybVar;
        if (iybVar == null) {
            iybVar = new gt6();
            rj7.c(iybVar.a().getApplication());
        }
        this.f17366a = new ft6(str, iybVar, dybVar, z);
        i65.c("qinren", "DataSourceEngine use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
    }
}
