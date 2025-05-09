package androidx.core.view;

import android.view.WindowInsetsAnimationController;
import androidx.core.graphics.Insets;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class WindowInsetsAnimationControllerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Impl mImpl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void finish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d82167a", new Object[]{this, new Boolean(z)});
            }
        }

        public float getCurrentAlpha() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c84538d2", new Object[]{this})).floatValue();
            }
            return 0.0f;
        }

        public float getCurrentFraction() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("814ff65c", new Object[]{this})).floatValue();
            }
            return 0.0f;
        }

        public Insets getCurrentInsets() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("a73dcac1", new Object[]{this});
            }
            return Insets.NONE;
        }

        public Insets getHiddenStateInsets() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("9b28234f", new Object[]{this});
            }
            return Insets.NONE;
        }

        public Insets getShownStateInsets() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("18a36c74", new Object[]{this});
            }
            return Insets.NONE;
        }

        public int getTypes() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1f5b69bd", new Object[]{this})).intValue();
            }
            return 0;
        }

        public boolean isCancelled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
            }
            return true;
        }

        public boolean isFinished() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public void setInsetsAndAlpha(Insets insets, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4855c8b", new Object[]{this, insets, new Float(f), new Float(f2)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl30 extends Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final WindowInsetsAnimationController mController;

        public Impl30(WindowInsetsAnimationController windowInsetsAnimationController) {
            this.mController = windowInsetsAnimationController;
        }

        public static /* synthetic */ Object ipc$super(Impl30 impl30, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/WindowInsetsAnimationControllerCompat$Impl30");
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public void finish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d82167a", new Object[]{this, new Boolean(z)});
            } else {
                this.mController.finish(z);
            }
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public float getCurrentAlpha() {
            float currentAlpha;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c84538d2", new Object[]{this})).floatValue();
            }
            currentAlpha = this.mController.getCurrentAlpha();
            return currentAlpha;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public float getCurrentFraction() {
            float currentFraction;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("814ff65c", new Object[]{this})).floatValue();
            }
            currentFraction = this.mController.getCurrentFraction();
            return currentFraction;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public Insets getCurrentInsets() {
            android.graphics.Insets currentInsets;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("a73dcac1", new Object[]{this});
            }
            currentInsets = this.mController.getCurrentInsets();
            return Insets.toCompatInsets(currentInsets);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public Insets getHiddenStateInsets() {
            android.graphics.Insets hiddenStateInsets;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("9b28234f", new Object[]{this});
            }
            hiddenStateInsets = this.mController.getHiddenStateInsets();
            return Insets.toCompatInsets(hiddenStateInsets);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public Insets getShownStateInsets() {
            android.graphics.Insets shownStateInsets;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("18a36c74", new Object[]{this});
            }
            shownStateInsets = this.mController.getShownStateInsets();
            return Insets.toCompatInsets(shownStateInsets);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public int getTypes() {
            int types;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1f5b69bd", new Object[]{this})).intValue();
            }
            types = this.mController.getTypes();
            return types;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public boolean isCancelled() {
            boolean isCancelled;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
            }
            isCancelled = this.mController.isCancelled();
            return isCancelled;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public boolean isFinished() {
            boolean isFinished;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
            }
            isFinished = this.mController.isFinished();
            return isFinished;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public void setInsetsAndAlpha(Insets insets, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4855c8b", new Object[]{this, insets, new Float(f), new Float(f2)});
            } else {
                this.mController.setInsetsAndAlpha(insets == null ? null : insets.toPlatformInsets(), f, f2);
            }
        }
    }

    public WindowInsetsAnimationControllerCompat(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.mImpl = new Impl30(windowInsetsAnimationController);
    }

    public void finish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d82167a", new Object[]{this, new Boolean(z)});
        } else {
            this.mImpl.finish(z);
        }
    }

    public float getCurrentAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c84538d2", new Object[]{this})).floatValue();
        }
        return this.mImpl.getCurrentAlpha();
    }

    public float getCurrentFraction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("814ff65c", new Object[]{this})).floatValue();
        }
        return this.mImpl.getCurrentFraction();
    }

    public Insets getCurrentInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("a73dcac1", new Object[]{this});
        }
        return this.mImpl.getCurrentInsets();
    }

    public Insets getHiddenStateInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("9b28234f", new Object[]{this});
        }
        return this.mImpl.getHiddenStateInsets();
    }

    public Insets getShownStateInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("18a36c74", new Object[]{this});
        }
        return this.mImpl.getShownStateInsets();
    }

    public int getTypes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f5b69bd", new Object[]{this})).intValue();
        }
        return this.mImpl.getTypes();
    }

    public boolean isCancelled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
        }
        return this.mImpl.isCancelled();
    }

    public boolean isFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        return this.mImpl.isFinished();
    }

    public boolean isReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52d16a4", new Object[]{this})).booleanValue();
        }
        if (isFinished() || isCancelled()) {
            return false;
        }
        return true;
    }

    public void setInsetsAndAlpha(Insets insets, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4855c8b", new Object[]{this, insets, new Float(f), new Float(f2)});
        } else {
            this.mImpl.setInsetsAndAlpha(insets, f, f2);
        }
    }
}
