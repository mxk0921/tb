package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.PicParamUtils;
import com.taobao.android.nav.Nav;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.util.LinkedHashMap;
import tb.fme;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class f63 extends mz1<g63> implements hdd, qlb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public fso c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements fme.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        public a(String str, int i) {
            this.b = str;
            this.c = i;
        }

        @Override // tb.fme.b
        public void a(Bitmap bitmap, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19d9a641", new Object[]{this, bitmap, new Long(j)});
                return;
            }
            ckf.g(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
            IrpParamModel irpParamModel = new IrpParamModel(((g63) f63.C(f63.this)).p());
            PhotoFrom.Values values = PhotoFrom.Values.IDENTIFY_ALBUM;
            irpParamModel.setPhotoFrom(values);
            irpParamModel.setPssource(((g63) f63.C(f63.this)).p().getPssource());
            irpParamModel.updateSessionId();
            Uri parse = Uri.parse(this.b);
            ckf.f(parse, "parse(path)");
            int i = this.c;
            yr3 p = ((g63) f63.C(f63.this)).p();
            ckf.f(p, "view.pageModel");
            a8m.a(parse, bitmap, i, values, p, irpParamModel.getSessionId());
            Nav from = Nav.from(((g63) f63.C(f63.this)).I());
            f63 f63Var = f63.this;
            String value = values.getValue();
            ckf.f(value, "IDENTIFY_ALBUM.value");
            from.toUri(f63.y(f63Var, value, irpParamModel.getSessionId()));
            f63.D(f63.this, false);
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
            f63.D(f63.this, false);
            i0u.f(((g63) f63.C(f63.this)).I(), "图片加载失败，请退出镜头页后重试", 0);
        }
    }

    static {
        t2o.a(730857547);
        t2o.a(481297512);
        t2o.a(481297500);
    }

    public static final /* synthetic */ d32 C(f63 f63Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d32) ipChange.ipc$dispatch("6265ac5a", new Object[]{f63Var});
        }
        return f63Var.f24401a;
    }

    public static final /* synthetic */ void D(f63 f63Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf38fed", new Object[]{f63Var, new Boolean(z)});
        } else {
            f63Var.G(z);
        }
    }

    public static /* synthetic */ Object ipc$super(f63 f63Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.v();
            return null;
        } else if (hashCode == 267248023) {
            super.n();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/capture/dynamic/biz/CaptureIdentifyPresenter");
        }
    }

    public static final /* synthetic */ Uri y(f63 f63Var, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("6edb7bda", new Object[]{f63Var, str, new Long(j)});
        }
        return f63Var.E(str, j);
    }

    public final Uri E(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("11377201", new Object[]{this, str, new Long(j)});
        }
        Uri parse = Uri.parse("taobao://h5.m.taobao.com/tusou/immerse/imagesearch/index.html?pssource=" + ((Object) ((g63) this.f24401a).p().getPssource()) + "&photofrom=" + str + "&sessionId=" + j);
        ckf.f(parse, "parse(\"taobao://h5.m.tao…&sessionId=${sessionId}\")");
        return parse;
    }

    public final void G(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("644a7e74", new Object[]{this, new Boolean(z)});
        } else if (z) {
            fso fsoVar = this.c;
            if (fsoVar != null) {
                fsoVar.c();
            }
        } else {
            fso fsoVar2 = this.c;
            if (fsoVar2 != null) {
                fsoVar2.b();
            }
        }
    }

    public final void H(MusOuterAlbumBean musOuterAlbumBean) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89dffb4e", new Object[]{this, musOuterAlbumBean});
            return;
        }
        ckf.g(musOuterAlbumBean, "albumBean");
        if (!TextUtils.isEmpty(musOuterAlbumBean.getImgKey())) {
            String imgKey = musOuterAlbumBean.getImgKey();
            Float imgRotation = musOuterAlbumBean.getImgRotation();
            if (imgRotation == null) {
                f = 0.0f;
            } else {
                f = imgRotation.floatValue();
            }
            I(imgKey, (int) f);
        }
    }

    public final void I(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a26a924", new Object[]{this, str, new Integer(i)});
        } else if (str != null && !TextUtils.isEmpty(str)) {
            mzu.n(p73.f25916a, "clickAlbumPic_dynamic", 2101, new String[0]);
            G(true);
            ((g63) this.f24401a).m().j(new fme.a(((g63) this.f24401a).I(), str, i, new a(str, i), true));
        }
    }

    @Override // tb.hdd
    public void d(byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2128929", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z), new Integer(i6)});
        }
    }

    @Override // tb.qlb
    public void j(Bitmap bitmap, boolean z, boolean z2) {
        v3o assignRequestConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8f6b2e", new Object[]{this, bitmap, new Boolean(z), new Boolean(z2)});
            return;
        }
        ckf.g(bitmap, "snapshot");
        IrpParamModel irpParamModel = new IrpParamModel(((g63) this.f24401a).p());
        irpParamModel.updateSessionId();
        PhotoFrom.Values values = PhotoFrom.Values.IDENTIFY_TAKE;
        irpParamModel.setPhotoFrom(values);
        irpParamModel.setPssource(((g63) this.f24401a).p().getPssource());
        String a2 = PicParamUtils.Companion.a(z2, values);
        yr3 p = ((g63) this.f24401a).p();
        ckf.f(p, "view.pageModel");
        yr3 yr3Var = p;
        long sessionId = irpParamModel.getSessionId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        yr3 p2 = ((g63) this.f24401a).p();
        String str = null;
        if (!(p2 == null || (assignRequestConfig = p2.getAssignRequestConfig()) == null)) {
            str = assignRequestConfig.d();
        }
        linkedHashMap.put("component", str);
        xhv xhvVar = xhv.INSTANCE;
        a8m.b(bitmap, "", a2, yr3Var, sessionId, linkedHashMap, new LinkedHashMap(), values);
        Nav from = Nav.from(((g63) this.f24401a).I());
        String value = values.getValue();
        ckf.f(value, "IDENTIFY_TAKE.value");
        from.toUri(E(value, irpParamModel.getSessionId()));
    }

    @Override // tb.mz1
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.n();
        Activity I = ((g63) this.f24401a).I();
        ckf.f(I, "view.activity");
        CaptureManager m = ((g63) this.f24401a).m();
        ckf.f(m, "view.manager");
        this.c = new fso(I, m);
    }

    @Override // tb.mz1
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            super.v();
        }
    }

    public final void F(pei peiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("540b5133", new Object[]{this, peiVar});
        } else if (!((g63) this.f24401a).I().isFinishing() && peiVar != null) {
            if (peiVar.p()) {
                i0u.f(((g63) this.f24401a).I(), "不支持视频文件哦~", 0);
            } else {
                I(peiVar.b().toString(), peiVar.f());
            }
        }
    }
}
