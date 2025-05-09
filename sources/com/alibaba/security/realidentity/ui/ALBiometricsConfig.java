package com.alibaba.security.realidentity.ui;

import com.alibaba.security.realidentity.ui.activity.TransitionMode;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ALBiometricsConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final transient boolean DEFAULT_NEED_SOUND = true;
    public static final transient TransitionMode DEFAULT_TRANSITION_MODE = TransitionMode.NULL;
    public boolean isNeedFailResultPage;
    public final boolean isNeedSound;
    public final boolean isShouldAlertOnExit;
    public boolean mIsSkinInAssets;
    public final String skinPath;
    public final TransitionMode transitionMode;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public TransitionMode f2830a;
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public String f;
        public boolean g;

        public a() {
            this.f2830a = ALBiometricsConfig.DEFAULT_TRANSITION_MODE;
            this.b = true;
            this.d = true;
        }

        public a a(TransitionMode transitionMode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c4e2448b", new Object[]{this, transitionMode});
            }
            this.f2830a = transitionMode;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7efe67a1", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        @Deprecated
        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fd5f6b80", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7bc06f5f", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fa21733e", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7882771d", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("43b83908", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9d63c2", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public ALBiometricsConfig a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ALBiometricsConfig) ipChange.ipc$dispatch("e07c1edb", new Object[]{this}) : new ALBiometricsConfig(this);
        }

        public a(ALBiometricsConfig aLBiometricsConfig) {
            this.f2830a = aLBiometricsConfig.transitionMode;
            this.b = aLBiometricsConfig.isNeedSound;
            this.d = aLBiometricsConfig.isShouldAlertOnExit;
        }
    }

    public ALBiometricsConfig() {
        this(new a());
    }

    public String getSkinPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b2cdd41", new Object[]{this});
        }
        return this.skinPath;
    }

    public TransitionMode getTransitionMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransitionMode) ipChange.ipc$dispatch("8c2572e", new Object[]{this});
        }
        return this.transitionMode;
    }

    public boolean isNeedFailResultPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86204695", new Object[]{this})).booleanValue();
        }
        return this.isNeedFailResultPage;
    }

    public boolean isNeedSound() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ce4651a", new Object[]{this})).booleanValue();
        }
        return this.isNeedSound;
    }

    public boolean isShouldAlertOnExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9fb2ae7", new Object[]{this})).booleanValue();
        }
        return this.isShouldAlertOnExit;
    }

    public boolean isSkinInAssets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d012a0fa", new Object[]{this})).booleanValue();
        }
        return this.mIsSkinInAssets;
    }

    public a newBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c9e199b8", new Object[]{this});
        }
        return new a(this);
    }

    public ALBiometricsConfig(a aVar) {
        this.isNeedFailResultPage = true;
        this.transitionMode = aVar.f2830a;
        this.isNeedSound = aVar.b;
        this.isShouldAlertOnExit = aVar.d;
        this.skinPath = aVar.f;
        this.mIsSkinInAssets = aVar.g;
        this.isNeedFailResultPage = aVar.e;
    }
}
