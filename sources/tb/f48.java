package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.DynCaptureImgGotConfig;
import java.util.Map;
import tb.y7m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class f48 implements y7m.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DynCaptureImgGotConfig f18992a;
    public final JSONObject b = new JSONObject();

    static {
        t2o.a(481296644);
        t2o.a(481297329);
    }

    public f48(DynCaptureImgGotConfig dynCaptureImgGotConfig) {
        ckf.g(dynCaptureImgGotConfig, "dynCaptureImgGotConfig");
        this.f18992a = dynCaptureImgGotConfig;
        v7m f = dynCaptureImgGotConfig.f();
        if (f != null) {
            f.q(this);
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        v7m f = this.f18992a.f();
        if (f != null) {
            f.p();
        }
    }

    @Override // tb.y7m.a
    public void o(x7m x7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d240027", new Object[]{this, x7mVar});
            return;
        }
        ckf.g(x7mVar, "event");
        String b = x7mVar.b();
        if (ckf.b(b, av6.IMAGE_PROCESS_TAG)) {
            if (x7mVar.d() && (x7mVar.a() instanceof lre)) {
                JSONObject jSONObject = this.b.getJSONObject("imgData");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Object a2 = x7mVar.a();
                if (a2 != null) {
                    lre lreVar = (lre) a2;
                    Integer[] b2 = lreVar.b();
                    if ((b2 == null ? 0 : b2.length) >= 2) {
                        ckf.d(b2);
                        jSONObject.put((JSONObject) "w", (String) b2[0]);
                        jSONObject.put((JSONObject) "h", (String) b2[1]);
                    } else {
                        jSONObject.put((JSONObject) "w", (String) 0);
                        jSONObject.put((JSONObject) "h", (String) 0);
                    }
                    jSONObject.put((JSONObject) "base64", lreVar.a());
                    this.b.put((JSONObject) "imgData", (String) jSONObject);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.pipline.model.ImgProcessResult");
            }
        } else if (ckf.b(b, "ImageMockSearch")) {
            if (x7mVar.d() && (x7mVar.a() instanceof Map)) {
                JSONObject jSONObject2 = this.b;
                Object a3 = x7mVar.a();
                if (a3 != null) {
                    jSONObject2.put((JSONObject) "searchParams", (String) ((Map) a3));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                }
            }
            l63 e = this.f18992a.e();
            if (e != null) {
                e.a(this.b, 0, "");
            }
            this.f18992a.f().f().a();
        }
    }
}
