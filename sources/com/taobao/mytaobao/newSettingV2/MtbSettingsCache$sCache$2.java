package com.taobao.mytaobao.newSettingV2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.fdb;
import tb.mba;
import tb.np;
import tb.op;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltb/fdb;", "kotlin.jvm.PlatformType", "invoke", "()Ltb/fdb;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbSettingsCache$sCache$2 extends Lambda implements d1a<fdb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtbSettingsCache$sCache$2 INSTANCE = new MtbSettingsCache$sCache$2();

    public MtbSettingsCache$sCache$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(MtbSettingsCache$sCache$2 mtbSettingsCache$sCache$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/newSettingV2/MtbSettingsCache$sCache$2");
    }

    @Override // tb.d1a
    public final fdb invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdb) ipChange.ipc$dispatch("f934759f", new Object[]{this});
        }
        np cacheForModule = AVFSCacheManager.getInstance().cacheForModule(mba.BIZ_NAME);
        if (cacheForModule != null) {
            np L = cacheForModule.Z(MtbSettingsCache.INSTANCE.getClass().getClassLoader()).L(new op());
            ckf.c(L, "AVFSCacheManager.getInst…Config(AVFSCacheConfig())");
            return L.w();
        }
        ckf.s();
        throw null;
    }
}
