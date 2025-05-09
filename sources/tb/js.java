package tb;

import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class js extends zs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789136);
    }

    public static /* synthetic */ Object ipc$super(js jsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/linkage/extension/AbsAURAAdjustTriggerExtension");
    }

    public abstract void L(UMFLinkageTrigger uMFLinkageTrigger, List<nbb> list);

    public abstract boolean m0(mi miVar, mbb<mi, Void> mbbVar);
}
