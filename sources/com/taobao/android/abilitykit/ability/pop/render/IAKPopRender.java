package com.taobao.android.abilitykit.ability.pop.render;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.h9;
import tb.iab;
import tb.k8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface IAKPopRender<PARAMS extends h9, ABILITY_CONTEXT extends k8> {
    public static final String BLOCK_CLOSE_TYPE = "type";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface CloseType {
        public static final String CLICK_OUT = "tapToDismiss";
        public static final String ERROR_CLOSE = "errorToDismiss";
        public static final String NATIVE_CLOSE = "nativeCloseToDismiss";
        public static final String PAN_CLOSE = "panToDismiss";
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface LifecycleType {
        public static final String ANIMATION_POSITION_CHANGE = "std_pop_did_anim_change_position";
        public static final String BEFORE_CLOSE = "std_pop_did_close";
        public static final String BLOCK_CLOSE = "std_pop_should_close";
        public static final String CHANGE_POSITION = "std_pop_did_change_position";
        public static final String CHANGE_SIZE_END = "std_pop_change_size_end";
        public static final String CHANGE_SIZE_START = "std_pop_change_size_start";
        public static final String IN_ANIMATION_END = "std_pop_in_animation_end";
        public static final String IN_ANIMATION_START = "std_pop_in_animation_start";
        public static final String OFFSET_DISABLE = "std_pop_offset_disable";
        public static final String OFFSET_ENABLE = "std_pop_offset_enable";
        public static final String OUT_ANIMATION_END = "std_pop_out_animation_end";
        public static final String OUT_ANIMATION_START = "std_pop_out_animation_start";
        public static final String PAN_ANIMATION_RECOVER_END = "std_pop_recover_animation_end";
        public static final String PAN_ANIMATION_RECOVER_START = "std_pop_recover_animation_start";
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface RenderType {
        public static final String DX = "dx";
        public static final String FRAGMENT = "fragment";
        public static final String H5 = "h5";
        public static final String NANO = "nano";
        public static final String NATIVE = "native";
        public static final String ULTRON = "ultron";
        public static final String VIEW = "view";
        public static final String WEEX1 = "weex1";
        public static final String WEEX2 = "weex2";
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface WindowState {
        public static final String STD_POP_FULL_SCREEN = "std_pop_full_screen";
        public static final String STD_POP_HALF = "std_pop_half";
        public static final String STD_POP_UNDEFINED = "std_pop_undefined";
    }

    void h(String str, JSONObject jSONObject);

    String i(String str);

    void j(ABILITY_CONTEXT ability_context, PARAMS params, View view, iab iabVar);

    void k(View view);

    boolean l(View view, int i);

    void m(View view);

    void n(String str, JSONObject jSONObject);

    void onDestroyView();

    void onSizeChanged(int i, int i2);
}
