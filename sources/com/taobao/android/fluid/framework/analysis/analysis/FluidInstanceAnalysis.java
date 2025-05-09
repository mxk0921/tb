package com.taobao.android.fluid.framework.analysis.analysis;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import java.util.ArrayList;
import java.util.List;
import tb.ju0;
import tb.sy8;
import tb.t2o;
import tb.tq9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FluidInstanceAnalysis extends tq9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_APPEAR = "appear";
    public static final String KEY_APP_ENTER_BACKGROUND = "onAppEnterBackground";
    public static final String KEY_DISAPPEAR = "disappear";
    public static final String KEY_REFRESH = "refresh";
    public static final String KEY_SOURCE = "bizSource";
    public static final String KEY_TYPE = "bizType";
    public static final String KEY_USER_FIRST_FRAME_TIME = "userFirstFrameTime";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum Stage {
        CREATE_SERVICE,
        PARSE_CONFIG,
        CREATE_CONTAINER,
        DETAIL_REQUEST,
        PRELOAD_DETAIL_REQUEST,
        PLAYER_CONTROL_REQUEST,
        PRELOAD_PLAYER_CONTROL_REQUEST,
        FIST_CARD;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Stage stage, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/analysis/analysis/FluidInstanceAnalysis$Stage");
        }

        public static Stage valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Stage) ipChange.ipc$dispatch("23bb5f80", new Object[]{str});
            }
            return (Stage) Enum.valueOf(Stage.class, str);
        }
    }

    static {
        t2o.a(468713850);
    }

    public FluidInstanceAnalysis(FluidContext fluidContext, sy8 sy8Var) {
        super(fluidContext, sy8Var);
    }

    public static /* synthetic */ Object ipc$super(FluidInstanceAnalysis fluidInstanceAnalysis, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/analysis/analysis/FluidInstanceAnalysis");
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70c6308e", new Object[]{this})).booleanValue();
        }
        return ju0.a();
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ab72718", new Object[]{this});
        }
        return "FluidInstance";
    }

    public List<String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31a3eb1a", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (Stage stage : Stage.values()) {
            arrayList.add(stage.name());
        }
        return arrayList;
    }
}
