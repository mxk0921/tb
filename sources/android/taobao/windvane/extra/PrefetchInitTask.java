package android.taobao.windvane.extra;

import android.app.Application;
import android.net.Uri;
import android.taobao.windvane.extra.uc.WVPrefetchTrigger;
import android.taobao.windvane.thread.WVThreadPool;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.t;
import tb.t2o;
import tb.v7t;
import tb.x74;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PrefetchInitTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ENABLE_WV_PREFETCH = "enable_wv_prefetch";
    private static final String TAG = "PrefetchInitTask";

    static {
        t2o.a(989855924);
    }

    public static void init(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            if (t.a(application, ENABLE_WV_PREFETCH)) {
                final String str = (String) hashMap.get("startupUrl");
                WVThreadPool.getInstance().execute(new Runnable() { // from class: android.taobao.windvane.extra.PrefetchInitTask.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            String str2 = str;
                            Thread.currentThread().setPriority(10);
                            if (!TextUtils.isEmpty(str)) {
                                String queryParameter = Uri.parse(str).getQueryParameter("u");
                                if (!TextUtils.isEmpty(queryParameter) && Uri.parse(queryParameter).isHierarchical()) {
                                    str2 = queryParameter;
                                }
                            }
                            WVPrefetchTrigger.getInstance().preloadMainHtml(application, str2);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
                v7t.d(TAG, "startupUrl=" + str);
            }
        } catch (Throwable th) {
            v7t.d(TAG, x74.i(th));
        }
    }
}
