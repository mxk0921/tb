package android.taobao.windvane.extra.performance;

import android.taobao.windvane.extra.uc.WVUCWebView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cce;
import tb.jpw;
import tb.lab;
import tb.t2o;
import tb.tc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BuiltinWebViewPageModel implements cce {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final WVUCWebView webView;

    static {
        t2o.a(989855992);
        t2o.a(989855920);
    }

    public BuiltinWebViewPageModel(WVUCWebView wVUCWebView) {
        this.webView = wVUCWebView;
    }

    @Override // tb.cce
    public void onProperty(String str, Object obj) {
        lab labVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1991a501", new Object[]{this, str, obj});
        } else if (tc.a(this.webView) && (labVar = (lab) jpw.c().a(lab.class)) != null) {
            labVar.e(this.webView, str, obj);
        }
    }

    @Override // tb.cce
    public void onPropertyIfAbsent(String str, Object obj) {
        lab labVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564eb9d7", new Object[]{this, str, obj});
        } else if (tc.a(this.webView) && (labVar = (lab) jpw.c().a(lab.class)) != null) {
            labVar.b(this.webView, str, obj);
        }
    }

    @Override // tb.cce
    public void onStage(String str, long j) {
        lab labVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba4fb14", new Object[]{this, str, new Long(j)});
        } else if (tc.a(this.webView) && (labVar = (lab) jpw.c().a(lab.class)) != null) {
            labVar.c(this.webView, str, j);
        }
    }

    @Override // tb.cce
    public void onStageIfAbsent(String str, long j) {
        lab labVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2a227e", new Object[]{this, str, new Long(j)});
        } else if (tc.a(this.webView) && (labVar = (lab) jpw.c().a(lab.class)) != null) {
            labVar.h(this.webView, str, j);
        }
    }
}
