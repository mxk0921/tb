package androidx.databinding;

import androidx.databinding.Observable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class BaseObservableField extends BaseObservable {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class DependencyCallback extends Observable.OnPropertyChangedCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public DependencyCallback() {
        }

        public static /* synthetic */ Object ipc$super(DependencyCallback dependencyCallback, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/databinding/BaseObservableField$DependencyCallback");
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(Observable observable, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d239026", new Object[]{this, observable, new Integer(i)});
            } else {
                BaseObservableField.this.notifyChange();
            }
        }
    }

    public BaseObservableField() {
    }

    public BaseObservableField(Observable... observableArr) {
        if (!(observableArr == null || observableArr.length == 0)) {
            DependencyCallback dependencyCallback = new DependencyCallback();
            for (Observable observable : observableArr) {
                observable.addOnPropertyChangedCallback(dependencyCallback);
            }
        }
    }
}
