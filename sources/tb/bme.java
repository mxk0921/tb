package tb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.bean.ImageRule;
import com.etao.feimagesearch.model.PhotoFrom;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class bme extends yy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean d;

    static {
        t2o.a(481297360);
    }

    public bme() {
        this(false, 1, null);
    }

    public static /* synthetic */ Object ipc$super(bme bmeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/node/ImageLoadNode");
    }

    @Override // tb.yy1
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b5601d", new Object[]{this});
        }
        return "ImageLoad";
    }

    public bme(boolean z) {
        this.d = z;
    }

    public final ImageRule o() {
        ImageRule imageRule;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageRule) ipChange.ipc$dispatch("aa512126", new Object[]{this});
        }
        if (caa.u()) {
            ImageRule p2 = lg4.p2(ImageRule.NET_TYPE_WIFI);
            ckf.f(p2, "{\n      ConfigModel.getI…Rule.NET_TYPE_WIFI)\n    }");
            return p2;
        }
        int a2 = n4p.a();
        if (a2 == 1) {
            imageRule = lg4.p2(ImageRule.NET_TYPE_WIFI);
        } else if (a2 == 2) {
            imageRule = lg4.p2(ImageRule.NET_TYPE_2G);
        } else if (a2 == 3) {
            imageRule = lg4.p2(ImageRule.NET_TYPE_3G);
        } else if (a2 != 4) {
            imageRule = lg4.p2(ImageRule.NET_TYPE_OTHER);
        } else {
            imageRule = lg4.p2(ImageRule.NET_TYPE_4G);
        }
        ckf.f(imageRule, "{\n      when (SearchNetw…TYPE_OTHER)\n      }\n    }");
        return imageRule;
    }

    public /* synthetic */ bme(boolean z, int i, a07 a07Var) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // tb.yy1
    public x7m k(w7m w7mVar) {
        cme cmeVar;
        String str;
        Bitmap bitmap;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("826f33b6", new Object[]{this, w7mVar});
        }
        ckf.g(w7mVar, "pipLineDS");
        if (((w7mVar.p() != PhotoFrom.Values.OUTER_ALBUM_LOCAL && w7mVar.p() != PhotoFrom.Values.ALBUM && w7mVar.p() != PhotoFrom.Values.ALBUM_SYS) || !lg4.n()) && w7mVar.h() != null) {
            Bitmap h = w7mVar.h();
            ckf.d(h);
            if (w7mVar.m() == null) {
                w7mVar.I(h);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(h.getWidth());
            sb.append('_');
            sb.append(h.getHeight());
            String sb2 = sb.toString();
            a("isRemote", "false");
            a("imgSize", sb2);
            pmf.p0(sb2);
            n();
            pmf.n0(Long.valueOf(SystemClock.elapsedRealtime() - h()));
            return f(h);
        } else if (w7mVar.j() == null || TextUtils.isEmpty(String.valueOf(w7mVar.j()))) {
            m(-2, "无图片资源");
            return c(-2, "无图片资源", this.d);
        } else {
            String valueOf = String.valueOf(w7mVar.j());
            if (w7mVar.w()) {
                cmeVar = gie.a(valueOf, 0, 640, 640, 1280, 1280);
                ckf.f(cmeVar, "getRemoteImage(imgUrl, 0, 640, 640, 1280, 1280)");
            } else {
                cme cmeVar2 = new cme();
                ImageRule o = o();
                try {
                    if (w7mVar.t()) {
                        bitmap = gd2.b(w7mVar.c(), true);
                    } else if (w7mVar.u()) {
                        bitmap = hs3.INSTANCE.a(w7mVar.c(), true);
                    } else {
                        bitmap = gd2.i(w7mVar.j(), o.maxSize, 1, 10);
                    }
                } catch (Exception e) {
                    cmeVar2.e("-3");
                    cmeVar2.f(e.getMessage());
                    bitmap = null;
                }
                if (bitmap == null) {
                    cmeVar2.d(null);
                } else {
                    cmeVar2.d(gd2.p(bitmap, w7mVar.i()));
                }
                cmeVar = cmeVar2;
            }
            a("imgPath", valueOf);
            if (cmeVar.a() == null) {
                int c = trl.c(cmeVar.b(), -1);
                String str2 = "imgUrl:" + w7mVar.j() + ",errMsg:" + ((Object) cmeVar.c());
                m(c, str2);
                Integer valueOf2 = Integer.valueOf(c);
                if (!w7mVar.v()) {
                    z = this.d;
                }
                return c(valueOf2, str2, z);
            }
            Bitmap a2 = cmeVar.a();
            if (a2 == null) {
                str = "";
            } else {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                w7mVar.E(a2.copy(config, a2.isMutable()));
                w7mVar.I(a2.copy(config, a2.isMutable()));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(a2.getWidth());
                sb3.append('_');
                sb3.append(a2.getHeight());
                str = sb3.toString();
            }
            a("imgSize", str);
            pmf.p0(str);
            n();
            pmf.n0(Long.valueOf(SystemClock.elapsedRealtime() - h()));
            return f(cmeVar.a());
        }
    }
}
