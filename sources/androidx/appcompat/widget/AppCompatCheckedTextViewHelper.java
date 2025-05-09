package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CheckedTextViewCompat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppCompatCheckedTextViewHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ColorStateList mCheckMarkTintList = null;
    private PorterDuff.Mode mCheckMarkTintMode = null;
    private boolean mHasCheckMarkTint = false;
    private boolean mHasCheckMarkTintMode = false;
    private boolean mSkipNextApply;
    private final CheckedTextView mView;

    public AppCompatCheckedTextViewHelper(CheckedTextView checkedTextView) {
        this.mView = checkedTextView;
    }

    public void applyCheckMarkTint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ee6349", new Object[]{this});
            return;
        }
        Drawable checkMarkDrawable = CheckedTextViewCompat.getCheckMarkDrawable(this.mView);
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.mHasCheckMarkTint || this.mHasCheckMarkTintMode) {
            Drawable mutate = DrawableCompat.wrap(checkMarkDrawable).mutate();
            if (this.mHasCheckMarkTint) {
                DrawableCompat.setTintList(mutate, this.mCheckMarkTintList);
            }
            if (this.mHasCheckMarkTintMode) {
                DrawableCompat.setTintMode(mutate, this.mCheckMarkTintMode);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.mView.getDrawableState());
            }
            this.mView.setCheckMarkDrawable(mutate);
        }
    }

    public ColorStateList getSupportCheckMarkTintList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("a5dac158", new Object[]{this});
        }
        return this.mCheckMarkTintList;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PorterDuff.Mode) ipChange.ipc$dispatch("c017b840", new Object[]{this});
        }
        return this.mCheckMarkTintMode;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:7:0x0039, B:9:0x0041, B:11:0x0047, B:13:0x0057, B:15:0x005f, B:17:0x0065, B:18:0x0072, B:20:0x007a, B:21:0x0083, B:23:0x008b), top: B:31:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:7:0x0039, B:9:0x0041, B:11:0x0047, B:13:0x0057, B:15:0x005f, B:17:0x0065, B:18:0x0072, B:20:0x007a, B:21:0x0083, B:23:0x008b), top: B:31:0x0039 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void loadFromAttributes(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = androidx.appcompat.widget.AppCompatCheckedTextViewHelper.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001d
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r11)
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r0] = r9
            r0 = 1
            r11[r0] = r10
            r10 = 2
            r11[r10] = r2
            java.lang.String r10 = "7423e3e3"
            r1.ipc$dispatch(r10, r11)
            return
        L_0x001d:
            android.widget.CheckedTextView r1 = r9.mView
            android.content.Context r1 = r1.getContext()
            int[] r4 = com.taobao.taobao.R.styleable.CheckedTextView
            androidx.appcompat.widget.TintTypedArray r1 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r1, r10, r4, r11, r0)
            android.widget.CheckedTextView r2 = r9.mView
            android.content.Context r3 = r2.getContext()
            android.content.res.TypedArray r6 = r1.getWrappedTypeArray()
            r8 = 0
            r5 = r10
            r7 = r11
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r2, r3, r4, r5, r6, r7, r8)
            int r10 = com.taobao.taobao.R.styleable.CheckedTextView_checkMarkCompat     // Catch: all -> 0x0055
            boolean r11 = r1.hasValue(r10)     // Catch: all -> 0x0055
            if (r11 == 0) goto L_0x0057
            int r10 = r1.getResourceId(r10, r0)     // Catch: all -> 0x0055
            if (r10 == 0) goto L_0x0057
            android.widget.CheckedTextView r11 = r9.mView     // Catch: all -> 0x0055, NotFoundException -> 0x0057
            android.content.Context r2 = r11.getContext()     // Catch: all -> 0x0055, NotFoundException -> 0x0057
            android.graphics.drawable.Drawable r10 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r2, r10)     // Catch: all -> 0x0055, NotFoundException -> 0x0057
            r11.setCheckMarkDrawable(r10)     // Catch: all -> 0x0055, NotFoundException -> 0x0057
            goto L_0x0072
        L_0x0055:
            r10 = move-exception
            goto L_0x009e
        L_0x0057:
            int r10 = com.taobao.taobao.R.styleable.CheckedTextView_android_checkMark     // Catch: all -> 0x0055
            boolean r11 = r1.hasValue(r10)     // Catch: all -> 0x0055
            if (r11 == 0) goto L_0x0072
            int r10 = r1.getResourceId(r10, r0)     // Catch: all -> 0x0055
            if (r10 == 0) goto L_0x0072
            android.widget.CheckedTextView r11 = r9.mView     // Catch: all -> 0x0055
            android.content.Context r0 = r11.getContext()     // Catch: all -> 0x0055
            android.graphics.drawable.Drawable r10 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r10)     // Catch: all -> 0x0055
            r11.setCheckMarkDrawable(r10)     // Catch: all -> 0x0055
        L_0x0072:
            int r10 = com.taobao.taobao.R.styleable.CheckedTextView_checkMarkTint     // Catch: all -> 0x0055
            boolean r11 = r1.hasValue(r10)     // Catch: all -> 0x0055
            if (r11 == 0) goto L_0x0083
            android.widget.CheckedTextView r11 = r9.mView     // Catch: all -> 0x0055
            android.content.res.ColorStateList r10 = r1.getColorStateList(r10)     // Catch: all -> 0x0055
            androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintList(r11, r10)     // Catch: all -> 0x0055
        L_0x0083:
            int r10 = com.taobao.taobao.R.styleable.CheckedTextView_checkMarkTintMode     // Catch: all -> 0x0055
            boolean r11 = r1.hasValue(r10)     // Catch: all -> 0x0055
            if (r11 == 0) goto L_0x009a
            android.widget.CheckedTextView r11 = r9.mView     // Catch: all -> 0x0055
            r0 = -1
            int r10 = r1.getInt(r10, r0)     // Catch: all -> 0x0055
            r0 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r10, r0)     // Catch: all -> 0x0055
            androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintMode(r11, r10)     // Catch: all -> 0x0055
        L_0x009a:
            r1.recycle()
            return
        L_0x009e:
            r1.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCheckedTextViewHelper.loadFromAttributes(android.util.AttributeSet, int):void");
    }

    public void onSetCheckMarkDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27abf877", new Object[]{this});
        } else if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
        } else {
            this.mSkipNextApply = true;
            applyCheckMarkTint();
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84893646", new Object[]{this, colorStateList});
            return;
        }
        this.mCheckMarkTintList = colorStateList;
        this.mHasCheckMarkTint = true;
        applyCheckMarkTint();
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bec9958", new Object[]{this, mode});
            return;
        }
        this.mCheckMarkTintMode = mode;
        this.mHasCheckMarkTintMode = true;
        applyCheckMarkTint();
    }
}
