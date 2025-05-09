package com.taobao.search.searchdoor.ai;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SearchBarInputModel extends ViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MutableLiveData<String> f11641a = new MutableLiveData<>();

    static {
        t2o.a(815793064);
    }

    public static /* synthetic */ Object ipc$super(SearchBarInputModel searchBarInputModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/ai/SearchBarInputModel");
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("235c1fe9", new Object[]{this});
        }
        return this.f11641a.getValue();
    }

    public final void b(FragmentActivity fragmentActivity, Observer<String> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc23a434", new Object[]{this, fragmentActivity, observer});
            return;
        }
        ckf.g(fragmentActivity, "activity");
        ckf.g(observer, "observer");
        this.f11641a.observe(fragmentActivity, observer);
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f52c69a", new Object[]{this, str});
        } else {
            this.f11641a.setValue(str);
        }
    }
}
