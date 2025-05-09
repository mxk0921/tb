package com.taobao.android.actionservice;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import tb.zca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NavModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void onNotify(JSON json, ActionService.h hVar, ActionService.g gVar, ActionService actionService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8641345", new Object[]{json, hVar, gVar, actionService});
            return;
        }
        String string = ((JSONObject) json).getString("name");
        String valueOf = String.valueOf(System.currentTimeMillis());
        if (!TextUtils.isEmpty(string)) {
            actionService.z(string, valueOf);
            if (!TextUtils.isEmpty(valueOf)) {
                actionService.l.put(valueOf, new ActionService.j(hVar, gVar, null));
            }
        }
    }

    public static void openAlert(JSON json, ActionService.h hVar, ActionService.g gVar, ActionService actionService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9367a26f", new Object[]{json, hVar, gVar, actionService});
        } else if (json != null) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            String concat = "http://h5.m.taobao.com/actionService/singleDialog.htm?".concat("from=ac&fromAction=TAOBAO.OCEAN.ActionServiceBC").concat("&seqId=").concat(valueOf);
            actionService.l.put(valueOf, new ActionService.j(hVar, gVar, null));
            Nav.from(zca.a()).toUri(concat.concat("&args=").concat(json.toJSONString()));
        }
    }

    public static void postNotify(JSON json, ActionService.h hVar, ActionService.g gVar, ActionService actionService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93978746", new Object[]{json, hVar, gVar, actionService});
            return;
        }
        JSONObject jSONObject = (JSONObject) json;
        String string = jSONObject.getString("name");
        if (!TextUtils.isEmpty(string)) {
            Intent intent = new Intent(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            if (!(jSONObject2 == null || jSONObject2.keySet() == null)) {
                for (String str : jSONObject2.keySet()) {
                    intent.putExtra(str, jSONObject2.getString(str));
                }
            }
            if (hVar != null) {
                actionService.B(intent);
            }
        }
    }

    public static void share(JSON json, ActionService.h hVar, ActionService.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73422f3", new Object[]{json, hVar, gVar});
            return;
        }
        JSONObject jSONObject = (JSONObject) json;
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("businessId");
        String string3 = jSONObject.getString("contentType");
        String string4 = jSONObject.getString("desc");
        String string5 = jSONObject.getString("url");
        String string6 = jSONObject.getString("image");
        String string7 = jSONObject.getString("shareScene");
        ShareContent shareContent = new ShareContent();
        shareContent.shareScene = string7;
        shareContent.title = string;
        shareContent.imageUrl = string6;
        shareContent.businessId = string2;
        shareContent.description = string4;
        shareContent.contentType = string3;
        shareContent.url = string5;
        ShareBusiness.share((Activity) hVar.f11985a, string, shareContent);
    }

    public static void showToast(JSON json, ActionService.h hVar, ActionService.g gVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b063ccfe", new Object[]{json, hVar, gVar});
            return;
        }
        JSONObject jSONObject = (JSONObject) json;
        String string = jSONObject.getString("msg");
        String string2 = jSONObject.getString("duration");
        if (!TextUtils.isEmpty(string)) {
            if (!TextUtils.isEmpty(string2) && TextUtils.isDigitsOnly(string2)) {
                i = Integer.valueOf(string2).intValue() / 1000;
            }
            Toast.makeText(zca.a(), string, i).show();
        }
    }

    public static void openDialog(JSON json, ActionService.h hVar, ActionService.g gVar, ActionService actionService) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf4816f", new Object[]{json, hVar, gVar, actionService});
            return;
        }
        if (json instanceof JSONObject) {
            str = ((JSONObject) json).getString("url");
        } else {
            str = json instanceof JSONArray ? ((JSONArray) json).getString(0) : null;
        }
        if (!TextUtils.isEmpty(str)) {
            String queryParameter = Uri.parse(str).getQueryParameter("fromSeq");
            String concat = str.concat("&fromAction=TAOBAO.OCEAN.ActionServiceBC");
            if (!TextUtils.isEmpty(queryParameter)) {
                actionService.l.put(queryParameter, new ActionService.j(hVar, gVar, null));
            }
            Nav.from(zca.a()).toUri(concat);
        }
    }

    public static void openUrl(JSON json, ActionService.h hVar, ActionService.g gVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48554359", new Object[]{json, hVar, gVar});
            return;
        }
        if (json instanceof JSONObject) {
            str = ((JSONObject) json).getString("url");
        } else {
            str = json instanceof JSONArray ? ((JSONArray) json).getString(0) : null;
        }
        Nav.from(zca.a()).toUri(str);
    }
}
