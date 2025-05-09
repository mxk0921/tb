package com.taobao.android.promotion.content;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a65;
import tb.acq;
import tb.cu5;
import tb.dq4;
import tb.gf5;
import tb.hxj;
import tb.if5;
import tb.il6;
import tb.m4v;
import tb.odg;
import tb.qo4;
import tb.ro4;
import tb.t2o;
import tb.tv6;
import tb.uo4;
import tb.vo4;
import tb.vwo;
import tb.wo4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ContentDetailActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INDEX_CHANGED_RESULT = 11;
    public static final int INDEX_NOT_CHANGED_RESULT = 12;
    public static final int START_CONTENT_DETAIL_CODE = 10;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f9190a;
    public DXRootView b;
    public qo4 c;
    public DXRecyclerLayout d;
    public ContentRequestClient e;
    public DXTemplateItem f;
    public TBPublicMenu g;
    public DinamicXEngine i;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final View.OnAttachStateChangeListener j = new a();
    public final IRemoteBaseListener k = new IRemoteBaseListener() { // from class: com.taobao.android.promotion.content.ContentDetailActivity.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.promotion.content.ContentDetailActivity$2$a */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!dq4.d(ContentDetailActivity.this)) {
                    ContentDetailActivity.u3(ContentDetailActivity.this);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.promotion.content.ContentDetailActivity$2$b */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ContentDetailActivity.v3(ContentDetailActivity.this, DXRecyclerLayout.LOAD_MORE_STOPED);
                }
            }
        }

        private void onRequestFailed(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5ad9cd9", new Object[]{this, mtopResponse});
            } else {
                dq4.h(ContentDetailActivity.t3(ContentDetailActivity.this), new b());
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            onRequestFailed(mtopResponse);
            dq4.e(mtopResponse, "种草列表请求失败-加载更多");
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            onRequestFailed(mtopResponse);
            dq4.e(mtopResponse, "种草列表请求失败-加载更多");
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                StringBuilder sb = new StringBuilder("mtop onSuccess, but data is empty, mtopResponse == null : ");
                sb.append(mtopResponse == null);
                odg.c("ContentDetailActivity", sb.toString());
            } else {
                ContentDetailActivity.s3(ContentDetailActivity.this).H(new String(mtopResponse.getBytedata()));
                dq4.h(ContentDetailActivity.t3(ContentDetailActivity.this), new a());
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            } else if (ContentDetailActivity.l3(ContentDetailActivity.this) != null) {
                ContentDetailActivity.l3(ContentDetailActivity.this).t0(ContentDetailActivity.m3(ContentDetailActivity.this));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            } else if (ContentDetailActivity.l3(ContentDetailActivity.this) != null) {
                ContentDetailActivity.l3(ContentDetailActivity.this).u0(ContentDetailActivity.m3(ContentDetailActivity.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements gf5 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f9194a;
        public final /* synthetic */ DXTemplateItem b;

        public b(JSONObject jSONObject, DXTemplateItem dXTemplateItem) {
            this.f9194a = jSONObject;
            this.b = dXTemplateItem;
        }

        @Override // tb.gf5
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
                return;
            }
            odg.c("ContentDetailActivity", "create dx( name:" + this.b.e() + " version:" + this.b.h() + " url:" + this.b.c + " ) failed, error: " + str);
        }

        @Override // tb.gf5
        public void b(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24eeaeea", new Object[]{this, viewGroup});
            } else if (viewGroup instanceof DXRootView) {
                DXRootView m3 = ContentDetailActivity.m3(ContentDetailActivity.this);
                ContentDetailActivity.o3(ContentDetailActivity.this, (DXRootView) viewGroup);
                ViewParent parent = ContentDetailActivity.m3(ContentDetailActivity.this).getParent();
                if (parent != ContentDetailActivity.y3(ContentDetailActivity.this)) {
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(ContentDetailActivity.m3(ContentDetailActivity.this));
                    }
                    ContentDetailActivity.y3(ContentDetailActivity.this).removeView(m3);
                    ContentDetailActivity.y3(ContentDetailActivity.this).addView(ContentDetailActivity.m3(ContentDetailActivity.this), 0);
                }
                ContentDetailActivity contentDetailActivity = ContentDetailActivity.this;
                ContentDetailActivity.z3(contentDetailActivity, ContentDetailActivity.m3(contentDetailActivity), this.f9194a);
                if (!ContentDetailActivity.s3(ContentDetailActivity.this).y()) {
                    ContentDetailActivity.n3(ContentDetailActivity.this, DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING);
                }
                ContentDetailActivity.m3(ContentDetailActivity.this).removeOnAttachStateChangeListener(ContentDetailActivity.p3(ContentDetailActivity.this));
                ContentDetailActivity.m3(ContentDetailActivity.this).addOnAttachStateChangeListener(ContentDetailActivity.p3(ContentDetailActivity.this));
                ContentDetailActivity contentDetailActivity2 = ContentDetailActivity.this;
                ContentDetailActivity.q3(contentDetailActivity2, ContentDetailActivity.s3(contentDetailActivity2).j());
            }
        }
    }

    static {
        t2o.a(629145607);
    }

    public static /* synthetic */ Object ipc$super(ContentDetailActivity contentDetailActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/promotion/content/ContentDetailActivity");
        }
    }

    public static /* synthetic */ DinamicXEngine l3(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("1185fa5", new Object[]{contentDetailActivity});
        }
        return contentDetailActivity.i;
    }

    public static /* synthetic */ DXRootView m3(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("95af8194", new Object[]{contentDetailActivity});
        }
        return contentDetailActivity.b;
    }

    public static /* synthetic */ void n3(ContentDetailActivity contentDetailActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f8db5b", new Object[]{contentDetailActivity, str});
        } else {
            contentDetailActivity.J3(str);
        }
    }

    public static /* synthetic */ DXRootView o3(ContentDetailActivity contentDetailActivity, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("dff2a7b1", new Object[]{contentDetailActivity, dXRootView});
        }
        contentDetailActivity.b = dXRootView;
        return dXRootView;
    }

    public static /* synthetic */ View.OnAttachStateChangeListener p3(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnAttachStateChangeListener) ipChange.ipc$dispatch("3b873067", new Object[]{contentDetailActivity});
        }
        return contentDetailActivity.j;
    }

    public static /* synthetic */ void q3(ContentDetailActivity contentDetailActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78944210", new Object[]{contentDetailActivity, new Integer(i)});
        } else {
            contentDetailActivity.H3(i);
        }
    }

    public static /* synthetic */ DXRecyclerLayout r3(ContentDetailActivity contentDetailActivity, DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerLayout) ipChange.ipc$dispatch("57508232", new Object[]{contentDetailActivity, dXRecyclerLayout});
        }
        contentDetailActivity.d = dXRecyclerLayout;
        return dXRecyclerLayout;
    }

    public static /* synthetic */ qo4 s3(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qo4) ipChange.ipc$dispatch("5cf7d4d1", new Object[]{contentDetailActivity});
        }
        return contentDetailActivity.c;
    }

    public static /* synthetic */ Handler t3(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("b98ed041", new Object[]{contentDetailActivity});
        }
        return contentDetailActivity.h;
    }

    public static /* synthetic */ void u3(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f69eae26", new Object[]{contentDetailActivity});
        } else {
            contentDetailActivity.K3();
        }
    }

    public static /* synthetic */ void v3(ContentDetailActivity contentDetailActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b8b47f1", new Object[]{contentDetailActivity, str});
        } else {
            contentDetailActivity.A3(str);
        }
    }

    public static /* synthetic */ TBPublicMenu w3(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenu) ipChange.ipc$dispatch("7b774d11", new Object[]{contentDetailActivity});
        }
        return contentDetailActivity.g;
    }

    public static /* synthetic */ void x3(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e32169", new Object[]{contentDetailActivity});
        } else {
            contentDetailActivity.I3();
        }
    }

    public static /* synthetic */ ViewGroup y3(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("b1314dab", new Object[]{contentDetailActivity});
        }
        return contentDetailActivity.f9190a;
    }

    public static /* synthetic */ void z3(ContentDetailActivity contentDetailActivity, DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92101104", new Object[]{contentDetailActivity, dXRootView, jSONObject});
        } else {
            contentDetailActivity.G3(dXRootView, jSONObject);
        }
    }

    public final void A3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d43f837", new Object[]{this, str});
        } else if (this.d != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) str);
            dq4.g(DXRecyclerLayout.MSG_METHOD_LOAD_MORE, jSONObject, this.d);
        }
    }

    public void B3(DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a477fbb", new Object[]{this, dXTemplateItem, jSONObject});
        } else if (dXTemplateItem != null) {
            il6.b(this.i, dXTemplateItem, this.f9190a, new b(jSONObject, dXTemplateItem));
        }
    }

    public final int C3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("423e5f1", new Object[]{this})).intValue();
        }
        DXRecyclerLayout dXRecyclerLayout = this.d;
        if (dXRecyclerLayout == null) {
            return -1;
        }
        RecyclerView j0 = dXRecyclerLayout.j0();
        int childCount = j0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = j0.getChildAt(i);
            int top = childAt.getTop();
            if (top > -10 && top < 10) {
                return j0.getChildLayoutPosition(childAt);
            }
        }
        return -1;
    }

    public void F3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f65f062", new Object[]{this});
        } else {
            this.e.c(null, this.c.r(), this.k, this.c.A(), this.c.p());
        }
    }

    public final void G3(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be83805e", new Object[]{this, dXRootView, jSONObject});
        } else {
            il6.d(this.i, dXRootView, jSONObject, new c(dXRootView));
        }
    }

    public final void H3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2314fd0", new Object[]{this, new Integer(i)});
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = this.d;
        if (dXRecyclerLayout != null) {
            dXRecyclerLayout.c1(false, i);
        }
    }

    public final void I3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("416cf1b3", new Object[]{this});
            return;
        }
        int b2 = a65.b(this.f9190a.getHeight());
        DXTemplateItem dXTemplateItem = this.f;
        qo4 qo4Var = this.c;
        B3(dXTemplateItem, dq4.b(qo4Var.s(qo4Var.r()), null, "success", "", String.valueOf(b2), this.c.v()));
    }

    public final void J3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42cd347e", new Object[]{this, str});
        } else if (this.d != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) str);
            dq4.g(DXRecyclerLayout.MSG_METHOD_LOAD_MORE, jSONObject, this.d);
        }
    }

    public final void K3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("661c48f9", new Object[]{this});
        } else if (this.d != null) {
            qo4 qo4Var = this.c;
            JSONArray s = qo4Var.s(qo4Var.r());
            if (s != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("data", (Object) s);
                dq4.g(DXRecyclerLayout.MSG_METHOD_REFRESH_DATA, jSONObject, this.d);
                if (!this.c.y()) {
                    J3(DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING);
                }
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        int C3 = C3();
        if (!(C3 == -1 || C3 == this.c.j())) {
            this.c.K(C3);
            setResult(-1);
        }
        super.finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_promotion_content_detail);
        DinamicXEngine a2 = il6.a();
        this.i = a2;
        a2.W0(cu5.DX_EVENT_DCEVENT, new cu5(this, null));
        D3();
        E3();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ContentRequestClient contentRequestClient = this.e;
        if (contentRequestClient != null) {
            contentRequestClient.b();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        HashMap hashMap = new HashMap();
        qo4 qo4Var = this.c;
        if (qo4Var != null) {
            hashMap.put("content_id", qo4Var.h());
            hashMap.put("item_id", this.c.n());
            hashMap.put("category_id", this.c.f());
        }
        m4v.a(this, "Page_DetailContentSingle", hashMap);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements if5 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRootView f9195a;

        public c(DXRootView dXRootView) {
            this.f9195a = dXRootView;
        }

        @Override // tb.if5
        public void b(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24eeaeea", new Object[]{this, viewGroup});
            } else if (viewGroup instanceof DXRootView) {
                ContentDetailActivity.r3(ContentDetailActivity.this, (DXRecyclerLayout) ((DXRootView) viewGroup).getExpandWidgetNode().queryWidgetNodeByUserId("recyclerContentDetail"));
            }
        }

        @Override // tb.if5
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
                return;
            }
            odg.c("ContentDetailActivity", "render dxView( " + this.f9195a + " ) failed, error: " + str);
        }
    }

    public final void D3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("dxUrl");
        String stringExtra2 = intent.getStringExtra("dxVersion");
        String stringExtra3 = intent.getStringExtra("dxName");
        String stringExtra4 = intent.getStringExtra(hxj.UNIQID);
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        this.f = dXTemplateItem;
        dXTemplateItem.c = stringExtra;
        dXTemplateItem.f7343a = stringExtra3;
        dXTemplateItem.b = dq4.f(stringExtra2);
        qo4 b2 = ro4.b(stringExtra4);
        this.c = b2;
        if (b2 == null) {
            odg.c("ContentDetailActivity", "data engine is null, uniqueId is " + stringExtra4);
            return;
        }
        this.e = new ContentRequestClient(this.c.n(), this.c.u(), "contentDetail");
    }

    public final void E3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
        } else if (this.c == null) {
            finish();
            odg.c("ContentDetailActivity", "data engine is null");
        } else {
            this.f9190a = (ViewGroup) findViewById(R.id.page_container);
            View findViewById = findViewById(R.id.tv_back);
            View findViewById2 = findViewById(R.id.tv_more);
            this.g = new TBPublicMenu(this);
            ViewProxy.setOnClickListener(findViewById, new uo4(this));
            ViewProxy.setOnClickListener(findViewById2, new vo4(this));
            ((FrameLayout.LayoutParams) findViewById(R.id.action_bar).getLayoutParams()).topMargin = vwo.g(this);
            vwo.o(this, true);
            this.f9190a.post(new wo4(this));
            if (tv6.a()) {
                Toast.makeText(this, "这是新种草页面!!!!!!", 1).show();
            }
        }
    }
}
