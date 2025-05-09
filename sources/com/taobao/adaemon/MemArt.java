package com.taobao.adaemon;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import tb.hkq;
import tb.mf;
import tb.s55;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MemArt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(349175852);
        System.loadLibrary("memArt");
    }

    public static void a(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f6883f", new Object[]{context, new Long(j)});
        } else {
            mf.i(new a(context), j, TimeUnit.MILLISECONDS);
        }
    }

    public static native int memArtNative();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f6126a;

        public a(Context context) {
            this.f6126a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (g.N(this.f6126a)) {
                s55.i("MemArt", "mem art, fg return", new Object[0]);
            } else {
                int memArtNative = MemArt.memArtNative();
                if (memArtNative == 0) {
                    hkq.b(e.MODULE_NAME, e.e, "success", 1.0d);
                    LocalProcessMonitor.h0().M0(3, true);
                } else {
                    String str = e.e;
                    hkq.b(e.MODULE_NAME, str, memArtNative + "", vu3.b.GEO_NOT_SUPPORT);
                }
                s55.i("MemArt", "memArtCleanDex -> " + memArtNative, new Object[0]);
            }
        }
    }
}
