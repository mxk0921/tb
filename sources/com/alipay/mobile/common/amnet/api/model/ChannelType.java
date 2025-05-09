package com.alipay.mobile.common.amnet.api.model;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ChannelType {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte CHANNLE_COMMON = 0;
    public static final byte CHANNLE_PUSH = 4;
    public static final byte CHANNLE_RPC = 1;
    public static final byte CHANNLE_SYNC = 2;
    public static final byte CHANNLE_SYNC_DIRECT = 3;

    public static boolean isPush(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15975835", new Object[]{new Byte(b)})).booleanValue();
        }
        if (b == 4) {
            return true;
        }
        return false;
    }

    public static boolean isRpc(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e342b99e", new Object[]{new Byte(b)})).booleanValue();
        }
        if (b == 1) {
            return true;
        }
        return false;
    }

    public static boolean isSync(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60e1f554", new Object[]{new Byte(b)})).booleanValue();
        }
        if (b != 2) {
            return false;
        }
        return true;
    }
}
