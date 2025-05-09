package com.alibaba.ability.utils;

import androidx.core.graphics.drawable.IconCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import java.io.File;
import kotlin.a;
import tb.cjf;
import tb.ckf;
import tb.ey1;
import tb.njg;
import tb.t2o;
import tb.vrb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class MegaTrace {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MegaTrace INSTANCE = new MegaTrace();

    /* renamed from: a  reason: collision with root package name */
    public static final njg f2078a = a.b(MegaTrace$isEnable$2.INSTANCE);

    static {
        t2o.a(144703605);
    }

    public static final /* synthetic */ boolean a(MegaTrace megaTrace) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eecf3a19", new Object[]{megaTrace})).booleanValue();
        }
        return megaTrace.g();
    }

    public final void b(String str) {
        vrb d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5235938d", new Object[]{this, str});
            return;
        }
        ckf.g(str, FluidException.METHOD_NAME);
        if (f() && (d = cjf.INSTANCE.d()) != null) {
            d.a(str);
        }
    }

    public final void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dfac621", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, FluidException.METHOD_NAME);
        ckf.g(str2, "name");
        ckf.g(str3, "api");
        if (f()) {
            String str4 = str + ' ' + str2 + '.' + str3;
            vrb d = cjf.INSTANCE.d();
            if (d != null) {
                d.a(str4);
            }
        }
    }

    public final void d(String str, String str2, String str3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("534fcfbd", new Object[]{this, str, str2, str3, obj});
            return;
        }
        ckf.g(str, FluidException.METHOD_NAME);
        ckf.g(str2, "name");
        ckf.g(str3, "api");
        ckf.g(obj, IconCompat.EXTRA_OBJ);
        if (f()) {
            String str4 = str + ' ' + str2 + '.' + str3 + " objName=" + obj;
            vrb d = cjf.INSTANCE.d();
            if (d != null) {
                d.a(str4);
            }
        }
    }

    public final void e() {
        vrb d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02127e2", new Object[]{this});
        } else if (f() && (d = cjf.INSTANCE.d()) != null) {
            d.end();
        }
    }

    public final boolean f() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("f2312d58", new Object[]{this});
        } else {
            value = f2078a.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("256e0ee1", new Object[]{this})).booleanValue();
        }
        try {
            return new File(ey1.SWITCH_FILE_DIR, ".trace_mega").exists();
        } catch (Exception unused) {
            return false;
        }
    }
}
