package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ab5 extends WXSDKInstance implements osb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(452985051);
        t2o.a(452985065);
        t2o.a(452985052);
    }

    public static /* synthetic */ Object ipc$super(ab5 ab5Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode == -17468269) {
            super.onActivityDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/avplayer/component/weex/DWWXSDKInstance");
        }
    }

    @Override // com.taobao.weex.WXSDKInstance
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            super.destroy();
        }
    }

    @Override // com.taobao.weex.WXSDKInstance
    public boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b933fb", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.weex.WXSDKInstance, tb.yae
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
        } else {
            super.onActivityDestroy();
        }
    }
}
