package com.google.android.material.transition.platform;

import android.graphics.drawable.Drawable;
import android.transition.Transition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MaterialContainerTransform extends Transition {
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface FadeMode {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface FitMode {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface TransitionDirection {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a {
        public a(float f, float f2) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {
        public /* synthetic */ b(a aVar, a aVar2, a aVar3, a aVar4, com.google.android.material.transition.platform.a aVar5) {
            this(aVar, aVar2, aVar3, aVar4);
        }

        public b(a aVar, a aVar2, a aVar3, a aVar4) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c extends Drawable {
        public final void b(float f) {
            throw null;
        }
    }

    static {
        new b(new a(0.0f, 0.25f), new a(0.0f, 1.0f), new a(0.0f, 1.0f), new a(0.0f, 0.75f), null);
        new b(new a(0.6f, 0.9f), new a(0.0f, 1.0f), new a(0.0f, 0.9f), new a(0.3f, 0.9f), null);
        new b(new a(0.1f, 0.4f), new a(0.1f, 1.0f), new a(0.1f, 1.0f), new a(0.1f, 0.9f), null);
        new b(new a(0.6f, 0.9f), new a(0.0f, 0.9f), new a(0.0f, 0.9f), new a(0.2f, 0.9f), null);
    }
}
