package androidx.core.view.accessibility;

import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AccessibilityRecordCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AccessibilityRecord mRecord;

    @Deprecated
    public AccessibilityRecordCompat(Object obj) {
        this.mRecord = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static AccessibilityRecordCompat obtain(AccessibilityRecordCompat accessibilityRecordCompat) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AccessibilityRecordCompat) ipChange.ipc$dispatch("f91c12ca", new Object[]{accessibilityRecordCompat}) : new AccessibilityRecordCompat(AccessibilityRecord.obtain(accessibilityRecordCompat.mRecord));
    }

    @Deprecated
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityRecordCompat)) {
            return false;
        }
        AccessibilityRecordCompat accessibilityRecordCompat = (AccessibilityRecordCompat) obj;
        AccessibilityRecord accessibilityRecord = this.mRecord;
        if (accessibilityRecord != null) {
            return accessibilityRecord.equals(accessibilityRecordCompat.mRecord);
        }
        if (accessibilityRecordCompat.mRecord == null) {
            return true;
        }
        return false;
    }

    @Deprecated
    public int getAddedCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a310e1df", new Object[]{this})).intValue();
        }
        return this.mRecord.getAddedCount();
    }

    @Deprecated
    public CharSequence getBeforeText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("d67ce8d1", new Object[]{this});
        }
        return this.mRecord.getBeforeText();
    }

    @Deprecated
    public CharSequence getClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("acfaf1c6", new Object[]{this});
        }
        return this.mRecord.getClassName();
    }

    @Deprecated
    public CharSequence getContentDescription() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("3a52ebfa", new Object[]{this});
        }
        return this.mRecord.getContentDescription();
    }

    @Deprecated
    public int getCurrentItemIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30c8f9f6", new Object[]{this})).intValue();
        }
        return this.mRecord.getCurrentItemIndex();
    }

    @Deprecated
    public int getFromIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5cb80c", new Object[]{this})).intValue();
        }
        return this.mRecord.getFromIndex();
    }

    @Deprecated
    public Object getImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("50a520b5", new Object[]{this});
        }
        return this.mRecord;
    }

    @Deprecated
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.mRecord.getItemCount();
    }

    @Deprecated
    public int getMaxScrollX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f2f43317", new Object[]{this})).intValue() : getMaxScrollX(this.mRecord);
    }

    @Deprecated
    public int getMaxScrollY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3024a98", new Object[]{this})).intValue() : getMaxScrollY(this.mRecord);
    }

    @Deprecated
    public Parcelable getParcelableData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("4e65e2ad", new Object[]{this});
        }
        return this.mRecord.getParcelableData();
    }

    @Deprecated
    public int getRemovedCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a35b90ff", new Object[]{this})).intValue();
        }
        return this.mRecord.getRemovedCount();
    }

    @Deprecated
    public int getScrollX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("546f30ef", new Object[]{this})).intValue();
        }
        return this.mRecord.getScrollX();
    }

    @Deprecated
    public int getScrollY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("547d4870", new Object[]{this})).intValue();
        }
        return this.mRecord.getScrollY();
    }

    @Deprecated
    public AccessibilityNodeInfoCompat getSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("cd08646e", new Object[]{this});
        }
        return AccessibilityNodeInfoCompat.wrapNonNullInstance(this.mRecord.getSource());
    }

    @Deprecated
    public List<CharSequence> getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fc68805d", new Object[]{this});
        }
        return this.mRecord.getText();
    }

    @Deprecated
    public int getToIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("848d66db", new Object[]{this})).intValue();
        }
        return this.mRecord.getToIndex();
    }

    @Deprecated
    public int getWindowId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6e329b", new Object[]{this})).intValue();
        }
        return this.mRecord.getWindowId();
    }

    @Deprecated
    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        AccessibilityRecord accessibilityRecord = this.mRecord;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public boolean isChecked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f77ac528", new Object[]{this})).booleanValue();
        }
        return this.mRecord.isChecked();
    }

    @Deprecated
    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return this.mRecord.isEnabled();
    }

    @Deprecated
    public boolean isFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14380eb0", new Object[]{this})).booleanValue();
        }
        return this.mRecord.isFullScreen();
    }

    @Deprecated
    public boolean isPassword() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4596bf0", new Object[]{this})).booleanValue();
        }
        return this.mRecord.isPassword();
    }

    @Deprecated
    public boolean isScrollable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c7d2e7c", new Object[]{this})).booleanValue();
        }
        return this.mRecord.isScrollable();
    }

    @Deprecated
    public void recycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af759a", new Object[]{this});
        } else {
            this.mRecord.recycle();
        }
    }

    @Deprecated
    public void setAddedCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e2680b", new Object[]{this, new Integer(i)});
        } else {
            this.mRecord.setAddedCount(i);
        }
    }

    @Deprecated
    public void setBeforeText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f43e4a79", new Object[]{this, charSequence});
        } else {
            this.mRecord.setBeforeText(charSequence);
        }
    }

    @Deprecated
    public void setChecked(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc7b2d68", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecord.setChecked(z);
        }
    }

    @Deprecated
    public void setClassName(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b66a68c", new Object[]{this, charSequence});
        } else {
            this.mRecord.setClassName(charSequence);
        }
    }

    @Deprecated
    public void setContentDescription(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e19e070", new Object[]{this, charSequence});
        } else {
            this.mRecord.setContentDescription(charSequence);
        }
    }

    @Deprecated
    public void setCurrentItemIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8696bd4", new Object[]{this, new Integer(i)});
        } else {
            this.mRecord.setCurrentItemIndex(i);
        }
    }

    @Deprecated
    public void setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecord.setEnabled(z);
        }
    }

    @Deprecated
    public void setFromIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47312616", new Object[]{this, new Integer(i)});
        } else {
            this.mRecord.setFromIndex(i);
        }
    }

    @Deprecated
    public void setFullScreen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f3d7370", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecord.setFullScreen(z);
        }
    }

    @Deprecated
    public void setItemCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a49022", new Object[]{this, new Integer(i)});
        } else {
            this.mRecord.setItemCount(i);
        }
    }

    @Deprecated
    public void setMaxScrollX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2693dd3", new Object[]{this, new Integer(i)});
        } else {
            setMaxScrollX(this.mRecord, i);
        }
    }

    @Deprecated
    public void setMaxScrollY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41e1672", new Object[]{this, new Integer(i)});
        } else {
            setMaxScrollY(this.mRecord, i);
        }
    }

    @Deprecated
    public void setParcelableData(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de7f83dd", new Object[]{this, parcelable});
        } else {
            this.mRecord.setParcelableData(parcelable);
        }
    }

    @Deprecated
    public void setPassword(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cb9030", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecord.setPassword(z);
        }
    }

    @Deprecated
    public void setRemovedCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3ad0feb", new Object[]{this, new Integer(i)});
        } else {
            this.mRecord.setRemovedCount(i);
        }
    }

    @Deprecated
    public void setScrollX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc05c93", new Object[]{this, new Integer(i)});
        } else {
            this.mRecord.setScrollX(i);
        }
    }

    @Deprecated
    public void setScrollY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71753532", new Object[]{this, new Integer(i)});
        } else {
            this.mRecord.setScrollY(i);
        }
    }

    @Deprecated
    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecord.setScrollable(z);
        }
    }

    @Deprecated
    public void setSource(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d4512e", new Object[]{this, view});
        } else {
            this.mRecord.setSource(view);
        }
    }

    @Deprecated
    public void setToIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4368e427", new Object[]{this, new Integer(i)});
        } else {
            this.mRecord.setToIndex(i);
        }
    }

    public static int getMaxScrollX(AccessibilityRecord accessibilityRecord) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("60f053b2", new Object[]{accessibilityRecord})).intValue() : accessibilityRecord.getMaxScrollX();
    }

    public static int getMaxScrollY(AccessibilityRecord accessibilityRecord) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee2b0533", new Object[]{accessibilityRecord})).intValue() : accessibilityRecord.getMaxScrollY();
    }

    @Deprecated
    public static AccessibilityRecordCompat obtain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AccessibilityRecordCompat) ipChange.ipc$dispatch("f61527f9", new Object[0]) : new AccessibilityRecordCompat(AccessibilityRecord.obtain());
    }

    public static void setMaxScrollX(AccessibilityRecord accessibilityRecord, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b754f898", new Object[]{accessibilityRecord, new Integer(i)});
        } else {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    public static void setMaxScrollY(AccessibilityRecord accessibilityRecord, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1707737", new Object[]{accessibilityRecord, new Integer(i)});
        } else {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @Deprecated
    public void setSource(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46b64795", new Object[]{this, view, new Integer(i)});
        } else {
            setSource(this.mRecord, view, i);
        }
    }

    public static void setSource(AccessibilityRecord accessibilityRecord, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e30cb0", new Object[]{accessibilityRecord, view, new Integer(i)});
        } else {
            accessibilityRecord.setSource(view, i);
        }
    }
}
