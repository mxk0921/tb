package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.adapterimpl.follow.newfollow.AddFollowRequest;
import com.taobao.taolive.adapterimpl.follow.newfollow.CancelFollowRequest;
import com.taobao.taolive.adapterimpl.follow.newfollow.FollowResponse;
import com.taobao.taolive.adapterimpl.follow.newfollow.FollowResponseData;
import com.taobao.taolive.adapterimpl.follow.newfollow.QueryFollowRequest;
import com.taobao.taolive.adapterimpl.follow.newfollow.QueryFollowResponse;
import com.taobao.taolive.adapterimpl.follow.newfollow.QueryFollowResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class m0k implements q7c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, Boolean> b = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final List<et9> f23692a = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ stk f23693a;
        public final /* synthetic */ qt9 b;

        public a(stk stkVar, qt9 qt9Var) {
            this.f23693a = stkVar;
            this.b = qt9Var;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            if (netResponse != null) {
                str = netResponse.getRetCode();
            } else {
                str = "10086";
            }
            if (netResponse != null) {
                str2 = netResponse.getRetMsg();
            } else {
                str2 = "服务出错了";
            }
            stk stkVar = this.f23693a;
            if (stkVar != null) {
                stkVar.onFailure(str, str2);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netBaseOutDo instanceof FollowResponse) {
                FollowResponseData data = ((FollowResponse) netBaseOutDo).getData();
                st9 st9Var = new st9();
                st9Var.f28260a = data.toastMsg;
                stk stkVar = this.f23693a;
                if (stkVar != null) {
                    stkVar.a(st9Var);
                }
                m0k.this.a(this.b, true);
                m0k.i(m0k.this, this.b.f26917a, true);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onError(i, netResponse, obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ stk f23694a;
        public final /* synthetic */ qt9 b;

        public b(stk stkVar, qt9 qt9Var) {
            this.f23694a = stkVar;
            this.b = qt9Var;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            if (netResponse != null) {
                str = netResponse.getRetCode();
            } else {
                str = "10086";
            }
            if (netResponse != null) {
                str2 = netResponse.getRetMsg();
            } else {
                str2 = "服务出错了";
            }
            stk stkVar = this.f23694a;
            if (stkVar != null) {
                stkVar.onFailure(str, str2);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netBaseOutDo instanceof FollowResponse) {
                FollowResponseData data = ((FollowResponse) netBaseOutDo).getData();
                wfv wfvVar = new wfv();
                wfvVar.f30670a = data.toastMsg;
                stk stkVar = this.f23694a;
                if (stkVar != null) {
                    stkVar.a(wfvVar);
                }
                m0k.this.a(this.b, false);
                m0k.i(m0k.this, this.b.f26917a, false);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onError(i, netResponse, obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ stk f23695a;
        public final /* synthetic */ qt9 b;

        public c(stk stkVar, qt9 qt9Var) {
            this.f23695a = stkVar;
            this.b = qt9Var;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            if (netResponse != null) {
                str = netResponse.getRetCode();
            } else {
                str = "10086";
            }
            if (netResponse != null) {
                str2 = netResponse.getRetMsg();
            } else {
                str2 = "服务出错了";
            }
            TLog.loge("tblive", "TBLiveNewFollowService", "isFollow4Remote success onError");
            stk stkVar = this.f23695a;
            if (stkVar != null) {
                stkVar.onFailure(str, str2);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netBaseOutDo instanceof QueryFollowResponse) {
                QueryFollowResponseData data = ((QueryFollowResponse) netBaseOutDo).getData();
                hnf hnfVar = new hnf();
                hnfVar.f20761a = data.follow;
                TLog.loge("tblive", "TBLiveNewFollowService", "isFollow4Remote success follow:" + data.follow);
                stk stkVar = this.f23695a;
                if (stkVar != null) {
                    stkVar.a(hnfVar);
                }
                m0k.this.a(this.b, data.follow);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            TLog.loge("tblive", "TBLiveNewFollowService", "isFollow4Remote success onSystemError");
            onError(i, netResponse, obj);
        }
    }

    static {
        t2o.a(779092298);
        t2o.a(806355895);
    }

    public static /* synthetic */ void i(m0k m0kVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("443dd9f0", new Object[]{m0kVar, str, new Boolean(z)});
        } else {
            m0kVar.l(str, z);
        }
    }

    public static AddFollowRequest j(qt9 qt9Var) {
        Set<String> keySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AddFollowRequest) ipChange.ipc$dispatch("92296128", new Object[]{qt9Var});
        }
        AddFollowRequest addFollowRequest = new AddFollowRequest();
        addFollowRequest.accountId = qt9Var.f26917a;
        addFollowRequest.contentId = qt9Var.c;
        addFollowRequest.spmUrl = qt9Var.d;
        addFollowRequest.clickId = qt9Var.e;
        addFollowRequest.liveSource = qt9Var.f;
        addFollowRequest.ad = qt9Var.g;
        addFollowRequest.entryLiveSource = qt9Var.h;
        addFollowRequest.entrySpm = qt9Var.i;
        addFollowRequest.kandianId = null;
        addFollowRequest.watchId = qt9Var.j;
        addFollowRequest.pvId = qt9Var.k;
        addFollowRequest.originPage = qt9Var.l;
        addFollowRequest.spmCnt = qt9Var.m;
        addFollowRequest.appKey = qt9Var.n;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("followSource", (Object) qt9Var.o);
        jSONObject.put("originPage", (Object) qt9Var.l);
        Map<String, String> F = up6.F(vx9.d());
        if (!(F == null || (keySet = F.keySet()) == null || keySet.size() <= 0)) {
            for (String str : keySet) {
                jSONObject.put(str, (Object) F.get(str));
            }
        }
        k(addFollowRequest.accountId, addFollowRequest.contentId, F, jSONObject);
        addFollowRequest.extraFlag = JSON.toJSONString(jSONObject);
        return addFollowRequest;
    }

    public static void k(String str, String str2, Map<String, String> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc7237e5", new Object[]{str, str2, map, jSONObject});
            return;
        }
        String str3 = map.get("accountId");
        String str4 = map.get("contentId");
        if (!TextUtils.isEmpty(str) && !str.equals(str3)) {
            jSONObject.put("accountId", (Object) str);
        }
        if (!TextUtils.isEmpty(str2) && !str2.equals(str4)) {
            jSONObject.put("contentId", (Object) str2);
        }
    }

    @Override // tb.q7c
    public void a(qt9 qt9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7231b9", new Object[]{this, qt9Var, new Boolean(z)});
            return;
        }
        TLog.loge("tblive", "TBLiveNewFollowService", "updateFollow4Local follow:" + z);
        ((HashMap) b).put(qt9Var.f26917a, Boolean.valueOf(z));
    }

    @Override // tb.q7c
    public void b(et9 et9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dccb9c9", new Object[]{this, et9Var});
        } else if (et9Var != null && !((CopyOnWriteArrayList) this.f23692a).contains(et9Var)) {
            ((CopyOnWriteArrayList) this.f23692a).add(et9Var);
        }
    }

    @Override // tb.q7c
    public void c(qt9 qt9Var, stk stkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c637f513", new Object[]{this, qt9Var, stkVar});
            return;
        }
        nt1 nt1Var = new nt1(new c(stkVar, qt9Var));
        QueryFollowRequest queryFollowRequest = new QueryFollowRequest();
        queryFollowRequest.targetUserIdStr = qt9Var.f26917a;
        nt1Var.C(0, queryFollowRequest, QueryFollowResponse.class);
    }

    @Override // tb.q7c
    public void d(qt9 qt9Var, stk stkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b7aacf", new Object[]{this, qt9Var, stkVar});
            return;
        }
        Map<String, Boolean> map = b;
        if (!((HashMap) map).containsKey(qt9Var.f26917a) || stkVar == null) {
            c(qt9Var, stkVar);
            return;
        }
        hnf hnfVar = new hnf();
        hnfVar.f20761a = ((Boolean) ((HashMap) map).get(qt9Var.f26917a)).booleanValue();
        TLog.loge("tblive", "TBLiveNewFollowService", "isFollow from cache follow:" + hnfVar.f20761a);
        stkVar.a(hnfVar);
    }

    @Override // tb.q7c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            ((HashMap) b).clear();
        }
    }

    @Override // tb.q7c
    public boolean e(qt9 qt9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ddc460", new Object[]{this, qt9Var})).booleanValue();
        }
        Map<String, Boolean> map = b;
        if (((HashMap) map).containsKey(qt9Var.f26917a)) {
            return ((Boolean) ((HashMap) map).get(qt9Var.f26917a)).booleanValue();
        }
        return false;
    }

    @Override // tb.q7c
    public void f(qt9 qt9Var, stk stkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b108505", new Object[]{this, qt9Var, stkVar});
            return;
        }
        new nt1(new a(stkVar, qt9Var)).C(0, j(qt9Var), FollowResponse.class);
        HashMap hashMap = new HashMap();
        hashMap.put("is_follow", "follow");
        giv.f().f("attention_test", hashMap);
    }

    @Override // tb.q7c
    public void g(et9 et9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2d60c6", new Object[]{this, et9Var});
        } else if (et9Var != null) {
            ((CopyOnWriteArrayList) this.f23692a).remove(et9Var);
        }
    }

    public final void l(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e017279", new Object[]{this, str, new Boolean(z)});
            return;
        }
        dt9 dt9Var = new dt9();
        dt9Var.f18052a = str;
        dt9Var.b = z;
        Iterator it = ((CopyOnWriteArrayList) this.f23692a).iterator();
        while (it.hasNext()) {
            ((et9) it.next()).onFollowChange(dt9Var);
        }
    }

    @Override // tb.q7c
    public void h(qt9 qt9Var, stk stkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b04eafe", new Object[]{this, qt9Var, stkVar});
            return;
        }
        nt1 nt1Var = new nt1(new b(stkVar, qt9Var));
        CancelFollowRequest cancelFollowRequest = new CancelFollowRequest();
        cancelFollowRequest.accountId = qt9Var.f26917a;
        cancelFollowRequest.contentId = qt9Var.c;
        JSONObject jSONObject = new JSONObject();
        Map<String, String> F = up6.F(vx9.d());
        if (F != null) {
            Set<String> keySet = F.keySet();
            if (keySet != null && keySet.size() > 0) {
                for (String str : keySet) {
                    jSONObject.put(str, (Object) F.get(str));
                }
            }
            if (TextUtils.isEmpty(cancelFollowRequest.contentId) && F.containsKey("contentId")) {
                cancelFollowRequest.contentId = F.get("contentId");
            }
        }
        k(cancelFollowRequest.accountId, cancelFollowRequest.contentId, F, jSONObject);
        cancelFollowRequest.extraFlag = JSON.toJSONString(jSONObject);
        nt1Var.C(0, cancelFollowRequest, FollowResponse.class);
        HashMap hashMap = new HashMap();
        hashMap.put("is_follow", com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_UNFOLLOWED);
        giv.f().f("attention_test", hashMap);
    }
}
