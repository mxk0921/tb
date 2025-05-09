package com.taobao.android.fluid.framework.media.dwinstance.creator;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum DW_SCENE_ENUM {
    FROM_LIST(true, false, true),
    NON_LIST_AFTER_CONTAINER(false, false, true),
    NON_LIST_BEFORE_CONTAINER_BEFORE_CLICK(false, true, false),
    NON_LIST_BEFORE_CONTAINER_AFTER_CLICK(false, true, true);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final boolean isAfterClick;
    private final boolean isBeforeContainer;
    private final boolean isInList;

    DW_SCENE_ENUM(boolean z, boolean z2, boolean z3) {
        this.isInList = z;
        this.isBeforeContainer = z2;
        this.isAfterClick = z3;
    }

    public static /* synthetic */ Object ipc$super(DW_SCENE_ENUM dw_scene_enum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/media/dwinstance/creator/DW_SCENE_ENUM");
    }

    public static DW_SCENE_ENUM valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DW_SCENE_ENUM) ipChange.ipc$dispatch("151ae560", new Object[]{str});
        }
        return (DW_SCENE_ENUM) Enum.valueOf(DW_SCENE_ENUM.class, str);
    }

    public boolean isAfterClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4996bf61", new Object[]{this})).booleanValue();
        }
        return this.isAfterClick;
    }

    public boolean isBeforeContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82d8c5c3", new Object[]{this})).booleanValue();
        }
        return this.isBeforeContainer;
    }

    public boolean isInList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcef2f38", new Object[]{this})).booleanValue();
        }
        return this.isInList;
    }
}
