package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vkl extends yb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578814180);
    }

    public static /* synthetic */ Object ipc$super(vkl vklVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/common/PadFullscreenNavProcessorNodeComponentFilterItem0");
    }

    @Override // tb.yb4, tb.xb4
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f15c09d0", new Object[]{this, str})).booleanValue();
        }
        if (str.equals("com.taobao.search.searchdoor.SearchDoorActivity") || str.equals("com.taobao.search.sf.MainSearchResultActivity") || str.equals("com.taobao.search.sf.InshopResultActivity") || str.equals("com.taobao.search.searchdoor.shop.ShopSearchDoorActivity") || str.equals("com.etao.feimagesearch.capture.CaptureActivity") || str.equals("com.etao.feimagesearch.IrpActivity") || str.equals("com.etao.feimagesearch.SingleIrpActivity") || str.equals("com.taobao.search.searchdoor.MultipleSearchDoorActivity") || str.equals("com.taobao.taowise.chat.ChatGPTActivity")) {
            return true;
        }
        return false;
    }

    @Override // tb.yb4, tb.xb4
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e8cdc9e", new Object[]{this, str})).booleanValue();
        }
        return str.equals("com.taobao.taobao");
    }
}
