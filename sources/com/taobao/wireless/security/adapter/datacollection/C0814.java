package com.taobao.wireless.security.adapter.datacollection;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.wireless.security.framework.IRouterComponent;
import com.alibaba.wireless.security.open.edgecomputing.ProxyUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.taobao.wireless.security.adapter.datacollection.г  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0814 {

    /* renamed from: а  reason: contains not printable characters */
    private static final String f593 = "SGNTF";

    /* renamed from: б  reason: contains not printable characters */
    static IRouterComponent f594 = null;

    /* renamed from: в  reason: contains not printable characters */
    private static final boolean f595 = false;

    /* renamed from: г  reason: contains not printable characters */
    private static boolean f596 = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.taobao.wireless.security.adapter.datacollection.г$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public static class C0815 extends BroadcastReceiver {

        /* renamed from: com.taobao.wireless.security.adapter.datacollection.г$а$а  reason: contains not printable characters */
        /* loaded from: classes.dex */
        class RunnableC0816 implements Runnable {

            /* renamed from: а  reason: contains not printable characters */
            final /* synthetic */ String f597;

            /* renamed from: б  reason: contains not printable characters */
            final /* synthetic */ JSONObject f598;

            RunnableC0816(String str, JSONObject jSONObject) {
                this.f597 = str;
                this.f598 = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0814.f594.doCommand(13802, this.f597, this.f598.toString());
            }
        }

        C0815() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                Bundle extras = intent.getExtras();
                JSONObject jSONObject = new JSONObject();
                if (extras != null) {
                    for (String str : extras.keySet()) {
                        try {
                            if (Build.VERSION.SDK_INT >= 19) {
                                jSONObject.put(str, JSONObject.wrap(extras.get(str)));
                            }
                        } catch (JSONException unused) {
                        }
                    }
                }
                if (C0814.f596) {
                    Handler handler = ProxyUtil.getHandler();
                    if (handler != null) {
                        handler.post(new RunnableC0816(action, jSONObject));
                        return;
                    }
                    return;
                }
                C0814.f594.doCommand(13802, action, jSONObject.toString());
            } catch (Throwable unused2) {
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: б  reason: contains not printable characters */
    public static void m381(Context context, IRouterComponent iRouterComponent) {
        String[] split;
        if (context != null && iRouterComponent != null) {
            f594 = iRouterComponent;
            f596 = m383();
            String str = (String) f594.doCommand(13805, new Object[0]);
            if (str != null) {
                IntentFilter intentFilter = new IntentFilter();
                for (String str2 : str.split(";")) {
                    if (!TextUtils.isEmpty(str2)) {
                        intentFilter.addAction(str2);
                    }
                }
                C0815 r6 = new C0815();
                if (Build.VERSION.SDK_INT < 34 || !m382()) {
                    context.registerReceiver(r6, intentFilter);
                } else {
                    context.registerReceiver(r6, intentFilter, 4);
                }
            }
        }
    }

    /* renamed from: в  reason: contains not printable characters */
    private static boolean m382() {
        Object obj;
        try {
            obj = f594.doCommand(13204, 0, "atsk14", 0, 1);
        } catch (Exception e) {
            e.printStackTrace();
            obj = null;
        }
        return (obj instanceof Integer) && ((Integer) obj).intValue() > 0;
    }

    /* renamed from: г  reason: contains not printable characters */
    private static boolean m383() {
        Object obj;
        try {
            obj = f594.doCommand(13204, 0, "ntf_async", 0, 1);
        } catch (Exception e) {
            e.printStackTrace();
            obj = null;
        }
        return (obj instanceof Integer) && ((Integer) obj).intValue() > 0;
    }
}
