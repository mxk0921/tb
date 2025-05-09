package com.taobao.tao.shop.common;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.evo.EVO;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.NotifyApm;
import com.ut.mini.UTAnalytics;
import java.net.URL;
import java.util.Iterator;
import tb.bho;
import tb.gqp;
import tb.jts;
import tb.jvr;
import tb.lvr;
import tb.mvr;
import tb.o7r;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShopUrlFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991524);
    }

    public static boolean a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83a4653f", new Object[]{str})).booleanValue();
        }
        try {
            str2 = new URL(str).getHost();
        } catch (Exception e) {
            e.printStackTrace();
            str2 = null;
        }
        if (str2 == null) {
            return false;
        }
        Iterator<Object> it = jvr.p().v().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof String) && str2.equals((String) next)) {
                return true;
            }
        }
        return false;
    }

    public boolean b(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d114e37", new Object[]{this, str, context})).booleanValue();
        }
        if (!gqp.a() || TextUtils.isEmpty(str) || a(str)) {
            return false;
        }
        boolean e = jts.b().e(o7r.f25192a, str, lvr.b);
        if (e && (context instanceof Activity)) {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(context);
            NotifyApm.b().c((Activity) context);
        }
        return e;
    }

    public boolean c(String str, Context context, bho bhoVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b3cb451", new Object[]{this, str, context, bhoVar})).booleanValue();
        }
        if (!gqp.a() || TextUtils.isEmpty(str) || a(str)) {
            return false;
        }
        try {
            if (jvr.p().c()) {
                z = EVO.isSwitchOpened(context, "delete_page");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Log.e("tbsr", "enable delete page : " + z);
        mvr.a("enable delete page : " + z);
        boolean f = jts.b().f(o7r.f25192a, str, lvr.b, bhoVar);
        if (f && (context instanceof Activity)) {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(context);
            Activity activity = (Activity) context;
            NotifyApm.b().c(activity);
            if (!z) {
                activity.finish();
            }
        }
        return f;
    }
}
