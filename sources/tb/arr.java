package tb;

import android.text.TextUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.util.RequestConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.norm.INewConfigAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.tbpoplayer.info.CdnConfigModel;
import java.util.Map;
import java.util.Set;
import tb.egm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class arr implements INewConfigAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public egm f15965a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends TypeReference<Map<String, Set<String>>> {
        public a(arr arrVar) {
        }
    }

    static {
        t2o.a(790626347);
        t2o.a(625999974);
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("64e31501", new Object[]{this});
        }
        String g = a9l.w().g();
        if (TextUtils.isEmpty(g)) {
            return "https://poplayer.template.alibaba.com/popcdn/1/config.json";
        }
        return g;
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public String getConfigItemById(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22f8c3b2", new Object[]{this, str});
        }
        return this.f15965a.b(str);
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public Set<String> getConfigsIdSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("74182602", new Object[]{this});
        }
        return this.f15965a.d();
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public String getCurConfigVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a14762d", new Object[]{this});
        }
        return this.f15965a.c();
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public Map<String, Set<String>> getUriConfigsMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5b40cd3d", new Object[]{this});
        }
        try {
            return (Map) JSON.parseObject(this.f15965a.f(), new a(this), new Feature[0]);
        } catch (Throwable th) {
            wdm.h("TBNewConfigAdapter.getUriConfigsMap.error", th);
            return null;
        }
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.f15965a = new egm();
        }
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public void startFetchConfig(final opb opbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98c2028a", new Object[]{this, opbVar});
        } else {
            hst.b(new Runnable() { // from class: tb.zqr
                @Override // java.lang.Runnable
                public final void run() {
                    arr.this.c(opbVar);
                }
            });
        }
    }

    public final /* synthetic */ void c(opb opbVar) {
        egm.a j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a4d89b", new Object[]{this, opbVar});
            return;
        }
        try {
            String b = b();
            DegradableNetwork degradableNetwork = new DegradableNetwork(PopLayer.getReference().getApp());
            RequestImpl requestImpl = new RequestImpl(b);
            if (!ABGlobal.isFeatureOpened(PopLayer.getReference().getApp(), "popCDNCookieOff")) {
                requestImpl.setExtProperty(RequestConstant.ENABLE_COOKIE, "false");
            }
            Response syncSend = degradableNetwork.syncSend(requestImpl, null);
            if (syncSend == null) {
                opbVar.a(false, "", null, null);
            } else if (syncSend.getStatusCode() < 0) {
                opbVar.a(false, "", null, null);
            } else {
                String str = new String(syncSend.getBytedata(), "UTF-8");
                wdm.d("TBNewConfigAdapter.fetchConfig.dataString=%s", str);
                CdnConfigModel cdnConfigModel = (CdnConfigModel) JSON.parseObject(str, CdnConfigModel.class);
                if (cdnConfigModel == null || !cdnConfigModel.isValid() || (j = this.f15965a.j(b, cdnConfigModel)) == null) {
                    opbVar.a(false, "", null, null);
                } else {
                    opbVar.a(true, j.f18563a, j.b, j.c);
                }
            }
        } catch (Throwable th) {
            opbVar.a(false, "", null, null);
            wdm.h("TBNewConfigAdapter.startFetchConfig.error", th);
        }
    }
}
