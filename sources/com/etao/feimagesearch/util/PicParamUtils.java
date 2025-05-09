package com.etao.feimagesearch.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class PicParamUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final String f4884a = "cameraMode";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class CameraMode extends Enum<CameraMode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final CameraMode front = new CameraMode("front", 0);
        public static final CameraMode back = new CameraMode("back", 1);
        public static final CameraMode unknown = new CameraMode("unknown", 2);
        private static final /* synthetic */ CameraMode[] $VALUES = $values();

        private static final /* synthetic */ CameraMode[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CameraMode[]) ipChange.ipc$dispatch("646a2b65", new Object[0]) : new CameraMode[]{front, back, unknown};
        }

        private CameraMode(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(CameraMode cameraMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/util/PicParamUtils$CameraMode");
        }

        public static CameraMode valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("9d5c0190", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(CameraMode.class, str);
            }
            return (CameraMode) valueOf;
        }

        public static CameraMode[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("757d4b41", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (CameraMode[]) clone;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297636);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final String a(boolean z, PhotoFrom.Values values) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("333f716e", new Object[]{this, new Boolean(z), values});
            }
            ckf.g(values, "photoFrom");
            if (values != PhotoFrom.Values.TAKE && values != PhotoFrom.Values.TRANSLATE_TAKE) {
                return CameraMode.unknown.name();
            }
            if (z) {
                return CameraMode.front.name();
            }
            return CameraMode.back.name();
        }

        @JvmStatic
        public final String b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("affa8f1", new Object[]{this, new Boolean(z)});
            }
            if (z) {
                return CameraMode.front.name();
            }
            return CameraMode.back.name();
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a6d16d28", new Object[]{this});
            }
            return PicParamUtils.a();
        }

        public a() {
        }
    }

    static {
        t2o.a(481297634);
    }

    public static final /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f8846b9", new Object[0]);
        }
        return f4884a;
    }

    public static final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6d16d28", new Object[0]);
        }
        return Companion.c();
    }
}
