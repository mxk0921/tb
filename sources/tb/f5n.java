package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService;
import com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f5n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IPullRefreshService f19028a;
    public final IFirstScreenDataService b;
    public final e3b c;
    public IPullRefreshService.a d;
    public String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IPullRefreshService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService.a
        public void onPullDistance(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            } else if ("NONE".equals(f5n.a(f5n.this))) {
                fve.e("PullSecondAnimationProcess", "当前不在下拉刷新态了，不要设置alpha了");
            } else {
                f5n.c(f5n.this, i);
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService.a
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService.a
        public void onRefreshStateChanged(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("645061a", new Object[]{this, str, str2});
                return;
            }
            fve.e("PullSecondAnimationProcess", "当前的状态是：" + str2);
            f5n.b(f5n.this, str2);
            if ("NONE".equals(str2)) {
                f5n.d(f5n.this, 1.0f);
                fve.e("PullSecondAnimationProcess", "当前刷新状态为none，直接alpha置为1");
            }
            if ("REFRESHING".equals(str2)) {
                f5n.d(f5n.this, 0.0f);
                fve.e("PullSecondAnimationProcess", "当前在刷新状态，直接alpha置为0");
            }
        }
    }

    static {
        t2o.a(491782613);
    }

    public f5n(cfc cfcVar, e3b e3bVar) {
        this.c = e3bVar;
        this.f19028a = (IPullRefreshService) cfcVar.a(IPullRefreshService.class);
        this.b = (IFirstScreenDataService) cfcVar.a(IFirstScreenDataService.class);
        h();
    }

    public static /* synthetic */ String a(f5n f5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7194131", new Object[]{f5nVar});
        }
        return f5nVar.e;
    }

    public static /* synthetic */ String b(f5n f5nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("add740a5", new Object[]{f5nVar, str});
        }
        f5nVar.e = str;
        return str;
    }

    public static /* synthetic */ void c(f5n f5nVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8475d170", new Object[]{f5nVar, new Float(f)});
        } else {
            f5nVar.j(f);
        }
    }

    public static /* synthetic */ void d(f5n f5nVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc66ac8f", new Object[]{f5nVar, new Float(f)});
        } else {
            f5nVar.i(f);
        }
    }

    public final IPullRefreshService.a e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPullRefreshService.a) ipChange.ipc$dispatch("cc96f914", new Object[]{this});
        }
        return new a();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            k();
        }
    }

    public final JSONArray g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b65076b7", new Object[]{this});
        }
        IFirstScreenDataService iFirstScreenDataService = this.b;
        if (iFirstScreenDataService == null) {
            fve.e("PullSecondAnimationProcess", "mFirstScreenDataService == null");
            return null;
        }
        JSONObject firstScreenExt = iFirstScreenDataService.getFirstScreenExt();
        if (firstScreenExt != null) {
            return firstScreenExt.getJSONArray("needPullRefreshHidePopId");
        }
        fve.e("PullSecondAnimationProcess", "ext == null");
        return null;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7076e3", new Object[]{this});
        } else if (this.f19028a != null) {
            IPullRefreshService.a e = e();
            this.d = e;
            this.f19028a.addPullRefreshListener(e);
        }
    }

    public final void j(float f) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120dfce3", new Object[]{this, new Float(f)});
            return;
        }
        if (f < 10.0f) {
            f2 = 1.0f;
        } else {
            f2 = Math.max(0.0f, (float) ((f * (-0.15d)) + 1.0d));
        }
        i(f2);
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99d1fba", new Object[]{this});
            return;
        }
        IPullRefreshService iPullRefreshService = this.f19028a;
        if (iPullRefreshService != null) {
            iPullRefreshService.removePullRefreshListener(this.d);
        }
    }

    public final void i(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6afea6f", new Object[]{this, new Float(f)});
            return;
        }
        JSONArray g = g();
        if (g == null || g.isEmpty()) {
            fve.e("PullSecondAnimationProcess", "needPullRefreshHidePopId == null");
            return;
        }
        int size = g.size();
        for (int i = 0; i < size; i++) {
            Object obj = g.get(i);
            if (obj instanceof String) {
                this.c.f().C((String) obj, f);
            }
        }
    }
}
