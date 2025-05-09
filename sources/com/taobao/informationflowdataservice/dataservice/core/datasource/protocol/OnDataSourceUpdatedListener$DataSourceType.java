package com.taobao.informationflowdataservice.dataservice.core.datasource.protocol;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum OnDataSourceUpdatedListener$DataSourceType {
    DS_TYPE_CACHED_CONTENT,
    DS_TYPE_REMOTE_CONTENT,
    DS_TYPE_NEW_CONTAINER_CONTENT,
    DS_TYPE_REFRESH_CONTENT,
    DS_TYPE_RECOMMEND_CONTENT,
    DS_TYPE_TEMPLATE_UPDATE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(OnDataSourceUpdatedListener$DataSourceType onDataSourceUpdatedListener$DataSourceType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/informationflowdataservice/dataservice/core/datasource/protocol/OnDataSourceUpdatedListener$DataSourceType");
    }

    public static OnDataSourceUpdatedListener$DataSourceType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnDataSourceUpdatedListener$DataSourceType) ipChange.ipc$dispatch("cbe7bfa4", new Object[]{str});
        }
        return (OnDataSourceUpdatedListener$DataSourceType) Enum.valueOf(OnDataSourceUpdatedListener$DataSourceType.class, str);
    }

    public boolean isPresentedAsContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8845d242", new Object[]{this})).booleanValue();
        }
        if (this == DS_TYPE_CACHED_CONTENT || this == DS_TYPE_REMOTE_CONTENT || this == DS_TYPE_REFRESH_CONTENT || this == DS_TYPE_NEW_CONTAINER_CONTENT) {
            return true;
        }
        return false;
    }

    public boolean isRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5931ce5c", new Object[]{this})).booleanValue();
        }
        if (this == DS_TYPE_REFRESH_CONTENT) {
            return true;
        }
        return false;
    }
}
