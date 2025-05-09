package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.capture.dynamic.msg.TipShowMsg;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.PicParamUtils;
import java.util.LinkedHashMap;
import tb.fme;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class k73 extends mz1<l73> implements hdd, qlb, qk0, vi7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean c;
    public long d;
    public fso e;
    public r70 f;
    public long g;
    public boolean h;

    static {
        t2o.a(730857566);
        t2o.a(481297512);
        t2o.a(481297500);
        t2o.a(481297511);
        t2o.a(481296904);
    }

    public static final /* synthetic */ void C(k73 k73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d31afb74", new Object[]{k73Var});
        } else {
            k73Var.D();
        }
    }

    public static /* synthetic */ Object ipc$super(k73 k73Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.v();
                return null;
            case 188604040:
                super.w();
                return null;
            case 267248023:
                super.n();
                return null;
            case 797441118:
                super.s();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/biz/CaptureTranslatePresenter");
        }
    }

    public static final /* synthetic */ d32 y(k73 k73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d32) ipChange.ipc$dispatch("b3f59da9", new Object[]{k73Var});
        }
        return k73Var.f24401a;
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
            return;
        }
        fso fsoVar = this.e;
        if (fsoVar != null) {
            fsoVar.b();
        }
    }

    public final void F(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcb726c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            ((l73) this.f24401a).m().B().t(new TipShowMsg("对准文本，拍照翻译", 0L, "translate", TipShowMsg.TipShowType.TEXT_TYPE));
        }
    }

    public final void G(MusOuterAlbumBean musOuterAlbumBean) {
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
            H(imgKey, (int) f, true, "");
        }
    }

    public final void H(String str, int i, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd372bfa", new Object[]{this, str, new Integer(i), new Boolean(z), str2});
        } else if (str != null && !TextUtils.isEmpty(str)) {
            mzu.n(p73.f25916a, "clickAlbumPic_dynamic", 2101, new String[0]);
            I();
            ((l73) this.f24401a).m().j(new fme.a(((l73) this.f24401a).I(), str, i, new j73(this, str), true));
        }
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        fso fsoVar = this.e;
        if (fsoVar != null) {
            fsoVar.c();
        }
    }

    public final void L(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832f2585", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h = z;
        if (!z || this.b) {
            z2 = false;
        }
        F(z2);
    }

    @Override // tb.qk0
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e159fe4", new Object[]{this});
        }
    }

    @Override // tb.hdd
    public void d(byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2128929", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z), new Integer(i6)});
        } else if (!this.c) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.d >= 1000) {
                this.d = currentTimeMillis;
                this.c = true;
                if (ipe.c(bArr, i, i2, ((l73) this.f24401a).m().u()) != 1) {
                    z2 = false;
                }
                K(z2);
                this.c = false;
            }
        }
    }

    @Override // tb.qlb
    public void j(Bitmap bitmap, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8f6b2e", new Object[]{this, bitmap, new Boolean(z), new Boolean(z2)});
            return;
        }
        ckf.g(bitmap, "snapshot");
        IrpParamModel irpParamModel = new IrpParamModel(((l73) this.f24401a).p());
        irpParamModel.updateSessionId();
        PhotoFrom.Values values = PhotoFrom.Values.TRANSLATE_TAKE;
        irpParamModel.setPhotoFrom(values);
        irpParamModel.setPssource(((l73) this.f24401a).p().getPssource());
        String a2 = PicParamUtils.Companion.a(z2, values);
        yr3 p = ((l73) this.f24401a).p();
        ckf.f(p, "view.pageModel");
        a8m.j(bitmap, "", a2, p, irpParamModel.getSessionId(), new LinkedHashMap(), new LinkedHashMap(), Integer.valueOf(bitmap.hashCode()), values);
        nmj.e(((l73) this.f24401a).I(), irpParamModel);
    }

    @Override // tb.mz1
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.n();
        Activity I = ((l73) this.f24401a).I();
        ckf.f(I, "view.activity");
        CaptureManager m = ((l73) this.f24401a).m();
        ckf.f(m, "view.manager");
        this.e = new fso(I, m);
        ((l73) this.f24401a).m().d0(this);
    }

    @Override // tb.vi7
    public void onDeviceMove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c6e40d", new Object[]{this});
        } else if (System.currentTimeMillis() - this.g > 1000) {
            ((l73) this.f24401a).m().B().t(new TipShowMsg("请保持手机稳定", 500L, "translate", TipShowMsg.TipShowType.TEXT_TYPE));
        }
    }

    @Override // tb.vi7
    public void onDeviceStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ab3537", new Object[]{this});
        } else {
            this.g = System.currentTimeMillis();
        }
    }

    @Override // tb.mz1
    public void s() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.s();
        this.c = true;
        if (this.h && !this.b) {
            z = true;
        }
        F(z);
    }

    @Override // tb.mz1
    public void v() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.v();
        this.c = false;
        if (this.h && !this.b) {
            z = true;
        }
        F(z);
        if (this.f == null) {
            this.f = new r70(((l73) this.f24401a).I(), this);
        }
    }

    @Override // tb.mz1
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.w();
        r70 r70Var = this.f;
        if (r70Var != null) {
            r70Var.a();
            this.f = null;
        }
    }

    public final void E(pei peiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5f8801", new Object[]{this, peiVar, new Boolean(z)});
        } else if (!((l73) this.f24401a).I().isFinishing() && peiVar != null) {
            if (peiVar.p()) {
                i0u.f(((l73) this.f24401a).I(), "不支持视频文件哦~", 0);
            } else {
                H(peiVar.b().toString(), peiVar.f(), z, peiVar.i());
            }
        }
    }

    public final void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6998649", new Object[]{this, new Boolean(z)});
        } else if (z) {
            log logVar = log.INSTANCE;
            Activity I = ((l73) this.f24401a).I();
            ckf.f(I, "view.activity");
            CaptureManager m = ((l73) this.f24401a).m();
            ckf.f(m, "view.manager");
            logVar.c(I, m, false);
        } else {
            log logVar2 = log.INSTANCE;
            Activity I2 = ((l73) this.f24401a).I();
            ckf.f(I2, "view.activity");
            CaptureManager m2 = ((l73) this.f24401a).m();
            ckf.f(m2, "view.manager");
            logVar2.d(I2, m2, false);
        }
    }
}
