package com.taobao.themis.pub_kit.favor;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.pub_kit.favor.AddFavorClient;
import com.taobao.themis.pub_kit.favor.CheckFavorClient;
import com.taobao.themis.pub_kit.favor.RemoveFavorClient;
import java.util.HashMap;
import tb.t2o;
import tb.z54;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BROADCAST_UPDATE_FAVOR = "tms_broadcast_update_favor";

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Boolean> f13720a = new HashMap<>();

    static {
        t2o.a(845152268);
    }

    public static void a(String str, String str2, boolean z, z54<Boolean, Boolean> z54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d07c89", new Object[]{str, str2, new Boolean(z), z54Var});
        } else {
            new AddFavorClient(new AddFavorClient.AddFavorParam(str, str2, z), z54Var).a();
        }
    }

    public static void b(String str, z54<Boolean, Boolean> z54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c270ff1e", new Object[]{str, z54Var});
        } else {
            new CheckFavorClient(new CheckFavorClient.CheckFavorRequestParams(str), z54Var).a();
        }
    }

    public static String c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49d2c01e", new Object[]{str, new Boolean(z)});
        }
        if (z) {
            if ("light".equals(str)) {
                return "https://gw.alicdn.com/imgextra/i4/O1CN01qn1s5w1gbmluhohF5_!!6000000004161-2-tps-90-90.png";
            }
            return "https://gw.alicdn.com/imgextra/i4/O1CN01JA3zsK1wtDhcluMIo_!!6000000006365-2-tps-90-90.png";
        } else if ("light".equals(str)) {
            return "https://gw.alicdn.com/imgextra/i3/O1CN01EzzeTS1gWkPiqTOfC_!!6000000004150-2-tps-90-90.png";
        } else {
            return "https://gw.alicdn.com/imgextra/i3/O1CN01F7301W26qbb9nRDRu_!!6000000007713-2-tps-90-90.png";
        }
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c10b0528", new Object[]{str})).booleanValue();
        }
        HashMap<String, Boolean> hashMap = f13720a;
        if (!hashMap.containsKey(str)) {
            return false;
        }
        return hashMap.get(str).booleanValue();
    }

    public static void e(String str, String str2, boolean z, z54<Boolean, Boolean> z54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca35846", new Object[]{str, str2, new Boolean(z), z54Var});
        } else {
            new RemoveFavorClient(new RemoveFavorClient.RemoveFavorParam(str, str2, z), z54Var).a();
        }
    }

    public static void f(String str, boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6980b730", new Object[]{str, new Boolean(z), context});
            return;
        }
        Intent intent = new Intent(BROADCAST_UPDATE_FAVOR);
        intent.putExtra("appId", str);
        intent.putExtra("isFavored", z);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void g(String str, Boolean bool, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405fafb3", new Object[]{str, bool, context});
            return;
        }
        try {
            f(str, bool.booleanValue(), context);
            f13720a.put(str, bool);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
