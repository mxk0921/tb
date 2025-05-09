package com.taobao.android.miniLive.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.upp.d;
import java.util.HashMap;
import tb.anv;
import tb.efs;
import tb.f3s;
import tb.gsq;
import tb.mmr;
import tb.t2o;
import tb.w6f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TBMiniLiveReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092038);
    }

    public static /* synthetic */ Object ipc$super(TBMiniLiveReceiver tBMiniLiveReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/services/TBMiniLiveReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        d a2;
        JSONObject jSONObject3;
        d a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null) {
            String action = intent.getAction();
            efs.a("TBMiniLiveReceiver", "onReceive action = " + action);
            if (TextUtils.equals(action, w6f.TAOLIVE_SHOW_MINILIVE_ACTION)) {
                if (!f3s.w()) {
                    efs.a("TBMiniLiveReceiver", "hideMiniLive openShopMiniLiveReceiver = false");
                    return;
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("actionType");
                    String string2 = extras.getString("actionDatas");
                    if (TextUtils.equals(string, "startMiniLive")) {
                        if (!TextUtils.isEmpty(string2)) {
                            HashMap hashMap = (HashMap) JSON.parseObject(string2, HashMap.class);
                            mmr.p().J(context, gsq.b(hashMap, "liveId"), hashMap);
                            efs.a("TBMiniLiveReceiver", action + " startMiniLive ");
                        }
                    } else if (TextUtils.equals(string, "hideMiniLive")) {
                        mmr.p().s();
                        efs.a("TBMiniLiveReceiver", action + " hideMiniLive ");
                    } else if (TextUtils.equals(string, "updateLivePosition")) {
                        if (!TextUtils.isEmpty(string2)) {
                            HashMap hashMap2 = (HashMap) JSON.parseObject(string2, HashMap.class);
                            if (hashMap2 != null) {
                                String str = (String) hashMap2.get("x");
                                String str2 = (String) hashMap2.get("y");
                                if ((!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) || (!TextUtils.isEmpty(str2) && TextUtils.isDigitsOnly(str2))) {
                                    mmr.p().N(str, str2);
                                }
                            }
                            efs.a("TBMiniLiveReceiver", action + " updateMiniLivePosition ");
                        }
                    } else if (TextUtils.equals(string, "hideAllMiniLive")) {
                        mmr.p().r();
                        efs.a("TBMiniLiveReceiver", action + " hideAllMiniLive ");
                    }
                }
            } else if (!TextUtils.equals(action, w6f.PAGE_RESUME_ACTION) && !TextUtils.equals(intent.getAction(), w6f.PAGE_SHOP_RESUME_ACTION)) {
                if (TextUtils.equals(action, w6f.PAGE_PAUSE_ACTION) || TextUtils.equals(intent.getAction(), w6f.PAGE_SHOP_PAUSE_ACTION)) {
                    mmr.p().n();
                    efs.a("TBMiniLiveReceiver", action + " destroyMiniLive ");
                } else if (TextUtils.equals(action, w6f.ACTION_NOTIFY_DETAIL_SLIDE_INTO_INFO)) {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 == null) {
                        mmr.p().F();
                        efs.a("TBMiniLiveReceiver", action + " scrollHideMiniLive 3");
                    } else if (extras2.get("transparentBroadcast") instanceof JSONObject) {
                        JSONObject jSONObject4 = (JSONObject) extras2.get("transparentBroadcast");
                        if (jSONObject4 != null && !f3s.r(jSONObject4.getString("source"))) {
                            efs.a("TBMiniLiveReceiver", action + " scrollHideMiniLive 1");
                            mmr.p().F();
                        }
                    } else {
                        mmr.p().F();
                        efs.a("TBMiniLiveReceiver", action + " scrollHideMiniLive 2");
                    }
                    efs.a("TBMiniLiveReceiver", action);
                } else {
                    String str3 = "detail";
                    if (TextUtils.equals(action, w6f.ACTION_NOTIFY_DETAIL_SHOW)) {
                        if (!f3s.s()) {
                            efs.a("TBMiniLiveReceiver", action + " openDetailMiniLive = false");
                            return;
                        }
                        mmr.p().D();
                        efs.a("TBMiniLiveReceiver", action);
                        Bundle extras3 = intent.getExtras();
                        if (!(extras3 == null || !(extras3.get("transparentBroadcast") instanceof JSONObject) || (jSONObject3 = (JSONObject) extras3.get("transparentBroadcast")) == null)) {
                            Boolean bool = jSONObject3.getBoolean("isUseUpp");
                            if (bool == null || !bool.booleanValue() || (a3 = anv.a()) == null || !a3.isUppEnabled()) {
                                String string3 = jSONObject3.getString("liveId");
                                String string4 = jSONObject3.getString("source");
                                if (f3s.r(string4)) {
                                    HashMap hashMap3 = new HashMap();
                                    if (!TextUtils.isEmpty(string4)) {
                                        str3 = string4;
                                    }
                                    hashMap3.put("bizCode", str3);
                                    for (String str4 : jSONObject3.keySet()) {
                                        hashMap3.put(str4, jSONObject3.getString(str4));
                                    }
                                    mmr.p().J(context, string3, hashMap3);
                                    efs.a("TBMiniLiveReceiver", action + " startMiniLive");
                                }
                            }
                        }
                    } else if (TextUtils.equals(action, w6f.ACTION_NOTIFY_DETAIL_SLIDE_OUT_INFO)) {
                        if (!f3s.s()) {
                            efs.a("TBMiniLiveReceiver", action + " openDetailMiniLive = false");
                            return;
                        }
                        Bundle extras4 = intent.getExtras();
                        efs.a("TBMiniLiveReceiver", action);
                        if (!(extras4 == null || !(extras4.get("transparentBroadcast") instanceof JSONObject) || (jSONObject2 = (JSONObject) extras4.get("transparentBroadcast")) == null)) {
                            Boolean bool2 = jSONObject2.getBoolean("isUseUpp");
                            if (bool2 == null || !bool2.booleanValue() || (a2 = anv.a()) == null || !a2.isUppEnabled()) {
                                String string5 = jSONObject2.getString("liveId");
                                String string6 = jSONObject2.getString("source");
                                if (!TextUtils.isEmpty(string5)) {
                                    HashMap hashMap4 = new HashMap();
                                    if (!TextUtils.isEmpty(string6)) {
                                        str3 = string6;
                                    }
                                    hashMap4.put("bizCode", str3);
                                    for (String str5 : jSONObject2.keySet()) {
                                        hashMap4.put(str5, jSONObject2.getString(str5));
                                    }
                                    mmr.p().J(context, string5, hashMap4);
                                    efs.a("TBMiniLiveReceiver", action + " startMiniLive ");
                                }
                            }
                        }
                    } else if (TextUtils.equals(action, "action.com.taobao.taolive.room.start")) {
                        mmr.p().m();
                        mmr.p().n();
                        efs.a("TBMiniLiveReceiver", action + " destroyMiniLive ");
                    } else if (TextUtils.equals(action, w6f.PAGE_DETAIL_UPP_SHOWFLOATVIEWNOTIFICATION)) {
                        if (!f3s.s()) {
                            efs.a("TBMiniLiveReceiver", action + " openDetailMiniLive = false");
                            return;
                        }
                        efs.a("TBMiniLiveReceiver", action);
                        mmr.p().D();
                        Bundle extras5 = intent.getExtras();
                        if (extras5 != null && (extras5.get("UPP_DATA") instanceof JSONObject) && (jSONObject = (JSONObject) extras5.get("UPP_DATA")) != null) {
                            try {
                                JSONObject jSONObject5 = jSONObject.getJSONObject("actualResult");
                                String string7 = jSONObject.getString("algParams");
                                String string8 = jSONObject5.getString("liveId");
                                String string9 = jSONObject5.getString("source");
                                if (!TextUtils.isEmpty(string8)) {
                                    HashMap hashMap5 = new HashMap();
                                    if (!TextUtils.isEmpty(string9)) {
                                        str3 = string9;
                                    }
                                    hashMap5.put("bizCode", str3);
                                    for (String str6 : jSONObject5.keySet()) {
                                        hashMap5.put(str6, jSONObject5.getString(str6));
                                    }
                                    hashMap5.put("algParams", string7);
                                    mmr.p().J(context, string8, hashMap5);
                                    efs.a("TBMiniLiveReceiver", action + " startMiniLive");
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        }
    }
}
