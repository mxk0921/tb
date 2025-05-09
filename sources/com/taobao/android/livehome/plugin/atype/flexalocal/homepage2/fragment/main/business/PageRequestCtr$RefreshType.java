package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum PageRequestCtr$RefreshType {
    ENTER(1),
    TAB(2),
    MORE(3),
    PULL(4),
    TABONCHANGE(5);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int type;

    PageRequestCtr$RefreshType(int i) {
        this.type = i;
    }

    public static /* synthetic */ Object ipc$super(PageRequestCtr$RefreshType pageRequestCtr$RefreshType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/business/PageRequestCtr$RefreshType");
    }

    public static PageRequestCtr$RefreshType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageRequestCtr$RefreshType) ipChange.ipc$dispatch("102d36f8", new Object[]{str});
        }
        return (PageRequestCtr$RefreshType) Enum.valueOf(PageRequestCtr$RefreshType.class, str);
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.type;
    }
}
