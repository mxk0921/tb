package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.ad5;
import tb.av5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXRenderPipelineBase extends ad5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DXPIPELINE_STAGE_DIFF = 6;
    public static final int DXPIPELINE_STAGE_EFFECT = 8;
    public static final int DXPIPELINE_STAGE_END = 9;
    public static final int DXPIPELINE_STAGE_FLATTEN = 5;
    public static final int DXPIPELINE_STAGE_ID_LE = 0;
    public static final int DXPIPELINE_STAGE_LAYOUT = 4;
    public static final int DXPIPELINE_STAGE_LOAD = 1;
    public static final int DXPIPELINE_STAGE_MEASURE = 3;
    public static final int DXPIPELINE_STAGE_PARSE = 2;
    public static final int DXPIPELINE_STAGE_RENDER = 7;
    public DXRenderPipelineFlow c;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DXPipelineStage {
    }

    static {
        t2o.a(444596543);
    }

    public DXRenderPipelineBase(av5 av5Var) {
        super(av5Var);
    }

    public static /* synthetic */ Object ipc$super(DXRenderPipelineBase dXRenderPipelineBase, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXRenderPipelineBase");
    }

    public void h(DXRenderPipelineFlow dXRenderPipelineFlow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7643f3db", new Object[]{this, dXRenderPipelineFlow});
        } else {
            this.c = dXRenderPipelineFlow;
        }
    }

    public DXRenderPipelineBase(av5 av5Var, int i, String str) {
        super(av5Var);
    }

    public int g(DXWidgetNode dXWidgetNode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eca74cdd", new Object[]{this, dXWidgetNode, new Integer(i)})).intValue();
        }
        if (dXWidgetNode == null) {
            return 1;
        }
        if (dXWidgetNode.getStatInPrivateFlags(1024) || dXWidgetNode.getStatInPrivateFlags(1)) {
            return 2;
        }
        if (dXWidgetNode.getStatInPrivateFlags(4) || dXWidgetNode.getStatInPrivateFlags(16384)) {
            return 3;
        }
        if (dXWidgetNode.getStatInPrivateFlags(16)) {
            return 4;
        }
        if (dXWidgetNode.getStatInPrivateFlags(32)) {
            return 5;
        }
        return i;
    }
}
