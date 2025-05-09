package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_uikit.widget.scroller.Scroller;
import com.taobao.search.musie.lazyscroll.TbLazyScroller;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class tya extends Scroller.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792731);
    }

    public static /* synthetic */ Object ipc$super(tya tyaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/lazyscroll/Holder");
    }

    /* renamed from: f */
    public TbLazyScroller e(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TbLazyScroller) ipChange.ipc$dispatch("c09495ef", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
        }
        ckf.g(mUSDKInstance, "instance");
        TbLazyScroller tbLazyScroller = new TbLazyScroller(i);
        tbLazyScroller.setInstance(mUSDKInstance);
        if (mUSProps != null) {
            tbLazyScroller.updateStyles(mUSProps);
        }
        if (mUSProps2 != null) {
            tbLazyScroller.updateAttrs(mUSProps2);
        }
        return tbLazyScroller;
    }
}
