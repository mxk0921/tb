package com.taobao.search.mmd.datasource.bean;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum ListStyle implements Serializable {
    LIST("list"),
    WATERFALL("mid");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    ListStyle(String str) {
        this.value = str;
    }

    public static ListStyle convertFromSFStyle(com.taobao.android.searchbaseframe.util.ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("c37fd557", new Object[]{listStyle});
        }
        if (listStyle == com.taobao.android.searchbaseframe.util.ListStyle.LIST) {
            return LIST;
        }
        return WATERFALL;
    }

    public static /* synthetic */ Object ipc$super(ListStyle listStyle, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/mmd/datasource/bean/ListStyle");
    }

    public static ListStyle valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("eef807cb", new Object[]{str});
        }
        return (ListStyle) Enum.valueOf(ListStyle.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }

    public com.taobao.android.searchbaseframe.util.ListStyle toSFStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.searchbaseframe.util.ListStyle) ipChange.ipc$dispatch("76dcb1c7", new Object[]{this});
        }
        if (this == LIST) {
            return com.taobao.android.searchbaseframe.util.ListStyle.LIST;
        }
        return com.taobao.android.searchbaseframe.util.ListStyle.WATERFALL;
    }
}
