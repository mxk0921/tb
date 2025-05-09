package tb;

import android.view.View;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.login4android.api.Login;
import com.taobao.tao.recommend2.RecommendChannelType;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdGatewayMsg;
import com.taobao.tao.recommend3.remote.RecommendDeleteClient;
import com.taobao.tao.recommend3.remote.RecommendDeleteParams;
import com.taobao.tao.recommend3.remote.RecommendDeleteResult;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.ArrayList;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class v9n implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SectionModel f29872a;
    public final JSONObject b;
    public final dan c;
    public g6j<RecommendDeleteResult> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements g6j<RecommendDeleteResult> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29873a;

        public a(String str) {
            this.f29873a = str;
        }

        @Override // tb.g6j
        public void b(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                return;
            }
            sfh.d("RItemDeleteListener", "deleteListener.onSystemFailure");
            a(mtopResponse);
        }

        /* renamed from: c */
        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb2ff8f7", new Object[]{this, mtopResponse});
                return;
            }
            sfh.d("RItemDeleteListener", "deleteListener.onFailure");
            v9n.a(v9n.this).a();
            v9n.this.e();
        }

        /* renamed from: d */
        public void onSuccess(RecommendDeleteResult recommendDeleteResult) {
            b5a b5aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a276987", new Object[]{this, recommendDeleteResult});
                return;
            }
            sfh.f("RItemDeleteListener", "deleteListener.onSuccess");
            v9n.a(v9n.this).a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("containerId", (Object) this.f29873a);
            jSONObject.put("deleteModel", (Object) v9n.b(v9n.this));
            if (yyj.p(this.f29873a)) {
                jSONObject.put("containers", (Object) new String[]{this.f29873a});
                b5aVar = new b5a("DeleteOperation", yyj.m, jSONObject);
            } else {
                b5aVar = new b5a("DeleteOperation", kmn.c, jSONObject);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(b5aVar);
            RecmdGatewayMsg message = RecmdGatewayMsg.getMessage(arrayList);
            if (message != null) {
                zza.a(this.f29873a).c(message);
            }
            v9n.this.f();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecommendDeleteClient f29874a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;

        public b(RecommendDeleteClient recommendDeleteClient, int i, String str) {
            this.f29874a = recommendDeleteClient;
            this.b = i;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = v9n.b(v9n.this).getJSONObject("template");
            JSONObject jSONObject2 = v9n.c(v9n.this).getJSONObject("content");
            this.f29874a.execute(new RecommendDeleteParams.b().k(jSONObject2.getString("deleteId")).m(v9n.b(v9n.this).getString("index")).s(Login.getOldUserId()).q(this.b).n(jSONObject2.getString(yj4.PARAM_PVID)).r(jSONObject == null ? null : jSONObject.getString("name")).p(this.c).l(von.p(RecommendChannelType.HOMEPAGE_R4U.getRequestStr())).j(), v9n.this.d, TaoHelper.getTTID());
        }
    }

    static {
        t2o.a(729809914);
    }

    public v9n(dan danVar, SectionModel sectionModel, JSONObject jSONObject) {
        this.c = danVar;
        this.f29872a = sectionModel;
        this.b = jSONObject;
    }

    public static /* synthetic */ dan a(v9n v9nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dan) ipChange.ipc$dispatch("f441632", new Object[]{v9nVar});
        }
        return v9nVar.c;
    }

    public static /* synthetic */ SectionModel b(v9n v9nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SectionModel) ipChange.ipc$dispatch("bfb03df2", new Object[]{v9nVar});
        }
        return v9nVar.f29872a;
    }

    public static /* synthetic */ JSONObject c(v9n v9nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("857a40f6", new Object[]{v9nVar});
        }
        return v9nVar.b;
    }

    public final void d(Object obj, String str, int i, View view) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f98236", new Object[]{this, obj, str, new Integer(i), view});
            return;
        }
        if (view.getTag() == null) {
            str2 = null;
        } else {
            str2 = view.getTag().toString();
        }
        RecommendDeleteClient recommendDeleteClient = new RecommendDeleteClient();
        this.d = new a(str);
        Coordinator.execute(new b(recommendDeleteClient, i, str2));
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec58931", new Object[]{this});
            return;
        }
        try {
            TBToast.makeText(m0b.c(), Localization.q(R.string.taobao_app_1000_1_16169), 2000L).show();
        } catch (Exception unused) {
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("253c1a7", new Object[]{this});
        } else {
            TBToast.makeText(m0b.c(), Localization.q(R.string.taobao_app_1000_1_16175), 2000L).show();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        View s = von.s(view);
        if (s != null) {
            Object tag = s.getTag(R.id.tag_recommend_datasource);
            String str = null;
            int i = -1;
            try {
                Object tag2 = s.getTag(R.id.tag_recommend_containerId);
                Object tag3 = s.getTag(R.id.tag_recommend_tabIndex);
                if (tag2 != null) {
                    str = tag2.toString();
                }
                if (tag3 != null) {
                    i = Integer.valueOf(tag3.toString()).intValue();
                }
            } catch (Throwable th) {
                bqa.i("recmd.delete", th, new String[0]);
            }
            if (str != null && i >= 0) {
                d(tag, str, i, view);
            }
        }
    }
}
