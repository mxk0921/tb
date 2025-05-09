package com.taobao.themis.web.utils;

import android.taobao.windvane.export.network.Request;
import android.taobao.windvane.export.network.b;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.ecd;
import tb.q9s;
import tb.t2o;
import tb.wsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class HTMLPrefetchJob implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final HTMLPrefetchJob INSTANCE = new HTMLPrefetchJob();
    private static final String TAG = "HTMLPrefetchJob";

    static {
        t2o.a(850395200);
    }

    private HTMLPrefetchJob() {
    }

    public static final /* synthetic */ boolean access$enableStricterPrefetchMatch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53c91180", new Object[0])).booleanValue();
        }
        return enableStricterPrefetchMatch();
    }

    public static final /* synthetic */ boolean access$isQueryContains(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a8da3dc", new Object[]{str, str2})).booleanValue();
        }
        return isQueryContains(str, str2);
    }

    @JvmStatic
    private static final boolean enableStricterPrefetchMatch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2da6f0c0", new Object[0])).booleanValue();
        }
        return q9s.b3("themis_common_config", "enableStricterPrefetchMatch", Boolean.TRUE);
    }

    @JvmStatic
    private static final boolean isQueryContains(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc91c31c", new Object[]{str, str2})).booleanValue();
        }
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (str2 == null) {
            return false;
        } else {
            if (wsq.O(str, str2, false, 2, null) || wsq.O(str2, str, false, 2, null)) {
                return true;
            }
            return false;
        }
    }

    @JvmStatic
    public static final void preloadHTMLResource(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd67e6c1", new Object[]{str, new Boolean(z)});
            return;
        }
        ckf.g(str, "h5Url");
        TMSLogger.b(TAG, ckf.p("start preloadHTMLResource tms h5Url: ", str));
        b.i(new Request.b().l(str).i("GET").j(a.INSTANCE).f());
        TMSLogger.b(TAG, ckf.p("finish preloadHTMLResource: ", Long.valueOf(System.currentTimeMillis())));
    }

    @JvmStatic
    public static final boolean preloadJSAPI(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3a5003d", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "h5Url");
        String Z3 = q9s.Z3();
        if (TextUtils.isEmpty(Z3)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : wsq.z0(Z3, new String[]{","}, false, 0, 6, null)) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (wsq.O(str, (String) it.next(), false, 2, null)) {
                    preloadHTMLResource(str, false);
                    return true;
                }
            }
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements ecd {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
            if (tb.ckf.b(r7.getPath(), r8.getPath()) != false) goto L_0x008f;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
        @Override // tb.ecd
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(java.lang.String r7, java.lang.String r8) {
            /*
                Method dump skipped, instructions count: 316
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.web.utils.HTMLPrefetchJob.a.a(java.lang.String, java.lang.String):boolean");
        }
    }
}
