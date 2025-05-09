package com.taobao.pexode.animate;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AnimatedDrawableFrameInfo {

    /* renamed from: a  reason: collision with root package name */
    public final int f11451a;
    public final int b;
    public final int c;
    public final int d;
    public final DisposalMode e;
    public final BlendMode f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum BlendMode {
        BLEND_WITH_PREVIOUS,
        NO_BLEND;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(BlendMode blendMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/pexode/animate/AnimatedDrawableFrameInfo$BlendMode");
        }

        public static BlendMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BlendMode) ipChange.ipc$dispatch("b2ad0d5d", new Object[]{str});
            }
            return (BlendMode) Enum.valueOf(BlendMode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum DisposalMode {
        DISPOSE_DO_NOT,
        DISPOSE_TO_BACKGROUND,
        DISPOSE_TO_PREVIOUS;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(DisposalMode disposalMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/pexode/animate/AnimatedDrawableFrameInfo$DisposalMode");
        }

        public static DisposalMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DisposalMode) ipChange.ipc$dispatch("7d7fc7d1", new Object[]{str});
            }
            return (DisposalMode) Enum.valueOf(DisposalMode.class, str);
        }
    }

    static {
        t2o.a(618659852);
    }

    public AnimatedDrawableFrameInfo(int i, int i2, int i3, int i4, int i5, BlendMode blendMode, DisposalMode disposalMode) {
        this.f11451a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.f = blendMode;
        this.e = disposalMode;
    }
}
