package com.taobao.android.layoutmanager.container;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.HashMap;
import tb.b57;
import tb.bps;
import tb.e0o;
import tb.g0o;
import tb.lgs;
import tb.nwv;
import tb.oy3;
import tb.t2o;
import tb.tfs;
import tb.vpg;
import tb.wpg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PageRenderIntercept extends g0o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements vpg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f8182a;

        public a(Application application) {
            this.f8182a = application;
        }

        @Override // tb.vpg
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30647419", new Object[]{this, str});
                return;
            }
            tfs.g("PageRenderIntercept", "onUpdate:" + str);
            if (!TextUtils.isEmpty(str)) {
                Uri parse = Uri.parse(str);
                if (bps.v(parse)) {
                    oy3.g(this.f8182a, parse);
                }
            }
        }
    }

    static {
        t2o.a(502268007);
    }

    public static Uri d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("64d479aa", new Object[]{uri});
        }
        return bps.s(uri);
    }

    public static Uri e(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("ee0fcadd", new Object[]{uri});
        }
        return bps.t(uri);
    }

    public static Uri f(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("6903fe9f", new Object[]{intent});
        }
        if (intent != null) {
            return g(intent.getData());
        }
        return null;
    }

    public static Uri g(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("3b96a333", new Object[]{uri});
        }
        if (uri == null || !TextUtils.equals(uri.getScheme(), "tbopen")) {
            return uri;
        }
        String queryParameter = uri.getQueryParameter("h5Url");
        return !TextUtils.isEmpty(queryParameter) ? Uri.parse(queryParameter) : uri;
    }

    public static void h(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d45cf2a6", new Object[]{context, uri});
        } else if (bps.v(uri)) {
            oy3.f(context, uri);
        }
    }

    public static boolean i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17c91048", new Object[]{str, str2})).booleanValue();
        }
        return bps.x(str, str2);
    }

    public static /* synthetic */ Object ipc$super(PageRenderIntercept pageRenderIntercept, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/PageRenderIntercept");
    }

    @Override // tb.g0o
    public e0o a(Context context, lgs.b bVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e0o) ipChange.ipc$dispatch("5123b26d", new Object[]{this, context, bVar});
        }
        if (bVar != null) {
            z = bps.v(bVar.d);
        }
        if (z) {
            return new bps(bVar);
        }
        return new b57(bVar);
    }

    @Override // tb.g0o
    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28a63631", new Object[]{this, str, str2});
        }
        return str2;
    }

    @Override // tb.g0o
    public String c(String str, String str2) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b2d7312", new Object[]{this, str, str2});
        }
        if (!(str2 == null || (parse = Uri.parse(str2)) == null || !bps.u(parse))) {
            if (str.indexOf("?") > 0) {
                str = str.concat("&policy=localFirst");
            } else {
                str = str.concat("?policy=localFirst");
            }
            tfs.e("PageRenderIntercept", "change dsl policy to localFirst");
        }
        return str;
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        tfs.g("PageRenderIntercept", "init");
        if (application == null) {
            try {
                application = Globals.getApplication();
            } catch (Throwable th) {
                Log.e("PageRenderIntercept", "init application ", th);
            }
        }
        try {
            if (nwv.o(hashMap.get("interceptLinkBack"), false)) {
                wpg.b(new a(application));
                return;
            }
            String I = nwv.I(hashMap.get("startIntent"), null);
            Log.e("PageRenderIntercept", "startIntent :" + I);
            if (!TextUtils.isEmpty(I)) {
                Uri s = bps.s(g(Uri.parse(I)));
                tfs.e("PageRenderIntercept", "preloadVideoMtop " + s);
                h(application, s);
            }
        } catch (Throwable th2) {
            Log.e("PageRenderIntercept", "init error ", th2);
        }
    }
}
