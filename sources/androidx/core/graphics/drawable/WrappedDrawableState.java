package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class WrappedDrawableState extends Drawable.ConstantState {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int mChangingConfigurations;
    public Drawable.ConstantState mDrawableState;
    public ColorStateList mTint;
    public PorterDuff.Mode mTintMode;

    public WrappedDrawableState(WrappedDrawableState wrappedDrawableState) {
        this.mTint = null;
        this.mTintMode = WrappedDrawableApi14.DEFAULT_TINT_MODE;
        if (wrappedDrawableState != null) {
            this.mChangingConfigurations = wrappedDrawableState.mChangingConfigurations;
            this.mDrawableState = wrappedDrawableState.mDrawableState;
            this.mTint = wrappedDrawableState.mTint;
            this.mTintMode = wrappedDrawableState.mTintMode;
        }
    }

    public static /* synthetic */ Object ipc$super(WrappedDrawableState wrappedDrawableState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/graphics/drawable/WrappedDrawableState");
    }

    public boolean canConstantState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99b80768", new Object[]{this})).booleanValue();
        }
        if (this.mDrawableState != null) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("582cb37a", new Object[]{this})).intValue();
        }
        int i2 = this.mChangingConfigurations;
        Drawable.ConstantState constantState = this.mDrawableState;
        if (constantState != null) {
            i = constantState.getChangingConfigurations();
        }
        return i | i2;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("4eaa3b5", new Object[]{this}) : newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("9e337f5e", new Object[]{this, resources}) : new WrappedDrawableApi21(this, resources);
    }
}
