package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.util.Map;
import tb.fme;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class c73 implements fme.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b73 f16897a;
    public final /* synthetic */ PhotoFrom.Values b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String f;

    public c73(b73 b73Var, PhotoFrom.Values values, String str, int i, String str2) {
        this.f16897a = b73Var;
        this.b = values;
        this.c = str;
        this.d = i;
        this.f = str2;
    }

    @Override // tb.fme.b
    public void a(Bitmap bitmap, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d9a641", new Object[]{this, bitmap, new Long(j)});
            return;
        }
        ckf.g(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
        b73.h(this.f16897a, bitmap, this.b, this.c, this.d, this.f, null);
    }

    @Override // tb.fme.b
    public void onFail(String str, String str2) {
        qu3 g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "errorCode");
        ckf.g(str2, "errorMsg");
        b73.C(this.f16897a);
        Uri parse = Uri.parse(this.c);
        if (parse != null) {
            b73 b73Var = this.f16897a;
            String str3 = this.f;
            int i = this.d;
            pmf.e0();
            Map<String, String> extraParams = ((d73) b73.y(b73Var)).p().getExtraParams();
            ckf.f(extraParams, "view.pageModel.extraParams");
            extraParams.put("screenshotsAppSrc", str3);
            PhotoFrom.Values values = PhotoFrom.Values.ALBUM_SYS;
            yr3 p = ((d73) b73.y(b73Var)).p();
            Activity I = ((d73) b73.y(b73Var)).I();
            m2d z = ((d73) b73.y(b73Var)).m().z();
            String str4 = null;
            if (z != null && (g = z.g()) != null) {
                str4 = g.a();
            }
            o63.c(parse, null, i, values, p, I, -1, 0, str4);
        }
    }
}
