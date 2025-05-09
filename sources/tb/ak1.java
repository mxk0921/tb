package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.open.permission.auth.AuthUtils;
import com.taobao.themis.open.permission.auth.model.DomainItemEntity;
import com.taobao.themis.open.permission.auth.model.ResourceItemEntity;
import com.taobao.themis.open.permission.auth.model.ScopeEntity;
import com.taobao.themis.open.permission.auth.model.ScopeSettingEntity;
import com.taobao.themis.open.permission.auth.ui.ScopeAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ak1 extends d9s implements ScopeAdapter.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ITMSPage e;
    public final Activity f;
    public final View g;
    public RecyclerView h;
    public ScopeAdapter i;
    public TextView k;
    public final List<ScopeSettingEntity> j = new ArrayList();
    public final String l = this.d.L();
    public final String m = r8s.j(this.d);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a extends AsyncTask<Void, Void, List<? extends ScopeSettingEntity>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<ak1> f15784a;

        static {
            t2o.a(843055348);
        }

        public a(WeakReference<ak1> weakReference) {
            ckf.g(weakReference, "mRenderWeakReference");
            this.f15784a = weakReference;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/permission/auth/ui/AuthSettingRender$LoadStatusTask");
        }

        /* renamed from: a */
        public List<ScopeSettingEntity> doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("f9c7edf0", new Object[]{this, voidArr});
            }
            ckf.g(voidArr, "voids");
            ak1 ak1Var = this.f15784a.get();
            if (ak1Var == null) {
                return null;
            }
            AuthUtils authUtils = AuthUtils.INSTANCE;
            bbs s1 = ak1.s1(ak1Var);
            AuthUtils.InvokeType invokeType = AuthUtils.InvokeType.TYPE_ORIGIN;
            String L = ak1.s1(ak1Var).L();
            String j = r8s.j(ak1.s1(ak1Var));
            ckf.f(L, "appId");
            return authUtils.i(s1, invokeType, j, L);
        }

        /* renamed from: b */
        public void onPostExecute(List<ScopeSettingEntity> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("598ba7ce", new Object[]{this, list});
                return;
            }
            ak1 ak1Var = this.f15784a.get();
            if (ak1Var != null) {
                List<ScopeSettingEntity> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    TextView t1 = ak1.t1(ak1Var);
                    if (t1 != null) {
                        t1.setVisibility(0);
                    }
                    RecyclerView u1 = ak1.u1(ak1Var);
                    if (u1 != null) {
                        u1.setVisibility(8);
                        return;
                    }
                    return;
                }
                ak1.r1(ak1Var).clear();
                ak1.r1(ak1Var).addAll(list2);
                ScopeAdapter q1 = ak1.q1(ak1Var);
                if (q1 != null) {
                    q1.notifyDataSetChanged();
                }
            }
        }
    }

    static {
        t2o.a(843055347);
        t2o.a(843055369);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak1(ITMSPage iTMSPage, ocs ocsVar) {
        super(iTMSPage, ocsVar);
        ckf.g(iTMSPage, "page");
        ckf.g(ocsVar, "renderListener");
        this.e = iTMSPage;
        Activity I = iTMSPage.getInstance().I();
        ckf.f(I, "page.getInstance().activity");
        this.f = I;
        this.g = View.inflate(I, R.layout.tms_view_auth_setting, null);
    }

    public static /* synthetic */ Object ipc$super(ak1 ak1Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 797441118) {
            super.onPause();
            return null;
        } else if (hashCode == 1192889117) {
            super.s();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/open/permission/auth/ui/AuthSettingRender");
        }
    }

    public static final /* synthetic */ ScopeAdapter q1(ak1 ak1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScopeAdapter) ipChange.ipc$dispatch("bf282b48", new Object[]{ak1Var});
        }
        return ak1Var.i;
    }

    public static final /* synthetic */ List r1(ak1 ak1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("55c8cf81", new Object[]{ak1Var});
        }
        return ak1Var.j;
    }

    public static final /* synthetic */ bbs s1(ak1 ak1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("7b8a8909", new Object[]{ak1Var});
        }
        return ak1Var.d;
    }

    public static final /* synthetic */ TextView t1(ak1 ak1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("a8428ddd", new Object[]{ak1Var});
        }
        return ak1Var.k;
    }

    public static final /* synthetic */ RecyclerView u1(ak1 ak1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("29b51e61", new Object[]{ak1Var});
        }
        return ak1Var.h;
    }

    @Override // tb.qcs
    public void P(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb823f9b", new Object[]{this, str, json});
        } else {
            ckf.g(str, "event");
        }
    }

    @Override // tb.qcs
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e88638d3", new Object[]{this});
        }
        return "AUTH";
    }

    @Override // tb.qcs
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        View view = this.g;
        ckf.f(view, "rootView");
        return view;
    }

    @Override // com.taobao.themis.open.permission.auth.ui.ScopeAdapter.a
    public void h(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8802ffba", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        List<ScopeEntity> scopes = ((ScopeSettingEntity) ((ArrayList) this.j).get(i)).getScopes();
        if (scopes != null) {
            scopes.get(i2).setStatus(!scopes.get(i2).getStatus());
            scopes.get(i2).setChanged(!scopes.get(i2).isChanged());
            ScopeAdapter scopeAdapter = this.i;
            if (scopeAdapter != null) {
                scopeAdapter.notifyDataSetChanged();
            }
        }
    }

    @Override // tb.qcs
    public Bitmap l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ea6f4fbb", new Object[]{this});
        }
        return null;
    }

    @Override // tb.qcs
    public void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245d3ac6", new Object[]{this, str, str2});
        } else {
            ckf.g(str, "script");
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        v1();
    }

    @Override // tb.qcs
    public void r(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15684483", new Object[]{this, bArr, str});
        } else {
            ckf.g(bArr, "script");
        }
    }

    public final void v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4a6446a", new Object[]{this});
            return;
        }
        AuthUtils authUtils = AuthUtils.INSTANCE;
        bbs bbsVar = this.d;
        AuthUtils.InvokeType invokeType = AuthUtils.InvokeType.TYPE_ORIGIN;
        String str = this.l;
        ckf.f(str, "mAppId");
        authUtils.u(bbsVar, invokeType, str, this.m, this.j);
    }

    @Override // com.taobao.themis.open.permission.auth.ui.ScopeAdapter.a
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48821b2c", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        List<DomainItemEntity> domainItems = ((ScopeSettingEntity) ((ArrayList) this.j).get(i)).getDomainItems();
        if (domainItems != null) {
            if (domainItems.get(i2).isAuthed()) {
                domainItems.get(i2).setStatus("reject");
            } else {
                domainItems.get(i2).setStatus("accept");
            }
            domainItems.get(i2).setChanged(!domainItems.get(i2).isChanged());
            ScopeAdapter scopeAdapter = this.i;
            if (scopeAdapter != null) {
                scopeAdapter.notifyDataSetChanged();
            }
        }
    }

    @Override // com.taobao.themis.open.permission.auth.ui.ScopeAdapter.a
    public void g(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3ff9e1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        List<DomainItemEntity> domainItems = ((ScopeSettingEntity) ((ArrayList) this.j).get(i)).getDomainItems();
        if (domainItems != null) {
            List<ResourceItemEntity> resourceItems = domainItems.get(i2).getResourceItems();
            ResourceItemEntity resourceItemEntity = resourceItems == null ? null : resourceItems.get(i3);
            if (resourceItemEntity != null) {
                if (resourceItemEntity.isAuthed()) {
                    resourceItemEntity.setStatus("reject");
                } else {
                    resourceItemEntity.setStatus("accept");
                }
                resourceItemEntity.setChanged(!domainItems.get(i3).isChanged());
                ScopeAdapter scopeAdapter = this.i;
                if (scopeAdapter != null) {
                    scopeAdapter.notifyDataSetChanged();
                }
            }
        }
    }

    @Override // tb.d9s, tb.qcs
    public void s() {
        y0e titleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
            return;
        }
        super.s();
        tll pageContext = this.e.getPageContext();
        if (!(pageContext == null || (titleBar = pageContext.getTitleBar()) == null)) {
            titleBar.setTitle(this.f.getString(R.string.tms_scope_setting), "");
        }
        this.h = (RecyclerView) this.g.findViewById(R.id.tms_scope_list);
        this.i = new ScopeAdapter(this.j, this);
        RecyclerView recyclerView = this.h;
        ckf.d(recyclerView);
        recyclerView.setAdapter(this.i);
        RecyclerView recyclerView2 = this.h;
        ckf.d(recyclerView2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f));
        if (ckf.b(r8s.g(this.d), pg1.ATOM_EXT_black)) {
            RecyclerView recyclerView3 = this.h;
            ckf.d(recyclerView3);
            ViewGroup.LayoutParams layoutParams = recyclerView3.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = xcs.a(this.f, 80.0f);
                RecyclerView recyclerView4 = this.h;
                ckf.d(recyclerView4);
                recyclerView4.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
        }
        this.k = (TextView) this.g.findViewById(R.id.tms_no_setting_desc);
        new a(new WeakReference(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
