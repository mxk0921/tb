package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class et implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f14867a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ es f966a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f967a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public et(es esVar, String str, Context context, String str2, String str3) {
        this.f966a = esVar;
        this.f967a = str;
        this.f14867a = context;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        String str;
        String str2;
        eu euVar;
        es esVar;
        Context context2;
        if (!TextUtils.isEmpty(this.f967a)) {
            try {
                eo.a(this.f14867a, this.f967a, 1001, "get message");
                JSONObject jSONObject = new JSONObject(this.f967a);
                String optString = jSONObject.optString("action");
                String optString2 = jSONObject.optString("awakened_app_packagename");
                String optString3 = jSONObject.optString("awake_app_packagename");
                String optString4 = jSONObject.optString("awake_app");
                String optString5 = jSONObject.optString("awake_type");
                int optInt = jSONObject.optInt("awake_foreground", 0);
                if (this.b.equals(optString3) && this.c.equals(optString4)) {
                    if (TextUtils.isEmpty(optString5) || TextUtils.isEmpty(optString3) || TextUtils.isEmpty(optString4) || TextUtils.isEmpty(optString2)) {
                        eo.a(this.f14867a, this.f967a, 1008, "A receive a incorrect message with empty type");
                        return;
                    }
                    this.f966a.b(optString3);
                    this.f966a.a(optString4);
                    er erVar = new er();
                    erVar.b(optString);
                    erVar.a(optString2);
                    erVar.a(optInt);
                    erVar.d(this.f967a);
                    if (!"service".equals(optString5)) {
                        euVar = eu.ACTIVITY;
                        if (euVar.f969a.equals(optString5)) {
                            esVar = this.f966a;
                            context2 = this.f14867a;
                        } else {
                            euVar = eu.PROVIDER;
                            if (euVar.f969a.equals(optString5)) {
                                esVar = this.f966a;
                                context2 = this.f14867a;
                            } else {
                                Context context3 = this.f14867a;
                                String str3 = this.f967a;
                                eo.a(context3, str3, 1008, "A receive a incorrect message with unknown type " + optString5);
                                return;
                            }
                        }
                    } else if (!TextUtils.isEmpty(optString)) {
                        esVar = this.f966a;
                        euVar = eu.SERVICE_ACTION;
                        context2 = this.f14867a;
                    } else {
                        erVar.c("com.xiaomi.mipush.sdk.PushMessageHandler");
                        esVar = this.f966a;
                        euVar = eu.SERVICE_COMPONENT;
                        context2 = this.f14867a;
                    }
                    esVar.a(euVar, context2, erVar);
                    return;
                }
                Context context4 = this.f14867a;
                String str4 = this.f967a;
                eo.a(context4, str4, 1008, "A receive a incorrect message with incorrect package info" + optString3);
                return;
            } catch (JSONException e) {
                b.a(e);
                context = this.f14867a;
                str = this.f967a;
                str2 = "A meet a exception when receive the message";
            }
        } else {
            context = this.f14867a;
            str = "null";
            str2 = "A receive a incorrect message with empty info";
        }
        eo.a(context, str, 1008, str2);
    }
}
