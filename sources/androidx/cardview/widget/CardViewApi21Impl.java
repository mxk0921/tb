package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CardViewApi21Impl implements CardViewImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private RoundRectDrawable getCardBackground(CardViewDelegate cardViewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RoundRectDrawable) ipChange.ipc$dispatch("c9db3dd7", new Object[]{this, cardViewDelegate});
        }
        return (RoundRectDrawable) cardViewDelegate.getCardBackground();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public ColorStateList getBackgroundColor(CardViewDelegate cardViewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("426a3fea", new Object[]{this, cardViewDelegate});
        }
        return getCardBackground(cardViewDelegate).getColor();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getElevation(CardViewDelegate cardViewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b060d352", new Object[]{this, cardViewDelegate})).floatValue();
        }
        return cardViewDelegate.getCardView().getElevation();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMaxElevation(CardViewDelegate cardViewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fc5322a", new Object[]{this, cardViewDelegate})).floatValue();
        }
        return getCardBackground(cardViewDelegate).getPadding();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMinHeight(CardViewDelegate cardViewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13936416", new Object[]{this, cardViewDelegate})).floatValue();
        }
        return getRadius(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMinWidth(CardViewDelegate cardViewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4cf4148f", new Object[]{this, cardViewDelegate})).floatValue();
        }
        return getRadius(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getRadius(CardViewDelegate cardViewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef5e4951", new Object[]{this, cardViewDelegate})).floatValue();
        }
        return getCardBackground(cardViewDelegate).getRadius();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void initStatic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fee9925", new Object[]{this});
        }
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void initialize(CardViewDelegate cardViewDelegate, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3df06013", new Object[]{this, cardViewDelegate, context, colorStateList, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        cardViewDelegate.setCardBackground(new RoundRectDrawable(colorStateList, f));
        View cardView = cardViewDelegate.getCardView();
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        setMaxElevation(cardViewDelegate, f3);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void onCompatPaddingChanged(CardViewDelegate cardViewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9efb7765", new Object[]{this, cardViewDelegate});
        } else {
            setMaxElevation(cardViewDelegate, getMaxElevation(cardViewDelegate));
        }
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void onPreventCornerOverlapChanged(CardViewDelegate cardViewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361435ce", new Object[]{this, cardViewDelegate});
        } else {
            setMaxElevation(cardViewDelegate, getMaxElevation(cardViewDelegate));
        }
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setBackgroundColor(CardViewDelegate cardViewDelegate, ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("595f46f4", new Object[]{this, cardViewDelegate, colorStateList});
        } else {
            getCardBackground(cardViewDelegate).setColor(colorStateList);
        }
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setElevation(CardViewDelegate cardViewDelegate, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3e78912", new Object[]{this, cardViewDelegate, new Float(f)});
        } else {
            cardViewDelegate.getCardView().setElevation(f);
        }
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setMaxElevation(CardViewDelegate cardViewDelegate, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("139bafd2", new Object[]{this, cardViewDelegate, new Float(f)});
            return;
        }
        getCardBackground(cardViewDelegate).setPadding(f, cardViewDelegate.getUseCompatPadding(), cardViewDelegate.getPreventCornerOverlap());
        updatePadding(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setRadius(CardViewDelegate cardViewDelegate, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf5bb68b", new Object[]{this, cardViewDelegate, new Float(f)});
        } else {
            getCardBackground(cardViewDelegate).setRadius(f);
        }
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void updatePadding(CardViewDelegate cardViewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f411e1", new Object[]{this, cardViewDelegate});
        } else if (!cardViewDelegate.getUseCompatPadding()) {
            cardViewDelegate.setShadowPadding(0, 0, 0, 0);
        } else {
            float maxElevation = getMaxElevation(cardViewDelegate);
            float radius = getRadius(cardViewDelegate);
            int ceil = (int) Math.ceil(RoundRectDrawableWithShadow.calculateHorizontalPadding(maxElevation, radius, cardViewDelegate.getPreventCornerOverlap()));
            int ceil2 = (int) Math.ceil(RoundRectDrawableWithShadow.calculateVerticalPadding(maxElevation, radius, cardViewDelegate.getPreventCornerOverlap()));
            cardViewDelegate.setShadowPadding(ceil, ceil2, ceil, ceil2);
        }
    }
}
