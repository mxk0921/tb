package tb;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ImageSearchMtopUtil;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class pft {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f26068a;
    public final String b;
    public final RectF c;
    public final String d;
    public final Map<String, String> e;
    public final ImageSearchMtopUtil.a f;
    public boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements ImageSearchMtopUtil.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.etao.feimagesearch.util.ImageSearchMtopUtil.a
        public void a(MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5be81ac", new Object[]{this, mtopResponse, str, str2, jSONObject});
            } else if (!pft.this.a()) {
                pft.this.b().a(mtopResponse, str, str2, jSONObject);
            }
        }

        @Override // com.etao.feimagesearch.util.ImageSearchMtopUtil.a
        public void b(String str, String str2, Integer num, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ac2ca7b", new Object[]{this, str, str2, num, str3});
            } else if (!pft.this.a()) {
                pft.this.b().b(str, str2, num, str3);
            }
        }
    }

    static {
        t2o.a(481297436);
    }

    public pft(Bitmap bitmap, String str, RectF rectF, String str2, Map<String, String> map, ImageSearchMtopUtil.a aVar) {
        ckf.g(map, "params");
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        this.f26068a = bitmap;
        this.b = str;
        this.c = rectF;
        this.d = str2;
        this.e = map;
        this.f = aVar;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac1659a6", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public final ImageSearchMtopUtil.a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageSearchMtopUtil.a) ipChange.ipc$dispatch("e529d079", new Object[]{this});
        }
        return this.f;
    }

    public final void c() {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!this.g) {
            Bitmap bitmap = this.f26068a;
            if (bitmap == null) {
                if (this.c != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((int) this.c.left);
                    sb.append(',');
                    sb.append((int) this.c.right);
                    sb.append(',');
                    sb.append((int) this.c.top);
                    sb.append(',');
                    sb.append((int) this.c.bottom);
                    str3 = sb.toString();
                } else {
                    str3 = null;
                }
                if (TextUtils.isEmpty(this.d)) {
                    str = "0,0,0,0";
                } else {
                    str = this.d;
                    ckf.d(str);
                }
                str2 = null;
            } else {
                str = "0," + this.f26068a.getWidth() + ",0," + this.f26068a.getHeight();
                str2 = gd2.c(bitmap, Bitmap.CompressFormat.JPEG, 70);
                str3 = str;
            }
            this.e.put("region", str3);
            this.e.put("full_region_size", str);
            ImageSearchMtopUtil.h(this.e);
            ImageSearchMtopUtil.g(this.e);
            if (!TextUtils.isEmpty(str2)) {
                this.e.put(ImageSearchMtopUtil.KEY_IMG, str2);
            }
            if (!TextUtils.isEmpty(this.b)) {
                this.e.put("searchimg", this.b);
            }
            ImageSearchMtopUtil.j(null, lg4.F1(), lg4.G1(), this.e, new a());
        }
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eabf57e", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pft(Bitmap bitmap, Map<String, String> map, ImageSearchMtopUtil.a aVar) {
        this(bitmap, null, null, null, map, aVar);
        ckf.g(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
        ckf.g(map, "params");
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pft(String str, RectF rectF, String str2, Map<String, String> map, ImageSearchMtopUtil.a aVar) {
        this(null, str, rectF, str2, map, aVar);
        ckf.g(map, "params");
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
    }
}
