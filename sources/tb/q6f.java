package tb;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.evo.EVO;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.adapterimpl.network.MtopNetworkAdapter;
import com.taobao.taolive.room.afccoldlunch.PreSimpleRequestParams;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class q6f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PATH_TAOLIVE = "/taolive/video.html";

    /* renamed from: a  reason: collision with root package name */
    public static final String f26543a = q6f.class.getSimpleName();
    public static boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements vpg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f26544a;

        public a(Application application) {
            this.f26544a = application;
        }

        @Override // tb.vpg
        public void a(String str) {
            Uri parse;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30647419", new Object[]{this, str});
                return;
            }
            q6f.b(q6f.a() + "_APM", "InitTaoLiveColdLaunch LinkBackX onUpdate:" + str);
            if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && TextUtils.equals(q6f.PATH_TAOLIVE, parse.getPath())) {
                q6f.b = true;
                q6f.d(this.f26544a, str);
            }
            wpg.f(this);
        }
    }

    static {
        t2o.a(779092744);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return f26543a;
    }

    public static /* synthetic */ void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bc541de", new Object[]{str, obj});
        } else {
            g(str, obj);
        }
    }

    public static String c(String str, String str2, String str3, String str4) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f7f6c6", new Object[]{str, str2, str3, str4});
        }
        try {
            VariationSet activateSync = EVO.activateSync(str, str2, null, null);
            if (!(activateSync == null || (variation = activateSync.getVariation(str3)) == null)) {
                return variation.getValueAsString(str4);
            }
        } catch (Throwable unused) {
        }
        return str4;
    }

    public static void d(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104f0cf2", new Object[]{application, str});
            return;
        }
        g(f26543a + "_APM", "InitTaoLiveColdLaunch init " + str);
        sj9.r();
        i(application, str);
    }

    public static void e(Application application, HashMap<String, Object> hashMap) {
        Uri parse;
        Uri parse2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        String valueOf = String.valueOf(hashMap.get("startupUrl"));
        String valueOf2 = String.valueOf(hashMap.get("startIntent"));
        Object obj = hashMap.get("isLinkLaunch");
        if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
            g(f26543a + "_APM", "InitTaoLiveColdLaunch init " + valueOf + " " + valueOf2);
            sj9.r();
            j(application, valueOf2);
        } else if (f() && !TextUtils.isEmpty(valueOf2) && (parse = Uri.parse(valueOf2)) != null) {
            String g = bqg.g(parse);
            if (!TextUtils.isEmpty(g) && (parse2 = Uri.parse(g)) != null && !TextUtils.equals(parse2.getPath(), PATH_TAOLIVE) && !TextUtils.equals(parse2.getPath(), "/taolive/main.html")) {
                wpg.b(new a(application));
            }
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("798d9fec", new Object[0])).booleanValue();
        }
        return zqq.c(c("TaoLive", "simpleLaunch", "isLiveLinkBack", "false"));
    }

    public static void g(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b0ad8ce", new Object[]{str, obj});
            return;
        }
        Log.e("TBLive_" + str, String.valueOf(obj));
        TLog.loge("TBLive", str, String.valueOf(obj));
    }

    public static void i(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da7f9864", new Object[]{application, str});
        } else if (!TextUtils.isEmpty(str)) {
            g(f26543a + "_APM", "InitTaoLiveColdLaunch preStartRequestDetail " + str);
            Uri parse = Uri.parse(str);
            if (parse != null) {
                h(application, xnm.d(parse), str);
            }
        }
    }

    public static void j(Application application, String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f082db7", new Object[]{application, str});
        } else if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && !parse.isOpaque()) {
            i(application, bqg.g(parse));
        }
    }

    public static boolean h(Application application, PreSimpleRequestParams preSimpleRequestParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6c9541f", new Object[]{application, preSimpleRequestParams, str})).booleanValue();
        }
        if (!zqq.c(preSimpleRequestParams.needRecommend) && (!TextUtils.isEmpty(preSimpleRequestParams.timeMovingItemId) || RecModel.MEDIA_TYPE_TIMEMOVE.equals(preSimpleRequestParams.productType) || (TextUtils.isEmpty(preSimpleRequestParams.userId) && TextUtils.isEmpty(preSimpleRequestParams.feedId)))) {
            return false;
        }
        g(f26543a + "_APM", "InitTaoLiveColdLaunch preStartRequestDetail start");
        znm.k().q(application, new MtopNetworkAdapter(), preSimpleRequestParams, str);
        return true;
    }
}
