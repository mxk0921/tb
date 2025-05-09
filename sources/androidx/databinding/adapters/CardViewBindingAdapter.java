package androidx.databinding.adapters;

import androidx.cardview.widget.CardView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CardViewBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void setContentPadding(CardView cardView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335a316f", new Object[]{cardView, new Integer(i)});
        } else {
            cardView.setContentPadding(i, i, i, i);
        }
    }

    public static void setContentPaddingBottom(CardView cardView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b8e253a", new Object[]{cardView, new Integer(i)});
        } else {
            cardView.setContentPadding(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), i);
        }
    }

    public static void setContentPaddingLeft(CardView cardView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fa11596", new Object[]{cardView, new Integer(i)});
        } else {
            cardView.setContentPadding(i, cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
        }
    }

    public static void setContentPaddingRight(CardView cardView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d402ef7", new Object[]{cardView, new Integer(i)});
        } else {
            cardView.setContentPadding(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), i, cardView.getContentPaddingBottom());
        }
    }

    public static void setContentPaddingTop(CardView cardView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eafdfab0", new Object[]{cardView, new Integer(i)});
        } else {
            cardView.setContentPadding(cardView.getContentPaddingLeft(), i, cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
        }
    }
}
