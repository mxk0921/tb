package com.taobao.android.hudong;

import android.net.Uri;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsHDUserIntentAnalyzerAbility;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.a;
import tb.ckf;
import tb.jdb;
import tb.jpu;
import tb.kdb;
import tb.njg;
import tb.t2o;
import tb.wpa;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/taobao/android/hudong/TBHDUserIntentAbility;", "Lcom/taobao/android/abilityidl/ability/AbsHDUserIntentAnalyzerAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/wpa;", "params", "Ltb/jdb;", "callback", "Ltb/xhv;", "trigger", "(Ltb/kdb;Ltb/wpa;Ltb/jdb;)V", "hudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class TBHDUserIntentAbility extends AbsHDUserIntentAnalyzerAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f7940a = "TBHDUserIntentAbility";
    public final njg b = a.b(TBHDUserIntentAbility$predictList$2.INSTANCE);

    static {
        t2o.a(1031798797);
    }

    public static /* synthetic */ Object ipc$super(TBHDUserIntentAbility tBHDUserIntentAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/hudong/TBHDUserIntentAbility");
    }

    public final String a(String str) {
        String p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d10a3a3c", new Object[]{this, str});
        }
        Uri parse = Uri.parse(str);
        if (parse == null || (p = ckf.p(parse.getHost(), parse.getPath())) == null) {
            return str;
        }
        return p;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsHDUserIntentAnalyzerAbility
    public void trigger(kdb kdbVar, wpa wpaVar, jdb jdbVar) {
        String url;
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ee121a", new Object[]{this, kdbVar, wpaVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(wpaVar, "params");
        ckf.g(jdbVar, "callback");
        if (ckf.b("false", OrangeConfig.getInstance().getConfig("hudong_common_config", "feature_report_enable", "false"))) {
            TLog.loge(this.f7940a, "BX Analyzer Disabled");
            return;
        }
        WeakReference<View> h = kdbVar.h();
        WVUCWebView wVUCWebView = null;
        View view = h == null ? null : h.get();
        if (view instanceof WVUCWebView) {
            wVUCWebView = (WVUCWebView) view;
        }
        String str = "";
        if (!(wVUCWebView == null || (url = wVUCWebView.getUrl()) == null || (a2 = a(url)) == null)) {
            str = a2;
        }
        b(wpaVar.f30837a, wpaVar.b, wpaVar.c, str);
    }

    public final void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74b0d739", new Object[]{this, str, str2, str3, str4});
            return;
        }
        String feature = BUFS.getFeature(new BUFS.QueryArgs(), str, str2, str3);
        if (feature == null) {
            feature = "";
        }
        TLog.loge(this.f7940a, feature);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_HDContainer", 19999, "", "", null, kotlin.collections.a.j(jpu.a("feature", feature), jpu.a("mainDocUrl", str4))).build());
    }
}
