package com.alibaba.android.triver.base.api;

import android.content.Context;
import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@DefaultImpl("com.alibaba.triver.base.taobao.TriverRemoteManager")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ITriverRemoteProxy extends Proxiable {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum DependenceMode {
        TRIVER_ONLY,
        TRIVER_AND_UC,
        UC_ONLY,
        AMAP;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(DependenceMode dependenceMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/triver/base/api/ITriverRemoteProxy$DependenceMode");
        }

        public static DependenceMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DependenceMode) ipChange.ipc$dispatch("42272810", new Object[]{str});
            }
            return (DependenceMode) Enum.valueOf(DependenceMode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void onError(String str);

        void onSuccess();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        void a(int i);
    }

    boolean hasInstalled(DependenceMode dependenceMode);

    boolean hasInstalled(DependenceMode dependenceMode, Context context);

    void install(String str, String str2, DependenceMode dependenceMode, Context context, a aVar);

    void install(String str, String str2, DependenceMode dependenceMode, Context context, a aVar, b bVar);

    void installWithMainThreadCallback(String str, String str2, DependenceMode dependenceMode, Context context, a aVar, b bVar);

    void installWithRemoUI(String str, String str2, DependenceMode dependenceMode, Context context, a aVar);

    void installWithRemoUI(String str, String str2, boolean z, DependenceMode dependenceMode, Context context, a aVar);
}
