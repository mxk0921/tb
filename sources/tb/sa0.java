package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.SwitchOption;
import com.taobao.collection.common.c;
import com.taobao.fence.client.TBFenceClient;
import com.taobao.geofence.aidl.GatherManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sa0 implements pkc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final aob d = ltn.a();

    /* renamed from: a  reason: collision with root package name */
    public final GatherManager f27897a;
    public int b;
    public final SwitchOption.CollectionType c;

    static {
        t2o.a(789577819);
        t2o.a(789577796);
    }

    public sa0(GatherManager gatherManager, SwitchOption.CollectionType collectionType) {
        this.f27897a = gatherManager;
        this.c = collectionType;
    }

    @Override // tb.pkc
    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad4cbcc", new Object[]{this, cVar});
            return;
        }
        try {
            if (cVar == null) {
                mdh.e("lbs_sdk.fence_ActiveWifiListener", "[dataChanged] event null");
            } else if (cVar.c() != SwitchOption.CollectionType.WIFI) {
                mdh.e("lbs_sdk.fence_ActiveWifiListener", "[dataChanged] find not wifi data change");
            } else {
                Object b = cVar.b();
                if (b != null && (b instanceof aex)) {
                    this.f27897a.setGatherData(TBFenceClient.TypeEnum.WIFI, JSON.toJSONString(((aex) b).a()));
                } else if (b == null) {
                    mdh.e("lbs_sdk.fence_ActiveWifiListener", "[dataChanged] data null");
                } else {
                    mdh.e("lbs_sdk.fence_ActiveWifiListener", "[dataChanged]  object type=" + b.getClass());
                }
            }
        } finally {
            d.b(this.b, this.c);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15beaf4d", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }
}
