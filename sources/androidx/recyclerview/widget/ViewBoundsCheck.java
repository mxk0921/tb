package androidx.recyclerview.widget;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ViewBoundsCheck {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CVE_PVE_POS = 12;
    public static final int CVE_PVS_POS = 8;
    public static final int CVS_PVE_POS = 4;
    public static final int CVS_PVS_POS = 0;
    public static final int EQ = 2;
    public static final int FLAG_CVE_EQ_PVE = 8192;
    public static final int FLAG_CVE_EQ_PVS = 512;
    public static final int FLAG_CVE_GT_PVE = 4096;
    public static final int FLAG_CVE_GT_PVS = 256;
    public static final int FLAG_CVE_LT_PVE = 16384;
    public static final int FLAG_CVE_LT_PVS = 1024;
    public static final int FLAG_CVS_EQ_PVE = 32;
    public static final int FLAG_CVS_EQ_PVS = 2;
    public static final int FLAG_CVS_GT_PVE = 16;
    public static final int FLAG_CVS_GT_PVS = 1;
    public static final int FLAG_CVS_LT_PVE = 64;
    public static final int FLAG_CVS_LT_PVS = 4;
    public static final int GT = 1;
    public static final int LT = 4;
    public static final int MASK = 7;
    public BoundFlags mBoundFlags = new BoundFlags();
    public final Callback mCallback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class BoundFlags {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mBoundFlags = 0;
        public int mChildEnd;
        public int mChildStart;
        public int mRvEnd;
        public int mRvStart;

        public void addFlags(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f204cb6", new Object[]{this, new Integer(i)});
            } else {
                this.mBoundFlags = i | this.mBoundFlags;
            }
        }

        public boolean boundsMatch() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("27acd89b", new Object[]{this})).booleanValue();
            }
            int i = this.mBoundFlags;
            if ((i & 7) != 0 && (i & compare(this.mChildStart, this.mRvStart)) == 0) {
                return false;
            }
            int i2 = this.mBoundFlags;
            if ((i2 & 112) != 0 && (i2 & (compare(this.mChildStart, this.mRvEnd) << 4)) == 0) {
                return false;
            }
            int i3 = this.mBoundFlags;
            if ((i3 & 1792) != 0 && (i3 & (compare(this.mChildEnd, this.mRvStart) << 8)) == 0) {
                return false;
            }
            int i4 = this.mBoundFlags;
            if ((i4 & 28672) == 0 || (i4 & (compare(this.mChildEnd, this.mRvEnd) << 12)) != 0) {
                return true;
            }
            return false;
        }

        public int compare(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("78121c3f", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
            }
            if (i > i2) {
                return 1;
            }
            if (i == i2) {
                return 2;
            }
            return 4;
        }

        public void resetFlags() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1e362ff", new Object[]{this});
            } else {
                this.mBoundFlags = 0;
            }
        }

        public void setBounds(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d50b87e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            this.mRvStart = i;
            this.mRvEnd = i2;
            this.mChildStart = i3;
            this.mChildEnd = i4;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface Callback {
        View getChildAt(int i);

        int getChildEnd(View view);

        int getChildStart(View view);

        int getParentEnd();

        int getParentStart();
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface ViewBounds {
    }

    public ViewBoundsCheck(Callback callback) {
        this.mCallback = callback;
    }

    public View findOneViewWithinBoundFlags(int i, int i2, int i3, int i4) {
        int i5 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4a0b5f8f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        int parentStart = this.mCallback.getParentStart();
        int parentEnd = this.mCallback.getParentEnd();
        if (i2 <= i) {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View childAt = this.mCallback.getChildAt(i);
            this.mBoundFlags.setBounds(parentStart, parentEnd, this.mCallback.getChildStart(childAt), this.mCallback.getChildEnd(childAt));
            if (i3 != 0) {
                this.mBoundFlags.resetFlags();
                this.mBoundFlags.addFlags(i3);
                if (this.mBoundFlags.boundsMatch()) {
                    return childAt;
                }
            }
            if (i4 != 0) {
                this.mBoundFlags.resetFlags();
                this.mBoundFlags.addFlags(i4);
                if (this.mBoundFlags.boundsMatch()) {
                    view = childAt;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean isViewWithinBoundFlags(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7350dff", new Object[]{this, view, new Integer(i)})).booleanValue();
        }
        this.mBoundFlags.setBounds(this.mCallback.getParentStart(), this.mCallback.getParentEnd(), this.mCallback.getChildStart(view), this.mCallback.getChildEnd(view));
        if (i == 0) {
            return false;
        }
        this.mBoundFlags.resetFlags();
        this.mBoundFlags.addFlags(i);
        return this.mBoundFlags.boundsMatch();
    }
}
