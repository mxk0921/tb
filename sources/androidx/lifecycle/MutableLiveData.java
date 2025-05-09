package androidx.lifecycle;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MutableLiveData<T> extends LiveData<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MutableLiveData(T t) {
        super(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(MutableLiveData mutableLiveData, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -756587884) {
            super.postValue(objArr[0]);
            return null;
        } else if (hashCode == 1835267474) {
            super.setValue(objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/lifecycle/MutableLiveData");
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void postValue(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2e76294", new Object[]{this, t});
        } else {
            super.postValue(t);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void setValue(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d63f592", new Object[]{this, t});
        } else {
            super.setValue(t);
        }
    }

    public MutableLiveData() {
    }
}
