package com.taobao.taobao.setting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.statistic.TBS;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.R;
import com.taobao.taobao.setting.item.PaySettingItem;
import com.taobao.taobao.setting.item.PaySettingItemsAdapter;
import com.taobao.taobao.setting.network.PaySettingPageResponse;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.acq;
import tb.bau;
import tb.bf3;
import tb.cgp;
import tb.dgp;
import tb.pav;
import tb.tuv;
import tb.y3j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NewPaySettingsActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TRecyclerView f12950a;
    public PaySettingItemsAdapter b;
    public List<PaySettingItem> c;
    public TextView d;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.taobao.setting.NewPaySettingsActivity$4  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class AnonymousClass4 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RemoteBusiness addListener = RemoteBusiness.build(dgp.a(NewPaySettingsActivity.this), TaoHelper.getTTID()).addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.taobao.setting.NewPaySettingsActivity.4.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.taobao.taobao.setting.NewPaySettingsActivity$4$1$a */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
                public class a implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ MtopResponse f12952a;

                    public a(MtopResponse mtopResponse) {
                        this.f12952a = mtopResponse;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        bf3.h(bf3.b.o(this.f12952a.getApi(), true));
                        y3j.a();
                        y3j.c(cgp.KEY_CACHE_SETTING_PAY, JSON.toJSONString(NewPaySettingsActivity.l3(NewPaySettingsActivity.this)));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        bf3.h(bf3.b.o(mtopResponse.getApi(), false));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    List<PaySettingItem> list;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (mtopResponse != null && (baseOutDo instanceof PaySettingPageResponse) && (list = ((PaySettingPageResponse) baseOutDo).getData().result) != null && list.size() > 0) {
                        NewPaySettingsActivity.m3(NewPaySettingsActivity.this, list);
                        Coordinator.execute(new a(mtopResponse));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }
            });
            addListener.setUnitStrategy("UNIT_TRADE");
            addListener.startRequest(PaySettingPageResponse.class);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements TBPublicMenu.TBOnOverflowButtonClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnOverflowButtonClickListener
        public void onOverflowButtonClicked() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ddc419b", new Object[]{this});
            } else {
                TBS.Ext.commitEvent("Page_MYTBSettingVC_pay", Integer.parseInt("2101"), "Page_MYTBSettingVC_pay_功能直达", null, null, "spm=a2141.20998086.2.8");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
                bf3.f(bf3.a.a("paySeting_exposuer").tag("pv"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            y3j.a();
            List parseArray = JSON.parseArray(y3j.b(cgp.KEY_CACHE_SETTING_PAY), PaySettingItem.class);
            if (NewPaySettingsActivity.l3(NewPaySettingsActivity.this) == null) {
                if (parseArray == null || parseArray.isEmpty()) {
                    NewPaySettingsActivity.m3(NewPaySettingsActivity.this, cgp.a());
                    return;
                }
                NewPaySettingsActivity.m3(NewPaySettingsActivity.this, parseArray);
                NewPaySettingsActivity.a(NewPaySettingsActivity.this, parseArray);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f12956a;

        public d(List list) {
            this.f12956a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NewPaySettingsActivity.b(NewPaySettingsActivity.this).setData(this.f12956a);
            NewPaySettingsActivity.b(NewPaySettingsActivity.this).notifyDataSetChanged();
        }
    }

    public static /* synthetic */ void a(NewPaySettingsActivity newPaySettingsActivity, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698ec972", new Object[]{newPaySettingsActivity, list});
        } else {
            newPaySettingsActivity.c(list);
        }
    }

    public static /* synthetic */ PaySettingItemsAdapter b(NewPaySettingsActivity newPaySettingsActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PaySettingItemsAdapter) ipChange.ipc$dispatch("f73964ed", new Object[]{newPaySettingsActivity});
        }
        return newPaySettingsActivity.b;
    }

    public static /* synthetic */ Object ipc$super(NewPaySettingsActivity newPaySettingsActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/setting/NewPaySettingsActivity");
        }
    }

    public static /* synthetic */ List l3(NewPaySettingsActivity newPaySettingsActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("617e8", new Object[]{newPaySettingsActivity});
        }
        return newPaySettingsActivity.c;
    }

    public static /* synthetic */ void m3(NewPaySettingsActivity newPaySettingsActivity, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a282e271", new Object[]{newPaySettingsActivity, list});
        } else {
            newPaySettingsActivity.s3(list);
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

    public final void c(List<PaySettingItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4818c75f", new Object[]{this, list});
            return;
        }
        for (PaySettingItem paySettingItem : list) {
            bau.f(paySettingItem.event);
        }
    }

    public final void o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        PaySettingItemsAdapter paySettingItemsAdapter = new PaySettingItemsAdapter(this);
        this.b = paySettingItemsAdapter;
        this.f12950a.setAdapter(paySettingItemsAdapter);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        r3();
    }

    public final void p3() {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.f12950a = (TRecyclerView) findViewById(R.id.recycle_pay_setting_page_main_items);
        this.d = (TextView) findViewById(R.id.tv_pay_setting_desc);
        this.f12950a.setLayoutManager(new LinearLayoutManager(this, 1, false));
        if (!TextUtils.isEmpty("") && (textView = this.d) != null) {
            textView.setText("");
        }
    }

    public final void q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff742ee", new Object[]{this});
        } else {
            Coordinator.execute(new c());
        }
    }

    public void r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa6eaee", new Object[]{this});
        } else {
            Coordinator.execute(new AnonymousClass4());
        }
    }

    public final void s3(List<PaySettingItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c7d657", new Object[]{this, list});
            return;
        }
        this.c = list;
        runOnUiThread(new d(list));
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.pay_setting_page);
        if (getSupportActionBar() != null) {
            getSupportActionBar().show();
            getSupportActionBar().setTitle(Localization.q(R.string.taobao_app_1029_1_paysetting));
        }
        getPublicMenu().setOnOverflowButtonClickListener(new a());
        try {
            SystemBarDecorator systemBarDecorator = new SystemBarDecorator(this);
            this.systemBarDecorator = systemBarDecorator;
            systemBarDecorator.enableImmersiveStatusBar(true);
        } catch (Throwable th) {
            Log.e("TBMainActivity", "enableImmersiveStatusBar failed:", th);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a2141.20998086.2.1");
        tuv.e(this, "Page_MYTBSettingVC_pay");
        tuv.f(this, hashMap);
        p3();
        o3();
        q3();
        pav.k(new b());
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8788f87", new Object[]{this})).booleanValue();
        }
        TBS.Ext.commitEvent("Page_MYTBSettingVC_pay", Integer.parseInt("2101"), "Page_MYTBSettingVC_pay_返回", null, null, "spm=a2141.20998086.2.7");
        finish();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
        if (r6.getBoolean("cancel").booleanValue() != false) goto L_0x004b;
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.taobao.setting.NewPaySettingsActivity.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0025
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r5)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r6)
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r4
            r6[r0] = r3
            r0 = 2
            r6[r0] = r5
            r5 = 3
            r6[r5] = r7
            java.lang.String r5 = "4af7346f"
            r2.ipc$dispatch(r5, r6)
            return
        L_0x0025:
            super.onActivityResult(r5, r6, r7)
            java.util.List<com.taobao.taobao.setting.item.PaySettingItem> r6 = r4.c
            java.lang.String r5 = tb.bau.a(r5, r6)
            java.lang.String r6 = "result"
            java.lang.String r6 = r7.getStringExtra(r6)     // Catch: Exception -> 0x0048
            com.alibaba.fastjson.JSONObject r6 = com.alibaba.fastjson.JSON.parseObject(r6)     // Catch: Exception -> 0x0048
            if (r6 == 0) goto L_0x004a
            java.lang.String r7 = "cancel"
            java.lang.Boolean r6 = r6.getBoolean(r7)     // Catch: Exception -> 0x0048
            boolean r6 = r6.booleanValue()     // Catch: Exception -> 0x0048
            if (r6 == 0) goto L_0x004a
            goto L_0x004b
        L_0x0048:
            goto L_0x004c
        L_0x004a:
            r0 = 0
        L_0x004b:
            r1 = r0
        L_0x004c:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x005c
            if (r1 != 0) goto L_0x005c
            com.taobao.android.nav.Nav r6 = com.taobao.android.nav.Nav.from(r4)
            r6.toUri(r5)
            goto L_0x005f
        L_0x005c:
            r4.r3()
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taobao.setting.NewPaySettingsActivity.onActivityResult(int, int, android.content.Intent):void");
    }
}
