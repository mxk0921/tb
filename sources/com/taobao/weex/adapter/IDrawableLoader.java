package com.taobao.weex.adapter;

import android.graphics.drawable.Drawable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IDrawableLoader {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface AnimatedTarget extends DrawableTarget {
        void setAnimatedDrawable(Drawable drawable);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface DrawableTarget {
        void setDrawable(Drawable drawable, boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface StaticTarget extends DrawableTarget {
        @Override // com.taobao.weex.adapter.IDrawableLoader.DrawableTarget
        void setDrawable(Drawable drawable, boolean z);
    }

    void setDrawable(String str, DrawableTarget drawableTarget, DrawableStrategy drawableStrategy);
}
