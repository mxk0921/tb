package tb;

import com.alibaba.android.aura.AURAInputData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class bp<INPUT extends Serializable, OUTPUT extends Serializable> extends gn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(79691937);
    }

    public static /* synthetic */ Object ipc$super(bp bpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/AURAWorkService");
    }

    public void B(AURAInputData<INPUT> aURAInputData, pt<OUTPUT> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9f06ee", new Object[]{this, aURAInputData, ptVar});
        }
    }
}
