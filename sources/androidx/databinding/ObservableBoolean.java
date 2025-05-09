package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ObservableBoolean extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new Parcelable.Creator<ObservableBoolean>() { // from class: androidx.databinding.ObservableBoolean.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ObservableBoolean createFromParcel(Parcel parcel) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ObservableBoolean) ipChange.ipc$dispatch("5a36423", new Object[]{this, parcel});
            }
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new ObservableBoolean(z);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ObservableBoolean[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ObservableBoolean[]) ipChange.ipc$dispatch("162e720c", new Object[]{this, new Integer(i)}) : new ObservableBoolean[i];
        }
    };
    static final long serialVersionUID = 1;
    private boolean mValue;

    public ObservableBoolean(boolean z) {
        this.mValue = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean get() {
        return this.mValue;
    }

    public void set(boolean z) {
        if (z != this.mValue) {
            this.mValue = z;
            notifyChange();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue ? 1 : 0);
    }

    public ObservableBoolean() {
    }

    public ObservableBoolean(Observable... observableArr) {
        super(observableArr);
    }
}
