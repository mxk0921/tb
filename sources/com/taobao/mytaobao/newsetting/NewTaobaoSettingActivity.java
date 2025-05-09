package com.taobao.mytaobao.newsetting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.nav.Nav;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.login4android.api.aidl.ICheckResultCallback;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.mytaobao.newSettingV2.MtbSettingsCache;
import com.taobao.mytaobao.newsetting.business.model.ComplianceSettingItem;
import com.taobao.mytaobao.newsetting.business.model.DynamicSettingItem;
import com.taobao.mytaobao.newsetting.business.response.DynamicSettingPageResponse;
import com.taobao.tao.Globals;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a2k;
import tb.acq;
import tb.f3j;
import tb.ish;
import tb.j9t;
import tb.osh;
import tb.p3j;
import tb.qfp;
import tb.s32;
import tb.suv;
import tb.t2o;
import tb.u3j;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NewTaobaoSettingActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_COMPLIANCE_SETTING_DATA = "{\"textColor\":\"#597CAA\",\"textSize\":\"3\",\"items\":[[{\"text\":\"《证照信息》\",\"navUrl\":\"https://haibao.m.taobao.com/html/n2FCkYzwa\",\"userTrack\":{\"arg1\":\"Page_MYTBSettingVC_Button-license\",\"params\":{\"spm\":\"a2141.20998086.1.30\"}}},{\"text\":\"《淘宝规则》\",\"navUrl\":\"https://market.m.taobao.com/app/msd/mobile-rule/index.html?spm=a2159r.13376460.0.0\",\"userTrack\":{\"arg1\":\"Page_MYTBSettingVC_Button-TBGZ\",\"params\":{\"spm\":\"a2141.20998086.1.31\"}}},{\"text\":\"《淘宝平台服务协议》\",\"navUrl\":\"http://terms.alicdn.com/legal-agreement/terms/TD/TD201609301342_19559.html?spm=a2145.7268393.0.0.4b1c0162lHc2R0\",\"userTrack\":{\"arg1\":\"Page_MYTBSettingVC_Button-protocol\",\"params\":{\"spm\":\"a2141.20998086.1.32\"}}}],[{\"text\":\"《天猫规则》\",\"navUrl\":\"https://market.m.taobao.com/app/msd/mobile-rule/index.html?identity=tmall&spm=defwork.home.0.0.5b283f1bsdAifB#/home\",\"userTrack\":{\"arg1\":\"Page_MYTBSettingVC_Button-TMGZ\",\"params\":{\"spm\":\"a2141.20998086.1.33\"}}},{\"text\":\"《个人信息共享清单》\",\"navUrl\":\"https://terms.alicdn.com/legal-agreement/terms/suit_bu1_taobao/suit_bu1_taobao202112231044_47733.html\",\"userTrack\":{\"arg1\":\"Page_MYTBSettingVC_Button-GXQD\",\"params\":{\"spm\":\"a2141.20998086.1.34\"}}},{\"text\":\"《个人信息收集清单》\",\"navUrl\":\"https://market.m.taobao.com/app/msd/m-privacy-center/index.html#/pinfolist/home\",\"userTrack\":{\"arg1\":\"Page_MYTBSettingVC_Button-SJQD\",\"params\":{\"spm\":\"a2141.20998086.1.35\"}}}]]}";
    public static final String EXTRA_KEY_SHOW_LOGOUT = "showLogout";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class AnonymousClass1 extends ICheckResultCallback.Stub {
        public AnonymousClass1() {
        }

        @Override // com.taobao.login4android.api.aidl.ICheckResultCallback
        public void onFail(String str, String str2) throws RemoteException {
            NewTaobaoSettingActivity.a(NewTaobaoSettingActivity.this, 8);
        }

        @Override // com.taobao.login4android.api.aidl.ICheckResultCallback
        public void onSucess(boolean z) throws RemoteException {
            if (z) {
                NewTaobaoSettingActivity.a(NewTaobaoSettingActivity.this, 0);
            } else {
                NewTaobaoSettingActivity.a(NewTaobaoSettingActivity.this, 8);
            }
        }
    }

    /* renamed from: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    class AnonymousClass2 extends ICheckResultCallback.Stub {
        public AnonymousClass2() {
        }

        @Override // com.taobao.login4android.api.aidl.ICheckResultCallback
        public void onFail(String str, String str2) throws RemoteException {
            NewTaobaoSettingActivity.b(NewTaobaoSettingActivity.this, false);
        }

        @Override // com.taobao.login4android.api.aidl.ICheckResultCallback
        public void onSucess(boolean z) throws RemoteException {
            NewTaobaoSettingActivity.b(NewTaobaoSettingActivity.this, z);
        }
    }

    /* renamed from: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity$6  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class AnonymousClass6 implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass6() {
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (mtopResponse != null) {
                f3j.b("MyTaoBao_Settings", "LoadMyTaoBao_Settings", null, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            if (!(baseOutDo == null || baseOutDo.getData() == null)) {
                NewTaobaoSettingActivity.c(NewTaobaoSettingActivity.this, (DynamicSettingPageResponse) baseOutDo);
                NewTaobaoSettingActivity.d(NewTaobaoSettingActivity.this, mtopResponse);
            }
            f3j.e("MyTaoBao_Settings", "LoadMyTaoBao_Settings", null);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                onError(i, mtopResponse, obj);
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class CustomBCR extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(745537801);
        }

        public static /* synthetic */ Object ipc$super(CustomBCR customBCR, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/newsetting/NewTaobaoSettingActivity$CustomBCR");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && "AVATAR_CHANGED_SUCCESS".equals(intent.getAction())) {
                NewTaobaoSettingActivity.j(null).a();
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ List f11241a;

            public a(List list) {
                this.f11241a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    NewTaobaoSettingActivity.f(NewTaobaoSettingActivity.this, this.f11241a);
                }
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                jSONObject = JSON.parseObject(osh.b);
            } catch (Exception unused) {
                jSONObject = null;
            }
            NewTaobaoSettingActivity.this.runOnUiThread(new a(NewTaobaoSettingActivity.e(NewTaobaoSettingActivity.this, jSONObject)));
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class e implements Comparator<List<DynamicSettingItem>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(745537802);
        }

        public e() {
        }

        /* renamed from: a */
        public int compare(List<DynamicSettingItem> list, List<DynamicSettingItem> list2) {
            String str;
            DynamicSettingItem dynamicSettingItem;
            DynamicSettingItem dynamicSettingItem2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b0d22ec1", new Object[]{this, list, list2})).intValue();
            }
            String str2 = "";
            if (list == null || list.size() <= 0 || (dynamicSettingItem2 = list.get(0)) == null) {
                str = str2;
            } else {
                str = dynamicSettingItem2.moduleNumber;
            }
            if (!(list2 == null || list2.size() <= 0 || (dynamicSettingItem = list2.get(0)) == null)) {
                str2 = dynamicSettingItem.moduleNumber;
            }
            int b = b(str);
            int b2 = b(str2);
            if (b > b2) {
                return 1;
            }
            if (b < b2) {
                return -1;
            }
            return 0;
        }

        public final int b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9e5af6c5", new Object[]{this, str})).intValue();
            }
            if (TextUtils.isEmpty(str) || !TextUtils.isDigitsOnly(str)) {
                return 99;
            }
            return Integer.valueOf(str).intValue();
        }

        public /* synthetic */ e(AnonymousClass1 r1) {
            this();
        }
    }

    static {
        t2o.a(745537789);
        t2o.a(745537775);
    }

    public NewTaobaoSettingActivity() {
        ApplicationInvoker.getInstance("com.taobao.mytaobao").invoke("com.taobao.tao.MytaobaoApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ void a(NewTaobaoSettingActivity newTaobaoSettingActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202e4167", new Object[]{newTaobaoSettingActivity, new Integer(i)});
        } else {
            newTaobaoSettingActivity.G3(i);
        }
    }

    public static /* synthetic */ boolean b(NewTaobaoSettingActivity newTaobaoSettingActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("550d01bf", new Object[]{newTaobaoSettingActivity, new Boolean(z)})).booleanValue();
        }
        newTaobaoSettingActivity.getClass();
        return z;
    }

    public static /* synthetic */ void c(NewTaobaoSettingActivity newTaobaoSettingActivity, DynamicSettingPageResponse dynamicSettingPageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2748f37a", new Object[]{newTaobaoSettingActivity, dynamicSettingPageResponse});
        } else {
            newTaobaoSettingActivity.D3(dynamicSettingPageResponse);
        }
    }

    public static /* synthetic */ void d(NewTaobaoSettingActivity newTaobaoSettingActivity, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43817fce", new Object[]{newTaobaoSettingActivity, mtopResponse});
        } else {
            newTaobaoSettingActivity.F3(mtopResponse);
        }
    }

    public static /* synthetic */ List e(NewTaobaoSettingActivity newTaobaoSettingActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c06d437f", new Object[]{newTaobaoSettingActivity, jSONObject});
        }
        return newTaobaoSettingActivity.v3(jSONObject);
    }

    public static /* synthetic */ void f(NewTaobaoSettingActivity newTaobaoSettingActivity, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb257cf8", new Object[]{newTaobaoSettingActivity, list});
        } else {
            newTaobaoSettingActivity.C3(list);
        }
    }

    public static /* synthetic */ void g(NewTaobaoSettingActivity newTaobaoSettingActivity, ComplianceSettingItem complianceSettingItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6618880b", new Object[]{newTaobaoSettingActivity, complianceSettingItem});
        } else {
            newTaobaoSettingActivity.y3(complianceSettingItem);
        }
    }

    public static /* synthetic */ TextView h(NewTaobaoSettingActivity newTaobaoSettingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("ac85174e", new Object[]{newTaobaoSettingActivity});
        }
        newTaobaoSettingActivity.getClass();
        return null;
    }

    public static /* synthetic */ void i(NewTaobaoSettingActivity newTaobaoSettingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("213f035", new Object[]{newTaobaoSettingActivity});
        } else {
            newTaobaoSettingActivity.x3();
        }
    }

    public static /* synthetic */ Object ipc$super(NewTaobaoSettingActivity newTaobaoSettingActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mytaobao/newsetting/NewTaobaoSettingActivity");
        }
    }

    public static /* synthetic */ j9t j(NewTaobaoSettingActivity newTaobaoSettingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j9t) ipChange.ipc$dispatch("def4fea6", new Object[]{newTaobaoSettingActivity});
        }
        newTaobaoSettingActivity.getClass();
        return null;
    }

    public final List<ComplianceSettingItem> A3(JSONArray jSONArray, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ab0ab357", new Object[]{this, jSONArray, str, str2});
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) next;
                jSONObject.put("textSize", (Object) str);
                jSONObject.put("textColor", (Object) str2);
                ComplianceSettingItem complianceSettingItem = (ComplianceSettingItem) JSON.parseObject(jSONObject.toJSONString(), ComplianceSettingItem.class);
                if (complianceSettingItem != null) {
                    arrayList.add(complianceSettingItem);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    public final View B3(ComplianceSettingItem complianceSettingItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c13c082a", new Object[]{this, complianceSettingItem});
        }
        TextView textView = new TextView(this);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        complianceSettingItem.processDefaultValue();
        textView.setText(complianceSettingItem.text);
        textView.setTextSize(2, complianceSettingItem.parseTextSize() + 10);
        textView.setTextColor(complianceSettingItem.parseTextColor());
        textView.setOnClickListener(new a2k(this, complianceSettingItem));
        return textView;
    }

    public final void C3(List<List<ComplianceSettingItem>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39f4de7", new Object[]{this, list});
        } else if (list != null) {
            Iterator<List<ComplianceSettingItem>> it = list.iterator();
            if (it.hasNext()) {
                w3(it.next());
                throw null;
            }
        }
    }

    public final void D3(DynamicSettingPageResponse dynamicSettingPageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca29e21d", new Object[]{this, dynamicSettingPageResponse});
            return;
        }
        List<DynamicSettingItem> H3 = H3(dynamicSettingPageResponse.getData().getResult());
        if (H3 != null && H3.size() > 0) {
            E3(H3);
        }
    }

    public final void E3(List<DynamicSettingItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e4ee81", new Object[]{this, list});
            return;
        }
        throw null;
    }

    public final void F3(final MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cd7c2d", new Object[]{this, mtopResponse});
        } else {
            p3j.d(new Runnable() { // from class: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MtbSettingsCache.INSTANCE.c("mtbSettingsPageSnsp", new String(mtopResponse.getBytedata()));
                    }
                }
            });
        }
    }

    public final void G3(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f88474", new Object[]{this, new Integer(i)});
        } else {
            runOnUiThread(new Runnable() { // from class: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NewTaobaoSettingActivity.h(NewTaobaoSettingActivity.this).setVisibility(i);
                    }
                }
            });
        }
    }

    public final List<DynamicSettingItem> H3(List<List<DynamicSettingItem>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1f3f3d01", new Object[]{this, list});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Collections.sort(list, new e(null));
        if (list.size() > 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List<DynamicSettingItem> list2 = list.get(i);
                Collections.sort(list2);
                arrayList.addAll(list2);
            }
        }
        DynamicSettingItem dynamicSettingItem = (DynamicSettingItem) arrayList.get(arrayList.size() - 1);
        if (TextUtils.equals(dynamicSettingItem.moduleNumber, "-1")) {
            TextUtils.isEmpty(dynamicSettingItem.key);
            if (dynamicSettingItem.showRedDot) {
                throw null;
            }
            throw null;
        }
        throw null;
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

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        s32.c().i("老设置");
        setContentView(R.layout.mytaobao_font_setting_activity);
        s32.c().i("NewPaySettingsActivity");
        try {
            Nav.from(this).toUri("https://tb.cn/n/im/dynamic/tb_aura_page.html?spm=a2141.7631743.1.100&scm=20140623.1.7.1&bizConfigCode=mtbSetting&pageTitleTag=mt_mainSettingTitle");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        finish();
    }

    public final List<List<ComplianceSettingItem>> v3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9bb9ae75", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("textSize");
        String string2 = jSONObject.getString("textColor");
        List<JSONArray> z3 = z3(jSONObject);
        ArrayList arrayList = new ArrayList();
        for (JSONArray jSONArray : z3) {
            List<ComplianceSettingItem> A3 = A3(jSONArray, string, string2);
            if (A3 != null) {
                arrayList.add(A3);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    public final View w3(List<ComplianceSettingItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("40d05190", new Object[]{this, list});
        }
        LinearLayout linearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = DensityUtil.dip2px(this, 5.0f);
        linearLayout.setLayoutParams(layoutParams);
        for (ComplianceSettingItem complianceSettingItem : list) {
            linearLayout.addView(B3(complianceSettingItem));
        }
        return linearLayout;
    }

    public final void y3(ComplianceSettingItem complianceSettingItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42fb64c8", new Object[]{this, complianceSettingItem});
            return;
        }
        JSONObject jSONObject = complianceSettingItem.userTrack;
        if (jSONObject != null) {
            String string = jSONObject.getString("arg1");
            if (!TextUtils.isEmpty(string)) {
                suv.c(u3j.b, string, suv.i(jSONObject.getJSONObject("params")));
            }
        }
    }

    public final List<JSONArray> z3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("544c446", new Object[]{this, jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONArray) {
                arrayList.add((JSONArray) next);
            }
        }
        return arrayList;
    }

    public final void x3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd038b", new Object[]{this});
            return;
        }
        ish.g().a();
        qfp.a(Globals.getApplication());
        try {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
            edit.putBoolean("settings_LOGOUT", true);
            edit.apply();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
