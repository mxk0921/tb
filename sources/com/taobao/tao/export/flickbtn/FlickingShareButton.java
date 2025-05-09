package com.taobao.tao.export.flickbtn;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.p1m;
import tb.s0m;
import tb.s8d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FlickingShareButton extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ValueAnimator flickAnim;
    private TUrlImageView ivCustom;
    private p1m loadImgTask;
    private TIconFontTextView tvNormal;
    public final DXFlickingSharePresenter presenter = new DXFlickingSharePresenter(this);
    private boolean flickAnimEnable = true;
    public boolean dxMode = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FlickingShareButton.this.presenter.d();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() == null) {
                return false;
            }
            FlickingShareButton.access$000(FlickingShareButton.this).setImageDrawable(succPhenixEvent.getDrawable());
            FlickingShareButton.access$100(FlickingShareButton.this);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FlickingShareButton flickingShareButton = FlickingShareButton.this;
            FlickingShareButton.access$200(flickingShareButton, FlickingShareButton.access$000(flickingShareButton));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FlickingShareButton.access$300(FlickingShareButton.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            FlickingShareButton.access$000(FlickingShareButton.this).setScaleX(floatValue);
            FlickingShareButton.access$000(FlickingShareButton.this).setScaleY(floatValue);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            FlickingShareButton.access$000(FlickingShareButton.this).setScaleX(floatValue);
            FlickingShareButton.access$000(FlickingShareButton.this).setScaleY(floatValue);
        }
    }

    static {
        t2o.a(666894398);
    }

    public FlickingShareButton(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ TUrlImageView access$000(FlickingShareButton flickingShareButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("6c3aa98d", new Object[]{flickingShareButton});
        }
        return flickingShareButton.ivCustom;
    }

    public static /* synthetic */ void access$100(FlickingShareButton flickingShareButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeaf32d0", new Object[]{flickingShareButton});
        } else {
            flickingShareButton.performAnimation();
        }
    }

    public static /* synthetic */ void access$200(FlickingShareButton flickingShareButton, TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00f63f7", new Object[]{flickingShareButton, tUrlImageView});
        } else {
            flickingShareButton.performAppearAnimation(tUrlImageView);
        }
    }

    public static /* synthetic */ void access$300(FlickingShareButton flickingShareButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101acc52", new Object[]{flickingShareButton});
        } else {
            flickingShareButton.performFlickingAnimation();
        }
    }

    private void generateFlickAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ef6bce", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.flickAnim;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.flickAnim.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.8f).setDuration(750L);
        this.flickAnim = duration;
        duration.setRepeatCount(-1);
        this.flickAnim.setRepeatMode(2);
        this.flickAnim.addUpdateListener(new e());
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.alishare_share_entrance, this);
        this.tvNormal = (TIconFontTextView) inflate.findViewById(R.id.tvNormal);
        this.ivCustom = (TUrlImageView) inflate.findViewById(R.id.ivCustom);
    }

    public static /* synthetic */ Object ipc$super(FlickingShareButton flickingShareButton, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else if (hashCode == 1774009266) {
            return new Boolean(super.performClick());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/export/flickbtn/FlickingShareButton");
        }
    }

    private void performAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdad4c2a", new Object[]{this});
            return;
        }
        generateFlickAnim();
        this.tvNormal.animate().scaleX(0.0f).scaleY(0.0f).setDuration(500L).withEndAction(new c()).start();
    }

    private void performAppearAnimation(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25b9fbb", new Object[]{this, tUrlImageView});
        } else {
            tUrlImageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(500L).withEndAction(new d()).start();
        }
    }

    private void performFlickingAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6844a73", new Object[]{this});
        } else if (this.flickAnim != null && ViewCompat.isAttachedToWindow(this)) {
            this.flickAnim.start();
        }
    }

    public void considerPostRequestData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6357a7", new Object[]{this});
        } else if (this.presenter.e()) {
            postDelayed(new a(), 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (!this.dxMode) {
            this.presenter.d();
        }
        ValueAnimator valueAnimator = this.flickAnim;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.flickAnim.addUpdateListener(new f());
            this.flickAnim.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.tvNormal.animate().cancel();
        this.ivCustom.animate().cancel();
        p1m p1mVar = this.loadImgTask;
        if (p1mVar != null) {
            p1mVar.a();
        }
        if (this.ivCustom.getDrawable() != null) {
            this.tvNormal.setScaleX(0.0f);
            this.tvNormal.setScaleY(0.0f);
            this.ivCustom.setScaleX(1.0f);
            this.ivCustom.setScaleY(1.0f);
        }
        ValueAnimator valueAnimator = this.flickAnim;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.flickAnim.cancel();
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69bd3bb2", new Object[]{this})).booleanValue();
        }
        this.presenter.c();
        this.presenter.g();
        return super.performClick();
    }

    public void setCustomImageAndPlayAnim(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af97a25", new Object[]{this, str});
        } else if (this.flickAnimEnable) {
            this.loadImgTask = s0m.B().T(str).succListener(new b()).fetch();
        }
    }

    public void setFlickAnimEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c7d4b0", new Object[]{this, new Boolean(z)});
        } else {
            this.flickAnimEnable = z;
        }
    }

    public void setIconColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8584034", new Object[]{this, new Integer(i)});
        } else {
            this.tvNormal.setTextColor(i);
        }
    }

    public void setIconFont(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("836545fb", new Object[]{this, str});
        } else {
            this.tvNormal.setText(str);
        }
    }

    public void setIconSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c57c4c3", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        float min = Math.min(i, i2);
        if (min <= 0.0f) {
            min = getContext().getResources().getDisplayMetrics().widthPixels * 0.048f;
        }
        this.tvNormal.setTextSize(0, min);
    }

    public FlickingShareButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public FlickingShareButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
