package androidx.appcompat.widget;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RtlSpacingHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int UNDEFINED = Integer.MIN_VALUE;
    private int mLeft = 0;
    private int mRight = 0;
    private int mStart = Integer.MIN_VALUE;
    private int mEnd = Integer.MIN_VALUE;
    private int mExplicitLeft = 0;
    private int mExplicitRight = 0;
    private boolean mIsRtl = false;
    private boolean mIsRelative = false;

    public int getEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddee639f", new Object[]{this})).intValue();
        }
        if (this.mIsRtl) {
            return this.mLeft;
        }
        return this.mRight;
    }

    public int getLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2350677", new Object[]{this})).intValue();
        }
        return this.mLeft;
    }

    public int getRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1d449e0", new Object[]{this})).intValue();
        }
        return this.mRight;
    }

    public int getStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8070b926", new Object[]{this})).intValue();
        }
        if (this.mIsRtl) {
            return this.mRight;
        }
        return this.mLeft;
    }

    public void setAbsolute(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1abec60", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mIsRelative = false;
        if (i != Integer.MIN_VALUE) {
            this.mExplicitLeft = i;
            this.mLeft = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.mExplicitRight = i2;
            this.mRight = i2;
        }
    }

    public void setDirection(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e12dc410", new Object[]{this, new Boolean(z)});
        } else if (z != this.mIsRtl) {
            this.mIsRtl = z;
            if (!this.mIsRelative) {
                this.mLeft = this.mExplicitLeft;
                this.mRight = this.mExplicitRight;
            } else if (z) {
                int i = this.mEnd;
                if (i == Integer.MIN_VALUE) {
                    i = this.mExplicitLeft;
                }
                this.mLeft = i;
                int i2 = this.mStart;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.mExplicitRight;
                }
                this.mRight = i2;
            } else {
                int i3 = this.mStart;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.mExplicitLeft;
                }
                this.mLeft = i3;
                int i4 = this.mEnd;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.mExplicitRight;
                }
                this.mRight = i4;
            }
        }
    }

    public void setRelative(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16ac5f5", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mStart = i;
        this.mEnd = i2;
        this.mIsRelative = true;
        if (this.mIsRtl) {
            if (i2 != Integer.MIN_VALUE) {
                this.mLeft = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.mRight = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.mLeft = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.mRight = i2;
        }
    }
}
