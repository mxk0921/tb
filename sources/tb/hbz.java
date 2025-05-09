package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.model.section.PopSectionModel;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hbz implements h9z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ibz f20534a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements IPopViewService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20535a;
        public final /* synthetic */ g3b b;

        public a(hbz hbzVar, String str, g3b g3bVar) {
            this.f20535a = str;
            this.b = g3bVar;
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService.a
        public void a(String str, Object obj, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64db83b", new Object[]{this, str, obj, jSONObject});
                return;
            }
            IPopData<PopSectionModel> a2 = tgm.a(obj);
            if (a2 == null) {
                vfm.f("LocationEventHandler", "pop data invalid");
            } else if (TextUtils.equals(a2.getBusinessID(), this.f20535a)) {
                vfm.f("LocationEventHandler", "receive message: " + str);
                if (yhm.c(str)) {
                    kbz.a(System.currentTimeMillis());
                    this.b.c(this);
                    vfm.f("LocationEventHandler", "remove pop message listener");
                }
            }
        }
    }

    static {
        t2o.a(729809543);
        t2o.a(729809539);
    }

    public hbz(ibz ibzVar) {
        this.f20534a = ibzVar;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff867c9b", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sections", (Object) this.f20534a.n().g);
        JSONObject jSONObject2 = this.f20534a.n().g.getJSONObject("ext");
        if (jSONObject2 == null) {
            sfh.d("LocationEventHandler", " popExt  is null  ");
            return;
        }
        String string = jSONObject2.getString(PopConst.BRIDGE_KEY_BUSINESS_ID);
        JSONObject jSONObject3 = jSONObject2.getJSONObject(h9.KEY_POP_CONFIG);
        jSONObject.put("businessId", (Object) string);
        jSONObject.put(h9.KEY_POP_CONFIG, (Object) jSONObject3);
        IPopData<PopSectionModel> a2 = tgm.a(jSONObject);
        if (a2 == null || !a2.valid()) {
            vfm.f("LocationEventHandler", "popData is inValid");
            return;
        }
        int trigger = a2.getPopConfig().getTrigger();
        String businessID = a2.getBusinessID();
        g3b g3bVar = new g3b();
        g3bVar.a(new a(this, businessID, g3bVar));
        g3bVar.d(trigger, jSONObject);
        kbz.a(System.currentTimeMillis());
        vfm.f("LocationEventHandler", "triggerPopShowByMain: " + trigger);
    }

    @Override // tb.h9z
    public void p(String str, JSONObject jSONObject) {
        z6d c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d37024", new Object[]{this, str, jSONObject});
        } else if (TextUtils.equals(str, h9z.EVENT_ON_APPEAR)) {
            r5a.l(this.f20534a.n().f);
            if (this.f20534a.u()) {
                sfh.d("LocationEventHandler", " show pop  ");
                a();
            }
        } else if (TextUtils.equals(str, "onClick") && (c = h2b.a().c()) != null) {
            uza.b(c, 1);
            JSONObject jSONObject2 = this.f20534a.n().f.getJSONObject("item");
            if (jSONObject2 != null) {
                r5a.d(this.f20534a.n().f, jSONObject2.getJSONObject("0"));
            }
        }
    }
}
