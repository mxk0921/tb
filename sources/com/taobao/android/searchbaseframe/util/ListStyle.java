package com.taobao.android.searchbaseframe.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum ListStyle implements Serializable {
    LIST("list"),
    WATERFALL("wf");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    ListStyle(String str) {
        this.value = str;
    }

    public static ListStyle fromInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("98448fd4", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return LIST;
        }
        return WATERFALL;
    }

    public static ListStyle fromNumString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("eb053efb", new Object[]{str});
        }
        if (TextUtils.equals("0", str)) {
            return LIST;
        }
        return WATERFALL;
    }

    public static ListStyle fromString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("ae7faa9", new Object[]{str});
        }
        if ("wf".equals(str)) {
            return WATERFALL;
        }
        return LIST;
    }

    public static /* synthetic */ Object ipc$super(ListStyle listStyle, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/util/ListStyle");
    }

    public static int toNum(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f81a36e", new Object[]{listStyle})).intValue();
        }
        if (listStyle == LIST) {
            return 0;
        }
        return 1;
    }

    public static ListStyle valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("d2877c76", new Object[]{str});
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
}
