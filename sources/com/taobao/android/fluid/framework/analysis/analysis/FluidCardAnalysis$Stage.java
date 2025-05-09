package com.taobao.android.fluid.framework.analysis.analysis;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum FluidCardAnalysis$Stage {
    CREATE,
    LOAD,
    RENDER;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(FluidCardAnalysis$Stage fluidCardAnalysis$Stage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/analysis/analysis/FluidCardAnalysis$Stage");
    }

    public static FluidCardAnalysis$Stage valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidCardAnalysis$Stage) ipChange.ipc$dispatch("4e644ba5", new Object[]{str});
        }
        return (FluidCardAnalysis$Stage) Enum.valueOf(FluidCardAnalysis$Stage.class, str);
    }
}
