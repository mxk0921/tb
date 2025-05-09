package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.util.LinkedHashMap;
import tb.fme;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class j73 implements fme.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k73 f21808a;
    public final /* synthetic */ String b;

    public j73(k73 k73Var, String str) {
        this.f21808a = k73Var;
        this.b = str;
    }

    @Override // tb.fme.b
    public void a(Bitmap bitmap, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d9a641", new Object[]{this, bitmap, new Long(j)});
            return;
        }
        ckf.g(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
        IrpParamModel irpParamModel = new IrpParamModel(((l73) k73.y(this.f21808a)).p());
        PhotoFrom.Values values = PhotoFrom.Values.TRANSLATE_ALBUM;
        irpParamModel.setPhotoFrom(values);
        irpParamModel.setPssource(((l73) k73.y(this.f21808a)).p().getPssource());
        irpParamModel.updateSessionId();
        String str = this.b;
        yr3 p = ((l73) k73.y(this.f21808a)).p();
        ckf.f(p, "view.pageModel");
        a8m.j(bitmap, str, "", p, irpParamModel.getSessionId(), new LinkedHashMap(), new LinkedHashMap(), Integer.valueOf(bitmap.hashCode()), values);
        nmj.e(((l73) k73.y(this.f21808a)).I(), irpParamModel);
        k73.C(this.f21808a);
    }

    @Override // tb.fme.b
    public void onFail(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "errorCode");
        ckf.g(str2, "errorMsg");
        k73.C(this.f21808a);
        i0u.f(((l73) k73.y(this.f21808a)).I(), "图片加载失败，请退出镜头页后重试", 0);
    }
}
