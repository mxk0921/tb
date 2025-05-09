package com.taobao.themis.taobao.exp;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.evo.EVO;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.inside.TMSSDK;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.annotation.AnnotationRetention;
import kotlin.b;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.ies;
import tb.pl4;
import tb.q9s;
import tb.t2o;
import tb.tbs;
import tb.tsq;
import tb.wsq;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSSimpleLaunchSwitch {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long AS_USUAL = 3;
    public static final long JUMP_TO_BROWSER = 1;
    public static final long JUMP_TO_TMS = 2;
    public static final TMSSimpleLaunchSwitch INSTANCE = new TMSSimpleLaunchSwitch();

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f13755a = yz3.l("ku.m.taobao.com/mix.htm", "pages.tmall.com/wow/hdwk/act/2020nhj-single", "pages-fast.m.taobao.com/wow/z/hdwk/tmfarm/babanongchang", "huodong.taobao.com/wow/z/vip/hbqd5/hbqd5.0", "pages-fast.m.taobao.com/wow/z/tmtjb/town/home", "pages.tmall.com/wow/z/app/ltao-fe/xsms-waitou-b/home", "pages-fast.m.taobao.com/wow/z/vip/hbqd5/hbqd5.0", "market.m.taobao.com/app/dinamic/h5-tb-logistics/router", "detail.m.tmall.com/item.htm", "web.m.taobao.com/app/mtb-guang/tab2-activity/share618", "web.m.taobao.com/app/mtb/refund-pha/detail", "pages.tmall.com/wow/bz/jingmi/1444", "pages.tmall.com/wow/z/wt/daily-earn-shee/8thjJK38HwhfMAskzDiN", "uland.taobao.com/coupon/edetail", "mos.m.taobao.com/union/cailiang_main", "uland.taobao.com/semm/tbsearch", "pages-fast.m.taobao.com/wow/bz/jingmi/1323", "market.m.taobao.com/app/zelda/xxl/index.html", "mo.m.taobao.com/union2/page_1690256876171");

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/taobao/themis/taobao/exp/TMSSimpleLaunchSwitch$LaunchOption;", "", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface LaunchOption {
    }

    @JvmStatic
    public static final long a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9666546", new Object[]{context, str})).longValue();
        }
        ckf.g(context, "context");
        ckf.g(str, "url");
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = 3;
        try {
            j = INSTANCE.b(context, str);
            Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
        }
        TMSLogger.b("TMSSimpleLaunchSwitch", "getJumpOption cost: " + (SystemClock.uptimeMillis() - uptimeMillis) + ", option is " + j);
        return j;
    }

    @JvmStatic
    public static final String c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("786292d9", new Object[]{new Long(j)});
        }
        if (j == 1) {
            return "com.taobao.browser.BrowserActivity";
        }
        if (j == 2) {
            return "com.taobao.themis.container.app.TMSActivity";
        }
        return null;
    }

    static {
        t2o.a(847249443);
    }

    public final long b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99a921c9", new Object[]{this, context, str})).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 3L;
        }
        List<String> list = f13755a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 3L;
        }
        for (String str2 : list) {
            if (wsq.O(str, str2, false, 2, null)) {
                VariationSet activateSync = EVO.activateSync(context, "tms_anr_simple_launch_exp");
                if (activateSync.size() <= 0 || !activateSync.contains("tms_anr_simple_launch_exp")) {
                    return 3L;
                }
                int valueAsInt = activateSync.getVariation("tms_anr_simple_launch_exp").getValueAsInt(0);
                if (valueAsInt != 1) {
                    return valueAsInt != 2 ? 3L : 2L;
                }
                return 1L;
            }
        }
        return 3L;
    }

    @JvmStatic
    public static final boolean d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("236e5c15", new Object[]{context, str})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            TMSLogger.b("TMSSimpleLaunchSwitch", ckf.p("switchTMSMiniKernel error is ", th.getMessage()));
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            TMSSDK.init(context);
            if (!q9s.h2()) {
                TMSLogger.b("TMSSimpleLaunchSwitch", "enableTMSMiniKernel is false");
                return false;
            }
            if (str != null && !tsq.I(str, "tbopen://", false, 2, null)) {
                TMSLogger.b("TMSSimpleLaunchSwitch", "is not tbopen");
                return false;
            }
            TMSLogger.b("TMSSimpleLaunchSwitch", "begin switch");
            String decode = Uri.decode(ies.c(str, "h5Url"));
            String str2 = tbs.b;
            ckf.f(str2, "miniKernelPathList");
            String J3 = q9s.J3("themis_mini_kernel_white_config", "miniKernelPathList", str2);
            if (!TextUtils.isEmpty(J3)) {
                String substring = J3.substring(1, J3.length() - 1);
                ckf.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                List<String> z0 = wsq.z0(substring, new String[]{","}, false, 0, 6, null);
                Uri g = ies.g(decode);
                for (String str3 : z0) {
                    Uri g2 = ies.g(str3);
                    if (TextUtils.equals(g2.getHost(), g.getHost()) && TextUtils.equals(g2.getPath(), g.getPath())) {
                        TMSLogger.b("TMSSimpleLaunchSwitch", "switch themis Kernel");
                        return true;
                    }
                }
            }
            String str4 = tbs.c;
            ckf.f(str4, "miniKernelPageIdList");
            String J32 = q9s.J3("themis_mini_kernel_white_config", "miniKernelPageIdList", str4);
            if (!TextUtils.isEmpty(J32)) {
                String substring2 = J32.substring(1, J32.length() - 1);
                ckf.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                List<String> z02 = wsq.z0(substring2, new String[]{","}, false, 0, 6, null);
                String c = ies.c(str, pl4.KEY_PAGE_ID);
                if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(J32)) {
                    for (String str5 : z02) {
                        if (TextUtils.equals(wsq.Q0(str5).toString(), c)) {
                            TMSLogger.b("TMSSimpleLaunchSwitch", "switch themis Kernel");
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        TMSLogger.b("TMSSimpleLaunchSwitch", "url is empty");
        return false;
    }
}
