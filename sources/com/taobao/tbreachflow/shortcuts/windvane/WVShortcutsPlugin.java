package com.taobao.tbreachflow.shortcuts.windvane;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.login4android.api.Login;
import com.taobao.tbreachflow.shortcuts.windvane.WVShortcutsPlugin;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.aqa;
import tb.dzl;
import tb.e3m;
import tb.kpw;
import tb.nsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WVShortcutsPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements e3m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f13433a;
        public final /* synthetic */ nsw b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;

        public a(WVCallBackContext wVCallBackContext, nsw nswVar, String str, String str2, String str3, String str4, String str5) {
            this.f13433a = wVCallBackContext;
            this.b = nswVar;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
        }

        public final /* synthetic */ void b(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("294e0510", new Object[]{this, str, str2, str3, str4, str5, new Boolean(z), str6});
                return;
            }
            HashMap hashMap = new HashMap(16);
            hashMap.put("action", str);
            hashMap.put("iconId", str2);
            hashMap.put(ChangeAppIconBridge.KEY_ICONNAME, str3);
            hashMap.put("iconImageUrl", str4);
            hashMap.put("targetUrl", str5);
            hashMap.put("success", String.valueOf(z));
            hashMap.put("failReason", str6);
            String d = e3m.d(str2);
            hashMap.put("isIconIdAdded", String.valueOf(TextUtils.isEmpty(d)));
            hashMap.put("isIconIdAddedFailReason", d);
            WVShortcutsPlugin.access$000(WVShortcutsPlugin.this, hashMap);
        }

        public void c(final boolean z, final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dab0aa76", new Object[]{this, new Boolean(z), str});
                return;
            }
            if (z) {
                this.f13433a.success(this.b);
            } else {
                this.f13433a.error(str);
            }
            Handler handler = new Handler(Looper.getMainLooper());
            final String str2 = this.c;
            final String str3 = this.d;
            final String str4 = this.e;
            final String str5 = this.f;
            final String str6 = this.g;
            handler.postDelayed(new Runnable() { // from class: tb.tsw
                @Override // java.lang.Runnable
                public final void run() {
                    WVShortcutsPlugin.a.this.b(str2, str3, str4, str5, str6, z, str);
                }
            }, 5000L);
        }
    }

    public static /* synthetic */ void access$000(WVShortcutsPlugin wVShortcutsPlugin, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa63e08", new Object[]{wVShortcutsPlugin, map});
        } else {
            wVShortcutsPlugin.trackUT(map);
        }
    }

    public static /* synthetic */ Object ipc$super(WVShortcutsPlugin wVShortcutsPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbreachflow/shortcuts/windvane/WVShortcutsPlugin");
    }

    private void trackUT(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17a0eb4", new Object[]{this, map});
            return;
        }
        try {
            String userId = Login.getUserId();
            if (TextUtils.isEmpty(userId)) {
                userId = "";
            }
            map.put("userId", userId);
            UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("pinned_shortcuts");
            uTHitBuilders$UTCustomHitBuilder.setEventPage("TBShortcutsManager");
            uTHitBuilders$UTCustomHitBuilder.setProperties(map);
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
            aqa.b("WVShortcutsPlugin.trackMap=%s", map.toString());
        } catch (Throwable th) {
            aqa.c("WVShortcutsPlugin.error.", th);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        nsw nswVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            nswVar = new nsw();
        } catch (Throwable th) {
            aqa.c("WVShortcutsPlugin.execute." + str + ".error.", th);
            wVCallBackContext.error();
        }
        if ("requestPinnedShortCut".equals(str)) {
            JSONObject parseObject = JSON.parseObject(str2);
            String string = parseObject.getString("iconId");
            String string2 = parseObject.getString("iconImageUrl");
            String string3 = parseObject.getString("targetUrl");
            String string4 = parseObject.getString(ChangeAppIconBridge.KEY_ICONNAME);
            e3m.g(this.mContext, string, string4, string2, string3, new a(wVCallBackContext, nswVar, str, string, string4, string2, string3));
            return true;
        } else if ("checkPinnedShortcutAdded".equals(str)) {
            String d = e3m.d(JSON.parseObject(str2).getString("iconId"));
            nswVar.a("isAdded", Boolean.valueOf(TextUtils.isEmpty(d)));
            nswVar.b("notAddedReason", d);
            wVCallBackContext.success(nswVar);
            return true;
        } else {
            if ("jumpToSystemSettings".equals(str)) {
                if (Build.VERSION.SDK_INT < 26) {
                    wVCallBackContext.error("SYSTEM_LEVEL_INVALID");
                } else {
                    dzl.g(this.mContext);
                    HashMap hashMap = new HashMap(4);
                    hashMap.put("action", str);
                    hashMap.put("brand", Build.BRAND.toLowerCase());
                    hashMap.put("model", Build.MODEL.toLowerCase());
                    hashMap.put("osVersion", Build.VERSION.RELEASE);
                    trackUT(hashMap);
                    wVCallBackContext.success(nswVar);
                }
                return true;
            }
            return false;
        }
    }
}
