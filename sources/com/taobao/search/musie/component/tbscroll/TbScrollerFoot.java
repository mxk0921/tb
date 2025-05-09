package com.taobao.search.musie.component.tbscroll;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.div.Div;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TbScrollerFoot extends Div {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792714);
    }

    public TbScrollerFoot(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(TbScrollerFoot tbScrollerFoot, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/component/tbscroll/TbScrollerFoot");
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87585099", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            getNodeInfo().X(0, i2, i3 - i, i4);
        }
    }
}
