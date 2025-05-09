package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.ContextThemeWrapper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ThemedSpinnerAdapter extends SpinnerAdapter {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Helper {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Context mContext;
        private LayoutInflater mDropDownInflater;
        private final LayoutInflater mInflater;

        public Helper(Context context) {
            this.mContext = context;
            this.mInflater = LayoutInflater.from(context);
        }

        public LayoutInflater getDropDownViewInflater() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LayoutInflater) ipChange.ipc$dispatch("1be275b0", new Object[]{this});
            }
            LayoutInflater layoutInflater = this.mDropDownInflater;
            if (layoutInflater != null) {
                return layoutInflater;
            }
            return this.mInflater;
        }

        public Resources.Theme getDropDownViewTheme() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Resources.Theme) ipChange.ipc$dispatch("4b556970", new Object[]{this});
            }
            LayoutInflater layoutInflater = this.mDropDownInflater;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void setDropDownViewTheme(Resources.Theme theme) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c04a2c4", new Object[]{this, theme});
            } else if (theme == null) {
                this.mDropDownInflater = null;
            } else if (theme.equals(this.mContext.getTheme())) {
                this.mDropDownInflater = this.mInflater;
            } else {
                this.mDropDownInflater = LayoutInflater.from(new ContextThemeWrapper(this.mContext, theme));
            }
        }
    }

    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(Resources.Theme theme);
}
