package com.taobao.android.address.wrapper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.WindowType;
import com.taobao.android.nav.Nav;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.uc.webview.export.extension.UCExtension;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.acq;
import tb.ff0;
import tb.gf0;
import tb.kf0;
import tb.mtv;
import tb.qj4;
import tb.rf0;
import tb.sf0;
import tb.u58;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AddressEntranceActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "addressMapEntry";

    /* renamed from: a  reason: collision with root package name */
    public Uri f6305a;
    public long b;
    public long c;

    public static /* synthetic */ Object ipc$super(AddressEntranceActivity addressEntranceActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode == 1150324634) {
            super.finish();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/address/wrapper/AddressEntranceActivity");
        }
    }

    public static void m(Activity activity) {
        WindowType M;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4595a39a", new Object[]{activity});
        } else if (activity != null && WindowType.MEDIUM != (M = TBAutoSizeConfig.x().M(activity)) && WindowType.LARGE != M) {
            activity.overridePendingTransition(0, 0);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e7c4d56", new Object[]{this});
            return;
        }
        try {
            if (rf0.k("weex_address_change_gray_percent")) {
                String f = rf0.f("weex_address_change_gray_url", "");
                if (!TextUtils.isEmpty(f)) {
                    sf0.f28002a = f;
                }
            } else {
                String f2 = rf0.f("weex_address_change_url", "");
                if (!TextUtils.isEmpty(f2)) {
                    sf0.f28002a = f2;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee38c51d", new Object[]{this});
        }
        Uri uri = this.f6305a;
        if (uri == null) {
            return "";
        }
        String query = uri.getQuery();
        if (!TextUtils.isEmpty(query)) {
            return query;
        }
        return "";
    }

    public final void f(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad69721", new Object[]{this, intent});
        } else if (intent == null || intent.getData() == null) {
            setResult(0);
            finish();
        } else {
            this.f6305a = intent.getData();
            sf0.f = null;
            if (rf0.j("enable_full_address_info")) {
                Boolean bool = Boolean.FALSE;
                try {
                    Object obj = intent.getExtras().get(sf0.KEY_NEEDFULLADDRESSINFO);
                    AdapterForTLog.logd(TAG, "get needFullAddressInfo:" + obj);
                    if (obj == null) {
                        AdapterForTLog.logd(TAG, "not contain needFullAddressInfo");
                    } else if (obj instanceof Boolean) {
                        bool = (Boolean) obj;
                    } else if (obj instanceof String) {
                        bool = Boolean.valueOf((String) obj);
                    } else {
                        bool = Boolean.valueOf(String.valueOf(intent.getExtras().get(sf0.KEY_NEEDFULLADDRESSINFO)));
                    }
                } catch (Exception e) {
                    AdapterForTLog.logd(TAG, "get needFullAddressInfo error:" + e.getMessage());
                }
                sf0.g = bool.booleanValue();
                return;
            }
            sf0.g = false;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        m(this);
        this.c = System.currentTimeMillis();
        mtv.c("finishEntryAct", "" + this.c, String.valueOf(this.c - this.b), null);
    }

    public final boolean g(String str) {
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11687260", new Object[]{this, str})).booleanValue();
        }
        try {
            parseInt = Integer.parseInt(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (parseInt < 4 || parseInt > 10) {
            return false;
        }
        return true;
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ee712b", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(qj4.e, rf0.a(this, str));
        Nav.from(this).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).withExtras(bundle).toUri(kf0.b(this, kf0.ORANGE_POP_LARGESCREENSTYLE_VAL, "https://my.m.taobao.com/deliver/h5_pop_address.htm"));
        overridePendingTransition(0, 0);
    }

    public final void i() {
        String str;
        String str2;
        String str3;
        String stringExtra;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc08f5fc", new Object[]{this});
        } else if (this.f6305a == null) {
            setResult(0);
            finish();
        } else {
            String d = d();
            Intent intent = getIntent();
            Bundle extras = intent == null ? null : intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            if (this.f6305a.toString().contains("select_address_list")) {
                e();
            } else if (!this.f6305a.toString().contains("wap_deliver_address_list")) {
                String str4 = "";
                if (this.f6305a.toString().contains("edit_address") || this.f6305a.toString().contains("add_address")) {
                    String string = extras.getString("sourceAddress");
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            str4 = JSON.parseObject(string).getString(sf0.K_DELIVERY_ID);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    if (this.f6305a.toString().contains("edit_address")) {
                        if (TextUtils.isEmpty(str4)) {
                            str2 = d + "&pageType=0";
                        } else {
                            str2 = d + "&deliverId=" + str4 + "&pageType=1";
                        }
                        str = a(str2);
                    } else {
                        str = d + "&pageType=0";
                    }
                    boolean equals = "true".equals(this.f6305a.getQueryParameter("weex2Mode"));
                    if (!rf0.x(this)) {
                        Nav.from(this).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).toUri(kf0.a(this, rf0.a(this, rf0.b(sf0.c, str))));
                    } else if (rf0.s(this) || !equals || !ThemisConfig.e("edit")) {
                        h(rf0.b(rf0.f("addressEditUrlThemis", "https://pages-fast.m.taobao.com/wow/z/uniapp/1010507/vip/receiver-address-themis/address-pro?x-ssr=true"), str));
                    } else {
                        boolean a2 = u58.a(ff0.a());
                        AdapterForTLog.loge(TAG, "before open pop, isDynamicUtils= " + a2);
                        String str5 = str + "&isDynamicInit=" + a2;
                        k("edit", rf0.b("https://web.m.taobao.com/app/vip/receiver-address-wx2/address-pro?wh_weex=true&weex_mode=dom&renderMode=texture&wx_statusbar_hidden=true&wx_navbar_hidden=true&wx_opaque=0", str5), str5, true, false);
                    }
                } else if (this.f6305a.toString().contains("/deliver/map.htm")) {
                    Nav.from(this).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).toUri(kf0.a(this, rf0.b(sf0.d, d)));
                } else if (this.f6305a.toString().contains("/deliver/switch_address.htm")) {
                    if (ThemisConfig.e(ThemisConfig.SCENE_LBS_LIST)) {
                        ThemisConfig.g(this, ThemisConfig.SCENE_LBS_LIST, d, UCExtension.EXTEND_INPUT_TYPE_IDCARD);
                    } else {
                        Nav.from(this).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).toUri(kf0.a(this, rf0.b(sf0.e, d)));
                    }
                } else if (this.f6305a.toString().contains("/deliver/change_address.htm")) {
                    if (intent != null) {
                        try {
                            if (extras.get("data") != null) {
                                sf0.e((Map) extras.get("data"));
                            }
                        } catch (Throwable th2) {
                            AdapterForTLog.loge(TAG, "parse data error", th2);
                        }
                    }
                    if (sf0.h != null) {
                        AdapterForTLog.logd(TAG, "change address data= " + JSON.toJSONString(sf0.h));
                    } else {
                        AdapterForTLog.logd(TAG, "change address data= null");
                    }
                    if (!"true".equals(rf0.f("select_degrade", str4))) {
                        l("change", sf0.f28002a, false, false);
                    } else if (ThemisConfig.e("change")) {
                        ThemisConfig.g(this, "change", str4, UCExtension.EXTEND_INPUT_TYPE_IDCARD);
                    } else {
                        Nav.from(this).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).toUri(kf0.a(this, sf0.f28002a));
                    }
                } else if (this.f6305a.toString().contains("/deliver/transparent_address.htm")) {
                    if (intent != null) {
                        try {
                            stringExtra = intent.getStringExtra(sf0.K_COMMON_ADDRESS_URL);
                            AdapterForTLog.logd(TAG, "transparent_address url = " + stringExtra);
                            sf0.d(extras.getString("data"));
                        } catch (Throwable th3) {
                            AdapterForTLog.logd(TAG, "transparent_address error:" + th3.getMessage());
                        }
                    } else {
                        stringExtra = null;
                    }
                    AdapterForTLog.logd(TAG, "transparent_address data= " + sf0.j);
                    if (!TextUtils.isEmpty(stringExtra)) {
                        l("cart", stringExtra, true, true);
                    }
                } else if (this.f6305a.toString().contains("/deliver/common_address.htm")) {
                    try {
                        String queryParameter = this.f6305a.getQueryParameter("bizId");
                        if (TextUtils.isEmpty(queryParameter)) {
                            queryParameter = extras.getString("bizId");
                        }
                        str4 = this.f6305a.getQueryParameter("data");
                        if (TextUtils.isEmpty(str4)) {
                            Object obj = extras.get("data");
                            if (obj instanceof String) {
                                str4 = (String) obj;
                            } else if (obj != null) {
                                str4 = obj.toString();
                            }
                        }
                        String string2 = extras.getString("encodedUrlParams");
                        if (TextUtils.isEmpty(string2)) {
                            str3 = d;
                        } else if (TextUtils.isEmpty(d)) {
                            str3 = "urlParams=" + string2;
                        } else {
                            str3 = d + "&urlParams=" + string2;
                        }
                        AdapterForTLog.loge(TAG, "common_address bizId=" + queryParameter + " data:" + str4 + ",encodedUrlParams=" + string2 + ",urlParams=" + str3);
                        sf0.d(str4);
                        k(queryParameter, ThemisConfig.a(queryParameter, str3), str3, true, true);
                    } catch (Throwable th4) {
                        AdapterForTLog.loge(TAG, "common_address error:" + th4.getMessage());
                    }
                }
            } else if (rf0.o(this, ThemisConfig.SCENE_MANAGER)) {
                ThemisConfig.g(this, ThemisConfig.SCENE_MANAGER, d, UCExtension.EXTEND_INPUT_TYPE_IDCARD);
            } else {
                Nav.from(this).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).toUri(kf0.a(this, rf0.a(this, rf0.b(sf0.b, "pageType=1&" + d))));
            }
            finish();
        }
    }

    public void k(String str, String str2, String str3, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ff88b8c", new Object[]{this, str, str2, str3, new Boolean(z), new Boolean(z2)});
        } else {
            j(this, str, str2, str3, z, z2, false);
        }
    }

    public void l(String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf14f8c2", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2)});
        } else {
            k(str, str2, "", z, z2);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        m(this);
        this.b = System.currentTimeMillis();
        mtv.c("createEntryAct", "" + this.b, "", null);
        String f = rf0.f("address_test_serial", "");
        if (!TextUtils.isEmpty(f)) {
            Toast.makeText(this, "address_test_serial:" + f, 0).show();
        }
        rf0.y(this);
        f(getIntent());
        getApplicationContext();
        IpChange ipChange2 = sf0.$ipChange;
        b();
        c();
        i();
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f5a21b6", new Object[]{this})).booleanValue();
        }
        try {
            if (rf0.k("weex_address_picker_gray_percent")) {
                sf0.b = rf0.f("weex_address_picker_gray_url", sf0.b);
            } else {
                sf0.b = rf0.f("weex_address_picker_url", sf0.b);
            }
            if (rf0.p()) {
                sf0.b = rf0.f("addressNewListUrl", "https://market.m.taobao.com/app/vip/receiver-address/pages/list2?wh_weex=true&wx_navbar_hidden=true&voiceMode=true&isUnfrequent=true");
            }
            if (rf0.k("weex_address_editor_gray_percent")) {
                sf0.c = rf0.f("weex_address_editor_gray_url", sf0.c);
            } else {
                sf0.c = rf0.f("weex_address_editor_url", sf0.c);
            }
            if (rf0.k("weex_address_map_gray_percent")) {
                sf0.d = rf0.f("weex_address_map_gray_url", sf0.d);
            } else {
                sf0.d = rf0.f("weex_address_map_url", sf0.d);
            }
            if (rf0.k("weex_address_switch_gray_percent")) {
                sf0.e = rf0.f("weex_address_switch_gray_url", sf0.e);
            } else {
                sf0.e = rf0.f("weex_address_switch_url", sf0.e);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return true;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78bdd3d8", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        if (intent != null) {
            String d = d();
            String str = sf0.b + "&pageType=0";
            AddressParams addressParams = new AddressParams();
            addressParams.deliverId = intent.getStringExtra(gf0.K_SELECTED_ADDRESS_ID);
            addressParams.agencyReceive = intent.getStringExtra(gf0.K_AGENCY_RECV);
            addressParams.agencyReceiveH5Url = intent.getStringExtra(gf0.K_AGENCY_RECV_H5);
            addressParams.agencyReceiveHelpUrl = intent.getStringExtra(gf0.K_AGENCY_RECV_HEPL);
            addressParams.abroadStation = g(addressParams.agencyReceive);
            addressParams.supportStation = "1".equals(addressParams.agencyReceive);
            addressParams.needChangeKinship = true;
            addressParams.relationId = intent.getStringExtra("relationId");
            addressParams.source = intent.getStringExtra("source");
            addressParams.sites = intent.getStringExtra(gf0.K_SITES);
            addressParams.sellerID = intent.getStringExtra("sellerId");
            addressParams.tempData = (HashMap) intent.getSerializableExtra(gf0.K_TEMP_DATA);
            addressParams.extMap = intent.getStringExtra("extMap");
            addressParams.deliverAddrList = intent.getStringExtra("deliverAddrList");
            addressParams.accurateAddressInfo = intent.getStringExtra("accurateAddressInfo");
            addressParams.bizcode = intent.getStringExtra(UploadConstants.BIZ_CODE);
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && rf0.j("getExtNativeJson")) {
                    Set<String> keySet = extras.keySet();
                    JSONObject jSONObject = new JSONObject();
                    for (String str2 : keySet) {
                        jSONObject.put(str2, extras.get(str2));
                    }
                    addressParams.extNativeJson = jSONObject;
                }
                Uri data = intent.getData();
                if (data != null && rf0.j("getExtUrlJson")) {
                    Set<String> queryParameterNames = data.getQueryParameterNames();
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str3 : queryParameterNames) {
                        jSONObject2.put(str3, (Object) data.getQueryParameter(str3));
                    }
                    addressParams.extUrlJson = jSONObject2;
                }
            } catch (Exception e) {
                AdapterForTLog.loge(TAG, "add extJson fail", e);
            }
            sf0.f = addressParams;
            if (rf0.o(this, ThemisConfig.SCENE_SELECT)) {
                ThemisConfig.g(this, ThemisConfig.SCENE_SELECT, d, UCExtension.EXTEND_INPUT_TYPE_IDCARD);
            } else {
                Nav.from(this).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).toUri(kf0.a(this, rf0.a(this, rf0.b(str, d))));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void j(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.address.wrapper.AddressEntranceActivity.j(android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):void");
    }

    public final String a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d25ba04e", new Object[]{this, str});
        }
        if (!sf0.g) {
            return str;
        }
        try {
            StringBuilder sb = new StringBuilder();
            Bundle extras = getIntent().getExtras();
            Set<String> keySet = extras.keySet();
            for (String str2 : rf0.f("address_edit_exclude_params", "referrer").split(";")) {
                AdapterForTLog.loge(TAG, "addIntentExtraInfo remove:" + str2 + " result:" + keySet.remove(str2));
            }
            for (String str3 : keySet) {
                Object obj = extras.get(str3);
                sb.append("&");
                sb.append(str3);
                sb.append("=");
                sb.append(obj);
            }
            return str + sb.toString();
        } catch (Exception e) {
            AdapterForTLog.logd(TAG, "addIntentExtraInfo error:" + e.getMessage());
            return str;
        }
    }
}
