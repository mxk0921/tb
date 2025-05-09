package com.taobao.android.nanocompose.runtime.pipeline.render_stage;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class RenderPipelineTaskResultType extends Enum<RenderPipelineTaskResultType> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final RenderPipelineTaskResultType SUCCESS = new RenderPipelineTaskResultType("SUCCESS", 0);
    public static final RenderPipelineTaskResultType FAIL = new RenderPipelineTaskResultType("FAIL", 1);
    public static final RenderPipelineTaskResultType UNKNOWN = new RenderPipelineTaskResultType("UNKNOWN", 2);
    public static final RenderPipelineTaskResultType CANCELED = new RenderPipelineTaskResultType("CANCELED", 3);
    private static final /* synthetic */ RenderPipelineTaskResultType[] $VALUES = $values();

    private static final /* synthetic */ RenderPipelineTaskResultType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RenderPipelineTaskResultType[]) ipChange.ipc$dispatch("ebd396f9", new Object[0]) : new RenderPipelineTaskResultType[]{SUCCESS, FAIL, UNKNOWN, CANCELED};
    }

    private RenderPipelineTaskResultType(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(RenderPipelineTaskResultType renderPipelineTaskResultType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/pipeline/render_stage/RenderPipelineTaskResultType");
    }

    public static RenderPipelineTaskResultType valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("8d4fcfae", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(RenderPipelineTaskResultType.class, str);
        }
        return (RenderPipelineTaskResultType) valueOf;
    }

    public static RenderPipelineTaskResultType[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("be96709d", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (RenderPipelineTaskResultType[]) clone;
    }
}
