package androidx.databinding.adapters;

import android.widget.RatingBar;
import androidx.databinding.InverseBindingListener;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RatingBarBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void setListeners(RatingBar ratingBar, final RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, final InverseBindingListener inverseBindingListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22be0c9", new Object[]{ratingBar, onRatingBarChangeListener, inverseBindingListener});
        } else if (inverseBindingListener == null) {
            ratingBar.setOnRatingBarChangeListener(onRatingBarChangeListener);
        } else {
            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: androidx.databinding.adapters.RatingBarBindingAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.RatingBar.OnRatingBarChangeListener
                public void onRatingChanged(RatingBar ratingBar2, float f, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ec34e37", new Object[]{this, ratingBar2, new Float(f), new Boolean(z)});
                        return;
                    }
                    RatingBar.OnRatingBarChangeListener onRatingBarChangeListener2 = onRatingBarChangeListener;
                    if (onRatingBarChangeListener2 != null) {
                        onRatingBarChangeListener2.onRatingChanged(ratingBar2, f, z);
                    }
                    inverseBindingListener.onChange();
                }
            });
        }
    }

    public static void setRating(RatingBar ratingBar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce107976", new Object[]{ratingBar, new Float(f)});
        } else if (ratingBar.getRating() != f) {
            ratingBar.setRating(f);
        }
    }
}
