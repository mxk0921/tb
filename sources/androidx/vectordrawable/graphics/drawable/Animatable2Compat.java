package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hx0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface Animatable2Compat extends Animatable {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class AnimationCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Animatable2.AnimationCallback mPlatformCallback;

        public Animatable2.AnimationCallback getPlatformCallback() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return hx0.a(ipChange.ipc$dispatch("1c14f33a", new Object[]{this}));
            }
            if (this.mPlatformCallback == null) {
                this.mPlatformCallback = new Animatable2.AnimationCallback() { // from class: androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback$1");
                    }

                    @Override // android.graphics.drawable.Animatable2.AnimationCallback
                    public void onAnimationEnd(Drawable drawable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("128ce461", new Object[]{this, drawable});
                        } else {
                            AnimationCallback.this.onAnimationEnd(drawable);
                        }
                    }

                    @Override // android.graphics.drawable.Animatable2.AnimationCallback
                    public void onAnimationStart(Drawable drawable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c526a228", new Object[]{this, drawable});
                        } else {
                            AnimationCallback.this.onAnimationStart(drawable);
                        }
                    }
                };
            }
            return this.mPlatformCallback;
        }

        public void onAnimationEnd(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("128ce461", new Object[]{this, drawable});
            }
        }

        public void onAnimationStart(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c526a228", new Object[]{this, drawable});
            }
        }
    }

    void clearAnimationCallbacks();

    void registerAnimationCallback(AnimationCallback animationCallback);

    boolean unregisterAnimationCallback(AnimationCallback animationCallback);
}
