package tb;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.components.async_image.NCComponentAsyncImage;
import com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler;
import com.taobao.uikit.extend.feature.features.PhenixOptions;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class egz extends NCComponentViewHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598736946);
    }

    public static /* synthetic */ Object ipc$super(egz egzVar, String str, Object... objArr) {
        if (str.hashCode() == -76004444) {
            super.onUpdateViewWithContext((biz) objArr[0], (jkz) objArr[1], (jkz) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/components/async_image/NCComponentAsyncImageViewHandler");
    }

    public final void b(NCComponentAsyncImage nCComponentAsyncImage, zbn zbnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4507cd", new Object[]{this, nCComponentAsyncImage, zbnVar});
            return;
        }
        if (zbnVar.B()) {
            nCComponentAsyncImage.setSkipAutoSize(true);
        } else {
            nCComponentAsyncImage.setSkipAutoSize(false);
        }
        nCComponentAsyncImage.setScaleType(d(zbnVar.C()));
    }

    public final void c(NCComponentAsyncImage nCComponentAsyncImage, zbn zbnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a7f673", new Object[]{this, nCComponentAsyncImage, zbnVar});
        } else {
            nCComponentAsyncImage.setImageUrl(zbnVar.E(), new PhenixOptions());
        }
    }

    public final ImageView.ScaleType d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView.ScaleType) ipChange.ipc$dispatch("410aea16", new Object[]{this, new Integer(i)});
        }
        if (x2z.b(i, x2z.a(0))) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (x2z.b(i, x2z.a(1))) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (x2z.b(i, x2z.a(2))) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (x2z.b(i, x2z.a(3))) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (x2z.b(i, x2z.a(4))) {
            return ImageView.ScaleType.CENTER_INSIDE;
        }
        if (x2z.b(i, x2z.a(5))) {
            return ImageView.ScaleType.MATRIX;
        }
        if (x2z.b(i, x2z.a(6))) {
            return ImageView.ScaleType.FIT_XY;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    @Override // com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        ckf.g(context, "context");
        return new NCComponentAsyncImage(context);
    }

    @Override // com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler
    public void onUpdateViewWithContext(biz bizVar, jkz jkzVar, jkz jkzVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7843a4", new Object[]{this, bizVar, jkzVar, jkzVar2});
            return;
        }
        ckf.g(bizVar, "nanoContext");
        if (jkzVar2 != null) {
            View view = getView();
            NCComponentAsyncImage nCComponentAsyncImage = view instanceof NCComponentAsyncImage ? (NCComponentAsyncImage) view : null;
            if (nCComponentAsyncImage != null) {
                super.onUpdateViewWithContext(bizVar, jkzVar, jkzVar2);
                if (!jkzVar2.equals(jkzVar)) {
                    boolean z = jkzVar instanceof zbn;
                    zbn zbnVar = (zbn) jkzVar2;
                    b(nCComponentAsyncImage, zbnVar);
                    c(nCComponentAsyncImage, zbnVar);
                }
            }
        }
    }
}
