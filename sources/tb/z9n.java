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
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class z9n implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SectionModel f32634a;
    public final JSONObject b;
    public final qhj c;
    public g6j<RecommendDeleteResult> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements g6j<RecommendDeleteResult> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f32635a;
        public final /* synthetic */ String b;

        public a(Object obj, String str) {
            this.f32635a = obj;
            this.b = str;
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
            z9n.a(z9n.this).a();
            z9n.this.e();
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
            z9n.a(z9n.this).a();
            Object obj = this.f32635a;
            if (obj instanceof fnn) {
                fnn fnnVar = (fnn) obj;
                List<SectionModel> list = recommendDeleteResult.sections;
                if (list == null || list.size() == 0) {
                    fnnVar.b(z9n.b(z9n.this));
                } else {
                    fnnVar.F(z9n.b(z9n.this), recommendDeleteResult.sections.get(0));
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("containerId", (Object) this.b);
                jSONObject.put("deleteModel", (Object) z9n.b(z9n.this));
                if (yyj.p(this.b)) {
                    jSONObject.put("containers", (Object) new String[]{this.b});
                    b5aVar = new b5a("DeleteOperation", yyj.m, jSONObject);
                } else {
                    b5aVar = new b5a("DeleteOperation", kmn.c, jSONObject);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(b5aVar);
                RecmdGatewayMsg message = RecmdGatewayMsg.getMessage(arrayList);
                if (message != null) {
                    zza.a(this.b).c(message);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecommendDeleteClient f32636a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;

        public b(RecommendDeleteClient recommendDeleteClient, int i, String str) {
            this.f32636a = recommendDeleteClient;
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
            JSONObject jSONObject = z9n.b(z9n.this).getJSONObject("template");
            JSONObject jSONObject2 = z9n.c(z9n.this).getJSONObject("ext");
            JSONObject jSONObject3 = z9n.c(z9n.this).getJSONObject("args");
            RecommendDeleteClient recommendDeleteClient = this.f32636a;
            String str = null;
            RecommendDeleteParams.b n = new RecommendDeleteParams.b().k(jSONObject2 != null ? jSONObject2.getString("deleteId") : null).m(jSONObject2 != null ? jSONObject2.getString(yj4.PARAM_SEARCH_KEYWORD_POS) : null).s(Login.getOldUserId()).q(this.b).n(jSONObject3 != null ? jSONObject3.getString(yj4.PARAM_PVID) : null);
            if (jSONObject != null) {
                str = jSONObject.getString("name");
            }
            recommendDeleteClient.execute(n.r(str).o(this.c).l(von.p(RecommendChannelType.HOMEPAGE_R4U.getRequestStr())).j(), z9n.this.d, TaoHelper.getTTID());
        }
    }

    static {
        t2o.a(729809927);
    }

    public z9n(qhj qhjVar, SectionModel sectionModel, JSONObject jSONObject) {
        this.c = qhjVar;
        this.f32634a = sectionModel;
        this.b = jSONObject;
    }

    public static /* synthetic */ qhj a(z9n z9nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qhj) ipChange.ipc$dispatch("ee7a63e6", new Object[]{z9nVar});
        }
        return z9nVar.c;
    }

    public static /* synthetic */ SectionModel b(z9n z9nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SectionModel) ipChange.ipc$dispatch("42ae7b06", new Object[]{z9nVar});
        }
        return z9nVar.f32634a;
    }

    public static /* synthetic */ JSONObject c(z9n z9nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("730a05a8", new Object[]{z9nVar});
        }
        return z9nVar.b;
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
        this.d = new a(obj, str);
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
            if (str != null) {
                d(tag, str, i, view);
            }
        }
    }
}
