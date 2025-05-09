package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.ui.INode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class hkj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MUSDKInstance f20704a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ cwh d;
        public final /* synthetic */ INode e;
        public final /* synthetic */ MUSValue[] f;

        public a(cwh cwhVar, INode iNode, MUSValue[] mUSValueArr) {
            this.d = cwhVar;
            this.e = iNode;
            this.f = mUSValueArr;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/bridge/NativeInvokeHelper$1");
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

    static {
        t2o.a(982516061);
    }

    public hkj(MUSDKInstance mUSDKInstance) {
        this.f20704a = mUSDKInstance;
    }

    public void a(INode iNode, MUSValue mUSValue, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("924dc65c", new Object[]{this, iNode, mUSValue, mUSValueArr});
            return;
        }
        cwh invoker = iNode.getInvoker(mUSValue);
        if (invoker == null) {
            dwh.e("Can't found UINode method: " + mUSValue);
            return;
        }
        this.f20704a.getExecuteContext();
        this.f20704a.postTaskToMain(new a(invoker, iNode, mUSValueArr));
    }
}
