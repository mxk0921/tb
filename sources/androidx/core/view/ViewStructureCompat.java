package androidx.core.view;

import android.os.Build;
import android.view.ViewStructure;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cgw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ViewStructureCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Object mWrappedObj;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api23Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api23Impl() {
        }

        public static void setClassName(ViewStructure viewStructure, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0cdd6bd", new Object[]{viewStructure, str});
            } else {
                viewStructure.setClassName(str);
            }
        }

        public static void setContentDescription(ViewStructure viewStructure, CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99a50b3b", new Object[]{viewStructure, charSequence});
            } else {
                viewStructure.setContentDescription(charSequence);
            }
        }

        public static void setDimens(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37eb80d6", new Object[]{viewStructure, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            } else {
                viewStructure.setDimens(i, i2, i3, i4, i5, i6);
            }
        }

        public static void setText(ViewStructure viewStructure, CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4053425", new Object[]{viewStructure, charSequence});
            } else {
                viewStructure.setText(charSequence);
            }
        }
    }

    private ViewStructureCompat(ViewStructure viewStructure) {
        this.mWrappedObj = viewStructure;
    }

    public static ViewStructureCompat toViewStructureCompat(ViewStructure viewStructure) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStructureCompat) ipChange.ipc$dispatch("730f5f2e", new Object[]{viewStructure});
        }
        return new ViewStructureCompat(viewStructure);
    }

    public void setClassName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373579b2", new Object[]{this, str});
        } else if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setClassName(cgw.a(this.mWrappedObj), str);
        }
    }

    public void setContentDescription(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e19e070", new Object[]{this, charSequence});
        } else if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setContentDescription(cgw.a(this.mWrappedObj), charSequence);
        }
    }

    public void setDimens(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff791dcb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setDimens(cgw.a(this.mWrappedObj), i, i2, i3, i4, i5, i6);
        }
    }

    public void setText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1ac5a", new Object[]{this, charSequence});
        } else if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setText(cgw.a(this.mWrappedObj), charSequence);
        }
    }

    public ViewStructure toViewStructure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return cgw.a(ipChange.ipc$dispatch("fc8bcc47", new Object[]{this}));
        }
        return cgw.a(this.mWrappedObj);
    }
}
