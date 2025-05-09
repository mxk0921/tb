package com.alibaba.security.realidentity;

import com.alibaba.security.realidentity.ui.ALBiometricsConfig;
import com.alibaba.security.realidentity.ui.activity.TransitionMode;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RPConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ALBiometricsConfig biometricsConfig;
    public String fromSource;
    public boolean isUseWindvane;

    public RPConfig() {
        this(new Builder());
    }

    public ALBiometricsConfig getBiometricsConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ALBiometricsConfig) ipChange.ipc$dispatch("524680cd", new Object[]{this});
        }
        return this.biometricsConfig;
    }

    public String getFromSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb75c97e", new Object[]{this});
        }
        return this.fromSource;
    }

    public boolean isUseWindvane() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1037a1d2", new Object[]{this})).booleanValue();
        }
        return this.isUseWindvane;
    }

    public Builder newBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Builder) ipChange.ipc$dispatch("865fe2c7", new Object[]{this});
        }
        return new Builder(this);
    }

    public RPConfig(Builder builder) {
        ALBiometricsConfig.a aVar = new ALBiometricsConfig.a();
        aVar.a(builder.f2642a);
        aVar.d(builder.b);
        aVar.f(builder.d);
        aVar.a(builder.e);
        aVar.b(builder.c);
        aVar.a(builder.f);
        this.biometricsConfig = aVar.a();
        this.fromSource = builder.h;
        this.isUseWindvane = builder.g;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public TransitionMode f2642a;
        public boolean b;
        @Deprecated
        public boolean c;
        public boolean d;
        public String e;
        public boolean f;
        public boolean g;
        public String h;

        public Builder() {
            this.g = true;
            this.h = "native";
            this.f2642a = ALBiometricsConfig.DEFAULT_TRANSITION_MODE;
            this.b = true;
            this.d = true;
            this.f = true;
        }

        public RPConfig build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RPConfig) ipChange.ipc$dispatch("699688cb", new Object[]{this});
            }
            return new RPConfig(this);
        }

        public Builder setFromSource(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ee1b6a31", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        @Deprecated
        public Builder setNeedFailResultPage(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e080de", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public Builder setNeedSound(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("966d8573", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        @Deprecated
        public Builder setNeedWaitingForFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f328cc3", new Object[]{this, new Boolean(z)});
            }
            return this;
        }

        public Builder setShouldAlertOnExit(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2aba6c0", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public Builder setSkinInAssets(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("82bf2cc3", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public Builder setSkinPath(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("eb9d7f74", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public Builder setTransitionMode(TransitionMode transitionMode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3a426bbb", new Object[]{this, transitionMode});
            }
            this.f2642a = transitionMode;
            return this;
        }

        public Builder setUseWindVane(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1cf2184b", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public Builder(RPConfig rPConfig) {
            this.g = true;
            this.h = "native";
            ALBiometricsConfig biometricsConfig = rPConfig.getBiometricsConfig();
            this.f2642a = biometricsConfig.getTransitionMode();
            this.b = biometricsConfig.isNeedSound();
            this.c = biometricsConfig.isNeedFailResultPage();
            this.d = biometricsConfig.isShouldAlertOnExit();
            this.e = biometricsConfig.getSkinPath();
        }
    }
}
