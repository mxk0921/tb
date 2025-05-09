package com.taobao.android.remoteso.index;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(SoIndexData soIndexData, String str, String str2, SoIndexData.SoFileInfo soFileInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2af35924", new Object[]{soIndexData, str, str2, soFileInfo});
            return;
        }
        SoIndexData.SoIndexEntry soIndexEntry = new SoIndexData.SoIndexEntry();
        soIndexEntry.getFiles().put(str2, soFileInfo);
        soIndexData.getEntries().put(str, soIndexEntry);
    }

    public static SoInfo2 b(SoIndexAdvanced soIndexAdvanced, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoInfo2) ipChange.ipc$dispatch("33969ea4", new Object[]{soIndexAdvanced, str, str2});
        }
        return soIndexAdvanced.getInfoMap().get(str + "|" + str2);
    }

    public static int d(SoIndexData soIndexData, String str, String str2, SoIndexData.SoFileInfo soFileInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17c883bd", new Object[]{soIndexData, str, str2, soFileInfo})).intValue();
        }
        SoIndexData.SoIndexEntry soIndexEntry = soIndexData.getEntries().get(str);
        if (soIndexEntry == null) {
            return -1;
        }
        if (soIndexEntry.getFiles().get(str2) == null) {
            return -2;
        }
        if (soFileInfo == null) {
            return -3;
        }
        soIndexEntry.getFiles().put(str2, soFileInfo);
        return 0;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3558335", new Object[]{str});
        }
        int indexOf = str.indexOf("|");
        if (indexOf == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
