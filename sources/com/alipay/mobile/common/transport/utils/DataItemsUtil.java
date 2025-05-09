package com.alipay.mobile.common.transport.utils;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.monitor.DataContainer;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DataItemsUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getDataItem2DataContainer(DataContainer dataContainer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("143f2056", new Object[]{dataContainer, str});
        }
        if (dataContainer == null) {
            return "";
        }
        return dataContainer.getDataItem(str);
    }

    public static void putDataItem2ContainerAnyway(DataContainer dataContainer, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1627e93a", new Object[]{dataContainer, str, str2});
        } else if (dataContainer != null) {
            dataContainer.putDataItem(str, str2);
        }
    }

    public static void putDataItem2DataContainer(DataContainer dataContainer, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd8d18d", new Object[]{dataContainer, str, str2});
        } else if (dataContainer != null && TextUtils.isEmpty(dataContainer.getDataItem(str))) {
            dataContainer.putDataItem(str, str2);
        }
    }

    public static void removeFromDataContainer(DataContainer dataContainer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315b50db", new Object[]{dataContainer, str});
        } else if (dataContainer != null) {
            dataContainer.removeDataItem(str);
        }
    }
}
