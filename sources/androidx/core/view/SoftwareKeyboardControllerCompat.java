package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SoftwareKeyboardControllerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Impl mImpl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void hide() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            }
        }

        public void show() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl20 extends Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final View mView;

        public Impl20(View view) {
            this.mView = view;
        }

        public static /* synthetic */ Object ipc$super(Impl20 impl20, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/SoftwareKeyboardControllerCompat$Impl20");
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        public void show() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
                return;
            }
            final View view = this.mView;
            if (view != null) {
                if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                    view.requestFocus();
                } else {
                    view = view.getRootView().findFocus();
                }
                if (view == null) {
                    view = this.mView.getRootView().findViewById(16908290);
                }
                if (view != null && view.hasWindowFocus()) {
                    view.post(new Runnable() { // from class: tb.h9q
                        @Override // java.lang.Runnable
                        public final void run() {
                            SoftwareKeyboardControllerCompat.Impl20.lambda$show$0(view);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$show$0(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76b8ca65", new Object[]{view});
            } else {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
            }
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        public void hide() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
                return;
            }
            View view = this.mView;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl30 extends Impl20 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View mView;
        private WindowInsetsController mWindowInsetsController;

        public Impl30(View view) {
            super(view);
            this.mView = view;
        }

        public static /* synthetic */ Object ipc$super(Impl30 impl30, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1775111991) {
                super.hide();
                return null;
            } else if (hashCode == -340027132) {
                super.show();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/core/view/SoftwareKeyboardControllerCompat$Impl30");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$hide$0(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b2d6ec0c", new Object[]{atomicBoolean, windowInsetsController, new Integer(i)});
                return;
            }
            if ((i & 8) == 0) {
                z = false;
            }
            atomicBoolean.set(z);
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        public void show() {
            int ime;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
                return;
            }
            View view = this.mView;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.mWindowInsetsController;
            if (windowInsetsController == null) {
                View view2 = this.mView;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
            }
            super.show();
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        public void hide() {
            int ime;
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
                return;
            }
            WindowInsetsController windowInsetsController = this.mWindowInsetsController;
            if (windowInsetsController == null) {
                View view2 = this.mView;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                WindowInsetsController.OnControllableInsetsChangedListener o9qVar = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: tb.o9q
                    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                        SoftwareKeyboardControllerCompat.Impl30.lambda$hide$0(atomicBoolean, windowInsetsController2, i);
                    }
                };
                windowInsetsController.addOnControllableInsetsChangedListener(o9qVar);
                if (!atomicBoolean.get() && (view = this.mView) != null) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
                }
                windowInsetsController.removeOnControllableInsetsChangedListener(o9qVar);
                ime = WindowInsets.Type.ime();
                windowInsetsController.hide(ime);
                return;
            }
            super.hide();
        }

        public Impl30(WindowInsetsController windowInsetsController) {
            super(null);
            this.mWindowInsetsController = windowInsetsController;
        }
    }

    public SoftwareKeyboardControllerCompat(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new Impl30(view);
        } else {
            this.mImpl = new Impl20(view);
        }
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            this.mImpl.hide();
        }
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            this.mImpl.show();
        }
    }

    @Deprecated
    public SoftwareKeyboardControllerCompat(WindowInsetsController windowInsetsController) {
        this.mImpl = new Impl30(windowInsetsController);
    }
}
