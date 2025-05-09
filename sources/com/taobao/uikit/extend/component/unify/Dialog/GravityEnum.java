package com.taobao.uikit.extend.component.unify.Dialog;

import androidx.core.view.GravityCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum GravityEnum {
    START,
    CENTER,
    END;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final boolean HAS_RTL = true;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.uikit.extend.component.unify.Dialog.GravityEnum$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum[GravityEnum.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum[GravityEnum.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(GravityEnum gravityEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/unify/Dialog/GravityEnum");
    }

    public static GravityEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GravityEnum) ipChange.ipc$dispatch("185e3151", new Object[]{str});
        }
        return (GravityEnum) Enum.valueOf(GravityEnum.class, str);
    }

    public int getGravityInt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e34aebb1", new Object[]{this})).intValue();
        }
        int i = AnonymousClass1.$SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i != 3) {
                throw new IllegalStateException("Invalid gravity constant");
            } else if (HAS_RTL) {
                return GravityCompat.END;
            } else {
                return 5;
            }
        } else if (HAS_RTL) {
            return GravityCompat.START;
        } else {
            return 3;
        }
    }

    public int getTextAlignment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10ed7ffa", new Object[]{this})).intValue();
        }
        int i = AnonymousClass1.$SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum[ordinal()];
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return 5;
        }
        return 6;
    }
}
