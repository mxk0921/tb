package tb;

import android.content.Context;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliImageStrategyConfigBuilderInterface;
import com.taobao.android.AliUrlImageViewInterface;
import com.taobao.android.dinamic.constructor.DImageViewConstructor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cq0 implements DImageViewConstructor.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ImageView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("92868382", new Object[]{this, context});
        }
        return (ImageView) zp0.c().b(context);
    }

    public void b(ImageView imageView, String str, DImageViewConstructor.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("946da6d1", new Object[]{this, imageView, str, bVar});
            return;
        }
        AliUrlImageViewInterface aliUrlImageViewInterface = (AliUrlImageViewInterface) imageView;
        if (bVar.l()) {
            aliUrlImageViewInterface.setImageUrl(str);
        }
        if (bVar.i()) {
            float e = owo.e(imageView.getContext(), bVar.f7258a, 0);
            aliUrlImageViewInterface.setCornerRadius(e, e, e, e);
            aliUrlImageViewInterface.setShape(1);
        }
        if (bVar.h()) {
            aliUrlImageViewInterface.setStrokeWidth(owo.e(imageView.getContext(), bVar.c, 0));
        }
        if (bVar.g()) {
            aliUrlImageViewInterface.setStrokeColor(y45.d(bVar.b, 0));
        }
        if (bVar.j() && "heightLimit".equals(bVar.e)) {
            AliImageStrategyConfigBuilderInterface newImageStrategyConfigBuilder = aliUrlImageViewInterface.newImageStrategyConfigBuilder(bVar.d);
            newImageStrategyConfigBuilder.a(AliImageStrategyConfigBuilderInterface.AliSizeLimitType.HEIGHT_LIMIT);
            aliUrlImageViewInterface.setStrategyConfig(newImageStrategyConfigBuilder.build());
        }
        if (bVar.k()) {
            aliUrlImageViewInterface.setOrientation(bVar.g);
            aliUrlImageViewInterface.setRatio(bVar.f);
        }
    }
}
