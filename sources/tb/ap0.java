package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliImageStrategyConfigBuilderInterface;
import com.taobao.android.AliUrlImageViewInterface;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.s;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ap0 implements s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements xp0<aq0> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXImageWidgetNode.g f15910a;

        public a(ap0 ap0Var, DXImageWidgetNode.g gVar) {
            this.f15910a = gVar;
        }

        /* renamed from: b */
        public boolean a(aq0 aq0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("58f2cb53", new Object[]{this, aq0Var})).booleanValue();
            }
            DXImageWidgetNode.h hVar = new DXImageWidgetNode.h();
            hVar.f7370a = aq0Var.getDrawable();
            this.f15910a.k.a(hVar);
            return false;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.s
    public /* synthetic */ ImageView a(Context context, boolean z) {
        return jxb.a(this, context, z);
    }

    @Override // com.taobao.android.dinamicx.widget.s
    public void b(ImageView imageView, String str, DXImageWidgetNode.g gVar) {
        boolean z;
        AliImageStrategyConfigBuilderInterface aliImageStrategyConfigBuilderInterface;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("890f7f52", new Object[]{this, imageView, str, gVar});
            return;
        }
        AliUrlImageViewInterface aliUrlImageViewInterface = (AliUrlImageViewInterface) imageView;
        if (gVar.q() || gVar.t()) {
            z = true;
        } else {
            z = false;
        }
        aliUrlImageViewInterface.setSkipAutoSize(z);
        aliUrlImageViewInterface.setAutoRelease(gVar.r());
        aliUrlImageViewInterface.setPlaceHoldForeground(gVar.i);
        aliUrlImageViewInterface.setPlaceHoldImageResId(gVar.h);
        aliUrlImageViewInterface.setDarkModeOverlay(gVar.y(), (int) (gVar.j() * 255.0d));
        if (gVar.x()) {
            int[] iArr = gVar.f7369a;
            aliUrlImageViewInterface.setCornerRadius(iArr[0], iArr[1], iArr[3], iArr[2]);
            aliUrlImageViewInterface.setShape(1);
        }
        if (gVar.w()) {
            aliUrlImageViewInterface.setStrokeWidth(gVar.c);
        }
        if (gVar.v()) {
            aliUrlImageViewInterface.setStrokeColor(gVar.b);
        }
        if (TextUtils.isEmpty(gVar.e) || (i = gVar.f) <= -1) {
            aliImageStrategyConfigBuilderInterface = aliUrlImageViewInterface.newImageStrategyConfigBuilder(gVar.e);
        } else {
            aliImageStrategyConfigBuilderInterface = aliUrlImageViewInterface.newImageStrategyConfigBuilder(gVar.e, i);
        }
        if (gVar.z() && "heightLimit".equals(gVar.j)) {
            aliImageStrategyConfigBuilderInterface.a(AliImageStrategyConfigBuilderInterface.AliSizeLimitType.HEIGHT_LIMIT);
        }
        aliUrlImageViewInterface.setStrategyConfig(aliImageStrategyConfigBuilderInterface.build());
        if (gVar.k != null) {
            aliUrlImageViewInterface.succListener(new a(this, gVar));
        } else {
            aliUrlImageViewInterface.succListener(null);
        }
        d(str, aliUrlImageViewInterface, gVar);
    }

    @Override // com.taobao.android.dinamicx.widget.s
    public ImageView c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("92868382", new Object[]{this, context});
        }
        AliUrlImageViewInterface aliUrlImageViewInterface = (AliUrlImageViewInterface) zp0.c().b(context);
        aliUrlImageViewInterface.setReusableImageShape(true);
        return (ImageView) aliUrlImageViewInterface;
    }

    public final void d(String str, AliUrlImageViewInterface aliUrlImageViewInterface, DXImageWidgetNode.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2658c08b", new Object[]{this, str, aliUrlImageViewInterface, gVar});
        } else if (gVar.A()) {
            yp0 yp0Var = new yp0();
            if (gVar.l() != null) {
                for (Map.Entry<String, String> entry : gVar.l().entrySet()) {
                    yp0Var.a(entry.getKey(), entry.getValue());
                }
            }
            if (gVar.o() != null) {
                yp0Var.b(gVar.o());
            }
            aliUrlImageViewInterface.setEnableSizeInLayoutParams(gVar.s());
            aliUrlImageViewInterface.setImageUrl(str, yp0Var);
        }
    }
}
