package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.SwitchOption;
import com.taobao.collection.common.c;
import com.taobao.collection.dto.BeaconRecord;
import com.taobao.fence.client.TBFenceClient;
import com.taobao.geofence.aidl.GatherManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class na0 implements pkc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final aob d = ltn.a();

    /* renamed from: a  reason: collision with root package name */
    public final GatherManager f24600a;
    public int b;
    public final SwitchOption.CollectionType c;

    static {
        t2o.a(789577818);
        t2o.a(789577796);
    }

    public na0(GatherManager gatherManager, SwitchOption.CollectionType collectionType) {
        this.f24600a = gatherManager;
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
                mdh.e("lbs_sdk.fence_ActiveBeaconListener", "[dataChanged] event null");
            } else if (cVar.c() != SwitchOption.CollectionType.BEACON) {
                mdh.e("lbs_sdk.fence_ActiveBeaconListener", "[dataChanged] find not beacon data change");
            } else {
                Object b = cVar.b();
                if (b != null && (b instanceof BeaconRecord)) {
                    List<BeaconRecord.IBeacon> c = ((BeaconRecord) b).c();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    if (c != null) {
                        for (BeaconRecord.IBeacon iBeacon : c) {
                            arrayList.add(new String(iBeacon.proximityUuid + "|" + iBeacon.getMajor() + "|" + iBeacon.minor));
                            StringBuilder sb = new StringBuilder();
                            sb.append("");
                            sb.append(iBeacon.rssi);
                            arrayList2.add(sb.toString());
                        }
                    }
                    this.f24600a.setGatherData(TBFenceClient.TypeEnum.IBEACON, JSON.toJSONString(arrayList), JSON.toJSONString(arrayList2));
                } else if (b == null) {
                    mdh.e("lbs_sdk.fence_ActiveBeaconListener", "[dataChanged] data null");
                } else {
                    mdh.e("lbs_sdk.fence_ActiveBeaconListener", "[dataChanged]  object type=" + b.getClass());
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
