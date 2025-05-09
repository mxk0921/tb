package tb;

import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.MtopEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ofq {

    /* renamed from: a  reason: collision with root package name */
    public final MtopEvent f25359a;
    public final cfq b;
    public egq c;
    public final bgq d;
    public final int e;
    public final Map<String, List<String>> f;
    public final byte[] g;

    public ofq(MtopEvent mtopEvent, cfq cfqVar) {
        this.f25359a = mtopEvent;
        this.b = cfqVar;
    }

    public ofq(cfq cfqVar, bgq bgqVar, int i, Map<String, List<String>> map) {
        this.b = cfqVar;
        this.d = bgqVar;
        this.e = i;
        this.f = map;
    }

    public ofq(cfq cfqVar, bgq bgqVar, byte[] bArr) {
        this.b = cfqVar;
        this.d = bgqVar;
        this.g = bArr;
    }
}
