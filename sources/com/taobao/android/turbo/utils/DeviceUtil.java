package com.taobao.android.turbo.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import tb.a07;
import tb.c21;
import tb.chb;
import tb.olq;
import tb.rhx;
import tb.spu;
import tb.t2o;
import tb.ud0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DeviceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion = new Companion(null);
    public static final int SCREEN_LARGE = 3;
    public static final int SCREEN_MAX = 4;
    public static final int SCREEN_MEDIUM = 2;
    public static final int SCREEN_MIN = 0;
    public static final int SCREEN_SMALL = 1;
    public static final int SCREEN_UNKNOWN = -1;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f9812a;
    public static final boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/taobao/android/turbo/utils/DeviceUtil$Companion$ScreenType;", "", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public @interface ScreenType {
        }

        static {
            t2o.a(919601411);
        }

        public Companion() {
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[]{this})).intValue();
            }
            chb g = c21.g();
            if (g != null) {
                return g.getInt("deviceLevel", -1);
            }
            return -1;
        }

        public final float b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("528b0c17", new Object[]{this, context})).floatValue();
            }
            if (context instanceof Activity) {
                return TBAutoSizeConfig.x().A((Activity) context);
            }
            Activity a2 = ud0.Companion.a().a();
            if (a2 instanceof Activity) {
                return TBAutoSizeConfig.x().A(a2);
            }
            return 1.0f;
        }

        public final Rect c(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("c964b9c0", new Object[]{this, activity});
            }
            if (activity != null) {
                return rhx.a(activity);
            }
            return null;
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e76299e6", new Object[]{this})).booleanValue();
            }
            return DeviceUtil.a();
        }

        public final boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[]{this})).booleanValue();
            }
            if (a() == 2) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("93870fca", new Object[]{this})).booleanValue();
            }
            return DeviceUtil.b();
        }

        public final boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("13b6b708", new Object[]{this})).booleanValue();
            }
            if (d() || f()) {
                return true;
            }
            return false;
        }

        public final boolean h(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("84f3e29a", new Object[]{this, activity})).booleanValue();
            }
            return olq.d(activity);
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601410);
        spu.a aVar = spu.Companion;
        f9812a = TBDeviceUtils.p(aVar.d());
        b = TBDeviceUtils.P(aVar.d());
    }

    public static final /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("793528a4", new Object[0])).booleanValue();
        }
        return f9812a;
    }

    public static final /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25daa9da", new Object[0])).booleanValue();
        }
        return b;
    }
}
