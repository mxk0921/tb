package com.taobao.android.appdevtools.core.storage;

import android.taobao.windvane.extra.storage.IStorage;
import android.taobao.windvane.extra.storage.StorageFactory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/taobao/windvane/extra/storage/IStorage;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class DevToolsStorage$mStorage$2 extends Lambda implements d1a<IStorage> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DevToolsStorage$mStorage$2 INSTANCE = new DevToolsStorage$mStorage$2();

    public DevToolsStorage$mStorage$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(DevToolsStorage$mStorage$2 devToolsStorage$mStorage$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/appdevtools/core/storage/DevToolsStorage$mStorage$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final IStorage invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IStorage) ipChange.ipc$dispatch("eb5a2fdd", new Object[]{this});
        }
        IStorage createStorageInstance = StorageFactory.createStorageInstance("appDevTools");
        if (createStorageInstance != null) {
            return createStorageInstance;
        }
        throw new IllegalStateException("Storage initialization failed");
    }
}
