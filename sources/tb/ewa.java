package tb;

import com.taobao.android.turbo.core.component.BaseComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final /* synthetic */ class ewa {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        t2o.a(919601244);
        int[] iArr = new int[BaseComponent.State.values().length];
        $EnumSwitchMapping$0 = iArr;
        BaseComponent.State state = BaseComponent.State.CREATE;
        iArr[state.ordinal()] = 1;
        BaseComponent.State state2 = BaseComponent.State.START;
        iArr[state2.ordinal()] = 2;
        BaseComponent.State state3 = BaseComponent.State.RESUME;
        iArr[state3.ordinal()] = 3;
        BaseComponent.State state4 = BaseComponent.State.PAUSE;
        iArr[state4.ordinal()] = 4;
        BaseComponent.State state5 = BaseComponent.State.STOP;
        iArr[state5.ordinal()] = 5;
        BaseComponent.State state6 = BaseComponent.State.DESTROY;
        iArr[state6.ordinal()] = 6;
        int[] iArr2 = new int[BaseComponent.State.values().length];
        $EnumSwitchMapping$1 = iArr2;
        iArr2[state.ordinal()] = 1;
        iArr2[state2.ordinal()] = 2;
        iArr2[state3.ordinal()] = 3;
        iArr2[state4.ordinal()] = 4;
        iArr2[state5.ordinal()] = 5;
        iArr2[state6.ordinal()] = 6;
    }
}
