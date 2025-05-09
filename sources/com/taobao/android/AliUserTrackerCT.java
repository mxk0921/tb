package com.taobao.android;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum AliUserTrackerCT {
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

    public static /* synthetic */ Object ipc$super(AliUserTrackerCT aliUserTrackerCT, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/AliUserTrackerCT");
    }

    public static AliUserTrackerCT valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliUserTrackerCT) ipChange.ipc$dispatch("2f8700b7", new Object[]{str});
        }
        return (AliUserTrackerCT) Enum.valueOf(AliUserTrackerCT.class, str);
    }
}
