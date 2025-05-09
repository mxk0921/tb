package com.taobao.android.dinamicx;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.dvb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXDarkModeCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DRAW_TYPE_BACKGROUND = 1;
    public static final int DRAW_TYPE_TEXT = 0;
    public static final int DRAW_TYPE_UNSPECIFIED = 2;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f7285a;
    public static dvb b;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DXDrawType {
    }

    static {
        t2o.a(444596479);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4116576", new Object[0])).booleanValue();
        }
        if (b != null) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bc00e29", new Object[0])).booleanValue();
        }
        return f7285a;
    }

    public static int e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7653c70", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        dvb dvbVar = b;
        if (dvbVar != null) {
            return dvbVar.c(i, i2);
        }
        return i2;
    }

    public static void a(DXRuntimeContext dXRuntimeContext, View view) {
        DinamicXEngine r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25bd6c1", new Object[]{dXRuntimeContext, view});
        } else if (dXRuntimeContext != null && (r = dXRuntimeContext.r()) != null && r.K() != null) {
            r.K().disableForceDark(view);
        } else if (b()) {
            b.disableForceDark(view);
        } else if (Build.VERSION.SDK_INT >= 29) {
            view.setForceDarkAllowed(false);
        }
    }

    public static boolean c(DXRuntimeContext dXRuntimeContext) {
        DinamicXEngine r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d915eb7c", new Object[]{dXRuntimeContext})).booleanValue();
        }
        if (dXRuntimeContext != null && (r = dXRuntimeContext.r()) != null && r.K() != null) {
            Context h = dXRuntimeContext.h();
            dvb K = r.K();
            if (h == null) {
                h = DinamicXEngine.x();
            }
            return K.b(h);
        } else if (b()) {
            return b.b(DinamicXEngine.x());
        } else {
            return (DinamicXEngine.x().getResources().getConfiguration().uiMode & 48) == 32;
        }
    }
}
