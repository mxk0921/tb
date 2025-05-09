package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ss extends zs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81788961);
    }

    public static /* synthetic */ Object ipc$super(ss ssVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/aspect/extension/AbsAURADXDownloadExtension");
    }

    public void L(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738948f9", new Object[]{this, list});
        }
    }

    public abstract void m0(List<DXTemplateItem> list);
}
