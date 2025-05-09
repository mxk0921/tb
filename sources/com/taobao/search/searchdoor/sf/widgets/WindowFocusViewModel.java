package com.taobao.search.searchdoor.sf.widgets;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class WindowFocusViewModel extends ViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MutableLiveData<Boolean> f11644a = new MutableLiveData<>();

    static {
        t2o.a(815793140);
    }

    public static /* synthetic */ Object ipc$super(WindowFocusViewModel windowFocusViewModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/WindowFocusViewModel");
    }

    public final MutableLiveData<Boolean> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLiveData) ipChange.ipc$dispatch("2c2d5a5b", new Object[]{this});
        }
        return this.f11644a;
    }
}
