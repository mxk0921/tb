package com.alibaba.android.split.core.splitinstall;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.gdq;
import tb.kdq;
import tb.sng;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum SplitLoaderHolder implements kdq {
    INSTANCE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicReference atomicReference = new AtomicReference(null);

    public static /* synthetic */ Object ipc$super(SplitLoaderHolder splitLoaderHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/splitinstall/SplitLoaderHolder");
    }

    public static void set(gdq gdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abff0d9f", new Object[]{gdqVar});
        } else {
            sng.a(atomicReference, null, gdqVar);
        }
    }

    public static SplitLoaderHolder valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SplitLoaderHolder) ipChange.ipc$dispatch("fbcf3085", new Object[]{str});
        }
        return (SplitLoaderHolder) Enum.valueOf(SplitLoaderHolder.class, str);
    }

    @Override // tb.kdq
    public final gdq get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gdq) ipChange.ipc$dispatch("f6422675", new Object[]{this});
        }
        return (gdq) atomicReference.get();
    }
}
