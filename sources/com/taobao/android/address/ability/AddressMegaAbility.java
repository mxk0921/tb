package com.taobao.android.address.ability;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsAddressAbility;
import com.taobao.android.abilityidl.ability.AddressParams;
import com.taobao.android.address.model.AddressOpenData;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.address.wrapper.AddressEntranceActivity;
import com.taobao.android.nav.Nav;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.mtop.upload.domain.UploadConstants;
import org.json.JSONObject;
import tb.gf0;
import tb.if0;
import tb.kdb;
import tb.kf0;
import tb.ldb;
import tb.lf0;
import tb.oeb;
import tb.peb;
import tb.rf0;
import tb.sf0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AddressMegaAbility extends AbsAddressAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f6298a = "address.ability";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements if0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ peb f6299a;

        public a(peb pebVar) {
            this.f6299a = pebVar;
        }

        public void a(Integer num, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc66ab5d", new Object[]{this, num, str});
            } else {
                AddressMegaAbility.access$000(AddressMegaAbility.this, num, str, this.f6299a);
            }
        }

        public void b(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5e17230", new Object[]{this, str, map});
                return;
            }
            AddressParams addressParams = new AddressParams();
            addressParams.scene = str;
            addressParams.data = map;
            this.f6299a.f(addressParams);
        }
    }

    public static /* synthetic */ void access$000(AddressMegaAbility addressMegaAbility, Integer num, String str, peb pebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46b91f5", new Object[]{addressMegaAbility, num, str, pebVar});
        } else {
            addressMegaAbility.d(num, str, pebVar);
        }
    }

    public static Activity b(kdb kdbVar) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("ee452099", new Object[]{kdbVar});
        }
        ldb a2 = kdbVar.a();
        if (a2 == null || (context = a2.getContext()) == null || !(context instanceof Activity)) {
            return null;
        }
        return (Activity) context;
    }

    public static /* synthetic */ Object ipc$super(AddressMegaAbility addressMegaAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/address/ability/AddressMegaAbility");
    }

    public final AddressParams a(Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AddressParams) ipChange.ipc$dispatch("7e533917", new Object[]{this, num, str});
        }
        AddressParams addressParams = new AddressParams();
        HashMap hashMap = new HashMap();
        hashMap.put("code", num);
        hashMap.put("msg", str);
        addressParams.data = hashMap;
        return addressParams;
    }

    public final void c(Integer num, String str, oeb oebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc86cf36", new Object[]{this, num, str, oebVar});
            return;
        }
        AddressParams a2 = a(num, str);
        if (oebVar != null) {
            oebVar.d(a2);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAddressAbility
    public void close(kdb kdbVar, AddressParams addressParams, oeb oebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3d7f85", new Object[]{this, kdbVar, addressParams, oebVar});
        } else if (oebVar != null) {
            if (addressParams != null) {
                try {
                    if (!TextUtils.isEmpty(addressParams.scene)) {
                        AddressOpenData b = sf0.b(addressParams.scene);
                        Activity b2 = b(kdbVar);
                        if (b2 != null) {
                            b2.finish();
                        }
                        if (b == null) {
                            c(-2, "no data", oebVar);
                            return;
                        }
                        if0 if0Var = b.callback;
                        if (if0Var != null) {
                            Map<String, ? extends Object> map = addressParams.data;
                            if (map != null) {
                                ((a) if0Var).b(addressParams.scene, map);
                                return;
                            } else {
                                ((a) if0Var).a(-2, "no data.data");
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    c(-1, "exception " + e.getMessage(), oebVar);
                    return;
                }
            }
            c(-1, "invalid parmas", oebVar);
        }
    }

    public final void d(Integer num, String str, peb pebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b700fe4d", new Object[]{this, num, str, pebVar});
            return;
        }
        AddressParams a2 = a(num, str);
        if (pebVar != null) {
            pebVar.d(a2);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAddressAbility
    public void requestParams(kdb kdbVar, AddressParams addressParams, oeb oebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b5a9c2", new Object[]{this, kdbVar, addressParams, oebVar});
        } else if (oebVar != null) {
            if (addressParams != null) {
                try {
                    if (!TextUtils.isEmpty(addressParams.scene)) {
                        AddressOpenData b = sf0.b(addressParams.scene);
                        if (b != null) {
                            AddressParams addressParams2 = new AddressParams();
                            addressParams2.data = b.data;
                            addressParams2.scene = addressParams.scene;
                            oebVar.f(addressParams2);
                            return;
                        }
                        new AddressParams().scene = addressParams.scene;
                        c(-2, "empty data", oebVar);
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    c(-101, "exception " + e.getMessage(), oebVar);
                    return;
                }
            }
            c(-1, "invalid parmas", oebVar);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAddressAbility
    public void open(kdb kdbVar, lf0 lf0Var, peb pebVar) {
        String c;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b938e36", new Object[]{this, kdbVar, lf0Var, pebVar});
        } else if (pebVar != null) {
            if (lf0Var != null) {
                try {
                    if (!TextUtils.isEmpty(lf0Var.b)) {
                        Map<String, ? extends Object> map = lf0Var.f23307a;
                        Activity b = b(kdbVar);
                        String str2 = lf0Var.c;
                        AddressOpenData addressOpenData = new AddressOpenData();
                        addressOpenData.data = map;
                        addressOpenData.scene = lf0Var.b;
                        addressOpenData.callback = new a(pebVar);
                        if (map == null) {
                            c = "";
                        } else {
                            c = rf0.c(map);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            sf0.a(lf0Var.b, addressOpenData);
                            AddressEntranceActivity.j(b, lf0Var.b, str2, c, true, true, true);
                            return;
                        } else if ("common".equals(lf0Var.b)) {
                            String str3 = (String) map.get("bizId");
                            if (!TextUtils.isEmpty(str3)) {
                                sf0.a(str3, addressOpenData);
                                AddressEntranceActivity.j(b, str3, ThemisConfig.b(str3, c, true), c, true, true, true);
                                return;
                            }
                            return;
                        } else if ("edit".equals(lf0Var.b)) {
                            sf0.a(lf0Var.b, addressOpenData);
                            if (map == null) {
                                str = "{}";
                            } else {
                                str = map.toString();
                            }
                            e(b, "editAddress", str);
                            return;
                        } else {
                            sf0.a(lf0Var.b, addressOpenData);
                            String str4 = lf0Var.b;
                            AddressEntranceActivity.j(b, str4, ThemisConfig.b(str4, c, true), c, true, true, true);
                            return;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    d(-101, "Exception: " + e.getMessage(), pebVar);
                    return;
                }
            }
            d(-1, "invalid parmas", pebVar);
        }
    }

    public final void e(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722528ab", new Object[]{this, context, str, str2});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            Bundle bundle = new Bundle();
            int optInt = jSONObject.optInt("requestCode");
            Iterator<String> keys = jSONObject.keys();
            StringBuilder sb = new StringBuilder();
            while (keys.hasNext()) {
                String str3 = "" + ((Object) keys.next());
                if (!"hiddenParam".equals(str3)) {
                    String optString = jSONObject.optString(str3);
                    if (TextUtils.equals(str, "pickAddressV2")) {
                        if (!TextUtils.equals(gf0.K_SELECTED_ADDRESS_ID, str3) && !TextUtils.equals(sf0.K_DELIVERY_ID, str3)) {
                            if (TextUtils.equals("sellerId", str3)) {
                                bundle.putString("sellerId", optString);
                            } else if (TextUtils.equals("deliverAddrList", str3)) {
                                bundle.putString("deliverAddrList", optString);
                            } else if (TextUtils.equals("accurateAddressInfo", str3)) {
                                bundle.putString("accurateAddressInfo", optString);
                            } else if (TextUtils.equals(UploadConstants.BIZ_CODE, str3)) {
                                bundle.putString(UploadConstants.BIZ_CODE, optString);
                            } else if (TextUtils.equals(gf0.K_AGENCY_RECV, str3)) {
                                bundle.putString(gf0.K_AGENCY_RECV, optString);
                            } else if (TextUtils.equals(gf0.K_AGENCY_RECV_H5, str3)) {
                                bundle.putString(gf0.K_AGENCY_RECV_H5, optString);
                            } else if (TextUtils.equals(gf0.K_AGENCY_RECV_HEPL, str3)) {
                                bundle.putString(gf0.K_AGENCY_RECV_HEPL, optString);
                            }
                        }
                        bundle.putString(gf0.K_SELECTED_ADDRESS_ID, optString);
                    }
                    sb.append(str3);
                    sb.append("=");
                    sb.append(optString);
                    if (keys.hasNext()) {
                        sb.append("&");
                    }
                }
                optInt = optInt;
            }
            bundle.putString("js_api_params", sb.toString());
            bundle.putBoolean("isFromJSAPI", true);
            if (TextUtils.equals(str, "pickAddress") || TextUtils.equals(str, "pickAddressV2")) {
                String str4 = "https://my.m.taobao.com/deliver/select_address_list.htm";
                if (sb.length() > 0) {
                    str4 = str4 + "?" + sb.toString();
                }
                bundle.putBoolean(sf0.KEY_NEEDFULLADDRESSINFO, TextUtils.equals(jSONObject.optString(sf0.KEY_NEEDFULLADDRESSINFO), "1"));
                Nav.from(context).withExtras(bundle).forResult(optInt).toUri(kf0.a(context, str4));
            } else if (TextUtils.equals(str, "editAddress")) {
                String str5 = "https://my.m.taobao.com/deliver/edit_address.htm?addressClientScene=edit";
                if (sb.length() > 0) {
                    str5 = str5 + "&" + sb.toString();
                }
                bundle.putBoolean(sf0.KEY_NEEDFULLADDRESSINFO, TextUtils.equals(jSONObject.optString(sf0.KEY_NEEDFULLADDRESSINFO), "1"));
                Nav.from(context).withExtras(bundle).forResult(optInt).toUri(kf0.a(context, str5));
            } else if (TextUtils.equals(str, "openAddressMap")) {
                String str6 = "https://my.m.taobao.com/deliver/map.htm";
                if (sb.length() > 0) {
                    str6 = str6 + "?" + sb.toString();
                }
                Nav.from(context).withExtras(bundle).forResult(optInt).toUri(kf0.a(context, str6));
            }
        } catch (Throwable th) {
            AdapterForTLog.loge(this.f6298a, "parse data error", th);
            th.printStackTrace();
        }
    }
}
