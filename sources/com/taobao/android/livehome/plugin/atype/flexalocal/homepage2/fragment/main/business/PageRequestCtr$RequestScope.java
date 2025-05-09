package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum PageRequestCtr$RequestScope {
    FULLREFRESH(1),
    SECONDREFRESH(2),
    MOREINNER(3);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int type;

    PageRequestCtr$RequestScope(int i) {
        this.type = i;
    }

    public static /* synthetic */ Object ipc$super(PageRequestCtr$RequestScope pageRequestCtr$RequestScope, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/business/PageRequestCtr$RequestScope");
    }

    public static PageRequestCtr$RequestScope valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageRequestCtr$RequestScope) ipChange.ipc$dispatch("b0094d44", new Object[]{str});
        }
        return (PageRequestCtr$RequestScope) Enum.valueOf(PageRequestCtr$RequestScope.class, str);
    }
}
