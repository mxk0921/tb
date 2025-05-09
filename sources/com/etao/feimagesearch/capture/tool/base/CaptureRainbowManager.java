package com.etao.feimagesearch.capture.tool.base;

import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.d1a;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureRainbowManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static volatile CaptureRainbowManager f4687a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296751);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final CaptureRainbowManager a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CaptureRainbowManager) ipChange.ipc$dispatch("d6cbbd55", new Object[]{this});
            }
            CaptureRainbowManager a2 = CaptureRainbowManager.a();
            if (a2 == null) {
                synchronized (this) {
                    a2 = CaptureRainbowManager.a();
                    if (a2 == null) {
                        a2 = new CaptureRainbowManager(null);
                        CaptureRainbowManager.b(a2);
                    }
                }
            }
            return a2;
        }

        public a() {
        }
    }

    static {
        t2o.a(481296750);
    }

    public /* synthetic */ CaptureRainbowManager(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ CaptureRainbowManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureRainbowManager) ipChange.ipc$dispatch("14beec9a", new Object[0]);
        }
        return f4687a;
    }

    public static final /* synthetic */ void b(CaptureRainbowManager captureRainbowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f28132", new Object[]{captureRainbowManager});
        } else {
            f4687a = captureRainbowManager;
        }
    }

    public final <T> T c(T t, d1a<? extends T> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("a50dc6ad", new Object[]{this, t, d1aVar});
        }
        if (t == null) {
            return (T) d1aVar.invoke();
        }
        return t;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43e3c807", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) c(null, CaptureRainbowManager$isTriggerElder$1.INSTANCE);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public CaptureRainbowManager() {
    }
}
