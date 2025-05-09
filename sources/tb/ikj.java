package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.ui.INode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ikj extends yio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ cwh d;
    public final /* synthetic */ INode e;
    public final /* synthetic */ MUSValue[] f;
    public final /* synthetic */ jkj g;

    public ikj(jkj jkjVar, cwh cwhVar, INode iNode, MUSValue[] mUSValueArr) {
        this.g = jkjVar;
        this.d = cwhVar;
        this.e = iNode;
        this.f = mUSValueArr;
    }

    public static /* synthetic */ Object ipc$super(ikj ikjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/musadapter/NativeInvokeHelperAdapter$1");
    }

    @Override // tb.yio
    public void e() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4134b145", new Object[]{this});
        } else {
            this.d.e(this.e.getInstance(), null, this.e, this.f);
        }
    }
}
