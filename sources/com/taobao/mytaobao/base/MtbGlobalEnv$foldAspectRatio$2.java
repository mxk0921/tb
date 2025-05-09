package com.taobao.mytaobao.base;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.tao.Globals;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.pb6;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbGlobalEnv$foldAspectRatio$2 extends Lambda implements d1a<Float> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtbGlobalEnv$foldAspectRatio$2 INSTANCE = new MtbGlobalEnv$foldAspectRatio$2();

    public MtbGlobalEnv$foldAspectRatio$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(MtbGlobalEnv$foldAspectRatio$2 mtbGlobalEnv$foldAspectRatio$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/base/MtbGlobalEnv$foldAspectRatio$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final Float invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("b20f2348", new Object[]{this});
        }
        if (MtbGlobalEnv.s()) {
            Application application = Globals.getApplication();
            int a2 = TBDeviceUtils.a(application);
            if (a2 == 0) {
                return Float.valueOf(2.31f);
            }
            if (a2 == 2) {
                int s = pb6.s(application);
                int r = pb6.r(application);
                if (s != 0) {
                    return Float.valueOf((r * 1.0f) / s);
                }
            }
        }
        return null;
    }
}
