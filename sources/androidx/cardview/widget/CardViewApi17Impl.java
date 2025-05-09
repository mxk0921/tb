package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.RoundRectDrawableWithShadow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CardViewApi17Impl extends CardViewBaseImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(CardViewApi17Impl cardViewApi17Impl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/cardview/widget/CardViewApi17Impl");
    }

    @Override // androidx.cardview.widget.CardViewBaseImpl, androidx.cardview.widget.CardViewImpl
    public void initStatic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fee9925", new Object[]{this});
        } else {
            RoundRectDrawableWithShadow.sRoundRectHelper = new RoundRectDrawableWithShadow.RoundRectHelper() { // from class: androidx.cardview.widget.CardViewApi17Impl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.cardview.widget.RoundRectDrawableWithShadow.RoundRectHelper
                public void drawRoundRect(Canvas canvas, RectF rectF, float f, Paint paint) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7b29e614", new Object[]{this, canvas, rectF, new Float(f), paint});
                    } else {
                        canvas.drawRoundRect(rectF, f, f, paint);
                    }
                }
            };
        }
    }
}
