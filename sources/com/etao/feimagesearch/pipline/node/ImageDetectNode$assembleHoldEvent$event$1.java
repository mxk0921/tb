package com.etao.feimagesearch.pipline.node;

import android.os.SystemClock;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.fre;
import tb.pmf;
import tb.w7m;
import tb.x7m;
import tb.yy1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ImageDetectNode$assembleHoldEvent$event$1 extends Lambda implements d1a<x7m> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ w7m $pipLineDS;
    public final /* synthetic */ ImageDetectNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDetectNode$assembleHoldEvent$event$1(ImageDetectNode imageDetectNode, w7m w7mVar) {
        super(0);
        this.this$0 = imageDetectNode;
        this.$pipLineDS = w7mVar;
    }

    public static /* synthetic */ Object ipc$super(ImageDetectNode$assembleHoldEvent$event$1 imageDetectNode$assembleHoldEvent$event$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/node/ImageDetectNode$assembleHoldEvent$event$1");
    }

    @Override // tb.d1a
    public final x7m invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("ce93dae7", new Object[]{this});
        }
        fre freVar = new fre();
        Future p = ImageDetectNode.p(this.this$0);
        String str = "";
        if (p != null) {
            ImageDetectNode imageDetectNode = this.this$0;
            w7m w7mVar = this.$pipLineDS;
            Map<String, String> map = (Map) p.get();
            imageDetectNode.a("watermarkResult", JSON.toJSONString(map));
            imageDetectNode.a("watermarkTime", String.valueOf(SystemClock.elapsedRealtime() - imageDetectNode.h()));
            ckf.d(map);
            String str2 = map.get("watermark");
            if (str2 == null) {
                str2 = str;
            }
            if (ckf.b("true", str2)) {
                pmf.V0(true);
                freVar.b(map);
                w7mVar.P(map);
                imageDetectNode.n();
                return imageDetectNode.f(freVar);
            }
        }
        Future o = ImageDetectNode.o(this.this$0);
        if (o != null) {
            ImageDetectNode imageDetectNode2 = this.this$0;
            w7m w7mVar2 = this.$pipLineDS;
            Map<String, String> map2 = (Map) o.get();
            imageDetectNode2.a("videoWatermarkTime", JSON.toJSONString(map2));
            imageDetectNode2.a("videoWatermarkTime", String.valueOf(SystemClock.elapsedRealtime() - imageDetectNode2.h()));
            ckf.d(map2);
            String str3 = map2.get("watermark");
            if (str3 != null) {
                str = str3;
            }
            if (ckf.b("true", str)) {
                pmf.V0(true);
                freVar.a(map2);
                w7mVar2.O(map2);
                imageDetectNode2.n();
                return imageDetectNode2.f(freVar);
            }
        }
        this.this$0.n();
        return yy1.e(this.this$0, -1, "No Detect Result", false, 4, null);
    }
}
