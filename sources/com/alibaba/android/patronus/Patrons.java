package com.alibaba.android.patronus;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class Patrons {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile boolean hasInit;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2233a = true;
        public float b = 0.675f;
        public final int c = 125;
        public final int d = 2;
        public final int e = 384;
        public final boolean f = true;

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "{ debuggable=false, auto=" + this.f2233a + ", periodOfShrink=" + this.b + ", shrinkStep=" + this.c + ", periodOfCheck=" + this.d + ", lowerLimit=" + this.e + ", recordInitResult=" + this.f + " }";
        }
    }

    private Patrons() {
    }

    public static String dumpNativeLogs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce223bf", new Object[0]);
        }
        return _Patrons.dumpNativeLogs();
    }

    public static long getRegionSpaceSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2bf3d58", new Object[0])).longValue();
        }
        if (!hasInit) {
            return -1L;
        }
        return _Patrons.getCurrentRegionSpaceSize();
    }

    public static void inBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a66073a", new Object[0]);
        } else if (hasInit) {
            _Patrons.inBackground();
        }
    }

    public static int init(Context context, a aVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("500a5a8d", new Object[]{context, aVar})).intValue();
        }
        if (hasInit) {
            return 0;
        }
        int init = _Patrons.init(context, aVar);
        if (init != 0) {
            z = false;
        }
        hasInit = z;
        return init;
    }

    public static long readVssSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("141387fc", new Object[0])).longValue();
        }
        return _Patrons.readVssSize();
    }

    public static boolean shrinkRegionSpace(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85787c57", new Object[]{new Integer(i)})).booleanValue();
        }
        if (hasInit) {
            return _Patrons.shrinkRegionSpace(i);
        }
        return false;
    }

    public static boolean shrinkThreadSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d03833cc", new Object[]{new Integer(i)})).booleanValue();
        }
        return _Patrons.resetVMThreadSize(i);
    }

    public static void toForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce33fba5", new Object[0]);
        } else if (hasInit) {
            _Patrons.toForeground();
        }
    }
}
