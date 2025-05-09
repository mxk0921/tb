package com.taobao.android.nav;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.android.nav.Nav;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.bqg;
import tb.h1p;
import tb.itw;
import tb.m7r;
import tb.obq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a implements Nav.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<ResolveInfo> f9032a;

    static {
        t2o.a(775946289);
        t2o.a(578814042);
    }

    public a() {
        ArrayList arrayList = new ArrayList();
        this.f9032a = arrayList;
        arrayList.add(new Nav.EscapeResolveInfo());
    }

    public final void c(Iterator<ResolveInfo> it, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea7cecf8", new Object[]{this, it, intent});
            return;
        }
        while (it.hasNext()) {
            ResolveInfo next = it.next();
            if (next != null && (obq.BIZ_NAME.equals(next.activityInfo.name) || e(next))) {
                if (e(next)) {
                    boolean g = g(intent);
                    if (!g || !d(intent)) {
                        if (!g || !f(intent)) {
                            if (!"com.taobao.tao.welcome.Welcome".equals(TBMainHost.b().getName())) {
                                it.remove();
                            }
                        }
                    }
                } else if (!Nav.hasWelcome() && !obq.BIZ_NAME.equals(TBMainHost.b().getName()) && TBMainHost.b().getName() != null) {
                    it.remove();
                }
            }
        }
    }

    public final boolean d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd1aa32a", new Object[]{this, intent})).booleanValue();
        }
        return intent.getBooleanExtra("cold_startup_h5", false);
    }

    public final boolean e(ResolveInfo resolveInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95e0f695", new Object[]{this, resolveInfo})).booleanValue();
        }
        if ("com.taobao.tao.welcome.Welcome".equals(resolveInfo.activityInfo.name) || "com.taobao.tao.welcome.Welcome".equals(resolveInfo.activityInfo.targetActivity)) {
            return true;
        }
        return false;
    }

    public final boolean f(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e010a1c", new Object[]{this, intent})).booleanValue();
        }
        if (intent.getBooleanExtra(bqg.EXTRA_LINK_HOT_START, false) || intent.getBooleanExtra("hot_startup_h5", false)) {
            return true;
        }
        return false;
    }

    public final List<ResolveInfo> h(PackageManager packageManager, Intent intent, boolean z, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("45c12e56", new Object[]{this, packageManager, intent, new Boolean(z), new Integer(i), new Boolean(z2)});
        }
        if (z) {
            i = 65536;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, i);
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            c(queryIntentActivities.iterator(), intent);
            return queryIntentActivities;
        } else if (!z2 || Build.VERSION.SDK_INT < 30) {
            return null;
        } else {
            TLog.loge("Nav", "queryIntentActivities", "list_empty_but_allowEscape " + intent);
            return this.f9032a;
        }
    }

    public final Intent i(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("84aaea0e", new Object[]{this, intent});
        }
        boolean isDebug = Versions.isDebug();
        String dataString = intent.getDataString();
        if (isDebug) {
            new StringBuilder("url:").append(dataString);
        }
        String scheme = Uri.parse(dataString).getScheme();
        if (isDebug) {
            new StringBuilder("scheme:").append(scheme);
        }
        if (scheme == null) {
            intent.putExtra(m7r.URL_REFERER_ORIGIN, dataString);
            if (dataString.startsWith(itw.URL_SEPARATOR)) {
                str = "http:".concat(dataString);
            } else {
                str = h1p.HTTP_PREFIX.concat(dataString);
            }
            intent.setData(Uri.parse(str));
        } else if (scheme.equals("https")) {
            intent.putExtra(m7r.URL_REFERER_ORIGIN, dataString);
            TLog.loge("Nav", "URL_REFERER_ORIGIN is: " + dataString);
            String replaceFirst = dataString.replaceFirst("https", "http");
            if (isDebug) {
                new StringBuilder("url after replaceFirst===").append(replaceFirst);
            }
            intent.setData(Uri.parse(replaceFirst));
        } else if (scheme.startsWith(itw.URL_SEPARATOR)) {
            intent.putExtra(m7r.URL_REFERER_ORIGIN, dataString);
            intent.setData(Uri.parse("http:" + dataString));
        }
        if (isDebug) {
            new StringBuilder("intent:").append(intent);
        }
        return intent;
    }

    public final boolean g(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e88df53", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (data == null || data.isOpaque() || !"m.taobao.com".equals(data.getHost())) {
            return false;
        }
        String path = data.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        return path.startsWith("/tbopen/index.htm");
    }

    @Override // com.taobao.android.nav.Nav.h
    public ResolveInfo a(PackageManager packageManager, Intent intent, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResolveInfo) ipChange.ipc$dispatch("2d1306dd", new Object[]{this, packageManager, intent, new Integer(i), new Boolean(z)});
        }
        TLog.loge("Nav", "url when resolveActivity is: " + intent.getDataString());
        i(intent);
        ResolveInfo resolveInfo = null;
        if (Build.MANUFACTURER.equalsIgnoreCase("HTC")) {
            return null;
        }
        List<ResolveInfo> h = h(packageManager, intent, true, i, z);
        if (!z) {
            resolveInfo = Nav.optimum(Globals.getApplication(), h);
        } else if (h != null && h.size() >= 1) {
            resolveInfo = h.get(0);
        }
        if (resolveInfo != null) {
            TLog.loge("Nav", "r: " + resolveInfo);
        }
        return resolveInfo;
    }

    @Override // com.taobao.android.nav.Nav.h
    public List<ResolveInfo> b(PackageManager packageManager, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a4749067", new Object[]{this, packageManager, intent, new Integer(i)});
        }
        i(intent);
        List<ResolveInfo> h = h(packageManager, intent, false, i, false);
        if (h != null) {
            for (int i2 = 0; i2 < h.size(); i2++) {
                ResolveInfo resolveInfo = h.get(i2);
                if (resolveInfo != null) {
                    TLog.loge("Nav", "q: " + resolveInfo);
                }
            }
        }
        return h;
    }
}
