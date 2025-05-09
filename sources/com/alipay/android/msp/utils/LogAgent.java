package com.alipay.android.msp.utils;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LogAgent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static long finishRenderTime;
    private static long firstRpcFinishTime;
    private static long startTime;

    public static long getOpenTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("795edba8", new Object[0])).longValue();
        }
        return firstRpcFinishTime - startTime;
    }

    public static long getRenderTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4212574", new Object[0])).longValue();
        }
        return finishRenderTime - firstRpcFinishTime;
    }

    public static void onFinishRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdcbcc0f", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = firstRpcFinishTime;
        if (j != 0 && finishRenderTime == 0 && currentTimeMillis > j) {
            finishRenderTime = currentTimeMillis;
        }
    }

    public static void onPayStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acce7fa0", new Object[0]);
            return;
        }
        startTime = System.currentTimeMillis();
        firstRpcFinishTime = 0L;
        finishRenderTime = 0L;
    }

    public static void onRpcFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3afc0", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = startTime;
        if (j != 0 && firstRpcFinishTime == 0 && currentTimeMillis > j) {
            firstRpcFinishTime = currentTimeMillis;
        }
    }
}
