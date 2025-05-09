package com.alibaba.android.ultron.event;

import com.alibaba.android.ultron.vfw.dataloader.a;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.ag0;
import tb.b8v;
import tb.et6;
import tb.gsb;
import tb.l6v;
import tb.lr6;
import tb.o5e;
import tb.qcv;
import tb.t2o;
import tb.u55;
import tb.uq6;
import tb.wq6;
import tb.xo7;
import tb.yt6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AdjustStateSubscriber extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SKIP_SIMPLE_ADJUST = "skipSimpleAdjust";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IDMComponent f2263a;

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.android.ultron.event.AdjustStateSubscriber$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0070a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ com.alibaba.android.ultron.vfw.instance.a f2264a;

            public RunnableC0070a(com.alibaba.android.ultron.vfw.instance.a aVar) {
                this.f2264a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                JSONObject data = a.this.f2263a.getData();
                if (data != null) {
                    data.put(xo7.TAG_IS_ADJUST, (Object) Boolean.TRUE);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(a.this.f2263a);
                this.f2264a.e(arrayList);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, IDMComponent iDMComponent) {
            super(str);
            this.f2263a = iDMComponent;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/AdjustStateSubscriber$1");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject fields = AdjustStateSubscriber.this.j().getFields();
            if (fields == null) {
                fields = new JSONObject();
            }
            fields.getString("subType");
            JSONObject jSONObject = fields.getJSONObject("payload");
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            Object k = AdjustStateSubscriber.this.k();
            if (k instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) k;
                jSONObject2.putAll(jSONObject);
                jSONObject = jSONObject2;
            }
            JSONArray jSONArray = fields.getJSONArray("dataMergeParams");
            com.alibaba.android.ultron.vfw.instance.a aVar = (com.alibaba.android.ultron.vfw.instance.a) AdjustStateSubscriber.this.c;
            com.alibaba.android.ultron.vfw.dataloader.a B = aVar.B();
            JSONObject jSONObject3 = B.d() != null ? B.d().c : null;
            yt6.c(jSONObject, jSONObject3, jSONArray);
            aVar.o(this.f2263a, jSONObject3);
            qcv.e(new RunnableC0070a(aVar));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends uq6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.android.ultron.vfw.instance.a f2265a;
        public final /* synthetic */ String b;

        public b(com.alibaba.android.ultron.vfw.instance.a aVar, String str) {
            this.f2265a = aVar;
            this.b = str;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/AdjustStateSubscriber$3");
        }

        @Override // tb.uq6, tb.sq6
        public void a(wq6 wq6Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d2b290d", new Object[]{this, wq6Var});
                return;
            }
            if (this.f2265a.y() != null) {
                this.f2265a.y().a(wq6Var);
            }
            AdjustStateSubscriber.x(AdjustStateSubscriber.this, this.f2265a, this.b, "success");
        }

        @Override // tb.uq6, tb.sq6
        public void b(wq6 wq6Var, UltronError ultronError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fc6672d", new Object[]{this, wq6Var, ultronError});
                return;
            }
            if (this.f2265a.y() != null) {
                this.f2265a.y().b(wq6Var, ultronError);
            }
            AdjustStateSubscriber.x(AdjustStateSubscriber.this, this.f2265a, this.b, "fail");
        }

        @Override // tb.uq6, tb.kr6
        public lr6 c(lr6 lr6Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lr6) ipChange.ipc$dispatch("26f1b283", new Object[]{this, lr6Var});
            }
            if (this.f2265a.y() != null) {
                return this.f2265a.y().c(lr6Var);
            }
            return lr6Var;
        }
    }

    static {
        t2o.a(157286500);
    }

    public static /* synthetic */ Object ipc$super(AdjustStateSubscriber adjustStateSubscriber, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/AdjustStateSubscriber");
    }

    public static /* synthetic */ void x(AdjustStateSubscriber adjustStateSubscriber, com.alibaba.android.ultron.vfw.instance.a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c09e6d", new Object[]{adjustStateSubscriber, aVar, str, str2});
        } else {
            adjustStateSubscriber.y(aVar, str, str2);
        }
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        o5e o5eVar = this.c;
        if (o5eVar instanceof com.alibaba.android.ultron.vfw.instance.a) {
            UltronInstanceConfig F = ((com.alibaba.android.ultron.vfw.instance.a) o5eVar).F();
            Object i = b8vVar.i(SKIP_SIMPLE_ADJUST);
            if (F == null || !F.y() || (i != null && ((Boolean) i).booleanValue())) {
                A(b8vVar);
            } else {
                z(b8vVar);
            }
        }
    }

    public final void y(com.alibaba.android.ultron.vfw.instance.a aVar, String str, String str2) {
        u55 d;
        Map<String, DMComponent> p;
        IDMComponent iDMComponent;
        DMComponent dMComponent;
        Map<String, List<gsb>> eventMap;
        List<gsb> list;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70fd8d3e", new Object[]{this, aVar, str, str2});
            return;
        }
        et6 z = aVar.z();
        if (!(z == null || (d = z.d()) == null || (p = d.p()) == null || (iDMComponent = this.e) == null || (dMComponent = p.get(iDMComponent.getKey())) == null || (eventMap = dMComponent.getEventMap()) == null || (list = eventMap.get(str)) == null)) {
            for (gsb gsbVar : list) {
                if (gsbVar != null && gsbVar.getType().equals(ag0.EVENT_TYPE)) {
                    JSONObject fields = gsbVar.getFields();
                    if (fields != null && (jSONObject = fields.getJSONObject("next")) != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str2);
                        if (jSONArray != null) {
                            l(jSONArray);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void z(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a475e243", new Object[]{this, b8vVar});
            return;
        }
        IDMComponent d = b8vVar.d();
        if (d != null) {
            Coordinator.postTask(new a("ultron adjust process", d));
        }
    }

    public final void A(b8v b8vVar) {
        JSONObject jSONObject;
        ArrayList arrayList;
        com.alibaba.android.ultron.vfw.instance.a aVar;
        com.alibaba.android.ultron.vfw.dataloader.a B;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cb6934a", new Object[]{this, b8vVar});
            return;
        }
        JSONObject fields = j().getFields();
        if (fields == null) {
            fields = new JSONObject();
        }
        String string = fields.getString("subType");
        if (string == null) {
            string = "";
        }
        JSONObject jSONObject2 = fields.getJSONObject("payload");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        Object k = k();
        if (k instanceof JSONObject) {
            JSONObject jSONObject3 = (JSONObject) k;
            jSONObject3.putAll(jSONObject2);
            jSONObject = jSONObject3;
        } else {
            jSONObject = jSONObject2;
        }
        JSONArray jSONArray = fields.getJSONArray("dataMergeParams");
        Object[] objArr = (Object[]) b8vVar.i("extraParams");
        JSONObject jSONObject4 = null;
        if (objArr == null || objArr.length <= 1) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            int length = objArr.length;
            for (int i = 1; i < length; i++) {
                arrayList.add(objArr[i]);
            }
        }
        List list = (List) b8vVar.i("viewParams");
        ArrayList arrayList2 = arrayList == null ? new ArrayList() : arrayList;
        if (list == null) {
            list = new ArrayList();
        }
        JSONObject jSONObject5 = new JSONObject(string, jSONObject, arrayList2, list, jSONArray) { // from class: com.alibaba.android.ultron.event.AdjustStateSubscriber.2
            public final /* synthetic */ List val$finalDataMergeParams;
            public final /* synthetic */ JSONObject val$finalEventData;
            public final /* synthetic */ List val$finalExtraParams;
            public final /* synthetic */ String val$finalSubType;
            public final /* synthetic */ List val$finalUserInput;

            {
                this.val$finalSubType = string;
                this.val$finalEventData = jSONObject;
                this.val$finalExtraParams = arrayList2;
                this.val$finalUserInput = list;
                this.val$finalDataMergeParams = jSONArray;
                put("type", (Object) string);
                put("eventData", (Object) jSONObject);
                put("extraParams", (Object) arrayList2);
                put("userInput", (Object) list);
                put("dataMergeParams", (Object) jSONArray);
            }
        };
        o5e o5eVar = this.c;
        if (!(o5eVar == null || (B = (aVar = (com.alibaba.android.ultron.vfw.instance.a) o5eVar).B()) == null)) {
            a.C0075a aVar2 = new a.C0075a();
            aVar2.b = jSONObject5;
            aVar2.c = B.d() != null ? B.d().c : null;
            if (B.d() != null) {
                jSONObject4 = B.d().d;
            }
            aVar2.d = jSONObject4;
            aVar.i0(b8vVar.g(), com.alibaba.android.ultron.vfw.dataloader.a.c("adjust", aVar2, B), new b(aVar, b8vVar.m()));
        }
    }
}
