package com.alibaba.android.ultron.common.page;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.taobao.TBActionBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.android.ultron.common.widget.NestedPtrRecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.GloblaNavUIConfig;
import com.taobao.android.nav.Nav;
import com.taobao.ptr.PtrBase;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.Globals;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.acq;
import tb.fdv;
import tb.g5e;
import tb.gj4;
import tb.guk;
import tb.iz;
import tb.kdv;
import tb.nll;
import tb.pi8;
import tb.q6v;
import tb.sbl;
import tb.t2o;
import tb.w1u;
import tb.ykl;
import tb.zua;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronCommonActivity extends AppCompatActivity implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public NestedPtrRecyclerView f2246a;
    public LinearLayout b;
    public LinearLayout c;
    public TextView d;
    public TextView e;
    public PtrBase f;
    public LinearLayout g;
    public zua h;
    public b i;
    public View j;
    public View k;
    public TIconFontTextView l;
    public String m = "once";
    public String n = null;
    public String o = null;
    public JSONObject p;
    public OnScreenChangedListener q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
            guk.a(this, activity, i, configuration);
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                return;
            }
            try {
                UltronCommonActivity.l3(UltronCommonActivity.this);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        t2o.a(153092112);
    }

    public static /* synthetic */ Object ipc$super(UltronCommonActivity ultronCommonActivity, String str, Object... objArr) {
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
            case 797441118:
                super.onPause();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/common/page/UltronCommonActivity");
        }
    }

    public static /* synthetic */ void l3(UltronCommonActivity ultronCommonActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7294f626", new Object[]{ultronCommonActivity});
        } else {
            ultronCommonActivity.t3();
        }
    }

    public static /* synthetic */ b m3(UltronCommonActivity ultronCommonActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e6dff022", new Object[]{ultronCommonActivity});
        }
        return ultronCommonActivity.i;
    }

    public static /* synthetic */ void n3(UltronCommonActivity ultronCommonActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ddb88c", new Object[]{ultronCommonActivity, jSONObject});
        } else {
            ultronCommonActivity.v3(jSONObject);
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == this.j.getId()) {
            finish();
        } else if (view.getId() == this.e.getId() && (jSONObject = this.p) != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("rightItem").getJSONObject("events");
            this.i.t(jSONObject2 != null ? jSONObject2.getJSONArray("click") : null);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.ultron_common_page);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        try {
            new SystemBarDecorator(this).enableImmersiveStatusBar(true);
        } catch (Throwable th) {
            Log.e("TBMainActivity", "enableImmersiveStatusBar failed:", th);
        }
        s3();
        q3();
        o3();
        if (ykl.a()) {
            u3();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        b bVar = this.i;
        if (bVar != null) {
            bVar.l();
        }
        if (this.q != null) {
            TBAutoSizeConfig.x().h0(this.q);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else {
            super.onNewIntent(intent);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
    }

    public final Map<String, String> p3(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("24ed5486", new Object[]{this, uri});
        }
        String queryParameter = uri.getQueryParameter("params");
        if (queryParameter == null) {
            return null;
        }
        return new HashMap<String, String>(queryParameter) { // from class: com.alibaba.android.ultron.common.page.UltronCommonActivity.4
            public final /* synthetic */ String val$params;

            {
                this.val$params = queryParameter;
                put("params", queryParameter);
            }
        };
    }

    public final void q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        b bVar = new b(this);
        this.i = bVar;
        bVar.j(this.b, this.f2246a, this.c, this.f);
        this.i.s(new com.alibaba.android.ultron.common.page.a(this));
        this.i.r(new pi8(this.g, this));
    }

    public final void r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4648632f", new Object[]{this});
            return;
        }
        SystemBarDecorator systemBarDecorator = new SystemBarDecorator(this);
        if (w1u.d(w1u.b(4473924))) {
            systemBarDecorator.enableImmersiveStatusBar(true);
        } else {
            systemBarDecorator.enableImmersiveStatusBar();
        }
        if (FestivalMgr.i().v("global")) {
            int h = FestivalMgr.i().h(GloblaNavUIConfig.KEY_GLOBAL_ACTIONBAR_TEXT_COLOR, getResources().getColor(R.color.D));
            this.d.setTextColor(h);
            this.e.setTextColor(h);
            this.l.setTextColor(h);
            if (w1u.d(h)) {
                FestivalMgr.i().E(this, this.k, TBActionBar.ActionBarStyle.NORMAL);
            } else {
                FestivalMgr.i().E(this, this.k, TBActionBar.ActionBarStyle.DARK);
            }
        }
    }

    public final void s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.f2246a = (NestedPtrRecyclerView) findViewById(R.id.common_page_recycler_view);
        this.f = (PtrBase) findViewById(R.id.common_page_ultron_refresh);
        this.f2246a.setLayoutManager(new LinearLayoutManager(this));
        this.b = (LinearLayout) findViewById(R.id.common_page_top_layout);
        this.c = (LinearLayout) findViewById(R.id.common_page_bottom_layout);
        this.g = (LinearLayout) findViewById(R.id.status_container);
        this.d = (TextView) findViewById(R.id.common_page_title);
        this.e = (TextView) findViewById(R.id.common_page_actionbar);
        this.h = new zua(this, this.b);
        int i = R.id.back_to_pre;
        this.j = findViewById(i);
        this.k = findViewById(R.id.title_bar);
        this.l = (TIconFontTextView) findViewById(i);
        this.f.getStartLayout().setLoadingDelegate(this.h);
        this.f.setOnRefreshListener(new q6v(this));
        ViewProxy.setOnClickListener(this.j, this);
        this.e.setOnClickListener(this);
        this.e.setVisibility(8);
        r3();
    }

    public final void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838df391", new Object[]{this});
            return;
        }
        g5e f = this.i.f();
        if (f instanceof iz) {
            ((iz) f).h().V(127);
        }
    }

    public final void u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57549641", new Object[]{this});
            return;
        }
        this.q = new a();
        TBAutoSizeConfig.x().d0(this.q);
    }

    public final void o3() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad1c1493", new Object[]{this});
        } else if (getIntent() != null) {
            try {
                Uri data = getIntent().getData();
                if (data != null) {
                    String queryParameter = data.getQueryParameter(gj4.f20039a);
                    this.m = data.getQueryParameter(gj4.b);
                    JSONObject b = nll.c().b(this, queryParameter);
                    if (b == null) {
                        finish();
                        return;
                    }
                    String a2 = sbl.a(queryParameter, null);
                    if (!TextUtils.isEmpty(a2)) {
                        Nav.from(Globals.getApplication()).toUri(a2);
                        finish();
                        return;
                    }
                    String str = gj4.o;
                    if (b.containsKey(str) && (jSONObject = b.getJSONObject(str)) != null) {
                        this.n = jSONObject.getString(gj4.p);
                        this.o = jSONObject.getString(gj4.q);
                    }
                    String string = b.getString(gj4.k);
                    if (!TextUtils.isEmpty(string)) {
                        this.d.setText(string);
                    }
                    this.i.q(b, this.n, p3(data));
                    if ("once".equals(this.m)) {
                        this.i.o(1);
                    }
                }
            } catch (Exception e) {
                String message = e.getMessage();
                kdv.a(this.n, fdv.F_DATA_PROCESS, "READ_ASSET_CONFIG_EXCEPTION", message, null, null);
                kdv.b(this.n, fdv.F_DATA_PROCESS, "get_page_config", "READ_ASSET_CONFIG_EXCEPTION", message, null);
            }
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
        if (!TextUtils.isEmpty(this.n)) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, this.n);
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(this, this.n);
        }
        if (!TextUtils.isEmpty(this.o)) {
            HashMap hashMap = new HashMap();
            hashMap.put("spm-cnt", this.o);
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
        }
        if (!"once".equals(this.m)) {
            this.i.o(1);
        }
        try {
            String str = this.n + "_Home_Show";
            HashMap hashMap2 = new HashMap();
            if (getIntent() != null) {
                hashMap2.put("base-url", getIntent().getData().toString());
            }
            String pageSpmUrl = UTAnalytics.getInstance().getDefaultTracker().getPageSpmUrl(this);
            if (!TextUtils.isEmpty(pageSpmUrl)) {
                hashMap2.put("spm-pre", pageSpmUrl);
            }
            kdv.b(this.n, "pageShow", str, str, "", hashMap2);
        } catch (Exception unused) {
        }
    }

    public final void v3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3727329b", new Object[]{this, jSONObject});
        } else if (jSONObject == null || !jSONObject.containsKey("navigationItem")) {
            this.e.setVisibility(8);
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("navigationItem");
            this.p = jSONObject2;
            JSONObject jSONObject3 = jSONObject2 != null ? jSONObject2.getJSONObject("rightItem") : null;
            JSONObject jSONObject4 = jSONObject3 != null ? jSONObject3.getJSONObject("fields") : null;
            String string = jSONObject4 != null ? jSONObject4.getString("title") : null;
            if (!TextUtils.isEmpty(string)) {
                this.e.setText(string);
                this.e.setVisibility(0);
                return;
            }
            this.p = null;
            this.e.setVisibility(8);
        }
    }
}
