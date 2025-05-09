package tb;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final /* synthetic */ class zew {
    static {
        ViewModelProvider.Factory.Companion companion = ViewModelProvider.Factory.Companion;
    }

    public static ViewModel a(ViewModelProvider.Factory factory, Class cls) {
        ckf.g(cls, "modelClass");
        return ViewModelProviders.INSTANCE.unsupportedCreateViewModel$lifecycle_viewmodel_release();
    }

    public static ViewModel b(ViewModelProvider.Factory factory, Class cls, CreationExtras creationExtras) {
        ckf.g(cls, "modelClass");
        ckf.g(creationExtras, "extras");
        return factory.create(cls);
    }

    public static ViewModel c(ViewModelProvider.Factory factory, wyf wyfVar, CreationExtras creationExtras) {
        ckf.g(wyfVar, "modelClass");
        ckf.g(creationExtras, "extras");
        return factory.create(gyf.b(wyfVar), creationExtras);
    }

    @JvmStatic
    public static ViewModelProvider.Factory d(ViewModelInitializer<?>... viewModelInitializerArr) {
        return ViewModelProvider.Factory.Companion.from(viewModelInitializerArr);
    }
}
