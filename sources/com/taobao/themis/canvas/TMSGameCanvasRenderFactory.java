package com.taobao.themis.canvas;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.canvas.canvas.TMSCanvasRender;
import com.taobao.themis.kernel.page.ITMSPage;
import java.io.Serializable;
import kotlin.Metadata;
import tb.ak1;
import tb.bbs;
import tb.ckf;
import tb.e9s;
import tb.ocs;
import tb.qcs;
import tb.qes;
import tb.t2o;
import tb.t8s;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/themis/canvas/TMSGameCanvasRenderFactory;", "Ltb/e9s;", "Ljava/io/Serializable;", "Ltb/bbs;", "instance", "<init>", "(Ltb/bbs;)V", "Lcom/taobao/themis/kernel/page/ITMSPage;", "page", "Ltb/ocs;", "renderListener", "Ltb/qcs;", "createRender", "(Lcom/taobao/themis/kernel/page/ITMSPage;Ltb/ocs;)Ltb/qcs;", "themis_canvas_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSGameCanvasRenderFactory extends e9s implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(834666501);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSGameCanvasRenderFactory(bbs bbsVar) {
        super(bbsVar);
        ckf.g(bbsVar, "instance");
    }

    public static /* synthetic */ Object ipc$super(TMSGameCanvasRenderFactory tMSGameCanvasRenderFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/canvas/TMSGameCanvasRenderFactory");
    }

    @Override // tb.twd
    public qcs createRender(ITMSPage iTMSPage, ocs ocsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qcs) ipChange.ipc$dispatch("2e8fbe8e", new Object[]{this, iTMSPage, ocsVar});
        }
        ckf.g(iTMSPage, "page");
        ckf.g(ocsVar, "renderListener");
        if (t8s.f(iTMSPage.c())) {
            return new qes(iTMSPage, ocsVar);
        }
        if (t8s.g(iTMSPage.c())) {
            return new ak1(iTMSPage, ocsVar);
        }
        return new TMSCanvasRender(iTMSPage, ocsVar);
    }
}
