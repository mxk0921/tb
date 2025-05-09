package com.taobao.statistic;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum CT {
    Button,
    Text,
    Textarea,
    List,
    ListItem,
    Image,
    Browser,
    Check,
    Combo,
    Tab,
    Menu,
    MenuItem,
    Option,
    SlideShow,
    Dialog,
    Frame,
    SlideBar,
    NavigationBar,
    Bar,
    HypeLink,
    Map;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(CT ct, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/statistic/CT");
    }

    public static CT valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CT) ipChange.ipc$dispatch("4095e007", new Object[]{str});
        }
        return (CT) Enum.valueOf(CT.class, str);
    }
}
