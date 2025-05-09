package tb;

import com.alibaba.android.ultron.event.AsyncRefreshSubscriber;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.mytaobao.ultron.MTBPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gsh implements w15 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public epb f20193a;
    public final mh8 b = new mh8();

    static {
        t2o.a(745538145);
        t2o.a(157286532);
    }

    public gsh(epb epbVar) {
        this.f20193a = epbVar;
    }

    @Override // tb.w15
    public void a(x15 x15Var) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95ef05a9", new Object[]{this, x15Var});
        } else if (x15Var != null) {
            o5e c = x15Var.c();
            IDMComponent iDMComponent = (IDMComponent) x15Var.b(AsyncRefreshSubscriber.KEY_COMPONENT);
            MtopResponse mtopResponse = (MtopResponse) x15Var.b("mtopResponse");
            JSONArray jSONArray = (JSONArray) x15Var.b(AsyncRefreshSubscriber.KEY_TARGET_COMPONENTS);
            if (c != null && mtopResponse != null) {
                try {
                    jSONObject = JSON.parseObject(mtopResponse.getDataJsonObject().toString());
                } catch (Exception unused) {
                    jSONObject = null;
                }
                if (jSONObject != null && !jSONObject.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    if (jSONArray != null) {
                        Iterator<Object> it = jSONArray.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (next instanceof String) {
                                String str = (String) next;
                                IDMComponent componentByName = c.b().getComponentByName(str);
                                if (b(componentByName, jSONObject.getJSONObject(str))) {
                                    arrayList.add(componentByName);
                                }
                            }
                        }
                        epb epbVar = this.f20193a;
                        if (epbVar != null) {
                            ((MTBPresenter) epbVar).s(arrayList);
                        }
                        x15Var.a(AsyncRefreshSubscriber.KEY_NEED_REFRESH_COMPONENTS, arrayList);
                    } else if (b(iDMComponent, jSONObject.getJSONObject(iDMComponent.getKey()))) {
                        arrayList.add(iDMComponent);
                        x15Var.a(AsyncRefreshSubscriber.KEY_NEED_REFRESH_COMPONENTS, arrayList);
                    }
                }
            }
        }
    }

    public final boolean b(IDMComponent iDMComponent, JSONObject jSONObject) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86e5fddc", new Object[]{this, iDMComponent, jSONObject})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent.getData() == null || jSONObject == null) {
            return false;
        }
        JSONObject data = iDMComponent.getData();
        if ("benefitModule2024V2_1".equals(iDMComponent.getKey()) || "headerModule_11".equals(iDMComponent.getKey())) {
            mh8 mh8Var = this.b;
            if (l3j.INSTANCE.m() == 1) {
                z = true;
            } else {
                z = false;
            }
            mh8Var.q(jSONObject, data, false, z);
        }
        if (jSONObject.containsKey("fields")) {
            data.put("fields", (Object) jSONObject.getJSONObject("fields"));
        }
        if (jSONObject.containsKey("events")) {
            data.put("events", (Object) jSONObject.getJSONObject("events"));
        }
        iDMComponent.writeBackDataAndReloadEvent(data, true);
        return true;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1884d003", new Object[]{this});
        } else {
            this.f20193a = null;
        }
    }
}
