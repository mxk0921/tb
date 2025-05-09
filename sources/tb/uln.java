package tb;

import android.util.Base64;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.monitor.MonitorManager;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.common.PowerMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.n2r;
import tb.ts1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uln implements ts1.g<ts1.h<byte[]>, List<ikl>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements lzx<ts1.h<byte[]>, List<ikl>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(uln ulnVar) {
        }

        /* renamed from: a */
        public List<ikl> apply(ts1.h<byte[]> hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("eebb1c75", new Object[]{this, hVar});
            }
            return tln.e(hVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements lzx<List<ikl>, List<PowerMessage>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(uln ulnVar) {
        }

        /* renamed from: a */
        public List<PowerMessage> apply(List<ikl> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("6ec325a1", new Object[]{this, list});
            }
            ArrayList arrayList = new ArrayList();
            for (ikl iklVar : list) {
                if (iklVar.f21366a.type() == 1) {
                    arrayList.add(iyv.b((BaseMessage) iklVar.f21366a));
                }
            }
            return arrayList;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements lzx<String, ts1.h<byte[]>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(uln ulnVar) {
        }

        /* renamed from: a */
        public ts1.h<byte[]> apply(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ts1.h) ipChange.ipc$dispatch("eb15a154", new Object[]{this, str});
            }
            return new ts1.h<>(MonitorManager.a(null, null), 3, "", Base64.decode(str, 0));
        }
    }

    static {
        t2o.a(628097248);
        t2o.a(628097081);
    }

    /* renamed from: c */
    public l5y<List<ikl>> b(l5y<ts1.h<byte[]>> l5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("720c918d", new Object[]{this, l5yVar});
        }
        return l5yVar.G(new a(this));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements vxx<List<PowerMessage>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ack f29470a;

        public b(uln ulnVar, Ack ack) {
            this.f29470a = ack;
        }

        /* renamed from: a */
        public void accept(List<PowerMessage> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d130480", new Object[]{this, list});
                return;
            }
            MsgLog.e("ReceivedConverter4Mtop", "pullHistory >", Integer.valueOf(list.size()));
            this.f29470a.data = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [tb.m2r] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [tb.n2r] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // tb.ts1.g
    public Ack a(int i, Map<String, Object> map) {
        Object obj;
        String optString;
        ts1 c2;
        dh2 dh2Var;
        int i2 = 0;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("dcfd3915", new Object[]{this, new Integer(i), map});
        }
        String str = null;
        if (map == null) {
            return null;
        }
        Ack create = Ack.create();
        create.body = map.get(AgooConstants.MESSAGE_BODY);
        create.data = map.get("data");
        Object obj2 = map.get("mqtt_type");
        Object obj3 = map.get("sub_type");
        try {
            if (obj2 instanceof Integer) {
                int intValue = ((Integer) obj2).intValue();
                create.msgType = intValue;
                if (intValue == 8 || intValue == 10 || intValue == 9 || intValue == 11) {
                    JSONObject jSONObject = (JSONObject) create.data;
                    if (jSONObject != null) {
                        dh2Var = new dh2();
                        dh2Var.b = jSONObject.optInt("role");
                        dh2Var.d = jSONObject.optInt(TypedValues.CycleType.S_WAVE_PERIOD);
                        if (n8l.e()) {
                            dh2Var.h = jSONObject.optString("fullStreamIds");
                            dh2Var.i = jSONObject.optString("latestSequenceNrs");
                        }
                    } else {
                        dh2Var = null;
                    }
                    create.data = dh2Var;
                }
            }
            if (obj3 instanceof Integer) {
                create.header.g = ((Integer) obj3).intValue();
                switch (create.header.g) {
                    case 402:
                        JSONObject jSONObject2 = (JSONObject) create.data;
                        if (jSONObject2 != null) {
                            obj = new m2r();
                            obj.e = jSONObject2.optInt("digNum");
                            obj.b = jSONObject2.optInt("onlineNum");
                            obj.d = jSONObject2.optInt("msgNum");
                            obj.c = jSONObject2.optInt("totalNum");
                            obj.f23744a = jSONObject2.optInt("visitNum");
                        } else {
                            obj = 0;
                        }
                        create.data = obj;
                        break;
                    case 403:
                        JSONObject jSONObject3 = (JSONObject) create.data;
                        if (jSONObject3 != null) {
                            obj = new n2r();
                            JSONArray optJSONArray = jSONObject3.optJSONArray("result");
                            int length = optJSONArray.length();
                            obj.f24471a = new n2r.a[length];
                            for (int i4 = 0; i4 < length; i4++) {
                                n2r.a aVar = new n2r.a();
                                JSONObject jSONObject4 = optJSONArray.getJSONObject(i4);
                                aVar.b = jSONObject4.optString("nick");
                                aVar.f24472a = jSONObject4.optString("userId");
                                aVar.c = jSONObject4.optLong("addTime");
                                obj.f24471a[i4] = aVar;
                            }
                        } else {
                            obj = 0;
                        }
                        create.data = obj;
                        break;
                    case 404:
                        JSONObject jSONObject5 = (JSONObject) create.data;
                        if (!(jSONObject5 == null || (optString = jSONObject5.optString("data")) == null)) {
                            l5y.m(optString).G(new d(this)).z(new tln()).G(new c(this)).K(new b(this, create));
                            break;
                        }
                        break;
                    case 405:
                        JSONObject jSONObject6 = (JSONObject) create.data;
                        if (jSONObject6 != null) {
                            k2r k2rVar = new k2r();
                            k2rVar.b = jSONObject6.optInt("role");
                            k2rVar.c = jSONObject6.optInt(TypedValues.CycleType.S_WAVE_PERIOD);
                            k2rVar.f22367a = jSONObject6.optLong("offset");
                            JSONObject optJSONObject = jSONObject6.optJSONObject("traceMsgIds");
                            HashMap hashMap = new HashMap();
                            if (optJSONObject != null) {
                                hashMap.put(30, optJSONObject.toString());
                            }
                            JSONArray optJSONArray2 = jSONObject6.optJSONArray("timestampList");
                            if (optJSONArray2 != null) {
                                int i5 = 0;
                                while (i5 < optJSONArray2.length()) {
                                    String optString2 = optJSONArray2.getJSONObject(i5).optString("data");
                                    long optLong = optJSONArray2.getJSONObject(i5).optLong("offset");
                                    if (optString2 == null || (c2 = stj.c(i3)) == null) {
                                        hashMap = hashMap;
                                    } else {
                                        String a2 = MonitorManager.a(str, str);
                                        hashMap = hashMap;
                                        c2.f(new ts1.h(a2, 2, "" + optLong, Base64.decode(optString2, i2), hashMap));
                                    }
                                    i5++;
                                    i2 = 0;
                                    i3 = 1;
                                    str = null;
                                }
                            }
                            obj = k2rVar;
                        } else {
                            obj = 0;
                        }
                        create.data = obj;
                        break;
                }
            }
        } catch (Exception e) {
            MsgLog.f("ReceivedConverter4Mtop", e, new Object[0]);
        }
        return create;
    }
}
