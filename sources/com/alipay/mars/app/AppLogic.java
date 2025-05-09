package com.alipay.mars.app;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AppLogic {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "bifrost.AppLogic";

    /* renamed from: a  reason: collision with root package name */
    public static ICallBack f3865a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class DeviceInfo {
        public String devicename;
        public String devicetype;

        public DeviceInfo(String str, String str2) {
            this.devicename = str;
            this.devicetype = str2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ICallBack {
        AccountInfo getAccountInfo();

        String getAppFilePath();

        int getClientVersion();

        String getCurLanguage();

        DeviceInfo getDeviceType();
    }

    public static AccountInfo getAccountInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccountInfo) ipChange.ipc$dispatch("d7faf1d4", new Object[0]);
        }
        ICallBack iCallBack = f3865a;
        if (iCallBack == null) {
            return null;
        }
        return iCallBack.getAccountInfo();
    }

    public static String getAppFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c6ea2ad", new Object[0]);
        }
        ICallBack iCallBack = f3865a;
        if (iCallBack == null) {
            return null;
        }
        return iCallBack.getAppFilePath();
    }

    public static int getClientVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b23f3d1", new Object[0])).intValue();
        }
        ICallBack iCallBack = f3865a;
        if (iCallBack == null) {
            return 0;
        }
        return iCallBack.getClientVersion();
    }

    public static String getCurLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("714573b7", new Object[0]);
        }
        ICallBack iCallBack = f3865a;
        if (iCallBack == null) {
            return null;
        }
        return iCallBack.getCurLanguage();
    }

    public static DeviceInfo getDeviceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceInfo) ipChange.ipc$dispatch("d1a14144", new Object[0]);
        }
        ICallBack iCallBack = f3865a;
        if (iCallBack == null) {
            return null;
        }
        return iCallBack.getDeviceType();
    }

    public static void setCallBack(ICallBack iCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7212a4a5", new Object[]{iCallBack});
        } else {
            f3865a = iCallBack;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class AccountInfo {
        public long uin;
        public String userName;

        public AccountInfo() {
            this.uin = 0L;
            this.userName = "";
        }

        public AccountInfo(long j, String str) {
            this.uin = j;
            this.userName = str;
        }
    }
}
