package com.taobao.android.live.plugin.atype.flexalocal.good.view.bean;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.wyf;
import tb.zew;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UltronInstanceViewModelFactory implements ViewModelProvider.Factory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699293);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return zew.b(this, cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(wyf wyfVar, CreationExtras creationExtras) {
        return zew.c(this, wyfVar, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ViewModel) ipChange.ipc$dispatch("9d9ab72", new Object[]{this, cls}));
        }
        if (cls == UltronInstanceViewModel.class) {
            return new UltronInstanceViewModel();
        }
        return null;
    }
}
