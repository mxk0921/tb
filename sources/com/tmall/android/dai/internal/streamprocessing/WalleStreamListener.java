package com.tmall.android.dai.internal.streamprocessing;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;
import tb.zfu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WalleStreamListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile boolean mStreamProcessingInitialized = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final WalleStreamListener f14211a = new WalleStreamListener();

        static {
            t2o.a(1034944658);
        }

        public static /* synthetic */ WalleStreamListener a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WalleStreamListener) ipChange.ipc$dispatch("84a6237b", new Object[0]);
            }
            return f14211a;
        }
    }

    static {
        t2o.a(1034944657);
    }

    public static WalleStreamListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WalleStreamListener) ipChange.ipc$dispatch("fe81d796", new Object[0]);
        }
        return a.a();
    }

    public static boolean isStreamProcessingInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5e507a2", new Object[0])).booleanValue();
        }
        return mStreamProcessingInitialized;
    }

    public void eventConstructed(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44859ee2", new Object[]{this, map});
        } else {
            zfu.e().h(map);
        }
    }

    public native void nativeRegisterCallbackToStreamConstructor();

    public void registerCallbackToStreamConstructor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e58e2fe", new Object[]{this});
            return;
        }
        nativeRegisterCallbackToStreamConstructor();
        mStreamProcessingInitialized = true;
    }
}
