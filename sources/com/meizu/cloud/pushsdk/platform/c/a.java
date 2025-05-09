package com.meizu.cloud.pushsdk.platform.c;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.e.b.c;
import com.meizu.cloud.pushsdk.platform.b;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.io.File;
import java.util.LinkedHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f5919a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;

    public a(Context context) {
        this.f5919a = "https://api-push.meizu.com/garcia/api/client/";
        this.b = this.f5919a + "message/registerPush";
        this.c = this.f5919a + "message/unRegisterPush";
        this.d = this.f5919a + "advance/unRegisterPush";
        this.e = this.f5919a + "message/getRegisterSwitch";
        this.f = this.f5919a + "message/changeRegisterSwitch";
        this.g = this.f5919a + "message/changeAllSwitch";
        this.h = this.f5919a + "message/subscribeTags";
        this.i = this.f5919a + "message/unSubscribeTags";
        this.j = this.f5919a + "message/unSubAllTags";
        this.k = this.f5919a + "message/getSubTags";
        this.l = this.f5919a + "message/subscribeAlias";
        this.m = this.f5919a + "message/unSubscribeAlias";
        this.n = this.f5919a + "message/getSubAlias";
        this.o = this.f5919a + "advance/changeRegisterSwitch";
        com.meizu.cloud.pushsdk.e.a.a();
        if (MzSystemUtils.isOverseas()) {
            this.f5919a = "https://api-push.in.meizu.com/garcia/api/client/";
            this.b = this.f5919a + "message/registerPush";
            this.c = this.f5919a + "message/unRegisterPush";
            this.d = this.f5919a + "advance/unRegisterPush";
            this.e = this.f5919a + "message/getRegisterSwitch";
            this.f = this.f5919a + "message/changeRegisterSwitch";
            this.g = this.f5919a + "message/changeAllSwitch";
            this.h = this.f5919a + "message/subscribeTags";
            this.i = this.f5919a + "message/unSubscribeTags";
            this.j = this.f5919a + "message/unSubAllTags";
            this.k = this.f5919a + "message/getSubTags";
            this.l = this.f5919a + "message/subscribeAlias";
            this.m = this.f5919a + "message/unSubscribeAlias";
            this.n = this.f5919a + "message/getSubAlias";
            this.o = this.f5919a + "advance/changeRegisterSwitch";
        }
    }

    public c a(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put(PushConstants.KEY_PUSH_ID, str3);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("sign", b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "checkPush post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.e.a.a(this.e).a(linkedHashMap2).a().d();
    }

    public c b(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put(PushConstants.KEY_PUSH_ID, str3);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("sign", b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "checkPush post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.e.a.a(this.k).a(linkedHashMap2).a().d();
    }

    public c c(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put(PushConstants.KEY_PUSH_ID, str3);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("sign", b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "subScribeAllTags post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.e.a.b(this.j).a(linkedHashMap2).a().d();
    }

    public c d(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        if (!TextUtils.isEmpty(str4)) {
            linkedHashMap.put("fdId", str4);
        } else {
            linkedHashMap.put("deviceId", str3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("sign", b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "unregister post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.e.a.a(this.c).a(linkedHashMap2).a().d();
    }

    public c e(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put(PushConstants.KEY_PUSH_ID, str3);
        linkedHashMap.put("alias", str4);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("sign", b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "subScribeTags post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.e.a.b(this.m).a(linkedHashMap2).a().d();
    }

    public c f(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put(PushConstants.KEY_PUSH_ID, str3);
        linkedHashMap.put("tags", str4);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("sign", b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "subScribeTags post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.e.a.b(this.i).a(linkedHashMap2).a().d();
    }

    public c a(String str, String str2, String str3, int i, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put(PushConstants.KEY_PUSH_ID, str3);
        linkedHashMap.put("msgType", String.valueOf(i));
        linkedHashMap.put("subSwitch", z ? "1" : "0");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("sign", b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", this.f + " switchPush post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.e.a.b(this.f).a(linkedHashMap2).a().d();
    }

    public c b(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put("appKey", str2);
        linkedHashMap.put(PushConstants.KEY_PUSH_ID, str3);
        linkedHashMap.put("alias", str4);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("sign", b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "subScribeTags post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.e.a.b(this.l).a(linkedHashMap2).a().d();
    }

    public c c(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put(PushConstants.KEY_PUSH_ID, str3);
        linkedHashMap.put("tags", str4);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("sign", b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "subScribeTags post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.e.a.b(this.h).a(linkedHashMap2).a().d();
    }

    public c a(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        if (!TextUtils.isEmpty(str4)) {
            linkedHashMap.put("fdId", str4);
        } else {
            linkedHashMap.put("deviceId", str3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("sign", b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "register post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.e.a.b(this.b).a(linkedHashMap2).a().d();
    }

    public c<String> a(String str, String str2, String str3, String str4, File file) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(RemoteMessageConst.MSGID, str);
        if (!TextUtils.isEmpty(str3)) {
            linkedHashMap.put("fdId", str3);
        } else {
            linkedHashMap.put("deviceId", str2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("sign", b.a(linkedHashMap, "4a2ca769d79f4856bb3bd982d30de790"));
        if (!TextUtils.isEmpty(str4)) {
            linkedHashMap2.put("errorMsg", str4);
        }
        DebugLogger.i("PushAPI", "uploadLogFile post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.e.a.c("https://api-push.meizu.com/garcia/api/client/log/upload").a(linkedHashMap2).a("logFile", file).a().d();
    }

    public c a(String str, String str2, String str3, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put(PushConstants.KEY_PUSH_ID, str3);
        linkedHashMap.put("subSwitch", z ? "1" : "0");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("sign", b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", this.g + " switchPush post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.e.a.b(this.g).a(linkedHashMap2).a().d();
    }
}
