package androidx.core.view;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ohx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class WindowInsetsControllerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BEHAVIOR_DEFAULT = 1;
    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_SWIPE = 1;
    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_TOUCH = 0;
    public static final int BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE = 2;
    private final Impl mImpl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void addOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c32413e7", new Object[]{this, onControllableInsetsChangedListener});
            }
        }

        public void controlWindowInsetsAnimation(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("464712dd", new Object[]{this, new Integer(i), new Long(j), interpolator, cancellationSignal, windowInsetsAnimationControlListenerCompat});
            }
        }

        public int getSystemBarsBehavior() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5c1ee7f1", new Object[]{this})).intValue();
            }
            return 0;
        }

        public void hide(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("300c9b5a", new Object[]{this, new Integer(i)});
            }
        }

        public boolean isAppearanceLightNavigationBars() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6e8b0827", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public void removeOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6ddcd4a", new Object[]{this, onControllableInsetsChangedListener});
            }
        }

        public void setAppearanceLightNavigationBars(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd169049", new Object[]{this, new Boolean(z)});
            }
        }

        public void setAppearanceLightStatusBars(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1cd4cc2b", new Object[]{this, new Boolean(z)});
            }
        }

        public void setSystemBarsBehavior(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dee7039", new Object[]{this, new Integer(i)});
            }
        }

        public void show(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb7fa7f", new Object[]{this, new Integer(i)});
            }
        }

        public boolean isAppearanceLightStatusBars() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d71a405", new Object[]{this})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl26 extends Impl23 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public Impl26(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }

        public static /* synthetic */ Object ipc$super(Impl26 impl26, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/WindowInsetsControllerCompat$Impl26");
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6e8b0827", new Object[]{this})).booleanValue();
            }
            if ((this.mWindow.getDecorView().getSystemUiVisibility() & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd169049", new Object[]{this, new Boolean(z)});
            } else if (z) {
                unsetWindowFlag(134217728);
                setWindowFlag(Integer.MIN_VALUE);
                setSystemUiFlag(16);
            } else {
                unsetSystemUiFlag(16);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl30 extends Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final WindowInsetsControllerCompat mCompatController;
        public final WindowInsetsController mInsetsController;
        private final SimpleArrayMap<OnControllableInsetsChangedListener, WindowInsetsController.OnControllableInsetsChangedListener> mListeners;
        public final SoftwareKeyboardControllerCompat mSoftwareKeyboardControllerCompat;
        public Window mWindow;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Impl30(android.view.Window r2, androidx.core.view.WindowInsetsControllerCompat r3, androidx.core.view.SoftwareKeyboardControllerCompat r4) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = tb.lhx.a(r2)
                r1.<init>(r0, r3, r4)
                r1.mWindow = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.WindowInsetsControllerCompat.Impl30.<init>(android.view.Window, androidx.core.view.WindowInsetsControllerCompat, androidx.core.view.SoftwareKeyboardControllerCompat):void");
        }

        public static /* synthetic */ Object ipc$super(Impl30 impl30, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/WindowInsetsControllerCompat$Impl30");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addOnControllableInsetsChangedListener$0(OnControllableInsetsChangedListener onControllableInsetsChangedListener, WindowInsetsController windowInsetsController, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cf74f4c", new Object[]{this, onControllableInsetsChangedListener, windowInsetsController, new Integer(i)});
            } else if (this.mInsetsController == windowInsetsController) {
                onControllableInsetsChangedListener.onControllableInsetsChanged(this.mCompatController, i);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void addOnControllableInsetsChangedListener(final OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c32413e7", new Object[]{this, onControllableInsetsChangedListener});
            } else if (!this.mListeners.containsKey(onControllableInsetsChangedListener)) {
                WindowInsetsController.OnControllableInsetsChangedListener qhxVar = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: tb.qhx
                    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
                        WindowInsetsControllerCompat.Impl30.this.lambda$addOnControllableInsetsChangedListener$0(onControllableInsetsChangedListener, windowInsetsController, i);
                    }
                };
                this.mListeners.put(onControllableInsetsChangedListener, qhxVar);
                this.mInsetsController.addOnControllableInsetsChangedListener(qhxVar);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void controlWindowInsetsAnimation(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, final WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("464712dd", new Object[]{this, new Integer(i), new Long(j), interpolator, cancellationSignal, windowInsetsAnimationControlListenerCompat});
            } else {
                this.mInsetsController.controlWindowInsetsAnimation(i, j, interpolator, cancellationSignal, new WindowInsetsAnimationControlListener() { // from class: androidx.core.view.WindowInsetsControllerCompat.Impl30.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    private WindowInsetsAnimationControllerCompat mCompatAnimController = null;

                    @Override // android.view.WindowInsetsAnimationControlListener
                    public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                        WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("58f79cf8", new Object[]{this, windowInsetsAnimationController});
                            return;
                        }
                        WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat2 = windowInsetsAnimationControlListenerCompat;
                        if (windowInsetsAnimationController == null) {
                            windowInsetsAnimationControllerCompat = null;
                        } else {
                            windowInsetsAnimationControllerCompat = this.mCompatAnimController;
                        }
                        windowInsetsAnimationControlListenerCompat2.onCancelled(windowInsetsAnimationControllerCompat);
                    }

                    @Override // android.view.WindowInsetsAnimationControlListener
                    public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f01b2c77", new Object[]{this, windowInsetsAnimationController});
                        } else {
                            windowInsetsAnimationControlListenerCompat.onFinished(this.mCompatAnimController);
                        }
                    }

                    @Override // android.view.WindowInsetsAnimationControlListener
                    public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("80cccef9", new Object[]{this, windowInsetsAnimationController, new Integer(i2)});
                            return;
                        }
                        WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat = new WindowInsetsAnimationControllerCompat(windowInsetsAnimationController);
                        this.mCompatAnimController = windowInsetsAnimationControllerCompat;
                        windowInsetsAnimationControlListenerCompat.onReady(windowInsetsAnimationControllerCompat, i2);
                    }
                });
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public int getSystemBarsBehavior() {
            int systemBarsBehavior;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5c1ee7f1", new Object[]{this})).intValue();
            }
            systemBarsBehavior = this.mInsetsController.getSystemBarsBehavior();
            return systemBarsBehavior;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void hide(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("300c9b5a", new Object[]{this, new Integer(i)});
                return;
            }
            if ((i & 8) != 0) {
                this.mSoftwareKeyboardControllerCompat.hide();
            }
            this.mInsetsController.hide(i & (-9));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
            int systemBarsAppearance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6e8b0827", new Object[]{this})).booleanValue();
            }
            this.mInsetsController.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.mInsetsController.getSystemBarsAppearance();
            if ((systemBarsAppearance & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void removeOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6ddcd4a", new Object[]{this, onControllableInsetsChangedListener});
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener a2 = ohx.a(this.mListeners.remove(onControllableInsetsChangedListener));
            if (a2 != null) {
                this.mInsetsController.removeOnControllableInsetsChangedListener(a2);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1cd4cc2b", new Object[]{this, new Boolean(z)});
            } else if (z) {
                if (this.mWindow != null) {
                    setSystemUiFlag(8192);
                }
                this.mInsetsController.setSystemBarsAppearance(8, 8);
            } else {
                if (this.mWindow != null) {
                    unsetSystemUiFlag(8192);
                }
                this.mInsetsController.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setSystemBarsBehavior(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dee7039", new Object[]{this, new Integer(i)});
            } else {
                this.mInsetsController.setSystemBarsBehavior(i);
            }
        }

        public void setSystemUiFlag(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dccf614b", new Object[]{this, new Integer(i)});
                return;
            }
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void show(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb7fa7f", new Object[]{this, new Integer(i)});
                return;
            }
            if ((i & 8) != 0) {
                this.mSoftwareKeyboardControllerCompat.show();
            }
            this.mInsetsController.show(i & (-9));
        }

        public void unsetSystemUiFlag(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c1a72964", new Object[]{this, new Integer(i)});
                return;
            }
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd169049", new Object[]{this, new Boolean(z)});
            } else if (z) {
                if (this.mWindow != null) {
                    setSystemUiFlag(16);
                }
                this.mInsetsController.setSystemBarsAppearance(16, 16);
            } else {
                if (this.mWindow != null) {
                    unsetSystemUiFlag(16);
                }
                this.mInsetsController.setSystemBarsAppearance(0, 16);
            }
        }

        public Impl30(WindowInsetsController windowInsetsController, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.mListeners = new SimpleArrayMap<>();
            this.mInsetsController = windowInsetsController;
            this.mCompatController = windowInsetsControllerCompat;
            this.mSoftwareKeyboardControllerCompat = softwareKeyboardControllerCompat;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
            int systemBarsAppearance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d71a405", new Object[]{this})).booleanValue();
            }
            this.mInsetsController.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.mInsetsController.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnControllableInsetsChangedListener {
        void onControllableInsetsChanged(WindowInsetsControllerCompat windowInsetsControllerCompat, int i);
    }

    @Deprecated
    private WindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        this.mImpl = new Impl30(windowInsetsController, this, new SoftwareKeyboardControllerCompat(windowInsetsController));
    }

    @Deprecated
    public static WindowInsetsControllerCompat toWindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsetsControllerCompat) ipChange.ipc$dispatch("4368261c", new Object[]{windowInsetsController});
        }
        return new WindowInsetsControllerCompat(windowInsetsController);
    }

    public void addOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c32413e7", new Object[]{this, onControllableInsetsChangedListener});
        } else {
            this.mImpl.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        }
    }

    public void controlWindowInsetsAnimation(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("464712dd", new Object[]{this, new Integer(i), new Long(j), interpolator, cancellationSignal, windowInsetsAnimationControlListenerCompat});
        } else {
            this.mImpl.controlWindowInsetsAnimation(i, j, interpolator, cancellationSignal, windowInsetsAnimationControlListenerCompat);
        }
    }

    public int getSystemBarsBehavior() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1ee7f1", new Object[]{this})).intValue();
        }
        return this.mImpl.getSystemBarsBehavior();
    }

    public void hide(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300c9b5a", new Object[]{this, new Integer(i)});
        } else {
            this.mImpl.hide(i);
        }
    }

    public boolean isAppearanceLightNavigationBars() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e8b0827", new Object[]{this})).booleanValue();
        }
        return this.mImpl.isAppearanceLightNavigationBars();
    }

    public boolean isAppearanceLightStatusBars() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d71a405", new Object[]{this})).booleanValue();
        }
        return this.mImpl.isAppearanceLightStatusBars();
    }

    public void removeOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6ddcd4a", new Object[]{this, onControllableInsetsChangedListener});
        } else {
            this.mImpl.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        }
    }

    public void setAppearanceLightNavigationBars(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd169049", new Object[]{this, new Boolean(z)});
        } else {
            this.mImpl.setAppearanceLightNavigationBars(z);
        }
    }

    public void setAppearanceLightStatusBars(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd4cc2b", new Object[]{this, new Boolean(z)});
        } else {
            this.mImpl.setAppearanceLightStatusBars(z);
        }
    }

    public void setSystemBarsBehavior(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dee7039", new Object[]{this, new Integer(i)});
        } else {
            this.mImpl.setSystemBarsBehavior(i);
        }
    }

    public void show(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb7fa7f", new Object[]{this, new Integer(i)});
        } else {
            this.mImpl.show(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl20 extends Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final SoftwareKeyboardControllerCompat mSoftwareKeyboardControllerCompat;
        public final Window mWindow;

        public Impl20(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.mWindow = window;
            this.mSoftwareKeyboardControllerCompat = softwareKeyboardControllerCompat;
        }

        public static /* synthetic */ Object ipc$super(Impl20 impl20, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/WindowInsetsControllerCompat$Impl20");
        }

        private void showForType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9bee536", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                unsetSystemUiFlag(4);
                unsetWindowFlag(1024);
            } else if (i == 2) {
                unsetSystemUiFlag(2);
            } else if (i == 8) {
                this.mSoftwareKeyboardControllerCompat.show();
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void addOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c32413e7", new Object[]{this, onControllableInsetsChangedListener});
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void controlWindowInsetsAnimation(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("464712dd", new Object[]{this, new Integer(i), new Long(j), interpolator, cancellationSignal, windowInsetsAnimationControlListenerCompat});
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public int getSystemBarsBehavior() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5c1ee7f1", new Object[]{this})).intValue();
            }
            return 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void hide(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("300c9b5a", new Object[]{this, new Integer(i)});
                return;
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    hideForType(i2);
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void removeOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6ddcd4a", new Object[]{this, onControllableInsetsChangedListener});
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setSystemBarsBehavior(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dee7039", new Object[]{this, new Integer(i)});
            } else if (i == 0) {
                unsetSystemUiFlag(6144);
            } else if (i == 1) {
                unsetSystemUiFlag(4096);
                setSystemUiFlag(2048);
            } else if (i == 2) {
                unsetSystemUiFlag(2048);
                setSystemUiFlag(4096);
            }
        }

        public void setSystemUiFlag(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dccf614b", new Object[]{this, new Integer(i)});
                return;
            }
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public void setWindowFlag(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a7d609e", new Object[]{this, new Integer(i)});
            } else {
                this.mWindow.addFlags(i);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void show(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb7fa7f", new Object[]{this, new Integer(i)});
                return;
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    showForType(i2);
                }
            }
        }

        public void unsetSystemUiFlag(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c1a72964", new Object[]{this, new Integer(i)});
                return;
            }
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public void unsetWindowFlag(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76aa5af7", new Object[]{this, new Integer(i)});
            } else {
                this.mWindow.clearFlags(i);
            }
        }

        private void hideForType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d897a7fb", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                setSystemUiFlag(4);
            } else if (i == 2) {
                setSystemUiFlag(2);
            } else if (i == 8) {
                this.mSoftwareKeyboardControllerCompat.hide();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl23 extends Impl20 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public Impl23(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }

        public static /* synthetic */ Object ipc$super(Impl23 impl23, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/WindowInsetsControllerCompat$Impl23");
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1cd4cc2b", new Object[]{this, new Boolean(z)});
            } else if (z) {
                unsetWindowFlag(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                setWindowFlag(Integer.MIN_VALUE);
                setSystemUiFlag(8192);
            } else {
                unsetSystemUiFlag(8192);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d71a405", new Object[]{this})).booleanValue();
            }
            return (this.mWindow.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }
    }

    public WindowInsetsControllerCompat(Window window, View view) {
        SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.mImpl = new Impl30(window, this, softwareKeyboardControllerCompat);
        } else if (i >= 26) {
            this.mImpl = new Impl26(window, softwareKeyboardControllerCompat);
        } else if (i >= 23) {
            this.mImpl = new Impl23(window, softwareKeyboardControllerCompat);
        } else {
            this.mImpl = new Impl20(window, softwareKeyboardControllerCompat);
        }
    }
}
