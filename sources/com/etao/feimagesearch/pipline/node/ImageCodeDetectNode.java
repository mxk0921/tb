package com.etao.feimagesearch.pipline.node;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.a07;
import tb.bw2;
import tb.ckf;
import tb.t2o;
import tb.w7m;
import tb.x7m;
import tb.yy1;
import tb.zmf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ImageCodeDetectNode extends yy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Integer d;
    public final List<zmf.a> e;

    static {
        t2o.a(481297348);
    }

    public /* synthetic */ ImageCodeDetectNode(Integer num, List list, int i, a07 a07Var) {
        this(num, (i & 2) != 0 ? null : list);
    }

    public static /* synthetic */ Object ipc$super(ImageCodeDetectNode imageCodeDetectNode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/node/ImageCodeDetectNode");
    }

    @Override // tb.yy1
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b5601d", new Object[]{this});
        }
        return "ImageCodeDetect";
    }

    @Override // tb.yy1
    public x7m k(w7m w7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("826f33b6", new Object[]{this, w7mVar});
        }
        ckf.g(w7mVar, "pipLineDS");
        if (this.e != null) {
            a("pageRebuild", "true");
            n();
            return f(this.e);
        }
        Integer num = this.d;
        a("codeDetectToken", String.valueOf(num));
        if (num != null) {
            return new bw2(new ImageCodeDetectNode$process$1(num, this));
        }
        m(-18, "DetectToken非法");
        return yy1.e(this, -18, "DetectToken非法", false, 4, null);
    }

    public ImageCodeDetectNode(Integer num, List<zmf.a> list) {
        this.d = num;
        this.e = list;
    }
}
