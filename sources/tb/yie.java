package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.irp.ImgChannelDetectManager;
import java.util.LinkedHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class yie extends yy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Integer d;

    static {
        t2o.a(481297347);
    }

    public yie(Integer num) {
        this.d = num;
    }

    public static /* synthetic */ Object ipc$super(yie yieVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/node/ImageChannelDetectNode");
    }

    @Override // tb.yy1
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b5601d", new Object[]{this});
        }
        return "ImageChannelDetect";
    }

    @Override // tb.yy1
    public x7m k(w7m w7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("826f33b6", new Object[]{this, w7mVar});
        }
        ckf.g(w7mVar, "pipLineDS");
        pi3 g = ImgChannelDetectManager.Companion.b().g(this.d);
        if (g == null) {
            g = new pi3(-4, "detect timeout", 0L);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("imgClientChannel", String.valueOf(g.c()));
        linkedHashMap.put("imgClientDetectExtraInfo", g.b());
        Integer c = g.c();
        pmf.T0(c == null ? -1 : c.intValue());
        w7mVar.z(linkedHashMap);
        a("channelDetectResult", JSON.toJSONString(g));
        a("channelDetectTime", String.valueOf(g.a()));
        if (g.a() > 0) {
            pmf.g0(Long.valueOf(g.a()));
        }
        n();
        return f(w7mVar.d());
    }
}
