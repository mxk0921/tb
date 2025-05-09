package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class u1x extends TMSEmbed.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "WebViewRenderListener";

    /* renamed from: a  reason: collision with root package name */
    public final k1x f29082a;
    public final String b;
    public final TMSEmbedSolutionType c;
    public final String d;
    public final ajd e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(490733620);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(490733619);
    }

    public u1x(k1x k1xVar, String str, TMSEmbedSolutionType tMSEmbedSolutionType, String str2, ajd ajdVar) {
        ckf.g(k1xVar, "mWebViewContext");
        ckf.g(str, "mPageUrl");
        ckf.g(tMSEmbedSolutionType, "mSolutionType");
        ckf.g(str2, "mBusinessId");
        this.f29082a = k1xVar;
        this.b = str;
        this.c = tMSEmbedSolutionType;
        this.d = str2;
        this.e = ajdVar;
    }

    public static /* synthetic */ Object ipc$super(u1x u1xVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1799497502:
                super.c((String) objArr[0], (String) objArr[1]);
                return null;
            case -936190188:
                super.m();
                return null;
            case -799572052:
                super.d();
                return null;
            case -302283915:
                super.n();
                return null;
            case 1131744663:
                super.e();
                return null;
            case 2123836685:
                super.l((String) objArr[0], (String) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/webview/WebViewRenderListener");
        }
    }

    @Override // com.taobao.themis.external.embed.TMSEmbed.a
    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94bdd8e2", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "errorCode");
        ckf.g(str2, "errorMsg");
        super.c(str, str2);
        fve.e(TAG, "onJSException errorCode:" + str + " errorMsg:" + str2);
        ajd ajdVar = this.e;
        if (ajdVar != null) {
            ajdVar.b(str, str2);
        }
        mdv.INSTANCE.b("onJSException", str, str2, this.d, this.c.name(), this.b);
    }

    @Override // com.taobao.themis.external.embed.TMSEmbed.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0577fac", new Object[]{this});
            return;
        }
        super.d();
        fve.e(TAG, sxl.LAUNCHER_FINISH_TIME);
        sxl c = this.f29082a.c();
        if (c != null) {
            c.k(sxl.LAUNCHER_FINISH_TIME);
        }
        mdv.INSTANCE.c("launchFinish", this.d, this.c, this.b);
    }

    @Override // com.taobao.themis.external.embed.TMSEmbed.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43750d97", new Object[]{this});
            return;
        }
        super.e();
        fve.e(TAG, sxl.LAUNCHER_START_TIME);
        sxl c = this.f29082a.c();
        if (c != null) {
            c.k(sxl.LAUNCHER_START_TIME);
        }
        mdv.INSTANCE.c("launchStart", this.d, this.c, this.b);
    }

    @Override // com.taobao.themis.external.embed.TMSEmbed.a
    public void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "errorCode");
        ckf.g(str2, "errorMsg");
        super.l(str, str2);
        fve.e(TAG, "onRenderFailed errorCode:" + str + " errorMsg:" + str2);
        ajd ajdVar = this.e;
        if (ajdVar != null) {
            ajdVar.b(str, str2);
        }
        mdv.INSTANCE.b("onRenderFailed", str, str2, this.d, this.c.name(), this.b);
    }

    @Override // com.taobao.themis.external.embed.TMSEmbed.a
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c832df14", new Object[]{this});
            return;
        }
        super.m();
        fve.e(TAG, sxl.RENDER_START_TIME);
        sxl c = this.f29082a.c();
        if (c != null) {
            c.k(sxl.RENDER_START_TIME);
        }
        mdv.INSTANCE.c("renderStart", this.d, this.c, this.b);
    }

    @Override // com.taobao.themis.external.embed.TMSEmbed.a
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            return;
        }
        super.n();
        fve.e(TAG, sxl.RENDER_SUCCESS_TIME);
        ajd ajdVar = this.e;
        if (ajdVar != null) {
            ajdVar.a();
        }
        sxl c = this.f29082a.c();
        if (c != null) {
            c.k(sxl.RENDER_SUCCESS_TIME);
        }
        mdv.INSTANCE.c("renderSuccess", this.d, this.c, this.b);
    }
}
